package quicksort.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import quicksort.dao.UserRepository;
import quicksort.model.Role;
import quicksort.model.User;

import java.util.Collections;

@Controller
public class RegController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/reg", method = RequestMethod.GET)
    public String registration() {
        return "reg";
    }

    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    public ModelAndView reg(User user, @RequestParam("username") String name, @RequestParam("password") String pas) {
        ModelAndView modelAndView = new ModelAndView();
        User userDB = userRepository.findByUsername(name);

        if (userDB != null) {
            modelAndView.addObject("err", "userExist");
            modelAndView.setViewName("redirect:/reg");
        } else {
            user.setActive(true);
            user.setRoles(Collections.singleton(Role.USER));
            userRepository.save(user);
            modelAndView.setViewName("redirect:/login");
        }
        return modelAndView;
    }
}

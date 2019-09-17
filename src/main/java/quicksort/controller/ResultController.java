package quicksort.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import quicksort.dao.SortRepository;
import quicksort.model.SortData;

import java.util.Optional;

@Controller
public class ResultController {
    @Autowired
    private SortRepository sortRepository;

    @RequestMapping(value = "/Result", method = RequestMethod.GET)
    public ModelAndView result(@RequestParam("mesId") int id) {
        ModelAndView modelAndView = new ModelAndView();
        SortData sortData = sortRepository.findById(id).get();
        modelAndView.addObject("sortData", sortData);
        modelAndView.setViewName("result");
        return modelAndView;
    }
}

package quicksort.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import quicksort.model.SortData;
import quicksort.service.SortService;

@Controller
public class ResultController {
    private SortService sortService;

    public ResultController(SortService sortService) {
        this.sortService = sortService;
    }

    @RequestMapping(value = "/Result", method = RequestMethod.GET)
    public ModelAndView result(@RequestParam("mesId") int id) {
        ModelAndView modelAndView = new ModelAndView();
        SortData sortData = sortService.getById(id);
        modelAndView.addObject("sortData", sortData);
        modelAndView.setViewName("result");
        return modelAndView;
    }
}

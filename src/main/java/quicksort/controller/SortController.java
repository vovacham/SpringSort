package quicksort.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import quicksort.dao.SortRepository;
import quicksort.model.SortData;
import quicksort.model.Utility;

@Controller
public class SortController {

    @Autowired
    private SortRepository sortRepository;

    @RequestMapping(value = "/sort", method = RequestMethod.GET)
    public String sort() {
        return "sort";
    }

    @RequestMapping(value = "/sort", method = RequestMethod.POST)
    public ModelAndView sort(@RequestParam("action") String action, @RequestParam("mass") String massarray) {
        ModelAndView modelAndView = new ModelAndView();
        SortData sortData = null;

        if (action.equals("sort")) {
            String mass = massarray.trim();
            String[] arrayStr = mass.split(" ");
            try {
                int[] arrayInt = new int[arrayStr.length];
                for (int i = 0; i < arrayInt.length; i++) {
                    arrayInt[i] = Integer.parseInt(arrayStr[i]);
                }

                sortData = new SortData("sort", mass.replaceAll(" ", ", "),
                        Utility.arrayToString(Utility.sortArray(arrayInt)));
                sortRepository.save(sortData);
                modelAndView.addObject("mesId", sortData.getId());
                modelAndView.setViewName("redirect:/Result");

            } catch (Exception e) {
                modelAndView.addObject("error", "NumberFormatException");
                modelAndView.addObject("mass", mass);
                modelAndView.setViewName("redirect:/Error");
            }
        }

        if (action.equals("random")) {
            int[] arrayInt = Utility.newRandomArray(20, 100);

            sortData = new SortData("random", Utility.arrayToString(arrayInt),
                    Utility.arrayToString(Utility.sortArray(arrayInt)));

            sortRepository.save(sortData);
            modelAndView.addObject("mesId", sortData.getId());
            modelAndView.setViewName("redirect:/Result");
        }

        return modelAndView;
    }
}

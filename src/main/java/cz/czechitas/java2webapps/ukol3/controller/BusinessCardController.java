package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.service.BusinessCardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class BusinessCardController {

    private final BusinessCardService service;

    public BusinessCardController(BusinessCardService service) {
        this.service = service;
    }
    @GetMapping("/")
    public ModelAndView businessCardList() {
        ModelAndView result = new ModelAndView("seznam");
        result.addObject("businessCardList", service.getAll());
        return result;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable int id) {
        ModelAndView result = new ModelAndView("detail");
        result.addObject("businessCard", service.getById(id));
        return result;
    }
}

package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.BusinessCard;
import cz.czechitas.java2webapps.ukol3.service.BusinessCardService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("/nova")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("/nova/formular");
        modelAndView.addObject("form", new BusinessCardForm());
        return modelAndView;
    }

    @PostMapping("/")
    public String append(BusinessCard businessCard) {
        service.append(businessCard);
        return "redirect:/";
    }

    @PostMapping("/nova")
    public String processForm(@Valid @ModelAttribute("form") BusinessCardForm form, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "nova/formular";
        }
        BusinessCard businessCard = new BusinessCard(form.getName(), form.getCompany(), form.getStreet(), form.getCityZipCode(), form.getEmail(), form.getTelephone(), form.getWebAddress());
        service.append(businessCard);
        return "redirect:/";
    }

    @PostMapping("/delete")
    public String delete(int id) {
        service.deleteById(id);
        return "redirect:/";
    }
}



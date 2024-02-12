package com.example.tanvirmahmud_comp303_assignment1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CruiseController {
    @RequestMapping("/")
    public String showForm(Model model) {
        model.addAttribute("cruise", new Cruise());
        return "index";
    }

    @PostMapping("/pages/show-cruise")
    public String bookCruise(@ModelAttribute("cruise") Cruise cruise, Model model) {
        model.addAttribute("bookingDetails", cruise);
        return "pages/show-cruise";}

}

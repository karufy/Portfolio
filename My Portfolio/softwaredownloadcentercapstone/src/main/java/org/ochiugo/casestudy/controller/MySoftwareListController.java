package org.ochiugo.casestudy.controller;

import org.ochiugo.casestudy.service.MySoftwareListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MySoftwareListController {

    @Autowired
    private MySoftwareListService service;

    @RequestMapping("/deleteMyList/{id}")
    public String deleteMyList(@PathVariable("id") int id) {
        service.deleteById(id);
        return "redirect:/my_softwares";
    }
}

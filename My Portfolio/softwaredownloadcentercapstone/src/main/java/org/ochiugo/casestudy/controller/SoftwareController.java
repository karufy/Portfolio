package org.ochiugo.casestudy.controller;

import java.util.List;

import org.ochiugo.casestudy.modelentity.MySoftwareList;
import org.ochiugo.casestudy.modelentity.Software;
import org.ochiugo.casestudy.service.MySoftwareListService;
import org.ochiugo.casestudy.service.SoftwareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


//Create REST API for Software Class
//I could have combined both @Controller and @Responsebody to @Controlller Annotation 
//Create Software Method as REST API and can be assessed through http://localhost:8080/
//@ResponseBody Annotation uses HTTP converters to convert Object to JSON using {MappingJackson2HttpMessageConverter}

@Controller
public class SoftwareController {
	
// Map all my pages and perform CRUD
	 @Autowired
	    private SoftwareService service;

	    @Autowired
	    private MySoftwareListService mySoftwareService;
	    
	    
// Method handler for homepage (home.html)
	    @GetMapping("/")
	        public String home() {
	            return "home";
	    }
	    
	    @GetMapping("/software_register")
	    public String softwareRegister() {
	        return "softwareRegister";
	    }
// // Model attribute to bind form data 
	    @GetMapping("/available_softwares")
	    public ModelAndView getAllSoftware() {
	        List<Software>list=service.getAllSoftware();
			ModelAndView m=new ModelAndView();
			m.setViewName("softwareList");
			m.addObject("software",list);
	        return new ModelAndView("softwareList","software",list);
	    }

// Save software to database
	    @PostMapping("/save")
	    public String addSoftware(@ModelAttribute Software s) {
	        service.save(s);
	        return "redirect:/available_softwares";
	    }
	    
	    @GetMapping("/my_softwares")
	    public String getMySoftwares(Model model)
	    {
	        List<MySoftwareList> list=mySoftwareService.getAllMySoftwares();
	        model.addAttribute("software",list);
	        return "mysoftwares";
	    }
	    
//		URL Template Variable to  bind URL to the Method with @Path
//		Retrieve software  from database by id
	    @RequestMapping("/mylist/{id}")
	    public String getMyList(@PathVariable("id") int id) {
	        Software s=service.getSoftwareById(id);
	        MySoftwareList ms=new MySoftwareList(s.getId(),s.getName(),s.getCompany(),s.getPrice());
	        mySoftwareService.saveMySoftwares(ms);
	        return "redirect:/my_softwares";
	    }

// Update Employee REST API and update JSON using @Request annotation
	    @RequestMapping("/editSoftware/{id}")
	    public String editSoftware(@PathVariable("id") int id,Model model) {
	        Software s=service.getSoftwareById(id);
	        model.addAttribute("software",s);
	        return "softwareEdit";
	    }
	    
// Delete Software REST API
	    @RequestMapping("/deleteSoftware/{id}")
	    public String deleteSoftware(@PathVariable("id")int id) {
	        service.deleteById(id);
	        return "redirect:/available_software";
	    }
	    
// Map download page to external download engine	    
	    @GetMapping("/download_engine")
	    public String downloadEngine() {
	        return "downloadEngine";
	    }
	    
// Map software finder to external software repo
// Couldn't locate an API for this purpose
	    @GetMapping("/software_finder")
	    public String softwareFinder() {
	    	return "softwareFinder";
	    }
	    
//Exception Handler
	    @ControllerAdvice
	    public class GlobalExceptionHandler {

	        @ExceptionHandler(Exception.class)
	        public ModelAndView handleException(Exception ex) {
	            ModelAndView modelAndView = new ModelAndView("error");
	            modelAndView.addObject("errorMessage", "An error occurred: " + ex.getMessage());
	            return modelAndView;
	        }
	    }
	}


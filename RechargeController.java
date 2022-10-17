package com.gl.caseStudy4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.gl.caseStudy4.bean.Offer;
import com.gl.caseStudy4.service.RechargeService;

@RestController
public class RechargeController {
	@Autowired
	private RechargeService service;
	
	
	@GetMapping("/index")
	public ModelAndView showIndexPage() {
		ModelAndView mv=new ModelAndView("index");
		List<Offer> offerList=service.showAllOffers();	
		mv.addObject("offerList",offerList);
		return mv;
		
	}
	
	
	
	@PostMapping("/recharge")
	public ModelAndView showAOffer(@PathVariable long id) {
		Offer offer=service.showOfferById(id);
		ModelAndView mv=new ModelAndView("resultPage");
		mv.addObject("offerRecord",offer);
		return mv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}





package com.sergiorosa.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sergiorosa.brewer.model.Beer;

@Controller
public class BeersController {
	
	@RequestMapping("/beer/test")
	public String test() {
		return "beer/BeerRegistration";
	}

	@RequestMapping(value = "/beer/test", method = RequestMethod.POST)
	public String registration(@Valid Beer beer, BindingResult result) {
		if(result.hasErrors()) {
			System.out.print(">>> ERROR!");
		}
		System.out.println(">>> sku: " + beer.getSku());
		System.out.println(">>>> register!");
		return "beer/BeerRegistration";
	}
}

package com.proje.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.proje.model.Kullanici;

@Controller
public class AnaSayfaController {
	
	@RequestMapping(value = "/basitForm", method = RequestMethod.GET)
	public void basitForm(Model model) {
		model.addAttribute(new Kullanici());
	}
	
	@RequestMapping(value = "/sonucForm.html", method = RequestMethod.POST)
	public void sonucForm(@ModelAttribute Kullanici kullanici, Model model) {
		model.addAttribute("kullanici",kullanici);
	}
	
	
}

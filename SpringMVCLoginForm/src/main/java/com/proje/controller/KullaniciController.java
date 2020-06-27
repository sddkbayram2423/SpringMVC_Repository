package com.proje.controller;






import javax.validation.Valid;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.proje.model.Kullanici;



@Controller
@RequestMapping("/home")
public class KullaniciController{
	
	@RequestMapping(method = RequestMethod.GET)
	protected String gosterLoginForm(Model model) {
		model.addAttribute("kullanici",new Kullanici());
		return "loginform";
	}
	
	@RequestMapping(value = "/login" ,method = RequestMethod.POST)
	protected String denetleLoginForm(@Valid @ModelAttribute("kullanici") Kullanici kullanici,
																	BindingResult result,Model model ) {
		
		
		System.out.println("Kullanici: "+kullanici);
		if(result.hasErrors()) {
			model.addAttribute("kullanici",kullanici);
			System.out.println("Hata: "+result);
			return "loginform";
		}
		boolean durum1=kullanici.getKullaniciAdi().trim().equals("akaya");
		boolean durum2=kullanici.getParola().trim().equals("12345");
		
		System.out.println("d1: "+durum1);
		System.out.println("d2: "+durum2);
		
		if((kullanici.getKullaniciAdi().trim().equals("akaya"))&&(kullanici.getParola().trim().equals("12345"))) {
			model.addAttribute("kullanici",kullanici);
			System.out.println("Baþarýlý");
			return "sonucBasarili";
		
		}
		else {
			model.addAttribute("kullanici",kullanici);
			System.out.println("Baþarýz");
			return "loginform";
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

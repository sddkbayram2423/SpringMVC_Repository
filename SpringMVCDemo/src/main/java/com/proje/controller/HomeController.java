package com.proje.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/anasayfa")
public class HomeController {
	
	@RequestMapping(value = "/sayfa1/{indirimOrani}")
	public ModelAndView home(@PathVariable("indirimOrani") String oran) {
		ModelAndView modelAndView=new ModelAndView("home");
		modelAndView.addObject("test",oran);
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/test/{urun}/{urun_kodu}")
	public ModelAndView testpath(
			@PathVariable("urun") String urun,
			@PathVariable("urun_kodu") String urun_kodu
//			@PathVariable Map<String,String> map,
			) {
		
//			urun=map.get("urun");
//			urun_kodu=map.get("urun_kodu");
		
		if(isInteger(urun_kodu)) {
			urun_kodu="0";
		}
		
		ModelAndView modelAndView=new ModelAndView("home");
		modelAndView.addObject("urun", urun);
		modelAndView.addObject("urun_kodu", urun_kodu);
		
		return modelAndView;
	}
	
	public static boolean isInteger(String urun_kodu) {
		boolean durum = false;
		for (char c : urun_kodu.toCharArray()) {
			if (Character.isDigit(c)) {
				durum = false;
			} else {
				durum = true;
			}
		}

		return durum;
	}

}

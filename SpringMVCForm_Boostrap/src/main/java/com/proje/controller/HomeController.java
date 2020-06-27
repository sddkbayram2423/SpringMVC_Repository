package com.proje.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.proje.model.Kullanici;

@Controller
@RequestMapping("musteri.html")
public class HomeController {

	@RequestMapping(method = RequestMethod.POST)
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String adi=request.getParameter("adi");
		String soyadi=request.getParameter("soyadi");
		String numara=request.getParameter("numara");
		Kullanici kullanici=new Kullanici();
		kullanici.setAdi(adi);
		kullanici.setSoyadi(soyadi);
		kullanici.setNumara(numara);
		
		return new ModelAndView("home", "kullanici", kullanici);
	}
	
	
	
}

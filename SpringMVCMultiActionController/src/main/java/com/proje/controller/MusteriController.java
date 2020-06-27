package com.proje.controller;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class MusteriController extends MultiActionController {
	
	public ModelAndView ekle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String yazi = "MVC ders ekle metodu";

		return new ModelAndView("musteriView", "sonuc", yazi);
	}

	public ModelAndView guncelle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String yazi = "MVC ders  guncelleme metodu";

		return new ModelAndView("musteriView", "sonuc", yazi);
	}

	public ModelAndView sil(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String yazi = "MVC ders silme metodu";

		return new ModelAndView("musteriView", "sonuc", yazi);
	}

}

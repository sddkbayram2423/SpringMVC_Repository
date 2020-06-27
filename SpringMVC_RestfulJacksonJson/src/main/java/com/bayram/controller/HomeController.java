package com.bayram.controller;

import java.util.HashSet;

import java.util.Iterator;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bayram.model.Personel;

@Controller
@RequestMapping(value = "/personel")
public class HomeController {

	static Set<Personel> personeller;

	static {
		personeller = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			personeller.add(new Personel(i, " Ali "));
		}

	}

	// http://localhost:8080/controller/personel/listele
	//GET
	@RequestMapping(value = "/listele", method = RequestMethod.GET, headers = "Accept=application/json", produces = "application/json")
	@ResponseBody
	public Set<Personel> home1() {

		return personeller;
	}
	
	
	
	//	http://localhost:8080/controller/personel/listele/5
	//GET
	@RequestMapping(value = "/listele/{id}", method = RequestMethod.GET, headers = "Accept=application/json", produces = "application/json")
	@ResponseBody
	public Personel home2(@PathVariable("id") int id) {

		Iterator<Personel> iterator = personeller.iterator();

		while (iterator.hasNext()) {

			Personel personel = iterator.next();
			if (personel.getId() == id) {
				return personel;
			}

		}

		return new Personel();
	}
	//	http://localhost:8080/controller/personel/listele/5
	//DELETE
	@RequestMapping(value = "/listele/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json", produces = "application/json")
	@ResponseBody
	public Set<Personel> homeDelete(@PathVariable("id") int id) {

		Iterator<Personel> iterator = personeller.iterator();

		while (iterator.hasNext()) {

			Personel personel = iterator.next();
			if (personel.getId() == id) {

				personeller.remove(personel);
				return personeller;
			}

		}

		return null;
	}


}

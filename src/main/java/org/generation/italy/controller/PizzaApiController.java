package org.generation.italy.controller;


import java.util.List;

import org.generation.italy.demo.pojo.Pizza;
import org.generation.italy.demo.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/pizza")
@CrossOrigin("*")
public class PizzaApiController {

	@Autowired
	private PizzaService pizzaService;
	
	@GetMapping("/pizzas")
	public List<Pizza> getPizzas() {
		
		return pizzaService.findAll();
	}
}

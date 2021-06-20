package com.example.favoritefruits.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.favoritefruits.domain.Fruit;
import com.example.favoritefruits.service.FavoriteFruitsService;

@Controller
public class FavoriteFruitsController {

	@Autowired
	FavoriteFruitsService service;

	@RequestMapping("/list")
	public String list(Model model) {

		List<Fruit> fruitsList = service.getFavoriteFruits();
		model.addAttribute("fruitsList", fruitsList);

		return "list";
	}
}

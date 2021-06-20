package com.example.favoritefruits.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.favoritefruits.domain.Fruit;

@Controller
public class FravoriteFruitsController {

	@RequestMapping("/list")
	public String list(Model model) {

		List<Fruit> fruitsList = new ArrayList<>();
		fruitsList.add(new Fruit(1, "もも", "せつめい"));
		fruitsList.add(new Fruit(2, "ばなな", "せつめいだよ"));
		model.addAttribute("fruitsList", fruitsList);

		return "list";
	}
}

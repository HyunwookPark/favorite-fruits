package com.example.favoritefruits.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.favoritefruits.domain.Fruit;
import com.example.favoritefruits.service.FavoriteFruitsService;

@RestController
public class FavoriteFruitsRestController {

	@Autowired
	FavoriteFruitsService service;

	@RequestMapping("/fruits")
	public Fruit list(Model model) {
		System.out.println("うひゃーーーーーーーー"); // コメント

		List<Fruit> fruitsList = service.getFavoriteFruits();

		return fruitsList.get(0);
	}

}

package com.example.favoritefruits.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.favoritefruits.domain.FavoriteFruitsCondition;
import com.example.favoritefruits.domain.Fruit;
import com.example.favoritefruits.service.FavoriteFruitsService;

@Controller
public class FavoriteFruitsController {

  @Autowired
  FavoriteFruitsService service;

  @RequestMapping("/list")
  public String list(Model model) {
    System.out.println("うひゃーーーーーーーー");

    List<Fruit> fruitsList = service.getFavoriteFruits();
    model.addAttribute("favoriteFruitsCondition", new FavoriteFruitsCondition());
    model.addAttribute("fruitsList", fruitsList);

    return "list";
  }

  @RequestMapping("/search")
  public String search(@Validated FavoriteFruitsCondition condition, BindingResult result,
      Model model) {
    if (result.hasErrors()) {
      return "list";
    }

    List<Fruit> fruitsList = service.getFavoriteFruitsByCondition(condition);
    model.addAttribute("fruitsList", fruitsList);

    return "list";
  }
}

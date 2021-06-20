package com.example.favoritefruits.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.favoritefruits.domain.Fruit;
import com.example.favoritefruits.mapper.FavoriteFruitsMapper;

@Service
public class FavoriteFruitsService {

	@Autowired
	FavoriteFruitsMapper mapper;

	public FavoriteFruitsService() {
		System.out.println("サービスのコンストラクタよばれました");
	}

	public List<Fruit> getFavoriteFruits() {
		return mapper.selectAll();
	}
}

package com.example.favoritefruits.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.favoritefruits.domain.FavoriteFruitsCondition;
import com.example.favoritefruits.domain.Fruit;
import com.example.favoritefruits.mapper.FavoriteFruitsMapper;

@Service
public class FavoriteFruitsService {

	@Autowired
	FavoriteFruitsMapper mapper;
	
	protected void test() {
	  System.out.println();
	}

	public FavoriteFruitsService() {
		System.out.println("サービスのコンストラクタよばれました");
	}

	public List<Fruit> getFavoriteFruits() {
		return mapper.selectAll();
	}

	/**
	 * 検索条件に該当する果物リストを取得する。
	 * @param condition 検索条件
	 * @return 果物リスト
	 */
    public List<Fruit> getFavoriteFruitsByCondition(FavoriteFruitsCondition condition) {
      return mapper.selectByCondtion(condition);
  }
}

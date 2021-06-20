package com.example.favoritefruits.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.favoritefruits.domain.Fruit;

@Mapper
public interface FavoriteFruitsMapper {

	/**
	 * お気に入り果物リストを検索する。
	 * @return 果物リスト
	 */
	public List<Fruit> selectAll();
}

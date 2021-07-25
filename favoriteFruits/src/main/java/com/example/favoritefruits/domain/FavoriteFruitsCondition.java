package com.example.favoritefruits.domain;

import javax.validation.constraints.Size;

/**
 * 検索条件。
 * 
 * @author parkh
 *
 */
public class FavoriteFruitsCondition {

  @Size(max=3)
  private String fruitName;  // 果物名

  public String getFruitName() {
    return fruitName;
  }

  public void setFruitName(String fruitName) {
    this.fruitName = fruitName;
  }
}

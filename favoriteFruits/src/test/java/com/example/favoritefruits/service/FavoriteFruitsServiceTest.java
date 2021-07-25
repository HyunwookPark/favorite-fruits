package com.example.favoritefruits.service;

import static org.assertj.core.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.favoritefruits.domain.FavoriteFruitsCondition;
import com.example.favoritefruits.domain.Fruit;

@SpringBootTest
class FavoriteFruitsServiceTest {
  
  @Autowired
  FavoriteFruitsService target;

  @Test
  void 好きな果物リストが検索される() {
    List<Fruit> result = target.getFavoriteFruits();
    assertThat(result.size()).isEqualTo(3);
    
    Fruit fruit1 = result.get(0);
    assertThat(fruit1.getFruitName()).isEqualTo("めろん");
    assertThat(fruit1.getMemo()).isEqualTo("高いよ");
  }

  @Test
  void 該当する果物リストが検索されること() {
    // 検索条件
    FavoriteFruitsCondition condition = new FavoriteFruitsCondition();
    condition.setFruitName("めろ");
    
    List<Fruit> result = target.getFavoriteFruitsByCondition(condition);
    assertThat(result.size()).isEqualTo(1);

    Fruit fruit1 = result.get(0);
    assertThat(fruit1.getFruitName()).isEqualTo("めろん");
    assertThat(fruit1.getMemo()).isEqualTo("高いよ");
  }

  @Test
  void 該当する果物リストがない場合リストの件数が0であること() {
    // 検索条件
    FavoriteFruitsCondition condition = new FavoriteFruitsCondition();
    condition.setFruitName("アカレンジャー");
    
    List<Fruit> result = target.getFavoriteFruitsByCondition(condition);
    assertThat(result.size()).isEqualTo(0);
  }

  @Test
  void 検索条件に入力がない場合全件検索されること() {
    // 検索条件
    FavoriteFruitsCondition condition = new FavoriteFruitsCondition();
    
    List<Fruit> result = target.getFavoriteFruitsByCondition(condition);
    assertThat(result.size()).isEqualTo(3);

    Fruit fruit1 = result.get(0);
    assertThat(fruit1.getFruitName()).isEqualTo("めろん");
    assertThat(fruit1.getMemo()).isEqualTo("高いよ");
    Fruit fruit2 = result.get(1);
    assertThat(fruit2.getFruitName()).isEqualTo("りんご");
    assertThat(fruit2.getMemo()).isEqualTo("おいしいよ");
    Fruit fruit3 = result.get(2);
    assertThat(fruit3.getFruitName()).isEqualTo("マスカット");
    assertThat(fruit3.getMemo()).isEqualTo("つぶつぶです");
  }

}

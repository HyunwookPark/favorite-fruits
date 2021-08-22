package com.example.favoritefruits.domain;

public class Fruit {

	private Integer id;        // 果物ID
	private String fruitName;  // 果物名
	private String memo;       // メモ

	public Fruit(Integer id, String fruitName, String memo) {
		this.id = id;
		this.fruitName = fruitName;
		this.memo = memo;
	}

	/**
	 * 果物IDを取得する。
	 * @return 果物ID
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 果物IDを設定する。
	 * @param id 果物ID
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 果物名を取得する。
	 * @return 果物名
	 */
	public String getFruitName() {
		return fruitName;
	}
	/**
	 * 果物名を設定する。
	 * @param fruitName 果物名
	 */
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	/**
	 * 果物の詳細説明を取得する。
	 * @return 果物の詳細説明
	 */
	public String getMemo() {
		return memo;
	}
	/**
	 * 果物の詳細説明を設定する。
	 * @param memo 果物の詳細説明
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}


}

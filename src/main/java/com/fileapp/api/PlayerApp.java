package com.fileapp.api;

public class PlayerApp {
	
	private int playerId;
	private String playerName;
	private String rank;
	private String category;
	
	
	public PlayerApp(int playerId, String playerName, String rank, String category) {
	
		this.playerId = playerId;
		this.playerName = playerName;
		this.rank = rank;
		this.category = category;
	}
	@Override
	public String toString() {
		return "PlayerApp [playerId=" + playerId + ", playerName=" + playerName + ", rank=" + rank + ", category="
				+ category + "]";
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	

}

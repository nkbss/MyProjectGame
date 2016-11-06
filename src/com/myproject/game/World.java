package com.myproject.game;

public class World {
	private Tank tank;
	private TankGame TankGame;
	private Stage stage;
	
	World(TankGame TankGame) {
		this.TankGame = TankGame;
		tank = new Tank(425,875);
		stage = new Stage();
	}
	 
	Tank getTank() {
	       return tank;
	    }
	 
	 Stage getStage(){
		 return stage;
	 }
	 
	 public void update(float delta) {
	        tank.update();
	    }
}

package com.myproject.game;

public class World {
private Helpman helpman;
private HelpmanGame helpmanGame;
private Stage stage;
	World(HelpmanGame helpmanGame) {
    this.helpmanGame = helpmanGame;
    helpman = new Helpman(100,100);
    stage = new Stage();
	}
	 Helpman getHelpman() {
	        return helpman;
	    }
	 Stage getStage(){
		 return stage;
	 }
}

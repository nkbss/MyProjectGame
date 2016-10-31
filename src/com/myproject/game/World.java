package com.myproject.game;

public class World {
private Helpman helpman;
private HelpmanGame helpmanGame;
	
	World(HelpmanGame helpmanGame) {
    this.helpmanGame = helpmanGame;
    helpman = new Helpman(100,100);
}
	 Helpman getHelpman() {
	        return helpman;
	    }
}

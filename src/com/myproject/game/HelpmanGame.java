package com.myproject.game;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class HelpmanGame extends Game
{
	 public SpriteBatch batch;
	 public static final int HEIGHT = 600;
	 public static final int WIDTH = 1200;
    @Override
    public void create () {
    	batch = new SpriteBatch();
        setScreen(new GameScreen(this));
    }
 
    @Override
    public void render () {
        super.render();
    }
 
    @Override
    public void dispose () {
        batch.dispose();
    }
}

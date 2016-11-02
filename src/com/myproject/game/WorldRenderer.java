package com.myproject.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class WorldRenderer {
	private HelpmanGame helpmanGame;
	private Texture helpmanImg;
	private Helpman helpman;
	public SpriteBatch batch;
	public GameScreen gameScreen;
	World world;
	public WorldRenderer(HelpmanGame helpmanGame, World world) {
        this.helpmanGame = helpmanGame;
        batch = helpmanGame.batch;
        this.world = world;
        helpmanImg = new Texture("dot.png");
        helpman = world.getHelpman();
	}
	public void render(float delta) {
			batch = helpmanGame.batch;
	        batch.begin();
	        Vector2 pos = world.getHelpman().getPosition();
	        batch.draw(helpmanImg, pos.x, pos.y);
	        batch.end();
		}
	
}
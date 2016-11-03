package com.myproject.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class GameScreen extends ScreenAdapter{
	private HelpmanGame helpmanGame;
	private Texture helpmanImg;
	private Helpman helpman;
	World world;
	WorldRenderer worldRenderer;
	public GameScreen(HelpmanGame helpmanGame) {
	       this.helpmanGame = helpmanGame;
	       helpmanImg = new Texture("tank.png");
	       world = new World(helpmanGame);
	       worldRenderer = new WorldRenderer(helpmanGame,world);
	}
	public void update(float delta) {
        Helpman helpman = world.getHelpman();
		if(Gdx.input.isKeyPressed(Keys.DOWN)) {
            helpman.move(Helpman.DIRECTION_UP);
        }
        if(Gdx.input.isKeyPressed(Keys.UP)) {
            helpman.move(Helpman.DIRECTION_DOWN);
        }
        if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
            helpman.move(Helpman.DIRECTION_RIGHT);
        }
        if(Gdx.input.isKeyPressed(Keys.LEFT)) {
            helpman.move(Helpman.DIRECTION_LEFT);
        }
 } 
	public void render(float delta) {
	        update(delta);
	        Gdx.gl.glClearColor(0, 0, 0, 1);
	        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	        worldRenderer.render(delta);
	    }
}

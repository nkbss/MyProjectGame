package com.myproject.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class GameScreen extends ScreenAdapter{
	private TankGame tankGame;
	public static Texture tankImg;
	Tank tank;
	World world;
	WorldRenderer worldRenderer;
	public GameScreen(TankGame tankGame) {
	       this.tankGame = tankGame;
	       tankImg = setImg();
	       world = new World(tankGame);
	       worldRenderer = new WorldRenderer(tankGame,world);
	}
	public void update(float delta) {
        Tank tank = world.getTank();
		if(Gdx.input.isKeyPressed(Keys.DOWN)) {
            tank.move(Tank.DIRECTION_UP);
		}
        if(Gdx.input.isKeyPressed(Keys.UP)) {
            tank.move(Tank.DIRECTION_DOWN);
        }
        if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
            tank.move(Tank.DIRECTION_RIGHT);
        }
        if(Gdx.input.isKeyPressed(Keys.LEFT)) {
            tank.move(Tank.DIRECTION_LEFT);
        }
 } 
		public static Texture setImg(){
		tankImg = new Texture("tank.png");
		if(Gdx.input.isKeyPressed(Keys.DOWN)) {
            tankImg = new Texture("tank.png");
		}
        if(Gdx.input.isKeyPressed(Keys.UP)) {
            tankImg = new Texture("tankDown.png");
        }
        if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
            tankImg = new Texture("tankRight.png");
        }
        if(Gdx.input.isKeyPressed(Keys.LEFT)) {
            tankImg = new Texture("tankLeft.png");
        }
        
	return tankImg;
	}
	public void render(float delta) {
	        update(delta);
	        Gdx.gl.glClearColor(0, 0, 0, 1);
	        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	        worldRenderer.render(delta);
	    }
}

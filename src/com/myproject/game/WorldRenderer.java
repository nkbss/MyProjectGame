package com.myproject.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class WorldRenderer {
	private TankGame tankGame;
	private Texture tankImg;
	private Texture nextTankImg;
	private Tank tank;
	public SpriteBatch batch;
	public static final int BLOCK_SIZE = 50;
	World world;
	private StageRenderer stageRenderer;
	private GameScreen gameScreen;
	public WorldRenderer(TankGame tankGame, World world) {
        this.tankGame = tankGame;
        batch = tankGame.batch;
        this.world = world;
        tank = world.getTank();
        stageRenderer = new StageRenderer(batch,world.getStage());
	}
	public void render(float delta) {

	        tankImg = new Texture(tank.getNextImg());
			stageRenderer.render();
			batch = tankGame.batch;
	        batch.begin();
	        Vector2 pos = world.getTank().getPosition();
	        batch.draw(tankImg, pos.x-BLOCK_SIZE/2,TankGame.HEIGHT-pos.y-BLOCK_SIZE/2);
	        batch.end();
		}
}

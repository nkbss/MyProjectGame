package com.myproject.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Bullet {
	private Vector2 positionBullet;
	public boolean canShoot;
	private String bulletImg;
	private Texture BulletImg;
	World world;
	private Tank tank;
	public static final int SPEED = 5;
	private int currentDirection;
	public SpriteBatch batch;
	private static final int [][] DIR_OFFSETS = new int [][] {
        {0,0},
        {0,-1},
        {1,0},
        {0,1},
        {-1,0}
    };
	
    public Bullet(int x, int y, Tank tank){
    	positionBullet = new Vector2(x,y);
    	positionBullet = tank.getPosition();
    	bulletImg = "bullet.png";
	}
	public Vector2 getPosition(){
		positionBullet = world.getTank().getPosition();
		return positionBullet;
	}
	
	public boolean pressShoot(){
		canShoot = false;
		if(Gdx.input.isKeyPressed(Keys.Z)){
			canShoot = true;
		}
		return canShoot;
	}

	public void setBulletImg(String stageTank){
		if(stageTank == "Up"){
			bulletImg = "bullet.png";
			currentDirection = 1;
		}
		else if(stageTank == "Down"){
			bulletImg = "bulletDown.png";
			currentDirection = 3;
		}
		else if(stageTank == "Right"){
			bulletImg = "bulletRight.png";
			currentDirection = 2;
		}
		else if(stageTank == "Left"){
			bulletImg = "bulletLeft.png";
			currentDirection = 4;
		}
	}

	public String getBulletImg(){
		return bulletImg;
	}

	public void updateBullet(int dir){
		 positionBullet.x += SPEED * DIR_OFFSETS[dir][0];
	     positionBullet.y += SPEED * DIR_OFFSETS[dir][1];
	}
	public void renderBullet(){
		BulletImg = new Texture(getBulletImg());
		updateBullet(currentDirection);
		batch.begin();
		batch.draw(BulletImg, positionBullet.x-WorldRenderer.BLOCK_SIZE/2,TankGame.HEIGHT-positionBullet.y-WorldRenderer.BLOCK_SIZE/2);
		batch.end();
	}
}
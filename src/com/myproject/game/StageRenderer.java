package com.myproject.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class StageRenderer {
	private Stage stage;
	private SpriteBatch batch;
	private Texture wallImage;
	private Texture dotImage;
	private Texture brickImage;
	private Texture MetalImage;
	private Texture baseImage;
	public StageRenderer(SpriteBatch batch, Stage stage){
		this.stage = stage;
		this.batch = batch;
		wallImage = new Texture("edge.png");
		brickImage = new Texture("brick.png");
		MetalImage = new Texture("metal.png");
		baseImage = new Texture("base.png");
	}
	public void render(){
		batch.begin();
        for(int r = 0; r < stage.getHeight(); r++) {
            for(int c = 0; c < stage.getWidth(); c++) {
                int x = c * WorldRenderer.BLOCK_SIZE;
                int y = TankGame.HEIGHT - (r * WorldRenderer.BLOCK_SIZE) - WorldRenderer.BLOCK_SIZE;
                if(stage.hasWallAt(r, c)) {
                    batch.draw(wallImage, x, y);
                } else if(stage.hasBrickAt(r, c)) {
                    batch.draw(brickImage, x, y);
                } else if(stage.hasMetalAt(r, c)) {
                    batch.draw(MetalImage, x, y);
                }else if(stage.hasBaseAt(r, c)) {
                    batch.draw(baseImage, x, y);
                }
            }
        }
        batch.end();
	}
}

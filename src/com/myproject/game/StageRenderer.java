package com.myproject.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class StageRenderer {
	private Stage stage;
	private SpriteBatch batch;
	private Texture wallImage;
	private Texture dotImage;
	public StageRenderer(SpriteBatch batch, Stage stage){
		this.stage = stage;
		this.batch = batch;
		wallImage = new Texture("wall.png");
		dotImage = new Texture("dot.png");
	}
	public void render(){
		batch.begin();
        for(int r = 0; r < stage.getHeight(); r++) {
            for(int c = 0; c < stage.getWidth(); c++) {
                int x = c * 40;
                int y = HelpmanGame.HEIGHT - (r * 40) - 40;
                if(stage.hasWallAt(r, c)) {
                    batch.draw(wallImage, x, y);
                } /*else if(stage.hasDotAt(r, c)) {
                    batch.draw(dotImage, x, y);
                }*/
            }
        }
        batch.end();
	}
}

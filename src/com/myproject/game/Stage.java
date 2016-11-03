package com.myproject.game;

public class Stage {
	private String[] STAGE = new String[]{
		"##############################",
		"#............................#",
		"#............................#",
		"#............................#",
		"#............................#",
		"#............................#",
		"#............................#",
		"#............................#",
		"#............................#",
		"#............................#",
		"#............................#",
		"#............................#",
		"#............................#",
		"##############################",
	};
	private int height;
	private int width;
	
	public Stage(){
		height = STAGE.length;
        width = STAGE[0].length();
	}
	public int getHeight(){
		return height;
	}
	public int getWidth(){
		return width;
	}
    public boolean hasWallAt(int r, int c) {
        return STAGE[r].charAt(c) == '#';
    }
 
    public boolean hasDotAt(int r, int c) {
        return STAGE[r].charAt(c) == '.';
    }
}

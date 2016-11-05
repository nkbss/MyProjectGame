package com.myproject.game;

public class Stage {
	private String[] STAGE = new String[]{
		"####################",
		"#..................#",
		"#......bbbbbbb.....#",
		"#...bb.........bb..#",
		"#...bb.........bb..#",
		"#...bb...b..b..bb..#",
		"#...bb...bSSb..bb..#",
		"#...bb...bSSb..bb..#",
		"#...bb.........bb..#",
		"#........bbbb......#",
		"#SS..............SS#",
		"#.....bbbbbbbbb....#",
		"#..................#",
		"#...bb..bbbbb..bbb.#",
		"#........bbb.......#",
		"#.....bb....bb.....#",
		"#..................#",
		"#........###.......#",
		"#........#$#.......#",
		"####################",
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

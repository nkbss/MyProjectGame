package com.myproject.game;

public class Stage {
	public static String[] STAGE = new String[]{
		"#####################",
		"#...................#",
		"#......bbbbbbb......#",
		"#...bb.........bb...#",
		"#...bb.........bb...#",
		"#...bb..b.b.b..bb...#",
		"#...bb..bSSSb..bb...#",
		"#...bb..bSSSb..bb...#",
		"#....bb...b...bb....#",
		"#.........b.........#",
		"#SS....bb...bb....SS#",
		"#.....bbbbbbbbb.....#",
		"#...................#",
		"#..bbb..bbbbb..bbb..#",
		"#........bbb........#",
		"#.....bb.....bb.....#",
		"#........bbb........#",
		"#........b$b........#",
		"#####################",
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
 
    public boolean hasBrickAt(int r, int c) {
        return STAGE[r].charAt(c) == 'b';
    }
    public boolean hasMetalAt(int r, int c) {
        return STAGE[r].charAt(c) == 'S';
    }
    public boolean hasBaseAt(int r, int c) {
        return STAGE[r].charAt(c) == '$';
    }
}

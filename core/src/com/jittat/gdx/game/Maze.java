package com.jittat.gdx.game;

public class Maze {
	private int height;
    private int width;
 
    public Maze() {
        height = MAP.length;
        width = MAP[0].length();
    }
 
    public int getHeight() {
        return height;
    }
 
    public int getWidth() {
        return width;
    }
	private String[] MAP = new String [] {
	            "####################",
	            "#..................#",
	            "#.###.###..###.###.#",
	            "#.#...#......#...#.#",
	            "#.#.###.####.###.#.#",
	            "#.#.#..........#.#.#",
	            "#.....###..###.....#",
	            "#.#.#..........#.#.#",
	            "#.#.###.####.###.#.#",
	            "#.#...#......#...#.#",
	            "#.###.###..###.###.#",
	            "#..................#",
	            "####################"    
	    };
	public boolean hasWallAt(int r, int c) {
        return MAP[r].charAt(c) == '#';
    }
 
    public boolean hasDotAt(int r, int c) {
        return MAP[r].charAt(c) == '.';
    }

}

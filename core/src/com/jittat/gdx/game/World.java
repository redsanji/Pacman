package com.jittat.gdx.game;

public class World {
    private Pacman pacman;
    private PacmanGame pacmanGame;
    private Maze maze;
     
    World(PacmanGame pacmanGame) {
    	pacman = new Pacman(60,60);
    	maze = new Maze();
        this.pacmanGame = pacmanGame;
 
        pacman = new Pacman(100,100);
    }
 
    Pacman getPacman() {
        return pacman;
    }
    Maze getMaze() {
        return maze;
    }
}

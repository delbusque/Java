package com.delbusque.games;

public class ClassicJavaGame {

    public static void main(String[] args) {

        PackmanGame gameOne = new PackmanGame();

        GameRunner gameRunner = new GameRunner(gameOne);
        gameRunner.run();

        var marioGame = new MarioGame();

        GameRunner superRunner = new GameRunner(marioGame);
        superRunner.run();
    }
}

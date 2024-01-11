package com.delbusque.games;

public class MarioGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Mario is jumping");
    }

    @Override
    public void down() {
        System.out.println("Mario is getting in a hole");
    }

    @Override
    public void left() {
        System.out.println("Mario is turning back");
    }

    @Override
    public void right() {
        System.out.println("Mario is accelerating");
    }
}

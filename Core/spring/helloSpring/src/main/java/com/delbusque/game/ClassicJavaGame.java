package com.delbusque.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClassicJavaGame {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(ClassicJavaGameConfiguration.class)) {

            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}

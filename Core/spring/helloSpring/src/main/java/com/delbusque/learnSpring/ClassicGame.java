package com.delbusque.learnSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassicGame {

    @Bean
    public GamingConsole game() {
        var game = new PackmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(ClassicGame.class)) {

            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}

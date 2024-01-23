package com.delbusque.learnSpring;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.delbusque.learnSpring")
public class ClassicGame {

//    @Bean
//    public GamingConsole game() {
//        return new MarioGame();
//    }
//
//    @Bean
//    public GameRunner gameRunner(GamingConsole game) {
//        return new GameRunner(game);
//    }

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(ClassicGame.class)) {

            context.getBean(GamingConsole.class).right();
            context.getBean(GameRunner.class).run();
        }
    }
}

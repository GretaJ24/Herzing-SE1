package com.example.unit6;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApplicationUnit7 extends Application {
    //private static ApplicationContext applicationContext;
    public static void main(String[] args) {
        SpringApplication.run(ApplicationUnit7.class, args);
        //applicationContext = SpringApplication.run(ApplicationUnit7.class, args); //Run SpringBoot Application
        launch(args); //Launch JavaFX UI
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Initialize JavaFX UI
        primaryStage.setTitle("SpringBoot + JavaFX");
        primaryStage.show();
    }
    
}

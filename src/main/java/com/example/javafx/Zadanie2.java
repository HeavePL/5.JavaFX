package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Zadanie2 extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Group group = new Group();
        Scene scene = new Scene(group, 600,300);
        scene.setFill(Color.BROWN);
        primaryStage.setTitle("Drugie");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

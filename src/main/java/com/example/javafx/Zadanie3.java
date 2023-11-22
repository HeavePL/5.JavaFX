package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.IOException;

public class Zadanie3 extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Line line = new Line();
        line.setStartX(100.0);
        line.setStartY(150.0);
        line.setEndX(500.0);
        line.setEndY(150.0);
        Group root = new Group(line);
        Scene scene = new Scene(root,600,300);
        primaryStage.setTitle("Trzecie - linia");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

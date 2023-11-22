package com.example.javafx;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Zadanie4 extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Text text = new Text();
        text.setFont(new Font(45));
        text.setX(50);
        text.setY(150);
        text.setText("Tomasz Urbaniak");
        Group root = new Group(text);

        Scene scene = new Scene(root,600,300);
        primaryStage.setTitle("czwarte");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

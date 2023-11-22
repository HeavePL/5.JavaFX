package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Path;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Zadanie6 extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Text masterCard = new Text(120, 230, "mastercard");
        Circle circle1 = new Circle(150,100,80);
        Circle circle2 = new Circle(250, 100, 80);

        /*
        // kolo 1
        circle1.setCenterX(300);
        circle1.setCenterY(200);
        circle1.setRadius(200);
        */
        circle1.setFill(Color.DARKRED);
        circle1.setOpacity(0.80);
        // kolo 2
/*
        circle2.setCenterX(400);
        circle2.setCenterY(200);
        circle2.setRadius(200);
*/
        circle2.setFill(Color.DARKORANGE);
        circle2.setOpacity(0.85);


        masterCard.setFont(new Font(40));
        // okienko
        Group root = new Group(circle1,circle2,masterCard);
        Scene scene = new Scene(root,800,400);
        primaryStage.setTitle("Kola");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

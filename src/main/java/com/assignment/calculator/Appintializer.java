package com.assignment.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Appintializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Parent load = FXMLLoader.load(getClass().getResource("/CalculatorView.fxml"));
        stage.setScene(new Scene(load));
        stage.setResizable(false);
        stage.setTitle("Calculator");
        stage.show();
    }
}

package com.posgames.spotwars;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;






public class App extends Application{
    private Group root = new Group();


    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("landing-page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        stage.setScene(scene);
        stage.setTitle ("Spot Wars");

        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
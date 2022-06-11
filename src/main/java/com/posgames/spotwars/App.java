package com.posgames.spotwars;

import com.posgames.spotwars.gameclient.GameClient;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


import java.io.IOException;



public class App extends Application{
    private Group root = new Group();
    private Scene scene = new Scene(root, 1280, 720); //TODO Load from savefile
    private Stage stage;


    private Button buttonLaunch = new Button("Launch");


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
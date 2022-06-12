package com.posgames.spotwars.gameclient;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GameClient extends Application {
    private Group root = new Group();
    private Canvas canvas = new Canvas();


    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(root,1920, 1080);
        stage.setScene(scene);
        stage.setTitle("Spot Wars 2");
       // stage.show();
        //TODO Set mins
    }

}

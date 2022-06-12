package com.posgames.spotwars;

import com.posgames.spotwars.gameclient.GameClient;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LandingPageController {

    @FXML private Button buttonLaunchGame;

    @FXML
    private void launchGame(){
        Stage lpStage = (Stage) buttonLaunchGame.getScene().getWindow();
        Stage clientStage = new Stage();
        GameClient gameClient = new GameClient();
        lpStage.hide();
        try {
            gameClient.start(clientStage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        clientStage.showAndWait();
        lpStage.show();
    }
}

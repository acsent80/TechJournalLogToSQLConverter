package com.acsent;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javax.swing.*;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

public class mainController implements Initializable {

    private Stage stage;

    @FXML
    javafx.scene.control.Label dirLabel;
    @FXML
    javafx.scene.control.TextField  dirText;
    @FXML
    javafx.scene.control.Button  dirButton;
    @FXML
    javafx.scene.control.Button  processButton;

    public void initialize(URL url, ResourceBundle resourceBundle) {
        dirText.setText("123");
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void dirButtonOnAction(ActionEvent actionEvent) {

        DirectoryChooser directoryChooser  = new DirectoryChooser();

        File initialDirectory = new File(dirText.getText());
        if (initialDirectory.exists()) {
            directoryChooser.setInitialDirectory(initialDirectory);
        }

        File selectedDir = directoryChooser.showDialog(stage);

        if (selectedDir != null) {
            dirText.setText(selectedDir.getPath());
        }
    }
}

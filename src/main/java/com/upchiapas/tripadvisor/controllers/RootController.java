package com.upchiapas.tripadvisor.controllers;

import com.upchiapas.tripadvisor.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class RootController {

    @FXML
    private Button btnSalir;

    @FXML
    private Button btnSearch;

    @FXML
    private TextField txtSearch;

    @FXML
    void btnSalirOnMouseClicked(MouseEvent event) {
        System.exit(1);
    }

    @FXML
    void btnSearchOnMouseClicked(MouseEvent event) throws IOException {
        HelloApplication.setFXML("user-view","Add User - TripAdvisor");
    }

}

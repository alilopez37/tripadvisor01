package com.upchiapas.tripadvisor.controllers;

import com.upchiapas.tripadvisor.HelloApplication;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UserController {

    @FXML
    private Button btnSalir;

    @FXML
    private ImageView imgBanner;

    @FXML
    private DatePicker dateRutina;

    @FXML
    private ComboBox<String> cbLista;

    @FXML
    void btnSalirOnMouseClicked(MouseEvent event) {
        System.exit(1);
    }

    @FXML
    void dateRutinaOnMouseClicked(MouseEvent event) {
        System.out.println(dateRutina.getValue());
    }

    @FXML
    void dateRutinaOnHideShow() {
        System.out.println(dateRutina.getValue());
    }

    @FXML
    public void initialize()  {
        System.out.println("Print:" );
        imgBanner.setImage(new Image("../assets/img/tripadvisor.png"));
        imgBanner.setFitHeight(80);
        imgBanner.setPreserveRatio(true);

      
    }

}

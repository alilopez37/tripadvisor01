package com.upchiapas.tripadvisor;

import com.upchiapas.tripadvisor.controllers.LoginController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application{
    private static Stage stage;
    private static Scene scene;
    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        FXMLLoader loader = loadFXML("login-view");
        Parent root = loader.load();
        LoginController loginController = loader.getController();
        loginController.setHostServices(getHostServices());
        scene = new Scene(root);
        stage.setTitle("Login - Tripadvisor");
        stage.setScene(scene);
        stage.centerOnScreen(); // Centra la pantalla en tiempo de ejecución
        stage.setResizable(false);  // Impide que el usuario pueda modificar el tamaño del formulario
        stage.show();

    }

    public static FXMLLoader loadFXML(String nameView) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(nameView + ".fxml"));
        return fxmlLoader;
    }

    public static void setFXML(String nameView, String title) throws IOException {
        FXMLLoader loader = loadFXML(nameView);
        scene.setRoot(loader.load()); //Sustituir en el objeto scene el archivo de vista
        stage.setResizable(true);
        stage.sizeToScene(); //Renderizar el tamaño del stage con las dimensiones de la nueva vista
        stage.centerOnScreen();
        //stage.setResizable(false);
        stage.setTitle(title);


    }


    public static void main(String[] args) {
        launch();
    }
}
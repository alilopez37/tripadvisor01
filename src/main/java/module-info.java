module com.upchiapas.tripadvisor {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.upchiapas.tripadvisor to javafx.fxml;
    exports com.upchiapas.tripadvisor;
    exports com.upchiapas.tripadvisor.controllers;
    opens com.upchiapas.tripadvisor.controllers to javafx.fxml;
}
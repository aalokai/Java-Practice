module sample.controller {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.controller to javafx.fxml;
    exports sample.controller;
}
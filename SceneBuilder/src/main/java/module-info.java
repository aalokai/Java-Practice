module com.aaloktiwari.scenebuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.aaloktiwari.scenebuilder to javafx.fxml;
    exports com.aaloktiwari.scenebuilder;
}
module sample.ideaprojects {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.ideaprojects to javafx.fxml;
    exports sample.ideaprojects;
}
module com.assignment.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.assignment.calculator to javafx.fxml;
    exports com.assignment.calculator;

}
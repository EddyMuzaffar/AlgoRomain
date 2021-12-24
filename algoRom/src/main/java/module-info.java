module com.example.algorom {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.algorom to javafx.fxml;
    exports com.example.algorom;
}
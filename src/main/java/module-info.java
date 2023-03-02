module com.display {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens com.display to javafx.fxml;
    exports com.display;
}

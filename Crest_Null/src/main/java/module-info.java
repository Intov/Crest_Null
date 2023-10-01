module com.example.crest_null {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.crest_null to javafx.fxml;
    exports com.example.crest_null;
}
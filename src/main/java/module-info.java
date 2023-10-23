module com.example.rest {
    requires javafx.controls;
    requires javafx.fxml;
            
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.example.rest to javafx.fxml;
    exports com.example.rest;
}
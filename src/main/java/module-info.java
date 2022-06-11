module com.posgames.spotwars {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.posgames.spotwars to javafx.fxml;
    exports com.posgames.spotwars;
}
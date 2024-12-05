module com.pack.billingsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens com.pack.billingsystem to javafx.fxml;
    exports com.pack.billingsystem;
    exports com.pack.billingsystem.Controllers;
    exports com.pack.billingsystem.Row;
}
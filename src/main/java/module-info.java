module com.pack.billingsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.pack.billingsystem to javafx.fxml;
    exports com.pack.billingsystem;
}
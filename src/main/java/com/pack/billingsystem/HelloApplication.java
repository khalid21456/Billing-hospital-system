package com.pack.billingsystem;

import com.pack.billingsystem.Row.BillRowData;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BillsList.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1100, 700);
        String css = getClass().getResource("stylesheets/style.css").toExternalForm();

        stage.setResizable(false);
        scene.getStylesheets().add(css);
        stage.setTitle("CHMS");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
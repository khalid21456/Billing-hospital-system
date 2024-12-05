package com.pack.billingsystem.Controllers;

import com.pack.billingsystem.Row.BillRowData;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;
import java.util.ResourceBundle;

public class BillTableController implements Initializable {

    @FXML
    public TableView<BillRowData> table;

    @FXML
    public TableColumn<BillRowData, String> idBill;

    @FXML
    public TableColumn<BillRowData, String> nom;

    @FXML
    public TableColumn<BillRowData, String> prenom;

    @FXML
    public TableColumn<BillRowData, String> date;

    public ObservableList<BillRowData> list = FXCollections.observableArrayList(
            new BillRowData("1", "Khalid", "Edaoudi", "2024-12-04"),
            new BillRowData("2", "Ayoub", "Aamir", "2024-09-03")
    );

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nom.setCellValueFactory(new PropertyValueFactory<BillRowData,String>("nom"));
        prenom.setCellValueFactory(new PropertyValueFactory<BillRowData,String>("prenom"));
        date.setCellValueFactory(new PropertyValueFactory<BillRowData,String>("date"));
        idBill.setCellValueFactory(new PropertyValueFactory<BillRowData,String>("idBill"));

        table.setItems(list);
    }
}

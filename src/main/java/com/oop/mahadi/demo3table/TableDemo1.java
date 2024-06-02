package com.oop.mahadi.demo3table;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class TableDemo1 {
    Stu s1,s2;
    @FXML
    private TableView TableViewFcid;


    @javafx.fxml.FXML
    public void initialize() {
        s1 = new Stu("Mahadi",3,33);
        s2 = new Stu("Mahadi2",33,33);
         name.setCellValueFactory (new PropertyValueFactory<Stu,String>("name"));
        id.setCellValueFactory (new PropertyValueFactory<Stu,Integer>("id"));
        marks.setCellValueFactory (new PropertyValueFactory<Stu,Integer>("marks"));
        // Create an ObservableList and add your Stu objects to it
        ObservableList<Stu> stuList = FXCollections.observableArrayList(s1, s2);

        // Set the items of the TableView to the ObservableList
        TableViewFcid.setItems(stuList);
    }


    @FXML
    private TableColumn<Stu, Integer> id;

    @FXML
    private TextField idTextFild;

    @FXML
    private TableColumn<Stu, Integer> marks;

    @FXML
    private TextField marksTextFild;

    @FXML
    private TableColumn<Stu, String> name;

    @FXML
    private TextField nameTextFild;

    @FXML
    void EnterOnAction(ActionEvent event) {


        Stu s = new Stu(
                nameTextFild.getText(),
                Integer.parseInt(idTextFild.getText()),
                Integer.parseInt(marksTextFild.getText())   );
        TableViewFcid.getItems().add(s);
        nameTextFild.clear();
        idTextFild.clear();
        marksTextFild.clear();

    }

}

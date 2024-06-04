package com.oop.mahadi.demo3table;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.List;

public class TableDemo1 {
    Stu s1,s2;
    @FXML
    private TableView TableViewFcid;


    @javafx.fxml.FXML
    public void initialize() {
        s1 = new Stu("Mahadi",3,33);
        s2 = new Stu("Mahadi2",33,33);
         name.setCellValueFactory (new PropertyValueFactory<Stu,String>("Name"));
        id.setCellValueFactory (new PropertyValueFactory<Stu,Integer>("Ids"));
        marks.setCellValueFactory (new PropertyValueFactory<Stu,Integer>("Marks"));
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

ArrayList<Stu > skk=new ArrayList<>();
    @FXML
    public void ShowOnAction(ActionEvent actionEvent) {
        // Clear the ArrayList to avoid duplication
        skk.clear();

        // Loop through the items in the TableView and add them to the ArrayList
        for (int i = 0; i < TableViewFcid.getItems().size(); i++) {
            Object o=TableViewFcid.getItems().get(i);
            if (o instanceof Stu) {
                skk.add((Stu) o);
            } else {
                // Handle the case where the item is not of type Stu
            }


        }
        for (int i=0;i< skk.size();i++){
            System.out.println(skk.get(i).toString());
        }
    }

    @FXML
    public void RemoveButtonOnAction(ActionEvent actionEvent) {
        ObservableList<Stu> s1,s2;
        s1=TableViewFcid.getItems();
        s2=TableViewFcid.getSelectionModel().getSelectedItems();
        s2.forEach(s1::remove);



    }
}

module com.oop.mahadi.demo3table {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.mahadi.demo3table to javafx.fxml;
    exports com.oop.mahadi.demo3table;
}
module ca.durhamcollege.oop3200f2021ice12 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.durhamcollege to javafx.fxml;
    exports ca.durhamcollege;
}
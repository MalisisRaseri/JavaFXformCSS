module com.example.javafxformcss {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.base;


    opens com.example.javafxformcss to javafx.fxml, javafx.controls, javafx.base;
    opens com.example.javafxformcss.Looks to javafx.fxml, javafx.controls, javafx.base;
    opens com.example.javafxformcss.DBInfo to javafx.fxml, javafx.controls, javafx.base;
    opens com.example.javafxformcss.DBConnect to javafx.fxml, javafx.controls, javafx.base;

    exports com.example.javafxformcss;
}
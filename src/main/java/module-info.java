module com.example.projetojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projetojavafx to javafx.fxml;
    exports com.example.projetojavafx;
}
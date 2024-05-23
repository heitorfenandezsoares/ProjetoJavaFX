package com.example.projetojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController3 {
    FXMLLoader fxmlLoader = new FXMLLoader();
    @FXML private Label w;

    //tela 1

    @FXML private Button Tela01B1;
    @FXML private Button Tela01B2;
    @FXML private Button Tela01B3;

    //tela 2

    @FXML private Button Tela02B1;
    @FXML private Button Tela02B2;
    @FXML private Button Tela02B3;

    //tela 3


    @FXML private Button Tela03B1;
    @FXML private Button Tela03B2;
    @FXML private Button Tela03B3;




    //-------------------metodos da tela 1----------------------
    @FXML
    protected void aoClicarBotaoErrado() {
        //tela 1
        if(Tela01B1 != null) {
            Tela01B1.setStyle("-fx-background-color: red");
            Tela01B1.setText("errou!!");
        }
        else {
            Tela01B3.setStyle("-fx-background-color: red");
            Tela01B3.setText("errou!!");
        }
    }
    @FXML
    protected void aoClicarBotaoVerdadeiro() {
        //tela 1
        Tela01B2.setStyle("-fx-background-color: green");
        Tela01B2.setText("acertou");
    }

    //-------------------metodos da tela 2-------------------

    @FXML
    protected void aoClicarBotao02Errado() {
        if(Tela02B1 != null) {
            Tela02B1.setStyle("-fx-background-color: red");
            Tela02B1.setText("errou!!");
            Tela02B2.setDisable(true);
            Tela02B3.setDisable(true);
        }
        if(Tela02B2 != null) {
            Tela02B2.setStyle("-fx-background-color: red");
            Tela02B2.setText("errou!!");
            Tela02B1.setDisable(true);

        }


    }
    @FXML
    protected void aoClicarBotao02Verdadeiro() {
        if(Tela02B3 != null) {
            Tela02B3.setStyle("-fx-background-color: green");
            Tela02B3.setText("acertou");
            Tela02B1.setDisable(true);
            Tela02B2.setDisable(true);
        }



    }

    //-----------metodos da tela 3----------------------


    @FXML
    protected void aoClicarBotao03Verdadeiro() {
        Tela03B1.setStyle("-fx-background-color: green");
        Tela03B1.setText("acertou");
    }
    @FXML
    protected void aoClicarBotao03Errado() {
        if(Tela03B2 != null) {
            Tela03B2.setStyle("-fx-background-color: red");
            Tela03B2.setText("errou!!");
        }else {
            Tela03B3.setStyle("-fx-background-color: red");
            Tela03B3.setText("errou!!");
        }

    }








    @FXML
    protected void NextCena(ActionEvent evento) throws IOException {
            Parent raiz = FXMLLoader.load(getClass().getResource("hello-views2.fxml"));
            Scene scene2 = new Scene(raiz);
            Stage palco = (Stage) ((Node) evento.getSource()).getScene().getWindow();
            palco.setTitle("quizAmbiental");
            palco.setScene(scene2);
            palco.show();
    }


    @FXML
    protected void NextCena02(ActionEvent evento) throws IOException {
        Parent raiz = FXMLLoader.load(getClass().getResource("hello-views3.fxml"));
        Scene scene3 = new Scene(raiz);
        Stage palco = (Stage) ((Node) evento.getSource()).getScene().getWindow();
        palco.setTitle("quizAmbiental");
        palco.setScene(scene3);
        palco.show();
    }
}
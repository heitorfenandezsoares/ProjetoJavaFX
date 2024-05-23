package com.example.projetojavafx;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    FXMLLoader fxmlLoader = new FXMLLoader();
    pontuacao po = new pontuacao();
     public static int ponto = 0;
    public static int resultado;
    public static String ResultadoString;


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
    @FXML private Label LBpontuacao;

    //-------------------metodos da tela 1----------------------
    @FXML
    protected void aoClicarB1Tela01Errado() {
        //tela 1
        if (Tela01B1 != null) {
            Tela01B1.setStyle("-fx-background-color: red");
            Tela01B1.setText("errou!!");

            // desabilitar botão

            Tela01B2.setDisable(true);
            Tela01B3.setDisable(true);
        }
    }

    @FXML
    protected void aoClicarB2Tela01Verdadeiro() {
        //tela 1
        if(Tela01B2 != null) {
            Tela01B2.setStyle("-fx-background-color: green");
            Tela01B2.setText("acertou");

            // desabilitar botão

            Tela01B1.setDisable(true);
            Tela01B3.setDisable(true);

            // pontuaçao de resposta

            //pontuacao.incrementar("IDUnico");
            resultado = ponto + 1;

        }
    }

    @FXML
    protected void aoClicarB3Tela01Errado(){
        //tela 1
        if (Tela01B3 != null) {
            Tela01B3.setStyle("-fx-background-color: red");
            Tela01B3.setText("errou!!");

            // desabilitar botão

            Tela01B2.setDisable(true);
            Tela01B1.setDisable(true);
        }
    }


    //-------------------metodos da tela 2-------------------

    @FXML
    protected void aoClicarB1Tela02Errado() {
        //tela 2
        if(Tela02B1 != null) {
            Tela02B1.setStyle("-fx-background-color: red");
            Tela02B1.setText("errou!!");

            // Desabilitar o botã

            Tela02B2.setDisable(true);
            Tela02B3.setDisable(true);
        }
    }

    @FXML
    protected void aoClicarB2Tela02Errado() {
        //tela 2
        if(Tela02B2 != null) {
            Tela02B2.setStyle("-fx-background-color: red");
            Tela02B2.setText("errou!!");

            // Desabilitar o botão

            Tela02B1.setDisable(true);
            Tela02B3.setDisable(true);
        }
    }



    @FXML
    protected void aoClicarB3Tela02Verdadeiro() {
        //tela 2
        if(Tela02B3 != null) {
            Tela02B3.setStyle("-fx-background-color: green");
            Tela02B3.setText("acertou");

            // Desabilitar o botão

            Tela02B1.setDisable(true);
            Tela02B2.setDisable(true);

            // pontuaçao de resposta

           // pontuacao.incrementar("IDUnico");
            resultado = ponto + 1;
        }



    }

    //-----------metodos da tela 3----------------------

    @FXML
    protected void aoClicarB1Tela03Verdadeiro() {
        //tela 3
        if(Tela03B1 != null) {
            Tela03B1.setStyle("-fx-background-color: green");
            Tela03B1.setText("acertou");

            // Desbilitar o Botão

            Tela03B2.setDisable(true);
            Tela03B3.setDisable(true);

            // pontuaçao de resposta
            //pontuacao.incrementar("IDUnico");
            resultado = ponto + 1;

        }
    }
    @FXML
    protected void aoClicarB2Tela03Errado() {
        //tela 3
        if(Tela03B2 != null) {
            Tela03B2.setStyle("-fx-background-color: red");
            Tela03B2.setText("errou!!");

            // Desbilitar o Botão

            Tela03B1.setDisable(true);
            Tela03B3.setDisable(true);

            // pontuaçao de resposta
        }
    }
    @FXML
    protected void aoClicarB3Tela03Errado() {
        //tela 3
        if(Tela03B3 != null) {
            Tela03B3.setStyle("-fx-background-color: red");
            Tela03B3.setText("errou!!");

            // Desbilitar o Botão

            Tela03B1.setDisable(true);
            Tela03B2.setDisable(true);

            // pontuaçao de resposta
        }

    }

    @FXML
    protected void aoClicar() {
        //LBpontuacao.setText(String.valueOf(pontuacao.getContador("IDUnico")));
        ResultadoString = String.valueOf(resultado);
        LBpontuacao.setText(ResultadoString);
    }

    // metodos para trocar tela

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

    @FXML
    protected void aoClicarFechar() {
        Platform.exit();

    }
}
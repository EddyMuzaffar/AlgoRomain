package com.example.algorom;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

import static com.example.algorom.Romain.romain;
import static com.example.algorom.Decimal.convertToDecimal;


public class HelloController implements Initializable {

    @FXML
    private Button BtnDecToRom;

    @FXML
    private TextField IdNombreDeci;

    @FXML
    private TextField idTextRom;

    @FXML
    private Button btnToRom;

    @FXML
    private Button btnRomain;


    @FXML
    private VBox VboxRom;

    @FXML
    private Button btnBinaire;


    @FXML
    private Button btnHexadec;

    @FXML
    private Button btnImc;

    @FXML
    private TextField idDec2;
    @FXML
    private VBox VboxBinaire;
    @FXML
    private TextField idText;

    @FXML
    private TextField idText1;
    @FXML
    private TextField idBinaire;

    @FXML
    private VBox VboxHexa;

    @FXML
    private TextField idTextHexa;

    @FXML
    private TextField idTextHexa1;

    @FXML
    private TextField idHexa2;

    @FXML
    private TextField idHexa3;
    @FXML
    private VBox VboxImc;

    @FXML
    private Button btnCalcIMC;

    @FXML
    private Label idLabelIMC;

    @FXML
    private TextField idTextIMC;

    @FXML
    private TextField idTextIMC2;

    @FXML
    private MenuItem IdQuit;



    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Afficher les differents menu
        btnRomain.setOnMouseClicked(action1 ->{
            VboxRom.setVisible(true);
            VboxBinaire.setVisible(false);
            VboxHexa.setVisible(false);
            VboxImc.setVisible(false);
        });

        btnBinaire.setOnMouseClicked(action2 ->{
            VboxBinaire.setVisible(true);
            VboxRom.setVisible(false);
            VboxHexa.setVisible(false);
            VboxImc.setVisible(false);

        });

        btnHexadec.setOnMouseClicked(action2 ->{
            VboxHexa.setVisible(true);
            VboxRom.setVisible(false);
            VboxBinaire.setVisible(false);
            VboxImc.setVisible(false);
        });

        btnImc.setOnMouseClicked(action2 ->{
            VboxBinaire.setVisible(false);
            VboxRom.setVisible(false);
            VboxImc.setVisible(true);
            VboxHexa.setVisible(false);
        });




        //Menu Romain
        BtnDecToRom.setOnMouseClicked(btnaction -> {
             int nbreDecimal = Integer.parseInt(IdNombreDeci.getText());
             String result = romain(nbreDecimal);
             idTextRom.setText(result);
        });

        btnToRom.setOnMouseClicked(btnaction -> {
            String nbreRom = idTextRom.getText();
            int resultat = convertToDecimal(nbreRom);
            IdNombreDeci.setText(String.valueOf(resultat));

        });

        //Menu Binaire
        idDec2.setOnAction( action4 ->{
            int ty = Integer.parseInt(idDec2.getText());
            String resul = Integer.toBinaryString(ty);
            idBinaire.setText(resul);
        });

        idText.setOnAction( action4 ->{
            String ty = idText.getText();
            int resul = Integer.parseInt(ty,2) ;
            idText1.setText(String.valueOf(resul));
        });

        // Menu Hexadecimal
        idTextHexa.setOnAction(action9 ->{
            int  ty = Integer.parseInt(idTextHexa.getText());
            String resul = Integer.toHexString(ty);
            idTextHexa1.setText(resul);

        });


        // Calculer un IMC
        btnCalcIMC.setOnMouseClicked(action999 -> {
            double taille = Double.parseDouble(idTextIMC.getText());
            double poid = Double.parseDouble(idTextIMC2.getText());
            double imc = poid / (taille*taille);
            idLabelIMC.setText(String.valueOf(imc));
        });

        IdQuit.setOnAction(action ->{
            System.exit(0);
        });
    }

}
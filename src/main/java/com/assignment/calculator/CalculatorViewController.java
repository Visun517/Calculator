package com.assignment.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorViewController implements Initializable {

    @FXML
    private Button btn0;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btnDived;

    @FXML
    private Button btnDot;

    @FXML
    private Button btnEqual;

    @FXML
    private Button btnMultiply;

    @FXML
    private Button btnOneNumberberCelat;

    @FXML
    private Button btnPlus;

    @FXML
    private Button btnPrecentage;

    @FXML
    private Button btnReducing;

    @FXML
    private Button btuClear;

    @FXML
    private TextField txtType;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        

    }

    @FXML
    void btn0OnAction(ActionEvent event) {
        setTetxtFeild("0");

    }

    @FXML
    void btn1OnAction(ActionEvent event) {
        setTetxtFeild("1");
    }

    @FXML
    void btn2OnAction(ActionEvent event) {
        setTetxtFeild("2");
    }

    @FXML
    void btn3OnAction(ActionEvent event) {
        setTetxtFeild("3");
    }

    @FXML
    void btn4OnAction(ActionEvent event) {
        setTetxtFeild("4");
    }

    @FXML
    void btn5OnAction(ActionEvent event) {
        setTetxtFeild("5");
    }

    @FXML
    void btn6OnAction(ActionEvent event) {
        setTetxtFeild("6");
    }

    @FXML
    void btn7OnAction(ActionEvent event) {
        setTetxtFeild("7");
    }

    @FXML
    void btn8OnAction(ActionEvent event) {
        setTetxtFeild("8");
    }

    @FXML
    void btn9OnAction(ActionEvent event) {
        setTetxtFeild("9");
    }

    @FXML
    void btnDivedOnAction(ActionEvent event) {
        setTetxtFeild("/");
    }

    @FXML
    void btnDotOnAction(ActionEvent event) {
        setTetxtFeild(".");
    }

    @FXML
    void btnEqualONAction(ActionEvent event) {
        char[] text = txtType.getText().toCharArray();
        char [] operators = {'+','-','*','/','%'};
        int operatorIndex = 0;
        char operator = 0;

        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j <operators.length; j++) {
                if (text[i] == operators[j]){
                    operatorIndex = i;
                    operator = operators[j];
                }
            }
        }
        String textField = txtType.getText();
        String subString = textField.substring(0,operatorIndex);
        String otherString = textField.substring(operatorIndex+1);
        System.out.println(subString);
        System.out.println(otherString);
        System.out.println(operator);

        calculation(subString,otherString,operator);
    }

    private void calculation(String subString, String otherString, char operator) {
        int subString1 = Integer.parseInt(subString);
        int otherString1 = Integer.parseInt(otherString);

        System.out.println(subString1+""+operator+""+otherString1);

        if (operator == '+'){
            int result = subString1+otherString1;
            System.out.println(result);
            txtType.setText(String.valueOf(result));
        }
        if (operator == '-'){
            int result = subString1-otherString1;
            System.out.println(result);
            txtType.setText(String.valueOf(result));
        }
        if (operator == '*'){
            int result = subString1*otherString1;
            System.out.println(result);
            txtType.setText(String.valueOf(result));
        }
        if (operator == '/'){
            int result = subString1/otherString1;
            System.out.println(result);
            txtType.setText(String.valueOf(result));
        }
        if (operator == '%'){
            int result = subString1%otherString1;
            System.out.println(result);
            txtType.setText(String.valueOf(result));
        }
    }

    @FXML
    void btnMultiplyonAction(ActionEvent event) {
        setTetxtFeild("*");
    }

    @FXML
    void btnOneNumberberCelatOnAction(ActionEvent event) {
    }

    @FXML
    void btnPlusOnAction(ActionEvent event) {
        setTetxtFeild("+");
    }

    @FXML
    void btnPrecentageOnAction(ActionEvent event) {
        setTetxtFeild("%");
    }

    @FXML
    void btnReducingOnAction(ActionEvent event) {
        setTetxtFeild("-");
    }

    @FXML
    void btuClearOnAction(ActionEvent event) {

    }
    private void setTetxtFeild(String text){
        String oldText = txtType.getText();
        txtType.setText(oldText+text);
    }
}

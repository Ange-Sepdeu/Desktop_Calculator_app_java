package com.example.new_app;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {
    @FXML
    private Button cos;

    @FXML
    private Button delete;

    @FXML
    private Button deleteAll;

    @FXML
    private TextField display;

    @FXML
    private Button division;

    @FXML
    private Button dot;

    @FXML
    private Button e;

    @FXML
    private Button eight;

    @FXML
    private Button equal;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button ln;

    @FXML
    private Button log;

    @FXML
    private Button minus;

    @FXML
    private Button nine;

    @FXML
    private Button one;

    @FXML
    private Button plus;

    @FXML
    private Button seven;

    @FXML
    private Button sin;

    @FXML
    private Button six;

    @FXML
    private Button tan;

    @FXML
    private Button three;

    @FXML
    private Button times;

    @FXML
    private Button two;

    @FXML
    private Button zero;
    public int count;
    public int countSign ;
    public char sign;
    public float Result;
    public String number="";
    public String secondNumber="";
    public  String finalNum;
    public CalculatorController() {
        count = 0;
        countSign = 0;
    }

    public void getFour() {
        number = number+4;
        display.setText(
                number
        );
    }

    public void getThree() {
        number = number + 3;
        display.setText(number);
    }

    public void getTwo() {
        number = number + 2;
        display.setText(number);
    }

    public void getOne() {
        number = number+1;
        display.setText(number);
    }

    public void addDot() {
        if(!number.contains(".")){
            number=number+".";
            display.setText(number);
        }
    }

    public void getDeleteOne() {
        if (!number.isEmpty()) {
            if(count==0){
            number = number.substring(0, number.length() - 1);
            display.setText(number);
        }
        }
    }

    public void getDeleteAll() {
        number = "";
        display.setText("0");
    }

    public void Division() {
        count=0;
        if(!number.isEmpty()) {
            if (!number.contains("/")) {
                secondNumber = number;
                sign = '/';
                display.setText(String.valueOf(sign));
                number = "";
            }
        }
    }

    public void Result() {
        count++;
         switch (sign) {
             case '/':
                 if(Float.parseFloat(number)==0){
                    display.setText("Error: Division by zero");
                 }
                 else {
                     Result = Float.parseFloat(secondNumber) / Float.parseFloat(number);
                     display.setText(String.valueOf(Result));
                     number = String.valueOf(Result);
                 }
                 break;
             case '+':
                 Result=Float.parseFloat(secondNumber)+Float.parseFloat(number);
                 display.setText(String.valueOf(Result));
                 number=String.valueOf(Result);
                 break;
             case '*':
                 Result=Float.parseFloat(secondNumber)*Float.parseFloat(number);
                 display.setText(String.valueOf(Result));
                 number=String.valueOf(Result);
                 break;
             case '-':
                 Result=Float.parseFloat(secondNumber)-Float.parseFloat(number);
                 display.setText(String.valueOf(Result));
                 number=String.valueOf(Result);
                 break;
         }

         //display.setText(secondNumber);
    }

    public void getSix() {
        number = number + '6';
        display.setText(number);
    }

    public void getFive() {
        number = number+'5';
        display.setText(number);
    }

    public void getNine() {
    number=number+'9';
    display.setText(number);
    }

    public void getEight() {
        number = number+'8';
        display.setText(number);
    }

    public void getSeven() {
     number=number+'7';
     display.setText(number);
    }

    public void addMinus() {
        count = 0;
        if (!number.isEmpty()) {
            if (!number.contains("-")) {
                secondNumber = number;
                sign = '-';
                display.setText(String.valueOf(sign));
                number = "";
            }
        }
    }

    public void getZero() {
        number=number+'0';
        display.setText(number);
    }

    public void Times() {
        count=0;
        if(!number.isEmpty()) {
            if (!number.contains("*")) {
                secondNumber = number;
                sign = '*';
                display.setText(String.valueOf(sign));
                number = "";
            }
        }
    }

    public void Addition() {
        count=0;
        if(!number.isEmpty()) {
            if (!number.contains("+")) {
                secondNumber = number;
                sign = '+';
                display.setText(String.valueOf(sign));
                number = "";
            }
        }
    }
    public String displayNumber;
    public void Log() {
            displayNumber = display.getText();
            switch (displayNumber) {
                case "+":
                case "-":
                case "*":
                case "/":
                    display.setText("Error");
                    break;
                default:
                    if(!displayNumber.isEmpty()){
                        if(Float.parseFloat(displayNumber)<=0) {
                            display.setText("Logarithmic error!");
                        }
                        else {
                            number=String.valueOf(Math.log(Float.parseFloat(displayNumber)));
                            display.setText(number);
                        }
                    }
                    else {
                        display.setText("Syntax error");
                    }

            }
    }

    public void Euler() {
        number=String.valueOf(Math.E);
        display.setText(number);
    }

    public void NatLog() {
    }

    public void AddSign() {
        if(!number.isEmpty()) {
            if (!number.contains("-")) {
                number = "-" + number;
            }
            else{
                number = number.substring(1);
            }
            display.setText(number);
        }
    }
}

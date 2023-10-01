package com.example.crest_null;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label lab1;
    @FXML
    private Label lab2;
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
    private Button btn10;

    boolean player = true;
    boolean isGame = true;
    @FXML
    protected void StartGame() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        player = true;
        isGame = true;
        lab1.setText("Вы перезапустили игру");
        lab2.setText("Сейчас ход первого игрока");
    }
    @FXML
    void btnClick(ActionEvent event){
        if(isGame == false) return;
        if(player == true){
            ((Button) event.getSource()).setText("Х");
            player = !player;
            lab2.setText("Сейчас ход второго игрока");
        }
        else if(player == false) {
            ((Button) event.getSource()).setText("O");
            player = !player;
            lab2.setText("Сейчас ход первого игрока");

        }
        Win();
    }
    void Win(){
        if(btn1.getText().equals(btn2.getText()) & btn2.getText().equals(btn3.getText())){
            if(btn1.getText().equals("Х")){
                lab1.setText("Победителем стал первый игрок") ;
                isGame = false;
            }
            else if (btn1.getText().equals("O")){
                lab1.setText("Победителем стал второй игрок");
                isGame = false;
            }
        }
        else if(btn1.getText().equals(btn4.getText()) & btn4.getText().equals(btn7.getText())){
            if(btn1.getText().equals("Х")){
                isGame = false;
                lab1.setText("Победителем стал первый игрок");
            }
            else if (btn1.getText().equals("O")){
                isGame = false;
                lab1.setText("Победителем стал второй игрок");
            }
        }
        else if(btn1.getText().equals(btn5.getText()) & btn5.getText().equals(btn9.getText())){
            if(btn1.getText().equals("Х")) {
                lab1.setText("Победителем стал первый игрок");
                isGame = false;
            }
            else if (btn1.getText().equals("O")){
                isGame = false;
                lab1.setText("Победителем стал второй игрок");
            }
        }
        else if(btn2.getText().equals(btn5.getText()) & btn5.getText().equals(btn8.getText())){
            if(btn2.getText().equals("Х")){
                isGame = false;
                lab1.setText("Победителем стал первый игрок");
            }
            else if (btn2.getText().equals("O")){
                isGame = false;
                lab1.setText("Победителем стал второй игрок");
            }
        }
        else if(btn3.getText().equals(btn6.getText()) & btn6.getText().equals(btn9.getText())){
            if(btn3.getText().equals("Х")) {
                isGame = false;
                lab1.setText("Победителем стал первый игрок");
            }
            else if (btn3.getText().equals("O")){
                isGame = false;
                lab1.setText("Победителем стал второй игрок");
            }
        }
        else if(btn4.getText().equals(btn5.getText()) & btn5.getText().equals(btn6.getText())){
            if(btn4.getText().equals("Х")){
                isGame = false;
                lab1.setText("Победителем стал первый игрок");
            }
            else if (btn4.getText().equals("O")){
                isGame = false;
                lab1.setText("Победителем стал второй игрок");
            }
        }
        else if(btn7.getText().equals(btn8.getText()) & btn8.getText().equals(btn9.getText())){
            if(btn7.getText().equals("Х")){
                isGame = false;
                lab1.setText("Победителем стал первый игрок");
            }
            else  if (btn7.getText().equals("O")){
                isGame = false;
                lab1.setText("Победителем стал второй игрок");
            }
        }
        else if(btn3.getText().equals(btn5.getText()) & btn5.getText().equals(btn7.getText())){
            if(btn3.getText().equals("Х")) {
                isGame = false;
                lab1.setText("Победителем стал первый игрок");
            }
            else if (btn3.getText().equals("O")){
                isGame = false;
                lab1.setText("Победителем стал второй игрок");
            }
        }
    }

}
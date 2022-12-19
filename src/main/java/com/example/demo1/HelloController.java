package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    public Button bt00;
    @FXML
    private Label welcomeText;
    private Mode mode = Mode.None;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private Label buffer;

    enum Mode {
        None, // введенное число заменит буфер
        Add, // введенное число будет прибавлено к буферу
        Sub, // введенное число будет вычтено из буфера
        Mlt, // введенное число ...
        Log, Koren, Proh, Ravno, Div
    }

    public void opperationClicked(ActionEvent actionEvent) {

        // Обратимся к кнопке, на которую нажали
        Button b = (Button) actionEvent.getSource();
        // Получим её id - уникальное название на английском языке
        String id = b.idProperty().getValue();

        // Строки не рекомендуется сравнивать 1. t == "lol"
        // 2. t.equals("=")
        if (this.typesNow & this.mode == Mode.None & !id.equals("btRavno")) {
            String bufferText = this.buffer.getText();
            double f = Double.valueOf(bufferText);
            HelloApplication.calculator = new Calculator(f);
            this.buffer.setText("");
        }
        //Ввод числа закончен
        this.typesNow = false;
        System.out.println(this.buffer.getText());

      //  if ()

        // TODO: учтите другие операции

        switch (id) {
            case "btPlus":
                this.mode = Mode.Add;
                break;
            case "btMinus":
                this.mode = Mode.Sub;
                break;
            case "btMlt":
                this.mode = Mode.Mlt;
                break;
            case "btDiv":
                this.mode = Mode.Div;
                break;
            case "btLog":
               HelloApplication.calculator.log();
               this.buffer.setText(String.valueOf(HelloApplication.calculator.getBuffer()));
                break;
            case "btKoren":
                HelloApplication.calculator.Koren();
                this.buffer.setText(String.valueOf(HelloApplication.calculator.getBuffer()));
                break;
            case "btProh":
                HelloApplication.calculator.Proh();
                this.buffer.setText(String.valueOf(HelloApplication.calculator.getBuffer()));
                break;
            case "btC":
                this.buffer.setText("0");
                HelloApplication.calculator.C();
                this.mode=Mode.None;
                break;
            case "btRavno":





                // если ни один из вариантов не прошел

                // в зависимости от режима this.mode
                // кнопка "равно" будет делать различные вещи


                // это текст (число), который введен в калькулятор
                String bufferText = this.buffer.getText();

                // каким числом нужно производить операцию
                double f = Double.valueOf(bufferText);// представим себе, что мы знаем, с
            if (this.mode == Mode.None) {
                HelloApplication.calculator = new Calculator(f);
            }
                                                                                //ЧТОООООО???
                //я запомнил, что я должен складывать. Какой я молодец!
                if (this.mode == Mode.Add) {
                    HelloApplication.calculator.add(f);
                }
                if (this.mode == Mode.Sub) {
                    HelloApplication.calculator.sub(f);
                }
                if (this.mode == Mode.Mlt) {
                    HelloApplication.calculator.mlt(f);
                }
                if (this.mode == Mode.Div) {
                    HelloApplication.calculator.div(f);
                }



            // TODO: допишите действия для остальных операций

                // это результат после проведенной операции
                double result = HelloApplication.calculator.getBuffer();

                //переведем число в текст
                String resultText = String.valueOf(result);

                //Показываем текст пользователю
                this.buffer.setText(resultText);

                //сбросить режим
                this.mode = Mode.None;

                break;
            default:
                //если ни один из вариантов не подошел
        }
        System.out.println("Кнопочку нажали!" + id);
    }

    boolean typesNow = false;

    public void digitClicked(ActionEvent actionEvent) {

//        String a = null;
//        if ((a.charAt(0)>='0' & a.charAt(0)<='9')) {
//
//        }
//        if ( btDot  )


        // Обратимся к кнопке, на которую нажали
        Button b = (Button) actionEvent.getSource();
        // Получим её id - уникальное название на английском языке
        String id = b.idProperty().getValue();
//        buffer.setText(b.getText() + b.getText() );
//        System.out.println("Здесь нажали циферьку!");

        //если ранее отображался буфер
        // то стереть его
        if (!this.typesNow) {
            this.buffer.setText("");
            this.typesNow = true;
        }
//
//        num = input("Enter: ")
//
//        if num.count('0') > 0 and num.startswith('0'):
//        print("0")
//else:
//        print("none")

//        int num = 0;
        if (bt00.equals('0') ){
            System.out.println("0");
        }else {
            String none = "none";
        }
        
        // TODO: обработать ввод нескольких нулей и запятых

        // добавить нажатую цифру в число в нашей строке
        this.buffer.setText(this.buffer.getText() + b.getText());
    }
}

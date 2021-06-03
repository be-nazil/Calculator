package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

@SuppressLint("SetTextI18n")
public class MainActivity extends AppCompatActivity {

    TextView textViewInput, textViewInput1, sign_Box;

    Double number1, number2, answer;
    String sign, value1, value2;
    boolean has_Dot;

    BasicCalculations bsc;
    ScientificCalculations sc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        innit();
    }

    public void innit(){
        bsc = new BasicCalculations();
        sc = new ScientificCalculations();

        textViewInput = (TextView) findViewById(R.id.input_user);
        textViewInput1 = (TextView) findViewById(R.id.tview_input);
        sign_Box = (TextView) findViewById(R.id.sign_user);

        has_Dot = false;
    }

    public void btn_0(View view) {
        textViewInput.setText(textViewInput.getText() + "0");
    }


    public void btn_1(View view) {
        textViewInput.setText(textViewInput.getText() + "1");
    }


    public void btn_2(View view) {
        textViewInput.setText(textViewInput.getText() + "2");
    }


    public void btn_3(View view) {
        textViewInput.setText(textViewInput.getText() + "3");
    }


    public void btn_4(View view) {
        textViewInput.setText(textViewInput.getText() + "4");
    }


    public void btn_5(View view) {
        textViewInput.setText(textViewInput.getText() + "5");
    }


    public void btn_6(View view) {
        textViewInput.setText(textViewInput.getText() + "6");
    }


    public void btn_7(View view) {
        textViewInput.setText(textViewInput.getText() + "7");
    }


    public void btn_8(View view) {
        textViewInput.setText(textViewInput.getText() + "8");
    }

    public void btn_9(View view) {
        textViewInput.setText(textViewInput.getText() + "9");
    }


    public void btn_dot(View view) {
        if (!has_Dot) {
            if (textViewInput.getText().equals("")) {

                textViewInput.setText("0.");
            } else {

                textViewInput.setText(textViewInput.getText() + ".");
            }

            has_Dot = true;
        }

    }

    public void btn_add(View view) {
        sign = "+";
        value1 = textViewInput.getText().toString();
      //  textViewInput.setText(null);
        textViewInput.setText(value1+ " + ");
        sign_Box.setText("+");
        has_Dot = false;
    }

    public void btn_subtract(View view) {
        sign = "-";
        value1 = textViewInput.getText().toString();
        textViewInput.setText(null);
        sign_Box.setText("-");
        has_Dot = false;
    }

    public void btn_multiply(View view) {
        sign = "*";
        value1 = textViewInput.getText().toString();
        textViewInput.setText(null);
        sign_Box.setText("×");
        has_Dot = false;
    }

    public void btn_divide(View view) {
        sign = "/";
        value1 = textViewInput.getText().toString();
        textViewInput.setText(null);
        sign_Box.setText("÷");
        has_Dot = false;
    }


    public void btn_log(View view) {
        sign = "log";
        textViewInput.setText(null);
        sign_Box.setText("log");
        has_Dot = false;
    }


    public void btn_ln(View view) {
        sign = "ln";
        textViewInput.setText(null);
        sign_Box.setText("ln");
        has_Dot = false;
    }

    public void btn_power(View view) {
        sign = "power";
        value1 = textViewInput.getText().toString();
        textViewInput.setText(null);
        has_Dot = false;
        sign_Box.setText("xⁿ");
    }

    public void btn_factorial(View view) {
        sign = "factorial";
        textViewInput.setText(null);
        has_Dot = false;
        sign_Box.setText("!");
    }


    public void btn_sin(View view) {
        sign = "sin";
        textViewInput.setText(null);
        has_Dot = false;
        sign_Box.setText("sin");
    }


    public void btn_cos(View view) {
        sign = "cos";
        textViewInput.setText(null);
        has_Dot = false;
        sign_Box.setText("cos");
    }


    public void btn_tan(View view) {
        sign = "tan";
        textViewInput.setText(null);
        has_Dot = false;
        sign_Box.setText("tan");
    }

    public void btn_root(View view) {
        sign = "root";
        textViewInput.setText(null);
        has_Dot = false;
        sign_Box.setText("√");
    }


    public void btn_equal(View view) {
        if (sign == null) {
            sign_Box.setText("Error!");
        } else if (textViewInput.getText().equals("")) {
            sign_Box.setText("Error!");
        } else if ((sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) && value1.equals("")) {
            sign_Box.setText("Error!");
        } else {
            switch (sign) {
                case "log":
                    value1 = textViewInput.getText().toString();
                    number1 = sc.log(value1);
                    textViewInput.setText( number1+ "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "ln":
                    value1 = textViewInput.getText().toString();
                    number1 = sc.ln(value1);
                    textViewInput.setText(number1 + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "power":
                    number1 = Double.parseDouble((value1));
                    value2 = textViewInput.getText().toString();
                    number2 = Double.parseDouble(value2);
                    textViewInput.setText(sc.power(value1, value2) + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "root":
                    value1 = textViewInput.getText().toString();
                    number1 = sc.root((value1));
                    textViewInput.setText(number1 + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "factorial":
                    value1 = textViewInput.getText().toString();
                    number1 = Double.parseDouble((value1));

                    textViewInput.setText(sc.factorial(value1) + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "sin":
                    value1 = textViewInput.getText().toString();
                    number1 = Double.parseDouble((value1));
                    textViewInput.setText(sc.sin(value1) + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "cos":
                    value1 = textViewInput.getText().toString();
                    number1 = Double.parseDouble((value1));
                    textViewInput.setText(sc.cos(value1) + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "tan":
                    value1 = textViewInput.getText().toString();
                    number1 = Double.parseDouble((value1));
                    textViewInput.setText(sc.tan(value1) + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "+":
                    value2 = textViewInput.getText().toString();
                    /*number1 = Double.parseDouble(value1);
                    number2 = Double.parseDouble(value2);
                    answer = number1 + number2;*/
                    answer = bsc.Addition(value1,value2);
                    textViewInput.setText(answer + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "-":
                    value2 = textViewInput.getText().toString();
                    answer = bsc.Subtraction(value1,value2);
                    textViewInput.setText(answer + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "*":
                    value2 = textViewInput.getText().toString();
                    answer = bsc.Multiplication(value1,value2);
                    textViewInput.setText(answer + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "/":
                    value2 = textViewInput.getText().toString();
                    answer = bsc.Division(value1,value2);
                    textViewInput.setText(answer + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;

                default:
                    break;
            }

        }
    }


    public void btn_delete(View view) {
        if (textViewInput.getText().equals("")) {
            textViewInput.setText(null);
        } else {
            int len = textViewInput.getText().length();
            String s = textViewInput.getText().toString();
            if (s.charAt(len - 1) == '.') {
                has_Dot = false;
            }
            textViewInput.setText(textViewInput.getText().subSequence(0, textViewInput.getText().length() - 1));
        }
    }

    public void btn_clear(View view) {
        textViewInput.setText(null);
        sign_Box.setText(null);
        value1 = null;
        value2 = null;
        sign = null;
        has_Dot = false;
    }

}
package ru.evtukhov.android.calcwithactions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView screen;
    private TextView buttonC;
    private TextView buttonPlusOrMinus;
    private TextView buttonPercent;
    private TextView buttonDivision;
    private TextView buttonSeven;
    private TextView buttonEight;
    private TextView buttonNine;
    private TextView buttonMultiplication;
    private TextView buttonFour;
    private TextView buttonFive;
    private TextView buttonSix;
    private TextView buttonSubtraction;
    private TextView buttonOne;
    private TextView buttonTwo;
    private TextView buttonThree;
    private TextView buttonAddition;
    private TextView buttonZero;
    private TextView buttonDot;
    private TextView buttonEqually;

    private Float num1;
    private Float num2;
    private Float result;
    private String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView() {
        screen = findViewById(R.id.screen);
        buttonC = findViewById(R.id.clear);
        buttonPlusOrMinus = findViewById(R.id.plusOrMinus);
        buttonPercent = findViewById(R.id.percent);
        buttonDivision = findViewById(R.id.division);
        buttonSeven = findViewById(R.id.seven);
        buttonEight = findViewById(R.id.eight);
        buttonNine = findViewById(R.id.nine);
        buttonMultiplication = findViewById(R.id.multiplication);
        buttonFour = findViewById(R.id.four);
        buttonFive = findViewById(R.id.five);
        buttonSix = findViewById(R.id.six);
        buttonSubtraction = findViewById(R.id.subtraction);
        buttonOne = findViewById(R.id.one);
        buttonTwo = findViewById(R.id.two);
        buttonThree = findViewById(R.id.three);
        buttonAddition = findViewById(R.id.addition);
        buttonZero = findViewById(R.id.zero);
        buttonDot = findViewById(R.id.dot);
        buttonEqually = findViewById(R.id.equally);

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText("");
                num1 = 0F;
                num2 = 0F;
            }
        });

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String notDoubleNull = screen.getText().toString();
                if (notDoubleNull.contains(getString(R.string.app_dot))) {
                    screen.setText(screen.getText().toString() + getString(R.string.app_zero));
                }
                else {
                    if (notDoubleNull.startsWith(getString(R.string.app_zero))) {
                        screen.setText(screen.getText().toString() + getString(R.string.app_dot));
                    }
                    else {
                        screen.setText(screen.getText().toString() + getString(R.string.app_zero));
                    }
                }
            }
        });

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText().toString() + getString(R.string.app_one));
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText().toString() + getString(R.string.app_two));
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText().toString() + getString(R.string.app_three));
            }
        });

        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText().toString() + getString(R.string.app_four));
            }
        });

        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText().toString() + getString(R.string.app_five));
            }
        });

        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText().toString() + getString(R.string.app_six));
            }
        });

        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText().toString() + getString(R.string.app_seven));
            }
        });

        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText().toString() + getString(R.string.app_eight));
            }
        });

        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText().toString() + getString(R.string.app_nine));
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String notDoubleDot = screen.getText().toString();
                if (notDoubleDot.contains(getString(R.string.app_dot))) {
                    v.setClickable(false);
                }
                else {
                    screen.setText(screen.getText().toString() + getString(R.string.app_dot));
                }
            }
        });

        buttonPlusOrMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Float.valueOf(screen.getText().toString()) > 0) {
                    screen.setText(getString(R.string.app_subtraction) + screen.getText().toString());
                }
                else {
                    screen.setText(getString(R.string.app_addition) + screen.getText().toString());
                }
            }
        });

        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.valueOf(screen.getText().toString())/100;
                screen.setText(num1.toString());
            }
        });

        buttonAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "+";
                num1 = Float.valueOf(screen.getText().toString());
                screen.setText("");
            }
        });

        buttonSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "-";
                num1 = Float.valueOf(screen.getText().toString());
                screen.setText("");
            }
        });

        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "×";
                num1 = Float.valueOf(screen.getText().toString());
                screen.setText("");
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "÷";
                num1 = Float.valueOf(screen.getText().toString());
                screen.setText("");
            }
        });

        buttonEqually.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator != null) {
                    num2 = Float.valueOf(screen.getText().toString());
                    switch (operator) {
                        case "+":
                            result = num1 + num2;
                            screen.setText(result.toString());
                            break;
                        case "-":
                            result = num1 - num2;
                            screen.setText(result.toString());
                            break;
                        case "×":
                            result = num1 * num2;
                            screen.setText(result.toString());
                            break;
                        case "÷":
                            if (num2 != 0F) {
                                result = num1 / num2;
                                screen.setText(result.toString());
                            }
                            else {
                                screen.setText(getString(R.string.app_error));
                            }
                            break;
                    }
                    num1 = result;
                }
                else {
                    num1 = Float.valueOf(screen.getText().toString());
                    screen.setText(num1.toString());
                }
            }
        });
    }
}

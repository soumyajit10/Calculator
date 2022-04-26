package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b00,btn_equal,bPoint,btn_add,btn_minus,btn_multi,btn_divide,btn_inverse,btn_root,btn_square,btn_fact,
            btn_ln,btn_log,btn_tan,btn_cos,btn_sin,btn_pi,btn_b2,btn_b1,btn_c,btn_ac;
    TextView txt_main,txt_sec;
    String pi = "3.14159265";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b00 = findViewById(R.id.b00);

        btn_add = findViewById(R.id.btn_add);
        btn_minus = findViewById(R.id.btn_minus);
        btn_multi = findViewById(R.id.btn_multi);
        btn_divide = findViewById(R.id.btn_divide);
        btn_equal = findViewById(R.id.btn_equal);
        bPoint = findViewById(R.id.bPoint);

        btn_inverse = findViewById(R.id.btn_inverse);
        btn_root = findViewById(R.id.btn_root);
        btn_square = findViewById(R.id.btn_square);
        btn_fact = findViewById(R.id.btn_fact);
        btn_ln = findViewById(R.id.btn_ln);
        btn_log = findViewById(R.id.btn_log);
        btn_tan = findViewById(R.id.btn_tan);
        btn_cos = findViewById(R.id.btn_cos);
        btn_sin = findViewById(R.id.btn_sin);
        btn_pi = findViewById(R.id.btn_pi);
        btn_b1 = findViewById(R.id.btn_b1);
        btn_b2 = findViewById(R.id.btn_b2);
        btn_c = findViewById(R.id.btn_c);
        btn_ac = findViewById(R.id.btn_ac);

        txt_main = findViewById(R.id.txt_main);
        txt_sec = findViewById(R.id.txt_sec);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_main.setText(txt_main.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_main.setText(txt_main.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_main.setText(txt_main.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_main.setText(txt_main.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_main.setText(txt_main.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_main.setText(txt_main.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_main.setText(txt_main.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_main.setText(txt_main.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_main.setText(txt_main.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_main.setText(txt_main.getText()+"0");
            }
        });
        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_main.setText(txt_main.getText()+"00");
            }
        });
        bPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_main.setText(txt_main.getText()+".");
            }
        });
        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_main.setText("");
                txt_sec.setText("");
            }
        });
        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = txt_main.getText().toString();
                val = val.substring(0,val.length()-1);
                txt_main.setText(val);
            }
        });

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_main.setText(txt_main.getText()+"+");
            }
        });
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_main.setText(txt_main.getText()+"-");
            }
        });
        btn_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_main.setText(txt_main.getText()+"×");
            }
        });
        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_main.setText(txt_main.getText()+"÷");
            }
        });
        btn_root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = txt_main.getText().toString();
                double r = Math.sqrt(Double.parseDouble(val));
                txt_main.setText(String.valueOf(r));
                txt_sec.setText("√"+val);
            }
        });
        btn_b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_main.setText(txt_main.getText()+"(");
            }
        });
        btn_b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_main.setText(txt_main.getText()+")");
            }
        });
        btn_pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_sec.setText(btn_pi.getText());
                txt_main.setText(txt_main.getText()+pi);
            }
        });
        btn_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_sec.setText(btn_pi.getText());
                txt_main.setText(txt_main.getText()+"sin");
            }
        });
        btn_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_sec.setText(btn_pi.getText());
                txt_main.setText(txt_main.getText()+"cos");
            }
        });
        btn_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_sec.setText(btn_pi.getText());
                txt_main.setText(txt_main.getText()+"tan");
            }
        });
        btn_inverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_main.setText(txt_main.getText()+"^"+"(-1)");
            }
        });
        btn_fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(txt_main.getText().toString());
             int fact =  factorial(val) ;
             txt_main.setText(String.valueOf(fact));
             txt_sec.setText(val+"!");
            }
        });
        btn_square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d = Double.parseDouble(txt_main.getText().toString());
                double square = d*d;
                txt_main.setText(String.valueOf(square));
                txt_sec.setText(d+"^2");

            }
        });
        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = txt_main.getText().toString();
                String replacedstr = val.replace('÷','/').replace('×','*');
                double result = eval(replacedstr);
                txt_main.setText(String.valueOf(result));
                txt_sec.setText(val);

            }
        });

    }

    private int factorial (int n) {
        return(n ==1||n==0) ? 1:n*factorial(n-1);
    }

    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }


            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) {
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }

    }
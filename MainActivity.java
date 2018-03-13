package com.example.hyy.calculate;
import java.util.Stack;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import java.lang.*;
import  java.util.*;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textresult = (TextView) findViewById(R.id.editText2);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button0 = (Button) findViewById(R.id.button0);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button buttonc = (Button) findViewById(R.id.buttonc);
        Button buttonchu = (Button) findViewById(R.id.buttonchu);
        Button buttoncm = (Button) findViewById(R.id.buttonCM);
        Button buttondeng = (Button) findViewById(R.id.buttondeng);
        Button buttondian = (Button) findViewById(R.id.buttondian);
        Button buttonjia = (Button) findViewById(R.id.buttonjia);
        Button buttonjian = (Button) findViewById(R.id.buttonjian);
        Button buttonx = (Button) findViewById(R.id.buttonx);

        Button buttonl = (Button) findViewById(R.id.buttonl);
        Button buttonr = (Button) findViewById(R.id.buttonr);
        buttonl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textresult.setText(textresult.getText() + "(");
            }
        });
        buttonr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textresult.setText(textresult.getText() + ")");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textresult.setText(textresult.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textresult.setText(textresult.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textresult.setText(textresult.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textresult.setText(textresult.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textresult.setText(textresult.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textresult.setText(textresult.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textresult.setText(textresult.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textresult.setText(textresult.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textresult.setText(textresult.getText() + "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textresult.setText(textresult.getText() + "0");
            }
        });
        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textresult.setText("");
            }
        });
        buttoncm.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String s = textresult.getText().toString();
                if (s.length() != 0)
                    textresult.setText(s.substring(0, s.length() - 1));
            }
        });
        buttonchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textresult.setText(textresult.getText() + "/");
            }
        });
        buttondian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textresult.setText(textresult.getText() + ".");
            }
        });
        buttonjia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textresult.setText(textresult.getText() + "+");
            }
        });
        buttonjian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textresult.setText(textresult.getText() + "-");
            }
        });
        buttonx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textresult.setText(textresult.getText() + "x");
            }
        });
        buttondeng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Stack<String> stack1;
                Stack<String> stack2;
                stack1 = new Stack<String>();
                stack2 = new Stack<String>();
                String s1="";
                String s = textresult.getText().toString()+'@';
                int i = 0;
                Map<String, Integer> map = new HashMap<String, Integer>();
                map.put("+",1);
                map.put("-",1);
                map.put("x",2);
                map.put("/",2);
                map.put("(",3);
                map.put(")",0);
                map.put("@",-1);
               double a=0,b=0,c=0;
                int u=-2;
                int d=-2;
                String p="";
                for (i = 0; i <s.length(); i++) {
                    if(s.charAt(i)!='+'&&s.charAt(i)!='-'&&s.charAt(i)!='/'&&s.charAt(i)!='x'&&s.charAt(i)!='('&&s.charAt(i)!=')'&&s.charAt(i)!='@') {
                        s1 = s1+s.charAt(i);
                    }
                    else {
                        if (!s1.equals(""))
                        {stack1.push(s1);}
                        if(stack2.empty()){
                            stack2.push(""+s.charAt(i));
                        }
                        else {

                            u = Integer.parseInt(map.get(stack2.peek()).toString());
                            d = Integer.parseInt(map.get("" + s.charAt(i)).toString());
                            if ((u < d ||u==3) && s.charAt(i) != '@') {
                                stack2.push("" + s.charAt(i));
                            }
                            else if (d == 0) {
                                p = stack2.pop();
                                while (Integer.parseInt(map.get(p).toString()) != 3) {
                                    a = Double.parseDouble(stack1.pop());
                                    b = Double.parseDouble(stack1.pop());


                                    if (p.equals("+")) {
                                        c = b + a;
                                        stack1.push(""+ String.valueOf(c));
                                    }
                                    if (p.equals("-")) {
                                        c = b - a;
                                        stack1.push(""+ String.valueOf(c));
                                    }
                                    if (p.equals("x")) {
                                        c = a * b;
                                        stack1.push(""+ String.valueOf(c));
                                    }
                                    if (p.equals("/")) {
                                        c = b / a;
                                        stack1.push(""+ String.valueOf(c));
                                    }
                                    p = stack2.pop();
                                }
                            } else if (u >= d&&d!=-1) {
                                p = stack2.pop();
                                a = Double.parseDouble(stack1.pop());
                                b = Double.parseDouble(stack1.pop());


                                if (p.equals("+")) {
                                    c = b + a;
                                    stack1.push(""+ String.valueOf(c));
                                }
                                if (p.equals("-")) {
                                    c = b - a;
                                    stack1.push(""+ String.valueOf(c));
                                }
                                if (p.equals("x")) {
                                    c = a * b;
                                    stack1.push(""+ String.valueOf(c));
                                }
                                if (p.equals("/")) {
                                    c = b / a;
                                    stack1.push(""+ String.valueOf(c));
                                }
                                stack2.push("" + s.charAt(i));
                            }

                        }

                        s1="";
                        }

                    }

                while (!stack2.empty()){
                    p=stack2.pop();
                    a = Double.parseDouble(stack1.pop());
                    b = Double.parseDouble(stack1.pop());


                    if (p.equals("+")) {
                        c = b + a;
                        stack1.push(""+ String.valueOf(c));
                    }
                    if (p.equals("-")) {
                        c = b - a;
                        stack1.push(""+ String.valueOf(c));
                    }
                    if (p.equals("x")) {
                        c = a * b;
                        stack1.push(""+ String.valueOf(c));
                    }
                    if (p.equals("/")) {
                        c = b / a;
                        stack1.push(""+ String.valueOf(c));
                    }
                }
                textresult.setText(String.valueOf(c));

            }
        });

    }
}

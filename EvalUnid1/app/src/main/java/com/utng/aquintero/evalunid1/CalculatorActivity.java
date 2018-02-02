package com.utng.aquintero.evalunid1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorActivity extends AppCompatActivity {

    private EditText edtData;
    private Button btnSeven, btnEight, btnNine, btnMult, btnFour, btnFive, btnSix, btnSub,
            btnOne, btnTwo, btnThree, btnAdd, btnDiv, btnZero, btnDot, btnEqual, btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        edtData = (EditText)findViewById(R.id.edt_data);
        btnSeven = (Button)findViewById(R.id.btn_seven);
        btnEight = (Button)findViewById(R.id.btn_eight);
        btnNine = (Button)findViewById(R.id.btn_nine);
        btnFour = (Button)findViewById(R.id.btn_four);
        btnFive = (Button)findViewById(R.id.btn_five);
        btnSix = (Button)findViewById(R.id.btn_six);
        btnOne = (Button)findViewById(R.id.btn_one);
        btnTwo = (Button)findViewById(R.id.btn_two);
        btnThree = (Button)findViewById(R.id.btn_three);
        btnZero = (Button)findViewById(R.id.btn_zero);
        btnMult = (Button)findViewById(R.id.btn_mult);
        btnSub = (Button)findViewById(R.id.btn_sub);
        btnAdd = (Button)findViewById(R.id.btn_add);
        btnEqual = (Button)findViewById(R.id.btn_equal);
        btnDiv = (Button)findViewById(R.id.btn_div);
        btnDot = (Button)findViewById(R.id.btn_dot);


        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtData = (EditText)findViewById(R.id.edt_data);
                edtData.setText(edtData.getText().toString() + "7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtData = (EditText)findViewById(R.id.edt_data);
                edtData.setText(edtData.getText().toString() + "8");
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtData = (EditText)findViewById(R.id.edt_data);
                edtData.setText(edtData.getText().toString() + "9");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtData = (EditText)findViewById(R.id.edt_data);
                edtData.setText(edtData.getText().toString() + "4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtData = (EditText)findViewById(R.id.edt_data);
                edtData.setText(edtData.getText().toString() + "5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtData = (EditText)findViewById(R.id.edt_data);
                edtData.setText(edtData.getText().toString() + "6");
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtData = (EditText)findViewById(R.id.edt_data);
                edtData.setText(edtData.getText().toString() + "1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtData = (EditText)findViewById(R.id.edt_data);
                edtData.setText(edtData.getText().toString() + "2");
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtData = (EditText)findViewById(R.id.edt_data);
                edtData.setText(edtData.getText().toString() + "3");
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtData = (EditText)findViewById(R.id.edt_data);
                edtData.setText(edtData.getText().toString() + "0");
            }
        });
    }



}

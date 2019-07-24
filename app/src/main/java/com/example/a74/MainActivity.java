package com.example.a74;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    EditText textField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this.testFunction();
        text = (TextView) findViewById(R.id.textView2);
        textField = (EditText) findViewById(R.id.editText);
        textField.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            public void afterTextChanged(Editable s) {

                String newText = textField.getText().toString();
                text.setText(newText);
            }
        });
    }

    public void testFunction(View v) {
        System.out.println("Hello World!");
        String newText = textField.getText().toString();
        text.setText(newText);
    }
}

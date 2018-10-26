package com.example.edu.myedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText plainText = (EditText)findViewById(R.id.plainText);
        plainText.setOnKeyListener(
                new View.OnKeyListener() {
                    @Override
                    public boolean onKey(View v, int keyCode, KeyEvent event) {
                        String text = ((EditText)v).getText().toString();
                        if((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)){
                            Toast.makeText(v.getContext(),text, Toast.LENGTH_SHORT).show();
                            return true;
                        }
                        return false;
                    }
                }
        );
    }
}

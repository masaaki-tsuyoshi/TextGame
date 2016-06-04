package com.example.textgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView resultText;
    TextView popUpText;
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
        resultText = (TextView) findViewById(R.id.resulttext);
        popUpText = (TextView) findViewById(R.id.popuptext);
        Button button = (Button) findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // エディットテキストのテキストを取得
                String text = editText.getText().toString();
                // 取得したテキストを TextView に張り付ける
                if(text.equals("1")){
                    Toast.makeText(getApplicationContext(), "右の部屋には何もなかった！",Toast.LENGTH_SHORT).show();
                }else if (text.equals("2")){
                    Toast.makeText(getApplicationContext(), "左の部屋には何もなかった！",Toast.LENGTH_SHORT).show();
                }else if (text.equals("3")){
                    Toast.makeText(getApplicationContext(), "真ん中の部屋には銀のナイフがあった！",Toast.LENGTH_SHORT).show();
                }else if (text.equals("4")){
                    Toast.makeText(getApplicationContext(), "後ろの部屋には、財宝があった！",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "入力しなおしてください",Toast.LENGTH_SHORT).show();

                }
            }
        });

    }



}

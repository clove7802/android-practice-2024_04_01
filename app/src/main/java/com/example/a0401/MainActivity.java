package com.example.a0401;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //익명 클래스
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v) {
               Toast.makeText(getApplicationContext(), "첫번째 버튼입니다", Toast.LENGTH_SHORT).show();
           } 
        });

        //람다식
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener((e) -> {
            Toast.makeText(getApplicationContext(), "두번째 버튼입니다", Toast.LENGTH_SHORT).show();
        });
}
}
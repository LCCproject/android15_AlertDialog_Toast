package com.example.a15_alertdialog_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2 = findViewById(R.id.btn2);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setIcon(android.R.mipmap.sym_def_app_icon);    // 取得小綠人圖示
                dialog.setTitle("對話框測試");
                dialog.setMessage("這是一個對話視窗");
                dialog.setNegativeButton("繼續使用", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "繼續使用", Toast.LENGTH_LONG).show();
                    }
                });

                dialog.setPositiveButton("關閉視窗", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "結束程式", Toast.LENGTH_LONG).show();
                    }
                });
                dialog.show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"hello world", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
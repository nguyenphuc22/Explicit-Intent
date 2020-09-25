package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void sendData(View view) {

        Intent intent = new Intent(this,MainActivity2.class);
        // I want to send data from MainActivity to MainACtivity2
        String data = "PhucVr";
        Bundle bundle = new Bundle();
        bundle.putString("data",data);
        // You can send data type : int , boolean , float .....
        // So send tye object
        Student phuc = new Student("PhucVr",20);
        bundle.putSerializable("Phuc",phuc);

        intent.putExtras(bundle);

        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
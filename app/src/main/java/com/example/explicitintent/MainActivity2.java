package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtView = findViewById(R.id.txtTextView);
        // Getting data
        Bundle bundle = this.getIntent().getExtras();
        // We must check bundle is't null
        // If you don't check, your app will error
        if (bundle != null) {

            String data = bundle.getString("data");
            Student phuc = (Student) bundle.getSerializable("Phuc");
//            txtView.setText(data + "\n" + phuc.name + "\n" + phuc.age);

        }
    }
}
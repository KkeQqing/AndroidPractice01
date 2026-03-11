package com.example.test01;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    private Button btnCalculator, btnMain, btnRelative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // 这个 layout 要包含三个按钮！

        btnCalculator = findViewById(R.id.btn_calculator);
        btnRelative = findViewById(R.id.btn_relative);

        btnCalculator.setOnClickListener(v -> loadFragment(new CalculatorFragment()));
        btnRelative.setOnClickListener(v -> loadFragment(new RelativeDemoFragment()));
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment_container, fragment); // 需要一个容器 ID
        ft.commit();
    }
}
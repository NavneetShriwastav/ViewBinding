package com.example.classup.classup.classup.viewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.classup.classup.classup.viewbinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(binding.cb.isChecked()) {
                    Toast.makeText(MainActivity.this, "Pass", Toast.LENGTH_SHORT).show();
                    binding.cb.setButtonTintList(null);
                } else {
                    // Change the tint color of the CheckBox to red when it's unchecked
                    binding.cb.setButtonTintList(ColorStateList.valueOf(Color.RED));
                    Toast.makeText(MainActivity.this,"Failed",Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}
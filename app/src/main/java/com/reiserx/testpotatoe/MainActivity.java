package com.reiserx.testpotatoe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.reiserx.testpotatoe.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    /* I have used different icons in this design
    because I don't have that icons used in original putatoe app */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        //For separating and organising all the dialog codes from mainActivity
        Dialogs dialogs = new Dialogs(this);

        binding.transferMoneyBtn.setOnClickListener(view -> {
            dialogs.transferMoney();
        });

        binding.addMoneyBtn.setOnClickListener(view -> {
            dialogs.addMoney();
        });

        binding.reedemBtn.setOnClickListener(view -> dialogs.reedemDialog());

        binding.sendMoneyBtn.setOnClickListener(view -> dialogs.addBankAccount());
    }

}
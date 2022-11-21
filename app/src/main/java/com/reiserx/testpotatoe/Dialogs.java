package com.reiserx.testpotatoe;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;

public class Dialogs {
    private final Context context;


    public Dialogs(Context context) {
        this.context = context;
    }

    public void transferMoney() {
        AlertDialog alert = new AlertDialog.Builder(context).create();

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View mView = inflater.inflate(R.layout.test, null);
        final Button submit = mView.findViewById(R.id.submit_money_btn);
        final ImageView close = mView.findViewById(R.id.close_btn_transfer_money_dialog);

        alert.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        submit.setOnClickListener(view -> {
            Toast.makeText(context, "Submit", Toast.LENGTH_SHORT).show();
        });

        close.setOnClickListener(view -> {
            alert.dismiss();
        });
        alert.setView(mView);
        alert.show();
    }

    public void addMoney() {
        AlertDialog alert = new AlertDialog.Builder(context).create();

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View mView = inflater.inflate(R.layout.add_money_dialog, null);
        final Button add = mView.findViewById(R.id.add_money_dialog_btn);
        final ImageView close = mView.findViewById(R.id.add_money_dialog_close);

        alert.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        add.setOnClickListener(view -> {
            Toast.makeText(context, "Add", Toast.LENGTH_SHORT).show();
        });

        close.setOnClickListener(view -> {
            alert.dismiss();
        });
        alert.setView(mView);
        alert.show();
    }

    public void reedemDialog() {
        AlertDialog alert = new AlertDialog.Builder(context).create();

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View mView = inflater.inflate(R.layout.reedem_dialog_layout, null);
        final Button add = mView.findViewById(R.id.reedem_submit_dialog);
        final Button close = mView.findViewById(R.id.reedem_cancel_dialog);

        add.setOnClickListener(view -> {
            Toast.makeText(context, "Add", Toast.LENGTH_SHORT).show();
        });

        close.setOnClickListener(view -> {
            alert.dismiss();
        });
        alert.setView(mView);
        alert.show();
    }

    public void addBankAccount() {
        AlertDialog alert = new AlertDialog.Builder(context).create();

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View mView = inflater.inflate(R.layout.send_money_dialog, null);
        final TextView add = mView.findViewById(R.id.add_bank_acc_dialog_btn);
        final ImageView close = mView.findViewById(R.id.add_bank_acc_close);

        add.setOnClickListener(view -> {
            Toast.makeText(context, "Add", Toast.LENGTH_SHORT).show();
        });

        close.setOnClickListener(view -> alert.dismiss());

        alert.setView(mView);
        alert.show();
    }
}

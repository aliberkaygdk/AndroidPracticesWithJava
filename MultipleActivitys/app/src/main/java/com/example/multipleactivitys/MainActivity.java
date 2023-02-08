package com.example.multipleactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String userName;
    EditText editText;
    String hataMesaj="İsim Boş Bırakılamaz";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);

    }
    public void changeActivity(View view) {
        if (editText.getText().toString().matches("")||editText.getText().toString().matches(" +")){
            AlertDialog.Builder hata=new AlertDialog.Builder(MainActivity.this);
            hata.setMessage(hataMesaj);
            hata.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            hata.show();
        }else {
            userName = editText.getText().toString();
            Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
            intent.putExtra("Name", userName);
            startActivity(intent);
        }

    }
}
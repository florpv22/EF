package com.example.dam_examen_final_pizango;
import android.content.Intent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = findViewById(R.id.buttonLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, NotasActivity.class);
                startActivity(i);
            }

        });

        Button btn1 = findViewById(R.id.button2);
        btn1.setOnClickListener(view -> Toast.makeText(this, "Reuperar clave", Toast.LENGTH_SHORT).show());

        // Referencia al botón
        Button buttonSelectDocument = findViewById(R.id.button_select_document);

        // Escuchar clic en el botón
        buttonSelectDocument.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDocumentTypeDialog();
            }
        });
    }

    // Método para mostrar el diálogo con opciones
    private void showDocumentTypeDialog() {
        // Opciones del diálogo
        final String[] documentTypes = {"DNI", "CARNET DE EXTRANJERIA", "PASAPORTE"};

        // Crear el AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Selecciona el Tipo de Documento");

        // Opciones con botones de radio
        builder.setSingleChoiceItems(documentTypes, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Muestra un mensaje con la opción seleccionada
                Toast.makeText(MainActivity.this, "Seleccionaste: " + documentTypes[which], Toast.LENGTH_SHORT).show();
            }
        });

        // Botón Aceptar
        builder.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        // Botón Cancelar
        builder.setNegativeButton("CANCELAR", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        // Mostrar el diálogo
        builder.create().show();
    }
}
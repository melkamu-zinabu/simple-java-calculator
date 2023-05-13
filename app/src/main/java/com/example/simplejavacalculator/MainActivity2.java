package com.example.simplejavacalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    private CheckBox javaCheckBox, cPlusPlusCheckBox, cSharpCheckBox, pythonCheckBox, javascriptCheckBox;
    private Button submitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        javaCheckBox = findViewById(R.id.javaCheckBox);
        cPlusPlusCheckBox = findViewById(R.id.cPlusPlusCheckBox);
        cSharpCheckBox = findViewById(R.id.cSharpCheckBox);
        pythonCheckBox = findViewById(R.id.pythonCheckBox);
        javascriptCheckBox = findViewById(R.id.javascriptCheckBox);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<String> selectedLanguages = new ArrayList<>();

                if (javaCheckBox.isChecked()) {
                    selectedLanguages.add("Java");
                }

                if (cPlusPlusCheckBox.isChecked()) {
                    selectedLanguages.add("C++");
                }

                if (cSharpCheckBox.isChecked()) {
                    selectedLanguages.add("C#");
                }

                if (pythonCheckBox.isChecked()) {
                    selectedLanguages.add("Python");
                }

                if (javascriptCheckBox.isChecked()) {
                    selectedLanguages.add("JavaScript");
                }

                if (selectedLanguages.isEmpty()) {
                    showAlertDialog("Are you a student?");
                } else if (selectedLanguages.size() == 1) {
                    String selectedLanguage = selectedLanguages.get(0);
                    showAlertDialog("Your selected language is: " + selectedLanguage);
                } else {
                    StringBuilder selectedLanguagesText = new StringBuilder();
                    for (String language : selectedLanguages) {
                        selectedLanguagesText.append(language).append(", ");
                    }
                    selectedLanguagesText.delete(selectedLanguagesText.length() - 2, selectedLanguagesText.length());
                    showAlertDialog("Your selected languages are: " + selectedLanguagesText.toString());
                }
            }
        });
    }

    private void showAlertDialog(String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }




}
package com.example.form1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.form1.R;
import com.google.android.material.textfield.TextInputEditText;
import androidx.appcompat.app.AppCompatActivity;

public class CategoryForm extends AppCompatActivity {


    private TextInputEditText categoryInput, budgetInput;
    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_form);


        categoryInput = findViewById(R.id.category);
        budgetInput = findViewById(R.id.budget);
        addButton = findViewById(R.id.addBtn);


        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String category = categoryInput.getText().toString();
                String budget = budgetInput.getText().toString();


                if (category.isEmpty() || budget.isEmpty()) {
                    Toast.makeText(CategoryForm.this, "Please fill out all fields", Toast.LENGTH_SHORT).show();
                } else {

                    Toast.makeText(CategoryForm.this,
                            "Category: " + category + "\nBudget: " + budget,
                            Toast.LENGTH_LONG).show();


                    Toast.makeText(CategoryForm.this, "Added Successfully", Toast.LENGTH_SHORT).show();


                    categoryInput.setText("");
                    budgetInput.setText("");
                }
            }
        });
    }
}

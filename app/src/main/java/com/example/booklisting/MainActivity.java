package com.example.booklisting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ///MAKING NEW INTENT TO SHOW THE LIST OF BOOKS
        // Find the View that shows the numbers category
        Button numbers = (Button) findViewById(R.id.buttonSearch);
        EditText searchField= findViewById(R.id.searchValue);

        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Editable value=searchField.getEditableText();
                String search=value.toString();
                Intent bookIntent = new Intent(MainActivity.this, BookActivity.class);
                bookIntent.putExtra("search",search);
                // Start the new activity
                startActivity(bookIntent);
            }
        });
        ///INTENT FOR THE BOOKS END HERE


    }
}
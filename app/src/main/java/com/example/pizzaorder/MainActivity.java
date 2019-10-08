package com.example.pizzaorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    ImageView imageView = (ImageView) findViewById(R.id.imageView2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView.setImageResource(R.drawable.ic_not_selected_pizza);

        Button square = (Button) findViewById((R.id.button));
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.ic_squared_pizza);
            }
        });

        Button round = (Button) findViewById(R.id.button2);
        round.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               imageView.setImageResource(R.drawable.ic_round_pizza);
            }
        });
    }
}


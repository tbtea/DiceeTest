// not mine, but from udemy. 
package com.example.tonytea.dicee;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;

        rollButton = (Button) findViewById(R.id.button);

        final ImageView rightDice = (ImageView) findViewById(R.id.image_dice2);
        final ImageView leftDice = (ImageView) findViewById(R.id.image_dice1);

        // array
        // final so it cant change
        final int[] diceArray = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3, R.drawable.dice4, R.drawable.dice5,
        R.drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee", "ze button has ben pressed!");

                // Random already exists in java, this is how we generate random nums

                Random randomNumGenerator = new Random();

                int number = randomNumGenerator.nextInt(6);

                Log.d("Dicee", "the rando number is " + number);

                rightDice.setImageResource(diceArray[number]);

                number = randomNumGenerator.nextInt(6);

                leftDice.setImageResource(diceArray[number]);
            }
        });
    }
}

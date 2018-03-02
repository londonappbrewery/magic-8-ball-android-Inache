package com.londonappbrewery.magiceightball;

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

        Button askButton = findViewById(R.id.askButton);
        final ImageView imageBall = findViewById(R.id.imageBall);

        final int[] ballArray = {R.drawable.ball10,R.drawable.ball11,R.drawable.ball12,R.drawable.ball13,R.drawable.ball14,
                R.drawable.ball15,R.drawable.ball16,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,
                R.drawable.ball5,R.drawable.ball6,R.drawable.ball7,R.drawable.ball8,R.drawable.ball9};

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("magic-8BallApp-Inache","The button has been pressed");

                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(15);
                Log.d("magic-8BallAp-Inache","The random nubmer is "+ number);
                imageBall.setImageResource(ballArray[number]);
            }
        });

    }
}
/* Button rollButton = findViewById(R.id.rollButton);
final ImageView image_left_dice = findViewById(R.id.image_left_dice);
    final ImageView image_right_dice = findViewById(R.id.image_right_dice);

    //array final dice array cant change if its final.
    final int[] diceArray = {R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};


        rollButton.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Log.d("DiceApp", "The button has been pressed");
        Random randomNumberGenerator = new Random();
        int number = randomNumberGenerator.nextInt(6);
        Log.d("DiceApp","The random number is "+ number);

        // connecting array with random

        image_left_dice.setImageResource(diceArray[number]);

        //making new number generator without int, cause he will use previous one. so it will be 2 rand gens. */
     /*   number = randomNumberGenerator.nextInt(6);
        image_right_dice.setImageResource(diceArray[number]);

        }
        }); */
package com.example.alr3.emotions;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * initiation of variables
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView loveview, angerview, joyview, sadnessview, fearview, surpriseview;
    Button Love_Button, Sadness_Button, Joy_Button, Surprise_Button, Fear_Button, Anger_Button;
    Emotions LoveE, SadnessE, JoyE, SurpriseE, FearE, AngerE;
    Context context = this;
    EditText comment;
    SimpleDateFormat sdf;

    /**
     * Provide the locations of buttons based on the R.id
     * Turn buttons so that they're listening for a click
     * Enable the comment field
     * Initiate emotions classes for each type
     * set textviews for the count of each type of emotion
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Love_Button = (Button)findViewById(R.id.Love);
        Sadness_Button = (Button) findViewById(R.id.Sadness);
        Joy_Button = (Button) findViewById(R.id.Joy);
        Surprise_Button = (Button) findViewById(R.id.Surprise);
        Fear_Button = (Button) findViewById(R.id.Fear);
        Anger_Button = (Button) findViewById(R.id.Anger);
        Love_Button.setOnClickListener(this);
        Anger_Button.setOnClickListener(this);
        Sadness_Button.setOnClickListener(this);
        Joy_Button.setOnClickListener(this);
        Fear_Button.setOnClickListener(this);
        Surprise_Button.setOnClickListener(this);
        comment = findViewById(R.id.comment);
        LoveE = new Emotions(Love_Button);
        SadnessE = new Emotions(Sadness_Button);
        JoyE = new Emotions(Joy_Button);
        AngerE = new Emotions(Anger_Button);
        SurpriseE = new Emotions(Surprise_Button);
        FearE = new Emotions(Fear_Button);
        angerview = (TextView) findViewById(R.id.Angercount);
        sadnessview = (TextView) findViewById(R.id.Sadnesscount);
        joyview = (TextView) findViewById(R.id.Joycount);
        loveview = (TextView) findViewById(R.id.Lovecount);
        surpriseview = (TextView) findViewById(R.id.Suprisecount);
        fearview = (TextView) findViewById(R.id.Fearcount);
        //sdf = new SimpleDateFormat("yyyy-MM-ddTHH:mm:ss");
    }


    /**
     *     Create a function for what to do when a click occurs
     *     based on the click get the ID and determine where the click occured.
     *     If trees to act on the appropriate emotion
     *     once type is determined create an instance of that emotion
     *     increment the count of the emotion
     *     update the view of the count
     */

    @Override
    public void onClick(View v){
        int x;
        Instance y;
        x = v.getId();
        if (x == R.id.Love){
            y = new Instance("Love", comment.getText().toString());
            LoveE.increment();
            loveview.setText(String.valueOf(LoveE.getCounter()));
        }
        if (x == R.id.Sadness) {
            y = new Instance("Sadness", comment.getText().toString());
            SadnessE.increment();
            sadnessview.setText(String.valueOf(SadnessE.getCounter()));
        }
        if (x == R.id.Joy){
            y = new Instance("Joy", comment.getText().toString());
            JoyE.increment();
            joyview.setText(String.valueOf(JoyE.getCounter()));
        }
        if (x == R.id.Anger){
            y = new Instance("Anger", comment.getText().toString());
            AngerE.increment();
            angerview.setText(String.valueOf(AngerE.getCounter()));
        }
        if (x == R.id.Fear){
            y = new Instance("Fear", comment.getText().toString());
            FearE.increment();
            fearview.setText(String.valueOf(FearE.getCounter()));
        }
        if (x == R.id.Surprise){
            y = new Instance("Surprise", comment.getText().toString());
            SurpriseE.increment();
            surpriseview.setText(String.valueOf(SurpriseE.getCounter()));
        }
    }
}

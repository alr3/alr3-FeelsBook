package com.example.alr3.emotions;

import android.widget.Button;
/**
 * Class for emotions counter
 * initialize variables for counter and the button assosciated with it
 * create a constructor
 * two functions for incrementing and decrementing counter
 * function to retrieve counter variable because it's private
 */

public class Emotions{
    //
    private int counter;
    Button b1;
    public Emotions(Button but){
        b1 = but; counter =0;
    }
    void increment(){
        counter++;
    }
    void decrement(){
        counter--;
    }
    int getCounter(){
        return counter;
    }
}

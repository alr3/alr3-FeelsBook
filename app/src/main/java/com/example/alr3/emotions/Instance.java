package com.example.alr3.emotions;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Create a class for instances
 * initialize 3 variables for emotion type, comments, and the time
 * Create Simple Date format
 * constructor asking for the type of instance and the comments
 */

public class Instance {
    private String emotionT;
    private String comments;
    private String time;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public Instance(String type, String com) {
        this.emotionT = type;
        this.comments = com;
        this.time = sdf.format(new Date());
    }
}


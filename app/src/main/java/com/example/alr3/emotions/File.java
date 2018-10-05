package com.example.alr3.emotions;

import android.content.Context;

import java.io.FileOutputStream;

import static android.content.Context.MODE_PRIVATE;

public class File {
    String filename;
    String fileContents;
    FileOutputStream outputStream;

    public void writetofile(String name, String Contents, Context ctx){
        filename = name;
        fileContents = Contents;
        try{
            outputStream = ctx.openFileOutput(filename, Context.MODE_PRIVATE);
            outputStream.write(fileContents.getBytes());
            outputStream.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void readfile(String name){

    }
}

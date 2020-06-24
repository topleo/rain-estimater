package com.edu.sustech.rainestimator.database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Video {
    @PrimaryKey(autoGenerate = true)
    public int id;


    public String filePath;
    public Long exposureTime;
    public double result;

    public Video(String filePath, Long exposureTime){
        this.filePath = filePath;
        this.exposureTime = exposureTime;
    }

    public void setResult(double result) {
        this.result = result;
    }
}

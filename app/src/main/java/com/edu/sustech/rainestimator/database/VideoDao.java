package com.edu.sustech.rainestimator.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
public interface VideoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertVideo(Video video);

    @Delete
    void deleteVideo(Video video);

    @Query("SELECT * FROM VIDEO")
    Video[] loadAllVideos();

}

/*
 * Copyright 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.edu.sustech.rainestimator;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.fragment.app.FragmentActivity;
import androidx.room.Room;

import com.edu.sustech.rainestimator.database.AppDatabase;

public class CameraActivity extends FragmentActivity {

    private AppDatabase db;
    public static CameraActivity cameraActivity;
    private String databaseName = "rain_video.db";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        cameraActivity = this;
        super.onCreate(savedInstanceState);

        db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, databaseName).build();

        setContentView(R.layout.activity_camera);
//        if (null == savedInstanceState) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, Camera2VideoFragment.newInstance())
                .addToBackStack(null)
                .commit();
//        }
    }

    public AppDatabase getDb(){
        return db;
    }

    public static CameraActivity getActivity(){
        return cameraActivity;
    }

}

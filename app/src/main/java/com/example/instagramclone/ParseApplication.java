package com.example.instagramclone;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("yLJbRqUfXPeCaWX32xSVi4PqsdVruroxD53esqZQ")
                .clientKey("dErm5hvomV0qVLXil4X6uZkKpIrosasmO3v3M1dQ")
                .server("http://parseapi.back4app.com")
                .build()
        );

    }
}


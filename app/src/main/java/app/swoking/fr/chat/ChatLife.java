package app.swoking.fr.chat;

import android.app.Application;

import com.firebase.client.Firebase;

public class ChatLife extends Application {

    private static final String TAG = "ChatLife";

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }

}

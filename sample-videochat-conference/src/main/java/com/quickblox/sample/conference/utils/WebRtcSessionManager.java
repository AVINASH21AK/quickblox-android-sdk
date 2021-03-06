package com.quickblox.sample.conference.utils;

import android.content.Context;

import com.quickblox.conference.ConferenceSession;

/**
 * Created by tereha on 16.05.16.
 */
public class WebRtcSessionManager {
    private static final String TAG = WebRtcSessionManager.class.getSimpleName();

    private static WebRtcSessionManager instance;
    private Context context;

    private static ConferenceSession currentSession;

    private WebRtcSessionManager(Context context) {
        this.context = context;
    }

    public static WebRtcSessionManager getInstance(Context context){
        if (instance == null){
            instance = new WebRtcSessionManager(context);
        }

        return instance;
    }

    public ConferenceSession getCurrentSession() {
        return currentSession;
    }

    public void setCurrentSession(ConferenceSession qbCurrentSession) {
        currentSession = qbCurrentSession;
    }
}

package com.example.recyclerview.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.speech.tts.TextToSpeech;

import java.util.HashMap;

/**
 * Created by Nguyen Kim Khanh on 7/16/2020.
 */
public class TextToSpeedUtils {
    public static void speak(String text, Context context, TextToSpeech textToSpeech) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ttsGreater21(text, context, textToSpeech);
        } else {
            ttsUnder20(text, textToSpeech);
        }
    }

    @SuppressWarnings("deprecation")
    private static void ttsUnder20(String text, TextToSpeech textToSpeech) {
        HashMap<String, String> map = new HashMap<>();
        map.put(TextToSpeech.Engine.KEY_PARAM_UTTERANCE_ID, "MessageId");
        textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, map);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private static void ttsGreater21(String text, Context context, TextToSpeech textToSpeech) {
        String utteranceId = context.hashCode() + "";
        textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null, utteranceId);
    }
}

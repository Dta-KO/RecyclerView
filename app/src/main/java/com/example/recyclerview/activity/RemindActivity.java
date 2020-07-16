package com.example.recyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;

import com.example.recyclerview.notification.NotificationReceiver;
import com.example.recyclerview.R;

import java.util.Calendar;

public class RemindActivity extends AppCompatActivity {

    class RemindTime {
        private int hour;
        private int minute;

        RemindTime(int hour, int minute) {
            this.hour = hour;
            this.minute = minute;
        }

        public int getHour() {
            return hour;
        }

        public void setHour(int hour) {
            this.hour = hour;
        }

        public int getMinute() {
            return minute;
        }

        public void setMinute(int minute) {
            this.minute = minute;
        }
    }

    public static final String REMIND_HOURS_MINUTE = "RemindActivity.REMIND_HOURS_MINUTE";
    public static final String ALREADY_SET_REMIND = "RemindActivity.ALREADY_SET_REMIND";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remind);

        settingForNumberPicker();
        handleWhenButtonDoneClicked();
        handleWhenButtonIgnoreClicked();
    }

    private void settingForNumberPicker() {
        RemindTime remindTime = getRemindTimeFromSavedPreference();
        NumberPicker txtHours = findViewById(R.id.txtHours);
        txtHours.setMaxValue(23);
        txtHours.setMinValue(0);
        txtHours.setValue(remindTime.getHour());

        NumberPicker txtMinute = findViewById(R.id.txtMinute);
        txtMinute.setMaxValue(59);
        txtMinute.setMinValue(0);
        txtMinute.setValue(remindTime.getMinute());
    }

    private RemindTime getRemindTimeFromSavedPreference() {
        RemindTime remindTime = new RemindTime(0, 0);
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        String hoursMinute = sharedPreferences.getString(REMIND_HOURS_MINUTE, "");
        if (hoursMinute != null && !hoursMinute.equals("")) {
            String[] split = hoursMinute.trim().split("\\|");
            remindTime.setHour(Integer.parseInt(split[0].trim()));
            remindTime.setMinute(Integer.parseInt(split[1].trim()));
        }
        return remindTime;
    }

    private void handleWhenButtonIgnoreClicked() {
        TextView txtIgnore = findViewById(R.id.txtIgnore);
        txtIgnore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBackActivity();
            }
        });
    }

    private void handleWhenButtonDoneClicked() {
        Button btnDone = findViewById(R.id.btnDone);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NumberPicker txtHours = findViewById(R.id.txtHours);
                NumberPicker txtMinute = findViewById(R.id.txtMinute);
                saveRemindHoursAndMinuteForSettingLater(txtHours, txtMinute);
                createAlarmForLearning(txtHours, txtMinute);
                saveDataTypeNumberByName(ALREADY_SET_REMIND, true);
                goBackActivity();
            }
        });
    }

    private void saveRemindHoursAndMinuteForSettingLater(NumberPicker txtHours, NumberPicker txtMinute) {
        SharedPreferences.Editor editor =
                PreferenceManager.getDefaultSharedPreferences(RemindActivity.this).edit();
        editor.putString(REMIND_HOURS_MINUTE, txtHours.getValue() + "|" + txtMinute.getValue());
        editor.apply();
    }

    private void createAlarmForLearning(NumberPicker txtHours, NumberPicker txtMinute) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, txtHours.getValue());
        calendar.set(Calendar.MINUTE, txtMinute.getValue());

        Intent intent = new Intent(RemindActivity.this, NotificationReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(
                RemindActivity.this,
                0,
                intent,
                PendingIntent.FLAG_UPDATE_CURRENT
        );
        AlarmManager alarmManager = (AlarmManager) RemindActivity.this.getSystemService(ALARM_SERVICE);
        if (alarmManager != null) {
            alarmManager.setRepeating(
                    AlarmManager.RTC_WAKEUP,
                    calendar.getTimeInMillis(),
                    AlarmManager.INTERVAL_DAY,
                    pendingIntent
            );
        }
    }

    private void goBackActivity() {
        finish();
    }

    private void saveDataTypeNumberByName(String dataName, boolean value){
        SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(this).edit();
        editor.putBoolean(dataName, value);
        editor.apply();
    }
}

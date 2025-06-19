package androidx.core.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public final class e {
    private e() {
    }

    public static void a(@h0 AlarmManager alarmManager, long j, @h0 PendingIntent pendingIntent, @h0 PendingIntent pendingIntent2) {
        if (Build.VERSION.SDK_INT >= 21) {
            alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(j, pendingIntent), pendingIntent2);
        } else {
            c(alarmManager, 0, j, pendingIntent2);
        }
    }

    public static void b(@h0 AlarmManager alarmManager, int r3, long j, @h0 PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 23) {
            alarmManager.setAndAllowWhileIdle(r3, j, pendingIntent);
        } else {
            alarmManager.set(r3, j, pendingIntent);
        }
    }

    public static void c(@h0 AlarmManager alarmManager, int r3, long j, @h0 PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(r3, j, pendingIntent);
        } else {
            alarmManager.set(r3, j, pendingIntent);
        }
    }

    public static void d(@h0 AlarmManager alarmManager, int r3, long j, @h0 PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 23) {
            alarmManager.setExactAndAllowWhileIdle(r3, j, pendingIntent);
        } else {
            c(alarmManager, r3, j, pendingIntent);
        }
    }
}

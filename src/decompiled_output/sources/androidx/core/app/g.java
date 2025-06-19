package androidx.core.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f267a = "android.support.AppLaunchChecker";

    /* renamed from: b, reason: collision with root package name */
    private static final String f268b = "startedFromLauncher";

    @Deprecated
    public g() {
    }

    public static boolean a(@h0 Context context) {
        return context.getSharedPreferences(f267a, 0).getBoolean(f268b, false);
    }

    public static void b(@h0 Activity activity) {
        Intent intent;
        SharedPreferences sharedPreferences = activity.getSharedPreferences(f267a, 0);
        if (sharedPreferences.getBoolean(f268b, false) || (intent = activity.getIntent()) == null || !"android.intent.action.MAIN".equals(intent.getAction())) {
            return;
        }
        if (intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory(b.i.c.e.f971c)) {
            sharedPreferences.edit().putBoolean(f268b, true).apply();
        }
    }
}

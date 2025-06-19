package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class dr implements Callable<String> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Context f3163a;

    dr(er erVar, Context context) {
        this.f3163a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        SharedPreferences sharedPreferences = this.f3163a.getSharedPreferences("admob_user_agent", 0);
        String string = sharedPreferences.getString("user_agent", "");
        if (!TextUtils.isEmpty(string)) {
            oo.m("User agent is already initialized on Google Play Services.");
            return string;
        }
        oo.m("User agent is not initialized on Google Play Services. Initializing.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this.f3163a);
        com.google.android.gms.common.util.a0.a(this.f3163a, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
        return defaultUserAgent;
    }
}

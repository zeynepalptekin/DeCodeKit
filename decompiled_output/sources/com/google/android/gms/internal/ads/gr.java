package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class gr implements Callable<String> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Context f3575a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Context f3576b;

    gr(er erVar, Context context, Context context2) {
        this.f3575a = context;
        this.f3576b = context2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        SharedPreferences sharedPreferences;
        boolean z = false;
        if (this.f3575a != null) {
            oo.m("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.f3575a.getSharedPreferences("admob_user_agent", 0);
        } else {
            oo.m("Attempting to read user agent from local cache.");
            sharedPreferences = this.f3576b.getSharedPreferences("admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            oo.m("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.f3576b);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                oo.m("Persisting user agent.");
            }
        }
        return string;
    }
}

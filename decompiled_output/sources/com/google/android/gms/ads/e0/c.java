package com.google.android.gms.ads.e0;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import c.a.b.b.d.i;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f2389a;

    public c(Context context) {
        try {
            Context contextI = i.i(context);
            this.f2389a = contextI == null ? null : contextI.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.f2389a = null;
        }
    }

    public final boolean a(String str, boolean z) {
        try {
            if (this.f2389a == null) {
                return false;
            }
            return this.f2389a.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }

    final float b(String str, float f) {
        try {
            if (this.f2389a == null) {
                return 0.0f;
            }
            return this.f2389a.getFloat(str, 0.0f);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return 0.0f;
        }
    }

    final String c(String str, String str2) {
        try {
            return this.f2389a == null ? str2 : this.f2389a.getString(str, str2);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }
}

package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.AppMeasurement;

/* loaded from: classes.dex */
public class b6 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f6357a = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f6358b = {AppMeasurement.e.f6331c, "_fot", "_fvt", "_ldl", "_id", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    protected b6() {
    }

    public static String a(String str) {
        return q7.c(str, f6357a, f6358b);
    }
}

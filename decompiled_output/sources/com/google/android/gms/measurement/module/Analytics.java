package com.google.android.gms.measurement.module;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.o0;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.measurement.internal.b5;
import com.google.android.gms.measurement.internal.c6;
import com.google.android.gms.measurement.internal.z5;

@v
/* loaded from: classes.dex */
public class Analytics {

    /* renamed from: b, reason: collision with root package name */
    @v
    @com.google.android.gms.common.annotation.a
    public static final String f6581b = "crash";

    /* renamed from: c, reason: collision with root package name */
    @v
    @com.google.android.gms.common.annotation.a
    public static final String f6582c = "fcm";

    @v
    @com.google.android.gms.common.annotation.a
    public static final String d = "fiam";
    private static volatile Analytics e;

    /* renamed from: a, reason: collision with root package name */
    private final b5 f6583a;

    @v
    @com.google.android.gms.common.annotation.a
    public static final class a extends z5 {

        @v
        @com.google.android.gms.common.annotation.a
        public static final String e = "_ae";

        @v
        @com.google.android.gms.common.annotation.a
        public static final String f = "_ar";

        private a() {
        }
    }

    @v
    @com.google.android.gms.common.annotation.a
    public static final class b extends c6 {

        @v
        @com.google.android.gms.common.annotation.a
        public static final String e = "fatal";

        @v
        @com.google.android.gms.common.annotation.a
        public static final String f = "timestamp";

        @v
        @com.google.android.gms.common.annotation.a
        public static final String g = "type";

        private b() {
        }
    }

    private Analytics(b5 b5Var) {
        r.k(b5Var);
        this.f6583a = b5Var;
    }

    @Keep
    @o0(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @v
    public static Analytics getInstance(Context context) {
        if (e == null) {
            synchronized (Analytics.class) {
                if (e == null) {
                    e = new Analytics(b5.a(context, null, null));
                }
            }
        }
        return e;
    }
}

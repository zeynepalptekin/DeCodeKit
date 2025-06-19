package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.i0;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
class r {

    /* renamed from: b, reason: collision with root package name */
    private static final String f6973b = ":";

    /* renamed from: a, reason: collision with root package name */
    public static final long f6972a = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f6974c = Pattern.compile("\\AA[\\w-]{38}\\z");

    r() {
    }

    static boolean c(@i0 String str) {
        return f6974c.matcher(str).matches();
    }

    static boolean d(@i0 String str) {
        return str.contains(f6973b);
    }

    public long a() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public boolean b(com.google.firebase.installations.t.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < a() + f6972a;
    }
}

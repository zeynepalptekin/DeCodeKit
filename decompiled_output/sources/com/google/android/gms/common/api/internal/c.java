package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.h0;
import com.google.android.gms.common.internal.r;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2506a;

    public c(@RecentlyNonNull Activity activity) {
        this.f2506a = r.l(activity, "Activity must not be null");
    }

    @com.google.android.gms.common.annotation.a
    public c(@RecentlyNonNull ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    @h0
    @com.google.android.gms.common.annotation.a
    public Activity a() {
        return (Activity) this.f2506a;
    }

    @h0
    @com.google.android.gms.common.annotation.a
    public androidx.fragment.app.d b() {
        return (androidx.fragment.app.d) this.f2506a;
    }

    @h0
    @com.google.android.gms.common.annotation.a
    public Object c() {
        return this.f2506a;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public boolean d() {
        return false;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public boolean e() {
        return this.f2506a instanceof androidx.fragment.app.d;
    }

    @RecentlyNonNull
    public final boolean f() {
        return this.f2506a instanceof Activity;
    }
}

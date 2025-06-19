package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.e0;
import androidx.annotation.i0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class LifecycleCallback {

    /* renamed from: a, reason: collision with root package name */
    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    protected final d f2502a;

    @com.google.android.gms.common.annotation.a
    protected LifecycleCallback(@RecentlyNonNull d dVar) {
        this.f2502a = dVar;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static d c(@RecentlyNonNull Activity activity) {
        return e(new c(activity));
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static d d(@RecentlyNonNull ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    protected static d e(@RecentlyNonNull c cVar) {
        if (cVar.e()) {
            return h.p2(cVar.b());
        }
        if (cVar.f()) {
            return g.d(cVar.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static d getChimeraLifecycleFragmentImpl(c cVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    @e0
    @com.google.android.gms.common.annotation.a
    public void a(@RecentlyNonNull String str, @RecentlyNonNull FileDescriptor fileDescriptor, @RecentlyNonNull PrintWriter printWriter, @RecentlyNonNull String[] strArr) {
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public Activity b() {
        return this.f2502a.h();
    }

    @e0
    @com.google.android.gms.common.annotation.a
    public void f(@RecentlyNonNull int r1, @RecentlyNonNull int r2, @RecentlyNonNull Intent intent) {
    }

    @e0
    @com.google.android.gms.common.annotation.a
    public void g(@i0 Bundle bundle) {
    }

    @e0
    @com.google.android.gms.common.annotation.a
    public void h() {
    }

    @e0
    @com.google.android.gms.common.annotation.a
    public void i() {
    }

    @e0
    @com.google.android.gms.common.annotation.a
    public void j(@RecentlyNonNull Bundle bundle) {
    }

    @e0
    @com.google.android.gms.common.annotation.a
    public void k() {
    }

    @e0
    @com.google.android.gms.common.annotation.a
    public void l() {
    }
}

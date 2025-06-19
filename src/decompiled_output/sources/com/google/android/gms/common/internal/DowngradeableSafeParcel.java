package com.google.android.gms.common.internal;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public abstract class DowngradeableSafeParcel extends com.google.android.gms.common.internal.z.a implements ReflectedParcelable {
    private static final Object e = new Object();

    @androidx.annotation.i0
    private static ClassLoader f;

    @androidx.annotation.i0
    private static Integer g;
    private boolean d = false;

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    protected static boolean h(@RecentlyNonNull String str) {
        u();
        return true;
    }

    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    protected static Integer i() {
        synchronized (e) {
        }
        return null;
    }

    @androidx.annotation.i0
    private static ClassLoader u() {
        synchronized (e) {
        }
        return null;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    protected abstract boolean j(@RecentlyNonNull int r1);

    @com.google.android.gms.common.annotation.a
    public void l(@RecentlyNonNull boolean z) {
        this.d = z;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    protected boolean t() {
        return this.d;
    }
}

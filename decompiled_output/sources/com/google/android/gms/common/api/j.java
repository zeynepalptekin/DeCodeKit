package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public final class j extends UnsupportedOperationException {
    private final c.a.b.b.d.d d;

    @com.google.android.gms.common.annotation.a
    public j(@RecentlyNonNull c.a.b.b.d.d dVar) {
        this.d = dVar;
    }

    @Override // java.lang.Throwable
    @RecentlyNonNull
    public final String getMessage() {
        String strValueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 8);
        sb.append("Missing ");
        sb.append(strValueOf);
        return sb.toString();
    }
}

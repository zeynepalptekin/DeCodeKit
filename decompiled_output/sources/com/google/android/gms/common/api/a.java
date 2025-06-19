package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public class a extends Exception {

    @RecentlyNonNull
    @Deprecated
    protected final Status d;

    public a(@RecentlyNonNull Status status) {
        int r0 = status.j();
        String strL = status.l() != null ? status.l() : "";
        StringBuilder sb = new StringBuilder(String.valueOf(strL).length() + 13);
        sb.append(r0);
        sb.append(": ");
        sb.append(strL);
        super(sb.toString());
        this.d = status;
    }

    @h0
    public Status a() {
        return this.d;
    }

    @RecentlyNonNull
    public int b() {
        return this.d.j();
    }

    @RecentlyNullable
    @Deprecated
    public String c() {
        return this.d.l();
    }
}

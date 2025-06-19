package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class a4 {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.h0
    public String f6346a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.h0
    private String f6347b;

    /* renamed from: c, reason: collision with root package name */
    private long f6348c;

    @androidx.annotation.h0
    public Bundle d;

    private a4(@androidx.annotation.h0 String str, @androidx.annotation.h0 String str2, @androidx.annotation.i0 Bundle bundle, long j) {
        this.f6346a = str;
        this.f6347b = str2;
        this.d = bundle == null ? new Bundle() : bundle;
        this.f6348c = j;
    }

    public static a4 b(s sVar) {
        return new a4(sVar.d, sVar.f, sVar.e.l(), sVar.g);
    }

    public final s a() {
        return new s(this.f6346a, new n(new Bundle(this.d)), this.f6347b, this.f6348c);
    }

    public final String toString() {
        String str = this.f6347b;
        String str2 = this.f6346a;
        String strValueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(strValueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(strValueOf);
        return sb.toString();
    }
}

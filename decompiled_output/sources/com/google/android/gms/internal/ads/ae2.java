package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes.dex */
public final class ae2 extends he2 {

    /* renamed from: a, reason: collision with root package name */
    private String f2672a;

    public ae2(String str) {
        this.f2672a = str;
    }

    @Override // com.google.android.gms.internal.ads.he2
    public final void a(String str) {
        String str2 = this.f2672a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}

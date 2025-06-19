package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;

/* loaded from: classes.dex */
public final class m4 {

    /* renamed from: a, reason: collision with root package name */
    @com.google.android.gms.common.util.d0
    private final String f6458a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6459b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6460c;
    private final long d;
    private final /* synthetic */ j4 e;

    private m4(j4 j4Var, String str, long j) {
        this.e = j4Var;
        com.google.android.gms.common.internal.r.g(str);
        com.google.android.gms.common.internal.r.a(j > 0);
        this.f6458a = String.valueOf(str).concat(":start");
        this.f6459b = String.valueOf(str).concat(":count");
        this.f6460c = String.valueOf(str).concat(":value");
        this.d = j;
    }

    @androidx.annotation.y0
    private final void c() {
        this.e.c();
        long jA = this.e.z().a();
        SharedPreferences.Editor editorEdit = this.e.D().edit();
        editorEdit.remove(this.f6459b);
        editorEdit.remove(this.f6460c);
        editorEdit.putLong(this.f6458a, jA);
        editorEdit.apply();
    }

    @androidx.annotation.y0
    private final long d() {
        return this.e.D().getLong(this.f6458a, 0L);
    }

    @androidx.annotation.y0
    public final Pair<String, Long> a() {
        long jAbs;
        this.e.c();
        this.e.c();
        long jD = d();
        if (jD == 0) {
            c();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jD - this.e.z().a());
        }
        long j = this.d;
        if (jAbs < j) {
            return null;
        }
        if (jAbs > (j << 1)) {
            c();
            return null;
        }
        String string = this.e.D().getString(this.f6460c, null);
        long j2 = this.e.D().getLong(this.f6459b, 0L);
        c();
        return (string == null || j2 <= 0) ? j4.D : new Pair<>(string, Long.valueOf(j2));
    }

    @androidx.annotation.y0
    public final void b(String str, long j) {
        this.e.c();
        if (d() == 0) {
            c();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.e.D().getLong(this.f6459b, 0L);
        if (j2 <= 0) {
            SharedPreferences.Editor editorEdit = this.e.D().edit();
            editorEdit.putString(this.f6460c, str);
            editorEdit.putLong(this.f6459b, 1L);
            editorEdit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.e.h().H0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        SharedPreferences.Editor editorEdit2 = this.e.D().edit();
        if (z) {
            editorEdit2.putString(this.f6460c, str);
        }
        editorEdit2.putLong(this.f6459b, j3);
        editorEdit2.apply();
    }
}

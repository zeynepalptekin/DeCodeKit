package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class n4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f6467a;

    /* renamed from: b, reason: collision with root package name */
    private final long f6468b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6469c;
    private long d;
    private final /* synthetic */ j4 e;

    public n4(j4 j4Var, String str, long j) {
        this.e = j4Var;
        com.google.android.gms.common.internal.r.g(str);
        this.f6467a = str;
        this.f6468b = j;
    }

    @androidx.annotation.y0
    public final long a() {
        if (!this.f6469c) {
            this.f6469c = true;
            this.d = this.e.D().getLong(this.f6467a, this.f6468b);
        }
        return this.d;
    }

    @androidx.annotation.y0
    public final void b(long j) {
        SharedPreferences.Editor editorEdit = this.e.D().edit();
        editorEdit.putLong(this.f6467a, j);
        editorEdit.apply();
        this.d = j;
    }
}

package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class p4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f6483a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6484b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6485c;
    private String d;
    private final /* synthetic */ j4 e;

    public p4(j4 j4Var, String str, String str2) {
        this.e = j4Var;
        com.google.android.gms.common.internal.r.g(str);
        this.f6483a = str;
        this.f6484b = null;
    }

    @androidx.annotation.y0
    public final String a() {
        if (!this.f6485c) {
            this.f6485c = true;
            this.d = this.e.D().getString(this.f6483a, null);
        }
        return this.d;
    }

    @androidx.annotation.y0
    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.e.D().edit();
        editorEdit.putString(this.f6483a, str);
        editorEdit.apply();
        this.d = str;
    }
}

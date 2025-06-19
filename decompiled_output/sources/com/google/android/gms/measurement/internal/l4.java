package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class l4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f6444a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f6445b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6446c;
    private boolean d;
    private final /* synthetic */ j4 e;

    public l4(j4 j4Var, String str, boolean z) {
        this.e = j4Var;
        com.google.android.gms.common.internal.r.g(str);
        this.f6444a = str;
        this.f6445b = z;
    }

    @androidx.annotation.y0
    public final void a(boolean z) {
        SharedPreferences.Editor editorEdit = this.e.D().edit();
        editorEdit.putBoolean(this.f6444a, z);
        editorEdit.apply();
        this.d = z;
    }

    @androidx.annotation.y0
    public final boolean b() {
        if (!this.f6446c) {
            this.f6446c = true;
            this.d = this.e.D().getBoolean(this.f6444a, this.f6445b);
        }
        return this.d;
    }
}

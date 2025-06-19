package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.d0.k;

/* loaded from: classes.dex */
public final class s5 {

    /* renamed from: a, reason: collision with root package name */
    private final k.c f5220a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.i0
    private final k.b f5221b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.i0
    @androidx.annotation.u("this")
    private com.google.android.gms.ads.d0.k f5222c;

    public s5(k.c cVar, @androidx.annotation.i0 k.b bVar) {
        this.f5220a = cVar;
        this.f5221b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized com.google.android.gms.ads.d0.k d(h4 h4Var) {
        if (this.f5222c != null) {
            return this.f5222c;
        }
        i4 i4Var = new i4(h4Var);
        this.f5222c = i4Var;
        return i4Var;
    }

    public final s4 e() {
        return new t5(this);
    }

    @androidx.annotation.i0
    public final r4 f() {
        r5 r5Var = null;
        if (this.f5221b == null) {
            return null;
        }
        return new u5(this);
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class il0 {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.i0
    private e3 f3833a;

    public il0(zk0 zk0Var) {
        this.f3833a = zk0Var;
    }

    public final synchronized void a(@androidx.annotation.i0 e3 e3Var) {
        this.f3833a = e3Var;
    }

    @androidx.annotation.i0
    public final synchronized e3 b() {
        return this.f3833a;
    }
}

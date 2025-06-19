package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class kh0 implements lh0 {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f4092a;

    /* renamed from: b, reason: collision with root package name */
    private final nr1 f4093b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4094c;

    public kh0(km1 km1Var, nr1 nr1Var) {
        this.f4092a = km1Var.o;
        this.f4093b = nr1Var;
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final void a() {
        if (this.f4094c) {
            return;
        }
        this.f4093b.c(this.f4092a);
        this.f4094c = true;
    }
}

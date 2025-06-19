package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class wj0 implements pe2<xj0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Map<String, u01<k70>>> f5839a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Map<String, u01<bl0>>> f5840b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Map<String, h31<bl0>>> f5841c;
    private final ze2<f70<e50>> d;
    private final ze2<ul0> e;

    public wj0(ze2<Map<String, u01<k70>>> ze2Var, ze2<Map<String, u01<bl0>>> ze2Var2, ze2<Map<String, h31<bl0>>> ze2Var3, ze2<f70<e50>> ze2Var4, ze2<ul0> ze2Var5) {
        this.f5839a = ze2Var;
        this.f5840b = ze2Var2;
        this.f5841c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new xj0(this.f5839a.get(), this.f5840b.get(), this.f5841c.get(), this.d, this.e.get());
    }
}

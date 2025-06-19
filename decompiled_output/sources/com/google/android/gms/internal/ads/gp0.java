package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class gp0 implements pe2<ro0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<an1> f3562a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f3563b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<dr0> f3564c;

    public gp0(ze2<an1> ze2Var, ze2<Executor> ze2Var2, ze2<dr0> ze2Var3) {
        this.f3562a = ze2Var;
        this.f3563b = ze2Var2;
        this.f3564c = ze2Var3;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new ro0(this.f3562a.get(), this.f3563b.get(), this.f3564c.get());
    }
}

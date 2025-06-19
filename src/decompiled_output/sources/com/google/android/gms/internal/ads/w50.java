package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class w50 implements pe2<ch0<sr2>> {

    /* renamed from: a, reason: collision with root package name */
    private final h50 f5786a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<z60> f5787b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Executor> f5788c;

    public w50(h50 h50Var, ze2<z60> ze2Var, ze2<Executor> ze2Var2) {
        this.f5786a = h50Var;
        this.f5787b = ze2Var;
        this.f5788c = ze2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f5787b.get(), this.f5788c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

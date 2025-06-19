package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class mb0 implements pe2<eb0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<ib0> f4376a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Set<ch0<fb0>>> f4377b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Executor> f4378c;

    private mb0(ze2<ib0> ze2Var, ze2<Set<ch0<fb0>>> ze2Var2, ze2<Executor> ze2Var3) {
        this.f4376a = ze2Var;
        this.f4377b = ze2Var2;
        this.f4378c = ze2Var3;
    }

    public static mb0 a(ze2<ib0> ze2Var, ze2<Set<ch0<fb0>>> ze2Var2, ze2<Executor> ze2Var3) {
        return new mb0(ze2Var, ze2Var2, ze2Var3);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new eb0(this.f4376a.get(), this.f4377b.get(), this.f4378c.get());
    }
}

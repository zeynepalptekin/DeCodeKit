package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ms0 implements pe2<hs0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Executor> f4448a;

    public ms0(ze2<Executor> ze2Var) {
        this.f4448a = ze2Var;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new hs0(this.f4448a.get());
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class dp0 implements pe2<ap0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Executor> f3155a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<q30> f3156b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<fh0> f3157c;

    public dp0(ze2<Executor> ze2Var, ze2<q30> ze2Var2, ze2<fh0> ze2Var3) {
        this.f3155a = ze2Var;
        this.f3156b = ze2Var2;
        this.f3157c = ze2Var3;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new ap0(this.f3155a.get(), this.f3156b.get(), this.f3157c.get());
    }
}

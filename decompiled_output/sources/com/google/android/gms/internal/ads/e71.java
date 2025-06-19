package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class e71 implements pe2<a71> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Executor> f3230a;

    public e71(ze2<Executor> ze2Var) {
        this.f3230a = ze2Var;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new a71(this.f3230a.get());
    }
}

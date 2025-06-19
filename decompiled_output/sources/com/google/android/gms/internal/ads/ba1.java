package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ba1 implements pe2<aa1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<dy1<String>> f2809a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f2810b;

    private ba1(ze2<dy1<String>> ze2Var, ze2<Executor> ze2Var2) {
        this.f2809a = ze2Var;
        this.f2810b = ze2Var2;
    }

    public static ba1 a(ze2<dy1<String>> ze2Var, ze2<Executor> ze2Var2) {
        return new ba1(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new aa1(this.f2809a.get(), this.f2810b.get());
    }
}

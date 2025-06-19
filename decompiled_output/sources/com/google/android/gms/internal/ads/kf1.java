package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class kf1<T> implements pe2<ef1<T>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Executor> f4086a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Set<ff1<? extends cf1<T>>>> f4087b;

    private kf1(ze2<Executor> ze2Var, ze2<Set<ff1<? extends cf1<T>>>> ze2Var2) {
        this.f4086a = ze2Var;
        this.f4087b = ze2Var2;
    }

    public static <T> ef1<T> a(Executor executor, Set<ff1<? extends cf1<T>>> set) {
        return new ef1<>(executor, set);
    }

    public static <T> kf1<T> b(ze2<Executor> ze2Var, ze2<Set<ff1<? extends cf1<T>>>> ze2Var2) {
        return new kf1<>(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return a(this.f4086a.get(), this.f4087b.get());
    }
}

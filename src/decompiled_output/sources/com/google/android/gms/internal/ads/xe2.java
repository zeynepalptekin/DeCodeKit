package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class xe2<T> {

    /* renamed from: a, reason: collision with root package name */
    private final List<ze2<T>> f5970a;

    /* renamed from: b, reason: collision with root package name */
    private final List<ze2<Collection<T>>> f5971b;

    private xe2(int r1, int r2) {
        this.f5970a = ke2.a(r1);
        this.f5971b = ke2.a(r2);
    }

    public final xe2<T> a(ze2<? extends T> ze2Var) {
        this.f5970a.add(ze2Var);
        return this;
    }

    public final xe2<T> b(ze2<? extends Collection<? extends T>> ze2Var) {
        this.f5971b.add(ze2Var);
        return this;
    }

    public final ve2<T> c() {
        return new ve2<>(this.f5970a, this.f5971b);
    }
}

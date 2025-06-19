package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class ek1 implements ru1<dy0, gk1> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ck1 f3286a;

    ek1(ck1 ck1Var) {
        this.f3286a = ck1Var;
    }

    @Override // com.google.android.gms.internal.ads.ru1
    @NullableDecl
    public final /* synthetic */ gk1 a(@NullableDecl dy0 dy0Var) {
        tr.c("", dy0Var);
        oo.m("Failed to get a cache key, reverting to legacy flow.");
        ck1 ck1Var = this.f3286a;
        ck1Var.e = new gk1(null, ck1Var.d(), null);
        return this.f3286a.e;
    }
}

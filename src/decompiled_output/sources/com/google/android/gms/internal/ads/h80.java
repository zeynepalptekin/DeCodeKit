package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class h80 implements rx1<wi> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ c80 f3638a;

    h80(c80 c80Var) {
        this.f3638a = c80Var;
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void a(Throwable th) {
        this.f3638a.g.q(false);
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final /* synthetic */ void b(@NullableDecl wi wiVar) {
        this.f3638a.g.q(true);
    }
}

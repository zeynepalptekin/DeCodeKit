package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class wj1 implements rx1<Void> {
    wj1(rj1 rj1Var) {
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void a(Throwable th) {
        oo.m("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final /* synthetic */ void b(@NullableDecl Void r1) {
        oo.m("Notification of cache hit successful.");
    }
}

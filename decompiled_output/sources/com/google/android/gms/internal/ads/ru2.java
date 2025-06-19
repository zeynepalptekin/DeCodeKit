package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.d;

/* loaded from: classes.dex */
final class ru2 implements d.b {
    private final /* synthetic */ ks d;
    private final /* synthetic */ lu2 e;

    ru2(lu2 lu2Var, ks ksVar) {
        this.e = lu2Var;
        this.d = ksVar;
    }

    @Override // com.google.android.gms.common.internal.d.b
    public final void b(@androidx.annotation.h0 c.a.b.b.d.c cVar) {
        synchronized (this.e.d) {
            this.d.b(new RuntimeException("Connection failed."));
        }
    }
}

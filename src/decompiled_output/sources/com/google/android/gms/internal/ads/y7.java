package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.d;

/* loaded from: classes.dex */
final class y7 implements d.a {
    private final /* synthetic */ ks d;
    private final /* synthetic */ u7 e;

    y7(u7 u7Var, ks ksVar) {
        this.e = u7Var;
        this.d = ksVar;
    }

    @Override // com.google.android.gms.common.internal.d.a
    public final void a(int r5) {
        ks ksVar = this.d;
        StringBuilder sb = new StringBuilder(34);
        sb.append("onConnectionSuspended: ");
        sb.append(r5);
        ksVar.b(new RuntimeException(sb.toString()));
    }

    @Override // com.google.android.gms.common.internal.d.a
    public final void c(@androidx.annotation.i0 Bundle bundle) {
        try {
            this.d.a(this.e.f5484a.m0());
        } catch (DeadObjectException e) {
            this.d.b(e);
        }
    }
}

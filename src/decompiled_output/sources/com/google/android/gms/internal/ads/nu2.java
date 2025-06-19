package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.d;
import java.io.IOException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
final class nu2 implements d.a {
    private final /* synthetic */ fu2 d;
    private final /* synthetic */ ks e;
    final /* synthetic */ lu2 f;

    nu2(lu2 lu2Var, fu2 fu2Var, ks ksVar) {
        this.f = lu2Var;
        this.d = fu2Var;
        this.e = ksVar;
    }

    @Override // com.google.android.gms.common.internal.d.a
    public final void a(int r1) {
    }

    @Override // com.google.android.gms.common.internal.d.a
    public final void c(@androidx.annotation.i0 Bundle bundle) {
        synchronized (this.f.d) {
            if (this.f.f4308b) {
                return;
            }
            lu2.c(this.f, true);
            final cu2 cu2Var = this.f.f4307a;
            if (cu2Var == null) {
                return;
            }
            cy1 cy1Var = cs.f3023a;
            final fu2 fu2Var = this.d;
            final ks ksVar = this.e;
            final dy1<?> dy1VarSubmit = cy1Var.submit(new Runnable(this, cu2Var, fu2Var, ksVar) { // from class: com.google.android.gms.internal.ads.mu2
                private final nu2 d;
                private final cu2 e;
                private final fu2 f;
                private final ks g;

                {
                    this.d = this;
                    this.e = cu2Var;
                    this.f = fu2Var;
                    this.g = ksVar;
                }

                @Override // java.lang.Runnable
                public final void run() throws IOException {
                    nu2 nu2Var = this.d;
                    cu2 cu2Var2 = this.e;
                    fu2 fu2Var2 = this.f;
                    ks ksVar2 = this.g;
                    try {
                        zt2 zt2VarA5 = cu2Var2.m0().A5(fu2Var2);
                        if (!zt2VarA5.h()) {
                            ksVar2.b(new RuntimeException("No entry contents."));
                            nu2Var.f.a();
                            return;
                        }
                        ou2 ou2Var = new ou2(nu2Var, zt2VarA5.i(), 1);
                        int r1 = ou2Var.read();
                        if (r1 == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        ou2Var.unread(r1);
                        ksVar2.a(ou2Var);
                    } catch (RemoteException | IOException e) {
                        tr.c("Unable to obtain a cache service instance.", e);
                        ksVar2.b(e);
                        nu2Var.f.a();
                    }
                }
            });
            ks ksVar2 = this.e;
            final ks ksVar3 = this.e;
            ksVar2.e(new Runnable(ksVar3, dy1VarSubmit) { // from class: com.google.android.gms.internal.ads.pu2
                private final ks d;
                private final Future e;

                {
                    this.d = ksVar3;
                    this.e = dy1VarSubmit;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ks ksVar4 = this.d;
                    Future future = this.e;
                    if (ksVar4.isCancelled()) {
                        future.cancel(true);
                    }
                }
            }, cs.f);
        }
    }
}

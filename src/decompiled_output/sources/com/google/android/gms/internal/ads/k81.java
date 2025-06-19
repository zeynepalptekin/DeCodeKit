package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.ia0;
import com.google.android.gms.internal.ads.qf0;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class k81 implements g81<e70> {

    /* renamed from: a, reason: collision with root package name */
    @GuardedBy("this")
    private final cn1 f4067a;

    /* renamed from: b, reason: collision with root package name */
    private final gz f4068b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f4069c;
    private final e81 d;

    @androidx.annotation.i0
    @GuardedBy("this")
    private l70 e;

    public k81(gz gzVar, Context context, e81 e81Var, cn1 cn1Var) {
        this.f4068b = gzVar;
        this.f4069c = context;
        this.d = e81Var;
        this.f4067a = cn1Var;
    }

    @Override // com.google.android.gms.internal.ads.g81
    public final boolean Y() {
        l70 l70Var = this.e;
        return l70Var != null && l70Var.a();
    }

    @Override // com.google.android.gms.internal.ads.g81
    public final boolean Z(jw2 jw2Var, String str, f81 f81Var, i81<? super e70> i81Var) throws RemoteException {
        Executor executorE;
        Runnable runnable;
        com.google.android.gms.ads.internal.p.c();
        if (to.L(this.f4069c) && jw2Var.v == null) {
            tr.g("Failed to load the ad because app ID is missing.");
            executorE = this.f4068b.e();
            runnable = new Runnable(this) { // from class: com.google.android.gms.internal.ads.j81
                private final k81 d;

                {
                    this.d = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.d.c();
                }
            };
        } else {
            if (str != null) {
                nn1.b(this.f4069c, jw2Var.i);
                an1 an1VarE = this.f4067a.B(jw2Var).w(f81Var instanceof h81 ? ((h81) f81Var).f3639a : 1).e();
                ek0 ek0VarZ = (((Boolean) qx2.e().c(e0.q5)).booleanValue() ? this.f4068b.q().A(new ia0.a().g(this.f4069c).c(an1VarE).d()).y(new qf0.a().o()) : this.f4068b.q().A(new ia0.a().g(this.f4069c).c(an1VarE).d()).y(new qf0.a().h(this.d.d(), this.f4068b.e()).e(this.d.e(), this.f4068b.e()).g(this.d.f(), this.f4068b.e()).l(this.d.g(), this.f4068b.e()).d(this.d.c(), this.f4068b.e()).m(an1VarE.m, this.f4068b.e()).o())).k(this.d.a()).z();
                this.f4068b.w().c(1);
                l70 l70Var = new l70(this.f4068b.g(), this.f4068b.f(), ek0VarZ.c().g());
                this.e = l70Var;
                l70Var.e(new l81(this, i81Var, ek0VarZ));
                return true;
            }
            tr.g("Ad unit ID should not be null for NativeAdLoader.");
            executorE = this.f4068b.e();
            runnable = new Runnable(this) { // from class: com.google.android.gms.internal.ads.m81
                private final k81 d;

                {
                    this.d = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.d.b();
                }
            };
        }
        executorE.execute(runnable);
        return false;
    }

    final /* synthetic */ void b() {
        this.d.e().i(vn1.b(xn1.INVALID_AD_UNIT_ID, null, null));
    }

    final /* synthetic */ void c() {
        this.d.e().i(vn1.b(xn1.APP_ID_MISSING, null, null));
    }
}

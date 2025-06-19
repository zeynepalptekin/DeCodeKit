package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ga0;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class zj1<RequestComponentT extends ga0<AdT>, AdT> implements ik1<RequestComponentT, AdT> {

    /* renamed from: a, reason: collision with root package name */
    private final ik1<RequestComponentT, AdT> f6273a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.i0
    @GuardedBy("this")
    private RequestComponentT f6274b;

    public zj1(ik1<RequestComponentT, AdT> ik1Var) {
        this.f6273a = ik1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.ik1
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized RequestComponentT a() {
        return this.f6274b;
    }

    @Override // com.google.android.gms.internal.ads.ik1
    public final synchronized dy1<AdT> b(jk1 jk1Var, kk1<RequestComponentT> kk1Var) {
        if (jk1Var.f3983a == null) {
            dy1<AdT> dy1VarB = this.f6273a.b(jk1Var, kk1Var);
            this.f6274b = this.f6273a.a();
            return dy1VarB;
        }
        RequestComponentT requestcomponenttD = kk1Var.a(jk1Var.f3984b).d();
        this.f6274b = requestcomponenttD;
        return requestcomponenttD.b().i(jk1Var.f3983a);
    }
}

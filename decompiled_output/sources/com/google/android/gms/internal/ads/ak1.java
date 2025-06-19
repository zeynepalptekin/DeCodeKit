package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ga0;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class ak1<RequestComponentT extends ga0<AdT>, AdT> implements ik1<RequestComponentT, AdT> {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.i0
    @GuardedBy("this")
    private RequestComponentT f2701a;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.ik1
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized RequestComponentT a() {
        return this.f2701a;
    }

    @Override // com.google.android.gms.internal.ads.ik1
    public final synchronized dy1<AdT> b(jk1 jk1Var, kk1<RequestComponentT> kk1Var) {
        RequestComponentT requestcomponenttD;
        requestcomponenttD = kk1Var.a(jk1Var.f3984b).d();
        this.f2701a = requestcomponenttD;
        return requestcomponenttD.b().g();
    }
}

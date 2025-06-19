package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* loaded from: classes.dex */
final class ax0 implements rx1<wm1> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ vw0 f2761a;

    ax0(vw0 vw0Var) {
        this.f2761a = vw0Var;
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void a(Throwable th) {
        if (((Boolean) qx2.e().c(e0.s4)).booleanValue()) {
            Matcher matcher = vw0.g.matcher(th.getMessage());
            if (matcher.matches()) {
                this.f2761a.f.e(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final /* synthetic */ void b(wm1 wm1Var) {
        wm1 wm1Var2 = wm1Var;
        if (((Boolean) qx2.e().c(e0.s4)).booleanValue()) {
            this.f2761a.f.e(wm1Var2.f5858b.f5551b.e);
            this.f2761a.f.f(wm1Var2.f5858b.f5551b.f);
        }
    }
}

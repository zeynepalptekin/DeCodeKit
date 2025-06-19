package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* loaded from: classes.dex */
final class dx0 implements rx1<wm1> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ cx0 f3185a;

    dx0(cx0 cx0Var) {
        this.f3185a = cx0Var;
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void a(Throwable th) {
        if (((Boolean) qx2.e().c(e0.s4)).booleanValue()) {
            Matcher matcher = cx0.f.matcher(th.getMessage());
            if (matcher.matches()) {
                this.f3185a.e.e(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final /* synthetic */ void b(wm1 wm1Var) {
        wm1 wm1Var2 = wm1Var;
        if (((Boolean) qx2.e().c(e0.s4)).booleanValue()) {
            this.f3185a.e.e(wm1Var2.f5858b.f5551b.e);
            this.f3185a.e.f(wm1Var2.f5858b.f5551b.f);
        }
    }
}

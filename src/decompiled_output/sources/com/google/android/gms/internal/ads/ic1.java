package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class ic1 implements ff1<nc1> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3807a;

    /* renamed from: b, reason: collision with root package name */
    private final cy1 f3808b;

    ic1(Context context, cy1 cy1Var) {
        this.f3807a = context;
        this.f3808b = cy1Var;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<nc1> a() {
        return this.f3808b.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.lc1

            /* renamed from: a, reason: collision with root package name */
            private final ic1 f4241a;

            {
                this.f4241a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f4241a.b();
            }
        });
    }

    final /* synthetic */ nc1 b() throws Exception {
        com.google.android.gms.ads.internal.p.c();
        String strH = to.H(this.f3807a);
        String string = ((Boolean) qx2.e().c(e0.n4)).booleanValue() ? this.f3807a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        com.google.android.gms.ads.internal.p.c();
        return new nc1(strH, string, to.I(this.f3807a));
    }
}

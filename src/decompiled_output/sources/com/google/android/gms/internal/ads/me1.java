package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class me1 implements ff1<ne1> {

    /* renamed from: a, reason: collision with root package name */
    private final lm f4395a;

    /* renamed from: b, reason: collision with root package name */
    private final cy1 f4396b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f4397c;

    public me1(lm lmVar, cy1 cy1Var, Context context) {
        this.f4395a = lmVar;
        this.f4396b = cy1Var;
        this.f4397c = context;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<ne1> a() {
        return this.f4396b.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.pe1

            /* renamed from: a, reason: collision with root package name */
            private final me1 f4809a;

            {
                this.f4809a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f4809a.b();
            }
        });
    }

    final /* synthetic */ ne1 b() throws Exception {
        if (!this.f4395a.k(this.f4397c)) {
            return new ne1(null, null, null, null, null);
        }
        String strN = this.f4395a.n(this.f4397c);
        String str = strN == null ? "" : strN;
        String strO = this.f4395a.o(this.f4397c);
        String str2 = strO == null ? "" : strO;
        String strP = this.f4395a.p(this.f4397c);
        String str3 = strP == null ? "" : strP;
        String strQ = this.f4395a.q(this.f4397c);
        return new ne1(str, str2, str3, strQ == null ? "" : strQ, "TIME_OUT".equals(str2) ? (Long) qx2.e().c(e0.Y) : null);
    }
}

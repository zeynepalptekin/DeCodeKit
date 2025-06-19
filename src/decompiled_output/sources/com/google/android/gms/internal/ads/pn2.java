package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

/* loaded from: classes.dex */
public final class pn2 implements tn2, xn2 {
    private final Uri d;
    private final hp2 e;
    private final sk2 f;
    private final int g;
    private final Handler h;
    private final sn2 i;
    private final int l;
    private xn2 m;
    private ni2 n;
    private boolean o;
    private final String k = null;
    private final qi2 j = new qi2();

    public pn2(Uri uri, hp2 hp2Var, sk2 sk2Var, int r4, Handler handler, sn2 sn2Var, String str, int r8) {
        this.d = uri;
        this.e = hp2Var;
        this.f = sk2Var;
        this.g = r4;
        this.h = handler;
        this.i = sn2Var;
        this.l = r8;
    }

    @Override // com.google.android.gms.internal.ads.tn2
    public final void a(rh2 rh2Var, boolean z, xn2 xn2Var) {
        this.m = xn2Var;
        io2 io2Var = new io2(-9223372036854775807L, false);
        this.n = io2Var;
        xn2Var.d(io2Var, null);
    }

    @Override // com.google.android.gms.internal.ads.tn2
    public final void b() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.tn2
    public final void c(rn2 rn2Var) {
        ((hn2) rn2Var).r();
    }

    @Override // com.google.android.gms.internal.ads.xn2
    public final void d(ni2 ni2Var, Object obj) {
        boolean z = ni2Var.c(0, this.j, false).d != -9223372036854775807L;
        if (!this.o || z) {
            this.n = ni2Var;
            this.o = z;
            this.m.d(ni2Var, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.tn2
    public final rn2 e(int r12, gp2 gp2Var) {
        vp2.a(r12 == 0);
        return new hn2(this.d, this.e.a(), this.f.a(), this.g, this.h, this.i, this, gp2Var, null, this.l);
    }

    @Override // com.google.android.gms.internal.ads.tn2
    public final void f() {
        this.m = null;
    }
}

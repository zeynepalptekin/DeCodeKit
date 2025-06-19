package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class xu implements uh2, sn2, xp2<ip2>, br2 {

    @com.google.android.gms.common.util.d0
    private static int p;

    @com.google.android.gms.common.util.d0
    private static int q;
    private final Context d;
    private final mi2 f;
    private final au i;
    private rh2 j;
    private ByteBuffer k;
    private boolean l;
    private ev m;
    private int n;
    private Set<WeakReference<qu>> o = new HashSet();
    private final uu e = new uu();
    private final mi2 g = new sj2(pm2.f4840a);
    private final wo2 h = new qo2();

    public xu(Context context, au auVar) {
        this.d = context;
        this.i = auVar;
        this.f = new uq2(this.d, pm2.f4840a, 0L, to.h, this, -1);
        if (oo.n()) {
            String strValueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 28);
            sb.append("ExoPlayerAdapter initialize ");
            sb.append(strValueOf);
            oo.m(sb.toString());
        }
        p++;
        rh2 rh2VarA = vh2.a(new mi2[]{this.g, this.f}, this.h, this.e);
        this.j = rh2VarA;
        rh2VarA.V0(this);
    }

    @com.google.android.gms.common.util.d0
    private final tn2 E(Uri uri, final String str) {
        final hp2 hp2Var;
        if (!this.l || this.k.limit() <= 0) {
            hp2Var = this.i.i > 0 ? new hp2(this, str) { // from class: com.google.android.gms.internal.ads.zu

                /* renamed from: a, reason: collision with root package name */
                private final xu f6313a;

                /* renamed from: b, reason: collision with root package name */
                private final String f6314b;

                {
                    this.f6313a = this;
                    this.f6314b = str;
                }

                @Override // com.google.android.gms.internal.ads.hp2
                public final ip2 a() {
                    return this.f6313a.J(this.f6314b);
                }
            } : new hp2(this, str) { // from class: com.google.android.gms.internal.ads.yu

                /* renamed from: a, reason: collision with root package name */
                private final xu f6177a;

                /* renamed from: b, reason: collision with root package name */
                private final String f6178b;

                {
                    this.f6177a = this;
                    this.f6178b = str;
                }

                @Override // com.google.android.gms.internal.ads.hp2
                public final ip2 a() {
                    return this.f6177a.I(this.f6178b);
                }
            };
            if (this.i.j) {
                hp2Var = new hp2(this, hp2Var) { // from class: com.google.android.gms.internal.ads.bv

                    /* renamed from: a, reason: collision with root package name */
                    private final xu f2879a;

                    /* renamed from: b, reason: collision with root package name */
                    private final hp2 f2880b;

                    {
                        this.f2879a = this;
                        this.f2880b = hp2Var;
                    }

                    @Override // com.google.android.gms.internal.ads.hp2
                    public final ip2 a() {
                        return this.f2879a.n(this.f2880b);
                    }
                };
            }
            if (this.k.limit() > 0) {
                final byte[] bArr = new byte[this.k.limit()];
                this.k.get(bArr);
                hp2Var = new hp2(hp2Var, bArr) { // from class: com.google.android.gms.internal.ads.av

                    /* renamed from: a, reason: collision with root package name */
                    private final hp2 f2754a;

                    /* renamed from: b, reason: collision with root package name */
                    private final byte[] f2755b;

                    {
                        this.f2754a = hp2Var;
                        this.f2755b = bArr;
                    }

                    @Override // com.google.android.gms.internal.ads.hp2
                    public final ip2 a() {
                        hp2 hp2Var2 = this.f2754a;
                        byte[] bArr2 = this.f2755b;
                        return new iv(new fp2(bArr2), bArr2.length, hp2Var2.a());
                    }
                };
            }
        } else {
            final byte[] bArr2 = new byte[this.k.limit()];
            this.k.get(bArr2);
            hp2Var = new hp2(bArr2) { // from class: com.google.android.gms.internal.ads.wu

                /* renamed from: a, reason: collision with root package name */
                private final byte[] f5894a;

                {
                    this.f5894a = bArr2;
                }

                @Override // com.google.android.gms.internal.ads.hp2
                public final ip2 a() {
                    return new fp2(this.f5894a);
                }
            };
        }
        hp2 hp2Var2 = hp2Var;
        sk2 sk2Var = ((Boolean) qx2.e().c(e0.n)).booleanValue() ? dv.f3177a : cv.f3036a;
        au auVar = this.i;
        return new pn2(uri, hp2Var2, sk2Var, auVar.k, to.h, this, null, auVar.g);
    }

    public static int t() {
        return p;
    }

    public static int u() {
        return q;
    }

    @Override // com.google.android.gms.internal.ads.br2
    public final void A(int r1, int r2, int r3, float f) {
        ev evVar = this.m;
        if (evVar != null) {
            evVar.c(r1, r2);
        }
    }

    @Override // com.google.android.gms.internal.ads.br2
    public final void B(ck2 ck2Var) {
    }

    @Override // com.google.android.gms.internal.ads.br2
    public final void C(ck2 ck2Var) {
    }

    final void D(boolean z) {
        if (this.j == null) {
            return;
        }
        for (int r0 = 0; r0 < this.j.S0(); r0++) {
            this.h.f(r0, !z);
        }
    }

    final void F(float f, boolean z) {
        if (this.j == null) {
            return;
        }
        wh2 wh2Var = new wh2(this.g, 2, Float.valueOf(f));
        if (z) {
            this.j.N0(wh2Var);
        } else {
            this.j.R0(wh2Var);
        }
    }

    final /* synthetic */ void G(boolean z, long j) {
        ev evVar = this.m;
        if (evVar != null) {
            evVar.b(z, j);
        }
    }

    public final void H(int r3) throws SocketException {
        Iterator<WeakReference<qu>> it = this.o.iterator();
        while (it.hasNext()) {
            qu quVar = it.next().get();
            if (quVar != null) {
                quVar.b(r3);
            }
        }
    }

    final /* synthetic */ ip2 I(String str) {
        xu xuVar = this.i.j ? null : this;
        au auVar = this.i;
        return new lp2(str, null, xuVar, auVar.d, auVar.f, true, null);
    }

    final /* synthetic */ ip2 J(String str) {
        xu xuVar = this.i.j ? null : this;
        au auVar = this.i;
        qu quVar = new qu(str, xuVar, auVar.d, auVar.f, auVar.i);
        this.o.add(new WeakReference<>(quVar));
        return quVar;
    }

    @Override // com.google.android.gms.internal.ads.sn2
    public final void a(IOException iOException) {
        ev evVar = this.m;
        if (evVar != null) {
            evVar.e("onLoadError", iOException);
        }
    }

    @Override // com.google.android.gms.internal.ads.uh2
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.uh2
    public final void c(ji2 ji2Var) {
    }

    @Override // com.google.android.gms.internal.ads.xp2
    public final /* bridge */ /* synthetic */ void d(ip2 ip2Var) {
    }

    @Override // com.google.android.gms.internal.ads.uh2
    public final void e(sh2 sh2Var) {
        ev evVar = this.m;
        if (evVar != null) {
            evVar.e("onPlayerError", sh2Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.xp2
    public final /* synthetic */ void f(ip2 ip2Var, int r2) {
        this.n += r2;
    }

    public final void finalize() throws Throwable {
        p--;
        if (oo.n()) {
            String strValueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 26);
            sb.append("ExoPlayerAdapter finalize ");
            sb.append(strValueOf);
            oo.m(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.uh2
    public final void g(ko2 ko2Var, zo2 zo2Var) {
    }

    @Override // com.google.android.gms.internal.ads.uh2
    public final void h(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.uh2
    public final void i(ni2 ni2Var, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.uh2
    public final void j(boolean z, int r2) {
        ev evVar = this.m;
        if (evVar != null) {
            evVar.g(r2);
        }
    }

    @Override // com.google.android.gms.internal.ads.xp2
    public final /* synthetic */ void k(ip2 ip2Var, jp2 jp2Var) {
        this.n = 0;
    }

    public final long l() {
        return this.n;
    }

    public final void m() {
        rh2 rh2Var = this.j;
        if (rh2Var != null) {
            rh2Var.Q0(this);
            this.j.a();
            this.j = null;
            q--;
        }
    }

    final /* synthetic */ ip2 n(hp2 hp2Var) {
        return new su(this.d, hp2Var.a(), this, new vu(this) { // from class: com.google.android.gms.internal.ads.fv

            /* renamed from: a, reason: collision with root package name */
            private final xu f3460a;

            {
                this.f3460a = this;
            }

            @Override // com.google.android.gms.internal.ads.vu
            public final void b(boolean z, long j) {
                this.f3460a.G(z, j);
            }
        });
    }

    final void o(Surface surface, boolean z) {
        if (this.j == null) {
            return;
        }
        wh2 wh2Var = new wh2(this.f, 1, surface);
        if (z) {
            this.j.N0(wh2Var);
        } else {
            this.j.R0(wh2Var);
        }
    }

    public final void p(ev evVar) {
        this.m = evVar;
    }

    public final void q(Uri[] uriArr, String str) {
        r(uriArr, str, ByteBuffer.allocate(0), false);
    }

    public final void r(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        tn2 zn2Var;
        if (this.j == null) {
            return;
        }
        this.k = byteBuffer;
        this.l = z;
        if (uriArr.length == 1) {
            zn2Var = E(uriArr[0], str);
        } else {
            tn2[] tn2VarArr = new tn2[uriArr.length];
            for (int r6 = 0; r6 < uriArr.length; r6++) {
                tn2VarArr[r6] = E(uriArr[r6], str);
            }
            zn2Var = new zn2(tn2VarArr);
        }
        this.j.T0(zn2Var);
        q++;
    }

    public final rh2 s() {
        return this.j;
    }

    public final uu v() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.br2
    public final void w(int r1, long j) {
    }

    @Override // com.google.android.gms.internal.ads.br2
    public final void x(di2 di2Var) {
    }

    @Override // com.google.android.gms.internal.ads.br2
    public final void y(String str, long j, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.br2
    public final void z(Surface surface) {
    }
}

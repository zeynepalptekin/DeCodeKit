package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.Arrays;

@TargetApi(16)
/* loaded from: classes.dex */
public final class hu extends kt implements TextureView.SurfaceTextureListener, ev {
    private final zt f;
    private final cu g;
    private final boolean h;
    private final au i;
    private ht j;
    private Surface k;
    private xu l;
    private String m;
    private String[] n;
    private boolean o;
    private int p;
    private xt q;
    private final boolean r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private int w;
    private int x;
    private float y;

    public hu(Context context, cu cuVar, zt ztVar, boolean z, boolean z2, au auVar) {
        super(context);
        this.p = 1;
        this.h = z2;
        this.f = ztVar;
        this.g = cuVar;
        this.r = z;
        this.i = auVar;
        setSurfaceTextureListener(this);
        this.g.d(this);
    }

    private final void A() {
        M(this.u, this.v);
    }

    private final void B() {
        xu xuVar = this.l;
        if (xuVar != null) {
            xuVar.D(true);
        }
    }

    private final void C() {
        xu xuVar = this.l;
        if (xuVar != null) {
            xuVar.D(false);
        }
    }

    private final void M(int r1, int r2) {
        float f = r2 > 0 ? r1 / r2 : 1.0f;
        if (this.y != f) {
            this.y = f;
            requestLayout();
        }
    }

    private final void s(float f, boolean z) {
        xu xuVar = this.l;
        if (xuVar != null) {
            xuVar.F(f, z);
        } else {
            tr.i("Trying to set volume before player is initalized.");
        }
    }

    private final void t(Surface surface, boolean z) {
        xu xuVar = this.l;
        if (xuVar != null) {
            xuVar.o(surface, z);
        } else {
            tr.i("Trying to set surface before player is initalized.");
        }
    }

    private final xu u() {
        return new xu(this.f.getContext(), this.i);
    }

    private final String v() {
        return com.google.android.gms.ads.internal.p.c().m0(this.f.getContext(), this.f.b().d);
    }

    private final boolean w() {
        xu xuVar = this.l;
        return (xuVar == null || xuVar.s() == null || this.o) ? false : true;
    }

    private final boolean x() {
        return w() && this.p != 1;
    }

    private final void y() {
        String str;
        String str2;
        if (this.l != null || (str = this.m) == null || this.k == null) {
            return;
        }
        if (str.startsWith("cache:")) {
            sv svVarT0 = this.f.t0(this.m);
            if (svVarT0 instanceof dw) {
                xu xuVarZ = ((dw) svVarT0).z();
                this.l = xuVarZ;
                if (xuVarZ.s() == null) {
                    str2 = "Precached video player has been released.";
                    tr.i(str2);
                    return;
                }
            } else {
                if (!(svVarT0 instanceof ew)) {
                    String strValueOf = String.valueOf(this.m);
                    tr.i(strValueOf.length() != 0 ? "Stream cache miss: ".concat(strValueOf) : new String("Stream cache miss: "));
                    return;
                }
                ew ewVar = (ew) svVarT0;
                String strV = v();
                ByteBuffer byteBufferZ = ewVar.z();
                boolean zB = ewVar.B();
                String strA = ewVar.A();
                if (strA == null) {
                    str2 = "Stream cache URL is null.";
                    tr.i(str2);
                    return;
                } else {
                    xu xuVarU = u();
                    this.l = xuVarU;
                    xuVarU.r(new Uri[]{Uri.parse(strA)}, strV, byteBufferZ, zB);
                }
            }
        } else {
            this.l = u();
            String strV2 = v();
            Uri[] uriArr = new Uri[this.n.length];
            int r3 = 0;
            while (true) {
                String[] strArr = this.n;
                if (r3 >= strArr.length) {
                    break;
                }
                uriArr[r3] = Uri.parse(strArr[r3]);
                r3++;
            }
            this.l.q(uriArr, strV2);
        }
        this.l.p(this);
        t(this.k, false);
        if (this.l.s() != null) {
            int r0 = this.l.s().M0();
            this.p = r0;
            if (r0 == 3) {
                z();
            }
        }
    }

    private final void z() {
        if (this.s) {
            return;
        }
        this.s = true;
        to.h.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.gu
            private final hu d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.I();
            }
        });
        a();
        this.g.f();
        if (this.t) {
            f();
        }
    }

    final /* synthetic */ void D() {
        ht htVar = this.j;
        if (htVar != null) {
            htVar.i();
        }
    }

    final /* synthetic */ void E() {
        ht htVar = this.j;
        if (htVar != null) {
            htVar.h();
        }
    }

    final /* synthetic */ void F() {
        ht htVar = this.j;
        if (htVar != null) {
            htVar.f();
        }
    }

    final /* synthetic */ void G() {
        ht htVar = this.j;
        if (htVar != null) {
            htVar.e();
        }
    }

    final /* synthetic */ void H() {
        ht htVar = this.j;
        if (htVar != null) {
            htVar.b();
        }
    }

    final /* synthetic */ void I() {
        ht htVar = this.j;
        if (htVar != null) {
            htVar.a();
        }
    }

    final /* synthetic */ void J(boolean z, long j) {
        this.f.A0(z, j);
    }

    final /* synthetic */ void K(int r2) {
        ht htVar = this.j;
        if (htVar != null) {
            htVar.onWindowVisibilityChanged(r2);
        }
    }

    final /* synthetic */ void L(String str) {
        ht htVar = this.j;
        if (htVar != null) {
            htVar.d("ExoPlayerAdapter error", str);
        }
    }

    final /* synthetic */ void N(int r2, int r3) {
        ht htVar = this.j;
        if (htVar != null) {
            htVar.c(r2, r3);
        }
    }

    @Override // com.google.android.gms.internal.ads.kt, com.google.android.gms.internal.ads.du
    public final void a() {
        s(this.e.a(), false);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final void b(final boolean z, final long j) {
        if (this.f != null) {
            cs.e.execute(new Runnable(this, z, j) { // from class: com.google.android.gms.internal.ads.ru
                private final hu d;
                private final boolean e;
                private final long f;

                {
                    this.d = this;
                    this.e = z;
                    this.f = j;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.d.J(this.e, this.f);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final void c(int r1, int r2) {
        this.u = r1;
        this.v = r2;
        A();
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void d() {
        if (x()) {
            if (this.i.f2748a) {
                C();
            }
            this.l.s().U0(false);
            this.g.c();
            this.e.e();
            to.h.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.ku
                private final hu d;

                {
                    this.d = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.d.F();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final void e(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        final String string = sb.toString();
        String strValueOf = String.valueOf(string);
        tr.i(strValueOf.length() != 0 ? "ExoPlayerAdapter error: ".concat(strValueOf) : new String("ExoPlayerAdapter error: "));
        this.o = true;
        if (this.i.f2748a) {
            C();
        }
        to.h.post(new Runnable(this, string) { // from class: com.google.android.gms.internal.ads.iu
            private final hu d;
            private final String e;

            {
                this.d = this;
                this.e = string;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.L(this.e);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void f() {
        if (!x()) {
            this.t = true;
            return;
        }
        if (this.i.f2748a) {
            B();
        }
        this.l.s().U0(true);
        this.g.b();
        this.e.d();
        this.d.b();
        to.h.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.lu
            private final hu d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.G();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final void g(int r2) {
        if (this.p != r2) {
            this.p = r2;
            if (r2 == 3) {
                z();
                return;
            }
            if (r2 != 4) {
                return;
            }
            if (this.i.f2748a) {
                C();
            }
            this.g.c();
            this.e.e();
            to.h.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.ju
                private final hu d;

                {
                    this.d = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.d.H();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final int getCurrentPosition() {
        if (x()) {
            return (int) this.l.s().W0();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final int getDuration() {
        if (x()) {
            return (int) this.l.s().M();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final int getVideoHeight() {
        return this.v;
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final int getVideoWidth() {
        return this.u;
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void h(int r4) {
        if (x()) {
            this.l.s().X0(r4);
        }
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void i() {
        if (w()) {
            this.l.s().stop();
            if (this.l != null) {
                t(null, true);
                xu xuVar = this.l;
                if (xuVar != null) {
                    xuVar.p(null);
                    this.l.m();
                    this.l = null;
                }
                this.p = 1;
                this.o = false;
                this.s = false;
                this.t = false;
            }
        }
        this.g.c();
        this.e.e();
        this.g.a();
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void j(float f, float f2) {
        xt xtVar = this.q;
        if (xtVar != null) {
            xtVar.e(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void k(ht htVar) {
        this.j = htVar;
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void l(String str, String[] strArr) {
        if (str != null) {
            if (strArr == null) {
                setVideoPath(str);
            }
            this.m = str;
            this.n = (String[]) Arrays.copyOf(strArr, strArr.length);
            y();
        }
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void m(int r2) {
        xu xuVar = this.l;
        if (xuVar != null) {
            xuVar.v().j(r2);
        }
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void n(int r2) {
        xu xuVar = this.l;
        if (xuVar != null) {
            xuVar.v().k(r2);
        }
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void o(int r2) {
        xu xuVar = this.l;
        if (xuVar != null) {
            xuVar.v().h(r2);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int r11, int r12) {
        int r0;
        super.onMeasure(r11, r12);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.y;
        if (f != 0.0f && this.q == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            float f4 = this.y;
            if (f4 < f3) {
                measuredWidth = (int) (measuredHeight * f4);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        xt xtVar = this.q;
        if (xtVar != null) {
            xtVar.i(measuredWidth, measuredHeight);
        }
        if (Build.VERSION.SDK_INT == 16) {
            int r02 = this.w;
            if (((r02 > 0 && r02 != measuredWidth) || ((r0 = this.x) > 0 && r0 != measuredHeight)) && this.h && w()) {
                rh2 rh2VarS = this.l.s();
                if (rh2VarS.W0() > 0 && !rh2VarS.P0()) {
                    s(0.0f, true);
                    rh2VarS.U0(true);
                    long jW0 = rh2VarS.W0();
                    long jA = com.google.android.gms.ads.internal.p.j().a();
                    while (w() && rh2VarS.W0() == jW0 && com.google.android.gms.ads.internal.p.j().a() - jA <= 250) {
                    }
                    rh2VarS.U0(false);
                    a();
                }
            }
            this.w = measuredWidth;
            this.x = measuredHeight;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int r4, int r5) throws InterruptedException {
        if (this.r) {
            xt xtVar = new xt(getContext());
            this.q = xtVar;
            xtVar.b(surfaceTexture, r4, r5);
            this.q.start();
            SurfaceTexture surfaceTextureK = this.q.k();
            if (surfaceTextureK != null) {
                surfaceTexture = surfaceTextureK;
            } else {
                this.q.j();
                this.q = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.k = surface;
        if (this.l == null) {
            y();
        } else {
            t(surface, true);
            if (!this.i.f2748a) {
                B();
            }
        }
        if (this.u == 0 || this.v == 0) {
            M(r4, r5);
        } else {
            A();
        }
        to.h.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.nu
            private final hu d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.E();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        d();
        xt xtVar = this.q;
        if (xtVar != null) {
            xtVar.j();
            this.q = null;
        }
        if (this.l != null) {
            C();
            Surface surface = this.k;
            if (surface != null) {
                surface.release();
            }
            this.k = null;
            t(null, true);
        }
        to.h.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.pu
            private final hu d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.D();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int r3, final int r4) {
        xt xtVar = this.q;
        if (xtVar != null) {
            xtVar.i(r3, r4);
        }
        to.h.post(new Runnable(this, r3, r4) { // from class: com.google.android.gms.internal.ads.mu
            private final hu d;
            private final int e;
            private final int f;

            {
                this.d = this;
                this.e = r3;
                this.f = r4;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.N(this.e, this.f);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.g.e(this);
        this.d.a(surfaceTexture, this.j);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int r3) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(r3);
        oo.m(sb.toString());
        to.h.post(new Runnable(this, r3) { // from class: com.google.android.gms.internal.ads.ou
            private final hu d;
            private final int e;

            {
                this.d = this;
                this.e = r3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.K(this.e);
            }
        });
        super.onWindowVisibilityChanged(r3);
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void p(int r2) {
        xu xuVar = this.l;
        if (xuVar != null) {
            xuVar.v().i(r2);
        }
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void q(int r2) throws SocketException {
        xu xuVar = this.l;
        if (xuVar != null) {
            xuVar.H(r2);
        }
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final String r() {
        String str = this.r ? " spherical" : "";
        return str.length() != 0 ? "ExoPlayer/3".concat(str) : new String("ExoPlayer/3");
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void setVideoPath(String str) {
        if (str != null) {
            this.m = str;
            this.n = new String[]{str};
            y();
        }
    }
}

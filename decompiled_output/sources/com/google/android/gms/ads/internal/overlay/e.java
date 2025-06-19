package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.i0;
import b.i.p.f0;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.internal.ads.dp;
import com.google.android.gms.internal.ads.e0;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.qx2;
import com.google.android.gms.internal.ads.rw;
import com.google.android.gms.internal.ads.tg;
import com.google.android.gms.internal.ads.to;
import com.google.android.gms.internal.ads.tr;
import java.util.Collections;
import org.json.JSONException;

/* loaded from: classes.dex */
public class e extends tg implements w {

    @d0
    private static final int y = Color.argb(0, 0, 0, 0);
    protected final Activity e;

    @d0
    AdOverlayInfoParcel f;

    @d0
    rw g;

    @d0
    private k h;

    @d0
    private o i;

    @d0
    private FrameLayout k;

    @d0
    private WebChromeClient.CustomViewCallback l;

    @d0
    private h o;
    private Runnable s;
    private boolean t;
    private boolean u;

    @d0
    private boolean j = false;

    @d0
    private boolean m = false;

    @d0
    private boolean n = false;

    @d0
    private boolean p = false;

    @d0
    int q = 0;
    private final Object r = new Object();
    private boolean v = false;
    private boolean w = false;
    private boolean x = true;

    public e(Activity activity) {
        this.e = activity;
    }

    private final void B8(Configuration configuration) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.i iVar;
        com.google.android.gms.ads.internal.i iVar2;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (adOverlayInfoParcel2 == null || (iVar2 = adOverlayInfoParcel2.r) == null || !iVar2.e) ? false : true;
        boolean zH = com.google.android.gms.ads.internal.p.e().h(this.e, configuration);
        if ((this.n && !z3) || zH) {
            z = false;
        } else if (Build.VERSION.SDK_INT >= 19 && (adOverlayInfoParcel = this.f) != null && (iVar = adOverlayInfoParcel.r) != null && iVar.j) {
            z2 = true;
        }
        Window window = this.e.getWindow();
        if (((Boolean) qx2.e().c(e0.E0)).booleanValue() && Build.VERSION.SDK_INT >= 19) {
            View decorView = window.getDecorView();
            int r0 = 256;
            if (z) {
                r0 = 5380;
                if (z2) {
                    r0 = 5894;
                }
            }
            decorView.setSystemUiVisibility(r0);
            return;
        }
        if (!z) {
            window.addFlags(2048);
            window.clearFlags(1024);
            return;
        }
        window.addFlags(1024);
        window.clearFlags(2048);
        if (Build.VERSION.SDK_INT < 19 || !z2) {
            return;
        }
        window.getDecorView().setSystemUiVisibility(b.i.p.i.l);
    }

    private final void E8(boolean z) throws JSONException {
        int r0 = ((Integer) qx2.e().c(e0.d3)).intValue();
        r rVar = new r();
        rVar.e = 50;
        rVar.f2416a = z ? r0 : 0;
        rVar.f2417b = z ? 0 : r0;
        rVar.f2418c = 0;
        rVar.d = r0;
        this.i = new o(this.e, rVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        D8(z, this.f.j);
        this.o.addView(this.i, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void F8(boolean r23) throws com.google.android.gms.ads.internal.overlay.i, org.json.JSONException {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.e.F8(boolean):void");
    }

    private static void G8(@i0 c.a.b.b.e.c cVar, @i0 View view) {
        if (cVar == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.p.r().d(cVar, view);
    }

    private final void J8() {
        if (!this.e.isFinishing() || this.v) {
            return;
        }
        this.v = true;
        rw rwVar = this.g;
        if (rwVar != null) {
            rwVar.q0(this.q);
            synchronized (this.r) {
                if (!this.t && this.g.z0()) {
                    Runnable runnable = new Runnable(this) { // from class: com.google.android.gms.ads.internal.overlay.g
                        private final e d;

                        {
                            this.d = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.d.K8();
                        }
                    };
                    this.s = runnable;
                    to.h.postDelayed(runnable, ((Long) qx2.e().c(e0.B0)).longValue());
                    return;
                }
            }
        }
        K8();
    }

    private final void M8() {
        this.g.B0();
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void A6() {
        this.q = 0;
    }

    public final void A8(int r4) {
        if (this.e.getApplicationInfo().targetSdkVersion >= ((Integer) qx2.e().c(e0.g4)).intValue()) {
            if (this.e.getApplicationInfo().targetSdkVersion <= ((Integer) qx2.e().c(e0.h4)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) qx2.e().c(e0.i4)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) qx2.e().c(e0.j4)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.e.setRequestedOrientation(r4);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.p.g().h(th, "AdOverlay.setRequestedOrientation");
        }
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void C0() {
        if (((Boolean) qx2.e().c(e0.b3)).booleanValue()) {
            rw rwVar = this.g;
            if (rwVar == null || rwVar.g()) {
                tr.i("The webview does not exist. Ignoring action.");
            } else {
                com.google.android.gms.ads.internal.p.e();
                dp.l(this.g);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pg
    public void C1(Bundle bundle) throws i, JSONException {
        this.e.requestWindowFeature(1);
        this.m = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel adOverlayInfoParcelI = AdOverlayInfoParcel.i(this.e.getIntent());
            this.f = adOverlayInfoParcelI;
            if (adOverlayInfoParcelI == null) {
                throw new i("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelI.p.f > 7500000) {
                this.q = 3;
            }
            if (this.e.getIntent() != null) {
                this.x = this.e.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            if (this.f.r != null) {
                this.n = this.f.r.d;
            } else {
                this.n = false;
            }
            if (this.n && this.f.r.i != -1) {
                new j(this).c();
            }
            if (bundle == null) {
                if (this.f.f != null && this.x) {
                    this.f.f.q4();
                }
                if (this.f.n != 1 && this.f.e != null) {
                    this.f.e.p();
                }
            }
            h hVar = new h(this.e, this.f.q, this.f.p.d);
            this.o = hVar;
            hVar.setId(1000);
            com.google.android.gms.ads.internal.p.e().p(this.e);
            int r7 = this.f.n;
            if (r7 == 1) {
                F8(false);
                return;
            }
            if (r7 == 2) {
                this.h = new k(this.f.g);
                F8(false);
            } else {
                if (r7 != 3) {
                    throw new i("Could not determine ad overlay type.");
                }
                F8(true);
            }
        } catch (i e) {
            tr.i(e.getMessage());
            this.q = 3;
            this.e.finish();
        }
    }

    public final void C8(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.e);
        this.k = frameLayout;
        frameLayout.setBackgroundColor(f0.t);
        this.k.addView(view, -1, -1);
        this.e.setContentView(this.k);
        this.u = true;
        this.l = customViewCallback;
        this.j = true;
    }

    public final void D8(boolean z, boolean z2) throws JSONException {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.i iVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.i iVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) qx2.e().c(e0.C0)).booleanValue() && (adOverlayInfoParcel2 = this.f) != null && (iVar2 = adOverlayInfoParcel2.r) != null && iVar2.k;
        boolean z5 = ((Boolean) qx2.e().c(e0.D0)).booleanValue() && (adOverlayInfoParcel = this.f) != null && (iVar = adOverlayInfoParcel.r) != null && iVar.l;
        if (z && z2 && z4 && !z5) {
            new eg(this.g, "useCustomClose").e("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        o oVar = this.i;
        if (oVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            oVar.a(z3);
        }
    }

    public final void H8() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f;
        if (adOverlayInfoParcel != null && this.j) {
            A8(adOverlayInfoParcel.m);
        }
        if (this.k != null) {
            this.e.setContentView(this.o);
            this.u = true;
            this.k.removeAllViews();
            this.k = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.l;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.l = null;
        }
        this.j = false;
    }

    public final void I8() throws JSONException {
        this.o.removeView(this.i);
        E8(true);
    }

    @d0
    final void K8() {
        rw rwVar;
        p pVar;
        if (this.w) {
            return;
        }
        this.w = true;
        rw rwVar2 = this.g;
        if (rwVar2 != null) {
            this.o.removeView(rwVar2.getView());
            k kVar = this.h;
            if (kVar != null) {
                this.g.E(kVar.d);
                this.g.y0(false);
                ViewGroup viewGroup = this.h.f2415c;
                View view = this.g.getView();
                k kVar2 = this.h;
                viewGroup.addView(view, kVar2.f2413a, kVar2.f2414b);
                this.h = null;
            } else if (this.e.getApplicationContext() != null) {
                this.g.E(this.e.getApplicationContext());
            }
            this.g = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f;
        if (adOverlayInfoParcel != null && (pVar = adOverlayInfoParcel.f) != null) {
            pVar.r6();
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f;
        if (adOverlayInfoParcel2 == null || (rwVar = adOverlayInfoParcel2.g) == null) {
            return;
        }
        G8(rwVar.u0(), this.f.g.getView());
    }

    public final void L8() {
        if (this.p) {
            this.p = false;
            M8();
        }
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void N4() {
    }

    public final void N8() {
        this.o.e = true;
    }

    public final void O8() {
        synchronized (this.r) {
            this.t = true;
            if (this.s != null) {
                to.h.removeCallbacks(this.s);
                to.h.post(this.s);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void U0() {
        if (((Boolean) qx2.e().c(e0.b3)).booleanValue() && this.g != null && (!this.e.isFinishing() || this.h == null)) {
            com.google.android.gms.ads.internal.p.e();
            dp.j(this.g);
        }
        J8();
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void Z1() {
        this.u = true;
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void c5(c.a.b.b.e.c cVar) {
        B8((Configuration) c.a.b.b.e.e.e2(cVar));
    }

    @Override // com.google.android.gms.ads.internal.overlay.w
    public final void e2() {
        this.q = 1;
        this.e.finish();
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void f2(int r1, int r2, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final boolean k7() {
        this.q = 0;
        rw rwVar = this.g;
        if (rwVar == null) {
            return true;
        }
        boolean zI0 = rwVar.i0();
        if (!zI0) {
            this.g.M("onbackblocked", Collections.emptyMap());
        }
        return zI0;
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void onDestroy() {
        rw rwVar = this.g;
        if (rwVar != null) {
            try {
                this.o.removeView(rwVar.getView());
            } catch (NullPointerException unused) {
            }
        }
        J8();
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void onPause() {
        H8();
        p pVar = this.f.f;
        if (pVar != null) {
            pVar.onPause();
        }
        if (!((Boolean) qx2.e().c(e0.b3)).booleanValue() && this.g != null && (!this.e.isFinishing() || this.h == null)) {
            com.google.android.gms.ads.internal.p.e();
            dp.j(this.g);
        }
        J8();
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void onResume() {
        p pVar = this.f.f;
        if (pVar != null) {
            pVar.onResume();
        }
        B8(this.e.getResources().getConfiguration());
        if (((Boolean) qx2.e().c(e0.b3)).booleanValue()) {
            return;
        }
        rw rwVar = this.g;
        if (rwVar == null || rwVar.g()) {
            tr.i("The webview does not exist. Ignoring action.");
        } else {
            com.google.android.gms.ads.internal.p.e();
            dp.l(this.g);
        }
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void x1(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.m);
    }

    public final void z8() {
        this.q = 2;
        this.e.finish();
    }
}

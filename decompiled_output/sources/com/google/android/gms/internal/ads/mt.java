package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class mt extends FrameLayout implements ht {
    private final zt d;
    private final FrameLayout e;
    private final v0 f;
    private final bu g;
    private final long h;

    @androidx.annotation.i0
    private kt i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private long n;
    private long o;
    private String p;
    private String[] q;
    private Bitmap r;
    private ImageView s;
    private boolean t;

    public mt(Context context, zt ztVar, int r13, boolean z, v0 v0Var, au auVar) {
        super(context);
        this.d = ztVar;
        this.f = v0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        com.google.android.gms.common.internal.r.k(ztVar.d());
        kt ktVarA = ztVar.d().f2404b.a(context, ztVar, r13, z, v0Var, auVar);
        this.i = ktVarA;
        if (ktVarA != null) {
            this.e.addView(ktVarA, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) qx2.e().c(e0.w)).booleanValue()) {
                F();
            }
        }
        this.s = new ImageView(context);
        this.h = ((Long) qx2.e().c(e0.A)).longValue();
        boolean zBooleanValue = ((Boolean) qx2.e().c(e0.y)).booleanValue();
        this.m = zBooleanValue;
        v0 v0Var2 = this.f;
        if (v0Var2 != null) {
            v0Var2.d("spinner_used", zBooleanValue ? "1" : "0");
        }
        this.g = new bu(this);
        kt ktVar = this.i;
        if (ktVar != null) {
            ktVar.k(this);
        }
        if (this.i == null) {
            d("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    private final boolean H() {
        return this.s.getParent() != null;
    }

    private final void I() {
        if (this.d.a() == null || !this.k || this.l) {
            return;
        }
        this.d.a().getWindow().clearFlags(128);
        this.k = false;
    }

    public static void p(zt ztVar, String str) {
        HashMap map = new HashMap();
        map.put(androidx.core.app.p.i0, "decoderProps");
        map.put("error", str);
        ztVar.M("onVideoEvent", map);
    }

    public static void q(zt ztVar, Map<String, List<Map<String, Object>>> map) {
        HashMap map2 = new HashMap();
        map2.put(androidx.core.app.p.i0, "decoderProps");
        map2.put("mimeTypes", map);
        ztVar.M("onVideoEvent", map2);
    }

    public static void s(zt ztVar) {
        HashMap map = new HashMap();
        map.put(androidx.core.app.p.i0, "no_video_view");
        ztVar.M("onVideoEvent", map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(String str, String... strArr) {
        HashMap map = new HashMap();
        map.put(androidx.core.app.p.i0, str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.d.M("onVideoEvent", map);
    }

    public final void A(int r2) {
        this.i.q(r2);
    }

    @TargetApi(14)
    public final void B(MotionEvent motionEvent) {
        kt ktVar = this.i;
        if (ktVar == null) {
            return;
        }
        ktVar.dispatchTouchEvent(motionEvent);
    }

    public final void C() {
        if (this.i == null) {
            return;
        }
        if (TextUtils.isEmpty(this.p)) {
            v("no_src", new String[0]);
        } else {
            this.i.l(this.p, this.q);
        }
    }

    public final void D() {
        kt ktVar = this.i;
        if (ktVar == null) {
            return;
        }
        ktVar.e.b(true);
        ktVar.a();
    }

    public final void E() {
        kt ktVar = this.i;
        if (ktVar == null) {
            return;
        }
        ktVar.e.b(false);
        ktVar.a();
    }

    @TargetApi(14)
    public final void F() {
        kt ktVar = this.i;
        if (ktVar == null) {
            return;
        }
        TextView textView = new TextView(ktVar.getContext());
        String strValueOf = String.valueOf(this.i.r());
        textView.setText(strValueOf.length() != 0 ? "AdMob - ".concat(strValueOf) : new String("AdMob - "));
        textView.setTextColor(b.i.g.b.a.f1048c);
        textView.setBackgroundColor(b.i.p.i.u);
        this.e.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.e.bringChildToFront(textView);
    }

    final void G() {
        kt ktVar = this.i;
        if (ktVar == null) {
            return;
        }
        long currentPosition = ktVar.getCurrentPosition();
        if (this.n == currentPosition || currentPosition <= 0) {
            return;
        }
        v("timeupdate", "time", String.valueOf(currentPosition / 1000.0f));
        this.n = currentPosition;
    }

    @Override // com.google.android.gms.internal.ads.ht
    public final void a() {
        if (this.i != null && this.o == 0) {
            v("canplaythrough", "duration", String.valueOf(r0.getDuration() / 1000.0f), "videoWidth", String.valueOf(this.i.getVideoWidth()), "videoHeight", String.valueOf(this.i.getVideoHeight()));
        }
    }

    @Override // com.google.android.gms.internal.ads.ht
    public final void b() {
        v("ended", new String[0]);
        I();
    }

    @Override // com.google.android.gms.internal.ads.ht
    public final void c(int r4, int r5) {
        if (this.m) {
            int r42 = Math.max(r4 / ((Integer) qx2.e().c(e0.z)).intValue(), 1);
            int r52 = Math.max(r5 / ((Integer) qx2.e().c(e0.z)).intValue(), 1);
            Bitmap bitmap = this.r;
            if (bitmap != null && bitmap.getWidth() == r42 && this.r.getHeight() == r52) {
                return;
            }
            this.r = Bitmap.createBitmap(r42, r52, Bitmap.Config.ARGB_8888);
            this.t = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.ht
    public final void d(String str, @androidx.annotation.i0 String str2) {
        v("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.ht
    public final void e() {
        if (this.d.a() != null && !this.k) {
            boolean z = (this.d.a().getWindow().getAttributes().flags & 128) != 0;
            this.l = z;
            if (!z) {
                this.d.a().getWindow().addFlags(128);
                this.k = true;
            }
        }
        this.j = true;
    }

    @Override // com.google.android.gms.internal.ads.ht
    public final void f() {
        v("pause", new String[0]);
        I();
        this.j = false;
    }

    public final void finalize() throws Throwable {
        try {
            this.g.a();
            if (this.i != null) {
                kt ktVar = this.i;
                cy1 cy1Var = cs.e;
                ktVar.getClass();
                cy1Var.execute(lt.a(ktVar));
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.ht
    public final void g() {
        if (this.j && H()) {
            this.e.removeView(this.s);
        }
        if (this.r != null) {
            long jC = com.google.android.gms.ads.internal.p.j().c();
            if (this.i.getBitmap(this.r) != null) {
                this.t = true;
            }
            long jC2 = com.google.android.gms.ads.internal.p.j().c() - jC;
            if (oo.n()) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Spinner frame grab took ");
                sb.append(jC2);
                sb.append("ms");
                oo.m(sb.toString());
            }
            if (jC2 > this.h) {
                tr.i("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.m = false;
                this.r = null;
                v0 v0Var = this.f;
                if (v0Var != null) {
                    v0Var.d("spinner_jank", Long.toString(jC2));
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ht
    public final void h() {
        this.g.b();
        to.h.post(new nt(this));
    }

    @Override // com.google.android.gms.internal.ads.ht
    public final void i() {
        if (this.t && this.r != null && !H()) {
            this.s.setImageBitmap(this.r);
            this.s.invalidate();
            this.e.addView(this.s, new FrameLayout.LayoutParams(-1, -1));
            this.e.bringChildToFront(this.s);
        }
        this.g.a();
        this.o = this.n;
        to.h.post(new qt(this));
    }

    public final void j() {
        this.g.a();
        kt ktVar = this.i;
        if (ktVar != null) {
            ktVar.i();
        }
        I();
    }

    public final void k() {
        kt ktVar = this.i;
        if (ktVar == null) {
            return;
        }
        ktVar.d();
    }

    public final void l() {
        kt ktVar = this.i;
        if (ktVar == null) {
            return;
        }
        ktVar.f();
    }

    public final void m(int r2) {
        kt ktVar = this.i;
        if (ktVar == null) {
            return;
        }
        ktVar.h(r2);
    }

    public final void n(float f, float f2) {
        kt ktVar = this.i;
        if (ktVar != null) {
            ktVar.j(f, f2);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        bu buVar = this.g;
        if (z) {
            buVar.b();
        } else {
            buVar.a();
            this.o = this.n;
        }
        to.h.post(new Runnable(this, z) { // from class: com.google.android.gms.internal.ads.ot
            private final mt d;
            private final boolean e;

            {
                this.d = this;
                this.e = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.r(this.e);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.ht
    public final void onWindowVisibilityChanged(int r3) {
        boolean z;
        super.onWindowVisibilityChanged(r3);
        if (r3 == 0) {
            this.g.b();
            z = true;
        } else {
            this.g.a();
            this.o = this.n;
            z = false;
        }
        to.h.post(new pt(this, z));
    }

    final /* synthetic */ void r(boolean z) {
        v("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    public final void setVolume(float f) {
        kt ktVar = this.i;
        if (ktVar == null) {
            return;
        }
        ktVar.e.c(f);
        ktVar.a();
    }

    public final void t(String str, String[] strArr) {
        this.p = str;
        this.q = strArr;
    }

    public final void u(int r2, int r3, int r4, int r5) {
        if (r4 == 0 || r5 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(r4, r5);
        layoutParams.setMargins(r2, r3, 0, 0);
        this.e.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void w(int r2) {
        this.i.m(r2);
    }

    public final void x(int r2) {
        this.i.n(r2);
    }

    public final void y(int r2) {
        this.i.o(r2);
    }

    public final void z(int r2) {
        this.i.p(r2);
    }
}

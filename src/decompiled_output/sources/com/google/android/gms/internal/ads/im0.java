package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class im0 extends n3 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, jn0 {
    public static final String[] r = {com.google.android.gms.ads.d0.g.j, com.google.android.gms.ads.d0.i.i, com.google.android.gms.ads.d0.p.j};
    private final String e;
    private FrameLayout g;
    private FrameLayout h;
    private cy1 i;
    private View j;
    private final int k;

    @GuardedBy("this")
    private bl0 l;
    private or2 m;
    private e3 o;
    private boolean p;

    @GuardedBy("this")
    private Map<String, WeakReference<View>> f = new HashMap();
    private c.a.b.b.e.c n = null;
    private boolean q = false;

    public im0(FrameLayout frameLayout, FrameLayout frameLayout2, int r4) {
        String str;
        this.g = frameLayout;
        this.h = frameLayout2;
        this.k = r4;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = com.google.android.gms.ads.d0.i.h;
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = com.google.android.gms.ads.d0.g.k;
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.e = str;
        com.google.android.gms.ads.internal.p.z();
        ss.a(frameLayout, this);
        com.google.android.gms.ads.internal.p.z();
        ss.b(frameLayout, this);
        this.i = cs.e;
        this.m = new or2(this.g.getContext(), this.g);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void z8() {
        this.i.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.hm0
            private final im0 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.A8();
            }
        });
    }

    final /* synthetic */ void A8() {
        if (this.j == null) {
            View view = new View(this.g.getContext());
            this.j = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.g != this.j.getParent()) {
            this.g.addView(this.j);
        }
    }

    @Override // com.google.android.gms.internal.ads.jn0
    public final synchronized String D2() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final synchronized void J7(c.a.b.b.e.c cVar) {
        if (this.q) {
            return;
        }
        this.n = cVar;
    }

    @Override // com.google.android.gms.internal.ads.jn0
    public final FrameLayout K7() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.ads.jn0
    @androidx.annotation.i0
    public final synchronized JSONObject L0() {
        if (this.l == null) {
            return null;
        }
        return this.l.k(this.g, Y3(), w6());
    }

    @Override // com.google.android.gms.internal.ads.jn0
    public final synchronized View N3(String str) {
        if (this.q) {
            return null;
        }
        WeakReference<View> weakReference = this.f.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final synchronized void T0(c.a.b.b.e.c cVar) {
        this.l.j((View) c.a.b.b.e.e.e2(cVar));
    }

    @Override // com.google.android.gms.internal.ads.jn0
    public final /* synthetic */ View X5() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.jn0
    public final synchronized Map<String, WeakReference<View>> Y3() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.jn0
    @androidx.annotation.i0
    public final synchronized Map<String, WeakReference<View>> a8() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final synchronized void destroy() {
        if (this.q) {
            return;
        }
        if (this.l != null) {
            this.l.B(this);
            this.l = null;
        }
        this.f.clear();
        this.g.removeAllViews();
        this.h.removeAllViews();
        this.f = null;
        this.g = null;
        this.h = null;
        this.j = null;
        this.m = null;
        this.q = true;
    }

    @Override // com.google.android.gms.internal.ads.jn0
    public final or2 i2() {
        return this.m;
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final synchronized c.a.b.b.e.c j3(String str) {
        return c.a.b.b.e.e.i2(N3(str));
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final synchronized void j6(String str, c.a.b.b.e.c cVar) {
        y3(str, (View) c.a.b.b.e.e.e2(cVar), true);
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final synchronized void l4(e3 e3Var) {
        if (this.q) {
            return;
        }
        this.p = true;
        this.o = e3Var;
        if (this.l != null) {
            this.l.x().a(e3Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final synchronized void o0(c.a.b.b.e.c cVar) {
        if (this.q) {
            return;
        }
        Object objE2 = c.a.b.b.e.e.e2(cVar);
        if (!(objE2 instanceof bl0)) {
            tr.i("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        if (this.l != null) {
            this.l.B(this);
        }
        z8();
        bl0 bl0Var = (bl0) objE2;
        this.l = bl0Var;
        bl0Var.o(this);
        this.l.s(this.g);
        this.l.t(this.h);
        if (this.p) {
            this.l.x().a(this.o);
        }
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final synchronized void o2(c.a.b.b.e.c cVar, int r2) {
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        if (this.l != null) {
            this.l.g();
            this.l.m(view, this.g, Y3(), w6(), false);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        if (this.l != null) {
            this.l.A(this.g, Y3(), w6(), bl0.J(this.g));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        if (this.l != null) {
            this.l.A(this.g, Y3(), w6(), bl0.J(this.g));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.l != null) {
            this.l.l(view, motionEvent, this.g);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final void r2(c.a.b.b.e.c cVar) {
        onTouch(this.g, (MotionEvent) c.a.b.b.e.e.e2(cVar));
    }

    @Override // com.google.android.gms.internal.ads.jn0
    @androidx.annotation.i0
    public final c.a.b.b.e.c u4() {
        return this.n;
    }

    @Override // com.google.android.gms.internal.ads.jn0
    public final synchronized Map<String, WeakReference<View>> w6() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.jn0
    public final synchronized void y3(String str, View view, boolean z) {
        if (this.q) {
            return;
        }
        if (view == null) {
            this.f.remove(str);
            return;
        }
        this.f.put(str, new WeakReference<>(view));
        if (!com.google.android.gms.ads.d0.c.f2357a.equals(str) && !com.google.android.gms.ads.d0.p.k.equals(str)) {
            if (wq.k(this.k)) {
                view.setOnTouchListener(this);
            }
            view.setClickable(true);
            view.setOnClickListener(this);
        }
    }
}

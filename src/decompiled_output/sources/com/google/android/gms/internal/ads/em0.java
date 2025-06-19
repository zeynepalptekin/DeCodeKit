package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class em0 extends u3 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, jn0 {
    private final WeakReference<View> e;
    private final Map<String, WeakReference<View>> f = new HashMap();
    private final Map<String, WeakReference<View>> g = new HashMap();
    private final Map<String, WeakReference<View>> h = new HashMap();

    @GuardedBy("this")
    private bl0 i;
    private or2 j;

    public em0(View view, HashMap<String, View> map, HashMap<String, View> map2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        com.google.android.gms.ads.internal.p.z();
        ss.a(view, this);
        com.google.android.gms.ads.internal.p.z();
        ss.b(view, this);
        this.e = new WeakReference<>(view);
        for (Map.Entry<String, View> entry : map.entrySet()) {
            String key = entry.getKey();
            View value = entry.getValue();
            if (value != null) {
                this.f.put(key, new WeakReference<>(value));
                if (!com.google.android.gms.ads.d0.c.f2357a.equals(key) && !com.google.android.gms.ads.d0.p.k.equals(key)) {
                    value.setOnTouchListener(this);
                    value.setClickable(true);
                    value.setOnClickListener(this);
                }
            }
        }
        this.h.putAll(this.f);
        for (Map.Entry<String, View> entry2 : map2.entrySet()) {
            View value2 = entry2.getValue();
            if (value2 != null) {
                this.g.put(entry2.getKey(), new WeakReference<>(value2));
                value2.setOnTouchListener(this);
                value2.setClickable(false);
            }
        }
        this.h.putAll(this.g);
        this.j = new or2(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.jn0
    public final synchronized String D2() {
        return com.google.android.gms.ads.d0.i.h;
    }

    @Override // com.google.android.gms.internal.ads.jn0
    @androidx.annotation.i0
    public final FrameLayout K7() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.jn0
    @androidx.annotation.i0
    public final synchronized JSONObject L0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.jn0
    public final synchronized View N3(String str) {
        WeakReference<View> weakReference = this.h.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.r3
    public final synchronized void T0(c.a.b.b.e.c cVar) {
        if (this.i != null) {
            Object objE2 = c.a.b.b.e.e.e2(cVar);
            if (!(objE2 instanceof View)) {
                tr.i("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.i.j((View) objE2);
        }
    }

    @Override // com.google.android.gms.internal.ads.jn0
    @androidx.annotation.i0
    public final View X5() {
        return this.e.get();
    }

    @Override // com.google.android.gms.internal.ads.jn0
    public final synchronized Map<String, WeakReference<View>> Y3() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.ads.jn0
    @androidx.annotation.i0
    public final synchronized Map<String, WeakReference<View>> a8() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.jn0
    public final or2 i2() {
        return this.j;
    }

    @Override // com.google.android.gms.internal.ads.r3
    public final synchronized void l5() {
        if (this.i != null) {
            this.i.B(this);
            this.i = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.r3
    public final synchronized void o0(c.a.b.b.e.c cVar) {
        Object objE2 = c.a.b.b.e.e.e2(cVar);
        if (!(objE2 instanceof bl0)) {
            tr.i("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        if (this.i != null) {
            this.i.B(this);
        }
        if (!((bl0) objE2).v()) {
            tr.g("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
            return;
        }
        bl0 bl0Var = (bl0) objE2;
        this.i = bl0Var;
        bl0Var.o(this);
        this.i.s(X5());
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        if (this.i != null) {
            this.i.m(view, X5(), Y3(), w6(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        if (this.i != null) {
            this.i.A(X5(), Y3(), w6(), bl0.J(X5()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        if (this.i != null) {
            this.i.A(X5(), Y3(), w6(), bl0.J(X5()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.i != null) {
            this.i.l(view, motionEvent, X5());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.jn0
    @androidx.annotation.i0
    public final synchronized c.a.b.b.e.c u4() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.jn0
    public final synchronized Map<String, WeakReference<View>> w6() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.jn0
    public final synchronized void y3(String str, View view, boolean z) {
        if (view == null) {
            this.h.remove(str);
            this.f.remove(str);
            this.g.remove(str);
            return;
        }
        this.h.put(str, new WeakReference<>(view));
        if (!com.google.android.gms.ads.d0.c.f2357a.equals(str) && !com.google.android.gms.ads.d0.p.k.equals(str)) {
            this.f.put(str, new WeakReference<>(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }
}

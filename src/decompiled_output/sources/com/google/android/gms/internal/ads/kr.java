package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;

/* loaded from: classes.dex */
public final class kr {

    /* renamed from: a, reason: collision with root package name */
    private final View f4140a;

    /* renamed from: b, reason: collision with root package name */
    private Activity f4141b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4142c;
    private boolean d;
    private boolean e;
    private ViewTreeObserver.OnGlobalLayoutListener f;
    private ViewTreeObserver.OnScrollChangedListener g = null;

    public kr(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f4141b = activity;
        this.f4140a = view;
        this.f = onGlobalLayoutListener;
    }

    private static ViewTreeObserver d(Activity activity) {
        Window window;
        View decorView;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    private final void g() {
        ViewTreeObserver viewTreeObserverD;
        if (this.f4142c) {
            return;
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f;
        if (onGlobalLayoutListener != null) {
            Activity activity = this.f4141b;
            if (activity != null && (viewTreeObserverD = d(activity)) != null) {
                viewTreeObserverD.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            com.google.android.gms.ads.internal.p.z();
            ss.a(this.f4140a, this.f);
        }
        this.f4142c = true;
    }

    private final void h() {
        ViewTreeObserver viewTreeObserverD;
        Activity activity = this.f4141b;
        if (activity != null && this.f4142c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f;
            if (onGlobalLayoutListener != null && (viewTreeObserverD = d(activity)) != null) {
                com.google.android.gms.ads.internal.p.e();
                viewTreeObserverD.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f4142c = false;
        }
    }

    public final void a() {
        this.d = true;
        if (this.e) {
            g();
        }
    }

    public final void b() {
        this.d = false;
        h();
    }

    public final void c(Activity activity) {
        this.f4141b = activity;
    }

    public final void e() {
        this.e = true;
        if (this.d) {
            g();
        }
    }

    public final void f() {
        this.e = false;
        h();
    }
}

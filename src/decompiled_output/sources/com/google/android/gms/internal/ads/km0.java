package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class km0 {

    /* renamed from: a, reason: collision with root package name */
    private final qo f4108a;

    /* renamed from: b, reason: collision with root package name */
    private final an1 f4109b;

    /* renamed from: c, reason: collision with root package name */
    private final rl0 f4110c;
    private final nl0 d;

    @androidx.annotation.i0
    private final sm0 e;

    @androidx.annotation.i0
    private final an0 f;
    private final Executor g;
    private final Executor h;
    private final z2 i;
    private final il0 j;

    public km0(qo qoVar, an1 an1Var, rl0 rl0Var, nl0 nl0Var, @androidx.annotation.i0 sm0 sm0Var, @androidx.annotation.i0 an0 an0Var, Executor executor, Executor executor2, il0 il0Var) {
        this.f4108a = qoVar;
        this.f4109b = an1Var;
        this.i = an1Var.i;
        this.f4110c = rl0Var;
        this.d = nl0Var;
        this.e = sm0Var;
        this.f = an0Var;
        this.g = executor;
        this.h = executor2;
        this.j = il0Var;
    }

    private static void a(RelativeLayout.LayoutParams layoutParams, int r6) {
        if (r6 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (r6 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (r6 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(jn0 jn0Var, String[] strArr) {
        Map<String, WeakReference<View>> mapW6 = jn0Var.w6();
        if (mapW6 == null) {
            return false;
        }
        for (String str : strArr) {
            if (mapW6.get(str) != null) {
                return true;
            }
        }
        return false;
    }

    public final void b(final jn0 jn0Var) {
        this.g.execute(new Runnable(this, jn0Var) { // from class: com.google.android.gms.internal.ads.jm0
            private final km0 d;
            private final jn0 e;

            {
                this.d = this;
                this.e = jn0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.i(this.e);
            }
        });
    }

    public final boolean c(@androidx.annotation.h0 ViewGroup viewGroup) {
        View viewE = this.d.E();
        if (viewE == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewE.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewE.getParent()).removeView(viewE);
        }
        viewGroup.addView(viewE, ((Boolean) qx2.e().c(e0.o2)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    final /* synthetic */ void f(ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        if (this.d.E() != null) {
            if (2 == this.d.A() || 1 == this.d.A()) {
                this.f4108a.h(this.f4109b.f, String.valueOf(this.d.A()), z);
            } else if (6 == this.d.A()) {
                this.f4108a.h(this.f4109b.f, "2", z);
                this.f4108a.h(this.f4109b.f, "1", z);
            }
        }
    }

    public final void g(@androidx.annotation.i0 jn0 jn0Var) {
        if (jn0Var == null || this.e == null || jn0Var.K7() == null || !this.f4110c.c()) {
            return;
        }
        try {
            jn0Var.K7().addView(this.e.c());
        } catch (dx e) {
            oo.l("web view can not be obtained", e);
        }
    }

    public final void h(@androidx.annotation.i0 jn0 jn0Var) {
        if (jn0Var == null) {
            return;
        }
        Context context = jn0Var.X5().getContext();
        if (wq.g(this.f4110c.f5152a)) {
            if (!(context instanceof Activity)) {
                tr.f("Activity context is needed for policy validator.");
                return;
            }
            if (this.f == null || jn0Var.K7() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.f.b(jn0Var.K7(), windowManager), wq.n());
            } catch (dx e) {
                oo.l("web view can not be obtained", e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ void i(com.google.android.gms.internal.ads.jn0 r10) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.km0.i(com.google.android.gms.internal.ads.jn0):void");
    }
}

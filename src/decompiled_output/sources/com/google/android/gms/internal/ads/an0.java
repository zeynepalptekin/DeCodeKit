package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class an0 {

    /* renamed from: a, reason: collision with root package name */
    private final dr0 f2716a;

    /* renamed from: b, reason: collision with root package name */
    private final up0 f2717b;

    /* renamed from: c, reason: collision with root package name */
    private ViewTreeObserver.OnScrollChangedListener f2718c = null;

    public an0(dr0 dr0Var, up0 up0Var) {
        this.f2716a = dr0Var;
        this.f2717b = up0Var;
    }

    private static int a(Context context, String str, int r2) throws NumberFormatException {
        try {
            r2 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        qx2.a();
        return jr.r(context, r2);
    }

    public final View b(@androidx.annotation.h0 final View view, @androidx.annotation.h0 final WindowManager windowManager) throws dx {
        rw rwVarC = this.f2716a.c(qw2.l());
        rwVarC.getView().setVisibility(4);
        rwVarC.getView().setContentDescription("policy_validator");
        rwVarC.o("/sendMessageToSdk", new z6(this) { // from class: com.google.android.gms.internal.ads.zm0

            /* renamed from: a, reason: collision with root package name */
            private final an0 f6289a;

            {
                this.f6289a = this;
            }

            @Override // com.google.android.gms.internal.ads.z6
            public final void a(Object obj, Map map) {
                this.f6289a.f((rw) obj, map);
            }
        });
        rwVarC.o("/hideValidatorOverlay", new z6(this, windowManager, view) { // from class: com.google.android.gms.internal.ads.cn0

            /* renamed from: a, reason: collision with root package name */
            private final an0 f2997a;

            /* renamed from: b, reason: collision with root package name */
            private final WindowManager f2998b;

            /* renamed from: c, reason: collision with root package name */
            private final View f2999c;

            {
                this.f2997a = this;
                this.f2998b = windowManager;
                this.f2999c = view;
            }

            @Override // com.google.android.gms.internal.ads.z6
            public final void a(Object obj, Map map) {
                this.f2997a.d(this.f2998b, this.f2999c, (rw) obj, map);
            }
        });
        rwVarC.o("/open", new d7(null, null));
        this.f2717b.g(new WeakReference(rwVarC), "/loadNativeAdPolicyViolations", new z6(this, view, windowManager) { // from class: com.google.android.gms.internal.ads.bn0

            /* renamed from: a, reason: collision with root package name */
            private final an0 f2851a;

            /* renamed from: b, reason: collision with root package name */
            private final View f2852b;

            /* renamed from: c, reason: collision with root package name */
            private final WindowManager f2853c;

            {
                this.f2851a = this;
                this.f2852b = view;
                this.f2853c = windowManager;
            }

            @Override // com.google.android.gms.internal.ads.z6
            public final void a(Object obj, Map map) throws NumberFormatException {
                this.f2851a.c(this.f2852b, this.f2853c, (rw) obj, map);
            }
        });
        this.f2717b.g(new WeakReference(rwVarC), "/showValidatorOverlay", en0.f3292a);
        return rwVarC.getView();
    }

    final /* synthetic */ void c(final View view, final WindowManager windowManager, final rw rwVar, final Map map) throws NumberFormatException {
        rwVar.C0().m(new dy(this, map) { // from class: com.google.android.gms.internal.ads.hn0

            /* renamed from: a, reason: collision with root package name */
            private final an0 f3693a;

            /* renamed from: b, reason: collision with root package name */
            private final Map f3694b;

            {
                this.f3693a = this;
                this.f3694b = map;
            }

            @Override // com.google.android.gms.internal.ads.dy
            public final void a(boolean z) {
                this.f3693a.e(this.f3694b, z);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int r1 = a(context, (String) map.get("validator_width"), ((Integer) qx2.e().c(e0.i5)).intValue());
        int r2 = a(context, (String) map.get("validator_height"), ((Integer) qx2.e().c(e0.j5)).intValue());
        int r3 = a(context, (String) map.get("validator_x"), 0);
        int r0 = a(context, (String) map.get("validator_y"), 0);
        rwVar.p0(hy.j(r1, r2));
        try {
            rwVar.getWebView().getSettings().setUseWideViewPort(((Boolean) qx2.e().c(e0.k5)).booleanValue());
            rwVar.getWebView().getSettings().setLoadWithOverviewMode(((Boolean) qx2.e().c(e0.l5)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams layoutParamsN = wq.n();
        layoutParamsN.x = r3;
        layoutParamsN.y = r0;
        windowManager.updateViewLayout(rwVar.getView(), layoutParamsN);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int r12 = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - r0;
            this.f2718c = new ViewTreeObserver.OnScrollChangedListener(view, rwVar, str, layoutParamsN, r12, windowManager) { // from class: com.google.android.gms.internal.ads.dn0
                private final View d;
                private final rw e;
                private final String f;
                private final WindowManager.LayoutParams g;
                private final int h;
                private final WindowManager i;

                {
                    this.d = view;
                    this.e = rwVar;
                    this.f = str;
                    this.g = layoutParamsN;
                    this.h = r12;
                    this.i = windowManager;
                }

                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    View view2 = this.d;
                    rw rwVar2 = this.e;
                    String str2 = this.f;
                    WindowManager.LayoutParams layoutParams = this.g;
                    int r4 = this.h;
                    WindowManager windowManager2 = this.i;
                    Rect rect2 = new Rect();
                    if (!view2.getGlobalVisibleRect(rect2) || rwVar2.getView().getWindowToken() == null) {
                        return;
                    }
                    layoutParams.y = (("1".equals(str2) || "2".equals(str2)) ? rect2.bottom : rect2.top) - r4;
                    windowManager2.updateViewLayout(rwVar2.getView(), layoutParams);
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.f2718c);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        rwVar.loadUrl(str2);
    }

    final /* synthetic */ void d(WindowManager windowManager, View view, rw rwVar, Map map) {
        tr.f("Hide native ad policy validator overlay.");
        rwVar.getView().setVisibility(8);
        if (rwVar.getView().getWindowToken() != null) {
            windowManager.removeView(rwVar.getView());
        }
        rwVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.f2718c == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.f2718c);
    }

    final /* synthetic */ void e(Map map, boolean z) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "validatorHtmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.f2717b.f("sendMessageToNativeJs", map2);
    }

    final /* synthetic */ void f(rw rwVar, Map map) {
        this.f2717b.f("sendMessageToNativeJs", map);
    }
}

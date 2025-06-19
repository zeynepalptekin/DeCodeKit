package com.google.android.gms.ads.d0;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.qx2;
import com.google.android.gms.internal.ads.r3;
import com.google.android.gms.internal.ads.tr;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static WeakHashMap<View, f> f2364c = new WeakHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private r3 f2365a;

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<View> f2366b;

    public f(View view, Map<String, View> map, Map<String, View> map2) {
        com.google.android.gms.common.internal.r.l(view, "ContainerView must not be null");
        if ((view instanceof e) || (view instanceof q)) {
            tr.g("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
            return;
        }
        if (f2364c.get(view) != null) {
            tr.g("The provided containerView is already in use with another NativeAdViewHolder.");
            return;
        }
        f2364c.put(view, this);
        this.f2366b = new WeakReference<>(view);
        this.f2365a = qx2.b().b(view, f(map), f(map2));
    }

    private final void e(c.a.b.b.e.c cVar) {
        WeakReference<View> weakReference = this.f2366b;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null) {
            tr.i("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!f2364c.containsKey(view)) {
            f2364c.put(view, this);
        }
        r3 r3Var = this.f2365a;
        if (r3Var != null) {
            try {
                r3Var.o0(cVar);
            } catch (RemoteException e) {
                tr.c("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    private static HashMap<String, View> f(Map<String, View> map) {
        return map == null ? new HashMap<>() : new HashMap<>(map);
    }

    public final void a(View view) {
        try {
            this.f2365a.T0(c.a.b.b.e.e.i2(view));
        } catch (RemoteException e) {
            tr.c("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void b(c cVar) {
        e((c.a.b.b.e.c) cVar.d());
    }

    public final void c(o oVar) {
        e((c.a.b.b.e.c) oVar.D());
    }

    public final void d() {
        r3 r3Var = this.f2365a;
        if (r3Var != null) {
            try {
                r3Var.l5();
            } catch (RemoteException e) {
                tr.c("Unable to call unregisterNativeAd on delegate", e);
            }
        }
        WeakReference<View> weakReference = this.f2366b;
        View view = weakReference != null ? weakReference.get() : null;
        if (view != null) {
            f2364c.remove(view);
        }
    }
}

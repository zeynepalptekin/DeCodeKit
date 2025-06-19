package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class kn0 implements vl0 {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.i0
    private final dd f4117a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.i0
    private final ed f4118b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.i0
    private final jd f4119c;
    private final ob0 d;
    private final wa0 e;
    private final Context f;
    private final km1 g;
    private final as h;
    private final an1 i;
    private boolean j = false;
    private boolean k = false;

    public kn0(@androidx.annotation.i0 dd ddVar, @androidx.annotation.i0 ed edVar, @androidx.annotation.i0 jd jdVar, ob0 ob0Var, wa0 wa0Var, Context context, km1 km1Var, as asVar, an1 an1Var) {
        this.f4117a = ddVar;
        this.f4118b = edVar;
        this.f4119c = jdVar;
        this.d = ob0Var;
        this.e = wa0Var;
        this.f = context;
        this.g = km1Var;
        this.h = asVar;
        this.i = an1Var;
    }

    private final void p(View view) {
        try {
            if (this.f4119c != null && !this.f4119c.z0()) {
                this.f4119c.r0(c.a.b.b.e.e.i2(view));
                this.e.p();
            } else if (this.f4117a != null && !this.f4117a.z0()) {
                this.f4117a.r0(c.a.b.b.e.e.i2(view));
                this.e.p();
            } else {
                if (this.f4118b == null || this.f4118b.z0()) {
                    return;
                }
                this.f4118b.r0(c.a.b.b.e.e.i2(view));
                this.e.p();
            }
        } catch (RemoteException e) {
            tr.d("Failed to call handleClick", e);
        }
    }

    private static HashMap<String, View> q(Map<String, WeakReference<View>> map) {
        HashMap<String, View> map2 = new HashMap<>();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view = entry.getValue().get();
                if (view != null) {
                    map2.put(entry.getKey(), view);
                }
            }
        }
        return map2;
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final boolean A1() {
        return this.g.G;
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void F1(g5 g5Var) {
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void N0() {
        this.k = true;
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void V0() {
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void a(View view, @androidx.annotation.i0 Map<String, WeakReference<View>> map, @androidx.annotation.i0 Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        try {
            c.a.b.b.e.c cVarI2 = c.a.b.b.e.e.i2(view);
            HashMap<String, View> mapQ = q(map);
            HashMap<String, View> mapQ2 = q(map2);
            if (this.f4119c != null) {
                this.f4119c.x0(cVarI2, c.a.b.b.e.e.i2(mapQ), c.a.b.b.e.e.i2(mapQ2));
                return;
            }
            if (this.f4117a != null) {
                this.f4117a.x0(cVarI2, c.a.b.b.e.e.i2(mapQ), c.a.b.b.e.e.i2(mapQ2));
                this.f4117a.d1(cVarI2);
            } else if (this.f4118b != null) {
                this.f4118b.x0(cVarI2, c.a.b.b.e.e.i2(mapQ), c.a.b.b.e.e.i2(mapQ2));
                this.f4118b.d1(cVarI2);
            }
        } catch (RemoteException e) {
            tr.d("Failed to call trackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void b() {
        tr.i("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void c(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void d(View view) {
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void destroy() {
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void e(View view, @androidx.annotation.i0 Map<String, WeakReference<View>> map) {
        try {
            c.a.b.b.e.c cVarI2 = c.a.b.b.e.e.i2(view);
            if (this.f4119c != null) {
                this.f4119c.b0(cVarI2);
            } else if (this.f4117a != null) {
                this.f4117a.b0(cVarI2);
            } else if (this.f4118b != null) {
                this.f4118b.b0(cVarI2);
            }
        } catch (RemoteException e) {
            tr.d("Failed to call untrackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void f() {
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void g(View view, MotionEvent motionEvent, @androidx.annotation.i0 View view2) {
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void h(View view, @androidx.annotation.i0 View view2, @androidx.annotation.i0 Map<String, WeakReference<View>> map, @androidx.annotation.i0 Map<String, WeakReference<View>> map2, boolean z) {
        if (this.k && this.g.G) {
            return;
        }
        p(view);
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void i(@androidx.annotation.i0 View view, @androidx.annotation.i0 Map<String, WeakReference<View>> map, @androidx.annotation.i0 Map<String, WeakReference<View>> map2) {
        try {
            if (!this.j && this.g.B != null) {
                this.j |= com.google.android.gms.ads.internal.p.m().c(this.f, this.h.d, this.g.B.toString(), this.i.f);
            }
            if (this.f4119c != null && !this.f4119c.w0()) {
                this.f4119c.g();
                this.d.U();
            } else if (this.f4117a != null && !this.f4117a.w0()) {
                this.f4117a.g();
                this.d.U();
            } else {
                if (this.f4118b == null || this.f4118b.w0()) {
                    return;
                }
                this.f4118b.g();
                this.d.U();
            }
        } catch (RemoteException e) {
            tr.d("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void j(String str) {
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void j1(ez2 ez2Var) {
        tr.i("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void k() {
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void l(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.vl0
    @androidx.annotation.i0
    public final JSONObject m(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void n(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        String str;
        if (!this.k) {
            str = "Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.";
        } else {
            if (this.g.G) {
                p(view);
                return;
            }
            str = "Custom click reporting for 3p ads failed. Ad unit id not whitelisted.";
        }
        tr.i(str);
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void n1(@androidx.annotation.i0 jz2 jz2Var) {
        tr.i("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final boolean o(Bundle bundle) {
        return false;
    }
}

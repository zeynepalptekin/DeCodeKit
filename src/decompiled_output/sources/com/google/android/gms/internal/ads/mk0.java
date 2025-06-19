package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class mk0 implements vl0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4423a;

    /* renamed from: b, reason: collision with root package name */
    private final ul0 f4424b;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f4425c;
    private final up0 d;
    private final nl0 e;
    private final i52 f;
    private final ob0 g;
    private final wa0 h;
    private final km1 i;
    private final as j;
    private final an1 k;
    private final g30 l;
    private final nm0 m;
    private final com.google.android.gms.common.util.g n;
    private final fh0 o;
    private final nr1 p;
    private boolean r;
    private ez2 y;
    private boolean q = false;
    private boolean s = false;
    private boolean t = false;
    private Point u = new Point();
    private Point v = new Point();
    private long w = 0;
    private long x = 0;

    public mk0(Context context, ul0 ul0Var, JSONObject jSONObject, up0 up0Var, nl0 nl0Var, i52 i52Var, ob0 ob0Var, wa0 wa0Var, km1 km1Var, as asVar, an1 an1Var, g30 g30Var, nm0 nm0Var, com.google.android.gms.common.util.g gVar, fh0 fh0Var, nr1 nr1Var) {
        this.f4423a = context;
        this.f4424b = ul0Var;
        this.f4425c = jSONObject;
        this.d = up0Var;
        this.e = nl0Var;
        this.f = i52Var;
        this.g = ob0Var;
        this.h = wa0Var;
        this.i = km1Var;
        this.j = asVar;
        this.k = an1Var;
        this.l = g30Var;
        this.m = nm0Var;
        this.n = gVar;
        this.o = fh0Var;
        this.p = nr1Var;
    }

    private final void q(@androidx.annotation.i0 View view, @androidx.annotation.i0 JSONObject jSONObject, @androidx.annotation.i0 JSONObject jSONObject2, @androidx.annotation.i0 JSONObject jSONObject3, @androidx.annotation.i0 JSONObject jSONObject4, @androidx.annotation.i0 String str, @androidx.annotation.i0 JSONObject jSONObject5, @androidx.annotation.i0 JSONObject jSONObject6, boolean z, boolean z2) throws JSONException {
        com.google.android.gms.common.internal.r.f("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f4425c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.f4424b.i(this.e.e()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.e.A());
            jSONObject8.put("view_aware_api_used", z);
            jSONObject8.put("custom_mute_requested", this.k.i != null && this.k.i.j);
            jSONObject8.put("custom_mute_enabled", (this.e.j().isEmpty() || this.e.D() == null) ? false : true);
            if (this.m.c() != null && this.f4425c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.n.a());
            if (this.t && s()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.f4424b.i(this.e.e()) != null);
            jSONObject8.put("click_signals", w(view));
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long jA = this.n.a();
            jSONObject9.put("time_from_last_touch_down", jA - this.w);
            jSONObject9.put("time_from_last_touch", jA - this.x);
            jSONObject7.put("touch_signal", jSONObject9);
            gs.a(this.d.j("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e) {
            tr.c("Unable to create click JSON.", e);
        }
    }

    private final boolean r(@androidx.annotation.i0 JSONObject jSONObject, @androidx.annotation.i0 JSONObject jSONObject2, @androidx.annotation.i0 JSONObject jSONObject3, @androidx.annotation.i0 JSONObject jSONObject4, @androidx.annotation.i0 String str, @androidx.annotation.i0 JSONObject jSONObject5, boolean z) throws JSONException {
        com.google.android.gms.common.internal.r.f("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f4425c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) qx2.e().c(e0.W1)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            jSONObject6.put("screen", wq.j(this.f4423a));
            lk0 lk0Var = null;
            this.d.e("/logScionEvent", new ok0(this));
            this.d.e("/nativeImpression", new nk0(this));
            gs.a(this.d.j("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            boolean z2 = this.q;
            if (z2 || this.i.B == null) {
                return true;
            }
            this.q = z2 | com.google.android.gms.ads.internal.p.m().c(this.f4423a, this.j.d, this.i.B.toString(), this.k.f);
            return true;
        } catch (JSONException e) {
            tr.c("Unable to create impression JSON.", e);
            return false;
        }
    }

    private final boolean s() {
        return this.f4425c.optBoolean("allow_custom_click_gesture", false);
    }

    @androidx.annotation.i0
    private final String u(@androidx.annotation.i0 View view, @androidx.annotation.i0 Map<String, WeakReference<View>> map) {
        if (map != null && view != null) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                if (view.equals(entry.getValue().get())) {
                    return entry.getKey();
                }
            }
        }
        int r3 = this.e.A();
        if (r3 == 1) {
            return "1099";
        }
        if (r3 == 2) {
            return "2099";
        }
        if (r3 != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean v(String str) {
        JSONObject jSONObjectOptJSONObject = this.f4425c.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    private final String w(View view) {
        try {
            JSONObject jSONObjectOptJSONObject = this.f4425c.optJSONObject("tracking_urls_and_actions");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            return this.f.h().e(this.f4423a, jSONObjectOptJSONObject.optString("click_string"), view);
        } catch (Exception e) {
            tr.c("Exception obtaining click signals", e);
            return null;
        }
    }

    private final String x(View view) {
        if (!((Boolean) qx2.e().c(e0.W1)).booleanValue()) {
            return null;
        }
        try {
            return this.f.h().d(this.f4423a, view, null);
        } catch (Exception unused) {
            tr.g("Exception getting data.");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final boolean A1() {
        return s();
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void F1(g5 g5Var) {
        if (this.f4425c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.m.b(g5Var);
        } else {
            tr.i("setUnconfirmedClickListener: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void N0() {
        this.t = true;
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void V0() {
        if (this.f4425c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.m.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void a(View view, @androidx.annotation.i0 Map<String, WeakReference<View>> map, @androidx.annotation.i0 Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.u = new Point();
        this.v = new Point();
        if (!this.r) {
            this.o.H0(view);
            this.r = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.l.u(this);
        boolean zK = wq.k(this.j.f);
        if (map != null) {
            Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = it.next().getValue().get();
                if (view2 != null) {
                    if (zK) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator<Map.Entry<String, WeakReference<View>>> it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = it2.next().getValue().get();
                if (view3 != null) {
                    if (zK) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void b() {
        try {
            if (this.y != null) {
                this.y.e1();
            }
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void c(@androidx.annotation.i0 Bundle bundle) throws JSONException {
        if (bundle == null) {
            tr.f("Click data is null. No click is reported.");
        } else if (!v("click_reporting")) {
            tr.g("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            q(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, com.google.android.gms.ads.internal.p.c().h(bundle, null), false, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void d(View view) {
        if (!this.f4425c.optBoolean("custom_one_point_five_click_enabled", false)) {
            tr.i("setClickConfirmingView: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
            return;
        }
        nm0 nm0Var = this.m;
        if (view != null) {
            view.setOnClickListener(nm0Var);
            view.setClickable(true);
            nm0Var.j = new WeakReference<>(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void destroy() {
        this.d.a();
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void e(View view, @androidx.annotation.i0 Map<String, WeakReference<View>> map) {
        this.u = new Point();
        this.v = new Point();
        this.o.I0(view);
        this.r = false;
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void f() throws JSONException {
        com.google.android.gms.common.internal.r.f("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f4425c);
            gs.a(this.d.j("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void g(@androidx.annotation.i0 View view, MotionEvent motionEvent, @androidx.annotation.i0 View view2) {
        this.u = wq.a(motionEvent, view2);
        long jA = this.n.a();
        this.x = jA;
        if (motionEvent.getAction() == 0) {
            this.w = jA;
            this.v = this.u;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.u;
        motionEventObtain.setLocation(point.x, point.y);
        this.f.d(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void h(View view, @androidx.annotation.i0 View view2, @androidx.annotation.i0 Map<String, WeakReference<View>> map, @androidx.annotation.i0 Map<String, WeakReference<View>> map2, boolean z) throws JSONException {
        JSONObject jSONObjectE = wq.e(this.f4423a, map, map2, view2);
        JSONObject jSONObjectD = wq.d(this.f4423a, view2);
        JSONObject jSONObjectL = wq.l(view2);
        JSONObject jSONObjectI = wq.i(this.f4423a, view2);
        String strU = u(view, map);
        q(((Boolean) qx2.e().c(e0.X1)).booleanValue() ? view2 : view, jSONObjectD, jSONObjectE, jSONObjectL, jSONObjectI, strU, wq.f(strU, this.f4423a, this.v, this.u), null, z, false);
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void i(@androidx.annotation.i0 View view, @androidx.annotation.i0 Map<String, WeakReference<View>> map, @androidx.annotation.i0 Map<String, WeakReference<View>> map2) throws JSONException {
        r(wq.d(this.f4423a, view), wq.e(this.f4423a, map, map2, view), wq.l(view), wq.i(this.f4423a, view), x(view), null, wq.g(this.i));
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void j(String str) throws JSONException {
        q(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void j1(ez2 ez2Var) {
        this.y = ez2Var;
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void k() throws JSONException {
        r(null, null, null, null, null, null, false);
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void l(@androidx.annotation.i0 Bundle bundle) {
        if (bundle == null) {
            tr.f("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!v("touch_reporting")) {
            tr.g("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
            return;
        }
        this.f.h().b((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.ads.vl0
    @androidx.annotation.i0
    public final JSONObject m(@androidx.annotation.i0 View view, @androidx.annotation.i0 Map<String, WeakReference<View>> map, @androidx.annotation.i0 Map<String, WeakReference<View>> map2) throws JSONException {
        JSONObject jSONObjectE = wq.e(this.f4423a, map, map2, view);
        JSONObject jSONObjectD = wq.d(this.f4423a, view);
        JSONObject jSONObjectL = wq.l(view);
        JSONObject jSONObjectI = wq.i(this.f4423a, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectE);
            jSONObject.put("ad_view_signal", jSONObjectD);
            jSONObject.put("scroll_view_signal", jSONObjectL);
            jSONObject.put("lock_screen_signal", jSONObjectI);
            return jSONObject;
        } catch (JSONException e) {
            tr.c("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void n(@androidx.annotation.i0 View view, @androidx.annotation.i0 Map<String, WeakReference<View>> map, @androidx.annotation.i0 Map<String, WeakReference<View>> map2, boolean z) throws JSONException {
        if (!this.t) {
            tr.f("Custom click reporting failed. enableCustomClickGesture is not set.");
            return;
        }
        if (!s()) {
            tr.f("Custom click reporting failed. Ad unit id not whitelisted.");
            return;
        }
        JSONObject jSONObjectE = wq.e(this.f4423a, map, map2, view);
        JSONObject jSONObjectD = wq.d(this.f4423a, view);
        JSONObject jSONObjectL = wq.l(view);
        JSONObject jSONObjectI = wq.i(this.f4423a, view);
        String strU = u(null, map);
        q(view, jSONObjectD, jSONObjectE, jSONObjectL, jSONObjectI, strU, wq.f(strU, this.f4423a, this.v, this.u), null, z, true);
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final void n1(@androidx.annotation.i0 jz2 jz2Var) {
        try {
            if (this.s) {
                return;
            }
            if (jz2Var != null || this.e.D() == null) {
                this.s = true;
                this.p.a(jz2Var.p2());
                b();
            } else {
                this.s = true;
                this.p.a(this.e.D().p2());
                b();
            }
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final boolean o(Bundle bundle) {
        if (v("impression_reporting")) {
            return r(null, null, null, null, null, com.google.android.gms.ads.internal.p.c().h(bundle, null), false);
        }
        tr.g("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
        return false;
    }
}

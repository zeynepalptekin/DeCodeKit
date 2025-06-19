package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k31 implements h31<bl0> {

    /* renamed from: a, reason: collision with root package name */
    private final ek0 f4051a;

    /* renamed from: b, reason: collision with root package name */
    private final cy1 f4052b;

    /* renamed from: c, reason: collision with root package name */
    private final zn0 f4053c;
    private final pn1<up0> d;

    public k31(ek0 ek0Var, cy1 cy1Var, zn0 zn0Var, pn1<up0> pn1Var) {
        this.f4051a = ek0Var;
        this.f4052b = cy1Var;
        this.f4053c = zn0Var;
        this.d = pn1Var;
    }

    private final dy1<bl0> g(final wm1 wm1Var, final km1 km1Var, final JSONObject jSONObject) {
        final dy1<up0> dy1VarA = this.d.a();
        final dy1<nl0> dy1VarA2 = this.f4053c.a(wm1Var, km1Var, jSONObject);
        return qx1.h(dy1VarA, dy1VarA2).a(new Callable(this, dy1VarA2, dy1VarA, wm1Var, km1Var, jSONObject) { // from class: com.google.android.gms.internal.ads.n31

            /* renamed from: a, reason: collision with root package name */
            private final k31 f4482a;

            /* renamed from: b, reason: collision with root package name */
            private final dy1 f4483b;

            /* renamed from: c, reason: collision with root package name */
            private final dy1 f4484c;
            private final wm1 d;
            private final km1 e;
            private final JSONObject f;

            {
                this.f4482a = this;
                this.f4483b = dy1VarA2;
                this.f4484c = dy1VarA;
                this.d = wm1Var;
                this.e = km1Var;
                this.f = jSONObject;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f4482a.c(this.f4483b, this.f4484c, this.d, this.e, this.f);
            }
        }, this.f4052b);
    }

    @Override // com.google.android.gms.internal.ads.u01
    public final boolean a(wm1 wm1Var, km1 km1Var) {
        nm1 nm1Var = km1Var.r;
        return (nm1Var == null || nm1Var.f4571c == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.u01
    public final dy1<List<dy1<bl0>>> b(final wm1 wm1Var, final km1 km1Var) {
        return qx1.j(qx1.j(this.d.a(), new ax1(this, km1Var) { // from class: com.google.android.gms.internal.ads.j31

            /* renamed from: a, reason: collision with root package name */
            private final k31 f3911a;

            /* renamed from: b, reason: collision with root package name */
            private final km1 f3912b;

            {
                this.f3911a = this;
                this.f3912b = km1Var;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f3911a.e(this.f3912b, (up0) obj);
            }
        }, this.f4052b), new ax1(this, wm1Var, km1Var) { // from class: com.google.android.gms.internal.ads.m31

            /* renamed from: a, reason: collision with root package name */
            private final k31 f4337a;

            /* renamed from: b, reason: collision with root package name */
            private final wm1 f4338b;

            /* renamed from: c, reason: collision with root package name */
            private final km1 f4339c;

            {
                this.f4337a = this;
                this.f4338b = wm1Var;
                this.f4339c = km1Var;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f4337a.f(this.f4338b, this.f4339c, (JSONArray) obj);
            }
        }, this.f4052b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ bl0 c(dy1 dy1Var, dy1 dy1Var2, wm1 wm1Var, km1 km1Var, JSONObject jSONObject) throws Exception {
        nl0 nl0Var = (nl0) dy1Var.get();
        up0 up0Var = (up0) dy1Var2.get();
        pl0 pl0VarB = this.f4051a.b(new v70(wm1Var, km1Var, null), new zl0(nl0Var), new pk0(jSONObject, up0Var));
        pl0VarB.i().b();
        pl0VarB.j().a(up0Var);
        pl0VarB.k().c(nl0Var.F());
        return pl0VarB.h();
    }

    final /* synthetic */ dy1 d(up0 up0Var, JSONObject jSONObject) throws Exception {
        this.d.b(qx1.g(up0Var));
        if (jSONObject.optBoolean(FirebaseAnalytics.b.J)) {
            return qx1.g(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new hb("process json failed");
    }

    final /* synthetic */ dy1 e(km1 km1Var, final up0 up0Var) throws Exception {
        JSONObject jSONObjectD = qq.d("isNonagon", Boolean.TRUE);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("response", km1Var.r.f4571c);
        jSONObject.put("sdk_params", jSONObjectD);
        return qx1.j(up0Var.j("google.afma.nativeAds.preProcessJson", jSONObject), new ax1(this, up0Var) { // from class: com.google.android.gms.internal.ads.l31

            /* renamed from: a, reason: collision with root package name */
            private final k31 f4192a;

            /* renamed from: b, reason: collision with root package name */
            private final up0 f4193b;

            {
                this.f4192a = this;
                this.f4193b = up0Var;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f4192a.d(this.f4193b, (JSONObject) obj);
            }
        }, this.f4052b);
    }

    final /* synthetic */ dy1 f(wm1 wm1Var, km1 km1Var, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return qx1.a(new uv0(xn1.NO_FILL));
        }
        int r1 = 0;
        if (wm1Var.f5857a.f5710a.k <= 1) {
            return qx1.i(g(wm1Var, km1Var, jSONArray.getJSONObject(0)), o31.f4639a, this.f4052b);
        }
        int length = jSONArray.length();
        this.d.c(Math.min(length, wm1Var.f5857a.f5710a.k));
        ArrayList arrayList = new ArrayList(wm1Var.f5857a.f5710a.k);
        while (r1 < wm1Var.f5857a.f5710a.k) {
            arrayList.add(r1 < length ? g(wm1Var, km1Var, jSONArray.getJSONObject(r1)) : qx1.a(new uv0(xn1.NO_FILL)));
            r1++;
        }
        return qx1.g(arrayList);
    }
}

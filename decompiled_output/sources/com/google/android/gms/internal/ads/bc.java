package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bc<I, O> implements ax1<I, O> {

    /* renamed from: a, reason: collision with root package name */
    private final ib<O> f2818a;

    /* renamed from: b, reason: collision with root package name */
    private final lb<I> f2819b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2820c;
    private final dy1<cb> d;

    bc(dy1<cb> dy1Var, String str, lb<I> lbVar, ib<O> ibVar) {
        this.d = dy1Var;
        this.f2820c = str;
        this.f2819b = lbVar;
        this.f2818a = ibVar;
    }

    @Override // com.google.android.gms.internal.ads.ax1
    public final dy1<O> a(final I r3) throws Exception {
        return qx1.j(this.d, new ax1(this, r3) { // from class: com.google.android.gms.internal.ads.ec

            /* renamed from: a, reason: collision with root package name */
            private final bc f3249a;

            /* renamed from: b, reason: collision with root package name */
            private final Object f3250b;

            {
                this.f3249a = this;
                this.f3250b = r3;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f3249a.d(this.f3250b, (cb) obj);
            }
        }, cs.f);
    }

    final /* synthetic */ dy1 d(Object obj, cb cbVar) throws Exception {
        ks ksVar = new ks();
        com.google.android.gms.ads.internal.p.c();
        String strQ0 = to.q0();
        f6.p.c(strQ0, new dc(this, ksVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", strQ0);
        jSONObject.put("args", this.f2819b.a(obj));
        cbVar.q(this.f2820c, jSONObject);
        return ksVar;
    }
}

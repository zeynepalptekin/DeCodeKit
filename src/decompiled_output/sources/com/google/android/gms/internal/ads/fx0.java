package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class fx0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3468a;

    /* renamed from: b, reason: collision with root package name */
    private final as f3469b;

    /* renamed from: c, reason: collision with root package name */
    private final an1 f3470c;
    private final Executor d;

    public fx0(Context context, as asVar, an1 an1Var, Executor executor) {
        this.f3468a = context;
        this.f3469b = asVar;
        this.f3470c = an1Var;
        this.d = executor;
    }

    public final dy1<wm1> a() {
        pb pbVarB = com.google.android.gms.ads.internal.p.p().b(this.f3468a, this.f3469b);
        kb<JSONObject> kbVar = ob.f4669b;
        final gb gbVarA = pbVarB.a("google.afma.response.normalize", kbVar, kbVar);
        final aw2 aw2Var = this.f3470c.d.v;
        return qx1.j(qx1.j(qx1.j(qx1.g(""), new ax1(this, aw2Var) { // from class: com.google.android.gms.internal.ads.ix0

            /* renamed from: a, reason: collision with root package name */
            private final fx0 f3878a;

            /* renamed from: b, reason: collision with root package name */
            private final aw2 f3879b;

            {
                this.f3878a = this;
                this.f3879b = aw2Var;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) throws JSONException {
                aw2 aw2Var2 = this.f3879b;
                String str = aw2Var2.d;
                String str2 = aw2Var2.e;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("headers", new JSONObject());
                jSONObject3.put("body", str);
                jSONObject2.put("base_url", "");
                jSONObject2.put("signals", new JSONObject(str2));
                jSONObject.put("request", jSONObject2);
                jSONObject.put("response", jSONObject3);
                jSONObject.put("flags", new JSONObject());
                return qx1.g(jSONObject);
            }
        }, this.d), new ax1(gbVarA) { // from class: com.google.android.gms.internal.ads.hx0

            /* renamed from: a, reason: collision with root package name */
            private final gb f3728a;

            {
                this.f3728a = gbVarA;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f3728a.b((JSONObject) obj);
            }
        }, this.d), new ax1(this) { // from class: com.google.android.gms.internal.ads.kx0

            /* renamed from: a, reason: collision with root package name */
            private final fx0 f4157a;

            {
                this.f4157a = this;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f4157a.b((JSONObject) obj);
            }
        }, this.d);
    }

    final /* synthetic */ dy1 b(JSONObject jSONObject) throws Exception {
        return qx1.g(new wm1(new vm1(this.f3470c), um1.a(new StringReader(jSONObject.toString()))));
    }
}

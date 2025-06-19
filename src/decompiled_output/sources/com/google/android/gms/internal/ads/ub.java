package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class ub<I, O> implements gb<I, O> {

    /* renamed from: a, reason: collision with root package name */
    private final ib<O> f5495a;

    /* renamed from: b, reason: collision with root package name */
    private final lb<I> f5496b;

    /* renamed from: c, reason: collision with root package name */
    private final da f5497c;
    private final String d;

    ub(da daVar, String str, lb<I> lbVar, ib<O> ibVar) {
        this.f5497c = daVar;
        this.d = str;
        this.f5496b = lbVar;
        this.f5495a = ibVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(va vaVar, cb cbVar, I r6, ks<O> ksVar) throws JSONException {
        try {
            com.google.android.gms.ads.internal.p.c();
            String strQ0 = to.q0();
            f6.p.c(strQ0, new vb(this, vaVar, ksVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", strQ0);
            jSONObject.put("args", this.f5496b.a(r6));
            cbVar.q(this.d, jSONObject);
        } catch (Exception e) {
            try {
                ksVar.b(e);
                tr.c("Unable to invokeJavascript", e);
            } finally {
                vaVar.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ax1
    public final dy1<O> a(@androidx.annotation.i0 I r1) throws Exception {
        return b(r1);
    }

    @Override // com.google.android.gms.internal.ads.gb
    public final dy1<O> b(I r4) {
        ks ksVar = new ks();
        va vaVarH = this.f5497c.h(null);
        vaVarH.d(new tb(this, vaVarH, r4, ksVar), new wb(this, ksVar, vaVarH));
        return ksVar;
    }
}

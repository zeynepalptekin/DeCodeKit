package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.measurement.c.a;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g71 extends cf {
    private final String e;
    private final ye f;
    private ks<JSONObject> g;
    private final JSONObject h;

    @GuardedBy("this")
    private boolean i;

    public g71(String str, ye yeVar, ks<JSONObject> ksVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        this.h = jSONObject;
        this.i = false;
        this.g = ksVar;
        this.e = str;
        this.f = yeVar;
        try {
            jSONObject.put("adapter_version", yeVar.b1().toString());
            this.h.put("sdk_version", this.f.I0().toString());
            this.h.put(a.C0190a.f6334b, this.e);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.df
    public final synchronized void O4(String str) throws RemoteException {
        if (this.i) {
            return;
        }
        if (str == null) {
            S("Adapter returned null signals");
            return;
        }
        try {
            this.h.put("signals", str);
        } catch (JSONException unused) {
        }
        this.g.a(this.h);
        this.i = true;
    }

    @Override // com.google.android.gms.internal.ads.df
    public final synchronized void S(String str) throws RemoteException {
        if (this.i) {
            return;
        }
        try {
            this.h.put("signal_error", str);
        } catch (JSONException unused) {
        }
        this.g.a(this.h);
        this.i = true;
    }

    @Override // com.google.android.gms.internal.ads.df
    public final synchronized void g5(dw2 dw2Var) throws RemoteException {
        if (this.i) {
            return;
        }
        try {
            this.h.put("signal_error", dw2Var.e);
        } catch (JSONException unused) {
        }
        this.g.a(this.h);
        this.i = true;
    }
}

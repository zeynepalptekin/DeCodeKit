package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class fs0 {

    /* renamed from: a, reason: collision with root package name */
    private final as0 f3451a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<qc> f3452b = new AtomicReference<>();

    fs0(as0 as0Var) {
        this.f3451a = as0Var;
    }

    private final qc b() throws RemoteException {
        qc qcVar = this.f3452b.get();
        if (qcVar != null) {
            return qcVar;
        }
        tr.i("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    private final vc f(String str, JSONObject jSONObject) throws RemoteException {
        qc qcVarB = b();
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                return qcVarB.F4(jSONObject.getString("class_name")) ? qcVarB.O2("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : qcVarB.O2("com.google.ads.mediation.customevent.CustomEventAdapter");
            } catch (JSONException e) {
                tr.c("Invalid custom event.", e);
            }
        }
        return qcVarB.O2(str);
    }

    public final boolean a() {
        return this.f3452b.get() != null;
    }

    public final void c(qc qcVar) {
        this.f3452b.compareAndSet(null, qcVar);
    }

    public final rn1 d(String str, JSONObject jSONObject) throws in1 {
        try {
            rn1 rn1Var = new rn1("com.google.ads.mediation.admob.AdMobAdapter".equals(str) ? new md(new AdMobAdapter()) : "com.google.ads.mediation.AdUrlAdapter".equals(str) ? new md(new AdUrlAdapter()) : "com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str) ? new md(new zzapx()) : f(str, jSONObject));
            this.f3451a.b(str, rn1Var);
            return rn1Var;
        } catch (Throwable th) {
            throw new in1(th);
        }
    }

    public final ye e(String str) throws RemoteException {
        ye yeVarH5 = b().H5(str);
        this.f3451a.a(str, yeVarH5);
        return yeVarH5;
    }
}

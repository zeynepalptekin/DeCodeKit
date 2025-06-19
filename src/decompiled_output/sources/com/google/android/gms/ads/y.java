package com.google.android.gms.ads;

import android.os.RemoteException;
import androidx.annotation.h0;
import androidx.annotation.i0;
import com.google.android.gms.internal.ads.e0;
import com.google.android.gms.internal.ads.qx2;
import com.google.android.gms.internal.ads.tr;
import com.google.android.gms.internal.ads.tz2;
import com.google.android.gms.internal.ads.uw2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final tz2 f2491a;

    /* renamed from: b, reason: collision with root package name */
    private final List<h> f2492b = new ArrayList();

    private y(tz2 tz2Var) {
        this.f2491a = tz2Var;
        if (((Boolean) qx2.e().c(e0.x5)).booleanValue()) {
            try {
                List<uw2> listJ2 = this.f2491a.j2();
                if (listJ2 != null) {
                    Iterator<uw2> it = listJ2.iterator();
                    while (it.hasNext()) {
                        this.f2492b.add(h.e(it.next()));
                    }
                }
            } catch (RemoteException e) {
                tr.c("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
            }
        }
    }

    @i0
    public static y d(@i0 tz2 tz2Var) {
        if (tz2Var != null) {
            return new y(tz2Var);
        }
        return null;
    }

    @h0
    public final List<h> a() {
        return this.f2492b;
    }

    @i0
    public final String b() {
        try {
            return this.f2491a.e();
        } catch (RemoteException e) {
            tr.c("Could not forward getMediationAdapterClassName to ResponseInfo.", e);
            return null;
        }
    }

    @i0
    public final String c() {
        try {
            return this.f2491a.f4();
        } catch (RemoteException e) {
            tr.c("Could not forward getResponseId to ResponseInfo.", e);
            return null;
        }
    }

    public final JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String strC = c();
        if (strC == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", strC);
        }
        String strB = b();
        if (strB == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", strB);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<h> it = this.f2492b.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().f());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        return jSONObject;
    }

    public final String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}

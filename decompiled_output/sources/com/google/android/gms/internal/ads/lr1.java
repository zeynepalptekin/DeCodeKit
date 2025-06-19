package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class lr1 {

    /* renamed from: a, reason: collision with root package name */
    private final g41 f4297a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4298b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4299c;
    private final String d;
    private final Context e;
    private final zm1 f;
    private final com.google.android.gms.common.util.g g;
    private final i52 h;

    public lr1(g41 g41Var, as asVar, String str, String str2, Context context, @androidx.annotation.i0 zm1 zm1Var, com.google.android.gms.common.util.g gVar, i52 i52Var) {
        this.f4297a = g41Var;
        this.f4298b = asVar.d;
        this.f4299c = str;
        this.d = str2;
        this.e = context;
        this.f = zm1Var;
        this.g = gVar;
        this.h = i52Var;
    }

    private static String d(String str, String str2, @androidx.annotation.i0 String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    @androidx.annotation.i0
    private static String e(@androidx.annotation.i0 String str) {
        return (TextUtils.isEmpty(str) || !nr.a()) ? str : "fakeForAdDebugLog";
    }

    public final List<String> a(km1 km1Var, List<String> list, qj qjVar) {
        ArrayList arrayList = new ArrayList();
        long jA = this.g.a();
        try {
            String strQ = qjVar.q();
            String string = Integer.toString(qjVar.R());
            zm1 zm1Var = this.f;
            String strE = zm1Var == null ? "" : e(zm1Var.f6290a);
            zm1 zm1Var2 = this.f;
            String strE2 = zm1Var2 != null ? e(zm1Var2.f6291b) : "";
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(fn.d(d(d(d(d(d(d(it.next(), "@gw_rwd_userid@", Uri.encode(strE)), "@gw_rwd_custom_data@", Uri.encode(strE2)), "@gw_tmstmp@", Long.toString(jA)), "@gw_rwd_itm@", Uri.encode(strQ)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.f4298b), this.e, km1Var.Q));
            }
            return arrayList;
        } catch (RemoteException e) {
            tr.c("Unable to determine award type and amount.", e);
            return arrayList;
        }
    }

    public final List<String> b(wm1 wm1Var, km1 km1Var, List<String> list) {
        return c(wm1Var, km1Var, false, "", "", list);
    }

    public final List<String> c(wm1 wm1Var, @androidx.annotation.i0 km1 km1Var, boolean z, String str, @androidx.annotation.i0 String str2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        String str3 = z ? "1" : "0";
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String strD = d(d(d(it.next(), "@gw_adlocid@", wm1Var.f5857a.f5710a.f), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.f4298b);
            if (km1Var != null) {
                strD = fn.d(d(d(d(strD, "@gw_qdata@", km1Var.x), "@gw_adnetid@", km1Var.w), "@gw_allocid@", km1Var.v), this.e, km1Var.Q);
            }
            String strD2 = d(d(d(strD, "@gw_adnetstatus@", this.f4297a.e()), "@gw_seqnum@", this.f4299c), "@gw_sessid@", this.d);
            boolean z2 = ((Boolean) qx2.e().c(e0.W1)).booleanValue() && !TextUtils.isEmpty(str);
            boolean zIsEmpty = true ^ TextUtils.isEmpty(str2);
            if (z2 || zIsEmpty) {
                if (this.h.f(Uri.parse(strD2))) {
                    Uri.Builder builderBuildUpon = Uri.parse(strD2).buildUpon();
                    if (z2) {
                        builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                    }
                    if (zIsEmpty) {
                        builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                    }
                    strD2 = builderBuildUpon.build().toString();
                }
            }
            arrayList.add(strD2);
        }
        return arrayList;
    }
}

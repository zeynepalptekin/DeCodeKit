package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.measurement.c.a;
import java.util.Map;

/* loaded from: classes.dex */
public final class g6 implements z6<rw> {
    @Override // com.google.android.gms.internal.ads.z6
    public final /* synthetic */ void a(rw rwVar, Map map) throws NumberFormatException {
        rw rwVar2 = rwVar;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                tr.i("No label given for CSI tick.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                tr.i("No timestamp given for CSI tick.");
                return;
            }
            try {
                long jC = com.google.android.gms.ads.internal.p.j().c() + (Long.parseLong(str4) - com.google.android.gms.ads.internal.p.j().a());
                if (TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                rwVar2.m().b(str2, str3, jC);
                return;
            } catch (NumberFormatException e) {
                tr.d("Malformed timestamp for CSI tick.", e);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                tr.i("No value given for CSI experiment.");
                return;
            }
            v0 v0VarC = rwVar2.m().c();
            if (v0VarC == null) {
                tr.i("No ticker for WebView, dropping experiment ID.");
                return;
            } else {
                v0VarC.d("e", str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get(a.C0190a.f6334b);
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                tr.i("No value given for CSI extra.");
                return;
            }
            if (TextUtils.isEmpty(str6)) {
                tr.i("No name given for CSI extra.");
                return;
            }
            v0 v0VarC2 = rwVar2.m().c();
            if (v0VarC2 == null) {
                tr.i("No ticker for WebView, dropping extra parameter.");
            } else {
                v0VarC2.d(str6, str7);
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g41 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.g f3495a;

    /* renamed from: b, reason: collision with root package name */
    private final i41 f3496b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f3497c = Collections.synchronizedList(new ArrayList());
    private final boolean d = ((Boolean) qx2.e().c(e0.V4)).booleanValue();
    private final x01 e;

    public g41(com.google.android.gms.common.util.g gVar, i41 i41Var, x01 x01Var) {
        this.f3495a = gVar;
        this.f3496b = i41Var;
        this.e = x01Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(String str, int r4, long j, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
        sb.append(str);
        sb.append(".");
        sb.append(r4);
        sb.append(".");
        sb.append(j);
        String string = sb.toString();
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str2).length());
            sb2.append(string);
            sb2.append(".");
            sb2.append(str2);
            string = sb2.toString();
        }
        this.f3497c.add(string);
    }

    final <T> dy1<T> b(lm1 lm1Var, km1 km1Var, dy1<T> dy1Var) {
        long jC = this.f3495a.c();
        String str = km1Var.v;
        if (str != null) {
            qx1.f(dy1Var, new j41(this, jC, str, km1Var, lm1Var), cs.f);
        }
        return dy1Var;
    }

    public final String e() {
        return TextUtils.join("_", this.f3497c);
    }
}

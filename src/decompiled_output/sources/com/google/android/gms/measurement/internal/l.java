package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    final String f6435a;

    /* renamed from: b, reason: collision with root package name */
    final String f6436b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6437c;
    final long d;
    final long e;
    final n f;

    l(b5 b5Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        n nVar;
        com.google.android.gms.common.internal.r.g(str2);
        com.google.android.gms.common.internal.r.g(str3);
        this.f6435a = str2;
        this.f6436b = str3;
        this.f6437c = TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            b5Var.B().I().b("Event created with reverse previous/current timestamps. appId", w3.t(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            nVar = new n(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    b5Var.B().E().a("Param name can't be null");
                } else {
                    Object objH = b5Var.G().H(next, bundle2.get(next));
                    if (objH == null) {
                        b5Var.B().I().b("Param value can't be null", b5Var.H().v(next));
                    } else {
                        b5Var.G().N(bundle2, next, objH);
                    }
                }
                it.remove();
            }
            nVar = new n(bundle2);
        }
        this.f = nVar;
    }

    private l(b5 b5Var, String str, String str2, String str3, long j, long j2, n nVar) {
        com.google.android.gms.common.internal.r.g(str2);
        com.google.android.gms.common.internal.r.g(str3);
        com.google.android.gms.common.internal.r.k(nVar);
        this.f6435a = str2;
        this.f6436b = str3;
        this.f6437c = TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            b5Var.B().I().c("Event created with reverse previous/current timestamps. appId, name", w3.t(str2), w3.t(str3));
        }
        this.f = nVar;
    }

    final l a(b5 b5Var, long j) {
        return new l(b5Var, this.f6437c, this.f6435a, this.f6436b, this.d, j, this.f);
    }

    public final String toString() {
        String str = this.f6435a;
        String str2 = this.f6436b;
        String strValueOf = String.valueOf(this.f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(strValueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(strValueOf);
        sb.append('}');
        return sb.toString();
    }
}

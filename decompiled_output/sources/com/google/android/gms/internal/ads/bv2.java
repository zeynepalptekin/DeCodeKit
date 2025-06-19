package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class bv2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f2884a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2885b;

    public bv2(String str, String str2) {
        this.f2884a = str;
        this.f2885b = str2;
    }

    public final String a() {
        return this.f2884a;
    }

    public final String b() {
        return this.f2885b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bv2.class == obj.getClass()) {
            bv2 bv2Var = (bv2) obj;
            if (TextUtils.equals(this.f2884a, bv2Var.f2884a) && TextUtils.equals(this.f2885b, bv2Var.f2885b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f2884a.hashCode() * 31) + this.f2885b.hashCode();
    }

    public final String toString() {
        String str = this.f2884a;
        String str2 = this.f2885b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}

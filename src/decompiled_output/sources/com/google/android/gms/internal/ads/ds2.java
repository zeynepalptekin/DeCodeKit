package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class ds2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f3171a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3172b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3173c;
    private final boolean d;
    private final os2 e;
    private final at2 f;
    private int n;
    private final Object g = new Object();
    private ArrayList<String> h = new ArrayList<>();
    private ArrayList<String> i = new ArrayList<>();
    private ArrayList<ms2> j = new ArrayList<>();
    private int k = 0;
    private int l = 0;
    private int m = 0;
    private String o = "";
    private String p = "";
    private String q = "";

    public ds2(int r2, int r3, int r4, int r5, int r6, int r7, int r8, boolean z) {
        this.f3171a = r2;
        this.f3172b = r3;
        this.f3173c = r4;
        this.d = z;
        this.e = new os2(r5);
        this.f = new at2(r6, r7, r8);
    }

    private static String b(ArrayList<String> arrayList, int r6) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int r2 = 0;
        while (r2 < size) {
            String str = arrayList.get(r2);
            r2++;
            sb.append(str);
            sb.append(' ');
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String string = sb.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    private final void f(@androidx.annotation.i0 String str, boolean z, float f, float f2, float f3, float f4) {
        if (str == null || str.length() < this.f3173c) {
            return;
        }
        synchronized (this.g) {
            this.h.add(str);
            this.k += str.length();
            if (z) {
                this.i.add(str);
                this.j.add(new ms2(f, f2, f3, f4, this.i.size() - 1));
            }
        }
    }

    @com.google.android.gms.common.util.d0
    private final int g(int r2, int r3) {
        return this.d ? this.f3172b : (r2 * this.f3171a) + (r3 * this.f3172b);
    }

    public final int a() {
        return this.n;
    }

    public final void c(String str, boolean z, float f, float f2, float f3, float f4) {
        f(str, z, f, f2, f3, f4);
        synchronized (this.g) {
            if (this.m < 0) {
                tr.f("ActivityContent: negative number of WebViews.");
            }
            p();
        }
    }

    public final void d(String str, boolean z, float f, float f2, float f3, float f4) {
        f(str, z, f, f2, f3, f4);
    }

    public final void e(int r1) {
        this.l = r1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ds2)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((ds2) obj).o;
        return str != null && str.equals(this.o);
    }

    public final boolean h() {
        boolean z;
        synchronized (this.g) {
            z = this.m == 0;
        }
        return z;
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final String i() {
        return this.o;
    }

    public final String j() {
        return this.p;
    }

    public final String k() {
        return this.q;
    }

    public final void l() {
        synchronized (this.g) {
            this.n -= 100;
        }
    }

    public final void m() {
        synchronized (this.g) {
            this.m--;
        }
    }

    public final void n() {
        synchronized (this.g) {
            this.m++;
        }
    }

    public final void o() {
        synchronized (this.g) {
            int r1 = g(this.k, this.l);
            if (r1 > this.n) {
                this.n = r1;
            }
        }
    }

    public final void p() {
        synchronized (this.g) {
            int r1 = g(this.k, this.l);
            if (r1 > this.n) {
                this.n = r1;
                if (!com.google.android.gms.ads.internal.p.g().r().x()) {
                    this.o = this.e.a(this.h);
                    this.p = this.e.a(this.i);
                }
                if (!com.google.android.gms.ads.internal.p.g().r().j()) {
                    this.q = this.f.a(this.i, this.j);
                }
            }
        }
    }

    @com.google.android.gms.common.util.d0
    final int q() {
        return this.k;
    }

    public final String toString() {
        int r0 = this.l;
        int r1 = this.n;
        int r2 = this.k;
        String strB = b(this.h, 100);
        String strB2 = b(this.i, 100);
        String str = this.o;
        String str2 = this.p;
        String str3 = this.q;
        StringBuilder sb = new StringBuilder(String.valueOf(strB).length() + 165 + String.valueOf(strB2).length() + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(r0);
        sb.append(" score:");
        sb.append(r1);
        sb.append(" total_length:");
        sb.append(r2);
        sb.append("\n text: ");
        sb.append(strB);
        sb.append("\n viewableText");
        sb.append(strB2);
        sb.append("\n signture: ");
        sb.append(str);
        sb.append("\n viewableSignture: ");
        sb.append(str2);
        sb.append("\n viewableSignatureForVertical: ");
        sb.append(str3);
        return sb.toString();
    }
}

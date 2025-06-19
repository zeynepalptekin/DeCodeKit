package com.google.android.gms.ads;

import android.content.Context;
import androidx.recyclerview.widget.m;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.internal.ads.jr;
import com.google.android.gms.internal.ads.qw2;
import com.google.android.gms.internal.ads.qx2;

@d0
/* loaded from: classes.dex */
public final class f {
    public static final int g = -1;
    public static final int h = -2;
    public static final f i = new f(320, 50, "320x50_mb");
    public static final f j = new f(468, 60, "468x60_as");
    public static final f k = new f(320, 100, "320x100_as");
    public static final f l = new f(728, 90, "728x90_as");
    public static final f m = new f(300, m.f.f720c, "300x250_as");
    public static final f n = new f(160, 600, "160x600_as");
    public static final f o = new f(-1, -2, "smart_banner");
    public static final f p = new f(-3, -4, "fluid");
    public static final f q = new f(0, 0, "invalid");
    public static final f r = new f(50, 50, "50x50_mb");
    public static final f s = new f(-3, 0, "search_v2");

    /* renamed from: a, reason: collision with root package name */
    private final int f2390a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2391b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2392c;
    private boolean d;
    private boolean e;
    private int f;

    public f(int r5, int r6) {
        String strValueOf = r5 == -1 ? "FULL" : String.valueOf(r5);
        String strValueOf2 = r6 == -2 ? "AUTO" : String.valueOf(r6);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 4 + String.valueOf(strValueOf2).length());
        sb.append(strValueOf);
        sb.append("x");
        sb.append(strValueOf2);
        sb.append("_as");
        this(r5, r6, sb.toString());
    }

    f(int r2, int r3, String str) {
        if (r2 < 0 && r2 != -1 && r2 != -3) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Invalid width for AdSize: ");
            sb.append(r2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (r3 >= 0 || r3 == -2 || r3 == -4) {
            this.f2390a = r2;
            this.f2391b = r3;
            this.f2392c = str;
        } else {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Invalid height for AdSize: ");
            sb2.append(r3);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static f a(Context context, int r3) {
        f fVarB = jr.b(context, r3, 50, 0);
        fVarB.d = true;
        return fVarB;
    }

    @Deprecated
    public static f b(Context context, int r1) {
        return a(context, r1);
    }

    public static f c(Context context, int r3) {
        int r2 = jr.u(context, 0);
        if (r2 == -1) {
            return q;
        }
        f fVar = new f(r3, 0);
        fVar.f = r2;
        fVar.e = true;
        return fVar;
    }

    public static f f(Context context, int r3) {
        f fVarB = jr.b(context, r3, 50, 2);
        fVarB.d = true;
        return fVarB;
    }

    @Deprecated
    public static f g(Context context, int r1) {
        return f(context, r1);
    }

    public static f h(Context context, int r3) {
        int r2 = jr.u(context, 2);
        f fVar = new f(r3, 0);
        if (r2 == -1) {
            return q;
        }
        fVar.f = r2;
        fVar.e = true;
        return fVar;
    }

    public static f i(Context context, int r3) {
        f fVarB = jr.b(context, r3, 50, 1);
        fVarB.d = true;
        return fVarB;
    }

    @Deprecated
    public static f j(Context context, int r1) {
        return i(context, r1);
    }

    public static f k(Context context, int r4) {
        int r3 = jr.u(context, 1);
        f fVar = new f(r4, 0);
        if (r3 == -1) {
            return q;
        }
        fVar.f = r3;
        fVar.e = true;
        return fVar;
    }

    public final int d() {
        return this.f2391b;
    }

    public final int e(Context context) {
        int r0 = this.f2391b;
        if (r0 == -4 || r0 == -3) {
            return -1;
        }
        if (r0 == -2) {
            return qw2.i(context.getResources().getDisplayMetrics());
        }
        qx2.a();
        return jr.r(context, this.f2391b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f2390a == fVar.f2390a && this.f2391b == fVar.f2391b && this.f2392c.equals(fVar.f2392c);
    }

    public final int hashCode() {
        return this.f2392c.hashCode();
    }

    public final int l() {
        return this.f2390a;
    }

    public final int m(Context context) {
        int r0 = this.f2390a;
        if (r0 == -4 || r0 == -3) {
            return -1;
        }
        if (r0 == -1) {
            return qw2.h(context.getResources().getDisplayMetrics());
        }
        qx2.a();
        return jr.r(context, this.f2390a);
    }

    public final boolean n() {
        return this.f2391b == -2;
    }

    public final boolean o() {
        return this.f2390a == -3 && this.f2391b == -4;
    }

    public final boolean p() {
        return this.f2390a == -1;
    }

    final void q(boolean z) {
        this.e = true;
    }

    final boolean r() {
        return this.d;
    }

    final boolean s() {
        return this.e;
    }

    final int t() {
        return this.f;
    }

    public final String toString() {
        return this.f2392c;
    }

    final void u(int r1) {
        this.f = r1;
    }
}

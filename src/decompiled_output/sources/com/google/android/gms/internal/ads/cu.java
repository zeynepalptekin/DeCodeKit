package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class cu {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3032a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3033b;

    /* renamed from: c, reason: collision with root package name */
    private final as f3034c;

    @androidx.annotation.i0
    private final t0 d;

    @androidx.annotation.i0
    private final v0 e;
    private final long[] g;
    private final String[] h;
    private boolean m;
    private kt n;
    private boolean o;
    private boolean p;
    private final eq f = new jq().a("min_1", Double.MIN_VALUE, 1.0d).a("1_5", 1.0d, 5.0d).a("5_10", 5.0d, 10.0d).a("10_20", 10.0d, 20.0d).a("20_30", 20.0d, 30.0d).a("30_max", 30.0d, Double.MAX_VALUE).e();
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private long q = -1;

    public cu(Context context, as asVar, String str, @androidx.annotation.i0 v0 v0Var, @androidx.annotation.i0 t0 t0Var) {
        this.f3032a = context;
        this.f3034c = asVar;
        this.f3033b = str;
        this.e = v0Var;
        this.d = t0Var;
        String str2 = (String) qx2.e().c(e0.u);
        if (str2 == null) {
            this.h = new String[0];
            this.g = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        this.h = new String[strArrSplit.length];
        this.g = new long[strArrSplit.length];
        for (int r5 = 0; r5 < strArrSplit.length; r5++) {
            try {
                this.g[r5] = Long.parseLong(strArrSplit[r5]);
            } catch (NumberFormatException e) {
                tr.d("Unable to parse frame hash target time number.", e);
                this.g[r5] = -1;
            }
        }
    }

    public final void a() {
        if (!n2.f4476a.a().booleanValue() || this.o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.f3033b);
        bundle.putString("player", this.n.r());
        for (gq gqVar : this.f.c()) {
            String strValueOf = String.valueOf(gqVar.f3566a);
            bundle.putString(strValueOf.length() != 0 ? "fps_c_".concat(strValueOf) : new String("fps_c_"), Integer.toString(gqVar.e));
            String strValueOf2 = String.valueOf(gqVar.f3566a);
            bundle.putString(strValueOf2.length() != 0 ? "fps_p_".concat(strValueOf2) : new String("fps_p_"), Double.toString(gqVar.d));
        }
        int r0 = 0;
        while (true) {
            long[] jArr = this.g;
            if (r0 >= jArr.length) {
                com.google.android.gms.ads.internal.p.c().l(this.f3032a, this.f3034c.d, "gmob-apps", bundle, true);
                this.o = true;
                return;
            }
            String str = this.h[r0];
            if (str != null) {
                String strValueOf3 = String.valueOf(Long.valueOf(jArr[r0]));
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf3).length() + 3);
                sb.append("fh_");
                sb.append(strValueOf3);
                bundle.putString(sb.toString(), str);
            }
            r0++;
        }
    }

    public final void b() {
        this.m = true;
        if (!this.j || this.k) {
            return;
        }
        m0.a(this.e, this.d, "vfp2");
        this.k = true;
    }

    public final void c() {
        this.m = false;
    }

    public final void d(kt ktVar) {
        m0.a(this.e, this.d, "vpc2");
        this.i = true;
        v0 v0Var = this.e;
        if (v0Var != null) {
            v0Var.d("vpn", ktVar.r());
        }
        this.n = ktVar;
    }

    public final void e(kt ktVar) {
        if (this.k && !this.l) {
            if (oo.n() && !this.l) {
                oo.m("VideoMetricsMixin first frame");
            }
            m0.a(this.e, this.d, "vff2");
            this.l = true;
        }
        long jD = com.google.android.gms.ads.internal.p.j().d();
        if (this.m && this.p && this.q != -1) {
            this.f.a(TimeUnit.SECONDS.toNanos(1L) / (jD - this.q));
        }
        this.p = this.m;
        this.q = jD;
        long jLongValue = ((Long) qx2.e().c(e0.v)).longValue();
        long currentPosition = ktVar.getCurrentPosition();
        int r9 = 0;
        while (true) {
            String[] strArr = this.h;
            if (r9 >= strArr.length) {
                return;
            }
            if (strArr[r9] == null && jLongValue > Math.abs(currentPosition - this.g[r9])) {
                String[] strArr2 = this.h;
                int r4 = 8;
                Bitmap bitmap = ktVar.getBitmap(8, 8);
                long j = 63;
                int r8 = 0;
                long j2 = 0;
                while (r8 < r4) {
                    int r12 = 0;
                    while (r12 < r4) {
                        int pixel = bitmap.getPixel(r12, r8);
                        j2 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j);
                        r12++;
                        j--;
                        r4 = 8;
                    }
                    r8++;
                    r4 = 8;
                }
                strArr2[r9] = String.format("%016X", Long.valueOf(j2));
                return;
            }
            r9++;
        }
    }

    public final void f() {
        if (!this.i || this.j) {
            return;
        }
        m0.a(this.e, this.d, "vfr2");
        this.j = true;
    }
}

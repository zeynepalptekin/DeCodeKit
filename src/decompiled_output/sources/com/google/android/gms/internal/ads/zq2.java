package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.WindowManager;

@TargetApi(16)
/* loaded from: classes.dex */
public final class zq2 {

    /* renamed from: a, reason: collision with root package name */
    private final cr2 f6304a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f6305b;

    /* renamed from: c, reason: collision with root package name */
    private final long f6306c;
    private final long d;
    private long e;
    private long f;
    private long g;
    private boolean h;
    private long i;
    private long j;
    private long k;

    public zq2() {
        this(-1.0d);
    }

    private zq2(double d) {
        long j;
        boolean z = d != -1.0d;
        this.f6305b = z;
        if (z) {
            this.f6304a = cr2.a();
            long j2 = (long) (1.0E9d / d);
            this.f6306c = j2;
            j = (j2 * 80) / 100;
        } else {
            this.f6304a = null;
            j = -1;
            this.f6306c = -1L;
        }
        this.d = j;
    }

    public zq2(Context context) {
        this(((WindowManager) context.getSystemService("window")).getDefaultDisplay() != null ? r3.getDefaultDisplay().getRefreshRate() : -1.0d);
    }

    private final boolean d(long j, long j2) {
        return Math.abs((j2 - this.i) - (j - this.j)) > 20000000;
    }

    public final void a() {
        if (this.f6305b) {
            this.f6304a.c();
        }
    }

    public final void b() {
        this.h = false;
        if (this.f6305b) {
            this.f6304a.b();
        }
    }

    public final long c(long j, long j2) {
        long j3;
        long j4;
        long j5;
        long j6 = 1000 * j;
        if (this.h) {
            if (j != this.e) {
                this.k++;
                this.f = this.g;
            }
            long j7 = this.k;
            if (j7 >= 6) {
                j4 = this.f + ((j6 - this.j) / j7);
                if (!d(j4, j2)) {
                    j3 = (this.i + j4) - this.j;
                }
            } else {
                if (d(j6, j2)) {
                }
                j3 = j2;
                j4 = j6;
            }
            this.h = false;
            j3 = j2;
            j4 = j6;
        } else {
            j3 = j2;
            j4 = j6;
        }
        if (!this.h) {
            this.j = j6;
            this.i = j2;
            this.k = 0L;
            this.h = true;
        }
        this.e = j;
        this.g = j4;
        cr2 cr2Var = this.f6304a;
        if (cr2Var == null || cr2Var.d == 0) {
            return j3;
        }
        long j8 = this.f6304a.d;
        long j9 = this.f6306c;
        long j10 = j8 + (((j3 - j8) / j9) * j9);
        if (j3 <= j10) {
            j5 = j10 - j9;
        } else {
            j10 = j9 + j10;
            j5 = j10;
        }
        if (j10 - j3 >= j3 - j5) {
            j10 = j5;
        }
        return j10 - this.d;
    }
}

package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes.dex */
final class on2 implements up2 {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f4719a;

    /* renamed from: b, reason: collision with root package name */
    private final ip2 f4720b;

    /* renamed from: c, reason: collision with root package name */
    private final nn2 f4721c;
    private final yp2 d;
    private volatile boolean f;
    private long h;
    private final /* synthetic */ hn2 j;
    private final tk2 e = new tk2();
    private boolean g = true;
    private long i = -1;

    public on2(hn2 hn2Var, Uri uri, ip2 ip2Var, nn2 nn2Var, yp2 yp2Var) {
        this.j = hn2Var;
        this.f4719a = (Uri) vp2.d(uri);
        this.f4720b = (ip2) vp2.d(ip2Var);
        this.f4721c = (nn2) vp2.d(nn2Var);
        this.d = yp2Var;
    }

    @Override // com.google.android.gms.internal.ads.up2
    public final void a() throws Throwable {
        long position;
        nk2 nk2Var;
        int r1 = 0;
        while (r1 == 0 && !this.f) {
            nk2 nk2Var2 = null;
            try {
                position = this.e.f5416a;
                long jA = this.f4720b.a(new jp2(this.f4719a, position, -1L, this.j.k));
                this.i = jA;
                if (jA != -1) {
                    this.i = jA + position;
                }
                nk2Var = new nk2(this.f4720b, position, this.i);
            } catch (Throwable th) {
                th = th;
            }
            try {
                mk2 mk2VarB = this.f4721c.b(nk2Var, this.f4720b.s1());
                if (this.g) {
                    mk2VarB.e(position, this.h);
                    this.g = false;
                }
                while (r1 == 0 && !this.f) {
                    this.d.a();
                    r1 = mk2VarB.h(nk2Var, this.e);
                    if (nk2Var.getPosition() > this.j.l + position) {
                        position = nk2Var.getPosition();
                        this.d.c();
                        this.j.r.post(this.j.q);
                    }
                }
                if (r1 == 1) {
                    r1 = 0;
                } else {
                    this.e.f5416a = nk2Var.getPosition();
                }
                nq2.e(this.f4720b);
            } catch (Throwable th2) {
                th = th2;
                nk2Var2 = nk2Var;
                if (r1 != 1 && nk2Var2 != null) {
                    this.e.f5416a = nk2Var2.getPosition();
                }
                nq2.e(this.f4720b);
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.up2
    public final void b() {
        this.f = true;
    }

    @Override // com.google.android.gms.internal.ads.up2
    public final boolean c() {
        return this.f;
    }

    public final void e(long j, long j2) {
        this.e.f5416a = j;
        this.h = j2;
        this.g = true;
    }
}

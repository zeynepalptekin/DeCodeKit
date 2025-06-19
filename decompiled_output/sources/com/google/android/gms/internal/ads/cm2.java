package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Stack;

/* loaded from: classes.dex */
public final class cm2 implements mk2, wk2 {
    private static final sk2 p = new fm2();
    private static final int q = nq2.l("qt  ");
    private int e;
    private int f;
    private long g;
    private int h;
    private hq2 i;
    private int j;
    private int k;
    private ok2 l;
    private em2[] m;
    private long n;
    private boolean o;

    /* renamed from: c, reason: collision with root package name */
    private final hq2 f2996c = new hq2(16);
    private final Stack<ml2> d = new Stack<>();

    /* renamed from: a, reason: collision with root package name */
    private final hq2 f2994a = new hq2(cq2.f3017a);

    /* renamed from: b, reason: collision with root package name */
    private final hq2 f2995b = new hq2(4);

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void i(long r20) throws com.google.android.gms.internal.ads.ki2 {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cm2.i(long):void");
    }

    private final void j() {
        this.e = 0;
        this.h = 0;
    }

    @Override // com.google.android.gms.internal.ads.mk2
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final long b(long j) {
        long j2 = Long.MAX_VALUE;
        for (em2 em2Var : this.m) {
            lm2 lm2Var = em2Var.f3290b;
            int r6 = lm2Var.a(j);
            if (r6 == -1) {
                r6 = lm2Var.b(j);
            }
            long j3 = lm2Var.f4278b[r6];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final boolean c() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.mk2
    public final boolean d(pk2 pk2Var) throws InterruptedException, IOException {
        return hm2.c(pk2Var);
    }

    @Override // com.google.android.gms.internal.ads.mk2
    public final void e(long j, long j2) {
        this.d.clear();
        this.h = 0;
        this.j = 0;
        this.k = 0;
        if (j == 0) {
            j();
            return;
        }
        em2[] em2VarArr = this.m;
        if (em2VarArr != null) {
            for (em2 em2Var : em2VarArr) {
                lm2 lm2Var = em2Var.f3290b;
                int r3 = lm2Var.a(j2);
                if (r3 == -1) {
                    r3 = lm2Var.b(j2);
                }
                em2Var.d = r3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.mk2
    public final void f(ok2 ok2Var) {
        this.l = ok2Var;
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final long g() {
        return this.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ea  */
    @Override // com.google.android.gms.internal.ads.mk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.google.android.gms.internal.ads.pk2 r24, com.google.android.gms.internal.ads.tk2 r25) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cm2.h(com.google.android.gms.internal.ads.pk2, com.google.android.gms.internal.ads.tk2):int");
    }
}

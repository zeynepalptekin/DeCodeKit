package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/* loaded from: classes.dex */
public final class zl2 implements mk2 {
    private static final sk2 E = new yl2();
    private static final int F = nq2.l("seig");
    private static final byte[] G = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private ok2 A;
    private yk2 B;
    private yk2[] C;
    private boolean D;

    /* renamed from: a, reason: collision with root package name */
    private final int f6285a;

    /* renamed from: b, reason: collision with root package name */
    private final gm2 f6286b;

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray<am2> f6287c;
    private final hq2 d;
    private final hq2 e;
    private final hq2 f;
    private final hq2 g;
    private final lq2 h;
    private final hq2 i;
    private final byte[] j;
    private final Stack<ml2> k;
    private final LinkedList<bm2> l;
    private int m;
    private int n;
    private long o;
    private int p;
    private hq2 q;
    private long r;
    private int s;
    private long t;
    private long u;
    private am2 v;
    private int w;
    private int x;
    private int y;
    private boolean z;

    public zl2() {
        this(0);
    }

    private zl2(int r2) {
        this(0, null);
    }

    private zl2(int r1, lq2 lq2Var) {
        this(0, null, null);
    }

    private zl2(int r1, lq2 lq2Var, gm2 gm2Var) {
        this.f6285a = r1;
        this.h = null;
        this.f6286b = null;
        this.i = new hq2(16);
        this.d = new hq2(cq2.f3017a);
        this.e = new hq2(5);
        this.f = new hq2();
        this.g = new hq2(1);
        this.j = new byte[16];
        this.k = new Stack<>();
        this.l = new LinkedList<>();
        this.f6287c = new SparseArray<>();
        this.t = -9223372036854775807L;
        this.u = -9223372036854775807L;
        i();
    }

    private static void b(hq2 hq2Var, int r4, im2 im2Var) throws ki2 {
        hq2Var.l(r4 + 8);
        int r42 = jl2.b(hq2Var.d());
        if ((r42 & 1) != 0) {
            throw new ki2("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (r42 & 2) != 0;
        int r1 = hq2Var.v();
        if (r1 == im2Var.f) {
            Arrays.fill(im2Var.n, 0, r1, z);
            im2Var.a(hq2Var.q());
            hq2Var.p(im2Var.q.f3710a, 0, im2Var.p);
            im2Var.q.l(0);
            im2Var.r = false;
            return;
        }
        int r43 = im2Var.f;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Length mismatch: ");
        sb.append(r1);
        sb.append(", ");
        sb.append(r43);
        throw new ki2(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.ek2 c(java.util.List<com.google.android.gms.internal.ads.ll2> r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L8:
            if (r3 >= r0) goto Lb9
            java.lang.Object r5 = r14.get(r3)
            com.google.android.gms.internal.ads.ll2 r5 = (com.google.android.gms.internal.ads.ll2) r5
            int r6 = r5.f3993a
            int r7 = com.google.android.gms.internal.ads.jl2.V
            if (r6 != r7) goto Lb5
            if (r4 != 0) goto L1d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1d:
            com.google.android.gms.internal.ads.hq2 r5 = r5.Q0
            byte[] r5 = r5.f3710a
            com.google.android.gms.internal.ads.hq2 r6 = new com.google.android.gms.internal.ads.hq2
            r6.<init>(r5)
            int r7 = r6.c()
            r8 = 32
            if (r7 >= r8) goto L30
        L2e:
            r6 = r2
            goto L99
        L30:
            r6.l(r1)
            int r7 = r6.d()
            int r8 = r6.q()
            int r8 = r8 + 4
            if (r7 == r8) goto L40
            goto L2e
        L40:
            int r7 = r6.d()
            int r8 = com.google.android.gms.internal.ads.jl2.V
            if (r7 == r8) goto L49
            goto L2e
        L49:
            int r7 = r6.d()
            int r7 = com.google.android.gms.internal.ads.jl2.a(r7)
            r8 = 1
            if (r7 <= r8) goto L6d
            r6 = 37
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            java.lang.String r6 = "Unsupported pssh version: "
            r8.append(r6)
            r8.append(r7)
            java.lang.String r6 = r8.toString()
            java.lang.String r7 = "PsshAtomUtil"
            android.util.Log.w(r7, r6)
            goto L2e
        L6d:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.e()
            long r12 = r6.e()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L85
            int r7 = r6.v()
            int r7 = r7 << 4
            r6.m(r7)
        L85:
            int r7 = r6.v()
            int r8 = r6.q()
            if (r7 == r8) goto L90
            goto L2e
        L90:
            byte[] r8 = new byte[r7]
            r6.p(r8, r1, r7)
            android.util.Pair r6 = android.util.Pair.create(r9, r8)
        L99:
            if (r6 != 0) goto L9d
            r6 = r2
            goto La1
        L9d:
            java.lang.Object r6 = r6.first
            java.util.UUID r6 = (java.util.UUID) r6
        La1:
            if (r6 != 0) goto Lab
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            android.util.Log.w(r5, r6)
            goto Lb5
        Lab:
            com.google.android.gms.internal.ads.ek2$a r7 = new com.google.android.gms.internal.ads.ek2$a
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5)
            r4.add(r7)
        Lb5:
            int r3 = r3 + 1
            goto L8
        Lb9:
            if (r4 != 0) goto Lbc
            return r2
        Lbc:
            com.google.android.gms.internal.ads.ek2 r14 = new com.google.android.gms.internal.ads.ek2
            r14.<init>(r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zl2.c(java.util.List):com.google.android.gms.internal.ads.ek2");
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0684  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g(long r54) throws com.google.android.gms.internal.ads.ki2 {
        /*
            Method dump skipped, instructions count: 1773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zl2.g(long):void");
    }

    private final void i() {
        this.m = 0;
        this.p = 0;
    }

    @Override // com.google.android.gms.internal.ads.mk2
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.mk2
    public final boolean d(pk2 pk2Var) throws InterruptedException, IOException {
        return hm2.b(pk2Var);
    }

    @Override // com.google.android.gms.internal.ads.mk2
    public final void e(long j, long j2) {
        int size = this.f6287c.size();
        for (int r3 = 0; r3 < size; r3++) {
            this.f6287c.valueAt(r3).a();
        }
        this.l.clear();
        this.s = 0;
        this.k.clear();
        i();
    }

    @Override // com.google.android.gms.internal.ads.mk2
    public final void f(ok2 ok2Var) {
        this.A = ok2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c0 A[LOOP:7: B:68:0x01c0->B:70:0x01c6, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01dc  */
    @Override // com.google.android.gms.internal.ads.mk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.google.android.gms.internal.ads.pk2 r26, com.google.android.gms.internal.ads.tk2 r27) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zl2.h(com.google.android.gms.internal.ads.pk2, com.google.android.gms.internal.ads.tk2):int");
    }
}

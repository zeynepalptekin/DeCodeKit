package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Stack;

/* loaded from: classes.dex */
final class al2 implements bl2 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f2706a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private final Stack<cl2> f2707b = new Stack<>();

    /* renamed from: c, reason: collision with root package name */
    private final kl2 f2708c = new kl2();
    private el2 d;
    private int e;
    private int f;
    private long g;

    al2() {
    }

    private final long d(pk2 pk2Var, int r8) throws InterruptedException, IOException {
        pk2Var.readFully(this.f2706a, 0, r8);
        long j = 0;
        for (int r1 = 0; r1 < r8; r1++) {
            j = (j << 8) | (this.f2706a[r1] & 255);
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.bl2
    public final void a() {
        this.e = 0;
        this.f2707b.clear();
        this.f2708c.a();
    }

    @Override // com.google.android.gms.internal.ads.bl2
    public final void b(el2 el2Var) {
        this.d = el2Var;
    }

    @Override // com.google.android.gms.internal.ads.bl2
    public final boolean c(pk2 pk2Var) throws InterruptedException, IOException {
        String str;
        int r0;
        int r5;
        vp2.e(this.d != null);
        while (true) {
            if (!this.f2707b.isEmpty() && pk2Var.getPosition() >= this.f2707b.peek().f2991b) {
                this.d.E(this.f2707b.pop().f2990a);
                return true;
            }
            if (this.e == 0) {
                long jB = this.f2708c.b(pk2Var, true, false, 4);
                if (jB == -2) {
                    pk2Var.c();
                    while (true) {
                        pk2Var.a(this.f2706a, 0, 4);
                        r0 = kl2.d(this.f2706a[0]);
                        if (r0 != -1 && r0 <= 4) {
                            r5 = (int) kl2.c(this.f2706a, r0, false);
                            if (this.d.C(r5)) {
                                break;
                            }
                        }
                        pk2Var.e(1);
                    }
                    pk2Var.e(r0);
                    jB = r5;
                }
                if (jB == -1) {
                    return false;
                }
                this.f = (int) jB;
                this.e = 1;
            }
            if (this.e == 1) {
                this.g = this.f2708c.b(pk2Var, false, true, 8);
                this.e = 2;
            }
            int r02 = this.d.B(this.f);
            if (r02 != 0) {
                if (r02 == 1) {
                    long position = pk2Var.getPosition();
                    this.f2707b.add(new cl2(this.f, this.g + position));
                    this.d.A(this.f, position, this.g);
                    this.e = 0;
                    return true;
                }
                if (r02 == 2) {
                    long j = this.g;
                    if (j <= 8) {
                        this.d.l(this.f, d(pk2Var, (int) j));
                        this.e = 0;
                        return true;
                    }
                    long j2 = this.g;
                    StringBuilder sb = new StringBuilder(42);
                    sb.append("Invalid integer size: ");
                    sb.append(j2);
                    throw new ki2(sb.toString());
                }
                if (r02 == 3) {
                    long j3 = this.g;
                    if (j3 > 2147483647L) {
                        long j4 = this.g;
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("String element size: ");
                        sb2.append(j4);
                        throw new ki2(sb2.toString());
                    }
                    el2 el2Var = this.d;
                    int r52 = this.f;
                    int r4 = (int) j3;
                    if (r4 == 0) {
                        str = "";
                    } else {
                        byte[] bArr = new byte[r4];
                        pk2Var.readFully(bArr, 0, r4);
                        str = new String(bArr);
                    }
                    el2Var.t(r52, str);
                    this.e = 0;
                    return true;
                }
                if (r02 == 4) {
                    this.d.D(this.f, (int) this.g, pk2Var);
                    this.e = 0;
                    return true;
                }
                if (r02 != 5) {
                    StringBuilder sb3 = new StringBuilder(32);
                    sb3.append("Invalid element type ");
                    sb3.append(r02);
                    throw new ki2(sb3.toString());
                }
                long j5 = this.g;
                if (j5 != 4 && j5 != 8) {
                    long j6 = this.g;
                    StringBuilder sb4 = new StringBuilder(40);
                    sb4.append("Invalid float size: ");
                    sb4.append(j6);
                    throw new ki2(sb4.toString());
                }
                el2 el2Var2 = this.d;
                int r42 = this.f;
                int r6 = (int) this.g;
                el2Var2.z(r42, r6 == 4 ? Float.intBitsToFloat((int) r7) : Double.longBitsToDouble(d(pk2Var, r6)));
                this.e = 0;
                return true;
            }
            pk2Var.e((int) this.g);
            this.e = 0;
        }
    }
}

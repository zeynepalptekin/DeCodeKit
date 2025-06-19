package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
final class wn2 implements rn2, vn2 {
    public final rn2[] d;
    private final IdentityHashMap<ho2, Integer> e = new IdentityHashMap<>();
    private vn2 f;
    private int g;
    private ko2 h;
    private rn2[] i;
    private go2 j;

    public wn2(rn2... rn2VarArr) {
        this.d = rn2VarArr;
    }

    @Override // com.google.android.gms.internal.ads.rn2, com.google.android.gms.internal.ads.go2
    public final long a() {
        return this.j.a();
    }

    @Override // com.google.android.gms.internal.ads.rn2, com.google.android.gms.internal.ads.go2
    public final boolean b(long j) {
        return this.j.b(j);
    }

    @Override // com.google.android.gms.internal.ads.vn2
    public final void c(rn2 rn2Var) {
        int r11 = this.g - 1;
        this.g = r11;
        if (r11 > 0) {
            return;
        }
        int r3 = 0;
        for (rn2 rn2Var2 : this.d) {
            r3 += rn2Var2.q().f4129a;
        }
        lo2[] lo2VarArr = new lo2[r3];
        int r4 = 0;
        for (rn2 rn2Var3 : this.d) {
            ko2 ko2VarQ = rn2Var3.q();
            int r6 = ko2VarQ.f4129a;
            int r7 = 0;
            while (r7 < r6) {
                lo2VarArr[r4] = ko2VarQ.b(r7);
                r7++;
                r4++;
            }
        }
        this.h = new ko2(lo2VarArr);
        this.f.c(this);
    }

    @Override // com.google.android.gms.internal.ads.rn2
    public final void d(vn2 vn2Var, long j) {
        this.f = vn2Var;
        rn2[] rn2VarArr = this.d;
        this.g = rn2VarArr.length;
        for (rn2 rn2Var : rn2VarArr) {
            rn2Var.d(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.rn2
    public final void e(long j) {
        for (rn2 rn2Var : this.i) {
            rn2Var.e(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.jo2
    public final /* synthetic */ void f(go2 go2Var) {
        if (this.h != null) {
            this.f.f(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.rn2
    public final long g(xo2[] xo2VarArr, boolean[] zArr, ho2[] ho2VarArr, boolean[] zArr2, long j) {
        ho2[] ho2VarArr2 = ho2VarArr;
        int[] r3 = new int[xo2VarArr.length];
        int[] r4 = new int[xo2VarArr.length];
        for (int r6 = 0; r6 < xo2VarArr.length; r6++) {
            r3[r6] = ho2VarArr2[r6] == null ? -1 : this.e.get(ho2VarArr2[r6]).intValue();
            r4[r6] = -1;
            if (xo2VarArr[r6] != null) {
                lo2 lo2VarA = xo2VarArr[r6].a();
                int r9 = 0;
                while (true) {
                    rn2[] rn2VarArr = this.d;
                    if (r9 >= rn2VarArr.length) {
                        break;
                    }
                    if (rn2VarArr[r9].q().a(lo2VarA) != -1) {
                        r4[r6] = r9;
                        break;
                    }
                    r9++;
                }
            }
        }
        this.e.clear();
        int length = xo2VarArr.length;
        ho2[] ho2VarArr3 = new ho2[length];
        ho2[] ho2VarArr4 = new ho2[xo2VarArr.length];
        xo2[] xo2VarArr2 = new xo2[xo2VarArr.length];
        ArrayList arrayList = new ArrayList(this.d.length);
        long j2 = j;
        int r13 = 0;
        while (r13 < this.d.length) {
            for (int r92 = 0; r92 < xo2VarArr.length; r92++) {
                xo2 xo2Var = null;
                ho2VarArr4[r92] = r3[r92] == r13 ? ho2VarArr2[r92] : null;
                if (r4[r92] == r13) {
                    xo2Var = xo2VarArr[r92];
                }
                xo2VarArr2[r92] = xo2Var;
            }
            int r5 = r13;
            xo2[] xo2VarArr3 = xo2VarArr2;
            ArrayList arrayList2 = arrayList;
            long jG = this.d[r13].g(xo2VarArr2, zArr, ho2VarArr4, zArr2, j2);
            if (r5 == 0) {
                j2 = jG;
            } else if (jG != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int r93 = 0; r93 < xo2VarArr.length; r93++) {
                if (r4[r93] == r5) {
                    vp2.e(ho2VarArr4[r93] != null);
                    ho2VarArr3[r93] = ho2VarArr4[r93];
                    this.e.put(ho2VarArr4[r93], Integer.valueOf(r5));
                    z = true;
                } else if (r3[r93] == r5) {
                    vp2.e(ho2VarArr4[r93] == null);
                }
            }
            if (z) {
                arrayList2.add(this.d[r5]);
            }
            r13 = r5 + 1;
            arrayList = arrayList2;
            xo2VarArr2 = xo2VarArr3;
            ho2VarArr2 = ho2VarArr;
        }
        ho2[] ho2VarArr5 = ho2VarArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(ho2VarArr3, 0, ho2VarArr5, 0, length);
        rn2[] rn2VarArr2 = new rn2[arrayList3.size()];
        this.i = rn2VarArr2;
        arrayList3.toArray(rn2VarArr2);
        this.j = new in2(this.i);
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.rn2
    public final long h() {
        long jH = this.d[0].h();
        int r0 = 1;
        while (true) {
            rn2[] rn2VarArr = this.d;
            if (r0 >= rn2VarArr.length) {
                if (jH != -9223372036854775807L) {
                    for (rn2 rn2Var : this.i) {
                        if (rn2Var != this.d[0] && rn2Var.o(jH) != jH) {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return jH;
            }
            if (rn2VarArr[r0].h() != -9223372036854775807L) {
                throw new IllegalStateException("Child reported discontinuity");
            }
            r0++;
        }
    }

    @Override // com.google.android.gms.internal.ads.rn2
    public final void j() throws IOException {
        for (rn2 rn2Var : this.d) {
            rn2Var.j();
        }
    }

    @Override // com.google.android.gms.internal.ads.rn2
    public final long n() {
        long jMin = Long.MAX_VALUE;
        for (rn2 rn2Var : this.i) {
            long jN = rn2Var.n();
            if (jN != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jN);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.rn2
    public final long o(long j) {
        long jO = this.i[0].o(j);
        int r0 = 1;
        while (true) {
            rn2[] rn2VarArr = this.i;
            if (r0 >= rn2VarArr.length) {
                return jO;
            }
            if (rn2VarArr[r0].o(jO) != jO) {
                throw new IllegalStateException("Children seeked to different positions");
            }
            r0++;
        }
    }

    @Override // com.google.android.gms.internal.ads.rn2
    public final ko2 q() {
        return this.h;
    }
}

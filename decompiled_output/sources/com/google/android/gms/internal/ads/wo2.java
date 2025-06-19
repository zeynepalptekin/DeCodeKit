package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class wo2 extends cp2 {

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<Map<ko2, yo2>> f5871b = new SparseArray<>();

    /* renamed from: c, reason: collision with root package name */
    private final SparseBooleanArray f5872c = new SparseBooleanArray();
    private int d = 0;
    private uo2 e;

    @Override // com.google.android.gms.internal.ads.cp2
    public final ep2 b(li2[] li2VarArr, ko2 ko2Var) throws sh2 {
        int[] r6;
        int[] r3 = new int[li2VarArr.length + 1];
        int length = li2VarArr.length + 1;
        lo2[][] lo2VarArr = new lo2[length][];
        int[][][] r11 = new int[li2VarArr.length + 1][][];
        for (int r7 = 0; r7 < length; r7++) {
            int r8 = ko2Var.f4129a;
            lo2VarArr[r7] = new lo2[r8];
            r11[r7] = new int[r8][];
        }
        int length2 = li2VarArr.length;
        int[] r10 = new int[length2];
        for (int r72 = 0; r72 < length2; r72++) {
            r10[r72] = li2VarArr[r72].c();
        }
        for (int r4 = 0; r4 < ko2Var.f4129a; r4++) {
            lo2 lo2VarB = ko2Var.b(r4);
            int length3 = li2VarArr.length;
            int r12 = 0;
            for (int r9 = 0; r9 < li2VarArr.length; r9++) {
                li2 li2Var = li2VarArr[r9];
                for (int r14 = 0; r14 < lo2VarB.f4287a; r14++) {
                    int r15 = li2Var.d(lo2VarB.a(r14)) & 3;
                    if (r15 > r12) {
                        length3 = r9;
                        if (r15 == 3) {
                            break;
                        }
                        r12 = r15;
                    }
                }
            }
            if (length3 == li2VarArr.length) {
                r6 = new int[lo2VarB.f4287a];
            } else {
                li2 li2Var2 = li2VarArr[length3];
                int[] r92 = new int[lo2VarB.f4287a];
                for (int r122 = 0; r122 < lo2VarB.f4287a; r122++) {
                    r92[r122] = li2Var2.d(lo2VarB.a(r122));
                }
                r6 = r92;
            }
            int r93 = r3[length3];
            lo2VarArr[length3][r93] = lo2VarB;
            r11[length3][r93] = r6;
            r3[length3] = r3[length3] + 1;
        }
        ko2[] ko2VarArr = new ko2[li2VarArr.length];
        int[] r82 = new int[li2VarArr.length];
        for (int r42 = 0; r42 < li2VarArr.length; r42++) {
            int r62 = r3[r42];
            ko2VarArr[r42] = new ko2((lo2[]) Arrays.copyOf(lo2VarArr[r42], r62));
            r11[r42] = (int[][]) Arrays.copyOf(r11[r42], r62);
            r82[r42] = li2VarArr[r42].a();
        }
        ko2 ko2Var2 = new ko2((lo2[]) Arrays.copyOf(lo2VarArr[li2VarArr.length], r3[li2VarArr.length]));
        xo2[] xo2VarArrE = e(li2VarArr, ko2VarArr, r11);
        int r43 = 0;
        while (true) {
            if (r43 >= li2VarArr.length) {
                uo2 uo2Var = new uo2(r82, ko2VarArr, r10, r11, ko2Var2);
                oi2[] oi2VarArr = new oi2[li2VarArr.length];
                for (int r73 = 0; r73 < li2VarArr.length; r73++) {
                    oi2VarArr[r73] = xo2VarArrE[r73] != null ? oi2.f4699b : null;
                }
                return new ep2(ko2Var, new zo2(xo2VarArrE), uo2Var, oi2VarArr);
            }
            if (this.f5872c.get(r43)) {
                xo2VarArrE[r43] = null;
            } else {
                ko2 ko2Var3 = ko2VarArr[r43];
                Map<ko2, yo2> map = this.f5871b.get(r43);
                if ((map != null ? map.get(ko2Var3) : null) != null) {
                    throw new NoSuchMethodError();
                }
            }
            r43++;
        }
    }

    @Override // com.google.android.gms.internal.ads.cp2
    public final void d(Object obj) {
        this.e = (uo2) obj;
    }

    protected abstract xo2[] e(li2[] li2VarArr, ko2[] ko2VarArr, int[][][] r3) throws sh2;

    public final void f(int r2, boolean z) {
        if (this.f5872c.get(r2) == z) {
            return;
        }
        this.f5872c.put(r2, z);
        a();
    }
}

package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class pq2 {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f4870a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4871b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4872c;
    private final int d;
    public final float e;

    private pq2(List<byte[]> list, int r2, int r3, int r4, float f) {
        this.f4870a = list;
        this.f4871b = r2;
        this.f4872c = r3;
        this.d = r4;
        this.e = f;
    }

    public static pq2 a(hq2 hq2Var) throws ki2 {
        int r5;
        int r6;
        float f;
        try {
            hq2Var.m(4);
            int r4 = (hq2Var.g() & 3) + 1;
            if (r4 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int r0 = hq2Var.g() & 31;
            for (int r2 = 0; r2 < r0; r2++) {
                arrayList.add(b(hq2Var));
            }
            int r22 = hq2Var.g();
            for (int r52 = 0; r52 < r22; r52++) {
                arrayList.add(b(hq2Var));
            }
            if (r0 > 0) {
                fq2 fq2VarC = cq2.c((byte[]) arrayList.get(0), r4, ((byte[]) arrayList.get(0)).length);
                int r02 = fq2VarC.f3440b;
                int r1 = fq2VarC.f3441c;
                f = fq2VarC.d;
                r5 = r02;
                r6 = r1;
            } else {
                r5 = -1;
                r6 = -1;
                f = 1.0f;
            }
            return new pq2(arrayList, r4, r5, r6, f);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ki2("Error parsing AVC config", e);
        }
    }

    private static byte[] b(hq2 hq2Var) {
        int r0 = hq2Var.h();
        int r1 = hq2Var.b();
        hq2Var.m(r0);
        return zp2.c(hq2Var.f3710a, r1, r0);
    }
}

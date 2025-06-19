package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class vq2 {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f5722a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5723b;

    private vq2(List<byte[]> list, int r2) {
        this.f5722a = list;
        this.f5723b = r2;
    }

    public static vq2 a(hq2 hq2Var) throws ki2 {
        try {
            hq2Var.m(21);
            int r0 = hq2Var.g() & 3;
            int r1 = hq2Var.g();
            int r2 = hq2Var.b();
            int r5 = 0;
            for (int r4 = 0; r4 < r1; r4++) {
                hq2Var.m(1);
                int r6 = hq2Var.h();
                for (int r7 = 0; r7 < r6; r7++) {
                    int r8 = hq2Var.h();
                    r5 += r8 + 4;
                    hq2Var.m(r8);
                }
            }
            hq2Var.l(r2);
            byte[] bArr = new byte[r5];
            int r72 = 0;
            for (int r42 = 0; r42 < r1; r42++) {
                hq2Var.m(1);
                int r82 = hq2Var.h();
                for (int r9 = 0; r9 < r82; r9++) {
                    int r10 = hq2Var.h();
                    System.arraycopy(cq2.f3017a, 0, bArr, r72, cq2.f3017a.length);
                    int length = r72 + cq2.f3017a.length;
                    System.arraycopy(hq2Var.f3710a, hq2Var.b(), bArr, length, r10);
                    r72 = length + r10;
                    hq2Var.m(r10);
                }
            }
            return new vq2(r5 == 0 ? null : Collections.singletonList(bArr), r0 + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ki2("Error parsing HEVC config", e);
        }
    }
}

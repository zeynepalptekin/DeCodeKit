package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class mo2 {
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(long r16, com.google.android.gms.internal.ads.hq2 r18, com.google.android.gms.internal.ads.yk2[] r19) {
        /*
            r0 = r18
            r1 = r19
        L4:
            int r2 = r18.q()
            r3 = 1
            if (r2 <= r3) goto L92
            int r2 = b(r18)
            int r4 = b(r18)
            r5 = -1
            if (r4 == r5) goto L82
            int r5 = r18.q()
            if (r4 <= r5) goto L1d
            goto L82
        L1d:
            r5 = 4
            r6 = 3
            r7 = 8
            r8 = 0
            if (r2 != r5) goto L4f
            if (r4 >= r7) goto L27
            goto L4f
        L27:
            int r2 = r18.b()
            int r5 = r18.g()
            int r9 = r18.h()
            int r10 = r18.d()
            int r11 = r18.g()
            r0.l(r2)
            r2 = 181(0xb5, float:2.54E-43)
            if (r5 != r2) goto L4f
            r2 = 49
            if (r9 != r2) goto L4f
            r2 = 1195456820(0x47413934, float:49465.203)
            if (r10 != r2) goto L4f
            if (r11 != r6) goto L4f
            r2 = 1
            goto L50
        L4f:
            r2 = 0
        L50:
            if (r2 == 0) goto L7e
            r0.m(r7)
            int r2 = r18.g()
            r2 = r2 & 31
            r0.m(r3)
            int r2 = r2 * 3
            int r3 = r18.b()
            int r5 = r1.length
        L65:
            if (r8 >= r5) goto L7b
            r9 = r1[r8]
            r0.l(r3)
            r9.c(r0, r2)
            r12 = 1
            r14 = 0
            r15 = 0
            r10 = r16
            r13 = r2
            r9.b(r10, r12, r13, r14, r15)
            int r8 = r8 + 1
            goto L65
        L7b:
            int r2 = r2 + 10
            int r4 = r4 - r2
        L7e:
            r0.m(r4)
            goto L4
        L82:
            java.lang.String r2 = "CeaUtil"
            java.lang.String r3 = "Skipping remainder of malformed SEI NAL unit."
            android.util.Log.w(r2, r3)
            int r2 = r18.c()
            r0.l(r2)
            goto L4
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mo2.a(long, com.google.android.gms.internal.ads.hq2, com.google.android.gms.internal.ads.yk2[]):void");
    }

    private static int b(hq2 hq2Var) {
        int r0 = 0;
        while (hq2Var.q() != 0) {
            int r1 = hq2Var.g();
            r0 += r1;
            if (r1 != 255) {
                return r0;
            }
        }
        return -1;
    }
}

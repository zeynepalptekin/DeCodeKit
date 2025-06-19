package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class vn1 {
    public static dw2 a(xn1 xn1Var, dw2 dw2Var) {
        if (xn1Var.equals(xn1.MEDIATION_SHOW_ERROR)) {
            if (((Integer) qx2.e().c(e0.v5)).intValue() > 0) {
                return dw2Var;
            }
        }
        return b(xn1Var, null, dw2Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.dw2 b(com.google.android.gms.internal.ads.xn1 r6, @androidx.annotation.i0 java.lang.String r7, @androidx.annotation.i0 com.google.android.gms.internal.ads.dw2 r8) {
        /*
            if (r7 != 0) goto L43
            int[] r7 = com.google.android.gms.internal.ads.un1.f5559a
            int r0 = r6.ordinal()
            r7 = r7[r0]
            java.lang.String r0 = "No fill."
            switch(r7) {
                case 1: goto L41;
                case 2: goto L3e;
                case 3: goto L3b;
                case 4: goto L38;
                case 5: goto L36;
                case 6: goto L33;
                case 7: goto L30;
                case 8: goto L2d;
                case 9: goto L2a;
                case 10: goto L27;
                case 11: goto Lf;
                case 12: goto L12;
                default: goto Lf;
            }
        Lf:
            java.lang.String r7 = "Internal error."
            goto L43
        L12:
            com.google.android.gms.internal.ads.s<java.lang.Integer> r7 = com.google.android.gms.internal.ads.e0.y5
            com.google.android.gms.internal.ads.z r1 = com.google.android.gms.internal.ads.qx2.e()
            java.lang.Object r7 = r1.c(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 > 0) goto L36
            java.lang.String r7 = "The mediation adapter did not return an ad."
            goto L43
        L27:
            java.lang.String r7 = "The ad can not be shown when app is not in foreground."
            goto L43
        L2a:
            java.lang.String r7 = "The ad has already been shown."
            goto L43
        L2d:
            java.lang.String r7 = "The ad is not ready."
            goto L43
        L30:
            java.lang.String r7 = "A mediation adapter failed to show the ad."
            goto L43
        L33:
            java.lang.String r7 = "App ID missing."
            goto L43
        L36:
            r7 = r0
            goto L43
        L38:
            java.lang.String r7 = "Network error."
            goto L43
        L3b:
            java.lang.String r7 = "Invalid request: Invalid ad size."
            goto L43
        L3e:
            java.lang.String r7 = "Invalid request: Invalid ad unit ID."
            goto L43
        L41:
            java.lang.String r7 = "Invalid request."
        L43:
            r2 = r7
            com.google.android.gms.internal.ads.dw2 r7 = new com.google.android.gms.internal.ads.dw2
            int[] r0 = com.google.android.gms.internal.ads.un1.f5559a
            int r1 = r6.ordinal()
            r0 = r0[r1]
            r1 = 0
            r3 = 2
            r4 = 1
            r5 = 3
            switch(r0) {
                case 1: goto L9d;
                case 2: goto L9d;
                case 3: goto L9d;
                case 4: goto L9b;
                case 5: goto L99;
                case 6: goto L94;
                case 7: goto L91;
                case 8: goto L9b;
                case 9: goto L9d;
                case 10: goto L99;
                case 11: goto L9e;
                case 12: goto L7a;
                case 13: goto L9e;
                default: goto L55;
            }
        L55:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r8 = java.lang.String.valueOf(r6)
            int r8 = r8.length()
            int r8 = r8 + 18
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r8)
            java.lang.String r8 = "Unknown SdkError: "
            r0.append(r8)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L7a:
            com.google.android.gms.internal.ads.s<java.lang.Integer> r6 = com.google.android.gms.internal.ads.e0.y5
            com.google.android.gms.internal.ads.z r0 = com.google.android.gms.internal.ads.qx2.e()
            java.lang.Object r6 = r0.c(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 > 0) goto L99
            r6 = 9
            r1 = 9
            goto L9e
        L91:
            r6 = 4
            r1 = 4
            goto L9e
        L94:
            r6 = 8
            r1 = 8
            goto L9e
        L99:
            r1 = 3
            goto L9e
        L9b:
            r1 = 2
            goto L9e
        L9d:
            r1 = 1
        L9e:
            r5 = 0
            java.lang.String r3 = "com.google.android.gms.ads"
            r0 = r7
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vn1.b(com.google.android.gms.internal.ads.xn1, java.lang.String, com.google.android.gms.internal.ads.dw2):com.google.android.gms.internal.ads.dw2");
    }

    public static dw2 c(Throwable th, @androidx.annotation.i0 x01 x01Var) {
        dw2 dw2Var;
        dw2 dw2VarD = d(th);
        int r0 = dw2VarD.d;
        if ((r0 == 3 || r0 == 0) && (dw2Var = dw2VarD.g) != null && !dw2Var.f.equals(com.google.android.gms.ads.q.f2483a)) {
            dw2VarD.g = null;
        }
        if (((Boolean) qx2.e().c(e0.x5)).booleanValue() && x01Var != null) {
            dw2VarD.h = x01Var.c();
        }
        return dw2VarD;
    }

    public static dw2 d(Throwable th) {
        if (th instanceof y01) {
            y01 y01Var = (y01) th;
            return a(y01Var.a(), y01Var.b());
        }
        if (th instanceof uv0) {
            return th.getMessage() == null ? b(((uv0) th).a(), null, null) : b(((uv0) th).a(), th.getMessage(), null);
        }
        if (!(th instanceof dq)) {
            return b(xn1.INTERNAL_ERROR, null, null);
        }
        dq dqVar = (dq) th;
        return new dw2(dqVar.a(), dv1.d(dqVar.getMessage()), com.google.android.gms.ads.q.f2483a, null, null);
    }
}

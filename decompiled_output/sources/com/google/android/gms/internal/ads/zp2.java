package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes.dex */
public final class zp2 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f6300a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f6301b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f6302c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    private static int a(eq2 eq2Var) {
        int r0 = eq2Var.a(5);
        return r0 == 31 ? eq2Var.a(6) + 32 : r0;
    }

    private static int b(eq2 eq2Var) {
        int r0 = eq2Var.a(4);
        if (r0 == 15) {
            return eq2Var.a(24);
        }
        vp2.a(r0 < 13);
        return f6301b[r0];
    }

    public static byte[] c(byte[] bArr, int r5, int r6) {
        byte[] bArr2 = f6300a;
        byte[] bArr3 = new byte[bArr2.length + r6];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, r5, bArr3, f6300a.length, r6);
        return bArr3;
    }

    public static Pair<Integer, Integer> d(byte[] bArr) {
        eq2 eq2Var = new eq2(bArr);
        int r5 = a(eq2Var);
        int r1 = b(eq2Var);
        int r3 = eq2Var.a(4);
        if (r5 == 5 || r5 == 29) {
            r1 = b(eq2Var);
            if (a(eq2Var) == 22) {
                r3 = eq2Var.a(4);
            }
        }
        int r52 = f6302c[r3];
        vp2.a(r52 != -1);
        return Pair.create(Integer.valueOf(r1), Integer.valueOf(r52));
    }
}

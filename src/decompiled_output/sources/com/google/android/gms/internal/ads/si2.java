package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class si2 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f5265a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f5266b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f5267c = {24000, 22050, 16000};
    private static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static di2 a(hq2 hq2Var, String str, String str2, ek2 ek2Var) {
        int r8 = f5266b[(hq2Var.g() & 192) >> 6];
        int r0 = hq2Var.g();
        int r1 = d[(r0 & 56) >> 3];
        if ((r0 & 4) != 0) {
            r1++;
        }
        return di2.f(str, "audio/ac3", null, -1, -1, r1, r8, null, ek2Var, 0, str2);
    }

    public static di2 b(hq2 hq2Var, String str, String str2, ek2 ek2Var) {
        hq2Var.m(2);
        int r9 = f5266b[(hq2Var.g() & 192) >> 6];
        int r0 = hq2Var.g();
        int r1 = d[(r0 & 14) >> 1];
        if ((r0 & 1) != 0) {
            r1++;
        }
        return di2.f(str, "audio/eac3", null, -1, -1, r1, r9, null, ek2Var, 0, str2);
    }

    public static int c() {
        return 1536;
    }

    public static int d(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? f5265a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
    }
}

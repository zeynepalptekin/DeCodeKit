package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class oj2 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f4702a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f4703b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f4704c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static int a(ByteBuffer byteBuffer) {
        int r0 = byteBuffer.position();
        return ((((byteBuffer.get(r0 + 5) & 252) >> 2) | ((byteBuffer.get(r0 + 4) & 1) << 6)) + 1) << 5;
    }
}

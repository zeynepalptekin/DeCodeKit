package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

/* loaded from: classes.dex */
public final class xj2 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f5984a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f5985b;

    /* renamed from: c, reason: collision with root package name */
    private int f5986c;
    public int[] d;
    public int[] e;
    private int f;
    private int g;
    private int h;
    private final MediaCodec.CryptoInfo i;
    private final zj2 j;

    public xj2() {
        MediaCodec.CryptoInfo cryptoInfo = nq2.f4592a >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.i = cryptoInfo;
        this.j = nq2.f4592a >= 24 ? new zj2(cryptoInfo) : null;
    }

    public final void a(int r4, int[] r5, int[] r6, byte[] bArr, byte[] bArr2, int r9) {
        this.f = r4;
        this.d = r5;
        this.e = r6;
        this.f5985b = bArr;
        this.f5984a = bArr2;
        this.f5986c = r9;
        this.g = 0;
        this.h = 0;
        int r1 = nq2.f4592a;
        if (r1 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.i;
            cryptoInfo.numSubSamples = r4;
            cryptoInfo.numBytesOfClearData = r5;
            cryptoInfo.numBytesOfEncryptedData = r6;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = r9;
            if (r1 >= 24) {
                this.j.a(0, 0);
            }
        }
    }

    @TargetApi(16)
    public final MediaCodec.CryptoInfo b() {
        return this.i;
    }
}

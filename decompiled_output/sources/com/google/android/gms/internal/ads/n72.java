package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class n72 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f4501a = new byte[256];

    /* renamed from: b, reason: collision with root package name */
    private int f4502b;

    /* renamed from: c, reason: collision with root package name */
    private int f4503c;

    public n72(byte[] bArr) {
        for (int r2 = 0; r2 < 256; r2++) {
            this.f4501a[r2] = (byte) r2;
        }
        int r3 = 0;
        for (int r22 = 0; r22 < 256; r22++) {
            byte[] bArr2 = this.f4501a;
            r3 = (r3 + bArr2[r22] + bArr[r22 % bArr.length]) & 255;
            byte b2 = bArr2[r22];
            bArr2[r22] = bArr2[r3];
            bArr2[r3] = b2;
        }
        this.f4502b = 0;
        this.f4503c = 0;
    }

    public final void a(byte[] bArr) {
        int r0 = this.f4502b;
        int r1 = this.f4503c;
        for (int r2 = 0; r2 < bArr.length; r2++) {
            r0 = (r0 + 1) & 255;
            byte[] bArr2 = this.f4501a;
            r1 = (r1 + bArr2[r0]) & 255;
            byte b2 = bArr2[r0];
            bArr2[r0] = bArr2[r1];
            bArr2[r1] = b2;
            bArr[r2] = (byte) (bArr2[(bArr2[r0] + bArr2[r1]) & 255] ^ bArr[r2]);
        }
        this.f4502b = r0;
        this.f4503c = r1;
    }
}

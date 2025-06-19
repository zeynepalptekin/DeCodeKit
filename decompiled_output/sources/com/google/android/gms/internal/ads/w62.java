package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class w62 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f5799a;

    private w62(byte[] bArr, int r3, int r4) {
        byte[] bArr2 = new byte[r4];
        this.f5799a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, r4);
    }

    public static w62 b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new w62(bArr, 0, bArr.length);
    }

    public final byte[] a() {
        byte[] bArr = this.f5799a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}

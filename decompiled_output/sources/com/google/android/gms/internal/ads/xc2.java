package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class xc2 {
    xc2() {
    }

    abstract int a(int r1, byte[] bArr, int r3, int r4);

    abstract int b(CharSequence charSequence, byte[] bArr, int r3, int r4);

    final boolean c(byte[] bArr, int r3, int r4) {
        return a(0, bArr, r3, r4) == 0;
    }

    abstract String d(byte[] bArr, int r2, int r3) throws w92;
}

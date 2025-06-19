package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class xk2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5992a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f5993b;

    public xk2(int r1, byte[] bArr) {
        this.f5993b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xk2.class == obj.getClass()) {
            xk2 xk2Var = (xk2) obj;
            if (this.f5992a == xk2Var.f5992a && Arrays.equals(this.f5993b, xk2Var.f5993b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f5992a * 31) + Arrays.hashCode(this.f5993b);
    }
}

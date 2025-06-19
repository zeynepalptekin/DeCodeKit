package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum sz0 implements r92 {
    UNKNOWN_PROTO(0),
    AFMA_SIGNALS(1),
    UNITY_SIGNALS(2),
    PARTNER_SIGNALS(3);

    private static final q92<sz0> i = new q92<sz0>() { // from class: com.google.android.gms.internal.ads.ry0
    };
    private final int d;

    sz0(int r3) {
        this.d = r3;
    }

    public static sz0 e(int r1) {
        if (r1 == 0) {
            return UNKNOWN_PROTO;
        }
        if (r1 == 1) {
            return AFMA_SIGNALS;
        }
        if (r1 == 2) {
            return UNITY_SIGNALS;
        }
        if (r1 != 3) {
            return null;
        }
        return PARTNER_SIGNALS;
    }

    public static t92 g() {
        return t01.f5329a;
    }

    @Override // com.google.android.gms.internal.ads.r92
    public final int h() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + sz0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.d + " name=" + name() + '>';
    }
}

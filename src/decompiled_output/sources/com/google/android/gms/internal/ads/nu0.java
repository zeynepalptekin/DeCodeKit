package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum nu0 implements r92 {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_FAILURE(2),
    ENUM_UNKNOWN(1000);

    private static final q92<nu0> i = new q92<nu0>() { // from class: com.google.android.gms.internal.ads.qx0
    };
    private final int d;

    nu0(int r3) {
        this.d = r3;
    }

    public static nu0 e(int r1) {
        if (r1 == 0) {
            return ENUM_FALSE;
        }
        if (r1 == 1) {
            return ENUM_TRUE;
        }
        if (r1 == 2) {
            return ENUM_FAILURE;
        }
        if (r1 != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    public static t92 g() {
        return pw0.f4895a;
    }

    @Override // com.google.android.gms.internal.ads.r92
    public final int h() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + nu0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.d + " name=" + name() + '>';
    }
}

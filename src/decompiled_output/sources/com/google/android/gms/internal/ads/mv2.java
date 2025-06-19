package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum mv2 implements r92 {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);

    private static final q92<mv2> h = new q92<mv2>() { // from class: com.google.android.gms.internal.ads.pv2
    };
    private final int d;

    mv2(int r3) {
        this.d = r3;
    }

    public static mv2 e(int r1) {
        if (r1 == 0) {
            return ENUM_FALSE;
        }
        if (r1 == 1) {
            return ENUM_TRUE;
        }
        if (r1 != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    public static t92 g() {
        return ov2.f4749a;
    }

    @Override // com.google.android.gms.internal.ads.r92
    public final int h() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + mv2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.d + " name=" + name() + '>';
    }
}

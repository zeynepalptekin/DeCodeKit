package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum bi0 implements r92 {
    ENUM_SIGNAL_SOURCE_UNKNOWN(0),
    ENUM_SIGNAL_SOURCE_DISABLE(1),
    ENUM_SIGNAL_SOURCE_ADSHIELD(2),
    ENUM_SIGNAL_SOURCE_GASS(3),
    ENUM_SIGNAL_SOURCE_CALLER_PROVIDED(4);

    private static final q92<bi0> j = new q92<bi0>() { // from class: com.google.android.gms.internal.ads.dk0
    };
    private final int d;

    bi0(int r3) {
        this.d = r3;
    }

    public static bi0 e(int r1) {
        if (r1 == 0) {
            return ENUM_SIGNAL_SOURCE_UNKNOWN;
        }
        if (r1 == 1) {
            return ENUM_SIGNAL_SOURCE_DISABLE;
        }
        if (r1 == 2) {
            return ENUM_SIGNAL_SOURCE_ADSHIELD;
        }
        if (r1 == 3) {
            return ENUM_SIGNAL_SOURCE_GASS;
        }
        if (r1 != 4) {
            return null;
        }
        return ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
    }

    public static t92 g() {
        return cj0.f2981a;
    }

    @Override // com.google.android.gms.internal.ads.r92
    public final int h() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + bi0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.d + " name=" + name() + '>';
    }
}

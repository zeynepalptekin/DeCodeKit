package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum mt0 implements r92 {
    UNKNOWN_ENCRYPTION_METHOD(0),
    BITSLICER(1),
    TINK_HYBRID(2),
    UNENCRYPTED(3),
    DG(4),
    DG_XTEA(5);

    private static final q92<mt0> k = new q92<mt0>() { // from class: com.google.android.gms.internal.ads.ls0
    };
    private final int d;

    mt0(int r3) {
        this.d = r3;
    }

    public static mt0 e(int r1) {
        if (r1 == 0) {
            return UNKNOWN_ENCRYPTION_METHOD;
        }
        if (r1 == 1) {
            return BITSLICER;
        }
        if (r1 == 2) {
            return TINK_HYBRID;
        }
        if (r1 == 3) {
            return UNENCRYPTED;
        }
        if (r1 == 4) {
            return DG;
        }
        if (r1 != 5) {
            return null;
        }
        return DG_XTEA;
    }

    public static t92 g() {
        return ov0.f4748a;
    }

    @Override // com.google.android.gms.internal.ads.r92
    public final int h() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + mt0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.d + " name=" + name() + '>';
    }
}

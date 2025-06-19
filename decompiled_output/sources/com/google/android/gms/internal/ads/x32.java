package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum x32 implements r92 {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    CURVE25519(5),
    UNRECOGNIZED(-1);

    private static final q92<x32> k = new q92<x32>() { // from class: com.google.android.gms.internal.ads.z32
    };
    private final int d;

    x32(int r3) {
        this.d = r3;
    }

    public static x32 e(int r1) {
        if (r1 == 0) {
            return UNKNOWN_CURVE;
        }
        if (r1 == 2) {
            return NIST_P256;
        }
        if (r1 == 3) {
            return NIST_P384;
        }
        if (r1 == 4) {
            return NIST_P521;
        }
        if (r1 != 5) {
            return null;
        }
        return CURVE25519;
    }

    @Override // com.google.android.gms.internal.ads.r92
    public final int h() {
        if (this != UNRECOGNIZED) {
            return this.d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(x32.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(h());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}

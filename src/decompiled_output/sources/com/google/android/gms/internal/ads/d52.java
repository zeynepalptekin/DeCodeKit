package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum d52 implements r92 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    private static final q92<d52> k = new q92<d52>() { // from class: com.google.android.gms.internal.ads.f52
    };
    private final int d;

    d52(int r3) {
        this.d = r3;
    }

    public static d52 e(int r1) {
        if (r1 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (r1 == 1) {
            return TINK;
        }
        if (r1 == 2) {
            return LEGACY;
        }
        if (r1 == 3) {
            return RAW;
        }
        if (r1 != 4) {
            return null;
        }
        return CRUNCHY;
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
        sb.append(d52.class.getName());
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

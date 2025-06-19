package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum y32 implements r92 {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);

    private static final q92<y32> k = new q92<y32>() { // from class: com.google.android.gms.internal.ads.b42
    };
    private final int d;

    y32(int r3) {
        this.d = r3;
    }

    public static y32 e(int r1) {
        if (r1 == 0) {
            return UNKNOWN_HASH;
        }
        if (r1 == 1) {
            return SHA1;
        }
        if (r1 == 2) {
            return SHA384;
        }
        if (r1 == 3) {
            return SHA256;
        }
        if (r1 != 4) {
            return null;
        }
        return SHA512;
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
        sb.append(y32.class.getName());
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

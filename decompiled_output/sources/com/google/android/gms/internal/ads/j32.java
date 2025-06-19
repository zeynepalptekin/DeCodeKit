package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum j32 implements r92 {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);

    private static final q92<j32> j = new q92<j32>() { // from class: com.google.android.gms.internal.ads.l32
    };
    private final int d;

    j32(int r3) {
        this.d = r3;
    }

    public static j32 e(int r1) {
        if (r1 == 0) {
            return UNKNOWN_FORMAT;
        }
        if (r1 == 1) {
            return UNCOMPRESSED;
        }
        if (r1 == 2) {
            return COMPRESSED;
        }
        if (r1 != 3) {
            return null;
        }
        return DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
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
        sb.append(j32.class.getName());
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

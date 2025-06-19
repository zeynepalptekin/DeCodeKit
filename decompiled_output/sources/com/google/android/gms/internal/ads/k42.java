package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum k42 implements r92 {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    private static final q92<k42> j = new q92<k42>() { // from class: com.google.android.gms.internal.ads.n42
    };
    private final int d;

    k42(int r3) {
        this.d = r3;
    }

    public static k42 e(int r1) {
        if (r1 == 0) {
            return UNKNOWN_STATUS;
        }
        if (r1 == 1) {
            return ENABLED;
        }
        if (r1 == 2) {
            return DISABLED;
        }
        if (r1 != 3) {
            return null;
        }
        return DESTROYED;
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
        sb.append(k42.class.getName());
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

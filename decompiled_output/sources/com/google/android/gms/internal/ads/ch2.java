package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum ch2 implements r92 {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6);

    private static final q92<ch2> j = new q92<ch2>() { // from class: com.google.android.gms.internal.ads.bh2
    };
    private final int d;

    ch2(int r3) {
        this.d = r3;
    }

    @Override // com.google.android.gms.internal.ads.r92
    public final int h() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + ch2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.d + " name=" + name() + '>';
    }
}

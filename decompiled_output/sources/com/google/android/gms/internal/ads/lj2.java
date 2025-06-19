package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class lj2 extends Exception {
    private final int d;

    public lj2(int r3, int r4, int r5, int r6) {
        StringBuilder sb = new StringBuilder(82);
        sb.append("AudioTrack init failed: ");
        sb.append(r3);
        sb.append(", Config(");
        sb.append(r4);
        sb.append(", ");
        sb.append(r5);
        sb.append(", ");
        sb.append(r6);
        sb.append(")");
        super(sb.toString());
        this.d = r3;
    }
}

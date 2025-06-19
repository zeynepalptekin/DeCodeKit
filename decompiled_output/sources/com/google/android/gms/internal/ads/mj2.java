package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class mj2 extends Exception {
    private final int d;

    public mj2(int r3) {
        StringBuilder sb = new StringBuilder(36);
        sb.append("AudioTrack write failed: ");
        sb.append(r3);
        super(sb.toString());
        this.d = r3;
    }
}

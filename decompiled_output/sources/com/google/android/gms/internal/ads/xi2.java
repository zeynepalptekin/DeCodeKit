package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class xi2 extends Exception {
    public xi2(int r3, int r4, int r5) {
        StringBuilder sb = new StringBuilder(78);
        sb.append("Unhandled format: ");
        sb.append(r3);
        sb.append(" Hz, ");
        sb.append(r4);
        sb.append(" channels in encoding ");
        sb.append(r5);
        super(sb.toString());
    }
}

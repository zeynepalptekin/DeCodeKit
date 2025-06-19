package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zc2 extends IllegalArgumentException {
    zc2(int r3, int r4) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unpaired surrogate at index ");
        sb.append(r3);
        sb.append(" of ");
        sb.append(r4);
        super(sb.toString());
    }
}

package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class qo2 extends wo2 {
    private static final int[] h = new int[0];
    private final ap2 f;
    private final AtomicReference<to2> g;

    public qo2() {
        this(null);
    }

    private qo2(ap2 ap2Var) {
        this.f = null;
        this.g = new AtomicReference<>(new to2());
    }

    private static boolean g(di2 di2Var, String str) {
        return str != null && TextUtils.equals(str, nq2.j(di2Var.B));
    }

    private static int h(int r1, int r2) {
        if (r1 == -1) {
            return r2 == -1 ? 0 : -1;
        }
        if (r2 == -1) {
            return 1;
        }
        return r1 - r2;
    }

    private static boolean i(int r1, boolean z) {
        int r12 = r1 & 3;
        if (r12 != 3) {
            return z && r12 == 2;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b2  */
    @Override // com.google.android.gms.internal.ads.wo2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final com.google.android.gms.internal.ads.xo2[] e(com.google.android.gms.internal.ads.li2[] r36, com.google.android.gms.internal.ads.ko2[] r37, int[][][] r38) throws com.google.android.gms.internal.ads.sh2 {
        /*
            Method dump skipped, instructions count: 1081
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qo2.e(com.google.android.gms.internal.ads.li2[], com.google.android.gms.internal.ads.ko2[], int[][][]):com.google.android.gms.internal.ads.xo2[]");
    }
}

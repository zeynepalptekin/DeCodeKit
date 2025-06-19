package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;

/* loaded from: classes.dex */
public final class mw1 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f4458a = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f4459b = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f4460c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, ActivityChooserView.f.j};
    private static final int[] d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
    private static int[] e = {ActivityChooserView.f.j, ActivityChooserView.f.j, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    public static int a(int r3, int r4) {
        long j = r3 << 1;
        if (j > 2147483647L) {
            return ActivityChooserView.f.j;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}

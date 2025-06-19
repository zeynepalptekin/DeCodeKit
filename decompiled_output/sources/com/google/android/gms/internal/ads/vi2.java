package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import java.util.Arrays;

@TargetApi(21)
/* loaded from: classes.dex */
public final class vi2 {

    /* renamed from: c, reason: collision with root package name */
    private static final vi2 f5684c = new vi2(new int[]{2}, 2);

    /* renamed from: a, reason: collision with root package name */
    private final int[] f5685a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5686b;

    private vi2(int[] r1, int r2) {
        int[] r12 = Arrays.copyOf(r1, r1.length);
        this.f5685a = r12;
        Arrays.sort(r12);
        this.f5686b = 2;
    }

    public final boolean a(int r2) {
        return Arrays.binarySearch(this.f5685a, r2) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi2)) {
            return false;
        }
        vi2 vi2Var = (vi2) obj;
        return Arrays.equals(this.f5685a, vi2Var.f5685a) && this.f5686b == vi2Var.f5686b;
    }

    public final int hashCode() {
        return this.f5686b + (Arrays.hashCode(this.f5685a) * 31);
    }

    public final String toString() {
        int r0 = this.f5686b;
        String string = Arrays.toString(this.f5685a);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(r0);
        sb.append(", supportedEncodings=");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public final class sh2 extends Exception {
    private final int d;
    private final int e;

    private sh2(int r1, String str, Throwable th, int r4) {
        super(null, th);
        this.d = r1;
        this.e = r4;
    }

    public static sh2 a(IOException iOException) {
        return new sh2(0, null, iOException, -1);
    }

    public static sh2 b(Exception exc, int r4) {
        return new sh2(1, null, exc, r4);
    }

    static sh2 c(RuntimeException runtimeException) {
        return new sh2(2, null, runtimeException, -1);
    }
}

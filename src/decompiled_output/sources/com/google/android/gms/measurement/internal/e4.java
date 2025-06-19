package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

@androidx.annotation.y0
/* loaded from: classes.dex */
final class e4 implements Runnable {
    private final b4 d;
    private final int e;
    private final Throwable f;
    private final byte[] g;
    private final String h;
    private final Map<String, List<String>> i;

    private e4(String str, b4 b4Var, int r3, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        com.google.android.gms.common.internal.r.k(b4Var);
        this.d = b4Var;
        this.e = r3;
        this.f = th;
        this.g = bArr;
        this.h = str;
        this.i = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a(this.h, this.e, this.f, this.g, this.i);
    }
}

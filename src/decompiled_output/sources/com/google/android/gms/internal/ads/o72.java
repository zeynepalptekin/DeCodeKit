package com.google.android.gms.internal.ads;

import java.io.PrintWriter;

/* loaded from: classes.dex */
final class o72 extends h72 {
    o72() {
    }

    @Override // com.google.android.gms.internal.ads.h72
    public final void a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
    }

    @Override // com.google.android.gms.internal.ads.h72
    public final void b(Throwable th, Throwable th2) {
        th.addSuppressed(th2);
    }
}

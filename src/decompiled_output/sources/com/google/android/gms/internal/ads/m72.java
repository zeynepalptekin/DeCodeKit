package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.util.List;

/* loaded from: classes.dex */
final class m72 extends h72 {

    /* renamed from: b, reason: collision with root package name */
    private final l72 f4360b = new l72();

    m72() {
    }

    @Override // com.google.android.gms.internal.ads.h72
    public final void a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> listA = this.f4360b.a(th, false);
        if (listA == null) {
            return;
        }
        synchronized (listA) {
            for (Throwable th2 : listA) {
                printWriter.print("Suppressed: ");
                th2.printStackTrace(printWriter);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.h72
    public final void b(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        this.f4360b.a(th, true).add(th2);
    }
}

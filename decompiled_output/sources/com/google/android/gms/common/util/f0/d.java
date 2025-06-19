package com.google.android.gms.common.util.f0;

import android.os.Process;

/* loaded from: classes.dex */
final class d implements Runnable {
    private final Runnable d;
    private final int e = 0;

    public d(Runnable runnable, int r2) {
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.e);
        this.d.run();
    }
}

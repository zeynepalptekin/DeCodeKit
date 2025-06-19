package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* loaded from: classes.dex */
public final class uq {

    /* renamed from: a, reason: collision with root package name */
    private HandlerThread f5580a = null;

    /* renamed from: b, reason: collision with root package name */
    private Handler f5581b = null;

    /* renamed from: c, reason: collision with root package name */
    private int f5582c = 0;
    private final Object d = new Object();

    public final Handler a() {
        return this.f5581b;
    }

    public final Looper b() {
        Looper looper;
        synchronized (this.d) {
            if (this.f5582c != 0) {
                com.google.android.gms.common.internal.r.l(this.f5580a, "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f5580a == null) {
                oo.m("Starting the looper thread.");
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.f5580a = handlerThread;
                handlerThread.start();
                this.f5581b = new lu1(this.f5580a.getLooper());
                oo.m("Looper thread started.");
            } else {
                oo.m("Resuming the looper thread");
                this.d.notifyAll();
            }
            this.f5582c++;
            looper = this.f5580a.getLooper();
        }
        return looper;
    }
}

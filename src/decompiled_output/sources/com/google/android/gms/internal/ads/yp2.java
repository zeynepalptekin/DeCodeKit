package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class yp2 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6162a;

    public final synchronized void a() throws InterruptedException {
        while (!this.f6162a) {
            wait();
        }
    }

    public final synchronized boolean b() {
        if (this.f6162a) {
            return false;
        }
        this.f6162a = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean c() {
        boolean z;
        z = this.f6162a;
        this.f6162a = false;
        return z;
    }
}

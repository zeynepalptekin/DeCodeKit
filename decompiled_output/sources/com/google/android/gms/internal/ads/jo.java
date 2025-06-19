package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class jo implements Runnable {
    private final /* synthetic */ ko d;

    jo(ko koVar) {
        this.d = koVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.f4124b = Thread.currentThread();
        this.d.b();
    }
}

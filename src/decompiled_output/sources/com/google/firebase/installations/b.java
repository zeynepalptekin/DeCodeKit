package com.google.firebase.installations;

import androidx.annotation.h0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class b implements c.a.b.b.k.f<Void> {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f6952a = new CountDownLatch(1);

    b() {
    }

    @Override // c.a.b.b.k.f
    public void a(@h0 c.a.b.b.k.m<Void> mVar) {
        this.f6952a.countDown();
    }

    public boolean b(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f6952a.await(j, timeUnit);
    }

    public void c() {
        this.f6952a.countDown();
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
final class mq2 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f4441a;

    mq2(String str) {
        this.f4441a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@androidx.annotation.h0 Runnable runnable) {
        return new Thread(runnable, this.f4441a);
    }
}

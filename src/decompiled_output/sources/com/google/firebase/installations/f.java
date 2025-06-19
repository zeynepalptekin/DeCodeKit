package com.google.firebase.installations;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final /* synthetic */ class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final i f6959a;

    private f(i iVar) {
        this.f6959a = iVar;
    }

    public static Callable a(i iVar) {
        return new f(iVar);
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return this.f6959a.e();
    }
}

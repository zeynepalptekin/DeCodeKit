package com.google.android.gms.measurement.internal;

import java.lang.Thread;

/* loaded from: classes.dex */
final class w4 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final String f6551a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ u4 f6552b;

    public w4(u4 u4Var, String str) {
        this.f6552b = u4Var;
        com.google.android.gms.common.internal.r.k(str);
        this.f6551a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f6552b.B().E().b(this.f6551a, th);
    }
}

package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* loaded from: classes.dex */
final class zh implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Thread.UncaughtExceptionHandler f6261a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ yh f6262b;

    zh(yh yhVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f6262b = yhVar;
        this.f6261a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.f6262b.e(thread, th);
            } finally {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f6261a;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        } catch (Throwable unused) {
            tr.g("AdMob exception reporter failed reporting the exception.");
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f6261a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
        }
    }
}

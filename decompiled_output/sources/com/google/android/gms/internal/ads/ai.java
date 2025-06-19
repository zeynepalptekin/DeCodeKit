package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* loaded from: classes.dex */
final class ai implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Thread.UncaughtExceptionHandler f2692a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ yh f2693b;

    ai(yh yhVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f2693b = yhVar;
        this.f2692a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.f2693b.e(thread, th);
            } finally {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f2692a;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        } catch (Throwable unused) {
            tr.g("AdMob exception reporter failed reporting the exception.");
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f2692a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
        }
    }
}

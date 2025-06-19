package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.StrictMode;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class ar {
    @Deprecated
    public static <T> T a(Context context, Callable<T> callable) {
        try {
            return (T) c(callable);
        } catch (Throwable th) {
            tr.c("Unexpected exception.", th);
            yh.g(context).b(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }

    public static <T> T b(cv1<T> cv1Var) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return cv1Var.get();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private static <T> T c(Callable<T> callable) throws Exception {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class py1<V> implements Runnable {

    @NullableDecl
    private ny1<V> d;

    py1(ny1<V> ny1Var) {
        this.d = ny1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy1<? extends V> dy1Var;
        ny1<V> ny1Var = this.d;
        if (ny1Var == null || (dy1Var = ((ny1) ny1Var).k) == null) {
            return;
        }
        this.d = null;
        if (dy1Var.isDone()) {
            ny1Var.k(dy1Var);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = ((ny1) ny1Var).l;
            ny1.J(ny1Var, null);
            String string = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        StringBuilder sb = new StringBuilder("Timed out".length() + 66);
                        sb.append("Timed out");
                        sb.append(" (timeout delayed by ");
                        sb.append(jAbs);
                        sb.append(" ms after scheduled time)");
                        string = sb.toString();
                    }
                } catch (Throwable th) {
                    ny1Var.j(new oy1(string));
                    throw th;
                }
            }
            String strValueOf = String.valueOf(string);
            String strValueOf2 = String.valueOf(dy1Var);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 2 + String.valueOf(strValueOf2).length());
            sb2.append(strValueOf);
            sb2.append(": ");
            sb2.append(strValueOf2);
            ny1Var.j(new oy1(sb2.toString()));
        } finally {
            dy1Var.cancel(true);
        }
    }
}

package com.google.android.gms.internal.ads;

import java.lang.Throwable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
abstract class lw1<V, X extends Throwable, F, T> extends kx1<V> implements Runnable {

    @NullableDecl
    private dy1<? extends V> k;

    @NullableDecl
    private Class<X> l;

    @NullableDecl
    private F m;

    lw1(dy1<? extends V> dy1Var, Class<X> cls, F f) {
        this.k = (dy1) bv1.b(dy1Var);
        this.l = (Class) bv1.b(cls);
        this.m = (F) bv1.b(f);
    }

    static <X extends Throwable, V> dy1<V> J(dy1<? extends V> dy1Var, Class<X> cls, ax1<? super X, ? extends V> ax1Var, Executor executor) {
        ow1 ow1Var = new ow1(dy1Var, cls, ax1Var);
        dy1Var.e(ow1Var, fy1.b(executor, ow1Var));
        return ow1Var;
    }

    abstract void I(@NullableDecl T t);

    @NullableDecl
    abstract T K(F f, X x) throws Exception;

    @Override // com.google.android.gms.internal.ads.pw1
    protected final void b() {
        g(this.k);
        this.k = null;
        this.l = null;
        this.m = null;
    }

    @Override // com.google.android.gms.internal.ads.pw1
    protected final String h() {
        String string;
        dy1<? extends V> dy1Var = this.k;
        Class<X> cls = this.l;
        F f = this.m;
        String strH = super.h();
        if (dy1Var != null) {
            String strValueOf = String.valueOf(dy1Var);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 16);
            sb.append("inputFuture=[");
            sb.append(strValueOf);
            sb.append("], ");
            string = sb.toString();
        } else {
            string = "";
        }
        if (cls == null || f == null) {
            if (strH == null) {
                return null;
            }
            String strValueOf2 = String.valueOf(string);
            String strValueOf3 = String.valueOf(strH);
            return strValueOf3.length() != 0 ? strValueOf2.concat(strValueOf3) : new String(strValueOf2);
        }
        String strValueOf4 = String.valueOf(cls);
        String strValueOf5 = String.valueOf(f);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 29 + String.valueOf(strValueOf4).length() + String.valueOf(strValueOf5).length());
        sb2.append(string);
        sb2.append("exceptionType=[");
        sb2.append(strValueOf4);
        sb2.append("], fallback=[");
        sb2.append(strValueOf5);
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [F, java.lang.Class<X extends java.lang.Throwable>] */
    @Override // java.lang.Runnable
    public final void run() {
        dy1<? extends V> dy1Var = this.k;
        Class<X> cls = this.l;
        F f = this.m;
        if (((f == null) || ((dy1Var == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        ?? r3 = (Class<X>) null;
        this.k = null;
        try {
            th = dy1Var instanceof uy1 ? xy1.a((uy1) dy1Var) : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(dy1Var.getClass());
                String strValueOf2 = String.valueOf(e.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 35 + String.valueOf(strValueOf2).length());
                sb.append("Future type ");
                sb.append(strValueOf);
                sb.append(" threw ");
                sb.append(strValueOf2);
                sb.append(" without a cause");
                cause = new NullPointerException(sb.toString());
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        Object objE = th == null ? qx1.e(dy1Var) : null;
        if (th == null) {
            i(objE);
            return;
        }
        if (!cls.isInstance(th)) {
            k(dy1Var);
            return;
        }
        try {
            Object objK = K(f, th);
            this.l = null;
            this.m = null;
            I(objK);
        } catch (Throwable th2) {
            try {
                j(th2);
            } finally {
                this.l = null;
                this.m = null;
            }
        }
    }
}

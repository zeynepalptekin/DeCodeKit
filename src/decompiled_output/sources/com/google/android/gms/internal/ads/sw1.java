package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
abstract class sw1<I, O, F, T> extends kx1<O> implements Runnable {

    @NullableDecl
    private dy1<? extends I> k;

    @NullableDecl
    private F l;

    sw1(dy1<? extends I> dy1Var, F f) {
        this.k = (dy1) bv1.b(dy1Var);
        this.l = (F) bv1.b(f);
    }

    static <I, O> dy1<O> J(dy1<I> dy1Var, ru1<? super I, ? extends O> ru1Var, Executor executor) {
        bv1.b(ru1Var);
        uw1 uw1Var = new uw1(dy1Var, ru1Var);
        dy1Var.e(uw1Var, fy1.b(executor, uw1Var));
        return uw1Var;
    }

    static <I, O> dy1<O> K(dy1<I> dy1Var, ax1<? super I, ? extends O> ax1Var, Executor executor) {
        bv1.b(executor);
        rw1 rw1Var = new rw1(dy1Var, ax1Var);
        dy1Var.e(rw1Var, fy1.b(executor, rw1Var));
        return rw1Var;
    }

    abstract void I(@NullableDecl T t);

    @NullableDecl
    abstract T L(F f, @NullableDecl I r2) throws Exception;

    @Override // com.google.android.gms.internal.ads.pw1
    protected final void b() {
        g(this.k);
        this.k = null;
        this.l = null;
    }

    @Override // com.google.android.gms.internal.ads.pw1
    protected final String h() {
        String string;
        dy1<? extends I> dy1Var = this.k;
        F f = this.l;
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
        if (f == null) {
            if (strH == null) {
                return null;
            }
            String strValueOf2 = String.valueOf(string);
            String strValueOf3 = String.valueOf(strH);
            return strValueOf3.length() != 0 ? strValueOf2.concat(strValueOf3) : new String(strValueOf2);
        }
        String strValueOf4 = String.valueOf(f);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 11 + String.valueOf(strValueOf4).length());
        sb2.append(string);
        sb2.append("function=[");
        sb2.append(strValueOf4);
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        dy1<? extends I> dy1Var = this.k;
        F f = this.l;
        if ((isCancelled() | (dy1Var == null)) || (f == null)) {
            return;
        }
        this.k = null;
        if (dy1Var.isCancelled()) {
            k(dy1Var);
            return;
        }
        try {
            try {
                Object objL = L(f, qx1.e(dy1Var));
                this.l = null;
                I(objL);
            } catch (Throwable th) {
                try {
                    j(th);
                } finally {
                    this.l = null;
                }
            }
        } catch (Error e) {
            j(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            j(e2);
        } catch (ExecutionException e3) {
            j(e3.getCause());
        }
    }
}

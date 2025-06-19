package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
abstract class tw1<InputT, OutputT> extends xw1<OutputT> {
    private static final Logger r = Logger.getLogger(tw1.class.getName());

    @NullableDecl
    private iv1<? extends dy1<? extends InputT>> o;
    private final boolean p;
    private final boolean q;

    enum a {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    tw1(iv1<? extends dy1<? extends InputT>> iv1Var, boolean z, boolean z2) {
        super(iv1Var.size());
        this.o = (iv1) bv1.b(iv1Var);
        this.p = z;
        this.q = z2;
    }

    static /* synthetic */ iv1 J(tw1 tw1Var, iv1 iv1Var) {
        tw1Var.o = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void K(int r1, Future<? extends InputT> future) {
        try {
            R(r1, qx1.e(future));
        } catch (ExecutionException e) {
            T(e.getCause());
        } catch (Throwable th) {
            T(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(@NullableDecl iv1<? extends Future<? extends InputT>> iv1Var) {
        int r0 = F();
        int r1 = 0;
        if (!(r0 >= 0)) {
            throw new IllegalStateException("Less than 0 remaining futures");
        }
        if (r0 == 0) {
            if (iv1Var != null) {
                fw1 fw1Var = (fw1) iv1Var.iterator();
                while (fw1Var.hasNext()) {
                    Future<? extends InputT> future = (Future) fw1Var.next();
                    if (!future.isCancelled()) {
                        K(r1, future);
                    }
                    r1++;
                }
            }
            G();
            Q();
            M(a.ALL_INPUT_FUTURES_PROCESSED);
        }
    }

    private static boolean O(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    private final void T(Throwable th) {
        bv1.b(th);
        if (this.p && !j(th) && O(E(), th)) {
            U(th);
        } else if (th instanceof Error) {
            U(th);
        }
    }

    private static void U(Throwable th) {
        r.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
    }

    @Override // com.google.android.gms.internal.ads.xw1
    final void I(Set<Throwable> set) {
        bv1.b(set);
        if (isCancelled()) {
            return;
        }
        O(set, a());
    }

    void M(a aVar) {
        bv1.b(aVar);
        this.o = null;
    }

    final void P() {
        if (this.o.isEmpty()) {
            Q();
            return;
        }
        if (!this.p) {
            vw1 vw1Var = new vw1(this, this.q ? this.o : null);
            fw1 fw1Var = (fw1) this.o.iterator();
            while (fw1Var.hasNext()) {
                ((dy1) fw1Var.next()).e(vw1Var, jx1.INSTANCE);
            }
            return;
        }
        int r0 = 0;
        fw1 fw1Var2 = (fw1) this.o.iterator();
        while (fw1Var2.hasNext()) {
            dy1 dy1Var = (dy1) fw1Var2.next();
            dy1Var.e(new ww1(this, dy1Var, r0), jx1.INSTANCE);
            r0++;
        }
    }

    abstract void Q();

    abstract void R(int r1, @NullableDecl InputT r2);

    @Override // com.google.android.gms.internal.ads.pw1
    protected final void b() {
        super.b();
        iv1<? extends dy1<? extends InputT>> iv1Var = this.o;
        M(a.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (iv1Var != null)) {
            boolean zL = l();
            fw1 fw1Var = (fw1) iv1Var.iterator();
            while (fw1Var.hasNext()) {
                ((Future) fw1Var.next()).cancel(zL);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pw1
    protected final String h() {
        iv1<? extends dy1<? extends InputT>> iv1Var = this.o;
        if (iv1Var == null) {
            return super.h();
        }
        String strValueOf = String.valueOf(iv1Var);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 8);
        sb.append("futures=");
        sb.append(strValueOf);
        return sb.toString();
    }
}

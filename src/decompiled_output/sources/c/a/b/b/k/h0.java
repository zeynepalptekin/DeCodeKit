package c.a.b.b.k;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class h0<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1901a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("mLock")
    private Queue<i0<TResult>> f1902b;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    private boolean f1903c;

    h0() {
    }

    public final void a(@androidx.annotation.h0 m<TResult> mVar) {
        i0<TResult> i0VarPoll;
        synchronized (this.f1901a) {
            if (this.f1902b != null && !this.f1903c) {
                this.f1903c = true;
                while (true) {
                    synchronized (this.f1901a) {
                        i0VarPoll = this.f1902b.poll();
                        if (i0VarPoll == null) {
                            this.f1903c = false;
                            return;
                        }
                    }
                    i0VarPoll.d(mVar);
                }
            }
        }
    }

    public final void b(@androidx.annotation.h0 i0<TResult> i0Var) {
        synchronized (this.f1901a) {
            if (this.f1902b == null) {
                this.f1902b = new ArrayDeque();
            }
            this.f1902b.add(i0Var);
        }
    }
}

package c.a.b.b.g.c;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class j5 extends WeakReference<Throwable> {

    /* renamed from: a, reason: collision with root package name */
    private final int f1737a;

    public j5(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.f1737a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == j5.class) {
            if (this == obj) {
                return true;
            }
            j5 j5Var = (j5) obj;
            if (this.f1737a == j5Var.f1737a && get() == j5Var.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1737a;
    }
}

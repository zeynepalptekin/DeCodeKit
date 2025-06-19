package com.google.android.gms.internal.ads;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class j72 extends WeakReference<Throwable> {

    /* renamed from: a, reason: collision with root package name */
    private final int f3927a;

    public j72(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.f3927a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == j72.class) {
            if (this == obj) {
                return true;
            }
            j72 j72Var = (j72) obj;
            if (this.f3927a == j72Var.f3927a && get() == j72Var.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3927a;
    }
}

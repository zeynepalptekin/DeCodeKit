package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class yj1 {
    public static <T> void a(AtomicReference<T> atomicReference, xj1<T> xj1Var) {
        T t = atomicReference.get();
        if (t == null) {
            return;
        }
        try {
            xj1Var.a(t);
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class mz1 {

    /* renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArrayList<nz1> f4467a = new CopyOnWriteArrayList<>();

    public static nz1 a(String str) throws GeneralSecurityException {
        Iterator<nz1> it = f4467a.iterator();
        while (it.hasNext()) {
            nz1 next = it.next();
            if (next.a(str)) {
                return next;
            }
        }
        String strValueOf = String.valueOf(str);
        throw new GeneralSecurityException(strValueOf.length() != 0 ? "No KMS client does support: ".concat(strValueOf) : new String("No KMS client does support: "));
    }
}

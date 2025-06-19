package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class y12 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f6076a = new u12().a();

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    private static final e52 f6077b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    private static final e52 f6078c;

    @Deprecated
    private static final e52 d;

    static {
        e52 e52VarI = e52.I();
        f6077b = e52VarI;
        f6078c = e52VarI;
        d = e52VarI;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() throws GeneralSecurityException {
        uz1.k(new u12(), true);
        uz1.k(new t12(), true);
        uz1.l(new b22());
    }
}

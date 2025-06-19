package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class a02 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2613a = new f02().a();

    /* renamed from: b, reason: collision with root package name */
    public static final String f2614b = new p02().a();

    /* renamed from: c, reason: collision with root package name */
    private static final String f2615c = new k02().a();
    private static final String d = new v02().a();
    private static final String e = new z02().a();
    private static final String f = new q02().a();
    private static final String g = new a12().a();

    @Deprecated
    private static final e52 h;

    @Deprecated
    private static final e52 i;

    @Deprecated
    private static final e52 j;

    static {
        e52 e52VarI = e52.I();
        h = e52VarI;
        i = e52VarI;
        j = e52VarI;
        try {
            a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void a() throws GeneralSecurityException {
        y12.a();
        uz1.k(new f02(), true);
        uz1.k(new k02(), true);
        uz1.k(new p02(), true);
        uz1.k(new q02(), true);
        uz1.k(new v02(), true);
        uz1.k(new z02(), true);
        uz1.k(new a12(), true);
        uz1.l(new e02());
    }
}

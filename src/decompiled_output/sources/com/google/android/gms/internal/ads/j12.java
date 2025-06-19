package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class j12 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3899a = new h12().a();

    /* renamed from: b, reason: collision with root package name */
    private static final String f3900b = new g12().a();

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final e52 f3901c = e52.I();

    @Deprecated
    private static final e52 d = e52.I();

    @Deprecated
    private static final e52 e = e52.I();

    static {
        try {
            a02.a();
            uz1.m(new g12(), new h12(), true);
            uz1.l(new l12());
            uz1.l(new m12());
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
abstract class ga2 {

    /* renamed from: a, reason: collision with root package name */
    private static final ga2 f3515a;

    /* renamed from: b, reason: collision with root package name */
    private static final ga2 f3516b;

    static {
        ja2 ja2Var = null;
        f3515a = new ia2();
        f3516b = new la2();
    }

    private ga2() {
    }

    static ga2 d() {
        return f3515a;
    }

    static ga2 e() {
        return f3516b;
    }

    abstract <L> List<L> a(Object obj, long j);

    abstract <L> void b(Object obj, Object obj2, long j);

    abstract void c(Object obj, long j);
}

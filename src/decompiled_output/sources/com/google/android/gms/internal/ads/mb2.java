package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
final class mb2 {

    /* renamed from: c, reason: collision with root package name */
    private static final mb2 f4381c = new mb2();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, ub2<?>> f4383b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final xb2 f4382a = new oa2();

    private mb2() {
    }

    public static mb2 b() {
        return f4381c;
    }

    public final <T> ub2<T> a(T t) {
        return c(t.getClass());
    }

    public final <T> ub2<T> c(Class<T> cls) {
        o92.d(cls, "messageType");
        ub2<T> ub2Var = (ub2) this.f4383b.get(cls);
        if (ub2Var != null) {
            return ub2Var;
        }
        ub2<T> ub2VarA = this.f4382a.a(cls);
        o92.d(cls, "messageType");
        o92.d(ub2VarA, "schema");
        ub2<T> ub2Var2 = (ub2) this.f4383b.putIfAbsent(cls, ub2VarA);
        return ub2Var2 != null ? ub2Var2 : ub2VarA;
    }
}

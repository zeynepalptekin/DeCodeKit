package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class b92 {

    /* renamed from: a, reason: collision with root package name */
    private static final a92<?> f2802a = new c92();

    /* renamed from: b, reason: collision with root package name */
    private static final a92<?> f2803b = a();

    private static a92<?> a() {
        try {
            return (a92) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static a92<?> b() {
        return f2802a;
    }

    static a92<?> c() {
        a92<?> a92Var = f2803b;
        if (a92Var != null) {
            return a92Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}

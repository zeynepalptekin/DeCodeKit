package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class hb2 {

    /* renamed from: a, reason: collision with root package name */
    private static final fb2 f3656a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final fb2 f3657b = new ib2();

    static fb2 a() {
        return f3656a;
    }

    static fb2 b() {
        return f3657b;
    }

    private static fb2 c() {
        try {
            return (fb2) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

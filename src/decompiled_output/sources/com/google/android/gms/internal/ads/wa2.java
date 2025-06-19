package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class wa2 {

    /* renamed from: a, reason: collision with root package name */
    private static final ua2 f5811a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final ua2 f5812b = new ta2();

    static ua2 a() {
        return f5811a;
    }

    static ua2 b() {
        return f5812b;
    }

    private static ua2 c() {
        try {
            return (ua2) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

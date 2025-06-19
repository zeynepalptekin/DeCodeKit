package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class o2 {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference<p2> f4633a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    static final AtomicBoolean f4634b = new AtomicBoolean();

    public static void a(p2 p2Var) {
        f4633a.set(p2Var);
    }

    static p2 b() {
        return f4633a.get();
    }
}

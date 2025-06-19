package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
final class gq0<T> implements z6<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<T> f3569a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3570b;

    /* renamed from: c, reason: collision with root package name */
    private final z6<T> f3571c;
    private final /* synthetic */ up0 d;

    private gq0(up0 up0Var, WeakReference<T> weakReference, String str, z6<T> z6Var) {
        this.d = up0Var;
        this.f3569a = weakReference;
        this.f3570b = str;
        this.f3571c = z6Var;
    }

    /* synthetic */ gq0(up0 up0Var, WeakReference weakReference, String str, z6 z6Var, zp0 zp0Var) {
        this(up0Var, weakReference, str, z6Var);
    }

    @Override // com.google.android.gms.internal.ads.z6
    public final void a(Object obj, Map<String, String> map) {
        T t = this.f3569a.get();
        if (t == null) {
            this.d.i(this.f3570b, this);
        } else {
            this.f3571c.a(t, map);
        }
    }
}

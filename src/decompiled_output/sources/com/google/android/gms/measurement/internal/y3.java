package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class y3 {

    /* renamed from: a, reason: collision with root package name */
    private final int f6568a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f6569b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f6570c;
    private final /* synthetic */ w3 d;

    y3(w3 w3Var, int r2, boolean z, boolean z2) {
        this.d = w3Var;
        this.f6568a = r2;
        this.f6569b = z;
        this.f6570c = z2;
    }

    public final void a(String str) {
        this.d.y(this.f6568a, this.f6569b, this.f6570c, str, null, null, null);
    }

    public final void b(String str, Object obj) {
        this.d.y(this.f6568a, this.f6569b, this.f6570c, str, obj, null, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        this.d.y(this.f6568a, this.f6569b, this.f6570c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) throws IllegalStateException {
        this.d.y(this.f6568a, this.f6569b, this.f6570c, str, obj, obj2, obj3);
    }
}

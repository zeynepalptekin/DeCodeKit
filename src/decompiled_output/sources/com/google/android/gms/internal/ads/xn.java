package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
final class xn {

    /* renamed from: a, reason: collision with root package name */
    private long f6007a = -1;

    /* renamed from: b, reason: collision with root package name */
    private long f6008b = -1;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ un f6009c;

    public xn(un unVar) {
        this.f6009c = unVar;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f6007a);
        bundle.putLong("tclose", this.f6008b);
        return bundle;
    }

    public final long b() {
        return this.f6008b;
    }

    public final void c() {
        this.f6008b = this.f6009c.f5553a.c();
    }

    public final void d() {
        this.f6007a = this.f6009c.f5553a.c();
    }
}

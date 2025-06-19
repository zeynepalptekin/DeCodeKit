package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ra implements os<u9> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ za f5117a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ da f5118b;

    ra(da daVar, za zaVar) {
        this.f5118b = daVar;
        this.f5117a = zaVar;
    }

    @Override // com.google.android.gms.internal.ads.os
    public final /* synthetic */ void a(u9 u9Var) {
        synchronized (this.f5118b.f3097a) {
            this.f5118b.h = 0;
            if (this.f5118b.g != null && this.f5117a != this.f5118b.g) {
                oo.m("New JS engine is loaded, marking previous one as destroyable.");
                this.f5118b.g.i();
            }
            this.f5118b.g = this.f5117a;
        }
    }
}

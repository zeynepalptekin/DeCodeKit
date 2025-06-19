package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class qa implements ms {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ za f4970a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ da f4971b;

    qa(da daVar, za zaVar) {
        this.f4971b = daVar;
        this.f4970a = zaVar;
    }

    @Override // com.google.android.gms.internal.ads.ms
    public final void run() {
        synchronized (this.f4971b.f3097a) {
            this.f4971b.h = 1;
            oo.m("Failed loading new engine. Marking new engine destroyable.");
            this.f4970a.i();
        }
    }
}

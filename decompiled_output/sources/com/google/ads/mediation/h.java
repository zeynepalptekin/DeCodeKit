package com.google.ads.mediation;

/* loaded from: classes.dex */
final class h extends com.google.android.gms.ads.k0.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AbstractAdViewAdapter f2334a;

    h(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.f2334a = abstractAdViewAdapter;
    }

    @Override // com.google.android.gms.ads.k0.a
    public final void c() {
        if (this.f2334a.zzmm == null || this.f2334a.zzmn == null) {
            return;
        }
        this.f2334a.zzmn.i0(this.f2334a.zzmm.b());
    }
}

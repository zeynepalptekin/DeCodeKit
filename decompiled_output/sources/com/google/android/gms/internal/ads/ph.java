package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
final class ph extends hn {
    private final /* synthetic */ com.google.android.gms.ads.j0.c e;

    ph(mh mhVar, com.google.android.gms.ads.j0.c cVar) {
        this.e = cVar;
    }

    @Override // com.google.android.gms.internal.ads.en
    public final void X7(String str, String str2) {
        com.google.android.gms.ads.j0.b bVar = new com.google.android.gms.ads.j0.b(new q03(str, null));
        qx2.i().put(bVar, str2);
        this.e.b(bVar);
    }

    @Override // com.google.android.gms.internal.ads.en
    public final void u1(String str) {
        this.e.a(str);
    }

    @Override // com.google.android.gms.internal.ads.en
    public final void v1(String str, String str2, Bundle bundle) {
        com.google.android.gms.ads.j0.b bVar = new com.google.android.gms.ads.j0.b(new q03(str, bundle));
        qx2.i().put(bVar, str2);
        this.e.b(bVar);
    }
}

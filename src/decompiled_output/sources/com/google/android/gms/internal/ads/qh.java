package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
final class qh extends kh {
    private final /* synthetic */ com.google.android.gms.ads.j0.e e;

    qh(oh ohVar, com.google.android.gms.ads.j0.e eVar) {
        this.e = eVar;
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void Y7(List<Uri> list) {
        this.e.b(list.get(0));
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void u1(String str) {
        this.e.a(str);
    }
}

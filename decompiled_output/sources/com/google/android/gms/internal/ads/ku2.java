package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* loaded from: classes.dex */
final class ku2 extends ks<InputStream> {
    private final /* synthetic */ lu2 e;

    ku2(lu2 lu2Var) {
        this.e = lu2Var;
    }

    @Override // com.google.android.gms.internal.ads.ks, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.e.a();
        return super.cancel(z);
    }
}

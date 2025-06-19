package com.google.android.gms.internal.ads;

import android.view.View;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class u0 extends z0 {
    private final com.google.android.gms.ads.internal.g e;

    @androidx.annotation.i0
    private final String f;
    private final String g;

    public u0(com.google.android.gms.ads.internal.g gVar, @androidx.annotation.i0 String str, String str2) {
        this.e = gVar;
        this.f = str;
        this.g = str2;
    }

    @Override // com.google.android.gms.internal.ads.w0
    public final String G1() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.w0
    public final void W4(@androidx.annotation.i0 c.a.b.b.e.c cVar) {
        if (cVar == null) {
            return;
        }
        this.e.b((View) c.a.b.b.e.e.e2(cVar));
    }

    @Override // com.google.android.gms.internal.ads.w0
    public final void g() {
        this.e.a();
    }

    @Override // com.google.android.gms.internal.ads.w0
    public final void g1() {
        this.e.c();
    }

    @Override // com.google.android.gms.internal.ads.w0
    public final String u3() {
        return this.f;
    }
}

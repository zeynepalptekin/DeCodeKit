package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class da0 implements sb0, nc0 {
    private final Context d;
    private final km1 e;
    private final bh f;

    public da0(Context context, km1 km1Var, bh bhVar) {
        this.d = context;
        this.e = km1Var;
        this.f = bhVar;
    }

    @Override // com.google.android.gms.internal.ads.sb0
    public final void D(@androidx.annotation.i0 Context context) {
    }

    @Override // com.google.android.gms.internal.ads.sb0
    public final void e(@androidx.annotation.i0 Context context) {
        this.f.a();
    }

    @Override // com.google.android.gms.internal.ads.sb0
    public final void q(@androidx.annotation.i0 Context context) {
    }

    @Override // com.google.android.gms.internal.ads.nc0
    public final void u() {
        zg zgVar = this.e.Y;
        if (zgVar == null || !zgVar.f6257a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!this.e.Y.f6258b.isEmpty()) {
            arrayList.add(this.e.Y.f6258b);
        }
        this.f.b(this.d, arrayList);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class xr0 implements sb0 {

    @androidx.annotation.i0
    private final rw d;

    xr0(@androidx.annotation.i0 rw rwVar) {
        this.d = ((Boolean) qx2.e().c(e0.p0)).booleanValue() ? rwVar : null;
    }

    @Override // com.google.android.gms.internal.ads.sb0
    public final void D(@androidx.annotation.i0 Context context) {
        rw rwVar = this.d;
        if (rwVar != null) {
            rwVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.sb0
    public final void e(@androidx.annotation.i0 Context context) {
        rw rwVar = this.d;
        if (rwVar != null) {
            rwVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.sb0
    public final void q(@androidx.annotation.i0 Context context) {
        rw rwVar = this.d;
        if (rwVar != null) {
            rwVar.onResume();
        }
    }
}

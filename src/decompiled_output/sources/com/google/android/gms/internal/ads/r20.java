package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class r20 implements sb0 {
    private final rn1 d;

    public r20(rn1 rn1Var) {
        this.d = rn1Var;
    }

    @Override // com.google.android.gms.internal.ads.sb0
    public final void D(@androidx.annotation.i0 Context context) {
        try {
            this.d.f();
        } catch (in1 e) {
            tr.d("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.sb0
    public final void e(@androidx.annotation.i0 Context context) {
        try {
            this.d.a();
        } catch (in1 e) {
            tr.d("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.sb0
    public final void q(@androidx.annotation.i0 Context context) {
        try {
            this.d.g();
            if (context != null) {
                this.d.e(context);
            }
        } catch (in1 e) {
            tr.d("Cannot invoke onResume for the mediation adapter.", e);
        }
    }
}

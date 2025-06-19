package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
final class cq0 implements com.google.android.gms.ads.internal.overlay.p, com.google.android.gms.ads.internal.overlay.v, b6, d6, zv2 {
    private zv2 d;
    private b6 e;
    private com.google.android.gms.ads.internal.overlay.p f;
    private d6 g;
    private com.google.android.gms.ads.internal.overlay.v h;

    private cq0() {
    }

    /* synthetic */ cq0(zp0 zp0Var) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void c(zv2 zv2Var, b6 b6Var, com.google.android.gms.ads.internal.overlay.p pVar, d6 d6Var, com.google.android.gms.ads.internal.overlay.v vVar) {
        this.d = zv2Var;
        this.e = b6Var;
        this.f = pVar;
        this.g = d6Var;
        this.h = vVar;
    }

    @Override // com.google.android.gms.internal.ads.d6
    public final synchronized void Q(String str, @androidx.annotation.i0 String str2) {
        if (this.g != null) {
            this.g.Q(str, str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.v
    public final synchronized void a() {
        if (this.h != null) {
            this.h.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.b6
    public final synchronized void e(String str, Bundle bundle) {
        if (this.e != null) {
            this.e.e(str, bundle);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final synchronized void onPause() {
        if (this.f != null) {
            this.f.onPause();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final synchronized void onResume() {
        if (this.f != null) {
            this.f.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zv2
    public final synchronized void p() {
        if (this.d != null) {
            this.d.p();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final synchronized void q4() {
        if (this.f != null) {
            this.f.q4();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final synchronized void r6() {
        if (this.f != null) {
            this.f.r6();
        }
    }
}

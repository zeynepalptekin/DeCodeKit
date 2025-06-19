package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class mm implements sr2 {
    private final Context d;
    private final Object e;
    private String f;
    private boolean g;

    public mm(Context context, String str) {
        this.d = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f = str;
        this.g = false;
        this.e = new Object();
    }

    @Override // com.google.android.gms.internal.ads.sr2
    public final void K(pr2 pr2Var) {
        i(pr2Var.m);
    }

    public final String e() {
        return this.f;
    }

    public final void i(boolean z) {
        if (com.google.android.gms.ads.internal.p.A().k(this.d)) {
            synchronized (this.e) {
                if (this.g == z) {
                    return;
                }
                this.g = z;
                if (TextUtils.isEmpty(this.f)) {
                    return;
                }
                if (this.g) {
                    com.google.android.gms.ads.internal.p.A().t(this.d, this.f);
                } else {
                    com.google.android.gms.ads.internal.p.A().u(this.d, this.f);
                }
            }
        }
    }
}

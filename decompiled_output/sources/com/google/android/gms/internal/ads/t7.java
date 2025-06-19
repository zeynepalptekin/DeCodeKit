package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
final class t7 implements ax1<s7, ParcelFileDescriptor> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ m7 f5351a;

    t7(u7 u7Var, m7 m7Var) {
        this.f5351a = m7Var;
    }

    @Override // com.google.android.gms.internal.ads.ax1
    public final /* synthetic */ dy1<ParcelFileDescriptor> a(s7 s7Var) throws Exception {
        ks ksVar = new ks();
        s7Var.t5(this.f5351a, new w7(this, ksVar));
        return ksVar;
    }
}

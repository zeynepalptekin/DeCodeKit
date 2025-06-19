package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class ab1 implements cf1<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f2661a = false;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2662b = false;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2663c;

    public ab1(boolean z, boolean z2, boolean z3) {
        this.f2663c = z3;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putBoolean("c_pcbg", this.f2661a);
        bundle2.putBoolean("c_phbg", this.f2662b);
        bundle2.putBoolean("ar_lr", this.f2663c);
    }
}

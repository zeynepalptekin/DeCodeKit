package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class hb1 implements cf1<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final int f3653a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f3654b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f3655c;
    private final int d;
    private final int e;
    private final int f;
    private final float g;
    private final boolean h;

    public hb1(int r1, boolean z, boolean z2, int r4, int r5, int r6, float f, boolean z3) {
        this.f3653a = r1;
        this.f3654b = z;
        this.f3655c = z2;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = f;
        this.h = z3;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putInt("am", this.f3653a);
        bundle2.putBoolean("ma", this.f3654b);
        bundle2.putBoolean("sp", this.f3655c);
        bundle2.putInt("muv", this.d);
        bundle2.putInt("rm", this.e);
        bundle2.putInt("riv", this.f);
        bundle2.putFloat("android_app_volume", this.g);
        bundle2.putBoolean("android_app_muted", this.h);
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.g0.a;

/* loaded from: classes.dex */
public final class i8 implements com.google.android.gms.ads.g0.a {

    /* renamed from: a, reason: collision with root package name */
    private final a.EnumC0162a f3784a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3785b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3786c;

    public i8(a.EnumC0162a enumC0162a, String str, int r3) {
        this.f3784a = enumC0162a;
        this.f3785b = str;
        this.f3786c = r3;
    }

    @Override // com.google.android.gms.ads.g0.a
    public final String C() {
        return this.f3785b;
    }

    @Override // com.google.android.gms.ads.g0.a
    public final a.EnumC0162a a() {
        return this.f3784a;
    }

    @Override // com.google.android.gms.ads.g0.a
    public final int b() {
        return this.f3786c;
    }
}

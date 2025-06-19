package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
final class xn0 implements ru1<fz2, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ double f6010a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ boolean f6011b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ un0 f6012c;

    xn0(un0 un0Var, double d, boolean z) {
        this.f6012c = un0Var;
        this.f6010a = d;
        this.f6011b = z;
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final /* synthetic */ Bitmap a(fz2 fz2Var) {
        return this.f6012c.b(fz2Var.f3478b, this.f6010a, this.f6011b);
    }
}

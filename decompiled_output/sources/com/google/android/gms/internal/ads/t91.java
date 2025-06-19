package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class t91 implements pe2<r91> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cy1> f5369a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f5370b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<an1> f5371c;
    private final ze2<ViewGroup> d;

    public t91(ze2<cy1> ze2Var, ze2<Context> ze2Var2, ze2<an1> ze2Var3, ze2<ViewGroup> ze2Var4) {
        this.f5369a = ze2Var;
        this.f5370b = ze2Var2;
        this.f5371c = ze2Var3;
        this.d = ze2Var4;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new r91(this.f5369a.get(), this.f5370b.get(), this.f5371c.get(), this.d.get());
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.cv2;

/* loaded from: classes.dex */
public final class uj0 implements pe2<vj0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<mm> f5529a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f5530b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<lm> f5531c;
    private final ze2<View> d;
    private final ze2<cv2.a.EnumC0172a> e;

    private uj0(ze2<mm> ze2Var, ze2<Context> ze2Var2, ze2<lm> ze2Var3, ze2<View> ze2Var4, ze2<cv2.a.EnumC0172a> ze2Var5) {
        this.f5529a = ze2Var;
        this.f5530b = ze2Var2;
        this.f5531c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
    }

    public static uj0 a(ze2<mm> ze2Var, ze2<Context> ze2Var2, ze2<lm> ze2Var3, ze2<View> ze2Var4, ze2<cv2.a.EnumC0172a> ze2Var5) {
        return new uj0(ze2Var, ze2Var2, ze2Var3, ze2Var4, ze2Var5);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new vj0(this.f5529a.get(), this.f5530b.get(), this.f5531c.get(), this.d.get(), this.e.get());
    }
}

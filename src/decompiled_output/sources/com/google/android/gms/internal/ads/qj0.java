package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.cv2;

/* loaded from: classes.dex */
public final class qj0 implements pe2<rj0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f5021a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<rw> f5022b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<km1> f5023c;
    private final ze2<as> d;
    private final ze2<cv2.a.EnumC0172a> e;

    private qj0(ze2<Context> ze2Var, ze2<rw> ze2Var2, ze2<km1> ze2Var3, ze2<as> ze2Var4, ze2<cv2.a.EnumC0172a> ze2Var5) {
        this.f5021a = ze2Var;
        this.f5022b = ze2Var2;
        this.f5023c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
    }

    public static qj0 a(ze2<Context> ze2Var, ze2<rw> ze2Var2, ze2<km1> ze2Var3, ze2<as> ze2Var4, ze2<cv2.a.EnumC0172a> ze2Var5) {
        return new qj0(ze2Var, ze2Var2, ze2Var3, ze2Var4, ze2Var5);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new rj0(this.f5021a.get(), this.f5022b.get(), this.f5023c.get(), this.d.get(), this.e.get());
    }
}

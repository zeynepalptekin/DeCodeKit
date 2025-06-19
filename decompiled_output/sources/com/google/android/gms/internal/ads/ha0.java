package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;

/* loaded from: classes.dex */
public final class ha0 implements pe2<fa0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cr1> f3648a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<as> f3649b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<ApplicationInfo> f3650c;
    private final ze2<String> d;
    private final ze2<List<String>> e;
    private final ze2<PackageInfo> f;
    private final ze2<dy1<String>> g;
    private final ze2<qo> h;
    private final ze2<String> i;
    private final ze2<ef1<Bundle>> j;

    private ha0(ze2<cr1> ze2Var, ze2<as> ze2Var2, ze2<ApplicationInfo> ze2Var3, ze2<String> ze2Var4, ze2<List<String>> ze2Var5, ze2<PackageInfo> ze2Var6, ze2<dy1<String>> ze2Var7, ze2<qo> ze2Var8, ze2<String> ze2Var9, ze2<ef1<Bundle>> ze2Var10) {
        this.f3648a = ze2Var;
        this.f3649b = ze2Var2;
        this.f3650c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
        this.f = ze2Var6;
        this.g = ze2Var7;
        this.h = ze2Var8;
        this.i = ze2Var9;
        this.j = ze2Var10;
    }

    public static ha0 a(ze2<cr1> ze2Var, ze2<as> ze2Var2, ze2<ApplicationInfo> ze2Var3, ze2<String> ze2Var4, ze2<List<String>> ze2Var5, ze2<PackageInfo> ze2Var6, ze2<dy1<String>> ze2Var7, ze2<qo> ze2Var8, ze2<String> ze2Var9, ze2<ef1<Bundle>> ze2Var10) {
        return new ha0(ze2Var, ze2Var2, ze2Var3, ze2Var4, ze2Var5, ze2Var6, ze2Var7, ze2Var8, ze2Var9, ze2Var10);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new fa0(this.f3648a.get(), this.f3649b.get(), this.f3650c.get(), this.d.get(), this.e.get(), this.f.get(), me2.b(this.g), this.h.get(), this.i.get(), this.j.get());
    }
}

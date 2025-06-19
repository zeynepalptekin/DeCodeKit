package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class fa0 {

    /* renamed from: a, reason: collision with root package name */
    private final cr1 f3387a;

    /* renamed from: b, reason: collision with root package name */
    private final as f3388b;

    /* renamed from: c, reason: collision with root package name */
    private final ApplicationInfo f3389c;
    private final String d;
    private final List<String> e;
    private final PackageInfo f;
    private final je2<dy1<String>> g;
    private final qo h;
    private final String i;
    private final ef1<Bundle> j;

    public fa0(cr1 cr1Var, as asVar, ApplicationInfo applicationInfo, String str, List<String> list, @androidx.annotation.i0 PackageInfo packageInfo, je2<dy1<String>> je2Var, qo qoVar, String str2, ef1<Bundle> ef1Var) {
        this.f3387a = cr1Var;
        this.f3388b = asVar;
        this.f3389c = applicationInfo;
        this.d = str;
        this.e = list;
        this.f = packageInfo;
        this.g = je2Var;
        this.h = qoVar;
        this.i = str2;
        this.j = ef1Var;
    }

    public final dy1<Bundle> a() {
        return this.f3387a.g(zq1.SIGNALS).d(this.j.a(new Bundle())).f();
    }

    public final dy1<wi> b() {
        final dy1<Bundle> dy1VarA = a();
        return this.f3387a.a(zq1.REQUEST_PARCEL, dy1VarA, this.g.get()).a(new Callable(this, dy1VarA) { // from class: com.google.android.gms.internal.ads.ea0

            /* renamed from: a, reason: collision with root package name */
            private final fa0 f3242a;

            /* renamed from: b, reason: collision with root package name */
            private final dy1 f3243b;

            {
                this.f3242a = this;
                this.f3243b = dy1VarA;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f3242a.c(this.f3243b);
            }
        }).f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ wi c(dy1 dy1Var) throws Exception {
        return new wi((Bundle) dy1Var.get(), this.f3388b, this.f3389c, this.d, this.e, this.f, this.g.get().get(), this.h.v(), this.i, null, null);
    }
}

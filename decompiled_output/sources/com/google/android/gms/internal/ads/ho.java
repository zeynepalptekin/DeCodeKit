package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ho implements gs2 {

    /* renamed from: b, reason: collision with root package name */
    private final qo f3699b;

    @com.google.android.gms.common.util.d0
    private final Cdo d;

    /* renamed from: a, reason: collision with root package name */
    private final Object f3698a = new Object();

    @com.google.android.gms.common.util.d0
    private final HashSet<un> e = new HashSet<>();

    @com.google.android.gms.common.util.d0
    private final HashSet<io> f = new HashSet<>();

    /* renamed from: c, reason: collision with root package name */
    private final fo f3700c = new fo();

    public ho(String str, qo qoVar) {
        this.d = new Cdo(str, qoVar);
        this.f3699b = qoVar;
    }

    @Override // com.google.android.gms.internal.ads.gs2
    public final void a(boolean z) {
        long jA = com.google.android.gms.ads.internal.p.j().a();
        if (!z) {
            this.f3699b.s(jA);
            this.f3699b.y(this.d.d);
            return;
        }
        if (jA - this.f3699b.n() > ((Long) qx2.e().c(e0.x0)).longValue()) {
            this.d.d = -1;
        } else {
            this.d.d = this.f3699b.H();
        }
    }

    public final Bundle b(Context context, go goVar) {
        HashSet<un> hashSet = new HashSet<>();
        synchronized (this.f3698a) {
            hashSet.addAll(this.e);
            this.e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.d.c(context, this.f3700c.b()));
        Bundle bundle2 = new Bundle();
        Iterator<io> it = this.f.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NoSuchMethodError();
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator<un> it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().a());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        goVar.a(hashSet);
        return bundle;
    }

    public final un c(com.google.android.gms.common.util.g gVar, String str) {
        return new un(gVar, this, this.f3700c.a(), str);
    }

    public final void d(jw2 jw2Var, long j) {
        synchronized (this.f3698a) {
            this.d.a(jw2Var, j);
        }
    }

    public final void e(un unVar) {
        synchronized (this.f3698a) {
            this.e.add(unVar);
        }
    }

    public final void f(HashSet<un> hashSet) {
        synchronized (this.f3698a) {
            this.e.addAll(hashSet);
        }
    }

    public final void g() {
        synchronized (this.f3698a) {
            this.d.d();
        }
    }

    public final void h() {
        synchronized (this.f3698a) {
            this.d.e();
        }
    }
}

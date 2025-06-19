package com.google.firebase.analytics;

import android.os.Bundle;
import androidx.annotation.i0;
import c.a.b.b.g.c.h;
import com.google.android.gms.measurement.internal.d6;
import com.google.android.gms.measurement.internal.e6;
import com.google.android.gms.measurement.internal.k7;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class d implements k7 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ h f6903a;

    d(h hVar) {
        this.f6903a = hVar;
    }

    @Override // com.google.android.gms.measurement.internal.k7
    public final void F0(String str) {
        this.f6903a.T(str);
    }

    @Override // com.google.android.gms.measurement.internal.k7
    public final void K0(String str, String str2, Bundle bundle, long j) {
        this.f6903a.y(str, str2, bundle, j);
    }

    @Override // com.google.android.gms.measurement.internal.k7
    public final String a() {
        return this.f6903a.c0();
    }

    @Override // com.google.android.gms.measurement.internal.k7
    public final String b() {
        return this.f6903a.e0();
    }

    @Override // com.google.android.gms.measurement.internal.k7
    public final String c() {
        return this.f6903a.X();
    }

    @Override // com.google.android.gms.measurement.internal.k7
    public final String d() {
        return this.f6903a.R();
    }

    @Override // com.google.android.gms.measurement.internal.k7
    public final Object e(int r2) {
        return this.f6903a.g(r2);
    }

    @Override // com.google.android.gms.measurement.internal.k7
    public final long f() {
        return this.f6903a.Z();
    }

    @Override // com.google.android.gms.measurement.internal.k7
    public final List<Bundle> g(String str, String str2) {
        return this.f6903a.H(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.k7
    public final Map<String, Object> h(String str, String str2, boolean z) {
        return this.f6903a.i(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.k7
    public final void i(String str) {
        this.f6903a.N(str);
    }

    @Override // com.google.android.gms.measurement.internal.k7
    public final int j(String str) {
        return this.f6903a.W(str);
    }

    @Override // com.google.android.gms.measurement.internal.k7
    public final void k(d6 d6Var) {
        this.f6903a.q(d6Var);
    }

    @Override // com.google.android.gms.measurement.internal.k7
    public final void l(@i0 Boolean bool) {
        this.f6903a.s(bool);
    }

    @Override // com.google.android.gms.measurement.internal.k7
    public final void m(String str, String str2, Object obj) {
        this.f6903a.A(str, str2, obj);
    }

    @Override // com.google.android.gms.measurement.internal.k7
    public final void n(String str, String str2, Bundle bundle) {
        this.f6903a.O(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.k7
    public final void o(d6 d6Var) {
        this.f6903a.M(d6Var);
    }

    @Override // com.google.android.gms.measurement.internal.k7
    public final void p(e6 e6Var) {
        this.f6903a.r(e6Var);
    }

    @Override // com.google.android.gms.measurement.internal.k7
    public final void s0(Bundle bundle) {
        this.f6903a.m(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.k7
    public final void v1(String str, String str2, Bundle bundle) {
        this.f6903a.x(str, str2, bundle);
    }
}

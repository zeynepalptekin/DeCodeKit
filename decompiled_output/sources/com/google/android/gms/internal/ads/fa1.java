package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class fa1 implements cf1<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final qw2 f3390a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3391b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f3392c;
    private final String d;
    private final float e;
    private final int f;
    private final int g;
    private final String h;
    private final boolean i;

    public fa1(qw2 qw2Var, String str, boolean z, String str2, float f, int r7, int r8, String str3, boolean z2) {
        com.google.android.gms.common.internal.r.l(qw2Var, "the adSize must not be null");
        this.f3390a = qw2Var;
        this.f3391b = str;
        this.f3392c = z;
        this.d = str2;
        this.e = f;
        this.f = r7;
        this.g = r8;
        this.h = str3;
        this.i = z2;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(Bundle bundle) {
        Bundle bundle2 = bundle;
        jn1.f(bundle2, "smart_w", "full", this.f3390a.h == -1);
        jn1.f(bundle2, "smart_h", "auto", this.f3390a.e == -2);
        jn1.c(bundle2, "ene", Boolean.TRUE, this.f3390a.m);
        jn1.f(bundle2, "rafmt", "102", this.f3390a.p);
        jn1.f(bundle2, "rafmt", "103", this.f3390a.q);
        jn1.c(bundle2, "inline_adaptive_slot", Boolean.TRUE, this.i);
        jn1.e(bundle2, "format", this.f3391b);
        jn1.f(bundle2, "fluid", "height", this.f3392c);
        jn1.f(bundle2, "sz", this.d, !TextUtils.isEmpty(r0));
        bundle2.putFloat("u_sd", this.e);
        bundle2.putInt("sw", this.f);
        bundle2.putInt("sh", this.g);
        String str = this.h;
        jn1.f(bundle2, "sc", str, true ^ TextUtils.isEmpty(str));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        qw2[] qw2VarArr = this.f3390a.j;
        if (qw2VarArr == null) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt("height", this.f3390a.e);
            bundle3.putInt("width", this.f3390a.h);
            bundle3.putBoolean("is_fluid_height", this.f3390a.l);
            arrayList.add(bundle3);
        } else {
            for (qw2 qw2Var : qw2VarArr) {
                Bundle bundle4 = new Bundle();
                bundle4.putBoolean("is_fluid_height", qw2Var.l);
                bundle4.putInt("height", qw2Var.e);
                bundle4.putInt("width", qw2Var.h);
                arrayList.add(bundle4);
            }
        }
        bundle2.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}

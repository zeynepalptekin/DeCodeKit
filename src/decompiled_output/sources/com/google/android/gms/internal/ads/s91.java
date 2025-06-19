package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class s91 implements cf1<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5230a;

    /* renamed from: b, reason: collision with root package name */
    private final qw2 f5231b;

    /* renamed from: c, reason: collision with root package name */
    private final List<Parcelable> f5232c;

    public s91(Context context, qw2 qw2Var, List<Parcelable> list) {
        this.f5230a = context;
        this.f5231b = qw2Var;
        this.f5232c = list;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (c2.f2912a.a().booleanValue()) {
            Bundle bundle3 = new Bundle();
            com.google.android.gms.ads.internal.p.c();
            bundle3.putString("activity", to.z(this.f5230a));
            Bundle bundle4 = new Bundle();
            bundle4.putInt("width", this.f5231b.h);
            bundle4.putInt("height", this.f5231b.e);
            bundle3.putBundle("size", bundle4);
            if (this.f5232c.size() > 0) {
                List<Parcelable> list = this.f5232c;
                bundle3.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle2.putBundle("view_hierarchy", bundle3);
        }
    }
}

package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.c.a;

/* loaded from: classes.dex */
final class f implements a.c {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ g f6899a;

    public f(g gVar) {
        this.f6899a = gVar;
    }

    @Override // com.google.android.gms.measurement.c.a.c, com.google.android.gms.measurement.internal.d6
    public final void a(String str, String str2, Bundle bundle, long j) {
        if (str == null || str.equals("crash") || !b.i(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString(a.C0190a.f6334b, str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        this.f6899a.f6900a.a(3, bundle2);
    }
}

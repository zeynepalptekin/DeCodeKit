package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.c.a;

/* loaded from: classes.dex */
final class d implements a.c {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ e f6895a;

    public d(e eVar) {
        this.f6895a = eVar;
    }

    @Override // com.google.android.gms.measurement.c.a.c, com.google.android.gms.measurement.internal.d6
    public final void a(String str, String str2, Bundle bundle, long j) {
        if (this.f6895a.f6896a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", b.l(str2));
            this.f6895a.f6897b.a(2, bundle2);
        }
    }
}

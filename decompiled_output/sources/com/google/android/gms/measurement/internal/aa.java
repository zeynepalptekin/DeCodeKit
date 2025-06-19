package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
final class aa implements ga {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t9 f6350a;

    aa(t9 t9Var) {
        this.f6350a = t9Var;
    }

    @Override // com.google.android.gms.measurement.internal.ga
    public final void e(String str, Bundle bundle) throws IllegalStateException {
        if (TextUtils.isEmpty(str)) {
            this.f6350a.j.B().E().a("AppId not known when logging error event");
        } else {
            this.f6350a.x().v(new z9(this, str, bundle));
        }
    }
}

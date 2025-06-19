package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
final class z6 implements ga {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ f6 f6580a;

    z6(f6 f6Var) {
        this.f6580a = f6Var;
    }

    @Override // com.google.android.gms.measurement.internal.ga
    public final void e(String str, Bundle bundle) throws IllegalStateException {
        if (TextUtils.isEmpty(str)) {
            this.f6580a.Z("auto", "_err", bundle);
        } else {
            this.f6580a.a0("auto", "_err", bundle, str);
        }
    }
}

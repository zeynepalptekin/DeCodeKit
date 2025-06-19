package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class ao1 implements go, cb0 {

    @GuardedBy("this")
    private final HashSet<un> d = new HashSet<>();
    private final Context e;
    private final ho f;

    public ao1(Context context, ho hoVar) {
        this.e = context;
        this.f = hoVar;
    }

    @Override // com.google.android.gms.internal.ads.go
    public final synchronized void a(HashSet<un> hashSet) {
        this.d.clear();
        this.d.addAll(hashSet);
    }

    public final Bundle b() {
        return this.f.b(this.e, this);
    }

    @Override // com.google.android.gms.internal.ads.cb0
    public final synchronized void i(dw2 dw2Var) {
        if (dw2Var.d != 3) {
            this.f.f(this.d);
        }
    }
}

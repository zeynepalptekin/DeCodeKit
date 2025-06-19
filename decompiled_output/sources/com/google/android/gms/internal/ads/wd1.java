package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class wd1 implements ff1<td1> {

    /* renamed from: a, reason: collision with root package name */
    private final cy1 f5821a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f5822b;

    public wd1(cy1 cy1Var, @androidx.annotation.i0 Bundle bundle) {
        this.f5821a = cy1Var;
        this.f5822b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<td1> a() {
        return this.f5821a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.vd1

            /* renamed from: a, reason: collision with root package name */
            private final wd1 f5668a;

            {
                this.f5668a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f5668a.b();
            }
        });
    }

    final /* synthetic */ td1 b() throws Exception {
        return new td1(this.f5822b);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class pg1 implements ff1<mg1> {

    /* renamed from: a, reason: collision with root package name */
    hu2 f4812a;

    /* renamed from: b, reason: collision with root package name */
    private cy1 f4813b;

    /* renamed from: c, reason: collision with root package name */
    Context f4814c;

    public pg1(hu2 hu2Var, cy1 cy1Var, Context context) {
        this.f4812a = hu2Var;
        this.f4813b = cy1Var;
        this.f4814c = context;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<mg1> a() {
        return this.f4813b.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.og1

            /* renamed from: a, reason: collision with root package name */
            private final pg1 f4691a;

            {
                this.f4691a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                pg1 pg1Var = this.f4691a;
                return new mg1(pg1Var.f4812a.a(pg1Var.f4814c));
            }
        });
    }
}

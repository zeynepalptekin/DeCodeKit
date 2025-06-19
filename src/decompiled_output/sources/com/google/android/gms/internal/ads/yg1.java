package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class yg1 implements ff1<zg1> {

    /* renamed from: a, reason: collision with root package name */
    p f6129a;

    /* renamed from: b, reason: collision with root package name */
    private cy1 f6130b;

    /* renamed from: c, reason: collision with root package name */
    List<String> f6131c;

    public yg1(p pVar, cy1 cy1Var, List<String> list) {
        this.f6129a = pVar;
        this.f6130b = cy1Var;
        this.f6131c = list;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<zg1> a() {
        return this.f6130b.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.bh1

            /* renamed from: a, reason: collision with root package name */
            private final yg1 f2834a;

            {
                this.f2834a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                yg1 yg1Var = this.f2834a;
                return new zg1(yg1Var.f6129a.j(yg1Var.f6131c));
            }
        });
    }
}

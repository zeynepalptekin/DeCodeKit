package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class od1 implements ff1<ld1> {

    /* renamed from: a, reason: collision with root package name */
    private final cy1 f4680a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f4681b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<String> f4682c;

    public od1(cy1 cy1Var, Context context, Set<String> set) {
        this.f4680a = cy1Var;
        this.f4681b = context;
        this.f4682c = set;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<ld1> a() {
        return this.f4680a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.nd1

            /* renamed from: a, reason: collision with root package name */
            private final od1 f4521a;

            {
                this.f4521a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f4521a.b();
            }
        });
    }

    final /* synthetic */ ld1 b() throws Exception {
        return (((Boolean) qx2.e().c(e0.k3)).booleanValue() && ld1.a(this.f4682c)) ? new ld1(com.google.android.gms.ads.internal.p.r().a(this.f4681b)) : new ld1(null);
    }
}

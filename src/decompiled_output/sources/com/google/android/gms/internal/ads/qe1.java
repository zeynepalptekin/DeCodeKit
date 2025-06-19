package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class qe1 implements ff1<re1> {

    /* renamed from: a, reason: collision with root package name */
    private final cy1 f4991a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f4992b;

    /* renamed from: c, reason: collision with root package name */
    private final as f4993c;

    public qe1(cy1 cy1Var, Context context, as asVar) {
        this.f4991a = cy1Var;
        this.f4992b = context;
        this.f4993c = asVar;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<re1> a() {
        return this.f4991a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.te1

            /* renamed from: a, reason: collision with root package name */
            private final qe1 f5393a;

            {
                this.f5393a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f5393a.b();
            }
        });
    }

    final /* synthetic */ re1 b() throws Exception {
        boolean zF = c.a.b.b.d.s.c.a(this.f4992b).f();
        com.google.android.gms.ads.internal.p.c();
        boolean zE = to.E(this.f4992b);
        String str = this.f4993c.d;
        com.google.android.gms.ads.internal.p.e();
        boolean zS = dp.s();
        com.google.android.gms.ads.internal.p.c();
        return new re1(zF, zE, str, zS, to.B(this.f4992b), DynamiteModule.c(this.f4992b, ModuleDescriptor.MODULE_ID), DynamiteModule.a(this.f4992b, ModuleDescriptor.MODULE_ID));
    }
}

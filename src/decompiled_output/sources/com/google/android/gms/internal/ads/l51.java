package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class l51 implements th0 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ wm1 f4198a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ km1 f4199b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ w01 f4200c;
    final /* synthetic */ j51 d;

    l51(j51 j51Var, wm1 wm1Var, km1 km1Var, w01 w01Var) {
        this.d = j51Var;
        this.f4198a = wm1Var;
        this.f4199b = km1Var;
        this.f4200c = w01Var;
    }

    @Override // com.google.android.gms.internal.ads.th0
    public final void a(int r3) {
        String strValueOf = String.valueOf(this.f4200c.f5758a);
        tr.i(strValueOf.length() != 0 ? "Fail to initialize adapter ".concat(strValueOf) : new String("Fail to initialize adapter "));
    }

    @Override // com.google.android.gms.internal.ads.th0
    public final void f0() {
        Executor executor = this.d.f3917b;
        final wm1 wm1Var = this.f4198a;
        final km1 km1Var = this.f4199b;
        final w01 w01Var = this.f4200c;
        executor.execute(new Runnable(this, wm1Var, km1Var, w01Var) { // from class: com.google.android.gms.internal.ads.o51
            private final l51 d;
            private final wm1 e;
            private final km1 f;
            private final w01 g;

            {
                this.d = this;
                this.e = wm1Var;
                this.f = km1Var;
                this.g = w01Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                l51 l51Var = this.d;
                wm1 wm1Var2 = this.e;
                km1 km1Var2 = this.f;
                w01 w01Var2 = this.g;
                j51 j51Var = l51Var.d;
                j51.e(wm1Var2, km1Var2, w01Var2);
            }
        });
    }
}

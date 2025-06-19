package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class ad1 implements ff1<bd1> {

    /* renamed from: a, reason: collision with root package name */
    private final cy1 f2668a;

    /* renamed from: b, reason: collision with root package name */
    private final im1 f2669b;

    public ad1(cy1 cy1Var, im1 im1Var) {
        this.f2668a = cy1Var;
        this.f2669b = im1Var;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<bd1> a() {
        return this.f2668a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.dd1

            /* renamed from: a, reason: collision with root package name */
            private final ad1 f3117a;

            {
                this.f3117a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f3117a.b();
            }
        });
    }

    final /* synthetic */ bd1 b() throws Exception {
        return new bd1(this.f2669b);
    }
}

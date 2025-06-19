package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class qa1 implements ff1<ra1> {

    /* renamed from: a, reason: collision with root package name */
    private final cy1 f4973a;

    /* renamed from: b, reason: collision with root package name */
    private final an1 f4974b;

    /* renamed from: c, reason: collision with root package name */
    private final as f4975c;

    public qa1(cy1 cy1Var, an1 an1Var, as asVar) {
        this.f4973a = cy1Var;
        this.f4974b = an1Var;
        this.f4975c = asVar;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<ra1> a() {
        return this.f4973a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.ta1

            /* renamed from: a, reason: collision with root package name */
            private final qa1 f5374a;

            {
                this.f5374a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f5374a.b();
            }
        });
    }

    final /* synthetic */ ra1 b() throws Exception {
        return new ra1(this.f4974b.j, this.f4975c);
    }
}

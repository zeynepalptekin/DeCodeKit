package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class ug1 implements ff1<vg1> {

    /* renamed from: a, reason: collision with root package name */
    private rn f5516a;

    /* renamed from: b, reason: collision with root package name */
    private cy1 f5517b;

    /* renamed from: c, reason: collision with root package name */
    private String f5518c;

    public ug1(rn rnVar, cy1 cy1Var, String str) {
        this.f5516a = rnVar;
        this.f5517b = cy1Var;
        this.f5518c = str;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<vg1> a() {
        new ks();
        final dy1<String> dy1VarG = qx1.g(null);
        if (((Boolean) qx2.e().c(e0.X3)).booleanValue()) {
            dy1VarG = this.f5516a.b(this.f5518c);
        }
        final dy1<String> dy1VarA = this.f5516a.a(this.f5518c);
        return qx1.h(dy1VarG, dy1VarA).a(new Callable(dy1VarG, dy1VarA) { // from class: com.google.android.gms.internal.ads.xg1

            /* renamed from: a, reason: collision with root package name */
            private final dy1 f5975a;

            /* renamed from: b, reason: collision with root package name */
            private final dy1 f5976b;

            {
                this.f5975a = dy1VarG;
                this.f5976b = dy1VarA;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new vg1((String) this.f5975a.get(), (String) this.f5976b.get());
            }
        }, cs.f3023a);
    }
}

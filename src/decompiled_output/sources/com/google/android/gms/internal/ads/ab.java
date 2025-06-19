package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ab implements os<u9> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ za f2660a;

    ab(za zaVar) {
        this.f2660a = zaVar;
    }

    @Override // com.google.android.gms.internal.ads.os
    public final /* synthetic */ void a(u9 u9Var) {
        final u9 u9Var2 = u9Var;
        cs.e.execute(new Runnable(this, u9Var2) { // from class: com.google.android.gms.internal.ads.db
            private final ab d;
            private final u9 e;

            {
                this.d = this;
                this.e = u9Var2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ab abVar = this.d;
                u9 u9Var3 = this.e;
                abVar.f2660a.d.a(u9Var3);
                u9Var3.destroy();
            }
        });
    }
}

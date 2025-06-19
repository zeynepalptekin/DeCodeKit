package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class nr1 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f4598a;

    /* renamed from: b, reason: collision with root package name */
    private final xr f4599b;

    public nr1(Executor executor, xr xrVar) {
        this.f4598a = executor;
        this.f4599b = xrVar;
    }

    public final void a(final String str) {
        this.f4598a.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.qr1
            private final nr1 d;
            private final String e;

            {
                this.d = this;
                this.e = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.b(this.e);
            }
        });
    }

    final /* synthetic */ void b(String str) {
        this.f4599b.a(str);
    }

    public final void c(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }
}

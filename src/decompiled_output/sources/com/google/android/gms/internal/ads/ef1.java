package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ef1<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Set<ff1<? extends cf1<T>>> f3263a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f3264b;

    public ef1(Executor executor, Set<ff1<? extends cf1<T>>> set) {
        this.f3264b = executor;
        this.f3263a = set;
    }

    public final dy1<T> a(final T t) {
        final ArrayList arrayList = new ArrayList(this.f3263a.size());
        for (final ff1<? extends cf1<T>> ff1Var : this.f3263a) {
            dy1<S> dy1VarA = ff1Var.a();
            if (z1.f6208a.a().booleanValue()) {
                final long jC = com.google.android.gms.ads.internal.p.j().c();
                dy1VarA.e(new Runnable(ff1Var, jC) { // from class: com.google.android.gms.internal.ads.hf1
                    private final ff1 d;
                    private final long e;

                    {
                        this.d = ff1Var;
                        this.e = jC;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ff1 ff1Var2 = this.d;
                        long j = this.e;
                        String canonicalName = ff1Var2.getClass().getCanonicalName();
                        long jC2 = com.google.android.gms.ads.internal.p.j().c() - j;
                        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 40);
                        sb.append("Signal runtime : ");
                        sb.append(canonicalName);
                        sb.append(" = ");
                        sb.append(jC2);
                        oo.m(sb.toString());
                    }
                }, cs.f);
            }
            arrayList.add(dy1VarA);
        }
        return qx1.o(arrayList).a(new Callable(arrayList, t) { // from class: com.google.android.gms.internal.ads.gf1

            /* renamed from: a, reason: collision with root package name */
            private final List f3532a;

            /* renamed from: b, reason: collision with root package name */
            private final Object f3533b;

            {
                this.f3532a = arrayList;
                this.f3533b = t;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list = this.f3532a;
                Object obj = this.f3533b;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    cf1 cf1Var = (cf1) ((dy1) it.next()).get();
                    if (cf1Var != null) {
                        cf1Var.b(obj);
                    }
                }
                return obj;
            }
        }, this.f3264b);
    }
}

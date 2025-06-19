package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class hn1 {

    /* renamed from: a, reason: collision with root package name */
    private final km1 f3695a;

    /* renamed from: b, reason: collision with root package name */
    private final lm1 f3696b;

    /* renamed from: c, reason: collision with root package name */
    private final i01 f3697c;
    private final nr1 d;

    @com.google.android.gms.common.util.d0
    public hn1(i01 i01Var, nr1 nr1Var, km1 km1Var, lm1 lm1Var) {
        this.f3695a = km1Var;
        this.f3696b = lm1Var;
        this.f3697c = i01Var;
        this.d = nr1Var;
    }

    private final void b(String str, int r9) {
        if (!this.f3695a.e0) {
            this.d.a(str);
        } else {
            this.f3697c.b(new o01(com.google.android.gms.ads.internal.p.j().a(), this.f3696b.f4275b, str, r9));
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<Ljava/lang/String;>;Ljava/lang/Integer;)V */
    public final void a(List list, int r3) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((String) it.next(), r3);
        }
    }

    public final void c(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            b(it.next(), j01.f3893b);
        }
    }
}

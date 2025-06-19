package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class cs2 {

    /* renamed from: b, reason: collision with root package name */
    @com.google.android.gms.common.util.d0
    private int f3028b;

    /* renamed from: a, reason: collision with root package name */
    private final Object f3027a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private List<ds2> f3029c = new LinkedList();

    public final boolean a(ds2 ds2Var) {
        synchronized (this.f3027a) {
            return this.f3029c.contains(ds2Var);
        }
    }

    public final boolean b(ds2 ds2Var) {
        synchronized (this.f3027a) {
            Iterator<ds2> it = this.f3029c.iterator();
            while (it.hasNext()) {
                ds2 next = it.next();
                if (com.google.android.gms.ads.internal.p.g().r().x()) {
                    if (!com.google.android.gms.ads.internal.p.g().r().j() && ds2Var != next && next.k().equals(ds2Var.k())) {
                        it.remove();
                        return true;
                    }
                } else if (ds2Var != next && next.i().equals(ds2Var.i())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void c(ds2 ds2Var) {
        synchronized (this.f3027a) {
            if (this.f3029c.size() >= 10) {
                int size = this.f3029c.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                tr.f(sb.toString());
                this.f3029c.remove(0);
            }
            int r1 = this.f3028b;
            this.f3028b = r1 + 1;
            ds2Var.e(r1);
            ds2Var.o();
            this.f3029c.add(ds2Var);
        }
    }

    @androidx.annotation.i0
    public final ds2 d(boolean z) {
        synchronized (this.f3027a) {
            ds2 ds2Var = null;
            if (this.f3029c.size() == 0) {
                tr.f("Queue empty");
                return null;
            }
            int r4 = 0;
            if (this.f3029c.size() < 2) {
                ds2 ds2Var2 = this.f3029c.get(0);
                if (z) {
                    this.f3029c.remove(0);
                } else {
                    ds2Var2.l();
                }
                return ds2Var2;
            }
            int r8 = Integer.MIN_VALUE;
            int r3 = 0;
            for (ds2 ds2Var3 : this.f3029c) {
                int r6 = ds2Var3.a();
                if (r6 > r8) {
                    r4 = r3;
                    ds2Var = ds2Var3;
                    r8 = r6;
                }
                r3++;
            }
            this.f3029c.remove(r4);
            return ds2Var;
        }
    }
}

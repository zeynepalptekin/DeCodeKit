package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class fh0 extends pf0<sr2> implements sr2 {

    @GuardedBy("this")
    private Map<View, or2> e;
    private final Context f;
    private final km1 g;

    public fh0(Context context, Set<ch0<sr2>> set, km1 km1Var) {
        super(set);
        this.e = new WeakHashMap(1);
        this.f = context;
        this.g = km1Var;
    }

    public final synchronized void H0(View view) {
        or2 or2Var = this.e.get(view);
        if (or2Var == null) {
            or2Var = new or2(this.f, view);
            or2Var.d(this);
            this.e.put(view, or2Var);
        }
        if (this.g != null && this.g.R) {
            if (((Boolean) qx2.e().c(e0.e1)).booleanValue()) {
                or2Var.i(((Long) qx2.e().c(e0.d1)).longValue());
                return;
            }
        }
        or2Var.m();
    }

    public final synchronized void I0(View view) {
        if (this.e.containsKey(view)) {
            this.e.get(view).e(this);
            this.e.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.sr2
    public final synchronized void K(final pr2 pr2Var) {
        A0(new rf0(pr2Var) { // from class: com.google.android.gms.internal.ads.eh0

            /* renamed from: a, reason: collision with root package name */
            private final pr2 f3272a;

            {
                this.f3272a = pr2Var;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void a(Object obj) {
                ((sr2) obj).K(this.f3272a);
            }
        });
    }
}

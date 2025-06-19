package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.i0;
import com.google.android.gms.internal.ads.as;
import com.google.android.gms.internal.ads.cs;
import com.google.android.gms.internal.ads.e0;
import com.google.android.gms.internal.ads.f22;
import com.google.android.gms.internal.ads.jr;
import com.google.android.gms.internal.ads.qn1;
import com.google.android.gms.internal.ads.qx2;
import com.google.android.gms.internal.ads.tr;
import com.google.android.gms.internal.ads.w31;
import com.google.android.gms.internal.ads.xu1;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class f implements xu1, Runnable {
    private final int g;
    private Context h;
    private as i;
    private final List<Object[]> d = new Vector();
    private final AtomicReference<xu1> e = new AtomicReference<>();
    private final AtomicReference<xu1> f = new AtomicReference<>();
    private CountDownLatch j = new CountDownLatch(1);

    public f(Context context, as asVar) {
        this.h = context;
        this.i = asVar;
        int r3 = ((Integer) qx2.e().c(e0.y1)).intValue();
        this.g = r3 != 1 ? r3 != 2 ? w31.f5778a : w31.f5780c : w31.f5779b;
        if (!((Boolean) qx2.e().c(e0.O1)).booleanValue()) {
            qx2.a();
            if (!jr.y()) {
                run();
                return;
            }
        }
        cs.f3023a.execute(this);
    }

    @i0
    private final xu1 h() {
        return (this.g == w31.f5779b ? this.f : this.e).get();
    }

    private static Context i(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private final boolean j() throws InterruptedException {
        try {
            this.j.await();
            return true;
        } catch (InterruptedException e) {
            tr.d("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    private final void k() {
        xu1 xu1VarH = h();
        if (this.d.isEmpty() || xu1VarH == null) {
            return;
        }
        for (Object[] objArr : this.d) {
            if (objArr.length == 1) {
                xu1VarH.f((MotionEvent) objArr[0]);
            } else if (objArr.length == 3) {
                xu1VarH.b(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.d.clear();
    }

    @Override // com.google.android.gms.internal.ads.xu1
    public final void a(View view) {
        xu1 xu1VarH = h();
        if (xu1VarH != null) {
            xu1VarH.a(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.xu1
    public final void b(int r4, int r5, int r6) {
        xu1 xu1VarH = h();
        if (xu1VarH == null) {
            this.d.add(new Object[]{Integer.valueOf(r4), Integer.valueOf(r5), Integer.valueOf(r6)});
        } else {
            k();
            xu1VarH.b(r4, r5, r6);
        }
    }

    @Override // com.google.android.gms.internal.ads.xu1
    public final String c(Context context) {
        if (!j()) {
            return "";
        }
        int r0 = this.g;
        xu1 xu1Var = ((r0 == w31.f5779b || r0 == w31.f5780c) ? this.f : this.e).get();
        if (xu1Var == null) {
            return "";
        }
        k();
        return xu1Var.c(i(context));
    }

    @Override // com.google.android.gms.internal.ads.xu1
    public final String d(Context context, View view, Activity activity) {
        xu1 xu1VarH = h();
        return xu1VarH != null ? xu1VarH.d(context, view, activity) : "";
    }

    @Override // com.google.android.gms.internal.ads.xu1
    public final String e(Context context, String str, View view) {
        return g(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.xu1
    public final void f(MotionEvent motionEvent) {
        xu1 xu1VarH = h();
        if (xu1VarH == null) {
            this.d.add(new Object[]{motionEvent});
        } else {
            k();
            xu1VarH.f(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.xu1
    public final String g(Context context, String str, View view, Activity activity) {
        xu1 xu1VarH;
        if (!j() || (xu1VarH = h()) == null) {
            return "";
        }
        k();
        return xu1VarH.g(i(context), str, view, activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        try {
            boolean z2 = this.i.g;
            if (!((Boolean) qx2.e().c(e0.A0)).booleanValue() && z2) {
                z = true;
            }
            if (this.g != w31.f5779b) {
                this.e.set(f22.z(this.i.d, i(this.h), z, this.g));
            }
            if (this.g != w31.f5778a) {
                this.f.set(qn1.j(this.i.d, i(this.h), z));
            }
        } finally {
            this.j.countDown();
            this.h = null;
            this.i = null;
        }
    }
}

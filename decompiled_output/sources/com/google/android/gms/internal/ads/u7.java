package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class u7 implements ey2 {

    /* renamed from: a, reason: collision with root package name */
    private volatile i7 f5484a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f5485b;

    public u7(Context context) {
        this.f5485b = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        if (this.f5484a == null) {
            return;
        }
        this.f5484a.e();
        Binder.flushPendingCommands();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.ey2
    public final fz2 a(b<?> bVar) throws pd {
        m7 m7VarH = m7.h(bVar);
        long jC = com.google.android.gms.ads.internal.p.j().c();
        try {
            ks ksVar = new ks();
            this.f5484a = new i7(this.f5485b, com.google.android.gms.ads.internal.p.q().b(), new y7(this, ksVar), new x7(this, ksVar));
            this.f5484a.a();
            dy1 dy1VarD = qx1.d(qx1.j(ksVar, new t7(this, m7VarH), cs.f3023a), ((Integer) qx2.e().c(e0.Q2)).intValue(), TimeUnit.MILLISECONDS, cs.d);
            dy1VarD.e(new v7(this), cs.f3023a);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) dy1VarD.get();
            long jC2 = com.google.android.gms.ads.internal.p.j().c() - jC;
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(jC2);
            sb.append("ms");
            oo.m(sb.toString());
            o7 o7Var = (o7) new vi(parcelFileDescriptor).h(o7.CREATOR);
            if (o7Var == null) {
                return null;
            }
            if (o7Var.d) {
                throw new pd(o7Var.e);
            }
            if (o7Var.h.length != o7Var.i.length) {
                return null;
            }
            HashMap map = new HashMap();
            int r0 = 0;
            while (true) {
                String[] strArr = o7Var.h;
                if (r0 >= strArr.length) {
                    return new fz2(o7Var.f, o7Var.g, map, o7Var.j, o7Var.k);
                }
                map.put(strArr[r0], o7Var.i[r0]);
                r0++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            long jC3 = com.google.android.gms.ads.internal.p.j().c() - jC;
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(jC3);
            sb2.append("ms");
            oo.m(sb2.toString());
            return null;
        } catch (Throwable th) {
            long jC4 = com.google.android.gms.ads.internal.p.j().c() - jC;
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(jC4);
            sb3.append("ms");
            oo.m(sb3.toString());
            throw th;
        }
    }
}

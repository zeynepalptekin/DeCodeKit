package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.fm0;
import com.google.android.gms.internal.ads.xe0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class bg2 extends ah2 {
    private static final zg2<y51> k = new zg2<>();
    private final Context i;
    private xe0.a j;

    public bg2(jf2 jf2Var, String str, String str2, fm0.a.C0175a c0175a, int r12, int r13, Context context, xe0.a aVar) {
        super(jf2Var, str, str2, c0175a, r12, 27);
        this.j = null;
        this.i = context;
        this.j = aVar;
    }

    private static String c(xe0.a aVar) {
        if (aVar == null || !aVar.L() || tf2.f(aVar.H().H())) {
            return null;
        }
        return aVar.H().H();
    }

    private final String d() throws ExecutionException, InterruptedException {
        try {
            if (this.f2690b.A() != null) {
                this.f2690b.A().get();
            }
            fm0.a aVarZ = this.f2690b.z();
            if (aVarZ == null || !aVarZ.h0()) {
                return null;
            }
            return aVarZ.Z();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.ah2
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        y51 y51Var;
        bi0 bi0Var;
        String strH;
        AtomicReference<y51> atomicReferenceA = k.a(this.i.getPackageName());
        synchronized (atomicReferenceA) {
            y51 y51Var2 = atomicReferenceA.get();
            if (y51Var2 == null || tf2.f(y51Var2.f6092b) || y51Var2.f6092b.equals("E") || y51Var2.f6092b.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (tf2.f(c(this.j))) {
                    xe0.a aVar = this.j;
                    bi0Var = (Boolean.valueOf(tf2.f(c(aVar)) && aVar != null && aVar.J() && aVar.K().H() == bi0.ENUM_SIGNAL_SOURCE_GASS).booleanValue() && this.f2690b.x()) ? bi0.ENUM_SIGNAL_SOURCE_GASS : bi0.ENUM_SIGNAL_SOURCE_ADSHIELD;
                } else {
                    bi0Var = bi0.ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
                }
                Method method = this.f;
                Object[] objArr = new Object[3];
                objArr[0] = this.i;
                objArr[1] = Boolean.valueOf(bi0Var == bi0.ENUM_SIGNAL_SOURCE_ADSHIELD);
                objArr[2] = qx2.e().c(e0.J1);
                y51 y51Var3 = new y51((String) method.invoke(null, objArr));
                if (tf2.f(y51Var3.f6092b) || y51Var3.f6092b.equals("E")) {
                    int r1 = ag2.f2686a[bi0Var.ordinal()];
                    if (r1 == 1) {
                        strH = this.j.H().H();
                    } else if (r1 == 2) {
                        strH = d();
                        if (!tf2.f(strH)) {
                        }
                    }
                    y51Var3.f6092b = strH;
                }
                atomicReferenceA.set(y51Var3);
            }
            y51Var = atomicReferenceA.get();
        }
        synchronized (this.e) {
            if (y51Var != null) {
                this.e.w0(y51Var.f6092b);
                this.e.q0(y51Var.f6093c);
                this.e.A0(y51Var.d);
                this.e.C0(y51Var.e);
                this.e.D(y51Var.f);
            }
        }
    }
}

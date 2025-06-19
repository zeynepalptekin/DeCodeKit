package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.fm0;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class sg2 extends ah2 {
    private final StackTraceElement[] i;

    public sg2(jf2 jf2Var, String str, String str2, fm0.a.C0175a c0175a, int r12, int r13, StackTraceElement[] stackTraceElementArr) {
        super(jf2Var, str, str2, c0175a, r12, 45);
        this.i = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.ah2
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.i;
        if (stackTraceElementArr != null) {
            ff2 ff2Var = new ff2((String) this.f.invoke(null, stackTraceElementArr));
            synchronized (this.e) {
                this.e.F(ff2Var.f3404b.longValue());
                if (ff2Var.f3405c.booleanValue()) {
                    this.e.Y(ff2Var.d.booleanValue() ? nu0.ENUM_FALSE : nu0.ENUM_TRUE);
                } else {
                    this.e.Y(nu0.ENUM_FAILURE);
                }
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.e0.a;
import com.google.android.gms.internal.ads.fm0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class eg2 extends ah2 {
    public eg2(jf2 jf2Var, String str, String str2, fm0.a.C0175a c0175a, int r12, int r13) {
        super(jf2Var, str, str2, c0175a, r12, 24);
    }

    private final void c() throws ExecutionException, InterruptedException, TimeoutException {
        com.google.android.gms.ads.e0.a aVarD = this.f2690b.D();
        if (aVarD == null) {
            return;
        }
        try {
            a.C0160a c0160aC = aVarD.c();
            String strE = tf2.e(c0160aC.a());
            if (strE != null) {
                synchronized (this.e) {
                    this.e.K(strE);
                    this.e.A(c0160aC.b());
                    this.e.v(fm0.a.c.DEVICE_IDENTIFIER_ANDROID_AD_ID);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.ah2
    protected final void a() throws ExecutionException, IllegalAccessException, InterruptedException, TimeoutException, InvocationTargetException {
        if (this.f2690b.v()) {
            c();
            return;
        }
        synchronized (this.e) {
            this.e.K((String) this.f.invoke(null, this.f2690b.a()));
        }
    }

    @Override // com.google.android.gms.internal.ads.ah2, java.util.concurrent.Callable
    /* renamed from: b */
    public final Void call() throws Exception {
        if (this.f2690b.b()) {
            return super.call();
        }
        if (!this.f2690b.v()) {
            return null;
        }
        c();
        return null;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.fm0;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class yf2 extends ah2 {
    private static zg2<String> j = new zg2<>();
    private final Context i;

    public yf2(jf2 jf2Var, String str, String str2, fm0.a.C0175a c0175a, int r12, int r13, Context context) {
        super(jf2Var, str, str2, c0175a, r12, 29);
        this.i = context;
    }

    @Override // com.google.android.gms.internal.ads.ah2
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.e.y0("E");
        AtomicReference<String> atomicReferenceA = j.a(this.i.getPackageName());
        if (atomicReferenceA.get() == null) {
            synchronized (atomicReferenceA) {
                if (atomicReferenceA.get() == null) {
                    atomicReferenceA.set((String) this.f.invoke(null, this.i));
                }
            }
        }
        String str = atomicReferenceA.get();
        synchronized (this.e) {
            this.e.y0(v21.a(str.getBytes(), true));
        }
    }
}

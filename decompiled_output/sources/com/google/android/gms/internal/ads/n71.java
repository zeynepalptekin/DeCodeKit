package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class n71 implements hd0 {
    private final AtomicReference<oz2> d = new AtomicReference<>();

    public final void a(oz2 oz2Var) {
        this.d.set(oz2Var);
    }

    @Override // com.google.android.gms.internal.ads.hd0
    public final void b(final sw2 sw2Var) {
        yj1.a(this.d, new xj1(sw2Var) { // from class: com.google.android.gms.internal.ads.q71

            /* renamed from: a, reason: collision with root package name */
            private final sw2 f4963a;

            {
                this.f4963a = sw2Var;
            }

            @Override // com.google.android.gms.internal.ads.xj1
            public final void a(Object obj) throws RemoteException {
                ((oz2) obj).m6(this.f4963a);
            }
        });
    }
}

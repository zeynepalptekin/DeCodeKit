package c.a.b.b.g.c;

import android.os.RemoteException;
import c.a.b.b.g.c.h;

/* loaded from: classes.dex */
final class e0 extends h.b {
    private final /* synthetic */ com.google.android.gms.measurement.internal.e6 h;
    private final /* synthetic */ h i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e0(h hVar, com.google.android.gms.measurement.internal.e6 e6Var) {
        super(hVar);
        this.i = hVar;
        this.h = e6Var;
    }

    @Override // c.a.b.b.g.c.h.b
    final void a() throws RemoteException {
        this.i.i.setEventInterceptor(new h.a(this.h));
    }
}

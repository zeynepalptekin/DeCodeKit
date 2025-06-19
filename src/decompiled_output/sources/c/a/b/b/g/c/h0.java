package c.a.b.b.g.c;

import android.os.Bundle;
import android.os.RemoteException;
import c.a.b.b.g.c.h;

/* loaded from: classes.dex */
final class h0 extends h.b {
    private final /* synthetic */ Bundle h;
    private final /* synthetic */ mf i;
    private final /* synthetic */ h j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h0(h hVar, Bundle bundle, mf mfVar) {
        super(hVar);
        this.j = hVar;
        this.h = bundle;
        this.i = mfVar;
    }

    @Override // c.a.b.b.g.c.h.b
    final void a() throws RemoteException {
        this.j.i.performAction(this.h, this.i, this.d);
    }

    @Override // c.a.b.b.g.c.h.b
    protected final void b() {
        this.i.s0(null);
    }
}

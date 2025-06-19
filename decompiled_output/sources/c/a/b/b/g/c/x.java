package c.a.b.b.g.c;

import android.os.RemoteException;
import c.a.b.b.g.c.h;

/* loaded from: classes.dex */
final class x extends h.b {
    private final /* synthetic */ mf h;
    private final /* synthetic */ h i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(h hVar, mf mfVar) {
        super(hVar);
        this.i = hVar;
        this.h = mfVar;
    }

    @Override // c.a.b.b.g.c.h.b
    final void a() throws RemoteException {
        this.i.i.getCachedAppInstanceId(this.h);
    }

    @Override // c.a.b.b.g.c.h.b
    protected final void b() {
        this.h.s0(null);
    }
}

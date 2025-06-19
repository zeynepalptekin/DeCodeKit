package c.a.b.b.g.c;

import android.os.RemoteException;
import c.a.b.b.g.c.h;

/* loaded from: classes.dex */
final class g0 extends h.b {
    private final /* synthetic */ String h;
    private final /* synthetic */ mf i;
    private final /* synthetic */ h j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g0(h hVar, String str, mf mfVar) {
        super(hVar);
        this.j = hVar;
        this.h = str;
        this.i = mfVar;
    }

    @Override // c.a.b.b.g.c.h.b
    final void a() throws RemoteException {
        this.j.i.getMaxUserProperties(this.h, this.i);
    }

    @Override // c.a.b.b.g.c.h.b
    protected final void b() {
        this.i.s0(null);
    }
}

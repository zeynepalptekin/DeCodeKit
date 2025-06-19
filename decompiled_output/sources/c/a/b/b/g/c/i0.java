package c.a.b.b.g.c;

import android.os.RemoteException;
import c.a.b.b.g.c.h;

/* loaded from: classes.dex */
final class i0 extends h.b {
    private final /* synthetic */ mf h;
    private final /* synthetic */ int i;
    private final /* synthetic */ h j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i0(h hVar, mf mfVar, int r3) {
        super(hVar);
        this.j = hVar;
        this.h = mfVar;
        this.i = r3;
    }

    @Override // c.a.b.b.g.c.h.b
    final void a() throws RemoteException {
        this.j.i.getTestFlag(this.h, this.i);
    }

    @Override // c.a.b.b.g.c.h.b
    protected final void b() {
        this.h.s0(null);
    }
}

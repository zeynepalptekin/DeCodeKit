package c.a.b.b.g.c;

import android.os.RemoteException;
import c.a.b.b.g.c.h;

/* loaded from: classes.dex */
final class l extends h.b {
    private final /* synthetic */ String h;
    private final /* synthetic */ String i;
    private final /* synthetic */ mf j;
    private final /* synthetic */ h k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(h hVar, String str, String str2, mf mfVar) {
        super(hVar);
        this.k = hVar;
        this.h = str;
        this.i = str2;
        this.j = mfVar;
    }

    @Override // c.a.b.b.g.c.h.b
    final void a() throws RemoteException {
        this.k.i.getConditionalUserProperties(this.h, this.i, this.j);
    }

    @Override // c.a.b.b.g.c.h.b
    protected final void b() {
        this.j.s0(null);
    }
}

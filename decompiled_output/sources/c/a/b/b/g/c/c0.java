package c.a.b.b.g.c;

import android.os.RemoteException;
import c.a.b.b.g.c.h;

/* loaded from: classes.dex */
final class c0 extends h.b {
    private final /* synthetic */ String h;
    private final /* synthetic */ String i;
    private final /* synthetic */ boolean j;
    private final /* synthetic */ mf k;
    private final /* synthetic */ h l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c0(h hVar, String str, String str2, boolean z, mf mfVar) {
        super(hVar);
        this.l = hVar;
        this.h = str;
        this.i = str2;
        this.j = z;
        this.k = mfVar;
    }

    @Override // c.a.b.b.g.c.h.b
    final void a() throws RemoteException {
        this.l.i.getUserProperties(this.h, this.i, this.j, this.k);
    }

    @Override // c.a.b.b.g.c.h.b
    protected final void b() {
        this.k.s0(null);
    }
}

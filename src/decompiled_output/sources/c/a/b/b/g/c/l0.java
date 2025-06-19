package c.a.b.b.g.c;

import android.os.RemoteException;
import c.a.b.b.g.c.h;

/* loaded from: classes.dex */
final class l0 extends h.b {
    private final /* synthetic */ boolean h;
    private final /* synthetic */ h i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l0(h hVar, boolean z) {
        super(hVar);
        this.i = hVar;
        this.h = z;
    }

    @Override // c.a.b.b.g.c.h.b
    final void a() throws RemoteException {
        this.i.i.setDataCollectionEnabled(this.h);
    }
}

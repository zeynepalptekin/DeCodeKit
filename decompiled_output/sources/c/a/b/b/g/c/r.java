package c.a.b.b.g.c;

import android.os.RemoteException;
import c.a.b.b.g.c.h;

/* loaded from: classes.dex */
final class r extends h.b {
    private final /* synthetic */ long h;
    private final /* synthetic */ h i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(h hVar, long j) {
        super(hVar);
        this.i = hVar;
        this.h = j;
    }

    @Override // c.a.b.b.g.c.h.b
    final void a() throws RemoteException {
        this.i.i.setMinimumSessionDuration(this.h);
    }
}

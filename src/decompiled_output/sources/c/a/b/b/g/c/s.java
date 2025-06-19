package c.a.b.b.g.c;

import android.os.RemoteException;
import c.a.b.b.g.c.h;

/* loaded from: classes.dex */
final class s extends h.b {
    private final /* synthetic */ h h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(h hVar) {
        super(hVar);
        this.h = hVar;
    }

    @Override // c.a.b.b.g.c.h.b
    final void a() throws RemoteException {
        this.h.i.resetAnalyticsData(this.d);
    }
}

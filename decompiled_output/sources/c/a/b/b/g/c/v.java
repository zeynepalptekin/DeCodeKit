package c.a.b.b.g.c;

import android.os.RemoteException;
import c.a.b.b.g.c.h;

/* loaded from: classes.dex */
final class v extends h.b {
    private final /* synthetic */ String h;
    private final /* synthetic */ h i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(h hVar, String str) {
        super(hVar);
        this.i = hVar;
        this.h = str;
    }

    @Override // c.a.b.b.g.c.h.b
    final void a() throws RemoteException {
        this.i.i.endAdUnitExposure(this.h, this.e);
    }
}

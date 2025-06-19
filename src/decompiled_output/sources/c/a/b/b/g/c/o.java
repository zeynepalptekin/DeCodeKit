package c.a.b.b.g.c;

import android.os.RemoteException;
import c.a.b.b.g.c.h;

/* loaded from: classes.dex */
final class o extends h.b {
    private final /* synthetic */ String h;
    private final /* synthetic */ h i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(h hVar, String str) {
        super(hVar);
        this.i = hVar;
        this.h = str;
    }

    @Override // c.a.b.b.g.c.h.b
    final void a() throws RemoteException {
        this.i.i.setUserId(this.h, this.d);
    }
}

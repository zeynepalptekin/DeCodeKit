package c.a.b.b.g.c;

import android.os.Bundle;
import android.os.RemoteException;
import c.a.b.b.g.c.h;

/* loaded from: classes.dex */
final class k0 extends h.b {
    private final /* synthetic */ Bundle h;
    private final /* synthetic */ h i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k0(h hVar, Bundle bundle) {
        super(hVar);
        this.i = hVar;
        this.h = bundle;
    }

    @Override // c.a.b.b.g.c.h.b
    final void a() throws RemoteException {
        this.i.i.setDefaultEventParameters(this.h);
    }
}

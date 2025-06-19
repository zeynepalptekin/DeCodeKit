package c.a.b.b.g.c;

import android.os.Bundle;
import android.os.RemoteException;
import c.a.b.b.g.c.h;

/* loaded from: classes.dex */
final class m extends h.b {
    private final /* synthetic */ String h;
    private final /* synthetic */ String i;
    private final /* synthetic */ Bundle j;
    private final /* synthetic */ h k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(h hVar, String str, String str2, Bundle bundle) {
        super(hVar);
        this.k = hVar;
        this.h = str;
        this.i = str2;
        this.j = bundle;
    }

    @Override // c.a.b.b.g.c.h.b
    final void a() throws RemoteException {
        this.k.i.clearConditionalUserProperty(this.h, this.i, this.j);
    }
}

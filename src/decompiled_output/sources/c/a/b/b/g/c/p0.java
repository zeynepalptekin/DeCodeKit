package c.a.b.b.g.c;

import android.os.Bundle;
import android.os.RemoteException;
import c.a.b.b.g.c.h;

/* loaded from: classes.dex */
final class p0 extends h.b {
    private final /* synthetic */ Long h;
    private final /* synthetic */ String i;
    private final /* synthetic */ String j;
    private final /* synthetic */ Bundle k;
    private final /* synthetic */ boolean l;
    private final /* synthetic */ boolean m;
    private final /* synthetic */ h n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p0(h hVar, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(hVar);
        this.n = hVar;
        this.h = l;
        this.i = str;
        this.j = str2;
        this.k = bundle;
        this.l = z;
        this.m = z2;
    }

    @Override // c.a.b.b.g.c.h.b
    final void a() throws RemoteException {
        Long l = this.h;
        this.n.i.logEvent(this.i, this.j, this.k, this.l, this.m, l == null ? this.d : l.longValue());
    }
}

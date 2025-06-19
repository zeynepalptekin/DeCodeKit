package c.a.b.b.g.c;

import android.os.RemoteException;
import c.a.b.b.g.c.h;

/* loaded from: classes.dex */
final class o0 extends h.b {
    private final /* synthetic */ String h;
    private final /* synthetic */ String i;
    private final /* synthetic */ Object j;
    private final /* synthetic */ boolean k;
    private final /* synthetic */ h l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o0(h hVar, String str, String str2, Object obj, boolean z) {
        super(hVar);
        this.l = hVar;
        this.h = str;
        this.i = str2;
        this.j = obj;
        this.k = z;
    }

    @Override // c.a.b.b.g.c.h.b
    final void a() throws RemoteException {
        this.l.i.setUserProperty(this.h, this.i, c.a.b.b.e.e.i2(this.j), this.k, this.d);
    }
}

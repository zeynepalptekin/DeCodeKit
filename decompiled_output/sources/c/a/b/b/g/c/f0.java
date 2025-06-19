package c.a.b.b.g.c;

import android.os.RemoteException;
import c.a.b.b.g.c.h;

/* loaded from: classes.dex */
final class f0 extends h.b {
    private final /* synthetic */ String i;
    private final /* synthetic */ Object j;
    private final /* synthetic */ h m;
    private final /* synthetic */ int h = 5;
    private final /* synthetic */ Object k = null;
    private final /* synthetic */ Object l = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f0(h hVar, boolean z, int r3, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.m = hVar;
        this.i = str;
        this.j = obj;
    }

    @Override // c.a.b.b.g.c.h.b
    final void a() throws RemoteException {
        this.m.i.logHealthData(this.h, this.i, c.a.b.b.e.e.i2(this.j), c.a.b.b.e.e.i2(null), c.a.b.b.e.e.i2(null));
    }
}

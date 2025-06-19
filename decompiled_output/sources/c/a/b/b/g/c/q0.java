package c.a.b.b.g.c;

import android.app.Activity;
import android.os.RemoteException;
import c.a.b.b.g.c.h;

/* loaded from: classes.dex */
final class q0 extends h.b {
    private final /* synthetic */ Activity h;
    private final /* synthetic */ h.c i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q0(h.c cVar, Activity activity) {
        super(h.this);
        this.i = cVar;
        this.h = activity;
    }

    @Override // c.a.b.b.g.c.h.b
    final void a() throws RemoteException {
        h.this.i.onActivityStarted(c.a.b.b.e.e.i2(this.h), this.e);
    }
}

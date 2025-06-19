package c.a.b.b.g.c;

import android.app.Activity;
import android.os.RemoteException;
import c.a.b.b.g.c.h;

/* loaded from: classes.dex */
final class u0 extends h.b {
    private final /* synthetic */ Activity h;
    private final /* synthetic */ mf i;
    private final /* synthetic */ h.c j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u0(h.c cVar, Activity activity, mf mfVar) {
        super(h.this);
        this.j = cVar;
        this.h = activity;
        this.i = mfVar;
    }

    @Override // c.a.b.b.g.c.h.b
    final void a() throws RemoteException {
        h.this.i.onActivitySaveInstanceState(c.a.b.b.e.e.i2(this.h), this.i, this.e);
    }
}

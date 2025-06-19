package c.a.b.b.g.c;

import android.os.RemoteException;
import c.a.b.b.g.c.h;

/* loaded from: classes.dex */
final class q extends h.b {
    private final /* synthetic */ Boolean h;
    private final /* synthetic */ h i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(h hVar, Boolean bool) {
        super(hVar);
        this.i = hVar;
        this.h = bool;
    }

    @Override // c.a.b.b.g.c.h.b
    final void a() throws RemoteException {
        if (this.h != null) {
            this.i.i.setMeasurementEnabled(this.h.booleanValue(), this.d);
        } else {
            this.i.i.clearMeasurementEnabled(this.d);
        }
    }
}

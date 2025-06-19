package c.a.b.b.g.c;

import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import c.a.b.b.g.c.h;

/* loaded from: classes.dex */
final class n0 extends h.b {
    private final /* synthetic */ com.google.android.gms.measurement.internal.d6 h;
    private final /* synthetic */ h i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n0(h hVar, com.google.android.gms.measurement.internal.d6 d6Var) {
        super(hVar);
        this.i = hVar;
        this.h = d6Var;
    }

    @Override // c.a.b.b.g.c.h.b
    final void a() throws RemoteException {
        for (int r0 = 0; r0 < this.i.e.size(); r0++) {
            if (this.h.equals(((Pair) this.i.e.get(r0)).first)) {
                Log.w(this.i.f1701a, "OnEventListener already registered.");
                return;
            }
        }
        h.d dVar = new h.d(this.h);
        this.i.e.add(new Pair(this.h, dVar));
        this.i.i.registerOnMeasurementEventListener(dVar);
    }
}

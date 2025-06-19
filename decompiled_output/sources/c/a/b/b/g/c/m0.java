package c.a.b.b.g.c;

import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import c.a.b.b.g.c.h;

/* loaded from: classes.dex */
final class m0 extends h.b {
    private final /* synthetic */ com.google.android.gms.measurement.internal.d6 h;
    private final /* synthetic */ h i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m0(h hVar, com.google.android.gms.measurement.internal.d6 d6Var) {
        super(hVar);
        this.i = hVar;
        this.h = d6Var;
    }

    @Override // c.a.b.b.g.c.h.b
    final void a() throws RemoteException {
        Pair pair;
        int r0 = 0;
        while (true) {
            if (r0 >= this.i.e.size()) {
                pair = null;
                break;
            } else {
                if (this.h.equals(((Pair) this.i.e.get(r0)).first)) {
                    pair = (Pair) this.i.e.get(r0);
                    break;
                }
                r0++;
            }
        }
        if (pair == null) {
            Log.w(this.i.f1701a, "OnEventListener had not been registered.");
        } else {
            this.i.i.unregisterOnMeasurementEventListener((c) pair.second);
            this.i.e.remove(pair);
        }
    }
}

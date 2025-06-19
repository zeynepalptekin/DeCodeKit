package c.a.b.b.g.c;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import c.a.b.b.g.c.h;

/* loaded from: classes.dex */
final class r0 extends h.b {
    private final /* synthetic */ Bundle h;
    private final /* synthetic */ Activity i;
    private final /* synthetic */ h.c j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r0(h.c cVar, Bundle bundle, Activity activity) {
        super(h.this);
        this.j = cVar;
        this.h = bundle;
        this.i = activity;
    }

    @Override // c.a.b.b.g.c.h.b
    final void a() throws RemoteException {
        Bundle bundle;
        if (this.h != null) {
            bundle = new Bundle();
            if (this.h.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.h.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        h.this.i.onActivityCreated(c.a.b.b.e.e.i2(this.i), bundle, this.e);
    }
}

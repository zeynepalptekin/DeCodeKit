package b.d.b;

import a.a.a.c;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes.dex */
public class h extends Service {
    private c.a d = new a();

    class a extends c.a {
        a() {
        }

        @Override // a.a.a.c
        public void O6(a.a.a.a aVar, Bundle bundle) throws RemoteException {
            aVar.r7(bundle);
        }

        @Override // a.a.a.c
        public void m8(a.a.a.a aVar, String str, Bundle bundle) throws RemoteException {
            aVar.a7(str, bundle);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.d;
    }
}

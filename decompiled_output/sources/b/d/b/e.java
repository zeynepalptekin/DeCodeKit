package b.d.b;

import a.a.a.b;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes.dex */
public abstract class e implements ServiceConnection {

    class a extends b {
        a(a.a.a.b bVar, ComponentName componentName) {
            super(bVar, componentName);
        }
    }

    public abstract void a(ComponentName componentName, b bVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a(componentName, new a(b.a.L0(iBinder), componentName));
    }
}

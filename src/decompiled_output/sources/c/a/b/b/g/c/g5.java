package c.a.b.b.g.c;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class g5 extends c1 implements d2 {
    public static d2 b2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return iInterfaceQueryLocalInterface instanceof d2 ? (d2) iInterfaceQueryLocalInterface : new f4(iBinder);
    }
}

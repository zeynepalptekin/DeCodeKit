package c.a.b.b.g.a;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class f extends b implements e {
    public static e L0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return iInterfaceQueryLocalInterface instanceof e ? (e) iInterfaceQueryLocalInterface : new g(iBinder);
    }
}

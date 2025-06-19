package c.a.b.b.e;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public interface c extends IInterface {

    public static abstract class a extends c.a.b.b.g.b.a implements c {

        /* renamed from: c.a.b.b.e.c$a$a, reason: collision with other inner class name */
        public static class C0125a extends c.a.b.b.g.b.b implements c {
            C0125a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        @RecentlyNonNull
        public static c b2(@RecentlyNonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new C0125a(iBinder);
        }
    }
}

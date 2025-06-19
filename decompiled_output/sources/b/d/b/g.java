package b.d.b;

import a.a.a.a;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    private static final String f870c = "CustomTabsSessionToken";

    /* renamed from: a, reason: collision with root package name */
    final a.a.a.a f871a;

    /* renamed from: b, reason: collision with root package name */
    private final b.d.b.a f872b = new a();

    class a extends b.d.b.a {
        a() {
        }

        @Override // b.d.b.a
        public void a(String str, Bundle bundle) {
            try {
                g.this.f871a.D3(str, bundle);
            } catch (RemoteException unused) {
                Log.e(g.f870c, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // b.d.b.a
        public void b(Bundle bundle) {
            try {
                g.this.f871a.r7(bundle);
            } catch (RemoteException unused) {
                Log.e(g.f870c, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // b.d.b.a
        public void c(int r2, Bundle bundle) {
            try {
                g.this.f871a.X4(r2, bundle);
            } catch (RemoteException unused) {
                Log.e(g.f870c, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // b.d.b.a
        public void d(String str, Bundle bundle) {
            try {
                g.this.f871a.a7(str, bundle);
            } catch (RemoteException unused) {
                Log.e(g.f870c, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // b.d.b.a
        public void e(int r2, Uri uri, boolean z, Bundle bundle) {
            try {
                g.this.f871a.G7(r2, uri, z, bundle);
            } catch (RemoteException unused) {
                Log.e(g.f870c, "RemoteException during ICustomTabsCallback transaction");
            }
        }
    }

    static class b extends a.AbstractBinderC0000a {
        b() {
        }

        @Override // a.a.a.a
        public void D3(String str, Bundle bundle) {
        }

        @Override // a.a.a.a
        public void G7(int r1, Uri uri, boolean z, Bundle bundle) {
        }

        @Override // a.a.a.a
        public void X4(int r1, Bundle bundle) {
        }

        @Override // a.a.a.a
        public void a7(String str, Bundle bundle) {
        }

        @Override // a.a.a.a.AbstractBinderC0000a, android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // a.a.a.a
        public void r7(Bundle bundle) {
        }
    }

    g(a.a.a.a aVar) {
        this.f871a = aVar;
    }

    @h0
    public static g a() {
        return new g(new b());
    }

    public static g d(Intent intent) {
        IBinder iBinderA = androidx.core.app.i.a(intent.getExtras(), c.d);
        if (iBinderA == null) {
            return null;
        }
        return new g(a.AbstractBinderC0000a.L0(iBinderA));
    }

    public b.d.b.a b() {
        return this.f872b;
    }

    IBinder c() {
        return this.f871a.asBinder();
    }

    public boolean e(f fVar) {
        return fVar.b().equals(this.f871a);
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return ((g) obj).c().equals(this.f871a.asBinder());
        }
        return false;
    }

    public int hashCode() {
        return c().hashCode();
    }
}

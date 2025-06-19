package b.d.b;

import a.a.a.b;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class d extends Service {
    public static final String f = "android.support.customtabs.action.CustomTabsService";
    public static final String g = "android.support.customtabs.otherurls.URL";
    public static final int h = 0;
    public static final int i = -1;
    public static final int j = -2;
    public static final int k = -3;
    public static final int l = 1;
    public static final int m = 2;
    final Map<IBinder, IBinder.DeathRecipient> d = new b.f.a();
    private b.a e = new a();

    class a extends b.a {

        /* renamed from: b.d.b.d$a$a, reason: collision with other inner class name */
        class C0049a implements IBinder.DeathRecipient {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f864a;

            C0049a(g gVar) {
                this.f864a = gVar;
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                d.this.a(this.f864a);
            }
        }

        a() {
        }

        @Override // a.a.a.b
        public boolean B4(a.a.a.a aVar, Bundle bundle) {
            return d.this.g(new g(aVar), bundle);
        }

        @Override // a.a.a.b
        public boolean D5(a.a.a.a aVar, Uri uri) {
            return d.this.f(new g(aVar), uri);
        }

        @Override // a.a.a.b
        public Bundle V5(String str, Bundle bundle) {
            return d.this.b(str, bundle);
        }

        @Override // a.a.a.b
        public boolean b3(a.a.a.a aVar, Uri uri, Bundle bundle, List<Bundle> list) {
            return d.this.c(new g(aVar), uri, bundle, list);
        }

        @Override // a.a.a.b
        public boolean k3(a.a.a.a aVar) {
            g gVar = new g(aVar);
            try {
                C0049a c0049a = new C0049a(gVar);
                synchronized (d.this.d) {
                    aVar.asBinder().linkToDeath(c0049a, 0);
                    d.this.d.put(aVar.asBinder(), c0049a);
                }
                return d.this.d(gVar);
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // a.a.a.b
        public boolean s3(a.a.a.a aVar, int r4, Uri uri, Bundle bundle) {
            return d.this.h(new g(aVar), r4, uri, bundle);
        }

        @Override // a.a.a.b
        public boolean x7(long j) {
            return d.this.i(j);
        }

        @Override // a.a.a.b
        public int z2(a.a.a.a aVar, String str, Bundle bundle) {
            return d.this.e(new g(aVar), str, bundle);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    protected boolean a(g gVar) {
        try {
            synchronized (this.d) {
                IBinder iBinderC = gVar.c();
                iBinderC.unlinkToDeath(this.d.get(iBinderC), 0);
                this.d.remove(iBinderC);
            }
            return true;
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    protected abstract Bundle b(String str, Bundle bundle);

    protected abstract boolean c(g gVar, Uri uri, Bundle bundle, List<Bundle> list);

    protected abstract boolean d(g gVar);

    protected abstract int e(g gVar, String str, Bundle bundle);

    protected abstract boolean f(g gVar, Uri uri);

    protected abstract boolean g(g gVar, Bundle bundle);

    protected abstract boolean h(g gVar, int r2, Uri uri, Bundle bundle);

    protected abstract boolean i(long j2);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.e;
    }
}

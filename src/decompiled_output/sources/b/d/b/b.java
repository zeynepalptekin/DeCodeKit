package b.d.b;

import a.a.a.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.i0;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final a.a.a.b f856a;

    /* renamed from: b, reason: collision with root package name */
    private final ComponentName f857b;

    static class a extends e {
        final /* synthetic */ Context d;

        a(Context context) {
            this.d = context;
        }

        @Override // b.d.b.e
        public final void a(ComponentName componentName, b bVar) {
            bVar.g(0L);
            this.d.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: b.d.b.b$b, reason: collision with other inner class name */
    class BinderC0047b extends a.AbstractBinderC0000a {
        private Handler j = new Handler(Looper.getMainLooper());
        final /* synthetic */ b.d.b.a k;

        /* renamed from: b.d.b.b$b$a */
        class a implements Runnable {
            final /* synthetic */ int d;
            final /* synthetic */ Bundle e;

            a(int r2, Bundle bundle) {
                this.d = r2;
                this.e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC0047b.this.k.c(this.d, this.e);
            }
        }

        /* renamed from: b.d.b.b$b$b, reason: collision with other inner class name */
        class RunnableC0048b implements Runnable {
            final /* synthetic */ String d;
            final /* synthetic */ Bundle e;

            RunnableC0048b(String str, Bundle bundle) {
                this.d = str;
                this.e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC0047b.this.k.a(this.d, this.e);
            }
        }

        /* renamed from: b.d.b.b$b$c */
        class c implements Runnable {
            final /* synthetic */ Bundle d;

            c(Bundle bundle) {
                this.d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC0047b.this.k.b(this.d);
            }
        }

        /* renamed from: b.d.b.b$b$d */
        class d implements Runnable {
            final /* synthetic */ String d;
            final /* synthetic */ Bundle e;

            d(String str, Bundle bundle) {
                this.d = str;
                this.e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC0047b.this.k.d(this.d, this.e);
            }
        }

        /* renamed from: b.d.b.b$b$e */
        class e implements Runnable {
            final /* synthetic */ int d;
            final /* synthetic */ Uri e;
            final /* synthetic */ boolean f;
            final /* synthetic */ Bundle g;

            e(int r2, Uri uri, boolean z, Bundle bundle) {
                this.d = r2;
                this.e = uri;
                this.f = z;
                this.g = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC0047b.this.k.e(this.d, this.e, this.f, this.g);
            }
        }

        BinderC0047b(b.d.b.a aVar) {
            this.k = aVar;
        }

        @Override // a.a.a.a
        public void D3(String str, Bundle bundle) throws RemoteException {
            if (this.k == null) {
                return;
            }
            this.j.post(new RunnableC0048b(str, bundle));
        }

        @Override // a.a.a.a
        public void G7(int r9, Uri uri, boolean z, @i0 Bundle bundle) throws RemoteException {
            if (this.k == null) {
                return;
            }
            this.j.post(new e(r9, uri, z, bundle));
        }

        @Override // a.a.a.a
        public void X4(int r3, Bundle bundle) {
            if (this.k == null) {
                return;
            }
            this.j.post(new a(r3, bundle));
        }

        @Override // a.a.a.a
        public void a7(String str, Bundle bundle) throws RemoteException {
            if (this.k == null) {
                return;
            }
            this.j.post(new d(str, bundle));
        }

        @Override // a.a.a.a
        public void r7(Bundle bundle) throws RemoteException {
            if (this.k == null) {
                return;
            }
            this.j.post(new c(bundle));
        }
    }

    @p0({p0.a.LIBRARY_GROUP})
    b(a.a.a.b bVar, ComponentName componentName) {
        this.f856a = bVar;
        this.f857b = componentName;
    }

    public static boolean a(Context context, String str, e eVar) {
        Intent intent = new Intent(d.f);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    public static boolean b(Context context, String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return a(applicationContext, str, new a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static String d(Context context, @i0 List<String> list) {
        return e(context, list, false);
    }

    public static String e(Context context, @i0 List<String> list, boolean z) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList<>() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent(d.f);
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        return null;
    }

    public Bundle c(String str, Bundle bundle) {
        try {
            return this.f856a.V5(str, bundle);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public f f(b.d.b.a aVar) {
        BinderC0047b binderC0047b = new BinderC0047b(aVar);
        try {
            if (this.f856a.k3(binderC0047b)) {
                return new f(this.f856a, binderC0047b, this.f857b);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public boolean g(long j) {
        try {
            return this.f856a.x7(j);
        } catch (RemoteException unused) {
            return false;
        }
    }
}

package b.d.b;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.RemoteViews;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.x0;
import b.d.b.g;
import java.util.List;

/* loaded from: classes.dex */
public final class f {
    private static final String e = "CustomTabsSession";

    /* renamed from: a, reason: collision with root package name */
    private final Object f867a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final a.a.a.b f868b;

    /* renamed from: c, reason: collision with root package name */
    private final a.a.a.a f869c;
    private final ComponentName d;

    f(a.a.a.b bVar, a.a.a.a aVar, ComponentName componentName) {
        this.f868b = bVar;
        this.f869c = aVar;
        this.d = componentName;
    }

    @h0
    @x0
    public static f a(@h0 ComponentName componentName) {
        return new f(null, new g.b(), componentName);
    }

    IBinder b() {
        return this.f869c.asBinder();
    }

    ComponentName c() {
        return this.d;
    }

    public boolean d(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f868b.b3(this.f869c, uri, bundle, list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int e(String str, Bundle bundle) {
        int r4;
        synchronized (this.f867a) {
            try {
                try {
                    r4 = this.f868b.z2(this.f869c, str, bundle);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r4;
    }

    public boolean f(Uri uri) {
        try {
            return this.f868b.D5(this.f869c, uri);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean g(@h0 Bitmap bitmap, @h0 String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(c.n, bitmap);
        bundle.putString(c.o, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(c.k, bundle);
        try {
            return this.f868b.B4(this.f869c, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean h(@i0 RemoteViews remoteViews, @i0 int[] r4, @i0 PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(c.v, remoteViews);
        bundle.putIntArray(c.w, r4);
        bundle.putParcelable(c.x, pendingIntent);
        try {
            return this.f868b.B4(this.f869c, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Deprecated
    public boolean i(int r3, @h0 Bitmap bitmap, @h0 String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(c.A, r3);
        bundle.putParcelable(c.n, bitmap);
        bundle.putString(c.o, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(c.k, bundle);
        try {
            return this.f868b.B4(this.f869c, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean j(int r4, @h0 Uri uri, @i0 Bundle bundle) {
        if (r4 >= 1 && r4 <= 2) {
            try {
                return this.f868b.s3(this.f869c, r4, uri, bundle);
            } catch (RemoteException unused) {
            }
        }
        return false;
    }
}

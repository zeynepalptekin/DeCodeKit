package c.a.b.b.d;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.q0;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.r0;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
/* loaded from: classes.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    private static volatile r0 f1633a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f1634b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static Context f1635c;

    static e0 a(String str, w wVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return d(str, wVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static synchronized void c(Context context) {
        if (f1635c != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f1635c = context.getApplicationContext();
        }
    }

    private static e0 d(final String str, final w wVar, final boolean z, boolean z2) {
        try {
            if (f1633a == null) {
                r.k(f1635c);
                synchronized (f1634b) {
                    if (f1633a == null) {
                        f1633a = q0.b2(DynamiteModule.e(f1635c, DynamiteModule.m, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            r.k(f1635c);
            try {
                return f1633a.C6(new c0(str, wVar, z, z2), c.a.b.b.e.e.i2(f1635c.getPackageManager())) ? e0.a() : e0.d(new Callable(z, str, wVar) { // from class: c.a.b.b.d.x

                    /* renamed from: a, reason: collision with root package name */
                    private final boolean f1636a;

                    /* renamed from: b, reason: collision with root package name */
                    private final String f1637b;

                    /* renamed from: c, reason: collision with root package name */
                    private final w f1638c;

                    {
                        this.f1636a = z;
                        this.f1637b = str;
                        this.f1638c = wVar;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean z3 = this.f1636a;
                        String str2 = this.f1637b;
                        w wVar2 = this.f1638c;
                        return e0.e(str2, wVar2, z3, !z3 && v.d(str2, wVar2, true, false).f1605a);
                    }
                });
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return e0.c("module call", e);
            }
        } catch (DynamiteModule.a e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String strValueOf = String.valueOf(e2.getMessage());
            return e0.c(strValueOf.length() != 0 ? "module init: ".concat(strValueOf) : new String("module init: "), e2);
        }
    }
}

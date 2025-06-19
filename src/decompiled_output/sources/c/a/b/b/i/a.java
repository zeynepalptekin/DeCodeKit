package c.a.b.b.i;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.i0;
import c.a.b.b.d.f;
import c.a.b.b.d.g;
import c.a.b.b.d.h;
import c.a.b.b.d.i;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final f f1883a = f.i();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f1884b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static Method f1885c = null;

    @RecentlyNonNull
    public static final String d = "GmsCore_OpenSSL";

    /* renamed from: c.a.b.b.i.a$a, reason: collision with other inner class name */
    public interface InterfaceC0131a {
        void a();

        void b(@RecentlyNonNull int r1, @RecentlyNonNull Intent intent);
    }

    public static void a(@RecentlyNonNull Context context) throws g, h {
        r.l(context, "Context must not be null");
        f1883a.p(context, 11925000);
        Context contextC = c(context);
        if (contextC == null) {
            contextC = e(context);
        }
        if (contextC == null) {
            Log.e("ProviderInstaller", "Failed to get remote context");
            throw new g(8);
        }
        synchronized (f1884b) {
            try {
                try {
                    if (f1885c == null) {
                        f1885c = contextC.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("insertProvider", Context.class);
                    }
                    f1885c.invoke(null, contextC);
                } catch (Exception e) {
                    Throwable cause = e.getCause();
                    if (Log.isLoggable("ProviderInstaller", 6)) {
                        String strValueOf = String.valueOf(cause == null ? e.getMessage() : cause.getMessage());
                        Log.e("ProviderInstaller", strValueOf.length() != 0 ? "Failed to install provider: ".concat(strValueOf) : new String("Failed to install provider: "));
                    }
                    throw new g(8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(@RecentlyNonNull Context context, @RecentlyNonNull InterfaceC0131a interfaceC0131a) {
        r.l(context, "Context must not be null");
        r.l(interfaceC0131a, "Listener must not be null");
        r.f("Must be called on the UI thread");
        new b(context, interfaceC0131a).execute(new Void[0]);
    }

    @i0
    private static Context c(Context context) {
        try {
            return DynamiteModule.e(context, DynamiteModule.m, "com.google.android.gms.providerinstaller").b();
        } catch (DynamiteModule.a e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.w("ProviderInstaller", strValueOf.length() != 0 ? "Failed to load providerinstaller module: ".concat(strValueOf) : new String("Failed to load providerinstaller module: "));
            return null;
        }
    }

    @i0
    private static Context e(Context context) {
        try {
            return i.i(context);
        } catch (Resources.NotFoundException e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.w("ProviderInstaller", strValueOf.length() != 0 ? "Failed to load GMS Core context for providerinstaller: ".concat(strValueOf) : new String("Failed to load GMS Core context for providerinstaller: "));
            com.google.android.gms.common.util.i.a(context, e);
            return null;
        }
    }
}

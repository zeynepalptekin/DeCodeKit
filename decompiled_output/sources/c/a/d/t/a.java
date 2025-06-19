package c.a.d.t;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.x0;
import c.a.d.b;
import c.a.d.o.c;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class a {
    private static final String e = "com.google.firebase.common.prefs:";

    @x0
    public static final String f = "firebase_data_collection_default_enabled";

    /* renamed from: a, reason: collision with root package name */
    private final Context f2195a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f2196b;

    /* renamed from: c, reason: collision with root package name */
    private final c f2197c;
    private final AtomicBoolean d = new AtomicBoolean(c());

    public a(Context context, String str, c cVar) {
        this.f2195a = a(context);
        this.f2196b = context.getSharedPreferences(e + str, 0);
        this.f2197c = cVar;
    }

    private static Context a(Context context) {
        return (Build.VERSION.SDK_INT < 24 || b.i.c.c.p(context)) ? context : b.i.c.c.b(context);
    }

    private boolean c() {
        ApplicationInfo applicationInfo;
        if (this.f2196b.contains(f)) {
            return this.f2196b.getBoolean(f, true);
        }
        try {
            PackageManager packageManager = this.f2195a.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.f2195a.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey(f)) {
                return applicationInfo.metaData.getBoolean(f);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return true;
    }

    public boolean b() {
        return this.d.get();
    }

    public void d(boolean z) {
        if (this.d.compareAndSet(!z, z)) {
            this.f2196b.edit().putBoolean(f, z).apply();
            this.f2197c.c(new c.a.d.o.a<>(b.class, new b(z)));
        }
    }
}

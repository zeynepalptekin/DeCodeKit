package c.a.b.b.g.c;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.util.Log;

/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c3<Boolean> f1735a = c3.d();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f1736b = new Object();

    private static boolean a(Context context) {
        return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
    }

    public static boolean b(Context context, Uri uri) {
        ProviderInfo providerInfoResolveContentProvider;
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder sb = new StringBuilder(String.valueOf(authority).length() + 91);
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            Log.e("PhenotypeClientHelper", sb.toString());
            return false;
        }
        if (!f1735a.b()) {
            synchronized (f1736b) {
                if (f1735a.b()) {
                    return f1735a.c().booleanValue();
                }
                if (("com.google.android.gms".equals(context.getPackageName()) || ((providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0)) != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName))) && a(context)) {
                    z = true;
                }
                f1735a = c3.a(Boolean.valueOf(z));
            }
        }
        return f1735a.c().booleanValue();
    }
}

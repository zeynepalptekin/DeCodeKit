package c.a.b.b.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.r;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

@com.google.android.gms.common.internal.v
@CheckReturnValue
@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class j {

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private static j f1614c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f1615a;

    /* renamed from: b, reason: collision with root package name */
    private volatile String f1616b;

    private j(Context context) {
        this.f1615a = context.getApplicationContext();
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static j a(@RecentlyNonNull Context context) {
        r.k(context);
        synchronized (j.class) {
            if (f1614c == null) {
                v.c(context);
                f1614c = new j(context);
            }
        }
        return f1614c;
    }

    @Nullable
    private static w e(PackageInfo packageInfo, w... wVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        z zVar = new z(packageInfo.signatures[0].toByteArray());
        for (int r2 = 0; r2 < wVarArr.length; r2++) {
            if (wVarArr[r2].equals(zVar)) {
                return wVarArr[r2];
            }
        }
        return null;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final e0 f(String str, boolean z, boolean z2) throws PackageManager.NameNotFoundException {
        e0 e0VarB;
        ApplicationInfo applicationInfo;
        String str2 = "null pkg";
        if (str == null) {
            return e0.b("null pkg");
        }
        if (str.equals(this.f1616b)) {
            return e0.a();
        }
        try {
            PackageInfo packageInfo = this.f1615a.getPackageManager().getPackageInfo(str, 64);
            boolean zK = i.k(this.f1615a);
            if (packageInfo != null) {
                Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr == null || signatureArr.length != 1) {
                    str2 = "single cert required";
                } else {
                    z zVar = new z(packageInfo.signatures[0].toByteArray());
                    String str3 = packageInfo.packageName;
                    e0 e0VarA = v.a(str3, zVar, zK, false);
                    if (!e0VarA.f1605a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !v.a(str3, zVar, false, true).f1605a) {
                        e0VarB = e0VarA;
                    } else {
                        str2 = "debuggable release cert app rejected";
                    }
                }
                e0VarB = e0.b(str2);
            } else {
                e0VarB = e0.b(str2);
            }
            if (e0VarB.f1605a) {
                this.f1616b = str;
            }
            return e0VarB;
        } catch (PackageManager.NameNotFoundException e) {
            String strValueOf = String.valueOf(str);
            return e0.c(strValueOf.length() != 0 ? "no pkg ".concat(strValueOf) : new String("no pkg "), e);
        }
    }

    @RecentlyNonNull
    public static boolean g(@RecentlyNonNull PackageInfo packageInfo, @RecentlyNonNull boolean z) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? e(packageInfo, b0.f1603a) : e(packageInfo, b0.f1603a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public boolean b(@RecentlyNonNull PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (g(packageInfo, false)) {
            return true;
        }
        if (g(packageInfo, true)) {
            if (i.k(this.f1615a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.internal.v
    @com.google.android.gms.common.annotation.a
    public boolean c(@RecentlyNonNull String str) throws PackageManager.NameNotFoundException {
        e0 e0VarF = f(str, false, false);
        e0VarF.g();
        return e0VarF.f1605a;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.internal.v
    @com.google.android.gms.common.annotation.a
    public boolean d(@RecentlyNonNull int r6) throws PackageManager.NameNotFoundException {
        e0 e0VarB;
        String[] packagesForUid = this.f1615a.getPackageManager().getPackagesForUid(r6);
        if (packagesForUid != null && packagesForUid.length != 0) {
            e0VarB = null;
            int length = packagesForUid.length;
            int r3 = 0;
            while (true) {
                if (r3 >= length) {
                    e0VarB = (e0) r.k(e0VarB);
                    break;
                }
                e0VarB = f(packagesForUid[r3], false, false);
                if (e0VarB.f1605a) {
                    break;
                }
                r3++;
            }
        } else {
            e0VarB = e0.b("no pkgs");
        }
        e0VarB.g();
        return e0VarB.f1605a;
    }
}

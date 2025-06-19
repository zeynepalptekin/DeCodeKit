package c.a.b.b.d.s;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.util.v;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1630a;

    public b(@RecentlyNonNull Context context) {
        this.f1630a = context;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public int a(@RecentlyNonNull String str) {
        return this.f1630a.checkCallingOrSelfPermission(str);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public int b(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        return this.f1630a.getPackageManager().checkPermission(str, str2);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public ApplicationInfo c(@RecentlyNonNull String str, @RecentlyNonNull int r3) throws PackageManager.NameNotFoundException {
        return this.f1630a.getPackageManager().getApplicationInfo(str, r3);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public CharSequence d(@RecentlyNonNull String str) throws PackageManager.NameNotFoundException {
        return this.f1630a.getPackageManager().getApplicationLabel(this.f1630a.getPackageManager().getApplicationInfo(str, 0));
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public PackageInfo e(@RecentlyNonNull String str, @RecentlyNonNull int r3) throws PackageManager.NameNotFoundException {
        return this.f1630a.getPackageManager().getPackageInfo(str, r3);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public boolean f() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return a.a(this.f1630a);
        }
        if (!v.n() || (nameForUid = this.f1630a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f1630a.getPackageManager().isInstantApp(nameForUid);
    }

    @RecentlyNonNull
    @TargetApi(19)
    public final boolean g(@RecentlyNonNull int r5, @RecentlyNonNull String str) {
        if (v.h()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f1630a.getSystemService("appops");
                if (appOpsManager == null) {
                    throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                }
                appOpsManager.checkPackage(r5, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f1630a.getPackageManager().getPackagesForUid(r5);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}

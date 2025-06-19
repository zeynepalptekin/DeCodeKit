package b.i.j;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.o0;
import androidx.annotation.p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f1049a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f1050b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1051c = 3;

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    /* renamed from: b.i.j.a$a, reason: collision with other inner class name */
    public @interface InterfaceC0060a {
    }

    private a() {
    }

    @i0
    @o0("android.permission.ACCESS_NETWORK_STATE")
    @SuppressLint({"ReferencesDeprecated"})
    public static NetworkInfo a(@h0 ConnectivityManager connectivityManager, @h0 Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            return connectivityManager.getNetworkInfo(networkInfo.getType());
        }
        return null;
    }

    public static int b(@h0 ConnectivityManager connectivityManager) {
        if (Build.VERSION.SDK_INT >= 24) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
        return 3;
    }

    @o0("android.permission.ACCESS_NETWORK_STATE")
    public static boolean c(@h0 ConnectivityManager connectivityManager) {
        if (Build.VERSION.SDK_INT >= 16) {
            return connectivityManager.isActiveNetworkMetered();
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return true;
        }
        int type = activeNetworkInfo.getType();
        return (type == 1 || type == 7 || type == 9) ? false : true;
    }
}

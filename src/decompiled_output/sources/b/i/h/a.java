package b.i.h;

import android.location.LocationManager;
import android.os.Build;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public final class a {
    private a() {
    }

    public static boolean a(@h0 LocationManager locationManager) {
        return Build.VERSION.SDK_INT >= 28 ? locationManager.isLocationEnabled() : locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }
}

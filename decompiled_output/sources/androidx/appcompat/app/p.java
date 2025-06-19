package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.annotation.h0;
import androidx.annotation.o0;
import androidx.annotation.x0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Calendar;

/* loaded from: classes.dex */
class p {
    private static final String d = "TwilightManager";
    private static final int e = 6;
    private static final int f = 22;
    private static p g;

    /* renamed from: a, reason: collision with root package name */
    private final Context f81a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationManager f82b;

    /* renamed from: c, reason: collision with root package name */
    private final a f83c = new a();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f84a;

        /* renamed from: b, reason: collision with root package name */
        long f85b;

        /* renamed from: c, reason: collision with root package name */
        long f86c;
        long d;
        long e;
        long f;

        a() {
        }
    }

    @x0
    p(@h0 Context context, @h0 LocationManager locationManager) {
        this.f81a = context;
        this.f82b = locationManager;
    }

    static p a(@h0 Context context) {
        if (g == null) {
            Context applicationContext = context.getApplicationContext();
            g = new p(applicationContext, (LocationManager) applicationContext.getSystemService(FirebaseAnalytics.b.t));
        }
        return g;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location locationC = b.i.c.g.d(this.f81a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = b.i.c.g.d(this.f81a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (locationC2 == null || locationC == null) ? locationC2 != null ? locationC2 : locationC : locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    @o0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    private Location c(String str) {
        try {
            if (this.f82b.isProviderEnabled(str)) {
                return this.f82b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d(d, "Failed to get last known location", e2);
            return null;
        }
    }

    private boolean e() {
        return this.f83c.f > System.currentTimeMillis();
    }

    @x0
    static void f(p pVar) {
        g = pVar;
    }

    private void g(@h0 Location location) {
        long j;
        a aVar = this.f83c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        o oVarB = o.b();
        oVarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = oVarB.f78a;
        oVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = oVarB.f80c == 1;
        long j3 = oVarB.f79b;
        long j4 = oVarB.f78a;
        boolean z2 = z;
        oVarB.a(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = oVarB.f79b;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + jCurrentTimeMillis;
        } else {
            j = (jCurrentTimeMillis > j4 ? 0 + j5 : jCurrentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        aVar.f84a = z2;
        aVar.f85b = j2;
        aVar.f86c = j3;
        aVar.d = j4;
        aVar.e = j5;
        aVar.f = j;
    }

    boolean d() {
        a aVar = this.f83c;
        if (e()) {
            return aVar.f84a;
        }
        Location locationB = b();
        if (locationB != null) {
            g(locationB);
            return aVar.f84a;
        }
        Log.i(d, "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int r0 = Calendar.getInstance().get(11);
        return r0 < 6 || r0 >= 22;
    }
}

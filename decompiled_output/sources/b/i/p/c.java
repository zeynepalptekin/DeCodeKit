package b.i.p;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final int f1168a = 3840;

    /* renamed from: b, reason: collision with root package name */
    private static final int f1169b = 2160;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Display.Mode f1170a;

        /* renamed from: b, reason: collision with root package name */
        private final Point f1171b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f1172c;

        a(@androidx.annotation.h0 Point point) {
            b.i.o.i.g(point, "physicalDisplaySize == null");
            this.f1172c = true;
            this.f1171b = point;
            this.f1170a = null;
        }

        @androidx.annotation.m0(23)
        a(@androidx.annotation.h0 Display.Mode mode, boolean z) {
            b.i.o.i.g(mode, "Display.Mode == null, can't wrap a null reference");
            this.f1172c = z;
            this.f1171b = new Point(mode.getPhysicalWidth(), mode.getPhysicalHeight());
            this.f1170a = mode;
        }

        public int a() {
            return this.f1171b.y;
        }

        public int b() {
            return this.f1171b.x;
        }

        public boolean c() {
            return this.f1172c;
        }

        @androidx.annotation.i0
        @androidx.annotation.m0(23)
        public Display.Mode d() {
            return this.f1170a;
        }
    }

    private c() {
    }

    private static Point a(@androidx.annotation.h0 Context context, @androidx.annotation.h0 Display display) throws ClassNotFoundException {
        Point pointG = g(Build.VERSION.SDK_INT < 28 ? "sys.display-size" : "vendor.display-size", display);
        if (pointG != null) {
            return pointG;
        }
        if (d(context)) {
            return new Point(f1168a, f1169b);
        }
        Point point = new Point();
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
        } else if (r0 >= 17) {
            display.getRealSize(point);
        } else {
            display.getSize(point);
        }
        return point;
    }

    @SuppressLint({"ArrayReturn"})
    @androidx.annotation.h0
    public static a[] b(@androidx.annotation.h0 Context context, @androidx.annotation.h0 Display display) throws ClassNotFoundException {
        Point pointA = a(context, display);
        if (Build.VERSION.SDK_INT < 23) {
            return new a[]{new a(pointA)};
        }
        Display.Mode[] supportedModes = display.getSupportedModes();
        ArrayList arrayList = new ArrayList(supportedModes.length);
        boolean z = false;
        for (int r3 = 0; r3 < supportedModes.length; r3++) {
            if (h(supportedModes[r3], pointA)) {
                arrayList.add(r3, new a(supportedModes[r3], true));
                z = true;
            } else {
                arrayList.add(r3, new a(supportedModes[r3], false));
            }
        }
        if (!z) {
            arrayList.add(new a(pointA));
        }
        return (a[]) arrayList.toArray(new a[0]);
    }

    @androidx.annotation.i0
    private static String c(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean d(@androidx.annotation.h0 Context context) {
        return e(context) && "Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd");
    }

    private static boolean e(@androidx.annotation.h0 Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    private static Point f(@androidx.annotation.h0 String str) throws NumberFormatException {
        String[] strArrSplit = str.trim().split("x", -1);
        if (strArrSplit.length == 2) {
            int r0 = Integer.parseInt(strArrSplit[0]);
            int r2 = Integer.parseInt(strArrSplit[1]);
            if (r0 > 0 && r2 > 0) {
                return new Point(r0, r2);
            }
        }
        throw new NumberFormatException();
    }

    @androidx.annotation.i0
    private static Point g(@androidx.annotation.h0 String str, @androidx.annotation.h0 Display display) throws ClassNotFoundException {
        if (display.getDisplayId() != 0) {
            return null;
        }
        String strC = c(str);
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        try {
            return f(strC);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @androidx.annotation.m0(23)
    private static boolean h(Display.Mode mode, Point point) {
        return (mode.getPhysicalWidth() == point.x && mode.getPhysicalHeight() == point.y) || (mode.getPhysicalWidth() == point.y && mode.getPhysicalHeight() == point.x);
    }
}

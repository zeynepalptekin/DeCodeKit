package b.i.b;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.h0;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f960a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f961b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f962c = 4;
    public static final int d = 8;
    public static final int e = 32;
    public static final int f = -1;
    public static final int g = 2;
    public static final int h = 4;
    public static final int i = 8;
    public static final int j = 16;
    public static final int k = 32;

    private a() {
    }

    @h0
    public static String a(int r1) {
        return r1 != 1 ? r1 != 2 ? r1 != 4 ? r1 != 8 ? "UNKNOWN" : "CAPABILITY_CAN_FILTER_KEY_EVENTS" : "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY" : "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION" : "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
    }

    @h0
    public static String b(int r4) {
        StringBuilder sb = new StringBuilder();
        String str = "[";
        while (true) {
            sb.append(str);
            while (r4 > 0) {
                int r1 = 1 << Integer.numberOfTrailingZeros(r4);
                r4 &= ~r1;
                if (sb.length() > 1) {
                    sb.append(", ");
                }
                if (r1 == 1) {
                    str = "FEEDBACK_SPOKEN";
                } else if (r1 == 2) {
                    str = "FEEDBACK_HAPTIC";
                } else if (r1 == 4) {
                    str = "FEEDBACK_AUDIBLE";
                } else if (r1 == 8) {
                    str = "FEEDBACK_VISUAL";
                } else if (r1 == 16) {
                    str = "FEEDBACK_GENERIC";
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    @i0
    public static String c(int r1) {
        if (r1 == 1) {
            return "DEFAULT";
        }
        if (r1 == 2) {
            return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
        }
        if (r1 == 4) {
            return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
        }
        if (r1 == 8) {
            return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
        }
        if (r1 == 16) {
            return "FLAG_REPORT_VIEW_IDS";
        }
        if (r1 != 32) {
            return null;
        }
        return "FLAG_REQUEST_FILTER_KEY_EVENTS";
    }

    public static int d(@h0 AccessibilityServiceInfo accessibilityServiceInfo) {
        return Build.VERSION.SDK_INT >= 18 ? accessibilityServiceInfo.getCapabilities() : accessibilityServiceInfo.getCanRetrieveWindowContent() ? 1 : 0;
    }

    @i0
    public static String e(@h0 AccessibilityServiceInfo accessibilityServiceInfo, @h0 PackageManager packageManager) {
        return Build.VERSION.SDK_INT >= 16 ? accessibilityServiceInfo.loadDescription(packageManager) : accessibilityServiceInfo.getDescription();
    }
}

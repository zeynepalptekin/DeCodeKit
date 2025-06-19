package c.a.b.b.g.c;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* loaded from: classes.dex */
public class u1 {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.u("DirectBootUtils.class")
    private static UserManager f1829a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f1830b = !a();

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.u("DirectBootUtils.class")
    private static boolean f1831c = false;

    private u1() {
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean b(Context context) {
        return !a() || d(context);
    }

    @androidx.annotation.m0(24)
    @androidx.annotation.u("DirectBootUtils.class")
    @TargetApi(24)
    private static boolean c(Context context) {
        boolean z;
        boolean z2 = true;
        int r1 = 1;
        while (true) {
            z = false;
            if (r1 > 2) {
                break;
            }
            if (f1829a == null) {
                f1829a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = f1829a;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked()) {
                    break;
                }
                if (userManager.isUserRunning(Process.myUserHandle())) {
                    z2 = false;
                }
            } catch (NullPointerException e) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                f1829a = null;
                r1++;
            }
        }
        z = z2;
        if (z) {
            f1829a = null;
        }
        return z;
    }

    @androidx.annotation.m0(24)
    @TargetApi(24)
    private static boolean d(Context context) {
        if (f1830b) {
            return true;
        }
        synchronized (u1.class) {
            if (f1830b) {
                return true;
            }
            boolean zC = c(context);
            if (zC) {
                f1830b = zC;
            }
            return zC;
        }
    }
}

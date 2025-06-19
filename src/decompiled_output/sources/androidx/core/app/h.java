package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.h0;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final int f269a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f270b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f271c = 2;
    public static final int d = 3;

    private h() {
    }

    public static int a(@h0 Context context, @h0 String str, int r4, @h0 String str2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return ((AppOpsManager) context.getSystemService("appops")).noteOp(str, r4, str2);
        }
        return 1;
    }

    public static int b(@h0 Context context, @h0 String str, int r4, @h0 String str2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return ((AppOpsManager) context.getSystemService("appops")).noteOpNoThrow(str, r4, str2);
        }
        return 1;
    }

    public static int c(@h0 Context context, @h0 String str, @h0 String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOp(str, str2);
        }
        return 1;
    }

    public static int d(@h0 Context context, @h0 String str, @h0 String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
        }
        return 1;
    }

    @i0
    public static String e(@h0 String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AppOpsManager.permissionToOp(str);
        }
        return null;
    }
}

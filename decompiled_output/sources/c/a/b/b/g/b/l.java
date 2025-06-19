package c.a.b.b.g.b;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import androidx.annotation.m0;
import androidx.annotation.u;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f1649a = !b();

    /* renamed from: b, reason: collision with root package name */
    @u("DirectBootUtils.class")
    private static boolean f1650b = false;

    @m0(24)
    @TargetApi(24)
    public static Context a(Context context) {
        return context.isDeviceProtectedStorage() ? context : context.createDeviceProtectedStorageContext();
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 24;
    }
}

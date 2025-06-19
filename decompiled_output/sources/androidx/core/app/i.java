package androidx.core.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.h0;
import androidx.annotation.i0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class i {

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final String f272a = "BundleCompatBaseImpl";

        /* renamed from: b, reason: collision with root package name */
        private static Method f273b;

        /* renamed from: c, reason: collision with root package name */
        private static boolean f274c;
        private static Method d;
        private static boolean e;

        private a() {
        }

        public static IBinder a(Bundle bundle, String str) throws NoSuchMethodException, SecurityException {
            if (!f274c) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", String.class);
                    f273b = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e2) {
                    Log.i(f272a, "Failed to retrieve getIBinder method", e2);
                }
                f274c = true;
            }
            Method method2 = f273b;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e3) {
                    Log.i(f272a, "Failed to invoke getIBinder via reflection", e3);
                    f273b = null;
                }
            }
            return null;
        }

        public static void b(Bundle bundle, String str, IBinder iBinder) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (!e) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                    d = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e2) {
                    Log.i(f272a, "Failed to retrieve putIBinder method", e2);
                }
                e = true;
            }
            Method method2 = d;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, str, iBinder);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e3) {
                    Log.i(f272a, "Failed to invoke putIBinder via reflection", e3);
                    d = null;
                }
            }
        }
    }

    private i() {
    }

    @i0
    public static IBinder a(@h0 Bundle bundle, @i0 String str) {
        return Build.VERSION.SDK_INT >= 18 ? bundle.getBinder(str) : a.a(bundle, str);
    }

    public static void b(@h0 Bundle bundle, @i0 String str, @i0 IBinder iBinder) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            a.b(bundle, str, iBinder);
        }
    }
}

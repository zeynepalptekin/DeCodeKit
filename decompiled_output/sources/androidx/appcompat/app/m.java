package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import androidx.annotation.h0;
import androidx.annotation.m0;
import java.lang.reflect.Field;
import java.util.Map;

/* loaded from: classes.dex */
class m {

    /* renamed from: a, reason: collision with root package name */
    private static final String f74a = "ResourcesFlusher";

    /* renamed from: b, reason: collision with root package name */
    private static Field f75b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f76c;
    private static Class<?> d;
    private static boolean e;
    private static Field f;
    private static boolean g;
    private static Field h;
    private static boolean i;

    private m() {
    }

    static void a(@h0 Resources resources) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 28) {
            return;
        }
        if (r0 >= 24) {
            d(resources);
        } else if (r0 >= 23) {
            c(resources);
        } else if (r0 >= 21) {
            b(resources);
        }
    }

    @m0(21)
    private static void b(@h0 Resources resources) throws NoSuchFieldException {
        if (!f76c) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f75b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e(f74a, "Could not retrieve Resources#mDrawableCache field", e2);
            }
            f76c = true;
        }
        Field field = f75b;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e(f74a, "Could not retrieve value from Resources#mDrawableCache", e3);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    @m0(23)
    private static void c(@h0 Resources resources) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (!f76c) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f75b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e(f74a, "Could not retrieve Resources#mDrawableCache field", e2);
            }
            f76c = true;
        }
        Object obj = null;
        Field field = f75b;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e(f74a, "Could not retrieve value from Resources#mDrawableCache", e3);
            }
        }
        if (obj == null) {
            return;
        }
        e(obj);
    }

    @m0(24)
    private static void d(@h0 Resources resources) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Object obj;
        if (!i) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                h = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e(f74a, "Could not retrieve Resources#mResourcesImpl field", e2);
            }
            i = true;
        }
        Field field = h;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e3) {
            Log.e(f74a, "Could not retrieve value from Resources#mResourcesImpl", e3);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f76c) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f75b = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e(f74a, "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
            }
            f76c = true;
        }
        Field field2 = f75b;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e5) {
                Log.e(f74a, "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
            }
        }
        if (obj2 != null) {
            e(obj2);
        }
    }

    @m0(16)
    private static void e(@h0 Object obj) throws NoSuchFieldException {
        if (!e) {
            try {
                d = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e(f74a, "Could not find ThemedResourceCache class", e2);
            }
            e = true;
        }
        Class<?> cls = d;
        if (cls == null) {
            return;
        }
        if (!g) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e(f74a, "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            g = true;
        }
        Field field = f;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e(f74a, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}

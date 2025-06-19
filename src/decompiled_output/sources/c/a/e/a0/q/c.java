package c.a.e.a0.q;

import c.a.e.m;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
final class c extends b {
    private static Class d;

    /* renamed from: b, reason: collision with root package name */
    private final Object f2295b = d();

    /* renamed from: c, reason: collision with root package name */
    private final Field f2296c = c();

    c() {
    }

    private static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private static Object d() throws NoSuchFieldException, ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // c.a.e.a0.q.b
    public void b(AccessibleObject accessibleObject) throws SecurityException {
        if (e(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e) {
            throw new m("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
        }
    }

    boolean e(AccessibleObject accessibleObject) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f2295b != null && this.f2296c != null) {
            try {
                d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f2295b, accessibleObject, Long.valueOf(((Long) d.getMethod("objectFieldOffset", Field.class).invoke(this.f2295b, this.f2296c)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}

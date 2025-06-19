package androidx.fragment.app;

import androidx.annotation.h0;
import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static final b.f.i<String, Class<?>> f429a = new b.f.i<>();

    static boolean b(@h0 ClassLoader classLoader, @h0 String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @h0
    private static Class<?> c(@h0 ClassLoader classLoader, @h0 String str) throws ClassNotFoundException {
        Class<?> cls = f429a.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        f429a.put(str, cls2);
        return cls2;
    }

    @h0
    public static Class<? extends Fragment> d(@h0 ClassLoader classLoader, @h0 String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.e("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.e("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
        }
    }

    @h0
    public Fragment a(@h0 ClassLoader classLoader, @h0 String str) {
        try {
            return d(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw new Fragment.e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw new Fragment.e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment.e("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment.e("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }
}

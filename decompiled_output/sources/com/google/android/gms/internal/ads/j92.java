package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.y82;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
abstract class j92<T extends y82> {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f3931a = Logger.getLogger(v82.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static String f3932b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    j92() {
    }

    static <T extends y82> T b(Class<T> cls) {
        String str;
        ClassLoader classLoader = j92.class.getClassLoader();
        if (cls.equals(y82.class)) {
            str = f3932b;
        } else {
            if (!cls.getPackage().equals(j92.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        return cls.cast(((j92) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).a());
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException(e);
                    }
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (InstantiationException e3) {
                throw new IllegalStateException(e3);
            } catch (NoSuchMethodException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(j92.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((j92) it.next()).a()));
                } catch (ServiceConfigurationError e5) {
                    Logger logger = f3931a;
                    Level level = Level.SEVERE;
                    String strValueOf = String.valueOf(cls.getSimpleName());
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", strValueOf.length() != 0 ? "Unable to load ".concat(strValueOf) : new String("Unable to load "), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (T) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    protected abstract T a();
}

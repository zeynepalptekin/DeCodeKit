package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class fv1 {

    /* renamed from: a, reason: collision with root package name */
    @NullableDecl
    private static final Object f3463a;

    /* renamed from: b, reason: collision with root package name */
    @NullableDecl
    private static final Method f3464b;

    /* renamed from: c, reason: collision with root package name */
    @NullableDecl
    private static final Method f3465c;

    static {
        Object objC = c();
        f3463a = objC;
        f3464b = objC == null ? null : b("getStackTraceElement", Throwable.class, Integer.TYPE);
        f3465c = f3463a != null ? d() : null;
    }

    public static String a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        i72.a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @NullableDecl
    private static Method b(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    @NullableDecl
    private static Object c() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    @NullableDecl
    private static Method d() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Method methodB = b("getStackTraceDepth", Throwable.class);
            if (methodB == null) {
                return null;
            }
            methodB.invoke(c(), new Throwable());
            return methodB;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    public static void e(Throwable th) {
        bv1.b(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    @Deprecated
    public static RuntimeException f(Throwable th) {
        e(th);
        throw new RuntimeException(th);
    }
}

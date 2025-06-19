package b.i.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import androidx.annotation.p0;
import b.i.c.j.d;
import b.i.l.b;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

@m0(24)
@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
class m extends q {
    private static final String d = "TypefaceCompatApi24Impl";
    private static final String e = "android.graphics.FontFamily";
    private static final String f = "addFontWeightStyle";
    private static final String g = "createFromFamiliesWithDefault";
    private static final Class<?> h;
    private static final Constructor<?> i;
    private static final Method j;
    private static final Method k;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName(e);
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod(f, ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod(g, Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e(d, e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        i = constructor;
        h = cls;
        j = method2;
        k = method;
    }

    m() {
    }

    private static boolean k(Object obj, ByteBuffer byteBuffer, int r5, int r6, boolean z) {
        try {
            return ((Boolean) j.invoke(obj, byteBuffer, Integer.valueOf(r5), null, Integer.valueOf(r6), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface l(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance(h, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) k.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean m() {
        if (j == null) {
            Log.w(d, "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return j != null;
    }

    private static Object n() {
        try {
            return i.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // b.i.e.q
    @i0
    public Typeface b(Context context, d.c cVar, Resources resources, int r11) {
        Object objN = n();
        if (objN == null) {
            return null;
        }
        for (d.C0056d c0056d : cVar.a()) {
            ByteBuffer byteBufferB = r.b(context, resources, c0056d.b());
            if (byteBufferB == null || !k(objN, byteBufferB, c0056d.c(), c0056d.e(), c0056d.f())) {
                return null;
            }
        }
        return l(objN);
    }

    @Override // b.i.e.q
    @i0
    public Typeface c(Context context, @i0 CancellationSignal cancellationSignal, @h0 b.h[] hVarArr, int r13) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        Object objN = n();
        if (objN == null) {
            return null;
        }
        b.f.i iVar = new b.f.i();
        for (b.h hVar : hVarArr) {
            Uri uriC = hVar.c();
            ByteBuffer byteBufferF = (ByteBuffer) iVar.get(uriC);
            if (byteBufferF == null) {
                byteBufferF = r.f(context, cancellationSignal, uriC);
                iVar.put(uriC, byteBufferF);
            }
            if (byteBufferF == null || !k(objN, byteBufferF, hVar.b(), hVar.d(), hVar.e())) {
                return null;
            }
        }
        Typeface typefaceL = l(objN);
        if (typefaceL == null) {
            return null;
        }
        return Typeface.create(typefaceL, r13);
    }
}

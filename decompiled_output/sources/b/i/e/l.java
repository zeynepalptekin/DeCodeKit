package b.i.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.annotation.h0;
import androidx.annotation.m0;
import androidx.annotation.p0;
import b.i.c.j.d;
import b.i.l.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@m0(21)
@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
class l extends q {
    private static final String d = "TypefaceCompatApi21Impl";
    private static final String e = "android.graphics.FontFamily";
    private static final String f = "addFontWeightStyle";
    private static final String g = "createFromFamiliesWithDefault";
    private static Class<?> h = null;
    private static Constructor<?> i = null;
    private static Method j = null;
    private static Method k = null;
    private static boolean l = false;

    l() {
    }

    private static boolean k(Object obj, String str, int r5, boolean z) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        n();
        try {
            return ((Boolean) j.invoke(obj, str, Integer.valueOf(r5), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static Typeface l(Object obj) throws NoSuchMethodException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        n();
        try {
            Object objNewInstance = Array.newInstance(h, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) k.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private File m(@h0 ParcelFileDescriptor parcelFileDescriptor) throws ErrnoException {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void n() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (l) {
            return;
        }
        l = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName(e);
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod(f, String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod(g, Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e(d, e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        i = constructor;
        h = cls;
        j = method2;
        k = method;
    }

    private static Object o() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        n();
        try {
            return i.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // b.i.e.q
    public Typeface b(Context context, d.c cVar, Resources resources, int r11) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Object objO = o();
        for (d.C0056d c0056d : cVar.a()) {
            File fileE = r.e(context);
            if (fileE == null) {
                return null;
            }
            try {
                if (!r.c(fileE, resources, c0056d.b())) {
                    return null;
                }
                if (!k(objO, fileE.getPath(), c0056d.e(), c0056d.f())) {
                    return null;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileE.delete();
            }
        }
        return l(objO);
    }

    @Override // b.i.e.q
    public Typeface c(Context context, CancellationSignal cancellationSignal, @h0 b.h[] hVarArr, int r7) throws IOException {
        if (hVarArr.length < 1) {
            return null;
        }
        b.h hVarH = h(hVarArr, r7);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(hVarH.c(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                File fileM = m(parcelFileDescriptorOpenFileDescriptor);
                if (fileM != null && fileM.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(fileM);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceD = super.d(context, fileInputStream);
                    fileInputStream.close();
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return typefaceD;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }
}

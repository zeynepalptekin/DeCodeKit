package b.i.e;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
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
import java.util.Map;

@m0(26)
@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class n extends l {
    private static final int A = -1;
    private static final String t = "TypefaceCompatApi26Impl";
    private static final String u = "android.graphics.FontFamily";
    private static final String v = "addFontFromAssetManager";
    private static final String w = "addFontFromBuffer";
    private static final String x = "createFromFamiliesWithDefault";
    private static final String y = "freeze";
    private static final String z = "abortCreation";
    protected final Class<?> m;
    protected final Constructor<?> n;
    protected final Method o;
    protected final Method p;
    protected final Method q;
    protected final Method r;
    protected final Method s;

    public n() throws NoSuchMethodException, SecurityException {
        Method methodX;
        Constructor<?> constructorZ;
        Method methodV;
        Method methodW;
        Method methodA;
        Method methodU;
        Class<?> cls = null;
        try {
            Class<?> clsY = y();
            constructorZ = z(clsY);
            methodV = v(clsY);
            methodW = w(clsY);
            methodA = A(clsY);
            methodU = u(clsY);
            methodX = x(clsY);
            cls = clsY;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e(t, "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            methodX = null;
            constructorZ = null;
            methodV = null;
            methodW = null;
            methodA = null;
            methodU = null;
        }
        this.m = cls;
        this.n = constructorZ;
        this.o = methodV;
        this.p = methodW;
        this.q = methodA;
        this.r = methodU;
        this.s = methodX;
    }

    @i0
    private Object o() {
        try {
            return this.n.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void p(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.r.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean q(Context context, Object obj, String str, int r7, int r8, int r9, @i0 FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.o.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(r7), Integer.valueOf(r8), Integer.valueOf(r9), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean r(Object obj, ByteBuffer byteBuffer, int r6, int r7, int r8) {
        try {
            return ((Boolean) this.p.invoke(obj, byteBuffer, Integer.valueOf(r6), null, Integer.valueOf(r7), Integer.valueOf(r8))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean s(Object obj) {
        try {
            return ((Boolean) this.q.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean t() {
        if (this.o == null) {
            Log.w(t, "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.o != null;
    }

    protected Method A(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(y, new Class[0]);
    }

    @Override // b.i.e.l, b.i.e.q
    @i0
    public Typeface b(Context context, d.c cVar, Resources resources, int r14) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!t()) {
            return super.b(context, cVar, resources, r14);
        }
        Object objO = o();
        if (objO == null) {
            return null;
        }
        for (d.C0056d c0056d : cVar.a()) {
            if (!q(context, objO, c0056d.a(), c0056d.c(), c0056d.e(), c0056d.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0056d.d()))) {
                p(objO);
                return null;
            }
        }
        if (s(objO)) {
            return l(objO);
        }
        return null;
    }

    @Override // b.i.e.l, b.i.e.q
    @i0
    public Typeface c(Context context, @i0 CancellationSignal cancellationSignal, @h0 b.h[] hVarArr, int r14) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Typeface typefaceL;
        if (hVarArr.length < 1) {
            return null;
        }
        if (!t()) {
            b.h hVarH = h(hVarArr, r14);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(hVarH.c(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(hVarH.d()).setItalic(hVarH.e()).build();
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> mapJ = b.i.l.b.j(context, hVarArr, cancellationSignal);
        Object objO = o();
        if (objO == null) {
            return null;
        }
        boolean z2 = false;
        for (b.h hVar : hVarArr) {
            ByteBuffer byteBuffer = mapJ.get(hVar.c());
            if (byteBuffer != null) {
                if (!r(objO, byteBuffer, hVar.b(), hVar.d(), hVar.e() ? 1 : 0)) {
                    p(objO);
                    return null;
                }
                z2 = true;
            }
        }
        if (!z2) {
            p(objO);
            return null;
        }
        if (s(objO) && (typefaceL = l(objO)) != null) {
            return Typeface.create(typefaceL, r14);
        }
        return null;
    }

    @Override // b.i.e.q
    @i0
    public Typeface e(Context context, Resources resources, int r11, String str, int r13) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!t()) {
            return super.e(context, resources, r11, str, r13);
        }
        Object objO = o();
        if (objO == null) {
            return null;
        }
        if (!q(context, objO, str, 0, -1, -1, null)) {
            p(objO);
            return null;
        }
        if (s(objO)) {
            return l(objO);
        }
        return null;
    }

    @i0
    protected Typeface l(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance(this.m, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.s.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method u(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(z, new Class[0]);
    }

    protected Method v(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod(v, AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    protected Method w(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod(w, ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method x(Class<?> cls) throws NoSuchMethodException, SecurityException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod(x, Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class<?> y() throws ClassNotFoundException {
        return Class.forName(u);
    }

    protected Constructor<?> z(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }
}

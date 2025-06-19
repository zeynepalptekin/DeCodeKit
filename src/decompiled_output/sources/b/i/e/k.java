package b.i.e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import b.i.c.j.d;
import b.i.c.j.g;
import b.i.l.b;

@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private static final q f1028a;

    /* renamed from: b, reason: collision with root package name */
    private static final b.f.g<String, Typeface> f1029b;

    static {
        int r0 = Build.VERSION.SDK_INT;
        f1028a = r0 >= 29 ? new p() : r0 >= 28 ? new o() : r0 >= 26 ? new n() : (r0 < 24 || !m.m()) ? Build.VERSION.SDK_INT >= 21 ? new l() : new q() : new m();
        f1029b = new b.f.g<>(16);
    }

    private k() {
    }

    @h0
    public static Typeface a(@h0 Context context, @i0 Typeface typeface, int r4) {
        Typeface typefaceG;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (typefaceG = g(context, typeface, r4)) == null) ? Typeface.create(typeface, r4) : typefaceG;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @i0
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static Typeface b(@h0 Context context, @i0 CancellationSignal cancellationSignal, @h0 b.h[] hVarArr, int r4) {
        return f1028a.c(context, cancellationSignal, hVarArr, r4);
    }

    @i0
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static Typeface c(@h0 Context context, @h0 d.a aVar, @h0 Resources resources, int r10, int r11, @i0 g.a aVar2, @i0 Handler handler, boolean z) throws NoSuchFieldException {
        Typeface typefaceB;
        if (aVar instanceof d.e) {
            d.e eVar = (d.e) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : eVar.a() == 0) {
                z2 = true;
            }
            typefaceB = b.i.l.b.h(context, eVar.b(), aVar2, handler, z2, z ? eVar.c() : -1, r11);
        } else {
            typefaceB = f1028a.b(context, (d.c) aVar, resources, r11);
            if (aVar2 != null) {
                if (typefaceB != null) {
                    aVar2.b(typefaceB, handler);
                } else {
                    aVar2.a(-3, handler);
                }
            }
        }
        if (typefaceB != null) {
            f1029b.j(e(resources, r10, r11), typefaceB);
        }
        return typefaceB;
    }

    @i0
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static Typeface d(@h0 Context context, @h0 Resources resources, int r8, String str, int r10) {
        Typeface typefaceE = f1028a.e(context, resources, r8, str, r10);
        if (typefaceE != null) {
            f1029b.j(e(resources, r8, r10), typefaceE);
        }
        return typefaceE;
    }

    private static String e(Resources resources, int r2, int r3) {
        return resources.getResourcePackageName(r2) + "-" + r2 + "-" + r3;
    }

    @i0
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static Typeface f(@h0 Resources resources, int r2, int r3) {
        return f1029b.f(e(resources, r2, r3));
    }

    @i0
    private static Typeface g(Context context, Typeface typeface, int r4) throws NoSuchFieldException {
        d.c cVarI = f1028a.i(typeface);
        if (cVarI == null) {
            return null;
        }
        return f1028a.b(context, cVarI, context.getResources(), r4);
    }
}

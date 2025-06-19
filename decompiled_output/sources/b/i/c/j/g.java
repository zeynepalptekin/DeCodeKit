package b.i.c.j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import androidx.annotation.m;
import androidx.annotation.m0;
import androidx.annotation.o;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.s;
import b.i.o.i;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1004a = "ResourcesCompat";

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.c
    public static final int f1005b = 0;

    public static abstract class a {

        /* renamed from: b.i.c.j.g$a$a, reason: collision with other inner class name */
        class RunnableC0057a implements Runnable {
            final /* synthetic */ Typeface d;

            RunnableC0057a(Typeface typeface) {
                this.d = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.d(this.d);
            }
        }

        class b implements Runnable {
            final /* synthetic */ int d;

            b(int r2) {
                this.d = r2;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.c(this.d);
            }
        }

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public final void a(int r2, @i0 Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new b(r2));
        }

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public final void b(Typeface typeface, @i0 Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new RunnableC0057a(typeface));
        }

        public abstract void c(int r1);

        public abstract void d(@h0 Typeface typeface);
    }

    public static final class b {

        @m0(23)
        static class a {

            /* renamed from: a, reason: collision with root package name */
            private static final Object f1006a = new Object();

            /* renamed from: b, reason: collision with root package name */
            private static Method f1007b;

            /* renamed from: c, reason: collision with root package name */
            private static boolean f1008c;

            private a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            static void a(@androidx.annotation.h0 android.content.res.Resources.Theme r6) {
                /*
                    java.lang.Object r0 = b.i.c.j.g.b.a.f1006a
                    monitor-enter(r0)
                    boolean r1 = b.i.c.j.g.b.a.f1008c     // Catch: java.lang.Throwable -> L3e
                    r2 = 0
                    if (r1 != 0) goto L23
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3e
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3e
                    b.i.c.j.g.b.a.f1007b = r3     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3e
                    r3.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3e
                    goto L21
                L19:
                    r3 = move-exception
                    java.lang.String r4 = "ResourcesCompat"
                    java.lang.String r5 = "Failed to retrieve rebase() method"
                    android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L3e
                L21:
                    b.i.c.j.g.b.a.f1008c = r1     // Catch: java.lang.Throwable -> L3e
                L23:
                    java.lang.reflect.Method r1 = b.i.c.j.g.b.a.f1007b     // Catch: java.lang.Throwable -> L3e
                    if (r1 == 0) goto L3c
                    java.lang.reflect.Method r1 = b.i.c.j.g.b.a.f1007b     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31 java.lang.Throwable -> L3e
                    java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31 java.lang.Throwable -> L3e
                    r1.invoke(r6, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31 java.lang.Throwable -> L3e
                    goto L3c
                L2f:
                    r6 = move-exception
                    goto L32
                L31:
                    r6 = move-exception
                L32:
                    java.lang.String r1 = "ResourcesCompat"
                    java.lang.String r2 = "Failed to invoke rebase() method via reflection"
                    android.util.Log.i(r1, r2, r6)     // Catch: java.lang.Throwable -> L3e
                    r6 = 0
                    b.i.c.j.g.b.a.f1007b = r6     // Catch: java.lang.Throwable -> L3e
                L3c:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
                    return
                L3e:
                    r6 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: b.i.c.j.g.b.a.a(android.content.res.Resources$Theme):void");
            }
        }

        @m0(29)
        /* renamed from: b.i.c.j.g$b$b, reason: collision with other inner class name */
        static class C0058b {
            private C0058b() {
            }

            static void a(@h0 Resources.Theme theme) {
                theme.rebase();
            }
        }

        private b() {
        }

        public static void a(@h0 Resources.Theme theme) {
            int r0 = Build.VERSION.SDK_INT;
            if (r0 >= 29) {
                C0058b.a(theme);
            } else if (r0 >= 23) {
                a.a(theme);
            }
        }
    }

    private g() {
    }

    @k
    public static int a(@h0 Resources resources, @m int r3, @i0 Resources.Theme theme) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT >= 23 ? resources.getColor(r3, theme) : resources.getColor(r3);
    }

    @i0
    public static ColorStateList b(@h0 Resources resources, @m int r3, @i0 Resources.Theme theme) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT >= 23 ? resources.getColorStateList(r3, theme) : resources.getColorStateList(r3);
    }

    @i0
    public static Drawable c(@h0 Resources resources, @q int r3, @i0 Resources.Theme theme) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(r3, theme) : resources.getDrawable(r3);
    }

    @i0
    public static Drawable d(@h0 Resources resources, @q int r3, int r4, @i0 Resources.Theme theme) throws Resources.NotFoundException {
        int r0 = Build.VERSION.SDK_INT;
        return r0 >= 21 ? resources.getDrawableForDensity(r3, r4, theme) : r0 >= 15 ? resources.getDrawableForDensity(r3, r4) : resources.getDrawable(r3);
    }

    public static float e(@h0 Resources resources, @o int r4) throws Resources.NotFoundException {
        TypedValue typedValue = new TypedValue();
        resources.getValue(r4, typedValue, true);
        if (typedValue.type == 4) {
            return typedValue.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(r4) + " type #0x" + Integer.toHexString(typedValue.type) + " is not valid");
    }

    @i0
    public static Typeface f(@h0 Context context, @s int r8) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return i(context, r8, new TypedValue(), 0, null, null, false);
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static Typeface g(@h0 Context context, @s int r8, TypedValue typedValue, int r10, @i0 a aVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return i(context, r8, typedValue, r10, aVar, null, true);
    }

    public static void h(@h0 Context context, @s int r8, @h0 a aVar, @i0 Handler handler) throws Resources.NotFoundException {
        i.f(aVar);
        if (context.isRestricted()) {
            aVar.a(-4, handler);
        } else {
            i(context, r8, new TypedValue(), 0, aVar, handler, false);
        }
    }

    private static Typeface i(@h0 Context context, int r9, TypedValue typedValue, int r11, @i0 a aVar, @i0 Handler handler, boolean z) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        resources.getValue(r9, typedValue, true);
        Typeface typefaceJ = j(context, resources, typedValue, r9, r11, aVar, handler, z);
        if (typefaceJ != null || aVar != null) {
            return typefaceJ;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(r9) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Typeface j(@androidx.annotation.h0 android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, @androidx.annotation.i0 b.i.c.j.g.a r20, @androidx.annotation.i0 android.os.Handler r21, boolean r22) {
        /*
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L9a
            java.lang.String r12 = r2.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = 0
            r14 = -3
            if (r1 != 0) goto L26
            if (r9 == 0) goto L25
            r9.a(r14, r10)
        L25:
            return r13
        L26:
            android.graphics.Typeface r1 = b.i.e.k.f(r0, r4, r5)
            if (r1 == 0) goto L32
            if (r9 == 0) goto L31
            r9.b(r1, r10)
        L31:
            return r1
        L32:
            java.lang.String r1 = r12.toLowerCase()     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
            if (r1 == 0) goto L65
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
            b.i.c.j.d$a r2 = b.i.c.j.d.b(r1, r0)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
            if (r2 != 0) goto L53
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
            if (r9 == 0) goto L52
            r9.a(r14, r10)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
        L52:
            return r13
        L53:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = b.i.e.k.c(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
            return r0
        L65:
            r1 = r15
            android.graphics.Typeface r0 = b.i.e.k.d(r15, r0, r4, r12, r5)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
            if (r9 == 0) goto L75
            if (r0 == 0) goto L72
            r9.b(r0, r10)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
            goto L75
        L72:
            r9.a(r14, r10)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
        L75:
            return r0
        L76:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            goto L87
        L7f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
        L87:
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            if (r9 == 0) goto L99
            r9.a(r14, r10)
        L99:
            return r13
        L9a:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.i.c.j.g.j(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, b.i.c.j.g$a, android.os.Handler, boolean):android.graphics.Typeface");
    }
}

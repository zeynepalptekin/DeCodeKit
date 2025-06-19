package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.p0;
import b.a.d.a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class o0 {
    private static final String h = "ResourceManagerInternal";
    private static final boolean i = false;
    private static final String k = "appcompat_skip_skip";
    private static final String l = "android.graphics.drawable.VectorDrawable";
    private static o0 m;

    /* renamed from: a, reason: collision with root package name */
    private WeakHashMap<Context, b.f.j<ColorStateList>> f178a;

    /* renamed from: b, reason: collision with root package name */
    private b.f.i<String, d> f179b;

    /* renamed from: c, reason: collision with root package name */
    private b.f.j<String> f180c;
    private final WeakHashMap<Context, b.f.f<WeakReference<Drawable.ConstantState>>> d = new WeakHashMap<>(0);
    private TypedValue e;
    private boolean f;
    private e g;
    private static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;
    private static final c n = new c(6);

    @androidx.annotation.m0(11)
    static class a implements d {
        a() {
        }

        @Override // androidx.appcompat.widget.o0.d
        public Drawable a(@androidx.annotation.h0 Context context, @androidx.annotation.h0 XmlPullParser xmlPullParser, @androidx.annotation.h0 AttributeSet attributeSet, @androidx.annotation.i0 Resources.Theme theme) {
            try {
                return b.a.c.a.a.C(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    private static class b implements d {
        b() {
        }

        @Override // androidx.appcompat.widget.o0.d
        public Drawable a(@androidx.annotation.h0 Context context, @androidx.annotation.h0 XmlPullParser xmlPullParser, @androidx.annotation.h0 AttributeSet attributeSet, @androidx.annotation.i0 Resources.Theme theme) {
            try {
                return b.x.c.a.c.e(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    private static class c extends b.f.g<Integer, PorterDuffColorFilter> {
        public c(int r1) {
            super(r1);
        }

        private static int s(int r1, PorterDuff.Mode mode) {
            return ((r1 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter t(int r1, PorterDuff.Mode mode) {
            return f(Integer.valueOf(s(r1, mode)));
        }

        PorterDuffColorFilter u(int r1, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return j(Integer.valueOf(s(r1, mode)), porterDuffColorFilter);
        }
    }

    private interface d {
        Drawable a(@androidx.annotation.h0 Context context, @androidx.annotation.h0 XmlPullParser xmlPullParser, @androidx.annotation.h0 AttributeSet attributeSet, @androidx.annotation.i0 Resources.Theme theme);
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    interface e {
        boolean a(@androidx.annotation.h0 Context context, @androidx.annotation.q int r2, @androidx.annotation.h0 Drawable drawable);

        PorterDuff.Mode b(int r1);

        Drawable c(@androidx.annotation.h0 o0 o0Var, @androidx.annotation.h0 Context context, @androidx.annotation.q int r3);

        ColorStateList d(@androidx.annotation.h0 Context context, @androidx.annotation.q int r2);

        boolean e(@androidx.annotation.h0 Context context, @androidx.annotation.q int r2, @androidx.annotation.h0 Drawable drawable);
    }

    private static class f implements d {
        f() {
        }

        @Override // androidx.appcompat.widget.o0.d
        public Drawable a(@androidx.annotation.h0 Context context, @androidx.annotation.h0 XmlPullParser xmlPullParser, @androidx.annotation.h0 AttributeSet attributeSet, @androidx.annotation.i0 Resources.Theme theme) {
            try {
                return b.x.c.a.i.e(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    private void a(@androidx.annotation.h0 String str, @androidx.annotation.h0 d dVar) {
        if (this.f179b == null) {
            this.f179b = new b.f.i<>();
        }
        this.f179b.put(str, dVar);
    }

    private synchronized boolean b(@androidx.annotation.h0 Context context, long j2, @androidx.annotation.h0 Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            b.f.f<WeakReference<Drawable.ConstantState>> fVar = this.d.get(context);
            if (fVar == null) {
                fVar = new b.f.f<>();
                this.d.put(context, fVar);
            }
            fVar.q(j2, new WeakReference<>(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    private void c(@androidx.annotation.h0 Context context, @androidx.annotation.q int r4, @androidx.annotation.h0 ColorStateList colorStateList) {
        if (this.f178a == null) {
            this.f178a = new WeakHashMap<>();
        }
        b.f.j<ColorStateList> jVar = this.f178a.get(context);
        if (jVar == null) {
            jVar = new b.f.j<>();
            this.f178a.put(context, jVar);
        }
        jVar.b(r4, colorStateList);
    }

    private void d(@androidx.annotation.h0 Context context) {
        if (this.f) {
            return;
        }
        this.f = true;
        Drawable drawableJ = j(context, a.d.abc_vector_test);
        if (drawableJ == null || !q(drawableJ)) {
            this.f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable f(@androidx.annotation.h0 Context context, @androidx.annotation.q int r6) throws Resources.NotFoundException {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(r6, typedValue, true);
        long jE = e(typedValue);
        Drawable drawableI = i(context, jE);
        if (drawableI != null) {
            return drawableI;
        }
        e eVar = this.g;
        Drawable drawableC = eVar == null ? null : eVar.c(this, context, r6);
        if (drawableC != null) {
            drawableC.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, jE, drawableC);
        }
        return drawableC;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] r3) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(r3, 0), mode);
    }

    public static synchronized o0 h() {
        if (m == null) {
            o0 o0Var = new o0();
            m = o0Var;
            p(o0Var);
        }
        return m;
    }

    private synchronized Drawable i(@androidx.annotation.h0 Context context, long j2) {
        b.f.f<WeakReference<Drawable.ConstantState>> fVar = this.d.get(context);
        if (fVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceK = fVar.k(j2);
        if (weakReferenceK != null) {
            Drawable.ConstantState constantState = weakReferenceK.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            fVar.t(j2);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter l(int r3, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterT;
        porterDuffColorFilterT = n.t(r3, mode);
        if (porterDuffColorFilterT == null) {
            porterDuffColorFilterT = new PorterDuffColorFilter(r3, mode);
            n.u(r3, mode, porterDuffColorFilterT);
        }
        return porterDuffColorFilterT;
    }

    private ColorStateList n(@androidx.annotation.h0 Context context, @androidx.annotation.q int r4) {
        b.f.j<ColorStateList> jVar;
        WeakHashMap<Context, b.f.j<ColorStateList>> weakHashMap = this.f178a;
        if (weakHashMap == null || (jVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return jVar.k(r4);
    }

    private static void p(@androidx.annotation.h0 o0 o0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            o0Var.a("vector", new f());
            o0Var.a("animated-vector", new b());
            o0Var.a("animated-selector", new a());
        }
    }

    private static boolean q(@androidx.annotation.h0 Drawable drawable) {
        return (drawable instanceof b.x.c.a.i) || l.equals(drawable.getClass().getName());
    }

    private Drawable r(@androidx.annotation.h0 Context context, @androidx.annotation.q int r12) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        b.f.i<String, d> iVar = this.f179b;
        if (iVar == null || iVar.isEmpty()) {
            return null;
        }
        b.f.j<String> jVar = this.f180c;
        if (jVar != null) {
            String strK = jVar.k(r12);
            if (k.equals(strK) || (strK != null && this.f179b.get(strK) == null)) {
                return null;
            }
        } else {
            this.f180c = new b.f.j<>();
        }
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        Resources resources = context.getResources();
        resources.getValue(r12, typedValue, true);
        long jE = e(typedValue);
        Drawable drawableI = i(context, jE);
        if (drawableI != null) {
            return drawableI;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(r12);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f180c.b(r12, name);
                d dVar = this.f179b.get(name);
                if (dVar != null) {
                    drawableI = dVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableI != null) {
                    drawableI.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, jE, drawableI);
                }
            } catch (Exception e2) {
                Log.e(h, "Exception while inflating drawable", e2);
            }
        }
        if (drawableI == null) {
            this.f180c.b(r12, k);
        }
        return drawableI;
    }

    private Drawable v(@androidx.annotation.h0 Context context, @androidx.annotation.q int r3, boolean z, @androidx.annotation.h0 Drawable drawable) {
        ColorStateList colorStateListM = m(context, r3);
        if (colorStateListM == null) {
            e eVar = this.g;
            if ((eVar == null || !eVar.e(context, r3, drawable)) && !x(context, r3, drawable) && z) {
                return null;
            }
            return drawable;
        }
        if (f0.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable drawableR = androidx.core.graphics.drawable.a.r(drawable);
        androidx.core.graphics.drawable.a.o(drawableR, colorStateListM);
        PorterDuff.Mode modeO = o(r3);
        if (modeO == null) {
            return drawableR;
        }
        androidx.core.graphics.drawable.a.p(drawableR, modeO);
        return drawableR;
    }

    static void w(Drawable drawable, y0 y0Var, int[] r4) {
        if (f0.a(drawable) && drawable.mutate() != drawable) {
            Log.d(h, "Mutated drawable is not the same instance as the input.");
            return;
        }
        if (y0Var.d || y0Var.f211c) {
            drawable.setColorFilter(g(y0Var.d ? y0Var.f209a : null, y0Var.f211c ? y0Var.f210b : j, r4));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public synchronized Drawable j(@androidx.annotation.h0 Context context, @androidx.annotation.q int r3) {
        return k(context, r3, false);
    }

    synchronized Drawable k(@androidx.annotation.h0 Context context, @androidx.annotation.q int r3, boolean z) {
        Drawable drawableR;
        d(context);
        drawableR = r(context, r3);
        if (drawableR == null) {
            drawableR = f(context, r3);
        }
        if (drawableR == null) {
            drawableR = b.i.c.c.h(context, r3);
        }
        if (drawableR != null) {
            drawableR = v(context, r3, z, drawableR);
        }
        if (drawableR != null) {
            f0.b(drawableR);
        }
        return drawableR;
    }

    synchronized ColorStateList m(@androidx.annotation.h0 Context context, @androidx.annotation.q int r3) {
        ColorStateList colorStateListN;
        colorStateListN = n(context, r3);
        if (colorStateListN == null) {
            colorStateListN = this.g == null ? null : this.g.d(context, r3);
            if (colorStateListN != null) {
                c(context, r3, colorStateListN);
            }
        }
        return colorStateListN;
    }

    PorterDuff.Mode o(int r2) {
        e eVar = this.g;
        if (eVar == null) {
            return null;
        }
        return eVar.b(r2);
    }

    public synchronized void s(@androidx.annotation.h0 Context context) {
        b.f.f<WeakReference<Drawable.ConstantState>> fVar = this.d.get(context);
        if (fVar != null) {
            fVar.c();
        }
    }

    synchronized Drawable t(@androidx.annotation.h0 Context context, @androidx.annotation.h0 f1 f1Var, @androidx.annotation.q int r4) {
        Drawable drawableR = r(context, r4);
        if (drawableR == null) {
            drawableR = f1Var.d(r4);
        }
        if (drawableR == null) {
            return null;
        }
        return v(context, r4, false, drawableR);
    }

    public synchronized void u(e eVar) {
        this.g = eVar;
    }

    boolean x(@androidx.annotation.h0 Context context, @androidx.annotation.q int r3, @androidx.annotation.h0 Drawable drawable) {
        e eVar = this.g;
        return eVar != null && eVar.a(context, r3, drawable);
    }
}

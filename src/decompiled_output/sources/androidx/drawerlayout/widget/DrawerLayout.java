package androidx.drawerlayout.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import androidx.annotation.p0;
import androidx.annotation.q;
import b.i.p.f0;
import b.i.p.p0.d;
import b.k.c.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    private static final String O = "DrawerLayout";
    private static final int[] P;
    public static final int Q = 0;
    public static final int R = 1;
    public static final int S = 2;
    public static final int T = 0;
    public static final int U = 1;
    public static final int V = 2;
    public static final int W = 3;
    private static final int a0 = 64;
    private static final int b0 = 10;
    private static final int c0 = -1728053248;
    private static final int d0 = 160;
    private static final int e0 = 400;
    private static final boolean f0 = false;
    private static final boolean g0 = true;
    private static final float h0 = 1.0f;
    static final int[] i0;
    static final boolean j0;
    private static final boolean k0;
    private Drawable A;
    private Drawable B;
    private Drawable C;
    private CharSequence D;
    private CharSequence E;
    private Object F;
    private boolean G;
    private Drawable H;
    private Drawable I;
    private Drawable J;
    private Drawable K;
    private final ArrayList<View> L;
    private Rect M;
    private Matrix N;
    private final c d;
    private float e;
    private int f;
    private int g;
    private float h;
    private Paint i;
    private final b.k.c.c j;
    private final b.k.c.c k;
    private final h l;
    private final h m;
    private int n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private int t;
    private boolean u;
    private boolean v;

    @i0
    private d w;
    private List<d> x;
    private float y;
    private float z;

    class a implements View.OnApplyWindowInsetsListener {
        a() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).S(windowInsets, windowInsets.getSystemWindowInsetTop() > 0 ? DrawerLayout.g0 : false);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    class b extends b.i.p.a {
        private final Rect d = new Rect();

        b() {
        }

        private void n(b.i.p.p0.d dVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int r1 = 0; r1 < childCount; r1++) {
                View childAt = viewGroup.getChildAt(r1);
                if (DrawerLayout.A(childAt)) {
                    dVar.c(childAt);
                }
            }
        }

        private void o(b.i.p.p0.d dVar, b.i.p.p0.d dVar2) {
            Rect rect = this.d;
            dVar2.r(rect);
            dVar.O0(rect);
            dVar2.s(rect);
            dVar.P0(rect);
            dVar.R1(dVar2.z0());
            dVar.u1(dVar2.M());
            dVar.T0(dVar2.v());
            dVar.X0(dVar2.z());
            dVar.d1(dVar2.m0());
            dVar.U0(dVar2.h0());
            dVar.f1(dVar2.n0());
            dVar.g1(dVar2.o0());
            dVar.M0(dVar2.e0());
            dVar.D1(dVar2.w0());
            dVar.q1(dVar2.r0());
            dVar.a(dVar2.p());
        }

        @Override // b.i.p.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View viewP = DrawerLayout.this.p();
            if (viewP == null) {
                return DrawerLayout.g0;
            }
            CharSequence charSequenceS = DrawerLayout.this.s(DrawerLayout.this.t(viewP));
            if (charSequenceS == null) {
                return DrawerLayout.g0;
            }
            text.add(charSequenceS);
            return DrawerLayout.g0;
        }

        @Override // b.i.p.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        @Override // b.i.p.a
        public void g(View view, b.i.p.p0.d dVar) {
            if (DrawerLayout.j0) {
                super.g(view, dVar);
            } else {
                b.i.p.p0.d dVarD0 = b.i.p.p0.d.D0(dVar);
                super.g(view, dVarD0);
                dVar.F1(view);
                Object objI0 = f0.i0(view);
                if (objI0 instanceof View) {
                    dVar.w1((View) objI0);
                }
                o(dVar, dVarD0);
                dVarD0.G0();
                n(dVar, (ViewGroup) view);
            }
            dVar.T0(DrawerLayout.class.getName());
            dVar.f1(false);
            dVar.g1(false);
            dVar.I0(d.a.f);
            dVar.I0(d.a.g);
        }

        @Override // b.i.p.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.j0 || DrawerLayout.A(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    static final class c extends b.i.p.a {
        c() {
        }

        @Override // b.i.p.a
        public void g(View view, b.i.p.p0.d dVar) {
            super.g(view, dVar);
            if (DrawerLayout.A(view)) {
                return;
            }
            dVar.w1(null);
        }
    }

    public interface d {
        void a(int r1);

        void b(@h0 View view, float f);

        void c(@h0 View view);

        void d(@h0 View view);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        private static final int e = 1;
        private static final int f = 2;
        private static final int g = 4;

        /* renamed from: a, reason: collision with root package name */
        public int f417a;

        /* renamed from: b, reason: collision with root package name */
        float f418b;

        /* renamed from: c, reason: collision with root package name */
        boolean f419c;
        int d;

        public e(int r1, int r2) {
            super(r1, r2);
            this.f417a = 0;
        }

        public e(int r1, int r2, int r3) {
            this(r1, r2);
            this.f417a = r3;
        }

        public e(@h0 Context context, @i0 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f417a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.i0);
            this.f417a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public e(@h0 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f417a = 0;
        }

        public e(@h0 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f417a = 0;
        }

        public e(@h0 e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.f417a = 0;
            this.f417a = eVar.f417a;
        }
    }

    protected static class f extends b.k.b.a {
        public static final Parcelable.Creator<f> CREATOR = new a();
        int f;
        int g;
        int h;
        int i;
        int j;

        static class a implements Parcelable.ClassLoaderCreator<f> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int r1) {
                return new f[r1];
            }
        }

        public f(@h0 Parcel parcel, @i0 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f = 0;
            this.f = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readInt();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
        }

        public f(@h0 Parcelable parcelable) {
            super(parcelable);
            this.f = 0;
        }

        @Override // b.k.b.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int r2) {
            super.writeToParcel(parcel, r2);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
        }
    }

    public static abstract class g implements d {
        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void a(int r1) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void b(View view, float f) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void c(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void d(View view) {
        }
    }

    private class h extends c.AbstractC0082c {

        /* renamed from: a, reason: collision with root package name */
        private final int f420a;

        /* renamed from: b, reason: collision with root package name */
        private b.k.c.c f421b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f422c = new a();

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.o();
            }
        }

        h(int r2) {
            this.f420a = r2;
        }

        private void n() {
            View viewN = DrawerLayout.this.n(this.f420a == 3 ? 5 : 3);
            if (viewN != null) {
                DrawerLayout.this.f(viewN);
            }
        }

        @Override // b.k.c.c.AbstractC0082c
        public int a(View view, int r3, int r4) {
            int width;
            int width2;
            if (DrawerLayout.this.c(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = DrawerLayout.this.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(r3, width));
        }

        @Override // b.k.c.c.AbstractC0082c
        public int b(View view, int r2, int r3) {
            return view.getTop();
        }

        @Override // b.k.c.c.AbstractC0082c
        public int d(View view) {
            if (DrawerLayout.this.E(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // b.k.c.c.AbstractC0082c
        public void f(int r2, int r3) {
            DrawerLayout drawerLayout;
            int r0;
            if ((r2 & 1) == 1) {
                drawerLayout = DrawerLayout.this;
                r0 = 3;
            } else {
                drawerLayout = DrawerLayout.this;
                r0 = 5;
            }
            View viewN = drawerLayout.n(r0);
            if (viewN == null || DrawerLayout.this.r(viewN) != 0) {
                return;
            }
            this.f421b.d(viewN, r3);
        }

        @Override // b.k.c.c.AbstractC0082c
        public boolean g(int r1) {
            return false;
        }

        @Override // b.k.c.c.AbstractC0082c
        public void h(int r3, int r4) {
            DrawerLayout.this.postDelayed(this.f422c, 160L);
        }

        @Override // b.k.c.c.AbstractC0082c
        public void i(View view, int r2) {
            ((e) view.getLayoutParams()).f419c = false;
            n();
        }

        @Override // b.k.c.c.AbstractC0082c
        public void j(int r4) {
            DrawerLayout.this.a0(this.f420a, r4, this.f421b.z());
        }

        @Override // b.k.c.c.AbstractC0082c
        public void k(View view, int r2, int r3, int r4, int r5) {
            float width = (DrawerLayout.this.c(view, 3) ? r2 + r3 : DrawerLayout.this.getWidth() - r2) / view.getWidth();
            DrawerLayout.this.Y(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // b.k.c.c.AbstractC0082c
        public void l(View view, float f, float f2) {
            int r7;
            float fU = DrawerLayout.this.u(view);
            int width = view.getWidth();
            if (DrawerLayout.this.c(view, 3)) {
                r7 = (f > 0.0f || (f == 0.0f && fU > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && fU > 0.5f)) {
                    width2 -= width;
                }
                r7 = width2;
            }
            this.f421b.T(r7, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // b.k.c.c.AbstractC0082c
        public boolean m(View view, int r3) {
            if (DrawerLayout.this.E(view) && DrawerLayout.this.c(view, this.f420a) && DrawerLayout.this.r(view) == 0) {
                return DrawerLayout.g0;
            }
            return false;
        }

        void o() {
            View viewN;
            int width;
            int r0 = this.f421b.A();
            boolean z = this.f420a == 3 ? DrawerLayout.g0 : false;
            if (z) {
                viewN = DrawerLayout.this.n(3);
                width = (viewN != null ? -viewN.getWidth() : 0) + r0;
            } else {
                viewN = DrawerLayout.this.n(5);
                width = DrawerLayout.this.getWidth() - r0;
            }
            if (viewN != null) {
                if (((!z || viewN.getLeft() >= width) && (z || viewN.getLeft() <= width)) || DrawerLayout.this.r(viewN) != 0) {
                    return;
                }
                e eVar = (e) viewN.getLayoutParams();
                this.f421b.V(viewN, width, viewN.getTop());
                eVar.f419c = DrawerLayout.g0;
                DrawerLayout.this.invalidate();
                n();
                DrawerLayout.this.b();
            }
        }

        public void p() {
            DrawerLayout.this.removeCallbacks(this.f422c);
        }

        public void q(b.k.c.c cVar) {
            this.f421b = cVar;
        }
    }

    static {
        boolean z = g0;
        P = new int[]{R.attr.colorPrimaryDark};
        i0 = new int[]{R.attr.layout_gravity};
        j0 = Build.VERSION.SDK_INT >= 19 ? g0 : false;
        if (Build.VERSION.SDK_INT < 21) {
            z = false;
        }
        k0 = z;
    }

    public DrawerLayout(@h0 Context context) {
        this(context, null);
    }

    public DrawerLayout(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(@h0 Context context, @i0 AttributeSet attributeSet, int r8) {
        super(context, attributeSet, r8);
        this.d = new c();
        this.g = c0;
        this.i = new Paint();
        this.p = g0;
        this.q = 3;
        this.r = 3;
        this.s = 3;
        this.t = 3;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.f = (int) ((64.0f * f2) + 0.5f);
        float f3 = 400.0f * f2;
        this.l = new h(3);
        this.m = new h(5);
        b.k.c.c cVarP = b.k.c.c.p(this, 1.0f, this.l);
        this.j = cVarP;
        cVarP.R(1);
        this.j.S(f3);
        this.l.q(this.j);
        b.k.c.c cVarP2 = b.k.c.c.p(this, 1.0f, this.m);
        this.k = cVarP2;
        cVarP2.R(2);
        this.k.S(f3);
        this.m.q(this.k);
        setFocusableInTouchMode(g0);
        f0.K1(this, 1);
        f0.u1(this, new b());
        setMotionEventSplittingEnabled(false);
        if (f0.R(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new a());
                setSystemUiVisibility(1280);
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(P);
                try {
                    this.A = typedArrayObtainStyledAttributes.getDrawable(0);
                } finally {
                    typedArrayObtainStyledAttributes.recycle();
                }
            } else {
                this.A = null;
            }
        }
        this.e = f2 * 10.0f;
        this.L = new ArrayList<>();
    }

    static boolean A(View view) {
        if (f0.S(view) == 4 || f0.S(view) == 2) {
            return false;
        }
        return g0;
    }

    private boolean H(float f2, float f3, View view) {
        if (this.M == null) {
            this.M = new Rect();
        }
        view.getHitRect(this.M);
        return this.M.contains((int) f2, (int) f3);
    }

    private boolean I(Drawable drawable, int r3) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (drawable == null || !androidx.core.graphics.drawable.a.h(drawable)) {
            return false;
        }
        androidx.core.graphics.drawable.a.m(drawable, r3);
        return g0;
    }

    private Drawable P() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int r0 = f0.W(this);
        if (r0 == 0) {
            Drawable drawable = this.H;
            if (drawable != null) {
                I(drawable, r0);
                return this.H;
            }
        } else {
            Drawable drawable2 = this.I;
            if (drawable2 != null) {
                I(drawable2, r0);
                return this.I;
            }
        }
        return this.J;
    }

    private Drawable Q() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int r0 = f0.W(this);
        if (r0 == 0) {
            Drawable drawable = this.I;
            if (drawable != null) {
                I(drawable, r0);
                return this.I;
            }
        } else {
            Drawable drawable2 = this.H;
            if (drawable2 != null) {
                I(drawable2, r0);
                return this.H;
            }
        }
        return this.K;
    }

    private void R() {
        if (k0) {
            return;
        }
        this.B = P();
        this.C = Q();
    }

    private void Z(View view, boolean z) {
        int childCount = getChildCount();
        for (int r1 = 0; r1 < childCount; r1++) {
            View childAt = getChildAt(r1);
            f0.K1(childAt, ((z || E(childAt)) && !(z && childAt == view)) ? 4 : 1);
        }
    }

    private boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent motionEventV = v(motionEvent, view);
            boolean zDispatchGenericMotionEvent = view.dispatchGenericMotionEvent(motionEventV);
            motionEventV.recycle();
            return zDispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean zDispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return zDispatchGenericMotionEvent2;
    }

    private MotionEvent v(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.N == null) {
                this.N = new Matrix();
            }
            matrix.invert(this.N);
            motionEventObtain.transform(this.N);
        }
        return motionEventObtain;
    }

    static String w(int r2) {
        return (r2 & 3) == 3 ? "LEFT" : (r2 & 5) == 5 ? "RIGHT" : Integer.toHexString(r2);
    }

    private static boolean x(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return g0;
    }

    private boolean y() {
        int childCount = getChildCount();
        for (int r2 = 0; r2 < childCount; r2++) {
            if (((e) getChildAt(r2).getLayoutParams()).f419c) {
                return g0;
            }
        }
        return false;
    }

    private boolean z() {
        if (p() != null) {
            return g0;
        }
        return false;
    }

    boolean B(View view) {
        if (((e) view.getLayoutParams()).f417a == 0) {
            return g0;
        }
        return false;
    }

    public boolean C(int r1) {
        View viewN = n(r1);
        if (viewN != null) {
            return D(viewN);
        }
        return false;
    }

    public boolean D(@h0 View view) {
        if (E(view)) {
            if ((((e) view.getLayoutParams()).d & 1) == 1) {
                return g0;
            }
            return false;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    boolean E(View view) {
        int r3 = b.i.p.h.d(((e) view.getLayoutParams()).f417a, f0.W(view));
        if ((r3 & 3) == 0 && (r3 & 5) == 0) {
            return false;
        }
        return g0;
    }

    public boolean F(int r1) {
        View viewN = n(r1);
        if (viewN != null) {
            return G(viewN);
        }
        return false;
    }

    public boolean G(@h0 View view) {
        if (E(view)) {
            if (((e) view.getLayoutParams()).f418b > 0.0f) {
                return g0;
            }
            return false;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    void J(View view, float f2) {
        float fU = u(view);
        float width = view.getWidth();
        int r1 = ((int) (width * f2)) - ((int) (fU * width));
        if (!c(view, 3)) {
            r1 = -r1;
        }
        view.offsetLeftAndRight(r1);
        Y(view, f2);
    }

    public void K(int r2) {
        L(r2, g0);
    }

    public void L(int r3, boolean z) {
        View viewN = n(r3);
        if (viewN != null) {
            N(viewN, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(r3));
    }

    public void M(@h0 View view) {
        N(view, g0);
    }

    public void N(@h0 View view, boolean z) {
        if (!E(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        e eVar = (e) view.getLayoutParams();
        if (this.p) {
            eVar.f418b = 1.0f;
            eVar.d = 1;
            Z(view, g0);
        } else if (z) {
            eVar.d |= 2;
            if (c(view, 3)) {
                this.j.V(view, 0, view.getTop());
            } else {
                this.k.V(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            J(view, 1.0f);
            a0(eVar.f417a, 0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void O(@h0 d dVar) {
        List<d> list;
        if (dVar == null || (list = this.x) == null) {
            return;
        }
        list.remove(dVar);
    }

    @p0({p0.a.LIBRARY_GROUP})
    public void S(Object obj, boolean z) {
        this.F = obj;
        this.G = z;
        setWillNotDraw((z || getBackground() != null) ? false : g0);
        requestLayout();
    }

    public void T(int r4, int r5) {
        View viewN;
        int r0 = b.i.p.h.d(r5, f0.W(this));
        if (r5 == 3) {
            this.q = r4;
        } else if (r5 == 5) {
            this.r = r4;
        } else if (r5 == 8388611) {
            this.s = r4;
        } else if (r5 == 8388613) {
            this.t = r4;
        }
        if (r4 != 0) {
            (r0 == 3 ? this.j : this.k).c();
        }
        if (r4 != 1) {
            if (r4 == 2 && (viewN = n(r0)) != null) {
                M(viewN);
                return;
            }
            return;
        }
        View viewN2 = n(r0);
        if (viewN2 != null) {
            f(viewN2);
        }
    }

    public void U(int r3, @h0 View view) {
        if (E(view)) {
            T(r3, ((e) view.getLayoutParams()).f417a);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }

    public void V(@q int r2, int r3) {
        W(b.i.c.c.h(getContext(), r2), r3);
    }

    public void W(Drawable drawable, int r4) {
        if (k0) {
            return;
        }
        if ((r4 & b.i.p.h.f1198b) == 8388611) {
            this.H = drawable;
        } else if ((r4 & b.i.p.h.f1199c) == 8388613) {
            this.I = drawable;
        } else if ((r4 & 3) == 3) {
            this.J = drawable;
        } else if ((r4 & 5) != 5) {
            return;
        } else {
            this.K = drawable;
        }
        R();
        invalidate();
    }

    public void X(int r2, @i0 CharSequence charSequence) {
        int r22 = b.i.p.h.d(r2, f0.W(this));
        if (r22 == 3) {
            this.D = charSequence;
        } else if (r22 == 5) {
            this.E = charSequence;
        }
    }

    void Y(View view, float f2) {
        e eVar = (e) view.getLayoutParams();
        if (f2 == eVar.f418b) {
            return;
        }
        eVar.f418b = f2;
        l(view, f2);
    }

    public void a(@h0 d dVar) {
        if (dVar == null) {
            return;
        }
        if (this.x == null) {
            this.x = new ArrayList();
        }
        this.x.add(dVar);
    }

    void a0(int r4, int r5, View view) {
        int r42 = this.j.E();
        int r0 = this.k.E();
        int r1 = 2;
        if (r42 == 1 || r0 == 1) {
            r1 = 1;
        } else if (r42 != 2 && r0 != 2) {
            r1 = 0;
        }
        if (view != null && r5 == 0) {
            float f2 = ((e) view.getLayoutParams()).f418b;
            if (f2 == 0.0f) {
                j(view);
            } else if (f2 == 1.0f) {
                k(view);
            }
        }
        if (r1 != this.n) {
            this.n = r1;
            List<d> list = this.x;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.x.get(size).a(r1);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int r8, int r9) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int r2 = 0; r2 < childCount; r2++) {
            View childAt = getChildAt(r2);
            if (!E(childAt)) {
                this.L.add(childAt);
            } else if (D(childAt)) {
                childAt.addFocusables(arrayList, r8, r9);
                z = g0;
            }
        }
        if (!z) {
            int size = this.L.size();
            for (int r1 = 0; r1 < size; r1++) {
                View view = this.L.get(r1);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, r8, r9);
                }
            }
        }
        this.L.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int r2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, r2, layoutParams);
        f0.K1(view, (o() != null || E(view)) ? 4 : 1);
        if (j0) {
            return;
        }
        f0.u1(view, this.d);
    }

    void b() {
        if (this.v) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int r2 = 0; r2 < childCount; r2++) {
            getChildAt(r2).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.v = g0;
    }

    boolean c(View view, int r2) {
        if ((t(view) & r2) == r2) {
            return g0;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof e) && super.checkLayoutParams(layoutParams)) {
            return g0;
        }
        return false;
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int r2 = 0; r2 < childCount; r2++) {
            fMax = Math.max(fMax, ((e) getChildAt(r2).getLayoutParams()).f418b);
        }
        this.h = fMax;
        boolean zO = this.j.o(g0);
        boolean zO2 = this.k.o(g0);
        if (zO || zO2) {
            f0.g1(this);
        }
    }

    public void d(int r2) {
        e(r2, g0);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.h <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int r0 = childCount - 1; r0 >= 0; r0--) {
            View childAt = getChildAt(r0);
            if (H(x, y, childAt) && !B(childAt) && m(motionEvent, childAt)) {
                return g0;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        Drawable drawable;
        int height = getHeight();
        boolean zB = B(view);
        int width = getWidth();
        int r6 = canvas.save();
        int r8 = 0;
        if (zB) {
            int childCount = getChildCount();
            int r11 = 0;
            for (int r10 = 0; r10 < childCount; r10++) {
                View childAt = getChildAt(r10);
                if (childAt != view && childAt.getVisibility() == 0 && x(childAt) && E(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > r11) {
                            r11 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(r11, 0, width, getHeight());
            r8 = r11;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(r6);
        float f2 = this.h;
        if (f2 <= 0.0f || !zB) {
            if (this.B != null && c(view, 3)) {
                int intrinsicWidth = this.B.getIntrinsicWidth();
                int right2 = view.getRight();
                float fMax = Math.max(0.0f, Math.min(right2 / this.j.A(), 1.0f));
                this.B.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
                this.B.setAlpha((int) (fMax * 255.0f));
                drawable = this.B;
            } else if (this.C != null && c(view, 5)) {
                int intrinsicWidth2 = this.C.getIntrinsicWidth();
                int left2 = view.getLeft();
                float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.k.A(), 1.0f));
                this.C.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
                this.C.setAlpha((int) (fMax2 * 255.0f));
                drawable = this.C;
            }
            drawable.draw(canvas);
        } else {
            this.i.setColor((this.g & f0.s) | (((int) ((((-16777216) & r2) >>> 24) * f2)) << 24));
            canvas.drawRect(r8, 0.0f, width, getHeight(), this.i);
        }
        return zDrawChild;
    }

    public void e(int r3, boolean z) {
        View viewN = n(r3);
        if (viewN != null) {
            g(viewN, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(r3));
    }

    public void f(@h0 View view) {
        g(view, g0);
    }

    public void g(@h0 View view, boolean z) {
        b.k.c.c cVar;
        int width;
        if (!E(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        e eVar = (e) view.getLayoutParams();
        if (this.p) {
            eVar.f418b = 0.0f;
            eVar.d = 0;
        } else if (z) {
            eVar.d |= 4;
            if (c(view, 3)) {
                cVar = this.j;
                width = -view.getWidth();
            } else {
                cVar = this.k;
                width = getWidth();
            }
            cVar.V(view, width, view.getTop());
        } else {
            J(view, 0.0f);
            a0(eVar.f417a, 0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public float getDrawerElevation() {
        if (k0) {
            return this.e;
        }
        return 0.0f;
    }

    @i0
    public Drawable getStatusBarBackgroundDrawable() {
        return this.A;
    }

    public void h() {
        i(false);
    }

    void i(boolean z) {
        int childCount = getChildCount();
        boolean zV = false;
        for (int r2 = 0; r2 < childCount; r2++) {
            View childAt = getChildAt(r2);
            e eVar = (e) childAt.getLayoutParams();
            if (E(childAt) && (!z || eVar.f419c)) {
                zV |= c(childAt, 3) ? this.j.V(childAt, -childAt.getWidth(), childAt.getTop()) : this.k.V(childAt, getWidth(), childAt.getTop());
                eVar.f419c = false;
            }
        }
        this.l.p();
        this.m.p();
        if (zV) {
            invalidate();
        }
    }

    void j(View view) {
        View rootView;
        e eVar = (e) view.getLayoutParams();
        if ((eVar.d & 1) == 1) {
            eVar.d = 0;
            List<d> list = this.x;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.x.get(size).d(view);
                }
            }
            Z(view, false);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    void k(View view) {
        e eVar = (e) view.getLayoutParams();
        if ((eVar.d & 1) == 0) {
            eVar.d = 1;
            List<d> list = this.x;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.x.get(size).c(view);
                }
            }
            Z(view, g0);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    void l(View view, float f2) {
        List<d> list = this.x;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.x.get(size).b(view, f2);
            }
        }
    }

    View n(int r5) {
        int r52 = b.i.p.h.d(r5, f0.W(this)) & 7;
        int childCount = getChildCount();
        for (int r1 = 0; r1 < childCount; r1++) {
            View childAt = getChildAt(r1);
            if ((t(childAt) & 7) == r52) {
                return childAt;
            }
        }
        return null;
    }

    View o() {
        int childCount = getChildCount();
        for (int r1 = 0; r1 < childCount; r1++) {
            View childAt = getChildAt(r1);
            if ((((e) childAt.getLayoutParams()).d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.p = g0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.p = g0;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object obj;
        super.onDraw(canvas);
        if (!this.G || this.A == null) {
            return;
        }
        int systemWindowInsetTop = (Build.VERSION.SDK_INT < 21 || (obj = this.F) == null) ? 0 : ((WindowInsets) obj).getSystemWindowInsetTop();
        if (systemWindowInsetTop > 0) {
            this.A.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.A.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            b.k.c.c r1 = r6.j
            boolean r1 = r1.U(r7)
            b.k.c.c r2 = r6.k
            boolean r2 = r2.U(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L38
        L1e:
            b.k.c.c r7 = r6.j
            boolean r7 = r7.f(r4)
            if (r7 == 0) goto L38
            androidx.drawerlayout.widget.DrawerLayout$h r7 = r6.l
            r7.p()
            androidx.drawerlayout.widget.DrawerLayout$h r7 = r6.m
            r7.p()
            goto L38
        L31:
            r6.i(r2)
            r6.u = r3
            r6.v = r3
        L38:
            r7 = 0
            goto L64
        L3a:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.y = r0
            r6.z = r7
            float r4 = r6.h
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5f
            b.k.c.c r4 = r6.j
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.v(r0, r7)
            if (r7 == 0) goto L5f
            boolean r7 = r6.B(r7)
            if (r7 == 0) goto L5f
            r7 = 1
            goto L60
        L5f:
            r7 = 0
        L60:
            r6.u = r3
            r6.v = r3
        L64:
            if (r1 != 0) goto L74
            if (r7 != 0) goto L74
            boolean r7 = r6.y()
            if (r7 != 0) goto L74
            boolean r7 = r6.v
            if (r7 == 0) goto L73
            goto L74
        L73:
            r2 = 0
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r2, KeyEvent keyEvent) {
        if (r2 != 4 || !z()) {
            return super.onKeyDown(r2, keyEvent);
        }
        keyEvent.startTracking();
        return g0;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int r2, KeyEvent keyEvent) {
        if (r2 != 4) {
            return super.onKeyUp(r2, keyEvent);
        }
        View viewP = p();
        if (viewP != null && r(viewP) == 0) {
            h();
        }
        if (viewP != null) {
            return g0;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int r18, int r19, int r20, int r21) {
        float f2;
        int r10;
        int measuredHeight;
        int r8;
        int r9;
        this.o = g0;
        int r2 = r20 - r18;
        int childCount = getChildCount();
        for (int r5 = 0; r5 < childCount; r5++) {
            View childAt = getChildAt(r5);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (B(childAt)) {
                    int r82 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                    childAt.layout(r82, ((ViewGroup.MarginLayoutParams) eVar).topMargin, childAt.getMeasuredWidth() + r82, ((ViewGroup.MarginLayoutParams) eVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f3 = measuredWidth;
                        r10 = (-measuredWidth) + ((int) (eVar.f418b * f3));
                        f2 = (measuredWidth + r10) / f3;
                    } else {
                        float f4 = measuredWidth;
                        f2 = (r2 - r11) / f4;
                        r10 = r2 - ((int) (eVar.f418b * f4));
                    }
                    boolean z2 = f2 != eVar.f418b ? g0 : false;
                    int r13 = eVar.f417a & 112;
                    if (r13 != 16) {
                        if (r13 != 80) {
                            measuredHeight = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                            r8 = measuredWidth + r10;
                            r9 = measuredHeight2 + measuredHeight;
                        } else {
                            int r92 = r21 - r19;
                            measuredHeight = (r92 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - childAt.getMeasuredHeight();
                            r8 = measuredWidth + r10;
                            r9 = r92 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                        }
                        childAt.layout(r10, measuredHeight, r8, r9);
                    } else {
                        int r132 = r21 - r19;
                        int r14 = (r132 - measuredHeight2) / 2;
                        int r15 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        if (r14 < r15) {
                            r14 = r15;
                        } else {
                            int r152 = r14 + measuredHeight2;
                            int r1 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                            if (r152 > r132 - r1) {
                                r14 = (r132 - r1) - measuredHeight2;
                            }
                        }
                        childAt.layout(r10, r14, measuredWidth + r10, measuredHeight2 + r14);
                    }
                    if (z2) {
                        Y(childAt, f2);
                    }
                    int r12 = eVar.f418b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != r12) {
                        childAt.setVisibility(r12);
                    }
                }
            }
        }
        this.o = false;
        this.p = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    protected void onMeasure(int r18, int r19) {
        int mode = View.MeasureSpec.getMode(r18);
        int mode2 = View.MeasureSpec.getMode(r19);
        int size = View.MeasureSpec.getSize(r18);
        int size2 = View.MeasureSpec.getSize(r19);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
            if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        int r5 = 0;
        boolean z = (this.F == null || !f0.R(this)) ? false : g0;
        int r7 = f0.W(this);
        int childCount = getChildCount();
        int r9 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (r9 < childCount) {
            View childAt = getChildAt(r9);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (z) {
                    int r15 = b.i.p.h.d(eVar.f417a, r7);
                    boolean zR = f0.R(childAt);
                    int r2 = Build.VERSION.SDK_INT;
                    if (zR) {
                        if (r2 >= 21) {
                            WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.F;
                            if (r15 == 3) {
                                windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), r5, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                            } else if (r15 == 5) {
                                windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(r5, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                        }
                    } else if (r2 >= 21) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.F;
                        if (r15 == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), r5, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (r15 == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(r5, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) eVar).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) eVar).leftMargin) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) eVar).topMargin) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, 1073741824));
                } else {
                    if (!E(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + r9 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (k0) {
                        float fP = f0.P(childAt);
                        float f2 = this.e;
                        if (fP != f2) {
                            f0.G1(childAt, f2);
                        }
                    }
                    int r22 = t(childAt) & 7;
                    boolean z4 = r22 == 3 ? g0 : false;
                    if ((z4 && z2) || (!z4 && z3)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + w(r22) + " but this " + O + " already has a drawer view along that edge");
                    }
                    if (z4) {
                        z2 = g0;
                    } else {
                        z3 = g0;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(r18, this.f + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin, ((ViewGroup.MarginLayoutParams) eVar).width), ViewGroup.getChildMeasureSpec(r19, ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, ((ViewGroup.MarginLayoutParams) eVar).height));
                }
            }
            r9++;
            r5 = 0;
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View viewN;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.a());
        int r0 = fVar.f;
        if (r0 != 0 && (viewN = n(r0)) != null) {
            M(viewN);
        }
        int r02 = fVar.g;
        if (r02 != 3) {
            T(r02, 3);
        }
        int r03 = fVar.h;
        if (r03 != 3) {
            T(r03, 5);
        }
        int r04 = fVar.i;
        if (r04 != 3) {
            T(r04, b.i.p.h.f1198b);
        }
        int r4 = fVar.j;
        if (r4 != 3) {
            T(r4, b.i.p.h.f1199c);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int r1) {
        R();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int r3 = 0; r3 < childCount; r3++) {
            e eVar = (e) getChildAt(r3).getLayoutParams();
            int r5 = eVar.d;
            boolean z = g0;
            boolean z2 = r5 == 1 ? g0 : false;
            if (eVar.d != 2) {
                z = false;
            }
            if (z2 || z) {
                fVar.f = eVar.f417a;
                break;
            }
        }
        fVar.g = this.q;
        fVar.h = this.r;
        fVar.i = this.s;
        fVar.j = this.t;
        return fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            b.k.c.c r0 = r6.j
            r0.L(r7)
            b.k.c.c r0 = r6.k
            r0.L(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L65
            if (r0 == r1) goto L1e
            r7 = 3
            if (r0 == r7) goto L1a
            goto L75
        L1a:
            r6.i(r1)
            goto L71
        L1e:
            float r0 = r7.getX()
            float r7 = r7.getY()
            b.k.c.c r3 = r6.j
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.v(r4, r5)
            if (r3 == 0) goto L5e
            boolean r3 = r6.B(r3)
            if (r3 == 0) goto L5e
            float r3 = r6.y
            float r0 = r0 - r3
            float r3 = r6.z
            float r7 = r7 - r3
            b.k.c.c r3 = r6.j
            int r3 = r3.D()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5e
            android.view.View r7 = r6.o()
            if (r7 == 0) goto L5e
            int r7 = r6.r(r7)
            r0 = 2
            if (r7 != r0) goto L5c
            goto L5e
        L5c:
            r7 = 0
            goto L5f
        L5e:
            r7 = 1
        L5f:
            r6.i(r7)
            r6.u = r2
            goto L75
        L65:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.y = r0
            r6.z = r7
        L71:
            r6.u = r2
            r6.v = r2
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    View p() {
        int childCount = getChildCount();
        for (int r1 = 0; r1 < childCount; r1++) {
            View childAt = getChildAt(r1);
            if (E(childAt) && G(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int q(int r4) {
        int r0 = f0.W(this);
        if (r4 == 3) {
            int r42 = this.q;
            if (r42 != 3) {
                return r42;
            }
            int r43 = r0 == 0 ? this.s : this.t;
            if (r43 != 3) {
                return r43;
            }
            return 0;
        }
        if (r4 == 5) {
            int r44 = this.r;
            if (r44 != 3) {
                return r44;
            }
            int r45 = r0 == 0 ? this.t : this.s;
            if (r45 != 3) {
                return r45;
            }
            return 0;
        }
        if (r4 == 8388611) {
            int r46 = this.s;
            if (r46 != 3) {
                return r46;
            }
            int r47 = r0 == 0 ? this.q : this.r;
            if (r47 != 3) {
                return r47;
            }
            return 0;
        }
        if (r4 != 8388613) {
            return 0;
        }
        int r48 = this.t;
        if (r48 != 3) {
            return r48;
        }
        int r49 = r0 == 0 ? this.r : this.q;
        if (r49 != 3) {
            return r49;
        }
        return 0;
    }

    public int r(@h0 View view) {
        if (E(view)) {
            return q(((e) view.getLayoutParams()).f417a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.u = z;
        if (z) {
            i(g0);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.o) {
            return;
        }
        super.requestLayout();
    }

    @i0
    public CharSequence s(int r2) {
        int r22 = b.i.p.h.d(r2, f0.W(this));
        if (r22 == 3) {
            return this.D;
        }
        if (r22 == 5) {
            return this.E;
        }
        return null;
    }

    public void setDrawerElevation(float f2) {
        this.e = f2;
        for (int r3 = 0; r3 < getChildCount(); r3++) {
            View childAt = getChildAt(r3);
            if (E(childAt)) {
                f0.G1(childAt, this.e);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(d dVar) {
        d dVar2 = this.w;
        if (dVar2 != null) {
            O(dVar2);
        }
        if (dVar != null) {
            a(dVar);
        }
        this.w = dVar;
    }

    public void setDrawerLockMode(int r2) {
        T(r2, 3);
        T(r2, 5);
    }

    public void setScrimColor(@k int r1) {
        this.g = r1;
        invalidate();
    }

    public void setStatusBarBackground(int r2) {
        this.A = r2 != 0 ? b.i.c.c.h(getContext(), r2) : null;
        invalidate();
    }

    public void setStatusBarBackground(@i0 Drawable drawable) {
        this.A = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@k int r2) {
        this.A = new ColorDrawable(r2);
        invalidate();
    }

    int t(View view) {
        return b.i.p.h.d(((e) view.getLayoutParams()).f417a, f0.W(this));
    }

    float u(View view) {
        return ((e) view.getLayoutParams()).f418b;
    }
}

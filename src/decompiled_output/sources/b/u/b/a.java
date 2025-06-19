package b.u.b;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import androidx.annotation.k0;
import androidx.annotation.q;
import b.i.p.f0;
import b.k.c.c;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a extends ViewGroup {
    private static final String A = "SlidingPaneLayout";
    private static final int B = 32;
    private static final int C = -858993460;
    private static final int D = 400;
    private int d;
    private int e;
    private Drawable f;
    private Drawable g;
    private final int h;
    private boolean i;
    View j;
    float k;
    private float l;
    int m;
    boolean n;
    private int o;
    private float p;
    private float q;
    private e r;
    final b.k.c.c s;
    boolean t;
    private boolean u;
    private final Rect v;
    final ArrayList<b> w;
    private Method x;
    private Field y;
    private boolean z;

    /* renamed from: b.u.b.a$a, reason: collision with other inner class name */
    class C0100a extends b.i.p.a {
        private final Rect d = new Rect();

        C0100a() {
        }

        private void n(b.i.p.p0.d dVar, b.i.p.p0.d dVar2) {
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
            dVar.s1(dVar2.K());
        }

        @Override // b.i.p.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(a.class.getName());
        }

        @Override // b.i.p.a
        public void g(View view, b.i.p.p0.d dVar) {
            b.i.p.p0.d dVarD0 = b.i.p.p0.d.D0(dVar);
            super.g(view, dVarD0);
            n(dVar, dVarD0);
            dVarD0.G0();
            dVar.T0(a.class.getName());
            dVar.F1(view);
            Object objI0 = f0.i0(view);
            if (objI0 instanceof View) {
                dVar.w1((View) objI0);
            }
            int childCount = a.this.getChildCount();
            for (int r0 = 0; r0 < childCount; r0++) {
                View childAt = a.this.getChildAt(r0);
                if (!o(childAt) && childAt.getVisibility() == 0) {
                    f0.K1(childAt, 1);
                    dVar.c(childAt);
                }
            }
        }

        @Override // b.i.p.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (o(view)) {
                return false;
            }
            return super.i(viewGroup, view, accessibilityEvent);
        }

        public boolean o(View view) {
            return a.this.j(view);
        }
    }

    private class b implements Runnable {
        final View d;

        b(View view) {
            this.d = view;
        }

        @Override // java.lang.Runnable
        public void run() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException, InvocationTargetException {
            if (this.d.getParent() == a.this) {
                this.d.setLayerType(0, null);
                a.this.i(this.d);
            }
            a.this.w.remove(this);
        }
    }

    private class c extends c.AbstractC0082c {
        c() {
        }

        @Override // b.k.c.c.AbstractC0082c
        public int a(View view, int r3, int r4) {
            d dVar = (d) a.this.j.getLayoutParams();
            if (a.this.k()) {
                int width = a.this.getWidth() - ((a.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) dVar).rightMargin) + a.this.j.getWidth());
                return Math.max(Math.min(r3, width), width - a.this.m);
            }
            int paddingLeft = a.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
            return Math.min(Math.max(r3, paddingLeft), a.this.m + paddingLeft);
        }

        @Override // b.k.c.c.AbstractC0082c
        public int b(View view, int r2, int r3) {
            return view.getTop();
        }

        @Override // b.k.c.c.AbstractC0082c
        public int d(View view) {
            return a.this.m;
        }

        @Override // b.k.c.c.AbstractC0082c
        public void f(int r2, int r3) {
            a aVar = a.this;
            aVar.s.d(aVar.j, r3);
        }

        @Override // b.k.c.c.AbstractC0082c
        public void i(View view, int r2) {
            a.this.r();
        }

        @Override // b.k.c.c.AbstractC0082c
        public void j(int r3) {
            a aVar;
            boolean z;
            if (a.this.s.E() == 0) {
                a aVar2 = a.this;
                if (aVar2.k == 0.0f) {
                    aVar2.v(aVar2.j);
                    a aVar3 = a.this;
                    aVar3.f(aVar3.j);
                    aVar = a.this;
                    z = false;
                } else {
                    aVar2.g(aVar2.j);
                    aVar = a.this;
                    z = true;
                }
                aVar.t = z;
            }
        }

        @Override // b.k.c.c.AbstractC0082c
        public void k(View view, int r2, int r3, int r4, int r5) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException, InvocationTargetException {
            a.this.n(r2);
            a.this.invalidate();
        }

        @Override // b.k.c.c.AbstractC0082c
        public void l(View view, float f, float f2) {
            int paddingLeft;
            d dVar = (d) view.getLayoutParams();
            if (a.this.k()) {
                int paddingRight = a.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
                if (f < 0.0f || (f == 0.0f && a.this.k > 0.5f)) {
                    paddingRight += a.this.m;
                }
                paddingLeft = (a.this.getWidth() - paddingRight) - a.this.j.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) dVar).leftMargin + a.this.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && a.this.k > 0.5f)) {
                    paddingLeft += a.this.m;
                }
            }
            a.this.s.T(paddingLeft, view.getTop());
            a.this.invalidate();
        }

        @Override // b.k.c.c.AbstractC0082c
        public boolean m(View view, int r2) {
            if (a.this.n) {
                return false;
            }
            return ((d) view.getLayoutParams()).f1365b;
        }
    }

    public static class d extends ViewGroup.MarginLayoutParams {
        private static final int[] e = {R.attr.layout_weight};

        /* renamed from: a, reason: collision with root package name */
        public float f1364a;

        /* renamed from: b, reason: collision with root package name */
        boolean f1365b;

        /* renamed from: c, reason: collision with root package name */
        boolean f1366c;
        Paint d;

        public d() {
            super(-1, -1);
            this.f1364a = 0.0f;
        }

        public d(int r1, int r2) {
            super(r1, r2);
            this.f1364a = 0.0f;
        }

        public d(@h0 Context context, @i0 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1364a = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e);
            this.f1364a = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }

        public d(@h0 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1364a = 0.0f;
        }

        public d(@h0 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1364a = 0.0f;
        }

        public d(@h0 d dVar) {
            super((ViewGroup.MarginLayoutParams) dVar);
            this.f1364a = 0.0f;
            this.f1364a = dVar.f1364a;
        }
    }

    public interface e {
        void a(@h0 View view, float f);

        void b(@h0 View view);

        void c(@h0 View view);
    }

    static class f extends b.k.b.a {
        public static final Parcelable.Creator<f> CREATOR = new C0101a();
        boolean f;

        /* renamed from: b.u.b.a$f$a, reason: collision with other inner class name */
        static class C0101a implements Parcelable.ClassLoaderCreator<f> {
            C0101a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int r1) {
                return new f[r1];
            }
        }

        f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f = parcel.readInt() != 0;
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // b.k.b.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int r2) {
            super.writeToParcel(parcel, r2);
            parcel.writeInt(this.f ? 1 : 0);
        }
    }

    public static class g implements e {
        @Override // b.u.b.a.e
        public void a(View view, float f) {
        }

        @Override // b.u.b.a.e
        public void b(View view) {
        }

        @Override // b.u.b.a.e
        public void c(View view) {
        }
    }

    public a(@h0 Context context) {
        this(context, null);
    }

    public a(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(@h0 Context context, @i0 AttributeSet attributeSet, int r4) {
        super(context, attributeSet, r4);
        this.d = C;
        this.u = true;
        this.v = new Rect();
        this.w = new ArrayList<>();
        float f2 = context.getResources().getDisplayMetrics().density;
        this.h = (int) ((32.0f * f2) + 0.5f);
        setWillNotDraw(false);
        f0.u1(this, new C0100a());
        f0.K1(this, 1);
        b.k.c.c cVarP = b.k.c.c.p(this, 0.5f, new c());
        this.s = cVarP;
        cVarP.S(f2 * 400.0f);
    }

    private boolean d(View view, int r3) {
        if (!this.u && !u(0.0f, r3)) {
            return false;
        }
        this.t = false;
        return true;
    }

    private void e(View view, float f2, int r6) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException, InvocationTargetException {
        d dVar = (d) view.getLayoutParams();
        if (f2 > 0.0f && r6 != 0) {
            int r5 = (((int) ((((-16777216) & r6) >>> 24) * f2)) << 24) | (r6 & f0.s);
            if (dVar.d == null) {
                dVar.d = new Paint();
            }
            dVar.d.setColorFilter(new PorterDuffColorFilter(r5, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, dVar.d);
            }
            i(view);
            return;
        }
        if (view.getLayerType() != 0) {
            Paint paint = dVar.d;
            if (paint != null) {
                paint.setColorFilter(null);
            }
            b bVar = new b(view);
            this.w.add(bVar);
            f0.i1(this, bVar);
        }
    }

    private boolean p(View view, int r2) {
        if (!this.u && !u(1.0f, r2)) {
            return false;
        }
        this.t = true;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void q(float r10) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r9 = this;
            boolean r0 = r9.k()
            android.view.View r1 = r9.j
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            b.u.b.a$d r1 = (b.u.b.a.d) r1
            boolean r2 = r1.f1366c
            r3 = 0
            if (r2 == 0) goto L1c
            if (r0 == 0) goto L16
            int r1 = r1.rightMargin
            goto L18
        L16:
            int r1 = r1.leftMargin
        L18:
            if (r1 > 0) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            int r2 = r9.getChildCount()
        L21:
            if (r3 >= r2) goto L59
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.j
            if (r4 != r5) goto L2c
            goto L56
        L2c:
            float r5 = r9.l
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.o
            float r8 = (float) r7
            float r5 = r5 * r8
            int r5 = (int) r5
            r9.l = r10
            float r8 = r6 - r10
            float r7 = (float) r7
            float r8 = r8 * r7
            int r7 = (int) r8
            int r5 = r5 - r7
            if (r0 == 0) goto L44
            int r5 = -r5
        L44:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L56
            float r5 = r9.l
            if (r0 == 0) goto L4f
            float r5 = r5 - r6
            goto L51
        L4f:
            float r5 = r6 - r5
        L51:
            int r6 = r9.e
            r9.e(r4, r5, r6)
        L56:
            int r3 = r3 + 1
            goto L21
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.u.b.a.q(float):void");
    }

    private static boolean w(View view) {
        Drawable background;
        if (view.isOpaque()) {
            return true;
        }
        return Build.VERSION.SDK_INT < 18 && (background = view.getBackground()) != null && background.getOpacity() == -1;
    }

    protected boolean a(View view, boolean z, int r15, int r16, int r17) {
        int r8;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int r6 = r16 + scrollX;
                if (r6 >= childAt.getLeft() && r6 < childAt.getRight() && (r8 = r17 + scrollY) >= childAt.getTop() && r8 < childAt.getBottom() && a(childAt, true, r15, r6 - childAt.getLeft(), r8 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z) {
            if (view.canScrollHorizontally(k() ? r15 : -r15)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public boolean b() {
        return this.i;
    }

    public boolean c() {
        return d(this.j, 0);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.s.o(true)) {
            if (this.i) {
                f0.g1(this);
            } else {
                this.s.a();
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int r4;
        int right;
        super.draw(canvas);
        Drawable drawable = k() ? this.g : this.f;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (k()) {
            right = childAt.getRight();
            r4 = intrinsicWidth + right;
        } else {
            int left = childAt.getLeft();
            int r42 = left - intrinsicWidth;
            r4 = left;
            right = r42;
        }
        drawable.setBounds(right, top, r4, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        d dVar = (d) view.getLayoutParams();
        int r1 = canvas.save();
        if (this.i && !dVar.f1365b && this.j != null) {
            canvas.getClipBounds(this.v);
            if (k()) {
                Rect rect = this.v;
                rect.left = Math.max(rect.left, this.j.getRight());
            } else {
                Rect rect2 = this.v;
                rect2.right = Math.min(rect2.right, this.j.getLeft());
            }
            canvas.clipRect(this.v);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(r1);
        return zDrawChild;
    }

    void f(View view) {
        e eVar = this.r;
        if (eVar != null) {
            eVar.c(view);
        }
        sendAccessibilityEvent(32);
    }

    void g(View view) {
        e eVar = this.r;
        if (eVar != null) {
            eVar.b(view);
        }
        sendAccessibilityEvent(32);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    @k
    public int getCoveredFadeColor() {
        return this.e;
    }

    @k0
    public int getParallaxDistance() {
        return this.o;
    }

    @k
    public int getSliderFadeColor() {
        return this.d;
    }

    void h(View view) {
        e eVar = this.r;
        if (eVar != null) {
            eVar.a(view, this.k);
        }
    }

    void i(View view) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException, InvocationTargetException {
        Field field;
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 17) {
            f0.O1(view, ((d) view.getLayoutParams()).d);
            return;
        }
        if (r0 >= 16) {
            if (!this.z) {
                try {
                    this.x = View.class.getDeclaredMethod("getDisplayList", null);
                } catch (NoSuchMethodException e2) {
                    Log.e(A, "Couldn't fetch getDisplayList method; dimming won't work right.", e2);
                }
                try {
                    Field declaredField = View.class.getDeclaredField("mRecreateDisplayList");
                    this.y = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e3) {
                    Log.e(A, "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", e3);
                }
                this.z = true;
            }
            if (this.x == null || (field = this.y) == null) {
                view.invalidate();
                return;
            }
            try {
                field.setBoolean(view, true);
                this.x.invoke(view, null);
            } catch (Exception e4) {
                Log.e(A, "Error refreshing display list state", e4);
            }
        }
        f0.h1(this, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    boolean j(View view) {
        if (view == null) {
            return false;
        }
        return this.i && ((d) view.getLayoutParams()).f1366c && this.k > 0.0f;
    }

    boolean k() {
        return f0.W(this) == 1;
    }

    public boolean l() {
        return !this.i || this.k == 1.0f;
    }

    public boolean m() {
        return this.i;
    }

    void n(int r5) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException, InvocationTargetException {
        if (this.j == null) {
            this.k = 0.0f;
            return;
        }
        boolean zK = k();
        d dVar = (d) this.j.getLayoutParams();
        int width = this.j.getWidth();
        if (zK) {
            r5 = (getWidth() - r5) - width;
        }
        float paddingRight = (r5 - ((zK ? getPaddingRight() : getPaddingLeft()) + (zK ? ((ViewGroup.MarginLayoutParams) dVar).rightMargin : ((ViewGroup.MarginLayoutParams) dVar).leftMargin))) / this.m;
        this.k = paddingRight;
        if (this.o != 0) {
            q(paddingRight);
        }
        if (dVar.f1366c) {
            e(this.j, this.k, this.d);
        }
        h(this.j);
    }

    public boolean o() {
        return p(this.j, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.u = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException, InvocationTargetException {
        super.onDetachedFromWindow();
        this.u = true;
        int size = this.w.size();
        for (int r1 = 0; r1 < size; r1++) {
            this.w.get(r1).run();
        }
        this.w.clear();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.i && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.t = !this.s.K(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.i || (this.n && actionMasked != 0)) {
            this.s.c();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            this.s.c();
            return false;
        }
        if (actionMasked == 0) {
            this.n = false;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.p = x;
            this.q = y;
            if (this.s.K(this.j, (int) x, (int) y) && j(this.j)) {
                z = true;
            }
            return this.s.U(motionEvent) || z;
        }
        if (actionMasked == 2) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float fAbs = Math.abs(x2 - this.p);
            float fAbs2 = Math.abs(y2 - this.q);
            if (fAbs > this.s.D() && fAbs2 > fAbs) {
                this.s.c();
                this.n = true;
                return false;
            }
        }
        z = false;
        if (this.s.U(motionEvent)) {
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int r20, int r21, int r22, int r23) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException, InvocationTargetException {
        int r2;
        int r24;
        int r25;
        int r8;
        boolean zK = k();
        b.k.c.c cVar = this.s;
        if (zK) {
            cVar.R(2);
        } else {
            cVar.R(1);
        }
        int r3 = r22 - r20;
        int paddingRight = zK ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zK ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.u) {
            this.k = (this.i && this.t) ? 1.0f : 0.0f;
        }
        int r11 = paddingRight;
        for (int r12 = 0; r12 < childCount; r12++) {
            View childAt = getChildAt(r12);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (dVar.f1365b) {
                    int r82 = r3 - paddingLeft;
                    int r10 = (Math.min(paddingRight, r82 - this.h) - r11) - (((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                    this.m = r10;
                    int r26 = zK ? ((ViewGroup.MarginLayoutParams) dVar).rightMargin : ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                    dVar.f1366c = ((r11 + r26) + r10) + (measuredWidth / 2) > r82;
                    int r83 = (int) (r10 * this.k);
                    r11 += r26 + r83;
                    this.k = r83 / this.m;
                    r2 = 0;
                } else if (!this.i || (r24 = this.o) == 0) {
                    r11 = paddingRight;
                    r2 = 0;
                } else {
                    r2 = (int) ((1.0f - this.k) * r24);
                    r11 = paddingRight;
                }
                if (zK) {
                    r8 = (r3 - r11) + r2;
                    r25 = r8 - measuredWidth;
                } else {
                    r25 = r11 - r2;
                    r8 = r25 + measuredWidth;
                }
                childAt.layout(r25, paddingTop, r8, childAt.getMeasuredHeight() + paddingTop);
                paddingRight += childAt.getWidth();
            }
        }
        if (this.u) {
            if (this.i) {
                if (this.o != 0) {
                    q(this.k);
                }
                if (((d) this.j.getLayoutParams()).f1366c) {
                    e(this.j, this.k, this.d);
                }
            } else {
                for (int r1 = 0; r1 < childCount; r1++) {
                    e(getChildAt(r1), 0.0f, this.d);
                }
            }
            v(this.j);
        }
        this.u = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1 A[PHI: r13
  0x00b1: PHI (r13v2 float) = (r13v1 float), (r13v7 float) binds: [B:35:0x00a8, B:37:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r21, int r22) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.u.b.a.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.a());
        if (fVar.f) {
            o();
        } else {
            c();
        }
        this.t = fVar.f;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f = m() ? l() : this.t;
        return fVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        if (r1 != r3) {
            this.u = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.i) {
            return super.onTouchEvent(motionEvent);
        }
        this.s.L(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.p = x;
            this.q = y;
        } else if (actionMasked == 1 && j(this.j)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f2 = x2 - this.p;
            float f3 = y2 - this.q;
            int r4 = this.s.D();
            if ((f2 * f2) + (f3 * f3) < r4 * r4 && this.s.K(this.j, (int) x2, (int) y2)) {
                d(this.j, 0);
            }
        }
        return true;
    }

    void r() {
        int childCount = getChildCount();
        for (int r2 = 0; r2 < childCount; r2++) {
            View childAt = getChildAt(r2);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.i) {
            return;
        }
        this.t = view == this.j;
    }

    @Deprecated
    public void s() {
        c();
    }

    public void setCoveredFadeColor(@k int r1) {
        this.e = r1;
    }

    public void setPanelSlideListener(@i0 e eVar) {
        this.r = eVar;
    }

    public void setParallaxDistance(@k0 int r1) {
        this.o = r1;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@i0 Drawable drawable) {
        this.f = drawable;
    }

    public void setShadowDrawableRight(@i0 Drawable drawable) {
        this.g = drawable;
    }

    @Deprecated
    public void setShadowResource(@q int r2) {
        setShadowDrawable(getResources().getDrawable(r2));
    }

    public void setShadowResourceLeft(int r2) {
        setShadowDrawableLeft(b.i.c.c.h(getContext(), r2));
    }

    public void setShadowResourceRight(int r2) {
        setShadowDrawableRight(b.i.c.c.h(getContext(), r2));
    }

    public void setSliderFadeColor(@k int r1) {
        this.d = r1;
    }

    @Deprecated
    public void t() {
        o();
    }

    boolean u(float f2, int r6) {
        int paddingLeft;
        if (!this.i) {
            return false;
        }
        boolean zK = k();
        d dVar = (d) this.j.getLayoutParams();
        if (zK) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + ((ViewGroup.MarginLayoutParams) dVar).rightMargin) + (f2 * this.m)) + this.j.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + (f2 * this.m));
        }
        b.k.c.c cVar = this.s;
        View view = this.j;
        if (!cVar.V(view, paddingLeft, view.getTop())) {
            return false;
        }
        r();
        f0.g1(this);
        return true;
    }

    void v(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View childAt;
        boolean z;
        View view2 = view;
        boolean zK = k();
        int width = zK ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zK ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !w(view)) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view.getLeft();
            right = view.getRight();
            top = view.getTop();
            bottom = view.getBottom();
        }
        int childCount = getChildCount();
        int r12 = 0;
        while (r12 < childCount && (childAt = getChildAt(r12)) != view2) {
            if (childAt.getVisibility() == 8) {
                z = zK;
            } else {
                z = zK;
                childAt.setVisibility((Math.max(zK ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zK ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            r12++;
            view2 = view;
            zK = z;
        }
    }
}

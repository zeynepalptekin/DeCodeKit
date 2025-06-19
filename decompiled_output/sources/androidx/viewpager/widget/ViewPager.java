package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k0;
import androidx.annotation.q;
import b.i.p.f0;
import b.i.p.o0;
import b.i.p.y;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    private static final int A0 = 2;
    public static final int C0 = 0;
    public static final int D0 = 1;
    public static final int E0 = 2;
    private static final String l0 = "ViewPager";
    private static final boolean m0 = false;
    private static final boolean n0 = false;
    private static final int o0 = 1;
    private static final int p0 = 600;
    private static final int q0 = 25;
    private static final int r0 = 16;
    private static final int s0 = 400;
    private static final int w0 = -1;
    private static final int x0 = 2;
    private static final int y0 = 0;
    private static final int z0 = 1;
    private int A;
    private boolean B;
    private boolean C;
    private int D;
    private int E;
    private int F;
    private float G;
    private float H;
    private float I;
    private float J;
    private int K;
    private VelocityTracker L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private long R;
    private EdgeEffect S;
    private EdgeEffect T;
    private boolean U;
    private boolean V;
    private boolean W;
    private int a0;
    private List<j> b0;
    private j c0;
    private int d;
    private j d0;
    private final ArrayList<f> e;
    private List<i> e0;
    private final f f;
    private k f0;
    private final Rect g;
    private int g0;
    androidx.viewpager.widget.a h;
    private int h0;
    int i;
    private ArrayList<View> i0;
    private int j;
    private final Runnable j0;
    private Parcelable k;
    private int k0;
    private ClassLoader l;
    private Scroller m;
    private boolean n;
    private l o;
    private int p;
    private Drawable q;
    private int r;
    private int s;
    private float t;
    private float u;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private boolean z;
    static final int[] t0 = {R.attr.layout_gravity};
    private static final Comparator<f> u0 = new a();
    private static final Interpolator v0 = new b();
    private static final o B0 = new o();

    static class a implements Comparator<f> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.f766b - fVar2.f766b;
        }
    }

    static class b implements Interpolator {
        b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() throws Resources.NotFoundException {
            ViewPager.this.setScrollState(0);
            ViewPager.this.J();
        }
    }

    class d implements y {

        /* renamed from: a, reason: collision with root package name */
        private final Rect f763a = new Rect();

        d() {
        }

        @Override // b.i.p.y
        public o0 a(View view, o0 o0Var) {
            o0 o0VarA1 = f0.a1(view, o0Var);
            if (o0VarA1.x()) {
                return o0VarA1;
            }
            Rect rect = this.f763a;
            rect.left = o0VarA1.m();
            rect.top = o0VarA1.o();
            rect.right = o0VarA1.n();
            rect.bottom = o0VarA1.l();
            int childCount = ViewPager.this.getChildCount();
            for (int r0 = 0; r0 < childCount; r0++) {
                o0 o0VarO = f0.o(ViewPager.this.getChildAt(r0), o0VarA1);
                rect.left = Math.min(o0VarO.m(), rect.left);
                rect.top = Math.min(o0VarO.o(), rect.top);
                rect.right = Math.min(o0VarO.n(), rect.right);
                rect.bottom = Math.min(o0VarO.l(), rect.bottom);
            }
            return o0VarA1.z(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    static class f {

        /* renamed from: a, reason: collision with root package name */
        Object f765a;

        /* renamed from: b, reason: collision with root package name */
        int f766b;

        /* renamed from: c, reason: collision with root package name */
        boolean f767c;
        float d;
        float e;

        f() {
        }
    }

    public static class g extends ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f768a;

        /* renamed from: b, reason: collision with root package name */
        public int f769b;

        /* renamed from: c, reason: collision with root package name */
        float f770c;
        boolean d;
        int e;
        int f;

        public g() {
            super(-1, -1);
            this.f770c = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f770c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.t0);
            this.f769b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    class h extends b.i.p.a {
        h() {
        }

        private boolean n() {
            androidx.viewpager.widget.a aVar = ViewPager.this.h;
            return aVar != null && aVar.e() > 1;
        }

        @Override // b.i.p.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            androidx.viewpager.widget.a aVar;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() != 4096 || (aVar = ViewPager.this.h) == null) {
                return;
            }
            accessibilityEvent.setItemCount(aVar.e());
            accessibilityEvent.setFromIndex(ViewPager.this.i);
            accessibilityEvent.setToIndex(ViewPager.this.i);
        }

        @Override // b.i.p.a
        public void g(View view, b.i.p.p0.d dVar) {
            super.g(view, dVar);
            dVar.T0(ViewPager.class.getName());
            dVar.C1(n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                dVar.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                dVar.a(8192);
            }
        }

        @Override // b.i.p.a
        public boolean j(View view, int r3, Bundle bundle) throws Resources.NotFoundException {
            ViewPager viewPager;
            int r32;
            if (super.j(view, r3, bundle)) {
                return true;
            }
            if (r3 != 4096) {
                if (r3 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                r32 = viewPager.i - 1;
            } else {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                r32 = viewPager.i + 1;
            }
            viewPager.setCurrentItem(r32);
            return true;
        }
    }

    public interface i {
        void d(@h0 ViewPager viewPager, @i0 androidx.viewpager.widget.a aVar, @i0 androidx.viewpager.widget.a aVar2);
    }

    public interface j {
        void a(int r1, float f, @k0 int r3);

        void b(int r1);

        void c(int r1);
    }

    public interface k {
        void a(@h0 View view, float f);
    }

    private class l extends DataSetObserver {
        l() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() throws Resources.NotFoundException {
            ViewPager.this.j();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() throws Resources.NotFoundException {
            ViewPager.this.j();
        }
    }

    public static class m extends b.k.b.a {
        public static final Parcelable.Creator<m> CREATOR = new a();
        int f;
        Parcelable g;
        ClassLoader h;

        static class a implements Parcelable.ClassLoaderCreator<m> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public m[] newArray(int r1) {
                return new m[r1];
            }
        }

        m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? m.class.getClassLoader() : classLoader;
            this.f = parcel.readInt();
            this.g = parcel.readParcelable(classLoader);
            this.h = classLoader;
        }

        public m(@h0 Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f + "}";
        }

        @Override // b.k.b.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int r3) {
            super.writeToParcel(parcel, r3);
            parcel.writeInt(this.f);
            parcel.writeParcelable(this.g, r3);
        }
    }

    public static class n implements j {
        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int r1, float f, int r3) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int r1) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int r1) {
        }
    }

    static class o implements Comparator<View> {
        o() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z = gVar.f768a;
            return z != gVar2.f768a ? z ? 1 : -1 : gVar.e - gVar2.e;
        }
    }

    public ViewPager(@h0 Context context) {
        super(context);
        this.e = new ArrayList<>();
        this.f = new f();
        this.g = new Rect();
        this.j = -1;
        this.k = null;
        this.l = null;
        this.t = -3.4028235E38f;
        this.u = Float.MAX_VALUE;
        this.A = 1;
        this.K = -1;
        this.U = true;
        this.V = false;
        this.j0 = new c();
        this.k0 = 0;
        z();
    }

    public ViewPager(@h0 Context context, @i0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new ArrayList<>();
        this.f = new f();
        this.g = new Rect();
        this.j = -1;
        this.k = null;
        this.l = null;
        this.t = -3.4028235E38f;
        this.u = Float.MAX_VALUE;
        this.A = 1;
        this.K = -1;
        this.U = true;
        this.V = false;
        this.j0 = new c();
        this.k0 = 0;
        z();
    }

    private static boolean A(@h0 View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private boolean C(float f2, float f3) {
        return (f2 < ((float) this.E) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.E)) && f3 < 0.0f);
    }

    private void E(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.K) {
            int r02 = actionIndex == 0 ? 1 : 0;
            this.G = motionEvent.getX(r02);
            this.K = motionEvent.getPointerId(r02);
            VelocityTracker velocityTracker = this.L;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean H(int r8) {
        if (this.e.size() == 0) {
            if (this.U) {
                return false;
            }
            this.W = false;
            D(0, 0.0f, 0);
            if (this.W) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f fVarX = x();
        int clientWidth = getClientWidth();
        int r4 = this.p;
        int r5 = clientWidth + r4;
        float f2 = clientWidth;
        int r6 = fVarX.f766b;
        float f3 = ((r8 / f2) - fVarX.e) / (fVarX.d + (r4 / f2));
        this.W = false;
        D(r6, f3, (int) (r5 * f3));
        if (this.W) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean I(float f2) {
        boolean z;
        boolean z2;
        float f3 = this.G - f2;
        this.G = f2;
        float scrollX = getScrollX() + f3;
        float clientWidth = getClientWidth();
        float f4 = this.t * clientWidth;
        float f5 = this.u * clientWidth;
        boolean z3 = false;
        f fVar = this.e.get(0);
        ArrayList<f> arrayList = this.e;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f766b != 0) {
            f4 = fVar.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fVar2.f766b != this.h.e() - 1) {
            f5 = fVar2.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f4) {
            if (z) {
                this.S.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z2) {
                this.T.onPull(Math.abs(scrollX - f5) / clientWidth);
                z3 = true;
            }
            scrollX = f5;
        }
        int r1 = (int) scrollX;
        this.G += scrollX - r1;
        scrollTo(r1, getScrollY());
        H(r1);
        return z3;
    }

    private void L(int r2, int r3, int r4, int r5) {
        int scrollX;
        if (r3 <= 0 || this.e.isEmpty()) {
            f fVarY = y(this.i);
            scrollX = (int) ((fVarY != null ? Math.min(fVarY.e, this.u) : 0.0f) * ((r2 - getPaddingLeft()) - getPaddingRight()));
            if (scrollX == getScrollX()) {
                return;
            } else {
                i(false);
            }
        } else if (!this.m.isFinished()) {
            this.m.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            scrollX = (int) ((getScrollX() / (((r3 - getPaddingLeft()) - getPaddingRight()) + r5)) * (((r2 - getPaddingLeft()) - getPaddingRight()) + r4));
        }
        scrollTo(scrollX, getScrollY());
    }

    private void M() {
        int r02 = 0;
        while (r02 < getChildCount()) {
            if (!((g) getChildAt(r02).getLayoutParams()).f768a) {
                removeViewAt(r02);
                r02--;
            }
            r02++;
        }
    }

    private void P(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean Q() {
        this.K = -1;
        q();
        this.S.onRelease();
        this.T.onRelease();
        return this.S.isFinished() || this.T.isFinished();
    }

    private void R(int r6, boolean z, int r8, boolean z2) throws Resources.NotFoundException {
        f fVarY = y(r6);
        int clientWidth = fVarY != null ? (int) (getClientWidth() * Math.max(this.t, Math.min(fVarY.e, this.u))) : 0;
        if (z) {
            Z(clientWidth, 0, r8);
            if (z2) {
                m(r6);
                return;
            }
            return;
        }
        if (z2) {
            m(r6);
        }
        i(false);
        scrollTo(clientWidth, 0);
        H(clientWidth);
    }

    private void a0() {
        if (this.h0 != 0) {
            ArrayList<View> arrayList = this.i0;
            if (arrayList == null) {
                this.i0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int r1 = 0; r1 < childCount; r1++) {
                this.i0.add(getChildAt(r1));
            }
            Collections.sort(this.i0, B0);
        }
    }

    private void f(f fVar, int r12, f fVar2) {
        int r5;
        int r8;
        f fVar3;
        f fVar4;
        int r02 = this.h.e();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? this.p / clientWidth : 0.0f;
        if (fVar2 != null) {
            int r3 = fVar2.f766b;
            int r4 = fVar.f766b;
            if (r3 < r4) {
                float fH = fVar2.e + fVar2.d + f2;
                int r32 = r3 + 1;
                int r13 = 0;
                while (r32 <= fVar.f766b && r13 < this.e.size()) {
                    while (true) {
                        fVar4 = this.e.get(r13);
                        if (r32 <= fVar4.f766b || r13 >= this.e.size() - 1) {
                            break;
                        } else {
                            r13++;
                        }
                    }
                    while (r32 < fVar4.f766b) {
                        fH += this.h.h(r32) + f2;
                        r32++;
                    }
                    fVar4.e = fH;
                    fH += fVar4.d + f2;
                    r32++;
                }
            } else if (r3 > r4) {
                int size = this.e.size() - 1;
                float fH2 = fVar2.e;
                while (true) {
                    r3--;
                    if (r3 < fVar.f766b || size < 0) {
                        break;
                    }
                    while (true) {
                        fVar3 = this.e.get(size);
                        if (r3 >= fVar3.f766b || size <= 0) {
                            break;
                        } else {
                            size--;
                        }
                    }
                    while (r3 > fVar3.f766b) {
                        fH2 -= this.h.h(r3) + f2;
                        r3--;
                    }
                    fH2 -= fVar3.d + f2;
                    fVar3.e = fH2;
                }
            }
        }
        int size2 = this.e.size();
        float fH3 = fVar.e;
        int r42 = fVar.f766b;
        int r52 = r42 - 1;
        this.t = r42 == 0 ? fH3 : -3.4028235E38f;
        int r03 = r02 - 1;
        this.u = fVar.f766b == r03 ? (fVar.e + fVar.d) - 1.0f : Float.MAX_VALUE;
        int r43 = r12 - 1;
        while (r43 >= 0) {
            f fVar5 = this.e.get(r43);
            while (true) {
                r8 = fVar5.f766b;
                if (r52 <= r8) {
                    break;
                }
                fH3 -= this.h.h(r52) + f2;
                r52--;
            }
            fH3 -= fVar5.d + f2;
            fVar5.e = fH3;
            if (r8 == 0) {
                this.t = fH3;
            }
            r43--;
            r52--;
        }
        float fH4 = fVar.e + fVar.d + f2;
        int r11 = fVar.f766b + 1;
        int r122 = r12 + 1;
        while (r122 < size2) {
            f fVar6 = this.e.get(r122);
            while (true) {
                r5 = fVar6.f766b;
                if (r11 >= r5) {
                    break;
                }
                fH4 += this.h.h(r11) + f2;
                r11++;
            }
            if (r5 == r03) {
                this.u = (fVar6.d + fH4) - 1.0f;
            }
            fVar6.e = fH4;
            fH4 += fVar6.d + f2;
            r122++;
            r11++;
        }
        this.V = false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void i(boolean z) {
        boolean z2 = this.k0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.m.isFinished()) {
                this.m.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.m.getCurrX();
                int currY = this.m.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        H(currX);
                    }
                }
            }
        }
        this.z = false;
        for (int r3 = 0; r3 < this.e.size(); r3++) {
            f fVar = this.e.get(r3);
            if (fVar.f767c) {
                fVar.f767c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                f0.i1(this, this.j0);
            } else {
                this.j0.run();
            }
        }
    }

    private int k(int r2, float f2, int r4, int r5) {
        if (Math.abs(r5) <= this.O || Math.abs(r4) <= this.M) {
            r2 += (int) (f2 + (r2 >= this.i ? 0.4f : 0.6f));
        } else if (r4 <= 0) {
            r2++;
        }
        if (this.e.size() <= 0) {
            return r2;
        }
        return Math.max(this.e.get(0).f766b, Math.min(r2, this.e.get(r4.size() - 1).f766b));
    }

    private void l(int r4, float f2, int r6) {
        j jVar = this.c0;
        if (jVar != null) {
            jVar.a(r4, f2, r6);
        }
        List<j> list = this.b0;
        if (list != null) {
            int size = list.size();
            for (int r1 = 0; r1 < size; r1++) {
                j jVar2 = this.b0.get(r1);
                if (jVar2 != null) {
                    jVar2.a(r4, f2, r6);
                }
            }
        }
        j jVar3 = this.d0;
        if (jVar3 != null) {
            jVar3.a(r4, f2, r6);
        }
    }

    private void m(int r4) {
        j jVar = this.c0;
        if (jVar != null) {
            jVar.c(r4);
        }
        List<j> list = this.b0;
        if (list != null) {
            int size = list.size();
            for (int r1 = 0; r1 < size; r1++) {
                j jVar2 = this.b0.get(r1);
                if (jVar2 != null) {
                    jVar2.c(r4);
                }
            }
        }
        j jVar3 = this.d0;
        if (jVar3 != null) {
            jVar3.c(r4);
        }
    }

    private void n(int r4) {
        j jVar = this.c0;
        if (jVar != null) {
            jVar.b(r4);
        }
        List<j> list = this.b0;
        if (list != null) {
            int size = list.size();
            for (int r1 = 0; r1 < size; r1++) {
                j jVar2 = this.b0.get(r1);
                if (jVar2 != null) {
                    jVar2.b(r4);
                }
            }
        }
        j jVar3 = this.d0;
        if (jVar3 != null) {
            jVar3.b(r4);
        }
    }

    private void p(boolean z) {
        int childCount = getChildCount();
        for (int r2 = 0; r2 < childCount; r2++) {
            getChildAt(r2).setLayerType(z ? this.g0 : 0, null);
        }
    }

    private void q() {
        this.B = false;
        this.C = false;
        VelocityTracker velocityTracker = this.L;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.L = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.y != z) {
            this.y = z;
        }
    }

    private Rect u(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private f x() {
        int r7;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f3 = clientWidth > 0 ? this.p / clientWidth : 0.0f;
        f fVar = null;
        float f4 = 0.0f;
        int r72 = -1;
        int r8 = 0;
        boolean z = true;
        while (r8 < this.e.size()) {
            f fVar2 = this.e.get(r8);
            if (!z && fVar2.f766b != (r7 = r72 + 1)) {
                fVar2 = this.f;
                fVar2.e = f2 + f4 + f3;
                fVar2.f766b = r7;
                fVar2.d = this.h.h(r7);
                r8--;
            }
            f2 = fVar2.e;
            float f5 = fVar2.d + f2 + f3;
            if (!z && scrollX < f2) {
                return fVar;
            }
            if (scrollX < f5 || r8 == this.e.size() - 1) {
                return fVar2;
            }
            r72 = fVar2.f766b;
            f4 = fVar2.d;
            r8++;
            fVar = fVar2;
            z = false;
        }
        return fVar;
    }

    public boolean B() {
        return this.Q;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    @androidx.annotation.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void D(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.a0
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.g) r9
            boolean r10 = r9.f768a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f769b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.l(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$k r13 = r12.f0
            if (r13 == 0) goto L9f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r0 = (androidx.viewpager.widget.ViewPager.g) r0
            boolean r0 = r0.f768a
            if (r0 == 0) goto L8b
            goto L9c
        L8b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$k r3 = r12.f0
            r3.a(r15, r0)
        L9c:
            int r1 = r1 + 1
            goto L7a
        L9f:
            r12.W = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.D(int, float, int):void");
    }

    boolean F() throws Resources.NotFoundException {
        int r02 = this.i;
        if (r02 <= 0) {
            return false;
        }
        S(r02 - 1, true);
        return true;
    }

    boolean G() throws Resources.NotFoundException {
        androidx.viewpager.widget.a aVar = this.h;
        if (aVar == null || this.i >= aVar.e() - 1) {
            return false;
        }
        S(this.i + 1, true);
        return true;
    }

    void J() throws Resources.NotFoundException {
        K(this.i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00de A[PHI: r7 r10 r15
  0x00de: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v10 int) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x00de: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v13 int) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x00de: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e7 A[PHI: r7 r10 r15
  0x00e7: PHI (r7v9 int) = (r7v5 int), (r7v4 int), (r7v10 int) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x00e7: PHI (r10v12 int) = (r10v1 int), (r10v8 int), (r10v13 int) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x00e7: PHI (r15v10 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void K(int r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.K(int):void");
    }

    public void N(@h0 i iVar) {
        List<i> list = this.e0;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void O(@h0 j jVar) {
        List<j> list = this.b0;
        if (list != null) {
            list.remove(jVar);
        }
    }

    public void S(int r2, boolean z) throws Resources.NotFoundException {
        this.z = false;
        T(r2, z, false);
    }

    void T(int r2, boolean z, boolean z2) throws Resources.NotFoundException {
        U(r2, z, z2, 0);
    }

    void U(int r5, boolean z, boolean z2, int r8) throws Resources.NotFoundException {
        androidx.viewpager.widget.a aVar = this.h;
        if (aVar == null || aVar.e() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.i == r5 && this.e.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (r5 < 0) {
            r5 = 0;
        } else if (r5 >= this.h.e()) {
            r5 = this.h.e() - 1;
        }
        int r02 = this.A;
        int r2 = this.i;
        if (r5 > r2 + r02 || r5 < r2 - r02) {
            for (int r03 = 0; r03 < this.e.size(); r03++) {
                this.e.get(r03).f767c = true;
            }
        }
        boolean z3 = this.i != r5;
        if (!this.U) {
            K(r5);
            R(r5, z, r8, z3);
        } else {
            this.i = r5;
            if (z3) {
                m(r5);
            }
            requestLayout();
        }
    }

    j V(j jVar) {
        j jVar2 = this.d0;
        this.d0 = jVar;
        return jVar2;
    }

    public void W(boolean z, @i0 k kVar) throws Resources.NotFoundException {
        X(z, kVar, 2);
    }

    public void X(boolean z, @i0 k kVar, int r7) throws Resources.NotFoundException {
        boolean z2 = kVar != null;
        boolean z3 = z2 != (this.f0 != null);
        this.f0 = kVar;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.h0 = z ? 2 : 1;
            this.g0 = r7;
        } else {
            this.h0 = 0;
        }
        if (z3) {
            J();
        }
    }

    void Y(int r2, int r3) throws Resources.NotFoundException {
        Z(r2, r3, 0);
    }

    void Z(int r10, int r11, int r12) throws Resources.NotFoundException {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.m;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.n ? this.m.getCurrX() : this.m.getStartX();
            this.m.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int r4 = scrollX;
        int scrollY = getScrollY();
        int r6 = r10 - r4;
        int r7 = r11 - scrollY;
        if (r6 == 0 && r7 == 0) {
            i(false);
            J();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int r112 = clientWidth / 2;
        float f2 = clientWidth;
        float f3 = r112;
        float fO = f3 + (o(Math.min(1.0f, (Math.abs(r6) * 1.0f) / f2)) * f3);
        int r122 = Math.abs(r12);
        int r8 = Math.min(r122 > 0 ? Math.round(Math.abs(fO / r122) * 1000.0f) * 4 : (int) (((Math.abs(r6) / ((f2 * this.h.h(this.i)) + this.p)) + 1.0f) * 100.0f), p0);
        this.n = false;
        this.m.startScroll(r4, scrollY, r6, r7, r8);
        f0.g1(this);
    }

    f a(int r3, int r4) {
        f fVar = new f();
        fVar.f766b = r3;
        fVar.f765a = this.h.j(this, r3);
        fVar.d = this.h.h(r3);
        if (r4 < 0 || r4 >= this.e.size()) {
            this.e.add(fVar);
        } else {
            this.e.add(r4, fVar);
        }
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int r8, int r9) {
        f fVarW;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int r2 = 0; r2 < getChildCount(); r2++) {
                View childAt = getChildAt(r2);
                if (childAt.getVisibility() == 0 && (fVarW = w(childAt)) != null && fVarW.f766b == this.i) {
                    childAt.addFocusables(arrayList, r8, r9);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if (((r9 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f fVarW;
        for (int r02 = 0; r02 < getChildCount(); r02++) {
            View childAt = getChildAt(r02);
            if (childAt.getVisibility() == 0 && (fVarW = w(childAt)) != null && fVarW.f766b == this.i) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int r5, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean zA = gVar.f768a | A(view);
        gVar.f768a = zA;
        if (!this.x) {
            super.addView(view, r5, layoutParams);
        } else {
            if (gVar != null && zA) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            gVar.d = true;
            addViewInLayout(view, r5, layoutParams);
        }
    }

    public void b(@h0 i iVar) {
        if (this.e0 == null) {
            this.e0 = new ArrayList();
        }
        this.e0.add(iVar);
    }

    public void c(@h0 j jVar) {
        if (this.b0 == null) {
            this.b0 = new ArrayList();
        }
        this.b0.add(jVar);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int r5) {
        if (this.h == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return r5 < 0 ? scrollX > ((int) (((float) clientWidth) * this.t)) : r5 > 0 && scrollX < ((int) (((float) clientWidth) * this.u));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.n = true;
        if (this.m.isFinished() || !this.m.computeScrollOffset()) {
            i(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.m.getCurrX();
        int currY = this.m.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!H(currX)) {
                this.m.abortAnimation();
                scrollTo(0, currY);
            }
        }
        f0.g1(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(int r7) throws android.content.res.Resources.NotFoundException {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto Lb
        L9:
            r0 = r3
            goto L69
        Lb:
            if (r0 == 0) goto L69
            android.view.ViewParent r4 = r0.getParent()
        L11:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L1e
            if (r4 != r6) goto L19
            r4 = 1
            goto L1f
        L19:
            android.view.ViewParent r4 = r4.getParent()
            goto L11
        L1e:
            r4 = 0
        L1f:
            if (r4 != 0) goto L69
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L35:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L4e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L35
        L4e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
            goto L9
        L69:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto Lb5
            if (r3 == r0) goto Lb5
            if (r7 != r5) goto L9a
            android.graphics.Rect r1 = r6.g
            android.graphics.Rect r1 = r6.u(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.g
            android.graphics.Rect r2 = r6.u(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L94
            if (r1 < r2) goto L94
            boolean r0 = r6.F()
            goto L98
        L94:
            boolean r0 = r3.requestFocus()
        L98:
            r2 = r0
            goto Lc8
        L9a:
            if (r7 != r4) goto Lc8
            android.graphics.Rect r1 = r6.g
            android.graphics.Rect r1 = r6.u(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.g
            android.graphics.Rect r2 = r6.u(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L94
            if (r1 > r2) goto L94
            boolean r0 = r6.G()
            goto L98
        Lb5:
            if (r7 == r5) goto Lc4
            if (r7 != r1) goto Lba
            goto Lc4
        Lba:
            if (r7 == r4) goto Lbf
            r0 = 2
            if (r7 != r0) goto Lc8
        Lbf:
            boolean r2 = r6.G()
            goto Lc8
        Lc4:
            boolean r2 = r6.F()
        Lc8:
            if (r2 == 0) goto Ld1
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        Ld1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.d(int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || s(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f fVarW;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int r2 = 0; r2 < childCount; r2++) {
            View childAt = getChildAt(r2);
            if (childAt.getVisibility() == 0 && (fVarW = w(childAt)) != null && fVarW.f766b == this.i && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        androidx.viewpager.widget.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.h) != null && aVar.e() > 1)) {
            if (!this.S.isFinished()) {
                int r02 = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.t * width);
                this.S.setSize(height, width);
                zDraw = false | this.S.draw(canvas);
                canvas.restoreToCount(r02);
            }
            if (!this.T.isFinished()) {
                int r03 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.u + 1.0f)) * width2);
                this.T.setSize(height2, width2);
                zDraw |= this.T.draw(canvas);
                canvas.restoreToCount(r03);
            }
        } else {
            this.S.finish();
            this.T.finish();
        }
        if (zDraw) {
            f0.g1(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.q;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public boolean e() {
        if (this.B) {
            return false;
        }
        this.Q = true;
        setScrollState(1);
        this.G = 0.0f;
        this.I = 0.0f;
        VelocityTracker velocityTracker = this.L;
        if (velocityTracker == null) {
            this.L = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 0.0f, 0.0f, 0);
        this.L.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        this.R = jUptimeMillis;
        return true;
    }

    protected boolean g(View view, boolean z, int r15, int r16, int r17) {
        int r8;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int r6 = r16 + scrollX;
                if (r6 >= childAt.getLeft() && r6 < childAt.getRight() && (r8 = r17 + scrollY) >= childAt.getTop() && r8 < childAt.getBottom() && g(childAt, true, r15, r6 - childAt.getLeft(), r8 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-r15);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @i0
    public androidx.viewpager.widget.a getAdapter() {
        return this.h;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int r3, int r4) {
        if (this.h0 == 2) {
            r4 = (r3 - 1) - r4;
        }
        return ((g) this.i0.get(r4).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.i;
    }

    public int getOffscreenPageLimit() {
        return this.A;
    }

    public int getPageMargin() {
        return this.p;
    }

    public void h() {
        List<j> list = this.b0;
        if (list != null) {
            list.clear();
        }
    }

    void j() throws Resources.NotFoundException {
        int r02 = this.h.e();
        this.d = r02;
        boolean z = this.e.size() < (this.A * 2) + 1 && this.e.size() < r02;
        int r2 = this.i;
        int r5 = 0;
        boolean z2 = false;
        while (r5 < this.e.size()) {
            f fVar = this.e.get(r5);
            int r8 = this.h.f(fVar.f765a);
            if (r8 != -1) {
                if (r8 == -2) {
                    this.e.remove(r5);
                    r5--;
                    if (!z2) {
                        this.h.t(this);
                        z2 = true;
                    }
                    this.h.b(this, fVar.f766b, fVar.f765a);
                    int r1 = this.i;
                    if (r1 == fVar.f766b) {
                        r2 = Math.max(0, Math.min(r1, r02 - 1));
                    }
                } else {
                    int r9 = fVar.f766b;
                    if (r9 != r8) {
                        if (r9 == this.i) {
                            r2 = r8;
                        }
                        fVar.f766b = r8;
                    }
                }
                z = true;
            }
            r5++;
        }
        if (z2) {
            this.h.d(this);
        }
        Collections.sort(this.e, u0);
        if (z) {
            int childCount = getChildCount();
            for (int r12 = 0; r12 < childCount; r12++) {
                g gVar = (g) getChildAt(r12).getLayoutParams();
                if (!gVar.f768a) {
                    gVar.f770c = 0.0f;
                }
            }
            T(r2, false, true);
            requestLayout();
        }
    }

    float o(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.j0);
        Scroller scroller = this.m;
        if (scroller != null && !scroller.isFinished()) {
            this.m.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.p <= 0 || this.q == null || this.e.size() <= 0 || this.h == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f4 = this.p / width;
        int r6 = 0;
        f fVar = this.e.get(0);
        float f5 = fVar.e;
        int size = this.e.size();
        int r9 = fVar.f766b;
        int r10 = this.e.get(size - 1).f766b;
        while (r9 < r10) {
            while (r9 > fVar.f766b && r6 < size) {
                r6++;
                fVar = this.e.get(r6);
            }
            if (r9 == fVar.f766b) {
                float f6 = fVar.e;
                float f7 = fVar.d;
                f2 = (f6 + f7) * width;
                f5 = f6 + f7 + f4;
            } else {
                float fH = this.h.h(r9);
                f2 = (f5 + fH) * width;
                f5 += fH + f4;
            }
            if (this.p + f2 > scrollX) {
                f3 = f4;
                this.q.setBounds(Math.round(f2), this.r, Math.round(this.p + f2), this.s);
                this.q.draw(canvas);
            } else {
                f3 = f4;
            }
            if (f2 > scrollX + r2) {
                return;
            }
            r9++;
            f4 = f3;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            Q();
            return false;
        }
        if (action != 0) {
            if (this.B) {
                return true;
            }
            if (this.C) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.I = x;
            this.G = x;
            float y = motionEvent.getY();
            this.J = y;
            this.H = y;
            this.K = motionEvent.getPointerId(0);
            this.C = false;
            this.n = true;
            this.m.computeScrollOffset();
            if (this.k0 != 2 || Math.abs(this.m.getFinalX() - this.m.getCurrX()) <= this.P) {
                i(false);
                this.B = false;
            } else {
                this.m.abortAnimation();
                this.z = false;
                J();
                this.B = true;
                P(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int r02 = this.K;
            if (r02 != -1) {
                int r03 = motionEvent.findPointerIndex(r02);
                float x2 = motionEvent.getX(r03);
                float f2 = x2 - this.G;
                float fAbs = Math.abs(f2);
                float y2 = motionEvent.getY(r03);
                float fAbs2 = Math.abs(y2 - this.J);
                if (f2 != 0.0f && !C(this.G, f2) && g(this, false, (int) f2, (int) x2, (int) y2)) {
                    this.G = x2;
                    this.H = y2;
                    this.C = true;
                    return false;
                }
                if (fAbs > this.F && fAbs * 0.5f > fAbs2) {
                    this.B = true;
                    P(true);
                    setScrollState(1);
                    float f3 = this.I;
                    float f4 = this.F;
                    this.G = f2 > 0.0f ? f3 + f4 : f3 - f4;
                    this.H = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > this.F) {
                    this.C = true;
                }
                if (this.B && I(x2)) {
                    f0.g1(this);
                }
            }
        } else if (action == 6) {
            E(motionEvent);
        }
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        }
        this.L.addMovement(motionEvent);
        return this.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int r9, Rect rect) {
        int r02;
        int r1;
        f fVarW;
        int childCount = getChildCount();
        int r3 = -1;
        if ((r9 & 2) != 0) {
            r3 = childCount;
            r02 = 0;
            r1 = 1;
        } else {
            r02 = childCount - 1;
            r1 = -1;
        }
        while (r02 != r3) {
            View childAt = getChildAt(r02);
            if (childAt.getVisibility() == 0 && (fVarW = w(childAt)) != null && fVarW.f766b == this.i && childAt.requestFocus(r9, rect)) {
                return true;
            }
            r02 += r1;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.a());
        androidx.viewpager.widget.a aVar = this.h;
        if (aVar != null) {
            aVar.n(mVar.g, mVar.h);
            T(mVar.f, false, true);
        } else {
            this.j = mVar.f;
            this.k = mVar.g;
            this.l = mVar.h;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        m mVar = new m(super.onSaveInstanceState());
        mVar.f = this.i;
        androidx.viewpager.widget.a aVar = this.h;
        if (aVar != null) {
            mVar.g = aVar.o();
        }
        return mVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        if (r1 != r3) {
            int r22 = this.p;
            L(r1, r3, r22, r22);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void r() throws Resources.NotFoundException {
        if (!this.Q) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.h != null) {
            VelocityTracker velocityTracker = this.L;
            velocityTracker.computeCurrentVelocity(1000, this.N);
            int xVelocity = (int) velocityTracker.getXVelocity(this.K);
            this.z = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f fVarX = x();
            U(k(fVarX.f766b, ((scrollX / clientWidth) - fVarX.e) / fVarX.d, xVelocity, (int) (this.G - this.I)), true, true, xVelocity);
        }
        q();
        this.Q = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.x) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public boolean s(@h0 KeyEvent keyEvent) {
        int r4;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return d(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return d(1);
                        }
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        return G();
                    }
                    r4 = 66;
                }
            } else {
                if (keyEvent.hasModifiers(2)) {
                    return F();
                }
                r4 = 17;
            }
            return d(r4);
        }
        return false;
    }

    public void setAdapter(@i0 androidx.viewpager.widget.a aVar) throws Resources.NotFoundException {
        androidx.viewpager.widget.a aVar2 = this.h;
        if (aVar2 != null) {
            aVar2.r(null);
            this.h.t(this);
            for (int r02 = 0; r02 < this.e.size(); r02++) {
                f fVar = this.e.get(r02);
                this.h.b(this, fVar.f766b, fVar.f765a);
            }
            this.h.d(this);
            this.e.clear();
            M();
            this.i = 0;
            scrollTo(0, 0);
        }
        androidx.viewpager.widget.a aVar3 = this.h;
        this.h = aVar;
        this.d = 0;
        if (aVar != null) {
            if (this.o == null) {
                this.o = new l();
            }
            this.h.r(this.o);
            this.z = false;
            boolean z = this.U;
            this.U = true;
            this.d = this.h.e();
            if (this.j >= 0) {
                this.h.n(this.k, this.l);
                T(this.j, false, true);
                this.j = -1;
                this.k = null;
                this.l = null;
            } else if (z) {
                requestLayout();
            } else {
                J();
            }
        }
        List<i> list = this.e0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.e0.size();
        for (int r2 = 0; r2 < size; r2++) {
            this.e0.get(r2).d(this, aVar3, aVar);
        }
    }

    public void setCurrentItem(int r3) throws Resources.NotFoundException {
        this.z = false;
        T(r3, !this.U, false);
    }

    public void setOffscreenPageLimit(int r4) throws Resources.NotFoundException {
        if (r4 < 1) {
            Log.w(l0, "Requested offscreen page limit " + r4 + " too small; defaulting to 1");
            r4 = 1;
        }
        if (r4 != this.A) {
            this.A = r4;
            J();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.c0 = jVar;
    }

    public void setPageMargin(int r3) {
        int r02 = this.p;
        this.p = r3;
        int width = getWidth();
        L(width, width, r3, r02);
        requestLayout();
    }

    public void setPageMarginDrawable(@q int r2) {
        setPageMarginDrawable(b.i.c.c.h(getContext(), r2));
    }

    public void setPageMarginDrawable(@i0 Drawable drawable) {
        this.q = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int r2) {
        if (this.k0 == r2) {
            return;
        }
        this.k0 = r2;
        if (this.f0 != null) {
            p(r2 != 0);
        }
        n(r2);
    }

    public void t(float f2) {
        if (!this.Q) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.h == null) {
            return;
        }
        this.G += f2;
        float scrollX = getScrollX() - f2;
        float clientWidth = getClientWidth();
        float f3 = this.t * clientWidth;
        float f4 = this.u * clientWidth;
        f fVar = this.e.get(0);
        f fVar2 = this.e.get(r4.size() - 1);
        if (fVar.f766b != 0) {
            f3 = fVar.e * clientWidth;
        }
        if (fVar2.f766b != this.h.e() - 1) {
            f4 = fVar2.e * clientWidth;
        }
        if (scrollX < f3) {
            scrollX = f3;
        } else if (scrollX > f4) {
            scrollX = f4;
        }
        int r1 = (int) scrollX;
        this.G += scrollX - r1;
        scrollTo(r1, getScrollY());
        H(r1);
        MotionEvent motionEventObtain = MotionEvent.obtain(this.R, SystemClock.uptimeMillis(), 2, this.G, 0.0f, 0);
        this.L.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    f v(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return w(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q;
    }

    f w(View view) {
        for (int r02 = 0; r02 < this.e.size(); r02++) {
            f fVar = this.e.get(r02);
            if (this.h.k(view, fVar.f765a)) {
                return fVar;
            }
        }
        return null;
    }

    f y(int r4) {
        for (int r02 = 0; r02 < this.e.size(); r02++) {
            f fVar = this.e.get(r02);
            if (fVar.f766b == r4) {
                return fVar;
            }
        }
        return null;
    }

    void z() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.m = new Scroller(context, v0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.F = viewConfiguration.getScaledPagingTouchSlop();
        this.M = (int) (400.0f * f2);
        this.N = viewConfiguration.getScaledMaximumFlingVelocity();
        this.S = new EdgeEffect(context);
        this.T = new EdgeEffect(context);
        this.O = (int) (25.0f * f2);
        this.P = (int) (2.0f * f2);
        this.D = (int) (f2 * 16.0f);
        f0.u1(this, new h());
        if (f0.S(this) == 0) {
            f0.K1(this, 1);
        }
        f0.T1(this, new d());
    }
}

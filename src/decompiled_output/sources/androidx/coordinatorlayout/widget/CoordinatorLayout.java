package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.r;
import androidx.annotation.w;
import androidx.annotation.x0;
import b.h.a;
import b.i.o.h;
import b.i.p.f0;
import b.i.p.o0;
import b.i.p.u;
import b.i.p.v;
import b.i.p.x;
import b.i.p.y;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements u, v {
    private static final int A = 1;
    static final Class<?>[] B;
    static final ThreadLocal<Map<String, Constructor<c>>> C;
    static final int D = 0;
    static final int E = 1;
    static final int F = 2;
    static final Comparator<View> G;
    private static final h.a<Rect> H;
    static final String x = "CoordinatorLayout";
    static final String y;
    private static final int z = 0;
    private final List<View> d;
    private final androidx.coordinatorlayout.widget.a<View> e;
    private final List<View> f;
    private final List<View> g;
    private Paint h;
    private final int[] i;
    private final int[] j;
    private boolean k;
    private boolean l;
    private int[] m;
    private View n;
    private View o;
    private h p;
    private boolean q;
    private o0 r;
    private boolean s;
    private Drawable t;
    ViewGroup.OnHierarchyChangeListener u;
    private y v;
    private final x w;

    class a implements y {
        a() {
        }

        @Override // b.i.p.y
        public o0 a(View view, o0 o0Var) {
            return CoordinatorLayout.this.b0(o0Var);
        }
    }

    public interface b {
        @h0
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public static void F(@h0 View view, @i0 Object obj) {
            ((g) view.getLayoutParams()).r = obj;
        }

        @i0
        public static Object e(@h0 View view) {
            return ((g) view.getLayoutParams()).r;
        }

        @Deprecated
        public boolean A(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 View view, @h0 View view2, int r5) {
            return false;
        }

        public boolean B(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 View view, @h0 View view2, int r5, int r6) {
            if (r6 == 0) {
                return A(coordinatorLayout, v, view, view2, r5);
            }
            return false;
        }

        @Deprecated
        public void C(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 View view) {
        }

        public void D(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 View view, int r4) {
            if (r4 == 0) {
                C(coordinatorLayout, v, view);
            }
        }

        public boolean E(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 MotionEvent motionEvent) {
            return false;
        }

        public boolean a(@h0 CoordinatorLayout coordinatorLayout, @h0 V v) {
            return d(coordinatorLayout, v) > 0.0f;
        }

        public boolean b(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 Rect rect) {
            return false;
        }

        @k
        public int c(@h0 CoordinatorLayout coordinatorLayout, @h0 V v) {
            return f0.t;
        }

        @r(from = 0.0d, to = 1.0d)
        public float d(@h0 CoordinatorLayout coordinatorLayout, @h0 V v) {
            return 0.0f;
        }

        public boolean f(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 View view) {
            return false;
        }

        @h0
        public o0 g(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 o0 o0Var) {
            return o0Var;
        }

        public void h(@h0 g gVar) {
        }

        public boolean i(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 View view) {
            return false;
        }

        public void j(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 View view) {
        }

        public void k() {
        }

        public boolean l(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 MotionEvent motionEvent) {
            return false;
        }

        public boolean m(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, int r3) {
            return false;
        }

        public boolean n(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, int r3, int r4, int r5, int r6) {
            return false;
        }

        public boolean o(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean p(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 View view, float f, float f2) {
            return false;
        }

        @Deprecated
        public void q(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 View view, int r4, int r5, @h0 int[] r6) {
        }

        public void r(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 View view, int r4, int r5, @h0 int[] r6, int r7) {
            if (r7 == 0) {
                q(coordinatorLayout, v, view, r4, r5, r6);
            }
        }

        @Deprecated
        public void s(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 View view, int r4, int r5, int r6, int r7) {
        }

        @Deprecated
        public void t(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 View view, int r4, int r5, int r6, int r7, int r8) {
            if (r8 == 0) {
                s(coordinatorLayout, v, view, r4, r5, r6, r7);
            }
        }

        public void u(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 View view, int r6, int r7, int r8, int r9, int r10, @h0 int[] r11) {
            r11[0] = r11[0] + r8;
            r11[1] = r11[1] + r9;
            t(coordinatorLayout, v, view, r6, r7, r8, r9, r10);
        }

        @Deprecated
        public void v(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 View view, @h0 View view2, int r5) {
        }

        public void w(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 View view, @h0 View view2, int r5, int r6) {
            if (r6 == 0) {
                v(coordinatorLayout, v, view, view2, r5);
            }
        }

        public boolean x(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 Rect rect, boolean z) {
            return false;
        }

        public void y(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 Parcelable parcelable) {
        }

        @i0
        public Parcelable z(@h0 CoordinatorLayout coordinatorLayout, @h0 V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface d {
        Class<? extends c> value();
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface e {
    }

    private class f implements ViewGroup.OnHierarchyChangeListener {
        f() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.u;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.M(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.u;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class g extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        c f247a;

        /* renamed from: b, reason: collision with root package name */
        boolean f248b;

        /* renamed from: c, reason: collision with root package name */
        public int f249c;
        public int d;
        public int e;
        int f;
        public int g;
        public int h;
        int i;
        int j;
        View k;
        View l;
        private boolean m;
        private boolean n;
        private boolean o;
        private boolean p;
        final Rect q;
        Object r;

        public g(int r1, int r2) {
            super(r1, r2);
            this.f248b = false;
            this.f249c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        g(@h0 Context context, @i0 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f248b = false;
            this.f249c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.CoordinatorLayout_Layout);
            this.f249c = typedArrayObtainStyledAttributes.getInteger(a.j.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f = typedArrayObtainStyledAttributes.getResourceId(a.j.CoordinatorLayout_Layout_layout_anchor, -1);
            this.d = typedArrayObtainStyledAttributes.getInteger(a.j.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.e = typedArrayObtainStyledAttributes.getInteger(a.j.CoordinatorLayout_Layout_layout_keyline, -1);
            this.g = typedArrayObtainStyledAttributes.getInt(a.j.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.h = typedArrayObtainStyledAttributes.getInt(a.j.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(a.j.CoordinatorLayout_Layout_layout_behavior);
            this.f248b = zHasValue;
            if (zHasValue) {
                this.f247a = CoordinatorLayout.P(context, attributeSet, typedArrayObtainStyledAttributes.getString(a.j.CoordinatorLayout_Layout_layout_behavior));
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.f247a;
            if (cVar != null) {
                cVar.h(this);
            }
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f248b = false;
            this.f249c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f248b = false;
            this.f249c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public g(g gVar) {
            super((ViewGroup.MarginLayoutParams) gVar);
            this.f248b = false;
            this.f249c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        private void o(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f);
            this.k = viewFindViewById;
            if (viewFindViewById != null) {
                if (viewFindViewById != coordinatorLayout) {
                    for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                viewFindViewById = parent;
                            }
                        } else if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.l = viewFindViewById;
                    return;
                }
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (!coordinatorLayout.isInEditMode()) {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f) + " to anchor view " + view);
            }
            this.l = null;
            this.k = null;
        }

        private boolean u(View view, int r3) {
            int r2 = b.i.p.h.d(((g) view.getLayoutParams()).g, r3);
            return r2 != 0 && (b.i.p.h.d(this.h, r3) & r2) == r2;
        }

        private boolean v(View view, CoordinatorLayout coordinatorLayout) {
            if (this.k.getId() != this.f) {
                return false;
            }
            View view2 = this.k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.l = null;
                    this.k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.l = view2;
            return true;
        }

        boolean a() {
            return this.k == null && this.f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c cVar;
            return view2 == this.l || u(view2, f0.W(coordinatorLayout)) || ((cVar = this.f247a) != null && cVar.f(coordinatorLayout, view, view2));
        }

        boolean c() {
            if (this.f247a == null) {
                this.m = false;
            }
            return this.m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f == -1) {
                this.l = null;
                this.k = null;
                return null;
            }
            if (this.k == null || !v(view, coordinatorLayout)) {
                o(view, coordinatorLayout);
            }
            return this.k;
        }

        @w
        public int e() {
            return this.f;
        }

        @i0
        public c f() {
            return this.f247a;
        }

        boolean g() {
            return this.p;
        }

        Rect h() {
            return this.q;
        }

        void i() {
            this.l = null;
            this.k = null;
        }

        boolean j(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.m;
            if (z) {
                return true;
            }
            c cVar = this.f247a;
            boolean zA = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z;
            this.m = zA;
            return zA;
        }

        boolean k(int r2) {
            if (r2 == 0) {
                return this.n;
            }
            if (r2 != 1) {
                return false;
            }
            return this.o;
        }

        void l() {
            this.p = false;
        }

        void m(int r2) {
            t(r2, false);
        }

        void n() {
            this.m = false;
        }

        public void p(@w int r1) {
            i();
            this.f = r1;
        }

        public void q(@i0 c cVar) {
            c cVar2 = this.f247a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.k();
                }
                this.f247a = cVar;
                this.r = null;
                this.f248b = true;
                if (cVar != null) {
                    cVar.h(this);
                }
            }
        }

        void r(boolean z) {
            this.p = z;
        }

        void s(Rect rect) {
            this.q.set(rect);
        }

        void t(int r2, boolean z) {
            if (r2 == 0) {
                this.n = z;
            } else {
                if (r2 != 1) {
                    return;
                }
                this.o = z;
            }
        }
    }

    class h implements ViewTreeObserver.OnPreDrawListener {
        h() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.M(0);
            return true;
        }
    }

    protected static class i extends b.k.b.a {
        public static final Parcelable.Creator<i> CREATOR = new a();
        SparseArray<Parcelable> f;

        static class a implements Parcelable.ClassLoaderCreator<i> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int r1) {
                return new i[r1];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int r0 = parcel.readInt();
            int[] r1 = new int[r0];
            parcel.readIntArray(r1);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f = new SparseArray<>(r0);
            for (int r7 = 0; r7 < r0; r7++) {
                this.f.append(r1[r7], parcelableArray[r7]);
            }
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // b.k.b.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int r7) {
            super.writeToParcel(parcel, r7);
            SparseArray<Parcelable> sparseArray = this.f;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] r2 = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int r1 = 0; r1 < size; r1++) {
                r2[r1] = this.f.keyAt(r1);
                parcelableArr[r1] = this.f.valueAt(r1);
            }
            parcel.writeIntArray(r2);
            parcel.writeParcelableArray(parcelableArr, r7);
        }
    }

    static class j implements Comparator<View> {
        j() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fA0 = f0.A0(view);
            float fA02 = f0.A0(view2);
            if (fA0 > fA02) {
                return -1;
            }
            return fA0 < fA02 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        y = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            G = new j();
        } else {
            G = null;
        }
        B = new Class[]{Context.class, AttributeSet.class};
        C = new ThreadLocal<>();
        H = new h.c(12);
    }

    public CoordinatorLayout(@h0 Context context) {
        this(context, null);
    }

    public CoordinatorLayout(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.C0053a.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(@h0 Context context, @i0 AttributeSet attributeSet, @androidx.annotation.f int r12) {
        super(context, attributeSet, r12);
        this.d = new ArrayList();
        this.e = new androidx.coordinatorlayout.widget.a<>();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.i = new int[2];
        this.j = new int[2];
        this.w = new x(this);
        int[] r1 = a.j.CoordinatorLayout;
        TypedArray typedArrayObtainStyledAttributes = r12 == 0 ? context.obtainStyledAttributes(attributeSet, r1, 0, a.i.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, r1, r12, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            int[] r4 = a.j.CoordinatorLayout;
            if (r12 == 0) {
                saveAttributeDataForStyleable(context, r4, attributeSet, typedArrayObtainStyledAttributes, 0, a.i.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, r4, attributeSet, typedArrayObtainStyledAttributes, r12, 0);
            }
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(a.j.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.m = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.m.length;
            for (int r0 = 0; r0 < length; r0++) {
                this.m[r0] = (int) (r12[r0] * f2);
            }
        }
        this.t = typedArrayObtainStyledAttributes.getDrawable(a.j.CoordinatorLayout_statusBarBackground);
        typedArrayObtainStyledAttributes.recycle();
        c0();
        super.setOnHierarchyChangeListener(new f());
        if (f0.S(this) == 0) {
            f0.K1(this, 1);
        }
    }

    private void A(View view, int r7, Rect rect, Rect rect2, g gVar, int r11, int r12) {
        int r6 = b.i.p.h.d(W(gVar.f249c), r7);
        int r72 = b.i.p.h.d(X(gVar.d), r7);
        int r10 = r6 & 7;
        int r62 = r6 & 112;
        int r0 = r72 & 7;
        int r73 = r72 & 112;
        int r02 = r0 != 1 ? r0 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int r74 = r73 != 16 ? r73 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (r10 == 1) {
            r02 -= r11 / 2;
        } else if (r10 != 5) {
            r02 -= r11;
        }
        if (r62 == 16) {
            r74 -= r12 / 2;
        } else if (r62 != 80) {
            r74 -= r12;
        }
        rect2.set(r02, r74, r11 + r02, r12 + r74);
    }

    private int B(int r5) {
        StringBuilder sb;
        int[] r0 = this.m;
        if (r0 == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(r5);
        } else {
            if (r5 >= 0 && r5 < r0.length) {
                return r0[r5];
            }
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(r5);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e(x, sb.toString());
        return 0;
    }

    private void E(List<View> list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int r2 = childCount - 1; r2 >= 0; r2--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, r2) : r2));
        }
        Comparator<View> comparator = G;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean F(View view) {
        return this.e.j(view);
    }

    private void H(View view, int r11) {
        g gVar = (g) view.getLayoutParams();
        Rect rectE = e();
        rectE.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
        if (this.r != null && f0.R(this) && !f0.R(view)) {
            rectE.left += this.r.m();
            rectE.top += this.r.o();
            rectE.right -= this.r.n();
            rectE.bottom -= this.r.l();
        }
        Rect rectE2 = e();
        b.i.p.h.b(X(gVar.f249c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectE, rectE2, r11);
        view.layout(rectE2.left, rectE2.top, rectE2.right, rectE2.bottom);
        T(rectE);
        T(rectE2);
    }

    private void I(View view, View view2, int r7) {
        Rect rectE = e();
        Rect rectE2 = e();
        try {
            y(view2, rectE);
            z(view, r7, rectE, rectE2);
            view.layout(rectE2.left, rectE2.top, rectE2.right, rectE2.bottom);
        } finally {
            T(rectE);
            T(rectE2);
        }
    }

    private void J(View view, int r10, int r11) {
        g gVar = (g) view.getLayoutParams();
        int r1 = b.i.p.h.d(Y(gVar.f249c), r11);
        int r2 = r1 & 7;
        int r12 = r1 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (r11 == 1) {
            r10 = width - r10;
        }
        int r102 = B(r10) - measuredWidth;
        int r112 = 0;
        if (r2 == 1) {
            r102 += measuredWidth / 2;
        } else if (r2 == 5) {
            r102 += measuredWidth;
        }
        if (r12 == 16) {
            r112 = 0 + (measuredHeight / 2);
        } else if (r12 == 80) {
            r112 = measuredHeight + 0;
        }
        int r103 = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, Math.min(r102, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin));
        int r113 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, Math.min(r112, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin));
        view.layout(r103, r113, measuredWidth + r103, measuredHeight + r113);
    }

    private void K(View view, Rect rect, int r11) {
        boolean z2;
        boolean z3;
        int width;
        int r10;
        int r1;
        int r3;
        int height;
        int r6;
        int r12;
        int r32;
        if (f0.P0(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            g gVar = (g) view.getLayoutParams();
            c cVarF = gVar.f();
            Rect rectE = e();
            Rect rectE2 = e();
            rectE2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (cVarF == null || !cVarF.b(this, view, rectE)) {
                rectE.set(rectE2);
            } else if (!rectE2.contains(rectE)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectE.toShortString() + " | Bounds:" + rectE2.toShortString());
            }
            T(rectE2);
            if (rectE.isEmpty()) {
                T(rectE);
                return;
            }
            int r112 = b.i.p.h.d(gVar.h, r11);
            boolean z4 = true;
            if ((r112 & 48) != 48 || (r12 = (rectE.top - ((ViewGroup.MarginLayoutParams) gVar).topMargin) - gVar.j) >= (r32 = rect.top)) {
                z2 = false;
            } else {
                a0(view, r32 - r12);
                z2 = true;
            }
            if ((r112 & 80) == 80 && (height = ((getHeight() - rectE.bottom) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) + gVar.j) < (r6 = rect.bottom)) {
                a0(view, height - r6);
                z2 = true;
            }
            if (!z2) {
                a0(view, 0);
            }
            if ((r112 & 3) != 3 || (r1 = (rectE.left - ((ViewGroup.MarginLayoutParams) gVar).leftMargin) - gVar.i) >= (r3 = rect.left)) {
                z3 = false;
            } else {
                Z(view, r3 - r1);
                z3 = true;
            }
            if ((r112 & 5) != 5 || (width = ((getWidth() - rectE.right) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin) + gVar.i) >= (r10 = rect.right)) {
                z4 = z3;
            } else {
                Z(view, width - r10);
            }
            if (!z4) {
                Z(view, 0);
            }
            T(rectE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static c P(Context context, AttributeSet attributeSet, String str) throws NoSuchMethodException, SecurityException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(y)) {
            str = y + '.' + str;
        }
        try {
            Map<String, Constructor<c>> map = C.get();
            if (map == null) {
                map = new HashMap<>();
                C.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(B);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e2) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e2);
        }
    }

    private boolean Q(MotionEvent motionEvent, int r25) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f;
        E(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zL = false;
        boolean z2 = false;
        for (int r8 = 0; r8 < size; r8++) {
            View view = list.get(r8);
            g gVar = (g) view.getLayoutParams();
            c cVarF = gVar.f();
            if (!(zL || z2) || actionMasked == 0) {
                if (!zL && cVarF != null) {
                    if (r25 == 0) {
                        zL = cVarF.l(this, view, motionEvent);
                    } else if (r25 == 1) {
                        zL = cVarF.E(this, view, motionEvent);
                    }
                    if (zL) {
                        this.n = view;
                    }
                }
                boolean zC = gVar.c();
                boolean zJ = gVar.j(this, view);
                z2 = zJ && !zC;
                if (zJ && !z2) {
                    break;
                }
            } else if (cVarF != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (r25 == 0) {
                    cVarF.l(this, view, motionEventObtain);
                } else if (r25 == 1) {
                    cVarF.E(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zL;
    }

    private void R() {
        this.d.clear();
        this.e.c();
        int childCount = getChildCount();
        for (int r2 = 0; r2 < childCount; r2++) {
            View childAt = getChildAt(r2);
            g gVarD = D(childAt);
            gVarD.d(this, childAt);
            this.e.b(childAt);
            for (int r5 = 0; r5 < childCount; r5++) {
                if (r5 != r2) {
                    View childAt2 = getChildAt(r5);
                    if (gVarD.b(this, childAt, childAt2)) {
                        if (!this.e.d(childAt2)) {
                            this.e.b(childAt2);
                        }
                        this.e.a(childAt2, childAt);
                    }
                }
            }
        }
        this.d.addAll(this.e.i());
        Collections.reverse(this.d);
    }

    private static void T(@h0 Rect rect) {
        rect.setEmpty();
        H.a(rect);
    }

    private void V(boolean z2) {
        int childCount = getChildCount();
        for (int r2 = 0; r2 < childCount; r2++) {
            View childAt = getChildAt(r2);
            c cVarF = ((g) childAt.getLayoutParams()).f();
            if (cVarF != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    cVarF.l(this, childAt, motionEventObtain);
                } else {
                    cVarF.E(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int r14 = 0; r14 < childCount; r14++) {
            ((g) getChildAt(r14).getLayoutParams()).n();
        }
        this.n = null;
        this.k = false;
    }

    private static int W(int r0) {
        if (r0 == 0) {
            return 17;
        }
        return r0;
    }

    private static int X(int r1) {
        if ((r1 & 7) == 0) {
            r1 |= b.i.p.h.f1198b;
        }
        return (r1 & 112) == 0 ? r1 | 48 : r1;
    }

    private static int Y(int r0) {
        return r0 == 0 ? c.a.b.c.c.a.t : r0;
    }

    private void Z(View view, int r4) {
        g gVar = (g) view.getLayoutParams();
        int r1 = gVar.i;
        if (r1 != r4) {
            f0.Y0(view, r4 - r1);
            gVar.i = r4;
        }
    }

    private void a0(View view, int r4) {
        g gVar = (g) view.getLayoutParams();
        int r1 = gVar.j;
        if (r1 != r4) {
            f0.Z0(view, r4 - r1);
            gVar.j = r4;
        }
    }

    private void c0() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (!f0.R(this)) {
            f0.T1(this, null);
            return;
        }
        if (this.v == null) {
            this.v = new a();
        }
        f0.T1(this, this.v);
        setSystemUiVisibility(1280);
    }

    @h0
    private static Rect e() {
        Rect rectB = H.b();
        return rectB == null ? new Rect() : rectB;
    }

    private static int g(int r0, int r1, int r2) {
        return r0 < r1 ? r1 : r0 > r2 ? r2 : r0;
    }

    private void h(g gVar, Rect rect, int r8, int r9) {
        int width = getWidth();
        int height = getHeight();
        int r0 = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - r8) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin));
        int r6 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - r9) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin));
        rect.set(r0, r6, r8 + r0, r9 + r6);
    }

    private o0 i(o0 o0Var) {
        c cVarF;
        if (o0Var.x()) {
            return o0Var;
        }
        int childCount = getChildCount();
        for (int r0 = 0; r0 < childCount; r0++) {
            View childAt = getChildAt(r0);
            if (f0.R(childAt) && (cVarF = ((g) childAt.getLayoutParams()).f()) != null) {
                o0Var = cVarF.g(this, childAt, o0Var);
                if (o0Var.x()) {
                    break;
                }
            }
        }
        return o0Var;
    }

    void C(View view, Rect rect) {
        rect.set(((g) view.getLayoutParams()).h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    g D(View view) {
        g gVar = (g) view.getLayoutParams();
        if (!gVar.f248b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e(x, "Attached behavior class is null");
                }
                gVar.q(behavior);
            } else {
                d dVar = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    dVar = (d) superclass.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        gVar.q(dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e2) {
                        Log.e(x, "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                    }
                }
            }
            gVar.f248b = true;
        }
        return gVar;
    }

    public boolean G(@h0 View view, int r3, int r4) {
        Rect rectE = e();
        y(view, rectE);
        try {
            return rectE.contains(r3, r4);
        } finally {
            T(rectE);
        }
    }

    void L(View view, int r18) {
        c cVarF;
        g gVar = (g) view.getLayoutParams();
        if (gVar.k != null) {
            Rect rectE = e();
            Rect rectE2 = e();
            Rect rectE3 = e();
            y(gVar.k, rectE);
            v(view, false, rectE2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            A(view, r18, rectE, rectE3, gVar, measuredWidth, measuredHeight);
            boolean z2 = (rectE3.left == rectE2.left && rectE3.top == rectE2.top) ? false : true;
            h(gVar, rectE3, measuredWidth, measuredHeight);
            int r0 = rectE3.left - rectE2.left;
            int r1 = rectE3.top - rectE2.top;
            if (r0 != 0) {
                f0.Y0(view, r0);
            }
            if (r1 != 0) {
                f0.Z0(view, r1);
            }
            if (z2 && (cVarF = gVar.f()) != null) {
                cVarF.i(this, view, gVar.k);
            }
            T(rectE);
            T(rectE2);
            T(rectE3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void M(int r18) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.M(int):void");
    }

    public void N(@h0 View view, int r4) {
        g gVar = (g) view.getLayoutParams();
        if (gVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = gVar.k;
        if (view2 != null) {
            I(view, view2, r4);
            return;
        }
        int r0 = gVar.e;
        if (r0 >= 0) {
            J(view, r0, r4);
        } else {
            H(view, r4);
        }
    }

    public void O(View view, int r2, int r3, int r4, int r5) {
        measureChildWithMargins(view, r2, r3, r4, r5);
    }

    void S(View view, Rect rect) {
        ((g) view.getLayoutParams()).s(rect);
    }

    void U() {
        if (this.l && this.p != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.p);
        }
        this.q = false;
    }

    final o0 b0(o0 o0Var) {
        if (b.i.o.e.a(this.r, o0Var)) {
            return o0Var;
        }
        this.r = o0Var;
        boolean z2 = o0Var != null && o0Var.o() > 0;
        this.s = z2;
        setWillNotDraw(!z2 && getBackground() == null);
        o0 o0VarI = i(o0Var);
        requestLayout();
        return o0VarI;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j2) {
        g gVar = (g) view.getLayoutParams();
        c cVar = gVar.f247a;
        if (cVar != null) {
            float fD = cVar.d(this, view);
            if (fD > 0.0f) {
                if (this.h == null) {
                    this.h = new Paint();
                }
                this.h.setColor(gVar.f247a.c(this, view));
                this.h.setAlpha(g(Math.round(fD * 255.0f), 0, 255));
                int r0 = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.h);
                canvas.restoreToCount(r0);
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.t;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    void f() {
        if (this.l) {
            if (this.p == null) {
                this.p = new h();
            }
            getViewTreeObserver().addOnPreDrawListener(this.p);
        }
        this.q = true;
    }

    @x0
    final List<View> getDependencySortedChildren() {
        R();
        return Collections.unmodifiableList(this.d);
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public final o0 getLastWindowInsets() {
        return this.r;
    }

    @Override // android.view.ViewGroup, b.i.p.w
    public int getNestedScrollAxes() {
        return this.w.a();
    }

    @i0
    public Drawable getStatusBarBackground() {
        return this.t;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void j(@h0 View view) {
        List listG = this.e.g(view);
        if (listG == null || listG.isEmpty()) {
            return;
        }
        for (int r1 = 0; r1 < listG.size(); r1++) {
            View view2 = (View) listG.get(r1);
            c cVarF = ((g) view2.getLayoutParams()).f();
            if (cVarF != null) {
                cVarF.i(this, view2, view);
            }
        }
    }

    @Override // b.i.p.u
    public void k(View view, View view2, int r12, int r13) {
        c cVarF;
        this.w.c(view, view2, r12, r13);
        this.o = view2;
        int childCount = getChildCount();
        for (int r1 = 0; r1 < childCount; r1++) {
            View childAt = getChildAt(r1);
            g gVar = (g) childAt.getLayoutParams();
            if (gVar.k(r13) && (cVarF = gVar.f()) != null) {
                cVarF.w(this, childAt, view, view2, r12, r13);
            }
        }
    }

    @Override // b.i.p.u
    public void l(View view, int r7) {
        this.w.e(view, r7);
        int childCount = getChildCount();
        for (int r1 = 0; r1 < childCount; r1++) {
            View childAt = getChildAt(r1);
            g gVar = (g) childAt.getLayoutParams();
            if (gVar.k(r7)) {
                c cVarF = gVar.f();
                if (cVarF != null) {
                    cVarF.D(this, childAt, view, r7);
                }
                gVar.m(r7);
                gVar.l();
            }
        }
        this.o = null;
    }

    @Override // b.i.p.u
    public void m(View view, int r18, int r19, int[] r20, int r21) {
        c cVarF;
        int childCount = getChildCount();
        boolean z2 = false;
        int r12 = 0;
        int r13 = 0;
        for (int r11 = 0; r11 < childCount; r11++) {
            View childAt = getChildAt(r11);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(r21) && (cVarF = gVar.f()) != null) {
                    int[] r6 = this.i;
                    r6[0] = 0;
                    r6[1] = 0;
                    cVarF.r(this, childAt, view, r18, r19, r6, r21);
                    int[] r0 = this.i;
                    r12 = r18 > 0 ? Math.max(r12, r0[0]) : Math.min(r12, r0[0]);
                    int[] r02 = this.i;
                    r13 = r19 > 0 ? Math.max(r13, r02[1]) : Math.min(r13, r02[1]);
                    z2 = true;
                }
            }
        }
        r20[0] = r12;
        r20[1] = r13;
        if (z2) {
            M(1);
        }
    }

    public boolean n(@h0 View view, @h0 View view2) {
        boolean z2 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect rectE = e();
        v(view, view.getParent() != this, rectE);
        Rect rectE2 = e();
        v(view2, view2.getParent() != this, rectE2);
        try {
            if (rectE.left <= rectE2.right && rectE.top <= rectE2.bottom && rectE.right >= rectE2.left) {
                if (rectE.bottom >= rectE2.top) {
                    z2 = true;
                }
            }
            return z2;
        } finally {
            T(rectE);
            T(rectE2);
        }
    }

    void o() {
        int childCount = getChildCount();
        boolean z2 = false;
        int r2 = 0;
        while (true) {
            if (r2 >= childCount) {
                break;
            }
            if (F(getChildAt(r2))) {
                z2 = true;
                break;
            }
            r2++;
        }
        if (z2 != this.q) {
            if (z2) {
                f();
            } else {
                U();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        V(false);
        if (this.q) {
            if (this.p == null) {
                this.p = new h();
            }
            getViewTreeObserver().addOnPreDrawListener(this.p);
        }
        if (this.r == null && f0.R(this)) {
            f0.o1(this);
        }
        this.l = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        V(false);
        if (this.q && this.p != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.p);
        }
        View view = this.o;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.l = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.s || this.t == null) {
            return;
        }
        o0 o0Var = this.r;
        int r0 = o0Var != null ? o0Var.o() : 0;
        if (r0 > 0) {
            this.t.setBounds(0, 0, getWidth(), r0);
            this.t.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            V(true);
        }
        boolean zQ = Q(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            V(true);
        }
        return zQ;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int r3, int r4, int r5, int r6) {
        c cVarF;
        int r2 = f0.W(this);
        int size = this.d.size();
        for (int r42 = 0; r42 < size; r42++) {
            View view = this.d.get(r42);
            if (view.getVisibility() != 8 && ((cVarF = ((g) view.getLayoutParams()).f()) == null || !cVarF.m(this, view, r2))) {
                N(view, r2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.i.p.w
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        c cVarF;
        int childCount = getChildCount();
        boolean zO = false;
        for (int r2 = 0; r2 < childCount; r2++) {
            View childAt = getChildAt(r2);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(0) && (cVarF = gVar.f()) != null) {
                    zO |= cVarF.o(this, childAt, view, f2, f3, z2);
                }
            }
        }
        if (zO) {
            M(1);
        }
        return zO;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.i.p.w
    public boolean onNestedPreFling(View view, float f2, float f3) {
        c cVarF;
        int childCount = getChildCount();
        boolean zP = false;
        for (int r2 = 0; r2 < childCount; r2++) {
            View childAt = getChildAt(r2);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(0) && (cVarF = gVar.f()) != null) {
                    zP |= cVarF.p(this, childAt, view, f2, f3);
                }
            }
        }
        return zP;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.i.p.w
    public void onNestedPreScroll(View view, int r8, int r9, int[] r10) {
        m(view, r8, r9, r10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.i.p.w
    public void onNestedScroll(View view, int r9, int r10, int r11, int r12) {
        s(view, r9, r10, r11, r12, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.i.p.w
    public void onNestedScrollAccepted(View view, View view2, int r4) {
        k(view, view2, r4, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        SparseArray<Parcelable> sparseArray = iVar.f;
        int childCount = getChildCount();
        for (int r0 = 0; r0 < childCount; r0++) {
            View childAt = getChildAt(r0);
            int id = childAt.getId();
            c cVarF = D(childAt).f();
            if (id != -1 && cVarF != null && (parcelable2 = sparseArray.get(id)) != null) {
                cVarF.y(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableZ;
        i iVar = new i(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int r3 = 0; r3 < childCount; r3++) {
            View childAt = getChildAt(r3);
            int id = childAt.getId();
            c cVarF = ((g) childAt.getLayoutParams()).f();
            if (id != -1 && cVarF != null && (parcelableZ = cVarF.z(this, childAt)) != null) {
                sparseArray.append(id, parcelableZ);
            }
        }
        iVar.f = sparseArray;
        return iVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.i.p.w
    public boolean onStartNestedScroll(View view, View view2, int r4) {
        return t(view, view2, r4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.i.p.w
    public void onStopNestedScroll(View view) {
        l(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r3
  0x002b: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:9:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.n
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.Q(r1, r4)
            if (r3 == 0) goto L2b
            goto L16
        L15:
            r3 = 0
        L16:
            android.view.View r6 = r0.n
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.g) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f()
            if (r6 == 0) goto L2b
            android.view.View r7 = r0.n
            boolean r6 = r6.E(r0, r7, r1)
            goto L2c
        L2b:
            r6 = 0
        L2c:
            android.view.View r7 = r0.n
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.V(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // b.i.p.v
    public void r(@h0 View view, int r19, int r20, int r21, int r22, int r23, @h0 int[] r24) {
        c cVarF;
        int childCount = getChildCount();
        boolean z2 = false;
        int r14 = 0;
        int r15 = 0;
        for (int r13 = 0; r13 < childCount; r13++) {
            View childAt = getChildAt(r13);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(r23) && (cVarF = gVar.f()) != null) {
                    int[] r7 = this.i;
                    r7[0] = 0;
                    r7[1] = 0;
                    cVarF.u(this, childAt, view, r19, r20, r21, r22, r23, r7);
                    int[] r0 = this.i;
                    r14 = r21 > 0 ? Math.max(r14, r0[0]) : Math.min(r14, r0[0]);
                    r15 = r22 > 0 ? Math.max(r15, this.i[1]) : Math.min(r15, this.i[1]);
                    z2 = true;
                }
            }
        }
        r24[0] = r24[0] + r14;
        r24[1] = r24[1] + r15;
        if (z2) {
            M(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        c cVarF = ((g) view.getLayoutParams()).f();
        if (cVarF == null || !cVarF.x(this, view, rect, z2)) {
            return super.requestChildRectangleOnScreen(view, rect, z2);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.k) {
            return;
        }
        V(false);
        this.k = true;
    }

    @Override // b.i.p.u
    public void s(View view, int r10, int r11, int r12, int r13, int r14) {
        r(view, r10, r11, r12, r13, 0, this.j);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        c0();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.u = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@i0 Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Drawable drawable2 = this.t;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.t = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.t.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.t, f0.W(this));
                this.t.setVisible(getVisibility() == 0, false);
                this.t.setCallback(this);
            }
            f0.g1(this);
        }
    }

    public void setStatusBarBackgroundColor(@k int r2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setStatusBarBackground(new ColorDrawable(r2));
    }

    public void setStatusBarBackgroundResource(@q int r2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setStatusBarBackground(r2 != 0 ? b.i.c.c.h(getContext(), r2) : null);
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
        super.setVisibility(r3);
        boolean z2 = r3 == 0;
        Drawable drawable = this.t;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.t.setVisible(z2, false);
    }

    @Override // b.i.p.u
    public boolean t(View view, View view2, int r17, int r18) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int r10 = 0; r10 < childCount; r10++) {
            View childAt = getChildAt(r10);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                c cVarF = gVar.f();
                if (cVarF != null) {
                    boolean zB = cVarF.B(this, childAt, view, view2, r17, r18);
                    z2 |= zB;
                    gVar.t(r18, zB);
                } else {
                    gVar.t(r18, false);
                }
            }
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    void v(View view, boolean z2, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            y(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.t;
    }

    @h0
    public List<View> w(@h0 View view) {
        List<View> listH = this.e.h(view);
        this.g.clear();
        if (listH != null) {
            this.g.addAll(listH);
        }
        return this.g;
    }

    @h0
    public List<View> x(@h0 View view) {
        List listG = this.e.g(view);
        this.g.clear();
        if (listG != null) {
            this.g.addAll(listG);
        }
        return this.g;
    }

    void y(View view, Rect rect) {
        androidx.coordinatorlayout.widget.b.a(this, view, rect);
    }

    void z(View view, int r13, Rect rect, Rect rect2) {
        g gVar = (g) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        A(view, r13, rect, rect2, gVar, measuredWidth, measuredHeight);
        h(gVar, rect2, measuredWidth, measuredHeight);
    }
}

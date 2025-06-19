package b.z.b;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k0;
import androidx.annotation.m0;
import androidx.annotation.p0;
import androidx.annotation.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import b.i.p.f0;
import b.i.p.p0.d;
import b.i.p.p0.g;
import b.z.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class h extends ViewGroup {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = -1;
    static boolean D = true;
    public static final int x = 0;
    public static final int y = 1;
    public static final int z = 0;
    private final Rect d;
    private final Rect e;
    private b.z.b.b f;
    int g;
    boolean h;
    private RecyclerView.i i;
    private LinearLayoutManager j;
    private int k;
    private Parcelable l;
    RecyclerView m;
    private x n;
    b.z.b.g o;
    private b.z.b.b p;
    private b.z.b.d q;
    private b.z.b.f r;
    private RecyclerView.l s;
    private boolean t;
    private boolean u;
    private int v;
    e w;

    class a extends g {
        a() {
            super(null);
        }

        @Override // b.z.b.h.g, androidx.recyclerview.widget.RecyclerView.i
        public void a() {
            h hVar = h.this;
            hVar.h = true;
            hVar.o.n();
        }
    }

    class b extends j {
        b() {
        }

        @Override // b.z.b.h.j
        public void a(int r1) {
            if (r1 == 0) {
                h.this.y();
            }
        }

        @Override // b.z.b.h.j
        public void c(int r3) {
            h hVar = h.this;
            if (hVar.g != r3) {
                hVar.g = r3;
                hVar.w.q();
            }
        }
    }

    class c extends j {
        c() {
        }

        @Override // b.z.b.h.j
        public void c(int r2) {
            h.this.clearFocus();
            if (h.this.hasFocus()) {
                h.this.m.requestFocus(2);
            }
        }
    }

    class d implements RecyclerView.q {
        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void b(@h0 View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) pVar).width != -1 || ((ViewGroup.MarginLayoutParams) pVar).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void d(@h0 View view) {
        }
    }

    private abstract class e {
        private e() {
        }

        /* synthetic */ e(h hVar, a aVar) {
            this();
        }

        boolean a() {
            return false;
        }

        boolean b(int r1) {
            return false;
        }

        boolean c(int r1, Bundle bundle) {
            return false;
        }

        boolean d() {
            return false;
        }

        void e(@i0 RecyclerView.g<?> gVar) {
        }

        void f(@i0 RecyclerView.g<?> gVar) {
        }

        String g() {
            throw new IllegalStateException("Not implemented.");
        }

        void h(@h0 b.z.b.b bVar, @h0 RecyclerView recyclerView) {
        }

        void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        void j(@h0 b.i.p.p0.d dVar) {
        }

        boolean k(int r2) {
            throw new IllegalStateException("Not implemented.");
        }

        boolean l(int r1, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        void m() {
        }

        CharSequence n() {
            throw new IllegalStateException("Not implemented.");
        }

        void o(@h0 AccessibilityEvent accessibilityEvent) {
        }

        void p() {
        }

        void q() {
        }

        void r() {
        }

        void s() {
        }
    }

    class f extends e {
        f() {
            super(h.this, null);
        }

        @Override // b.z.b.h.e
        public boolean b(int r2) {
            return (r2 == 8192 || r2 == 4096) && !h.this.l();
        }

        @Override // b.z.b.h.e
        public boolean d() {
            return true;
        }

        @Override // b.z.b.h.e
        public void j(@h0 b.i.p.p0.d dVar) {
            if (h.this.l()) {
                return;
            }
            dVar.I0(d.a.s);
            dVar.I0(d.a.r);
            dVar.C1(false);
        }

        @Override // b.z.b.h.e
        public boolean k(int r1) {
            if (b(r1)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // b.z.b.h.e
        public CharSequence n() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    private static abstract class g extends RecyclerView.i {
        private g() {
        }

        /* synthetic */ g(a aVar) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b(int r1, int r2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int r1, int r2, @i0 Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void d(int r1, int r2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int r1, int r2, int r3) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int r1, int r2) {
            a();
        }
    }

    /* renamed from: b.z.b.h$h, reason: collision with other inner class name */
    private class C0117h extends LinearLayoutManager {
        C0117h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public boolean M1(@h0 RecyclerView recyclerView, @h0 View view, @h0 Rect rect, boolean z, boolean z2) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void e1(@h0 RecyclerView.w wVar, @h0 RecyclerView.c0 c0Var, @h0 b.i.p.p0.d dVar) {
            super.e1(wVar, c0Var, dVar);
            h.this.w.j(dVar);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void k2(@h0 RecyclerView.c0 c0Var, @h0 int[] r4) {
            int offscreenPageLimit = h.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.k2(c0Var, r4);
                return;
            }
            int pageSize = h.this.getPageSize() * offscreenPageLimit;
            r4[0] = pageSize;
            r4[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public boolean y1(@h0 RecyclerView.w wVar, @h0 RecyclerView.c0 c0Var, int r4, @i0 Bundle bundle) {
            return h.this.w.b(r4) ? h.this.w.k(r4) : super.y1(wVar, c0Var, r4, bundle);
        }
    }

    @z(from = 1)
    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface i {
    }

    public static abstract class j {
        public void a(int r1) {
        }

        public void b(int r1, float f, @k0 int r3) {
        }

        public void c(int r1) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface k {
    }

    class l extends e {

        /* renamed from: b, reason: collision with root package name */
        private final b.i.p.p0.g f1577b;

        /* renamed from: c, reason: collision with root package name */
        private final b.i.p.p0.g f1578c;
        private RecyclerView.i d;

        class a implements b.i.p.p0.g {
            a() {
            }

            @Override // b.i.p.p0.g
            public boolean a(@h0 View view, @i0 g.a aVar) {
                l.this.v(((h) view).getCurrentItem() + 1);
                return true;
            }
        }

        class b implements b.i.p.p0.g {
            b() {
            }

            @Override // b.i.p.p0.g
            public boolean a(@h0 View view, @i0 g.a aVar) {
                l.this.v(((h) view).getCurrentItem() - 1);
                return true;
            }
        }

        class c extends g {
            c() {
                super(null);
            }

            @Override // b.z.b.h.g, androidx.recyclerview.widget.RecyclerView.i
            public void a() {
                l.this.w();
            }
        }

        l() {
            super(h.this, null);
            this.f1577b = new a();
            this.f1578c = new b();
        }

        private void t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int r0;
            int r2;
            if (h.this.getAdapter() == null) {
                r0 = 0;
            } else {
                if (h.this.getOrientation() != 1) {
                    r2 = h.this.getAdapter().e();
                    r0 = 0;
                    b.i.p.p0.d.T1(accessibilityNodeInfo).V0(d.b.f(r0, r2, false, 0));
                }
                r0 = h.this.getAdapter().e();
            }
            r2 = 0;
            b.i.p.p0.d.T1(accessibilityNodeInfo).V0(d.b.f(r0, r2, false, 0));
        }

        private void u(AccessibilityNodeInfo accessibilityNodeInfo) {
            int r0;
            RecyclerView.g adapter = h.this.getAdapter();
            if (adapter == null || (r0 = adapter.e()) == 0 || !h.this.l()) {
                return;
            }
            if (h.this.g > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (h.this.g < r0 - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }

        @Override // b.z.b.h.e
        public boolean a() {
            return true;
        }

        @Override // b.z.b.h.e
        public boolean c(int r1, Bundle bundle) {
            return r1 == 8192 || r1 == 4096;
        }

        @Override // b.z.b.h.e
        public void e(@i0 RecyclerView.g<?> gVar) {
            w();
            if (gVar != null) {
                gVar.C(this.d);
            }
        }

        @Override // b.z.b.h.e
        public void f(@i0 RecyclerView.g<?> gVar) {
            if (gVar != null) {
                gVar.E(this.d);
            }
        }

        @Override // b.z.b.h.e
        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // b.z.b.h.e
        public void h(@h0 b.z.b.b bVar, @h0 RecyclerView recyclerView) {
            f0.K1(recyclerView, 2);
            this.d = new c();
            if (f0.S(h.this) == 0) {
                f0.K1(h.this, 1);
            }
        }

        @Override // b.z.b.h.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            t(accessibilityNodeInfo);
            if (Build.VERSION.SDK_INT >= 16) {
                u(accessibilityNodeInfo);
            }
        }

        @Override // b.z.b.h.e
        public boolean l(int r2, Bundle bundle) {
            if (!c(r2, bundle)) {
                throw new IllegalStateException();
            }
            v(r2 == 8192 ? h.this.getCurrentItem() - 1 : h.this.getCurrentItem() + 1);
            return true;
        }

        @Override // b.z.b.h.e
        public void m() {
            w();
        }

        @Override // b.z.b.h.e
        public void o(@h0 AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(h.this);
            accessibilityEvent.setClassName(g());
        }

        @Override // b.z.b.h.e
        public void p() {
            w();
        }

        @Override // b.z.b.h.e
        public void q() {
            w();
        }

        @Override // b.z.b.h.e
        public void r() {
            w();
        }

        @Override // b.z.b.h.e
        public void s() {
            w();
            if (Build.VERSION.SDK_INT < 21) {
                h.this.sendAccessibilityEvent(2048);
            }
        }

        void v(int r3) {
            if (h.this.l()) {
                h.this.t(r3, true);
            }
        }

        void w() {
            int r5;
            h hVar = h.this;
            int r1 = R.id.accessibilityActionPageLeft;
            f0.k1(hVar, R.id.accessibilityActionPageLeft);
            f0.k1(hVar, R.id.accessibilityActionPageRight);
            f0.k1(hVar, R.id.accessibilityActionPageUp);
            f0.k1(hVar, R.id.accessibilityActionPageDown);
            if (h.this.getAdapter() == null || (r5 = h.this.getAdapter().e()) == 0 || !h.this.l()) {
                return;
            }
            if (h.this.getOrientation() != 0) {
                if (h.this.g < r5 - 1) {
                    f0.n1(hVar, new d.a(R.id.accessibilityActionPageDown, null), null, this.f1577b);
                }
                if (h.this.g > 0) {
                    f0.n1(hVar, new d.a(R.id.accessibilityActionPageUp, null), null, this.f1578c);
                    return;
                }
                return;
            }
            boolean zK = h.this.k();
            int r4 = zK ? R.id.accessibilityActionPageLeft : R.id.accessibilityActionPageRight;
            if (zK) {
                r1 = R.id.accessibilityActionPageRight;
            }
            if (h.this.g < r5 - 1) {
                f0.n1(hVar, new d.a(r4, null), null, this.f1577b);
            }
            if (h.this.g > 0) {
                f0.n1(hVar, new d.a(r1, null), null, this.f1578c);
            }
        }
    }

    public interface m {
        void a(@h0 View view, float f);
    }

    private class n extends x {
        n() {
        }

        @Override // androidx.recyclerview.widget.x, androidx.recyclerview.widget.b0
        @i0
        public View h(RecyclerView.o oVar) {
            if (h.this.j()) {
                return null;
            }
            return super.h(oVar);
        }
    }

    private class o extends RecyclerView {
        o(@h0 Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        @m0(23)
        public CharSequence getAccessibilityClassName() {
            return h.this.w.d() ? h.this.w.n() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(@h0 AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(h.this.g);
            accessibilityEvent.setToIndex(h.this.g);
            h.this.w.o(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return h.this.l() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return h.this.l() && super.onTouchEvent(motionEvent);
        }
    }

    static class p extends View.BaseSavedState {
        public static final Parcelable.Creator<p> CREATOR = new a();
        int d;
        int e;
        Parcelable f;

        static class a implements Parcelable.ClassLoaderCreator<p> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new p(parcel, classLoader) : new p(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public p[] newArray(int r1) {
                return new p[r1];
            }
        }

        p(Parcel parcel) {
            super(parcel);
            a(parcel, null);
        }

        @m0(24)
        p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        p(Parcelable parcelable) {
            super(parcelable);
        }

        private void a(Parcel parcel, ClassLoader classLoader) {
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int r3) {
            super.writeToParcel(parcel, r3);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeParcelable(this.f, r3);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface q {
    }

    private static class r implements Runnable {
        private final int d;
        private final RecyclerView e;

        r(int r1, RecyclerView recyclerView) {
            this.d = r1;
            this.e = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.e.K1(this.d);
        }
    }

    public h(@h0 Context context) throws IllegalStateException {
        super(context);
        this.d = new Rect();
        this.e = new Rect();
        this.f = new b.z.b.b(3);
        this.h = false;
        this.i = new a();
        this.k = -1;
        this.s = null;
        this.t = false;
        this.u = true;
        this.v = -1;
        h(context, null);
    }

    public h(@h0 Context context, @i0 AttributeSet attributeSet) throws IllegalStateException {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = new Rect();
        this.f = new b.z.b.b(3);
        this.h = false;
        this.i = new a();
        this.k = -1;
        this.s = null;
        this.t = false;
        this.u = true;
        this.v = -1;
        h(context, attributeSet);
    }

    public h(@h0 Context context, @i0 AttributeSet attributeSet, int r5) throws IllegalStateException {
        super(context, attributeSet, r5);
        this.d = new Rect();
        this.e = new Rect();
        this.f = new b.z.b.b(3);
        this.h = false;
        this.i = new a();
        this.k = -1;
        this.s = null;
        this.t = false;
        this.u = true;
        this.v = -1;
        h(context, attributeSet);
    }

    @m0(21)
    public h(@h0 Context context, @i0 AttributeSet attributeSet, int r4, int r5) throws IllegalStateException {
        super(context, attributeSet, r4, r5);
        this.d = new Rect();
        this.e = new Rect();
        this.f = new b.z.b.b(3);
        this.h = false;
        this.i = new a();
        this.k = -1;
        this.s = null;
        this.t = false;
        this.u = true;
        this.v = -1;
        h(context, attributeSet);
    }

    private RecyclerView.q e() {
        return new d();
    }

    private void h(Context context, AttributeSet attributeSet) throws IllegalStateException {
        this.w = D ? new l() : new f();
        o oVar = new o(context);
        this.m = oVar;
        oVar.setId(f0.B());
        this.m.setDescendantFocusability(131072);
        C0117h c0117h = new C0117h(context);
        this.j = c0117h;
        this.m.setLayoutManager(c0117h);
        this.m.setScrollingTouchSlop(1);
        u(context, attributeSet);
        this.m.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.m.p(e());
        b.z.b.g gVar = new b.z.b.g(this);
        this.o = gVar;
        this.q = new b.z.b.d(this, gVar, this.m);
        n nVar = new n();
        this.n = nVar;
        nVar.b(this.m);
        this.m.r(this.o);
        b.z.b.b bVar = new b.z.b.b(3);
        this.p = bVar;
        this.o.r(bVar);
        b bVar2 = new b();
        c cVar = new c();
        this.p.d(bVar2);
        this.p.d(cVar);
        this.w.h(this.p, this.m);
        this.p.d(this.f);
        b.z.b.f fVar = new b.z.b.f(this.j);
        this.r = fVar;
        this.p.d(fVar);
        RecyclerView recyclerView = this.m;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void m(@i0 RecyclerView.g<?> gVar) {
        if (gVar != null) {
            gVar.C(this.i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void r() {
        RecyclerView.g adapter;
        if (this.k == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.l;
        if (parcelable != null) {
            if (adapter instanceof androidx.viewpager2.adapter.b) {
                ((androidx.viewpager2.adapter.b) adapter).b(parcelable);
            }
            this.l = null;
        }
        int r0 = Math.max(0, Math.min(this.k, adapter.e() - 1));
        this.g = r0;
        this.k = -1;
        this.m.C1(r0);
        this.w.m();
    }

    private void u(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.ViewPager2);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, a.j.ViewPager2, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(a.j.ViewPager2_android_orientation, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void w(@i0 RecyclerView.g<?> gVar) {
        if (gVar != null) {
            gVar.E(this.i);
        }
    }

    public void a(@h0 RecyclerView.n nVar) {
        this.m.n(nVar);
    }

    public void b(@h0 RecyclerView.n nVar, int r3) {
        this.m.o(nVar, r3);
    }

    public boolean c() {
        return this.q.b();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int r2) {
        return this.m.canScrollHorizontally(r2);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int r2) {
        return this.m.canScrollVertically(r2);
    }

    public boolean d() {
        return this.q.d();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof p) {
            int r0 = ((p) parcelable).d;
            sparseArray.put(this.m.getId(), sparseArray.get(r0));
            sparseArray.remove(r0);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        r();
    }

    public boolean f(@k0 @SuppressLint({"SupportAnnotationUsage"}) float f2) {
        return this.q.e(f2);
    }

    @h0
    public RecyclerView.n g(int r2) {
        return this.m.z0(r2);
    }

    @Override // android.view.ViewGroup, android.view.View
    @m0(23)
    public CharSequence getAccessibilityClassName() {
        return this.w.a() ? this.w.g() : super.getAccessibilityClassName();
    }

    @i0
    public RecyclerView.g getAdapter() {
        return this.m.getAdapter();
    }

    public int getCurrentItem() {
        return this.g;
    }

    public int getItemDecorationCount() {
        return this.m.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.v;
    }

    public int getOrientation() {
        return this.j.Q2();
    }

    int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.m;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.o.h();
    }

    public void i() {
        this.m.J0();
    }

    public boolean j() {
        return this.q.f();
    }

    boolean k() {
        return this.j.i0() == 1;
    }

    public boolean l() {
        return this.u;
    }

    public void n(@h0 j jVar) {
        this.f.d(jVar);
    }

    public void o(@h0 RecyclerView.n nVar) {
        this.m.p1(nVar);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.w.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int r5, int r6, int r7, int r8) {
        int measuredWidth = this.m.getMeasuredWidth();
        int measuredHeight = this.m.getMeasuredHeight();
        this.d.left = getPaddingLeft();
        this.d.right = (r7 - r5) - getPaddingRight();
        this.d.top = getPaddingTop();
        this.d.bottom = (r8 - r6) - getPaddingBottom();
        Gravity.apply(c.a.b.c.c.a.u, measuredWidth, measuredHeight, this.d, this.e);
        RecyclerView recyclerView = this.m;
        Rect rect = this.e;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.h) {
            y();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int r6, int r7) {
        measureChild(this.m, r6, r7);
        int measuredWidth = this.m.getMeasuredWidth();
        int measuredHeight = this.m.getMeasuredHeight();
        int measuredState = this.m.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), r6, measuredState), ViewGroup.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), r7, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.getSuperState());
        this.k = pVar.e;
        this.l = pVar.f;
    }

    @Override // android.view.View
    @i0
    protected Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.d = this.m.getId();
        int r0 = this.k;
        if (r0 == -1) {
            r0 = this.g;
        }
        pVar.e = r0;
        Parcelable parcelableA = this.l;
        if (parcelableA != null) {
            pVar.f = parcelableA;
        } else {
            Object adapter = this.m.getAdapter();
            if (adapter instanceof androidx.viewpager2.adapter.b) {
                parcelableA = ((androidx.viewpager2.adapter.b) adapter).a();
                pVar.f = parcelableA;
            }
        }
        return pVar;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(h.class.getSimpleName() + " does not support direct child views");
    }

    public void p(int r2) {
        this.m.q1(r2);
    }

    @Override // android.view.View
    @m0(16)
    public boolean performAccessibilityAction(int r2, Bundle bundle) {
        return this.w.c(r2, bundle) ? this.w.l(r2, bundle) : super.performAccessibilityAction(r2, bundle);
    }

    public void q() {
        if (this.r.d() == null) {
            return;
        }
        double dG = this.o.g();
        int r2 = (int) dG;
        float f2 = (float) (dG - r2);
        this.r.b(r2, f2, Math.round(getPageSize() * f2));
    }

    public void s(int r2, boolean z2) {
        if (j()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        t(r2, z2);
    }

    public void setAdapter(@i0 RecyclerView.g gVar) {
        RecyclerView.g adapter = this.m.getAdapter();
        this.w.f(adapter);
        w(adapter);
        this.m.setAdapter(gVar);
        this.g = 0;
        r();
        this.w.e(gVar);
        m(gVar);
    }

    public void setCurrentItem(int r2) {
        s(r2, true);
    }

    @Override // android.view.View
    @m0(17)
    public void setLayoutDirection(int r1) {
        super.setLayoutDirection(r1);
        this.w.p();
    }

    public void setOffscreenPageLimit(int r2) {
        if (r2 < 1 && r2 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.v = r2;
        this.m.requestLayout();
    }

    public void setOrientation(int r2) {
        this.j.j3(r2);
        this.w.r();
    }

    public void setPageTransformer(@i0 m mVar) {
        boolean z2 = this.t;
        if (mVar != null) {
            if (!z2) {
                this.s = this.m.getItemAnimator();
                this.t = true;
            }
            this.m.setItemAnimator(null);
        } else if (z2) {
            this.m.setItemAnimator(this.s);
            this.s = null;
            this.t = false;
        }
        if (mVar == this.r.d()) {
            return;
        }
        this.r.e(mVar);
        q();
    }

    public void setUserInputEnabled(boolean z2) {
        this.u = z2;
        this.w.s();
    }

    void t(int r9, boolean z2) {
        RecyclerView.g adapter = getAdapter();
        if (adapter == null) {
            if (this.k != -1) {
                this.k = Math.max(r9, 0);
                return;
            }
            return;
        }
        if (adapter.e() <= 0) {
            return;
        }
        int r92 = Math.min(Math.max(r9, 0), adapter.e() - 1);
        if (r92 == this.g && this.o.k()) {
            return;
        }
        if (r92 == this.g && z2) {
            return;
        }
        double dG = this.g;
        this.g = r92;
        this.w.q();
        if (!this.o.k()) {
            dG = this.o.g();
        }
        this.o.p(r92, z2);
        if (!z2) {
            this.m.C1(r92);
            return;
        }
        double d2 = r92;
        if (Math.abs(d2 - dG) <= 3.0d) {
            this.m.K1(r92);
            return;
        }
        this.m.C1(d2 > dG ? r92 - 3 : r92 + 3);
        RecyclerView recyclerView = this.m;
        recyclerView.post(new r(r92, recyclerView));
    }

    void v() {
        View viewH = this.n.h(this.j);
        if (viewH == null) {
            return;
        }
        int[] r0 = this.n.c(this.j, viewH);
        if (r0[0] == 0 && r0[1] == 0) {
            return;
        }
        this.m.G1(r0[0], r0[1]);
    }

    public void x(@h0 j jVar) {
        this.f.e(jVar);
    }

    void y() {
        x xVar = this.n;
        if (xVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewH = xVar.h(this.j);
        if (viewH == null) {
            return;
        }
        int r0 = this.j.s0(viewH);
        if (r0 != this.g && getScrollState() == 0) {
            this.p.c(r0);
        }
        this.h = false;
    }
}

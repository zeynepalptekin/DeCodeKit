package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.recyclerview.widget.RecyclerView;
import b.i.p.p0.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.b0.b {
    private static final String Q = "StaggeredGridLManager";
    static final boolean R = false;
    public static final int S = 0;
    public static final int T = 1;
    public static final int U = 0;

    @Deprecated
    public static final int V = 1;
    public static final int W = 2;
    static final int X = Integer.MIN_VALUE;
    private static final float Y = 0.33333334f;
    private BitSet B;
    private boolean G;
    private boolean H;
    private e I;
    private int J;
    private int[] O;
    f[] t;

    @androidx.annotation.h0
    w u;

    @androidx.annotation.h0
    w v;
    private int w;
    private int x;

    @androidx.annotation.h0
    private final p y;
    private int s = -1;
    boolean z = false;
    boolean A = false;
    int C = -1;
    int D = Integer.MIN_VALUE;
    d E = new d();
    private int F = 2;
    private final Rect K = new Rect();
    private final b L = new b();
    private boolean M = false;
    private boolean N = true;
    private final Runnable P = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.q2();
        }
    }

    class b {

        /* renamed from: a, reason: collision with root package name */
        int f597a;

        /* renamed from: b, reason: collision with root package name */
        int f598b;

        /* renamed from: c, reason: collision with root package name */
        boolean f599c;
        boolean d;
        boolean e;
        int[] f;

        b() {
            c();
        }

        void a() {
            this.f598b = this.f599c ? StaggeredGridLayoutManager.this.u.i() : StaggeredGridLayoutManager.this.u.n();
        }

        void b(int r2) {
            this.f598b = this.f599c ? StaggeredGridLayoutManager.this.u.i() - r2 : StaggeredGridLayoutManager.this.u.n() + r2;
        }

        void c() {
            this.f597a = -1;
            this.f598b = Integer.MIN_VALUE;
            this.f599c = false;
            this.d = false;
            this.e = false;
            int[] r1 = this.f;
            if (r1 != null) {
                Arrays.fill(r1, -1);
            }
        }

        void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] r1 = this.f;
            if (r1 == null || r1.length < length) {
                this.f = new int[StaggeredGridLayoutManager.this.t.length];
            }
            for (int r12 = 0; r12 < length; r12++) {
                this.f[r12] = fVarArr[r12].u(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.p {
        public static final int g = -1;
        f e;
        boolean f;

        public c(int r1, int r2) {
            super(r1, r2);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(RecyclerView.p pVar) {
            super(pVar);
        }

        public final int h() {
            f fVar = this.e;
            if (fVar == null) {
                return -1;
            }
            return fVar.e;
        }

        public boolean i() {
            return this.f;
        }

        public void j(boolean z) {
            this.f = z;
        }
    }

    static class d {

        /* renamed from: c, reason: collision with root package name */
        private static final int f600c = 10;

        /* renamed from: a, reason: collision with root package name */
        int[] f601a;

        /* renamed from: b, reason: collision with root package name */
        List<a> f602b;

        @SuppressLint({"BanParcelableUsage"})
        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0031a();
            int d;
            int e;
            int[] f;
            boolean g;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            static class C0031a implements Parcelable.Creator<a> {
                C0031a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int r1) {
                    return new a[r1];
                }
            }

            a() {
            }

            a(Parcel parcel) {
                this.d = parcel.readInt();
                this.e = parcel.readInt();
                this.g = parcel.readInt() == 1;
                int r0 = parcel.readInt();
                if (r0 > 0) {
                    int[] r02 = new int[r0];
                    this.f = r02;
                    parcel.readIntArray(r02);
                }
            }

            int a(int r2) {
                int[] r0 = this.f;
                if (r0 == null) {
                    return 0;
                }
                return r0[r2];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.d + ", mGapDir=" + this.e + ", mHasUnwantedGapAfter=" + this.g + ", mGapPerSpan=" + Arrays.toString(this.f) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int r3) {
                parcel.writeInt(this.d);
                parcel.writeInt(this.e);
                parcel.writeInt(this.g ? 1 : 0);
                int[] r32 = this.f;
                if (r32 == null || r32.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(r32.length);
                    parcel.writeIntArray(this.f);
                }
            }
        }

        d() {
        }

        private int i(int r5) {
            if (this.f602b == null) {
                return -1;
            }
            a aVarF = f(r5);
            if (aVarF != null) {
                this.f602b.remove(aVarF);
            }
            int size = this.f602b.size();
            int r2 = 0;
            while (true) {
                if (r2 >= size) {
                    r2 = -1;
                    break;
                }
                if (this.f602b.get(r2).d >= r5) {
                    break;
                }
                r2++;
            }
            if (r2 == -1) {
                return -1;
            }
            a aVar = this.f602b.get(r2);
            this.f602b.remove(r2);
            return aVar.d;
        }

        private void l(int r4, int r5) {
            List<a> list = this.f602b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f602b.get(size);
                int r2 = aVar.d;
                if (r2 >= r4) {
                    aVar.d = r2 + r5;
                }
            }
        }

        private void m(int r5, int r6) {
            List<a> list = this.f602b;
            if (list == null) {
                return;
            }
            int r1 = r5 + r6;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f602b.get(size);
                int r3 = aVar.d;
                if (r3 >= r5) {
                    if (r3 < r1) {
                        this.f602b.remove(size);
                    } else {
                        aVar.d = r3 - r6;
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.f602b == null) {
                this.f602b = new ArrayList();
            }
            int size = this.f602b.size();
            for (int r1 = 0; r1 < size; r1++) {
                a aVar2 = this.f602b.get(r1);
                if (aVar2.d == aVar.d) {
                    this.f602b.remove(r1);
                }
                if (aVar2.d >= aVar.d) {
                    this.f602b.add(r1, aVar);
                    return;
                }
            }
            this.f602b.add(aVar);
        }

        void b() {
            int[] r0 = this.f601a;
            if (r0 != null) {
                Arrays.fill(r0, -1);
            }
            this.f602b = null;
        }

        void c(int r5) {
            int[] r0 = this.f601a;
            if (r0 == null) {
                int[] r52 = new int[Math.max(r5, 10) + 1];
                this.f601a = r52;
                Arrays.fill(r52, -1);
            } else if (r5 >= r0.length) {
                int[] r53 = new int[o(r5)];
                this.f601a = r53;
                System.arraycopy(r0, 0, r53, 0, r0.length);
                int[] r54 = this.f601a;
                Arrays.fill(r54, r0.length, r54.length, -1);
            }
        }

        int d(int r3) {
            List<a> list = this.f602b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f602b.get(size).d >= r3) {
                        this.f602b.remove(size);
                    }
                }
            }
            return h(r3);
        }

        public a e(int r6, int r7, int r8, boolean z) {
            List<a> list = this.f602b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int r2 = 0; r2 < size; r2++) {
                a aVar = this.f602b.get(r2);
                int r4 = aVar.d;
                if (r4 >= r7) {
                    return null;
                }
                if (r4 >= r6 && (r8 == 0 || aVar.e == r8 || (z && aVar.g))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int r5) {
            List<a> list = this.f602b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f602b.get(size);
                if (aVar.d == r5) {
                    return aVar;
                }
            }
            return null;
        }

        int g(int r3) {
            int[] r0 = this.f601a;
            if (r0 == null || r3 >= r0.length) {
                return -1;
            }
            return r0[r3];
        }

        int h(int r4) {
            int[] r0 = this.f601a;
            if (r0 == null || r4 >= r0.length) {
                return -1;
            }
            int i = i(r4);
            if (i == -1) {
                int[] r02 = this.f601a;
                Arrays.fill(r02, r4, r02.length, -1);
                return this.f601a.length;
            }
            int r03 = i + 1;
            Arrays.fill(this.f601a, r4, r03, -1);
            return r03;
        }

        void j(int r4, int r5) {
            int[] r0 = this.f601a;
            if (r0 == null || r4 >= r0.length) {
                return;
            }
            int r02 = r4 + r5;
            c(r02);
            int[] r1 = this.f601a;
            System.arraycopy(r1, r4, r1, r02, (r1.length - r4) - r5);
            Arrays.fill(this.f601a, r4, r02, -1);
            l(r4, r5);
        }

        void k(int r5, int r6) {
            int[] r0 = this.f601a;
            if (r0 == null || r5 >= r0.length) {
                return;
            }
            int r02 = r5 + r6;
            c(r02);
            int[] r1 = this.f601a;
            System.arraycopy(r1, r02, r1, r5, (r1.length - r5) - r6);
            int[] r03 = this.f601a;
            Arrays.fill(r03, r03.length - r6, r03.length, -1);
            m(r5, r6);
        }

        void n(int r2, f fVar) {
            c(r2);
            this.f601a[r2] = fVar.e;
        }

        int o(int r2) {
            int length = this.f601a.length;
            while (length <= r2) {
                length *= 2;
            }
            return length;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @p0({p0.a.LIBRARY})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();
        int d;
        int e;
        int f;
        int[] g;
        int h;
        int[] i;
        List<d.a> j;
        boolean k;
        boolean l;
        boolean m;

        static class a implements Parcelable.Creator<e> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int r1) {
                return new e[r1];
            }
        }

        public e() {
        }

        e(Parcel parcel) {
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            int r0 = parcel.readInt();
            this.f = r0;
            if (r0 > 0) {
                int[] r02 = new int[r0];
                this.g = r02;
                parcel.readIntArray(r02);
            }
            int r03 = parcel.readInt();
            this.h = r03;
            if (r03 > 0) {
                int[] r04 = new int[r03];
                this.i = r04;
                parcel.readIntArray(r04);
            }
            this.k = parcel.readInt() == 1;
            this.l = parcel.readInt() == 1;
            this.m = parcel.readInt() == 1;
            this.j = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f = eVar.f;
            this.d = eVar.d;
            this.e = eVar.e;
            this.g = eVar.g;
            this.h = eVar.h;
            this.i = eVar.i;
            this.k = eVar.k;
            this.l = eVar.l;
            this.m = eVar.m;
            this.j = eVar.j;
        }

        void a() {
            this.g = null;
            this.f = 0;
            this.d = -1;
            this.e = -1;
        }

        void b() {
            this.g = null;
            this.f = 0;
            this.h = 0;
            this.i = null;
            this.j = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int r2) {
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            if (this.f > 0) {
                parcel.writeIntArray(this.g);
            }
            parcel.writeInt(this.h);
            if (this.h > 0) {
                parcel.writeIntArray(this.i);
            }
            parcel.writeInt(this.k ? 1 : 0);
            parcel.writeInt(this.l ? 1 : 0);
            parcel.writeInt(this.m ? 1 : 0);
            parcel.writeList(this.j);
        }
    }

    class f {
        static final int g = Integer.MIN_VALUE;

        /* renamed from: a, reason: collision with root package name */
        ArrayList<View> f603a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        int f604b = Integer.MIN_VALUE;

        /* renamed from: c, reason: collision with root package name */
        int f605c = Integer.MIN_VALUE;
        int d = 0;
        final int e;

        f(int r2) {
            this.e = r2;
        }

        void A(int r1) {
            this.f604b = r1;
            this.f605c = r1;
        }

        void a(View view) {
            c cVarS = s(view);
            cVarS.e = this;
            this.f603a.add(view);
            this.f605c = Integer.MIN_VALUE;
            if (this.f603a.size() == 1) {
                this.f604b = Integer.MIN_VALUE;
            }
            if (cVarS.e() || cVarS.d()) {
                this.d += StaggeredGridLayoutManager.this.u.e(view);
            }
        }

        void b(boolean z, int r5) {
            int r1 = z ? q(Integer.MIN_VALUE) : u(Integer.MIN_VALUE);
            e();
            if (r1 == Integer.MIN_VALUE) {
                return;
            }
            if (!z || r1 >= StaggeredGridLayoutManager.this.u.i()) {
                if (z || r1 <= StaggeredGridLayoutManager.this.u.n()) {
                    if (r5 != Integer.MIN_VALUE) {
                        r1 += r5;
                    }
                    this.f605c = r1;
                    this.f604b = r1;
                }
            }
        }

        void c() {
            d.a aVarF;
            ArrayList<View> arrayList = this.f603a;
            View view = arrayList.get(arrayList.size() - 1);
            c cVarS = s(view);
            this.f605c = StaggeredGridLayoutManager.this.u.d(view);
            if (cVarS.f && (aVarF = StaggeredGridLayoutManager.this.E.f(cVarS.b())) != null && aVarF.e == 1) {
                this.f605c += aVarF.a(this.e);
            }
        }

        void d() {
            d.a aVarF;
            View view = this.f603a.get(0);
            c cVarS = s(view);
            this.f604b = StaggeredGridLayoutManager.this.u.g(view);
            if (cVarS.f && (aVarF = StaggeredGridLayoutManager.this.E.f(cVarS.b())) != null && aVarF.e == -1) {
                this.f604b -= aVarF.a(this.e);
            }
        }

        void e() {
            this.f603a.clear();
            v();
            this.d = 0;
        }

        public int f() {
            int size;
            int size2;
            if (StaggeredGridLayoutManager.this.z) {
                size = this.f603a.size() - 1;
                size2 = -1;
            } else {
                size = 0;
                size2 = this.f603a.size();
            }
            return n(size, size2, true);
        }

        public int g() {
            int size;
            int size2;
            if (StaggeredGridLayoutManager.this.z) {
                size = this.f603a.size() - 1;
                size2 = -1;
            } else {
                size = 0;
                size2 = this.f603a.size();
            }
            return m(size, size2, true);
        }

        public int h() {
            return StaggeredGridLayoutManager.this.z ? n(this.f603a.size() - 1, -1, false) : n(0, this.f603a.size(), false);
        }

        public int i() {
            int size;
            int size2;
            if (StaggeredGridLayoutManager.this.z) {
                size = 0;
                size2 = this.f603a.size();
            } else {
                size = this.f603a.size() - 1;
                size2 = -1;
            }
            return n(size, size2, true);
        }

        public int j() {
            int size;
            int size2;
            if (StaggeredGridLayoutManager.this.z) {
                size = 0;
                size2 = this.f603a.size();
            } else {
                size = this.f603a.size() - 1;
                size2 = -1;
            }
            return m(size, size2, true);
        }

        public int k() {
            return StaggeredGridLayoutManager.this.z ? n(0, this.f603a.size(), false) : n(this.f603a.size() - 1, -1, false);
        }

        int l(int r11, int r12, boolean z, boolean z2, boolean z3) {
            int r0 = StaggeredGridLayoutManager.this.u.n();
            int i = StaggeredGridLayoutManager.this.u.i();
            int r4 = r12 > r11 ? 1 : -1;
            while (r11 != r12) {
                View view = this.f603a.get(r11);
                int r6 = StaggeredGridLayoutManager.this.u.g(view);
                int r7 = StaggeredGridLayoutManager.this.u.d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? r6 >= i : r6 > i;
                if (!z3 ? r7 > r0 : r7 >= r0) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (z && z2) {
                        if (r6 >= r0 && r7 <= i) {
                            return StaggeredGridLayoutManager.this.s0(view);
                        }
                    } else if (z2 || r6 < r0 || r7 > i) {
                        return StaggeredGridLayoutManager.this.s0(view);
                    }
                }
                r11 += r4;
            }
            return -1;
        }

        int m(int r7, int r8, boolean z) {
            return l(r7, r8, false, false, z);
        }

        int n(int r7, int r8, boolean z) {
            return l(r7, r8, z, true, false);
        }

        public int o() {
            return this.d;
        }

        int p() {
            int r0 = this.f605c;
            if (r0 != Integer.MIN_VALUE) {
                return r0;
            }
            c();
            return this.f605c;
        }

        int q(int r3) {
            int r0 = this.f605c;
            if (r0 != Integer.MIN_VALUE) {
                return r0;
            }
            if (this.f603a.size() == 0) {
                return r3;
            }
            c();
            return this.f605c;
        }

        public View r(int r6, int r7) {
            View view = null;
            if (r7 != -1) {
                int size = this.f603a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f603a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.z && staggeredGridLayoutManager.s0(view2) >= r6) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.z && staggeredGridLayoutManager2.s0(view2) <= r6) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f603a.size();
                int r0 = 0;
                while (r0 < size2) {
                    View view3 = this.f603a.get(r0);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.z && staggeredGridLayoutManager3.s0(view3) <= r6) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.z && staggeredGridLayoutManager4.s0(view3) >= r6) || !view3.hasFocusable()) {
                        break;
                    }
                    r0++;
                    view = view3;
                }
            }
            return view;
        }

        c s(View view) {
            return (c) view.getLayoutParams();
        }

        int t() {
            int r0 = this.f604b;
            if (r0 != Integer.MIN_VALUE) {
                return r0;
            }
            d();
            return this.f604b;
        }

        int u(int r3) {
            int r0 = this.f604b;
            if (r0 != Integer.MIN_VALUE) {
                return r0;
            }
            if (this.f603a.size() == 0) {
                return r3;
            }
            d();
            return this.f604b;
        }

        void v() {
            this.f604b = Integer.MIN_VALUE;
            this.f605c = Integer.MIN_VALUE;
        }

        void w(int r3) {
            int r0 = this.f604b;
            if (r0 != Integer.MIN_VALUE) {
                this.f604b = r0 + r3;
            }
            int r02 = this.f605c;
            if (r02 != Integer.MIN_VALUE) {
                this.f605c = r02 + r3;
            }
        }

        void x() {
            int size = this.f603a.size();
            View viewRemove = this.f603a.remove(size - 1);
            c cVarS = s(viewRemove);
            cVarS.e = null;
            if (cVarS.e() || cVarS.d()) {
                this.d -= StaggeredGridLayoutManager.this.u.e(viewRemove);
            }
            if (size == 1) {
                this.f604b = Integer.MIN_VALUE;
            }
            this.f605c = Integer.MIN_VALUE;
        }

        void y() {
            View viewRemove = this.f603a.remove(0);
            c cVarS = s(viewRemove);
            cVarS.e = null;
            if (this.f603a.size() == 0) {
                this.f605c = Integer.MIN_VALUE;
            }
            if (cVarS.e() || cVarS.d()) {
                this.d -= StaggeredGridLayoutManager.this.u.e(viewRemove);
            }
            this.f604b = Integer.MIN_VALUE;
        }

        void z(View view) {
            c cVarS = s(view);
            cVarS.e = this;
            this.f603a.add(0, view);
            this.f604b = Integer.MIN_VALUE;
            if (this.f603a.size() == 1) {
                this.f605c = Integer.MIN_VALUE;
            }
            if (cVarS.e() || cVarS.d()) {
                this.d += StaggeredGridLayoutManager.this.u.e(view);
            }
        }
    }

    public StaggeredGridLayoutManager(int r3, int r4) {
        this.w = r4;
        r3(r3);
        this.y = new p();
        y2();
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int r5, int r6) {
        RecyclerView.o.d dVarT0 = RecyclerView.o.t0(context, attributeSet, r5, r6);
        p3(dVarT0.f581a);
        r3(dVarT0.f582b);
        q3(dVarT0.f583c);
        this.y = new p();
        y2();
    }

    private int B2(int r5) {
        int r0 = Q();
        for (int r2 = 0; r2 < r0; r2++) {
            int r3 = s0(P(r2));
            if (r3 >= 0 && r3 < r5) {
                return r3;
            }
        }
        return 0;
    }

    private int H2(int r3) {
        for (int r0 = Q() - 1; r0 >= 0; r0--) {
            int r1 = s0(P(r0));
            if (r1 >= 0 && r1 < r3) {
                return r1;
            }
        }
        return 0;
    }

    private void J2(RecyclerView.w wVar, RecyclerView.c0 c0Var, boolean z) {
        int i;
        int r1 = O2(Integer.MIN_VALUE);
        if (r1 != Integer.MIN_VALUE && (i = this.u.i() - r1) > 0) {
            int r0 = i - (-l3(-i, wVar, c0Var));
            if (!z || r0 <= 0) {
                return;
            }
            this.u.t(r0);
        }
    }

    private void K2(RecyclerView.w wVar, RecyclerView.c0 c0Var, boolean z) {
        int r1;
        int r12 = R2(ActivityChooserView.f.j);
        if (r12 != Integer.MAX_VALUE && (r1 = r12 - this.u.n()) > 0) {
            int r13 = r1 - l3(r1, wVar, c0Var);
            if (!z || r13 <= 0) {
                return;
            }
            this.u.t(-r13);
        }
    }

    private int O2(int r4) {
        int r0 = this.t[0].q(r4);
        for (int r1 = 1; r1 < this.s; r1++) {
            int r2 = this.t[r1].q(r4);
            if (r2 > r0) {
                r0 = r2;
            }
        }
        return r0;
    }

    private int P2(int r4) {
        int r0 = this.t[0].u(r4);
        for (int r1 = 1; r1 < this.s; r1++) {
            int r2 = this.t[r1].u(r4);
            if (r2 > r0) {
                r0 = r2;
            }
        }
        return r0;
    }

    private int Q2(int r4) {
        int r0 = this.t[0].q(r4);
        for (int r1 = 1; r1 < this.s; r1++) {
            int r2 = this.t[r1].q(r4);
            if (r2 < r0) {
                r0 = r2;
            }
        }
        return r0;
    }

    private int R2(int r4) {
        int r0 = this.t[0].u(r4);
        for (int r1 = 1; r1 < this.s; r1++) {
            int r2 = this.t[r1].u(r4);
            if (r2 < r0) {
                r0 = r2;
            }
        }
        return r0;
    }

    private f S2(p pVar) {
        int r0;
        int r3;
        int r1 = -1;
        if (d3(pVar.e)) {
            r0 = this.s - 1;
            r3 = -1;
        } else {
            r0 = 0;
            r1 = this.s;
            r3 = 1;
        }
        f fVar = null;
        if (pVar.e == 1) {
            int r8 = ActivityChooserView.f.j;
            int r2 = this.u.n();
            while (r0 != r1) {
                f fVar2 = this.t[r0];
                int r6 = fVar2.q(r2);
                if (r6 < r8) {
                    fVar = fVar2;
                    r8 = r6;
                }
                r0 += r3;
            }
            return fVar;
        }
        int r82 = Integer.MIN_VALUE;
        int i = this.u.i();
        while (r0 != r1) {
            f fVar3 = this.t[r0];
            int r62 = fVar3.u(i);
            if (r62 > r82) {
                fVar = fVar3;
                r82 = r62;
            }
            r0 += r3;
        }
        return fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void W2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L9
            int r0 = r6.N2()
            goto Ld
        L9:
            int r0 = r6.L2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.E
            r7.j(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.k(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.j(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.A
            if (r7 == 0) goto L4d
            int r7 = r6.L2()
            goto L51
        L4d:
            int r7 = r6.N2()
        L51:
            if (r3 > r7) goto L56
            r6.N1()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.W2(int, int, int):void");
    }

    private void a3(View view, int r6, int r7, boolean z) {
        m(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int r1 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.K;
        int r62 = z3(r6, r1 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int r12 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.K;
        int r72 = z3(r7, r12 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z ? e2(view, r62, r72, cVar) : c2(view, r62, r72, cVar)) {
            view.measure(r62, r72);
        }
    }

    private void b3(View view, c cVar, boolean z) {
        int r0;
        int r8;
        if (cVar.f) {
            if (this.w != 1) {
                a3(view, RecyclerView.o.R(z0(), A0(), o0() + p0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.J, z);
                return;
            }
            r0 = this.J;
        } else {
            if (this.w != 1) {
                r0 = RecyclerView.o.R(z0(), A0(), o0() + p0(), ((ViewGroup.MarginLayoutParams) cVar).width, true);
                r8 = RecyclerView.o.R(this.x, f0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false);
                a3(view, r0, r8, z);
            }
            r0 = RecyclerView.o.R(this.x, A0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false);
        }
        r8 = RecyclerView.o.R(e0(), f0(), r0() + m0(), ((ViewGroup.MarginLayoutParams) cVar).height, true);
        a3(view, r0, r8, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c3(androidx.recyclerview.widget.RecyclerView.w r9, androidx.recyclerview.widget.RecyclerView.c0 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.c3(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$c0, boolean):void");
    }

    private boolean d3(int r5) {
        if (this.w == 0) {
            return (r5 == -1) != this.A;
        }
        return ((r5 == -1) == this.A) == Z2();
    }

    private void f3(View view) {
        for (int r0 = this.s - 1; r0 >= 0; r0--) {
            this.t[r0].z(view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0010, code lost:
    
        if (r4.e == (-1)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void g3(androidx.recyclerview.widget.RecyclerView.w r3, androidx.recyclerview.widget.p r4) {
        /*
            r2 = this;
            boolean r0 = r4.f727a
            if (r0 == 0) goto L4d
            boolean r0 = r4.i
            if (r0 == 0) goto L9
            goto L4d
        L9:
            int r0 = r4.f728b
            r1 = -1
            if (r0 != 0) goto L1e
            int r0 = r4.e
            if (r0 != r1) goto L18
        L12:
            int r4 = r4.g
        L14:
            r2.h3(r3, r4)
            goto L4d
        L18:
            int r4 = r4.f
        L1a:
            r2.i3(r3, r4)
            goto L4d
        L1e:
            int r0 = r4.e
            if (r0 != r1) goto L37
            int r0 = r4.f
            int r1 = r2.P2(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L2c
            goto L12
        L2c:
            int r1 = r4.g
            int r4 = r4.f728b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L14
        L37:
            int r0 = r4.g
            int r0 = r2.Q2(r0)
            int r1 = r4.g
            int r0 = r0 - r1
            if (r0 >= 0) goto L43
            goto L18
        L43:
            int r1 = r4.f
            int r4 = r4.f728b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L1a
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.g3(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.p):void");
    }

    private void h3(RecyclerView.w wVar, int r8) {
        for (int r0 = Q() - 1; r0 >= 0; r0--) {
            View viewP = P(r0);
            if (this.u.g(viewP) < r8 || this.u.r(viewP) < r8) {
                return;
            }
            c cVar = (c) viewP.getLayoutParams();
            if (cVar.f) {
                for (int r4 = 0; r4 < this.s; r4++) {
                    if (this.t[r4].f603a.size() == 1) {
                        return;
                    }
                }
                for (int r3 = 0; r3 < this.s; r3++) {
                    this.t[r3].x();
                }
            } else if (cVar.e.f603a.size() == 1) {
                return;
            } else {
                cVar.e.x();
            }
            F1(viewP, wVar);
        }
    }

    private void i3(RecyclerView.w wVar, int r7) {
        while (Q() > 0) {
            View viewP = P(0);
            if (this.u.d(viewP) > r7 || this.u.q(viewP) > r7) {
                return;
            }
            c cVar = (c) viewP.getLayoutParams();
            if (cVar.f) {
                for (int r2 = 0; r2 < this.s; r2++) {
                    if (this.t[r2].f603a.size() == 1) {
                        return;
                    }
                }
                for (int r0 = 0; r0 < this.s; r0++) {
                    this.t[r0].y();
                }
            } else if (cVar.e.f603a.size() == 1) {
                return;
            } else {
                cVar.e.y();
            }
            F1(viewP, wVar);
        }
    }

    private void j3() {
        if (this.v.l() == 1073741824) {
            return;
        }
        float fMax = 0.0f;
        int r1 = Q();
        for (int r3 = 0; r3 < r1; r3++) {
            View viewP = P(r3);
            float fE = this.v.e(viewP);
            if (fE >= fMax) {
                if (((c) viewP.getLayoutParams()).i()) {
                    fE = (fE * 1.0f) / this.s;
                }
                fMax = Math.max(fMax, fE);
            }
        }
        int r32 = this.x;
        int r0 = Math.round(fMax * this.s);
        if (this.v.l() == Integer.MIN_VALUE) {
            r0 = Math.min(r0, this.v.o());
        }
        x3(r0);
        if (this.x == r32) {
            return;
        }
        for (int r2 = 0; r2 < r1; r2++) {
            View viewP2 = P(r2);
            c cVar = (c) viewP2.getLayoutParams();
            if (!cVar.f) {
                if (Z2() && this.w == 1) {
                    int r5 = this.s;
                    int r4 = cVar.e.e;
                    viewP2.offsetLeftAndRight(((-((r5 - 1) - r4)) * this.x) - ((-((r5 - 1) - r4)) * r32));
                } else {
                    int r42 = cVar.e.e;
                    int r7 = this.w;
                    int r52 = (this.x * r42) - (r42 * r32);
                    if (r7 == 1) {
                        viewP2.offsetLeftAndRight(r52);
                    } else {
                        viewP2.offsetTopAndBottom(r52);
                    }
                }
            }
        }
    }

    private void k2(View view) {
        for (int r0 = this.s - 1; r0 >= 0; r0--) {
            this.t[r0].a(view);
        }
    }

    private void k3() {
        this.A = (this.w == 1 || !Z2()) ? this.z : !this.z;
    }

    private void l2(b bVar) {
        boolean z;
        e eVar = this.I;
        int r1 = eVar.f;
        if (r1 > 0) {
            if (r1 == this.s) {
                for (int r0 = 0; r0 < this.s; r0++) {
                    this.t[r0].e();
                    e eVar2 = this.I;
                    int i = eVar2.g[r0];
                    if (i != Integer.MIN_VALUE) {
                        i += eVar2.l ? this.u.i() : this.u.n();
                    }
                    this.t[r0].A(i);
                }
            } else {
                eVar.b();
                e eVar3 = this.I;
                eVar3.d = eVar3.e;
            }
        }
        e eVar4 = this.I;
        this.H = eVar4.m;
        q3(eVar4.k);
        k3();
        e eVar5 = this.I;
        int r12 = eVar5.d;
        if (r12 != -1) {
            this.C = r12;
            z = eVar5.l;
        } else {
            z = this.A;
        }
        bVar.f599c = z;
        e eVar6 = this.I;
        if (eVar6.h > 1) {
            d dVar = this.E;
            dVar.f601a = eVar6.i;
            dVar.f602b = eVar6.j;
        }
    }

    private void o2(View view, c cVar, p pVar) {
        if (pVar.e == 1) {
            if (cVar.f) {
                k2(view);
                return;
            } else {
                cVar.e.a(view);
                return;
            }
        }
        if (cVar.f) {
            f3(view);
        } else {
            cVar.e.z(view);
        }
    }

    private void o3(int r5) {
        p pVar = this.y;
        pVar.e = r5;
        pVar.d = this.A != (r5 == -1) ? -1 : 1;
    }

    private int p2(int r4) {
        if (Q() == 0) {
            return this.A ? 1 : -1;
        }
        return (r4 < L2()) != this.A ? -1 : 1;
    }

    private boolean r2(f fVar) {
        if (this.A) {
            if (fVar.p() < this.u.i()) {
                ArrayList<View> arrayList = fVar.f603a;
                return !fVar.s(arrayList.get(arrayList.size() - 1)).f;
            }
        } else if (fVar.t() > this.u.n()) {
            return !fVar.s(fVar.f603a.get(0)).f;
        }
        return false;
    }

    private int s2(RecyclerView.c0 c0Var) {
        if (Q() == 0) {
            return 0;
        }
        return z.a(c0Var, this.u, D2(!this.N), C2(!this.N), this, this.N);
    }

    private void s3(int r3, int r4) {
        for (int r0 = 0; r0 < this.s; r0++) {
            if (!this.t[r0].f603a.isEmpty()) {
                y3(this.t[r0], r3, r4);
            }
        }
    }

    private int t2(RecyclerView.c0 c0Var) {
        if (Q() == 0) {
            return 0;
        }
        return z.b(c0Var, this.u, D2(!this.N), C2(!this.N), this, this.N, this.A);
    }

    private boolean t3(RecyclerView.c0 c0Var, b bVar) {
        boolean z = this.G;
        int r2 = c0Var.d();
        bVar.f597a = z ? H2(r2) : B2(r2);
        bVar.f598b = Integer.MIN_VALUE;
        return true;
    }

    private int u2(RecyclerView.c0 c0Var) {
        if (Q() == 0) {
            return 0;
        }
        return z.c(c0Var, this.u, D2(!this.N), C2(!this.N), this, this.N);
    }

    private int v2(int r5) {
        return r5 != 1 ? r5 != 2 ? r5 != 17 ? r5 != 33 ? r5 != 66 ? (r5 == 130 && this.w == 1) ? 1 : Integer.MIN_VALUE : this.w == 0 ? 1 : Integer.MIN_VALUE : this.w == 1 ? -1 : Integer.MIN_VALUE : this.w == 0 ? -1 : Integer.MIN_VALUE : (this.w != 1 && Z2()) ? -1 : 1 : (this.w != 1 && Z2()) ? 1 : -1;
    }

    private d.a w2(int r5) {
        d.a aVar = new d.a();
        aVar.f = new int[this.s];
        for (int r1 = 0; r1 < this.s; r1++) {
            aVar.f[r1] = r5 - this.t[r1].q(r5);
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void w3(int r5, androidx.recyclerview.widget.RecyclerView.c0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.p r0 = r4.y
            r1 = 0
            r0.f728b = r1
            r0.f729c = r5
            boolean r0 = r4.M0()
            r2 = 1
            if (r0 == 0) goto L2e
            int r6 = r6.g()
            r0 = -1
            if (r6 == r0) goto L2e
            boolean r0 = r4.A
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L25
            androidx.recyclerview.widget.w r5 = r4.u
            int r5 = r5.o()
            goto L2f
        L25:
            androidx.recyclerview.widget.w r5 = r4.u
            int r5 = r5.o()
            r6 = r5
            r5 = 0
            goto L30
        L2e:
            r5 = 0
        L2f:
            r6 = 0
        L30:
            boolean r0 = r4.U()
            if (r0 == 0) goto L4d
            androidx.recyclerview.widget.p r0 = r4.y
            androidx.recyclerview.widget.w r3 = r4.u
            int r3 = r3.n()
            int r3 = r3 - r6
            r0.f = r3
            androidx.recyclerview.widget.p r6 = r4.y
            androidx.recyclerview.widget.w r0 = r4.u
            int r0 = r0.i()
            int r0 = r0 + r5
            r6.g = r0
            goto L5d
        L4d:
            androidx.recyclerview.widget.p r0 = r4.y
            androidx.recyclerview.widget.w r3 = r4.u
            int r3 = r3.h()
            int r3 = r3 + r5
            r0.g = r3
            androidx.recyclerview.widget.p r5 = r4.y
            int r6 = -r6
            r5.f = r6
        L5d:
            androidx.recyclerview.widget.p r5 = r4.y
            r5.h = r1
            r5.f727a = r2
            androidx.recyclerview.widget.w r6 = r4.u
            int r6 = r6.l()
            if (r6 != 0) goto L74
            androidx.recyclerview.widget.w r6 = r4.u
            int r6 = r6.h()
            if (r6 != 0) goto L74
            r1 = 1
        L74:
            r5.i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.w3(int, androidx.recyclerview.widget.RecyclerView$c0):void");
    }

    private d.a x2(int r5) {
        d.a aVar = new d.a();
        aVar.f = new int[this.s];
        for (int r1 = 0; r1 < this.s; r1++) {
            aVar.f[r1] = this.t[r1].u(r5) - r5;
        }
        return aVar;
    }

    private void y2() {
        this.u = w.b(this, this.w);
        this.v = w.b(this, 1 - this.w);
    }

    private void y3(f fVar, int r5, int r6) {
        int r0 = fVar.o();
        if (r5 == -1) {
            if (fVar.t() + r0 > r6) {
                return;
            }
        } else if (fVar.p() - r0 < r6) {
            return;
        }
        this.B.set(fVar.e, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    private int z2(RecyclerView.w wVar, p pVar, RecyclerView.c0 c0Var) {
        int r11;
        f fVarS2;
        int r4;
        int r5;
        int r3;
        int r9;
        RecyclerView.o oVar;
        View view;
        int r2;
        int r42;
        ?? r92 = 0;
        this.B.set(0, this.s, true);
        if (this.y.i) {
            r11 = pVar.e == 1 ? ActivityChooserView.f.j : Integer.MIN_VALUE;
        } else {
            r11 = pVar.e == 1 ? pVar.g + pVar.f728b : pVar.f - pVar.f728b;
        }
        s3(pVar.e, r11);
        int i = this.A ? this.u.i() : this.u.n();
        boolean z = false;
        while (pVar.a(c0Var) && (this.y.i || !this.B.isEmpty())) {
            View viewB = pVar.b(wVar);
            c cVar = (c) viewB.getLayoutParams();
            int r0 = cVar.b();
            int r1 = this.E.g(r0);
            boolean z2 = r1 == -1;
            if (z2) {
                fVarS2 = cVar.f ? this.t[r92] : S2(pVar);
                this.E.n(r0, fVarS2);
            } else {
                fVarS2 = this.t[r1];
            }
            f fVar = fVarS2;
            cVar.e = fVar;
            if (pVar.e == 1) {
                e(viewB);
            } else {
                f(viewB, r92);
            }
            b3(viewB, cVar, r92);
            if (pVar.e == 1) {
                int r12 = cVar.f ? O2(i) : fVar.q(i);
                int r43 = this.u.e(viewB) + r12;
                if (z2 && cVar.f) {
                    d.a aVarW2 = w2(r12);
                    aVarW2.e = -1;
                    aVarW2.d = r0;
                    this.E.a(aVarW2);
                }
                r5 = r43;
                r4 = r12;
            } else {
                int r13 = cVar.f ? R2(i) : fVar.u(i);
                r4 = r13 - this.u.e(viewB);
                if (z2 && cVar.f) {
                    d.a aVarX2 = x2(r13);
                    aVarX2.e = 1;
                    aVarX2.d = r0;
                    this.E.a(aVarX2);
                }
                r5 = r13;
            }
            if (cVar.f && pVar.d == -1) {
                if (z2) {
                    this.M = true;
                } else {
                    if (!(pVar.e == 1 ? m2() : n2())) {
                        d.a aVarF = this.E.f(r0);
                        if (aVarF != null) {
                            aVarF.g = true;
                        }
                        this.M = true;
                    }
                }
            }
            o2(viewB, cVar, pVar);
            if (Z2() && this.w == 1) {
                int i2 = cVar.f ? this.v.i() : this.v.i() - (((this.s - 1) - fVar.e) * this.x);
                r9 = i2;
                r3 = i2 - this.v.e(viewB);
            } else {
                int r02 = cVar.f ? this.v.n() : (fVar.e * this.x) + this.v.n();
                r3 = r02;
                r9 = this.v.e(viewB) + r02;
            }
            if (this.w == 1) {
                oVar = this;
                view = viewB;
                r2 = r3;
                r3 = r4;
                r42 = r9;
            } else {
                oVar = this;
                view = viewB;
                r2 = r4;
                r42 = r5;
                r5 = r9;
            }
            oVar.P0(view, r2, r3, r42, r5);
            if (cVar.f) {
                s3(this.y.e, r11);
            } else {
                y3(fVar, this.y.e, r11);
            }
            g3(wVar, this.y);
            if (this.y.h && viewB.hasFocusable()) {
                if (cVar.f) {
                    this.B.clear();
                } else {
                    this.B.set(fVar.e, false);
                }
            }
            z = true;
            r92 = 0;
        }
        if (!z) {
            g3(wVar, this.y);
        }
        int r14 = this.y.e == -1 ? this.u.n() - R2(this.u.n()) : O2(this.u.i()) - this.u.i();
        if (r14 > 0) {
            return Math.min(pVar.f728b, r14);
        }
        return 0;
    }

    private int z3(int r3, int r4, int r5) {
        if (r4 == 0 && r5 == 0) {
            return r3;
        }
        int mode = View.MeasureSpec.getMode(r3);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(r3) - r4) - r5), mode) : r3;
    }

    public int[] A2(int[] r4) {
        if (r4 == null) {
            r4 = new int[this.s];
        } else if (r4.length < this.s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.s + ", array size:" + r4.length);
        }
        for (int r0 = 0; r0 < this.s; r0++) {
            r4[r0] = this.t[r0].f();
        }
        return r4;
    }

    View C2(boolean z) {
        int r0 = this.u.n();
        int i = this.u.i();
        View view = null;
        for (int r2 = Q() - 1; r2 >= 0; r2--) {
            View viewP = P(r2);
            int r5 = this.u.g(viewP);
            int r6 = this.u.d(viewP);
            if (r6 > r0 && r5 < i) {
                if (r6 <= i || !z) {
                    return viewP;
                }
                if (view == null) {
                    view = viewP;
                }
            }
        }
        return view;
    }

    View D2(boolean z) {
        int r0 = this.u.n();
        int i = this.u.i();
        int r2 = Q();
        View view = null;
        for (int r4 = 0; r4 < r2; r4++) {
            View viewP = P(r4);
            int r6 = this.u.g(viewP);
            if (this.u.d(viewP) > r0 && r6 < i) {
                if (r6 >= r0 || !z) {
                    return viewP;
                }
                if (view == null) {
                    view = viewP;
                }
            }
        }
        return view;
    }

    int E2() {
        View viewC2 = this.A ? C2(true) : D2(true);
        if (viewC2 == null) {
            return -1;
        }
        return s0(viewC2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean F0() {
        return this.F != 0;
    }

    public int[] F2(int[] r4) {
        if (r4 == null) {
            r4 = new int[this.s];
        } else if (r4.length < this.s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.s + ", array size:" + r4.length);
        }
        for (int r0 = 0; r0 < this.s; r0++) {
            r4[r0] = this.t[r0].h();
        }
        return r4;
    }

    public int[] G2(int[] r4) {
        if (r4 == null) {
            r4 = new int[this.s];
        } else if (r4.length < this.s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.s + ", array size:" + r4.length);
        }
        for (int r0 = 0; r0 < this.s; r0++) {
            r4[r0] = this.t[r0].i();
        }
        return r4;
    }

    public int[] I2(int[] r4) {
        if (r4 == null) {
            r4 = new int[this.s];
        } else if (r4.length < this.s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.s + ", array size:" + r4.length);
        }
        for (int r0 = 0; r0 < this.s; r0++) {
            r4[r0] = this.t[r0].k();
        }
        return r4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p K() {
        return this.w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p L(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    int L2() {
        if (Q() == 0) {
            return 0;
        }
        return s0(P(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p M(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public int M2() {
        return this.F;
    }

    int N2() {
        int r0 = Q();
        if (r0 == 0) {
            return 0;
        }
        return s0(P(r0 - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int Q1(int r1, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        return l3(r1, wVar, c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void R1(int r3) {
        e eVar = this.I;
        if (eVar != null && eVar.d != r3) {
            eVar.a();
        }
        this.C = r3;
        this.D = Integer.MIN_VALUE;
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int S1(int r1, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        return l3(r1, wVar, c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void T0(int r3) {
        super.T0(r3);
        for (int r0 = 0; r0 < this.s; r0++) {
            this.t[r0].w(r3);
        }
    }

    public int T2() {
        return this.w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U0(int r3) {
        super.U0(r3);
        for (int r0 = 0; r0 < this.s; r0++) {
            this.t[r0].w(r3);
        }
    }

    public boolean U2() {
        return this.z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int V(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        return this.w == 1 ? this.s : super.V(wVar, c0Var);
    }

    public int V2() {
        return this.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.view.View X2() {
        /*
            r12 = this;
            int r0 = r12.Q()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.s
            r2.<init>(r3)
            int r3 = r12.s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.w
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.Z2()
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = -1
        L21:
            boolean r6 = r12.A
            if (r6 == 0) goto L27
            r6 = -1
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L2b:
            if (r0 >= r6) goto L2e
            r5 = 1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.P(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.e
            int r9 = r9.e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.e
            boolean r9 = r12.r2(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.e
            int r9 = r9.e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.P(r9)
            boolean r10 = r12.A
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.w r10 = r12.u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.w r11 = r12.u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.w r10 = r12.u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.w r11 = r12.u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = 1
            goto L8b
        L8a:
            r10 = 0
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.e
            int r8 = r8.e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.e
            int r9 = r9.e
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = 1
            goto La1
        La0:
            r8 = 0
        La1:
            if (r3 >= 0) goto La5
            r9 = 1
            goto La6
        La5:
            r9 = 0
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.X2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y1(Rect rect, int r6, int r7) {
        int r62;
        int r5;
        int r0 = o0() + p0();
        int r1 = r0() + m0();
        if (this.w == 1) {
            r5 = RecyclerView.o.q(r7, rect.height() + r1, k0());
            r62 = RecyclerView.o.q(r6, (this.x * this.s) + r0, l0());
        } else {
            r62 = RecyclerView.o.q(r6, rect.width() + r0, l0());
            r5 = RecyclerView.o.q(r7, (this.x * this.s) + r1, k0());
        }
        X1(r62, r5);
    }

    public void Y2() {
        this.E.b();
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Z0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.Z0(recyclerView, wVar);
        H1(this.P);
        for (int r3 = 0; r3 < this.s; r3++) {
            this.t[r3].e();
        }
        recyclerView.requestLayout();
    }

    boolean Z2() {
        return i0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0.b
    public PointF a(int r4) {
        int r42 = p2(r4);
        PointF pointF = new PointF();
        if (r42 == 0) {
            return null;
        }
        if (this.w == 0) {
            pointF.x = r42;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = r42;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @i0
    public View a1(View view, int r10, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        View viewI;
        View viewR;
        if (Q() == 0 || (viewI = I(view)) == null) {
            return null;
        }
        k3();
        int r102 = v2(r10);
        if (r102 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) viewI.getLayoutParams();
        boolean z = cVar.f;
        f fVar = cVar.e;
        int r4 = r102 == 1 ? N2() : L2();
        w3(r4, c0Var);
        o3(r102);
        p pVar = this.y;
        pVar.f729c = pVar.d + r4;
        pVar.f728b = (int) (this.u.o() * Y);
        p pVar2 = this.y;
        pVar2.h = true;
        pVar2.f727a = false;
        z2(wVar, pVar2, c0Var);
        this.G = this.A;
        if (!z && (viewR = fVar.r(r4, r102)) != null && viewR != viewI) {
            return viewR;
        }
        if (d3(r102)) {
            for (int r11 = this.s - 1; r11 >= 0; r11--) {
                View viewR2 = this.t[r11].r(r4, r102);
                if (viewR2 != null && viewR2 != viewI) {
                    return viewR2;
                }
            }
        } else {
            for (int r112 = 0; r112 < this.s; r112++) {
                View viewR3 = this.t[r112].r(r4, r102);
                if (viewR3 != null && viewR3 != viewI) {
                    return viewR3;
                }
            }
        }
        boolean z2 = (this.z ^ true) == (r102 == -1);
        if (!z) {
            View viewJ = J(z2 ? fVar.g() : fVar.j());
            if (viewJ != null && viewJ != viewI) {
                return viewJ;
            }
        }
        if (d3(r102)) {
            for (int r103 = this.s - 1; r103 >= 0; r103--) {
                if (r103 != fVar.e) {
                    f[] fVarArr = this.t;
                    View viewJ2 = J(z2 ? fVarArr[r103].g() : fVarArr[r103].j());
                    if (viewJ2 != null && viewJ2 != viewI) {
                        return viewJ2;
                    }
                }
            }
        } else {
            for (int r6 = 0; r6 < this.s; r6++) {
                f[] fVarArr2 = this.t;
                View viewJ3 = J(z2 ? fVarArr2[r6].g() : fVarArr2[r6].j());
                if (viewJ3 != null && viewJ3 != viewI) {
                    return viewJ3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b1(AccessibilityEvent accessibilityEvent) {
        super.b1(accessibilityEvent);
        if (Q() > 0) {
            View viewD2 = D2(false);
            View viewC2 = C2(false);
            if (viewD2 == null || viewC2 == null) {
                return;
            }
            int r1 = s0(viewD2);
            int r0 = s0(viewC2);
            if (r1 < r0) {
                accessibilityEvent.setFromIndex(r1);
                accessibilityEvent.setToIndex(r0);
            } else {
                accessibilityEvent.setFromIndex(r0);
                accessibilityEvent.setToIndex(r1);
            }
        }
    }

    void e3(int r5, RecyclerView.c0 c0Var) {
        int r1;
        int r2;
        if (r5 > 0) {
            r1 = N2();
            r2 = 1;
        } else {
            r1 = L2();
            r2 = -1;
        }
        this.y.f727a = true;
        w3(r1, c0Var);
        o3(r2);
        p pVar = this.y;
        pVar.f729c = r1 + pVar.d;
        pVar.f728b = Math.abs(r5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void f2(RecyclerView recyclerView, RecyclerView.c0 c0Var, int r3) {
        q qVar = new q(recyclerView.getContext());
        qVar.q(r3);
        g2(qVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g1(RecyclerView.w wVar, RecyclerView.c0 c0Var, View view, b.i.p.p0.d dVar) {
        int r0;
        int r1;
        int r2;
        int r3;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.f1(view, dVar);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.w == 0) {
            r0 = cVar.h();
            r1 = cVar.f ? this.s : 1;
            r2 = -1;
            r3 = -1;
        } else {
            r0 = -1;
            r1 = -1;
            r2 = cVar.h();
            r3 = cVar.f ? this.s : 1;
        }
        dVar.W0(d.c.h(r0, r1, r2, r3, false, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(String str) {
        if (this.I == null) {
            super.i(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i1(RecyclerView recyclerView, int r2, int r3) {
        W2(r2, r3, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void j1(RecyclerView recyclerView) {
        this.E.b();
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean j2() {
        return this.I == null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void k1(RecyclerView recyclerView, int r2, int r3, int r4) {
        W2(r2, r3, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void l1(RecyclerView recyclerView, int r2, int r3) {
        W2(r2, r3, 2);
    }

    int l3(int r3, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        if (Q() == 0 || r3 == 0) {
            return 0;
        }
        e3(r3, c0Var);
        int r5 = z2(wVar, this.y, c0Var);
        if (this.y.f728b >= r5) {
            r3 = r3 < 0 ? -r5 : r5;
        }
        this.u.t(-r3);
        this.G = this.A;
        p pVar = this.y;
        pVar.f728b = 0;
        g3(wVar, pVar);
        return r3;
    }

    boolean m2() {
        int r0 = this.t[0].q(Integer.MIN_VALUE);
        for (int r4 = 1; r4 < this.s; r4++) {
            if (this.t[r4].q(Integer.MIN_VALUE) != r0) {
                return false;
            }
        }
        return true;
    }

    public void m3(int r2, int r3) {
        e eVar = this.I;
        if (eVar != null) {
            eVar.a();
        }
        this.C = r2;
        this.D = r3;
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean n() {
        return this.w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void n1(RecyclerView recyclerView, int r2, int r3, Object obj) {
        W2(r2, r3, 4);
    }

    boolean n2() {
        int r0 = this.t[0].u(Integer.MIN_VALUE);
        for (int r4 = 1; r4 < this.s; r4++) {
            if (this.t[r4].u(Integer.MIN_VALUE) != r0) {
                return false;
            }
        }
        return true;
    }

    public void n3(int r2) {
        i(null);
        if (r2 == this.F) {
            return;
        }
        if (r2 != 0 && r2 != 2) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.F = r2;
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean o() {
        return this.w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void o1(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        c3(wVar, c0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean p(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void p1(RecyclerView.c0 c0Var) {
        super.p1(c0Var);
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.I = null;
        this.L.c();
    }

    public void p3(int r2) {
        if (r2 != 0 && r2 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        i(null);
        if (r2 == this.w) {
            return;
        }
        this.w = r2;
        w wVar = this.u;
        this.u = this.v;
        this.v = wVar;
        N1();
    }

    boolean q2() {
        int r0;
        int r2;
        if (Q() == 0 || this.F == 0 || !E0()) {
            return false;
        }
        if (this.A) {
            r0 = N2();
            r2 = L2();
        } else {
            r0 = L2();
            r2 = N2();
        }
        if (r0 == 0 && X2() != null) {
            this.E.b();
        } else {
            if (!this.M) {
                return false;
            }
            int r4 = this.A ? -1 : 1;
            int r22 = r2 + 1;
            d.a aVarE = this.E.e(r0, r22, r4, true);
            if (aVarE == null) {
                this.M = false;
                this.E.d(r22);
                return false;
            }
            d.a aVarE2 = this.E.e(r0, aVarE.d, r4 * (-1), true);
            if (aVarE2 == null) {
                this.E.d(aVarE.d);
            } else {
                this.E.d(aVarE2.d + 1);
            }
        }
        O1();
        N1();
        return true;
    }

    public void q3(boolean z) {
        i(null);
        e eVar = this.I;
        if (eVar != null && eVar.k != z) {
            eVar.k = z;
        }
        this.z = z;
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @p0({p0.a.LIBRARY})
    public void r(int r5, int r6, RecyclerView.c0 c0Var, RecyclerView.o.c cVar) {
        int r1;
        int r2;
        if (this.w != 0) {
            r5 = r6;
        }
        if (Q() == 0 || r5 == 0) {
            return;
        }
        e3(r5, c0Var);
        int[] r52 = this.O;
        if (r52 == null || r52.length < this.s) {
            this.O = new int[this.s];
        }
        int r0 = 0;
        for (int r62 = 0; r62 < this.s; r62++) {
            p pVar = this.y;
            if (pVar.d == -1) {
                r1 = pVar.f;
                r2 = this.t[r62].u(r1);
            } else {
                r1 = this.t[r62].q(pVar.g);
                r2 = this.y.g;
            }
            int r12 = r1 - r2;
            if (r12 >= 0) {
                this.O[r0] = r12;
                r0++;
            }
        }
        Arrays.sort(this.O, 0, r0);
        for (int r53 = 0; r53 < r0 && this.y.a(c0Var); r53++) {
            cVar.a(this.y.f729c, this.O[r53]);
            p pVar2 = this.y;
            pVar2.f729c += pVar2.d;
        }
    }

    public void r3(int r3) {
        i(null);
        if (r3 != this.s) {
            Y2();
            this.s = r3;
            this.B = new BitSet(this.s);
            this.t = new f[this.s];
            for (int r32 = 0; r32 < this.s; r32++) {
                this.t[r32] = new f(r32);
            }
            N1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int t(RecyclerView.c0 c0Var) {
        return s2(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void t1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.I = (e) parcelable;
            N1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.c0 c0Var) {
        return t2(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable u1() {
        int r1;
        int i;
        int[] r3;
        if (this.I != null) {
            return new e(this.I);
        }
        e eVar = new e();
        eVar.k = this.z;
        eVar.l = this.G;
        eVar.m = this.H;
        d dVar = this.E;
        if (dVar == null || (r3 = dVar.f601a) == null) {
            eVar.h = 0;
        } else {
            eVar.i = r3;
            eVar.h = r3.length;
            eVar.j = dVar.f602b;
        }
        if (Q() > 0) {
            eVar.d = this.G ? N2() : L2();
            eVar.e = E2();
            int r12 = this.s;
            eVar.f = r12;
            eVar.g = new int[r12];
            for (int r2 = 0; r2 < this.s; r2++) {
                if (this.G) {
                    r1 = this.t[r2].q(Integer.MIN_VALUE);
                    if (r1 != Integer.MIN_VALUE) {
                        i = this.u.i();
                        r1 -= i;
                    }
                } else {
                    r1 = this.t[r2].u(Integer.MIN_VALUE);
                    if (r1 != Integer.MIN_VALUE) {
                        i = this.u.n();
                        r1 -= i;
                    }
                }
                eVar.g[r2] = r1;
            }
        } else {
            eVar.d = -1;
            eVar.e = -1;
            eVar.f = 0;
        }
        return eVar;
    }

    boolean u3(RecyclerView.c0 c0Var, b bVar) {
        int r0;
        int i;
        int r6;
        if (!c0Var.j() && (r0 = this.C) != -1) {
            if (r0 >= 0 && r0 < c0Var.d()) {
                e eVar = this.I;
                if (eVar == null || eVar.d == -1 || eVar.f < 1) {
                    View viewJ = J(this.C);
                    if (viewJ != null) {
                        bVar.f597a = this.A ? N2() : L2();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.f599c) {
                                i = this.u.i() - this.D;
                                r6 = this.u.d(viewJ);
                            } else {
                                i = this.u.n() + this.D;
                                r6 = this.u.g(viewJ);
                            }
                            bVar.f598b = i - r6;
                            return true;
                        }
                        if (this.u.e(viewJ) > this.u.o()) {
                            bVar.f598b = bVar.f599c ? this.u.i() : this.u.n();
                            return true;
                        }
                        int r1 = this.u.g(viewJ) - this.u.n();
                        if (r1 < 0) {
                            bVar.f598b = -r1;
                            return true;
                        }
                        int i2 = this.u.i() - this.u.d(viewJ);
                        if (i2 < 0) {
                            bVar.f598b = i2;
                            return true;
                        }
                        bVar.f598b = Integer.MIN_VALUE;
                    } else {
                        int r62 = this.C;
                        bVar.f597a = r62;
                        int r2 = this.D;
                        if (r2 == Integer.MIN_VALUE) {
                            bVar.f599c = p2(r62) == 1;
                            bVar.a();
                        } else {
                            bVar.b(r2);
                        }
                        bVar.d = true;
                    }
                } else {
                    bVar.f598b = Integer.MIN_VALUE;
                    bVar.f597a = this.C;
                }
                return true;
            }
            this.C = -1;
            this.D = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.c0 c0Var) {
        return u2(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v0(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        return this.w == 0 ? this.s : super.v0(wVar, c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void v1(int r1) {
        if (r1 == 0) {
            q2();
        }
    }

    void v3(RecyclerView.c0 c0Var, b bVar) {
        if (u3(c0Var, bVar) || t3(c0Var, bVar)) {
            return;
        }
        bVar.a();
        bVar.f597a = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w(RecyclerView.c0 c0Var) {
        return s2(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int x(RecyclerView.c0 c0Var) {
        return t2(c0Var);
    }

    void x3(int r2) {
        this.x = r2 / this.s;
        this.J = View.MeasureSpec.makeMeasureSpec(r2, this.v.l());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y(RecyclerView.c0 c0Var) {
        return u2(c0Var);
    }
}

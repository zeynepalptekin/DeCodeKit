package b.w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
public abstract class g0 implements Cloneable {
    private static final String K = "Transition";
    static final boolean L = false;
    public static final int M = 1;
    private static final int N = 1;
    public static final int O = 2;
    public static final int P = 3;
    public static final int Q = 4;
    private static final int R = 4;
    private static final String S = "instance";
    private static final String T = "name";
    private static final String U = "id";
    private static final String V = "itemId";
    private static final int[] W = {2, 1, 3, 4};
    private static final w X = new a();
    private static ThreadLocal<b.f.a<Animator, d>> Y = new ThreadLocal<>();
    k0 G;
    private f H;
    private b.f.a<String, String> I;
    private ArrayList<n0> w;
    private ArrayList<n0> x;
    private String d = getClass().getName();
    private long e = -1;
    long f = -1;
    private TimeInterpolator g = null;
    ArrayList<Integer> h = new ArrayList<>();
    ArrayList<View> i = new ArrayList<>();
    private ArrayList<String> j = null;
    private ArrayList<Class<?>> k = null;
    private ArrayList<Integer> l = null;
    private ArrayList<View> m = null;
    private ArrayList<Class<?>> n = null;
    private ArrayList<String> o = null;
    private ArrayList<Integer> p = null;
    private ArrayList<View> q = null;
    private ArrayList<Class<?>> r = null;
    private o0 s = new o0();
    private o0 t = new o0();
    l0 u = null;
    private int[] v = W;
    private ViewGroup y = null;
    boolean z = false;
    ArrayList<Animator> A = new ArrayList<>();
    private int B = 0;
    private boolean C = false;
    private boolean D = false;
    private ArrayList<h> E = null;
    private ArrayList<Animator> F = new ArrayList<>();
    private w J = X;

    static class a extends w {
        a() {
        }

        @Override // b.w.w
        public Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b.f.a f1439a;

        b(b.f.a aVar) {
            this.f1439a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1439a.remove(animator);
            g0.this.A.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g0.this.A.add(animator);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g0.this.w();
            animator.removeListener(this);
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        View f1442a;

        /* renamed from: b, reason: collision with root package name */
        String f1443b;

        /* renamed from: c, reason: collision with root package name */
        n0 f1444c;
        j1 d;
        g0 e;

        d(View view, String str, g0 g0Var, j1 j1Var, n0 n0Var) {
            this.f1442a = view;
            this.f1443b = str;
            this.f1444c = n0Var;
            this.d = j1Var;
            this.e = g0Var;
        }
    }

    private static class e {
        private e() {
        }

        static <T> ArrayList<T> a(ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t)) {
                arrayList.add(t);
            }
            return arrayList;
        }

        static <T> ArrayList<T> b(ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(t);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    public static abstract class f {
        public abstract Rect a(@androidx.annotation.h0 g0 g0Var);
    }

    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface g {
    }

    public interface h {
        void a(@androidx.annotation.h0 g0 g0Var);

        void b(@androidx.annotation.h0 g0 g0Var);

        void c(@androidx.annotation.h0 g0 g0Var);

        void d(@androidx.annotation.h0 g0 g0Var);

        void e(@androidx.annotation.h0 g0 g0Var);
    }

    public g0() {
    }

    @SuppressLint({"RestrictedApi"})
    public g0(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f0.f1408c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jK = b.i.c.j.h.k(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (jK >= 0) {
            B0(jK);
        }
        long jK2 = b.i.c.j.h.k(typedArrayObtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (jK2 > 0) {
            I0(jK2);
        }
        int r1 = b.i.c.j.h.l(typedArrayObtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (r1 > 0) {
            D0(AnimationUtils.loadInterpolator(context, r1));
        }
        String strM = b.i.c.j.h.m(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strM != null) {
            E0(p0(strM));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private ArrayList<Integer> C(ArrayList<Integer> arrayList, int r2, boolean z) {
        if (r2 <= 0) {
            return arrayList;
        }
        Integer numValueOf = Integer.valueOf(r2);
        return z ? e.a(arrayList, numValueOf) : e.b(arrayList, numValueOf);
    }

    private static <T> ArrayList<T> D(ArrayList<T> arrayList, T t, boolean z) {
        return t != null ? z ? e.a(arrayList, t) : e.b(arrayList, t) : arrayList;
    }

    private ArrayList<Class<?>> L(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z) {
        return cls != null ? z ? e.a(arrayList, cls) : e.b(arrayList, cls) : arrayList;
    }

    private ArrayList<View> M(ArrayList<View> arrayList, View view, boolean z) {
        return view != null ? z ? e.a(arrayList, view) : e.b(arrayList, view) : arrayList;
    }

    private static b.f.a<Animator, d> Y() {
        b.f.a<Animator, d> aVar = Y.get();
        if (aVar != null) {
            return aVar;
        }
        b.f.a<Animator, d> aVar2 = new b.f.a<>();
        Y.set(aVar2);
        return aVar2;
    }

    private void g(b.f.a<View, n0> aVar, b.f.a<View, n0> aVar2) {
        for (int r1 = 0; r1 < aVar.size(); r1++) {
            n0 n0VarM = aVar.m(r1);
            if (i0(n0VarM.f1494b)) {
                this.w.add(n0VarM);
                this.x.add(null);
            }
        }
        for (int r0 = 0; r0 < aVar2.size(); r0++) {
            n0 n0VarM2 = aVar2.m(r0);
            if (i0(n0VarM2.f1494b)) {
                this.x.add(n0VarM2);
                this.w.add(null);
            }
        }
    }

    private static void h(o0 o0Var, View view, n0 n0Var) {
        o0Var.f1496a.put(view, n0Var);
        int id = view.getId();
        if (id >= 0) {
            if (o0Var.f1497b.indexOfKey(id) >= 0) {
                o0Var.f1497b.put(id, null);
            } else {
                o0Var.f1497b.put(id, view);
            }
        }
        String strT0 = b.i.p.f0.t0(view);
        if (strT0 != null) {
            if (o0Var.d.containsKey(strT0)) {
                o0Var.d.put(strT0, null);
            } else {
                o0Var.d.put(strT0, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (o0Var.f1498c.m(itemIdAtPosition) < 0) {
                    b.i.p.f0.J1(view, true);
                    o0Var.f1498c.q(itemIdAtPosition, view);
                    return;
                }
                View viewK = o0Var.f1498c.k(itemIdAtPosition);
                if (viewK != null) {
                    b.i.p.f0.J1(viewK, false);
                    o0Var.f1498c.q(itemIdAtPosition, null);
                }
            }
        }
    }

    private static boolean h0(int r2) {
        return r2 >= 1 && r2 <= 4;
    }

    private static boolean j0(n0 n0Var, n0 n0Var2, String str) {
        Object obj = n0Var.f1493a.get(str);
        Object obj2 = n0Var2.f1493a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private static boolean k(int[] r4, int r5) {
        int r0 = r4[r5];
        for (int r2 = 0; r2 < r5; r2++) {
            if (r4[r2] == r0) {
                return true;
            }
        }
        return false;
    }

    private void k0(b.f.a<View, n0> aVar, b.f.a<View, n0> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int r1 = 0; r1 < size; r1++) {
            View viewValueAt = sparseArray.valueAt(r1);
            if (viewValueAt != null && i0(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(r1))) != null && i0(view)) {
                n0 n0Var = aVar.get(viewValueAt);
                n0 n0Var2 = aVar2.get(view);
                if (n0Var != null && n0Var2 != null) {
                    this.w.add(n0Var);
                    this.x.add(n0Var2);
                    aVar.remove(viewValueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void l0(b.f.a<View, n0> aVar, b.f.a<View, n0> aVar2) {
        n0 n0VarRemove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View viewI = aVar.i(size);
            if (viewI != null && i0(viewI) && (n0VarRemove = aVar2.remove(viewI)) != null && i0(n0VarRemove.f1494b)) {
                this.w.add(aVar.k(size));
                this.x.add(n0VarRemove);
            }
        }
    }

    private void m0(b.f.a<View, n0> aVar, b.f.a<View, n0> aVar2, b.f.f<View> fVar, b.f.f<View> fVar2) {
        View viewK;
        int r0 = fVar.A();
        for (int r1 = 0; r1 < r0; r1++) {
            View viewC = fVar.C(r1);
            if (viewC != null && i0(viewC) && (viewK = fVar2.k(fVar.p(r1))) != null && i0(viewK)) {
                n0 n0Var = aVar.get(viewC);
                n0 n0Var2 = aVar2.get(viewK);
                if (n0Var != null && n0Var2 != null) {
                    this.w.add(n0Var);
                    this.x.add(n0Var2);
                    aVar.remove(viewC);
                    aVar2.remove(viewK);
                }
            }
        }
    }

    private void n0(b.f.a<View, n0> aVar, b.f.a<View, n0> aVar2, b.f.a<String, View> aVar3, b.f.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int r1 = 0; r1 < size; r1++) {
            View viewM = aVar3.m(r1);
            if (viewM != null && i0(viewM) && (view = aVar4.get(aVar3.i(r1))) != null && i0(view)) {
                n0 n0Var = aVar.get(viewM);
                n0 n0Var2 = aVar2.get(view);
                if (n0Var != null && n0Var2 != null) {
                    this.w.add(n0Var);
                    this.x.add(n0Var2);
                    aVar.remove(viewM);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void o(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.l;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.m;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.n;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int r3 = 0; r3 < size; r3++) {
                        if (this.n.get(r3).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    n0 n0Var = new n0(view);
                    if (z) {
                        q(n0Var);
                    } else {
                        n(n0Var);
                    }
                    n0Var.f1495c.add(this);
                    p(n0Var);
                    h(z ? this.s : this.t, view, n0Var);
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.p;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.q;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.r;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int r1 = 0; r1 < size2; r1++) {
                                    if (this.r.get(r1).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int r2 = 0; r2 < viewGroup.getChildCount(); r2++) {
                                o(viewGroup.getChildAt(r2), z);
                            }
                        }
                    }
                }
            }
        }
    }

    private void o0(o0 o0Var, o0 o0Var2) {
        b.f.a<View, n0> aVar = new b.f.a<>(o0Var.f1496a);
        b.f.a<View, n0> aVar2 = new b.f.a<>(o0Var2.f1496a);
        int r2 = 0;
        while (true) {
            int[] r3 = this.v;
            if (r2 >= r3.length) {
                g(aVar, aVar2);
                return;
            }
            int r32 = r3[r2];
            if (r32 == 1) {
                l0(aVar, aVar2);
            } else if (r32 == 2) {
                n0(aVar, aVar2, o0Var.d, o0Var2.d);
            } else if (r32 == 3) {
                k0(aVar, aVar2, o0Var.f1497b, o0Var2.f1497b);
            } else if (r32 == 4) {
                m0(aVar, aVar2, o0Var.f1498c, o0Var2.f1498c);
            }
            r2++;
        }
    }

    private static int[] p0(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] r6 = new int[stringTokenizer.countTokens()];
        int r2 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strTrim = stringTokenizer.nextToken().trim();
            if (U.equalsIgnoreCase(strTrim)) {
                r6[r2] = 3;
            } else if (S.equalsIgnoreCase(strTrim)) {
                r6[r2] = 1;
            } else if ("name".equalsIgnoreCase(strTrim)) {
                r6[r2] = 2;
            } else if (V.equalsIgnoreCase(strTrim)) {
                r6[r2] = 4;
            } else {
                if (!strTrim.isEmpty()) {
                    throw new InflateException("Unknown match type in matchOrder: '" + strTrim + "'");
                }
                int[] r3 = new int[r6.length - 1];
                System.arraycopy(r6, 0, r3, 0, r2);
                r2--;
                r6 = r3;
            }
            r2++;
        }
        return r6;
    }

    private void y0(Animator animator, b.f.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            l(animator);
        }
    }

    @androidx.annotation.h0
    public g0 A(@androidx.annotation.h0 Class<?> cls, boolean z) {
        this.r = L(this.r, cls, z);
        return this;
    }

    void A0(boolean z) {
        this.z = z;
    }

    @androidx.annotation.h0
    public g0 B0(long j) {
        this.f = j;
        return this;
    }

    public void C0(@androidx.annotation.i0 f fVar) {
        this.H = fVar;
    }

    @androidx.annotation.h0
    public g0 D0(@androidx.annotation.i0 TimeInterpolator timeInterpolator) {
        this.g = timeInterpolator;
        return this;
    }

    public void E0(int... r3) {
        if (r3 == null || r3.length == 0) {
            this.v = W;
            return;
        }
        for (int r0 = 0; r0 < r3.length; r0++) {
            if (!h0(r3[r0])) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            if (k(r3, r0)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.v = (int[]) r3.clone();
    }

    @androidx.annotation.h0
    public g0 F(@androidx.annotation.w int r2, boolean z) {
        this.l = C(this.l, r2, z);
        return this;
    }

    public void F0(@androidx.annotation.i0 w wVar) {
        if (wVar == null) {
            wVar = X;
        }
        this.J = wVar;
    }

    @androidx.annotation.h0
    public g0 G(@androidx.annotation.h0 View view, boolean z) {
        this.m = M(this.m, view, z);
        return this;
    }

    public void G0(@androidx.annotation.i0 k0 k0Var) {
        this.G = k0Var;
    }

    g0 H0(ViewGroup viewGroup) {
        this.y = viewGroup;
        return this;
    }

    @androidx.annotation.h0
    public g0 I0(long j) {
        this.e = j;
        return this;
    }

    @androidx.annotation.h0
    public g0 J(@androidx.annotation.h0 Class<?> cls, boolean z) {
        this.n = L(this.n, cls, z);
        return this;
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    protected void J0() {
        if (this.B == 0) {
            ArrayList<h> arrayList = this.E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.E.clone();
                int size = arrayList2.size();
                for (int r3 = 0; r3 < size; r3++) {
                    ((h) arrayList2.get(r3)).a(this);
                }
            }
            this.D = false;
        }
        this.B++;
    }

    @androidx.annotation.h0
    public g0 K(@androidx.annotation.h0 String str, boolean z) {
        this.o = D(this.o, str, z);
        return this;
    }

    String K0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f != -1) {
            str2 = str2 + "dur(" + this.f + ") ";
        }
        if (this.e != -1) {
            str2 = str2 + "dly(" + this.e + ") ";
        }
        if (this.g != null) {
            str2 = str2 + "interp(" + this.g + ") ";
        }
        if (this.h.size() <= 0 && this.i.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.h.size() > 0) {
            for (int r0 = 0; r0 < this.h.size(); r0++) {
                if (r0 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.h.get(r0);
            }
        }
        if (this.i.size() > 0) {
            for (int r2 = 0; r2 < this.i.size(); r2++) {
                if (r2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.i.get(r2);
            }
        }
        return str3 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    void N(ViewGroup viewGroup) {
        b.f.a<Animator, d> aVarY = Y();
        int size = aVarY.size();
        if (viewGroup == null || size == 0) {
            return;
        }
        j1 j1VarD = y0.d(viewGroup);
        b.f.a aVar = new b.f.a(aVarY);
        aVarY.clear();
        for (int r1 = size - 1; r1 >= 0; r1--) {
            d dVar = (d) aVar.m(r1);
            if (dVar.f1442a != null && j1VarD != null && j1VarD.equals(dVar.d)) {
                ((Animator) aVar.i(r1)).end();
            }
        }
    }

    public long O() {
        return this.f;
    }

    @androidx.annotation.i0
    public Rect Q() {
        f fVar = this.H;
        if (fVar == null) {
            return null;
        }
        return fVar.a(this);
    }

    @androidx.annotation.i0
    public f R() {
        return this.H;
    }

    @androidx.annotation.i0
    public TimeInterpolator S() {
        return this.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        if (r3 < 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        if (r8 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        r7 = r6.x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        r7 = r6.w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        return r7.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    b.w.n0 T(android.view.View r7, boolean r8) {
        /*
            r6 = this;
            b.w.l0 r0 = r6.u
            if (r0 == 0) goto L9
            b.w.n0 r7 = r0.T(r7, r8)
            return r7
        L9:
            if (r8 == 0) goto Le
            java.util.ArrayList<b.w.n0> r0 = r6.w
            goto L10
        Le:
            java.util.ArrayList<b.w.n0> r0 = r6.x
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = -1
            r4 = 0
        L1a:
            if (r4 >= r2) goto L2e
            java.lang.Object r5 = r0.get(r4)
            b.w.n0 r5 = (b.w.n0) r5
            if (r5 != 0) goto L25
            return r1
        L25:
            android.view.View r5 = r5.f1494b
            if (r5 != r7) goto L2b
            r3 = r4
            goto L2e
        L2b:
            int r4 = r4 + 1
            goto L1a
        L2e:
            if (r3 < 0) goto L3e
            if (r8 == 0) goto L35
            java.util.ArrayList<b.w.n0> r7 = r6.x
            goto L37
        L35:
            java.util.ArrayList<b.w.n0> r7 = r6.w
        L37:
            java.lang.Object r7 = r7.get(r3)
            r1 = r7
            b.w.n0 r1 = (b.w.n0) r1
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.w.g0.T(android.view.View, boolean):b.w.n0");
    }

    @androidx.annotation.h0
    public String U() {
        return this.d;
    }

    @androidx.annotation.h0
    public w W() {
        return this.J;
    }

    @androidx.annotation.i0
    public k0 X() {
        return this.G;
    }

    public long Z() {
        return this.e;
    }

    @androidx.annotation.h0
    public List<Integer> a0() {
        return this.h;
    }

    @androidx.annotation.h0
    public g0 b(@androidx.annotation.h0 h hVar) {
        if (this.E == null) {
            this.E = new ArrayList<>();
        }
        this.E.add(hVar);
        return this;
    }

    @androidx.annotation.i0
    public List<String> b0() {
        return this.j;
    }

    @androidx.annotation.h0
    public g0 c(@androidx.annotation.w int r2) {
        if (r2 != 0) {
            this.h.add(Integer.valueOf(r2));
        }
        return this;
    }

    @androidx.annotation.i0
    public List<Class<?>> c0() {
        return this.k;
    }

    @androidx.annotation.h0
    public g0 d(@androidx.annotation.h0 View view) {
        this.i.add(view);
        return this;
    }

    @androidx.annotation.h0
    public List<View> d0() {
        return this.i;
    }

    @androidx.annotation.h0
    public g0 e(@androidx.annotation.h0 Class<?> cls) {
        if (this.k == null) {
            this.k = new ArrayList<>();
        }
        this.k.add(cls);
        return this;
    }

    @androidx.annotation.i0
    public String[] e0() {
        return null;
    }

    @androidx.annotation.h0
    public g0 f(@androidx.annotation.h0 String str) {
        if (this.j == null) {
            this.j = new ArrayList<>();
        }
        this.j.add(str);
        return this;
    }

    @androidx.annotation.i0
    public n0 f0(@androidx.annotation.h0 View view, boolean z) {
        l0 l0Var = this.u;
        if (l0Var != null) {
            return l0Var.f0(view, z);
        }
        return (z ? this.s : this.t).f1496a.get(view);
    }

    public boolean g0(@androidx.annotation.i0 n0 n0Var, @androidx.annotation.i0 n0 n0Var2) {
        if (n0Var == null || n0Var2 == null) {
            return false;
        }
        String[] strArrE0 = e0();
        if (strArrE0 == null) {
            Iterator<String> it = n0Var.f1493a.keySet().iterator();
            while (it.hasNext()) {
                if (j0(n0Var, n0Var2, it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrE0) {
            if (!j0(n0Var, n0Var2, str)) {
            }
        }
        return false;
        return true;
    }

    boolean i0(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.l;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.m;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.n;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int r3 = 0; r3 < size; r3++) {
                if (this.n.get(r3).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.o != null && b.i.p.f0.t0(view) != null && this.o.contains(b.i.p.f0.t0(view))) {
            return false;
        }
        if ((this.h.size() == 0 && this.i.size() == 0 && (((arrayList = this.k) == null || arrayList.isEmpty()) && ((arrayList2 = this.j) == null || arrayList2.isEmpty()))) || this.h.contains(Integer.valueOf(id)) || this.i.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.j;
        if (arrayList6 != null && arrayList6.contains(b.i.p.f0.t0(view))) {
            return true;
        }
        if (this.k != null) {
            for (int r0 = 0; r0 < this.k.size(); r0++) {
                if (this.k.get(r0).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    protected void l(Animator animator) {
        if (animator == null) {
            w();
            return;
        }
        if (O() >= 0) {
            animator.setDuration(O());
        }
        if (Z() >= 0) {
            animator.setStartDelay(Z() + animator.getStartDelay());
        }
        if (S() != null) {
            animator.setInterpolator(S());
        }
        animator.addListener(new c());
        animator.start();
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    protected void m() {
        for (int size = this.A.size() - 1; size >= 0; size--) {
            this.A.get(size).cancel();
        }
        ArrayList<h> arrayList = this.E;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.E.clone();
        int size2 = arrayList2.size();
        for (int r2 = 0; r2 < size2; r2++) {
            ((h) arrayList2.get(r2)).b(this);
        }
    }

    public abstract void n(@androidx.annotation.h0 n0 n0Var);

    void p(n0 n0Var) {
        String[] strArrB;
        if (this.G == null || n0Var.f1493a.isEmpty() || (strArrB = this.G.b()) == null) {
            return;
        }
        boolean z = false;
        int r2 = 0;
        while (true) {
            if (r2 >= strArrB.length) {
                z = true;
                break;
            } else if (!n0Var.f1493a.containsKey(strArrB[r2])) {
                break;
            } else {
                r2++;
            }
        }
        if (z) {
            return;
        }
        this.G.a(n0Var);
    }

    public abstract void q(@androidx.annotation.h0 n0 n0Var);

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void q0(View view) {
        if (this.D) {
            return;
        }
        b.f.a<Animator, d> aVarY = Y();
        int size = aVarY.size();
        j1 j1VarD = y0.d(view);
        for (int r1 = size - 1; r1 >= 0; r1--) {
            d dVarM = aVarY.m(r1);
            if (dVarM.f1442a != null && j1VarD.equals(dVarM.d)) {
                b.w.a.b(aVarY.i(r1));
            }
        }
        ArrayList<h> arrayList = this.E;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.E.clone();
            int size2 = arrayList2.size();
            for (int r12 = 0; r12 < size2; r12++) {
                ((h) arrayList2.get(r12)).c(this);
            }
        }
        this.C = true;
    }

    void r(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        b.f.a<String, String> aVar;
        s(z);
        if ((this.h.size() > 0 || this.i.size() > 0) && (((arrayList = this.j) == null || arrayList.isEmpty()) && ((arrayList2 = this.k) == null || arrayList2.isEmpty()))) {
            for (int r0 = 0; r0 < this.h.size(); r0++) {
                View viewFindViewById = viewGroup.findViewById(this.h.get(r0).intValue());
                if (viewFindViewById != null) {
                    n0 n0Var = new n0(viewFindViewById);
                    if (z) {
                        q(n0Var);
                    } else {
                        n(n0Var);
                    }
                    n0Var.f1495c.add(this);
                    p(n0Var);
                    h(z ? this.s : this.t, viewFindViewById, n0Var);
                }
            }
            for (int r6 = 0; r6 < this.i.size(); r6++) {
                View view = this.i.get(r6);
                n0 n0Var2 = new n0(view);
                if (z) {
                    q(n0Var2);
                } else {
                    n(n0Var2);
                }
                n0Var2.f1495c.add(this);
                p(n0Var2);
                h(z ? this.s : this.t, view, n0Var2);
            }
        } else {
            o(viewGroup, z);
        }
        if (z || (aVar = this.I) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int r02 = 0; r02 < size; r02++) {
            arrayList3.add(this.s.d.remove(this.I.i(r02)));
        }
        for (int r1 = 0; r1 < size; r1++) {
            View view2 = (View) arrayList3.get(r1);
            if (view2 != null) {
                this.s.d.put(this.I.m(r1), view2);
            }
        }
    }

    void r0(ViewGroup viewGroup) {
        d dVar;
        this.w = new ArrayList<>();
        this.x = new ArrayList<>();
        o0(this.s, this.t);
        b.f.a<Animator, d> aVarY = Y();
        int size = aVarY.size();
        j1 j1VarD = y0.d(viewGroup);
        for (int r1 = size - 1; r1 >= 0; r1--) {
            Animator animatorI = aVarY.i(r1);
            if (animatorI != null && (dVar = aVarY.get(animatorI)) != null && dVar.f1442a != null && j1VarD.equals(dVar.d)) {
                n0 n0Var = dVar.f1444c;
                View view = dVar.f1442a;
                n0 n0VarF0 = f0(view, true);
                n0 n0VarT = T(view, true);
                if (n0VarF0 == null && n0VarT == null) {
                    n0VarT = this.t.f1496a.get(view);
                }
                if (!(n0VarF0 == null && n0VarT == null) && dVar.e.g0(n0Var, n0VarT)) {
                    if (animatorI.isRunning() || animatorI.isStarted()) {
                        animatorI.cancel();
                    } else {
                        aVarY.remove(animatorI);
                    }
                }
            }
        }
        v(viewGroup, this.s, this.t, this.w, this.x);
        z0();
    }

    void s(boolean z) {
        o0 o0Var;
        if (z) {
            this.s.f1496a.clear();
            this.s.f1497b.clear();
            o0Var = this.s;
        } else {
            this.t.f1496a.clear();
            this.t.f1497b.clear();
            o0Var = this.t;
        }
        o0Var.f1498c.c();
    }

    @androidx.annotation.h0
    public g0 s0(@androidx.annotation.h0 h hVar) {
        ArrayList<h> arrayList = this.E;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(hVar);
        if (this.E.size() == 0) {
            this.E = null;
        }
        return this;
    }

    @Override // 
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public g0 clone() {
        try {
            g0 g0Var = (g0) super.clone();
            g0Var.F = new ArrayList<>();
            g0Var.s = new o0();
            g0Var.t = new o0();
            g0Var.w = null;
            g0Var.x = null;
            return g0Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @androidx.annotation.h0
    public g0 t0(@androidx.annotation.w int r2) {
        if (r2 != 0) {
            this.h.remove(Integer.valueOf(r2));
        }
        return this;
    }

    public String toString() {
        return K0("");
    }

    @androidx.annotation.i0
    public Animator u(@androidx.annotation.h0 ViewGroup viewGroup, @androidx.annotation.i0 n0 n0Var, @androidx.annotation.i0 n0 n0Var2) {
        return null;
    }

    @androidx.annotation.h0
    public g0 u0(@androidx.annotation.h0 View view) {
        this.i.remove(view);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    @androidx.annotation.p0({androidx.annotation.p0.a.LIBRARY_GROUP_PREFIX})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void v(android.view.ViewGroup r21, b.w.o0 r22, b.w.o0 r23, java.util.ArrayList<b.w.n0> r24, java.util.ArrayList<b.w.n0> r25) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.w.g0.v(android.view.ViewGroup, b.w.o0, b.w.o0, java.util.ArrayList, java.util.ArrayList):void");
    }

    @androidx.annotation.h0
    public g0 v0(@androidx.annotation.h0 Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.k;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    protected void w() {
        int r0 = this.B - 1;
        this.B = r0;
        if (r0 == 0) {
            ArrayList<h> arrayList = this.E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.E.clone();
                int size = arrayList2.size();
                for (int r4 = 0; r4 < size; r4++) {
                    ((h) arrayList2.get(r4)).e(this);
                }
            }
            for (int r02 = 0; r02 < this.s.f1498c.A(); r02++) {
                View viewC = this.s.f1498c.C(r02);
                if (viewC != null) {
                    b.i.p.f0.J1(viewC, false);
                }
            }
            for (int r03 = 0; r03 < this.t.f1498c.A(); r03++) {
                View viewC2 = this.t.f1498c.C(r03);
                if (viewC2 != null) {
                    b.i.p.f0.J1(viewC2, false);
                }
            }
            this.D = true;
        }
    }

    @androidx.annotation.h0
    public g0 w0(@androidx.annotation.h0 String str) {
        ArrayList<String> arrayList = this.j;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    @androidx.annotation.h0
    public g0 x(@androidx.annotation.w int r2, boolean z) {
        this.p = C(this.p, r2, z);
        return this;
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void x0(View view) {
        if (this.C) {
            if (!this.D) {
                b.f.a<Animator, d> aVarY = Y();
                int size = aVarY.size();
                j1 j1VarD = y0.d(view);
                for (int r2 = size - 1; r2 >= 0; r2--) {
                    d dVarM = aVarY.m(r2);
                    if (dVarM.f1442a != null && j1VarD.equals(dVarM.d)) {
                        b.w.a.c(aVarY.i(r2));
                    }
                }
                ArrayList<h> arrayList = this.E;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.E.clone();
                    int size2 = arrayList2.size();
                    for (int r22 = 0; r22 < size2; r22++) {
                        ((h) arrayList2.get(r22)).d(this);
                    }
                }
            }
            this.C = false;
        }
    }

    @androidx.annotation.h0
    public g0 z(@androidx.annotation.h0 View view, boolean z) {
        this.q = M(this.q, view, z);
        return this;
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    protected void z0() {
        J0();
        b.f.a<Animator, d> aVarY = Y();
        Iterator<Animator> it = this.F.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (aVarY.containsKey(next)) {
                J0();
                y0(next, aVarY);
            }
        }
        this.F.clear();
        w();
    }
}

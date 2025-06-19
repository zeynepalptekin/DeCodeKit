package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.g;
import b.i.p.z;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
final class j extends androidx.fragment.app.i implements LayoutInflater.Factory2 {
    static boolean L = false;
    static final String M = "FragmentManager";
    static final String N = "android:target_req_state";
    static final String O = "android:target_state";
    static final String P = "android:view_state";
    static final String Q = "android:user_visible_hint";
    static final Interpolator R = new DecelerateInterpolator(2.5f);
    static final Interpolator S = new DecelerateInterpolator(1.5f);
    static final int T = 220;
    public static final int U = 1;
    public static final int V = 2;
    public static final int W = 3;
    public static final int X = 4;
    public static final int Y = 5;
    public static final int Z = 6;
    boolean A;
    boolean B;
    boolean C;
    ArrayList<androidx.fragment.app.a> D;
    ArrayList<Boolean> E;
    ArrayList<Fragment> F;
    ArrayList<m> I;
    private androidx.fragment.app.m J;
    ArrayList<k> g;
    boolean h;
    ArrayList<androidx.fragment.app.a> l;
    ArrayList<Fragment> m;
    private OnBackPressedDispatcher n;
    ArrayList<androidx.fragment.app.a> p;
    ArrayList<Integer> q;
    ArrayList<i.c> r;
    androidx.fragment.app.h u;
    androidx.fragment.app.e v;
    Fragment w;

    @i0
    Fragment x;
    boolean y;
    boolean z;
    int i = 0;
    final ArrayList<Fragment> j = new ArrayList<>();
    final HashMap<String, Fragment> k = new HashMap<>();
    private final androidx.activity.b o = new a(false);
    private final CopyOnWriteArrayList<i> s = new CopyOnWriteArrayList<>();
    int t = 0;
    Bundle G = null;
    SparseArray<Parcelable> H = null;
    Runnable K = new b();

    class a extends androidx.activity.b {
        a(boolean z) {
            super(z);
        }

        @Override // androidx.activity.b
        public void b() {
            j.this.T0();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.E0();
        }
    }

    class c implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f431a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f432b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() throws Resources.NotFoundException {
                if (c.this.f432b.q() != null) {
                    c.this.f432b.L1(null);
                    c cVar = c.this;
                    j jVar = j.this;
                    Fragment fragment = cVar.f432b;
                    jVar.h1(fragment, fragment.P(), 0, 0, false);
                }
            }
        }

        c(ViewGroup viewGroup, Fragment fragment) {
            this.f431a = viewGroup;
            this.f432b = fragment;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f431a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f434a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f435b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f436c;

        d(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f434a = viewGroup;
            this.f435b = view;
            this.f436c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) throws Resources.NotFoundException {
            this.f434a.endViewTransition(this.f435b);
            Animator animatorR = this.f436c.r();
            this.f436c.M1(null);
            if (animatorR == null || this.f434a.indexOfChild(this.f435b) >= 0) {
                return;
            }
            j jVar = j.this;
            Fragment fragment = this.f436c;
            jVar.h1(fragment, fragment.P(), 0, 0, false);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f437a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f438b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f439c;

        e(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f437a = viewGroup;
            this.f438b = view;
            this.f439c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f437a.endViewTransition(this.f438b);
            animator.removeListener(this);
            Fragment fragment = this.f439c;
            View view = fragment.J;
            if (view == null || !fragment.B) {
                return;
            }
            view.setVisibility(8);
        }
    }

    class f extends androidx.fragment.app.g {
        f() {
        }

        @Override // androidx.fragment.app.g
        @h0
        public Fragment a(@h0 ClassLoader classLoader, @h0 String str) {
            androidx.fragment.app.h hVar = j.this.u;
            return hVar.a(hVar.h(), str, null);
        }
    }

    private static class g {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f441a;

        /* renamed from: b, reason: collision with root package name */
        public final Animator f442b;

        g(Animator animator) {
            this.f441a = null;
            this.f442b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        g(Animation animation) {
            this.f441a = animation;
            this.f442b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    private static class h extends AnimationSet implements Runnable {
        private final ViewGroup d;
        private final View e;
        private boolean f;
        private boolean g;
        private boolean h;

        h(@h0 Animation animation, @h0 ViewGroup viewGroup, @h0 View view) {
            super(false);
            this.h = true;
            this.d = viewGroup;
            this.e = view;
            addAnimation(animation);
            this.d.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.h = true;
            if (this.f) {
                return !this.g;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f = true;
                z.a(this.d, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.h = true;
            if (this.f) {
                return !this.g;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f = true;
                z.a(this.d, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f || !this.h) {
                this.d.endViewTransition(this.e);
                this.g = true;
            } else {
                this.h = false;
                this.d.post(this);
            }
        }
    }

    private static final class i {

        /* renamed from: a, reason: collision with root package name */
        final i.b f443a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f444b;

        i(i.b bVar, boolean z) {
            this.f443a = bVar;
            this.f444b = z;
        }
    }

    /* renamed from: androidx.fragment.app.j$j, reason: collision with other inner class name */
    static class C0028j {

        /* renamed from: a, reason: collision with root package name */
        public static final int[] f445a = {R.attr.name, R.attr.id, R.attr.tag};

        /* renamed from: b, reason: collision with root package name */
        public static final int f446b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f447c = 0;
        public static final int d = 2;

        private C0028j() {
        }
    }

    interface k {
        boolean c(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    private class l implements k {

        /* renamed from: a, reason: collision with root package name */
        final String f448a;

        /* renamed from: b, reason: collision with root package name */
        final int f449b;

        /* renamed from: c, reason: collision with root package name */
        final int f450c;

        l(String str, int r3, int r4) {
            this.f448a = str;
            this.f449b = r3;
            this.f450c = r4;
        }

        @Override // androidx.fragment.app.j.k
        public boolean c(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = j.this.x;
            if (fragment == null || this.f449b >= 0 || this.f448a != null || !fragment.t().t()) {
                return j.this.l1(arrayList, arrayList2, this.f448a, this.f449b, this.f450c);
            }
            return false;
        }
    }

    static class m implements Fragment.f {

        /* renamed from: a, reason: collision with root package name */
        final boolean f451a;

        /* renamed from: b, reason: collision with root package name */
        final androidx.fragment.app.a f452b;

        /* renamed from: c, reason: collision with root package name */
        private int f453c;

        m(androidx.fragment.app.a aVar, boolean z) {
            this.f451a = z;
            this.f452b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.f
        public void a() {
            int r0 = this.f453c - 1;
            this.f453c = r0;
            if (r0 != 0) {
                return;
            }
            this.f452b.K.y1();
        }

        @Override // androidx.fragment.app.Fragment.f
        public void b() {
            this.f453c++;
        }

        public void c() {
            androidx.fragment.app.a aVar = this.f452b;
            aVar.K.O(aVar, this.f451a, false, false);
        }

        public void d() {
            boolean z = this.f453c > 0;
            j jVar = this.f452b.K;
            int size = jVar.j.size();
            for (int r1 = 0; r1 < size; r1++) {
                Fragment fragment = jVar.j.get(r1);
                fragment.Y1(null);
                if (z && fragment.m0()) {
                    fragment.m2();
                }
            }
            androidx.fragment.app.a aVar = this.f452b;
            aVar.K.O(aVar, this.f451a, !z, true);
        }

        public boolean e() {
            return this.f453c == 0;
        }
    }

    j() {
    }

    private void A0() throws Resources.NotFoundException {
        for (Fragment fragment : this.k.values()) {
            if (fragment != null) {
                if (fragment.q() != null) {
                    int r4 = fragment.P();
                    View viewQ = fragment.q();
                    Animation animation = viewQ.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        viewQ.clearAnimation();
                    }
                    fragment.L1(null);
                    h1(fragment, r4, 0, 0, false);
                } else if (fragment.r() != null) {
                    fragment.r().end();
                }
            }
        }
    }

    private void C(b.f.b<Fragment> bVar) throws Resources.NotFoundException {
        int r0 = this.t;
        if (r0 < 1) {
            return;
        }
        int r02 = Math.min(r0, 3);
        int size = this.j.size();
        for (int r8 = 0; r8 < size; r8++) {
            Fragment fragment = this.j.get(r8);
            if (fragment.d < r02) {
                h1(fragment, r02, fragment.F(), fragment.G(), false);
                if (fragment.J != null && !fragment.B && fragment.P) {
                    bVar.add(fragment);
                }
            }
        }
    }

    private void C0(boolean z) {
        if (this.h) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.u == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if (Looper.myLooper() != this.u.i().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            M();
        }
        if (this.D == null) {
            this.D = new ArrayList<>();
            this.E = new ArrayList<>();
        }
        this.h = true;
        try {
            I0(null, null);
        } finally {
            this.h = false;
        }
    }

    private void E1(RuntimeException runtimeException) {
        Log.e(M, runtimeException.getMessage());
        Log.e(M, "Activity state:");
        PrintWriter printWriter = new PrintWriter(new b.i.o.d(M));
        androidx.fragment.app.h hVar = this.u;
        try {
            if (hVar != null) {
                hVar.l("  ", null, printWriter, new String[0]);
            } else {
                c("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception e2) {
            Log.e(M, "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    public static int F1(int r1, boolean z) {
        if (r1 == 4097) {
            return z ? 1 : 2;
        }
        if (r1 == 4099) {
            return z ? 5 : 6;
        }
        if (r1 != 8194) {
            return -1;
        }
        return z ? 3 : 4;
    }

    private static void G0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int r5, int r6) {
        while (r5 < r6) {
            androidx.fragment.app.a aVar = arrayList.get(r5);
            if (arrayList2.get(r5).booleanValue()) {
                aVar.P(-1);
                aVar.U(r5 == r6 + (-1));
            } else {
                aVar.P(1);
                aVar.T();
            }
            r5++;
        }
    }

    private void G1() {
        ArrayList<k> arrayList = this.g;
        if (arrayList == null || arrayList.isEmpty()) {
            this.o.f(i() > 0 && W0(this.w));
        } else {
            this.o.f(true);
        }
    }

    private void H(@h0 Fragment fragment, @h0 g gVar, int r5) {
        View view = fragment.J;
        ViewGroup viewGroup = fragment.I;
        viewGroup.startViewTransition(view);
        fragment.e2(r5);
        if (gVar.f441a != null) {
            h hVar = new h(gVar.f441a, viewGroup, view);
            fragment.L1(fragment.J);
            hVar.setAnimationListener(new c(viewGroup, fragment));
            fragment.J.startAnimation(hVar);
            return;
        }
        Animator animator = gVar.f442b;
        fragment.M1(animator);
        animator.addListener(new d(viewGroup, view, fragment));
        animator.setTarget(fragment.J);
        animator.start();
    }

    private void H0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int r18, int r19) throws Resources.NotFoundException {
        int r4;
        int r1;
        int r9 = r18;
        boolean z = arrayList.get(r9).q;
        ArrayList<Fragment> arrayList3 = this.F;
        if (arrayList3 == null) {
            this.F = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.F.addAll(this.j);
        Fragment fragmentM = m();
        boolean z2 = false;
        for (int r2 = r9; r2 < r19; r2++) {
            androidx.fragment.app.a aVar = arrayList.get(r2);
            fragmentM = !arrayList2.get(r2).booleanValue() ? aVar.V(this.F, fragmentM) : aVar.c0(this.F, fragmentM);
            z2 = z2 || aVar.h;
        }
        this.F.clear();
        if (!z) {
            s.C(this, arrayList, arrayList2, r18, r19, false);
        }
        G0(arrayList, arrayList2, r18, r19);
        if (z) {
            b.f.b<Fragment> bVar = new b.f.b<>();
            C(bVar);
            int r0 = m1(arrayList, arrayList2, r18, r19, bVar);
            d1(bVar);
            r4 = r0;
        } else {
            r4 = r19;
        }
        if (r4 != r9 && z) {
            s.C(this, arrayList, arrayList2, r18, r4, true);
            f1(this.t, true);
        }
        while (r9 < r19) {
            androidx.fragment.app.a aVar2 = arrayList.get(r9);
            if (arrayList2.get(r9).booleanValue() && (r1 = aVar2.M) >= 0) {
                M0(r1);
                aVar2.M = -1;
            }
            aVar2.a0();
            r9++;
        }
        if (z2) {
            q1();
        }
    }

    private void I0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        int r5;
        int r52;
        ArrayList<m> arrayList3 = this.I;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int r2 = 0;
        while (r2 < size) {
            m mVar = this.I.get(r2);
            if (arrayList == null || mVar.f451a || (r52 = arrayList.indexOf(mVar.f452b)) == -1 || !arrayList2.get(r52).booleanValue()) {
                if (mVar.e() || (arrayList != null && mVar.f452b.X(arrayList, 0, arrayList.size()))) {
                    this.I.remove(r2);
                    r2--;
                    size--;
                    if (arrayList == null || mVar.f451a || (r5 = arrayList.indexOf(mVar.f452b)) == -1 || !arrayList2.get(r5).booleanValue()) {
                        mVar.d();
                    }
                }
                r2++;
            } else {
                this.I.remove(r2);
                r2--;
                size--;
            }
            mVar.c();
            r2++;
        }
    }

    private void K() {
        this.k.values().removeAll(Collections.singleton(null));
    }

    private Fragment K0(Fragment fragment) {
        ViewGroup viewGroup = fragment.I;
        View view = fragment.J;
        if (viewGroup != null && view != null) {
            for (int r5 = this.j.indexOf(fragment) - 1; r5 >= 0; r5--) {
                Fragment fragment2 = this.j.get(r5);
                if (fragment2.I == viewGroup && fragment2.J != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    private void L0() {
        if (this.I != null) {
            while (!this.I.isEmpty()) {
                this.I.remove(0).d();
            }
        }
    }

    private void M() {
        if (o()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void N() {
        this.h = false;
        this.E.clear();
        this.D.clear();
    }

    private boolean N0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            if (this.g != null && this.g.size() != 0) {
                int size = this.g.size();
                boolean zC = false;
                for (int r1 = 0; r1 < size; r1++) {
                    zC |= this.g.get(r1).c(arrayList, arrayList2);
                }
                this.g.clear();
                this.u.i().removeCallbacks(this.K);
                return zC;
            }
            return false;
        }
    }

    private boolean V0(Fragment fragment) {
        return (fragment.F && fragment.G) || fragment.w.L();
    }

    static g a1(float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(S);
        alphaAnimation.setDuration(220L);
        return new g(alphaAnimation);
    }

    static g c1(float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(R);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(S);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new g(animationSet);
    }

    private void d1(b.f.b<Fragment> bVar) {
        int size = bVar.size();
        for (int r1 = 0; r1 < size; r1++) {
            Fragment fragmentT = bVar.t(r1);
            if (!fragmentT.n) {
                View viewG1 = fragmentT.G1();
                fragmentT.R = viewG1.getAlpha();
                viewG1.setAlpha(0.0f);
            }
        }
    }

    private boolean k1(String str, int r10, int r11) {
        E0();
        C0(true);
        Fragment fragment = this.x;
        if (fragment != null && r10 < 0 && str == null && fragment.t().t()) {
            return true;
        }
        boolean zL1 = l1(this.D, this.E, str, r10, r11);
        if (zL1) {
            this.h = true;
            try {
                o1(this.D, this.E);
            } finally {
                N();
            }
        }
        G1();
        z0();
        K();
        return zL1;
    }

    private int m1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int r10, int r11, b.f.b<Fragment> bVar) throws Resources.NotFoundException {
        int r1 = r11;
        for (int r0 = r11 - 1; r0 >= r10; r0--) {
            androidx.fragment.app.a aVar = arrayList.get(r0);
            boolean zBooleanValue = arrayList2.get(r0).booleanValue();
            if (aVar.Z() && !aVar.X(arrayList, r0 + 1, r11)) {
                if (this.I == null) {
                    this.I = new ArrayList<>();
                }
                m mVar = new m(aVar, zBooleanValue);
                this.I.add(mVar);
                aVar.b0(mVar);
                if (zBooleanValue) {
                    aVar.T();
                } else {
                    aVar.U(false);
                }
                r1--;
                if (r0 != r1) {
                    arrayList.remove(r0);
                    arrayList.add(r1, aVar);
                }
                C(bVar);
            }
        }
        return r1;
    }

    private void o1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) throws Resources.NotFoundException {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        I0(arrayList, arrayList2);
        int size = arrayList.size();
        int r1 = 0;
        int r2 = 0;
        while (r1 < size) {
            if (!arrayList.get(r1).q) {
                if (r2 != r1) {
                    H0(arrayList, arrayList2, r2, r1);
                }
                r2 = r1 + 1;
                if (arrayList2.get(r1).booleanValue()) {
                    while (r2 < size && arrayList2.get(r2).booleanValue() && !arrayList.get(r2).q) {
                        r2++;
                    }
                }
                H0(arrayList, arrayList2, r1, r2);
                r1 = r2 - 1;
            }
            r1++;
        }
        if (r2 != size) {
            H0(arrayList, arrayList2, r2, size);
        }
    }

    private void q0(@i0 Fragment fragment) {
        if (fragment == null || this.k.get(fragment.h) != fragment) {
            return;
        }
        fragment.r1();
    }

    public static int u1(int r3) {
        if (r3 == 4097) {
            return 8194;
        }
        if (r3 == 4099) {
            return r.J;
        }
        if (r3 != 8194) {
            return 0;
        }
        return r.H;
    }

    private void x0(int r3) {
        try {
            this.h = true;
            f1(r3, false);
            this.h = false;
            E0();
        } catch (Throwable th) {
            this.h = false;
            throw th;
        }
    }

    public void A1(Fragment fragment, g.b bVar) {
        if (this.k.get(fragment.h) == fragment && (fragment.v == null || fragment.z() == this)) {
            fragment.U = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    @Override // androidx.fragment.app.i
    public void B(@h0 i.b bVar) {
        synchronized (this.s) {
            int r1 = 0;
            int size = this.s.size();
            while (true) {
                if (r1 >= size) {
                    break;
                }
                if (this.s.get(r1).f443a == bVar) {
                    this.s.remove(r1);
                    break;
                }
                r1++;
            }
        }
    }

    public void B0(k kVar, boolean z) {
        if (!z) {
            M();
        }
        synchronized (this) {
            if (!this.B && this.u != null) {
                if (this.g == null) {
                    this.g = new ArrayList<>();
                }
                this.g.add(kVar);
                y1();
                return;
            }
            if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public void B1(Fragment fragment) {
        if (fragment == null || (this.k.get(fragment.h) == fragment && (fragment.v == null || fragment.z() == this))) {
            Fragment fragment2 = this.x;
            this.x = fragment;
            q0(fragment2);
            q0(this.x);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void C1(Fragment fragment) {
        if (L) {
            Log.v(M, "show: " + fragment);
        }
        if (fragment.B) {
            fragment.B = false;
            fragment.Q = !fragment.Q;
        }
    }

    void D(androidx.fragment.app.a aVar) {
        if (this.l == null) {
            this.l = new ArrayList<>();
        }
        this.l.add(aVar);
    }

    void D0(Fragment fragment) {
        if (!fragment.p || fragment.s) {
            return;
        }
        fragment.f1(fragment.j1(fragment.e), null, fragment.e);
        View view = fragment.J;
        if (view == null) {
            fragment.K = null;
            return;
        }
        fragment.K = view;
        view.setSaveFromParentEnabled(false);
        if (fragment.B) {
            fragment.J.setVisibility(8);
        }
        fragment.X0(fragment.J, fragment.e);
        m0(fragment, fragment.J, fragment.e, false);
    }

    void D1() {
        for (Fragment fragment : this.k.values()) {
            if (fragment != null) {
                j1(fragment);
            }
        }
    }

    public void E(Fragment fragment, boolean z) {
        if (L) {
            Log.v(M, "add: " + fragment);
        }
        Z0(fragment);
        if (fragment.C) {
            return;
        }
        if (this.j.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.j) {
            this.j.add(fragment);
        }
        fragment.n = true;
        fragment.o = false;
        if (fragment.J == null) {
            fragment.Q = false;
        }
        if (V0(fragment)) {
            this.y = true;
        }
        if (z) {
            g1(fragment);
        }
    }

    public boolean E0() {
        C0(true);
        boolean z = false;
        while (N0(this.D, this.E)) {
            this.h = true;
            try {
                o1(this.D, this.E);
                N();
                z = true;
            } catch (Throwable th) {
                N();
                throw th;
            }
        }
        G1();
        z0();
        K();
        return z;
    }

    void F(@h0 Fragment fragment) {
        if (o()) {
            if (L) {
                Log.v(M, "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.J.f(fragment) && L) {
            Log.v(M, "Updating retained Fragments: Added " + fragment);
        }
    }

    public void F0(k kVar, boolean z) {
        if (z && (this.u == null || this.B)) {
            return;
        }
        C0(z);
        if (kVar.c(this.D, this.E)) {
            this.h = true;
            try {
                o1(this.D, this.E);
            } finally {
                N();
            }
        }
        G1();
        z0();
        K();
    }

    public int G(androidx.fragment.app.a aVar) {
        synchronized (this) {
            if (this.q != null && this.q.size() > 0) {
                int r0 = this.q.remove(this.q.size() - 1).intValue();
                if (L) {
                    Log.v(M, "Adding back stack index " + r0 + " with " + aVar);
                }
                this.p.set(r0, aVar);
                return r0;
            }
            if (this.p == null) {
                this.p = new ArrayList<>();
            }
            int size = this.p.size();
            if (L) {
                Log.v(M, "Setting back stack index " + size + " to " + aVar);
            }
            this.p.add(aVar);
            return size;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void I(@h0 androidx.fragment.app.h hVar, @h0 androidx.fragment.app.e eVar, @i0 Fragment fragment) {
        if (this.u != null) {
            throw new IllegalStateException("Already attached");
        }
        this.u = hVar;
        this.v = eVar;
        this.w = fragment;
        if (fragment != null) {
            G1();
        }
        if (hVar instanceof androidx.activity.c) {
            androidx.activity.c cVar = (androidx.activity.c) hVar;
            this.n = cVar.d();
            Fragment fragment2 = cVar;
            if (fragment != null) {
                fragment2 = fragment;
            }
            this.n.b(fragment2, this.o);
        }
        this.J = fragment != null ? fragment.u.Q0(fragment) : hVar instanceof androidx.lifecycle.x ? androidx.fragment.app.m.i(((androidx.lifecycle.x) hVar).j()) : new androidx.fragment.app.m(false);
    }

    public void J(Fragment fragment) {
        if (L) {
            Log.v(M, "attach: " + fragment);
        }
        if (fragment.C) {
            fragment.C = false;
            if (fragment.n) {
                return;
            }
            if (this.j.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            if (L) {
                Log.v(M, "add from attach: " + fragment);
            }
            synchronized (this.j) {
                this.j.add(fragment);
            }
            fragment.n = true;
            if (V0(fragment)) {
                this.y = true;
            }
        }
    }

    public Fragment J0(@h0 String str) {
        Fragment fragmentM;
        for (Fragment fragment : this.k.values()) {
            if (fragment != null && (fragmentM = fragment.m(str)) != null) {
                return fragmentM;
            }
        }
        return null;
    }

    boolean L() {
        boolean zV0 = false;
        for (Fragment fragment : this.k.values()) {
            if (fragment != null) {
                zV0 = V0(fragment);
            }
            if (zV0) {
                return true;
            }
        }
        return false;
    }

    public void M0(int r4) {
        synchronized (this) {
            this.p.set(r4, null);
            if (this.q == null) {
                this.q = new ArrayList<>();
            }
            if (L) {
                Log.v(M, "Freeing back stack index " + r4);
            }
            this.q.add(Integer.valueOf(r4));
        }
    }

    void O(androidx.fragment.app.a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.U(z3);
        } else {
            aVar.T();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            s.C(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            f1(this.t, true);
        }
        for (Fragment fragment : this.k.values()) {
            if (fragment != null && fragment.J != null && fragment.P && aVar.W(fragment.z)) {
                float f2 = fragment.R;
                if (f2 > 0.0f) {
                    fragment.J.setAlpha(f2);
                }
                if (z3) {
                    fragment.R = 0.0f;
                } else {
                    fragment.R = -1.0f;
                    fragment.P = false;
                }
            }
        }
    }

    int O0() {
        return this.k.size();
    }

    void P(Fragment fragment) throws Resources.NotFoundException {
        Animator animator;
        if (fragment.J != null) {
            g gVarY0 = Y0(fragment, fragment.G(), !fragment.B, fragment.H());
            if (gVarY0 == null || (animator = gVarY0.f442b) == null) {
                if (gVarY0 != null) {
                    fragment.J.startAnimation(gVarY0.f441a);
                    gVarY0.f441a.start();
                }
                fragment.J.setVisibility((!fragment.B || fragment.i0()) ? 0 : 8);
                if (fragment.i0()) {
                    fragment.T1(false);
                }
            } else {
                animator.setTarget(fragment.J);
                if (!fragment.B) {
                    fragment.J.setVisibility(0);
                } else if (fragment.i0()) {
                    fragment.T1(false);
                } else {
                    ViewGroup viewGroup = fragment.I;
                    View view = fragment.J;
                    viewGroup.startViewTransition(view);
                    gVarY0.f442b.addListener(new e(viewGroup, view, fragment));
                }
                gVarY0.f442b.start();
            }
        }
        if (fragment.n && V0(fragment)) {
            this.y = true;
        }
        fragment.Q = false;
        fragment.I0(fragment.B);
    }

    @h0
    List<Fragment> P0() {
        return new ArrayList(this.k.values());
    }

    public void Q(Fragment fragment) {
        if (L) {
            Log.v(M, "detach: " + fragment);
        }
        if (fragment.C) {
            return;
        }
        fragment.C = true;
        if (fragment.n) {
            if (L) {
                Log.v(M, "remove from detach: " + fragment);
            }
            synchronized (this.j) {
                this.j.remove(fragment);
            }
            if (V0(fragment)) {
                this.y = true;
            }
            fragment.n = false;
        }
    }

    @h0
    androidx.fragment.app.m Q0(@h0 Fragment fragment) {
        return this.J.h(fragment);
    }

    public void R() {
        this.z = false;
        this.A = false;
        x0(2);
    }

    LayoutInflater.Factory2 R0() {
        return this;
    }

    public void S(@h0 Configuration configuration) {
        for (int r0 = 0; r0 < this.j.size(); r0++) {
            Fragment fragment = this.j.get(r0);
            if (fragment != null) {
                fragment.b1(configuration);
            }
        }
    }

    @h0
    androidx.lifecycle.w S0(@h0 Fragment fragment) {
        return this.J.l(fragment);
    }

    public boolean T(@h0 MenuItem menuItem) {
        if (this.t < 1) {
            return false;
        }
        for (int r0 = 0; r0 < this.j.size(); r0++) {
            Fragment fragment = this.j.get(r0);
            if (fragment != null && fragment.c1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void T0() {
        E0();
        if (this.o.c()) {
            t();
        } else {
            this.n.e();
        }
    }

    public void U() {
        this.z = false;
        this.A = false;
        x0(1);
    }

    public void U0(Fragment fragment) {
        if (L) {
            Log.v(M, "hide: " + fragment);
        }
        if (fragment.B) {
            return;
        }
        fragment.B = true;
        fragment.Q = true ^ fragment.Q;
    }

    public boolean V(@h0 Menu menu, @h0 MenuInflater menuInflater) {
        if (this.t < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (int r3 = 0; r3 < this.j.size(); r3++) {
            Fragment fragment = this.j.get(r3);
            if (fragment != null && fragment.e1(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.m != null) {
            for (int r1 = 0; r1 < this.m.size(); r1++) {
                Fragment fragment2 = this.m.get(r1);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.E0();
                }
            }
        }
        this.m = arrayList;
        return z;
    }

    public void W() {
        this.B = true;
        E0();
        x0(0);
        this.u = null;
        this.v = null;
        this.w = null;
        if (this.n != null) {
            this.o.d();
            this.n = null;
        }
    }

    boolean W0(@i0 Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        j jVar = fragment.u;
        return fragment == jVar.m() && W0(jVar.w);
    }

    public void X() {
        x0(1);
    }

    boolean X0(int r2) {
        return this.t >= r2;
    }

    public void Y() {
        for (int r0 = 0; r0 < this.j.size(); r0++) {
            Fragment fragment = this.j.get(r0);
            if (fragment != null) {
                fragment.k1();
            }
        }
    }

    g Y0(Fragment fragment, int r7, boolean z, int r9) throws Resources.NotFoundException {
        int r6;
        int r0 = fragment.F();
        boolean z2 = false;
        fragment.W1(0);
        ViewGroup viewGroup = fragment.I;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation animationZ0 = fragment.z0(r7, z, r0);
        if (animationZ0 != null) {
            return new g(animationZ0);
        }
        Animator animatorA0 = fragment.A0(r7, z, r0);
        if (animatorA0 != null) {
            return new g(animatorA0);
        }
        if (r0 != 0) {
            boolean zEquals = "anim".equals(this.u.h().getResources().getResourceTypeName(r0));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.u.h(), r0);
                    if (animationLoadAnimation != null) {
                        return new g(animationLoadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(this.u.h(), r0);
                    if (animatorLoadAnimator != null) {
                        return new g(animatorLoadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (zEquals) {
                        throw e3;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(this.u.h(), r0);
                    if (animationLoadAnimation2 != null) {
                        return new g(animationLoadAnimation2);
                    }
                }
            }
        }
        if (r7 == 0 || (r6 = F1(r7, z)) < 0) {
            return null;
        }
        switch (r6) {
            case 1:
                return c1(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return c1(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return c1(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return c1(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return a1(0.0f, 1.0f);
            case 6:
                return a1(1.0f, 0.0f);
            default:
                if (r9 == 0 && this.u.p()) {
                    this.u.o();
                }
                return null;
        }
    }

    public void Z(boolean z) {
        for (int size = this.j.size() - 1; size >= 0; size--) {
            Fragment fragment = this.j.get(size);
            if (fragment != null) {
                fragment.l1(z);
            }
        }
    }

    void Z0(Fragment fragment) {
        if (this.k.get(fragment.h) != null) {
            return;
        }
        this.k.put(fragment.h, fragment);
        if (fragment.E) {
            if (fragment.D) {
                F(fragment);
            } else {
                p1(fragment);
            }
            fragment.E = false;
        }
        if (L) {
            Log.v(M, "Added fragment to active set " + fragment);
        }
    }

    @Override // androidx.fragment.app.i
    public void a(i.c cVar) {
        if (this.r == null) {
            this.r = new ArrayList<>();
        }
        this.r.add(cVar);
    }

    void a0(@h0 Fragment fragment, @i0 Bundle bundle, boolean z) {
        Fragment fragment2 = this.w;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarZ = fragment2.z();
            if (iVarZ instanceof j) {
                ((j) iVarZ).a0(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.s.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f444b) {
                next.f443a.a(this, fragment, bundle);
            }
        }
    }

    @Override // androidx.fragment.app.i
    @h0
    public r b() {
        return new androidx.fragment.app.a(this);
    }

    void b0(@h0 Fragment fragment, @h0 Context context, boolean z) {
        Fragment fragment2 = this.w;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarZ = fragment2.z();
            if (iVarZ instanceof j) {
                ((j) iVarZ).b0(fragment, context, true);
            }
        }
        Iterator<i> it = this.s.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f444b) {
                next.f443a.b(this, fragment, context);
            }
        }
    }

    void b1(Fragment fragment) {
        if (this.k.get(fragment.h) == null) {
            return;
        }
        if (L) {
            Log.v(M, "Removed fragment from active set " + fragment);
        }
        for (Fragment fragment2 : this.k.values()) {
            if (fragment2 != null && fragment.h.equals(fragment2.k)) {
                fragment2.j = fragment;
                fragment2.k = null;
            }
        }
        this.k.put(fragment.h, null);
        p1(fragment);
        String str = fragment.k;
        if (str != null) {
            fragment.j = this.k.get(str);
        }
        fragment.c0();
    }

    @Override // androidx.fragment.app.i
    public void c(@h0 String str, @i0 FileDescriptor fileDescriptor, @h0 PrintWriter printWriter, @i0 String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        String str2 = str + "    ";
        if (!this.k.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (Fragment fragment : this.k.values()) {
                printWriter.print(str);
                printWriter.println(fragment);
                if (fragment != null) {
                    fragment.k(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size5 = this.j.size();
        if (size5 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int r1 = 0; r1 < size5; r1++) {
                Fragment fragment2 = this.j.get(r1);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(r1);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList = this.m;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int r12 = 0; r12 < size4; r12++) {
                Fragment fragment3 = this.m.get(r12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(r12);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.l;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int r13 = 0; r13 < size3; r13++) {
                androidx.fragment.app.a aVar = this.l.get(r13);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(r13);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.R(str2, printWriter);
            }
        }
        synchronized (this) {
            if (this.p != null && (size2 = this.p.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int r0 = 0; r0 < size2; r0++) {
                    Object obj = (androidx.fragment.app.a) this.p.get(r0);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(r0);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
            if (this.q != null && this.q.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.q.toArray()));
            }
        }
        ArrayList<k> arrayList3 = this.g;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int r8 = 0; r8 < size; r8++) {
                Object obj2 = (k) this.g.get(r8);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(r8);
                printWriter.print(": ");
                printWriter.println(obj2);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.u);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.v);
        if (this.w != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.w);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.t);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.z);
        printWriter.print(" mStopped=");
        printWriter.print(this.A);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.B);
        if (this.y) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.y);
        }
    }

    void c0(@h0 Fragment fragment, @i0 Bundle bundle, boolean z) {
        Fragment fragment2 = this.w;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarZ = fragment2.z();
            if (iVarZ instanceof j) {
                ((j) iVarZ).c0(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.s.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f444b) {
                next.f443a.c(this, fragment, bundle);
            }
        }
    }

    void d0(@h0 Fragment fragment, boolean z) {
        Fragment fragment2 = this.w;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarZ = fragment2.z();
            if (iVarZ instanceof j) {
                ((j) iVarZ).d0(fragment, true);
            }
        }
        Iterator<i> it = this.s.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f444b) {
                next.f443a.d(this, fragment);
            }
        }
    }

    @Override // androidx.fragment.app.i
    public boolean e() {
        boolean zE0 = E0();
        L0();
        return zE0;
    }

    void e0(@h0 Fragment fragment, boolean z) {
        Fragment fragment2 = this.w;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarZ = fragment2.z();
            if (iVarZ instanceof j) {
                ((j) iVarZ).e0(fragment, true);
            }
        }
        Iterator<i> it = this.s.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f444b) {
                next.f443a.e(this, fragment);
            }
        }
    }

    void e1(Fragment fragment) {
        if (fragment == null) {
            return;
        }
        if (!this.k.containsKey(fragment.h)) {
            if (L) {
                Log.v(M, "Ignoring moving " + fragment + " to state " + this.t + "since it is not added to " + this);
                return;
            }
            return;
        }
        int r0 = this.t;
        if (fragment.o) {
            r0 = fragment.j0() ? Math.min(r0, 1) : Math.min(r0, 0);
        }
        h1(fragment, r0, fragment.G(), fragment.H(), false);
        if (fragment.J != null) {
            Fragment fragmentK0 = K0(fragment);
            if (fragmentK0 != null) {
                View view = fragmentK0.J;
                ViewGroup viewGroup = fragment.I;
                int r02 = viewGroup.indexOfChild(view);
                int r4 = viewGroup.indexOfChild(fragment.J);
                if (r4 < r02) {
                    viewGroup.removeViewAt(r4);
                    viewGroup.addView(fragment.J, r02);
                }
            }
            if (fragment.P && fragment.I != null) {
                float f2 = fragment.R;
                if (f2 > 0.0f) {
                    fragment.J.setAlpha(f2);
                }
                fragment.R = 0.0f;
                fragment.P = false;
                g gVarY0 = Y0(fragment, fragment.G(), true, fragment.H());
                if (gVarY0 != null) {
                    Animation animation = gVarY0.f441a;
                    if (animation != null) {
                        fragment.J.startAnimation(animation);
                    } else {
                        gVarY0.f442b.setTarget(fragment.J);
                        gVarY0.f442b.start();
                    }
                }
            }
        }
        if (fragment.Q) {
            P(fragment);
        }
    }

    @Override // androidx.fragment.app.i
    @i0
    public Fragment f(int r4) {
        for (int size = this.j.size() - 1; size >= 0; size--) {
            Fragment fragment = this.j.get(size);
            if (fragment != null && fragment.y == r4) {
                return fragment;
            }
        }
        for (Fragment fragment2 : this.k.values()) {
            if (fragment2 != null && fragment2.y == r4) {
                return fragment2;
            }
        }
        return null;
    }

    void f0(@h0 Fragment fragment, boolean z) {
        Fragment fragment2 = this.w;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarZ = fragment2.z();
            if (iVarZ instanceof j) {
                ((j) iVarZ).f0(fragment, true);
            }
        }
        Iterator<i> it = this.s.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f444b) {
                next.f443a.f(this, fragment);
            }
        }
    }

    void f1(int r3, boolean z) {
        androidx.fragment.app.h hVar;
        if (this.u == null && r3 != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z || r3 != this.t) {
            this.t = r3;
            int size = this.j.size();
            for (int r0 = 0; r0 < size; r0++) {
                e1(this.j.get(r0));
            }
            for (Fragment fragment : this.k.values()) {
                if (fragment != null && (fragment.o || fragment.C)) {
                    if (!fragment.P) {
                        e1(fragment);
                    }
                }
            }
            D1();
            if (this.y && (hVar = this.u) != null && this.t == 4) {
                hVar.w();
                this.y = false;
            }
        }
    }

    @Override // androidx.fragment.app.i
    @i0
    public Fragment g(@i0 String str) {
        if (str != null) {
            for (int size = this.j.size() - 1; size >= 0; size--) {
                Fragment fragment = this.j.get(size);
                if (fragment != null && str.equals(fragment.A)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (Fragment fragment2 : this.k.values()) {
            if (fragment2 != null && str.equals(fragment2.A)) {
                return fragment2;
            }
        }
        return null;
    }

    void g0(@h0 Fragment fragment, @h0 Context context, boolean z) {
        Fragment fragment2 = this.w;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarZ = fragment2.z();
            if (iVarZ instanceof j) {
                ((j) iVarZ).g0(fragment, context, true);
            }
        }
        Iterator<i> it = this.s.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f444b) {
                next.f443a.g(this, fragment, context);
            }
        }
    }

    void g1(Fragment fragment) throws Resources.NotFoundException {
        h1(fragment, this.t, 0, 0, false);
    }

    @Override // androidx.fragment.app.i
    public i.a h(int r2) {
        return this.l.get(r2);
    }

    void h0(@h0 Fragment fragment, @i0 Bundle bundle, boolean z) {
        Fragment fragment2 = this.w;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarZ = fragment2.z();
            if (iVarZ instanceof j) {
                ((j) iVarZ).h0(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.s.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f444b) {
                next.f443a.h(this, fragment, bundle);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:272:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void h1(androidx.fragment.app.Fragment r19, int r20, int r21, int r22, boolean r23) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.h1(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    @Override // androidx.fragment.app.i
    public int i() {
        ArrayList<androidx.fragment.app.a> arrayList = this.l;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    void i0(@h0 Fragment fragment, boolean z) {
        Fragment fragment2 = this.w;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarZ = fragment2.z();
            if (iVarZ instanceof j) {
                ((j) iVarZ).i0(fragment, true);
            }
        }
        Iterator<i> it = this.s.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f444b) {
                next.f443a.i(this, fragment);
            }
        }
    }

    public void i1() {
        this.z = false;
        this.A = false;
        int size = this.j.size();
        for (int r0 = 0; r0 < size; r0++) {
            Fragment fragment = this.j.get(r0);
            if (fragment != null) {
                fragment.r0();
            }
        }
    }

    @Override // androidx.fragment.app.i
    @i0
    public Fragment j(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragment = this.k.get(string);
        if (fragment == null) {
            E1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragment;
    }

    void j0(@h0 Fragment fragment, @h0 Bundle bundle, boolean z) {
        Fragment fragment2 = this.w;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarZ = fragment2.z();
            if (iVarZ instanceof j) {
                ((j) iVarZ).j0(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.s.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f444b) {
                next.f443a.j(this, fragment, bundle);
            }
        }
    }

    public void j1(Fragment fragment) {
        if (fragment.L) {
            if (this.h) {
                this.C = true;
            } else {
                fragment.L = false;
                h1(fragment, this.t, 0, 0, false);
            }
        }
    }

    @Override // androidx.fragment.app.i
    @h0
    public androidx.fragment.app.g k() {
        if (super.k() == androidx.fragment.app.i.e) {
            Fragment fragment = this.w;
            if (fragment != null) {
                return fragment.u.k();
            }
            A(new f());
        }
        return super.k();
    }

    void k0(@h0 Fragment fragment, boolean z) {
        Fragment fragment2 = this.w;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarZ = fragment2.z();
            if (iVarZ instanceof j) {
                ((j) iVarZ).k0(fragment, true);
            }
        }
        Iterator<i> it = this.s.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f444b) {
                next.f443a.k(this, fragment);
            }
        }
    }

    @Override // androidx.fragment.app.i
    public List<Fragment> l() {
        List<Fragment> list;
        if (this.j.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.j) {
            list = (List) this.j.clone();
        }
        return list;
    }

    void l0(@h0 Fragment fragment, boolean z) {
        Fragment fragment2 = this.w;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarZ = fragment2.z();
            if (iVarZ instanceof j) {
                ((j) iVarZ).l0(fragment, true);
            }
        }
        Iterator<i> it = this.s.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f444b) {
                next.f443a.l(this, fragment);
            }
        }
    }

    boolean l1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int r9, int r10) {
        int r8;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.l;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && r9 < 0 && (r10 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.l.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || r9 >= 0) {
                int size2 = this.l.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.l.get(size2);
                    if ((str != null && str.equals(aVar.b())) || (r9 >= 0 && r9 == aVar.M)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((r10 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = this.l.get(size2);
                        if (str == null || !str.equals(aVar2.b())) {
                            if (r9 < 0 || r9 != aVar2.M) {
                                break;
                            }
                        }
                    }
                }
                r8 = size2;
            } else {
                r8 = -1;
            }
            if (r8 == this.l.size() - 1) {
                return false;
            }
            for (int size3 = this.l.size() - 1; size3 > r8; size3--) {
                arrayList.add(this.l.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.i
    @i0
    public Fragment m() {
        return this.x;
    }

    void m0(@h0 Fragment fragment, @h0 View view, @i0 Bundle bundle, boolean z) {
        Fragment fragment2 = this.w;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarZ = fragment2.z();
            if (iVarZ instanceof j) {
                ((j) iVarZ).m0(fragment, view, bundle, true);
            }
        }
        Iterator<i> it = this.s.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f444b) {
                next.f443a.m(this, fragment, view, bundle);
            }
        }
    }

    @Override // androidx.fragment.app.i
    public boolean n() {
        return this.B;
    }

    void n0(@h0 Fragment fragment, boolean z) {
        Fragment fragment2 = this.w;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarZ = fragment2.z();
            if (iVarZ instanceof j) {
                ((j) iVarZ).n0(fragment, true);
            }
        }
        Iterator<i> it = this.s.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f444b) {
                next.f443a.n(this, fragment);
            }
        }
    }

    public void n1(Fragment fragment) {
        if (L) {
            Log.v(M, "remove: " + fragment + " nesting=" + fragment.t);
        }
        boolean z = !fragment.j0();
        if (!fragment.C || z) {
            synchronized (this.j) {
                this.j.remove(fragment);
            }
            if (V0(fragment)) {
                this.y = true;
            }
            fragment.n = false;
            fragment.o = true;
        }
    }

    @Override // androidx.fragment.app.i
    public boolean o() {
        return this.z || this.A;
    }

    public boolean o0(@h0 MenuItem menuItem) {
        if (this.t < 1) {
            return false;
        }
        for (int r0 = 0; r0 < this.j.size(); r0++) {
            Fragment fragment = this.j.get(r0);
            if (fragment != null && fragment.m1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.LayoutInflater.Factory2
    @i0
    public View onCreateView(@i0 View view, @h0 String str, @h0 Context context, @h0 AttributeSet attributeSet) throws Resources.NotFoundException {
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0028j.f445a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (str2 == null || !androidx.fragment.app.g.b(context.getClassLoader(), str2)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
        }
        Fragment fragmentF = resourceId != -1 ? f(resourceId) : null;
        if (fragmentF == null && string != null) {
            fragmentF = g(string);
        }
        if (fragmentF == null && id != -1) {
            fragmentF = f(id);
        }
        if (L) {
            Log.v(M, "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str2 + " existing=" + fragmentF);
        }
        if (fragmentF == null) {
            fragmentF = k().a(context.getClassLoader(), str2);
            fragmentF.p = true;
            fragmentF.y = resourceId != 0 ? resourceId : id;
            fragmentF.z = id;
            fragmentF.A = string;
            fragmentF.q = true;
            fragmentF.u = this;
            androidx.fragment.app.h hVar = this.u;
            fragmentF.v = hVar;
            fragmentF.K0(hVar.h(), attributeSet, fragmentF.e);
            E(fragmentF, true);
        } else {
            if (fragmentF.q) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + str2);
            }
            fragmentF.q = true;
            androidx.fragment.app.h hVar2 = this.u;
            fragmentF.v = hVar2;
            fragmentF.K0(hVar2.h(), attributeSet, fragmentF.e);
        }
        Fragment fragment = fragmentF;
        if (this.t >= 1 || !fragment.p) {
            g1(fragment);
        } else {
            h1(fragment, 1, 0, 0, false);
        }
        View view2 = fragment.J;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.J.getTag() == null) {
                fragment.J.setTag(string);
            }
            return fragment.J;
        }
        throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public void p0(@h0 Menu menu) {
        if (this.t < 1) {
            return;
        }
        for (int r0 = 0; r0 < this.j.size(); r0++) {
            Fragment fragment = this.j.get(r0);
            if (fragment != null) {
                fragment.n1(menu);
            }
        }
    }

    void p1(@h0 Fragment fragment) {
        if (o()) {
            if (L) {
                Log.v(M, "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.J.n(fragment) && L) {
            Log.v(M, "Updating retained Fragments: Removed " + fragment);
        }
    }

    @Override // androidx.fragment.app.i
    public void q() {
        B0(new l(null, -1, 0), false);
    }

    void q1() {
        if (this.r != null) {
            for (int r0 = 0; r0 < this.r.size(); r0++) {
                this.r.get(r0).a();
            }
        }
    }

    @Override // androidx.fragment.app.i
    public void r(int r3, int r4) {
        if (r3 >= 0) {
            B0(new l(null, r3, r4), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + r3);
    }

    public void r0() {
        x0(3);
    }

    void r1(Parcelable parcelable, androidx.fragment.app.k kVar) {
        if (this.u instanceof androidx.lifecycle.x) {
            E1(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.J.o(kVar);
        s1(parcelable);
    }

    @Override // androidx.fragment.app.i
    public void s(@i0 String str, int r4) {
        B0(new l(str, -1, r4), false);
    }

    public void s0(boolean z) {
        for (int size = this.j.size() - 1; size >= 0; size--) {
            Fragment fragment = this.j.get(size);
            if (fragment != null) {
                fragment.p1(z);
            }
        }
    }

    void s1(Parcelable parcelable) {
        o next;
        if (parcelable == null) {
            return;
        }
        androidx.fragment.app.l lVar = (androidx.fragment.app.l) parcelable;
        if (lVar.d == null) {
            return;
        }
        for (Fragment fragment : this.J.j()) {
            if (L) {
                Log.v(M, "restoreSaveState: re-attaching retained " + fragment);
            }
            Iterator<o> it = lVar.d.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (next.e.equals(fragment.h)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (next == null) {
                if (L) {
                    Log.v(M, "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + lVar.d);
                }
                h1(fragment, 1, 0, 0, false);
                fragment.o = true;
                h1(fragment, 0, 0, 0, false);
            } else {
                next.q = fragment;
                fragment.f = null;
                fragment.t = 0;
                fragment.q = false;
                fragment.n = false;
                Fragment fragment2 = fragment.j;
                fragment.k = fragment2 != null ? fragment2.h : null;
                fragment.j = null;
                Bundle bundle = next.p;
                if (bundle != null) {
                    bundle.setClassLoader(this.u.h().getClassLoader());
                    fragment.f = next.p.getSparseParcelableArray(P);
                    fragment.e = next.p;
                }
            }
        }
        this.k.clear();
        Iterator<o> it2 = lVar.d.iterator();
        while (it2.hasNext()) {
            o next2 = it2.next();
            if (next2 != null) {
                Fragment fragmentA = next2.a(this.u.h().getClassLoader(), k());
                fragmentA.u = this;
                if (L) {
                    Log.v(M, "restoreSaveState: active (" + fragmentA.h + "): " + fragmentA);
                }
                this.k.put(fragmentA.h, fragmentA);
                next2.q = null;
            }
        }
        this.j.clear();
        ArrayList<String> arrayList = lVar.e;
        if (arrayList != null) {
            Iterator<String> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String next3 = it3.next();
                Fragment fragment3 = this.k.get(next3);
                if (fragment3 == null) {
                    E1(new IllegalStateException("No instantiated fragment for (" + next3 + ")"));
                }
                fragment3.n = true;
                if (L) {
                    Log.v(M, "restoreSaveState: added (" + next3 + "): " + fragment3);
                }
                if (this.j.contains(fragment3)) {
                    throw new IllegalStateException("Already added " + fragment3);
                }
                synchronized (this.j) {
                    this.j.add(fragment3);
                }
            }
        }
        if (lVar.f != null) {
            this.l = new ArrayList<>(lVar.f.length);
            int r0 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = lVar.f;
                if (r0 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a aVarA = bVarArr[r0].a(this);
                if (L) {
                    Log.v(M, "restoreAllState: back stack #" + r0 + " (index " + aVarA.M + "): " + aVarA);
                    PrintWriter printWriter = new PrintWriter(new b.i.o.d(M));
                    aVarA.S("  ", printWriter, false);
                    printWriter.close();
                }
                this.l.add(aVarA);
                int r2 = aVarA.M;
                if (r2 >= 0) {
                    z1(r2, aVarA);
                }
                r0++;
            }
        } else {
            this.l = null;
        }
        String str = lVar.g;
        if (str != null) {
            Fragment fragment4 = this.k.get(str);
            this.x = fragment4;
            q0(fragment4);
        }
        this.i = lVar.h;
    }

    @Override // androidx.fragment.app.i
    public boolean t() {
        M();
        return k1(null, -1, 0);
    }

    public boolean t0(@h0 Menu menu) {
        if (this.t < 1) {
            return false;
        }
        boolean z = false;
        for (int r1 = 0; r1 < this.j.size(); r1++) {
            Fragment fragment = this.j.get(r1);
            if (fragment != null && fragment.q1(menu)) {
                z = true;
            }
        }
        return z;
    }

    @Deprecated
    androidx.fragment.app.k t1() {
        if (this.u instanceof androidx.lifecycle.x) {
            E1(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.J.k();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.w;
        if (obj == null) {
            obj = this.u;
        }
        b.i.o.c.a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Override // androidx.fragment.app.i
    public boolean u(int r3, int r4) {
        M();
        E0();
        if (r3 >= 0) {
            return k1(null, r3, r4);
        }
        throw new IllegalArgumentException("Bad id: " + r3);
    }

    void u0() {
        G1();
        q0(this.x);
    }

    @Override // androidx.fragment.app.i
    public boolean v(@i0 String str, int r3) {
        M();
        return k1(str, -1, r3);
    }

    public void v0() {
        this.z = false;
        this.A = false;
        x0(4);
    }

    Parcelable v1() {
        ArrayList<String> arrayList;
        int size;
        L0();
        A0();
        E0();
        this.z = true;
        androidx.fragment.app.b[] bVarArr = null;
        if (this.k.isEmpty()) {
            return null;
        }
        ArrayList<o> arrayList2 = new ArrayList<>(this.k.size());
        boolean z = false;
        for (Fragment fragment : this.k.values()) {
            if (fragment != null) {
                if (fragment.u != this) {
                    E1(new IllegalStateException("Failure saving state: active " + fragment + " was removed from the FragmentManager"));
                }
                o oVar = new o(fragment);
                arrayList2.add(oVar);
                if (fragment.d <= 0 || oVar.p != null) {
                    oVar.p = fragment.e;
                } else {
                    oVar.p = w1(fragment);
                    String str = fragment.k;
                    if (str != null) {
                        Fragment fragment2 = this.k.get(str);
                        if (fragment2 == null) {
                            E1(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.k));
                        }
                        if (oVar.p == null) {
                            oVar.p = new Bundle();
                        }
                        w(oVar.p, O, fragment2);
                        int r8 = fragment.l;
                        if (r8 != 0) {
                            oVar.p.putInt(N, r8);
                        }
                    }
                }
                if (L) {
                    Log.v(M, "Saved state of " + fragment + ": " + oVar.p);
                }
                z = true;
            }
        }
        if (!z) {
            if (L) {
                Log.v(M, "saveAllState: no fragments!");
            }
            return null;
        }
        int size2 = this.j.size();
        if (size2 > 0) {
            arrayList = new ArrayList<>(size2);
            Iterator<Fragment> it = this.j.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.h);
                if (next.u != this) {
                    E1(new IllegalStateException("Failure saving state: active " + next + " was removed from the FragmentManager"));
                }
                if (L) {
                    Log.v(M, "saveAllState: adding fragment (" + next.h + "): " + next);
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.l;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int r4 = 0; r4 < size; r4++) {
                bVarArr[r4] = new androidx.fragment.app.b(this.l.get(r4));
                if (L) {
                    Log.v(M, "saveAllState: adding back stack #" + r4 + ": " + this.l.get(r4));
                }
            }
        }
        androidx.fragment.app.l lVar = new androidx.fragment.app.l();
        lVar.d = arrayList2;
        lVar.e = arrayList;
        lVar.f = bVarArr;
        Fragment fragment3 = this.x;
        if (fragment3 != null) {
            lVar.g = fragment3.h;
        }
        lVar.h = this.i;
        return lVar;
    }

    @Override // androidx.fragment.app.i
    public void w(Bundle bundle, String str, Fragment fragment) {
        if (fragment.u != this) {
            E1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.h);
    }

    public void w0() {
        this.z = false;
        this.A = false;
        x0(3);
    }

    Bundle w1(Fragment fragment) {
        if (this.G == null) {
            this.G = new Bundle();
        }
        fragment.t1(this.G);
        j0(fragment, this.G, false);
        Bundle bundle = null;
        if (!this.G.isEmpty()) {
            Bundle bundle2 = this.G;
            this.G = null;
            bundle = bundle2;
        }
        if (fragment.J != null) {
            x1(fragment);
        }
        if (fragment.f != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray(P, fragment.f);
        }
        if (!fragment.M) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(Q, fragment.M);
        }
        return bundle;
    }

    @Override // androidx.fragment.app.i
    public void x(@h0 i.b bVar, boolean z) {
        this.s.add(new i(bVar, z));
    }

    void x1(Fragment fragment) {
        if (fragment.K == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = this.H;
        if (sparseArray == null) {
            this.H = new SparseArray<>();
        } else {
            sparseArray.clear();
        }
        fragment.K.saveHierarchyState(this.H);
        if (this.H.size() > 0) {
            fragment.f = this.H;
            this.H = null;
        }
    }

    @Override // androidx.fragment.app.i
    public void y(i.c cVar) {
        ArrayList<i.c> arrayList = this.r;
        if (arrayList != null) {
            arrayList.remove(cVar);
        }
    }

    public void y0() {
        this.A = true;
        x0(2);
    }

    void y1() {
        synchronized (this) {
            boolean z = false;
            boolean z2 = (this.I == null || this.I.isEmpty()) ? false : true;
            if (this.g != null && this.g.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.u.i().removeCallbacks(this.K);
                this.u.i().post(this.K);
                G1();
            }
        }
    }

    @Override // androidx.fragment.app.i
    @i0
    public Fragment.g z(@h0 Fragment fragment) {
        Bundle bundleW1;
        if (fragment.u != this) {
            E1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        if (fragment.d <= 0 || (bundleW1 = w1(fragment)) == null) {
            return null;
        }
        return new Fragment.g(bundleW1);
    }

    void z0() {
        if (this.C) {
            this.C = false;
            D1();
        }
    }

    public void z1(int r5, androidx.fragment.app.a aVar) {
        synchronized (this) {
            if (this.p == null) {
                this.p = new ArrayList<>();
            }
            int size = this.p.size();
            if (r5 < size) {
                if (L) {
                    Log.v(M, "Setting back stack index " + r5 + " to " + aVar);
                }
                this.p.set(r5, aVar);
            } else {
                while (size < r5) {
                    this.p.add(null);
                    if (this.q == null) {
                        this.q = new ArrayList<>();
                    }
                    if (L) {
                        Log.v(M, "Adding available back stack index " + size);
                    }
                    this.q.add(Integer.valueOf(size));
                    size++;
                }
                if (L) {
                    Log.v(M, "Adding back stack index " + r5 + " with " + aVar);
                }
                this.p.add(aVar);
            }
        }
    }
}

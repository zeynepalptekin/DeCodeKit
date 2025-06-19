package androidx.fragment.app;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.z;
import b.i.p.f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
class s {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f468a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b, reason: collision with root package name */
    private static final u f469b;

    /* renamed from: c, reason: collision with root package name */
    private static final u f470c;

    static class a implements Runnable {
        final /* synthetic */ ArrayList d;

        a(ArrayList arrayList) {
            this.d = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            s.B(this.d, 4);
        }
    }

    static class b implements Runnable {
        final /* synthetic */ Object d;
        final /* synthetic */ u e;
        final /* synthetic */ View f;
        final /* synthetic */ Fragment g;
        final /* synthetic */ ArrayList h;
        final /* synthetic */ ArrayList i;
        final /* synthetic */ ArrayList j;
        final /* synthetic */ Object k;

        b(Object obj, u uVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.d = obj;
            this.e = uVar;
            this.f = view;
            this.g = fragment;
            this.h = arrayList;
            this.i = arrayList2;
            this.j = arrayList3;
            this.k = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.d;
            if (obj != null) {
                this.e.p(obj, this.f);
                this.i.addAll(s.k(this.e, this.d, this.g, this.h, this.f));
            }
            if (this.j != null) {
                if (this.k != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f);
                    this.e.q(this.k, this.j, arrayList);
                }
                this.j.clear();
                this.j.add(this.f);
            }
        }
    }

    static class c implements Runnable {
        final /* synthetic */ Fragment d;
        final /* synthetic */ Fragment e;
        final /* synthetic */ boolean f;
        final /* synthetic */ b.f.a g;
        final /* synthetic */ View h;
        final /* synthetic */ u i;
        final /* synthetic */ Rect j;

        c(Fragment fragment, Fragment fragment2, boolean z, b.f.a aVar, View view, u uVar, Rect rect) {
            this.d = fragment;
            this.e = fragment2;
            this.f = z;
            this.g = aVar;
            this.h = view;
            this.i = uVar;
            this.j = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            s.f(this.d, this.e, this.f, this.g, false);
            View view = this.h;
            if (view != null) {
                this.i.k(view, this.j);
            }
        }
    }

    static class d implements Runnable {
        final /* synthetic */ u d;
        final /* synthetic */ b.f.a e;
        final /* synthetic */ Object f;
        final /* synthetic */ e g;
        final /* synthetic */ ArrayList h;
        final /* synthetic */ View i;
        final /* synthetic */ Fragment j;
        final /* synthetic */ Fragment k;
        final /* synthetic */ boolean l;
        final /* synthetic */ ArrayList m;
        final /* synthetic */ Object n;
        final /* synthetic */ Rect o;

        d(u uVar, b.f.a aVar, Object obj, e eVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.d = uVar;
            this.e = aVar;
            this.f = obj;
            this.g = eVar;
            this.h = arrayList;
            this.i = view;
            this.j = fragment;
            this.k = fragment2;
            this.l = z;
            this.m = arrayList2;
            this.n = obj2;
            this.o = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.f.a<String, View> aVarH = s.h(this.d, this.e, this.f, this.g);
            if (aVarH != null) {
                this.h.addAll(aVarH.values());
                this.h.add(this.i);
            }
            s.f(this.j, this.k, this.l, aVarH, false);
            Object obj = this.f;
            if (obj != null) {
                this.d.z(obj, this.m, this.h);
                View viewT = s.t(aVarH, this.g, this.n, this.l);
                if (viewT != null) {
                    this.d.k(viewT, this.o);
                }
            }
        }
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        public Fragment f471a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f472b;

        /* renamed from: c, reason: collision with root package name */
        public androidx.fragment.app.a f473c;
        public Fragment d;
        public boolean e;
        public androidx.fragment.app.a f;

        e() {
        }
    }

    static {
        f469b = Build.VERSION.SDK_INT >= 21 ? new t() : null;
        f470c = x();
    }

    private s() {
    }

    private static void A(u uVar, Object obj, Object obj2, b.f.a<String, View> aVar, boolean z, androidx.fragment.app.a aVar2) {
        ArrayList<String> arrayList = aVar2.o;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = aVar.get((z ? aVar2.p : aVar2.o).get(0));
        uVar.v(obj, view);
        if (obj2 != null) {
            uVar.v(obj2, view);
        }
    }

    static void B(ArrayList<View> arrayList, int r3) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(r3);
        }
    }

    static void C(j jVar, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int r10, int r11, boolean z) {
        if (jVar.t < 1) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        for (int r1 = r10; r1 < r11; r1++) {
            androidx.fragment.app.a aVar = arrayList.get(r1);
            if (arrayList2.get(r1).booleanValue()) {
                e(aVar, sparseArray, z);
            } else {
                c(aVar, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(jVar.u.h());
            int size = sparseArray.size();
            for (int r3 = 0; r3 < size; r3++) {
                int r4 = sparseArray.keyAt(r3);
                b.f.a<String, String> aVarD = d(r4, arrayList, arrayList2, r10, r11);
                e eVar = (e) sparseArray.valueAt(r3);
                if (z) {
                    o(jVar, r4, eVar, view, aVarD);
                } else {
                    n(jVar, r4, eVar, view, aVarD);
                }
            }
        }
    }

    static boolean D() {
        return (f469b == null && f470c == null) ? false : true;
    }

    private static void a(ArrayList<View> arrayList, b.f.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View viewM = aVar.m(size);
            if (collection.contains(f0.t0(viewM))) {
                arrayList.add(viewM);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(androidx.fragment.app.a r16, androidx.fragment.app.r.a r17, android.util.SparseArray<androidx.fragment.app.s.e> r18, boolean r19, boolean r20) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.s.b(androidx.fragment.app.a, androidx.fragment.app.r$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(androidx.fragment.app.a aVar, SparseArray<e> sparseArray, boolean z) throws Resources.NotFoundException {
        int size = aVar.f462a.size();
        for (int r2 = 0; r2 < size; r2++) {
            b(aVar, aVar.f462a.get(r2), sparseArray, false, z);
        }
    }

    private static b.f.a<String, String> d(int r9, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int r12, int r13) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        b.f.a<String, String> aVar = new b.f.a<>();
        for (int r132 = r13 - 1; r132 >= r12; r132--) {
            androidx.fragment.app.a aVar2 = arrayList.get(r132);
            if (aVar2.W(r9)) {
                boolean zBooleanValue = arrayList2.get(r132).booleanValue();
                ArrayList<String> arrayList5 = aVar2.o;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (zBooleanValue) {
                        arrayList3 = aVar2.o;
                        arrayList4 = aVar2.p;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.o;
                        arrayList3 = aVar2.p;
                        arrayList4 = arrayList6;
                    }
                    for (int r4 = 0; r4 < size; r4++) {
                        String str = arrayList4.get(r4);
                        String str2 = arrayList3.get(r4);
                        String strRemove = aVar.remove(str2);
                        if (strRemove != null) {
                            aVar.put(str, strRemove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(androidx.fragment.app.a aVar, SparseArray<e> sparseArray, boolean z) throws Resources.NotFoundException {
        if (aVar.K.v.f()) {
            for (int size = aVar.f462a.size() - 1; size >= 0; size--) {
                b(aVar, aVar.f462a.get(size), sparseArray, true, z);
            }
        }
    }

    static void f(Fragment fragment, Fragment fragment2, boolean z, b.f.a<String, View> aVar, boolean z2) {
        z zVarW = z ? fragment2.w() : fragment.w();
        if (zVarW != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int r0 = 0; r0 < size; r0++) {
                arrayList2.add(aVar.i(r0));
                arrayList.add(aVar.m(r0));
            }
            if (z2) {
                zVarW.g(arrayList2, arrayList, null);
            } else {
                zVarW.f(arrayList2, arrayList, null);
            }
        }
    }

    private static boolean g(u uVar, List<Object> list) {
        int size = list.size();
        for (int r2 = 0; r2 < size; r2++) {
            if (!uVar.e(list.get(r2))) {
                return false;
            }
        }
        return true;
    }

    static b.f.a<String, View> h(u uVar, b.f.a<String, String> aVar, Object obj, e eVar) {
        z zVarW;
        ArrayList<String> arrayList;
        String strQ;
        Fragment fragment = eVar.f471a;
        View viewX = fragment.X();
        if (aVar.isEmpty() || obj == null || viewX == null) {
            aVar.clear();
            return null;
        }
        b.f.a<String, View> aVar2 = new b.f.a<>();
        uVar.j(aVar2, viewX);
        androidx.fragment.app.a aVar3 = eVar.f473c;
        if (eVar.f472b) {
            zVarW = fragment.y();
            arrayList = aVar3.o;
        } else {
            zVarW = fragment.w();
            arrayList = aVar3.p;
        }
        if (arrayList != null) {
            aVar2.q(arrayList);
            aVar2.q(aVar.values());
        }
        if (zVarW != null) {
            zVarW.d(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    String strQ2 = q(aVar, str);
                    if (strQ2 != null) {
                        aVar.remove(strQ2);
                    }
                } else if (!str.equals(f0.t0(view)) && (strQ = q(aVar, str)) != null) {
                    aVar.put(strQ, f0.t0(view));
                }
            }
        } else {
            y(aVar, aVar2);
        }
        return aVar2;
    }

    private static b.f.a<String, View> i(u uVar, b.f.a<String, String> aVar, Object obj, e eVar) {
        z zVarY;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = eVar.d;
        b.f.a<String, View> aVar2 = new b.f.a<>();
        uVar.j(aVar2, fragment.G1());
        androidx.fragment.app.a aVar3 = eVar.f;
        if (eVar.e) {
            zVarY = fragment.w();
            arrayList = aVar3.p;
        } else {
            zVarY = fragment.y();
            arrayList = aVar3.o;
        }
        aVar2.q(arrayList);
        if (zVarY != null) {
            zVarY.d(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(f0.t0(view))) {
                    aVar.put(f0.t0(view), aVar.remove(str));
                }
            }
        } else {
            aVar.q(aVar2.keySet());
        }
        return aVar2;
    }

    private static u j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object objX = fragment.x();
            if (objX != null) {
                arrayList.add(objX);
            }
            Object objM = fragment.M();
            if (objM != null) {
                arrayList.add(objM);
            }
            Object objO = fragment.O();
            if (objO != null) {
                arrayList.add(objO);
            }
        }
        if (fragment2 != null) {
            Object objV = fragment2.v();
            if (objV != null) {
                arrayList.add(objV);
            }
            Object objJ = fragment2.J();
            if (objJ != null) {
                arrayList.add(objJ);
            }
            Object objN = fragment2.N();
            if (objN != null) {
                arrayList.add(objN);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        u uVar = f469b;
        if (uVar != null && g(uVar, arrayList)) {
            return f469b;
        }
        u uVar2 = f470c;
        if (uVar2 != null && g(uVar2, arrayList)) {
            return f470c;
        }
        if (f469b == null && f470c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList<View> k(u uVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View viewX = fragment.X();
        if (viewX != null) {
            uVar.f(arrayList2, viewX);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        uVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(u uVar, ViewGroup viewGroup, View view, b.f.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object objU;
        b.f.a<String, String> aVar2;
        Object obj3;
        Rect rect;
        Fragment fragment = eVar.f471a;
        Fragment fragment2 = eVar.d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = eVar.f472b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            objU = null;
        } else {
            objU = u(uVar, fragment, fragment2, z);
            aVar2 = aVar;
        }
        b.f.a<String, View> aVarI = i(uVar, aVar2, objU, eVar);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(aVarI.values());
            obj3 = objU;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z, aVarI, true);
        if (obj3 != null) {
            rect = new Rect();
            uVar.y(obj3, view, arrayList);
            A(uVar, obj3, obj2, aVarI, eVar.e, eVar.f);
            if (obj != null) {
                uVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        b.i.p.z.a(viewGroup, new d(uVar, aVar, obj3, eVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj3;
    }

    private static Object m(u uVar, ViewGroup viewGroup, View view, b.f.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = eVar.f471a;
        Fragment fragment2 = eVar.d;
        if (fragment != null) {
            fragment.G1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = eVar.f472b;
        Object objU = aVar.isEmpty() ? null : u(uVar, fragment, fragment2, z);
        b.f.a<String, View> aVarI = i(uVar, aVar, objU, eVar);
        b.f.a<String, View> aVarH = h(uVar, aVar, objU, eVar);
        if (aVar.isEmpty()) {
            if (aVarI != null) {
                aVarI.clear();
            }
            if (aVarH != null) {
                aVarH.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, aVarI, aVar.keySet());
            a(arrayList2, aVarH, aVar.values());
            obj3 = objU;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z, aVarI, true);
        if (obj3 != null) {
            arrayList2.add(view);
            uVar.y(obj3, view, arrayList);
            A(uVar, obj3, obj2, aVarI, eVar.e, eVar.f);
            Rect rect2 = new Rect();
            View viewT = t(aVarH, eVar, obj, z);
            if (viewT != null) {
                uVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = viewT;
        } else {
            view2 = null;
            rect = null;
        }
        b.i.p.z.a(viewGroup, new c(fragment, fragment2, z, aVarH, view2, uVar, rect));
        return obj3;
    }

    private static void n(j jVar, int r20, e eVar, View view, b.f.a<String, String> aVar) {
        Fragment fragment;
        Fragment fragment2;
        u uVarJ;
        Object obj;
        ViewGroup viewGroup = jVar.v.f() ? (ViewGroup) jVar.v.c(r20) : null;
        if (viewGroup == null || (uVarJ = j((fragment2 = eVar.d), (fragment = eVar.f471a))) == null) {
            return;
        }
        boolean z = eVar.f472b;
        boolean z2 = eVar.e;
        Object objR = r(uVarJ, fragment, z);
        Object objS = s(uVarJ, fragment2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objL = l(uVarJ, viewGroup, view, aVar, eVar, arrayList, arrayList2, objR, objS);
        if (objR == null && objL == null) {
            obj = objS;
            if (obj == null) {
                return;
            }
        } else {
            obj = objS;
        }
        ArrayList<View> arrayListK = k(uVarJ, obj, fragment2, arrayList, view);
        Object obj2 = (arrayListK == null || arrayListK.isEmpty()) ? null : obj;
        uVarJ.a(objR, view);
        Object objV = v(uVarJ, objR, obj2, objL, fragment, eVar.f472b);
        if (objV != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            uVarJ.t(objV, objR, arrayList3, obj2, arrayListK, objL, arrayList2);
            z(uVarJ, viewGroup, fragment, view, arrayList2, objR, arrayList3, obj2, arrayListK);
            uVarJ.w(viewGroup, arrayList2, aVar);
            uVarJ.c(viewGroup, objV);
            uVarJ.s(viewGroup, arrayList2, aVar);
        }
    }

    private static void o(j jVar, int r18, e eVar, View view, b.f.a<String, String> aVar) {
        Fragment fragment;
        Fragment fragment2;
        u uVarJ;
        Object obj;
        ViewGroup viewGroup = jVar.v.f() ? (ViewGroup) jVar.v.c(r18) : null;
        if (viewGroup == null || (uVarJ = j((fragment2 = eVar.d), (fragment = eVar.f471a))) == null) {
            return;
        }
        boolean z = eVar.f472b;
        boolean z2 = eVar.e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objR = r(uVarJ, fragment, z);
        Object objS = s(uVarJ, fragment2, z2);
        Object objM = m(uVarJ, viewGroup, view, aVar, eVar, arrayList2, arrayList, objR, objS);
        if (objR == null && objM == null) {
            obj = objS;
            if (obj == null) {
                return;
            }
        } else {
            obj = objS;
        }
        ArrayList<View> arrayListK = k(uVarJ, obj, fragment2, arrayList2, view);
        ArrayList<View> arrayListK2 = k(uVarJ, objR, fragment, arrayList, view);
        B(arrayListK2, 4);
        Object objV = v(uVarJ, objR, obj, objM, fragment, z);
        if (objV != null) {
            w(uVarJ, obj, fragment2, arrayListK);
            ArrayList<String> arrayListO = uVarJ.o(arrayList);
            uVarJ.t(objV, objR, arrayListK2, obj, arrayListK, objM, arrayList);
            uVarJ.c(viewGroup, objV);
            uVarJ.x(viewGroup, arrayList2, arrayList, arrayListO, aVar);
            B(arrayListK2, 0);
            uVarJ.z(objM, arrayList2, arrayList);
        }
    }

    private static e p(e eVar, SparseArray<e> sparseArray, int r2) {
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        sparseArray.put(r2, eVar2);
        return eVar2;
    }

    private static String q(b.f.a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int r1 = 0; r1 < size; r1++) {
            if (str.equals(aVar.m(r1))) {
                return aVar.i(r1);
            }
        }
        return null;
    }

    private static Object r(u uVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return uVar.g(z ? fragment.J() : fragment.v());
    }

    private static Object s(u uVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return uVar.g(z ? fragment.M() : fragment.x());
    }

    static View t(b.f.a<String, View> aVar, e eVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        androidx.fragment.app.a aVar2 = eVar.f473c;
        if (obj == null || aVar == null || (arrayList = aVar2.o) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? aVar2.o : aVar2.p).get(0));
    }

    private static Object u(u uVar, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return uVar.A(uVar.g(z ? fragment2.O() : fragment.N()));
    }

    private static Object v(u uVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.p() : fragment.o() ? uVar.n(obj2, obj, obj3) : uVar.m(obj2, obj, obj3);
    }

    private static void w(u uVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.n && fragment.B && fragment.Q) {
            fragment.T1(true);
            uVar.r(obj, fragment.X(), arrayList);
            b.i.p.z.a(fragment.I, new a(arrayList));
        }
    }

    private static u x() {
        try {
            return (u) Class.forName("b.w.n").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void y(b.f.a<String, String> aVar, b.f.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.m(size))) {
                aVar.k(size);
            }
        }
    }

    private static void z(u uVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        b.i.p.z.a(viewGroup, new b(obj, uVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }
}

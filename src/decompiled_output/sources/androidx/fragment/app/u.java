package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.p0;
import b.i.p.f0;
import b.i.p.h0;
import b.i.p.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class u {

    class a implements Runnable {
        final /* synthetic */ int d;
        final /* synthetic */ ArrayList e;
        final /* synthetic */ ArrayList f;
        final /* synthetic */ ArrayList g;
        final /* synthetic */ ArrayList h;

        a(int r2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.d = r2;
            this.e = arrayList;
            this.f = arrayList2;
            this.g = arrayList3;
            this.h = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int r0 = 0; r0 < this.d; r0++) {
                f0.k2((View) this.e.get(r0), (String) this.f.get(r0));
                f0.k2((View) this.g.get(r0), (String) this.h.get(r0));
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ ArrayList d;
        final /* synthetic */ Map e;

        b(ArrayList arrayList, Map map) {
            this.d = arrayList;
            this.e = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.d.size();
            for (int r1 = 0; r1 < size; r1++) {
                View view = (View) this.d.get(r1);
                String strT0 = f0.t0(view);
                if (strT0 != null) {
                    f0.k2(view, u.i(this.e, strT0));
                }
            }
        }
    }

    class c implements Runnable {
        final /* synthetic */ ArrayList d;
        final /* synthetic */ Map e;

        c(ArrayList arrayList, Map map) {
            this.d = arrayList;
            this.e = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.d.size();
            for (int r1 = 0; r1 < size; r1++) {
                View view = (View) this.d.get(r1);
                f0.k2(view, (String) this.e.get(f0.t0(view)));
            }
        }
    }

    protected static void d(List<View> list, View view) {
        int size = list.size();
        if (h(list, view, size)) {
            return;
        }
        list.add(view);
        for (int r7 = size; r7 < list.size(); r7++) {
            View view2 = list.get(r7);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int r3 = 0; r3 < childCount; r3++) {
                    View childAt = viewGroup.getChildAt(r3);
                    if (!h(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean h(List<View> list, View view, int r5) {
        for (int r1 = 0; r1 < r5; r1++) {
            if (list.get(r1) == view) {
                return true;
            }
        }
        return false;
    }

    static String i(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    protected static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract Object A(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    void f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z = view instanceof ViewGroup;
            View view2 = view;
            if (z) {
                ViewGroup viewGroup = (ViewGroup) view;
                boolean zC = h0.c(viewGroup);
                view2 = viewGroup;
                if (!zC) {
                    int childCount = viewGroup.getChildCount();
                    for (int r1 = 0; r1 < childCount; r1++) {
                        f(arrayList, viewGroup.getChildAt(r1));
                    }
                    return;
                }
            }
            arrayList.add(view2);
        }
    }

    public abstract Object g(Object obj);

    void j(Map<String, View> map, @androidx.annotation.h0 View view) {
        if (view.getVisibility() == 0) {
            String strT0 = f0.t0(view);
            if (strT0 != null) {
                map.put(strT0, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int r1 = 0; r1 < childCount; r1++) {
                    j(map, viewGroup.getChildAt(r1));
                }
            }
        }
    }

    protected void k(View view, Rect rect) {
        int[] r0 = new int[2];
        view.getLocationOnScreen(r0);
        rect.set(r0[0], r0[1], r0[0] + view.getWidth(), r0[1] + view.getHeight());
    }

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    ArrayList<String> o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int r2 = 0; r2 < size; r2++) {
            View view = arrayList.get(r2);
            arrayList2.add(f0.t0(view));
            f0.k2(view, null);
        }
        return arrayList2;
    }

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    void s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        z.a(viewGroup, new c(arrayList, map));
    }

    public abstract void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    void w(View view, ArrayList<View> arrayList, Map<String, String> map) {
        z.a(view, new b(arrayList, map));
    }

    void x(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int r1 = 0; r1 < size; r1++) {
            View view2 = arrayList.get(r1);
            String strT0 = f0.t0(view2);
            arrayList4.add(strT0);
            if (strT0 != null) {
                f0.k2(view2, null);
                String str = map.get(strT0);
                int r5 = 0;
                while (true) {
                    if (r5 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(r5))) {
                        f0.k2(arrayList2.get(r5), strT0);
                        break;
                    }
                    r5++;
                }
            }
        }
        z.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void y(Object obj, View view, ArrayList<View> arrayList);

    public abstract void z(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);
}

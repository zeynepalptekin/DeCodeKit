package b.w;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b.w.a0;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
class p extends FrameLayout {

    @androidx.annotation.h0
    private ViewGroup d;
    private boolean e;

    p(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.d = viewGroup;
        viewGroup.setTag(a0.e.ghost_view_holder, this);
        t0.b(this.d).a(this);
        this.e = true;
    }

    static p b(@androidx.annotation.h0 ViewGroup viewGroup) {
        return (p) viewGroup.getTag(a0.e.ghost_view_holder);
    }

    private int c(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int r2 = 0;
        while (r2 <= childCount) {
            int r3 = (r2 + childCount) / 2;
            d(((r) getChildAt(r3)).f, arrayList2);
            if (f(arrayList, arrayList2)) {
                r2 = r3 + 1;
            } else {
                childCount = r3 - 1;
            }
            arrayList2.clear();
        }
        return r2;
    }

    private static void d(View view, ArrayList<View> arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    private static boolean e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (Build.VERSION.SDK_INT >= 21 && view.getZ() != view2.getZ()) {
            return view.getZ() > view2.getZ();
        }
        for (int r2 = 0; r2 < childCount; r2++) {
            View childAt = viewGroup.getChildAt(t0.a(viewGroup, r2));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                break;
            }
        }
        return true;
    }

    private static boolean f(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int r2 = Math.min(arrayList.size(), arrayList2.size());
        for (int r3 = 1; r3 < r2; r3++) {
            View view = arrayList.get(r3);
            View view2 = arrayList2.get(r3);
            if (view != view2) {
                return e(view, view2);
            }
        }
        return arrayList2.size() == r2;
    }

    void a(r rVar) {
        ArrayList<View> arrayList = new ArrayList<>();
        d(rVar.f, arrayList);
        int r0 = c(arrayList);
        if (r0 < 0 || r0 >= getChildCount()) {
            addView(rVar);
        } else {
            addView(rVar, r0);
        }
    }

    void g() {
        if (!this.e) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        t0.b(this.d).c(this);
        t0.b(this.d).a(this);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (!this.e) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.d.setTag(a0.e.ghost_view_holder, null);
            t0.b(this.d).c(this);
            this.e = false;
        }
    }
}

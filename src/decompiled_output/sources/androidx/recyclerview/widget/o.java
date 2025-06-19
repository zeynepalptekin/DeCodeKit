package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import b.t.a;

/* loaded from: classes.dex */
class o implements n {

    /* renamed from: a, reason: collision with root package name */
    static final n f726a = new o();

    o() {
    }

    private static float e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = 0.0f;
        for (int r2 = 0; r2 < childCount; r2++) {
            View childAt = recyclerView.getChildAt(r2);
            if (childAt != view) {
                float fP = b.i.p.f0.P(childAt);
                if (fP > f) {
                    f = fP;
                }
            }
        }
        return f;
    }

    @Override // androidx.recyclerview.widget.n
    public void a(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            Object tag = view.getTag(a.e.item_touch_helper_previous_elevation);
            if (tag instanceof Float) {
                b.i.p.f0.G1(view, ((Float) tag).floatValue());
            }
            view.setTag(a.e.item_touch_helper_previous_elevation, null);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.n
    public void b(View view) {
    }

    @Override // androidx.recyclerview.widget.n
    public void c(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int r6, boolean z) {
    }

    @Override // androidx.recyclerview.widget.n
    public void d(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int r6, boolean z) {
        if (Build.VERSION.SDK_INT >= 21 && z && view.getTag(a.e.item_touch_helper_previous_elevation) == null) {
            Float fValueOf = Float.valueOf(b.i.p.f0.P(view));
            b.i.p.f0.G1(view, e(recyclerView, view) + 1.0f);
            view.setTag(a.e.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }
}

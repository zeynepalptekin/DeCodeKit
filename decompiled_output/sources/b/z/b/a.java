package b.z.b;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.h0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final ViewGroup.MarginLayoutParams f1555b;

    /* renamed from: a, reason: collision with root package name */
    private LinearLayoutManager f1556a;

    /* renamed from: b.z.b.a$a, reason: collision with other inner class name */
    class C0116a implements Comparator<int[]> {
        C0116a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(int[] r2, int[] r3) {
            return r2[0] - r3[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f1555b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    a(@h0 LinearLayoutManager linearLayoutManager) {
        this.f1556a = linearLayoutManager;
    }

    private boolean a() {
        int top;
        int r10;
        int bottom;
        int r7;
        int r0 = this.f1556a.Q();
        if (r0 == 0) {
            return true;
        }
        boolean z = this.f1556a.Q2() == 0;
        int[][] r4 = (int[][]) Array.newInstance((Class<?>) int.class, r0, 2);
        for (int r5 = 0; r5 < r0; r5++) {
            View viewP = this.f1556a.P(r5);
            if (viewP == null) {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
            ViewGroup.LayoutParams layoutParams = viewP.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f1555b;
            int[] r8 = r4[r5];
            if (z) {
                top = viewP.getLeft();
                r10 = marginLayoutParams.leftMargin;
            } else {
                top = viewP.getTop();
                r10 = marginLayoutParams.topMargin;
            }
            r8[0] = top - r10;
            int[] r82 = r4[r5];
            if (z) {
                bottom = viewP.getRight();
                r7 = marginLayoutParams.rightMargin;
            } else {
                bottom = viewP.getBottom();
                r7 = marginLayoutParams.bottomMargin;
            }
            r82[1] = bottom + r7;
        }
        Arrays.sort(r4, new C0116a());
        for (int r2 = 1; r2 < r0; r2++) {
            if (r4[r2 - 1][1] != r4[r2][0]) {
                return false;
            }
        }
        return r4[0][0] <= 0 && r4[r0 - 1][1] >= r4[0][1] - r4[0][0];
    }

    private boolean b() {
        int r0 = this.f1556a.Q();
        for (int r2 = 0; r2 < r0; r2++) {
            if (c(this.f1556a.P(r2))) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int r3 = 0; r3 < childCount; r3++) {
                if (c(viewGroup.getChildAt(r3))) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean d() {
        return (!a() || this.f1556a.Q() <= 1) && b();
    }
}

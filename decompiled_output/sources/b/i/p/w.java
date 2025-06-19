package b.i.p;

import android.view.View;

/* loaded from: classes.dex */
public interface w {
    int getNestedScrollAxes();

    boolean onNestedFling(@androidx.annotation.h0 View view, float f, float f2, boolean z);

    boolean onNestedPreFling(@androidx.annotation.h0 View view, float f, float f2);

    void onNestedPreScroll(@androidx.annotation.h0 View view, int r2, int r3, @androidx.annotation.h0 int[] r4);

    void onNestedScroll(@androidx.annotation.h0 View view, int r2, int r3, int r4, int r5);

    void onNestedScrollAccepted(@androidx.annotation.h0 View view, @androidx.annotation.h0 View view2, int r3);

    boolean onStartNestedScroll(@androidx.annotation.h0 View view, @androidx.annotation.h0 View view2, int r3);

    void onStopNestedScroll(@androidx.annotation.h0 View view);
}

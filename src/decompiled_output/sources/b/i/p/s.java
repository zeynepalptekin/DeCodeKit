package b.i.p;

/* loaded from: classes.dex */
public interface s {
    boolean dispatchNestedFling(float f, float f2, boolean z);

    boolean dispatchNestedPreFling(float f, float f2);

    boolean dispatchNestedPreScroll(int r1, int r2, @androidx.annotation.i0 int[] r3, @androidx.annotation.i0 int[] r4);

    boolean dispatchNestedScroll(int r1, int r2, int r3, int r4, @androidx.annotation.i0 int[] r5);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z);

    boolean startNestedScroll(int r1);

    void stopNestedScroll();
}

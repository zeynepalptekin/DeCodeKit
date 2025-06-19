package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class p {
    static final int j = -1;
    static final int k = 1;
    static final int l = Integer.MIN_VALUE;
    static final int m = -1;
    static final int n = 1;

    /* renamed from: b, reason: collision with root package name */
    int f728b;

    /* renamed from: c, reason: collision with root package name */
    int f729c;
    int d;
    int e;
    boolean h;
    boolean i;

    /* renamed from: a, reason: collision with root package name */
    boolean f727a = true;
    int f = 0;
    int g = 0;

    p() {
    }

    boolean a(RecyclerView.c0 c0Var) {
        int r0 = this.f729c;
        return r0 >= 0 && r0 < c0Var.d();
    }

    View b(RecyclerView.w wVar) {
        View viewP = wVar.p(this.f729c);
        this.f729c += this.d;
        return viewP;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f728b + ", mCurrentPosition=" + this.f729c + ", mItemDirection=" + this.d + ", mLayoutDirection=" + this.e + ", mStartLine=" + this.f + ", mEndLine=" + this.g + '}';
    }
}

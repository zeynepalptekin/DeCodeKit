package androidx.recyclerview.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.annotation.i0;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class j extends RecyclerView.n {
    public static final int d = 0;
    public static final int e = 1;
    private static final String f = "DividerItem";
    private static final int[] g = {R.attr.listDivider};

    /* renamed from: a, reason: collision with root package name */
    private Drawable f698a;

    /* renamed from: b, reason: collision with root package name */
    private int f699b;

    /* renamed from: c, reason: collision with root package name */
    private final Rect f700c = new Rect();

    public j(Context context, int r4) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(g);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f698a = drawable;
        if (drawable == null) {
            Log.w(f, "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
        p(r4);
    }

    private void l(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int r1 = 0; r1 < childCount; r1++) {
            View childAt = recyclerView.getChildAt(r1);
            recyclerView.getLayoutManager().X(childAt, this.f700c);
            int r5 = this.f700c.right + Math.round(childAt.getTranslationX());
            this.f698a.setBounds(r5 - this.f698a.getIntrinsicWidth(), paddingTop, r5, height);
            this.f698a.draw(canvas);
        }
        canvas.restore();
    }

    private void m(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int paddingLeft;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int r1 = 0; r1 < childCount; r1++) {
            View childAt = recyclerView.getChildAt(r1);
            recyclerView.u0(childAt, this.f700c);
            int r5 = this.f700c.bottom + Math.round(childAt.getTranslationY());
            this.f698a.setBounds(paddingLeft, r5 - this.f698a.getIntrinsicHeight(), width, r5);
            this.f698a.draw(canvas);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        Drawable drawable = this.f698a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f699b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        if (recyclerView.getLayoutManager() == null || this.f698a == null) {
            return;
        }
        if (this.f699b == 1) {
            m(canvas, recyclerView);
        } else {
            l(canvas, recyclerView);
        }
    }

    @i0
    public Drawable n() {
        return this.f698a;
    }

    public void o(@androidx.annotation.h0 Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        this.f698a = drawable;
    }

    public void p(int r2) {
        if (r2 != 0 && r2 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f699b = r2;
    }
}

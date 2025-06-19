package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import b.a.a;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
class g0 extends ListView {
    public static final int r = -1;
    public static final int s = -1;
    private final Rect d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private Field j;
    private a k;
    private boolean l;
    private boolean m;
    private boolean n;
    private b.i.p.j0 o;
    private androidx.core.widget.h p;
    b q;

    private static class a extends b.a.c.a.c {
        private boolean e;

        a(Drawable drawable) {
            super(drawable);
            this.e = true;
        }

        void c(boolean z) {
            this.e = z;
        }

        @Override // b.a.c.a.c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.e) {
                super.draw(canvas);
            }
        }

        @Override // b.a.c.a.c, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.e) {
                super.setHotspot(f, f2);
            }
        }

        @Override // b.a.c.a.c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int r2, int r3, int r4, int r5) {
            if (this.e) {
                super.setHotspotBounds(r2, r3, r4, r5);
            }
        }

        @Override // b.a.c.a.c, android.graphics.drawable.Drawable
        public boolean setState(int[] r2) {
            if (this.e) {
                return super.setState(r2);
            }
            return false;
        }

        @Override // b.a.c.a.c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.e) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    private class b implements Runnable {
        b() {
        }

        public void a() {
            g0 g0Var = g0.this;
            g0Var.q = null;
            g0Var.removeCallbacks(this);
        }

        public void b() {
            g0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            g0 g0Var = g0.this;
            g0Var.q = null;
            g0Var.drawableStateChanged();
        }
    }

    g0(@androidx.annotation.h0 Context context, boolean z) throws NoSuchFieldException {
        super(context, null, a.b.dropDownListViewStyle);
        this.d = new Rect();
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.m = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.j = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private void a() {
        this.n = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.i - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        b.i.p.j0 j0Var = this.o;
        if (j0Var != null) {
            j0Var.c();
            this.o = null;
        }
    }

    private void b(View view, int r4) {
        performItemClick(view, r4, getItemIdAtPosition(r4));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.d.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.d);
        selector.draw(canvas);
    }

    private void g(int r6, View view) throws IllegalAccessException, IllegalArgumentException {
        Rect rect = this.d;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.e;
        rect.top -= this.f;
        rect.right += this.g;
        rect.bottom += this.h;
        try {
            boolean z = this.j.getBoolean(this);
            if (view.isEnabled() != z) {
                this.j.set(this, Boolean.valueOf(!z));
                if (r6 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private void h(int r5, View view) throws IllegalAccessException, IllegalArgumentException {
        Drawable selector = getSelector();
        boolean z = (selector == null || r5 == -1) ? false : true;
        if (z) {
            selector.setVisible(false, false);
        }
        g(r5, view);
        if (z) {
            Rect rect = this.d;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            androidx.core.graphics.drawable.a.k(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void i(int r2, View view, float f, float f2) throws IllegalAccessException, IllegalArgumentException {
        h(r2, view);
        Drawable selector = getSelector();
        if (selector == null || r2 == -1) {
            return;
        }
        androidx.core.graphics.drawable.a.k(selector, f, f2);
    }

    private void j(View view, int r8, float f, float f2) throws IllegalAccessException, IllegalArgumentException {
        View childAt;
        this.n = true;
        if (Build.VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int r1 = this.i;
        if (r1 != -1 && (childAt = getChildAt(r1 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.i = r8;
        float left = f - view.getLeft();
        float top = f2 - view.getTop();
        if (Build.VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        i(r8, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private boolean k() {
        return this.n;
    }

    private void l() {
        Drawable selector = getSelector();
        if (selector != null && k() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        a aVar = this.k;
        if (aVar != null) {
            aVar.c(z);
        }
    }

    public int d(int r5, boolean z) {
        int r52;
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z) {
                    r52 = Math.max(0, r5);
                    while (r52 < count && !adapter.isEnabled(r52)) {
                        r52++;
                    }
                } else {
                    r52 = Math.min(r5, count - 1);
                    while (r52 >= 0 && !adapter.isEnabled(r52)) {
                        r52--;
                    }
                }
                if (r52 < 0 || r52 >= count) {
                    return -1;
                }
                return r52;
            }
            if (r5 >= 0 && r5 < count) {
                return r5;
            }
        }
        return -1;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.q != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        l();
    }

    public int e(int r11, int r12, int r13, int r14, int r15) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return measuredHeight;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int r4 = 0;
        int r5 = 0;
        int r7 = 0;
        while (r4 < count) {
            int itemViewType = adapter.getItemViewType(r4);
            if (itemViewType != r5) {
                view = null;
                r5 = itemViewType;
            }
            view = adapter.getView(r4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int r8 = layoutParams.height;
            view.measure(r11, r8 > 0 ? View.MeasureSpec.makeMeasureSpec(r8, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (r4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= r14) {
                return (r15 < 0 || r4 <= r15 || r7 <= 0 || measuredHeight == r14) ? r14 : r7;
            }
            if (r15 >= 0 && r4 >= r15) {
                r7 = measuredHeight;
            }
            r4++;
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f(android.view.MotionEvent r8, int r9) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = 0
            r3 = 1
            goto L46
        L11:
            r9 = 0
            r3 = 0
            goto L46
        L14:
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = 1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.j(r3, r5, r4, r9)
            if (r0 != r2) goto Le
            r7.b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.h r9 = r7.p
            if (r9 != 0) goto L5a
            androidx.core.widget.h r9 = new androidx.core.widget.h
            r9.<init>(r7)
            r7.p = r9
        L5a:
            androidx.core.widget.h r9 = r7.p
            r9.o(r2)
            androidx.core.widget.h r9 = r7.p
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.h r8 = r7.p
            if (r8 == 0) goto L6c
            r8.o(r1)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.g0.f(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.m || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.m || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.m || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.m && this.l) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.q = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(@androidx.annotation.h0 MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.q == null) {
            b bVar = new b();
            this.q = bVar;
            bVar.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int r5 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (r5 != -1 && r5 != getSelectedItemPosition()) {
                View childAt = getChildAt(r5 - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(r5, childAt.getTop() - getTop());
                }
                l();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.i = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.q;
        if (bVar != null) {
            bVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z) {
        this.l = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.k = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.e = rect.left;
        this.f = rect.top;
        this.g = rect.right;
        this.h = rect.bottom;
    }
}

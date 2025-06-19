package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.p0;
import b.a.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class j0 extends ViewGroup {
    private static final int A = 1;
    private static final int B = 2;
    private static final int C = 3;
    private static final String D = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int s = 0;
    public static final int t = 1;
    public static final int u = 0;
    public static final int v = 1;
    public static final int w = 2;
    public static final int x = 4;
    private static final int y = 4;
    private static final int z = 0;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private float j;
    private boolean k;
    private int[] l;
    private int[] m;
    private Drawable n;
    private int o;
    private int p;
    private int q;
    private int r;

    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface a {
    }

    public static class b extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public float f162a;

        /* renamed from: b, reason: collision with root package name */
        public int f163b;

        public b(int r1, int r2) {
            super(r1, r2);
            this.f163b = -1;
            this.f162a = 0.0f;
        }

        public b(int r1, int r2, float f) {
            super(r1, r2);
            this.f163b = -1;
            this.f162a = f;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f163b = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m.LinearLayoutCompat_Layout);
            this.f162a = typedArrayObtainStyledAttributes.getFloat(a.m.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f163b = typedArrayObtainStyledAttributes.getInt(a.m.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            typedArrayObtainStyledAttributes.recycle();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f163b = -1;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f163b = -1;
        }

        public b(b bVar) {
            super((ViewGroup.MarginLayoutParams) bVar);
            this.f163b = -1;
            this.f162a = bVar.f162a;
            this.f163b = bVar.f163b;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    public j0(@androidx.annotation.h0 Context context) {
        this(context, null);
    }

    public j0(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public j0(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet, int r14) {
        super(context, attributeSet, r14);
        this.d = true;
        this.e = -1;
        this.f = 0;
        this.h = c.a.b.c.c.a.u;
        a1 a1VarG = a1.G(context, attributeSet, a.m.LinearLayoutCompat, r14, 0);
        b.i.p.f0.s1(this, context, a.m.LinearLayoutCompat, attributeSet, a1VarG.B(), r14, 0);
        int r12 = a1VarG.o(a.m.LinearLayoutCompat_android_orientation, -1);
        if (r12 >= 0) {
            setOrientation(r12);
        }
        int r122 = a1VarG.o(a.m.LinearLayoutCompat_android_gravity, -1);
        if (r122 >= 0) {
            setGravity(r122);
        }
        boolean zA = a1VarG.a(a.m.LinearLayoutCompat_android_baselineAligned, true);
        if (!zA) {
            setBaselineAligned(zA);
        }
        this.j = a1VarG.j(a.m.LinearLayoutCompat_android_weightSum, -1.0f);
        this.e = a1VarG.o(a.m.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.k = a1VarG.a(a.m.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a1VarG.h(a.m.LinearLayoutCompat_divider));
        this.q = a1VarG.o(a.m.LinearLayoutCompat_showDividers, 0);
        this.r = a1VarG.g(a.m.LinearLayoutCompat_dividerPadding, 0);
        a1VarG.I();
    }

    private void E(View view, int r2, int r3, int r4, int r5) {
        view.layout(r2, r3, r4 + r2, r5 + r3);
    }

    private void m(int r11, int r12) {
        int r0 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int r1 = 0; r1 < r11; r1++) {
            View viewU = u(r1);
            if (viewU.getVisibility() != 8) {
                b bVar = (b) viewU.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
                    int r9 = ((ViewGroup.MarginLayoutParams) bVar).width;
                    ((ViewGroup.MarginLayoutParams) bVar).width = viewU.getMeasuredWidth();
                    measureChildWithMargins(viewU, r12, 0, r0, 0);
                    ((ViewGroup.MarginLayoutParams) bVar).width = r9;
                }
            }
        }
    }

    private void n(int r11, int r12) {
        int r0 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int r1 = 0; r1 < r11; r1++) {
            View viewU = u(r1);
            if (viewU.getVisibility() != 8) {
                b bVar = (b) viewU.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
                    int r9 = ((ViewGroup.MarginLayoutParams) bVar).height;
                    ((ViewGroup.MarginLayoutParams) bVar).height = viewU.getMeasuredHeight();
                    measureChildWithMargins(viewU, r0, 0, r12, 0);
                    ((ViewGroup.MarginLayoutParams) bVar).height = r9;
                }
            }
        }
    }

    void A(View view, int r8, int r9, int r10, int r11, int r12) {
        measureChildWithMargins(view, r9, r10, r11, r12);
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x03b0 A[PHI: r3
  0x03b0: PHI (r3v36 int) = (r3v32 int), (r3v37 int) binds: [B:168:0x03ae, B:164:0x03a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void B(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 1271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j0.B(int, int):void");
    }

    int C(int r1) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x02dd A[PHI: r10
  0x02dd: PHI (r10v21 int) = (r10v19 int), (r10v22 int) binds: [B:135:0x02db, B:131:0x02d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0328  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void D(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j0.D(int, int):void");
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.View
    public int getBaseline() {
        int r3;
        if (this.e < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int r1 = this.e;
        if (childCount <= r1) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(r1);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.e == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f;
        if (this.g == 1 && (r3 = this.h & 112) != 48) {
            if (r3 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.i) / 2;
            } else if (r3 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.i;
            }
        }
        return bottom + ((ViewGroup.MarginLayoutParams) ((b) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.e;
    }

    public Drawable getDividerDrawable() {
        return this.n;
    }

    public int getDividerPadding() {
        return this.r;
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public int getDividerWidth() {
        return this.o;
    }

    public int getGravity() {
        return this.h;
    }

    public int getOrientation() {
        return this.g;
    }

    public int getShowDividers() {
        return this.q;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.j;
    }

    void i(Canvas canvas) {
        int right;
        int left;
        int paddingRight;
        int virtualChildCount = getVirtualChildCount();
        boolean zB = g1.b(this);
        for (int r2 = 0; r2 < virtualChildCount; r2++) {
            View viewU = u(r2);
            if (viewU != null && viewU.getVisibility() != 8 && v(r2)) {
                b bVar = (b) viewU.getLayoutParams();
                l(canvas, zB ? viewU.getRight() + ((ViewGroup.MarginLayoutParams) bVar).rightMargin : (viewU.getLeft() - ((ViewGroup.MarginLayoutParams) bVar).leftMargin) - this.o);
            }
        }
        if (v(virtualChildCount)) {
            View viewU2 = u(virtualChildCount - 1);
            if (viewU2 != null) {
                b bVar2 = (b) viewU2.getLayoutParams();
                if (zB) {
                    left = viewU2.getLeft();
                    paddingRight = ((ViewGroup.MarginLayoutParams) bVar2).leftMargin;
                    right = (left - paddingRight) - this.o;
                } else {
                    right = viewU2.getRight() + ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
                }
            } else if (zB) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                paddingRight = getPaddingRight();
                right = (left - paddingRight) - this.o;
            }
            l(canvas, right);
        }
    }

    void j(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int r1 = 0; r1 < virtualChildCount; r1++) {
            View viewU = u(r1);
            if (viewU != null && viewU.getVisibility() != 8 && v(r1)) {
                k(canvas, (viewU.getTop() - ((ViewGroup.MarginLayoutParams) ((b) viewU.getLayoutParams())).topMargin) - this.p);
            }
        }
        if (v(virtualChildCount)) {
            View viewU2 = u(virtualChildCount - 1);
            k(canvas, viewU2 == null ? (getHeight() - getPaddingBottom()) - this.p : viewU2.getBottom() + ((ViewGroup.MarginLayoutParams) ((b) viewU2.getLayoutParams())).bottomMargin);
        }
    }

    void k(Canvas canvas, int r6) {
        this.n.setBounds(getPaddingLeft() + this.r, r6, (getWidth() - getPaddingRight()) - this.r, this.p + r6);
        this.n.draw(canvas);
    }

    void l(Canvas canvas, int r7) {
        this.n.setBounds(r7, getPaddingTop() + this.r, this.o + r7, (getHeight() - getPaddingBottom()) - this.r);
        this.n.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        int r0 = this.g;
        if (r0 == 0) {
            return new b(-2, -2);
        }
        if (r0 == 1) {
            return new b(-1, -2);
        }
        return null;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.n == null) {
            return;
        }
        if (this.g == 1) {
            j(canvas);
        } else {
            i(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(D);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(D);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int r3, int r4, int r5, int r6) {
        if (this.g == 1) {
            z(r3, r4, r5, r6);
        } else {
            y(r3, r4, r5, r6);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int r3, int r4) {
        if (this.g == 1) {
            D(r3, r4);
        } else {
            B(r3, r4);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    int r(View view, int r2) {
        return 0;
    }

    int s(View view) {
        return 0;
    }

    public void setBaselineAligned(boolean z2) {
        this.d = z2;
    }

    public void setBaselineAlignedChildIndex(int r3) {
        if (r3 >= 0 && r3 < getChildCount()) {
            this.e = r3;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.n) {
            return;
        }
        this.n = drawable;
        if (drawable != null) {
            this.o = drawable.getIntrinsicWidth();
            this.p = drawable.getIntrinsicHeight();
        } else {
            this.o = 0;
            this.p = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int r1) {
        this.r = r1;
    }

    public void setGravity(int r2) {
        if (this.h != r2) {
            if ((8388615 & r2) == 0) {
                r2 |= b.i.p.h.f1198b;
            }
            if ((r2 & 112) == 0) {
                r2 |= 48;
            }
            this.h = r2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int r3) {
        int r32 = r3 & b.i.p.h.d;
        int r1 = this.h;
        if ((8388615 & r1) != r32) {
            this.h = r32 | ((-8388616) & r1);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.k = z2;
    }

    public void setOrientation(int r2) {
        if (this.g != r2) {
            this.g = r2;
            requestLayout();
        }
    }

    public void setShowDividers(int r2) {
        if (r2 != this.q) {
            requestLayout();
        }
        this.q = r2;
    }

    public void setVerticalGravity(int r3) {
        int r32 = r3 & 112;
        int r0 = this.h;
        if ((r0 & 112) != r32) {
            this.h = r32 | (r0 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.j = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    int t(View view) {
        return 0;
    }

    View u(int r1) {
        return getChildAt(r1);
    }

    @androidx.annotation.p0({p0.a.LIBRARY})
    protected boolean v(int r5) {
        if (r5 == 0) {
            return (this.q & 1) != 0;
        }
        if (r5 == getChildCount()) {
            return (this.q & 4) != 0;
        }
        if ((this.q & 2) == 0) {
            return false;
        }
        for (int r52 = r5 - 1; r52 >= 0; r52--) {
            if (getChildAt(r52).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public boolean w() {
        return this.d;
    }

    public boolean x() {
        return this.k;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void y(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j0.y(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void z(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.h
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.i
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.i
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = 0
        L49:
            if (r12 >= r10) goto Lc6
            android.view.View r13 = r6.u(r12)
            r14 = 1
            if (r13 != 0) goto L59
            int r1 = r6.C(r12)
            int r0 = r0 + r1
            goto Lc3
        L59:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lc3
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.j0$b r5 = (androidx.appcompat.widget.j0.b) r5
            int r1 = r5.f163b
            if (r1 >= 0) goto L75
            r1 = r11
        L75:
            int r2 = b.i.p.f0.W(r17)
            int r1 = b.i.p.h.d(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L8b
            r2 = 5
            if (r1 == r2) goto L88
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L96
        L88:
            int r1 = r8 - r4
            goto L93
        L8b:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
        L93:
            int r2 = r5.rightMargin
            int r1 = r1 - r2
        L96:
            r2 = r1
            boolean r1 = r6.v(r12)
            if (r1 == 0) goto La0
            int r1 = r6.p
            int r0 = r0 + r1
        La0:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.s(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.E(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.t(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.r(r13, r12)
            int r12 = r12 + r0
            r0 = r16
        Lc3:
            r1 = 1
            int r12 = r12 + r1
            goto L49
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j0.z(int, int, int, int):void");
    }
}

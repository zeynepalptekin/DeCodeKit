package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.p0;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.j0;

/* loaded from: classes.dex */
public class ActionMenuView extends j0 implements g.b, androidx.appcompat.view.menu.o {
    private static final String Q = "ActionMenuView";
    static final int R = 56;
    static final int S = 4;
    private androidx.appcompat.view.menu.g E;
    private Context F;
    private int G;
    private boolean H;
    private androidx.appcompat.widget.c I;
    private n.a J;
    g.a K;
    private boolean L;
    private int M;
    private int N;
    private int O;
    e P;

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public interface a {
        boolean a();

        boolean b();
    }

    private static class b implements n.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void a(@androidx.annotation.h0 androidx.appcompat.view.menu.g gVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean b(@androidx.annotation.h0 androidx.appcompat.view.menu.g gVar) {
            return false;
        }
    }

    public static class c extends j0.b {

        /* renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f104c;

        @ViewDebug.ExportedProperty
        public int d;

        @ViewDebug.ExportedProperty
        public int e;

        @ViewDebug.ExportedProperty
        public boolean f;

        @ViewDebug.ExportedProperty
        public boolean g;
        boolean h;

        public c(int r1, int r2) {
            super(r1, r2);
            this.f104c = false;
        }

        c(int r1, int r2, boolean z) {
            super(r1, r2);
            this.f104c = z;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super((ViewGroup.LayoutParams) cVar);
            this.f104c = cVar.f104c;
        }
    }

    private class d implements g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(@androidx.annotation.h0 androidx.appcompat.view.menu.g gVar, @androidx.annotation.h0 MenuItem menuItem) {
            e eVar = ActionMenuView.this.P;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(@androidx.annotation.h0 androidx.appcompat.view.menu.g gVar) {
            g.a aVar = ActionMenuView.this.K;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(@androidx.annotation.h0 Context context) {
        this(context, null);
    }

    public ActionMenuView(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.N = (int) (56.0f * f);
        this.O = (int) (f * 4.0f);
        this.F = context;
        this.G = 0;
    }

    static int P(View view, int r6, int r7, int r8, int r9) {
        c cVar = (c) view.getLayoutParams();
        int r82 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(r8) - r9, View.MeasureSpec.getMode(r8));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = actionMenuItemView != null && actionMenuItemView.h();
        int r3 = 2;
        if (r7 <= 0 || (z && r7 < 2)) {
            r3 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(r7 * r6, Integer.MIN_VALUE), r82);
            int measuredWidth = view.getMeasuredWidth();
            int r4 = measuredWidth / r6;
            if (measuredWidth % r6 != 0) {
                r4++;
            }
            if (!z || r4 >= 2) {
                r3 = r4;
            }
        }
        cVar.f = !cVar.f104c && z;
        cVar.d = r3;
        view.measure(View.MeasureSpec.makeMeasureSpec(r6 * r3, 1073741824), r82);
        return r3;
    }

    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean, int] */
    private void Q(int r30, int r31) {
        int r11;
        int r26;
        boolean z;
        int r24;
        boolean z2;
        boolean z3;
        int r20;
        ?? r14;
        int mode = View.MeasureSpec.getMode(r31);
        int size = View.MeasureSpec.getSize(r30);
        int size2 = View.MeasureSpec.getSize(r31);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(r31, paddingTop, -2);
        int r2 = size - paddingLeft;
        int r4 = this.N;
        int r7 = r2 / r4;
        int r8 = r2 % r4;
        if (r7 == 0) {
            setMeasuredDimension(r2, 0);
            return;
        }
        int r42 = r4 + (r8 / r7);
        int childCount = getChildCount();
        int r10 = 0;
        int r12 = 0;
        boolean z4 = false;
        int r142 = 0;
        int r15 = 0;
        int r16 = 0;
        long j = 0;
        while (r12 < childCount) {
            View childAt = getChildAt(r12);
            int r19 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z5 = childAt instanceof ActionMenuItemView;
                int r143 = r142 + 1;
                if (z5) {
                    int r9 = this.O;
                    r20 = r143;
                    r14 = 0;
                    childAt.setPadding(r9, 0, r9, 0);
                } else {
                    r20 = r143;
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.h = r14;
                cVar.e = r14;
                cVar.d = r14;
                cVar.f = r14;
                ((ViewGroup.MarginLayoutParams) cVar).leftMargin = r14;
                ((ViewGroup.MarginLayoutParams) cVar).rightMargin = r14;
                cVar.g = z5 && ((ActionMenuItemView) childAt).h();
                int r3 = P(childAt, r42, cVar.f104c ? 1 : r7, childMeasureSpec, paddingTop);
                r15 = Math.max(r15, r3);
                if (cVar.f) {
                    r16++;
                }
                if (cVar.f104c) {
                    z4 = true;
                }
                r7 -= r3;
                r10 = Math.max(r10, childAt.getMeasuredHeight());
                if (r3 == 1) {
                    j |= 1 << r12;
                    r10 = r10;
                }
                r142 = r20;
            }
            r12++;
            size2 = r19;
        }
        int r192 = size2;
        boolean z6 = z4 && r142 == 2;
        boolean z7 = false;
        while (r16 > 0 && r7 > 0) {
            int r32 = 0;
            int r112 = 0;
            int r122 = ActivityChooserView.f.j;
            long j2 = 0;
            while (r112 < childCount) {
                boolean z8 = z7;
                c cVar2 = (c) getChildAt(r112).getLayoutParams();
                int r242 = r10;
                if (cVar2.f) {
                    int r92 = cVar2.d;
                    if (r92 < r122) {
                        j2 = 1 << r112;
                        r122 = r92;
                        r32 = 1;
                    } else if (r92 == r122) {
                        r32++;
                        j2 |= 1 << r112;
                    }
                }
                r112++;
                r10 = r242;
                z7 = z8;
            }
            z = z7;
            r24 = r10;
            j |= j2;
            if (r32 > r7) {
                r11 = mode;
                r26 = r2;
                break;
            }
            int r123 = r122 + 1;
            int r33 = 0;
            while (r33 < childCount) {
                View childAt2 = getChildAt(r33);
                c cVar3 = (c) childAt2.getLayoutParams();
                int r262 = r2;
                int r113 = mode;
                long j3 = 1 << r33;
                if ((j2 & j3) == 0) {
                    if (cVar3.d == r123) {
                        j |= j3;
                    }
                    z3 = z6;
                } else {
                    if (z6 && cVar3.g && r7 == 1) {
                        int r22 = this.O;
                        z3 = z6;
                        childAt2.setPadding(r22 + r42, 0, r22, 0);
                    } else {
                        z3 = z6;
                    }
                    cVar3.d++;
                    cVar3.h = true;
                    r7--;
                }
                r33++;
                mode = r113;
                r2 = r262;
                z6 = z3;
            }
            r10 = r24;
            z7 = true;
        }
        r11 = mode;
        r26 = r2;
        z = z7;
        r24 = r10;
        boolean z9 = !z4 && r142 == 1;
        if (r7 <= 0 || j == 0 || (r7 >= r142 - 1 && !z9 && r15 <= 1)) {
            z2 = z;
        } else {
            float fBitCount = Long.bitCount(j);
            if (!z9) {
                if ((j & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).g) {
                    fBitCount -= 0.5f;
                }
                int r23 = childCount - 1;
                if ((j & (1 << r23)) != 0 && !((c) getChildAt(r23).getLayoutParams()).g) {
                    fBitCount -= 0.5f;
                }
            }
            int r1 = fBitCount > 0.0f ? (int) ((r7 * r42) / fBitCount) : 0;
            z2 = z;
            for (int r25 = 0; r25 < childCount; r25++) {
                if ((j & (1 << r25)) != 0) {
                    View childAt3 = getChildAt(r25);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.e = r1;
                        cVar4.h = true;
                        if (r25 == 0 && !cVar4.g) {
                            ((ViewGroup.MarginLayoutParams) cVar4).leftMargin = (-r1) / 2;
                        }
                    } else if (cVar4.f104c) {
                        cVar4.e = r1;
                        cVar4.h = true;
                        ((ViewGroup.MarginLayoutParams) cVar4).rightMargin = (-r1) / 2;
                    } else {
                        if (r25 != 0) {
                            ((ViewGroup.MarginLayoutParams) cVar4).leftMargin = r1 / 2;
                        }
                        if (r25 != childCount - 1) {
                            ((ViewGroup.MarginLayoutParams) cVar4).rightMargin = r1 / 2;
                        }
                    }
                    z2 = true;
                }
            }
        }
        if (z2) {
            for (int r93 = 0; r93 < childCount; r93++) {
                View childAt4 = getChildAt(r93);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.d * r42) + cVar5.e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(r26, r11 != 1073741824 ? r24 : r192);
    }

    public void F() {
        androidx.appcompat.widget.c cVar = this.I;
        if (cVar != null) {
            cVar.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.j0
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        cVar.f163b = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.j0
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.j0
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (cVar.f163b <= 0) {
            cVar.f163b = 16;
        }
        return cVar;
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public c J() {
        c cVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        cVarGenerateDefaultLayoutParams.f104c = true;
        return cVarGenerateDefaultLayoutParams;
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    protected boolean K(int r5) {
        boolean zA = false;
        if (r5 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(r5 - 1);
        KeyEvent.Callback childAt2 = getChildAt(r5);
        if (r5 < getChildCount() && (childAt instanceof a)) {
            zA = false | ((a) childAt).a();
        }
        return (r5 <= 0 || !(childAt2 instanceof a)) ? zA : zA | ((a) childAt2).b();
    }

    public boolean L() {
        androidx.appcompat.widget.c cVar = this.I;
        return cVar != null && cVar.u();
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public boolean M() {
        androidx.appcompat.widget.c cVar = this.I;
        return cVar != null && cVar.w();
    }

    public boolean N() {
        androidx.appcompat.widget.c cVar = this.I;
        return cVar != null && cVar.x();
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public boolean O() {
        return this.H;
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public androidx.appcompat.view.menu.g R() {
        return this.E;
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void S(n.a aVar, g.a aVar2) {
        this.J = aVar;
        this.K = aVar2;
    }

    public boolean T() {
        androidx.appcompat.widget.c cVar = this.I;
        return cVar != null && cVar.G();
    }

    @Override // androidx.appcompat.view.menu.g.b
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public boolean a(androidx.appcompat.view.menu.j jVar) {
        return this.E.O(jVar, 0);
    }

    @Override // androidx.appcompat.view.menu.o
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void c(androidx.appcompat.view.menu.g gVar) {
        this.E = gVar;
    }

    @Override // androidx.appcompat.widget.j0, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.E == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
            this.E = gVar;
            gVar.X(new d());
            androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(context);
            this.I = cVar;
            cVar.E(true);
            androidx.appcompat.widget.c cVar2 = this.I;
            n.a bVar = this.J;
            if (bVar == null) {
                bVar = new b();
            }
            cVar2.T(bVar);
            this.E.c(this.I, this.F);
            this.I.C(this);
        }
        return this.E;
    }

    @androidx.annotation.i0
    public Drawable getOverflowIcon() {
        getMenu();
        return this.I.t();
    }

    public int getPopupTheme() {
        return this.G;
    }

    @Override // androidx.appcompat.view.menu.o
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.c cVar = this.I;
        if (cVar != null) {
            cVar.N(false);
            if (this.I.x()) {
                this.I.u();
                this.I.G();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        F();
    }

    @Override // androidx.appcompat.widget.j0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int r19, int r20, int r21, int r22) {
        int width;
        int paddingLeft;
        if (!this.L) {
            super.onLayout(z, r19, r20, r21, r22);
            return;
        }
        int childCount = getChildCount();
        int r2 = (r22 - r20) / 2;
        int dividerWidth = getDividerWidth();
        int r4 = r21 - r19;
        int paddingRight = (r4 - getPaddingRight()) - getPaddingLeft();
        boolean zB = g1.b(this);
        int r9 = 0;
        int r10 = 0;
        for (int r8 = 0; r8 < childCount; r8++) {
            View childAt = getChildAt(r8);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f104c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (K(r8)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int r7 = r2 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, r7, width, measuredHeight + r7);
                    paddingRight -= measuredWidth;
                    r9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin) + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                    K(r8);
                    r10++;
                }
            }
        }
        if (childCount == 1 && r9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int r42 = (r4 / 2) - (measuredWidth2 / 2);
            int r23 = r2 - (measuredHeight2 / 2);
            childAt2.layout(r42, r23, measuredWidth2 + r42, measuredHeight2 + r23);
            return;
        }
        int r102 = r10 - (r9 ^ 1);
        int r3 = Math.max(0, r102 > 0 ? paddingRight / r102 : 0);
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int r72 = 0; r72 < childCount; r72++) {
                View childAt3 = getChildAt(r72);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f104c) {
                    int r5 = width2 - ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int r103 = r2 - (measuredHeight3 / 2);
                    childAt3.layout(r5 - measuredWidth3, r103, r5, measuredHeight3 + r103);
                    width2 = r5 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin) + r3);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int r73 = 0; r73 < childCount; r73++) {
            View childAt4 = getChildAt(r73);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f104c) {
                int r52 = paddingLeft2 + ((ViewGroup.MarginLayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int r104 = r2 - (measuredHeight4 / 2);
                childAt4.layout(r52, r104, r52 + measuredWidth4, measuredHeight4 + r104);
                paddingLeft2 = r52 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) cVar3).rightMargin + r3;
            }
        }
    }

    @Override // androidx.appcompat.widget.j0, android.view.View
    protected void onMeasure(int r6, int r7) {
        androidx.appcompat.view.menu.g gVar;
        boolean z = this.L;
        boolean z2 = View.MeasureSpec.getMode(r6) == 1073741824;
        this.L = z2;
        if (z != z2) {
            this.M = 0;
        }
        int size = View.MeasureSpec.getSize(r6);
        if (this.L && (gVar = this.E) != null && size != this.M) {
            this.M = size;
            gVar.N(true);
        }
        int childCount = getChildCount();
        if (this.L && childCount > 0) {
            Q(r6, r7);
            return;
        }
        for (int r1 = 0; r1 < childCount; r1++) {
            c cVar = (c) getChildAt(r1).getLayoutParams();
            ((ViewGroup.MarginLayoutParams) cVar).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(r6, r7);
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void setExpandedActionViewsExclusive(boolean z) {
        this.I.A(z);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.P = eVar;
    }

    public void setOverflowIcon(@androidx.annotation.i0 Drawable drawable) {
        getMenu();
        this.I.D(drawable);
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void setOverflowReserved(boolean z) {
        this.H = z;
    }

    public void setPopupTheme(@androidx.annotation.t0 int r3) {
        if (this.G != r3) {
            this.G = r3;
            if (r3 == 0) {
                this.F = getContext();
            } else {
                this.F = new ContextThemeWrapper(getContext(), r3);
            }
        }
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void setPresenter(androidx.appcompat.widget.c cVar) {
        this.I = cVar;
        cVar.C(this);
    }
}

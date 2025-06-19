package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.p0;
import androidx.appcompat.widget.j0;
import b.a.a;

@androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class AlertDialogLayout extends j0 {
    public AlertDialogLayout(@androidx.annotation.i0 Context context) {
        super(context);
    }

    public AlertDialogLayout(@androidx.annotation.i0 Context context, @androidx.annotation.i0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void E(View view, int r2, int r3, int r4, int r5) {
        view.layout(r2, r3, r4 + r2, r5 + r3);
    }

    private static int F(View view) throws NoSuchFieldException {
        int r0 = b.i.p.f0.b0(view);
        if (r0 > 0) {
            return r0;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return F(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    private boolean G(int r17, int r18) throws NoSuchFieldException {
        int r4;
        int r13;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int r8 = 0; r8 < childCount; r8++) {
            View childAt = getChildAt(r8);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == a.g.topPanel) {
                    view = childAt;
                } else if (id == a.g.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != a.g.contentPanel && id != a.g.customPanel) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(r18);
        int size = View.MeasureSpec.getSize(r18);
        int mode2 = View.MeasureSpec.getMode(r17);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(r17, 0);
            paddingTop += view.getMeasuredHeight();
            r4 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            r4 = 0;
        }
        if (view2 != null) {
            view2.measure(r17, 0);
            r13 = F(view2);
            measuredHeight = view2.getMeasuredHeight() - r13;
            paddingTop += r13;
            r4 = View.combineMeasuredStates(r4, view2.getMeasuredState());
        } else {
            r13 = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(r17, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingTop += measuredHeight2;
            r4 = View.combineMeasuredStates(r4, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int r10 = size - paddingTop;
        if (view2 != null) {
            int r12 = paddingTop - r13;
            int r14 = Math.min(r10, measuredHeight);
            if (r14 > 0) {
                r10 -= r14;
                r13 += r14;
            }
            view2.measure(r17, View.MeasureSpec.makeMeasureSpec(r13, 1073741824));
            paddingTop = r12 + view2.getMeasuredHeight();
            r4 = View.combineMeasuredStates(r4, view2.getMeasuredState());
        }
        if (view3 != null && r10 > 0) {
            view3.measure(r17, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + r10, mode));
            paddingTop = (paddingTop - measuredHeight2) + view3.getMeasuredHeight();
            r4 = View.combineMeasuredStates(r4, view3.getMeasuredState());
        }
        int r7 = 0;
        for (int r6 = 0; r6 < childCount; r6++) {
            View childAt2 = getChildAt(r6);
            if (childAt2.getVisibility() != 8) {
                r7 = Math.max(r7, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(r7 + getPaddingLeft() + getPaddingRight(), r17, r4), View.resolveSizeAndState(paddingTop, r18, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        n(childCount, r18);
        return true;
    }

    private void n(int r11, int r12) {
        int r0 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int r1 = 0; r1 < r11; r1++) {
            View childAt = getChildAt(r1);
            if (childAt.getVisibility() != 8) {
                j0.b bVar = (j0.b) childAt.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
                    int r9 = ((ViewGroup.MarginLayoutParams) bVar).height;
                    ((ViewGroup.MarginLayoutParams) bVar).height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, r0, 0, r12, 0);
                    ((ViewGroup.MarginLayoutParams) bVar).height = r9;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    @Override // androidx.appcompat.widget.j0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r21 - r19
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r0 = r17.getMeasuredHeight()
            int r10 = r17.getChildCount()
            int r1 = r17.getGravity()
            r2 = r1 & 112(0x70, float:1.57E-43)
            r3 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r1 & r3
            r1 = 16
            if (r2 == r1) goto L40
            r1 = 80
            if (r2 == r1) goto L35
            int r0 = r17.getPaddingTop()
            goto L4b
        L35:
            int r1 = r17.getPaddingTop()
            int r1 = r1 + r22
            int r1 = r1 - r20
            int r0 = r1 - r0
            goto L4b
        L40:
            int r1 = r17.getPaddingTop()
            int r2 = r22 - r20
            int r2 = r2 - r0
            int r2 = r2 / 2
            int r0 = r1 + r2
        L4b:
            android.graphics.drawable.Drawable r1 = r17.getDividerDrawable()
            r2 = 0
            if (r1 != 0) goto L54
            r12 = 0
            goto L59
        L54:
            int r1 = r1.getIntrinsicHeight()
            r12 = r1
        L59:
            r13 = 0
        L5a:
            if (r13 >= r10) goto Lbd
            android.view.View r1 = r6.getChildAt(r13)
            if (r1 == 0) goto Lba
            int r2 = r1.getVisibility()
            r3 = 8
            if (r2 == r3) goto Lba
            int r4 = r1.getMeasuredWidth()
            int r14 = r1.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            r15 = r2
            androidx.appcompat.widget.j0$b r15 = (androidx.appcompat.widget.j0.b) r15
            int r2 = r15.f163b
            if (r2 >= 0) goto L7e
            r2 = r11
        L7e:
            int r3 = b.i.p.f0.W(r17)
            int r2 = b.i.p.h.d(r2, r3)
            r2 = r2 & 7
            r3 = 1
            if (r2 == r3) goto L95
            r3 = 5
            if (r2 == r3) goto L92
            int r2 = r15.leftMargin
            int r2 = r2 + r7
            goto La0
        L92:
            int r2 = r8 - r4
            goto L9d
        L95:
            int r2 = r9 - r4
            int r2 = r2 / 2
            int r2 = r2 + r7
            int r3 = r15.leftMargin
            int r2 = r2 + r3
        L9d:
            int r3 = r15.rightMargin
            int r2 = r2 - r3
        La0:
            boolean r3 = r6.v(r13)
            if (r3 == 0) goto La7
            int r0 = r0 + r12
        La7:
            int r3 = r15.topMargin
            int r16 = r0 + r3
            r0 = r17
            r3 = r16
            r5 = r14
            r0.E(r1, r2, r3, r4, r5)
            int r0 = r15.bottomMargin
            int r14 = r14 + r0
            int r16 = r16 + r14
            r0 = r16
        Lba:
            int r13 = r13 + 1
            goto L5a
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // androidx.appcompat.widget.j0, android.view.View
    protected void onMeasure(int r2, int r3) {
        if (G(r2, r3)) {
            return;
        }
        super.onMeasure(r2, r3);
    }
}

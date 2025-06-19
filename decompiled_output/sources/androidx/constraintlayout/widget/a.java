package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.h;

/* loaded from: classes.dex */
public class a extends b {
    public static final int m = 0;
    public static final int n = 2;
    public static final int o = 1;
    public static final int p = 3;
    public static final int q = 5;
    public static final int r = 6;
    private int j;
    private int k;
    private b.g.a.i.b l;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public a(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.b
    protected void b(AttributeSet attributeSet) throws IllegalAccessException, IllegalArgumentException {
        super.b(attributeSet);
        this.l = new b.g.a.i.b();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.c.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int r2 = 0; r2 < indexCount; r2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(r2);
                if (index == h.c.ConstraintLayout_Layout_barrierDirection) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == h.c.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.l.S1(typedArrayObtainStyledAttributes.getBoolean(index, true));
                }
            }
        }
        this.g = this.l;
        f();
    }

    public boolean g() {
        return this.l.R1();
    }

    public int getType() {
        return this.j;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.l.S1(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setType(int r7) {
        /*
            r6 = this;
            r6.j = r7
            r6.k = r7
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 6
            r2 = 5
            r3 = 0
            r4 = 1
            r5 = 17
            if (r0 >= r5) goto L18
            if (r7 != r2) goto L13
        L10:
            r6.k = r3
            goto L3b
        L13:
            if (r7 != r1) goto L3b
        L15:
            r6.k = r4
            goto L3b
        L18:
            android.content.res.Resources r7 = r6.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.getLayoutDirection()
            if (r4 != r7) goto L28
            r7 = 1
            goto L29
        L28:
            r7 = 0
        L29:
            if (r7 == 0) goto L33
            int r7 = r6.j
            if (r7 != r2) goto L30
            goto L15
        L30:
            if (r7 != r1) goto L3b
            goto L10
        L33:
            int r7 = r6.j
            if (r7 != r2) goto L38
            goto L10
        L38:
            if (r7 != r1) goto L3b
            goto L15
        L3b:
            b.g.a.i.b r7 = r6.l
            int r0 = r6.k
            r7.T1(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.a.setType(int):void");
    }
}

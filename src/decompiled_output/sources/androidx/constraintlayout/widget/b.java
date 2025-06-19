package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.h;
import b.g.a.i.l;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class b extends View {
    protected int[] d;
    protected int e;
    protected Context f;
    protected l g;
    protected boolean h;
    private String i;

    public b(Context context) throws IllegalAccessException, IllegalArgumentException {
        super(context);
        this.d = new int[32];
        this.h = false;
        this.f = context;
        b(null);
    }

    public b(Context context, AttributeSet attributeSet) throws IllegalAccessException, IllegalArgumentException {
        super(context, attributeSet);
        this.d = new int[32];
        this.h = false;
        this.f = context;
        b(attributeSet);
    }

    public b(Context context, AttributeSet attributeSet, int r3) throws IllegalAccessException, IllegalArgumentException {
        super(context, attributeSet, r3);
        this.d = new int[32];
        this.h = false;
        this.f = context;
        b(attributeSet);
    }

    private void a(String str) throws IllegalAccessException, IllegalArgumentException {
        int identifier;
        Object objD;
        if (str == null || this.f == null) {
            return;
        }
        String strTrim = str.trim();
        try {
            identifier = h.b.class.getField(strTrim).getInt(null);
        } catch (Exception unused) {
            identifier = 0;
        }
        if (identifier == 0) {
            identifier = this.f.getResources().getIdentifier(strTrim, "id", this.f.getPackageName());
        }
        if (identifier == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout) && (objD = ((ConstraintLayout) getParent()).d(0, strTrim)) != null && (objD instanceof Integer)) {
            identifier = ((Integer) objD).intValue();
        }
        if (identifier != 0) {
            setTag(identifier, null);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    private void setIds(String str) throws IllegalAccessException, IllegalArgumentException {
        if (str == null) {
            return;
        }
        int r0 = 0;
        while (true) {
            int r1 = str.indexOf(44, r0);
            if (r1 == -1) {
                a(str.substring(r0));
                return;
            } else {
                a(str.substring(r0, r1));
                r0 = r1 + 1;
            }
        }
    }

    protected void b(AttributeSet attributeSet) throws IllegalAccessException, IllegalArgumentException {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.c.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int r1 = 0; r1 < indexCount; r1++) {
                int index = typedArrayObtainStyledAttributes.getIndex(r1);
                if (index == h.c.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.i = string;
                    setIds(string);
                }
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
    }

    public void d(ConstraintLayout constraintLayout) {
    }

    public void e(ConstraintLayout constraintLayout) throws IllegalAccessException, IllegalArgumentException {
        if (isInEditMode()) {
            setIds(this.i);
        }
        l lVar = this.g;
        if (lVar == null) {
            return;
        }
        lVar.Q1();
        for (int r0 = 0; r0 < this.e; r0++) {
            View viewF = constraintLayout.f(this.d[r0]);
            if (viewF != null) {
                this.g.P1(constraintLayout.g(viewF));
            }
        }
    }

    public void f() {
        if (this.g == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            ((ConstraintLayout.a) layoutParams).l0 = this.g;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.d, this.e);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int r2, int r3) {
        if (this.h) {
            super.onMeasure(r2, r3);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] r4) {
        this.e = 0;
        for (int r0 : r4) {
            setTag(r0, null);
        }
    }

    @Override // android.view.View
    public void setTag(int r3, Object obj) {
        int r4 = this.e + 1;
        int[] r0 = this.d;
        if (r4 > r0.length) {
            this.d = Arrays.copyOf(r0, r0.length * 2);
        }
        int[] r42 = this.d;
        int r02 = this.e;
        r42[r02] = r3;
        this.e = r02 + 1;
    }
}

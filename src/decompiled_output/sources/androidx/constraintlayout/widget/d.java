package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.h;

/* loaded from: classes.dex */
public class d extends ViewGroup {
    public static final String e = "Constraints";
    c d;

    public static class a extends ConstraintLayout.a {
        public float F0;
        public boolean G0;
        public float H0;
        public float I0;
        public float J0;
        public float K0;
        public float L0;
        public float M0;
        public float N0;
        public float O0;
        public float P0;
        public float Q0;
        public float R0;

        public a(int r1, int r2) {
            super(r1, r2);
            this.F0 = 1.0f;
            this.G0 = false;
            this.H0 = 0.0f;
            this.I0 = 0.0f;
            this.J0 = 0.0f;
            this.K0 = 0.0f;
            this.L0 = 1.0f;
            this.M0 = 1.0f;
            this.N0 = 0.0f;
            this.O0 = 0.0f;
            this.P0 = 0.0f;
            this.Q0 = 0.0f;
            this.R0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            float f;
            super(context, attributeSet);
            this.F0 = 1.0f;
            this.G0 = false;
            this.H0 = 0.0f;
            this.I0 = 0.0f;
            this.J0 = 0.0f;
            this.K0 = 0.0f;
            this.L0 = 1.0f;
            this.M0 = 1.0f;
            this.N0 = 0.0f;
            this.O0 = 0.0f;
            this.P0 = 0.0f;
            this.Q0 = 0.0f;
            this.R0 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.c.ConstraintSet);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int r1 = 0; r1 < indexCount; r1++) {
                int index = typedArrayObtainStyledAttributes.getIndex(r1);
                if (index == h.c.ConstraintSet_android_alpha) {
                    this.F0 = typedArrayObtainStyledAttributes.getFloat(index, this.F0);
                } else if (index == h.c.ConstraintSet_android_elevation) {
                    this.H0 = typedArrayObtainStyledAttributes.getFloat(index, this.H0);
                    this.G0 = true;
                } else if (index == h.c.ConstraintSet_android_rotationX) {
                    this.J0 = typedArrayObtainStyledAttributes.getFloat(index, this.J0);
                } else if (index == h.c.ConstraintSet_android_rotationY) {
                    this.K0 = typedArrayObtainStyledAttributes.getFloat(index, this.K0);
                } else if (index == h.c.ConstraintSet_android_rotation) {
                    this.I0 = typedArrayObtainStyledAttributes.getFloat(index, this.I0);
                } else if (index == h.c.ConstraintSet_android_scaleX) {
                    this.L0 = typedArrayObtainStyledAttributes.getFloat(index, this.L0);
                } else if (index == h.c.ConstraintSet_android_scaleY) {
                    this.M0 = typedArrayObtainStyledAttributes.getFloat(index, this.M0);
                } else if (index == h.c.ConstraintSet_android_transformPivotX) {
                    this.N0 = typedArrayObtainStyledAttributes.getFloat(index, this.N0);
                } else if (index == h.c.ConstraintSet_android_transformPivotY) {
                    this.O0 = typedArrayObtainStyledAttributes.getFloat(index, this.O0);
                } else {
                    if (index == h.c.ConstraintSet_android_translationX) {
                        f = this.P0;
                    } else if (index == h.c.ConstraintSet_android_translationY) {
                        this.Q0 = typedArrayObtainStyledAttributes.getFloat(index, this.Q0);
                    } else if (index == h.c.ConstraintSet_android_translationZ) {
                        f = this.R0;
                    }
                    this.P0 = typedArrayObtainStyledAttributes.getFloat(index, f);
                }
            }
        }

        public a(a aVar) {
            super((ConstraintLayout.a) aVar);
            this.F0 = 1.0f;
            this.G0 = false;
            this.H0 = 0.0f;
            this.I0 = 0.0f;
            this.J0 = 0.0f;
            this.K0 = 0.0f;
            this.L0 = 1.0f;
            this.M0 = 1.0f;
            this.N0 = 0.0f;
            this.O0 = 0.0f;
            this.P0 = 0.0f;
            this.Q0 = 0.0f;
            this.R0 = 0.0f;
        }
    }

    public d(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet);
        super.setVisibility(8);
    }

    public d(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        c(attributeSet);
        super.setVisibility(8);
    }

    private void c(AttributeSet attributeSet) {
        Log.v(e, " ################# init");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.a(layoutParams);
    }

    public c getConstraintSet() {
        if (this.d == null) {
            this.d = new c();
        }
        this.d.r(this);
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int r2, int r3, int r4, int r5) {
    }
}

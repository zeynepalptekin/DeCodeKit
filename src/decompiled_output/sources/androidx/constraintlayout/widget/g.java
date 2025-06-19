package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.h;

/* loaded from: classes.dex */
public class g extends View {
    private int d;
    private View e;
    private int f;

    public g(Context context) {
        super(context);
        this.d = -1;
        this.e = null;
        this.f = 4;
        a(null);
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -1;
        this.e = null;
        this.f = 4;
        a(attributeSet);
    }

    public g(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        this.d = -1;
        this.e = null;
        this.f = 4;
        a(attributeSet);
    }

    public g(Context context, AttributeSet attributeSet, int r3, int r4) {
        super(context, attributeSet, r3);
        this.d = -1;
        this.e = null;
        this.f = 4;
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        super.setVisibility(this.f);
        this.d = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.c.ConstraintLayout_placeholder);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int r1 = 0; r1 < indexCount; r1++) {
                int index = typedArrayObtainStyledAttributes.getIndex(r1);
                if (index == h.c.ConstraintLayout_placeholder_content) {
                    this.d = typedArrayObtainStyledAttributes.getResourceId(index, this.d);
                } else if (index == h.c.ConstraintLayout_placeholder_emptyVisibility) {
                    this.f = typedArrayObtainStyledAttributes.getInt(index, this.f);
                }
            }
        }
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.e == null) {
            return;
        }
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        ConstraintLayout.a aVar2 = (ConstraintLayout.a) this.e.getLayoutParams();
        aVar2.l0.E1(0);
        aVar.l0.F1(aVar2.l0.p0());
        aVar.l0.g1(aVar2.l0.J());
        aVar2.l0.E1(8);
    }

    public void c(ConstraintLayout constraintLayout) {
        if (this.d == -1 && !isInEditMode()) {
            setVisibility(this.f);
        }
        View viewFindViewById = constraintLayout.findViewById(this.d);
        this.e = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.a) viewFindViewById.getLayoutParams()).a0 = true;
            this.e.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.e;
    }

    public int getEmptyVisibility() {
        return this.f;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int r3 = rect.height();
            int r4 = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((r4 / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((r3 / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int r3) {
        View viewFindViewById;
        if (this.d == r3) {
            return;
        }
        View view = this.e;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.a) this.e.getLayoutParams()).a0 = false;
            this.e = null;
        }
        this.d = r3;
        if (r3 == -1 || (viewFindViewById = ((View) getParent()).findViewById(r3)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int r1) {
        this.f = r1;
    }
}

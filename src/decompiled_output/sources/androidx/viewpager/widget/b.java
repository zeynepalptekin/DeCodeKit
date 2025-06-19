package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import androidx.annotation.m;
import androidx.annotation.q;
import b.i.p.f0;

/* loaded from: classes.dex */
public class b extends c {
    private static final String L = "PagerTabStrip";
    private static final int M = 3;
    private static final int N = 6;
    private static final int O = 16;
    private static final int P = 32;
    private static final int Q = 64;
    private static final int R = 1;
    private static final int S = 32;
    private int A;
    private final Paint B;
    private final Rect C;
    private int D;
    private boolean E;
    private boolean F;
    private int G;
    private boolean H;
    private float I;
    private float J;
    private int K;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            b.this.d.setCurrentItem(r2.getCurrentItem() - 1);
        }
    }

    /* renamed from: androidx.viewpager.widget.b$b, reason: collision with other inner class name */
    class ViewOnClickListenerC0036b implements View.OnClickListener {
        ViewOnClickListenerC0036b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            ViewPager viewPager = b.this.d;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public b(@h0 Context context) {
        this(context, null);
    }

    public b(@h0 Context context, @i0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = new Paint();
        this.C = new Rect();
        this.D = 255;
        this.E = false;
        this.F = false;
        int r0 = this.q;
        this.v = r0;
        this.B.setColor(r0);
        float f = context.getResources().getDisplayMetrics().density;
        this.w = (int) ((3.0f * f) + 0.5f);
        this.x = (int) ((6.0f * f) + 0.5f);
        this.y = (int) (64.0f * f);
        this.A = (int) ((16.0f * f) + 0.5f);
        this.G = (int) ((1.0f * f) + 0.5f);
        this.z = (int) ((f * 32.0f) + 0.5f);
        this.K = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.e.setFocusable(true);
        this.e.setOnClickListener(new a());
        this.g.setFocusable(true);
        this.g.setOnClickListener(new ViewOnClickListenerC0036b());
        if (getBackground() == null) {
            this.E = true;
        }
    }

    @Override // androidx.viewpager.widget.c
    void d(int r6, float f, boolean z) {
        Rect rect = this.C;
        int height = getHeight();
        int left = this.f.getLeft() - this.A;
        int right = this.f.getRight() + this.A;
        int r4 = height - this.w;
        rect.set(left, r4, right, height);
        super.d(r6, f, z);
        this.D = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f.getLeft() - this.A, r4, this.f.getRight() + this.A, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.E;
    }

    @Override // androidx.viewpager.widget.c
    int getMinHeight() {
        return Math.max(super.getMinHeight(), this.z);
    }

    @k
    public int getTabIndicatorColor() {
        return this.v;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f.getLeft() - this.A;
        int right = this.f.getRight() + this.A;
        int r3 = height - this.w;
        this.B.setColor((this.D << 24) | (this.v & f0.s));
        float f = height;
        canvas.drawRect(left, r3, right, f, this.B);
        if (this.E) {
            this.B.setColor((-16777216) | (this.v & f0.s));
            canvas.drawRect(getPaddingLeft(), height - this.G, getWidth() - getPaddingRight(), f, this.B);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        ViewPager viewPager;
        int currentItem;
        int action = motionEvent.getAction();
        if (action != 0 && this.H) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.I = x;
            this.J = y;
            this.H = false;
        } else if (action == 1) {
            if (x < this.f.getLeft() - this.A) {
                viewPager = this.d;
                currentItem = viewPager.getCurrentItem() - 1;
            } else if (x > this.f.getRight() + this.A) {
                viewPager = this.d;
                currentItem = viewPager.getCurrentItem() + 1;
            }
            viewPager.setCurrentItem(currentItem);
        } else if (action == 2 && (Math.abs(x - this.I) > this.K || Math.abs(y - this.J) > this.K)) {
            this.H = true;
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(@k int r2) {
        super.setBackgroundColor(r2);
        if (this.F) {
            return;
        }
        this.E = (r2 & f0.t) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.F) {
            return;
        }
        this.E = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(@q int r2) {
        super.setBackgroundResource(r2);
        if (this.F) {
            return;
        }
        this.E = r2 == 0;
    }

    public void setDrawFullUnderline(boolean z) {
        this.E = z;
        this.F = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int r2, int r3, int r4, int r5) {
        int r0 = this.x;
        if (r5 < r0) {
            r5 = r0;
        }
        super.setPadding(r2, r3, r4, r5);
    }

    public void setTabIndicatorColor(@k int r2) {
        this.v = r2;
        this.B.setColor(r2);
        invalidate();
    }

    public void setTabIndicatorColorResource(@m int r2) {
        setTabIndicatorColor(b.i.c.c.e(getContext(), r2));
    }

    @Override // androidx.viewpager.widget.c
    public void setTextSpacing(int r2) {
        int r0 = this.y;
        if (r2 < r0) {
            r2 = r0;
        }
        super.setTextSpacing(r2);
    }
}

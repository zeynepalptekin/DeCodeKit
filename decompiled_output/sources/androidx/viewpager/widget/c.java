package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import androidx.annotation.r;
import androidx.core.widget.m;
import androidx.viewpager.widget.ViewPager;
import b.i.p.f0;
import java.lang.ref.WeakReference;
import java.util.Locale;

@ViewPager.e
/* loaded from: classes.dex */
public class c extends ViewGroup {
    private static final int[] r = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};
    private static final int[] s = {R.attr.textAllCaps};
    private static final float t = 0.6f;
    private static final int u = 16;
    ViewPager d;
    TextView e;
    TextView f;
    TextView g;
    private int h;
    float i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private final a n;
    private WeakReference<androidx.viewpager.widget.a> o;
    private int p;
    int q;

    private class a extends DataSetObserver implements ViewPager.j, ViewPager.i {

        /* renamed from: a, reason: collision with root package name */
        private int f775a;

        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int r2, float f, int r4) {
            if (f > 0.5f) {
                r2++;
            }
            c.this.d(r2, f, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int r1) {
            this.f775a = r1;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int r4) {
            if (this.f775a == 0) {
                c cVar = c.this;
                cVar.c(cVar.d.getCurrentItem(), c.this.d.getAdapter());
                float f = c.this.i;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                c cVar2 = c.this;
                cVar2.d(cVar2.d.getCurrentItem(), f, true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void d(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            c.this.b(aVar, aVar2);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            c cVar = c.this;
            cVar.c(cVar.d.getCurrentItem(), c.this.d.getAdapter());
            float f = c.this.i;
            if (f < 0.0f) {
                f = 0.0f;
            }
            c cVar2 = c.this;
            cVar2.d(cVar2.d.getCurrentItem(), f, true);
        }
    }

    private static class b extends SingleLineTransformationMethod {
        private Locale d;

        b(Context context) {
            this.d = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.d);
            }
            return null;
        }
    }

    public c(@h0 Context context) {
        this(context, null);
    }

    public c(@h0 Context context, @i0 AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.h = -1;
        this.i = -1.0f;
        this.n = new a();
        TextView textView = new TextView(context);
        this.e = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.g = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r);
        boolean z = false;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            m.E(this.e, resourceId);
            m.E(this.f, resourceId);
            m.E(this.g, resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            a(0, dimensionPixelSize);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            this.e.setTextColor(color);
            this.f.setTextColor(color);
            this.g.setTextColor(color);
        }
        this.k = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        this.q = this.f.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(t);
        this.e.setEllipsize(TextUtils.TruncateAt.END);
        this.f.setEllipsize(TextUtils.TruncateAt.END);
        this.g.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, s);
            z = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
        }
        TextView textView4 = this.e;
        if (z) {
            setSingleLineAllCaps(textView4);
            setSingleLineAllCaps(this.f);
            setSingleLineAllCaps(this.g);
        } else {
            textView4.setSingleLine();
            this.f.setSingleLine();
            this.g.setSingleLine();
        }
        this.j = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new b(textView.getContext()));
    }

    public void a(int r2, float f) {
        this.e.setTextSize(r2, f);
        this.f.setTextSize(r2, f);
        this.g.setTextSize(r2, f);
    }

    void b(androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
        if (aVar != null) {
            aVar.u(this.n);
            this.o = null;
        }
        if (aVar2 != null) {
            aVar2.m(this.n);
            this.o = new WeakReference<>(aVar2);
        }
        ViewPager viewPager = this.d;
        if (viewPager != null) {
            this.h = -1;
            this.i = -1.0f;
            c(viewPager.getCurrentItem(), aVar2);
            requestLayout();
        }
    }

    void c(int r6, androidx.viewpager.widget.a aVar) {
        int r1 = aVar != null ? aVar.e() : 0;
        this.l = true;
        CharSequence charSequenceG = null;
        this.e.setText((r6 < 1 || aVar == null) ? null : aVar.g(r6 - 1));
        this.f.setText((aVar == null || r6 >= r1) ? null : aVar.g(r6));
        int r2 = r6 + 1;
        if (r2 < r1 && aVar != null) {
            charSequenceG = aVar.g(r2);
        }
        this.g.setText(charSequenceG);
        int r7 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int r12 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.e.measure(r7, r12);
        this.f.measure(r7, r12);
        this.g.measure(r7, r12);
        this.h = r6;
        if (!this.m) {
            d(r6, this.i, false);
        }
        this.l = false;
    }

    void d(int r18, float f, boolean z) {
        int r7;
        int r5;
        int r12;
        int r10;
        if (r18 != this.h) {
            c(r18, this.d.getAdapter());
        } else if (!z && f == this.i) {
            return;
        }
        this.m = true;
        int measuredWidth = this.e.getMeasuredWidth();
        int measuredWidth2 = this.f.getMeasuredWidth();
        int measuredWidth3 = this.g.getMeasuredWidth();
        int r52 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int r13 = paddingRight + r52;
        int r122 = (width - (paddingLeft + r52)) - r13;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int r132 = ((width - r13) - ((int) (r122 * f2))) - r52;
        int r3 = measuredWidth2 + r132;
        int baseline = this.e.getBaseline();
        int baseline2 = this.f.getBaseline();
        int baseline3 = this.g.getBaseline();
        int r15 = Math.max(Math.max(baseline, baseline2), baseline3);
        int r53 = r15 - baseline;
        int r123 = r15 - baseline2;
        int r152 = r15 - baseline3;
        int r2 = Math.max(Math.max(this.e.getMeasuredHeight() + r53, this.f.getMeasuredHeight() + r123), this.g.getMeasuredHeight() + r152);
        int r4 = this.k & 112;
        if (r4 == 16) {
            r7 = (((height - paddingTop) - paddingBottom) - r2) / 2;
        } else {
            if (r4 != 80) {
                r5 = r53 + paddingTop;
                r12 = r123 + paddingTop;
                r10 = paddingTop + r152;
                TextView textView = this.f;
                textView.layout(r132, r12, r3, textView.getMeasuredHeight() + r12);
                int r22 = Math.min(paddingLeft, (r132 - this.j) - measuredWidth);
                TextView textView2 = this.e;
                textView2.layout(r22, r5, measuredWidth + r22, textView2.getMeasuredHeight() + r5);
                int r1 = Math.max((width - paddingRight) - measuredWidth3, r3 + this.j);
                TextView textView3 = this.g;
                textView3.layout(r1, r10, r1 + measuredWidth3, textView3.getMeasuredHeight() + r10);
                this.i = f;
                this.m = false;
            }
            r7 = (height - paddingBottom) - r2;
        }
        r5 = r53 + r7;
        r12 = r123 + r7;
        r10 = r7 + r152;
        TextView textView4 = this.f;
        textView4.layout(r132, r12, r3, textView4.getMeasuredHeight() + r12);
        int r222 = Math.min(paddingLeft, (r132 - this.j) - measuredWidth);
        TextView textView22 = this.e;
        textView22.layout(r222, r5, measuredWidth + r222, textView22.getMeasuredHeight() + r5);
        int r14 = Math.max((width - paddingRight) - measuredWidth3, r3 + this.j);
        TextView textView32 = this.g;
        textView32.layout(r14, r10, r14 + measuredWidth3, textView32.getMeasuredHeight() + r10);
        this.i = f;
        this.m = false;
    }

    int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.j;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        androidx.viewpager.widget.a adapter = viewPager.getAdapter();
        viewPager.V(this.n);
        viewPager.b(this.n);
        this.d = viewPager;
        WeakReference<androidx.viewpager.widget.a> weakReference = this.o;
        b(weakReference != null ? weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.d;
        if (viewPager != null) {
            b(viewPager.getAdapter(), null);
            this.d.V(null);
            this.d.N(this.n);
            this.d = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int r2, int r3, int r4, int r5) {
        if (this.d != null) {
            float f = this.i;
            if (f < 0.0f) {
                f = 0.0f;
            }
            d(this.h, f, true);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int r8, int r9) {
        int size;
        if (View.MeasureSpec.getMode(r8) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(r9, paddingTop, -2);
        int size2 = View.MeasureSpec.getSize(r8);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(r8, (int) (size2 * 0.2f), -2);
        this.e.measure(childMeasureSpec2, childMeasureSpec);
        this.f.measure(childMeasureSpec2, childMeasureSpec);
        this.g.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(r9) == 1073741824) {
            size = View.MeasureSpec.getSize(r9);
        } else {
            size = Math.max(getMinHeight(), this.f.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size2, View.resolveSizeAndState(size, r9, this.f.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.l) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int r1) {
        this.k = r1;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@r(from = 0.0d, to = 1.0d) float f) {
        int r3 = ((int) (f * 255.0f)) & 255;
        this.p = r3;
        int r32 = (r3 << 24) | (this.q & f0.s);
        this.e.setTextColor(r32);
        this.g.setTextColor(r32);
    }

    public void setTextColor(@k int r3) {
        this.q = r3;
        this.f.setTextColor(r3);
        int r32 = (this.p << 24) | (this.q & f0.s);
        this.e.setTextColor(r32);
        this.g.setTextColor(r32);
    }

    public void setTextSpacing(int r1) {
        this.j = r1;
        requestLayout();
    }
}

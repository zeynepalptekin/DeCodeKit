package c.a.b.c.v;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import androidx.annotation.o;
import androidx.annotation.p;
import androidx.annotation.x0;
import androidx.appcompat.widget.ActivityChooserView;
import b.i.p.f0;
import b.i.p.p0.d;
import c.a.b.c.a;
import c.a.b.c.u.j;
import c.a.b.c.v.a;
import c.a.b.c.v.b;
import c.a.b.c.v.c;
import com.google.android.material.internal.s;
import com.google.android.material.internal.y;
import com.google.android.material.internal.z;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
abstract class c<S extends c<S, L, T>, L extends c.a.b.c.v.a<S>, T extends c.a.b.c.v.b<S>> extends View {
    private static final String W = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";
    private static final String a0 = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String b0 = "valueFrom(%s) must be smaller than valueTo(%s)";
    private static final String c0 = "valueTo(%s) must be greater than valueFrom(%s)";
    private static final String d0 = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";
    private static final String e0 = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.";
    private static final int f0 = 200;
    private static final int g0 = 63;
    private static final double h0 = 1.0E-4d;
    private MotionEvent A;
    private c.a.b.c.v.e B;
    private boolean C;
    private float D;
    private float E;
    private ArrayList<Float> F;
    private int G;
    private int H;
    private float I;
    private float[] J;
    private int K;
    private boolean L;
    private boolean M;
    private boolean N;

    @h0
    private ColorStateList O;

    @h0
    private ColorStateList P;

    @h0
    private ColorStateList Q;

    @h0
    private ColorStateList R;

    @h0
    private ColorStateList S;

    @h0
    private final j T;
    private float U;

    @h0
    private final Paint d;

    @h0
    private final Paint e;

    @h0
    private final Paint f;

    @h0
    private final Paint g;

    @h0
    private final Paint h;

    @h0
    private final Paint i;

    @h0
    private final C0145c j;
    private final AccessibilityManager k;
    private c<S, L, T>.b l;

    @h0
    private final e m;

    @h0
    private final List<c.a.b.c.y.a> n;

    @h0
    private final List<L> o;

    @h0
    private final List<T> p;
    private final int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private float z;
    private static final String V = c.class.getSimpleName();
    private static final int i0 = a.n.Widget_MaterialComponents_Slider;

    class a implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AttributeSet f2055a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f2056b;

        a(AttributeSet attributeSet, int r3) {
            this.f2055a = attributeSet;
            this.f2056b = r3;
        }

        @Override // c.a.b.c.v.c.e
        public c.a.b.c.y.a a() {
            TypedArray typedArrayJ = s.j(c.this.getContext(), this.f2055a, a.o.Slider, this.f2056b, c.i0, new int[0]);
            c.a.b.c.y.a aVarR = c.R(c.this.getContext(), typedArrayJ);
            typedArrayJ.recycle();
            return aVarR;
        }
    }

    private class b implements Runnable {
        int d;

        private b() {
            this.d = -1;
        }

        /* synthetic */ b(c cVar, a aVar) {
            this();
        }

        void a(int r1) {
            this.d = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.j.Y(this.d, 4);
        }
    }

    /* renamed from: c.a.b.c.v.c$c, reason: collision with other inner class name */
    private static class C0145c extends b.k.c.a {
        private final c<?, ?, ?> t;
        Rect u;

        C0145c(c<?, ?, ?> cVar) {
            super(cVar);
            this.u = new Rect();
            this.t = cVar;
        }

        @h0
        private String a0(int r2) {
            Context context;
            int r0;
            if (r2 == this.t.getValues().size() - 1) {
                context = this.t.getContext();
                r0 = a.m.material_slider_range_end;
            } else {
                if (r2 != 0) {
                    return "";
                }
                context = this.t.getContext();
                r0 = a.m.material_slider_range_start;
            }
            return context.getString(r0);
        }

        @Override // b.k.c.a
        protected int C(float f, float f2) {
            for (int r0 = 0; r0 < this.t.getValues().size(); r0++) {
                this.t.e0(r0, this.u);
                if (this.u.contains((int) f, (int) f2)) {
                    return r0;
                }
            }
            return -1;
        }

        @Override // b.k.c.a
        protected void D(List<Integer> list) {
            for (int r0 = 0; r0 < this.t.getValues().size(); r0++) {
                list.add(Integer.valueOf(r0));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
        
            if (r4.t.c0(r5, r7.getFloat(b.i.p.p0.d.V)) != false) goto L17;
         */
        @Override // b.k.c.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected boolean N(int r5, int r6, android.os.Bundle r7) {
            /*
                r4 = this;
                c.a.b.c.v.c<?, ?, ?> r0 = r4.t
                boolean r0 = r0.isEnabled()
                r1 = 0
                if (r0 != 0) goto La
                return r1
            La:
                r0 = 4096(0x1000, float:5.74E-42)
                r2 = 1
                r3 = 8192(0x2000, float:1.148E-41)
                if (r6 == r0) goto L3f
                if (r6 == r3) goto L3f
                r0 = 16908349(0x102003d, float:2.38774E-38)
                if (r6 == r0) goto L19
                return r1
            L19:
                if (r7 == 0) goto L3e
                java.lang.String r6 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
                boolean r0 = r7.containsKey(r6)
                if (r0 != 0) goto L24
                goto L3e
            L24:
                float r6 = r7.getFloat(r6)
                c.a.b.c.v.c<?, ?, ?> r7 = r4.t
                boolean r6 = c.a.b.c.v.c.e(r7, r5, r6)
                if (r6 == 0) goto L3e
            L30:
                c.a.b.c.v.c<?, ?, ?> r6 = r4.t
                c.a.b.c.v.c.f(r6)
                c.a.b.c.v.c<?, ?, ?> r6 = r4.t
                r6.postInvalidate()
                r4.G(r5)
                return r2
            L3e:
                return r1
            L3f:
                c.a.b.c.v.c<?, ?, ?> r7 = r4.t
                r0 = 20
                float r7 = c.a.b.c.v.c.g(r7, r0)
                if (r6 != r3) goto L4a
                float r7 = -r7
            L4a:
                c.a.b.c.v.c<?, ?, ?> r6 = r4.t
                boolean r6 = r6.I()
                if (r6 == 0) goto L53
                float r7 = -r7
            L53:
                c.a.b.c.v.c<?, ?, ?> r6 = r4.t
                java.util.List r6 = r6.getValues()
                java.lang.Object r6 = r6.get(r5)
                java.lang.Float r6 = (java.lang.Float) r6
                float r6 = r6.floatValue()
                float r6 = r6 + r7
                c.a.b.c.v.c<?, ?, ?> r7 = r4.t
                float r7 = r7.getValueFrom()
                c.a.b.c.v.c<?, ?, ?> r0 = r4.t
                float r0 = r0.getValueTo()
                float r6 = b.i.i.a.b(r6, r7, r0)
                c.a.b.c.v.c<?, ?, ?> r7 = r4.t
                boolean r6 = c.a.b.c.v.c.e(r7, r5, r6)
                if (r6 == 0) goto L7d
                goto L30
            L7d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: c.a.b.c.v.c.C0145c.N(int, int, android.os.Bundle):boolean");
        }

        @Override // b.k.c.a
        protected void R(int r6, b.i.p.p0.d dVar) {
            dVar.b(d.a.M);
            List<Float> values = this.t.getValues();
            float fFloatValue = values.get(r6).floatValue();
            float valueFrom = this.t.getValueFrom();
            float valueTo = this.t.getValueTo();
            if (this.t.isEnabled()) {
                if (fFloatValue > valueFrom) {
                    dVar.a(8192);
                }
                if (fFloatValue < valueTo) {
                    dVar.a(4096);
                }
            }
            dVar.z1(d.C0073d.e(1, valueFrom, valueTo, fFloatValue));
            dVar.T0(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.t.getContentDescription() != null) {
                sb.append(this.t.getContentDescription());
                sb.append(",");
            }
            if (values.size() > 1) {
                sb.append(a0(r6));
                sb.append(this.t.C(fFloatValue));
            }
            dVar.X0(sb.toString());
            this.t.e0(r6, this.u);
            dVar.O0(this.u);
        }
    }

    static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();
        float d;
        float e;
        ArrayList<Float> f;
        float g;
        boolean h;

        static class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @h0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(@h0 Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            @h0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int r1) {
                return new d[r1];
            }
        }

        private d(@h0 Parcel parcel) {
            super(parcel);
            this.d = parcel.readFloat();
            this.e = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.g = parcel.readFloat();
            this.h = parcel.createBooleanArray()[0];
        }

        /* synthetic */ d(Parcel parcel, a aVar) {
            this(parcel);
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@h0 Parcel parcel, int r4) {
            super.writeToParcel(parcel, r4);
            parcel.writeFloat(this.d);
            parcel.writeFloat(this.e);
            parcel.writeList(this.f);
            parcel.writeFloat(this.g);
            parcel.writeBooleanArray(new boolean[]{this.h});
        }
    }

    private interface e {
        c.a.b.c.y.a a();
    }

    public c(@h0 Context context) {
        this(context, null);
    }

    public c(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.sliderStyle);
    }

    public c(@h0 Context context, @i0 AttributeSet attributeSet, int r7) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException, InvocationTargetException {
        super(com.google.android.material.theme.a.a.c(context, attributeSet, r7, i0), attributeSet, r7);
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.C = false;
        this.F = new ArrayList<>();
        this.G = -1;
        this.H = -1;
        this.I = 0.0f;
        this.M = false;
        this.T = new j();
        Context context2 = getContext();
        Paint paint = new Paint();
        this.d = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.d.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.e.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint(1);
        this.f = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.g = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.h = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        this.h.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.i = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        this.i.setStrokeCap(Paint.Cap.ROUND);
        J(context2.getResources());
        this.m = new a(attributeSet, r7);
        U(context2, attributeSet, r7);
        setFocusable(true);
        setClickable(true);
        this.T.w0(2);
        this.q = ViewConfiguration.get(context2).getScaledTouchSlop();
        C0145c c0145c = new C0145c(this);
        this.j = c0145c;
        f0.u1(this, c0145c);
        this.k = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    private void A(int r4) {
        if (r4 == 1) {
            L(ActivityChooserView.f.j);
            return;
        }
        if (r4 == 2) {
            L(Integer.MIN_VALUE);
        } else if (r4 == 17) {
            M(ActivityChooserView.f.j);
        } else {
            if (r4 != 66) {
                return;
            }
            M(Integer.MIN_VALUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String C(float f) {
        if (F()) {
            return this.B.a(f);
        }
        return String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
    }

    private float D(int r3, float f) {
        int r0 = r3 + 1;
        int r32 = r3 - 1;
        return b.i.i.a.b(f, r32 < 0 ? this.D : this.F.get(r32).floatValue(), r0 >= this.F.size() ? this.E : this.F.get(r0).floatValue());
    }

    @k
    private int E(@h0 ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    private void G() {
        this.d.setStrokeWidth(this.t);
        this.e.setStrokeWidth(this.t);
        this.h.setStrokeWidth(this.t / 2.0f);
        this.i.setStrokeWidth(this.t / 2.0f);
    }

    private boolean H() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            if (((ViewGroup) parent).shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private void J(@h0 Resources resources) {
        this.r = resources.getDimensionPixelSize(a.f.mtrl_slider_widget_height);
        this.u = resources.getDimensionPixelOffset(a.f.mtrl_slider_track_side_padding);
        this.v = resources.getDimensionPixelOffset(a.f.mtrl_slider_track_top);
        this.y = resources.getDimensionPixelSize(a.f.mtrl_slider_label_padding);
    }

    private void K(@h0 Canvas canvas, int r10, int r11) {
        if (Z()) {
            int r102 = (int) (this.u + (N(this.F.get(this.H).floatValue()) * r10));
            if (Build.VERSION.SDK_INT < 28) {
                int r0 = this.x;
                canvas.clipRect(r102 - r0, r11 - r0, r102 + r0, r0 + r11, Region.Op.UNION);
            }
            canvas.drawCircle(r102, r11, this.x, this.g);
        }
    }

    private boolean L(int r12) {
        int r0 = this.H;
        int r122 = (int) b.i.i.a.d(r0 + r12, 0L, this.F.size() - 1);
        this.H = r122;
        if (r122 == r0) {
            return false;
        }
        if (this.G != -1) {
            this.G = r122;
        }
        f0();
        postInvalidate();
        return true;
    }

    private boolean M(int r2) {
        if (I()) {
            r2 = r2 == Integer.MIN_VALUE ? ActivityChooserView.f.j : -r2;
        }
        return L(r2);
    }

    private float N(float f) {
        float f2 = this.D;
        float f3 = (f - f2) / (this.E - f2);
        return I() ? 1.0f - f3 : f3;
    }

    private Boolean O(int r4, @h0 KeyEvent keyEvent) {
        if (r4 == 61) {
            return keyEvent.hasNoModifiers() ? Boolean.valueOf(L(1)) : keyEvent.isShiftPressed() ? Boolean.valueOf(L(-1)) : Boolean.FALSE;
        }
        if (r4 != 66) {
            if (r4 != 81) {
                if (r4 == 69) {
                    L(-1);
                    return Boolean.TRUE;
                }
                if (r4 != 70) {
                    switch (r4) {
                        case 21:
                            M(-1);
                            break;
                        case 22:
                            M(1);
                            break;
                    }
                    return Boolean.TRUE;
                }
            }
            L(1);
            return Boolean.TRUE;
        }
        this.G = this.H;
        postInvalidate();
        return Boolean.TRUE;
    }

    private void P() {
        Iterator<T> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void Q() {
        Iterator<T> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @h0
    public static c.a.b.c.y.a R(@h0 Context context, @h0 TypedArray typedArray) {
        return c.a.b.c.y.a.U0(context, null, 0, typedArray.getResourceId(a.o.Slider_labelStyle, a.n.Widget_MaterialComponents_Tooltip));
    }

    private static int T(float[] fArr, float f) {
        return Math.round(f * ((fArr.length / 2) - 1));
    }

    private void U(Context context, AttributeSet attributeSet, int r10) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException, InvocationTargetException {
        TypedArray typedArrayJ = s.j(context, attributeSet, a.o.Slider, r10, i0, new int[0]);
        this.D = typedArrayJ.getFloat(a.o.Slider_android_valueFrom, 0.0f);
        this.E = typedArrayJ.getFloat(a.o.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.D));
        this.I = typedArrayJ.getFloat(a.o.Slider_android_stepSize, 0.0f);
        boolean zHasValue = typedArrayJ.hasValue(a.o.Slider_trackColor);
        int r2 = zHasValue ? a.o.Slider_trackColor : a.o.Slider_trackColorInactive;
        int r1 = zHasValue ? a.o.Slider_trackColor : a.o.Slider_trackColorActive;
        ColorStateList colorStateListA = c.a.b.c.r.c.a(context, typedArrayJ, r2);
        if (colorStateListA == null) {
            colorStateListA = b.a.b.a.a.c(context, a.e.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(colorStateListA);
        ColorStateList colorStateListA2 = c.a.b.c.r.c.a(context, typedArrayJ, r1);
        if (colorStateListA2 == null) {
            colorStateListA2 = b.a.b.a.a.c(context, a.e.material_slider_active_track_color);
        }
        setTrackActiveTintList(colorStateListA2);
        this.T.n0(c.a.b.c.r.c.a(context, typedArrayJ, a.o.Slider_thumbColor));
        ColorStateList colorStateListA3 = c.a.b.c.r.c.a(context, typedArrayJ, a.o.Slider_haloColor);
        if (colorStateListA3 == null) {
            colorStateListA3 = b.a.b.a.a.c(context, a.e.material_slider_halo_color);
        }
        setHaloTintList(colorStateListA3);
        boolean zHasValue2 = typedArrayJ.hasValue(a.o.Slider_tickColor);
        int r22 = zHasValue2 ? a.o.Slider_tickColor : a.o.Slider_tickColorInactive;
        int r12 = zHasValue2 ? a.o.Slider_tickColor : a.o.Slider_tickColorActive;
        ColorStateList colorStateListA4 = c.a.b.c.r.c.a(context, typedArrayJ, r22);
        if (colorStateListA4 == null) {
            colorStateListA4 = b.a.b.a.a.c(context, a.e.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(colorStateListA4);
        ColorStateList colorStateListA5 = c.a.b.c.r.c.a(context, typedArrayJ, r12);
        if (colorStateListA5 == null) {
            colorStateListA5 = b.a.b.a.a.c(context, a.e.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(colorStateListA5);
        setThumbRadius(typedArrayJ.getDimensionPixelSize(a.o.Slider_thumbRadius, 0));
        setHaloRadius(typedArrayJ.getDimensionPixelSize(a.o.Slider_haloRadius, 0));
        setThumbElevation(typedArrayJ.getDimension(a.o.Slider_thumbElevation, 0.0f));
        setTrackHeight(typedArrayJ.getDimensionPixelSize(a.o.Slider_trackHeight, 0));
        this.s = typedArrayJ.getInt(a.o.Slider_labelBehavior, 0);
        if (!typedArrayJ.getBoolean(a.o.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        typedArrayJ.recycle();
    }

    private void X(int r3) {
        c<S, L, T>.b bVar = this.l;
        if (bVar == null) {
            this.l = new b(this, null);
        } else {
            removeCallbacks(bVar);
        }
        this.l.a(r3);
        postDelayed(this.l, 200L);
    }

    private void Y(c.a.b.c.y.a aVar, float f) {
        aVar.k1(C(f));
        int r0 = (this.u + ((int) (N(f) * this.K))) - (aVar.getIntrinsicWidth() / 2);
        int r5 = o() - (this.y + this.w);
        aVar.setBounds(r0, r5 - aVar.getIntrinsicHeight(), aVar.getIntrinsicWidth() + r0, r5);
        Rect rect = new Rect(aVar.getBounds());
        com.google.android.material.internal.c.c(z.e(this), this, rect);
        aVar.setBounds(rect);
        z.f(this).b(aVar);
    }

    private boolean Z() {
        return this.L || Build.VERSION.SDK_INT < 21 || !(getBackground() instanceof RippleDrawable);
    }

    private boolean a0(float f) {
        return c0(this.G, f);
    }

    private double b0(float f) {
        float f2 = this.I;
        if (f2 <= 0.0f) {
            return f;
        }
        return Math.round(f * r0) / ((int) ((this.E - this.D) / f2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c0(int r6, float f) {
        if (Math.abs(f - this.F.get(r6).floatValue()) < h0) {
            return false;
        }
        this.F.set(r6, Float.valueOf(D(r6, f)));
        this.H = r6;
        t(r6);
        return true;
    }

    private boolean d0() {
        return a0(getValueOfTouchPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0() {
        if (Z() || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int r1 = (int) ((N(this.F.get(this.H).floatValue()) * this.K) + this.u);
            int r2 = o();
            int r3 = this.x;
            androidx.core.graphics.drawable.a.l(background, r1 - r3, r2 - r3, r1 + r3, r2 + r3);
        }
    }

    private void g0() {
        if (this.N) {
            i0();
            j0();
            h0();
            k0();
            n0();
            this.N = false;
        }
    }

    private float[] getActiveRange() {
        float fFloatValue = ((Float) Collections.max(getValues())).floatValue();
        float fFloatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.F.size() == 1) {
            fFloatValue2 = this.D;
        }
        float fN = N(fFloatValue2);
        float fN2 = N(fFloatValue);
        return I() ? new float[]{fN2, fN} : new float[]{fN, fN2};
    }

    private float getValueOfTouchPosition() {
        double dB0 = b0(this.U);
        if (I()) {
            dB0 = 1.0d - dB0;
        }
        float f = this.E;
        return (float) ((dB0 * (f - r3)) + this.D);
    }

    private float getValueOfTouchPositionAbsolute() {
        float f = this.U;
        if (I()) {
            f = 1.0f - f;
        }
        float f2 = this.E;
        float f3 = this.D;
        return (f * (f2 - f3)) + f3;
    }

    private void h0() {
        if (this.I > 0.0f && !l0(this.E)) {
            throw new IllegalStateException(String.format(d0, Float.toString(this.I), Float.toString(this.D), Float.toString(this.E)));
        }
    }

    private void i0() {
        if (this.D >= this.E) {
            throw new IllegalStateException(String.format(b0, Float.toString(this.D), Float.toString(this.E)));
        }
    }

    private void j(c.a.b.c.y.a aVar) {
        aVar.j1(z.e(this));
    }

    private void j0() {
        if (this.E <= this.D) {
            throw new IllegalStateException(String.format(c0, Float.toString(this.E), Float.toString(this.D)));
        }
    }

    private Float k(int r3) {
        float fM = this.M ? m(20) : l();
        if (r3 == 21) {
            if (!I()) {
                fM = -fM;
            }
            return Float.valueOf(fM);
        }
        if (r3 == 22) {
            if (I()) {
                fM = -fM;
            }
            return Float.valueOf(fM);
        }
        if (r3 == 69) {
            return Float.valueOf(-fM);
        }
        if (r3 == 70 || r3 == 81) {
            return Float.valueOf(fM);
        }
        return null;
    }

    private void k0() {
        Iterator<Float> it = this.F.iterator();
        while (it.hasNext()) {
            Float next = it.next();
            if (next.floatValue() < this.D || next.floatValue() > this.E) {
                throw new IllegalStateException(String.format(W, Float.toString(next.floatValue()), Float.toString(this.D), Float.toString(this.E)));
            }
            if (this.I > 0.0f && !l0(next.floatValue())) {
                throw new IllegalStateException(String.format(a0, Float.toString(next.floatValue()), Float.toString(this.D), Float.toString(this.I), Float.toString(this.I)));
            }
        }
    }

    private float l() {
        float f = this.I;
        if (f == 0.0f) {
            return 1.0f;
        }
        return f;
    }

    private boolean l0(float f) {
        double dDoubleValue = new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.D))).divide(new BigDecimal(Float.toString(this.I)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < h0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float m(int r4) {
        float fL = l();
        return (this.E - this.D) / fL <= r4 ? fL : Math.round(r1 / r4) * fL;
    }

    private float m0(float f) {
        return (N(f) * this.K) + this.u;
    }

    private void n() {
        g0();
        int r0 = Math.min((int) (((this.E - this.D) / this.I) + 1.0f), (this.K / (this.t * 2)) + 1);
        float[] fArr = this.J;
        if (fArr == null || fArr.length != r0 * 2) {
            this.J = new float[r0 * 2];
        }
        float f = this.K / (r0 - 1);
        for (int r2 = 0; r2 < r0 * 2; r2 += 2) {
            float[] fArr2 = this.J;
            fArr2[r2] = this.u + ((r2 / 2) * f);
            fArr2[r2 + 1] = o();
        }
    }

    private void n0() {
        float f = this.I;
        if (f == 0.0f) {
            return;
        }
        if (((int) f) != f) {
            Log.w(V, String.format(e0, "stepSize", Float.valueOf(f)));
        }
        float f2 = this.D;
        if (((int) f2) != f2) {
            Log.w(V, String.format(e0, "valueFrom", Float.valueOf(f2)));
        }
        float f3 = this.E;
        if (((int) f3) != f3) {
            Log.w(V, String.format(e0, "valueTo", Float.valueOf(f3)));
        }
    }

    private int o() {
        return this.v + (this.s == 1 ? this.n.get(0).getIntrinsicHeight() : 0);
    }

    private void r() {
        if (this.n.size() > this.F.size()) {
            List<c.a.b.c.y.a> listSubList = this.n.subList(this.F.size(), this.n.size());
            for (c.a.b.c.y.a aVar : listSubList) {
                if (f0.J0(this)) {
                    s(aVar);
                }
            }
            listSubList.clear();
        }
        while (this.n.size() < this.F.size()) {
            c.a.b.c.y.a aVarA = this.m.a();
            this.n.add(aVarA);
            if (f0.J0(this)) {
                j(aVarA);
            }
        }
        int r1 = this.n.size() == 1 ? 0 : 1;
        Iterator<c.a.b.c.y.a> it = this.n.iterator();
        while (it.hasNext()) {
            it.next().H0(r1);
        }
    }

    private void s(c.a.b.c.y.a aVar) {
        y yVarF = z.f(this);
        if (yVarF != null) {
            yVarF.d(aVar);
            aVar.W0(z.e(this));
        }
    }

    private void setValuesInternal(@h0 ArrayList<Float> arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.F.size() == arrayList.size() && this.F.equals(arrayList)) {
            return;
        }
        this.F = arrayList;
        this.N = true;
        this.H = 0;
        f0();
        r();
        u();
        postInvalidate();
    }

    private void t(int r5) {
        Iterator<L> it = this.o.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.F.get(r5).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.k;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        X(r5);
    }

    private void u() {
        for (L l : this.o) {
            Iterator<Float> it = this.F.iterator();
            while (it.hasNext()) {
                l.a(this, it.next().floatValue(), false);
            }
        }
    }

    private void v(@h0 Canvas canvas, int r12, int r13) {
        float[] activeRange = getActiveRange();
        int r1 = this.u;
        float f = r12;
        float f2 = r13;
        canvas.drawLine(r1 + (activeRange[0] * f), f2, r1 + (activeRange[1] * f), f2, this.e);
    }

    private void w(@h0 Canvas canvas, int r13, int r14) {
        float[] activeRange = getActiveRange();
        float f = r13;
        float f2 = this.u + (activeRange[1] * f);
        if (f2 < r1 + r13) {
            float f3 = r14;
            canvas.drawLine(f2, f3, r1 + r13, f3, this.d);
        }
        int r132 = this.u;
        float f4 = r132 + (activeRange[0] * f);
        if (f4 > r132) {
            float f5 = r14;
            canvas.drawLine(r132, f5, f4, f5, this.d);
        }
    }

    private void x(@h0 Canvas canvas, int r7, int r8) {
        if (!isEnabled()) {
            Iterator<Float> it = this.F.iterator();
            while (it.hasNext()) {
                canvas.drawCircle(this.u + (N(it.next().floatValue()) * r7), r8, this.w, this.f);
            }
        }
        Iterator<Float> it2 = this.F.iterator();
        while (it2.hasNext()) {
            Float next = it2.next();
            canvas.save();
            int r2 = this.u + ((int) (N(next.floatValue()) * r7));
            int r1 = this.w;
            canvas.translate(r2 - r1, r8 - r1);
            this.T.draw(canvas);
            canvas.restore();
        }
    }

    private void y(@h0 Canvas canvas) {
        float[] activeRange = getActiveRange();
        int r1 = T(this.J, activeRange[0]);
        int r0 = T(this.J, activeRange[1]);
        int r12 = r1 * 2;
        canvas.drawPoints(this.J, 0, r12, this.h);
        int r02 = r0 * 2;
        canvas.drawPoints(this.J, r12, r02 - r12, this.i);
        float[] fArr = this.J;
        canvas.drawPoints(fArr, r02, fArr.length - r02, this.h);
    }

    private void z() {
        if (this.s == 2) {
            return;
        }
        Iterator<c.a.b.c.y.a> it = this.n.iterator();
        for (int r3 = 0; r3 < this.F.size() && it.hasNext(); r3++) {
            if (r3 != this.H) {
                Y(it.next(), this.F.get(r3).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.n.size()), Integer.valueOf(this.F.size())));
        }
        Y(it.next(), this.F.get(this.H).floatValue());
    }

    @x0
    void B(boolean z) {
        this.L = z;
    }

    public boolean F() {
        return this.B != null;
    }

    final boolean I() {
        return f0.W(this) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean S() {
        /*
            r11 = this;
            int r0 = r11.G
            r1 = -1
            r2 = 1
            if (r0 == r1) goto L7
            return r2
        L7:
            float r0 = r11.getValueOfTouchPositionAbsolute()
            float r3 = r11.m0(r0)
            r4 = 0
            r11.G = r4
            java.util.ArrayList<java.lang.Float> r5 = r11.F
            java.lang.Object r5 = r5.get(r4)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            float r5 = r5 - r0
            float r5 = java.lang.Math.abs(r5)
            r6 = 1
        L24:
            java.util.ArrayList<java.lang.Float> r7 = r11.F
            int r7 = r7.size()
            if (r6 >= r7) goto L90
            java.util.ArrayList<java.lang.Float> r7 = r11.F
            java.lang.Object r7 = r7.get(r6)
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            float r7 = r7 - r0
            float r7 = java.lang.Math.abs(r7)
            java.util.ArrayList<java.lang.Float> r8 = r11.F
            java.lang.Object r8 = r8.get(r6)
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            float r8 = r11.m0(r8)
            int r9 = java.lang.Float.compare(r7, r5)
            if (r9 <= r2) goto L54
            goto L90
        L54:
            boolean r9 = r11.I()
            r10 = 0
            if (r9 == 0) goto L62
            float r9 = r8 - r3
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L6a
            goto L68
        L62:
            float r9 = r8 - r3
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 >= 0) goto L6a
        L68:
            r9 = 1
            goto L6b
        L6a:
            r9 = 0
        L6b:
            int r10 = java.lang.Float.compare(r7, r5)
            if (r10 >= 0) goto L74
        L71:
            r11.G = r6
            goto L8c
        L74:
            int r10 = java.lang.Float.compare(r7, r5)
            if (r10 != 0) goto L8d
            float r8 = r8 - r3
            float r8 = java.lang.Math.abs(r8)
            int r10 = r11.q
            float r10 = (float) r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L89
            r11.G = r1
            return r4
        L89:
            if (r9 == 0) goto L8d
            goto L71
        L8c:
            r5 = r7
        L8d:
            int r6 = r6 + 1
            goto L24
        L90:
            int r0 = r11.G
            if (r0 == r1) goto L95
            goto L96
        L95:
            r2 = 0
        L96:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.c.v.c.S():boolean");
    }

    public void V(@h0 L l) {
        this.o.remove(l);
    }

    public void W(@h0 T t) {
        this.p.remove(t);
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@h0 MotionEvent motionEvent) {
        return this.j.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@h0 KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.d.setColor(E(this.S));
        this.e.setColor(E(this.R));
        this.h.setColor(E(this.Q));
        this.i.setColor(E(this.P));
        for (c.a.b.c.y.a aVar : this.n) {
            if (aVar.isStateful()) {
                aVar.setState(getDrawableState());
            }
        }
        if (this.T.isStateful()) {
            this.T.setState(getDrawableState());
        }
        this.g.setColor(E(this.O));
        this.g.setAlpha(63);
    }

    void e0(int r5, Rect rect) {
        int r0 = this.u + ((int) (N(getValues().get(r5).floatValue()) * this.K));
        int r52 = o();
        int r1 = this.w;
        rect.set(r0 - r1, r52 - r1, r0 + r1, r52 + r1);
    }

    @Override // android.view.View
    @h0
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @x0
    final int getAccessibilityFocusedVirtualViewId() {
        return this.j.x();
    }

    public int getActiveThumbIndex() {
        return this.G;
    }

    public int getFocusedThumbIndex() {
        return this.H;
    }

    @p
    public int getHaloRadius() {
        return this.x;
    }

    @h0
    public ColorStateList getHaloTintList() {
        return this.O;
    }

    public int getLabelBehavior() {
        return this.s;
    }

    public float getStepSize() {
        return this.I;
    }

    public float getThumbElevation() {
        return this.T.x();
    }

    @p
    public int getThumbRadius() {
        return this.w;
    }

    @h0
    public ColorStateList getThumbTintList() {
        return this.T.y();
    }

    @h0
    public ColorStateList getTickActiveTintList() {
        return this.P;
    }

    @h0
    public ColorStateList getTickInactiveTintList() {
        return this.Q;
    }

    @h0
    public ColorStateList getTickTintList() {
        if (this.Q.equals(this.P)) {
            return this.P;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    @h0
    public ColorStateList getTrackActiveTintList() {
        return this.R;
    }

    @p
    public int getTrackHeight() {
        return this.t;
    }

    @h0
    public ColorStateList getTrackInactiveTintList() {
        return this.S;
    }

    @p
    public int getTrackSidePadding() {
        return this.u;
    }

    @h0
    public ColorStateList getTrackTintList() {
        if (this.S.equals(this.R)) {
            return this.R;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    @p
    public int getTrackWidth() {
        return this.K;
    }

    public float getValueFrom() {
        return this.D;
    }

    public float getValueTo() {
        return this.E;
    }

    @h0
    List<Float> getValues() {
        return new ArrayList(this.F);
    }

    public void h(@i0 L l) {
        this.o.add(l);
    }

    public void i(@h0 T t) {
        this.p.add(t);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Iterator<c.a.b.c.y.a> it = this.n.iterator();
        while (it.hasNext()) {
            j(it.next());
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        c<S, L, T>.b bVar = this.l;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
        Iterator<c.a.b.c.y.a> it = this.n.iterator();
        while (it.hasNext()) {
            s(it.next());
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(@h0 Canvas canvas) {
        if (this.N) {
            g0();
            if (this.I > 0.0f) {
                n();
            }
        }
        super.onDraw(canvas);
        int r0 = o();
        w(canvas, this.K, r0);
        if (((Float) Collections.max(getValues())).floatValue() > this.D) {
            v(canvas, this.K, r0);
        }
        if (this.I > 0.0f) {
            y(canvas);
        }
        if ((this.C || isFocused()) && isEnabled()) {
            K(canvas, this.K, r0);
            if (this.G != -1) {
                z();
            }
        }
        x(canvas, this.K, r0);
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z, int r2, @i0 Rect rect) {
        super.onFocusChanged(z, r2, rect);
        if (z) {
            A(r2);
            this.j.X(this.H);
            return;
        }
        this.G = -1;
        Iterator<c.a.b.c.y.a> it = this.n.iterator();
        while (it.hasNext()) {
            z.f(this).d(it.next());
        }
        this.j.o(this.H);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r6, @h0 KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(r6, keyEvent);
        }
        if (this.F.size() == 1) {
            this.G = 0;
        }
        if (this.G == -1) {
            Boolean boolO = O(r6, keyEvent);
            return boolO != null ? boolO.booleanValue() : super.onKeyDown(r6, keyEvent);
        }
        this.M |= keyEvent.isLongPress();
        Float fK = k(r6);
        if (fK != null) {
            if (a0(this.F.get(this.G).floatValue() + fK.floatValue())) {
                f0();
                postInvalidate();
            }
            return true;
        }
        if (r6 != 23) {
            if (r6 == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return L(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return L(-1);
                }
                return false;
            }
            if (r6 != 66) {
                return super.onKeyDown(r6, keyEvent);
            }
        }
        this.G = -1;
        Iterator<c.a.b.c.y.a> it = this.n.iterator();
        while (it.hasNext()) {
            z.f(this).d(it.next());
        }
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int r2, @h0 KeyEvent keyEvent) {
        this.M = false;
        return super.onKeyUp(r2, keyEvent);
    }

    @Override // android.view.View
    protected void onMeasure(int r4, int r5) {
        super.onMeasure(r4, View.MeasureSpec.makeMeasureSpec(this.r + (this.s == 1 ? this.n.get(0).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.D = dVar.d;
        this.E = dVar.e;
        setValuesInternal(dVar.f);
        this.I = dVar.g;
        if (dVar.h) {
            requestFocus();
        }
        u();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.d = this.D;
        dVar.e = this.E;
        dVar.f = new ArrayList<>(this.F);
        dVar.g = this.I;
        dVar.h = hasFocus();
        return dVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
        this.K = Math.max(r1 - (this.u * 2), 0);
        if (this.I > 0.0f) {
            n();
        }
        f0();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@h0 MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x = motionEvent.getX();
        float f = (x - this.u) / this.K;
        this.U = f;
        float fMax = Math.max(0.0f, f);
        this.U = fMax;
        this.U = Math.min(1.0f, fMax);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.C = false;
                MotionEvent motionEvent2 = this.A;
                if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.A.getX() - motionEvent.getX()) <= this.q && Math.abs(this.A.getY() - motionEvent.getY()) <= this.q) {
                    S();
                }
                if (this.G != -1) {
                    d0();
                    this.G = -1;
                }
                Iterator<c.a.b.c.y.a> it = this.n.iterator();
                while (it.hasNext()) {
                    z.f(this).d(it.next());
                }
                Q();
            } else if (actionMasked == 2) {
                if (!this.C) {
                    if (Math.abs(x - this.z) < this.q) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    P();
                }
                if (S()) {
                    this.C = true;
                    d0();
                    f0();
                }
            }
            invalidate();
        } else {
            this.z = x;
            if (!H()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (S()) {
                    requestFocus();
                    this.C = true;
                    d0();
                    f0();
                    invalidate();
                    P();
                }
            }
        }
        setPressed(this.C);
        this.A = MotionEvent.obtain(motionEvent);
        return true;
    }

    public void p() {
        this.o.clear();
    }

    public void q() {
        this.p.clear();
    }

    protected void setActiveThumbIndex(int r1) {
        this.G = r1;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int r2) {
        if (r2 < 0 || r2 >= this.F.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.H = r2;
        this.j.X(r2);
        postInvalidate();
    }

    public void setHaloRadius(@p @androidx.annotation.z(from = FabTransformationScrimBehavior.j) int r2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (r2 == this.x) {
            return;
        }
        this.x = r2;
        Drawable background = getBackground();
        if (Z() || !(background instanceof RippleDrawable)) {
            postInvalidate();
        } else {
            c.a.b.c.k.a.b((RippleDrawable) background, this.x);
        }
    }

    public void setHaloRadiusResource(@o int r2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        setHaloRadius(getResources().getDimensionPixelSize(r2));
    }

    public void setHaloTintList(@h0 ColorStateList colorStateList) {
        if (colorStateList.equals(this.O)) {
            return;
        }
        this.O = colorStateList;
        Drawable background = getBackground();
        if (!Z() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.g.setColor(E(colorStateList));
        this.g.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int r2) {
        if (this.s != r2) {
            this.s = r2;
            requestLayout();
        }
    }

    public void setLabelFormatter(@i0 c.a.b.c.v.e eVar) {
        this.B = eVar;
    }

    public void setStepSize(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException(String.format(d0, Float.toString(f), Float.toString(this.D), Float.toString(this.E)));
        }
        if (this.I != f) {
            this.I = f;
            this.N = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f) {
        this.T.m0(f);
    }

    public void setThumbElevationResource(@o int r2) {
        setThumbElevation(getResources().getDimension(r2));
    }

    public void setThumbRadius(@p @androidx.annotation.z(from = FabTransformationScrimBehavior.j) int r4) {
        if (r4 == this.w) {
            return;
        }
        this.w = r4;
        this.T.setShapeAppearanceModel(c.a.b.c.u.o.a().q(0, this.w).m());
        j jVar = this.T;
        int r0 = this.w;
        jVar.setBounds(0, 0, r0 * 2, r0 * 2);
        postInvalidate();
    }

    public void setThumbRadiusResource(@o int r2) {
        setThumbRadius(getResources().getDimensionPixelSize(r2));
    }

    public void setThumbTintList(@h0 ColorStateList colorStateList) {
        this.T.n0(colorStateList);
    }

    public void setTickActiveTintList(@h0 ColorStateList colorStateList) {
        if (colorStateList.equals(this.P)) {
            return;
        }
        this.P = colorStateList;
        this.i.setColor(E(colorStateList));
        invalidate();
    }

    public void setTickInactiveTintList(@h0 ColorStateList colorStateList) {
        if (colorStateList.equals(this.Q)) {
            return;
        }
        this.Q = colorStateList;
        this.h.setColor(E(colorStateList));
        invalidate();
    }

    public void setTickTintList(@h0 ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTrackActiveTintList(@h0 ColorStateList colorStateList) {
        if (colorStateList.equals(this.R)) {
            return;
        }
        this.R = colorStateList;
        this.e.setColor(E(colorStateList));
        invalidate();
    }

    public void setTrackHeight(@p @androidx.annotation.z(from = FabTransformationScrimBehavior.j) int r2) {
        if (this.t != r2) {
            this.t = r2;
            G();
            postInvalidate();
        }
    }

    public void setTrackInactiveTintList(@h0 ColorStateList colorStateList) {
        if (colorStateList.equals(this.S)) {
            return;
        }
        this.S = colorStateList;
        this.d.setColor(E(colorStateList));
        invalidate();
    }

    public void setTrackTintList(@h0 ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f) {
        this.D = f;
        this.N = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.E = f;
        this.N = true;
        postInvalidate();
    }

    void setValues(@h0 List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    void setValues(@h0 Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }
}

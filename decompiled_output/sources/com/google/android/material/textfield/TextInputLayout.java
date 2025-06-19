package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.s0;
import androidx.annotation.t0;
import androidx.annotation.x0;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.a1;
import androidx.core.widget.m;
import b.i.p.f0;
import c.a.b.c.a;
import c.a.b.c.u.o;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.s;
import com.google.android.material.internal.z;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {
    private static final int L0 = a.n.Widget_Design_TextInputLayout;
    private static final int M0 = 167;
    private static final int N0 = -1;
    private static final String O0 = "TextInputLayout";
    public static final int P0 = 0;
    public static final int Q0 = 1;
    public static final int R0 = 2;
    public static final int S0 = -1;
    public static final int T0 = 0;
    public static final int U0 = 1;
    public static final int V0 = 2;
    public static final int W0 = 3;

    @h0
    private final TextView A;

    @k
    private int A0;
    private boolean B;

    @k
    private int B0;
    private CharSequence C;

    @k
    private int C0;
    private boolean D;

    @k
    private int D0;

    @i0
    private c.a.b.c.u.j E;

    @k
    private int E0;

    @i0
    private c.a.b.c.u.j F;
    private boolean F0;

    @h0
    private o G;
    final com.google.android.material.internal.a G0;
    private final int H;
    private boolean H0;
    private int I;
    private ValueAnimator I0;
    private final int J;
    private boolean J0;
    private int K;
    private boolean K0;
    private int L;
    private int M;

    @k
    private int N;

    @k
    private int O;
    private final Rect P;
    private final Rect Q;
    private final RectF R;
    private Typeface S;

    @h0
    private final CheckableImageButton T;
    private ColorStateList U;
    private boolean V;
    private PorterDuff.Mode W;
    private boolean a0;

    @i0
    private Drawable b0;
    private int c0;

    @h0
    private final FrameLayout d;
    private View.OnLongClickListener d0;

    @h0
    private final LinearLayout e;
    private final LinkedHashSet<h> e0;

    @h0
    private final LinearLayout f;
    private int f0;

    @h0
    private final FrameLayout g;
    private final SparseArray<com.google.android.material.textfield.e> g0;
    EditText h;

    @h0
    private final CheckableImageButton h0;
    private CharSequence i;
    private final LinkedHashSet<i> i0;
    private final com.google.android.material.textfield.f j;
    private ColorStateList j0;
    boolean k;
    private boolean k0;
    private int l;
    private PorterDuff.Mode l0;
    private boolean m;
    private boolean m0;

    @i0
    private TextView n;

    @i0
    private Drawable n0;
    private int o;
    private int o0;
    private int p;
    private Drawable p0;
    private CharSequence q;
    private View.OnLongClickListener q0;
    private boolean r;
    private View.OnLongClickListener r0;
    private TextView s;

    @h0
    private final CheckableImageButton s0;

    @i0
    private ColorStateList t;
    private ColorStateList t0;
    private int u;
    private ColorStateList u0;

    @i0
    private ColorStateList v;
    private ColorStateList v0;

    @i0
    private ColorStateList w;

    @k
    private int w0;

    @i0
    private CharSequence x;

    @k
    private int x0;

    @h0
    private final TextView y;

    @k
    private int y0;

    @i0
    private CharSequence z;
    private ColorStateList z0;

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@h0 Editable editable) {
            TextInputLayout.this.E0(!r0.K0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.k) {
                textInputLayout.w0(editable.length());
            }
            if (TextInputLayout.this.r) {
                TextInputLayout.this.I0(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int r2, int r3, int r4) {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.h0.performClick();
            TextInputLayout.this.h0.jumpDrawablesToCurrentState();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.h.requestLayout();
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@h0 ValueAnimator valueAnimator) {
            TextInputLayout.this.G0.h0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends b.i.p.a {
        private final TextInputLayout d;

        public e(@h0 TextInputLayout textInputLayout) {
            this.d = textInputLayout;
        }

        @Override // b.i.p.a
        public void g(@h0 View view, @h0 b.i.p.p0.d dVar) {
            super.g(view, dVar);
            EditText editText = this.d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.d.getHint();
            CharSequence helperText = this.d.getHelperText();
            CharSequence error = this.d.getError();
            int counterMaxLength = this.d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(helperText);
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String string = z2 ? hint.toString() : "";
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(((z4 || z3) && !TextUtils.isEmpty(string)) ? ", " : "");
            String string2 = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string2);
            if (z4) {
                helperText = error;
            } else if (!z3) {
                helperText = "";
            }
            sb2.append((Object) helperText);
            String string3 = sb2.toString();
            if (z) {
                dVar.H1(text);
            } else if (!TextUtils.isEmpty(string3)) {
                dVar.H1(string3);
            }
            if (!TextUtils.isEmpty(string3)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    dVar.i1(string3);
                } else {
                    if (z) {
                        string3 = ((Object) text) + ", " + string3;
                    }
                    dVar.H1(string3);
                }
                dVar.E1(!z);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            dVar.r1(counterMaxLength);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                dVar.e1(error);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP})
    public @interface g {
    }

    public interface h {
        void a(@h0 TextInputLayout textInputLayout);
    }

    public interface i {
        void a(@h0 TextInputLayout textInputLayout, int r2);
    }

    static class j extends b.k.b.a {
        public static final Parcelable.Creator<j> CREATOR = new a();

        @i0
        CharSequence f;
        boolean g;

        static class a implements Parcelable.ClassLoaderCreator<j> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @i0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public j createFromParcel(@h0 Parcel parcel) {
                return new j(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @h0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public j createFromParcel(@h0 Parcel parcel, ClassLoader classLoader) {
                return new j(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @h0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public j[] newArray(int r1) {
                return new j[r1];
            }
        }

        j(@h0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.g = parcel.readInt() == 1;
        }

        j(Parcelable parcelable) {
            super(parcelable);
        }

        @h0
        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f) + "}";
        }

        @Override // b.k.b.a, android.os.Parcelable
        public void writeToParcel(@h0 Parcel parcel, int r3) {
            super.writeToParcel(parcel, r3);
            TextUtils.writeToParcel(this.f, parcel, r3);
            parcel.writeInt(this.g ? 1 : 0);
        }
    }

    public TextInputLayout(@h0 Context context) {
        this(context, null);
    }

    public TextInputLayout(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.textInputStyle);
    }

    public TextInputLayout(@h0 Context context, @i0 AttributeSet attributeSet, int r23) throws Resources.NotFoundException {
        int colorForState;
        super(com.google.android.material.theme.a.a.c(context, attributeSet, r23, L0), attributeSet, r23);
        this.j = new com.google.android.material.textfield.f(this);
        this.P = new Rect();
        this.Q = new Rect();
        this.R = new RectF();
        this.e0 = new LinkedHashSet<>();
        this.f0 = 0;
        this.g0 = new SparseArray<>();
        this.i0 = new LinkedHashSet<>();
        this.G0 = new com.google.android.material.internal.a(this);
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.d = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(this.d);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.e = linearLayout;
        linearLayout.setOrientation(0);
        this.e.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, b.i.p.h.f1198b));
        this.d.addView(this.e);
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.f = linearLayout2;
        linearLayout2.setOrientation(0);
        this.f.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, b.i.p.h.f1199c));
        this.d.addView(this.f);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.g = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        this.G0.n0(c.a.b.c.b.a.f1935a);
        this.G0.k0(c.a.b.c.b.a.f1935a);
        this.G0.U(c.a.b.c.c.a.u);
        a1 a1VarK = s.k(context2, attributeSet, a.o.TextInputLayout, r23, L0, a.o.TextInputLayout_counterTextAppearance, a.o.TextInputLayout_counterOverflowTextAppearance, a.o.TextInputLayout_errorTextAppearance, a.o.TextInputLayout_helperTextTextAppearance, a.o.TextInputLayout_hintTextAppearance);
        this.B = a1VarK.a(a.o.TextInputLayout_hintEnabled, true);
        setHint(a1VarK.x(a.o.TextInputLayout_android_hint));
        this.H0 = a1VarK.a(a.o.TextInputLayout_hintAnimationEnabled, true);
        this.G = o.e(context2, attributeSet, r23, L0).m();
        this.H = context2.getResources().getDimensionPixelOffset(a.f.mtrl_textinput_box_label_cutout_padding);
        this.J = a1VarK.f(a.o.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.L = a1VarK.g(a.o.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(a.f.mtrl_textinput_box_stroke_width_default));
        this.M = a1VarK.g(a.o.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(a.f.mtrl_textinput_box_stroke_width_focused));
        this.K = this.L;
        float fE = a1VarK.e(a.o.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float fE2 = a1VarK.e(a.o.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float fE3 = a1VarK.e(a.o.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float fE4 = a1VarK.e(a.o.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        o.b bVarV = this.G.v();
        if (fE >= 0.0f) {
            bVarV.K(fE);
        }
        if (fE2 >= 0.0f) {
            bVarV.P(fE2);
        }
        if (fE3 >= 0.0f) {
            bVarV.C(fE3);
        }
        if (fE4 >= 0.0f) {
            bVarV.x(fE4);
        }
        this.G = bVarV.m();
        ColorStateList colorStateListB = c.a.b.c.r.c.b(context2, a1VarK, a.o.TextInputLayout_boxBackgroundColor);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.A0 = defaultColor;
            this.O = defaultColor;
            if (colorStateListB.isStateful()) {
                this.B0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.C0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                colorForState = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.C0 = this.A0;
                ColorStateList colorStateListC = b.a.b.a.a.c(context2, a.e.mtrl_filled_background_color);
                this.B0 = colorStateListC.getColorForState(new int[]{-16842910}, -1);
                colorForState = colorStateListC.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
            this.D0 = colorForState;
        } else {
            this.O = 0;
            this.A0 = 0;
            this.B0 = 0;
            this.C0 = 0;
            this.D0 = 0;
        }
        if (a1VarK.C(a.o.TextInputLayout_android_textColorHint)) {
            ColorStateList colorStateListD = a1VarK.d(a.o.TextInputLayout_android_textColorHint);
            this.v0 = colorStateListD;
            this.u0 = colorStateListD;
        }
        ColorStateList colorStateListB2 = c.a.b.c.r.c.b(context2, a1VarK, a.o.TextInputLayout_boxStrokeColor);
        this.y0 = a1VarK.c(a.o.TextInputLayout_boxStrokeColor, 0);
        this.w0 = b.i.c.c.e(context2, a.e.mtrl_textinput_default_box_stroke_color);
        this.E0 = b.i.c.c.e(context2, a.e.mtrl_textinput_disabled_color);
        this.x0 = b.i.c.c.e(context2, a.e.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        if (a1VarK.C(a.o.TextInputLayout_boxStrokeErrorColor)) {
            setBoxStrokeErrorColor(c.a.b.c.r.c.b(context2, a1VarK, a.o.TextInputLayout_boxStrokeErrorColor));
        }
        if (a1VarK.u(a.o.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(a1VarK.u(a.o.TextInputLayout_hintTextAppearance, 0));
        }
        int r2 = a1VarK.u(a.o.TextInputLayout_errorTextAppearance, 0);
        CharSequence charSequenceX = a1VarK.x(a.o.TextInputLayout_errorContentDescription);
        boolean zA = a1VarK.a(a.o.TextInputLayout_errorEnabled, false);
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(a.k.design_text_input_end_icon, (ViewGroup) this.f, false);
        this.s0 = checkableImageButton;
        checkableImageButton.setVisibility(8);
        if (a1VarK.C(a.o.TextInputLayout_errorIconDrawable)) {
            setErrorIconDrawable(a1VarK.h(a.o.TextInputLayout_errorIconDrawable));
        }
        if (a1VarK.C(a.o.TextInputLayout_errorIconTint)) {
            setErrorIconTintList(c.a.b.c.r.c.b(context2, a1VarK, a.o.TextInputLayout_errorIconTint));
        }
        if (a1VarK.C(a.o.TextInputLayout_errorIconTintMode)) {
            setErrorIconTintMode(z.j(a1VarK.o(a.o.TextInputLayout_errorIconTintMode, -1), null));
        }
        this.s0.setContentDescription(getResources().getText(a.m.error_icon_content_description));
        f0.K1(this.s0, 2);
        this.s0.setClickable(false);
        this.s0.setPressable(false);
        this.s0.setFocusable(false);
        int r5 = a1VarK.u(a.o.TextInputLayout_helperTextTextAppearance, 0);
        boolean zA2 = a1VarK.a(a.o.TextInputLayout_helperTextEnabled, false);
        CharSequence charSequenceX2 = a1VarK.x(a.o.TextInputLayout_helperText);
        int r15 = a1VarK.u(a.o.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence charSequenceX3 = a1VarK.x(a.o.TextInputLayout_placeholderText);
        int r11 = a1VarK.u(a.o.TextInputLayout_prefixTextAppearance, 0);
        CharSequence charSequenceX4 = a1VarK.x(a.o.TextInputLayout_prefixText);
        int r6 = a1VarK.u(a.o.TextInputLayout_suffixTextAppearance, 0);
        CharSequence charSequenceX5 = a1VarK.x(a.o.TextInputLayout_suffixText);
        boolean zA3 = a1VarK.a(a.o.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(a1VarK.o(a.o.TextInputLayout_counterMaxLength, -1));
        this.p = a1VarK.u(a.o.TextInputLayout_counterTextAppearance, 0);
        this.o = a1VarK.u(a.o.TextInputLayout_counterOverflowTextAppearance, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(a.k.design_text_input_start_icon, (ViewGroup) this.e, false);
        this.T = checkableImageButton2;
        checkableImageButton2.setVisibility(8);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (a1VarK.C(a.o.TextInputLayout_startIconDrawable)) {
            setStartIconDrawable(a1VarK.h(a.o.TextInputLayout_startIconDrawable));
            if (a1VarK.C(a.o.TextInputLayout_startIconContentDescription)) {
                setStartIconContentDescription(a1VarK.x(a.o.TextInputLayout_startIconContentDescription));
            }
            setStartIconCheckable(a1VarK.a(a.o.TextInputLayout_startIconCheckable, true));
        }
        if (a1VarK.C(a.o.TextInputLayout_startIconTint)) {
            setStartIconTintList(c.a.b.c.r.c.b(context2, a1VarK, a.o.TextInputLayout_startIconTint));
        }
        if (a1VarK.C(a.o.TextInputLayout_startIconTintMode)) {
            setStartIconTintMode(z.j(a1VarK.o(a.o.TextInputLayout_startIconTintMode, -1), null));
        }
        setBoxBackgroundMode(a1VarK.o(a.o.TextInputLayout_boxBackgroundMode, 0));
        CheckableImageButton checkableImageButton3 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(a.k.design_text_input_end_icon, (ViewGroup) this.g, false);
        this.h0 = checkableImageButton3;
        this.g.addView(checkableImageButton3);
        this.h0.setVisibility(8);
        this.g0.append(-1, new com.google.android.material.textfield.b(this));
        this.g0.append(0, new com.google.android.material.textfield.h(this));
        this.g0.append(1, new com.google.android.material.textfield.i(this));
        this.g0.append(2, new com.google.android.material.textfield.a(this));
        this.g0.append(3, new com.google.android.material.textfield.d(this));
        if (a1VarK.C(a.o.TextInputLayout_endIconMode)) {
            setEndIconMode(a1VarK.o(a.o.TextInputLayout_endIconMode, 0));
            if (a1VarK.C(a.o.TextInputLayout_endIconDrawable)) {
                setEndIconDrawable(a1VarK.h(a.o.TextInputLayout_endIconDrawable));
            }
            if (a1VarK.C(a.o.TextInputLayout_endIconContentDescription)) {
                setEndIconContentDescription(a1VarK.x(a.o.TextInputLayout_endIconContentDescription));
            }
            setEndIconCheckable(a1VarK.a(a.o.TextInputLayout_endIconCheckable, true));
        } else if (a1VarK.C(a.o.TextInputLayout_passwordToggleEnabled)) {
            setEndIconMode(a1VarK.a(a.o.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            setEndIconDrawable(a1VarK.h(a.o.TextInputLayout_passwordToggleDrawable));
            setEndIconContentDescription(a1VarK.x(a.o.TextInputLayout_passwordToggleContentDescription));
            if (a1VarK.C(a.o.TextInputLayout_passwordToggleTint)) {
                setEndIconTintList(c.a.b.c.r.c.b(context2, a1VarK, a.o.TextInputLayout_passwordToggleTint));
            }
            if (a1VarK.C(a.o.TextInputLayout_passwordToggleTintMode)) {
                setEndIconTintMode(z.j(a1VarK.o(a.o.TextInputLayout_passwordToggleTintMode, -1), null));
            }
        }
        if (!a1VarK.C(a.o.TextInputLayout_passwordToggleEnabled)) {
            if (a1VarK.C(a.o.TextInputLayout_endIconTint)) {
                setEndIconTintList(c.a.b.c.r.c.b(context2, a1VarK, a.o.TextInputLayout_endIconTint));
            }
            if (a1VarK.C(a.o.TextInputLayout_endIconTintMode)) {
                setEndIconTintMode(z.j(a1VarK.o(a.o.TextInputLayout_endIconTintMode, -1), null));
            }
        }
        a0 a0Var = new a0(context2);
        this.y = a0Var;
        a0Var.setId(a.h.textinput_prefix_text);
        this.y.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        f0.w1(this.y, 1);
        this.e.addView(this.T);
        this.e.addView(this.y);
        a0 a0Var2 = new a0(context2);
        this.A = a0Var2;
        a0Var2.setId(a.h.textinput_suffix_text);
        this.A.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        f0.w1(this.A, 1);
        this.f.addView(this.A);
        this.f.addView(this.s0);
        this.f.addView(this.g);
        setHelperTextEnabled(zA2);
        setHelperText(charSequenceX2);
        setHelperTextTextAppearance(r5);
        setErrorEnabled(zA);
        setErrorTextAppearance(r2);
        setErrorContentDescription(charSequenceX);
        setCounterTextAppearance(this.p);
        setCounterOverflowTextAppearance(this.o);
        setPlaceholderText(charSequenceX3);
        setPlaceholderTextAppearance(r15);
        setPrefixText(charSequenceX4);
        setPrefixTextAppearance(r11);
        setSuffixText(charSequenceX5);
        setSuffixTextAppearance(r6);
        if (a1VarK.C(a.o.TextInputLayout_errorTextColor)) {
            setErrorTextColor(a1VarK.d(a.o.TextInputLayout_errorTextColor));
        }
        if (a1VarK.C(a.o.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(a1VarK.d(a.o.TextInputLayout_helperTextTextColor));
        }
        if (a1VarK.C(a.o.TextInputLayout_hintTextColor)) {
            setHintTextColor(a1VarK.d(a.o.TextInputLayout_hintTextColor));
        }
        if (a1VarK.C(a.o.TextInputLayout_counterTextColor)) {
            setCounterTextColor(a1VarK.d(a.o.TextInputLayout_counterTextColor));
        }
        if (a1VarK.C(a.o.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(a1VarK.d(a.o.TextInputLayout_counterOverflowTextColor));
        }
        if (a1VarK.C(a.o.TextInputLayout_placeholderTextColor)) {
            setPlaceholderTextColor(a1VarK.d(a.o.TextInputLayout_placeholderTextColor));
        }
        if (a1VarK.C(a.o.TextInputLayout_prefixTextColor)) {
            setPrefixTextColor(a1VarK.d(a.o.TextInputLayout_prefixTextColor));
        }
        if (a1VarK.C(a.o.TextInputLayout_suffixTextColor)) {
            setSuffixTextColor(a1VarK.d(a.o.TextInputLayout_suffixTextColor));
        }
        setCounterEnabled(zA3);
        setEnabled(a1VarK.a(a.o.TextInputLayout_android_enabled, true));
        a1VarK.I();
        f0.K1(this, 2);
    }

    private void A(boolean z) {
        ValueAnimator valueAnimator = this.I0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.I0.cancel();
        }
        if (z && this.H0) {
            h(1.0f);
        } else {
            this.G0.h0(1.0f);
        }
        this.F0 = false;
        if (B()) {
            c0();
        }
        H0();
        K0();
        N0();
    }

    private boolean B() {
        return this.B && !TextUtils.isEmpty(this.C) && (this.E instanceof com.google.android.material.textfield.c);
    }

    private boolean B0() {
        int r0;
        if (this.h == null || this.h.getMeasuredHeight() >= (r0 = Math.max(this.f.getMeasuredHeight(), this.e.getMeasuredHeight()))) {
            return false;
        }
        this.h.setMinimumHeight(r0);
        return true;
    }

    private void C0(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
        Drawable drawableMutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
        androidx.core.graphics.drawable.a.o(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    private void D() {
        Iterator<h> it = this.e0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void D0() {
        if (this.I != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.d.getLayoutParams();
            int r1 = u();
            if (r1 != layoutParams.topMargin) {
                layoutParams.topMargin = r1;
                this.d.requestLayout();
            }
        }
    }

    private void E(int r3) {
        Iterator<i> it = this.i0.iterator();
        while (it.hasNext()) {
            it.next().a(this, r3);
        }
    }

    private void F(Canvas canvas) {
        c.a.b.c.u.j jVar = this.F;
        if (jVar != null) {
            Rect bounds = jVar.getBounds();
            bounds.top = bounds.bottom - this.K;
            this.F.draw(canvas);
        }
    }

    private void F0(boolean z, boolean z2) {
        ColorStateList textColors;
        com.google.android.material.internal.a aVar;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.h;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.h;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean zL = this.j.l();
        ColorStateList colorStateList = this.u0;
        if (colorStateList != null) {
            this.G0.T(colorStateList);
            this.G0.c0(this.u0);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList2 = this.u0;
            int colorForState = colorStateList2 != null ? colorStateList2.getColorForState(new int[]{-16842910}, this.E0) : this.E0;
            this.G0.T(ColorStateList.valueOf(colorForState));
            this.G0.c0(ColorStateList.valueOf(colorForState));
        } else if (zL) {
            this.G0.T(this.j.q());
        } else {
            if (this.m && (textView = this.n) != null) {
                aVar = this.G0;
                textColors = textView.getTextColors();
            } else if (z4 && (textColors = this.v0) != null) {
                aVar = this.G0;
            }
            aVar.T(textColors);
        }
        if (z3 || (isEnabled() && (z4 || zL))) {
            if (z2 || this.F0) {
                A(z);
                return;
            }
            return;
        }
        if (z2 || !this.F0) {
            H(z);
        }
    }

    private void G(@h0 Canvas canvas) {
        if (this.B) {
            this.G0.j(canvas);
        }
    }

    private void G0() {
        EditText editText;
        if (this.s == null || (editText = this.h) == null) {
            return;
        }
        this.s.setGravity(editText.getGravity());
        this.s.setPadding(this.h.getCompoundPaddingLeft(), this.h.getCompoundPaddingTop(), this.h.getCompoundPaddingRight(), this.h.getCompoundPaddingBottom());
    }

    private void H(boolean z) {
        ValueAnimator valueAnimator = this.I0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.I0.cancel();
        }
        if (z && this.H0) {
            h(0.0f);
        } else {
            this.G0.h0(0.0f);
        }
        if (B() && ((com.google.android.material.textfield.c) this.E).O0()) {
            z();
        }
        this.F0 = true;
        L();
        K0();
        N0();
    }

    private void H0() {
        EditText editText = this.h;
        I0(editText == null ? 0 : editText.getText().length());
    }

    private int I(int r2, boolean z) {
        int compoundPaddingLeft = r2 + this.h.getCompoundPaddingLeft();
        return (this.x == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.y.getMeasuredWidth()) + this.y.getPaddingLeft();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I0(int r1) {
        if (r1 != 0 || this.F0) {
            L();
        } else {
            s0();
        }
    }

    private int J(int r2, boolean z) {
        int compoundPaddingRight = r2 - this.h.getCompoundPaddingRight();
        return (this.x == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.y.getMeasuredWidth() - this.y.getPaddingRight());
    }

    private void J0() {
        if (this.h == null) {
            return;
        }
        f0.V1(this.y, a0() ? 0 : f0.h0(this.h), this.h.getCompoundPaddingTop(), 0, this.h.getCompoundPaddingBottom());
    }

    private boolean K() {
        return this.f0 != 0;
    }

    private void K0() {
        this.y.setVisibility((this.x == null || V()) ? 8 : 0);
        z0();
    }

    private void L() {
        TextView textView = this.s;
        if (textView == null || !this.r) {
            return;
        }
        textView.setText((CharSequence) null);
        this.s.setVisibility(4);
    }

    private void L0(boolean z, boolean z2) {
        int defaultColor = this.z0.getDefaultColor();
        int colorForState = this.z0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.z0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.N = colorForState2;
        } else if (z2) {
            this.N = colorForState;
        } else {
            this.N = defaultColor;
        }
    }

    private void M0() {
        if (this.h == null) {
            return;
        }
        f0.V1(this.A, 0, this.h.getPaddingTop(), (O() || Q()) ? 0 : f0.g0(this.h), this.h.getPaddingBottom());
    }

    private void N0() {
        int visibility = this.A.getVisibility();
        boolean z = (this.z == null || V()) ? false : true;
        this.A.setVisibility(z ? 0 : 8);
        if (visibility != this.A.getVisibility()) {
            getEndIconDelegate().c(z);
        }
        z0();
    }

    private boolean Q() {
        return this.s0.getVisibility() == 0;
    }

    private boolean Y() {
        return this.I == 1 && (Build.VERSION.SDK_INT < 16 || this.h.getMinLines() <= 1);
    }

    private void b0() {
        o();
        k0();
        O0();
        if (this.I != 0) {
            D0();
        }
    }

    private void c0() {
        if (B()) {
            RectF rectF = this.R;
            this.G0.m(rectF, this.h.getWidth(), this.h.getGravity());
            k(rectF);
            rectF.offset(-getPaddingLeft(), -getPaddingTop());
            ((com.google.android.material.textfield.c) this.E).U0(rectF);
        }
    }

    private static void e0(@h0 ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int r1 = 0; r1 < childCount; r1++) {
            View childAt = viewGroup.getChildAt(r1);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                e0((ViewGroup) childAt, z);
            }
        }
    }

    private void g() {
        TextView textView = this.s;
        if (textView != null) {
            this.d.addView(textView);
            this.s.setVisibility(0);
        }
    }

    private com.google.android.material.textfield.e getEndIconDelegate() {
        com.google.android.material.textfield.e eVar = this.g0.get(this.f0);
        return eVar != null ? eVar : this.g0.get(0);
    }

    @i0
    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.s0.getVisibility() == 0) {
            return this.s0;
        }
        if (K() && O()) {
            return this.h0;
        }
        return null;
    }

    private void h0() {
        TextView textView = this.s;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void i() {
        c.a.b.c.u.j jVar = this.E;
        if (jVar == null) {
            return;
        }
        jVar.setShapeAppearanceModel(this.G);
        if (v()) {
            this.E.C0(this.K, this.N);
        }
        int r0 = p();
        this.O = r0;
        this.E.n0(ColorStateList.valueOf(r0));
        if (this.f0 == 3) {
            this.h.getBackground().invalidateSelf();
        }
        j();
        invalidate();
    }

    private void j() {
        if (this.F == null) {
            return;
        }
        if (w()) {
            this.F.n0(ColorStateList.valueOf(this.N));
        }
        invalidate();
    }

    private void k(@h0 RectF rectF) {
        float f2 = rectF.left;
        int r1 = this.H;
        rectF.left = f2 - r1;
        rectF.top -= r1;
        rectF.right += r1;
        rectF.bottom += r1;
    }

    private void k0() {
        if (r0()) {
            f0.B1(this.h, this.E);
        }
    }

    private void l() {
        m(this.h0, this.k0, this.j0, this.m0, this.l0);
    }

    private static void l0(@h0 CheckableImageButton checkableImageButton, @i0 View.OnLongClickListener onLongClickListener) {
        boolean zF0 = f0.F0(checkableImageButton);
        boolean z = onLongClickListener != null;
        boolean z2 = zF0 || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zF0);
        checkableImageButton.setPressable(zF0);
        checkableImageButton.setLongClickable(z);
        f0.K1(checkableImageButton, z2 ? 1 : 2);
    }

    private void m(@h0 CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (z) {
                androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            }
            if (z2) {
                androidx.core.graphics.drawable.a.p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private static void m0(@h0 CheckableImageButton checkableImageButton, @i0 View.OnClickListener onClickListener, @i0 View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        l0(checkableImageButton, onLongClickListener);
    }

    private void n() {
        m(this.T, this.V, this.U, this.a0, this.W);
    }

    private static void n0(@h0 CheckableImageButton checkableImageButton, @i0 View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l0(checkableImageButton, onLongClickListener);
    }

    private void o() {
        int r0 = this.I;
        if (r0 == 0) {
            this.E = null;
        } else if (r0 == 1) {
            this.E = new c.a.b.c.u.j(this.G);
            this.F = new c.a.b.c.u.j();
            return;
        } else {
            if (r0 != 2) {
                throw new IllegalArgumentException(this.I + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            this.E = (!this.B || (this.E instanceof com.google.android.material.textfield.c)) ? new c.a.b.c.u.j(this.G) : new com.google.android.material.textfield.c(this.G);
        }
        this.F = null;
    }

    private int p() {
        return this.I == 1 ? c.a.b.c.i.a.f(c.a.b.c.i.a.e(this, a.c.colorSurface, 0), this.O) : this.O;
    }

    private boolean p0() {
        return (this.s0.getVisibility() == 0 || ((K() && O()) || this.z != null)) && this.f.getMeasuredWidth() > 0;
    }

    @h0
    private Rect q(@h0 Rect rect) {
        int paddingTop;
        int paddingRight;
        if (this.h == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.Q;
        boolean z = f0.W(this) == 1;
        rect2.bottom = rect.bottom;
        int r3 = this.I;
        if (r3 == 1) {
            rect2.left = I(rect.left, z);
            paddingTop = rect.top + this.J;
        } else {
            if (r3 == 2) {
                rect2.left = rect.left + this.h.getPaddingLeft();
                rect2.top = rect.top - u();
                paddingRight = rect.right - this.h.getPaddingRight();
                rect2.right = paddingRight;
                return rect2;
            }
            rect2.left = I(rect.left, z);
            paddingTop = getPaddingTop();
        }
        rect2.top = paddingTop;
        paddingRight = J(rect.right, z);
        rect2.right = paddingRight;
        return rect2;
    }

    private boolean q0() {
        return !(getStartIconDrawable() == null && this.x == null) && this.e.getMeasuredWidth() > 0;
    }

    private int r(@h0 Rect rect, @h0 Rect rect2, float f2) {
        return Y() ? (int) (rect2.top + f2) : rect.bottom - this.h.getCompoundPaddingBottom();
    }

    private boolean r0() {
        EditText editText = this.h;
        return (editText == null || this.E == null || editText.getBackground() != null || this.I == 0) ? false : true;
    }

    private int s(@h0 Rect rect, float f2) {
        return Y() ? (int) (rect.centerY() - (f2 / 2.0f)) : rect.top + this.h.getCompoundPaddingTop();
    }

    private void s0() {
        TextView textView = this.s;
        if (textView == null || !this.r) {
            return;
        }
        textView.setText(this.q);
        this.s.setVisibility(0);
        this.s.bringToFront();
    }

    private void setEditText(EditText editText) {
        if (this.h != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.f0 != 3 && !(editText instanceof TextInputEditText)) {
            Log.i(O0, "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.h = editText;
        b0();
        setTextInputAccessibilityDelegate(new e(this));
        this.G0.o0(this.h.getTypeface());
        this.G0.e0(this.h.getTextSize());
        int gravity = this.h.getGravity();
        this.G0.U((gravity & (-113)) | 48);
        this.G0.d0(gravity);
        this.h.addTextChangedListener(new a());
        if (this.u0 == null) {
            this.u0 = this.h.getHintTextColors();
        }
        if (this.B) {
            if (TextUtils.isEmpty(this.C)) {
                CharSequence hint = this.h.getHint();
                this.i = hint;
                setHint(hint);
                this.h.setHint((CharSequence) null);
            }
            this.D = true;
        }
        if (this.n != null) {
            w0(this.h.getText().length());
        }
        A0();
        this.j.e();
        this.e.bringToFront();
        this.f.bringToFront();
        this.g.bringToFront();
        this.s0.bringToFront();
        D();
        J0();
        M0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        F0(false, true);
    }

    private void setErrorIconVisible(boolean z) {
        this.s0.setVisibility(z ? 0 : 8);
        this.g.setVisibility(z ? 8 : 0);
        M0();
        if (K()) {
            return;
        }
        z0();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.C)) {
            return;
        }
        this.C = charSequence;
        this.G0.m0(charSequence);
        if (this.F0) {
            return;
        }
        c0();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.r == z) {
            return;
        }
        if (z) {
            a0 a0Var = new a0(getContext());
            this.s = a0Var;
            a0Var.setId(a.h.textinput_placeholder);
            f0.w1(this.s, 1);
            setPlaceholderTextAppearance(this.u);
            setPlaceholderTextColor(this.t);
            g();
        } else {
            h0();
            this.s = null;
        }
        this.r = z;
    }

    @h0
    private Rect t(@h0 Rect rect) {
        if (this.h == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.Q;
        float fZ = this.G0.z();
        rect2.left = rect.left + this.h.getCompoundPaddingLeft();
        rect2.top = s(rect, fZ);
        rect2.right = rect.right - this.h.getCompoundPaddingRight();
        rect2.bottom = r(rect, rect2, fZ);
        return rect2;
    }

    private void t0(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            l();
            return;
        }
        Drawable drawableMutate = androidx.core.graphics.drawable.a.r(getEndIconDrawable()).mutate();
        androidx.core.graphics.drawable.a.n(drawableMutate, this.j.p());
        this.h0.setImageDrawable(drawableMutate);
    }

    private int u() {
        float fP;
        if (!this.B) {
            return 0;
        }
        int r0 = this.I;
        if (r0 == 0 || r0 == 1) {
            fP = this.G0.p();
        } else {
            if (r0 != 2) {
                return 0;
            }
            fP = this.G0.p() / 2.0f;
        }
        return (int) fP;
    }

    private void u0(@h0 Rect rect) {
        c.a.b.c.u.j jVar = this.F;
        if (jVar != null) {
            int r1 = rect.bottom;
            jVar.setBounds(rect.left, r1 - this.M, rect.right, r1);
        }
    }

    private boolean v() {
        return this.I == 2 && w();
    }

    private void v0() {
        if (this.n != null) {
            EditText editText = this.h;
            w0(editText == null ? 0 : editText.getText().length());
        }
    }

    private boolean w() {
        return this.K > -1 && this.N != 0;
    }

    private static void x0(@h0 Context context, @h0 TextView textView, int r4, int r5, boolean z) {
        textView.setContentDescription(context.getString(z ? a.m.character_counter_overflowed_content_description : a.m.character_counter_content_description, Integer.valueOf(r4), Integer.valueOf(r5)));
    }

    private void y0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.n;
        if (textView != null) {
            o0(textView, this.m ? this.o : this.p);
            if (!this.m && (colorStateList2 = this.v) != null) {
                this.n.setTextColor(colorStateList2);
            }
            if (!this.m || (colorStateList = this.w) == null) {
                return;
            }
            this.n.setTextColor(colorStateList);
        }
    }

    private void z() {
        if (B()) {
            ((com.google.android.material.textfield.c) this.E).R0();
        }
    }

    private boolean z0() {
        boolean z;
        if (this.h == null) {
            return false;
        }
        boolean z2 = true;
        if (q0()) {
            int measuredWidth = this.e.getMeasuredWidth() - this.h.getPaddingLeft();
            if (this.b0 == null || this.c0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.b0 = colorDrawable;
                this.c0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrH = m.h(this.h);
            Drawable drawable = drawableArrH[0];
            Drawable drawable2 = this.b0;
            if (drawable != drawable2) {
                m.w(this.h, drawable2, drawableArrH[1], drawableArrH[2], drawableArrH[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.b0 != null) {
                Drawable[] drawableArrH2 = m.h(this.h);
                m.w(this.h, null, drawableArrH2[1], drawableArrH2[2], drawableArrH2[3]);
                this.b0 = null;
                z = true;
            }
            z = false;
        }
        if (p0()) {
            int measuredWidth2 = this.A.getMeasuredWidth() - this.h.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + b.i.p.m.c((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] drawableArrH3 = m.h(this.h);
            Drawable drawable3 = this.n0;
            if (drawable3 == null || this.o0 == measuredWidth2) {
                if (this.n0 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.n0 = colorDrawable2;
                    this.o0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = drawableArrH3[2];
                Drawable drawable5 = this.n0;
                if (drawable4 != drawable5) {
                    this.p0 = drawableArrH3[2];
                    m.w(this.h, drawableArrH3[0], drawableArrH3[1], drawable5, drawableArrH3[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.o0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                m.w(this.h, drawableArrH3[0], drawableArrH3[1], this.n0, drawableArrH3[3]);
            }
        } else {
            if (this.n0 == null) {
                return z;
            }
            Drawable[] drawableArrH4 = m.h(this.h);
            if (drawableArrH4[2] == this.n0) {
                m.w(this.h, drawableArrH4[0], drawableArrH4[1], this.p0, drawableArrH4[3]);
            } else {
                z2 = z;
            }
            this.n0 = null;
        }
        return z2;
    }

    void A0() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.h;
        if (editText == null || this.I != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (androidx.appcompat.widget.f0.a(background)) {
            background = background.mutate();
        }
        if (this.j.l()) {
            currentTextColor = this.j.p();
        } else {
            if (!this.m || (textView = this.n) == null) {
                androidx.core.graphics.drawable.a.c(background);
                this.h.refreshDrawableState();
                return;
            }
            currentTextColor = textView.getCurrentTextColor();
        }
        background.setColorFilter(androidx.appcompat.widget.k.e(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    @x0
    boolean C() {
        return B() && ((com.google.android.material.textfield.c) this.E).O0();
    }

    void E0(boolean z) {
        F0(z, false);
    }

    public boolean M() {
        return this.k;
    }

    public boolean N() {
        return this.h0.a();
    }

    public boolean O() {
        return this.g.getVisibility() == 0 && this.h0.getVisibility() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void O0() {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.O0():void");
    }

    public boolean P() {
        return this.j.B();
    }

    @x0
    final boolean R() {
        return this.j.u();
    }

    public boolean S() {
        return this.j.C();
    }

    public boolean T() {
        return this.H0;
    }

    public boolean U() {
        return this.B;
    }

    @x0
    final boolean V() {
        return this.F0;
    }

    @Deprecated
    public boolean W() {
        return this.f0 == 1;
    }

    @p0({p0.a.LIBRARY_GROUP})
    public boolean X() {
        return this.D;
    }

    public boolean Z() {
        return this.T.a();
    }

    public boolean a0() {
        return this.T.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup
    public void addView(@h0 View view, int r3, @h0 ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, r3, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.d.addView(view, layoutParams2);
        this.d.setLayoutParams(layoutParams);
        D0();
        setEditText((EditText) view);
    }

    @Deprecated
    public void d0(boolean z) {
        if (this.f0 == 1) {
            this.h0.performClick();
            if (z) {
                this.h0.jumpDrawablesToCurrentState();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(@h0 ViewStructure viewStructure, int r6) {
        EditText editText;
        if (this.i == null || (editText = this.h) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, r6);
            return;
        }
        boolean z = this.D;
        this.D = false;
        CharSequence hint = editText.getHint();
        this.h.setHint(this.i);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, r6);
        } finally {
            this.h.setHint(hint);
            this.D = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(@h0 SparseArray<Parcelable> sparseArray) {
        this.K0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.K0 = false;
    }

    @Override // android.view.View
    public void draw(@h0 Canvas canvas) {
        super.draw(canvas);
        G(canvas);
        F(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.J0) {
            return;
        }
        this.J0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.a aVar = this.G0;
        boolean zL0 = aVar != null ? aVar.l0(drawableState) | false : false;
        if (this.h != null) {
            E0(f0.P0(this) && isEnabled());
        }
        A0();
        O0();
        if (zL0) {
            invalidate();
        }
        this.J0 = false;
    }

    public void e(@h0 h hVar) {
        this.e0.add(hVar);
        if (this.h != null) {
            hVar.a(this);
        }
    }

    public void f(@h0 i iVar) {
        this.i0.add(iVar);
    }

    public void f0(@h0 h hVar) {
        this.e0.remove(hVar);
    }

    public void g0(@h0 i iVar) {
        this.i0.remove(iVar);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.h;
        return editText != null ? editText.getBaseline() + getPaddingTop() + u() : super.getBaseline();
    }

    @h0
    c.a.b.c.u.j getBoxBackground() {
        int r0 = this.I;
        if (r0 == 1 || r0 == 2) {
            return this.E;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.O;
    }

    public int getBoxBackgroundMode() {
        return this.I;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.E.t();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.E.u();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.E.S();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.E.R();
    }

    public int getBoxStrokeColor() {
        return this.y0;
    }

    @i0
    public ColorStateList getBoxStrokeErrorColor() {
        return this.z0;
    }

    public int getBoxStrokeWidth() {
        return this.L;
    }

    public int getBoxStrokeWidthFocused() {
        return this.M;
    }

    public int getCounterMaxLength() {
        return this.l;
    }

    @i0
    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.k && this.m && (textView = this.n) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    @i0
    public ColorStateList getCounterOverflowTextColor() {
        return this.v;
    }

    @i0
    public ColorStateList getCounterTextColor() {
        return this.v;
    }

    @i0
    public ColorStateList getDefaultHintTextColor() {
        return this.u0;
    }

    @i0
    public EditText getEditText() {
        return this.h;
    }

    @i0
    public CharSequence getEndIconContentDescription() {
        return this.h0.getContentDescription();
    }

    @i0
    public Drawable getEndIconDrawable() {
        return this.h0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f0;
    }

    @h0
    CheckableImageButton getEndIconView() {
        return this.h0;
    }

    @i0
    public CharSequence getError() {
        if (this.j.B()) {
            return this.j.o();
        }
        return null;
    }

    @i0
    public CharSequence getErrorContentDescription() {
        return this.j.n();
    }

    @k
    public int getErrorCurrentTextColors() {
        return this.j.p();
    }

    @i0
    public Drawable getErrorIconDrawable() {
        return this.s0.getDrawable();
    }

    @x0
    final int getErrorTextCurrentColor() {
        return this.j.p();
    }

    @i0
    public CharSequence getHelperText() {
        if (this.j.C()) {
            return this.j.r();
        }
        return null;
    }

    @k
    public int getHelperTextCurrentTextColor() {
        return this.j.t();
    }

    @i0
    public CharSequence getHint() {
        if (this.B) {
            return this.C;
        }
        return null;
    }

    @x0
    final float getHintCollapsedTextHeight() {
        return this.G0.p();
    }

    @x0
    final int getHintCurrentCollapsedTextColor() {
        return this.G0.u();
    }

    @i0
    public ColorStateList getHintTextColor() {
        return this.v0;
    }

    @i0
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.h0.getContentDescription();
    }

    @i0
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.h0.getDrawable();
    }

    @i0
    public CharSequence getPlaceholderText() {
        if (this.r) {
            return this.q;
        }
        return null;
    }

    @t0
    public int getPlaceholderTextAppearance() {
        return this.u;
    }

    @i0
    public ColorStateList getPlaceholderTextColor() {
        return this.t;
    }

    @i0
    public CharSequence getPrefixText() {
        return this.x;
    }

    @i0
    public ColorStateList getPrefixTextColor() {
        return this.y.getTextColors();
    }

    @h0
    public TextView getPrefixTextView() {
        return this.y;
    }

    @i0
    public CharSequence getStartIconContentDescription() {
        return this.T.getContentDescription();
    }

    @i0
    public Drawable getStartIconDrawable() {
        return this.T.getDrawable();
    }

    @i0
    public CharSequence getSuffixText() {
        return this.z;
    }

    @i0
    public ColorStateList getSuffixTextColor() {
        return this.A.getTextColors();
    }

    @h0
    public TextView getSuffixTextView() {
        return this.A;
    }

    @i0
    public Typeface getTypeface() {
        return this.S;
    }

    @x0
    void h(float f2) {
        if (this.G0.C() == f2) {
            return;
        }
        if (this.I0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.I0 = valueAnimator;
            valueAnimator.setInterpolator(c.a.b.c.b.a.f1936b);
            this.I0.setDuration(167L);
            this.I0.addUpdateListener(new d());
        }
        this.I0.setFloatValues(this.G0.C(), f2);
        this.I0.start();
    }

    public void i0(float f2, float f3, float f4, float f5) {
        c.a.b.c.u.j jVar = this.E;
        if (jVar != null && jVar.R() == f2 && this.E.S() == f3 && this.E.u() == f5 && this.E.t() == f4) {
            return;
        }
        this.G = this.G.v().K(f2).P(f3).C(f5).x(f4).m();
        i();
    }

    public void j0(@androidx.annotation.o int r2, @androidx.annotation.o int r3, @androidx.annotation.o int r4, @androidx.annotation.o int r5) {
        i0(getContext().getResources().getDimension(r2), getContext().getResources().getDimension(r3), getContext().getResources().getDimension(r5), getContext().getResources().getDimension(r4));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void o0(@androidx.annotation.h0 android.widget.TextView r3, @androidx.annotation.t0 int r4) {
        /*
            r2 = this;
            r0 = 1
            androidx.core.widget.m.E(r3, r4)     // Catch: java.lang.Exception -> L1b
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1b
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1b
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1b
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1c
        L18:
            r4 = 0
            r0 = 0
            goto L1c
        L1b:
        L1c:
            if (r0 == 0) goto L30
            int r4 = c.a.b.c.a.n.TextAppearance_AppCompat_Caption
            androidx.core.widget.m.E(r3, r4)
            android.content.Context r4 = r2.getContext()
            int r0 = c.a.b.c.a.e.design_error
            int r4 = b.i.c.c.e(r4, r0)
            r3.setTextColor(r4)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.o0(android.widget.TextView, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int r2, int r3, int r4, int r5) {
        super.onLayout(z, r2, r3, r4, r5);
        EditText editText = this.h;
        if (editText != null) {
            Rect rect = this.P;
            com.google.android.material.internal.c.a(this, editText, rect);
            u0(rect);
            if (this.B) {
                this.G0.e0(this.h.getTextSize());
                int gravity = this.h.getGravity();
                this.G0.U((gravity & (-113)) | 48);
                this.G0.d0(gravity);
                this.G0.Q(q(rect));
                this.G0.Z(t(rect));
                this.G0.N();
                if (!B() || this.F0) {
                    return;
                }
                c0();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int r1, int r2) {
        super.onMeasure(r1, r2);
        boolean zB0 = B0();
        boolean zZ0 = z0();
        if (zB0 || zZ0) {
            this.h.post(new c());
        }
        G0();
        J0();
        M0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(@i0 Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.a());
        setError(jVar.f);
        if (jVar.g) {
            this.h0.post(new b());
        }
        requestLayout();
    }

    @Override // android.view.View
    @i0
    public Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        if (this.j.l()) {
            jVar.f = getError();
        }
        jVar.g = K() && this.h0.isChecked();
        return jVar;
    }

    public void setBoxBackgroundColor(@k int r2) {
        if (this.O != r2) {
            this.O = r2;
            this.A0 = r2;
            this.C0 = r2;
            this.D0 = r2;
            i();
        }
    }

    public void setBoxBackgroundColorResource(@androidx.annotation.m int r2) {
        setBoxBackgroundColor(b.i.c.c.e(getContext(), r2));
    }

    public void setBoxBackgroundColorStateList(@h0 ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.A0 = defaultColor;
        this.O = defaultColor;
        this.B0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.C0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.D0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        i();
    }

    public void setBoxBackgroundMode(int r2) {
        if (r2 == this.I) {
            return;
        }
        this.I = r2;
        if (this.h != null) {
            b0();
        }
    }

    public void setBoxStrokeColor(@k int r2) {
        if (this.y0 != r2) {
            this.y0 = r2;
            O0();
        }
    }

    public void setBoxStrokeColorStateList(@h0 ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.y0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            O0();
        } else {
            this.w0 = colorStateList.getDefaultColor();
            this.E0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.x0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        }
        this.y0 = defaultColor;
        O0();
    }

    public void setBoxStrokeErrorColor(@i0 ColorStateList colorStateList) {
        if (this.z0 != colorStateList) {
            this.z0 = colorStateList;
            O0();
        }
    }

    public void setBoxStrokeWidth(int r1) {
        this.L = r1;
        O0();
    }

    public void setBoxStrokeWidthFocused(int r1) {
        this.M = r1;
        O0();
    }

    public void setBoxStrokeWidthFocusedResource(@androidx.annotation.o int r2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(r2));
    }

    public void setBoxStrokeWidthResource(@androidx.annotation.o int r2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(r2));
    }

    public void setCounterEnabled(boolean z) {
        if (this.k != z) {
            if (z) {
                a0 a0Var = new a0(getContext());
                this.n = a0Var;
                a0Var.setId(a.h.textinput_counter);
                Typeface typeface = this.S;
                if (typeface != null) {
                    this.n.setTypeface(typeface);
                }
                this.n.setMaxLines(1);
                this.j.d(this.n, 2);
                b.i.p.m.h((ViewGroup.MarginLayoutParams) this.n.getLayoutParams(), getResources().getDimensionPixelOffset(a.f.mtrl_textinput_counter_margin_start));
                y0();
                v0();
            } else {
                this.j.D(this.n, 2);
                this.n = null;
            }
            this.k = z;
        }
    }

    public void setCounterMaxLength(int r2) {
        if (this.l != r2) {
            if (r2 <= 0) {
                r2 = -1;
            }
            this.l = r2;
            if (this.k) {
                v0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int r2) {
        if (this.o != r2) {
            this.o = r2;
            y0();
        }
    }

    public void setCounterOverflowTextColor(@i0 ColorStateList colorStateList) {
        if (this.w != colorStateList) {
            this.w = colorStateList;
            y0();
        }
    }

    public void setCounterTextAppearance(int r2) {
        if (this.p != r2) {
            this.p = r2;
            y0();
        }
    }

    public void setCounterTextColor(@i0 ColorStateList colorStateList) {
        if (this.v != colorStateList) {
            this.v = colorStateList;
            y0();
        }
    }

    public void setDefaultHintTextColor(@i0 ColorStateList colorStateList) {
        this.u0 = colorStateList;
        this.v0 = colorStateList;
        if (this.h != null) {
            E0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        e0(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.h0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.h0.setCheckable(z);
    }

    public void setEndIconContentDescription(@s0 int r2) {
        setEndIconContentDescription(r2 != 0 ? getResources().getText(r2) : null);
    }

    public void setEndIconContentDescription(@i0 CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.h0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(@q int r2) {
        setEndIconDrawable(r2 != 0 ? b.a.b.a.a.d(getContext(), r2) : null);
    }

    public void setEndIconDrawable(@i0 Drawable drawable) {
        this.h0.setImageDrawable(drawable);
    }

    public void setEndIconMode(int r4) {
        int r0 = this.f0;
        this.f0 = r4;
        E(r0);
        setEndIconVisible(r4 != 0);
        if (getEndIconDelegate().b(this.I)) {
            getEndIconDelegate().a();
            l();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.I + " is not supported by the end icon mode " + r4);
    }

    public void setEndIconOnClickListener(@i0 View.OnClickListener onClickListener) {
        m0(this.h0, onClickListener, this.q0);
    }

    public void setEndIconOnLongClickListener(@i0 View.OnLongClickListener onLongClickListener) {
        this.q0 = onLongClickListener;
        n0(this.h0, onLongClickListener);
    }

    public void setEndIconTintList(@i0 ColorStateList colorStateList) {
        if (this.j0 != colorStateList) {
            this.j0 = colorStateList;
            this.k0 = true;
            l();
        }
    }

    public void setEndIconTintMode(@i0 PorterDuff.Mode mode) {
        if (this.l0 != mode) {
            this.l0 = mode;
            this.m0 = true;
            l();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (O() != z) {
            this.h0.setVisibility(z ? 0 : 8);
            M0();
            z0();
        }
    }

    public void setError(@i0 CharSequence charSequence) {
        if (!this.j.B()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.j.w();
        } else {
            this.j.Q(charSequence);
        }
    }

    public void setErrorContentDescription(@i0 CharSequence charSequence) {
        this.j.F(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.j.G(z);
    }

    public void setErrorIconDrawable(@q int r2) {
        setErrorIconDrawable(r2 != 0 ? b.a.b.a.a.d(getContext(), r2) : null);
    }

    public void setErrorIconDrawable(@i0 Drawable drawable) {
        this.s0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.j.B());
    }

    public void setErrorIconOnClickListener(@i0 View.OnClickListener onClickListener) {
        m0(this.s0, onClickListener, this.r0);
    }

    public void setErrorIconOnLongClickListener(@i0 View.OnLongClickListener onLongClickListener) {
        this.r0 = onLongClickListener;
        n0(this.s0, onLongClickListener);
    }

    public void setErrorIconTintList(@i0 ColorStateList colorStateList) {
        this.t0 = colorStateList;
        Drawable drawable = this.s0.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        }
        if (this.s0.getDrawable() != drawable) {
            this.s0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(@i0 PorterDuff.Mode mode) {
        Drawable drawable = this.s0.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            androidx.core.graphics.drawable.a.p(drawable, mode);
        }
        if (this.s0.getDrawable() != drawable) {
            this.s0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(@t0 int r2) {
        this.j.H(r2);
    }

    public void setErrorTextColor(@i0 ColorStateList colorStateList) {
        this.j.I(colorStateList);
    }

    public void setHelperText(@i0 CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (S()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!S()) {
                setHelperTextEnabled(true);
            }
            this.j.R(charSequence);
        }
    }

    public void setHelperTextColor(@i0 ColorStateList colorStateList) {
        this.j.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.j.K(z);
    }

    public void setHelperTextTextAppearance(@t0 int r2) {
        this.j.J(r2);
    }

    public void setHint(@i0 CharSequence charSequence) {
        if (this.B) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.H0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.B) {
            this.B = z;
            if (z) {
                CharSequence hint = this.h.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.C)) {
                        setHint(hint);
                    }
                    this.h.setHint((CharSequence) null);
                }
                this.D = true;
            } else {
                this.D = false;
                if (!TextUtils.isEmpty(this.C) && TextUtils.isEmpty(this.h.getHint())) {
                    this.h.setHint(this.C);
                }
                setHintInternal(null);
            }
            if (this.h != null) {
                D0();
            }
        }
    }

    public void setHintTextAppearance(@t0 int r2) {
        this.G0.R(r2);
        this.v0 = this.G0.n();
        if (this.h != null) {
            E0(false);
            D0();
        }
    }

    public void setHintTextColor(@i0 ColorStateList colorStateList) {
        if (this.v0 != colorStateList) {
            if (this.u0 == null) {
                this.G0.T(colorStateList);
            }
            this.v0 = colorStateList;
            if (this.h != null) {
                E0(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@s0 int r2) {
        setPasswordVisibilityToggleContentDescription(r2 != 0 ? getResources().getText(r2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@i0 CharSequence charSequence) {
        this.h0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@q int r2) {
        setPasswordVisibilityToggleDrawable(r2 != 0 ? b.a.b.a.a.d(getContext(), r2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@i0 Drawable drawable) {
        this.h0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f0 != 1) {
            setEndIconMode(1);
        } else {
            if (z) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@i0 ColorStateList colorStateList) {
        this.j0 = colorStateList;
        this.k0 = true;
        l();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@i0 PorterDuff.Mode mode) {
        this.l0 = mode;
        this.m0 = true;
        l();
    }

    public void setPlaceholderText(@i0 CharSequence charSequence) {
        if (this.r && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.r) {
                setPlaceholderTextEnabled(true);
            }
            this.q = charSequence;
        }
        H0();
    }

    public void setPlaceholderTextAppearance(@t0 int r2) {
        this.u = r2;
        TextView textView = this.s;
        if (textView != null) {
            m.E(textView, r2);
        }
    }

    public void setPlaceholderTextColor(@i0 ColorStateList colorStateList) {
        if (this.t != colorStateList) {
            this.t = colorStateList;
            TextView textView = this.s;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(@i0 CharSequence charSequence) {
        this.x = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.y.setText(charSequence);
        K0();
    }

    public void setPrefixTextAppearance(@t0 int r2) {
        m.E(this.y, r2);
    }

    public void setPrefixTextColor(@h0 ColorStateList colorStateList) {
        this.y.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.T.setCheckable(z);
    }

    public void setStartIconContentDescription(@s0 int r2) {
        setStartIconContentDescription(r2 != 0 ? getResources().getText(r2) : null);
    }

    public void setStartIconContentDescription(@i0 CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.T.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(@q int r2) {
        setStartIconDrawable(r2 != 0 ? b.a.b.a.a.d(getContext(), r2) : null);
    }

    public void setStartIconDrawable(@i0 Drawable drawable) {
        this.T.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            n();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    public void setStartIconOnClickListener(@i0 View.OnClickListener onClickListener) {
        m0(this.T, onClickListener, this.d0);
    }

    public void setStartIconOnLongClickListener(@i0 View.OnLongClickListener onLongClickListener) {
        this.d0 = onLongClickListener;
        n0(this.T, onLongClickListener);
    }

    public void setStartIconTintList(@i0 ColorStateList colorStateList) {
        if (this.U != colorStateList) {
            this.U = colorStateList;
            this.V = true;
            n();
        }
    }

    public void setStartIconTintMode(@i0 PorterDuff.Mode mode) {
        if (this.W != mode) {
            this.W = mode;
            this.a0 = true;
            n();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (a0() != z) {
            this.T.setVisibility(z ? 0 : 8);
            J0();
            z0();
        }
    }

    public void setSuffixText(@i0 CharSequence charSequence) {
        this.z = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.A.setText(charSequence);
        N0();
    }

    public void setSuffixTextAppearance(@t0 int r2) {
        m.E(this.A, r2);
    }

    public void setSuffixTextColor(@h0 ColorStateList colorStateList) {
        this.A.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@i0 e eVar) {
        EditText editText = this.h;
        if (editText != null) {
            f0.u1(editText, eVar);
        }
    }

    public void setTypeface(@i0 Typeface typeface) {
        if (typeface != this.S) {
            this.S = typeface;
            this.G0.o0(typeface);
            this.j.N(typeface);
            TextView textView = this.n;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    void w0(int r9) {
        boolean z = this.m;
        int r1 = this.l;
        if (r1 == -1) {
            this.n.setText(String.valueOf(r9));
            this.n.setContentDescription(null);
            this.m = false;
        } else {
            this.m = r9 > r1;
            x0(getContext(), this.n, r9, this.l, this.m);
            if (z != this.m) {
                y0();
            }
            this.n.setText(b.i.n.a.c().q(getContext().getString(a.m.character_counter_pattern, Integer.valueOf(r9), Integer.valueOf(this.l))));
        }
        if (this.h == null || z == this.m) {
            return;
        }
        E0(false);
        O0();
        A0();
    }

    public void x() {
        this.e0.clear();
    }

    public void y() {
        this.i0.clear();
    }
}

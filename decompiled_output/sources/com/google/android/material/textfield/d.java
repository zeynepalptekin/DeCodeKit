package com.google.android.material.textfield;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.h0;
import androidx.annotation.i0;
import b.i.p.f0;
import c.a.b.c.a;
import c.a.b.c.u.o;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
class d extends com.google.android.material.textfield.e {
    private static final boolean q;
    private static final int r = 50;
    private static final int s = 67;
    private final TextWatcher d;
    private final View.OnFocusChangeListener e;
    private final TextInputLayout.e f;
    private final TextInputLayout.h g;

    @SuppressLint({"ClickableViewAccessibility"})
    private final TextInputLayout.i h;
    private boolean i;
    private boolean j;
    private long k;
    private StateListDrawable l;
    private c.a.b.c.u.j m;

    @i0
    private AccessibilityManager n;
    private ValueAnimator o;
    private ValueAnimator p;

    class a implements TextWatcher {

        /* renamed from: com.google.android.material.textfield.d$a$a, reason: collision with other inner class name */
        class RunnableC0204a implements Runnable {
            final /* synthetic */ AutoCompleteTextView d;

            RunnableC0204a(AutoCompleteTextView autoCompleteTextView) {
                this.d = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean zIsPopupShowing = this.d.isPopupShowing();
                d.this.C(zIsPopupShowing);
                d.this.i = zIsPopupShowing;
            }
        }

        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            d dVar = d.this;
            AutoCompleteTextView autoCompleteTextViewX = dVar.x(dVar.f6838a.getEditText());
            autoCompleteTextViewX.post(new RunnableC0204a(autoCompleteTextViewX));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int r2, int r3, int r4) {
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@h0 ValueAnimator valueAnimator) {
            d.this.f6840c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class c implements View.OnFocusChangeListener {
        c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            d.this.f6838a.setEndIconActivated(z);
            if (z) {
                return;
            }
            d.this.C(false);
            d.this.i = false;
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d, reason: collision with other inner class name */
    class C0205d extends TextInputLayout.e {
        C0205d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, b.i.p.a
        public void g(View view, @h0 b.i.p.p0.d dVar) {
            super.g(view, dVar);
            if (d.this.f6838a.getEditText().getKeyListener() == null) {
                dVar.T0(Spinner.class.getName());
            }
            if (dVar.x0()) {
                dVar.i1(null);
            }
        }

        @Override // b.i.p.a
        public void h(View view, @h0 AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            d dVar = d.this;
            AutoCompleteTextView autoCompleteTextViewX = dVar.x(dVar.f6838a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && d.this.n.isTouchExplorationEnabled()) {
                d.this.F(autoCompleteTextViewX);
            }
        }
    }

    class e implements TextInputLayout.h {
        e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.h
        public void a(@h0 TextInputLayout textInputLayout) {
            AutoCompleteTextView autoCompleteTextViewX = d.this.x(textInputLayout.getEditText());
            d.this.D(autoCompleteTextViewX);
            d.this.u(autoCompleteTextViewX);
            d.this.E(autoCompleteTextViewX);
            autoCompleteTextViewX.setThreshold(0);
            autoCompleteTextViewX.removeTextChangedListener(d.this.d);
            autoCompleteTextViewX.addTextChangedListener(d.this.d);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(d.this.f);
            textInputLayout.setEndIconVisible(true);
        }
    }

    class f implements TextInputLayout.i {
        f() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.i
        public void a(@h0 TextInputLayout textInputLayout, int r4) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView == null || r4 != 3) {
                return;
            }
            autoCompleteTextView.removeTextChangedListener(d.this.d);
            if (autoCompleteTextView.getOnFocusChangeListener() == d.this.e) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            if (d.q) {
                autoCompleteTextView.setOnDismissListener(null);
            }
        }
    }

    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.F((AutoCompleteTextView) d.this.f6838a.getEditText());
        }
    }

    class h implements View.OnTouchListener {
        final /* synthetic */ AutoCompleteTextView d;

        h(AutoCompleteTextView autoCompleteTextView) {
            this.d = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(@h0 View view, @h0 MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (d.this.B()) {
                    d.this.i = false;
                }
                d.this.F(this.d);
            }
            return false;
        }
    }

    class i implements AutoCompleteTextView.OnDismissListener {
        i() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            d.this.i = true;
            d.this.k = System.currentTimeMillis();
            d.this.C(false);
        }
    }

    class j extends AnimatorListenerAdapter {
        j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d dVar = d.this;
            dVar.f6840c.setChecked(dVar.j);
            d.this.p.start();
        }
    }

    static {
        q = Build.VERSION.SDK_INT >= 21;
    }

    d(@h0 TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.d = new a();
        this.e = new c();
        this.f = new C0205d(this.f6838a);
        this.g = new e();
        this.h = new f();
        this.i = false;
        this.j = false;
        this.k = Long.MAX_VALUE;
    }

    private void A() {
        this.p = y(67, 0.0f, 1.0f);
        ValueAnimator valueAnimatorY = y(50, 1.0f, 0.0f);
        this.o = valueAnimatorY;
        valueAnimatorY.addListener(new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean B() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.k;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(boolean z) {
        if (this.j != z) {
            this.j = z;
            this.p.cancel();
            this.o.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(@h0 AutoCompleteTextView autoCompleteTextView) {
        Drawable drawable;
        if (q) {
            int boxBackgroundMode = this.f6838a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                drawable = this.m;
            } else if (boxBackgroundMode != 1) {
                return;
            } else {
                drawable = this.l;
            }
            autoCompleteTextView.setDropDownBackgroundDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void E(@h0 AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.e);
        if (q) {
            autoCompleteTextView.setOnDismissListener(new i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(@i0 AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (B()) {
            this.i = false;
        }
        if (this.i) {
            this.i = false;
            return;
        }
        if (q) {
            C(!this.j);
        } else {
            this.j = !this.j;
            this.f6840c.toggle();
        }
        if (!this.j) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(@h0 AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() != null) {
            return;
        }
        int boxBackgroundMode = this.f6838a.getBoxBackgroundMode();
        c.a.b.c.u.j boxBackground = this.f6838a.getBoxBackground();
        int r2 = c.a.b.c.i.a.d(autoCompleteTextView, a.c.colorControlHighlight);
        int[][] r4 = {new int[]{R.attr.state_pressed}, new int[0]};
        if (boxBackgroundMode == 2) {
            w(autoCompleteTextView, r2, r4, boxBackground);
        } else if (boxBackgroundMode == 1) {
            v(autoCompleteTextView, r2, r4, boxBackground);
        }
    }

    private void v(@h0 AutoCompleteTextView autoCompleteTextView, int r7, int[][] r8, @h0 c.a.b.c.u.j jVar) {
        int boxBackgroundColor = this.f6838a.getBoxBackgroundColor();
        int[] r2 = {c.a.b.c.i.a.g(r7, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (q) {
            f0.B1(autoCompleteTextView, new RippleDrawable(new ColorStateList(r8, r2), jVar, jVar));
            return;
        }
        c.a.b.c.u.j jVar2 = new c.a.b.c.u.j(jVar.getShapeAppearanceModel());
        jVar2.n0(new ColorStateList(r8, r2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{jVar, jVar2});
        int r82 = f0.h0(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int r0 = f0.g0(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        f0.B1(autoCompleteTextView, layerDrawable);
        f0.V1(autoCompleteTextView, r82, paddingTop, r0, paddingBottom);
    }

    private void w(@h0 AutoCompleteTextView autoCompleteTextView, int r9, int[][] r10, @h0 c.a.b.c.u.j jVar) {
        LayerDrawable layerDrawable;
        int r0 = c.a.b.c.i.a.d(autoCompleteTextView, a.c.colorSurface);
        c.a.b.c.u.j jVar2 = new c.a.b.c.u.j(jVar.getShapeAppearanceModel());
        int r92 = c.a.b.c.i.a.g(r9, r0, 0.1f);
        jVar2.n0(new ColorStateList(r10, new int[]{r92, 0}));
        if (q) {
            jVar2.setTint(r0);
            ColorStateList colorStateList = new ColorStateList(r10, new int[]{r92, r0});
            c.a.b.c.u.j jVar3 = new c.a.b.c.u.j(jVar.getShapeAppearanceModel());
            jVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, jVar2, jVar3), jVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{jVar2, jVar});
        }
        f0.B1(autoCompleteTextView, layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @h0
    public AutoCompleteTextView x(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator y(int r3, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(c.a.b.c.b.a.f1935a);
        valueAnimatorOfFloat.setDuration(r3);
        valueAnimatorOfFloat.addUpdateListener(new b());
        return valueAnimatorOfFloat;
    }

    private c.a.b.c.u.j z(float f2, float f3, float f4, int r5) {
        o oVarM = o.a().K(f2).P(f2).x(f3).C(f3).m();
        c.a.b.c.u.j jVarN = c.a.b.c.u.j.n(this.f6839b, f4);
        jVarN.setShapeAppearanceModel(oVarM);
        jVarN.p0(0, r5, 0, r5);
        return jVarN;
    }

    @Override // com.google.android.material.textfield.e
    void a() throws Resources.NotFoundException {
        float dimensionPixelOffset = this.f6839b.getResources().getDimensionPixelOffset(a.f.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.f6839b.getResources().getDimensionPixelOffset(a.f.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f6839b.getResources().getDimensionPixelOffset(a.f.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        c.a.b.c.u.j jVarZ = z(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        c.a.b.c.u.j jVarZ2 = z(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.m = jVarZ;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.l = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, jVarZ);
        this.l.addState(new int[0], jVarZ2);
        this.f6838a.setEndIconDrawable(b.a.b.a.a.d(this.f6839b, q ? a.g.mtrl_dropdown_arrow : a.g.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.f6838a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(a.m.exposed_dropdown_menu_content_description));
        this.f6838a.setEndIconOnClickListener(new g());
        this.f6838a.e(this.g);
        this.f6838a.f(this.h);
        A();
        f0.K1(this.f6840c, 2);
        this.n = (AccessibilityManager) this.f6839b.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.e
    boolean b(int r1) {
        return r1 != 0;
    }

    @Override // com.google.android.material.textfield.e
    boolean d() {
        return true;
    }
}

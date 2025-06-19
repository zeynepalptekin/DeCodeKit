package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.h0;
import c.a.b.c.a;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
class a extends com.google.android.material.textfield.e {
    private static final int j = 100;
    private static final int k = 150;
    private static final float l = 0.8f;
    private final TextWatcher d;
    private final View.OnFocusChangeListener e;
    private final TextInputLayout.h f;
    private final TextInputLayout.i g;
    private AnimatorSet h;
    private ValueAnimator i;

    /* renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    class C0203a implements TextWatcher {
        C0203a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@h0 Editable editable) {
            if (a.this.f6838a.getSuffixText() != null) {
                return;
            }
            a.this.i(a.l(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int r2, int r3, int r4) {
        }
    }

    class b implements View.OnFocusChangeListener {
        b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            a.this.i((TextUtils.isEmpty(((EditText) view).getText()) ^ true) && z);
        }
    }

    class c implements TextInputLayout.h {
        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.h
        public void a(@h0 TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(editText.hasFocus() && a.l(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(a.this.e);
            editText.removeTextChangedListener(a.this.d);
            editText.addTextChangedListener(a.this.d);
        }
    }

    class d implements TextInputLayout.i {
        d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.i
        public void a(@h0 TextInputLayout textInputLayout, int r3) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || r3 != 2) {
                return;
            }
            editText.removeTextChangedListener(a.this.d);
            if (editText.getOnFocusChangeListener() == a.this.e) {
                editText.setOnFocusChangeListener(null);
            }
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = a.this.f6838a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f6838a.setEndIconVisible(true);
        }
    }

    class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f6838a.setEndIconVisible(false);
        }
    }

    class h implements ValueAnimator.AnimatorUpdateListener {
        h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@h0 ValueAnimator valueAnimator) {
            a.this.f6840c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class i implements ValueAnimator.AnimatorUpdateListener {
        i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@h0 ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f6840c.setScaleX(fFloatValue);
            a.this.f6840c.setScaleY(fFloatValue);
        }
    }

    a(@h0 TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.d = new C0203a();
        this.e = new b();
        this.f = new c();
        this.g = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(boolean z) {
        boolean z2 = this.f6838a.O() == z;
        if (z) {
            this.i.cancel();
            this.h.start();
            if (z2) {
                this.h.end();
                return;
            }
            return;
        }
        this.h.cancel();
        this.i.start();
        if (z2) {
            this.i.end();
        }
    }

    private ValueAnimator j(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(c.a.b.c.b.a.f1935a);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new h());
        return valueAnimatorOfFloat;
    }

    private ValueAnimator k() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(l, 1.0f);
        valueAnimatorOfFloat.setInterpolator(c.a.b.c.b.a.d);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new i());
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(@h0 Editable editable) {
        return editable.length() > 0;
    }

    private void m() {
        ValueAnimator valueAnimatorK = k();
        ValueAnimator valueAnimatorJ = j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.h = animatorSet;
        animatorSet.playTogether(valueAnimatorK, valueAnimatorJ);
        this.h.addListener(new f());
        ValueAnimator valueAnimatorJ2 = j(1.0f, 0.0f);
        this.i = valueAnimatorJ2;
        valueAnimatorJ2.addListener(new g());
    }

    @Override // com.google.android.material.textfield.e
    void a() {
        this.f6838a.setEndIconDrawable(b.a.b.a.a.d(this.f6839b, a.g.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f6838a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(a.m.clear_text_end_icon_content_description));
        this.f6838a.setEndIconOnClickListener(new e());
        this.f6838a.e(this.f);
        this.f6838a.f(this.g);
        m();
    }

    @Override // com.google.android.material.textfield.e
    void c(boolean z) {
        if (this.f6838a.getSuffixText() == null) {
            return;
        }
        i(z);
    }
}

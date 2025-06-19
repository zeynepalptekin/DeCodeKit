package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.h0;
import c.a.b.c.a;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
class i extends e {
    private final TextWatcher d;
    private final TextInputLayout.h e;
    private final TextInputLayout.i f;

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int r2, int r3, int r4) {
            i.this.f6840c.setChecked(!r1.g());
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int r2, int r3, int r4) {
        }
    }

    class b implements TextInputLayout.h {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.h
        public void a(@h0 TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            i.this.f6840c.setChecked(!r4.g());
            editText.removeTextChangedListener(i.this.d);
            editText.addTextChangedListener(i.this.d);
        }
    }

    class c implements TextInputLayout.i {
        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.i
        public void a(@h0 TextInputLayout textInputLayout, int r3) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || r3 != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.removeTextChangedListener(i.this.d);
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = i.this.f6838a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            editText.setTransformationMethod(i.this.g() ? null : PasswordTransformationMethod.getInstance());
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
        }
    }

    i(@h0 TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.d = new a();
        this.e = new b();
        this.f = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        EditText editText = this.f6838a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    @Override // com.google.android.material.textfield.e
    void a() {
        this.f6838a.setEndIconDrawable(b.a.b.a.a.d(this.f6839b, a.g.design_password_eye));
        TextInputLayout textInputLayout = this.f6838a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(a.m.password_toggle_content_description));
        this.f6838a.setEndIconOnClickListener(new d());
        this.f6838a.e(this.e);
        this.f6838a.f(this.f);
        EditText editText = this.f6838a.getEditText();
        if (h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}

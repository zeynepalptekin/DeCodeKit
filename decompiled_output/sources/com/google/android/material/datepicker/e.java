package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.annotation.h0;
import androidx.annotation.i0;
import c.a.b.c.a;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/* loaded from: classes.dex */
abstract class e implements TextWatcher {
    private final String d;
    private final DateFormat e;

    @h0
    private final TextInputLayout f;
    private final a g;
    private final String h;

    e(String str, DateFormat dateFormat, @h0 TextInputLayout textInputLayout, a aVar) {
        this.d = str;
        this.e = dateFormat;
        this.f = textInputLayout;
        this.g = aVar;
        this.h = textInputLayout.getContext().getString(a.m.mtrl_picker_out_of_range);
    }

    void a() {
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    abstract void b(@i0 Long l);

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int r2, int r3, int r4) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@h0 CharSequence charSequence, int r7, int r8, int r9) throws ParseException {
        if (TextUtils.isEmpty(charSequence)) {
            this.f.setError(null);
            b(null);
            return;
        }
        try {
            Date date = this.e.parse(charSequence.toString());
            this.f.setError(null);
            long time = date.getTime();
            if (this.g.f().s(time) && this.g.l(time)) {
                b(Long.valueOf(date.getTime()));
            } else {
                this.f.setError(String.format(this.h, g.c(time)));
                a();
            }
        } catch (ParseException unused) {
            String string = this.f.getContext().getString(a.m.mtrl_picker_invalid_format);
            String str = String.format(this.f.getContext().getString(a.m.mtrl_picker_invalid_format_use), this.d);
            String str2 = String.format(this.f.getContext().getString(a.m.mtrl_picker_invalid_format_example), this.e.format(new Date(y.t().getTimeInMillis())));
            this.f.setError(string + "\n" + str + "\n" + str2);
            a();
        }
    }
}

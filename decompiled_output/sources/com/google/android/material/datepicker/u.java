package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import c.a.b.c.a;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class u implements f<b.i.o.f<Long, Long>> {
    public static final Parcelable.Creator<u> CREATOR = new c();
    private String d;
    private final String e = " ";

    @i0
    private Long f = null;

    @i0
    private Long g = null;

    @i0
    private Long h = null;

    @i0
    private Long i = null;

    class a extends e {
        final /* synthetic */ TextInputLayout i;
        final /* synthetic */ TextInputLayout j;
        final /* synthetic */ s k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, com.google.android.material.datepicker.a aVar, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, s sVar) {
            super(str, dateFormat, textInputLayout, aVar);
            this.i = textInputLayout2;
            this.j = textInputLayout3;
            this.k = sVar;
        }

        @Override // com.google.android.material.datepicker.e
        void a() {
            u.this.h = null;
            u.this.k(this.i, this.j, this.k);
        }

        @Override // com.google.android.material.datepicker.e
        void b(@i0 Long l) {
            u.this.h = l;
            u.this.k(this.i, this.j, this.k);
        }
    }

    class b extends e {
        final /* synthetic */ TextInputLayout i;
        final /* synthetic */ TextInputLayout j;
        final /* synthetic */ s k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, DateFormat dateFormat, TextInputLayout textInputLayout, com.google.android.material.datepicker.a aVar, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, s sVar) {
            super(str, dateFormat, textInputLayout, aVar);
            this.i = textInputLayout2;
            this.j = textInputLayout3;
            this.k = sVar;
        }

        @Override // com.google.android.material.datepicker.e
        void a() {
            u.this.i = null;
            u.this.k(this.i, this.j, this.k);
        }

        @Override // com.google.android.material.datepicker.e
        void b(@i0 Long l) {
            u.this.i = l;
            u.this.k(this.i, this.j, this.k);
        }
    }

    static class c implements Parcelable.Creator<u> {
        c() {
        }

        @Override // android.os.Parcelable.Creator
        @h0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u createFromParcel(@h0 Parcel parcel) {
            u uVar = new u();
            uVar.f = (Long) parcel.readValue(Long.class.getClassLoader());
            uVar.g = (Long) parcel.readValue(Long.class.getClassLoader());
            return uVar;
        }

        @Override // android.os.Parcelable.Creator
        @h0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u[] newArray(int r1) {
            return new u[r1];
        }
    }

    private void f(@h0 TextInputLayout textInputLayout, @h0 TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.d.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() == null || !" ".contentEquals(textInputLayout2.getError())) {
            return;
        }
        textInputLayout2.setError(null);
    }

    private boolean h(long j, long j2) {
        return j <= j2;
    }

    private void i(@h0 TextInputLayout textInputLayout, @h0 TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.d);
        textInputLayout2.setError(" ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(@h0 TextInputLayout textInputLayout, @h0 TextInputLayout textInputLayout2, @h0 s<b.i.o.f<Long, Long>> sVar) {
        Long l = this.h;
        if (l == null || this.i == null) {
            f(textInputLayout, textInputLayout2);
            sVar.a();
        } else if (!h(l.longValue(), this.i.longValue())) {
            i(textInputLayout, textInputLayout2);
            sVar.a();
        } else {
            this.f = this.h;
            this.g = this.i;
            sVar.b(G());
        }
    }

    @Override // com.google.android.material.datepicker.f
    @h0
    public Collection<Long> A() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.g;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.f
    public void Q(long j) {
        Long l = this.f;
        if (l != null) {
            if (this.g == null && h(l.longValue(), j)) {
                this.g = Long.valueOf(j);
                return;
            }
            this.g = null;
        }
        this.f = Long.valueOf(j);
    }

    @Override // com.google.android.material.datepicker.f
    public View S(@h0 LayoutInflater layoutInflater, @i0 ViewGroup viewGroup, @i0 Bundle bundle, com.google.android.material.datepicker.a aVar, @h0 s<b.i.o.f<Long, Long>> sVar) throws Resources.NotFoundException {
        View viewInflate = layoutInflater.inflate(a.k.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(a.h.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) viewInflate.findViewById(a.h.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (com.google.android.material.internal.g.a()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.d = viewInflate.getResources().getString(a.m.mtrl_picker_invalid_range);
        SimpleDateFormat simpleDateFormatP = y.p();
        Long l = this.f;
        if (l != null) {
            editText.setText(simpleDateFormatP.format(l));
            this.h = this.f;
        }
        Long l2 = this.g;
        if (l2 != null) {
            editText2.setText(simpleDateFormatP.format(l2));
            this.i = this.g;
        }
        String strQ = y.q(viewInflate.getResources(), simpleDateFormatP);
        editText.addTextChangedListener(new a(strQ, simpleDateFormatP, textInputLayout, aVar, textInputLayout, textInputLayout2, sVar));
        editText2.addTextChangedListener(new b(strQ, simpleDateFormatP, textInputLayout2, aVar, textInputLayout, textInputLayout2, sVar));
        com.google.android.material.internal.z.l(editText);
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.f
    public int T() {
        return a.m.mtrl_picker_range_header_title;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.f
    @h0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public b.i.o.f<Long, Long> G() {
        return new b.i.o.f<>(this.f, this.g);
    }

    @Override // com.google.android.material.datepicker.f
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void v(@h0 b.i.o.f<Long, Long> fVar) {
        Long l = fVar.f1147a;
        if (l != null && fVar.f1148b != null) {
            b.i.o.i.a(h(l.longValue(), fVar.f1148b.longValue()));
        }
        Long l2 = fVar.f1147a;
        this.f = l2 == null ? null : Long.valueOf(y.a(l2.longValue()));
        Long l3 = fVar.f1148b;
        this.g = l3 != null ? Long.valueOf(y.a(l3.longValue())) : null;
    }

    @Override // com.google.android.material.datepicker.f
    @h0
    public String n(@h0 Context context) {
        Resources resources = context.getResources();
        if (this.f == null && this.g == null) {
            return resources.getString(a.m.mtrl_picker_range_header_unselected);
        }
        Long l = this.g;
        if (l == null) {
            return resources.getString(a.m.mtrl_picker_range_header_only_start_selected, g.c(this.f.longValue()));
        }
        Long l2 = this.f;
        if (l2 == null) {
            return resources.getString(a.m.mtrl_picker_range_header_only_end_selected, g.c(l.longValue()));
        }
        b.i.o.f<String, String> fVarA = g.a(l2, l);
        return resources.getString(a.m.mtrl_picker_range_header_selected, fVarA.f1147a, fVarA.f1148b);
    }

    @Override // com.google.android.material.datepicker.f
    public int o(@h0 Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return c.a.b.c.r.b.f(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(a.f.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? a.c.materialCalendarTheme : a.c.materialCalendarFullscreenTheme, l.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.f
    @h0
    public Collection<b.i.o.f<Long, Long>> r() {
        if (this.f == null || this.g == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b.i.o.f(this.f, this.g));
        return arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@h0 Parcel parcel, int r2) {
        parcel.writeValue(this.f);
        parcel.writeValue(this.g);
    }

    @Override // com.google.android.material.datepicker.f
    public boolean x() {
        Long l = this.f;
        return (l == null || this.g == null || !h(l.longValue(), this.g.longValue())) ? false : true;
    }
}

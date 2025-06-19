package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
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
public class v implements f<Long> {
    public static final Parcelable.Creator<v> CREATOR = new b();

    @i0
    private Long d;

    class a extends e {
        final /* synthetic */ s i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, com.google.android.material.datepicker.a aVar, s sVar) {
            super(str, dateFormat, textInputLayout, aVar);
            this.i = sVar;
        }

        @Override // com.google.android.material.datepicker.e
        void a() {
            this.i.a();
        }

        @Override // com.google.android.material.datepicker.e
        void b(@i0 Long l) {
            if (l == null) {
                v.this.c();
            } else {
                v.this.Q(l.longValue());
            }
            this.i.b(v.this.G());
        }
    }

    static class b implements Parcelable.Creator<v> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        @h0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v createFromParcel(@h0 Parcel parcel) {
            v vVar = new v();
            vVar.d = (Long) parcel.readValue(Long.class.getClassLoader());
            return vVar;
        }

        @Override // android.os.Parcelable.Creator
        @h0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public v[] newArray(int r1) {
            return new v[r1];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.d = null;
    }

    @Override // com.google.android.material.datepicker.f
    @h0
    public Collection<Long> A() {
        ArrayList arrayList = new ArrayList();
        Long l = this.d;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.f
    public void Q(long j) {
        this.d = Long.valueOf(j);
    }

    @Override // com.google.android.material.datepicker.f
    public View S(@h0 LayoutInflater layoutInflater, @i0 ViewGroup viewGroup, @i0 Bundle bundle, com.google.android.material.datepicker.a aVar, @h0 s<Long> sVar) throws Resources.NotFoundException {
        View viewInflate = layoutInflater.inflate(a.k.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(a.h.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        if (com.google.android.material.internal.g.a()) {
            editText.setInputType(17);
        }
        SimpleDateFormat simpleDateFormatP = y.p();
        String strQ = y.q(viewInflate.getResources(), simpleDateFormatP);
        Long l = this.d;
        if (l != null) {
            editText.setText(simpleDateFormatP.format(l));
        }
        editText.addTextChangedListener(new a(strQ, simpleDateFormatP, textInputLayout, aVar, sVar));
        com.google.android.material.internal.z.l(editText);
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.f
    public int T() {
        return a.m.mtrl_picker_date_header_title;
    }

    @Override // com.google.android.material.datepicker.f
    @i0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long G() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.f
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void v(@i0 Long l) {
        this.d = l == null ? null : Long.valueOf(y.a(l.longValue()));
    }

    @Override // com.google.android.material.datepicker.f
    @h0
    public String n(@h0 Context context) {
        Resources resources = context.getResources();
        Long l = this.d;
        if (l == null) {
            return resources.getString(a.m.mtrl_picker_date_header_unselected);
        }
        return resources.getString(a.m.mtrl_picker_date_header_selected, g.i(l.longValue()));
    }

    @Override // com.google.android.material.datepicker.f
    public int o(Context context) {
        return c.a.b.c.r.b.f(context, a.c.materialCalendarTheme, l.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.f
    @h0
    public Collection<b.i.o.f<Long, Long>> r() {
        return new ArrayList();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@h0 Parcel parcel, int r2) {
        parcel.writeValue(this.d);
    }

    @Override // com.google.android.material.datepicker.f
    public boolean x() {
        return this.d != null;
    }
}

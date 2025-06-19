package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.h0;
import androidx.recyclerview.widget.RecyclerView;
import c.a.b.c.a;
import com.google.android.material.datepicker.k;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
class z extends RecyclerView.g<b> {

    /* renamed from: c, reason: collision with root package name */
    private final k<?> f6684c;

    class a implements View.OnClickListener {
        final /* synthetic */ int d;

        a(int r2) {
            this.d = r2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            z.this.f6684c.I2(z.this.f6684c.B2().e(p.g(this.d, z.this.f6684c.D2().f)));
            z.this.f6684c.J2(k.EnumC0197k.DAY);
        }
    }

    public static class b extends RecyclerView.f0 {
        final TextView H;

        b(TextView textView) {
            super(textView);
            this.H = textView;
        }
    }

    z(k<?> kVar) {
        this.f6684c = kVar;
    }

    @h0
    private View.OnClickListener G(int r2) {
        return new a(r2);
    }

    int H(int r2) {
        return r2 - this.f6684c.B2().j().g;
    }

    int I(int r2) {
        return this.f6684c.B2().j().g + r2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void u(@h0 b bVar, int r9) {
        int I = I(r9);
        String string = bVar.H.getContext().getString(a.m.mtrl_picker_navigate_to_year_description);
        bVar.H.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(I)));
        bVar.H.setContentDescription(String.format(string, Integer.valueOf(I)));
        c cVarC2 = this.f6684c.C2();
        Calendar calendarT = y.t();
        com.google.android.material.datepicker.b bVar2 = calendarT.get(1) == I ? cVarC2.f : cVarC2.d;
        Iterator<Long> it = this.f6684c.q2().A().iterator();
        while (it.hasNext()) {
            calendarT.setTimeInMillis(it.next().longValue());
            if (calendarT.get(1) == I) {
                bVar2 = cVarC2.e;
            }
        }
        bVar2.f(bVar.H);
        bVar.H.setOnClickListener(G(I));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @h0
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public b w(@h0 ViewGroup viewGroup, int r4) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(a.k.mtrl_calendar_year, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int e() {
        return this.f6684c.B2().k();
    }
}

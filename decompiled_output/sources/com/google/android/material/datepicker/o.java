package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import java.util.Iterator;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class o<S> extends t<S> {
    private static final String j0 = "DATE_SELECTOR_KEY";
    private static final String k0 = "CALENDAR_CONSTRAINTS_KEY";

    @i0
    private f<S> h0;

    @i0
    private com.google.android.material.datepicker.a i0;

    class a extends s<S> {
        a() {
        }

        @Override // com.google.android.material.datepicker.s
        void a() {
            Iterator<s<S>> it = o.this.g0.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        @Override // com.google.android.material.datepicker.s
        public void b(S s) {
            Iterator<s<S>> it = o.this.g0.iterator();
            while (it.hasNext()) {
                it.next().b(s);
            }
        }
    }

    @h0
    static <T> o<T> s2(@h0 f<T> fVar, @h0 com.google.android.material.datepicker.a aVar) {
        o<T> oVar = new o<>();
        Bundle bundle = new Bundle();
        bundle.putParcelable(j0, fVar);
        bundle.putParcelable(k0, aVar);
        oVar.N1(bundle);
        return oVar;
    }

    @Override // androidx.fragment.app.Fragment
    @h0
    public View C0(@h0 LayoutInflater layoutInflater, @i0 ViewGroup viewGroup, @i0 Bundle bundle) {
        return this.h0.S(layoutInflater, viewGroup, bundle, this.i0, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void U0(@h0 Bundle bundle) {
        super.U0(bundle);
        bundle.putParcelable(j0, this.h0);
        bundle.putParcelable(k0, this.i0);
    }

    @Override // com.google.android.material.datepicker.t
    @h0
    public f<S> q2() {
        f<S> fVar = this.h0;
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalStateException("dateSelector should not be null. Use MaterialTextInputPicker#newInstance() to create this fragment with a DateSelector, and call this method after the fragment has been created.");
    }

    @Override // androidx.fragment.app.Fragment
    public void y0(@i0 Bundle bundle) {
        super.y0(bundle);
        if (bundle == null) {
            bundle = s();
        }
        this.h0 = (f) bundle.getParcelable(j0);
        this.i0 = (com.google.android.material.datepicker.a) bundle.getParcelable(k0);
    }
}

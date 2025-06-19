package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.h0;
import androidx.recyclerview.widget.RecyclerView;
import b.i.p.f0;
import c.a.b.c.a;
import com.google.android.material.datepicker.k;

/* loaded from: classes.dex */
class r extends RecyclerView.g<b> {

    /* renamed from: c, reason: collision with root package name */
    @h0
    private final com.google.android.material.datepicker.a f6678c;
    private final f<?> d;
    private final k.l e;
    private final int f;

    class a implements AdapterView.OnItemClickListener {
        final /* synthetic */ MaterialCalendarGridView d;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.d = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int r3, long j) {
            if (this.d.getAdapter().j(r3)) {
                r.this.e.a(this.d.getAdapter().getItem(r3).longValue());
            }
        }
    }

    public static class b extends RecyclerView.f0 {
        final TextView H;
        final MaterialCalendarGridView I;

        b(@h0 LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(a.h.month_title);
            this.H = textView;
            f0.v1(textView, true);
            this.I = (MaterialCalendarGridView) linearLayout.findViewById(a.h.month_grid);
            if (z) {
                return;
            }
            this.H.setVisibility(8);
        }
    }

    r(@h0 Context context, f<?> fVar, @h0 com.google.android.material.datepicker.a aVar, k.l lVar) {
        p pVarJ = aVar.j();
        p pVarG = aVar.g();
        p pVarI = aVar.i();
        if (pVarJ.compareTo(pVarI) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (pVarI.compareTo(pVarG) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f = (q.h * k.E2(context)) + (l.b3(context) ? k.E2(context) : 0);
        this.f6678c = aVar;
        this.d = fVar;
        this.e = lVar;
        D(true);
    }

    @h0
    p G(int r2) {
        return this.f6678c.j().w(r2);
    }

    @h0
    CharSequence H(int r1) {
        return G(r1).p();
    }

    int I(@h0 p pVar) {
        return this.f6678c.j().y(pVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void u(@h0 b bVar, int r5) {
        p pVarW = this.f6678c.j().w(r5);
        bVar.H.setText(pVarW.p());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.I.findViewById(a.h.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !pVarW.equals(materialCalendarGridView.getAdapter().d)) {
            q qVar = new q(pVarW, this.d, this.f6678c);
            materialCalendarGridView.setNumColumns(pVarW.h);
            materialCalendarGridView.setAdapter((ListAdapter) qVar);
        } else {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @h0
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public b w(@h0 ViewGroup viewGroup, int r4) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(a.k.mtrl_calendar_month_labeled, viewGroup, false);
        if (!l.b3(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f));
        return new b(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int e() {
        return this.f6678c.h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long f(int r3) {
        return this.f6678c.j().w(r3).q();
    }
}

package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import androidx.annotation.i0;

/* loaded from: classes.dex */
class q extends BaseAdapter {
    static final int h = y.v().getMaximum(4);
    final p d;
    final f<?> e;
    c f;
    final a g;

    q(p pVar, f<?> fVar, a aVar) {
        this.d = pVar;
        this.e = fVar;
        this.g = aVar;
    }

    private void e(Context context) {
        if (this.f == null) {
            this.f = new c(context);
        }
    }

    int a(int r2) {
        return b() + (r2 - 1);
    }

    int b() {
        return this.d.k();
    }

    @Override // android.widget.Adapter
    @i0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Long getItem(int r3) {
        if (r3 < this.d.k() || r3 > h()) {
            return null;
        }
        return Long.valueOf(this.d.m(i(r3)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    @Override // android.widget.Adapter
    @androidx.annotation.h0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.TextView getView(int r6, @androidx.annotation.i0 android.view.View r7, @androidx.annotation.h0 android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = c.a.b.c.a.k.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            r8 = 1
            if (r7 < 0) goto L5e
            com.google.android.material.datepicker.p r2 = r5.d
            int r3 = r2.i
            if (r7 < r3) goto L2e
            goto L5e
        L2e:
            int r7 = r7 + r8
            r0.setTag(r2)
            java.lang.String r2 = java.lang.String.valueOf(r7)
            r0.setText(r2)
            com.google.android.material.datepicker.p r2 = r5.d
            long r2 = r2.m(r7)
            com.google.android.material.datepicker.p r7 = r5.d
            int r7 = r7.g
            com.google.android.material.datepicker.p r4 = com.google.android.material.datepicker.p.j()
            int r4 = r4.g
            if (r7 != r4) goto L50
            java.lang.String r7 = com.google.android.material.datepicker.g.g(r2)
            goto L54
        L50:
            java.lang.String r7 = com.google.android.material.datepicker.g.k(r2)
        L54:
            r0.setContentDescription(r7)
            r0.setVisibility(r1)
            r0.setEnabled(r8)
            goto L66
        L5e:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L66:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L6d
            return r0
        L6d:
            com.google.android.material.datepicker.a r7 = r5.g
            com.google.android.material.datepicker.a$c r7 = r7.f()
            long r2 = r6.longValue()
            boolean r7 = r7.s(r2)
            if (r7 == 0) goto Lcc
            r0.setEnabled(r8)
            com.google.android.material.datepicker.f<?> r7 = r5.e
            java.util.Collection r7 = r7.A()
            java.util.Iterator r7 = r7.iterator()
        L8a:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb2
            java.lang.Object r8 = r7.next()
            java.lang.Long r8 = (java.lang.Long) r8
            long r1 = r8.longValue()
            long r3 = r6.longValue()
            long r3 = com.google.android.material.datepicker.y.a(r3)
            long r1 = com.google.android.material.datepicker.y.a(r1)
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 != 0) goto L8a
            com.google.android.material.datepicker.c r6 = r5.f
            com.google.android.material.datepicker.b r6 = r6.f6664b
        Lae:
            r6.f(r0)
            return r0
        Lb2:
            java.util.Calendar r7 = com.google.android.material.datepicker.y.t()
            long r7 = r7.getTimeInMillis()
            long r1 = r6.longValue()
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r6 != 0) goto Lc7
            com.google.android.material.datepicker.c r6 = r5.f
            com.google.android.material.datepicker.b r6 = r6.f6665c
            goto Lae
        Lc7:
            com.google.android.material.datepicker.c r6 = r5.f
            com.google.android.material.datepicker.b r6 = r6.f6663a
            goto Lae
        Lcc:
            r0.setEnabled(r1)
            com.google.android.material.datepicker.c r6 = r5.f
            com.google.android.material.datepicker.b r6 = r6.g
            goto Lae
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.q.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    boolean f(int r2) {
        return r2 % this.d.h == 0;
    }

    boolean g(int r3) {
        return (r3 + 1) % this.d.h == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.d.i + b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
        return r3 / this.d.h;
    }

    int h() {
        return (this.d.k() + this.d.i) - 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    int i(int r2) {
        return (r2 - this.d.k()) + 1;
    }

    boolean j(int r2) {
        return r2 >= b() && r2 <= h();
    }
}

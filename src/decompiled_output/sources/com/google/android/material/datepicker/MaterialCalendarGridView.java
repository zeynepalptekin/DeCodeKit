package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.h0;
import androidx.annotation.i0;
import b.i.p.f0;
import c.a.b.c.a;
import java.util.Calendar;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {
    private final Calendar d;

    class a extends b.i.p.a {
        a() {
        }

        @Override // b.i.p.a
        public void g(View view, @h0 b.i.p.p0.d dVar) {
            super.g(view, dVar);
            dVar.V0(null);
        }
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        this.d = y.v();
        if (l.b3(getContext())) {
            setNextFocusLeftId(a.h.cancel_button);
            setNextFocusRightId(a.h.confirm_button);
        }
        f0.u1(this, new a());
    }

    private void a(int r2, Rect rect) {
        int r22;
        if (r2 == 33) {
            r22 = getAdapter().h();
        } else {
            if (r2 != 130) {
                super.onFocusChanged(true, r2, rect);
                return;
            }
            r22 = getAdapter().b();
        }
        setSelection(r22);
    }

    private static int c(@h0 View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private static boolean d(@i0 Long l, @i0 Long l2, @i0 Long l3, @i0 Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @h0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public q getAdapter() {
        return (q) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(@h0 Canvas canvas) {
        int r7;
        int right;
        int r9;
        int width;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        q adapter = getAdapter();
        f<?> fVar = adapter.e;
        c cVar = adapter.f;
        Long item = adapter.getItem(adapter.b());
        Long item2 = adapter.getItem(adapter.h());
        for (b.i.o.f<Long, Long> fVar2 : fVar.r()) {
            Long l = fVar2.f1147a;
            if (l != null) {
                if (fVar2.f1148b == null) {
                    continue;
                } else {
                    long jLongValue = l.longValue();
                    long jLongValue2 = fVar2.f1148b.longValue();
                    if (d(item, item2, Long.valueOf(jLongValue), Long.valueOf(jLongValue2))) {
                        return;
                    }
                    if (jLongValue < item.longValue()) {
                        r7 = adapter.b();
                        right = adapter.f(r7) ? 0 : materialCalendarGridView.getChildAt(r7 - 1).getRight();
                    } else {
                        materialCalendarGridView.d.setTimeInMillis(jLongValue);
                        r7 = adapter.a(materialCalendarGridView.d.get(5));
                        right = c(materialCalendarGridView.getChildAt(r7));
                    }
                    if (jLongValue2 > item2.longValue()) {
                        r9 = Math.min(adapter.h(), getChildCount() - 1);
                        width = adapter.g(r9) ? getWidth() : materialCalendarGridView.getChildAt(r9).getRight();
                    } else {
                        materialCalendarGridView.d.setTimeInMillis(jLongValue2);
                        r9 = adapter.a(materialCalendarGridView.d.get(5));
                        width = c(materialCalendarGridView.getChildAt(r9));
                    }
                    int itemId = (int) adapter.getItemId(r7);
                    int itemId2 = (int) adapter.getItemId(r9);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View childAt = materialCalendarGridView.getChildAt(numColumns);
                        canvas.drawRect(numColumns > r7 ? 0 : right, childAt.getTop() + cVar.f6663a.e(), r9 > numColumns2 ? getWidth() : width, childAt.getBottom() - cVar.f6663a.b(), cVar.h);
                        itemId++;
                        materialCalendarGridView = this;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z, int r2, Rect rect) {
        if (z) {
            a(r2, rect);
        } else {
            super.onFocusChanged(false, r2, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r4, KeyEvent keyEvent) {
        if (!super.onKeyDown(r4, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != r4) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof q)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), q.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int r2) {
        if (r2 < getAdapter().b()) {
            r2 = getAdapter().b();
        }
        super.setSelection(r2);
    }
}

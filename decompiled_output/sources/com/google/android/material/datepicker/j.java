package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.h0;
import androidx.annotation.i0;
import c.a.b.c.a;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
class j extends BaseAdapter {
    private static final int g = 4;
    private static final int h;

    @h0
    private final Calendar d;
    private final int e;
    private final int f;

    static {
        h = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public j() {
        Calendar calendarV = y.v();
        this.d = calendarV;
        this.e = calendarV.getMaximum(7);
        this.f = this.d.getFirstDayOfWeek();
    }

    private int b(int r2) {
        int r22 = r2 + this.f;
        int r0 = this.e;
        return r22 > r0 ? r22 - r0 : r22;
    }

    @Override // android.widget.Adapter
    @i0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int r2) {
        if (r2 >= this.e) {
            return null;
        }
        return Integer.valueOf(b(r2));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.e;
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @i0
    @SuppressLint({"WrongConstant"})
    public View getView(int r6, @i0 View view, @h0 ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(a.k.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.d.set(7, b(r6));
        textView.setText(this.d.getDisplayName(7, h, Locale.getDefault()));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(a.m.mtrl_picker_day_of_week_column_header), this.d.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}

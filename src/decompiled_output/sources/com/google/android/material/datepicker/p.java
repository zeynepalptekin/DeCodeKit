package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.h0;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes.dex */
final class p implements Comparable<p>, Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    @h0
    private final Calendar d;

    @h0
    private final String e;
    final int f;
    final int g;
    final int h;
    final int i;
    final long j;

    static class a implements Parcelable.Creator<p> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @h0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p createFromParcel(@h0 Parcel parcel) {
            return p.g(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @h0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public p[] newArray(int r1) {
            return new p[r1];
        }
    }

    private p(@h0 Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarF = y.f(calendar);
        this.d = calendarF;
        this.f = calendarF.get(2);
        this.g = this.d.get(1);
        this.h = this.d.getMaximum(7);
        this.i = this.d.getActualMaximum(5);
        this.e = y.z().format(this.d.getTime());
        this.j = this.d.getTimeInMillis();
    }

    @h0
    static p g(int r2, int r3) {
        Calendar calendarV = y.v();
        calendarV.set(1, r2);
        calendarV.set(2, r3);
        return new p(calendarV);
    }

    @h0
    static p i(long j) {
        Calendar calendarV = y.v();
        calendarV.setTimeInMillis(j);
        return new p(calendarV);
    }

    @h0
    static p j() {
        return new p(y.t());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(@h0 p pVar) {
        return this.d.compareTo(pVar.d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f == pVar.f && this.g == pVar.g;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.g)});
    }

    int k() {
        int firstDayOfWeek = this.d.get(7) - this.d.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.h : firstDayOfWeek;
    }

    long m(int r3) {
        Calendar calendarF = y.f(this.d);
        calendarF.set(5, r3);
        return calendarF.getTimeInMillis();
    }

    @h0
    String p() {
        return this.e;
    }

    long q() {
        return this.d.getTimeInMillis();
    }

    @h0
    p w(int r3) {
        Calendar calendarF = y.f(this.d);
        calendarF.add(2, r3);
        return new p(calendarF);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@h0 Parcel parcel, int r2) {
        parcel.writeInt(this.g);
        parcel.writeInt(this.f);
    }

    int y(@h0 p pVar) {
        if (this.d instanceof GregorianCalendar) {
            return ((pVar.g - this.g) * 12) + (pVar.f - this.f);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }
}

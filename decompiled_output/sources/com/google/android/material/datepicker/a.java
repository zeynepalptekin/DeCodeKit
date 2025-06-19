package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.h0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0196a();

    @h0
    private final p d;

    @h0
    private final p e;

    @h0
    private final p f;
    private final c g;
    private final int h;
    private final int i;

    /* renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    static class C0196a implements Parcelable.Creator<a> {
        C0196a() {
        }

        @Override // android.os.Parcelable.Creator
        @h0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(@h0 Parcel parcel) {
            return new a((p) parcel.readParcelable(p.class.getClassLoader()), (p) parcel.readParcelable(p.class.getClassLoader()), (p) parcel.readParcelable(p.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        @h0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int r1) {
            return new a[r1];
        }
    }

    public static final class b {
        static final long e = y.a(p.g(1900, 0).j);
        static final long f = y.a(p.g(2100, 11).j);
        private static final String g = "DEEP_COPY_VALIDATOR_KEY";

        /* renamed from: a, reason: collision with root package name */
        private long f6657a;

        /* renamed from: b, reason: collision with root package name */
        private long f6658b;

        /* renamed from: c, reason: collision with root package name */
        private Long f6659c;
        private c d;

        public b() {
            this.f6657a = e;
            this.f6658b = f;
            this.d = i.a(Long.MIN_VALUE);
        }

        b(@h0 a aVar) {
            this.f6657a = e;
            this.f6658b = f;
            this.d = i.a(Long.MIN_VALUE);
            this.f6657a = aVar.d.j;
            this.f6658b = aVar.e.j;
            this.f6659c = Long.valueOf(aVar.f.j);
            this.d = aVar.g;
        }

        @h0
        public a a() {
            if (this.f6659c == null) {
                long jI3 = l.i3();
                if (this.f6657a > jI3 || jI3 > this.f6658b) {
                    jI3 = this.f6657a;
                }
                this.f6659c = Long.valueOf(jI3);
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(g, this.d);
            return new a(p.i(this.f6657a), p.i(this.f6658b), p.i(this.f6659c.longValue()), (c) bundle.getParcelable(g), null);
        }

        @h0
        public b b(long j) {
            this.f6658b = j;
            return this;
        }

        @h0
        public b c(long j) {
            this.f6659c = Long.valueOf(j);
            return this;
        }

        @h0
        public b d(long j) {
            this.f6657a = j;
            return this;
        }

        @h0
        public b e(c cVar) {
            this.d = cVar;
            return this;
        }
    }

    public interface c extends Parcelable {
        boolean s(long j);
    }

    private a(@h0 p pVar, @h0 p pVar2, @h0 p pVar3, c cVar) {
        this.d = pVar;
        this.e = pVar2;
        this.f = pVar3;
        this.g = cVar;
        if (pVar.compareTo(pVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (pVar3.compareTo(pVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.i = pVar.y(pVar2) + 1;
        this.h = (pVar2.g - pVar.g) + 1;
    }

    /* synthetic */ a(p pVar, p pVar2, p pVar3, c cVar, C0196a c0196a) {
        this(pVar, pVar2, pVar3, cVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    p e(p pVar) {
        return pVar.compareTo(this.d) < 0 ? this.d : pVar.compareTo(this.e) > 0 ? this.e : pVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.d.equals(aVar.d) && this.e.equals(aVar.e) && this.f.equals(aVar.f) && this.g.equals(aVar.g);
    }

    public c f() {
        return this.g;
    }

    @h0
    p g() {
        return this.e;
    }

    int h() {
        return this.i;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e, this.f, this.g});
    }

    @h0
    p i() {
        return this.f;
    }

    @h0
    p j() {
        return this.d;
    }

    int k() {
        return this.h;
    }

    boolean l(long j) {
        if (this.d.m(1) <= j) {
            p pVar = this.e;
            if (j <= pVar.m(pVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r3) {
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.e, 0);
        parcel.writeParcelable(this.f, 0);
        parcel.writeParcelable(this.g, 0);
    }
}

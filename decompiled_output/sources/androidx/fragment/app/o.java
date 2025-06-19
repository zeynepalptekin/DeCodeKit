package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.h0;
import androidx.lifecycle.g;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();
    final String d;
    final String e;
    final boolean f;
    final int g;
    final int h;
    final String i;
    final boolean j;
    final boolean k;
    final boolean l;
    final Bundle m;
    final boolean n;
    final int o;
    Bundle p;
    Fragment q;

    static class a implements Parcelable.Creator<o> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o createFromParcel(Parcel parcel) {
            return new o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o[] newArray(int r1) {
            return new o[r1];
        }
    }

    o(Parcel parcel) {
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readInt() != 0;
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readString();
        this.j = parcel.readInt() != 0;
        this.k = parcel.readInt() != 0;
        this.l = parcel.readInt() != 0;
        this.m = parcel.readBundle();
        this.n = parcel.readInt() != 0;
        this.p = parcel.readBundle();
        this.o = parcel.readInt();
    }

    o(Fragment fragment) {
        this.d = fragment.getClass().getName();
        this.e = fragment.h;
        this.f = fragment.p;
        this.g = fragment.y;
        this.h = fragment.z;
        this.i = fragment.A;
        this.j = fragment.D;
        this.k = fragment.o;
        this.l = fragment.C;
        this.m = fragment.i;
        this.n = fragment.B;
        this.o = fragment.U.ordinal();
    }

    public Fragment a(@h0 ClassLoader classLoader, @h0 g gVar) {
        Fragment fragment;
        Bundle bundle;
        if (this.q == null) {
            Bundle bundle2 = this.m;
            if (bundle2 != null) {
                bundle2.setClassLoader(classLoader);
            }
            Fragment fragmentA = gVar.a(classLoader, this.d);
            this.q = fragmentA;
            fragmentA.N1(this.m);
            Bundle bundle3 = this.p;
            if (bundle3 != null) {
                bundle3.setClassLoader(classLoader);
                fragment = this.q;
                bundle = this.p;
            } else {
                fragment = this.q;
                bundle = new Bundle();
            }
            fragment.e = bundle;
            Fragment fragment2 = this.q;
            fragment2.h = this.e;
            fragment2.p = this.f;
            fragment2.r = true;
            fragment2.y = this.g;
            fragment2.z = this.h;
            fragment2.A = this.i;
            fragment2.D = this.j;
            fragment2.o = this.k;
            fragment2.C = this.l;
            fragment2.B = this.n;
            fragment2.U = g.b.values()[this.o];
            if (j.L) {
                Log.v("FragmentManager", "Instantiated fragment " + this.q);
            }
        }
        return this.q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @h0
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.d);
        sb.append(" (");
        sb.append(this.e);
        sb.append(")}:");
        if (this.f) {
            sb.append(" fromLayout");
        }
        if (this.h != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.h));
        }
        String str = this.i;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.i);
        }
        if (this.j) {
            sb.append(" retainInstance");
        }
        if (this.k) {
            sb.append(" removing");
        }
        if (this.l) {
            sb.append(" detached");
        }
        if (this.n) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r2) {
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeString(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeBundle(this.m);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeBundle(this.p);
        parcel.writeInt(this.o);
    }
}

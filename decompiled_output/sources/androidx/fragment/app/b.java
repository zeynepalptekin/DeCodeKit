package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.r;
import androidx.lifecycle.g;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    final int[] d;
    final ArrayList<String> e;
    final int[] f;
    final int[] g;
    final int h;
    final int i;
    final String j;
    final int k;
    final int l;
    final CharSequence m;
    final int n;
    final CharSequence o;
    final ArrayList<String> p;
    final ArrayList<String> q;
    final boolean r;

    static class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int r1) {
            return new b[r1];
        }
    }

    public b(Parcel parcel) {
        this.d = parcel.createIntArray();
        this.e = parcel.createStringArrayList();
        this.f = parcel.createIntArray();
        this.g = parcel.createIntArray();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = parcel.readString();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.n = parcel.readInt();
        this.o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.p = parcel.createStringArrayList();
        this.q = parcel.createStringArrayList();
        this.r = parcel.readInt() != 0;
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f462a.size();
        this.d = new int[size * 5];
        if (!aVar.h) {
            throw new IllegalStateException("Not on back stack");
        }
        this.e = new ArrayList<>(size);
        this.f = new int[size];
        this.g = new int[size];
        int r1 = 0;
        int r2 = 0;
        while (r1 < size) {
            r.a aVar2 = aVar.f462a.get(r1);
            int r5 = r2 + 1;
            this.d[r2] = aVar2.f465a;
            ArrayList<String> arrayList = this.e;
            Fragment fragment = aVar2.f466b;
            arrayList.add(fragment != null ? fragment.h : null);
            int[] r22 = this.d;
            int r4 = r5 + 1;
            r22[r5] = aVar2.f467c;
            int r52 = r4 + 1;
            r22[r4] = aVar2.d;
            int r42 = r52 + 1;
            r22[r52] = aVar2.e;
            r22[r42] = aVar2.f;
            this.f[r1] = aVar2.g.ordinal();
            this.g[r1] = aVar2.h.ordinal();
            r1++;
            r2 = r42 + 1;
        }
        this.h = aVar.f;
        this.i = aVar.g;
        this.j = aVar.j;
        this.k = aVar.M;
        this.l = aVar.k;
        this.m = aVar.l;
        this.n = aVar.m;
        this.o = aVar.n;
        this.p = aVar.o;
        this.q = aVar.p;
        this.r = aVar.q;
    }

    public androidx.fragment.app.a a(j jVar) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(jVar);
        int r1 = 0;
        int r2 = 0;
        while (r1 < this.d.length) {
            r.a aVar2 = new r.a();
            int r5 = r1 + 1;
            aVar2.f465a = this.d[r1];
            if (j.L) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + r2 + " base fragment #" + this.d[r5]);
            }
            String str = this.e.get(r2);
            aVar2.f466b = str != null ? jVar.k.get(str) : null;
            aVar2.g = g.b.values()[this.f[r2]];
            aVar2.h = g.b.values()[this.g[r2]];
            int[] r12 = this.d;
            int r4 = r5 + 1;
            int r52 = r12[r5];
            aVar2.f467c = r52;
            int r6 = r4 + 1;
            int r42 = r12[r4];
            aVar2.d = r42;
            int r7 = r6 + 1;
            int r62 = r12[r6];
            aVar2.e = r62;
            int r13 = r12[r7];
            aVar2.f = r13;
            aVar.f463b = r52;
            aVar.f464c = r42;
            aVar.d = r62;
            aVar.e = r13;
            aVar.j(aVar2);
            r2++;
            r1 = r7 + 1;
        }
        aVar.f = this.h;
        aVar.g = this.i;
        aVar.j = this.j;
        aVar.M = this.k;
        aVar.h = true;
        aVar.k = this.l;
        aVar.l = this.m;
        aVar.m = this.n;
        aVar.n = this.o;
        aVar.o = this.p;
        aVar.p = this.q;
        aVar.q = this.r;
        aVar.P(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r3) {
        parcel.writeIntArray(this.d);
        parcel.writeStringList(this.e);
        parcel.writeIntArray(this.f);
        parcel.writeIntArray(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeString(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        TextUtils.writeToParcel(this.m, parcel, 0);
        parcel.writeInt(this.n);
        TextUtils.writeToParcel(this.o, parcel, 0);
        parcel.writeStringList(this.p);
        parcel.writeStringList(this.q);
        parcel.writeInt(this.r ? 1 : 0);
    }
}

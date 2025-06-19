package c.a.b.c.d;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.s;
import com.google.android.material.internal.k;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class d implements n {
    private g d;
    private c e;
    private boolean f = false;
    private int g;

    static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0136a();
        int d;

        @i0
        k e;

        /* renamed from: c.a.b.c.d.d$a$a, reason: collision with other inner class name */
        static class C0136a implements Parcelable.Creator<a> {
            C0136a() {
            }

            @Override // android.os.Parcelable.Creator
            @h0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(@h0 Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @h0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int r1) {
                return new a[r1];
            }
        }

        a() {
        }

        a(@h0 Parcel parcel) {
            this.d = parcel.readInt();
            this.e = (k) parcel.readParcelable(a.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@h0 Parcel parcel, int r3) {
            parcel.writeInt(this.d);
            parcel.writeParcelable(this.e, 0);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public int J() {
        return this.g;
    }

    @Override // androidx.appcompat.view.menu.n
    public void K(Context context, g gVar) {
        this.d = gVar;
        this.e.c(gVar);
    }

    @Override // androidx.appcompat.view.menu.n
    public void L(Parcelable parcelable) {
        if (parcelable instanceof a) {
            a aVar = (a) parcelable;
            this.e.n(aVar.d);
            this.e.setBadgeDrawables(c.a.b.c.c.b.b(this.e.getContext(), aVar.e));
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean M(s sVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public void N(boolean z) {
        if (this.f) {
            return;
        }
        if (z) {
            this.e.d();
        } else {
            this.e.o();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public o O(ViewGroup viewGroup) {
        return this.e;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean P() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    @h0
    public Parcelable Q() {
        a aVar = new a();
        aVar.d = this.e.getSelectedItemId();
        aVar.e = c.a.b.c.c.b.c(this.e.getBadgeDrawables());
        return aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean R(g gVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean S(g gVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public void T(n.a aVar) {
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(g gVar, boolean z) {
    }

    public void b(c cVar) {
        this.e = cVar;
    }

    public void c(int r1) {
        this.g = r1;
    }

    public void d(boolean z) {
        this.f = z;
    }
}

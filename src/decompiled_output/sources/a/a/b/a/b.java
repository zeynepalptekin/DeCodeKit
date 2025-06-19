package a.a.b.a;

import a.a.b.a.a;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.p0;

@SuppressLint({"BanParcelableUsage"})
@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    final boolean d;
    final Handler e;
    a.a.b.a.a f;

    class a implements Parcelable.Creator<b> {
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

    /* renamed from: a.a.b.a.b$b, reason: collision with other inner class name */
    class BinderC0006b extends a.b {
        BinderC0006b() {
        }

        @Override // a.a.b.a.a
        public void n8(int r4, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.e;
            if (handler != null) {
                handler.post(bVar.new c(r4, bundle));
            } else {
                bVar.a(r4, bundle);
            }
        }
    }

    class c implements Runnable {
        final int d;
        final Bundle e;

        c(int r2, Bundle bundle) {
            this.d = r2;
            this.e = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.d, this.e);
        }
    }

    public b(Handler handler) {
        this.d = true;
        this.e = handler;
    }

    b(Parcel parcel) {
        this.d = false;
        this.e = null;
        this.f = a.b.L0(parcel.readStrongBinder());
    }

    protected void a(int r1, Bundle bundle) {
    }

    public void b(int r3, Bundle bundle) {
        if (this.d) {
            Handler handler = this.e;
            if (handler != null) {
                handler.post(new c(r3, bundle));
                return;
            } else {
                a(r3, bundle);
                return;
            }
        }
        a.a.b.a.a aVar = this.f;
        if (aVar != null) {
            try {
                aVar.n8(r3, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r2) {
        synchronized (this) {
            if (this.f == null) {
                this.f = new BinderC0006b();
            }
            parcel.writeStrongBinder(this.f.asBinder());
        }
    }
}

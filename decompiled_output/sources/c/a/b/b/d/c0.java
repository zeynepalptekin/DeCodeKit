package c.a.b.b.d;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.o0;
import com.google.android.gms.common.internal.z.d;
import javax.annotation.Nullable;

@d.a(creator = "GoogleCertificatesQueryCreator")
/* loaded from: classes.dex */
public final class c0 extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<c0> CREATOR = new f0();

    @d.c(getter = "getCallingPackage", id = 1)
    private final String d;

    @d.c(getter = "getCallingCertificateBinder", id = 2, type = "android.os.IBinder")
    @Nullable
    private final w e;

    @d.c(getter = "getAllowTestKeys", id = 3)
    private final boolean f;

    @d.c(defaultValue = "false", getter = "getIgnoreTestKeysOverride", id = 4)
    private final boolean g;

    @d.b
    c0(@d.e(id = 1) String str, @Nullable @d.e(id = 2) IBinder iBinder, @d.e(id = 3) boolean z, @d.e(id = 4) boolean z2) {
        this.d = str;
        this.e = h(iBinder);
        this.f = z;
        this.g = z2;
    }

    c0(String str, @Nullable w wVar, boolean z, boolean z2) {
        this.d = str;
        this.e = wVar;
        this.f = z;
        this.g = z2;
    }

    @Nullable
    private static w h(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        try {
            c.a.b.b.e.c cVarB = o0.b2(iBinder).b();
            byte[] bArr = cVarB == null ? null : (byte[]) c.a.b.b.e.e.e2(cVarB);
            if (bArr != null) {
                return new z(bArr);
            }
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
            return null;
        } catch (RemoteException e) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        IBinder iBinderAsBinder;
        int r52 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.X(parcel, 1, this.d, false);
        w wVar = this.e;
        if (wVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = wVar.asBinder();
        }
        com.google.android.gms.common.internal.z.c.B(parcel, 2, iBinderAsBinder, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 3, this.f);
        com.google.android.gms.common.internal.z.c.g(parcel, 4, this.g);
        com.google.android.gms.common.internal.z.c.b(parcel, r52);
    }
}

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public final class BinderWrapper implements Parcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new a0();
    private IBinder d;

    @com.google.android.gms.common.annotation.a
    public BinderWrapper(@RecentlyNonNull IBinder iBinder) {
        this.d = iBinder;
    }

    private BinderWrapper(Parcel parcel) {
        this.d = parcel.readStrongBinder();
    }

    /* synthetic */ BinderWrapper(Parcel parcel, a0 a0Var) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    @RecentlyNonNull
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r2) {
        parcel.writeStrongBinder(this.d);
    }
}

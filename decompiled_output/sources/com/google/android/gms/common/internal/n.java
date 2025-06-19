package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public interface n extends IInterface {

    public static abstract class a extends Binder implements n {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.google.android.gms.common.internal.n$a$a, reason: collision with other inner class name */
        static class C0169a implements n {
            private final IBinder d;

            C0169a(IBinder iBinder) {
                this.d = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.d;
            }

            @Override // com.google.android.gms.common.internal.n
            public final void p4(m mVar, @androidx.annotation.i0 g gVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    parcelObtain.writeStrongBinder(mVar != null ? mVar.asBinder() : null);
                    if (gVar != null) {
                        parcelObtain.writeInt(1);
                        gVar.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.d.transact(46, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
        }

        @Override // android.os.IInterface
        @RecentlyNonNull
        @com.google.android.gms.common.annotation.a
        public IBinder asBinder() {
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00e7  */
        @Override // android.os.Binder
        @androidx.annotation.RecentlyNonNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onTransact(@androidx.annotation.RecentlyNonNull int r4, @androidx.annotation.RecentlyNonNull android.os.Parcel r5, @androidx.annotation.i0 android.os.Parcel r6, @androidx.annotation.RecentlyNonNull int r7) throws android.os.RemoteException {
            /*
                Method dump skipped, instructions count: 282
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.n.a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    @com.google.android.gms.common.annotation.a
    void p4(@RecentlyNonNull m mVar, @androidx.annotation.i0 g gVar) throws RemoteException;
}

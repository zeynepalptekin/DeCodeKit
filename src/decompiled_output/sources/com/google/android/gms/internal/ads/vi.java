package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@d.f({1})
@d.a(creator = "LargeParcelTeleporterCreator")
/* loaded from: classes.dex */
public final class vi extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<vi> CREATOR = new xi();

    @d.c(id = 2)
    private ParcelFileDescriptor d;
    private Parcelable e = null;
    private boolean f = true;

    @d.b
    public vi(@d.e(id = 2) ParcelFileDescriptor parcelFileDescriptor) {
        this.d = parcelFileDescriptor;
    }

    static final /* synthetic */ void i(OutputStream outputStream, byte[] bArr) throws Throwable {
        DataOutputStream dataOutputStream;
        DataOutputStream dataOutputStream2 = null;
        try {
            try {
                dataOutputStream = new DataOutputStream(outputStream);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
            com.google.android.gms.common.util.q.b(dataOutputStream);
        } catch (IOException e2) {
            e = e2;
            dataOutputStream2 = dataOutputStream;
            tr.c("Error transporting the ad response", e);
            com.google.android.gms.ads.internal.p.g().e(e, "LargeParcelTeleporter.pipeData.1");
            if (dataOutputStream2 == null) {
                com.google.android.gms.common.util.q.b(outputStream);
            } else {
                com.google.android.gms.common.util.q.b(dataOutputStream2);
            }
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream2 = dataOutputStream;
            if (dataOutputStream2 == null) {
                com.google.android.gms.common.util.q.b(outputStream);
            } else {
                com.google.android.gms.common.util.q.b(dataOutputStream2);
            }
            throw th;
        }
    }

    private static <T> ParcelFileDescriptor j(final byte[] bArr) throws IOException {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe;
        try {
            parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
        } catch (IOException e) {
            e = e;
            autoCloseOutputStream = null;
        }
        try {
            cs.f3023a.execute(new Runnable(autoCloseOutputStream, bArr) { // from class: com.google.android.gms.internal.ads.ui
                private final OutputStream d;
                private final byte[] e;

                {
                    this.d = autoCloseOutputStream;
                    this.e = bArr;
                }

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    vi.i(this.d, this.e);
                }
            });
            return parcelFileDescriptorArrCreatePipe[0];
        } catch (IOException e2) {
            e = e2;
            tr.c("Error transporting the ad response", e);
            com.google.android.gms.ads.internal.p.g().e(e, "LargeParcelTeleporter.pipeData.2");
            com.google.android.gms.common.util.q.b(autoCloseOutputStream);
            return null;
        }
    }

    private final ParcelFileDescriptor l() {
        if (this.d == null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                this.e.writeToParcel(parcelObtain, 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                this.d = j(bArrMarshall);
            } catch (Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        return this.d;
    }

    public final <T extends com.google.android.gms.common.internal.z.d> T h(Parcelable.Creator<T> creator) {
        if (this.f) {
            if (this.d == null) {
                tr.g("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.d));
            try {
                try {
                    int r2 = dataInputStream.readInt();
                    byte[] bArr = new byte[r2];
                    dataInputStream.readFully(bArr, 0, r2);
                    com.google.android.gms.common.util.q.b(dataInputStream);
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.unmarshall(bArr, 0, r2);
                        parcelObtain.setDataPosition(0);
                        this.e = creator.createFromParcel(parcelObtain);
                        parcelObtain.recycle();
                        this.f = false;
                    } catch (Throwable th) {
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (IOException e) {
                    tr.c("Could not read from parcel file descriptor", e);
                    com.google.android.gms.common.util.q.b(dataInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                com.google.android.gms.common.util.q.b(dataInputStream);
                throw th2;
            }
        }
        return (T) this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        l();
        int r0 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.S(parcel, 2, this.d, r6, false);
        com.google.android.gms.common.internal.z.c.b(parcel, r0);
    }
}

package b.i.k;

import android.os.Parcel;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public final class l {
    private l() {
    }

    public static boolean a(@h0 Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void b(@h0 Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }
}

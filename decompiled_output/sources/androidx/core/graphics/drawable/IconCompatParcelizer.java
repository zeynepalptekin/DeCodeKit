package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.annotation.p0;

@p0({p0.a.LIBRARY})
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(androidx.versionedparcelable.e eVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f385a = eVar.M(iconCompat.f385a, 1);
        iconCompat.f387c = eVar.t(iconCompat.f387c, 2);
        iconCompat.d = eVar.W(iconCompat.d, 3);
        iconCompat.e = eVar.M(iconCompat.e, 4);
        iconCompat.f = eVar.M(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) eVar.W(iconCompat.g, 6);
        iconCompat.i = eVar.d0(iconCompat.i, 7);
        iconCompat.a();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, androidx.versionedparcelable.e eVar) {
        eVar.j0(true, true);
        iconCompat.b(eVar.i());
        int r1 = iconCompat.f385a;
        if (-1 != r1) {
            eVar.M0(r1, 1);
        }
        byte[] bArr = iconCompat.f387c;
        if (bArr != null) {
            eVar.u0(bArr, 2);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            eVar.X0(parcelable, 3);
        }
        int r0 = iconCompat.e;
        if (r0 != 0) {
            eVar.M0(r0, 4);
        }
        int r02 = iconCompat.f;
        if (r02 != 0) {
            eVar.M0(r02, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            eVar.X0(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            eVar.f1(str, 7);
        }
    }
}

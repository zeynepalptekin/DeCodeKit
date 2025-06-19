package b.i.e;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.h0;
import androidx.annotation.m0;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public final class j {
    private j() {
    }

    @m0(26)
    @h0
    public static Collection<i> a(@h0 Path path) {
        return b(path, 0.5f);
    }

    @m0(26)
    @h0
    public static Collection<i> b(@h0 Path path, @androidx.annotation.r(from = 0.0d) float f) {
        float[] fArrApproximate = path.approximate(f);
        int length = fArrApproximate.length / 3;
        ArrayList arrayList = new ArrayList(length);
        for (int r1 = 1; r1 < length; r1++) {
            int r2 = r1 * 3;
            int r3 = (r1 - 1) * 3;
            float f2 = fArrApproximate[r2];
            float f3 = fArrApproximate[r2 + 1];
            float f4 = fArrApproximate[r2 + 2];
            float f5 = fArrApproximate[r3];
            float f6 = fArrApproximate[r3 + 1];
            float f7 = fArrApproximate[r3 + 2];
            if (f2 != f5 && (f3 != f6 || f4 != f7)) {
                arrayList.add(new i(new PointF(f6, f7), f5, new PointF(f3, f4), f2));
            }
        }
        return arrayList;
    }
}

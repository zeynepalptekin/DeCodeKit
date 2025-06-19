package b.i.e;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.annotation.h0;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public class b {
    private b() {
    }

    @i0
    public static ColorFilter a(int r3, @h0 c cVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            BlendMode blendModeA = d.a(cVar);
            if (blendModeA != null) {
                return new BlendModeColorFilter(r3, blendModeA);
            }
            return null;
        }
        PorterDuff.Mode modeB = d.b(cVar);
        if (modeB != null) {
            return new PorterDuffColorFilter(r3, modeB);
        }
        return null;
    }
}

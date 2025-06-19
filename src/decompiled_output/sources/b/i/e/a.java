package b.i.e;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public final class a {
    private a() {
    }

    public static int a(@h0 Bitmap bitmap) {
        return Build.VERSION.SDK_INT >= 19 ? bitmap.getAllocationByteCount() : bitmap.getByteCount();
    }

    public static boolean b(@h0 Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 18) {
            return bitmap.hasMipMap();
        }
        return false;
    }

    public static void c(@h0 Bitmap bitmap, boolean z) {
        if (Build.VERSION.SDK_INT >= 18) {
            bitmap.setHasMipMap(z);
        }
    }
}

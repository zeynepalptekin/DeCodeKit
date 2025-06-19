package c.a.b.c.e;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class a {
    private a() {
    }

    public static int a(@h0 Canvas canvas, float f, float f2, float f3, float f4, int r12) {
        return Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f, f2, f3, f4, r12) : canvas.saveLayerAlpha(f, f2, f3, f4, r12, 31);
    }

    public static int b(@h0 Canvas canvas, @i0 RectF rectF, int r4) {
        return Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(rectF, r4) : canvas.saveLayerAlpha(rectF, r4, 31);
    }
}

package b.e.b;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.m0;
import b.e.b.h;

@m0(17)
/* loaded from: classes.dex */
class b extends d {

    class a implements h.a {
        a() {
        }

        @Override // b.e.b.h.a
        public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    b() {
    }

    @Override // b.e.b.d, b.e.b.f
    public void g() {
        h.s = new a();
    }
}

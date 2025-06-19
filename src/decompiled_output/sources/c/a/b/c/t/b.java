package c.a.b.c.t;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import b.i.e.e;
import b.i.p.f0;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class b {
    private static final int i = 68;
    private static final int j = 20;
    private static final int k = 0;
    private static final int[] l = new int[3];
    private static final float[] m = {0.0f, 0.5f, 1.0f};
    private static final int[] n = new int[4];
    private static final float[] o = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    @h0
    private final Paint f2002a;

    /* renamed from: b, reason: collision with root package name */
    @h0
    private final Paint f2003b;

    /* renamed from: c, reason: collision with root package name */
    @h0
    private final Paint f2004c;
    private int d;
    private int e;
    private int f;
    private final Path g;
    private Paint h;

    public b() {
        this(f0.t);
    }

    public b(int r2) {
        this.g = new Path();
        this.h = new Paint();
        this.f2002a = new Paint();
        d(r2);
        this.h.setColor(0);
        Paint paint = new Paint(4);
        this.f2003b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f2004c = new Paint(this.f2003b);
    }

    public void a(@h0 Canvas canvas, @i0 Matrix matrix, @h0 RectF rectF, int r24, float f, float f2) {
        boolean z = f2 < 0.0f;
        Path path = this.g;
        if (z) {
            int[] r12 = n;
            r12[0] = 0;
            r12[1] = this.f;
            r12[2] = this.e;
            r12[3] = this.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -r24;
            rectF.inset(f3, f3);
            int[] r13 = n;
            r13[0] = 0;
            r13[1] = this.d;
            r13[2] = this.e;
            r13[3] = this.f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (r24 / fWidth);
        float[] fArr = o;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        this.f2003b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, n, o, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.h);
        }
        canvas.drawArc(rectF, f, f2, true, this.f2003b);
        canvas.restore();
    }

    public void b(@h0 Canvas canvas, @i0 Matrix matrix, @h0 RectF rectF, int r13) {
        rectF.bottom += r13;
        rectF.offset(0.0f, -r13);
        int[] r132 = l;
        r132[0] = this.f;
        r132[1] = this.e;
        r132[2] = this.d;
        Paint paint = this.f2004c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, l, m, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f2004c);
        canvas.restore();
    }

    @h0
    public Paint c() {
        return this.f2002a;
    }

    public void d(int r2) {
        this.d = e.B(r2, 68);
        this.e = e.B(r2, 20);
        this.f = e.B(r2, 0);
        this.f2002a.setColor(this.d);
    }
}

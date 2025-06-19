package c.a.b.c.h;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import b.i.p.f0;
import c.a.b.c.h.g;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class d {
    private static final boolean k = false;
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 2;
    public static final int o;

    /* renamed from: a, reason: collision with root package name */
    private final a f1962a;

    /* renamed from: b, reason: collision with root package name */
    @h0
    private final View f1963b;

    /* renamed from: c, reason: collision with root package name */
    @h0
    private final Path f1964c;

    @h0
    private final Paint d;

    @h0
    private final Paint e;

    @i0
    private g.e f;

    @i0
    private Drawable g;
    private Paint h;
    private boolean i;
    private boolean j;

    public interface a {
        void b(Canvas canvas);

        boolean d();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    static {
        int r0 = Build.VERSION.SDK_INT;
        o = r0 >= 21 ? 2 : r0 >= 18 ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(a aVar) {
        this.f1962a = aVar;
        View view = (View) aVar;
        this.f1963b = view;
        view.setWillNotDraw(false);
        this.f1964c = new Path();
        this.d = new Paint(7);
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setColor(0);
    }

    private void d(@h0 Canvas canvas, int r5, float f) {
        this.h.setColor(r5);
        this.h.setStrokeWidth(f);
        g.e eVar = this.f;
        canvas.drawCircle(eVar.f1969a, eVar.f1970b, eVar.f1971c - (f / 2.0f), this.h);
    }

    private void e(@h0 Canvas canvas) {
        this.f1962a.b(canvas);
        if (r()) {
            g.e eVar = this.f;
            canvas.drawCircle(eVar.f1969a, eVar.f1970b, eVar.f1971c, this.e);
        }
        if (p()) {
            d(canvas, f0.t, 10.0f);
            d(canvas, b.i.g.b.a.f1048c, 5.0f);
        }
        f(canvas);
    }

    private void f(@h0 Canvas canvas) {
        if (q()) {
            Rect bounds = this.g.getBounds();
            float fWidth = this.f.f1969a - (bounds.width() / 2.0f);
            float fHeight = this.f.f1970b - (bounds.height() / 2.0f);
            canvas.translate(fWidth, fHeight);
            this.g.draw(canvas);
            canvas.translate(-fWidth, -fHeight);
        }
    }

    private float i(@h0 g.e eVar) {
        return c.a.b.c.o.a.b(eVar.f1969a, eVar.f1970b, 0.0f, 0.0f, this.f1963b.getWidth(), this.f1963b.getHeight());
    }

    private void k() {
        if (o == 1) {
            this.f1964c.rewind();
            g.e eVar = this.f;
            if (eVar != null) {
                this.f1964c.addCircle(eVar.f1969a, eVar.f1970b, eVar.f1971c, Path.Direction.CW);
            }
        }
        this.f1963b.invalidate();
    }

    private boolean p() {
        g.e eVar = this.f;
        boolean z = eVar == null || eVar.a();
        return o == 0 ? !z && this.j : !z;
    }

    private boolean q() {
        return (this.i || this.g == null || this.f == null) ? false : true;
    }

    private boolean r() {
        return (this.i || Color.alpha(this.e.getColor()) == 0) ? false : true;
    }

    public void a() {
        if (o == 0) {
            this.i = true;
            this.j = false;
            this.f1963b.buildDrawingCache();
            Bitmap drawingCache = this.f1963b.getDrawingCache();
            if (drawingCache == null && this.f1963b.getWidth() != 0 && this.f1963b.getHeight() != 0) {
                drawingCache = Bitmap.createBitmap(this.f1963b.getWidth(), this.f1963b.getHeight(), Bitmap.Config.ARGB_8888);
                this.f1963b.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.i = false;
            this.j = true;
        }
    }

    public void b() {
        if (o == 0) {
            this.j = false;
            this.f1963b.destroyDrawingCache();
            this.d.setShader(null);
            this.f1963b.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(@androidx.annotation.h0 android.graphics.Canvas r9) {
        /*
            r8 = this;
            boolean r0 = r8.p()
            if (r0 == 0) goto L84
            int r0 = c.a.b.c.h.d.o
            if (r0 == 0) goto L63
            r1 = 1
            if (r0 == r1) goto L35
            r1 = 2
            if (r0 != r1) goto L1c
            c.a.b.c.h.d$a r0 = r8.f1962a
            r0.b(r9)
            boolean r0 = r8.r()
            if (r0 == 0) goto La5
            goto L8f
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported strategy "
            r0.append(r1)
            int r1 = c.a.b.c.h.d.o
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L35:
            int r0 = r9.save()
            android.graphics.Path r1 = r8.f1964c
            r9.clipPath(r1)
            c.a.b.c.h.d$a r1 = r8.f1962a
            r1.b(r9)
            boolean r1 = r8.r()
            if (r1 == 0) goto L5f
            r3 = 0
            r4 = 0
            android.view.View r1 = r8.f1963b
            int r1 = r1.getWidth()
            float r5 = (float) r1
            android.view.View r1 = r8.f1963b
            int r1 = r1.getHeight()
            float r6 = (float) r1
            android.graphics.Paint r7 = r8.e
            r2 = r9
            r2.drawRect(r3, r4, r5, r6, r7)
        L5f:
            r9.restoreToCount(r0)
            goto La5
        L63:
            c.a.b.c.h.g$e r0 = r8.f
            float r1 = r0.f1969a
            float r2 = r0.f1970b
            float r0 = r0.f1971c
            android.graphics.Paint r3 = r8.d
            r9.drawCircle(r1, r2, r0, r3)
            boolean r0 = r8.r()
            if (r0 == 0) goto La5
            c.a.b.c.h.g$e r0 = r8.f
            float r1 = r0.f1969a
            float r2 = r0.f1970b
            float r0 = r0.f1971c
            android.graphics.Paint r3 = r8.e
            r9.drawCircle(r1, r2, r0, r3)
            goto La5
        L84:
            c.a.b.c.h.d$a r0 = r8.f1962a
            r0.b(r9)
            boolean r0 = r8.r()
            if (r0 == 0) goto La5
        L8f:
            r2 = 0
            r3 = 0
            android.view.View r0 = r8.f1963b
            int r0 = r0.getWidth()
            float r4 = (float) r0
            android.view.View r0 = r8.f1963b
            int r0 = r0.getHeight()
            float r5 = (float) r0
            android.graphics.Paint r6 = r8.e
            r1 = r9
            r1.drawRect(r2, r3, r4, r5, r6)
        La5:
            r8.f(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.c.h.d.c(android.graphics.Canvas):void");
    }

    @i0
    public Drawable g() {
        return this.g;
    }

    @k
    public int h() {
        return this.e.getColor();
    }

    @i0
    public g.e j() {
        g.e eVar = this.f;
        if (eVar == null) {
            return null;
        }
        g.e eVar2 = new g.e(eVar);
        if (eVar2.a()) {
            eVar2.f1971c = i(eVar2);
        }
        return eVar2;
    }

    public boolean l() {
        return this.f1962a.d() && !p();
    }

    public void m(@i0 Drawable drawable) {
        this.g = drawable;
        this.f1963b.invalidate();
    }

    public void n(@k int r2) {
        this.e.setColor(r2);
        this.f1963b.invalidate();
    }

    public void o(@i0 g.e eVar) {
        if (eVar == null) {
            this.f = null;
        } else {
            g.e eVar2 = this.f;
            if (eVar2 == null) {
                this.f = new g.e(eVar);
            } else {
                eVar2.c(eVar);
            }
            if (c.a.b.c.o.a.e(eVar.f1971c, i(eVar), 1.0E-4f)) {
                this.f.f1971c = Float.MAX_VALUE;
            }
        }
        k();
    }
}

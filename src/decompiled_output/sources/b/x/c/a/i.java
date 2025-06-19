package b.x.c.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import androidx.annotation.m0;
import androidx.annotation.p0;
import androidx.annotation.q;
import b.i.e.h;
import b.i.p.f0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class i extends b.x.c.a.h {
    private static final boolean A = false;
    static final String n = "VectorDrawableCompat";
    static final PorterDuff.Mode o = PorterDuff.Mode.SRC_IN;
    private static final String p = "clip-path";
    private static final String q = "group";
    private static final String r = "path";
    private static final String s = "vector";
    private static final int t = 0;
    private static final int u = 1;
    private static final int v = 2;
    private static final int w = 0;
    private static final int x = 1;
    private static final int y = 2;
    private static final int z = 2048;
    private h e;
    private PorterDuffColorFilter f;
    private ColorFilter g;
    private boolean h;
    private boolean i;
    private Drawable.ConstantState j;
    private final float[] k;
    private final Matrix l;
    private final Rect m;

    private static class b extends f {
        b() {
        }

        b(b bVar) {
            super(bVar);
        }

        private void j(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f1546b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f1545a = b.i.e.h.d(string2);
            }
            this.f1547c = b.i.c.j.h.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // b.x.c.a.i.f
        public boolean e() {
            return true;
        }

        public void i(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (b.i.c.j.h.r(xmlPullParser, "pathData")) {
                TypedArray typedArrayS = b.i.c.j.h.s(resources, theme, attributeSet, b.x.c.a.a.I);
                j(typedArrayS, xmlPullParser);
                typedArrayS.recycle();
            }
        }
    }

    private static class c extends f {
        private int[] f;
        b.i.c.j.b g;
        float h;
        b.i.c.j.b i;
        float j;
        float k;
        float l;
        float m;
        float n;
        Paint.Cap o;
        Paint.Join p;
        float q;

        c() {
            this.h = 0.0f;
            this.j = 1.0f;
            this.k = 1.0f;
            this.l = 0.0f;
            this.m = 1.0f;
            this.n = 0.0f;
            this.o = Paint.Cap.BUTT;
            this.p = Paint.Join.MITER;
            this.q = 4.0f;
        }

        c(c cVar) {
            super(cVar);
            this.h = 0.0f;
            this.j = 1.0f;
            this.k = 1.0f;
            this.l = 0.0f;
            this.m = 1.0f;
            this.n = 0.0f;
            this.o = Paint.Cap.BUTT;
            this.p = Paint.Join.MITER;
            this.q = 4.0f;
            this.f = cVar.f;
            this.g = cVar.g;
            this.h = cVar.h;
            this.j = cVar.j;
            this.i = cVar.i;
            this.f1547c = cVar.f1547c;
            this.k = cVar.k;
            this.l = cVar.l;
            this.m = cVar.m;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
            this.q = cVar.q;
        }

        private Paint.Cap i(int r2, Paint.Cap cap) {
            return r2 != 0 ? r2 != 1 ? r2 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join j(int r2, Paint.Join join) {
            return r2 != 0 ? r2 != 1 ? r2 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void l(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f = null;
            if (b.i.c.j.h.r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f1546b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f1545a = b.i.e.h.d(string2);
                }
                this.i = b.i.c.j.h.i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.k = b.i.c.j.h.j(typedArray, xmlPullParser, "fillAlpha", 12, this.k);
                this.o = i(b.i.c.j.h.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.o);
                this.p = j(b.i.c.j.h.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.p);
                this.q = b.i.c.j.h.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.q);
                this.g = b.i.c.j.h.i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.j = b.i.c.j.h.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.j);
                this.h = b.i.c.j.h.j(typedArray, xmlPullParser, "strokeWidth", 4, this.h);
                this.m = b.i.c.j.h.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.m);
                this.n = b.i.c.j.h.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.n);
                this.l = b.i.c.j.h.j(typedArray, xmlPullParser, "trimPathStart", 5, this.l);
                this.f1547c = b.i.c.j.h.k(typedArray, xmlPullParser, "fillType", 13, this.f1547c);
            }
        }

        @Override // b.x.c.a.i.e
        public boolean a() {
            return this.i.i() || this.g.i();
        }

        @Override // b.x.c.a.i.e
        public boolean b(int[] r3) {
            return this.g.j(r3) | this.i.j(r3);
        }

        @Override // b.x.c.a.i.f
        public void c(Resources.Theme theme) {
            int[] r1 = this.f;
        }

        @Override // b.x.c.a.i.f
        public boolean d() {
            return this.f != null;
        }

        float getFillAlpha() {
            return this.k;
        }

        @k
        int getFillColor() {
            return this.i.e();
        }

        float getStrokeAlpha() {
            return this.j;
        }

        @k
        int getStrokeColor() {
            return this.g.e();
        }

        float getStrokeWidth() {
            return this.h;
        }

        float getTrimPathEnd() {
            return this.m;
        }

        float getTrimPathOffset() {
            return this.n;
        }

        float getTrimPathStart() {
            return this.l;
        }

        public void k(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayS = b.i.c.j.h.s(resources, theme, attributeSet, b.x.c.a.a.t);
            l(typedArrayS, xmlPullParser, theme);
            typedArrayS.recycle();
        }

        void setFillAlpha(float f) {
            this.k = f;
        }

        void setFillColor(int r2) {
            this.i.k(r2);
        }

        void setStrokeAlpha(float f) {
            this.j = f;
        }

        void setStrokeColor(int r2) {
            this.g.k(r2);
        }

        void setStrokeWidth(float f) {
            this.h = f;
        }

        void setTrimPathEnd(float f) {
            this.m = f;
        }

        void setTrimPathOffset(float f) {
            this.n = f;
        }

        void setTrimPathStart(float f) {
            this.l = f;
        }
    }

    private static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        final Matrix f1542a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<e> f1543b;

        /* renamed from: c, reason: collision with root package name */
        float f1544c;
        private float d;
        private float e;
        private float f;
        private float g;
        private float h;
        private float i;
        final Matrix j;
        int k;
        private int[] l;
        private String m;

        public d() {
            super();
            this.f1542a = new Matrix();
            this.f1543b = new ArrayList<>();
            this.f1544c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.m = null;
        }

        public d(d dVar, b.f.a<String, Object> aVar) {
            f bVar;
            super();
            this.f1542a = new Matrix();
            this.f1543b = new ArrayList<>();
            this.f1544c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.m = null;
            this.f1544c = dVar.f1544c;
            this.d = dVar.d;
            this.e = dVar.e;
            this.f = dVar.f;
            this.g = dVar.g;
            this.h = dVar.h;
            this.i = dVar.i;
            this.l = dVar.l;
            String str = dVar.m;
            this.m = str;
            this.k = dVar.k;
            if (str != null) {
                aVar.put(str, this);
            }
            this.j.set(dVar.j);
            ArrayList<e> arrayList = dVar.f1543b;
            for (int r0 = 0; r0 < arrayList.size(); r0++) {
                e eVar = arrayList.get(r0);
                if (eVar instanceof d) {
                    this.f1543b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f1543b.add(bVar);
                    String str2 = bVar.f1546b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.j.reset();
            this.j.postTranslate(-this.d, -this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.f1544c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.d, this.i + this.e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.l = null;
            this.f1544c = b.i.c.j.h.j(typedArray, xmlPullParser, "rotation", 5, this.f1544c);
            this.d = typedArray.getFloat(1, this.d);
            this.e = typedArray.getFloat(2, this.e);
            this.f = b.i.c.j.h.j(typedArray, xmlPullParser, "scaleX", 3, this.f);
            this.g = b.i.c.j.h.j(typedArray, xmlPullParser, "scaleY", 4, this.g);
            this.h = b.i.c.j.h.j(typedArray, xmlPullParser, "translateX", 6, this.h);
            this.i = b.i.c.j.h.j(typedArray, xmlPullParser, "translateY", 7, this.i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
            }
            d();
        }

        @Override // b.x.c.a.i.e
        public boolean a() {
            for (int r1 = 0; r1 < this.f1543b.size(); r1++) {
                if (this.f1543b.get(r1).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // b.x.c.a.i.e
        public boolean b(int[] r4) {
            boolean zB = false;
            for (int r0 = 0; r0 < this.f1543b.size(); r0++) {
                zB |= this.f1543b.get(r0).b(r4);
            }
            return zB;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayS = b.i.c.j.h.s(resources, theme, attributeSet, b.x.c.a.a.k);
            e(typedArrayS, xmlPullParser);
            typedArrayS.recycle();
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.f1544c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f) {
            if (f != this.d) {
                this.d = f;
                d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.e) {
                this.e = f;
                d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f1544c) {
                this.f1544c = f;
                d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f) {
                this.f = f;
                d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.g) {
                this.g = f;
                d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.h) {
                this.h = f;
                d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.i) {
                this.i = f;
                d();
            }
        }
    }

    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] r1) {
            return false;
        }
    }

    private static abstract class f extends e {
        protected static final int e = 0;

        /* renamed from: a, reason: collision with root package name */
        protected h.b[] f1545a;

        /* renamed from: b, reason: collision with root package name */
        String f1546b;

        /* renamed from: c, reason: collision with root package name */
        int f1547c;
        int d;

        public f() {
            super();
            this.f1545a = null;
            this.f1547c = 0;
        }

        public f(f fVar) {
            super();
            this.f1545a = null;
            this.f1547c = 0;
            this.f1546b = fVar.f1546b;
            this.d = fVar.d;
            this.f1545a = b.i.e.h.f(fVar.f1545a);
        }

        public void c(Resources.Theme theme) {
        }

        public boolean d() {
            return false;
        }

        public boolean e() {
            return false;
        }

        public String f(h.b[] bVarArr) {
            String str = " ";
            for (int r2 = 0; r2 < bVarArr.length; r2++) {
                str = str + bVarArr[r2].f1023a + ":";
                for (float f : bVarArr[r2].f1024b) {
                    str = str + f + ",";
                }
            }
            return str;
        }

        public void g(int r4) {
            String str = "";
            for (int r1 = 0; r1 < r4; r1++) {
                str = str + "    ";
            }
            Log.v(i.n, str + "current path is :" + this.f1546b + " pathData is " + f(this.f1545a));
        }

        public h.b[] getPathData() {
            return this.f1545a;
        }

        public String getPathName() {
            return this.f1546b;
        }

        public void h(Path path) {
            path.reset();
            h.b[] bVarArr = this.f1545a;
            if (bVarArr != null) {
                h.b.e(bVarArr, path);
            }
        }

        public void setPathData(h.b[] bVarArr) {
            if (b.i.e.h.b(this.f1545a, bVarArr)) {
                b.i.e.h.k(this.f1545a, bVarArr);
            } else {
                this.f1545a = b.i.e.h.f(bVarArr);
            }
        }
    }

    private static class g {
        private static final Matrix q = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        private final Path f1548a;

        /* renamed from: b, reason: collision with root package name */
        private final Path f1549b;

        /* renamed from: c, reason: collision with root package name */
        private final Matrix f1550c;
        Paint d;
        Paint e;
        private PathMeasure f;
        private int g;
        final d h;
        float i;
        float j;
        float k;
        float l;
        int m;
        String n;
        Boolean o;
        final b.f.a<String, Object> p;

        public g() {
            this.f1550c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            this.p = new b.f.a<>();
            this.h = new d();
            this.f1548a = new Path();
            this.f1549b = new Path();
        }

        public g(g gVar) {
            this.f1550c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            b.f.a<String, Object> aVar = new b.f.a<>();
            this.p = aVar;
            this.h = new d(gVar.h, aVar);
            this.f1548a = new Path(gVar.f1548a);
            this.f1549b = new Path(gVar.f1549b);
            this.i = gVar.i;
            this.j = gVar.j;
            this.k = gVar.k;
            this.l = gVar.l;
            this.g = gVar.g;
            this.m = gVar.m;
            this.n = gVar.n;
            String str = gVar.n;
            if (str != null) {
                this.p.put(str, this);
            }
            this.o = gVar.o;
        }

        private static float a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int r13, int r14, ColorFilter colorFilter) {
            dVar.f1542a.set(matrix);
            dVar.f1542a.preConcat(dVar.j);
            canvas.save();
            for (int r11 = 0; r11 < dVar.f1543b.size(); r11++) {
                e eVar = dVar.f1543b.get(r11);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f1542a, canvas, r13, r14, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, r13, r14, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int r11, int r12, ColorFilter colorFilter) {
            float f = r11 / this.k;
            float f2 = r12 / this.l;
            float fMin = Math.min(f, f2);
            Matrix matrix = dVar.f1542a;
            this.f1550c.set(matrix);
            this.f1550c.postScale(f, f2);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            fVar.h(this.f1548a);
            Path path = this.f1548a;
            this.f1549b.reset();
            if (fVar.e()) {
                this.f1549b.setFillType(fVar.f1547c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f1549b.addPath(path, this.f1550c);
                canvas.clipPath(this.f1549b);
                return;
            }
            c cVar = (c) fVar;
            if (cVar.l != 0.0f || cVar.m != 1.0f) {
                float f3 = cVar.l;
                float f4 = cVar.n;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (cVar.m + f4) % 1.0f;
                if (this.f == null) {
                    this.f = new PathMeasure();
                }
                this.f.setPath(this.f1548a, false);
                float length = this.f.getLength();
                float f7 = f5 * length;
                float f8 = f6 * length;
                path.reset();
                if (f7 > f8) {
                    this.f.getSegment(f7, length, path, true);
                    this.f.getSegment(0.0f, f8, path, true);
                } else {
                    this.f.getSegment(f7, f8, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f1549b.addPath(path, this.f1550c);
            if (cVar.i.l()) {
                b.i.c.j.b bVar = cVar.i;
                if (this.e == null) {
                    Paint paint = new Paint(1);
                    this.e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.e;
                if (bVar.h()) {
                    Shader shaderF = bVar.f();
                    shaderF.setLocalMatrix(this.f1550c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.k * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(i.c(bVar.e(), cVar.k));
                }
                paint2.setColorFilter(colorFilter);
                this.f1549b.setFillType(cVar.f1547c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f1549b, paint2);
            }
            if (cVar.g.l()) {
                b.i.c.j.b bVar2 = cVar.g;
                if (this.d == null) {
                    Paint paint3 = new Paint(1);
                    this.d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.d;
                Paint.Join join = cVar.p;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.o;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.q);
                if (bVar2.h()) {
                    Shader shaderF2 = bVar2.f();
                    shaderF2.setLocalMatrix(this.f1550c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.j * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(i.c(bVar2.e(), cVar.j));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.h * fMin * fE);
                canvas.drawPath(this.f1549b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int r9, int r10, ColorFilter colorFilter) {
            c(this.h, q, canvas, r9, r10, colorFilter);
        }

        public boolean f() {
            if (this.o == null) {
                this.o = Boolean.valueOf(this.h.a());
            }
            return this.o.booleanValue();
        }

        public boolean g(int[] r2) {
            return this.h.b(r2);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int r1) {
            this.m = r1;
        }
    }

    private static class h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f1551a;

        /* renamed from: b, reason: collision with root package name */
        g f1552b;

        /* renamed from: c, reason: collision with root package name */
        ColorStateList f1553c;
        PorterDuff.Mode d;
        boolean e;
        Bitmap f;
        int[] g;
        ColorStateList h;
        PorterDuff.Mode i;
        int j;
        boolean k;
        boolean l;
        Paint m;

        public h() {
            this.f1553c = null;
            this.d = i.o;
            this.f1552b = new g();
        }

        public h(h hVar) {
            this.f1553c = null;
            this.d = i.o;
            if (hVar != null) {
                this.f1551a = hVar.f1551a;
                g gVar = new g(hVar.f1552b);
                this.f1552b = gVar;
                if (hVar.f1552b.e != null) {
                    gVar.e = new Paint(hVar.f1552b.e);
                }
                if (hVar.f1552b.d != null) {
                    this.f1552b.d = new Paint(hVar.f1552b.d);
                }
                this.f1553c = hVar.f1553c;
                this.d = hVar.d;
                this.e = hVar.e;
            }
        }

        public boolean a(int r2, int r3) {
            return r2 == this.f.getWidth() && r3 == this.f.getHeight();
        }

        public boolean b() {
            return !this.l && this.h == this.f1553c && this.i == this.d && this.k == this.e && this.j == this.f1552b.getRootAlpha();
        }

        public void c(int r2, int r3) {
            if (this.f == null || !a(r2, r3)) {
                this.f = Bitmap.createBitmap(r2, r3, Bitmap.Config.ARGB_8888);
                this.l = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.m == null) {
                Paint paint = new Paint();
                this.m = paint;
                paint.setFilterBitmap(true);
            }
            this.m.setAlpha(this.f1552b.getRootAlpha());
            this.m.setColorFilter(colorFilter);
            return this.m;
        }

        public boolean f() {
            return this.f1552b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f1552b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1551a;
        }

        public boolean h(int[] r2) {
            boolean zG = this.f1552b.g(r2);
            this.l |= zG;
            return zG;
        }

        public void i() {
            this.h = this.f1553c;
            this.i = this.d;
            this.j = this.f1552b.getRootAlpha();
            this.k = this.e;
            this.l = false;
        }

        public void j(int r4, int r5) {
            this.f.eraseColor(0);
            this.f1552b.b(new Canvas(this.f), r4, r5, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @h0
        public Drawable newDrawable() {
            return new i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @h0
        public Drawable newDrawable(Resources resources) {
            return new i(this);
        }
    }

    @m0(24)
    /* renamed from: b.x.c.a.i$i, reason: collision with other inner class name */
    private static class C0113i extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f1554a;

        public C0113i(Drawable.ConstantState constantState) {
            this.f1554a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f1554a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1554a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            i iVar = new i();
            iVar.d = (VectorDrawable) this.f1554a.newDrawable();
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            i iVar = new i();
            iVar.d = (VectorDrawable) this.f1554a.newDrawable(resources);
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i iVar = new i();
            iVar.d = (VectorDrawable) this.f1554a.newDrawable(resources, theme);
            return iVar;
        }
    }

    i() {
        this.i = true;
        this.k = new float[9];
        this.l = new Matrix();
        this.m = new Rect();
        this.e = new h();
    }

    i(@h0 h hVar) {
        this.i = true;
        this.k = new float[9];
        this.l = new Matrix();
        this.m = new Rect();
        this.e = hVar;
        this.f = n(this.f, hVar.f1553c, hVar.d);
    }

    static int c(int r2, float f2) {
        return (r2 & f0.s) | (((int) (Color.alpha(r2) * f2)) << 24);
    }

    @i0
    public static i d(@h0 Resources resources, @q int r7, @i0 Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            i iVar = new i();
            iVar.d = b.i.c.j.g.c(resources, r7, theme);
            iVar.j = new C0113i(iVar.d.getConstantState());
            return iVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(r7);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return e(resources, xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e2) {
            Log.e(n, "parser error", e2);
            return null;
        }
    }

    public static i e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        i iVar = new i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void h(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int r7;
        int r3;
        b bVar;
        h hVar = this.e;
        g gVar = hVar.f1552b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if (r.equals(name)) {
                    c cVar = new c();
                    cVar.k(resources, attributeSet, theme, xmlPullParser);
                    dVar.f1543b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.p.put(cVar.getPathName(), cVar);
                    }
                    z2 = false;
                    bVar = cVar;
                } else if (p.equals(name)) {
                    b bVar2 = new b();
                    bVar2.i(resources, attributeSet, theme, xmlPullParser);
                    dVar.f1543b.add(bVar2);
                    String pathName = bVar2.getPathName();
                    bVar = bVar2;
                    if (pathName != null) {
                        gVar.p.put(bVar2.getPathName(), bVar2);
                        bVar = bVar2;
                    }
                } else if (q.equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f1543b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.p.put(dVar2.getGroupName(), dVar2);
                    }
                    r7 = hVar.f1551a;
                    r3 = dVar2.k;
                    hVar.f1551a = r3 | r7;
                }
                r7 = hVar.f1551a;
                r3 = bVar.d;
                hVar.f1551a = r3 | r7;
            } else if (eventType == 3 && q.equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean i() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && androidx.core.graphics.drawable.a.f(this) == 1;
    }

    private static PorterDuff.Mode j(int r1, PorterDuff.Mode mode) {
        if (r1 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (r1 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (r1 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (r1) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void k(d dVar, int r6) {
        String str = "";
        for (int r2 = 0; r2 < r6; r2++) {
            str = str + "    ";
        }
        Log.v(n, str + "current group is :" + dVar.getGroupName() + " rotation is " + dVar.f1544c);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("matrix is :");
        sb.append(dVar.getLocalMatrix().toString());
        Log.v(n, sb.toString());
        for (int r0 = 0; r0 < dVar.f1543b.size(); r0++) {
            e eVar = dVar.f1543b.get(r0);
            if (eVar instanceof d) {
                k((d) eVar, r6 + 1);
            } else {
                ((f) eVar).g(r6 + 1);
            }
        }
    }

    private void m(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.e;
        g gVar = hVar.f1552b;
        hVar.d = j(b.i.c.j.h.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListG = b.i.c.j.h.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListG != null) {
            hVar.f1553c = colorStateListG;
        }
        hVar.e = b.i.c.j.h.e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.e);
        gVar.k = b.i.c.j.h.j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.k);
        float fJ = b.i.c.j.h.j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.l);
        gVar.l = fJ;
        if (gVar.k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fJ <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.i = typedArray.getDimension(3, gVar.i);
        float dimension = typedArray.getDimension(2, gVar.j);
        gVar.j = dimension;
        if (gVar.i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(b.i.c.j.h.j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.n = string;
            gVar.p.put(string, gVar);
        }
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.d;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.b(drawable);
        return false;
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.m);
        if (this.m.width() <= 0 || this.m.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.g;
        if (colorFilter == null) {
            colorFilter = this.f;
        }
        canvas.getMatrix(this.l);
        this.l.getValues(this.k);
        float fAbs = Math.abs(this.k[0]);
        float fAbs2 = Math.abs(this.k[4]);
        float fAbs3 = Math.abs(this.k[1]);
        float fAbs4 = Math.abs(this.k[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int r1 = Math.min(2048, (int) (this.m.width() * fAbs));
        int r3 = Math.min(2048, (int) (this.m.height() * fAbs2));
        if (r1 <= 0 || r3 <= 0) {
            return;
        }
        int r4 = canvas.save();
        Rect rect = this.m;
        canvas.translate(rect.left, rect.top);
        if (i()) {
            canvas.translate(this.m.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.m.offsetTo(0, 0);
        this.e.c(r1, r3);
        if (!this.i) {
            this.e.j(r1, r3);
        } else if (!this.e.b()) {
            this.e.j(r1, r3);
            this.e.i();
        }
        this.e.d(canvas, colorFilter, this.m);
        canvas.restoreToCount(r4);
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public float f() {
        g gVar;
        h hVar = this.e;
        if (hVar == null || (gVar = hVar.f1552b) == null) {
            return 1.0f;
        }
        float f2 = gVar.i;
        if (f2 == 0.0f) {
            return 1.0f;
        }
        float f3 = gVar.j;
        if (f3 == 0.0f) {
            return 1.0f;
        }
        float f4 = gVar.l;
        if (f4 == 0.0f) {
            return 1.0f;
        }
        float f5 = gVar.k;
        if (f5 == 0.0f) {
            return 1.0f;
        }
        return Math.min(f5 / f2, f4 / f3);
    }

    Object g(String str) {
        return this.e.f1552b.p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.d;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.e.f1552b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.d;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.e.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.d;
        return drawable != null ? androidx.core.graphics.drawable.a.e(drawable) : this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.d != null && Build.VERSION.SDK_INT >= 24) {
            return new C0113i(this.d.getConstantState());
        }
        this.e.f1551a = getChangingConfigurations();
        return this.e;
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.d;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.e.f1552b.j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.d;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.e.f1552b.i;
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.d;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.e;
        hVar.f1552b = new g();
        TypedArray typedArrayS = b.i.c.j.h.s(resources, theme, attributeSet, b.x.c.a.a.f1524a);
        m(typedArrayS, xmlPullParser, theme);
        typedArrayS.recycle();
        hVar.f1551a = getChangingConfigurations();
        hVar.l = true;
        h(resources, xmlPullParser, attributeSet, theme);
        this.f = n(this.f, hVar.f1553c, hVar.d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.d;
        return drawable != null ? androidx.core.graphics.drawable.a.h(drawable) : this.e.e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.d;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.e) != null && (hVar.g() || ((colorStateList = this.e.f1553c) != null && colorStateList.isStateful())));
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    void l(boolean z2) {
        this.i = z2;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.h && super.mutate() == this) {
            this.e = new h(this.e);
            this.h = true;
        }
        return this;
    }

    PorterDuffColorFilter n(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r6) {
        PorterDuff.Mode mode;
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setState(r6);
        }
        boolean z2 = false;
        h hVar = this.e;
        ColorStateList colorStateList = hVar.f1553c;
        if (colorStateList != null && (mode = hVar.d) != null) {
            this.f = n(this.f, colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        if (!hVar.g() || !hVar.h(r6)) {
            return z2;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setAlpha(r2);
        } else if (this.e.f1552b.getRootAlpha() != r2) {
            this.e.f1552b.setRootAlpha(r2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z2) {
        Drawable drawable = this.d;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z2);
        } else {
            this.e.e = z2;
        }
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int r1) {
        super.setChangingConfigurations(r1);
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int r1, PorterDuff.Mode mode) {
        super.setColorFilter(r1, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.g = colorFilter;
            invalidateSelf();
        }
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z2) {
        super.setFilterBitmap(z2);
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int r1, int r2, int r3, int r4) {
        super.setHotspotBounds(r1, r2, r3, r4);
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] r1) {
        return super.setState(r1);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.e
    public void setTint(int r2) {
        Drawable drawable = this.d;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, r2);
        } else {
            setTintList(ColorStateList.valueOf(r2));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.e
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.d;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.e;
        if (hVar.f1553c != colorStateList) {
            hVar.f1553c = colorStateList;
            this.f = n(this.f, colorStateList, hVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.e
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.d;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
            return;
        }
        h hVar = this.e;
        if (hVar.d != mode) {
            hVar.d = mode;
            this.f = n(this.f, hVar.f1553c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.d;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}

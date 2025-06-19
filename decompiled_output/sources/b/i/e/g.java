package b.i.e;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.h0;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1017a = "\udfffd";

    /* renamed from: b, reason: collision with root package name */
    private static final String f1018b = "m";

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<b.i.o.f<Rect, Rect>> f1019c = new ThreadLocal<>();

    private g() {
    }

    public static boolean a(@h0 Paint paint, @h0 String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return paint.hasGlyph(str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float fMeasureText = paint.measureText(f1017a);
        float fMeasureText2 = paint.measureText(f1018b);
        float fMeasureText3 = paint.measureText(str);
        float fMeasureText4 = 0.0f;
        if (fMeasureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (fMeasureText3 > fMeasureText2 * 2.0f) {
                return false;
            }
            int r5 = 0;
            while (r5 < length) {
                int r8 = Character.charCount(str.codePointAt(r5)) + r5;
                fMeasureText4 += paint.measureText(str, r5, r8);
                r5 = r8;
            }
            if (fMeasureText3 >= fMeasureText4) {
                return false;
            }
        }
        if (fMeasureText3 != fMeasureText) {
            return true;
        }
        b.i.o.f<Rect, Rect> fVarB = b();
        paint.getTextBounds(f1017a, 0, 2, fVarB.f1147a);
        paint.getTextBounds(str, 0, length, fVarB.f1148b);
        return !fVarB.f1147a.equals(fVarB.f1148b);
    }

    private static b.i.o.f<Rect, Rect> b() {
        b.i.o.f<Rect, Rect> fVar = f1019c.get();
        if (fVar == null) {
            b.i.o.f<Rect, Rect> fVar2 = new b.i.o.f<>(new Rect(), new Rect());
            f1019c.set(fVar2);
            return fVar2;
        }
        fVar.f1147a.setEmpty();
        fVar.f1148b.setEmpty();
        return fVar;
    }

    public static boolean c(@h0 Paint paint, @i0 c cVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(cVar != null ? d.a(cVar) : null);
            return true;
        }
        if (cVar == null) {
            paint.setXfermode(null);
            return true;
        }
        PorterDuff.Mode modeB = d.b(cVar);
        paint.setXfermode(modeB != null ? new PorterDuffXfermode(modeB) : null);
        return modeB != null;
    }
}

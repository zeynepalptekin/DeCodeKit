package b.x.c.a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.annotation.p0;
import b.i.e.h;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1534a = "AnimatorInflater";

    /* renamed from: b, reason: collision with root package name */
    private static final int f1535b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final int f1536c = 100;
    private static final int d = 0;
    private static final int e = 1;
    private static final int f = 2;
    private static final int g = 3;
    private static final int h = 4;
    private static final boolean i = false;

    private static class a implements TypeEvaluator<h.b[]> {

        /* renamed from: a, reason: collision with root package name */
        private h.b[] f1537a;

        a() {
        }

        a(h.b[] bVarArr) {
            this.f1537a = bVarArr;
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h.b[] evaluate(float f, h.b[] bVarArr, h.b[] bVarArr2) {
            if (!b.i.e.h.b(bVarArr, bVarArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!b.i.e.h.b(this.f1537a, bVarArr)) {
                this.f1537a = b.i.e.h.f(bVarArr);
            }
            for (int r0 = 0; r0 < bVarArr.length; r0++) {
                this.f1537a[r0].d(bVarArr[r0], bVarArr2[r0], f);
            }
            return this.f1537a;
        }
    }

    private e() {
    }

    private static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f2) throws XmlPullParserException, IOException {
        return b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dd, code lost:
    
        if (r23 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00df, code lost:
    
        if (r13 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e1, code lost:
    
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ef, code lost:
    
        if (r2.hasNext() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f1, code lost:
    
        r1[r14] = (android.animation.Animator) r2.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fd, code lost:
    
        if (r24 != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ff, code lost:
    
        r23.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0103, code lost:
    
        r23.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0106, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.animation.Animator b(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.x.c.a.e.b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    private static Keyframe c(Keyframe keyframe, float f2) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f2) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f2) : Keyframe.ofObject(f2);
    }

    private static void d(Keyframe[] keyframeArr, float f2, int r4, int r5) {
        float f3 = f2 / ((r5 - r4) + 2);
        while (r4 <= r5) {
            keyframeArr[r4].setFraction(keyframeArr[r4 - 1].getFraction() + f3);
            r4++;
        }
    }

    private static void e(Object[] objArr, String str) {
        if (objArr == null || objArr.length == 0) {
            return;
        }
        Log.d(f1534a, str);
        int length = objArr.length;
        for (int r1 = 0; r1 < length; r1++) {
            Keyframe keyframe = (Keyframe) objArr[r1];
            StringBuilder sb = new StringBuilder();
            sb.append("Keyframe ");
            sb.append(r1);
            sb.append(": fraction ");
            Object value = "null";
            sb.append(keyframe.getFraction() < 0.0f ? "null" : Float.valueOf(keyframe.getFraction()));
            sb.append(", , value : ");
            if (keyframe.hasValue()) {
                value = keyframe.getValue();
            }
            sb.append(value);
            Log.d(f1534a, sb.toString());
        }
    }

    private static PropertyValuesHolder f(TypedArray typedArray, int r12, int r13, int r14, String str) {
        PropertyValuesHolder propertyValuesHolderOfFloat;
        PropertyValuesHolder propertyValuesHolderOfObject;
        TypedValue typedValuePeekValue = typedArray.peekValue(r13);
        boolean z = typedValuePeekValue != null;
        int r0 = z ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(r14);
        boolean z2 = typedValuePeekValue2 != null;
        int r4 = z2 ? typedValuePeekValue2.type : 0;
        if (r12 == 4) {
            r12 = ((z && i(r0)) || (z2 && i(r4))) ? 3 : 0;
        }
        boolean z3 = r12 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (r12 != 2) {
            f fVarA = r12 == 3 ? f.a() : null;
            if (z3) {
                if (z) {
                    float dimension = r0 == 5 ? typedArray.getDimension(r13, 0.0f) : typedArray.getFloat(r13, 0.0f);
                    if (z2) {
                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, r4 == 5 ? typedArray.getDimension(r14, 0.0f) : typedArray.getFloat(r14, 0.0f));
                    } else {
                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, r4 == 5 ? typedArray.getDimension(r14, 0.0f) : typedArray.getFloat(r14, 0.0f));
                }
                propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
            } else if (z) {
                int dimension2 = r0 == 5 ? (int) typedArray.getDimension(r13, 0.0f) : i(r0) ? typedArray.getColor(r13, 0) : typedArray.getInt(r13, 0);
                if (z2) {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2, r4 == 5 ? (int) typedArray.getDimension(r14, 0.0f) : i(r4) ? typedArray.getColor(r14, 0) : typedArray.getInt(r14, 0));
                } else {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z2) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, r4 == 5 ? (int) typedArray.getDimension(r14, 0.0f) : i(r4) ? typedArray.getColor(r14, 0) : typedArray.getInt(r14, 0));
            }
            if (propertyValuesHolderOfInt == null || fVarA == null) {
                return propertyValuesHolderOfInt;
            }
            propertyValuesHolderOfInt.setEvaluator(fVarA);
            return propertyValuesHolderOfInt;
        }
        String string = typedArray.getString(r13);
        String string2 = typedArray.getString(r14);
        h.b[] bVarArrD = b.i.e.h.d(string);
        h.b[] bVarArrD2 = b.i.e.h.d(string2);
        if (bVarArrD == null && bVarArrD2 == null) {
            return null;
        }
        if (bVarArrD == null) {
            if (bVarArrD2 != null) {
                return PropertyValuesHolder.ofObject(str, new a(), bVarArrD2);
            }
            return null;
        }
        a aVar = new a();
        if (bVarArrD2 == null) {
            propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, aVar, bVarArrD);
        } else {
            if (!b.i.e.h.b(bVarArrD, bVarArrD2)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, aVar, bVarArrD, bVarArrD2);
        }
        return propertyValuesHolderOfObject;
    }

    private static int g(TypedArray typedArray, int r4, int r5) {
        TypedValue typedValuePeekValue = typedArray.peekValue(r4);
        boolean z = typedValuePeekValue != null;
        int r42 = z ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(r5);
        boolean z2 = typedValuePeekValue2 != null;
        return ((z && i(r42)) || (z2 && i(z2 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
    }

    private static int h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayS = b.i.c.j.h.s(resources, theme, attributeSet, b.x.c.a.a.h0);
        int r3 = 0;
        TypedValue typedValueT = b.i.c.j.h.t(typedArrayS, xmlPullParser, "value", 0);
        if ((typedValueT != null) && i(typedValueT.type)) {
            r3 = 3;
        }
        typedArrayS.recycle();
        return r3;
    }

    private static boolean i(int r1) {
        return r1 >= 28 && r1 <= 31;
    }

    public static Animator j(Context context, @androidx.annotation.b int r3) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, r3) : k(context, context.getResources(), context.getTheme(), r3);
    }

    public static Animator k(Context context, Resources resources, Resources.Theme theme, @androidx.annotation.b int r4) throws Resources.NotFoundException {
        return l(context, resources, theme, r4, 1.0f);
    }

    public static Animator l(Context context, Resources resources, Resources.Theme theme, @androidx.annotation.b int r5, float f2) throws Resources.NotFoundException {
        XmlResourceParser animation = null;
        try {
            try {
                try {
                    animation = resources.getAnimation(r5);
                    return a(context, resources, theme, animation, f2);
                } catch (XmlPullParserException e2) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(r5));
                    notFoundException.initCause(e2);
                    throw notFoundException;
                }
            } catch (IOException e3) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(r5));
                notFoundException2.initCause(e3);
                throw notFoundException2;
            }
        } finally {
            if (animation != null) {
                animation.close();
            }
        }
    }

    private static ValueAnimator m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f2, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray typedArrayS = b.i.c.j.h.s(resources, theme, attributeSet, b.x.c.a.a.R);
        TypedArray typedArrayS2 = b.i.c.j.h.s(resources, theme, attributeSet, b.x.c.a.a.m0);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        r(valueAnimator, typedArrayS, typedArrayS2, f2, xmlPullParser);
        int r4 = b.i.c.j.h.l(typedArrayS, xmlPullParser, "interpolator", 0, 0);
        if (r4 > 0) {
            valueAnimator.setInterpolator(d.b(context, r4));
        }
        typedArrayS.recycle();
        if (typedArrayS2 != null) {
            typedArrayS2.recycle();
        }
        return valueAnimator;
    }

    private static Keyframe n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int r10, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        TypedArray typedArrayS = b.i.c.j.h.s(resources, theme, attributeSet, b.x.c.a.a.h0);
        float fJ = b.i.c.j.h.j(typedArrayS, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue typedValueT = b.i.c.j.h.t(typedArrayS, xmlPullParser, "value", 0);
        boolean z = typedValueT != null;
        if (r10 == 4) {
            r10 = (z && i(typedValueT.type)) ? 3 : 0;
        }
        Keyframe keyframeOfInt = z ? r10 != 0 ? (r10 == 1 || r10 == 3) ? Keyframe.ofInt(fJ, b.i.c.j.h.k(typedArrayS, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(fJ, b.i.c.j.h.j(typedArrayS, xmlPullParser, "value", 0, 0.0f)) : r10 == 0 ? Keyframe.ofFloat(fJ) : Keyframe.ofInt(fJ);
        int r9 = b.i.c.j.h.l(typedArrayS, xmlPullParser, "interpolator", 1, 0);
        if (r9 > 0) {
            keyframeOfInt.setInterpolator(d.b(context, r9));
        }
        typedArrayS.recycle();
        return keyframeOfInt;
    }

    private static ObjectAnimator o(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f2, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m(context, resources, theme, attributeSet, objectAnimator, f2, xmlPullParser);
        return objectAnimator;
    }

    private static PropertyValuesHolder p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int r14) throws XmlPullParserException, IOException {
        int size;
        PropertyValuesHolder propertyValuesHolderOfKeyframe = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (r14 == 4) {
                    r14 = h(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe keyframeN = n(context, resources, theme, Xml.asAttributeSet(xmlPullParser), r14, xmlPullParser);
                if (keyframeN != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(keyframeN);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, c(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int r10 = 0; r10 < size; r10++) {
                Keyframe keyframe3 = keyframeArr[r10];
                if (keyframe3.getFraction() < 0.0f) {
                    if (r10 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int r0 = size - 1;
                        if (r10 == r0) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int r1 = r10;
                            for (int r12 = r10 + 1; r12 < r0 && keyframeArr[r12].getFraction() < 0.0f; r12++) {
                                r1 = r12;
                            }
                            d(keyframeArr, keyframeArr[r1 + 1].getFraction() - keyframeArr[r10 - 1].getFraction(), r10, r1);
                        }
                    }
                }
            }
            propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (r14 == 3) {
                propertyValuesHolderOfKeyframe.setEvaluator(f.a());
            }
        }
        return propertyValuesHolderOfKeyframe;
    }

    private static PropertyValuesHolder[] q(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int r9;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("propertyValuesHolder")) {
                TypedArray typedArrayS = b.i.c.j.h.s(resources, theme, attributeSet, b.x.c.a.a.c0);
                String strM = b.i.c.j.h.m(typedArrayS, xmlPullParser, "propertyName", 3);
                int r5 = b.i.c.j.h.k(typedArrayS, xmlPullParser, "valueType", 2, 4);
                PropertyValuesHolder propertyValuesHolderP = p(context, resources, theme, xmlPullParser, strM, r5);
                if (propertyValuesHolderP == null) {
                    propertyValuesHolderP = f(typedArrayS, r5, 0, 1, strM);
                }
                if (propertyValuesHolderP != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(propertyValuesHolderP);
                }
                typedArrayS.recycle();
            }
            xmlPullParser.next();
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (r9 = 0; r9 < size; r9++) {
                propertyValuesHolderArr[r9] = (PropertyValuesHolder) arrayList.get(r9);
            }
        }
        return propertyValuesHolderArr;
    }

    private static void r(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f2, XmlPullParser xmlPullParser) {
        long jK = b.i.c.j.h.k(typedArray, xmlPullParser, "duration", 1, 300);
        long jK2 = b.i.c.j.h.k(typedArray, xmlPullParser, "startOffset", 2, 0);
        int r0 = b.i.c.j.h.k(typedArray, xmlPullParser, "valueType", 7, 4);
        if (b.i.c.j.h.r(xmlPullParser, "valueFrom") && b.i.c.j.h.r(xmlPullParser, "valueTo")) {
            if (r0 == 4) {
                r0 = g(typedArray, 5, 6);
            }
            PropertyValuesHolder propertyValuesHolderF = f(typedArray, r0, 5, 6, "");
            if (propertyValuesHolderF != null) {
                valueAnimator.setValues(propertyValuesHolderF);
            }
        }
        valueAnimator.setDuration(jK);
        valueAnimator.setStartDelay(jK2);
        valueAnimator.setRepeatCount(b.i.c.j.h.k(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(b.i.c.j.h.k(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            s(valueAnimator, typedArray2, r0, f2, xmlPullParser);
        }
    }

    private static void s(ValueAnimator valueAnimator, TypedArray typedArray, int r7, float f2, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String strM = b.i.c.j.h.m(typedArray, xmlPullParser, "pathData", 1);
        if (strM == null) {
            objectAnimator.setPropertyName(b.i.c.j.h.m(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String strM2 = b.i.c.j.h.m(typedArray, xmlPullParser, "propertyXName", 2);
        String strM3 = b.i.c.j.h.m(typedArray, xmlPullParser, "propertyYName", 3);
        if (r7 != 2) {
        }
        if (strM2 != null || strM3 != null) {
            t(b.i.e.h.e(strM), objectAnimator, f2 * 0.5f, strM2, strM3);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    private static void t(Path path, ObjectAnimator objectAnimator, float f2, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f3 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float length = 0.0f;
        do {
            length += pathMeasure.getLength();
            arrayList.add(Float.valueOf(length));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int r0 = Math.min(100, ((int) (length / f2)) + 1);
        float[] fArr = new float[r0];
        float[] fArr2 = new float[r0];
        float[] fArr3 = new float[2];
        float f4 = length / (r0 - 1);
        int r14 = 0;
        int r15 = 0;
        while (true) {
            if (r14 >= r0) {
                break;
            }
            pathMeasure2.getPosTan(f3 - ((Float) arrayList.get(r15)).floatValue(), fArr3, null);
            fArr[r14] = fArr3[0];
            fArr2[r14] = fArr3[1];
            f3 += f4;
            int r10 = r15 + 1;
            if (r10 < arrayList.size() && f3 > ((Float) arrayList.get(r10)).floatValue()) {
                pathMeasure2.nextContour();
                r15 = r10;
            }
            r14++;
        }
        PropertyValuesHolder propertyValuesHolderOfFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder propertyValuesHolderOfFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (propertyValuesHolderOfFloat == null) {
            objectAnimator.setValues(propertyValuesHolderOfFloat2);
        } else if (propertyValuesHolderOfFloat2 == null) {
            objectAnimator.setValues(propertyValuesHolderOfFloat);
        } else {
            objectAnimator.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
        }
    }
}

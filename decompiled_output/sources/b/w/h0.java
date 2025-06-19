package b.w;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.ViewGroup;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class h0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?>[] f1448b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    private static final b.f.a<String, Constructor<?>> f1449c = new b.f.a<>();

    /* renamed from: a, reason: collision with root package name */
    private final Context f1450a;

    private h0(@androidx.annotation.h0 Context context) {
        this.f1450a = context;
    }

    private Object a(AttributeSet attributeSet, Class<?> cls, String str) {
        Object objNewInstance;
        Class<? extends U> clsAsSubclass;
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        if (attributeValue == null) {
            throw new InflateException(str + " tag must have a 'class' attribute");
        }
        try {
            synchronized (f1449c) {
                Constructor<?> constructor = f1449c.get(attributeValue);
                if (constructor == null && (clsAsSubclass = Class.forName(attributeValue, false, this.f1450a.getClassLoader()).asSubclass(cls)) != 0) {
                    constructor = clsAsSubclass.getConstructor(f1448b);
                    constructor.setAccessible(true);
                    f1449c.put(attributeValue, constructor);
                }
                objNewInstance = constructor.newInstance(this.f1450a, attributeSet);
            }
            return objNewInstance;
        } catch (Exception e) {
            throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0178, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private b.w.g0 b(org.xmlpull.v1.XmlPullParser r8, android.util.AttributeSet r9, b.w.g0 r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.w.h0.b(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, b.w.g0):b.w.g0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private b.w.j0 c(org.xmlpull.v1.XmlPullParser r5, android.util.AttributeSet r6, android.view.ViewGroup r7) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            r4 = this;
            int r0 = r5.getDepth()
            r1 = 0
        L5:
            int r2 = r5.next()
            r3 = 3
            if (r2 != r3) goto L12
            int r3 = r5.getDepth()
            if (r3 <= r0) goto L54
        L12:
            r3 = 1
            if (r2 == r3) goto L54
            r3 = 2
            if (r2 == r3) goto L19
            goto L5
        L19:
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = "transitionManager"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L2b
            b.w.j0 r1 = new b.w.j0
            r1.<init>()
            goto L5
        L2b:
            java.lang.String r3 = "transition"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L39
            if (r1 == 0) goto L39
            r4.h(r6, r5, r7, r1)
            goto L5
        L39:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Unknown scene name: "
            r7.append(r0)
            java.lang.String r5 = r5.getName()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.w.h0.c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.ViewGroup):b.w.j0");
    }

    public static h0 d(Context context) {
        return new h0(context);
    }

    @SuppressLint({"RestrictedApi"})
    private void e(XmlPullParser xmlPullParser, AttributeSet attributeSet, g0 g0Var) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                if (!xmlPullParser.getName().equals("target")) {
                    throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                }
                TypedArray typedArrayObtainStyledAttributes = this.f1450a.obtainStyledAttributes(attributeSet, f0.f1406a);
                int r5 = b.i.c.j.h.l(typedArrayObtainStyledAttributes, xmlPullParser, "targetId", 1, 0);
                if (r5 != 0) {
                    g0Var.c(r5);
                } else {
                    int r4 = b.i.c.j.h.l(typedArrayObtainStyledAttributes, xmlPullParser, "excludeId", 2, 0);
                    if (r4 != 0) {
                        g0Var.F(r4, true);
                    } else {
                        String strM = b.i.c.j.h.m(typedArrayObtainStyledAttributes, xmlPullParser, "targetName", 4);
                        if (strM != null) {
                            g0Var.f(strM);
                        } else {
                            String strM2 = b.i.c.j.h.m(typedArrayObtainStyledAttributes, xmlPullParser, "excludeName", 5);
                            if (strM2 != null) {
                                g0Var.K(strM2, true);
                            } else {
                                String strM3 = b.i.c.j.h.m(typedArrayObtainStyledAttributes, xmlPullParser, "excludeClass", 3);
                                if (strM3 != null) {
                                    try {
                                        g0Var.J(Class.forName(strM3), true);
                                    } catch (ClassNotFoundException e) {
                                        typedArrayObtainStyledAttributes.recycle();
                                        throw new RuntimeException("Could not create " + strM3, e);
                                    }
                                } else {
                                    String strM4 = b.i.c.j.h.m(typedArrayObtainStyledAttributes, xmlPullParser, "targetClass", 0);
                                    if (strM4 != null) {
                                        g0Var.e(Class.forName(strM4));
                                    }
                                }
                            }
                        }
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    private void h(AttributeSet attributeSet, XmlPullParser xmlPullParser, ViewGroup viewGroup, j0 j0Var) throws Resources.NotFoundException {
        g0 g0VarF;
        TypedArray typedArrayObtainStyledAttributes = this.f1450a.obtainStyledAttributes(attributeSet, f0.f1407b);
        int r0 = b.i.c.j.h.l(typedArrayObtainStyledAttributes, xmlPullParser, "transition", 2, -1);
        int r1 = b.i.c.j.h.l(typedArrayObtainStyledAttributes, xmlPullParser, "fromScene", 0, -1);
        c0 c0VarD = r1 < 0 ? null : c0.d(viewGroup, r1, this.f1450a);
        int r8 = b.i.c.j.h.l(typedArrayObtainStyledAttributes, xmlPullParser, "toScene", 1, -1);
        c0 c0VarD2 = r8 >= 0 ? c0.d(viewGroup, r8, this.f1450a) : null;
        if (r0 >= 0 && (g0VarF = f(r0)) != null) {
            if (c0VarD2 == null) {
                throw new RuntimeException("No toScene for transition ID " + r0);
            }
            if (c0VarD == null) {
                j0Var.l(c0VarD2, g0VarF);
            } else {
                j0Var.k(c0VarD, c0VarD2, g0VarF);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public g0 f(int r5) throws Resources.NotFoundException {
        XmlResourceParser xml = this.f1450a.getResources().getXml(r5);
        try {
            try {
                return b(xml, Xml.asAttributeSet(xml), null);
            } catch (IOException e) {
                throw new InflateException(xml.getPositionDescription() + ": " + e.getMessage(), e);
            } catch (XmlPullParserException e2) {
                throw new InflateException(e2.getMessage(), e2);
            }
        } finally {
            xml.close();
        }
    }

    public j0 g(int r4, ViewGroup viewGroup) throws Resources.NotFoundException {
        XmlResourceParser xml = this.f1450a.getResources().getXml(r4);
        try {
            try {
                return c(xml, Xml.asAttributeSet(xml), viewGroup);
            } catch (IOException e) {
                InflateException inflateException = new InflateException(xml.getPositionDescription() + ": " + e.getMessage());
                inflateException.initCause(e);
                throw inflateException;
            } catch (XmlPullParserException e2) {
                InflateException inflateException2 = new InflateException(e2.getMessage());
                inflateException2.initCause(e2);
                throw inflateException2;
            }
        } finally {
            xml.close();
        }
    }
}

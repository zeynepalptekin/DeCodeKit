package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.constraintlayout.widget.h;
import b.g.a.i.h;
import b.g.a.i.i;
import b.g.a.i.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final String A = "ConstraintLayout";
    private static final boolean B = true;
    private static final boolean C = false;
    public static final int D = 0;
    static final boolean x = false;
    private static final boolean y = false;
    public static final String z = "ConstraintLayout-1.1.3";
    SparseArray<View> d;
    private ArrayList<b> e;
    private final ArrayList<b.g.a.i.h> f;
    i g;
    private int h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private int m;
    private c n;
    private int o;
    private HashMap<String, Integer> p;
    private int q;
    private int r;
    int s;
    int t;
    int u;
    int v;
    private b.g.a.f w;

    public static class a extends ViewGroup.MarginLayoutParams {
        public static final int A0 = 0;
        public static final int B0 = 2;
        public static final int C0 = 0;
        public static final int D0 = 1;
        public static final int E0 = 2;
        public static final int n0 = 0;
        public static final int o0 = 0;
        public static final int p0 = -1;
        public static final int q0 = 0;
        public static final int r0 = 1;
        public static final int s0 = 1;
        public static final int t0 = 2;
        public static final int u0 = 3;
        public static final int v0 = 4;
        public static final int w0 = 5;
        public static final int x0 = 6;
        public static final int y0 = 7;
        public static final int z0 = 1;
        public float A;
        public String B;
        float C;
        int D;
        public float E;
        public float F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public float O;
        public float P;
        public int Q;
        public int R;
        public int S;
        public boolean T;
        public boolean U;
        boolean V;
        boolean W;
        boolean X;
        boolean Y;
        boolean Z;

        /* renamed from: a, reason: collision with root package name */
        public int f234a;
        boolean a0;

        /* renamed from: b, reason: collision with root package name */
        public int f235b;
        int b0;

        /* renamed from: c, reason: collision with root package name */
        public float f236c;
        int c0;
        public int d;
        int d0;
        public int e;
        int e0;
        public int f;
        int f0;
        public int g;
        int g0;
        public int h;
        float h0;
        public int i;
        int i0;
        public int j;
        int j0;
        public int k;
        float k0;
        public int l;
        b.g.a.i.h l0;
        public int m;
        public boolean m0;
        public int n;
        public float o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public int x;
        public int y;
        public float z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a, reason: collision with other inner class name */
        private static class C0019a {
            public static final int A = 26;
            public static final int B = 27;
            public static final int C = 28;
            public static final int D = 29;
            public static final int E = 30;
            public static final int F = 31;
            public static final int G = 32;
            public static final int H = 33;
            public static final int I = 34;
            public static final int J = 35;
            public static final int K = 36;
            public static final int L = 37;
            public static final int M = 38;
            public static final int N = 39;
            public static final int O = 40;
            public static final int P = 41;
            public static final int Q = 42;
            public static final int R = 43;
            public static final int S = 44;
            public static final int T = 45;
            public static final int U = 46;
            public static final int V = 47;
            public static final int W = 48;
            public static final int X = 49;
            public static final int Y = 50;
            public static final SparseIntArray Z;

            /* renamed from: a, reason: collision with root package name */
            public static final int f237a = 0;

            /* renamed from: b, reason: collision with root package name */
            public static final int f238b = 1;

            /* renamed from: c, reason: collision with root package name */
            public static final int f239c = 2;
            public static final int d = 3;
            public static final int e = 4;
            public static final int f = 5;
            public static final int g = 6;
            public static final int h = 7;
            public static final int i = 8;
            public static final int j = 9;
            public static final int k = 10;
            public static final int l = 11;
            public static final int m = 12;
            public static final int n = 13;
            public static final int o = 14;
            public static final int p = 15;
            public static final int q = 16;
            public static final int r = 17;
            public static final int s = 18;
            public static final int t = 19;
            public static final int u = 20;
            public static final int v = 21;
            public static final int w = 22;
            public static final int x = 23;
            public static final int y = 24;
            public static final int z = 25;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                Z = sparseIntArray;
                sparseIntArray.append(h.c.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintCircle, 2);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                Z.append(h.c.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                Z.append(h.c.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                Z.append(h.c.ConstraintLayout_Layout_android_orientation, 1);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                Z.append(h.c.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                Z.append(h.c.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                Z.append(h.c.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                Z.append(h.c.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                Z.append(h.c.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                Z.append(h.c.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                Z.append(h.c.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                Z.append(h.c.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                Z.append(h.c.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
            }

            private C0019a() {
            }
        }

        public a(int r5, int r6) {
            super(r5, r6);
            this.f234a = -1;
            this.f235b = -1;
            this.f236c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = ConstraintLayout.B;
            this.W = ConstraintLayout.B;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = -1;
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = 0.5f;
            this.l0 = new b.g.a.i.h();
            this.m0 = false;
        }

        public a(Context context, AttributeSet attributeSet) throws NumberFormatException {
            String str;
            int r6;
            float fAbs;
            super(context, attributeSet);
            this.f234a = -1;
            this.f235b = -1;
            this.f236c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = ConstraintLayout.B;
            this.W = ConstraintLayout.B;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = -1;
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = 0.5f;
            this.l0 = new b.g.a.i.h();
            this.m0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.c.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int r1 = 0; r1 < indexCount; r1++) {
                int index = typedArrayObtainStyledAttributes.getIndex(r1);
                int r62 = C0019a.Z.get(index);
                switch (r62) {
                    case 1:
                        this.S = typedArrayObtainStyledAttributes.getInt(index, this.S);
                        continue;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.m);
                        this.m = resourceId;
                        if (resourceId == -1) {
                            this.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 3:
                        this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.n);
                        continue;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.o) % 360.0f;
                        this.o = f;
                        if (f < 0.0f) {
                            this.o = (360.0f - f) % 360.0f;
                        } else {
                            continue;
                        }
                    case 5:
                        this.f234a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f234a);
                        continue;
                    case 6:
                        this.f235b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f235b);
                        continue;
                    case 7:
                        this.f236c = typedArrayObtainStyledAttributes.getFloat(index, this.f236c);
                        continue;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.d);
                        this.d = resourceId2;
                        if (resourceId2 == -1) {
                            this.d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId3;
                        if (resourceId3 == -1) {
                            this.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId5;
                        if (resourceId5 == -1) {
                            this.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId6;
                        if (resourceId6 == -1) {
                            this.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId7;
                        if (resourceId7 == -1) {
                            this.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId8;
                        if (resourceId8 == -1) {
                            this.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId9;
                        if (resourceId9 == -1) {
                            this.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId10;
                        if (resourceId10 == -1) {
                            this.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId11;
                        if (resourceId11 == -1) {
                            this.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.q);
                        this.q = resourceId12;
                        if (resourceId12 == -1) {
                            this.q = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.r);
                        this.r = resourceId13;
                        if (resourceId13 == -1) {
                            this.r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId14;
                        if (resourceId14 == -1) {
                            this.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 21:
                        this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.t);
                        continue;
                    case 22:
                        this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.u);
                        continue;
                    case 23:
                        this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.v);
                        continue;
                    case 24:
                        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        continue;
                    case 25:
                        this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        continue;
                    case 26:
                        this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        continue;
                    case 27:
                        this.T = typedArrayObtainStyledAttributes.getBoolean(index, this.T);
                        continue;
                    case 28:
                        this.U = typedArrayObtainStyledAttributes.getBoolean(index, this.U);
                        continue;
                    case 29:
                        this.z = typedArrayObtainStyledAttributes.getFloat(index, this.z);
                        continue;
                    case 30:
                        this.A = typedArrayObtainStyledAttributes.getFloat(index, this.A);
                        continue;
                    case 31:
                        int r4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.I = r4;
                        if (r4 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        }
                    case 32:
                        int r42 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.J = r42;
                        if (r42 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        }
                    case 33:
                        try {
                            this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            continue;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                            }
                        }
                    case 34:
                        try {
                            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            continue;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                            }
                        }
                    case 35:
                        this.O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.O));
                        continue;
                    case 36:
                        try {
                            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            continue;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                            }
                        }
                    case 37:
                        try {
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            continue;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                            }
                        }
                    case 38:
                        this.P = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.P));
                        continue;
                    default:
                        switch (r62) {
                            case 44:
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                this.B = string;
                                this.C = Float.NaN;
                                this.D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int r63 = this.B.indexOf(44);
                                    if (r63 <= 0 || r63 >= length - 1) {
                                        r6 = 0;
                                    } else {
                                        String strSubstring = this.B.substring(0, r63);
                                        if (strSubstring.equalsIgnoreCase("W")) {
                                            this.D = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.D = 1;
                                        }
                                        r6 = r63 + 1;
                                    }
                                    int r7 = this.B.indexOf(58);
                                    if (r7 < 0 || r7 >= length - 1) {
                                        String strSubstring2 = this.B.substring(r6);
                                        if (strSubstring2.length() > 0) {
                                            fAbs = Float.parseFloat(strSubstring2);
                                            this.C = fAbs;
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        String strSubstring3 = this.B.substring(r6, r7);
                                        String strSubstring4 = this.B.substring(r7 + 1);
                                        if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                            break;
                                        } else {
                                            try {
                                                float f2 = Float.parseFloat(strSubstring3);
                                                float f3 = Float.parseFloat(strSubstring4);
                                                if (f2 <= 0.0f || f3 <= 0.0f) {
                                                    break;
                                                } else {
                                                    fAbs = this.D == 1 ? Math.abs(f3 / f2) : Math.abs(f2 / f3);
                                                    this.C = fAbs;
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    break;
                                }
                                break;
                            case 45:
                                this.E = typedArrayObtainStyledAttributes.getFloat(index, this.E);
                                break;
                            case 46:
                                this.F = typedArrayObtainStyledAttributes.getFloat(index, this.F);
                                break;
                            case 47:
                                this.G = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.H = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                break;
                            case 50:
                                this.R = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.R);
                                continue;
                        }
                        break;
                }
                Log.e(ConstraintLayout.A, str);
            }
            typedArrayObtainStyledAttributes.recycle();
            b();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f234a = -1;
            this.f235b = -1;
            this.f236c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = ConstraintLayout.B;
            this.W = ConstraintLayout.B;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = -1;
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = 0.5f;
            this.l0 = new b.g.a.i.h();
            this.m0 = false;
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f234a = -1;
            this.f235b = -1;
            this.f236c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = ConstraintLayout.B;
            this.W = ConstraintLayout.B;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = -1;
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = 0.5f;
            this.l0 = new b.g.a.i.h();
            this.m0 = false;
            this.f234a = aVar.f234a;
            this.f235b = aVar.f235b;
            this.f236c = aVar.f236c;
            this.d = aVar.d;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
            this.h = aVar.h;
            this.i = aVar.i;
            this.j = aVar.j;
            this.k = aVar.k;
            this.l = aVar.l;
            this.m = aVar.m;
            this.n = aVar.n;
            this.o = aVar.o;
            this.p = aVar.p;
            this.q = aVar.q;
            this.r = aVar.r;
            this.s = aVar.s;
            this.t = aVar.t;
            this.u = aVar.u;
            this.v = aVar.v;
            this.w = aVar.w;
            this.x = aVar.x;
            this.y = aVar.y;
            this.z = aVar.z;
            this.A = aVar.A;
            this.B = aVar.B;
            this.C = aVar.C;
            this.D = aVar.D;
            this.E = aVar.E;
            this.F = aVar.F;
            this.G = aVar.G;
            this.H = aVar.H;
            this.T = aVar.T;
            this.U = aVar.U;
            this.I = aVar.I;
            this.J = aVar.J;
            this.K = aVar.K;
            this.M = aVar.M;
            this.L = aVar.L;
            this.N = aVar.N;
            this.O = aVar.O;
            this.P = aVar.P;
            this.Q = aVar.Q;
            this.R = aVar.R;
            this.S = aVar.S;
            this.V = aVar.V;
            this.W = aVar.W;
            this.X = aVar.X;
            this.Y = aVar.Y;
            this.b0 = aVar.b0;
            this.c0 = aVar.c0;
            this.d0 = aVar.d0;
            this.e0 = aVar.e0;
            this.f0 = aVar.f0;
            this.g0 = aVar.g0;
            this.h0 = aVar.h0;
            this.l0 = aVar.l0;
        }

        public void a() {
            b.g.a.i.h hVar = this.l0;
            if (hVar != null) {
                hVar.I0();
            }
        }

        public void b() {
            this.Y = false;
            this.V = ConstraintLayout.B;
            this.W = ConstraintLayout.B;
            if (((ViewGroup.MarginLayoutParams) this).width == -2 && this.T) {
                this.V = false;
                this.I = 1;
            }
            if (((ViewGroup.MarginLayoutParams) this).height == -2 && this.U) {
                this.W = false;
                this.J = 1;
            }
            int r2 = ((ViewGroup.MarginLayoutParams) this).width;
            if (r2 == 0 || r2 == -1) {
                this.V = false;
                if (((ViewGroup.MarginLayoutParams) this).width == 0 && this.I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.T = ConstraintLayout.B;
                }
            }
            int r22 = ((ViewGroup.MarginLayoutParams) this).height;
            if (r22 == 0 || r22 == -1) {
                this.W = false;
                if (((ViewGroup.MarginLayoutParams) this).height == 0 && this.J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.U = ConstraintLayout.B;
                }
            }
            if (this.f236c == -1.0f && this.f234a == -1 && this.f235b == -1) {
                return;
            }
            this.Y = ConstraintLayout.B;
            this.V = ConstraintLayout.B;
            this.W = ConstraintLayout.B;
            if (!(this.l0 instanceof k)) {
                this.l0 = new k();
            }
            ((k) this.l0).f2(this.S);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x00d8  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r7) {
            /*
                Method dump skipped, instructions count: 261
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }
    }

    public ConstraintLayout(Context context) throws XmlPullParserException, IOException {
        super(context);
        this.d = new SparseArray<>();
        this.e = new ArrayList<>(4);
        this.f = new ArrayList<>(100);
        this.g = new i();
        this.h = 0;
        this.i = 0;
        this.j = ActivityChooserView.f.j;
        this.k = ActivityChooserView.f.j;
        this.l = B;
        this.m = 7;
        this.n = null;
        this.o = -1;
        this.p = new HashMap<>();
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = 0;
        this.v = 0;
        h(null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        super(context, attributeSet);
        this.d = new SparseArray<>();
        this.e = new ArrayList<>(4);
        this.f = new ArrayList<>(100);
        this.g = new i();
        this.h = 0;
        this.i = 0;
        this.j = ActivityChooserView.f.j;
        this.k = ActivityChooserView.f.j;
        this.l = B;
        this.m = 7;
        this.n = null;
        this.o = -1;
        this.p = new HashMap<>();
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = 0;
        this.v = 0;
        h(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int r4) throws XmlPullParserException, IOException {
        super(context, attributeSet, r4);
        this.d = new SparseArray<>();
        this.e = new ArrayList<>(4);
        this.f = new ArrayList<>(100);
        this.g = new i();
        this.h = 0;
        this.i = 0;
        this.j = ActivityChooserView.f.j;
        this.k = ActivityChooserView.f.j;
        this.l = B;
        this.m = 7;
        this.n = null;
        this.o = -1;
        this.p = new HashMap<>();
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = 0;
        this.v = 0;
        h(attributeSet);
    }

    private final b.g.a.i.h e(int r2) {
        if (r2 == 0) {
            return this.g;
        }
        View viewFindViewById = this.d.get(r2);
        if (viewFindViewById == null && (viewFindViewById = findViewById(r2)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.g;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((a) viewFindViewById.getLayoutParams()).l0;
    }

    private void h(AttributeSet attributeSet) throws XmlPullParserException, IOException {
        this.g.R0(this);
        this.d.put(getId(), this);
        this.n = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.c.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int r3 = 0; r3 < indexCount; r3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(r3);
                if (index == h.c.ConstraintLayout_Layout_android_minWidth) {
                    this.h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.h);
                } else if (index == h.c.ConstraintLayout_Layout_android_minHeight) {
                    this.i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.i);
                } else if (index == h.c.ConstraintLayout_Layout_android_maxWidth) {
                    this.j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.j);
                } else if (index == h.c.ConstraintLayout_Layout_android_maxHeight) {
                    this.k = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.k);
                } else if (index == h.c.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.m = typedArrayObtainStyledAttributes.getInt(index, this.m);
                } else if (index == h.c.ConstraintLayout_Layout_constraintSet) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        c cVar = new c();
                        this.n = cVar;
                        cVar.Q(getContext(), resourceId);
                    } catch (Resources.NotFoundException unused) {
                        this.n = null;
                    }
                    this.o = resourceId;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.g.u2(this.m);
    }

    private void i(int r23, int r24) {
        boolean z2;
        boolean z3;
        int baseline;
        int childMeasureSpec;
        int childMeasureSpec2;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int r7 = 0; r7 < childCount; r7++) {
            View childAt = getChildAt(r7);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                b.g.a.i.h hVar = aVar.l0;
                if (!aVar.Y && !aVar.Z) {
                    hVar.E1(childAt.getVisibility());
                    int measuredWidth = ((ViewGroup.MarginLayoutParams) aVar).width;
                    int measuredHeight = ((ViewGroup.MarginLayoutParams) aVar).height;
                    boolean z4 = aVar.V;
                    if ((z4 || aVar.W || (!z4 && aVar.I == 1) || ((ViewGroup.MarginLayoutParams) aVar).width == -1 || (!aVar.W && (aVar.J == 1 || ((ViewGroup.MarginLayoutParams) aVar).height == -1))) ? B : false) {
                        if (measuredWidth == 0) {
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(r23, paddingLeft, -2);
                            z2 = B;
                        } else if (measuredWidth == -1) {
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(r23, paddingLeft, -1);
                            z2 = false;
                        } else {
                            z2 = measuredWidth == -2 ? B : false;
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(r23, paddingLeft, measuredWidth);
                        }
                        if (measuredHeight == 0) {
                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(r24, paddingTop, -2);
                            z3 = B;
                        } else if (measuredHeight == -1) {
                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(r24, paddingTop, -1);
                            z3 = false;
                        } else {
                            z3 = measuredHeight == -2 ? B : false;
                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(r24, paddingTop, measuredHeight);
                        }
                        childAt.measure(childMeasureSpec, childMeasureSpec2);
                        b.g.a.f fVar = this.w;
                        if (fVar != null) {
                            fVar.f912a++;
                        }
                        hVar.G1(measuredWidth == -2 ? B : false);
                        hVar.h1(measuredHeight == -2 ? B : false);
                        measuredWidth = childAt.getMeasuredWidth();
                        measuredHeight = childAt.getMeasuredHeight();
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                    hVar.F1(measuredWidth);
                    hVar.g1(measuredHeight);
                    if (z2) {
                        hVar.I1(measuredWidth);
                    }
                    if (z3) {
                        hVar.H1(measuredHeight);
                    }
                    if (aVar.X && (baseline = childAt.getBaseline()) != -1) {
                        hVar.Q0(baseline);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void j(int r24, int r25) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.j(int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03a1  */
    /* JADX WARN: Type inference failed for: r26v0, types: [android.view.ViewGroup, androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void k() throws java.lang.IllegalAccessException, android.content.res.Resources.NotFoundException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 979
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.k():void");
    }

    private void m(int r10, int r11) {
        int r0;
        h.c cVar;
        int mode = View.MeasureSpec.getMode(r10);
        int size = View.MeasureSpec.getSize(r10);
        int mode2 = View.MeasureSpec.getMode(r11);
        int size2 = View.MeasureSpec.getSize(r11);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        h.c cVar2 = h.c.FIXED;
        getLayoutParams();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                cVar = h.c.WRAP_CONTENT;
            } else if (mode != 1073741824) {
                cVar = cVar2;
            } else {
                r0 = Math.min(this.j, size) - paddingLeft;
                cVar = cVar2;
            }
            r0 = 0;
        } else {
            r0 = size;
            cVar = h.c.WRAP_CONTENT;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                cVar2 = h.c.WRAP_CONTENT;
            } else if (mode2 == 1073741824) {
                size2 = Math.min(this.k, size2) - paddingTop;
            }
            size2 = 0;
        } else {
            cVar2 = h.c.WRAP_CONTENT;
        }
        this.g.s1(0);
        this.g.r1(0);
        this.g.l1(cVar);
        this.g.F1(r0);
        this.g.B1(cVar2);
        this.g.g1(size2);
        this.g.s1((this.h - getPaddingLeft()) - getPaddingRight());
        this.g.r1((this.i - getPaddingTop()) - getPaddingBottom());
    }

    private void o() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        int childCount = getChildCount();
        boolean z2 = false;
        int r2 = 0;
        while (true) {
            if (r2 >= childCount) {
                break;
            }
            if (getChildAt(r2).isLayoutRequested()) {
                z2 = B;
                break;
            }
            r2++;
        }
        if (z2) {
            this.f.clear();
            k();
        }
    }

    private void p() {
        int childCount = getChildCount();
        for (int r2 = 0; r2 < childCount; r2++) {
            View childAt = getChildAt(r2);
            if (childAt instanceof g) {
                ((g) childAt).b(this);
            }
        }
        int size = this.e.size();
        if (size > 0) {
            for (int r1 = 0; r1 < size; r1++) {
                this.e.get(r1).d(this);
            }
        }
    }

    public void a(b.g.a.f fVar) {
        this.w = fVar;
        this.g.d2(fVar);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int r2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, r2, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public Object d(int r1, Object obj) {
        if (r1 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.p;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.p.get(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int r6 = 0; r6 < childCount; r6++) {
                View childAt = getChildAt(r6);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int r9 = Integer.parseInt(strArrSplit[0]);
                        int r10 = Integer.parseInt(strArrSplit[1]);
                        int r11 = Integer.parseInt(strArrSplit[2]);
                        int r92 = (int) ((r9 / 1080.0f) * width);
                        int r102 = (int) ((r10 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(b.i.g.b.a.f1048c);
                        float f = r92;
                        float f2 = r102;
                        float f3 = r92 + ((int) ((r11 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = r102 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public View f(int r2) {
        return this.d.get(r2);
    }

    public final b.g.a.i.h g(View view) {
        if (view == this) {
            return this.g;
        }
        if (view == null) {
            return null;
        }
        return ((a) view.getLayoutParams()).l0;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int getMaxHeight() {
        return this.k;
    }

    public int getMaxWidth() {
        return this.j;
    }

    public int getMinHeight() {
        return this.i;
    }

    public int getMinWidth() {
        return this.h;
    }

    public int getOptimizationLevel() {
        return this.g.f2();
    }

    public void l(int r2, Object obj, Object obj2) {
        if (r2 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.p == null) {
                this.p = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int r22 = strSubstring.indexOf("/");
            if (r22 != -1) {
                strSubstring = strSubstring.substring(r22 + 1);
            }
            this.p.put(strSubstring, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    protected void n(String str) {
        this.g.W1();
        b.g.a.f fVar = this.w;
        if (fVar != null) {
            fVar.f914c++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int r7, int r8, int r9, int r10) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int r92 = 0; r92 < childCount; r92++) {
            View childAt = getChildAt(r92);
            a aVar = (a) childAt.getLayoutParams();
            b.g.a.i.h hVar = aVar.l0;
            if ((childAt.getVisibility() != 8 || aVar.Y || aVar.Z || zIsInEditMode) && !aVar.a0) {
                int r0 = hVar.H();
                int I = hVar.I();
                int r3 = hVar.p0() + r0;
                int r1 = hVar.J() + I;
                childAt.layout(r0, I, r3, r1);
                if ((childAt instanceof g) && (content = ((g) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(r0, I, r3, r1);
                }
            }
        }
        int size = this.e.size();
        if (size > 0) {
            for (int r82 = 0; r82 < size; r82++) {
                this.e.get(r82).c(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r24, int r25) throws java.lang.IllegalAccessException, android.content.res.Resources.NotFoundException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 951
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        b.g.a.i.h hVarG = g(view);
        if ((view instanceof f) && !(hVarG instanceof k)) {
            a aVar = (a) view.getLayoutParams();
            k kVar = new k();
            aVar.l0 = kVar;
            aVar.Y = B;
            kVar.f2(aVar.S);
        }
        if (view instanceof b) {
            b bVar = (b) view;
            bVar.f();
            ((a) view.getLayoutParams()).Z = B;
            if (!this.e.contains(bVar)) {
                this.e.add(bVar);
            }
        }
        this.d.put(view.getId(), view);
        this.l = B;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.d.remove(view.getId());
        b.g.a.i.h hVarG = g(view);
        this.g.X1(hVarG);
        this.e.remove(view);
        this.f.remove(hVarG);
        this.l = B;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        this.l = B;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = 0;
        this.v = 0;
    }

    public void setConstraintSet(c cVar) {
        this.n = cVar;
    }

    @Override // android.view.View
    public void setId(int r3) {
        this.d.remove(getId());
        super.setId(r3);
        this.d.put(getId(), this);
    }

    public void setMaxHeight(int r2) {
        if (r2 == this.k) {
            return;
        }
        this.k = r2;
        requestLayout();
    }

    public void setMaxWidth(int r2) {
        if (r2 == this.j) {
            return;
        }
        this.j = r2;
        requestLayout();
    }

    public void setMinHeight(int r2) {
        if (r2 == this.i) {
            return;
        }
        this.i = r2;
        requestLayout();
    }

    public void setMinWidth(int r2) {
        if (r2 == this.h) {
            return;
        }
        this.h = r2;
        requestLayout();
    }

    public void setOptimizationLevel(int r2) {
        this.g.u2(r2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}

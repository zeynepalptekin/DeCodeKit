package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.h;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class c {
    private static final int[] A = {0, 4, 8};
    private static final int A0 = 50;
    private static final int B = 1;
    private static final int B0 = 51;
    private static SparseIntArray C = null;
    private static final int C0 = 52;
    private static final int D = 1;
    private static final int D0 = 53;
    private static final int E = 2;
    private static final int E0 = 54;
    private static final int F = 3;
    private static final int F0 = 55;
    private static final int G = 4;
    private static final int G0 = 56;
    private static final int H = 5;
    private static final int H0 = 57;
    private static final int I = 6;
    private static final int I0 = 58;
    private static final int J = 7;
    private static final int J0 = 59;
    private static final int K = 8;
    private static final int K0 = 60;
    private static final int L = 9;
    private static final int L0 = 61;
    private static final int M = 10;
    private static final int M0 = 62;
    private static final int N = 11;
    private static final int N0 = 63;
    private static final int O = 12;
    private static final int O0 = 69;
    private static final int P = 13;
    private static final int P0 = 70;
    private static final int Q = 14;
    private static final int Q0 = 71;
    private static final int R = 15;
    private static final int R0 = 72;
    private static final int S = 16;
    private static final int S0 = 73;
    private static final int T = 17;
    private static final int T0 = 74;
    private static final int U = 18;
    private static final int U0 = 75;
    private static final int V = 19;
    private static final int W = 20;
    private static final int X = 21;
    private static final int Y = 22;
    private static final int Z = 23;
    private static final int a0 = 24;

    /* renamed from: b, reason: collision with root package name */
    private static final String f240b = "ConstraintSet";
    private static final int b0 = 25;

    /* renamed from: c, reason: collision with root package name */
    public static final int f241c = -1;
    private static final int c0 = 26;
    public static final int d = 0;
    private static final int d0 = 27;
    public static final int e = -2;
    private static final int e0 = 28;
    public static final int f = 1;
    private static final int f0 = 29;
    public static final int g = 0;
    private static final int g0 = 30;
    public static final int h = 0;
    private static final int h0 = 31;
    public static final int i = 0;
    private static final int i0 = 32;
    public static final int j = 1;
    private static final int j0 = 33;
    public static final int k = 0;
    private static final int k0 = 34;
    public static final int l = 1;
    private static final int l0 = 35;
    public static final int m = 0;
    private static final int m0 = 36;
    public static final int n = 4;
    private static final int n0 = 37;
    public static final int o = 8;
    private static final int o0 = 38;
    public static final int p = 1;
    private static final int p0 = 39;
    public static final int q = 2;
    private static final int q0 = 40;
    public static final int r = 3;
    private static final int r0 = 41;
    public static final int s = 4;
    private static final int s0 = 42;
    public static final int t = 5;
    private static final int t0 = 43;
    public static final int u = 6;
    private static final int u0 = 44;
    public static final int v = 7;
    private static final int v0 = 45;
    public static final int w = 0;
    private static final int w0 = 46;
    public static final int x = 1;
    private static final int x0 = 47;
    public static final int y = 2;
    private static final int y0 = 48;
    private static final boolean z = false;
    private static final int z0 = 49;

    /* renamed from: a, reason: collision with root package name */
    private HashMap<Integer, b> f242a = new HashMap<>();

    private static class b {
        static final int w0 = -1;
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public float Q;
        public float R;
        public int S;
        public int T;
        public float U;
        public boolean V;
        public float W;
        public float X;
        public float Y;
        public float Z;

        /* renamed from: a, reason: collision with root package name */
        boolean f243a;
        public float a0;

        /* renamed from: b, reason: collision with root package name */
        public int f244b;
        public float b0;

        /* renamed from: c, reason: collision with root package name */
        public int f245c;
        public float c0;
        int d;
        public float d0;
        public int e;
        public float e0;
        public int f;
        public float f0;
        public float g;
        public float g0;
        public int h;
        public boolean h0;
        public int i;
        public boolean i0;
        public int j;
        public int j0;
        public int k;
        public int k0;
        public int l;
        public int l0;
        public int m;
        public int m0;
        public int n;
        public int n0;
        public int o;
        public int o0;
        public int p;
        public float p0;
        public int q;
        public float q0;
        public int r;
        public boolean r0;
        public int s;
        public int s0;
        public int t;
        public int t0;
        public float u;
        public int[] u0;
        public float v;
        public String v0;
        public String w;
        public int x;
        public int y;
        public float z;

        private b() {
            this.f243a = false;
            this.e = -1;
            this.f = -1;
            this.g = -1.0f;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = 0.5f;
            this.v = 0.5f;
            this.w = null;
            this.x = -1;
            this.y = 0;
            this.z = 0.0f;
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.H = -1;
            this.I = -1;
            this.J = 0;
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = -1;
            this.P = -1;
            this.Q = 0.0f;
            this.R = 0.0f;
            this.S = 0;
            this.T = 0;
            this.U = 1.0f;
            this.V = false;
            this.W = 0.0f;
            this.X = 0.0f;
            this.Y = 0.0f;
            this.Z = 0.0f;
            this.a0 = 1.0f;
            this.b0 = 1.0f;
            this.c0 = Float.NaN;
            this.d0 = Float.NaN;
            this.e0 = 0.0f;
            this.f0 = 0.0f;
            this.g0 = 0.0f;
            this.h0 = false;
            this.i0 = false;
            this.j0 = 0;
            this.k0 = 0;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = 1.0f;
            this.q0 = 1.0f;
            this.r0 = false;
            this.s0 = -1;
            this.t0 = -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(int r2, ConstraintLayout.a aVar) {
            this.d = r2;
            this.h = aVar.d;
            this.i = aVar.e;
            this.j = aVar.f;
            this.k = aVar.g;
            this.l = aVar.h;
            this.m = aVar.i;
            this.n = aVar.j;
            this.o = aVar.k;
            this.p = aVar.l;
            this.q = aVar.p;
            this.r = aVar.q;
            this.s = aVar.r;
            this.t = aVar.s;
            this.u = aVar.z;
            this.v = aVar.A;
            this.w = aVar.B;
            this.x = aVar.m;
            this.y = aVar.n;
            this.z = aVar.o;
            this.A = aVar.Q;
            this.B = aVar.R;
            this.C = aVar.S;
            this.g = aVar.f236c;
            this.e = aVar.f234a;
            this.f = aVar.f235b;
            this.f244b = ((ViewGroup.MarginLayoutParams) aVar).width;
            this.f245c = ((ViewGroup.MarginLayoutParams) aVar).height;
            this.D = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            this.E = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            this.F = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            this.G = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            this.Q = aVar.F;
            this.R = aVar.E;
            this.T = aVar.H;
            this.S = aVar.G;
            boolean z = aVar.T;
            this.h0 = z;
            this.i0 = aVar.U;
            this.j0 = aVar.I;
            this.k0 = aVar.J;
            this.h0 = z;
            this.l0 = aVar.M;
            this.m0 = aVar.N;
            this.n0 = aVar.K;
            this.o0 = aVar.L;
            this.p0 = aVar.O;
            this.q0 = aVar.P;
            if (Build.VERSION.SDK_INT >= 17) {
                this.H = aVar.getMarginEnd();
                this.I = aVar.getMarginStart();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(int r1, d.a aVar) {
            f(r1, aVar);
            this.U = aVar.F0;
            this.X = aVar.I0;
            this.Y = aVar.J0;
            this.Z = aVar.K0;
            this.a0 = aVar.L0;
            this.b0 = aVar.M0;
            this.c0 = aVar.N0;
            this.d0 = aVar.O0;
            this.e0 = aVar.P0;
            this.f0 = aVar.Q0;
            this.g0 = aVar.R0;
            this.W = aVar.H0;
            this.V = aVar.G0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(androidx.constraintlayout.widget.b bVar, int r2, d.a aVar) {
            g(r2, aVar);
            if (bVar instanceof androidx.constraintlayout.widget.a) {
                this.t0 = 1;
                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) bVar;
                this.s0 = aVar2.getType();
                this.u0 = aVar2.getReferencedIds();
            }
        }

        public void d(ConstraintLayout.a aVar) {
            aVar.d = this.h;
            aVar.e = this.i;
            aVar.f = this.j;
            aVar.g = this.k;
            aVar.h = this.l;
            aVar.i = this.m;
            aVar.j = this.n;
            aVar.k = this.o;
            aVar.l = this.p;
            aVar.p = this.q;
            aVar.q = this.r;
            aVar.r = this.s;
            aVar.s = this.t;
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = this.D;
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = this.E;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = this.F;
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = this.G;
            aVar.x = this.P;
            aVar.y = this.O;
            aVar.z = this.u;
            aVar.A = this.v;
            aVar.m = this.x;
            aVar.n = this.y;
            aVar.o = this.z;
            aVar.B = this.w;
            aVar.Q = this.A;
            aVar.R = this.B;
            aVar.F = this.Q;
            aVar.E = this.R;
            aVar.H = this.T;
            aVar.G = this.S;
            aVar.T = this.h0;
            aVar.U = this.i0;
            aVar.I = this.j0;
            aVar.J = this.k0;
            aVar.M = this.l0;
            aVar.N = this.m0;
            aVar.K = this.n0;
            aVar.L = this.o0;
            aVar.O = this.p0;
            aVar.P = this.q0;
            aVar.S = this.C;
            aVar.f236c = this.g;
            aVar.f234a = this.e;
            aVar.f235b = this.f;
            ((ViewGroup.MarginLayoutParams) aVar).width = this.f244b;
            ((ViewGroup.MarginLayoutParams) aVar).height = this.f245c;
            if (Build.VERSION.SDK_INT >= 17) {
                aVar.setMarginStart(this.I);
                aVar.setMarginEnd(this.H);
            }
            aVar.b();
        }

        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public b clone() {
            b bVar = new b();
            bVar.f243a = this.f243a;
            bVar.f244b = this.f244b;
            bVar.f245c = this.f245c;
            bVar.e = this.e;
            bVar.f = this.f;
            bVar.g = this.g;
            bVar.h = this.h;
            bVar.i = this.i;
            bVar.j = this.j;
            bVar.k = this.k;
            bVar.l = this.l;
            bVar.m = this.m;
            bVar.n = this.n;
            bVar.o = this.o;
            bVar.p = this.p;
            bVar.q = this.q;
            bVar.r = this.r;
            bVar.s = this.s;
            bVar.t = this.t;
            bVar.u = this.u;
            bVar.v = this.v;
            bVar.w = this.w;
            bVar.A = this.A;
            bVar.B = this.B;
            bVar.u = this.u;
            bVar.u = this.u;
            bVar.u = this.u;
            bVar.u = this.u;
            bVar.u = this.u;
            bVar.C = this.C;
            bVar.D = this.D;
            bVar.E = this.E;
            bVar.F = this.F;
            bVar.G = this.G;
            bVar.H = this.H;
            bVar.I = this.I;
            bVar.J = this.J;
            bVar.K = this.K;
            bVar.L = this.L;
            bVar.M = this.M;
            bVar.N = this.N;
            bVar.O = this.O;
            bVar.P = this.P;
            bVar.Q = this.Q;
            bVar.R = this.R;
            bVar.S = this.S;
            bVar.T = this.T;
            bVar.U = this.U;
            bVar.V = this.V;
            bVar.W = this.W;
            bVar.X = this.X;
            bVar.Y = this.Y;
            bVar.Z = this.Z;
            bVar.a0 = this.a0;
            bVar.b0 = this.b0;
            bVar.c0 = this.c0;
            bVar.d0 = this.d0;
            bVar.e0 = this.e0;
            bVar.f0 = this.f0;
            bVar.g0 = this.g0;
            bVar.h0 = this.h0;
            bVar.i0 = this.i0;
            bVar.j0 = this.j0;
            bVar.k0 = this.k0;
            bVar.l0 = this.l0;
            bVar.m0 = this.m0;
            bVar.n0 = this.n0;
            bVar.o0 = this.o0;
            bVar.p0 = this.p0;
            bVar.q0 = this.q0;
            bVar.s0 = this.s0;
            bVar.t0 = this.t0;
            int[] r1 = this.u0;
            if (r1 != null) {
                bVar.u0 = Arrays.copyOf(r1, r1.length);
            }
            bVar.x = this.x;
            bVar.y = this.y;
            bVar.z = this.z;
            bVar.r0 = this.r0;
            return bVar;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.append(h.c.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        C.append(h.c.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        C.append(h.c.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        C.append(h.c.ConstraintSet_layout_constraintRight_toRightOf, 30);
        C.append(h.c.ConstraintSet_layout_constraintTop_toTopOf, 36);
        C.append(h.c.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        C.append(h.c.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        C.append(h.c.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        C.append(h.c.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        C.append(h.c.ConstraintSet_layout_editor_absoluteX, 6);
        C.append(h.c.ConstraintSet_layout_editor_absoluteY, 7);
        C.append(h.c.ConstraintSet_layout_constraintGuide_begin, 17);
        C.append(h.c.ConstraintSet_layout_constraintGuide_end, 18);
        C.append(h.c.ConstraintSet_layout_constraintGuide_percent, 19);
        C.append(h.c.ConstraintSet_android_orientation, 27);
        C.append(h.c.ConstraintSet_layout_constraintStart_toEndOf, 32);
        C.append(h.c.ConstraintSet_layout_constraintStart_toStartOf, 33);
        C.append(h.c.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        C.append(h.c.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        C.append(h.c.ConstraintSet_layout_goneMarginLeft, 13);
        C.append(h.c.ConstraintSet_layout_goneMarginTop, 16);
        C.append(h.c.ConstraintSet_layout_goneMarginRight, 14);
        C.append(h.c.ConstraintSet_layout_goneMarginBottom, 11);
        C.append(h.c.ConstraintSet_layout_goneMarginStart, 15);
        C.append(h.c.ConstraintSet_layout_goneMarginEnd, 12);
        C.append(h.c.ConstraintSet_layout_constraintVertical_weight, 40);
        C.append(h.c.ConstraintSet_layout_constraintHorizontal_weight, 39);
        C.append(h.c.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        C.append(h.c.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        C.append(h.c.ConstraintSet_layout_constraintHorizontal_bias, 20);
        C.append(h.c.ConstraintSet_layout_constraintVertical_bias, 37);
        C.append(h.c.ConstraintSet_layout_constraintDimensionRatio, 5);
        C.append(h.c.ConstraintSet_layout_constraintLeft_creator, 75);
        C.append(h.c.ConstraintSet_layout_constraintTop_creator, 75);
        C.append(h.c.ConstraintSet_layout_constraintRight_creator, 75);
        C.append(h.c.ConstraintSet_layout_constraintBottom_creator, 75);
        C.append(h.c.ConstraintSet_layout_constraintBaseline_creator, 75);
        C.append(h.c.ConstraintSet_android_layout_marginLeft, 24);
        C.append(h.c.ConstraintSet_android_layout_marginRight, 28);
        C.append(h.c.ConstraintSet_android_layout_marginStart, 31);
        C.append(h.c.ConstraintSet_android_layout_marginEnd, 8);
        C.append(h.c.ConstraintSet_android_layout_marginTop, 34);
        C.append(h.c.ConstraintSet_android_layout_marginBottom, 2);
        C.append(h.c.ConstraintSet_android_layout_width, 23);
        C.append(h.c.ConstraintSet_android_layout_height, 21);
        C.append(h.c.ConstraintSet_android_visibility, 22);
        C.append(h.c.ConstraintSet_android_alpha, 43);
        C.append(h.c.ConstraintSet_android_elevation, 44);
        C.append(h.c.ConstraintSet_android_rotationX, 45);
        C.append(h.c.ConstraintSet_android_rotationY, 46);
        C.append(h.c.ConstraintSet_android_rotation, 60);
        C.append(h.c.ConstraintSet_android_scaleX, 47);
        C.append(h.c.ConstraintSet_android_scaleY, 48);
        C.append(h.c.ConstraintSet_android_transformPivotX, 49);
        C.append(h.c.ConstraintSet_android_transformPivotY, 50);
        C.append(h.c.ConstraintSet_android_translationX, 51);
        C.append(h.c.ConstraintSet_android_translationY, 52);
        C.append(h.c.ConstraintSet_android_translationZ, 53);
        C.append(h.c.ConstraintSet_layout_constraintWidth_default, 54);
        C.append(h.c.ConstraintSet_layout_constraintHeight_default, 55);
        C.append(h.c.ConstraintSet_layout_constraintWidth_max, 56);
        C.append(h.c.ConstraintSet_layout_constraintHeight_max, 57);
        C.append(h.c.ConstraintSet_layout_constraintWidth_min, 58);
        C.append(h.c.ConstraintSet_layout_constraintHeight_min, 59);
        C.append(h.c.ConstraintSet_layout_constraintCircle, 61);
        C.append(h.c.ConstraintSet_layout_constraintCircleRadius, 62);
        C.append(h.c.ConstraintSet_layout_constraintCircleAngle, 63);
        C.append(h.c.ConstraintSet_android_id, 38);
        C.append(h.c.ConstraintSet_layout_constraintWidth_percent, 69);
        C.append(h.c.ConstraintSet_layout_constraintHeight_percent, 70);
        C.append(h.c.ConstraintSet_chainUseRtl, 71);
        C.append(h.c.ConstraintSet_barrierDirection, 72);
        C.append(h.c.ConstraintSet_constraint_referenced_ids, 73);
        C.append(h.c.ConstraintSet_barrierAllowsGoneWidgets, 74);
    }

    private int[] F(View view, String str) throws IllegalAccessException, IllegalArgumentException {
        int identifier;
        Object objD;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] r1 = new int[strArrSplit.length];
        int r3 = 0;
        int r4 = 0;
        while (r3 < strArrSplit.length) {
            String strTrim = strArrSplit[r3].trim();
            try {
                identifier = h.b.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                identifier = 0;
            }
            if (identifier == 0) {
                identifier = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (identifier == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objD = ((ConstraintLayout) view.getParent()).d(0, strTrim)) != null && (objD instanceof Integer)) {
                identifier = ((Integer) objD).intValue();
            }
            r1[r4] = identifier;
            r3++;
            r4++;
        }
        return r4 != strArrSplit.length ? Arrays.copyOf(r1, r4) : r1;
    }

    private void J(int r13, int r14, int r15, int r16, int[] r17, float[] fArr, int r19, int r20, int r21) {
        if (r17.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != r17.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            N(r17[0]).R = fArr[0];
        }
        N(r17[0]).S = r19;
        t(r17[0], r20, r13, r14, -1);
        for (int r10 = 1; r10 < r17.length; r10++) {
            int r02 = r17[r10];
            int r11 = r10 - 1;
            t(r17[r10], r20, r17[r11], r21, -1);
            t(r17[r11], r21, r17[r10], r20, -1);
            if (fArr != null) {
                N(r17[r10]).R = fArr[r10];
            }
        }
        t(r17[r17.length - 1], r21, r15, r16, -1);
    }

    private b M(Context context, AttributeSet attributeSet) {
        b bVar = new b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.c.ConstraintSet);
        S(bVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return bVar;
    }

    private b N(int r5) {
        if (!this.f242a.containsKey(Integer.valueOf(r5))) {
            this.f242a.put(Integer.valueOf(r5), new b());
        }
        return this.f242a.get(Integer.valueOf(r5));
    }

    private static int R(TypedArray typedArray, int r2, int r3) {
        int resourceId = typedArray.getResourceId(r2, r3);
        return resourceId == -1 ? typedArray.getInt(r2, -1) : resourceId;
    }

    private void S(b bVar, TypedArray typedArray) {
        StringBuilder sb;
        String str;
        int indexCount = typedArray.getIndexCount();
        for (int r1 = 0; r1 < indexCount; r1++) {
            int index = typedArray.getIndex(r1);
            int r3 = C.get(index);
            switch (r3) {
                case 1:
                    bVar.p = R(typedArray, index, bVar.p);
                    break;
                case 2:
                    bVar.G = typedArray.getDimensionPixelSize(index, bVar.G);
                    break;
                case 3:
                    bVar.o = R(typedArray, index, bVar.o);
                    break;
                case 4:
                    bVar.n = R(typedArray, index, bVar.n);
                    break;
                case 5:
                    bVar.w = typedArray.getString(index);
                    break;
                case 6:
                    bVar.A = typedArray.getDimensionPixelOffset(index, bVar.A);
                    break;
                case 7:
                    bVar.B = typedArray.getDimensionPixelOffset(index, bVar.B);
                    break;
                case 8:
                    bVar.H = typedArray.getDimensionPixelSize(index, bVar.H);
                    break;
                case 9:
                    bVar.t = R(typedArray, index, bVar.t);
                    break;
                case 10:
                    bVar.s = R(typedArray, index, bVar.s);
                    break;
                case 11:
                    bVar.N = typedArray.getDimensionPixelSize(index, bVar.N);
                    break;
                case 12:
                    bVar.O = typedArray.getDimensionPixelSize(index, bVar.O);
                    break;
                case 13:
                    bVar.K = typedArray.getDimensionPixelSize(index, bVar.K);
                    break;
                case 14:
                    bVar.M = typedArray.getDimensionPixelSize(index, bVar.M);
                    break;
                case 15:
                    bVar.P = typedArray.getDimensionPixelSize(index, bVar.P);
                    break;
                case 16:
                    bVar.L = typedArray.getDimensionPixelSize(index, bVar.L);
                    break;
                case 17:
                    bVar.e = typedArray.getDimensionPixelOffset(index, bVar.e);
                    break;
                case 18:
                    bVar.f = typedArray.getDimensionPixelOffset(index, bVar.f);
                    break;
                case 19:
                    bVar.g = typedArray.getFloat(index, bVar.g);
                    break;
                case 20:
                    bVar.u = typedArray.getFloat(index, bVar.u);
                    break;
                case 21:
                    bVar.f245c = typedArray.getLayoutDimension(index, bVar.f245c);
                    break;
                case 22:
                    int r2 = typedArray.getInt(index, bVar.J);
                    bVar.J = r2;
                    bVar.J = A[r2];
                    break;
                case 23:
                    bVar.f244b = typedArray.getLayoutDimension(index, bVar.f244b);
                    break;
                case 24:
                    bVar.D = typedArray.getDimensionPixelSize(index, bVar.D);
                    break;
                case 25:
                    bVar.h = R(typedArray, index, bVar.h);
                    break;
                case 26:
                    bVar.i = R(typedArray, index, bVar.i);
                    break;
                case 27:
                    bVar.C = typedArray.getInt(index, bVar.C);
                    break;
                case 28:
                    bVar.E = typedArray.getDimensionPixelSize(index, bVar.E);
                    break;
                case 29:
                    bVar.j = R(typedArray, index, bVar.j);
                    break;
                case 30:
                    bVar.k = R(typedArray, index, bVar.k);
                    break;
                case 31:
                    bVar.I = typedArray.getDimensionPixelSize(index, bVar.I);
                    break;
                case 32:
                    bVar.q = R(typedArray, index, bVar.q);
                    break;
                case 33:
                    bVar.r = R(typedArray, index, bVar.r);
                    break;
                case 34:
                    bVar.F = typedArray.getDimensionPixelSize(index, bVar.F);
                    break;
                case 35:
                    bVar.m = R(typedArray, index, bVar.m);
                    break;
                case 36:
                    bVar.l = R(typedArray, index, bVar.l);
                    break;
                case 37:
                    bVar.v = typedArray.getFloat(index, bVar.v);
                    break;
                case 38:
                    bVar.d = typedArray.getResourceId(index, bVar.d);
                    break;
                case 39:
                    bVar.R = typedArray.getFloat(index, bVar.R);
                    break;
                case 40:
                    bVar.Q = typedArray.getFloat(index, bVar.Q);
                    break;
                case 41:
                    bVar.S = typedArray.getInt(index, bVar.S);
                    break;
                case 42:
                    bVar.T = typedArray.getInt(index, bVar.T);
                    break;
                case 43:
                    bVar.U = typedArray.getFloat(index, bVar.U);
                    break;
                case 44:
                    bVar.V = true;
                    bVar.W = typedArray.getDimension(index, bVar.W);
                    break;
                case 45:
                    bVar.Y = typedArray.getFloat(index, bVar.Y);
                    break;
                case 46:
                    bVar.Z = typedArray.getFloat(index, bVar.Z);
                    break;
                case 47:
                    bVar.a0 = typedArray.getFloat(index, bVar.a0);
                    break;
                case 48:
                    bVar.b0 = typedArray.getFloat(index, bVar.b0);
                    break;
                case 49:
                    bVar.c0 = typedArray.getFloat(index, bVar.c0);
                    break;
                case 50:
                    bVar.d0 = typedArray.getFloat(index, bVar.d0);
                    break;
                case 51:
                    bVar.e0 = typedArray.getDimension(index, bVar.e0);
                    break;
                case 52:
                    bVar.f0 = typedArray.getDimension(index, bVar.f0);
                    break;
                case 53:
                    bVar.g0 = typedArray.getDimension(index, bVar.g0);
                    break;
                default:
                    switch (r3) {
                        case 60:
                            bVar.X = typedArray.getFloat(index, bVar.X);
                            break;
                        case 61:
                            bVar.x = R(typedArray, index, bVar.x);
                            break;
                        case 62:
                            bVar.y = typedArray.getDimensionPixelSize(index, bVar.y);
                            break;
                        case 63:
                            bVar.z = typedArray.getFloat(index, bVar.z);
                            break;
                        default:
                            switch (r3) {
                                case 69:
                                    bVar.p0 = typedArray.getFloat(index, 1.0f);
                                    continue;
                                case 70:
                                    bVar.q0 = typedArray.getFloat(index, 1.0f);
                                    continue;
                                case 71:
                                    Log.e(f240b, "CURRENTLY UNSUPPORTED");
                                    continue;
                                case 72:
                                    bVar.s0 = typedArray.getInt(index, bVar.s0);
                                    continue;
                                case 73:
                                    bVar.v0 = typedArray.getString(index);
                                    continue;
                                case 74:
                                    bVar.r0 = typedArray.getBoolean(index, bVar.r0);
                                    continue;
                                case 75:
                                    sb = new StringBuilder();
                                    str = "unused attribute 0x";
                                    break;
                                default:
                                    sb = new StringBuilder();
                                    str = "Unknown attribute 0x";
                                    break;
                            }
                            sb.append(str);
                            sb.append(Integer.toHexString(index));
                            sb.append("   ");
                            sb.append(C.get(index));
                            Log.w(f240b, sb.toString());
                            break;
                    }
            }
        }
    }

    private String y0(int r1) {
        switch (r1) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return com.google.android.gms.ads.a.e;
        }
    }

    public void A(int r1, int r2) {
        N(r1).o0 = r2;
    }

    public void B(int r1, int r2) {
        N(r1).n0 = r2;
    }

    public void C(int r1, float f2) {
        N(r1).q0 = f2;
    }

    public void D(int r1, float f2) {
        N(r1).p0 = f2;
    }

    public void E(int r1, int r2) {
        N(r1).f244b = r2;
    }

    public void G(int r2, int r3) {
        b bVarN = N(r2);
        bVarN.f243a = true;
        bVarN.C = r3;
    }

    public void H(int r2, int r3, int... r4) {
        b bVarN = N(r2);
        bVarN.t0 = 1;
        bVarN.s0 = r3;
        bVarN.f243a = false;
        bVarN.u0 = r4;
    }

    public void I(int r11, int r12, int r13, int r14, int[] r15, float[] fArr, int r17) {
        J(r11, r12, r13, r14, r15, fArr, r17, 1, 2);
    }

    public void K(int r11, int r12, int r13, int r14, int[] r15, float[] fArr, int r17) {
        J(r11, r12, r13, r14, r15, fArr, r17, 6, 7);
    }

    public void L(int r13, int r14, int r15, int r16, int[] r17, float[] fArr, int r19) {
        if (r17.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != r17.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            N(r17[0]).Q = fArr[0];
        }
        N(r17[0]).T = r19;
        t(r17[0], 3, r13, r14, 0);
        for (int r10 = 1; r10 < r17.length; r10++) {
            int r02 = r17[r10];
            int r11 = r10 - 1;
            t(r17[r10], 3, r17[r11], 4, 0);
            t(r17[r11], 4, r17[r10], 3, 0);
            if (fArr != null) {
                N(r17[r10]).Q = fArr[r10];
            }
        }
        t(r17[r17.length - 1], 4, r15, r16, 0);
    }

    public boolean O(int r1) {
        return N(r1).V;
    }

    public b P(int r1) {
        return N(r1);
    }

    public void Q(Context context, int r6) throws XmlPullParserException, Resources.NotFoundException, IOException {
        XmlResourceParser xml = context.getResources().getXml(r6);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    b bVarM = M(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        bVarM.f243a = true;
                    }
                    this.f242a.put(Integer.valueOf(bVarM.d), bVarM);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    public void T(int r9) {
        int r3;
        int r2;
        int r4;
        int r5;
        c cVar;
        int r1;
        int r02;
        int r32;
        int r22;
        int r42;
        int r52;
        c cVar2;
        int r12;
        if (this.f242a.containsKey(Integer.valueOf(r9))) {
            b bVar = this.f242a.get(Integer.valueOf(r9));
            int r6 = bVar.i;
            int r7 = bVar.j;
            if (r6 == -1 && r7 == -1) {
                int r23 = bVar.q;
                int r72 = bVar.s;
                if (r23 != -1 || r72 != -1) {
                    if (r23 != -1 && r72 != -1) {
                        r52 = 0;
                        cVar2 = this;
                        cVar2.t(r23, 7, r72, 6, 0);
                        r22 = 6;
                        r42 = 7;
                        r12 = r72;
                        r32 = r6;
                    } else if (r6 != -1 || r72 != -1) {
                        r32 = bVar.k;
                        if (r32 != -1) {
                            r22 = 7;
                            r42 = 7;
                            r52 = 0;
                            cVar2 = this;
                            r12 = r6;
                        } else {
                            r32 = bVar.h;
                            if (r32 != -1) {
                                r22 = 6;
                                r42 = 6;
                                r52 = 0;
                                cVar2 = this;
                                r12 = r72;
                            }
                        }
                    }
                    cVar2.t(r12, r22, r32, r42, r52);
                }
                n(r9, 6);
                r02 = 7;
            } else {
                if (r6 == -1 || r7 == -1) {
                    if (r6 != -1 || r7 != -1) {
                        r3 = bVar.k;
                        if (r3 != -1) {
                            r2 = 2;
                            r4 = 2;
                            r5 = 0;
                            cVar = this;
                            r1 = r6;
                        } else {
                            r3 = bVar.h;
                            if (r3 != -1) {
                                r2 = 1;
                                r4 = 1;
                                r5 = 0;
                                cVar = this;
                                r1 = r7;
                            }
                        }
                    }
                    n(r9, 1);
                    r02 = 2;
                } else {
                    r5 = 0;
                    cVar = this;
                    cVar.t(r6, 2, r7, 1, 0);
                    r2 = 1;
                    r4 = 2;
                    r1 = r7;
                    r3 = r6;
                }
                cVar.t(r1, r2, r3, r4, r5);
                n(r9, 1);
                r02 = 2;
            }
            n(r9, r02);
        }
    }

    public void U(int r10) {
        int r4;
        int r3;
        int r5;
        int r6;
        c cVar;
        int r2;
        if (this.f242a.containsKey(Integer.valueOf(r10))) {
            b bVar = this.f242a.get(Integer.valueOf(r10));
            int r7 = bVar.m;
            int r8 = bVar.n;
            if (r7 != -1 || r8 != -1) {
                if (r7 != -1 && r8 != -1) {
                    r6 = 0;
                    cVar = this;
                    cVar.t(r7, 4, r8, 3, 0);
                    r3 = 3;
                    r5 = 4;
                    r2 = r8;
                    r4 = r7;
                } else if (r7 != -1 || r8 != -1) {
                    r4 = bVar.o;
                    if (r4 != -1) {
                        r3 = 4;
                        r5 = 4;
                        r6 = 0;
                        cVar = this;
                        r2 = r7;
                    } else {
                        r4 = bVar.l;
                        if (r4 != -1) {
                            r3 = 3;
                            r5 = 3;
                            r6 = 0;
                            cVar = this;
                            r2 = r8;
                        }
                    }
                }
                cVar.t(r2, r3, r4, r5, r6);
            }
        }
        n(r10, 3);
        n(r10, 4);
    }

    public void V(int r1, float f2) {
        N(r1).U = f2;
    }

    public void W(int r1, boolean z2) {
        N(r1).V = z2;
    }

    public void X(int r1, int r2) {
    }

    public void Y(int r1, String str) {
        N(r1).w = str;
    }

    public void Z(int r2, float f2) {
        N(r2).W = f2;
        N(r2).V = true;
    }

    public void a(int r9, int r10, int r11) {
        t(r9, 1, r10, r10 == 0 ? 1 : 2, 0);
        t(r9, 2, r11, r11 == 0 ? 2 : 1, 0);
        if (r10 != 0) {
            t(r10, 2, r9, 1, 0);
        }
        if (r11 != 0) {
            t(r11, 1, r9, 2, 0);
        }
    }

    public void a0(int r1, int r2, int r3) {
        b bVarN = N(r1);
        switch (r2) {
            case 1:
                bVarN.K = r3;
                return;
            case 2:
                bVarN.M = r3;
                return;
            case 3:
                bVarN.L = r3;
                return;
            case 4:
                bVarN.N = r3;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                bVarN.P = r3;
                return;
            case 7:
                bVarN.O = r3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void b(int r9, int r10, int r11) {
        t(r9, 6, r10, r10 == 0 ? 6 : 7, 0);
        t(r9, 7, r11, r11 == 0 ? 7 : 6, 0);
        if (r10 != 0) {
            t(r10, 7, r9, 6, 0);
        }
        if (r11 != 0) {
            t(r11, 6, r9, 7, 0);
        }
    }

    public void b0(int r2, int r3) {
        N(r2).e = r3;
        N(r2).f = -1;
        N(r2).g = -1.0f;
    }

    public void c(int r15, int r16, int r17) {
        t(r15, 3, r16, r16 == 0 ? 3 : 4, 0);
        t(r15, 4, r17, r17 == 0 ? 4 : 3, 0);
        if (r16 != 0) {
            t(r16, 4, r15, 3, 0);
        }
        if (r16 != 0) {
            t(r17, 3, r15, 4, 0);
        }
    }

    public void c0(int r2, int r3) {
        N(r2).f = r3;
        N(r2).e = -1;
        N(r2).g = -1.0f;
    }

    public void d(ConstraintLayout constraintLayout) throws IllegalAccessException, IllegalArgumentException {
        e(constraintLayout);
        constraintLayout.setConstraintSet(null);
    }

    public void d0(int r2, float f2) {
        N(r2).g = f2;
        N(r2).f = -1;
        N(r2).e = -1;
    }

    void e(ConstraintLayout constraintLayout) throws IllegalAccessException, IllegalArgumentException {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f242a.keySet());
        for (int r2 = 0; r2 < childCount; r2++) {
            View childAt = constraintLayout.getChildAt(r2);
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (this.f242a.containsKey(Integer.valueOf(id))) {
                hashSet.remove(Integer.valueOf(id));
                b bVar = this.f242a.get(Integer.valueOf(id));
                if (childAt instanceof androidx.constraintlayout.widget.a) {
                    bVar.t0 = 1;
                }
                int r8 = bVar.t0;
                if (r8 != -1 && r8 == 1) {
                    androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) childAt;
                    aVar.setId(id);
                    aVar.setType(bVar.s0);
                    aVar.setAllowsGoneWidget(bVar.r0);
                    int[] r4 = bVar.u0;
                    if (r4 != null) {
                        aVar.setReferencedIds(r4);
                    } else {
                        String str = bVar.v0;
                        if (str != null) {
                            int[] r42 = F(aVar, str);
                            bVar.u0 = r42;
                            aVar.setReferencedIds(r42);
                        }
                    }
                }
                ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
                bVar.d(aVar2);
                childAt.setLayoutParams(aVar2);
                childAt.setVisibility(bVar.J);
                if (Build.VERSION.SDK_INT >= 17) {
                    childAt.setAlpha(bVar.U);
                    childAt.setRotation(bVar.X);
                    childAt.setRotationX(bVar.Y);
                    childAt.setRotationY(bVar.Z);
                    childAt.setScaleX(bVar.a0);
                    childAt.setScaleY(bVar.b0);
                    if (!Float.isNaN(bVar.c0)) {
                        childAt.setPivotX(bVar.c0);
                    }
                    if (!Float.isNaN(bVar.d0)) {
                        childAt.setPivotY(bVar.d0);
                    }
                    childAt.setTranslationX(bVar.e0);
                    childAt.setTranslationY(bVar.f0);
                    if (Build.VERSION.SDK_INT >= 21) {
                        childAt.setTranslationZ(bVar.g0);
                        if (bVar.V) {
                            childAt.setElevation(bVar.W);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            b bVar2 = this.f242a.get(num);
            int r5 = bVar2.t0;
            if (r5 != -1 && r5 == 1) {
                androidx.constraintlayout.widget.a aVar3 = new androidx.constraintlayout.widget.a(constraintLayout.getContext());
                aVar3.setId(num.intValue());
                int[] r6 = bVar2.u0;
                if (r6 != null) {
                    aVar3.setReferencedIds(r6);
                } else {
                    String str2 = bVar2.v0;
                    if (str2 != null) {
                        int[] r62 = F(aVar3, str2);
                        bVar2.u0 = r62;
                        aVar3.setReferencedIds(r62);
                    }
                }
                aVar3.setType(bVar2.s0);
                ConstraintLayout.a aVarB = constraintLayout.generateDefaultLayoutParams();
                aVar3.f();
                bVar2.d(aVarB);
                constraintLayout.addView(aVar3, aVarB);
            }
            if (bVar2.f243a) {
                View fVar = new f(constraintLayout.getContext());
                fVar.setId(num.intValue());
                ConstraintLayout.a aVarB2 = constraintLayout.generateDefaultLayoutParams();
                bVar2.d(aVarB2);
                constraintLayout.addView(fVar, aVarB2);
            }
        }
    }

    public void e0(int r1, float f2) {
        N(r1).u = f2;
    }

    public void f(int r9, int r10, int r11, int r12, int r13, int r14, int r15, float f2) {
        c cVar;
        int r1;
        int r2;
        if (r12 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (r15 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (f2 <= 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (r11 == 1 || r11 == 2) {
            cVar = this;
            r1 = r9;
            cVar.t(r1, 1, r10, r11, r12);
            r2 = 2;
        } else if (r11 != 6 && r11 != 7) {
            t(r9, 3, r10, r11, r12);
            t(r9, 4, r13, r14, r15);
            this.f242a.get(Integer.valueOf(r9)).v = f2;
            return;
        } else {
            cVar = this;
            r1 = r9;
            cVar.t(r1, 6, r10, r11, r12);
            r2 = 7;
        }
        cVar.t(r1, r2, r13, r14, r15);
        this.f242a.get(Integer.valueOf(r9)).u = f2;
    }

    public void f0(int r1, int r2) {
        N(r1).S = r2;
    }

    public void g(int r10, int r11) {
        int r3;
        int r4;
        int r6;
        int r7;
        float f2;
        c cVar;
        int r1;
        int r2;
        int r5;
        if (r11 == 0) {
            r2 = 0;
            r3 = 1;
            r4 = 0;
            r5 = 0;
            r6 = 2;
            r7 = 0;
            f2 = 0.5f;
            cVar = this;
            r1 = r10;
        } else {
            r3 = 2;
            r4 = 0;
            r6 = 1;
            r7 = 0;
            f2 = 0.5f;
            cVar = this;
            r1 = r10;
            r2 = r11;
            r5 = r11;
        }
        cVar.f(r1, r2, r3, r4, r5, r6, r7, f2);
    }

    public void g0(int r1, float f2) {
        N(r1).R = f2;
    }

    public void h(int r10, int r11, int r12, int r13, int r14, int r15, int r16, float f2) {
        t(r10, 1, r11, r12, r13);
        t(r10, 2, r14, r15, r16);
        this.f242a.get(Integer.valueOf(r10)).u = f2;
    }

    public void h0(int r1, int r2, int r3) {
        b bVarN = N(r1);
        switch (r2) {
            case 1:
                bVarN.D = r3;
                return;
            case 2:
                bVarN.E = r3;
                return;
            case 3:
                bVarN.F = r3;
                return;
            case 4:
                bVarN.G = r3;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                bVarN.I = r3;
                return;
            case 7:
                bVarN.H = r3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void i(int r10, int r11) {
        int r3;
        int r4;
        int r6;
        int r7;
        float f2;
        c cVar;
        int r1;
        int r2;
        int r5;
        if (r11 == 0) {
            r2 = 0;
            r3 = 6;
            r4 = 0;
            r5 = 0;
            r6 = 7;
            r7 = 0;
            f2 = 0.5f;
            cVar = this;
            r1 = r10;
        } else {
            r3 = 7;
            r4 = 0;
            r6 = 6;
            r7 = 0;
            f2 = 0.5f;
            cVar = this;
            r1 = r10;
            r2 = r11;
            r5 = r11;
        }
        cVar.f(r1, r2, r3, r4, r5, r6, r7, f2);
    }

    public void i0(int r1, float f2) {
        N(r1).X = f2;
    }

    public void j(int r10, int r11, int r12, int r13, int r14, int r15, int r16, float f2) {
        t(r10, 6, r11, r12, r13);
        t(r10, 7, r14, r15, r16);
        this.f242a.get(Integer.valueOf(r10)).u = f2;
    }

    public void j0(int r1, float f2) {
        N(r1).Y = f2;
    }

    public void k(int r10, int r11) {
        int r3;
        int r4;
        int r6;
        int r7;
        float f2;
        c cVar;
        int r1;
        int r2;
        int r5;
        if (r11 == 0) {
            r2 = 0;
            r3 = 3;
            r4 = 0;
            r5 = 0;
            r6 = 4;
            r7 = 0;
            f2 = 0.5f;
            cVar = this;
            r1 = r10;
        } else {
            r3 = 4;
            r4 = 0;
            r6 = 3;
            r7 = 0;
            f2 = 0.5f;
            cVar = this;
            r1 = r10;
            r2 = r11;
            r5 = r11;
        }
        cVar.f(r1, r2, r3, r4, r5, r6, r7, f2);
    }

    public void k0(int r1, float f2) {
        N(r1).Z = f2;
    }

    public void l(int r10, int r11, int r12, int r13, int r14, int r15, int r16, float f2) {
        t(r10, 3, r11, r12, r13);
        t(r10, 4, r14, r15, r16);
        this.f242a.get(Integer.valueOf(r10)).v = f2;
    }

    public void l0(int r1, float f2) {
        N(r1).a0 = f2;
    }

    public void m(int r2) {
        this.f242a.remove(Integer.valueOf(r2));
    }

    public void m0(int r1, float f2) {
        N(r1).b0 = f2;
    }

    public void n(int r3, int r4) {
        if (this.f242a.containsKey(Integer.valueOf(r3))) {
            b bVar = this.f242a.get(Integer.valueOf(r3));
            switch (r4) {
                case 1:
                    bVar.i = -1;
                    bVar.h = -1;
                    bVar.D = -1;
                    bVar.K = -1;
                    return;
                case 2:
                    bVar.k = -1;
                    bVar.j = -1;
                    bVar.E = -1;
                    bVar.M = -1;
                    return;
                case 3:
                    bVar.m = -1;
                    bVar.l = -1;
                    bVar.F = -1;
                    bVar.L = -1;
                    return;
                case 4:
                    bVar.n = -1;
                    bVar.o = -1;
                    bVar.G = -1;
                    bVar.N = -1;
                    return;
                case 5:
                    bVar.p = -1;
                    return;
                case 6:
                    bVar.q = -1;
                    bVar.r = -1;
                    bVar.I = -1;
                    bVar.P = -1;
                    return;
                case 7:
                    bVar.s = -1;
                    bVar.t = -1;
                    bVar.H = -1;
                    bVar.O = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void n0(int r1, float f2, float f3) {
        b bVarN = N(r1);
        bVarN.d0 = f3;
        bVarN.c0 = f2;
    }

    public void o(Context context, int r3) {
        p((ConstraintLayout) LayoutInflater.from(context).inflate(r3, (ViewGroup) null));
    }

    public void o0(int r1, float f2) {
        N(r1).c0 = f2;
    }

    public void p(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f242a.clear();
        for (int r1 = 0; r1 < childCount; r1++) {
            View childAt = constraintLayout.getChildAt(r1);
            ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f242a.containsKey(Integer.valueOf(id))) {
                this.f242a.put(Integer.valueOf(id), new b());
            }
            b bVar = this.f242a.get(Integer.valueOf(id));
            bVar.f(id, aVar);
            bVar.J = childAt.getVisibility();
            if (Build.VERSION.SDK_INT >= 17) {
                bVar.U = childAt.getAlpha();
                bVar.X = childAt.getRotation();
                bVar.Y = childAt.getRotationX();
                bVar.Z = childAt.getRotationY();
                bVar.a0 = childAt.getScaleX();
                bVar.b0 = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    bVar.c0 = pivotX;
                    bVar.d0 = pivotY;
                }
                bVar.e0 = childAt.getTranslationX();
                bVar.f0 = childAt.getTranslationY();
                if (Build.VERSION.SDK_INT >= 21) {
                    bVar.g0 = childAt.getTranslationZ();
                    if (bVar.V) {
                        bVar.W = childAt.getElevation();
                    }
                }
            }
            if (childAt instanceof androidx.constraintlayout.widget.a) {
                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                bVar.r0 = aVar2.g();
                bVar.u0 = aVar2.getReferencedIds();
                bVar.s0 = aVar2.getType();
            }
        }
    }

    public void p0(int r1, float f2) {
        N(r1).d0 = f2;
    }

    public void q(c cVar) {
        this.f242a.clear();
        for (Integer num : cVar.f242a.keySet()) {
            this.f242a.put(num, cVar.f242a.get(num).clone());
        }
    }

    public void q0(int r1, float f2, float f3) {
        b bVarN = N(r1);
        bVarN.e0 = f2;
        bVarN.f0 = f3;
    }

    public void r(d dVar) {
        int childCount = dVar.getChildCount();
        this.f242a.clear();
        for (int r1 = 0; r1 < childCount; r1++) {
            View childAt = dVar.getChildAt(r1);
            d.a aVar = (d.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f242a.containsKey(Integer.valueOf(id))) {
                this.f242a.put(Integer.valueOf(id), new b());
            }
            b bVar = this.f242a.get(Integer.valueOf(id));
            if (childAt instanceof androidx.constraintlayout.widget.b) {
                bVar.h((androidx.constraintlayout.widget.b) childAt, id, aVar);
            }
            bVar.g(id, aVar);
        }
    }

    public void r0(int r1, float f2) {
        N(r1).e0 = f2;
    }

    public void s(int r10, int r11, int r12, int r13) {
        if (!this.f242a.containsKey(Integer.valueOf(r10))) {
            this.f242a.put(Integer.valueOf(r10), new b());
        }
        b bVar = this.f242a.get(Integer.valueOf(r10));
        switch (r11) {
            case 1:
                if (r13 == 1) {
                    bVar.h = r12;
                    bVar.i = -1;
                    return;
                } else if (r13 == 2) {
                    bVar.i = r12;
                    bVar.h = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + y0(r13) + " undefined");
                }
            case 2:
                if (r13 == 1) {
                    bVar.j = r12;
                    bVar.k = -1;
                    return;
                } else if (r13 == 2) {
                    bVar.k = r12;
                    bVar.j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + y0(r13) + " undefined");
                }
            case 3:
                if (r13 == 3) {
                    bVar.l = r12;
                    bVar.m = -1;
                    break;
                } else {
                    if (r13 != 4) {
                        throw new IllegalArgumentException("right to " + y0(r13) + " undefined");
                    }
                    bVar.m = r12;
                    bVar.l = -1;
                    break;
                }
            case 4:
                if (r13 == 4) {
                    bVar.o = r12;
                    bVar.n = -1;
                    break;
                } else {
                    if (r13 != 3) {
                        throw new IllegalArgumentException("right to " + y0(r13) + " undefined");
                    }
                    bVar.n = r12;
                    bVar.o = -1;
                    break;
                }
            case 5:
                if (r13 != 5) {
                    throw new IllegalArgumentException("right to " + y0(r13) + " undefined");
                }
                bVar.p = r12;
                bVar.o = -1;
                bVar.n = -1;
                bVar.l = -1;
                bVar.m = -1;
                return;
            case 6:
                if (r13 == 6) {
                    bVar.r = r12;
                    bVar.q = -1;
                    return;
                } else if (r13 == 7) {
                    bVar.q = r12;
                    bVar.r = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + y0(r13) + " undefined");
                }
            case 7:
                if (r13 == 7) {
                    bVar.t = r12;
                    bVar.s = -1;
                    return;
                } else if (r13 == 6) {
                    bVar.s = r12;
                    bVar.t = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + y0(r13) + " undefined");
                }
            default:
                throw new IllegalArgumentException(y0(r11) + " to " + y0(r13) + " unknown");
        }
        bVar.p = -1;
    }

    public void s0(int r1, float f2) {
        N(r1).f0 = f2;
    }

    public void t(int r10, int r11, int r12, int r13, int r14) {
        if (!this.f242a.containsKey(Integer.valueOf(r10))) {
            this.f242a.put(Integer.valueOf(r10), new b());
        }
        b bVar = this.f242a.get(Integer.valueOf(r10));
        switch (r11) {
            case 1:
                if (r13 == 1) {
                    bVar.h = r12;
                    bVar.i = -1;
                } else {
                    if (r13 != 2) {
                        throw new IllegalArgumentException("Left to " + y0(r13) + " undefined");
                    }
                    bVar.i = r12;
                    bVar.h = -1;
                }
                bVar.D = r14;
                return;
            case 2:
                if (r13 == 1) {
                    bVar.j = r12;
                    bVar.k = -1;
                } else {
                    if (r13 != 2) {
                        throw new IllegalArgumentException("right to " + y0(r13) + " undefined");
                    }
                    bVar.k = r12;
                    bVar.j = -1;
                }
                bVar.E = r14;
                return;
            case 3:
                if (r13 == 3) {
                    bVar.l = r12;
                    bVar.m = -1;
                } else {
                    if (r13 != 4) {
                        throw new IllegalArgumentException("right to " + y0(r13) + " undefined");
                    }
                    bVar.m = r12;
                    bVar.l = -1;
                }
                bVar.p = -1;
                bVar.F = r14;
                return;
            case 4:
                if (r13 == 4) {
                    bVar.o = r12;
                    bVar.n = -1;
                } else {
                    if (r13 != 3) {
                        throw new IllegalArgumentException("right to " + y0(r13) + " undefined");
                    }
                    bVar.n = r12;
                    bVar.o = -1;
                }
                bVar.p = -1;
                bVar.G = r14;
                return;
            case 5:
                if (r13 != 5) {
                    throw new IllegalArgumentException("right to " + y0(r13) + " undefined");
                }
                bVar.p = r12;
                bVar.o = -1;
                bVar.n = -1;
                bVar.l = -1;
                bVar.m = -1;
                return;
            case 6:
                if (r13 == 6) {
                    bVar.r = r12;
                    bVar.q = -1;
                } else {
                    if (r13 != 7) {
                        throw new IllegalArgumentException("right to " + y0(r13) + " undefined");
                    }
                    bVar.q = r12;
                    bVar.r = -1;
                }
                bVar.I = r14;
                return;
            case 7:
                if (r13 == 7) {
                    bVar.t = r12;
                    bVar.s = -1;
                } else {
                    if (r13 != 6) {
                        throw new IllegalArgumentException("right to " + y0(r13) + " undefined");
                    }
                    bVar.s = r12;
                    bVar.t = -1;
                }
                bVar.H = r14;
                return;
            default:
                throw new IllegalArgumentException(y0(r11) + " to " + y0(r13) + " unknown");
        }
    }

    public void t0(int r1, float f2) {
        N(r1).g0 = f2;
    }

    public void u(int r1, int r2, int r3, float f2) {
        b bVarN = N(r1);
        bVarN.x = r2;
        bVarN.y = r3;
        bVarN.z = f2;
    }

    public void u0(int r1, float f2) {
        N(r1).v = f2;
    }

    public void v(int r1, int r2) {
        N(r1).k0 = r2;
    }

    public void v0(int r1, int r2) {
        N(r1).T = r2;
    }

    public void w(int r1, int r2) {
        N(r1).j0 = r2;
    }

    public void w0(int r1, float f2) {
        N(r1).Q = f2;
    }

    public void x(int r1, int r2) {
        N(r1).f245c = r2;
    }

    public void x0(int r1, int r2) {
        N(r1).J = r2;
    }

    public void y(int r1, int r2) {
        N(r1).m0 = r2;
    }

    public void z(int r1, int r2) {
        N(r1).l0 = r2;
    }
}

package c.a.b.c.j;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.annotation.e;
import androidx.annotation.f;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k0;
import androidx.annotation.p;
import androidx.annotation.q;
import androidx.annotation.s0;
import androidx.annotation.t0;
import androidx.appcompat.app.d;
import b.i.p.f0;
import c.a.b.c.a;
import c.a.b.c.u.j;

/* loaded from: classes.dex */
public class b extends d.a {

    @f
    private static final int e = a.c.alertDialogStyle;

    @t0
    private static final int f = a.n.MaterialAlertDialog_MaterialComponents;

    @f
    private static final int g = a.c.materialAlertDialogTheme;

    /* renamed from: c, reason: collision with root package name */
    @i0
    private Drawable f1975c;

    @p
    @h0
    private final Rect d;

    public b(@h0 Context context) {
        this(context, 0);
    }

    public b(@h0 Context context, int r7) {
        super(P(context), S(context, r7));
        Context contextB = b();
        Resources.Theme theme = contextB.getTheme();
        this.d = c.a(contextB, e, f);
        int r0 = c.a.b.c.i.a.c(contextB, a.c.colorSurface, b.class.getCanonicalName());
        j jVar = new j(contextB, null, e, f);
        jVar.Y(contextB);
        jVar.n0(ColorStateList.valueOf(r0));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(b().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                jVar.j0(dimension);
            }
        }
        this.f1975c = jVar;
    }

    private static Context P(@h0 Context context) {
        int r0 = R(context);
        Context contextC = com.google.android.material.theme.a.a.c(context, null, e, f);
        return r0 == 0 ? contextC : new b.a.f.d(contextC, r0);
    }

    private static int R(@h0 Context context) {
        TypedValue typedValueA = c.a.b.c.r.b.a(context, g);
        if (typedValueA == null) {
            return 0;
        }
        return typedValueA.data;
    }

    private static int S(@h0 Context context, int r1) {
        return r1 == 0 ? R(context) : r1;
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: A0, reason: merged with bridge method [inline-methods] */
    public b G(@i0 Cursor cursor, int r2, @h0 String str, @i0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.G(cursor, r2, str, onClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public b H(@i0 ListAdapter listAdapter, int r2, @i0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.H(listAdapter, r2, onClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public b I(@i0 CharSequence[] charSequenceArr, int r2, @i0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.I(charSequenceArr, r2, onClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public b J(@s0 int r1) {
        return (b) super.J(r1);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public b K(@i0 CharSequence charSequence) {
        return (b) super.K(charSequence);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public b L(int r1) {
        return (b) super.L(r1);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public b M(@i0 View view) {
        return (b) super.M(view);
    }

    @i0
    public Drawable Q() {
        return this.f1975c;
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public b c(@i0 ListAdapter listAdapter, @i0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.c(listAdapter, onClickListener);
    }

    @h0
    public b U(@i0 Drawable drawable) {
        this.f1975c = drawable;
        return this;
    }

    @h0
    public b V(@k0 int r2) {
        this.d.bottom = r2;
        return this;
    }

    @h0
    public b W(@k0 int r3) {
        if (Build.VERSION.SDK_INT < 17 || b().getResources().getConfiguration().getLayoutDirection() != 1) {
            this.d.right = r3;
        } else {
            this.d.left = r3;
        }
        return this;
    }

    @h0
    public b X(@k0 int r3) {
        if (Build.VERSION.SDK_INT < 17 || b().getResources().getConfiguration().getLayoutDirection() != 1) {
            this.d.left = r3;
        } else {
            this.d.right = r3;
        }
        return this;
    }

    @h0
    public b Y(@k0 int r2) {
        this.d.top = r2;
        return this;
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public b d(boolean z) {
        return (b) super.d(z);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    public d a() {
        d dVarA = super.a();
        Window window = dVarA.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f1975c;
        if (drawable instanceof j) {
            ((j) drawable).m0(f0.P(decorView));
        }
        window.setBackgroundDrawable(c.b(this.f1975c, this.d));
        decorView.setOnTouchListener(new a(dVarA, this.d));
        return dVarA;
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public b e(@i0 Cursor cursor, @i0 DialogInterface.OnClickListener onClickListener, @h0 String str) {
        return (b) super.e(cursor, onClickListener, str);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public b f(@i0 View view) {
        return (b) super.f(view);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public b g(@q int r1) {
        return (b) super.g(r1);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public b h(@i0 Drawable drawable) {
        return (b) super.h(drawable);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public b i(@f int r1) {
        return (b) super.i(r1);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public b k(@e int r1, @i0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.k(r1, onClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public b l(@i0 CharSequence[] charSequenceArr, @i0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.l(charSequenceArr, onClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public b m(@s0 int r1) {
        return (b) super.m(r1);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public b n(@i0 CharSequence charSequence) {
        return (b) super.n(charSequence);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public b o(@e int r1, @i0 boolean[] zArr, @i0 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (b) super.o(r1, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public b p(@i0 Cursor cursor, @h0 String str, @h0 String str2, @i0 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (b) super.p(cursor, str, str2, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public b q(@i0 CharSequence[] charSequenceArr, @i0 boolean[] zArr, @i0 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (b) super.q(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public b r(@s0 int r1, @i0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.r(r1, onClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public b s(@i0 CharSequence charSequence, @i0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.s(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public b t(@i0 Drawable drawable) {
        return (b) super.t(drawable);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public b u(@s0 int r1, @i0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.u(r1, onClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public b v(@i0 CharSequence charSequence, @i0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.v(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public b w(@i0 Drawable drawable) {
        return (b) super.w(drawable);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public b x(@i0 DialogInterface.OnCancelListener onCancelListener) {
        return (b) super.x(onCancelListener);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public b y(@i0 DialogInterface.OnDismissListener onDismissListener) {
        return (b) super.y(onDismissListener);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public b z(@i0 AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (b) super.z(onItemSelectedListener);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public b A(@i0 DialogInterface.OnKeyListener onKeyListener) {
        return (b) super.A(onKeyListener);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public b B(@s0 int r1, @i0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.B(r1, onClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public b C(@i0 CharSequence charSequence, @i0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.C(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public b D(@i0 Drawable drawable) {
        return (b) super.D(drawable);
    }

    @Override // androidx.appcompat.app.d.a
    @h0
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public b F(@e int r1, int r2, @i0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.F(r1, r2, onClickListener);
    }
}

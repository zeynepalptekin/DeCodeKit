package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.annotation.s0;
import androidx.annotation.t0;
import b.i.p.f0;
import c.a.b.c.a;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class l<S> extends androidx.fragment.app.c {
    private static final String S0 = "OVERRIDE_THEME_RES_ID";
    private static final String T0 = "DATE_SELECTOR_KEY";
    private static final String U0 = "CALENDAR_CONSTRAINTS_KEY";
    private static final String V0 = "TITLE_TEXT_RES_ID_KEY";
    private static final String W0 = "TITLE_TEXT_KEY";
    private static final String X0 = "INPUT_MODE_KEY";
    static final Object Y0 = "CONFIRM_BUTTON_TAG";
    static final Object Z0 = "CANCEL_BUTTON_TAG";
    static final Object a1 = "TOGGLE_BUTTON_TAG";
    public static final int b1 = 0;
    public static final int c1 = 1;
    private final LinkedHashSet<m<? super S>> B0 = new LinkedHashSet<>();
    private final LinkedHashSet<View.OnClickListener> C0 = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnCancelListener> D0 = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnDismissListener> E0 = new LinkedHashSet<>();

    @t0
    private int F0;

    @i0
    private com.google.android.material.datepicker.f<S> G0;
    private t<S> H0;

    @i0
    private com.google.android.material.datepicker.a I0;
    private k<S> J0;

    @s0
    private int K0;
    private CharSequence L0;
    private boolean M0;
    private int N0;
    private TextView O0;
    private CheckableImageButton P0;

    @i0
    private c.a.b.c.u.j Q0;
    private Button R0;

    class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = l.this.B0.iterator();
            while (it.hasNext()) {
                ((m) it.next()).a(l.this.Y2());
            }
            l.this.o2();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = l.this.C0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            l.this.o2();
        }
    }

    class c extends s<S> {
        c() {
        }

        @Override // com.google.android.material.datepicker.s
        void a() {
            l.this.R0.setEnabled(false);
        }

        @Override // com.google.android.material.datepicker.s
        public void b(S s) {
            l.this.k3();
            l.this.R0.setEnabled(l.this.G0.x());
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l.this.R0.setEnabled(l.this.G0.x());
            l.this.P0.toggle();
            l lVar = l.this;
            lVar.l3(lVar.P0);
            l.this.h3();
        }
    }

    public static final class e<S> {

        /* renamed from: a, reason: collision with root package name */
        final com.google.android.material.datepicker.f<S> f6674a;

        /* renamed from: c, reason: collision with root package name */
        com.google.android.material.datepicker.a f6676c;

        /* renamed from: b, reason: collision with root package name */
        int f6675b = 0;
        int d = 0;
        CharSequence e = null;

        @i0
        S f = null;
        int g = 0;

        private e(com.google.android.material.datepicker.f<S> fVar) {
            this.f6674a = fVar;
        }

        @h0
        @p0({p0.a.LIBRARY_GROUP})
        public static <S> e<S> b(@h0 com.google.android.material.datepicker.f<S> fVar) {
            return new e<>(fVar);
        }

        @h0
        public static e<Long> c() {
            return new e<>(new v());
        }

        @h0
        public static e<b.i.o.f<Long, Long>> d() {
            return new e<>(new u());
        }

        @h0
        public l<S> a() {
            if (this.f6676c == null) {
                this.f6676c = new a.b().a();
            }
            if (this.d == 0) {
                this.d = this.f6674a.T();
            }
            S s = this.f;
            if (s != null) {
                this.f6674a.v(s);
            }
            return l.c3(this);
        }

        @h0
        public e<S> e(com.google.android.material.datepicker.a aVar) {
            this.f6676c = aVar;
            return this;
        }

        @h0
        public e<S> f(int r1) {
            this.g = r1;
            return this;
        }

        @h0
        public e<S> g(S s) {
            this.f = s;
            return this;
        }

        @h0
        public e<S> h(@t0 int r1) {
            this.f6675b = r1;
            return this;
        }

        @h0
        public e<S> i(@s0 int r1) {
            this.d = r1;
            this.e = null;
            return this;
        }

        @h0
        public e<S> j(@i0 CharSequence charSequence) {
            this.e = charSequence;
            this.d = 0;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP})
    public @interface f {
    }

    @h0
    private static Drawable U2(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, b.a.b.a.a.d(context, a.g.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], b.a.b.a.a.d(context, a.g.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    private static int V2(@h0 Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(a.f.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(a.f.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(a.f.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelSize(a.f.mtrl_calendar_days_of_week_height) + (q.h * resources.getDimensionPixelSize(a.f.mtrl_calendar_day_height)) + ((q.h - 1) * resources.getDimensionPixelOffset(a.f.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(a.f.mtrl_calendar_bottom_padding);
    }

    private static int X2(@h0 Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(a.f.mtrl_calendar_content_padding);
        int r1 = p.j().h;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(a.f.mtrl_calendar_day_width) * r1) + ((r1 - 1) * resources.getDimensionPixelOffset(a.f.mtrl_calendar_month_horizontal_padding));
    }

    private int Z2(Context context) {
        int r0 = this.F0;
        return r0 != 0 ? r0 : this.G0.o(context);
    }

    private void a3(Context context) {
        this.P0.setTag(a1);
        this.P0.setImageDrawable(U2(context));
        this.P0.setChecked(this.N0 != 0);
        f0.u1(this.P0, null);
        l3(this.P0);
        this.P0.setOnClickListener(new d());
    }

    static boolean b3(@h0 Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(c.a.b.c.r.b.f(context, a.c.materialCalendarStyle, k.class.getCanonicalName()), new int[]{R.attr.windowFullscreen});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @h0
    static <S> l<S> c3(@h0 e<S> eVar) {
        l<S> lVar = new l<>();
        Bundle bundle = new Bundle();
        bundle.putInt(S0, eVar.f6675b);
        bundle.putParcelable(T0, eVar.f6674a);
        bundle.putParcelable(U0, eVar.f6676c);
        bundle.putInt(V0, eVar.d);
        bundle.putCharSequence(W0, eVar.e);
        bundle.putInt(X0, eVar.g);
        lVar.N1(bundle);
        return lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h3() {
        this.J0 = k.G2(this.G0, Z2(C1()), this.I0);
        this.H0 = this.P0.isChecked() ? o.s2(this.G0, this.I0) : this.J0;
        k3();
        androidx.fragment.app.r rVarB = t().b();
        rVarB.y(a.h.mtrl_calendar_frame, this.H0);
        rVarB.p();
        this.H0.o2(new c());
    }

    public static long i3() {
        return p.j().j;
    }

    public static long j3() {
        return y.t().getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3() {
        String strW2 = W2();
        this.O0.setContentDescription(String.format(Q(a.m.mtrl_picker_announce_current_selection), strW2));
        this.O0.setText(strW2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l3(@h0 CheckableImageButton checkableImageButton) {
        this.P0.setContentDescription(checkableImageButton.getContext().getString(this.P0.isChecked() ? a.m.mtrl_picker_toggle_to_calendar_input_mode : a.m.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // androidx.fragment.app.Fragment
    @h0
    public final View C0(@h0 LayoutInflater layoutInflater, @i0 ViewGroup viewGroup, @i0 Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.M0 ? a.k.mtrl_picker_fullscreen : a.k.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.M0) {
            viewInflate.findViewById(a.h.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(X2(context), -2));
        } else {
            View viewFindViewById = viewInflate.findViewById(a.h.mtrl_calendar_main_pane);
            View viewFindViewById2 = viewInflate.findViewById(a.h.mtrl_calendar_frame);
            viewFindViewById.setLayoutParams(new LinearLayout.LayoutParams(X2(context), -1));
            viewFindViewById2.setMinimumHeight(V2(C1()));
        }
        TextView textView = (TextView) viewInflate.findViewById(a.h.mtrl_picker_header_selection_text);
        this.O0 = textView;
        f0.w1(textView, 1);
        this.P0 = (CheckableImageButton) viewInflate.findViewById(a.h.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) viewInflate.findViewById(a.h.mtrl_picker_title_text);
        CharSequence charSequence = this.L0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.K0);
        }
        a3(context);
        this.R0 = (Button) viewInflate.findViewById(a.h.confirm_button);
        if (this.G0.x()) {
            this.R0.setEnabled(true);
        } else {
            this.R0.setEnabled(false);
        }
        this.R0.setTag(Y0);
        this.R0.setOnClickListener(new a());
        Button button = (Button) viewInflate.findViewById(a.h.cancel_button);
        button.setTag(Z0);
        button.setOnClickListener(new b());
        return viewInflate;
    }

    public boolean M2(DialogInterface.OnCancelListener onCancelListener) {
        return this.D0.add(onCancelListener);
    }

    public boolean N2(DialogInterface.OnDismissListener onDismissListener) {
        return this.E0.add(onDismissListener);
    }

    public boolean O2(View.OnClickListener onClickListener) {
        return this.C0.add(onClickListener);
    }

    public boolean P2(m<? super S> mVar) {
        return this.B0.add(mVar);
    }

    public void Q2() {
        this.D0.clear();
    }

    public void R2() {
        this.E0.clear();
    }

    public void S2() {
        this.C0.clear();
    }

    public void T2() {
        this.B0.clear();
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public final void U0(@h0 Bundle bundle) {
        super.U0(bundle);
        bundle.putInt(S0, this.F0);
        bundle.putParcelable(T0, this.G0);
        a.b bVar = new a.b(this.I0);
        if (this.J0.D2() != null) {
            bVar.c(this.J0.D2().j);
        }
        bundle.putParcelable(U0, bVar.a());
        bundle.putInt(V0, this.K0);
        bundle.putCharSequence(W0, this.L0);
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void V0() throws Resources.NotFoundException {
        super.V0();
        Window window = w2().getWindow();
        if (this.M0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.Q0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = K().getDimensionPixelOffset(a.f.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.Q0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new c.a.b.c.j.a(w2(), rect));
        }
        h3();
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void W0() {
        this.H0.p2();
        super.W0();
    }

    public String W2() {
        return this.G0.n(u());
    }

    @i0
    public final S Y2() {
        return this.G0.G();
    }

    public boolean d3(DialogInterface.OnCancelListener onCancelListener) {
        return this.D0.remove(onCancelListener);
    }

    public boolean e3(DialogInterface.OnDismissListener onDismissListener) {
        return this.E0.remove(onDismissListener);
    }

    public boolean f3(View.OnClickListener onClickListener) {
        return this.C0.remove(onClickListener);
    }

    public boolean g3(m<? super S> mVar) {
        return this.B0.remove(mVar);
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@h0 DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.D0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@h0 DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.E0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) X();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.c
    @h0
    public final Dialog v2(@i0 Bundle bundle) {
        Dialog dialog = new Dialog(C1(), Z2(C1()));
        Context context = dialog.getContext();
        this.M0 = b3(context);
        int r1 = c.a.b.c.r.b.f(context, a.c.colorSurface, l.class.getCanonicalName());
        c.a.b.c.u.j jVar = new c.a.b.c.u.j(context, null, a.c.materialCalendarStyle, a.n.Widget_MaterialComponents_MaterialCalendar);
        this.Q0 = jVar;
        jVar.Y(context);
        this.Q0.n0(ColorStateList.valueOf(r1));
        this.Q0.m0(f0.P(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public final void y0(@i0 Bundle bundle) {
        super.y0(bundle);
        if (bundle == null) {
            bundle = s();
        }
        this.F0 = bundle.getInt(S0);
        this.G0 = (com.google.android.material.datepicker.f) bundle.getParcelable(T0);
        this.I0 = (com.google.android.material.datepicker.a) bundle.getParcelable(U0);
        this.K0 = bundle.getInt(V0);
        this.L0 = bundle.getCharSequence(W0);
        this.N0 = bundle.getInt(X0);
    }
}

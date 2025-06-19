package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.annotation.s0;
import androidx.annotation.t0;
import androidx.appcompat.app.AlertController;
import b.a.a;

/* loaded from: classes.dex */
public class d extends i implements DialogInterface {
    static final int g = 0;
    static final int h = 1;
    final AlertController f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final AlertController.f f51a;

        /* renamed from: b, reason: collision with root package name */
        private final int f52b;

        public a(@h0 Context context) {
            this(context, d.j(context, 0));
        }

        public a(@h0 Context context, @t0 int r5) {
            this.f51a = new AlertController.f(new ContextThemeWrapper(context, d.j(context, r5)));
            this.f52b = r5;
        }

        public a A(DialogInterface.OnKeyListener onKeyListener) {
            this.f51a.u = onKeyListener;
            return this;
        }

        public a B(@s0 int r3, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f51a;
            fVar.i = fVar.f28a.getText(r3);
            this.f51a.k = onClickListener;
            return this;
        }

        public a C(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f51a;
            fVar.i = charSequence;
            fVar.k = onClickListener;
            return this;
        }

        public a D(Drawable drawable) {
            this.f51a.j = drawable;
            return this;
        }

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public a E(boolean z) {
            this.f51a.Q = z;
            return this;
        }

        public a F(@androidx.annotation.e int r3, int r4, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f51a;
            fVar.v = fVar.f28a.getResources().getTextArray(r3);
            AlertController.f fVar2 = this.f51a;
            fVar2.x = onClickListener;
            fVar2.I = r4;
            fVar2.H = true;
            return this;
        }

        public a G(Cursor cursor, int r3, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f51a;
            fVar.K = cursor;
            fVar.x = onClickListener;
            fVar.I = r3;
            fVar.L = str;
            fVar.H = true;
            return this;
        }

        public a H(ListAdapter listAdapter, int r3, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f51a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            fVar.I = r3;
            fVar.H = true;
            return this;
        }

        public a I(CharSequence[] charSequenceArr, int r3, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f51a;
            fVar.v = charSequenceArr;
            fVar.x = onClickListener;
            fVar.I = r3;
            fVar.H = true;
            return this;
        }

        public a J(@s0 int r3) {
            AlertController.f fVar = this.f51a;
            fVar.f = fVar.f28a.getText(r3);
            return this;
        }

        public a K(@i0 CharSequence charSequence) {
            this.f51a.f = charSequence;
            return this;
        }

        public a L(int r3) {
            AlertController.f fVar = this.f51a;
            fVar.z = null;
            fVar.y = r3;
            fVar.E = false;
            return this;
        }

        public a M(View view) {
            AlertController.f fVar = this.f51a;
            fVar.z = view;
            fVar.y = 0;
            fVar.E = false;
            return this;
        }

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public a N(View view, int r3, int r4, int r5, int r6) {
            AlertController.f fVar = this.f51a;
            fVar.z = view;
            fVar.y = 0;
            fVar.E = true;
            fVar.A = r3;
            fVar.B = r4;
            fVar.C = r5;
            fVar.D = r6;
            return this;
        }

        public d O() {
            d dVarA = a();
            dVarA.show();
            return dVarA;
        }

        @h0
        public d a() {
            d dVar = new d(this.f51a.f28a, this.f52b);
            this.f51a.a(dVar.f);
            dVar.setCancelable(this.f51a.r);
            if (this.f51a.r) {
                dVar.setCanceledOnTouchOutside(true);
            }
            dVar.setOnCancelListener(this.f51a.s);
            dVar.setOnDismissListener(this.f51a.t);
            DialogInterface.OnKeyListener onKeyListener = this.f51a.u;
            if (onKeyListener != null) {
                dVar.setOnKeyListener(onKeyListener);
            }
            return dVar;
        }

        @h0
        public Context b() {
            return this.f51a.f28a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f51a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            return this;
        }

        public a d(boolean z) {
            this.f51a.r = z;
            return this;
        }

        public a e(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.f fVar = this.f51a;
            fVar.K = cursor;
            fVar.L = str;
            fVar.x = onClickListener;
            return this;
        }

        public a f(@i0 View view) {
            this.f51a.g = view;
            return this;
        }

        public a g(@androidx.annotation.q int r2) {
            this.f51a.f30c = r2;
            return this;
        }

        public a h(@i0 Drawable drawable) {
            this.f51a.d = drawable;
            return this;
        }

        public a i(@androidx.annotation.f int r4) {
            TypedValue typedValue = new TypedValue();
            this.f51a.f28a.getTheme().resolveAttribute(r4, typedValue, true);
            this.f51a.f30c = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public a j(boolean z) {
            this.f51a.N = z;
            return this;
        }

        public a k(@androidx.annotation.e int r3, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f51a;
            fVar.v = fVar.f28a.getResources().getTextArray(r3);
            this.f51a.x = onClickListener;
            return this;
        }

        public a l(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f51a;
            fVar.v = charSequenceArr;
            fVar.x = onClickListener;
            return this;
        }

        public a m(@s0 int r3) {
            AlertController.f fVar = this.f51a;
            fVar.h = fVar.f28a.getText(r3);
            return this;
        }

        public a n(@i0 CharSequence charSequence) {
            this.f51a.h = charSequence;
            return this;
        }

        public a o(@androidx.annotation.e int r3, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f51a;
            fVar.v = fVar.f28a.getResources().getTextArray(r3);
            AlertController.f fVar2 = this.f51a;
            fVar2.J = onMultiChoiceClickListener;
            fVar2.F = zArr;
            fVar2.G = true;
            return this;
        }

        public a p(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f51a;
            fVar.K = cursor;
            fVar.J = onMultiChoiceClickListener;
            fVar.M = str;
            fVar.L = str2;
            fVar.G = true;
            return this;
        }

        public a q(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f51a;
            fVar.v = charSequenceArr;
            fVar.J = onMultiChoiceClickListener;
            fVar.F = zArr;
            fVar.G = true;
            return this;
        }

        public a r(@s0 int r3, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f51a;
            fVar.l = fVar.f28a.getText(r3);
            this.f51a.n = onClickListener;
            return this;
        }

        public a s(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f51a;
            fVar.l = charSequence;
            fVar.n = onClickListener;
            return this;
        }

        public a t(Drawable drawable) {
            this.f51a.m = drawable;
            return this;
        }

        public a u(@s0 int r3, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f51a;
            fVar.o = fVar.f28a.getText(r3);
            this.f51a.q = onClickListener;
            return this;
        }

        public a v(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f51a;
            fVar.o = charSequence;
            fVar.q = onClickListener;
            return this;
        }

        public a w(Drawable drawable) {
            this.f51a.p = drawable;
            return this;
        }

        public a x(DialogInterface.OnCancelListener onCancelListener) {
            this.f51a.s = onCancelListener;
            return this;
        }

        public a y(DialogInterface.OnDismissListener onDismissListener) {
            this.f51a.t = onDismissListener;
            return this;
        }

        public a z(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f51a.O = onItemSelectedListener;
            return this;
        }
    }

    protected d(@h0 Context context) {
        this(context, 0);
    }

    protected d(@h0 Context context, @t0 int r3) {
        super(context, j(context, r3));
        this.f = new AlertController(getContext(), this, getWindow());
    }

    protected d(@h0 Context context, boolean z, @i0 DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }

    static int j(@h0 Context context, @t0 int r3) {
        if (((r3 >>> 24) & 255) >= 1) {
            return r3;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.b.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public Button f(int r2) {
        return this.f.c(r2);
    }

    public ListView i() {
        return this.f.e();
    }

    public void l(int r7, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f.l(r7, charSequence, onClickListener, null, null);
    }

    public void m(int r7, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.f.l(r7, charSequence, onClickListener, null, drawable);
    }

    public void n(int r7, CharSequence charSequence, Message message) {
        this.f.l(r7, charSequence, null, message, null);
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    void o(int r2) {
        this.f.m(r2);
    }

    @Override // androidx.appcompat.app.i, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r2, KeyEvent keyEvent) {
        if (this.f.h(r2, keyEvent)) {
            return true;
        }
        return super.onKeyDown(r2, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int r2, KeyEvent keyEvent) {
        if (this.f.i(r2, keyEvent)) {
            return true;
        }
        return super.onKeyUp(r2, keyEvent);
    }

    public void p(View view) {
        this.f.n(view);
    }

    public void q(int r2) {
        this.f.o(r2);
    }

    public void r(Drawable drawable) {
        this.f.p(drawable);
    }

    public void s(int r4) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(r4, typedValue, true);
        this.f.o(typedValue.resourceId);
    }

    @Override // androidx.appcompat.app.i, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f.s(charSequence);
    }

    public void t(CharSequence charSequence) {
        this.f.q(charSequence);
    }

    public void u(View view) {
        this.f.u(view);
    }

    public void v(View view, int r8, int r9, int r10, int r11) {
        this.f.v(view, r8, r9, r10, r11);
    }
}

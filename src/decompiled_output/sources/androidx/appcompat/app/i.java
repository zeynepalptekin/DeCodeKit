package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.c0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.annotation.w;
import b.a.a;
import b.a.f.b;
import b.i.p.j;

/* loaded from: classes.dex */
public class i extends Dialog implements f {
    private g d;
    private final j.a e;

    class a implements j.a {
        a() {
        }

        @Override // b.i.p.j.a
        public boolean f(KeyEvent keyEvent) {
            return i.this.d(keyEvent);
        }
    }

    public i(Context context) {
        this(context, 0);
    }

    public i(Context context, int r3) {
        super(context, c(context, r3));
        this.e = new a();
        g gVarA = a();
        gVarA.R(c(context, r3));
        gVarA.z(null);
    }

    protected i(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.e = new a();
    }

    private static int c(Context context, int r3) {
        if (r3 != 0) {
            return r3;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.b.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public g a() {
        if (this.d == null) {
            this.d = g.j(this, this);
        }
        return this.d;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().d(view, layoutParams);
    }

    public androidx.appcompat.app.a b() {
        return a().s();
    }

    boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a().A();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return b.i.p.j.e(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    public boolean e(int r2) {
        return a().I(r2);
    }

    @Override // android.app.Dialog
    @i0
    public <T extends View> T findViewById(@w int r2) {
        return (T) a().n(r2);
    }

    @Override // androidx.appcompat.app.f
    public void g(b.a.f.b bVar) {
    }

    @Override // androidx.appcompat.app.f
    public void h(b.a.f.b bVar) {
    }

    @Override // android.app.Dialog
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void invalidateOptionsMenu() {
        a().v();
    }

    @Override // androidx.appcompat.app.f
    @i0
    public b.a.f.b k(b.a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        a().u();
        super.onCreate(bundle);
        a().z(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        a().F();
    }

    @Override // android.app.Dialog
    public void setContentView(@c0 int r2) {
        a().K(r2);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().L(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().M(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int r3) {
        super.setTitle(r3);
        a().S(getContext().getString(r3));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().S(charSequence);
    }
}

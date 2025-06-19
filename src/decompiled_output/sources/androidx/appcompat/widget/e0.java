package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.annotation.p0;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;

@androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface e0 {
    void A(CharSequence charSequence);

    int B();

    int C();

    void D(Drawable drawable);

    void E(SparseArray<Parcelable> sparseArray);

    void F(int r1);

    Menu G();

    void H(int r1);

    boolean I();

    int J();

    void K(View view);

    void L(int r1);

    b.i.p.j0 M(int r1, long j);

    void N(int r1);

    void O();

    int P();

    void Q();

    void R(Drawable drawable);

    void S(boolean z);

    void T(int r1);

    void a(Drawable drawable);

    void b(Menu menu, n.a aVar);

    boolean c();

    void collapseActionView();

    void d();

    boolean e();

    boolean f();

    boolean g();

    Context getContext();

    int getHeight();

    CharSequence getTitle();

    boolean h();

    boolean i();

    boolean j();

    void k(int r1);

    void l();

    void m(n.a aVar, g.a aVar2);

    View n();

    void o(r0 r0Var);

    ViewGroup p();

    void q(boolean z);

    void r(Drawable drawable);

    int s();

    void setIcon(int r1);

    void setIcon(Drawable drawable);

    void setLogo(int r1);

    void setTitle(CharSequence charSequence);

    void setVisibility(int r1);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener);

    void u(SparseArray<Parcelable> sparseArray);

    boolean v();

    boolean w();

    void x(int r1);

    CharSequence y();

    void z(CharSequence charSequence);
}

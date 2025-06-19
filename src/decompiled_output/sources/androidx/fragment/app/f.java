package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.h0;
import androidx.annotation.i0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final h<?> f428a;

    private f(h<?> hVar) {
        this.f428a = hVar;
    }

    @h0
    public static f b(@h0 h<?> hVar) {
        return new f((h) b.i.o.i.g(hVar, "callbacks == null"));
    }

    @i0
    public Fragment A(@h0 String str) {
        return this.f428a.h.J0(str);
    }

    @h0
    public List<Fragment> B(@SuppressLint({"UnknownNullness"}) List<Fragment> list) {
        return this.f428a.h.P0();
    }

    public int C() {
        return this.f428a.h.O0();
    }

    @h0
    public i D() {
        return this.f428a.h;
    }

    @SuppressLint({"UnknownNullness"})
    @Deprecated
    public b.q.b.a E() {
        throw new UnsupportedOperationException("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    }

    public void F() {
        this.f428a.h.i1();
    }

    @i0
    public View G(@i0 View view, @h0 String str, @h0 Context context, @h0 AttributeSet attributeSet) {
        return this.f428a.h.onCreateView(view, str, context, attributeSet);
    }

    @Deprecated
    public void H() {
    }

    @Deprecated
    public void I(@i0 Parcelable parcelable, @i0 k kVar) {
        this.f428a.h.r1(parcelable, kVar);
    }

    @Deprecated
    public void J(@i0 Parcelable parcelable, @i0 List<Fragment> list) {
        this.f428a.h.r1(parcelable, new k(list, null, null));
    }

    @Deprecated
    public void K(@SuppressLint({"UnknownNullness"}) b.f.i<String, b.q.b.a> iVar) {
    }

    public void L(@i0 Parcelable parcelable) {
        h<?> hVar = this.f428a;
        if (!(hVar instanceof androidx.lifecycle.x)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        hVar.h.s1(parcelable);
    }

    @i0
    @Deprecated
    public b.f.i<String, b.q.b.a> M() {
        return null;
    }

    @i0
    @Deprecated
    public k N() {
        return this.f428a.h.t1();
    }

    @i0
    @Deprecated
    public List<Fragment> O() {
        k kVarT1 = this.f428a.h.t1();
        if (kVarT1 == null || kVarT1.b() == null) {
            return null;
        }
        return new ArrayList(kVarT1.b());
    }

    @i0
    public Parcelable P() {
        return this.f428a.h.v1();
    }

    public void a(@i0 Fragment fragment) {
        h<?> hVar = this.f428a;
        hVar.h.I(hVar, hVar, fragment);
    }

    public void c() {
        this.f428a.h.R();
    }

    public void d(@h0 Configuration configuration) {
        this.f428a.h.S(configuration);
    }

    public boolean e(@h0 MenuItem menuItem) {
        return this.f428a.h.T(menuItem);
    }

    public void f() {
        this.f428a.h.U();
    }

    public boolean g(@h0 Menu menu, @h0 MenuInflater menuInflater) {
        return this.f428a.h.V(menu, menuInflater);
    }

    public void h() {
        this.f428a.h.W();
    }

    public void i() {
        this.f428a.h.X();
    }

    public void j() {
        this.f428a.h.Y();
    }

    public void k(boolean z) {
        this.f428a.h.Z(z);
    }

    public boolean l(@h0 MenuItem menuItem) {
        return this.f428a.h.o0(menuItem);
    }

    public void m(@h0 Menu menu) {
        this.f428a.h.p0(menu);
    }

    public void n() {
        this.f428a.h.r0();
    }

    public void o(boolean z) {
        this.f428a.h.s0(z);
    }

    public boolean p(@h0 Menu menu) {
        return this.f428a.h.t0(menu);
    }

    @Deprecated
    public void q() {
    }

    public void r() {
        this.f428a.h.v0();
    }

    public void s() {
        this.f428a.h.w0();
    }

    public void t() {
        this.f428a.h.y0();
    }

    @Deprecated
    public void u() {
    }

    @Deprecated
    public void v() {
    }

    @Deprecated
    public void w() {
    }

    @Deprecated
    public void x(boolean z) {
    }

    @Deprecated
    public void y(@h0 String str, @i0 FileDescriptor fileDescriptor, @h0 PrintWriter printWriter, @i0 String[] strArr) {
    }

    public boolean z() {
        return this.f428a.h.E0();
    }
}

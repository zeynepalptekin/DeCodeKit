package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.c0;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.t0;
import androidx.annotation.w;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.f1;
import androidx.core.app.a0;
import b.a.f.b;

/* loaded from: classes.dex */
public class e extends androidx.fragment.app.d implements f, a0.a, b.c {
    private g A;
    private Resources B;

    public e() {
    }

    @androidx.annotation.n
    public e(@c0 int r1) {
        super(r1);
    }

    private boolean R(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // androidx.fragment.app.d
    public void H() {
        K().v();
    }

    @h0
    public g K() {
        if (this.A == null) {
            this.A = g.i(this, this);
        }
        return this.A;
    }

    @i0
    public a L() {
        return K().s();
    }

    public void M(@h0 a0 a0Var) {
        a0Var.i(this);
    }

    protected void N(int r1) {
    }

    public void O(@h0 a0 a0Var) {
    }

    @Deprecated
    public void P() {
    }

    public boolean Q() {
        Intent intentI = i();
        if (intentI == null) {
            return false;
        }
        if (!a0(intentI)) {
            Y(intentI);
            return true;
        }
        a0 a0VarN = a0.n(this);
        M(a0VarN);
        O(a0VarN);
        a0VarN.y();
        try {
            androidx.core.app.a.u(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public void S(@i0 Toolbar toolbar) {
        K().Q(toolbar);
    }

    @Deprecated
    public void T(int r1) {
    }

    @Deprecated
    public void U(boolean z) {
    }

    @Deprecated
    public void V(boolean z) {
    }

    @Deprecated
    public void W(boolean z) {
    }

    @i0
    public b.a.f.b X(@h0 b.a aVar) {
        return K().T(aVar);
    }

    public void Y(@h0 Intent intent) {
        androidx.core.app.n.g(this, intent);
    }

    public boolean Z(int r2) {
        return K().I(r2);
    }

    @Override // androidx.appcompat.app.b.c
    @i0
    public b.InterfaceC0012b a() {
        return K().p();
    }

    public boolean a0(@h0 Intent intent) {
        return androidx.core.app.n.h(this, intent);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        K().d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(K().h(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        a aVarL = L();
        if (getWindow().hasFeature(0)) {
            if (aVarL == null || !aVarL.k()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.j, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a aVarL = L();
        if (keyCode == 82 && aVarL != null && aVarL.K(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(@w int r2) {
        return (T) K().n(r2);
    }

    @Override // androidx.appcompat.app.f
    @androidx.annotation.i
    public void g(@h0 b.a.f.b bVar) {
    }

    @Override // android.app.Activity
    @h0
    public MenuInflater getMenuInflater() {
        return K().r();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.B == null && f1.c()) {
            this.B = new f1(this, super.getResources());
        }
        Resources resources = this.B;
        return resources == null ? super.getResources() : resources;
    }

    @Override // androidx.appcompat.app.f
    @androidx.annotation.i
    public void h(@h0 b.a.f.b bVar) {
    }

    @Override // androidx.core.app.a0.a
    @i0
    public Intent i() {
        return androidx.core.app.n.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        K().v();
    }

    @Override // androidx.appcompat.app.f
    @i0
    public b.a.f.b k(@h0 b.a aVar) {
        return null;
    }

    @Override // androidx.fragment.app.d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@h0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.B != null) {
            this.B.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        K().y(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        P();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.j, android.app.Activity
    protected void onCreate(@i0 Bundle bundle) {
        g gVarK = K();
        gVarK.u();
        gVarK.z(bundle);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        K().A();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r2, KeyEvent keyEvent) {
        if (R(keyEvent)) {
            return true;
        }
        return super.onKeyDown(r2, keyEvent);
    }

    @Override // androidx.fragment.app.d, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int r2, @h0 MenuItem menuItem) {
        if (super.onMenuItemSelected(r2, menuItem)) {
            return true;
        }
        a aVarL = L();
        if (menuItem.getItemId() != 16908332 || aVarL == null || (aVarL.o() & 4) == 0) {
            return false;
        }
        return Q();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int r1, Menu menu) {
        return super.onMenuOpened(r1, menu);
    }

    @Override // androidx.fragment.app.d, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int r1, @h0 Menu menu) {
        super.onPanelClosed(r1, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(@i0 Bundle bundle) {
        super.onPostCreate(bundle);
        K().B(bundle);
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        K().C();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.j, android.app.Activity
    protected void onSaveInstanceState(@h0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        K().D(bundle);
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    protected void onStart() {
        super.onStart();
        K().E();
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    protected void onStop() {
        super.onStop();
        K().F();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int r2) {
        super.onTitleChanged(charSequence, r2);
        K().S(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        a aVarL = L();
        if (getWindow().hasFeature(0)) {
            if (aVarL == null || !aVarL.L()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public void setContentView(@c0 int r2) {
        K().K(r2);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        K().L(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        K().M(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(@t0 int r2) {
        super.setTheme(r2);
        K().R(r2);
    }
}

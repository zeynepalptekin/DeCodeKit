package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.lifecycle.g;
import b.i.p.j;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class j extends Activity implements androidx.lifecycle.j, j.a {
    private b.f.i<Class<? extends a>, a> d = new b.f.i<>();
    private androidx.lifecycle.k e = new androidx.lifecycle.k(this);

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static class a {
    }

    @h0
    public androidx.lifecycle.g b() {
        return this.e;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !b.i.p.j.d(decorView, keyEvent)) {
            return b.i.p.j.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !b.i.p.j.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // b.i.p.j.a
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public <T extends a> T l(Class<T> cls) {
        return (T) this.d.get(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public void m(a aVar) {
        this.d.put(aVar.getClass(), aVar);
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    protected void onCreate(@i0 Bundle bundle) {
        super.onCreate(bundle);
        androidx.lifecycle.s.f(this);
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    protected void onSaveInstanceState(@h0 Bundle bundle) {
        this.e.l(g.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}

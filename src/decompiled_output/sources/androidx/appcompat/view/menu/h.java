package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.h0;
import androidx.appcompat.app.d;
import androidx.appcompat.view.menu.n;
import b.a.a;
import b.i.p.a0;

/* loaded from: classes.dex */
class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, n.a {
    private g d;
    private androidx.appcompat.app.d e;
    e f;
    private n.a g;

    public h(g gVar) {
        this.d = gVar;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void a(@h0 g gVar, boolean z) {
        if (z || gVar == this.d) {
            c();
        }
        n.a aVar = this.g;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean b(@h0 g gVar) {
        n.a aVar = this.g;
        if (aVar != null) {
            return aVar.b(gVar);
        }
        return false;
    }

    public void c() {
        androidx.appcompat.app.d dVar = this.e;
        if (dVar != null) {
            dVar.dismiss();
        }
    }

    public void d(n.a aVar) {
        this.g = aVar;
    }

    public void e(IBinder iBinder) {
        g gVar = this.d;
        d.a aVar = new d.a(gVar.x());
        e eVar = new e(aVar.b(), a.j.abc_list_menu_item_layout);
        this.f = eVar;
        eVar.T(this);
        this.d.b(this.f);
        aVar.c(this.f.b(), this);
        View viewB = gVar.B();
        if (viewB != null) {
            aVar.f(viewB);
        } else {
            aVar.h(gVar.z()).K(gVar.A());
        }
        aVar.A(this);
        androidx.appcompat.app.d dVarA = aVar.a();
        this.e = dVarA;
        dVarA.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.e.getWindow().getAttributes();
        attributes.type = a0.f;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.e.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int r3) {
        this.d.O((j) this.f.b().getItem(r3), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f.a(this.d, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int r4, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (r4 == 82 || r4 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.e.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.e.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.d.f(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.d.performShortcut(r4, keyEvent, 0);
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.p0;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

@androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class m0 extends k0 implements l0 {
    private static final String X = "MenuPopupWindow";
    private static Method Y;
    private l0 W;

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static class a extends g0 {
        final int t;
        final int u;
        private l0 v;
        private MenuItem w;

        public a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.t = 22;
                this.u = 21;
            } else {
                this.t = 21;
                this.u = 22;
            }
        }

        @Override // androidx.appcompat.widget.g0
        public /* bridge */ /* synthetic */ int d(int r1, boolean z) {
            return super.d(r1, z);
        }

        @Override // androidx.appcompat.widget.g0
        public /* bridge */ /* synthetic */ int e(int r1, int r2, int r3, int r4, int r5) {
            return super.e(r1, r2, r3, r4, r5);
        }

        @Override // androidx.appcompat.widget.g0
        public /* bridge */ /* synthetic */ boolean f(MotionEvent motionEvent, int r2) {
            return super.f(motionEvent, r2);
        }

        @Override // androidx.appcompat.widget.g0, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.g0, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.g0, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.g0, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public void m() {
            setSelection(-1);
        }

        @Override // androidx.appcompat.widget.g0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int headersCount;
            int r3;
            int r32;
            if (this.v != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) adapter;
                androidx.appcompat.view.menu.j item = null;
                if (motionEvent.getAction() != 10 && (r3 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (r32 = r3 - headersCount) >= 0 && r32 < fVar.getCount()) {
                    item = fVar.getItem(r32);
                }
                MenuItem menuItem = this.w;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.g gVarB = fVar.b();
                    if (menuItem != null) {
                        this.v.d(gVarB, menuItem);
                    }
                    this.w = item;
                    if (item != null) {
                        this.v.c(gVarB, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int r5, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && r5 == this.t) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || r5 != this.u) {
                return super.onKeyDown(r5, keyEvent);
            }
            setSelection(-1);
            ((androidx.appcompat.view.menu.f) getAdapter()).b().f(false);
            return true;
        }

        @Override // androidx.appcompat.widget.g0, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(l0 l0Var) {
            this.v = l0Var;
        }

        @Override // androidx.appcompat.widget.g0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                Y = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i(X, "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public m0(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet, int r3, int r4) {
        super(context, attributeSet, r3, r4);
    }

    @Override // androidx.appcompat.widget.l0
    public void c(@androidx.annotation.h0 androidx.appcompat.view.menu.g gVar, @androidx.annotation.h0 MenuItem menuItem) {
        l0 l0Var = this.W;
        if (l0Var != null) {
            l0Var.c(gVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.l0
    public void d(@androidx.annotation.h0 androidx.appcompat.view.menu.g gVar, @androidx.annotation.h0 MenuItem menuItem) {
        l0 l0Var = this.W;
        if (l0Var != null) {
            l0Var.d(gVar, menuItem);
        }
    }

    public void p0(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.I.setEnterTransition((Transition) obj);
        }
    }

    public void q0(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.I.setExitTransition((Transition) obj);
        }
    }

    @Override // androidx.appcompat.widget.k0
    @androidx.annotation.h0
    g0 r(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    public void r0(l0 l0Var) {
        this.W = l0Var;
    }

    public void s0(boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            this.I.setTouchModal(z);
            return;
        }
        Method method = Y;
        if (method != null) {
            try {
                method.invoke(this.I, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i(X, "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.p0;
import androidx.appcompat.widget.ActivityChooserView;
import b.a.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class k0 implements androidx.appcompat.view.menu.q {
    private static final String J = "ListPopupWindow";
    private static final boolean K = false;
    static final int L = 250;
    private static Method M = null;
    private static Method N = null;
    private static Method O = null;
    public static final int P = 0;
    public static final int Q = 1;
    public static final int R = -1;
    public static final int S = -2;
    public static final int T = 0;
    public static final int U = 1;
    public static final int V = 2;
    private final g A;
    private final f B;
    private final d C;
    private Runnable D;
    final Handler E;
    private final Rect F;
    private Rect G;
    private boolean H;
    PopupWindow I;
    private Context d;
    private ListAdapter e;
    g0 f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;
    private boolean p;
    private boolean q;
    int r;
    private View s;
    private int t;
    private DataSetObserver u;
    private View v;
    private Drawable w;
    private AdapterView.OnItemClickListener x;
    private AdapterView.OnItemSelectedListener y;
    final h z;

    class a extends i0 {
        a(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.i0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public k0 b() {
            return k0.this;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            View viewS = k0.this.s();
            if (viewS == null || viewS.getWindowToken() == null) {
                return;
            }
            k0.this.y();
        }
    }

    class c implements AdapterView.OnItemSelectedListener {
        c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int r3, long j) {
            g0 g0Var;
            if (r3 == -1 || (g0Var = k0.this.f) == null) {
                return;
            }
            g0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    private class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k0.this.p();
        }
    }

    private class e extends DataSetObserver {
        e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (k0.this.z()) {
                k0.this.y();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            k0.this.dismiss();
        }
    }

    private class f implements AbsListView.OnScrollListener {
        f() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int r2, int r3, int r4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int r2) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (r2 != 1 || k0.this.K() || k0.this.I.getContentView() == null) {
                return;
            }
            k0 k0Var = k0.this;
            k0Var.E.removeCallbacks(k0Var.z);
            k0.this.z.run();
        }
    }

    private class g implements View.OnTouchListener {
        g() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = k0.this.I) != null && popupWindow.isShowing() && x >= 0 && x < k0.this.I.getWidth() && y >= 0 && y < k0.this.I.getHeight()) {
                k0 k0Var = k0.this;
                k0Var.E.postDelayed(k0Var.z, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            k0 k0Var2 = k0.this;
            k0Var2.E.removeCallbacks(k0Var2.z);
            return false;
        }
    }

    private class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            g0 g0Var = k0.this.f;
            if (g0Var == null || !b.i.p.f0.J0(g0Var) || k0.this.f.getCount() <= k0.this.f.getChildCount()) {
                return;
            }
            int childCount = k0.this.f.getChildCount();
            k0 k0Var = k0.this;
            if (childCount <= k0Var.r) {
                k0Var.I.setInputMethodMode(2);
                k0.this.y();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                M = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i(J, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                O = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i(J, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                N = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i(J, "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public k0(@androidx.annotation.h0 Context context) {
        this(context, null, a.b.listPopupWindowStyle);
    }

    public k0(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.listPopupWindowStyle);
    }

    public k0(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet, @androidx.annotation.f int r4) {
        this(context, attributeSet, r4, 0);
    }

    public k0(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet, @androidx.annotation.f int r6, @androidx.annotation.t0 int r7) {
        this.g = -2;
        this.h = -2;
        this.k = b.i.p.a0.e;
        this.o = 0;
        this.p = false;
        this.q = false;
        this.r = ActivityChooserView.f.j;
        this.t = 0;
        this.z = new h();
        this.A = new g();
        this.B = new f();
        this.C = new d();
        this.F = new Rect();
        this.d = context;
        this.E = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m.ListPopupWindow, r6, r7);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(a.m.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(a.m.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.j = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.l = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        r rVar = new r(context, attributeSet, r6, r7);
        this.I = rVar;
        rVar.setInputMethodMode(1);
    }

    private static boolean I(int r1) {
        return r1 == 66 || r1 == 23;
    }

    private void R() {
        View view = this.s;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.s);
            }
        }
    }

    private void i0(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT > 28) {
            this.I.setIsClippedToScreen(z);
            return;
        }
        Method method = M;
        if (method != null) {
            try {
                method.invoke(this.I, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i(J, "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x012b A[PHI: r1
  0x012b: PHI (r1v1 int) = (r1v0 int), (r1v6 int) binds: [B:45:0x0120, B:47:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int o() {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.k0.o():int");
    }

    private int x(View view, int r7, boolean z) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.I.getMaxAvailableHeight(view, r7, z);
        }
        Method method = N;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.I, view, Integer.valueOf(r7), Boolean.valueOf(z))).intValue();
            } catch (Exception unused) {
                Log.i(J, "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.I.getMaxAvailableHeight(view, r7);
    }

    @Override // androidx.appcompat.view.menu.q
    @androidx.annotation.i0
    public ListView A() {
        return this.f;
    }

    public int B() {
        return this.t;
    }

    @androidx.annotation.i0
    public Object C() {
        if (z()) {
            return this.f.getSelectedItem();
        }
        return null;
    }

    public long D() {
        if (z()) {
            return this.f.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int E() {
        if (z()) {
            return this.f.getSelectedItemPosition();
        }
        return -1;
    }

    @androidx.annotation.i0
    public View F() {
        if (z()) {
            return this.f.getSelectedView();
        }
        return null;
    }

    public int G() {
        return this.I.getSoftInputMode();
    }

    public int H() {
        return this.h;
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public boolean J() {
        return this.p;
    }

    public boolean K() {
        return this.I.getInputMethodMode() == 2;
    }

    public boolean L() {
        return this.H;
    }

    public boolean M(int r10, @androidx.annotation.h0 KeyEvent keyEvent) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (z() && r10 != 62 && (this.f.getSelectedItemPosition() >= 0 || !I(r10))) {
            int selectedItemPosition = this.f.getSelectedItemPosition();
            boolean z = !this.I.isAboveAnchor();
            ListAdapter listAdapter = this.e;
            int r5 = ActivityChooserView.f.j;
            int r6 = Integer.MIN_VALUE;
            if (listAdapter != null) {
                boolean zAreAllItemsEnabled = listAdapter.areAllItemsEnabled();
                int r62 = zAreAllItemsEnabled ? 0 : this.f.d(0, true);
                int count = zAreAllItemsEnabled ? listAdapter.getCount() - 1 : this.f.d(listAdapter.getCount() - 1, false);
                r5 = r62;
                r6 = count;
            }
            if ((z && r10 == 19 && selectedItemPosition <= r5) || (!z && r10 == 20 && selectedItemPosition >= r6)) {
                p();
                this.I.setInputMethodMode(1);
                y();
                return true;
            }
            this.f.setListSelectionHidden(false);
            if (this.f.onKeyDown(r10, keyEvent)) {
                this.I.setInputMethodMode(2);
                this.f.requestFocusFromTouch();
                y();
                if (r10 == 19 || r10 == 20 || r10 == 23 || r10 == 66) {
                    return true;
                }
            } else if (z && r10 == 20) {
                if (selectedItemPosition == r6) {
                    return true;
                }
            } else if (!z && r10 == 19 && selectedItemPosition == r5) {
                return true;
            }
        }
        return false;
    }

    public boolean N(int r3, @androidx.annotation.h0 KeyEvent keyEvent) {
        if (r3 != 4 || !z()) {
            return false;
        }
        View view = this.v;
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyDispatcherState = view.getKeyDispatcherState();
            if (keyDispatcherState != null) {
                keyDispatcherState.startTracking(keyEvent, this);
            }
            return true;
        }
        if (keyEvent.getAction() != 1) {
            return false;
        }
        KeyEvent.DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
        if (keyDispatcherState2 != null) {
            keyDispatcherState2.handleUpEvent(keyEvent);
        }
        if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
            return false;
        }
        dismiss();
        return true;
    }

    public boolean O(int r2, @androidx.annotation.h0 KeyEvent keyEvent) {
        if (!z() || this.f.getSelectedItemPosition() < 0) {
            return false;
        }
        boolean zOnKeyUp = this.f.onKeyUp(r2, keyEvent);
        if (zOnKeyUp && I(r2)) {
            dismiss();
        }
        return zOnKeyUp;
    }

    public boolean P(int r8) {
        if (!z()) {
            return false;
        }
        if (this.x == null) {
            return true;
        }
        g0 g0Var = this.f;
        this.x.onItemClick(g0Var, g0Var.getChildAt(r8 - g0Var.getFirstVisiblePosition()), r8, g0Var.getAdapter().getItemId(r8));
        return true;
    }

    public void Q() {
        this.E.post(this.D);
    }

    public void S(@androidx.annotation.i0 View view) {
        this.v = view;
    }

    public void T(@androidx.annotation.t0 int r2) {
        this.I.setAnimationStyle(r2);
    }

    public void U(int r3) {
        Drawable background = this.I.getBackground();
        if (background == null) {
            n0(r3);
            return;
        }
        background.getPadding(this.F);
        Rect rect = this.F;
        this.h = rect.left + rect.right + r3;
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void V(boolean z) {
        this.p = z;
    }

    public void W(int r1) {
        this.o = r1;
    }

    public void X(@androidx.annotation.i0 Rect rect) {
        this.G = rect != null ? new Rect(rect) : null;
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void Y(boolean z) {
        this.q = z;
    }

    public void Z(int r2) {
        if (r2 < 0 && -2 != r2 && -1 != r2) {
            throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
        }
        this.g = r2;
    }

    public void a(@androidx.annotation.i0 Drawable drawable) {
        this.I.setBackgroundDrawable(drawable);
    }

    public void a0(int r2) {
        this.I.setInputMethodMode(r2);
    }

    public int b() {
        return this.i;
    }

    void b0(int r1) {
        this.r = r1;
    }

    public void c0(Drawable drawable) {
        this.w = drawable;
    }

    public void d0(boolean z) {
        this.H = z;
        this.I.setFocusable(z);
    }

    @Override // androidx.appcompat.view.menu.q
    public void dismiss() {
        this.I.dismiss();
        R();
        this.I.setContentView(null);
        this.f = null;
        this.E.removeCallbacks(this.z);
    }

    @androidx.annotation.i0
    public Drawable e() {
        return this.I.getBackground();
    }

    public void e0(@androidx.annotation.i0 PopupWindow.OnDismissListener onDismissListener) {
        this.I.setOnDismissListener(onDismissListener);
    }

    public void f0(@androidx.annotation.i0 AdapterView.OnItemClickListener onItemClickListener) {
        this.x = onItemClickListener;
    }

    public void g(int r1) {
        this.j = r1;
        this.l = true;
    }

    public void g0(@androidx.annotation.i0 AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.y = onItemSelectedListener;
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void h0(boolean z) {
        this.n = true;
        this.m = z;
    }

    public void i(int r1) {
        this.i = r1;
    }

    public void j0(int r1) {
        this.t = r1;
    }

    public int k() {
        if (this.l) {
            return this.j;
        }
        return 0;
    }

    public void k0(@androidx.annotation.i0 View view) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z = z();
        if (z) {
            R();
        }
        this.s = view;
        if (z) {
            y();
        }
    }

    public void l0(int r3) {
        g0 g0Var = this.f;
        if (!z() || g0Var == null) {
            return;
        }
        g0Var.setListSelectionHidden(false);
        g0Var.setSelection(r3);
        if (g0Var.getChoiceMode() != 0) {
            g0Var.setItemChecked(r3, true);
        }
    }

    public void m0(int r2) {
        this.I.setSoftInputMode(r2);
    }

    public void n(@androidx.annotation.i0 ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.u;
        if (dataSetObserver == null) {
            this.u = new e();
        } else {
            ListAdapter listAdapter2 = this.e;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.e = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.u);
        }
        g0 g0Var = this.f;
        if (g0Var != null) {
            g0Var.setAdapter(this.e);
        }
    }

    public void n0(int r1) {
        this.h = r1;
    }

    public void o0(int r1) {
        this.k = r1;
    }

    public void p() {
        g0 g0Var = this.f;
        if (g0Var != null) {
            g0Var.setListSelectionHidden(true);
            g0Var.requestLayout();
        }
    }

    public View.OnTouchListener q(View view) {
        return new a(view);
    }

    @androidx.annotation.h0
    g0 r(Context context, boolean z) {
        return new g0(context, z);
    }

    @androidx.annotation.i0
    public View s() {
        return this.v;
    }

    @androidx.annotation.t0
    public int t() {
        return this.I.getAnimationStyle();
    }

    @androidx.annotation.i0
    public Rect u() {
        if (this.G != null) {
            return new Rect(this.G);
        }
        return null;
    }

    public int v() {
        return this.g;
    }

    public int w() {
        return this.I.getInputMethodMode();
    }

    @Override // androidx.appcompat.view.menu.q
    public void y() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int r0 = o();
        boolean zK = K();
        androidx.core.widget.k.d(this.I, this.k);
        if (this.I.isShowing()) {
            if (b.i.p.f0.J0(s())) {
                int width = this.h;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = s().getWidth();
                }
                int r7 = this.g;
                if (r7 == -1) {
                    if (!zK) {
                        r0 = -1;
                    }
                    if (zK) {
                        this.I.setWidth(this.h == -1 ? -1 : 0);
                        this.I.setHeight(0);
                    } else {
                        this.I.setWidth(this.h == -1 ? -1 : 0);
                        this.I.setHeight(-1);
                    }
                } else if (r7 != -2) {
                    r0 = r7;
                }
                this.I.setOutsideTouchable((this.q || this.p) ? false : true);
                this.I.update(s(), this.i, this.j, width < 0 ? -1 : width, r0 < 0 ? -1 : r0);
                return;
            }
            return;
        }
        int width2 = this.h;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = s().getWidth();
        }
        int r2 = this.g;
        if (r2 == -1) {
            r0 = -1;
        } else if (r2 != -2) {
            r0 = r2;
        }
        this.I.setWidth(width2);
        this.I.setHeight(r0);
        i0(true);
        this.I.setOutsideTouchable((this.q || this.p) ? false : true);
        this.I.setTouchInterceptor(this.A);
        if (this.n) {
            androidx.core.widget.k.c(this.I, this.m);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = O;
            if (method != null) {
                try {
                    method.invoke(this.I, this.G);
                } catch (Exception e2) {
                    Log.e(J, "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            this.I.setEpicenterBounds(this.G);
        }
        androidx.core.widget.k.e(this.I, s(), this.i, this.j, this.o);
        this.f.setSelection(-1);
        if (!this.H || this.f.isInTouchMode()) {
            p();
        }
        if (this.H) {
            return;
        }
        this.E.post(this.C);
    }

    @Override // androidx.appcompat.view.menu.q
    public boolean z() {
        return this.I.isShowing();
    }
}

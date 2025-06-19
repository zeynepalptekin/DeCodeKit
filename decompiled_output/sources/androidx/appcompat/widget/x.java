package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.p0;
import androidx.appcompat.app.d;
import b.a.a;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class x extends Spinner implements b.i.p.d0 {
    private static final int[] l = {R.attr.spinnerMode};
    private static final int m = 15;
    private static final String n = "AppCompatSpinner";
    private static final int o = 0;
    private static final int p = 1;
    private static final int q = -1;
    private final androidx.appcompat.widget.f d;
    private final Context e;
    private i0 f;
    private SpinnerAdapter g;
    private final boolean h;
    private g i;
    int j;
    final Rect k;

    class a extends i0 {
        final /* synthetic */ e m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, e eVar) {
            super(view);
            this.m = eVar;
        }

        @Override // androidx.appcompat.widget.i0
        public androidx.appcompat.view.menu.q b() {
            return this.m;
        }

        @Override // androidx.appcompat.widget.i0
        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
            if (x.this.getInternalPopup().z()) {
                return true;
            }
            x.this.b();
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!x.this.getInternalPopup().z()) {
                x.this.b();
            }
            ViewTreeObserver viewTreeObserver = x.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                if (Build.VERSION.SDK_INT >= 16) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
    }

    @androidx.annotation.x0
    class c implements g, DialogInterface.OnClickListener {

        @androidx.annotation.x0
        androidx.appcompat.app.d d;
        private ListAdapter e;
        private CharSequence f;

        c() {
        }

        @Override // androidx.appcompat.widget.x.g
        public void a(Drawable drawable) {
            Log.e(x.n, "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.x.g
        public int b() {
            return 0;
        }

        @Override // androidx.appcompat.widget.x.g
        public void dismiss() {
            androidx.appcompat.app.d dVar = this.d;
            if (dVar != null) {
                dVar.dismiss();
                this.d = null;
            }
        }

        @Override // androidx.appcompat.widget.x.g
        public Drawable e() {
            return null;
        }

        @Override // androidx.appcompat.widget.x.g
        public void f(CharSequence charSequence) {
            this.f = charSequence;
        }

        @Override // androidx.appcompat.widget.x.g
        public void g(int r2) {
            Log.e(x.n, "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.x.g
        public void h(int r2) {
            Log.e(x.n, "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.x.g
        public void i(int r2) {
            Log.e(x.n, "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.x.g
        public void j(int r4, int r5) {
            if (this.e == null) {
                return;
            }
            d.a aVar = new d.a(x.this.getPopupContext());
            CharSequence charSequence = this.f;
            if (charSequence != null) {
                aVar.K(charSequence);
            }
            androidx.appcompat.app.d dVarA = aVar.H(this.e, x.this.getSelectedItemPosition(), this).a();
            this.d = dVarA;
            ListView listViewI = dVarA.i();
            if (Build.VERSION.SDK_INT >= 17) {
                listViewI.setTextDirection(r4);
                listViewI.setTextAlignment(r5);
            }
            this.d.show();
        }

        @Override // androidx.appcompat.widget.x.g
        public int k() {
            return 0;
        }

        @Override // androidx.appcompat.widget.x.g
        public int l() {
            return 0;
        }

        @Override // androidx.appcompat.widget.x.g
        public CharSequence m() {
            return this.f;
        }

        @Override // androidx.appcompat.widget.x.g
        public void n(ListAdapter listAdapter) {
            this.e = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r5) {
            x.this.setSelection(r5);
            if (x.this.getOnItemClickListener() != null) {
                x.this.performItemClick(null, r5, this.e.getItemId(r5));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.x.g
        public boolean z() {
            androidx.appcompat.app.d dVar = this.d;
            if (dVar != null) {
                return dVar.isShowing();
            }
            return false;
        }
    }

    private static class d implements ListAdapter, SpinnerAdapter {
        private SpinnerAdapter d;
        private ListAdapter e;

        public d(@androidx.annotation.i0 SpinnerAdapter spinnerAdapter, @androidx.annotation.i0 Resources.Theme theme) {
            this.d = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.e = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof w0) {
                    w0 w0Var = (w0) spinnerAdapter;
                    if (w0Var.getDropDownViewTheme() == null) {
                        w0Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.e;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.d;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int r2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.d;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(r2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int r2) {
            SpinnerAdapter spinnerAdapter = this.d;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(r2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int r3) {
            SpinnerAdapter spinnerAdapter = this.d;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(r3);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int r1) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int r1, View view, ViewGroup viewGroup) {
            return getDropDownView(r1, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.d;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int r2) {
            ListAdapter listAdapter = this.e;
            if (listAdapter != null) {
                return listAdapter.isEnabled(r2);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.d;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.d;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    @androidx.annotation.x0
    class e extends k0 implements g {
        private CharSequence W;
        ListAdapter X;
        private final Rect Y;
        private int Z;

        class a implements AdapterView.OnItemClickListener {
            final /* synthetic */ x d;

            a(x xVar) {
                this.d = xVar;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int r5, long j) {
                x.this.setSelection(r5);
                if (x.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    x.this.performItemClick(view, r5, eVar.X.getItemId(r5));
                }
                e.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                e eVar = e.this;
                if (!eVar.r0(x.this)) {
                    e.this.dismiss();
                } else {
                    e.this.q0();
                    e.super.y();
                }
            }
        }

        class c implements PopupWindow.OnDismissListener {
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener d;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.d = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = x.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.d);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int r4) {
            super(context, attributeSet, r4);
            this.Y = new Rect();
            S(x.this);
            d0(true);
            j0(0);
            f0(new a(x.this));
        }

        @Override // androidx.appcompat.widget.x.g
        public void f(CharSequence charSequence) {
            this.W = charSequence;
        }

        @Override // androidx.appcompat.widget.x.g
        public void h(int r1) {
            this.Z = r1;
        }

        @Override // androidx.appcompat.widget.x.g
        public void j(int r5, int r6) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            ViewTreeObserver viewTreeObserver;
            boolean z = z();
            q0();
            a0(2);
            super.y();
            ListView listViewA = A();
            listViewA.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                listViewA.setTextDirection(r5);
                listViewA.setTextAlignment(r6);
            }
            l0(x.this.getSelectedItemPosition());
            if (z || (viewTreeObserver = x.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            e0(new c(bVar));
        }

        @Override // androidx.appcompat.widget.x.g
        public int l() {
            return this.Z;
        }

        @Override // androidx.appcompat.widget.x.g
        public CharSequence m() {
            return this.W;
        }

        @Override // androidx.appcompat.widget.k0, androidx.appcompat.widget.x.g
        public void n(ListAdapter listAdapter) {
            super.n(listAdapter);
            this.X = listAdapter;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void q0() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.e()
                r1 = 0
                if (r0 == 0) goto L26
                androidx.appcompat.widget.x r1 = androidx.appcompat.widget.x.this
                android.graphics.Rect r1 = r1.k
                r0.getPadding(r1)
                androidx.appcompat.widget.x r0 = androidx.appcompat.widget.x.this
                boolean r0 = androidx.appcompat.widget.g1.b(r0)
                if (r0 == 0) goto L1d
                androidx.appcompat.widget.x r0 = androidx.appcompat.widget.x.this
                android.graphics.Rect r0 = r0.k
                int r0 = r0.right
                goto L24
            L1d:
                androidx.appcompat.widget.x r0 = androidx.appcompat.widget.x.this
                android.graphics.Rect r0 = r0.k
                int r0 = r0.left
                int r0 = -r0
            L24:
                r1 = r0
                goto L2e
            L26:
                androidx.appcompat.widget.x r0 = androidx.appcompat.widget.x.this
                android.graphics.Rect r0 = r0.k
                r0.right = r1
                r0.left = r1
            L2e:
                androidx.appcompat.widget.x r0 = androidx.appcompat.widget.x.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.x r2 = androidx.appcompat.widget.x.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.x r3 = androidx.appcompat.widget.x.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.x r4 = androidx.appcompat.widget.x.this
                int r5 = r4.j
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.X
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.e()
                int r4 = r4.a(r5, r6)
                androidx.appcompat.widget.x r5 = androidx.appcompat.widget.x.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.x r6 = androidx.appcompat.widget.x.this
                android.graphics.Rect r6 = r6.k
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r0
                int r4 = r4 - r2
            L7e:
                r8.U(r4)
                goto L85
            L82:
                r8.U(r5)
            L85:
                androidx.appcompat.widget.x r4 = androidx.appcompat.widget.x.this
                boolean r4 = androidx.appcompat.widget.g1.b(r4)
                if (r4 == 0) goto L9a
                int r3 = r3 - r2
                int r0 = r8.H()
                int r3 = r3 - r0
                int r0 = r8.l()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto La0
            L9a:
                int r2 = r8.l()
                int r0 = r0 + r2
                int r1 = r1 + r0
            La0:
                r8.i(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.x.e.q0():void");
        }

        boolean r0(View view) {
            return b.i.p.f0.J0(view) && view.getGlobalVisibleRect(this.Y);
        }
    }

    static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();
        boolean d;

        class a implements Parcelable.Creator<f> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int r1) {
                return new f[r1];
            }
        }

        f(Parcel parcel) {
            super(parcel);
            this.d = parcel.readByte() != 0;
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int r2) {
            super.writeToParcel(parcel, r2);
            parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        }
    }

    @androidx.annotation.x0
    interface g {
        void a(Drawable drawable);

        int b();

        void dismiss();

        Drawable e();

        void f(CharSequence charSequence);

        void g(int r1);

        void h(int r1);

        void i(int r1);

        void j(int r1, int r2);

        int k();

        int l();

        CharSequence m();

        void n(ListAdapter listAdapter);

        boolean z();
    }

    public x(@androidx.annotation.h0 Context context) {
        this(context, (AttributeSet) null);
    }

    public x(@androidx.annotation.h0 Context context, int r4) {
        this(context, null, a.b.spinnerStyle, r4);
    }

    public x(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.spinnerStyle);
    }

    public x(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet, int r4) {
        this(context, attributeSet, r4, -1);
    }

    public x(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet, int r9, int r10) {
        this(context, attributeSet, r9, r10, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f A[PHI: r10 r11
  0x004f: PHI (r10v2 int) = (r10v0 int), (r10v4 int) binds: [B:25:0x0060, B:16:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x004f: PHI (r11v6 android.content.res.TypedArray) = (r11v5 android.content.res.TypedArray), (r11v8 android.content.res.TypedArray) binds: [B:25:0x0060, B:16:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x(@androidx.annotation.h0 android.content.Context r7, @androidx.annotation.i0 android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.x.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int r0 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int r1 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int r2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int r3 = Math.max(0, getSelectedItemPosition());
        int r4 = Math.min(spinnerAdapter.getCount(), r3 + 15);
        View view = null;
        int r32 = 0;
        for (int r6 = Math.max(0, r3 - (15 - (r4 - r3))); r6 < r4; r6++) {
            int itemViewType = spinnerAdapter.getItemViewType(r6);
            if (itemViewType != r0) {
                view = null;
                r0 = itemViewType;
            }
            view = spinnerAdapter.getView(r6, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(r1, r2);
            r32 = Math.max(r32, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return r32;
        }
        drawable.getPadding(this.k);
        Rect rect = this.k;
        return r32 + rect.left + rect.right;
    }

    void b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.i.j(getTextDirection(), getTextAlignment());
        } else {
            this.i.j(-1, -1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.f fVar = this.d;
        if (fVar != null) {
            fVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.i;
        if (gVar != null) {
            return gVar.b();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.i;
        if (gVar != null) {
            return gVar.k();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.i != null) {
            return this.j;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    @androidx.annotation.x0
    final g getInternalPopup() {
        return this.i;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.i;
        if (gVar != null) {
            return gVar.e();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.e;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.i;
        return gVar != null ? gVar.m() : super.getPrompt();
    }

    @Override // b.i.p.d0
    @androidx.annotation.i0
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.f fVar = this.d;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // b.i.p.d0
    @androidx.annotation.i0
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.f fVar = this.d;
        if (fVar != null) {
            return fVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.i;
        if (gVar == null || !gVar.z()) {
            return;
        }
        this.i.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int r3, int r4) {
        super.onMeasure(r3, r4);
        if (this.i == null || View.MeasureSpec.getMode(r3) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(r3)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (!fVar.d || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.i;
        fVar.d = gVar != null && gVar.z();
        return fVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        i0 i0Var = this.f;
        if (i0Var == null || !i0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        g gVar = this.i;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.z()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.h) {
            this.g = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.i != null) {
            Context context = this.e;
            if (context == null) {
                context = getContext();
            }
            this.i.n(new d(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.f fVar = this.d;
        if (fVar != null) {
            fVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.q int r2) {
        super.setBackgroundResource(r2);
        androidx.appcompat.widget.f fVar = this.d;
        if (fVar != null) {
            fVar.g(r2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int r3) {
        g gVar = this.i;
        if (gVar != null) {
            gVar.h(r3);
            this.i.i(r3);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(r3);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int r3) {
        g gVar = this.i;
        if (gVar != null) {
            gVar.g(r3);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(r3);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int r3) {
        if (this.i != null) {
            this.j = r3;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(r3);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.i;
        if (gVar != null) {
            gVar.a(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(@androidx.annotation.q int r2) {
        setPopupBackgroundDrawable(b.a.b.a.a.d(getPopupContext(), r2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.i;
        if (gVar != null) {
            gVar.f(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // b.i.p.d0
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.i0 ColorStateList colorStateList) {
        androidx.appcompat.widget.f fVar = this.d;
        if (fVar != null) {
            fVar.i(colorStateList);
        }
    }

    @Override // b.i.p.d0
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.i0 PorterDuff.Mode mode) {
        androidx.appcompat.widget.f fVar = this.d;
        if (fVar != null) {
            fVar.j(mode);
        }
    }
}

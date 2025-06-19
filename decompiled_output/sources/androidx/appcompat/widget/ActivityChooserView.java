package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.p0;
import androidx.appcompat.widget.d;
import b.a.a;
import java.lang.reflect.InvocationTargetException;

@androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup implements d.a {
    final f d;
    private final g e;
    private final View f;
    private final Drawable g;
    final FrameLayout h;
    private final ImageView i;
    final FrameLayout j;
    private final ImageView k;
    private final int l;
    b.i.p.b m;
    final DataSetObserver n;
    private final ViewTreeObserver.OnGlobalLayoutListener o;
    private k0 p;
    PopupWindow.OnDismissListener q;
    boolean r;
    int s;
    private boolean t;
    private int u;

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static class InnerLayout extends LinearLayout {
        private static final int[] d = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            a1 a1VarF = a1.F(context, attributeSet, d);
            setBackgroundDrawable(a1VarF.h(0));
            a1VarF.I();
        }
    }

    class a extends DataSetObserver {
        a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.d.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.d.notifyDataSetInvalidated();
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (ActivityChooserView.this.b()) {
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().y();
                b.i.p.b bVar = ActivityChooserView.this.m;
                if (bVar != null) {
                    bVar.m(true);
                }
            }
        }
    }

    class c extends View.AccessibilityDelegate {
        c() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            b.i.p.p0.d.T1(accessibilityNodeInfo).Q0(true);
        }
    }

    class d extends i0 {
        d(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.i0
        public androidx.appcompat.view.menu.q b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // androidx.appcompat.widget.i0
        protected boolean c() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            ActivityChooserView.this.c();
            return true;
        }

        @Override // androidx.appcompat.widget.i0
        protected boolean d() {
            ActivityChooserView.this.a();
            return true;
        }
    }

    class e extends DataSetObserver {
        e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.e();
        }
    }

    private class f extends BaseAdapter {
        public static final int j = Integer.MAX_VALUE;
        public static final int k = 4;
        private static final int l = 0;
        private static final int m = 1;
        private static final int n = 3;
        private androidx.appcompat.widget.d d;
        private int e = 4;
        private boolean f;
        private boolean g;
        private boolean h;

        f() {
        }

        public int a() {
            return this.d.f();
        }

        public androidx.appcompat.widget.d b() {
            return this.d;
        }

        public ResolveInfo c() {
            return this.d.h();
        }

        public int d() {
            return this.d.j();
        }

        public boolean e() {
            return this.f;
        }

        public int f() {
            int r0 = this.e;
            this.e = j;
            int r2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int r3 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int r6 = 0;
            for (int r1 = 0; r1 < count; r1++) {
                view = getView(r1, view, null);
                view.measure(r2, r3);
                r6 = Math.max(r6, view.getMeasuredWidth());
            }
            this.e = r0;
            return r6;
        }

        public void g(androidx.appcompat.widget.d dVar) {
            androidx.appcompat.widget.d dVarB = ActivityChooserView.this.d.b();
            if (dVarB != null && ActivityChooserView.this.isShown()) {
                dVarB.unregisterObserver(ActivityChooserView.this.n);
            }
            this.d = dVar;
            if (dVar != null && ActivityChooserView.this.isShown()) {
                dVar.registerObserver(ActivityChooserView.this.n);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int r0 = this.d.f();
            if (!this.f && this.d.h() != null) {
                r0--;
            }
            int r02 = Math.min(r0, this.e);
            return this.h ? r02 + 1 : r02;
        }

        @Override // android.widget.Adapter
        public Object getItem(int r2) {
            int itemViewType = getItemViewType(r2);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.f && this.d.h() != null) {
                r2++;
            }
            return this.d.e(r2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int r3) {
            return r3;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int r3) {
            return (this.h && r3 == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int r6, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(r6);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                if (view != null && view.getId() == 1) {
                    return view;
                }
                View viewInflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(a.j.abc_activity_chooser_view_list_item, viewGroup, false);
                viewInflate.setId(1);
                ((TextView) viewInflate.findViewById(a.g.title)).setText(ActivityChooserView.this.getContext().getString(a.k.abc_activity_chooser_view_see_all));
                return viewInflate;
            }
            if (view == null || view.getId() != a.g.list_item) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(a.j.abc_activity_chooser_view_list_item, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(a.g.icon);
            ResolveInfo resolveInfo = (ResolveInfo) getItem(r6);
            imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(a.g.title)).setText(resolveInfo.loadLabel(packageManager));
            if (this.f && r6 == 0 && this.g) {
                view.setActivated(true);
            } else {
                view.setActivated(false);
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }

        public void h(int r2) {
            if (this.e != r2) {
                this.e = r2;
                notifyDataSetChanged();
            }
        }

        public void i(boolean z, boolean z2) {
            if (this.f == z && this.g == z2) {
                return;
            }
            this.f = z;
            this.g = z2;
            notifyDataSetChanged();
        }

        public void j(boolean z) {
            if (this.h != z) {
                this.h = z;
                notifyDataSetChanged();
            }
        }
    }

    private class g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        g() {
        }

        private void a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.q;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.j) {
                if (view != activityChooserView.h) {
                    throw new IllegalArgumentException();
                }
                activityChooserView.r = false;
                activityChooserView.d(activityChooserView.s);
                return;
            }
            activityChooserView.a();
            Intent intentB = ActivityChooserView.this.d.b().b(ActivityChooserView.this.d.b().g(ActivityChooserView.this.d.c()));
            if (intentB != null) {
                intentB.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(intentB);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            a();
            b.i.p.b bVar = ActivityChooserView.this.m;
            if (bVar != null) {
                bVar.m(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int r3, long j) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            int itemViewType = ((f) adapterView.getAdapter()).getItemViewType(r3);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                ActivityChooserView.this.d(f.j);
                return;
            }
            ActivityChooserView.this.a();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.r) {
                if (r3 > 0) {
                    activityChooserView.d.b().r(r3);
                    return;
                }
                return;
            }
            if (!activityChooserView.d.e()) {
                r3++;
            }
            Intent intentB = ActivityChooserView.this.d.b().b(r3);
            if (intentB != null) {
                intentB.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(intentB);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.j) {
                throw new IllegalArgumentException();
            }
            if (activityChooserView.d.getCount() > 0) {
                ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                activityChooserView2.r = true;
                activityChooserView2.d(activityChooserView2.s);
            }
            return true;
        }
    }

    public ActivityChooserView(@androidx.annotation.h0 Context context) {
        this(context, null);
    }

    public ActivityChooserView(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet, int r13) {
        super(context, attributeSet, r13);
        this.n = new a();
        this.o = new b();
        this.s = 4;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m.ActivityChooserView, r13, 0);
        b.i.p.f0.s1(this, context, a.m.ActivityChooserView, attributeSet, typedArrayObtainStyledAttributes, r13, 0);
        this.s = typedArrayObtainStyledAttributes.getInt(a.m.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(a.m.ActivityChooserView_expandActivityOverflowButtonDrawable);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(a.j.abc_activity_chooser_view, (ViewGroup) this, true);
        this.e = new g();
        View viewFindViewById = findViewById(a.g.activity_chooser_view_content);
        this.f = viewFindViewById;
        this.g = viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(a.g.default_activity_button);
        this.j = frameLayout;
        frameLayout.setOnClickListener(this.e);
        this.j.setOnLongClickListener(this.e);
        this.k = (ImageView) this.j.findViewById(a.g.image);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(a.g.expand_activities_button);
        frameLayout2.setOnClickListener(this.e);
        frameLayout2.setAccessibilityDelegate(new c());
        frameLayout2.setOnTouchListener(new d(frameLayout2));
        this.h = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(a.g.image);
        this.i = imageView;
        imageView.setImageDrawable(drawable);
        f fVar = new f();
        this.d = fVar;
        fVar.registerDataSetObserver(new e());
        Resources resources = context.getResources();
        this.l = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.e.abc_config_prefDialogWidth));
    }

    public boolean a() {
        if (!b()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.o);
        return true;
    }

    public boolean b() {
        return getListPopupWindow().z();
    }

    public boolean c() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (b() || !this.t) {
            return false;
        }
        this.r = false;
        d(this.s);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    void d(int r6) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        f fVar;
        if (this.d.b() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.o);
        ?? r0 = this.j.getVisibility() == 0 ? 1 : 0;
        int r3 = this.d.a();
        if (r6 == Integer.MAX_VALUE || r3 <= r6 + r0) {
            this.d.j(false);
            fVar = this.d;
        } else {
            this.d.j(true);
            fVar = this.d;
            r6--;
        }
        fVar.h(r6);
        k0 listPopupWindow = getListPopupWindow();
        if (listPopupWindow.z()) {
            return;
        }
        if (this.r || r0 == 0) {
            this.d.i(true, r0);
        } else {
            this.d.i(false, false);
        }
        listPopupWindow.U(Math.min(this.d.f(), this.l));
        listPopupWindow.y();
        b.i.p.b bVar = this.m;
        if (bVar != null) {
            bVar.m(true);
        }
        listPopupWindow.A().setContentDescription(getContext().getString(a.k.abc_activitychooserview_choose_application));
        listPopupWindow.A().setSelector(new ColorDrawable(0));
    }

    void e() {
        View view;
        Drawable drawable;
        if (this.d.getCount() > 0) {
            this.h.setEnabled(true);
        } else {
            this.h.setEnabled(false);
        }
        int r0 = this.d.a();
        int r3 = this.d.d();
        if (r0 == 1 || (r0 > 1 && r3 > 0)) {
            this.j.setVisibility(0);
            ResolveInfo resolveInfoC = this.d.c();
            PackageManager packageManager = getContext().getPackageManager();
            this.k.setImageDrawable(resolveInfoC.loadIcon(packageManager));
            if (this.u != 0) {
                this.j.setContentDescription(getContext().getString(this.u, resolveInfoC.loadLabel(packageManager)));
            }
        } else {
            this.j.setVisibility(8);
        }
        if (this.j.getVisibility() == 0) {
            view = this.f;
            drawable = this.g;
        } else {
            view = this.f;
            drawable = null;
        }
        view.setBackgroundDrawable(drawable);
    }

    public androidx.appcompat.widget.d getDataModel() {
        return this.d.b();
    }

    k0 getListPopupWindow() {
        if (this.p == null) {
            k0 k0Var = new k0(getContext());
            this.p = k0Var;
            k0Var.n(this.d);
            this.p.S(this);
            this.p.d0(true);
            this.p.f0(this.e);
            this.p.e0(this.e);
        }
        return this.p;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        androidx.appcompat.widget.d dVarB = this.d.b();
        if (dVarB != null) {
            dVarB.registerObserver(this.n);
        }
        this.t = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.d dVarB = this.d.b();
        if (dVarB != null) {
            dVarB.unregisterObserver(this.n);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.o);
        }
        if (b()) {
            a();
        }
        this.t = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int r2, int r3, int r4, int r5) {
        this.f.layout(0, 0, r4 - r2, r5 - r3);
        if (b()) {
            return;
        }
        a();
    }

    @Override // android.view.View
    protected void onMeasure(int r3, int r4) {
        View view = this.f;
        if (this.j.getVisibility() != 0) {
            r4 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(r4), 1073741824);
        }
        measureChild(view, r3, r4);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.d.a
    public void setActivityChooserModel(androidx.appcompat.widget.d dVar) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        this.d.g(dVar);
        if (b()) {
            a();
            c();
        }
    }

    public void setDefaultActionButtonContentDescription(int r1) {
        this.u = r1;
    }

    public void setExpandActivityOverflowButtonContentDescription(int r2) {
        this.i.setContentDescription(getContext().getString(r2));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.i.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int r1) {
        this.s = r1;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.q = onDismissListener;
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void setProvider(b.i.p.b bVar) {
        this.m = bVar;
    }
}

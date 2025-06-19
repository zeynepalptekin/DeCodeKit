package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.i0;
import androidx.appcompat.widget.j0;
import androidx.core.widget.NestedScrollView;
import b.a.a;
import b.i.p.f0;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class AlertController {
    NestedScrollView A;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler R;

    /* renamed from: a, reason: collision with root package name */
    private final Context f19a;

    /* renamed from: b, reason: collision with root package name */
    final i f20b;

    /* renamed from: c, reason: collision with root package name */
    private final Window f21c;
    private final int d;
    private CharSequence e;
    private CharSequence f;
    ListView g;
    private View h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    Button o;
    private CharSequence p;
    Message q;
    private Drawable r;
    Button s;
    private CharSequence t;
    Message u;
    private Drawable v;
    Button w;
    private CharSequence x;
    Message y;
    private Drawable z;
    private boolean n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    public static class RecycleListView extends ListView {
        private final int d;
        private final int e;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m.RecycleListView);
            this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(a.m.RecycleListView_paddingBottomNoButtons, -1);
            this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(a.m.RecycleListView_paddingTopNoTitle, -1);
        }

        public void a(boolean z, boolean z2) {
            if (z2 && z) {
                return;
            }
            setPadding(getPaddingLeft(), z ? getPaddingTop() : this.d, getPaddingRight(), z2 ? getPaddingBottom() : this.e);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x000a A[PHI: r0
  0x000a: PHI (r0v5 android.os.Message) = (r0v3 android.os.Message), (r0v6 android.os.Message) binds: [B:10:0x0017, B:5:0x0008] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.o
                if (r3 != r1) goto Lf
                android.os.Message r0 = r0.q
                if (r0 == 0) goto Lf
            La:
                android.os.Message r3 = android.os.Message.obtain(r0)
                goto L2a
            Lf:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.s
                if (r3 != r1) goto L1a
                android.os.Message r0 = r0.u
                if (r0 == 0) goto L1a
                goto La
            L1a:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.w
                if (r3 != r1) goto L29
                android.os.Message r3 = r0.y
                if (r3 == 0) goto L29
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L2a
            L29:
                r3 = 0
            L2a:
                if (r3 == 0) goto L2f
                r3.sendToTarget()
            L2f:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.R
                r1 = 1
                androidx.appcompat.app.i r3 = r3.f20b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.a.onClick(android.view.View):void");
        }
    }

    class b implements NestedScrollView.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f22a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f23b;

        b(View view, View view2) {
            this.f22a = view;
            this.f23b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.b
        public void a(NestedScrollView nestedScrollView, int r2, int r3, int r4, int r5) {
            AlertController.g(nestedScrollView, this.f22a, this.f23b);
        }
    }

    class c implements Runnable {
        final /* synthetic */ View d;
        final /* synthetic */ View e;

        c(View view, View view2) {
            this.d = view;
            this.e = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.g(AlertController.this.A, this.d, this.e);
        }
    }

    class d implements AbsListView.OnScrollListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f25a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f26b;

        d(View view, View view2) {
            this.f25a = view;
            this.f26b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int r2, int r3, int r4) {
            AlertController.g(absListView, this.f25a, this.f26b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int r2) {
        }
    }

    class e implements Runnable {
        final /* synthetic */ View d;
        final /* synthetic */ View e;

        e(View view, View view2) {
            this.d = view;
            this.e = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.g(AlertController.this.g, this.d, this.e);
        }
    }

    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public boolean N;
        public AdapterView.OnItemSelectedListener O;
        public e P;

        /* renamed from: a, reason: collision with root package name */
        public final Context f28a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f29b;
        public Drawable d;
        public CharSequence f;
        public View g;
        public CharSequence h;
        public CharSequence i;
        public Drawable j;
        public DialogInterface.OnClickListener k;
        public CharSequence l;
        public Drawable m;
        public DialogInterface.OnClickListener n;
        public CharSequence o;
        public Drawable p;
        public DialogInterface.OnClickListener q;
        public DialogInterface.OnCancelListener s;
        public DialogInterface.OnDismissListener t;
        public DialogInterface.OnKeyListener u;
        public CharSequence[] v;
        public ListAdapter w;
        public DialogInterface.OnClickListener x;
        public int y;
        public View z;

        /* renamed from: c, reason: collision with root package name */
        public int f30c = 0;
        public int e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean Q = true;
        public boolean r = true;

        class a extends ArrayAdapter<CharSequence> {
            final /* synthetic */ RecycleListView d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int r3, int r4, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, r3, r4, charSequenceArr);
                this.d = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int r2, View view, ViewGroup viewGroup) {
                View view2 = super.getView(r2, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[r2]) {
                    this.d.setItemChecked(r2, true);
                }
                return view2;
            }
        }

        class b extends CursorAdapter {
            private final int d;
            private final int e;
            final /* synthetic */ RecycleListView f;
            final /* synthetic */ AlertController g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f = recycleListView;
                this.g = alertController;
                Cursor cursor2 = getCursor();
                this.d = cursor2.getColumnIndexOrThrow(f.this.L);
                this.e = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.d));
                this.f.setItemChecked(cursor.getPosition(), cursor.getInt(this.e) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f29b.inflate(this.g.M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {
            final /* synthetic */ AlertController d;

            c(AlertController alertController) {
                this.d = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int r3, long j) {
                f.this.x.onClick(this.d.f20b, r3);
                if (f.this.H) {
                    return;
                }
                this.d.f20b.dismiss();
            }
        }

        class d implements AdapterView.OnItemClickListener {
            final /* synthetic */ RecycleListView d;
            final /* synthetic */ AlertController e;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.d = recycleListView;
                this.e = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int r3, long j) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[r3] = this.d.isItemChecked(r3);
                }
                f.this.J.onClick(this.e.f20b, r3, this.d.isItemChecked(r3));
            }
        }

        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.f28a = context;
            this.f29b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f29b
                int r1 = r11.L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.G
                r8 = 1
                if (r1 == 0) goto L35
                android.database.Cursor r1 = r10.K
                if (r1 != 0) goto L26
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r10.f28a
                int r4 = r11.M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L26:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r10.f28a
                android.database.Cursor r4 = r10.K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L35:
                boolean r1 = r10.H
                if (r1 == 0) goto L3c
                int r1 = r11.N
                goto L3e
            L3c:
                int r1 = r11.O
            L3e:
                r4 = r1
                android.database.Cursor r1 = r10.K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L5d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f28a
                android.database.Cursor r5 = r10.K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L5d:
                android.widget.ListAdapter r9 = r10.w
                if (r9 == 0) goto L62
                goto L6b
            L62:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r10.f28a
                java.lang.CharSequence[] r3 = r10.v
                r9.<init>(r1, r4, r2, r3)
            L6b:
                androidx.appcompat.app.AlertController$f$e r1 = r10.P
                if (r1 == 0) goto L72
                r1.a(r0)
            L72:
                r11.H = r9
                int r1 = r10.I
                r11.I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.x
                if (r1 == 0) goto L85
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r11)
            L81:
                r0.setOnItemClickListener(r1)
                goto L8f
            L85:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.J
                if (r1 == 0) goto L8f
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r11)
                goto L81
            L8f:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.O
                if (r1 == 0) goto L96
                r0.setOnItemSelectedListener(r1)
            L96:
                boolean r1 = r10.H
                if (r1 == 0) goto L9e
                r0.setChoiceMode(r8)
                goto La6
            L9e:
                boolean r1 = r10.G
                if (r1 == 0) goto La6
                r1 = 2
                r0.setChoiceMode(r1)
            La6:
                r11.g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.f.b(androidx.appcompat.app.AlertController):void");
        }

        public void a(AlertController alertController) {
            View view = this.g;
            if (view != null) {
                alertController.n(view);
            } else {
                CharSequence charSequence = this.f;
                if (charSequence != null) {
                    alertController.s(charSequence);
                }
                Drawable drawable = this.d;
                if (drawable != null) {
                    alertController.p(drawable);
                }
                int r0 = this.f30c;
                if (r0 != 0) {
                    alertController.o(r0);
                }
                int r02 = this.e;
                if (r02 != 0) {
                    alertController.o(alertController.d(r02));
                }
            }
            CharSequence charSequence2 = this.h;
            if (charSequence2 != null) {
                alertController.q(charSequence2);
            }
            if (this.i != null || this.j != null) {
                alertController.l(-1, this.i, this.k, null, this.j);
            }
            if (this.l != null || this.m != null) {
                alertController.l(-2, this.l, this.n, null, this.m);
            }
            if (this.o != null || this.p != null) {
                alertController.l(-3, this.o, this.q, null, this.p);
            }
            if (this.v != null || this.K != null || this.w != null) {
                b(alertController);
            }
            View view2 = this.z;
            if (view2 != null) {
                if (this.E) {
                    alertController.v(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController.u(view2);
                    return;
                }
            }
            int r03 = this.y;
            if (r03 != 0) {
                alertController.t(r03);
            }
        }
    }

    private static final class g extends Handler {

        /* renamed from: b, reason: collision with root package name */
        private static final int f31b = 1;

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<DialogInterface> f32a;

        public g(DialogInterface dialogInterface) {
            this.f32a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int r0 = message.what;
            if (r0 == -3 || r0 == -2 || r0 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f32a.get(), message.what);
            } else {
                if (r0 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int r2, int r3, CharSequence[] charSequenceArr) {
            super(context, r2, r3, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int r3) {
            return r3;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, i iVar, Window window) {
        this.f19a = context;
        this.f20b = iVar;
        this.f21c = window;
        this.R = new g(iVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, a.m.AlertDialog, a.b.alertDialogStyle, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(a.m.AlertDialog_android_layout, 0);
        this.K = typedArrayObtainStyledAttributes.getResourceId(a.m.AlertDialog_buttonPanelSideLayout, 0);
        this.L = typedArrayObtainStyledAttributes.getResourceId(a.m.AlertDialog_listLayout, 0);
        this.M = typedArrayObtainStyledAttributes.getResourceId(a.m.AlertDialog_multiChoiceItemLayout, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(a.m.AlertDialog_singleChoiceItemLayout, 0);
        this.O = typedArrayObtainStyledAttributes.getResourceId(a.m.AlertDialog_listItemLayout, 0);
        this.P = typedArrayObtainStyledAttributes.getBoolean(a.m.AlertDialog_showTitle, true);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.m.AlertDialog_buttonIconDimen, 0);
        typedArrayObtainStyledAttributes.recycle();
        iVar.e(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f21c.findViewById(a.g.parentPanel);
        View viewFindViewById4 = viewFindViewById3.findViewById(a.g.topPanel);
        View viewFindViewById5 = viewFindViewById3.findViewById(a.g.contentPanel);
        View viewFindViewById6 = viewFindViewById3.findViewById(a.g.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(a.g.customPanel);
        y(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(a.g.topPanel);
        View viewFindViewById8 = viewGroup.findViewById(a.g.contentPanel);
        View viewFindViewById9 = viewGroup.findViewById(a.g.buttonPanel);
        ViewGroup viewGroupJ = j(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupJ2 = j(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupJ3 = j(viewFindViewById9, viewFindViewById6);
        x(viewGroupJ2);
        w(viewGroupJ3);
        z(viewGroupJ);
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (viewGroupJ == null || viewGroupJ.getVisibility() == 8) ? 0 : 1;
        boolean z3 = (viewGroupJ3 == null || viewGroupJ3.getVisibility() == 8) ? false : true;
        if (!z3 && viewGroupJ2 != null && (viewFindViewById2 = viewGroupJ2.findViewById(a.g.textSpacerNoButtons)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z2 != 0) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f == null && this.g == null) ? null : viewGroupJ.findViewById(a.g.titleDividerNoCustom);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupJ2 != null && (viewFindViewById = viewGroupJ2.findViewById(a.g.textSpacerNoTitle)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z2, z3);
        }
        if (!z) {
            View view = this.g;
            if (view == null) {
                view = this.A;
            }
            if (view != null) {
                r(viewGroupJ2, view, z2 | (z3 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int r1 = this.I;
        if (r1 > -1) {
            listView2.setItemChecked(r1, true);
            listView2.setSelection(r1);
        }
    }

    private static boolean B(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.b.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    static void g(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    @i0
    private ViewGroup j(@i0 View view, @i0 View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int k() {
        int r0 = this.K;
        return (r0 != 0 && this.Q == 1) ? r0 : this.J;
    }

    private void r(ViewGroup viewGroup, View view, int r7, int r8) {
        View viewFindViewById = this.f21c.findViewById(a.g.scrollIndicatorUp);
        View viewFindViewById2 = this.f21c.findViewById(a.g.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            f0.h2(view, r7, r8);
            if (viewFindViewById != null) {
                viewGroup.removeView(viewFindViewById);
            }
            if (viewFindViewById2 == null) {
                return;
            }
        } else {
            if (viewFindViewById != null && (r7 & 1) == 0) {
                viewGroup.removeView(viewFindViewById);
                viewFindViewById = null;
            }
            if (viewFindViewById2 != null && (r7 & 2) == 0) {
                viewGroup.removeView(viewFindViewById2);
                viewFindViewById2 = null;
            }
            if (viewFindViewById == null && viewFindViewById2 == null) {
                return;
            }
            if (this.f != null) {
                this.A.setOnScrollChangeListener(new b(viewFindViewById, viewFindViewById2));
                this.A.post(new c(viewFindViewById, viewFindViewById2));
                return;
            }
            ListView listView = this.g;
            if (listView != null) {
                listView.setOnScrollListener(new d(viewFindViewById, viewFindViewById2));
                this.g.post(new e(viewFindViewById, viewFindViewById2));
                return;
            } else {
                if (viewFindViewById != null) {
                    viewGroup.removeView(viewFindViewById);
                }
                if (viewFindViewById2 == null) {
                    return;
                }
            }
        }
        viewGroup.removeView(viewFindViewById2);
    }

    private void w(ViewGroup viewGroup) {
        int r0;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(R.id.button1);
        this.o = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.p) && this.r == null) {
            this.o.setVisibility(8);
            r0 = 0;
        } else {
            this.o.setText(this.p);
            Drawable drawable = this.r;
            if (drawable != null) {
                int r5 = this.d;
                drawable.setBounds(0, 0, r5, r5);
                this.o.setCompoundDrawables(this.r, null, null, null);
            }
            this.o.setVisibility(0);
            r0 = 1;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button2);
        this.s = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.t) && this.v == null) {
            this.s.setVisibility(8);
        } else {
            this.s.setText(this.t);
            Drawable drawable2 = this.v;
            if (drawable2 != null) {
                int r6 = this.d;
                drawable2.setBounds(0, 0, r6, r6);
                this.s.setCompoundDrawables(this.v, null, null, null);
            }
            this.s.setVisibility(0);
            r0 |= 2;
        }
        Button button4 = (Button) viewGroup.findViewById(R.id.button3);
        this.w = button4;
        button4.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.x) && this.z == null) {
            this.w.setVisibility(8);
        } else {
            this.w.setText(this.x);
            Drawable drawable3 = this.z;
            if (drawable3 != null) {
                int r62 = this.d;
                drawable3.setBounds(0, 0, r62, r62);
                this.w.setCompoundDrawables(this.z, null, null, null);
            }
            this.w.setVisibility(0);
            r0 |= 4;
        }
        if (B(this.f19a)) {
            if (r0 == 1) {
                button = this.o;
            } else if (r0 == 2) {
                button = this.s;
            } else if (r0 == 4) {
                button = this.w;
            }
            b(button);
        }
        if (r0 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void x(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f21c.findViewById(a.g.scrollView);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int r0 = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(r0);
        viewGroup2.addView(this.g, r0, new ViewGroup.LayoutParams(-1, -1));
    }

    private void y(ViewGroup viewGroup) {
        View viewInflate = this.h;
        if (viewInflate == null) {
            viewInflate = this.i != 0 ? LayoutInflater.from(this.f19a).inflate(this.i, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (!z || !a(viewInflate)) {
            this.f21c.setFlags(131072, 131072);
        }
        if (!z) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f21c.findViewById(a.g.custom);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.n) {
            frameLayout.setPadding(this.j, this.k, this.l, this.m);
        }
        if (this.g != null) {
            ((j0.b) viewGroup.getLayoutParams()).f162a = 0.0f;
        }
    }

    private void z(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f21c.findViewById(a.g.title_template).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f21c.findViewById(R.id.icon);
        if (!(!TextUtils.isEmpty(this.e)) || !this.P) {
            this.f21c.findViewById(a.g.title_template).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f21c.findViewById(a.g.alertTitle);
        this.E = textView;
        textView.setText(this.e);
        int r6 = this.B;
        if (r6 != 0) {
            this.D.setImageResource(r6);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
        } else {
            this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
            this.D.setVisibility(8);
        }
    }

    public Button c(int r2) {
        if (r2 == -3) {
            return this.w;
        }
        if (r2 == -2) {
            return this.s;
        }
        if (r2 != -1) {
            return null;
        }
        return this.o;
    }

    public int d(int r4) {
        TypedValue typedValue = new TypedValue();
        this.f19a.getTheme().resolveAttribute(r4, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.g;
    }

    public void f() {
        this.f20b.setContentView(k());
        A();
    }

    public boolean h(int r1, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.u(keyEvent);
    }

    public boolean i(int r1, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.u(keyEvent);
    }

    public void l(int r1, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(r1, onClickListener);
        }
        if (r1 == -3) {
            this.x = charSequence;
            this.y = message;
            this.z = drawable;
        } else if (r1 == -2) {
            this.t = charSequence;
            this.u = message;
            this.v = drawable;
        } else {
            if (r1 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.p = charSequence;
            this.q = message;
            this.r = drawable;
        }
    }

    public void m(int r1) {
        this.Q = r1;
    }

    public void n(View view) {
        this.G = view;
    }

    public void o(int r2) {
        this.C = null;
        this.B = r2;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (r2 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
            }
        }
    }

    public void p(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
            }
        }
    }

    public void q(CharSequence charSequence) {
        this.f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void s(CharSequence charSequence) {
        this.e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void t(int r2) {
        this.h = null;
        this.i = r2;
        this.n = false;
    }

    public void u(View view) {
        this.h = view;
        this.i = 0;
        this.n = false;
    }

    public void v(View view, int r2, int r3, int r4, int r5) {
        this.h = view;
        this.i = 0;
        this.n = true;
        this.j = r2;
        this.k = r3;
        this.l = r4;
        this.m = r5;
    }
}

package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.p0;
import b.a.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends j0 implements b.a.f.c {
    static final boolean F0 = false;
    static final String G0 = "SearchView";
    private static final String H0 = "nm";
    static final n I0;
    View.OnKeyListener A0;
    private final TextView.OnEditorActionListener B0;
    private final AdapterView.OnItemClickListener C0;
    private final AdapterView.OnItemSelectedListener D0;
    final SearchAutoComplete E;
    private TextWatcher E0;
    private final View F;
    private final View G;
    private final View H;
    final ImageView I;
    final ImageView J;
    final ImageView K;
    final ImageView L;
    private final View M;
    private p N;
    private Rect O;
    private Rect P;
    private int[] Q;
    private int[] R;
    private final ImageView S;
    private final Drawable T;
    private final int U;
    private final int V;
    private final Intent W;
    private final Intent a0;
    private final CharSequence b0;
    private l c0;
    private k d0;
    View.OnFocusChangeListener e0;
    private m f0;
    private View.OnClickListener g0;
    private boolean h0;
    private boolean i0;
    b.j.b.a j0;
    private boolean k0;
    private CharSequence l0;
    private boolean m0;
    private boolean n0;
    private int o0;
    private boolean p0;
    private CharSequence q0;
    private CharSequence r0;
    private boolean s0;
    private int t0;
    SearchableInfo u0;
    private Bundle v0;
    private final Runnable w0;
    private Runnable x0;
    private final WeakHashMap<String, Drawable.ConstantState> y0;
    private final View.OnClickListener z0;

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static class SearchAutoComplete extends androidx.appcompat.widget.e {
        private int g;
        private SearchView h;
        private boolean i;
        final Runnable j;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.c();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, a.b.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int r3) {
            super(context, attributeSet, r3);
            this.j = new a();
            this.g = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int r1 = configuration.screenWidthDp;
            int r2 = configuration.screenHeightDp;
            if (r1 >= 960 && r2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (r1 < 600) {
                return (r1 < 640 || r2 < 480) ? 160 : 192;
            }
            return 192;
        }

        void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.I0.c(this);
                return;
            }
            setInputMethodMode(1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void c() {
            if (this.i) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.i = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.g <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.e, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.i) {
                removeCallbacks(this.j);
                post(this.j);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int r2, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onFocusChanged(z, r2, rect);
            this.h.g0();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int r3, KeyEvent keyEvent) {
            if (r3 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.h.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(r3, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onWindowFocusChanged(z);
            if (z && this.h.hasFocus() && getVisibility() == 0) {
                this.i = true;
                if (SearchView.R(getContext())) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.i = false;
                removeCallbacks(this.j);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.i = true;
                    return;
                }
                this.i = false;
                removeCallbacks(this.j);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.h = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int r1) {
            super.setThreshold(r1);
            this.g = r1;
        }
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int r2, int r3, int r4) {
            SearchView.this.f0(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m0();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.j.b.a aVar = SearchView.this.j0;
            if (aVar instanceof t0) {
                aVar.b(null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.e0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            SearchView.this.F();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            SearchView searchView = SearchView.this;
            if (view == searchView.I) {
                searchView.c0();
                return;
            }
            if (view == searchView.K) {
                searchView.Y();
                return;
            }
            if (view == searchView.J) {
                searchView.d0();
            } else if (view == searchView.L) {
                searchView.h0();
            } else if (view == searchView.E) {
                searchView.L();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int r5, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.u0 == null) {
                return false;
            }
            if (searchView.E.isPopupShowing() && SearchView.this.E.getListSelection() != -1) {
                return SearchView.this.e0(view, r5, keyEvent);
            }
            if (SearchView.this.E.b() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || r5 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.W(0, null, searchView2.E.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int r2, KeyEvent keyEvent) {
            SearchView.this.d0();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int r3, long j) {
            SearchView.this.Z(r3, 0, null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int r3, long j) {
            SearchView.this.a0(r3);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public interface k {
        boolean a();
    }

    public interface l {
        boolean a(String str);

        boolean b(String str);
    }

    public interface m {
        boolean a(int r1);

        boolean b(int r1);
    }

    private static class n {

        /* renamed from: a, reason: collision with root package name */
        private Method f110a;

        /* renamed from: b, reason: collision with root package name */
        private Method f111b;

        /* renamed from: c, reason: collision with root package name */
        private Method f112c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        n() throws NoSuchMethodException, SecurityException {
            this.f110a = null;
            this.f111b = null;
            this.f112c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f110a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f111b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f112c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            d();
            Method method = this.f111b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            d();
            Method method = this.f110a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            d();
            Method method = this.f112c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    static class o extends b.k.b.a {
        public static final Parcelable.Creator<o> CREATOR = new a();
        boolean f;

        class a implements Parcelable.ClassLoaderCreator<o> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public o createFromParcel(Parcel parcel) {
                return new o(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public o[] newArray(int r1) {
                return new o[r1];
            }
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f + "}";
        }

        @Override // b.k.b.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int r2) {
            super.writeToParcel(parcel, r2);
            parcel.writeValue(Boolean.valueOf(this.f));
        }
    }

    private static class p extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        private final View f113a;

        /* renamed from: b, reason: collision with root package name */
        private final Rect f114b;

        /* renamed from: c, reason: collision with root package name */
        private final Rect f115c;
        private final Rect d;
        private final int e;
        private boolean f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f114b = new Rect();
            this.d = new Rect();
            this.f115c = new Rect();
            a(rect, rect2);
            this.f113a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f114b.set(rect);
            this.d.set(rect);
            Rect rect3 = this.d;
            int r0 = this.e;
            rect3.inset(-r0, -r0);
            this.f115c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            float width;
            int height;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f;
                    if (z2 && !this.d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f;
                        this.f = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else {
                if (this.f114b.contains(x, y)) {
                    this.f = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            if (!z || this.f115c.contains(x, y)) {
                Rect rect = this.f115c;
                width = x - rect.left;
                height = y - rect.top;
            } else {
                width = this.f113a.getWidth() / 2;
                height = this.f113a.getHeight() / 2;
            }
            motionEvent.setLocation(width, height);
            return this.f113a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        I0 = Build.VERSION.SDK_INT < 29 ? new n() : null;
    }

    public SearchView(@androidx.annotation.h0 Context context) {
        this(context, null);
    }

    public SearchView(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.searchViewStyle);
    }

    public SearchView(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet, int r6) {
        super(context, attributeSet, r6);
        this.O = new Rect();
        this.P = new Rect();
        this.Q = new int[2];
        this.R = new int[2];
        this.w0 = new b();
        this.x0 = new c();
        this.y0 = new WeakHashMap<>();
        this.z0 = new f();
        this.A0 = new g();
        this.B0 = new h();
        this.C0 = new i();
        this.D0 = new j();
        this.E0 = new a();
        a1 a1VarG = a1.G(context, attributeSet, a.m.SearchView, r6, 0);
        LayoutInflater.from(context).inflate(a1VarG.u(a.m.SearchView_layout, a.j.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(a.g.search_src_text);
        this.E = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.F = findViewById(a.g.search_edit_frame);
        this.G = findViewById(a.g.search_plate);
        this.H = findViewById(a.g.submit_area);
        this.I = (ImageView) findViewById(a.g.search_button);
        this.J = (ImageView) findViewById(a.g.search_go_btn);
        this.K = (ImageView) findViewById(a.g.search_close_btn);
        this.L = (ImageView) findViewById(a.g.search_voice_btn);
        this.S = (ImageView) findViewById(a.g.search_mag_icon);
        b.i.p.f0.B1(this.G, a1VarG.h(a.m.SearchView_queryBackground));
        b.i.p.f0.B1(this.H, a1VarG.h(a.m.SearchView_submitBackground));
        this.I.setImageDrawable(a1VarG.h(a.m.SearchView_searchIcon));
        this.J.setImageDrawable(a1VarG.h(a.m.SearchView_goIcon));
        this.K.setImageDrawable(a1VarG.h(a.m.SearchView_closeIcon));
        this.L.setImageDrawable(a1VarG.h(a.m.SearchView_voiceIcon));
        this.S.setImageDrawable(a1VarG.h(a.m.SearchView_searchIcon));
        this.T = a1VarG.h(a.m.SearchView_searchHintIcon);
        c1.a(this.I, getResources().getString(a.k.abc_searchview_description_search));
        this.U = a1VarG.u(a.m.SearchView_suggestionRowLayout, a.j.abc_search_dropdown_item_icons_2line);
        this.V = a1VarG.u(a.m.SearchView_commitIcon, 0);
        this.I.setOnClickListener(this.z0);
        this.K.setOnClickListener(this.z0);
        this.J.setOnClickListener(this.z0);
        this.L.setOnClickListener(this.z0);
        this.E.setOnClickListener(this.z0);
        this.E.addTextChangedListener(this.E0);
        this.E.setOnEditorActionListener(this.B0);
        this.E.setOnItemClickListener(this.C0);
        this.E.setOnItemSelectedListener(this.D0);
        this.E.setOnKeyListener(this.A0);
        this.E.setOnFocusChangeListener(new d());
        setIconifiedByDefault(a1VarG.a(a.m.SearchView_iconifiedByDefault, true));
        int r4 = a1VarG.g(a.m.SearchView_android_maxWidth, -1);
        if (r4 != -1) {
            setMaxWidth(r4);
        }
        this.b0 = a1VarG.x(a.m.SearchView_defaultQueryHint);
        this.l0 = a1VarG.x(a.m.SearchView_queryHint);
        int r42 = a1VarG.o(a.m.SearchView_android_imeOptions, -1);
        if (r42 != -1) {
            setImeOptions(r42);
        }
        int r43 = a1VarG.o(a.m.SearchView_android_inputType, -1);
        if (r43 != -1) {
            setInputType(r43);
        }
        setFocusable(a1VarG.a(a.m.SearchView_android_focusable, true));
        a1VarG.I();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.W = intent;
        intent.addFlags(268435456);
        this.W.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.a0 = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById = findViewById(this.E.getDropDownAnchor());
        this.M = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.addOnLayoutChangeListener(new e());
        }
        r0(this.h0);
        n0();
    }

    private Intent G(String str, Uri uri, String str2, String str3, int r6, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.r0);
        if (str3 != null) {
            intent.putExtra(c.a.b.b.a.d.f1596b, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.v0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (r6 != 0) {
            intent.putExtra("action_key", r6);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.u0.getSearchActivity());
        return intent;
    }

    private Intent H(Cursor cursor, int r10, String str) {
        int position;
        String strU;
        try {
            String strU2 = t0.u(cursor, "suggest_intent_action");
            if (strU2 == null) {
                strU2 = this.u0.getSuggestIntentAction();
            }
            if (strU2 == null) {
                strU2 = "android.intent.action.SEARCH";
            }
            String str2 = strU2;
            String strU3 = t0.u(cursor, "suggest_intent_data");
            if (strU3 == null) {
                strU3 = this.u0.getSuggestIntentData();
            }
            if (strU3 != null && (strU = t0.u(cursor, "suggest_intent_data_id")) != null) {
                strU3 = strU3 + "/" + Uri.encode(strU);
            }
            return G(str2, strU3 == null ? null : Uri.parse(strU3), t0.u(cursor, "suggest_intent_extra_data"), t0.u(cursor, "suggest_intent_query"), r10, str);
        } catch (RuntimeException e2) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w(G0, "Search suggestions cursor at row " + position + " returned exception.", e2);
            return null;
        }
    }

    private Intent I(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.v0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent J(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void K() {
        this.E.dismissDropDown();
    }

    private void M(View view, Rect rect) {
        view.getLocationInWindow(this.Q);
        getLocationInWindow(this.R);
        int[] r0 = this.Q;
        int r2 = r0[1];
        int[] r3 = this.R;
        int r22 = r2 - r3[1];
        int r02 = r0[0] - r3[0];
        rect.set(r02, r22, view.getWidth() + r02, view.getHeight() + r22);
    }

    private CharSequence N(CharSequence charSequence) {
        if (!this.h0 || this.T == null) {
            return charSequence;
        }
        int textSize = (int) (this.E.getTextSize() * 1.25d);
        this.T.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.T), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean O() {
        SearchableInfo searchableInfo = this.u0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.u0.getVoiceSearchLaunchWebSearch()) {
            intent = this.W;
        } else if (this.u0.getVoiceSearchLaunchRecognizer()) {
            intent = this.a0;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean R(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean T() {
        return (this.k0 || this.p0) && !Q();
    }

    private void V(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e2) {
            Log.e(G0, "Failed launch activity: " + intent, e2);
        }
    }

    private boolean X(int r2, int r3, String str) {
        Cursor cursorC = this.j0.c();
        if (cursorC == null || !cursorC.moveToPosition(r2)) {
            return false;
        }
        V(H(cursorC, r3, str));
        return true;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(a.e.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(a.e.abc_search_view_preferred_width);
    }

    private void i0() {
        post(this.w0);
    }

    private void j0(int r3) {
        CharSequence charSequenceA;
        Editable text = this.E.getText();
        Cursor cursorC = this.j0.c();
        if (cursorC == null) {
            return;
        }
        if (!cursorC.moveToPosition(r3) || (charSequenceA = this.j0.a(cursorC)) == null) {
            setQuery(text);
        } else {
            setQuery(charSequenceA);
        }
    }

    private void l0() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.E.getText());
        if (!z2 && (!this.h0 || this.s0)) {
            z = false;
        }
        this.K.setVisibility(z ? 0 : 8);
        Drawable drawable = this.K.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void n0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.E;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(N(queryHint));
    }

    private void o0() {
        this.E.setThreshold(this.u0.getSuggestThreshold());
        this.E.setImeOptions(this.u0.getImeOptions());
        int inputType = this.u0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.u0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.E.setInputType(inputType);
        b.j.b.a aVar = this.j0;
        if (aVar != null) {
            aVar.b(null);
        }
        if (this.u0.getSuggestAuthority() != null) {
            t0 t0Var = new t0(getContext(), this, this.u0, this.y0);
            this.j0 = t0Var;
            this.E.setAdapter(t0Var);
            ((t0) this.j0).E(this.m0 ? 2 : 1);
        }
    }

    private void p0() {
        this.H.setVisibility((T() && (this.J.getVisibility() == 0 || this.L.getVisibility() == 0)) ? 0 : 8);
    }

    private void q0(boolean z) {
        this.J.setVisibility((this.k0 && T() && hasFocus() && (z || !this.p0)) ? 0 : 8);
    }

    private void r0(boolean z) {
        this.i0 = z;
        int r2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.E.getText());
        this.I.setVisibility(r2);
        q0(z2);
        this.F.setVisibility(z ? 8 : 0);
        this.S.setVisibility((this.S.getDrawable() == null || this.h0) ? 8 : 0);
        l0();
        s0(!z2);
        p0();
    }

    private void s0(boolean z) {
        int r1 = 8;
        if (this.p0 && !Q() && z) {
            this.J.setVisibility(8);
            r1 = 0;
        }
        this.L.setVisibility(r1);
    }

    private void setQuery(CharSequence charSequence) {
        this.E.setText(charSequence);
        this.E.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void F() {
        if (this.M.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.G.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = g1.b(this);
            int dimensionPixelSize = this.h0 ? resources.getDimensionPixelSize(a.e.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(a.e.abc_dropdownitem_text_padding_left) : 0;
            this.E.getDropDownBackground().getPadding(rect);
            int r0 = rect.left;
            this.E.setDropDownHorizontalOffset(zB ? -r0 : paddingLeft - (r0 + dimensionPixelSize));
            this.E.setDropDownWidth((((this.M.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    void L() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            this.E.refreshAutoCompleteResults();
        } else {
            I0.b(this.E);
            I0.a(this.E);
        }
    }

    public boolean P() {
        return this.h0;
    }

    public boolean Q() {
        return this.i0;
    }

    public boolean S() {
        return this.m0;
    }

    public boolean U() {
        return this.k0;
    }

    void W(int r8, String str, String str2) {
        getContext().startActivity(G("android.intent.action.SEARCH", null, null, str2, r8, str));
    }

    void Y() {
        if (!TextUtils.isEmpty(this.E.getText())) {
            this.E.setText("");
            this.E.requestFocus();
            this.E.setImeVisibility(true);
        } else if (this.h0) {
            k kVar = this.d0;
            if (kVar == null || !kVar.a()) {
                clearFocus();
                r0(true);
            }
        }
    }

    boolean Z(int r1, int r2, String str) {
        m mVar = this.f0;
        if (mVar != null && mVar.b(r1)) {
            return false;
        }
        X(r1, 0, null);
        this.E.setImeVisibility(false);
        K();
        return true;
    }

    boolean a0(int r2) {
        m mVar = this.f0;
        if (mVar != null && mVar.a(r2)) {
            return false;
        }
        j0(r2);
        return true;
    }

    @Override // b.a.f.c
    public void b() {
        if (this.s0) {
            return;
        }
        this.s0 = true;
        int imeOptions = this.E.getImeOptions();
        this.t0 = imeOptions;
        this.E.setImeOptions(imeOptions | 33554432);
        this.E.setText("");
        setIconified(false);
    }

    void b0(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void c0() {
        r0(false);
        this.E.requestFocus();
        this.E.setImeVisibility(true);
        View.OnClickListener onClickListener = this.g0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.n0 = true;
        super.clearFocus();
        this.E.clearFocus();
        this.E.setImeVisibility(false);
        this.n0 = false;
    }

    void d0() {
        Editable text = this.E.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        l lVar = this.c0;
        if (lVar == null || !lVar.b(text.toString())) {
            if (this.u0 != null) {
                W(0, null, text.toString());
            }
            this.E.setImeVisibility(false);
            K();
        }
    }

    boolean e0(View view, int r3, KeyEvent keyEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.u0 != null && this.j0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (r3 == 66 || r3 == 84 || r3 == 61) {
                return Z(this.E.getListSelection(), 0, null);
            }
            if (r3 == 21 || r3 == 22) {
                this.E.setSelection(r3 == 21 ? 0 : this.E.length());
                this.E.setListSelection(0);
                this.E.clearListSelection();
                this.E.a();
                return true;
            }
            if (r3 != 19 || this.E.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    void f0(CharSequence charSequence) {
        Editable text = this.E.getText();
        this.r0 = text;
        boolean z = !TextUtils.isEmpty(text);
        q0(z);
        s0(!z);
        l0();
        p0();
        if (this.c0 != null && !TextUtils.equals(charSequence, this.q0)) {
            this.c0.a(charSequence.toString());
        }
        this.q0 = charSequence.toString();
    }

    void g0() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        r0(Q());
        i0();
        if (this.E.hasFocus()) {
            L();
        }
    }

    public int getImeOptions() {
        return this.E.getImeOptions();
    }

    public int getInputType() {
        return this.E.getInputType();
    }

    public int getMaxWidth() {
        return this.o0;
    }

    public CharSequence getQuery() {
        return this.E.getText();
    }

    @androidx.annotation.i0
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.l0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.u0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.b0 : getContext().getText(this.u0.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.V;
    }

    int getSuggestionRowLayout() {
        return this.U;
    }

    public b.j.b.a getSuggestionsAdapter() {
        return this.j0;
    }

    @Override // b.a.f.c
    public void h() {
        k0("", false);
        clearFocus();
        r0(true);
        this.E.setImeOptions(this.t0);
        this.s0 = false;
    }

    void h0() {
        Intent intentI;
        SearchableInfo searchableInfo = this.u0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                intentI = J(this.W, searchableInfo);
            } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                return;
            } else {
                intentI = I(this.a0, searchableInfo);
            }
            getContext().startActivity(intentI);
        } catch (ActivityNotFoundException unused) {
            Log.w(G0, "Could not find voice search activity");
        }
    }

    public void k0(CharSequence charSequence, boolean z) {
        this.E.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.E;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.r0 = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        d0();
    }

    void m0() {
        int[] r0 = this.E.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.G.getBackground();
        if (background != null) {
            background.setState(r0);
        }
        Drawable background2 = this.H.getBackground();
        if (background2 != null) {
            background2.setState(r0);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.w0);
        post(this.x0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.j0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int r3, int r4, int r5, int r6) {
        super.onLayout(z, r3, r4, r5, r6);
        if (z) {
            M(this.E, this.O);
            Rect rect = this.P;
            Rect rect2 = this.O;
            rect.set(rect2.left, 0, rect2.right, r6 - r4);
            p pVar = this.N;
            if (pVar != null) {
                pVar.a(this.P, this.O);
                return;
            }
            p pVar2 = new p(this.P, this.O, this.E);
            this.N = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    @Override // androidx.appcompat.widget.j0, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.Q()
            if (r0 == 0) goto La
            super.onMeasure(r4, r5)
            return
        La:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2c
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1d
            goto L39
        L1d:
            int r0 = r3.o0
            if (r0 <= 0) goto L39
            goto L30
        L22:
            int r4 = r3.o0
            if (r4 <= 0) goto L27
            goto L39
        L27:
            int r4 = r3.getPreferredWidth()
            goto L39
        L2c:
            int r0 = r3.o0
            if (r0 <= 0) goto L31
        L30:
            goto L35
        L31:
            int r0 = r3.getPreferredWidth()
        L35:
            int r4 = java.lang.Math.min(r0, r4)
        L39:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L4b
            if (r0 == 0) goto L46
            goto L53
        L46:
            int r5 = r3.getPreferredHeight()
            goto L53
        L4b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L53:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.a());
        r0(oVar.f);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f = Q();
        return oVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        i0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int r3, Rect rect) {
        if (this.n0 || !isFocusable()) {
            return false;
        }
        if (Q()) {
            return super.requestFocus(r3, rect);
        }
        boolean zRequestFocus = this.E.requestFocus(r3, rect);
        if (zRequestFocus) {
            r0(false);
        }
        return zRequestFocus;
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void setAppSearchData(Bundle bundle) {
        this.v0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            Y();
        } else {
            c0();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.h0 == z) {
            return;
        }
        this.h0 = z;
        r0(z);
        n0();
    }

    public void setImeOptions(int r2) {
        this.E.setImeOptions(r2);
    }

    public void setInputType(int r2) {
        this.E.setInputType(r2);
    }

    public void setMaxWidth(int r1) {
        this.o0 = r1;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.d0 = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.e0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.c0 = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.g0 = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.f0 = mVar;
    }

    public void setQueryHint(@androidx.annotation.i0 CharSequence charSequence) {
        this.l0 = charSequence;
        n0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.m0 = z;
        b.j.b.a aVar = this.j0;
        if (aVar instanceof t0) {
            ((t0) aVar).E(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.u0 = searchableInfo;
        if (searchableInfo != null) {
            o0();
            n0();
        }
        boolean zO = O();
        this.p0 = zO;
        if (zO) {
            this.E.setPrivateImeOptions(H0);
        }
        r0(Q());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.k0 = z;
        r0(Q());
    }

    public void setSuggestionsAdapter(b.j.b.a aVar) {
        this.j0 = aVar;
        this.E.setAdapter(aVar);
    }
}

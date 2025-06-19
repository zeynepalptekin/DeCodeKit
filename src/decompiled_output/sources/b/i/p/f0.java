package b.i.p;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.p0;
import androidx.annotation.w0;
import b.i.a;
import b.i.p.a;
import b.i.p.p0.d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class f0 {
    public static final int A = 1;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 4;
    public static final int E = 8;
    public static final int F = 16;
    public static final int G = 32;
    private static Field I = null;
    private static boolean J = false;
    private static Field K = null;
    private static boolean L = false;
    private static Method M = null;
    private static Method N = null;
    private static boolean O = false;
    private static WeakHashMap<View, String> P = null;
    private static Method R = null;
    private static Field S = null;
    private static ThreadLocal<Rect> U = null;

    /* renamed from: a, reason: collision with root package name */
    private static final String f1178a = "ViewCompat";

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f1179b = 0;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f1180c = 1;

    @Deprecated
    public static final int d = 2;
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 4;
    public static final int i = 0;
    public static final int j = 1;
    public static final int k = 2;

    @Deprecated
    public static final int l = 0;

    @Deprecated
    public static final int m = 1;

    @Deprecated
    public static final int n = 2;
    public static final int o = 0;
    public static final int p = 1;
    public static final int q = 2;
    public static final int r = 3;

    @Deprecated
    public static final int s = 16777215;

    @Deprecated
    public static final int t = -16777216;

    @Deprecated
    public static final int u = 16;

    @Deprecated
    public static final int v = 16777216;
    public static final int w = 0;
    public static final int x = 1;
    public static final int y = 2;
    public static final int z = 0;
    private static final AtomicInteger H = new AtomicInteger(1);
    private static WeakHashMap<View, j0> Q = null;
    private static boolean T = false;
    private static final int[] V = {a.e.accessibility_custom_action_0, a.e.accessibility_custom_action_1, a.e.accessibility_custom_action_2, a.e.accessibility_custom_action_3, a.e.accessibility_custom_action_4, a.e.accessibility_custom_action_5, a.e.accessibility_custom_action_6, a.e.accessibility_custom_action_7, a.e.accessibility_custom_action_8, a.e.accessibility_custom_action_9, a.e.accessibility_custom_action_10, a.e.accessibility_custom_action_11, a.e.accessibility_custom_action_12, a.e.accessibility_custom_action_13, a.e.accessibility_custom_action_14, a.e.accessibility_custom_action_15, a.e.accessibility_custom_action_16, a.e.accessibility_custom_action_17, a.e.accessibility_custom_action_18, a.e.accessibility_custom_action_19, a.e.accessibility_custom_action_20, a.e.accessibility_custom_action_21, a.e.accessibility_custom_action_22, a.e.accessibility_custom_action_23, a.e.accessibility_custom_action_24, a.e.accessibility_custom_action_25, a.e.accessibility_custom_action_26, a.e.accessibility_custom_action_27, a.e.accessibility_custom_action_28, a.e.accessibility_custom_action_29, a.e.accessibility_custom_action_30, a.e.accessibility_custom_action_31};
    private static f W = new f();

    class a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f1181a;

        a(y yVar) {
            this.f1181a = yVar;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return this.f1181a.a(view, o0.C(windowInsets)).B();
        }
    }

    class b implements View.OnUnhandledKeyEventListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f1182a;

        b(o oVar) {
            this.f1182a = oVar;
        }

        @Override // android.view.View.OnUnhandledKeyEventListener
        public boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
            return this.f1182a.onUnhandledKeyEvent(view, keyEvent);
        }
    }

    class c extends g<Boolean> {
        c(int r1, Class cls, int r3) {
            super(r1, cls, r3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // b.i.p.f0.g
        @androidx.annotation.m0(28)
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean d(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // b.i.p.f0.g
        @androidx.annotation.m0(28)
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, Boolean bool) {
            view.setScreenReaderFocusable(bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // b.i.p.f0.g
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    class d extends g<CharSequence> {
        d(int r1, Class cls, int r3, int r4) {
            super(r1, cls, r3, r4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // b.i.p.f0.g
        @androidx.annotation.m0(28)
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // b.i.p.f0.g
        @androidx.annotation.m0(28)
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // b.i.p.f0.g
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class e extends g<Boolean> {
        e(int r1, Class cls, int r3) {
            super(r1, cls, r3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // b.i.p.f0.g
        @androidx.annotation.m0(28)
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean d(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // b.i.p.f0.g
        @androidx.annotation.m0(28)
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, Boolean bool) {
            view.setAccessibilityHeading(bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // b.i.p.f0.g
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    static class f implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        private WeakHashMap<View, Boolean> d = new WeakHashMap<>();

        f() {
        }

        @androidx.annotation.m0(19)
        private void b(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                if (z2) {
                    f0.X0(view, 16);
                }
                this.d.put(view, Boolean.valueOf(z2));
            }
        }

        @androidx.annotation.m0(19)
        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @androidx.annotation.m0(19)
        private void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        @androidx.annotation.m0(19)
        void a(View view) {
            this.d.put(view, Boolean.valueOf(view.getVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        @androidx.annotation.m0(19)
        void d(View view) {
            this.d.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @androidx.annotation.m0(19)
        public void onGlobalLayout() {
            for (Map.Entry<View, Boolean> entry : this.d.entrySet()) {
                b(entry.getKey(), entry.getValue().booleanValue());
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        @androidx.annotation.m0(19)
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static abstract class g<T> {

        /* renamed from: a, reason: collision with root package name */
        private final int f1183a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<T> f1184b;

        /* renamed from: c, reason: collision with root package name */
        private final int f1185c;

        g(int r2, Class<T> cls, int r4) {
            this(r2, cls, 0, r4);
        }

        g(int r1, Class<T> cls, int r3, int r4) {
            this.f1183a = r1;
            this.f1184b = cls;
            this.f1185c = r4;
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= 19;
        }

        private boolean c() {
            return Build.VERSION.SDK_INT >= this.f1185c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
        }

        abstract T d(View view);

        abstract void e(View view, T t);

        T f(View view) {
            if (c()) {
                return d(view);
            }
            if (!b()) {
                return null;
            }
            T t = (T) view.getTag(this.f1183a);
            if (this.f1184b.isInstance(t)) {
                return t;
            }
            return null;
        }

        void g(View view, T t) {
            if (c()) {
                e(view, t);
            } else if (b() && h(f(view), t)) {
                f0.e0(view);
                view.setTag(this.f1183a, t);
                f0.X0(view, 0);
            }
        }

        boolean h(T t, T t2) {
            return !t2.equals(t);
        }
    }

    @androidx.annotation.m0(21)
    private static class h {
        private h() {
        }

        static o0 a(@androidx.annotation.h0 View view, @androidx.annotation.h0 o0 o0Var, @androidx.annotation.h0 Rect rect) {
            WindowInsets windowInsetsB = o0Var.B();
            if (windowInsetsB != null) {
                return o0.C(view.computeSystemWindowInsets(windowInsetsB, rect));
            }
            rect.setEmpty();
            return o0Var;
        }
    }

    @androidx.annotation.m0(23)
    private static class i {
        private i() {
        }

        public static WindowInsets a(View view) {
            return view.getRootWindowInsets();
        }
    }

    @androidx.annotation.m0(29)
    private static class j {
        private j() {
        }

        static void a(@androidx.annotation.h0 View view, @androidx.annotation.h0 Context context, @androidx.annotation.h0 int[] r2, @androidx.annotation.i0 AttributeSet attributeSet, @androidx.annotation.h0 TypedArray typedArray, int r5, int r6) {
            view.saveAttributeDataForStyleable(context, r2, attributeSet, typedArray, r5, r6);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface k {
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface l {
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface m {
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface n {
    }

    public interface o {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface p {
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface q {
    }

    static class r {
        private static final ArrayList<WeakReference<View>> d = new ArrayList<>();

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.i0
        private WeakHashMap<View, Boolean> f1186a = null;

        /* renamed from: b, reason: collision with root package name */
        private SparseArray<WeakReference<View>> f1187b = null;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference<KeyEvent> f1188c = null;

        r() {
        }

        static r a(View view) {
            r rVar = (r) view.getTag(a.e.tag_unhandled_key_event_manager);
            if (rVar != null) {
                return rVar;
            }
            r rVar2 = new r();
            view.setTag(a.e.tag_unhandled_key_event_manager, rVar2);
            return rVar2;
        }

        @androidx.annotation.i0
        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f1186a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f1187b == null) {
                this.f1187b = new SparseArray<>();
            }
            return this.f1187b;
        }

        private boolean e(@androidx.annotation.h0 View view, @androidx.annotation.h0 KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(a.e.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((o) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f1186a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (d.isEmpty()) {
                return;
            }
            synchronized (d) {
                if (this.f1186a == null) {
                    this.f1186a = new WeakHashMap<>();
                }
                for (int size = d.size() - 1; size >= 0; size--) {
                    View view = d.get(size).get();
                    if (view == null) {
                        d.remove(size);
                    } else {
                        this.f1186a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f1186a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        static void h(View view) {
            synchronized (d) {
                Iterator<WeakReference<View>> it = d.iterator();
                while (it.hasNext()) {
                    if (it.next().get() == view) {
                        return;
                    }
                }
                d.add(new WeakReference<>(view));
            }
        }

        static void i(View view) {
            synchronized (d) {
                for (int r1 = 0; r1 < d.size(); r1++) {
                    if (d.get(r1).get() == view) {
                        d.remove(r1);
                        return;
                    }
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(viewC));
                }
            }
            return viewC != null;
        }

        boolean f(KeyEvent keyEvent) {
            int r3;
            WeakReference<KeyEvent> weakReference = this.f1188c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f1188c = new WeakReference<>(keyEvent);
            WeakReference<View> weakReferenceValueAt = null;
            SparseArray<WeakReference<View>> sparseArrayD = d();
            if (keyEvent.getAction() == 1 && (r3 = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReferenceValueAt = sparseArrayD.valueAt(r3);
                sparseArrayD.removeAt(r3);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && f0.J0(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    protected f0() {
    }

    public static void A(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            e0(view);
        }
    }

    public static float A0(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    public static void A1(@androidx.annotation.h0 View view, @androidx.annotation.i0 String... strArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setAutofillHints(strArr);
        }
    }

    public static int B() {
        int r0;
        int r1;
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            r0 = H.get();
            r1 = r0 + 1;
            if (r1 > 16777215) {
                r1 = 1;
            }
        } while (!H.compareAndSet(r0, r1));
        return r0;
    }

    public static boolean B0(@androidx.annotation.h0 View view) {
        return D(view) != null;
    }

    public static void B1(@androidx.annotation.h0 View view, @androidx.annotation.i0 Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    @androidx.annotation.i0
    public static b.i.p.a C(@androidx.annotation.h0 View view) {
        View.AccessibilityDelegate accessibilityDelegateD = D(view);
        if (accessibilityDelegateD == null) {
            return null;
        }
        return accessibilityDelegateD instanceof a.C0070a ? ((a.C0070a) accessibilityDelegateD).f1161a : new b.i.p.a(accessibilityDelegateD);
    }

    public static boolean C0(@androidx.annotation.h0 View view) {
        return Build.VERSION.SDK_INT >= 26 ? view.hasExplicitFocusable() : view.hasFocusable();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void C1(@androidx.annotation.h0 View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT < 21) {
            if (view instanceof d0) {
                ((d0) view).setSupportBackgroundTintList(colorStateList);
                return;
            }
            return;
        }
        view.setBackgroundTintList(colorStateList);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z2 = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background == null || !z2) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    @androidx.annotation.i0
    private static View.AccessibilityDelegate D(@androidx.annotation.h0 View view) {
        return Build.VERSION.SDK_INT >= 29 ? view.getAccessibilityDelegate() : E(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean D0(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.hasNestedScrollingParent();
        }
        if (view instanceof s) {
            return ((s) view).hasNestedScrollingParent();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void D1(@androidx.annotation.h0 View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT < 21) {
            if (view instanceof d0) {
                ((d0) view).setSupportBackgroundTintMode(mode);
                return;
            }
            return;
        }
        view.setBackgroundTintMode(mode);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z2 = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background == null || !z2) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    @androidx.annotation.i0
    private static View.AccessibilityDelegate E(@androidx.annotation.h0 View view) {
        if (T) {
            return null;
        }
        if (S == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                S = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                T = true;
                return null;
            }
        }
        try {
            Object obj = S.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            T = true;
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean E0(@androidx.annotation.h0 View view, int r2) {
        if (view instanceof b.i.p.q) {
            ((b.i.p.q) view).b(r2);
            return false;
        }
        if (r2 == 0) {
            return D0(view);
        }
        return false;
    }

    @Deprecated
    public static void E1(ViewGroup viewGroup, boolean z2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (R == null) {
            try {
                R = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e2) {
                Log.e(f1178a, "Unable to find childrenDrawingOrderEnabled", e2);
            }
            R.setAccessible(true);
        }
        try {
            R.invoke(viewGroup, Boolean.valueOf(z2));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e3) {
            Log.e(f1178a, "Unable to invoke childrenDrawingOrderEnabled", e3);
        }
    }

    public static int F(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    public static boolean F0(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    public static void F1(@androidx.annotation.h0 View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    public static b.i.p.p0.e G(@androidx.annotation.h0 View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = view.getAccessibilityNodeProvider()) == null) {
            return null;
        }
        return new b.i.p.p0.e(accessibilityNodeProvider);
    }

    public static boolean G0(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    public static void G1(@androidx.annotation.h0 View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f2);
        }
    }

    @w0
    public static CharSequence H(View view) {
        return e1().f(view);
    }

    public static boolean H0(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    @Deprecated
    public static void H1(View view, boolean z2) {
        view.setFitsSystemWindows(z2);
    }

    private static List<d.a> I(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(a.e.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(a.e.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    @w0
    public static boolean I0(View view) {
        Boolean boolF = a().f(view);
        if (boolF == null) {
            return false;
        }
        return boolF.booleanValue();
    }

    public static void I1(@androidx.annotation.h0 View view, boolean z2) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setFocusedByDefault(z2);
        }
    }

    @Deprecated
    public static float J(View view) {
        return view.getAlpha();
    }

    public static boolean J0(@androidx.annotation.h0 View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : view.getWindowToken() != null;
    }

    public static void J1(@androidx.annotation.h0 View view, boolean z2) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z2);
        }
    }

    private static int K(View view) {
        List<d.a> listI = I(view);
        int r2 = 0;
        int r3 = -1;
        while (true) {
            int[] r4 = V;
            if (r2 >= r4.length || r3 != -1) {
                break;
            }
            int r42 = r4[r2];
            boolean z2 = true;
            for (int r6 = 0; r6 < listI.size(); r6++) {
                z2 &= listI.get(r6).b() != r42;
            }
            if (z2) {
                r3 = r42;
            }
            r2++;
        }
        return r3;
    }

    public static boolean K0(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.isFocusedByDefault();
        }
        return false;
    }

    public static void K1(@androidx.annotation.h0 View view, int r3) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 19) {
            if (r0 < 16) {
                return;
            }
            if (r3 == 4) {
                r3 = 2;
            }
        }
        view.setImportantForAccessibility(r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ColorStateList L(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof d0) {
            return ((d0) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static boolean L0(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isImportantForAccessibility();
        }
        return true;
    }

    public static void L1(@androidx.annotation.h0 View view, int r3) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(r3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PorterDuff.Mode M(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof d0) {
            return ((d0) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    public static boolean M0(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.isImportantForAutofill();
        }
        return true;
    }

    public static void M1(@androidx.annotation.h0 View view, boolean z2) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setKeyboardNavigationCluster(z2);
        }
    }

    @androidx.annotation.i0
    public static Rect N(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    public static boolean N0(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.isInLayout();
        }
        return false;
    }

    public static void N1(@androidx.annotation.h0 View view, @androidx.annotation.w int r3) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setLabelFor(r3);
        }
    }

    @androidx.annotation.i0
    public static Display O(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (J0(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    public static boolean O0(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.isKeyboardNavigationCluster();
        }
        return false;
    }

    public static void O1(@androidx.annotation.h0 View view, Paint paint) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setLayerPaint(paint);
        } else {
            view.setLayerType(view.getLayerType(), paint);
            view.invalidate();
        }
    }

    public static float P(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    public static boolean P0(@androidx.annotation.h0 View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isLaidOut() : view.getWidth() > 0 && view.getHeight() > 0;
    }

    @Deprecated
    public static void P1(View view, int r1, Paint paint) {
        view.setLayerType(r1, paint);
    }

    private static Rect Q() {
        if (U == null) {
            U = new ThreadLocal<>();
        }
        Rect rect = U.get();
        if (rect == null) {
            rect = new Rect();
            U.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static boolean Q0(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLayoutDirectionResolved();
        }
        return false;
    }

    public static void Q1(@androidx.annotation.h0 View view, int r3) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setLayoutDirection(r3);
        }
    }

    public static boolean R(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean R0(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof s) {
            return ((s) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void R1(@androidx.annotation.h0 View view, boolean z2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setNestedScrollingEnabled(z2);
        } else if (view instanceof s) {
            ((s) view).setNestedScrollingEnabled(z2);
        }
    }

    public static int S(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    @Deprecated
    public static boolean S0(View view) {
        return view.isOpaque();
    }

    public static void S1(@androidx.annotation.h0 View view, int r3) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setNextClusterForwardId(r3);
        }
    }

    @SuppressLint({"InlinedApi"})
    public static int T(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    public static boolean T0(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    public static void T1(@androidx.annotation.h0 View view, @androidx.annotation.i0 y yVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (yVar == null) {
                view.setOnApplyWindowInsetsListener(null);
            } else {
                view.setOnApplyWindowInsetsListener(new a(yVar));
            }
        }
    }

    public static int U(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLabelFor();
        }
        return 0;
    }

    @w0
    public static boolean U0(View view) {
        Boolean boolF = t1().f(view);
        if (boolF == null) {
            return false;
        }
        return boolF.booleanValue();
    }

    @Deprecated
    public static void U1(View view, int r1) {
        view.setOverScrollMode(r1);
    }

    @Deprecated
    public static int V(View view) {
        return view.getLayerType();
    }

    @Deprecated
    public static void V0(View view) {
        view.jumpDrawablesToCurrentState();
    }

    public static void V1(@androidx.annotation.h0 View view, @androidx.annotation.k0 int r3, @androidx.annotation.k0 int r4, @androidx.annotation.k0 int r5, @androidx.annotation.k0 int r6) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(r3, r4, r5, r6);
        } else {
            view.setPadding(r3, r4, r5, r6);
        }
    }

    public static int W(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    public static View W0(@androidx.annotation.h0 View view, View view2, int r4) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.keyboardNavigationClusterSearch(view2, r4);
        }
        return null;
    }

    @Deprecated
    public static void W1(View view, float f2) {
        view.setPivotX(f2);
    }

    @androidx.annotation.i0
    @Deprecated
    public static Matrix X(View view) {
        return view.getMatrix();
    }

    @androidx.annotation.m0(19)
    static void X0(View view, int r3) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z2 = H(view) != null;
            if (F(view) != 0 || (z2 && view.getVisibility() == 0)) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z2 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(r3);
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, r3);
                } catch (AbstractMethodError e2) {
                    Log.e(f1178a, view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    @Deprecated
    public static void X1(View view, float f2) {
        view.setPivotY(f2);
    }

    @Deprecated
    public static int Y(View view) {
        return view.getMeasuredHeightAndState();
    }

    public static void Y0(@androidx.annotation.h0 View view, int r7) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 23) {
            view.offsetLeftAndRight(r7);
            return;
        }
        if (r0 < 21) {
            l(view, r7);
            return;
        }
        Rect rectQ = Q();
        boolean z2 = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectQ.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z2 = !rectQ.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        l(view, r7);
        if (z2 && rectQ.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectQ);
        }
    }

    public static void Y1(@androidx.annotation.h0 View view, a0 a0Var) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (a0Var != null ? a0Var.b() : null));
        }
    }

    @Deprecated
    public static int Z(View view) {
        return view.getMeasuredState();
    }

    public static void Z0(@androidx.annotation.h0 View view, int r7) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 23) {
            view.offsetTopAndBottom(r7);
            return;
        }
        if (r0 < 21) {
            m(view, r7);
            return;
        }
        Rect rectQ = Q();
        boolean z2 = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectQ.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z2 = !rectQ.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        m(view, r7);
        if (z2 && rectQ.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectQ);
        }
    }

    @Deprecated
    public static void Z1(View view, float f2) {
        view.setRotation(f2);
    }

    private static g<Boolean> a() {
        return new e(a.e.tag_accessibility_heading, Boolean.class, 28);
    }

    @Deprecated
    public static int a0(View view) {
        return view.getMeasuredWidthAndState();
    }

    @androidx.annotation.h0
    public static o0 a1(@androidx.annotation.h0 View view, @androidx.annotation.h0 o0 o0Var) {
        WindowInsets windowInsetsB;
        if (Build.VERSION.SDK_INT >= 21 && (windowInsetsB = o0Var.B()) != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsB);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsB)) {
                return o0.C(windowInsetsOnApplyWindowInsets);
            }
        }
        return o0Var;
    }

    @Deprecated
    public static void a2(View view, float f2) {
        view.setRotationX(f2);
    }

    public static int b(@androidx.annotation.h0 View view, @androidx.annotation.h0 CharSequence charSequence, @androidx.annotation.h0 b.i.p.p0.g gVar) {
        int r0 = K(view);
        if (r0 != -1) {
            c(view, new d.a(r0, charSequence, gVar));
        }
        return r0;
    }

    public static int b0(@androidx.annotation.h0 View view) throws NoSuchFieldException {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!L) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                K = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            L = true;
        }
        Field field = K;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    @Deprecated
    public static void b1(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    public static void b2(View view, float f2) {
        view.setRotationY(f2);
    }

    private static void c(@androidx.annotation.h0 View view, @androidx.annotation.h0 d.a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            e0(view);
            l1(aVar.b(), view);
            I(view).add(aVar);
            X0(view, 0);
        }
    }

    public static int c0(@androidx.annotation.h0 View view) throws NoSuchFieldException {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!J) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                I = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            J = true;
        }
        Field field = I;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static void c1(@androidx.annotation.h0 View view, b.i.p.p0.d dVar) {
        view.onInitializeAccessibilityNodeInfo(dVar.S1());
    }

    @Deprecated
    public static void c2(View view, boolean z2) {
        view.setSaveFromParentEnabled(z2);
    }

    public static void d(@androidx.annotation.h0 View view, @androidx.annotation.h0 Collection<View> collection, int r4) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.addKeyboardNavigationClusters(collection, r4);
        }
    }

    public static int d0(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getNextClusterForwardId();
        }
        return -1;
    }

    @Deprecated
    public static void d1(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    public static void d2(View view, float f2) {
        view.setScaleX(f2);
    }

    public static void e(@androidx.annotation.h0 View view, @androidx.annotation.h0 o oVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            b.f.i iVar = (b.f.i) view.getTag(a.e.tag_unhandled_key_listeners);
            if (iVar == null) {
                iVar = new b.f.i();
                view.setTag(a.e.tag_unhandled_key_listeners, iVar);
            }
            b bVar = new b(oVar);
            iVar.put(oVar, bVar);
            view.addOnUnhandledKeyEventListener(bVar);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(a.e.tag_unhandled_key_listeners);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(a.e.tag_unhandled_key_listeners, arrayList);
        }
        arrayList.add(oVar);
        if (arrayList.size() == 1) {
            r.h(view);
        }
    }

    static b.i.p.a e0(@androidx.annotation.h0 View view) {
        b.i.p.a aVarC = C(view);
        if (aVarC == null) {
            aVarC = new b.i.p.a();
        }
        u1(view, aVarC);
        return aVarC;
    }

    private static g<CharSequence> e1() {
        return new d(a.e.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    @Deprecated
    public static void e2(View view, float f2) {
        view.setScaleY(f2);
    }

    @androidx.annotation.h0
    public static j0 f(@androidx.annotation.h0 View view) {
        if (Q == null) {
            Q = new WeakHashMap<>();
        }
        j0 j0Var = Q.get(view);
        if (j0Var != null) {
            return j0Var;
        }
        j0 j0Var2 = new j0(view);
        Q.put(view, j0Var2);
        return j0Var2;
    }

    @Deprecated
    public static int f0(View view) {
        return view.getOverScrollMode();
    }

    public static boolean f1(@androidx.annotation.h0 View view, int r3, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(r3, bundle);
        }
        return false;
    }

    @w0
    public static void f2(View view, boolean z2) {
        t1().g(view, Boolean.valueOf(z2));
    }

    private static void g() {
        try {
            M = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            N = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException e2) {
            Log.e(f1178a, "Couldn't find method", e2);
        }
        O = true;
    }

    @androidx.annotation.k0
    public static int g0(@androidx.annotation.h0 View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingEnd() : view.getPaddingRight();
    }

    public static void g1(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    public static void g2(@androidx.annotation.h0 View view, int r3) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(r3);
        }
    }

    @Deprecated
    public static boolean h(View view, int r1) {
        return view.canScrollHorizontally(r1);
    }

    @androidx.annotation.k0
    public static int h0(@androidx.annotation.h0 View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingStart() : view.getPaddingLeft();
    }

    public static void h1(@androidx.annotation.h0 View view, int r3, int r4, int r5, int r6) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation(r3, r4, r5, r6);
        } else {
            view.postInvalidate(r3, r4, r5, r6);
        }
    }

    public static void h2(@androidx.annotation.h0 View view, int r3, int r4) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(r3, r4);
        }
    }

    @Deprecated
    public static boolean i(View view, int r1) {
        return view.canScrollVertically(r1);
    }

    public static ViewParent i0(@androidx.annotation.h0 View view) {
        return Build.VERSION.SDK_INT >= 16 ? view.getParentForAccessibility() : view.getParent();
    }

    public static void i1(@androidx.annotation.h0 View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    public static void i2(@androidx.annotation.h0 View view, @androidx.annotation.h0 List<Rect> list) {
        if (Build.VERSION.SDK_INT >= 29) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    public static void j(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.cancelDragAndDrop();
        }
    }

    @Deprecated
    public static float j0(View view) {
        return view.getPivotX();
    }

    public static void j1(@androidx.annotation.h0 View view, Runnable runnable, long j2) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j2);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j2);
        }
    }

    public static void j2(@androidx.annotation.h0 View view, @androidx.annotation.i0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        }
    }

    @Deprecated
    public static int k(int r0, int r1) {
        return View.combineMeasuredStates(r0, r1);
    }

    @Deprecated
    public static float k0(View view) {
        return view.getPivotY();
    }

    public static void k1(@androidx.annotation.h0 View view, int r3) {
        if (Build.VERSION.SDK_INT >= 21) {
            l1(r3, view);
            X0(view, 0);
        }
    }

    public static void k2(@androidx.annotation.h0 View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (P == null) {
            P = new WeakHashMap<>();
        }
        P.put(view, str);
    }

    private static void l(View view, int r1) {
        view.offsetLeftAndRight(r1);
        if (view.getVisibility() == 0) {
            w2(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                w2((View) parent);
            }
        }
    }

    @androidx.annotation.i0
    public static o0 l0(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return o0.C(i.a(view));
        }
        return null;
    }

    private static void l1(int r2, View view) {
        List<d.a> listI = I(view);
        for (int r0 = 0; r0 < listI.size(); r0++) {
            if (listI.get(r0).b() == r2) {
                listI.remove(r0);
                return;
            }
        }
    }

    @Deprecated
    public static void l2(View view, float f2) {
        view.setTranslationX(f2);
    }

    private static void m(View view, int r1) {
        view.offsetTopAndBottom(r1);
        if (view.getVisibility() == 0) {
            w2(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                w2((View) parent);
            }
        }
    }

    @Deprecated
    public static float m0(View view) {
        return view.getRotation();
    }

    public static void m1(@androidx.annotation.h0 View view, @androidx.annotation.h0 o oVar) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        if (Build.VERSION.SDK_INT >= 28) {
            b.f.i iVar = (b.f.i) view.getTag(a.e.tag_unhandled_key_listeners);
            if (iVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) iVar.get(oVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(a.e.tag_unhandled_key_listeners);
        if (arrayList != null) {
            arrayList.remove(oVar);
            if (arrayList.size() == 0) {
                r.i(view);
            }
        }
    }

    @Deprecated
    public static void m2(View view, float f2) {
        view.setTranslationY(f2);
    }

    @androidx.annotation.h0
    public static o0 n(@androidx.annotation.h0 View view, @androidx.annotation.h0 o0 o0Var, @androidx.annotation.h0 Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? h.a(view, o0Var, rect) : o0Var;
    }

    @Deprecated
    public static float n0(View view) {
        return view.getRotationX();
    }

    public static void n1(@androidx.annotation.h0 View view, @androidx.annotation.h0 d.a aVar, @androidx.annotation.i0 CharSequence charSequence, @androidx.annotation.i0 b.i.p.p0.g gVar) {
        if (gVar == null && charSequence == null) {
            k1(view, aVar.b());
        } else {
            c(view, aVar.a(charSequence, gVar));
        }
    }

    public static void n2(@androidx.annotation.h0 View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTranslationZ(f2);
        }
    }

    @androidx.annotation.h0
    public static o0 o(@androidx.annotation.h0 View view, @androidx.annotation.h0 o0 o0Var) {
        WindowInsets windowInsetsB;
        return (Build.VERSION.SDK_INT < 21 || (windowInsetsB = o0Var.B()) == null || view.dispatchApplyWindowInsets(windowInsetsB).equals(windowInsetsB)) ? o0Var : o0.C(windowInsetsB);
    }

    @Deprecated
    public static float o0(View view) {
        return view.getRotationY();
    }

    public static void o1(@androidx.annotation.h0 View view) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 20) {
            view.requestApplyInsets();
        } else if (r0 >= 16) {
            view.requestFitSystemWindows();
        }
    }

    @Deprecated
    public static void o2(View view, float f2) {
        view.setX(f2);
    }

    public static void p(@androidx.annotation.h0 View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 24) {
            view.dispatchFinishTemporaryDetach();
            return;
        }
        if (!O) {
            g();
        }
        Method method = N;
        if (method == null) {
            view.onFinishTemporaryDetach();
            return;
        }
        try {
            method.invoke(view, new Object[0]);
        } catch (Exception e2) {
            Log.d(f1178a, "Error calling dispatchFinishTemporaryDetach", e2);
        }
    }

    @Deprecated
    public static float p0(View view) {
        return view.getScaleX();
    }

    @androidx.annotation.h0
    public static <T extends View> T p1(@androidx.annotation.h0 View view, @androidx.annotation.w int r3) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) view.requireViewById(r3);
        }
        T t2 = (T) view.findViewById(r3);
        if (t2 != null) {
            return t2;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    @Deprecated
    public static void p2(View view, float f2) {
        view.setY(f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean q(@androidx.annotation.h0 View view, float f2, float f3, boolean z2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.dispatchNestedFling(f2, f3, z2);
        }
        if (view instanceof s) {
            return ((s) view).dispatchNestedFling(f2, f3, z2);
        }
        return false;
    }

    @Deprecated
    public static float q0(View view) {
        return view.getScaleY();
    }

    @Deprecated
    public static int q1(int r0, int r1, int r2) {
        return View.resolveSizeAndState(r0, r1, r2);
    }

    public static void q2(@androidx.annotation.h0 View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setZ(f2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean r(@androidx.annotation.h0 View view, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.dispatchNestedPreFling(f2, f3);
        }
        if (view instanceof s) {
            return ((s) view).dispatchNestedPreFling(f2, f3);
        }
        return false;
    }

    public static int r0(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return view.getScrollIndicators();
        }
        return 0;
    }

    public static boolean r1(@androidx.annotation.h0 View view) {
        return Build.VERSION.SDK_INT >= 26 ? view.restoreDefaultFocus() : view.requestFocus();
    }

    public static boolean r2(@androidx.annotation.h0 View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int r6) {
        return Build.VERSION.SDK_INT >= 24 ? view.startDragAndDrop(clipData, dragShadowBuilder, obj, r6) : view.startDrag(clipData, dragShadowBuilder, obj, r6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean s(@androidx.annotation.h0 View view, int r3, int r4, @androidx.annotation.i0 int[] r5, @androidx.annotation.i0 int[] r6) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.dispatchNestedPreScroll(r3, r4, r5, r6);
        }
        if (view instanceof s) {
            return ((s) view).dispatchNestedPreScroll(r3, r4, r5, r6);
        }
        return false;
    }

    @androidx.annotation.h0
    public static List<Rect> s0(@androidx.annotation.h0 View view) {
        return Build.VERSION.SDK_INT >= 29 ? view.getSystemGestureExclusionRects() : Collections.emptyList();
    }

    public static void s1(@androidx.annotation.h0 View view, @SuppressLint({"ContextFirst"}) @androidx.annotation.h0 Context context, @androidx.annotation.h0 int[] r4, @androidx.annotation.i0 AttributeSet attributeSet, @androidx.annotation.h0 TypedArray typedArray, int r7, int r8) {
        if (Build.VERSION.SDK_INT >= 29) {
            j.a(view, context, r4, attributeSet, typedArray, r7, r8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean s2(@androidx.annotation.h0 View view, int r3) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.startNestedScroll(r3);
        }
        if (view instanceof s) {
            return ((s) view).startNestedScroll(r3);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean t(@androidx.annotation.h0 View view, int r8, int r9, @androidx.annotation.i0 int[] r10, @androidx.annotation.i0 int[] r11, int r12) {
        if (view instanceof b.i.p.q) {
            return ((b.i.p.q) view).d(r8, r9, r10, r11, r12);
        }
        if (r12 == 0) {
            return s(view, r8, r9, r10, r11);
        }
        return false;
    }

    @androidx.annotation.i0
    public static String t0(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = P;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    private static g<Boolean> t1() {
        return new c(a.e.tag_screen_reader_focusable, Boolean.class, 28);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean t2(@androidx.annotation.h0 View view, int r2, int r3) {
        if (view instanceof b.i.p.q) {
            return ((b.i.p.q) view).e(r2, r3);
        }
        if (r3 == 0) {
            return s2(view, r2);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void u(@androidx.annotation.h0 View view, int r11, int r12, int r13, int r14, @androidx.annotation.i0 int[] r15, int r16, @androidx.annotation.h0 int[] r17) {
        if (view instanceof b.i.p.r) {
            ((b.i.p.r) view).f(r11, r12, r13, r14, r15, r16, r17);
        } else {
            w(view, r11, r12, r13, r14, r15, r16);
        }
    }

    @Deprecated
    public static float u0(View view) {
        return view.getTranslationX();
    }

    public static void u1(@androidx.annotation.h0 View view, b.i.p.a aVar) {
        if (aVar == null && (D(view) instanceof a.C0070a)) {
            aVar = new b.i.p.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void u2(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof s) {
            ((s) view).stopNestedScroll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean v(@androidx.annotation.h0 View view, int r8, int r9, int r10, int r11, @androidx.annotation.i0 int[] r12) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.dispatchNestedScroll(r8, r9, r10, r11, r12);
        }
        if (view instanceof s) {
            return ((s) view).dispatchNestedScroll(r8, r9, r10, r11, r12);
        }
        return false;
    }

    @Deprecated
    public static float v0(View view) {
        return view.getTranslationY();
    }

    @w0
    public static void v1(View view, boolean z2) {
        a().g(view, Boolean.valueOf(z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void v2(@androidx.annotation.h0 View view, int r2) {
        if (view instanceof b.i.p.q) {
            ((b.i.p.q) view).g(r2);
        } else if (r2 == 0) {
            u2(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean w(@androidx.annotation.h0 View view, int r9, int r10, int r11, int r12, @androidx.annotation.i0 int[] r13, int r14) {
        if (view instanceof b.i.p.q) {
            return ((b.i.p.q) view).a(r9, r10, r11, r12, r13, r14);
        }
        if (r14 == 0) {
            return v(view, r9, r10, r11, r12, r13);
        }
        return false;
    }

    public static float w0(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTranslationZ();
        }
        return 0.0f;
    }

    public static void w1(@androidx.annotation.h0 View view, int r3) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(r3);
        }
    }

    private static void w2(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static void x(@androidx.annotation.h0 View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 24) {
            view.dispatchStartTemporaryDetach();
            return;
        }
        if (!O) {
            g();
        }
        Method method = M;
        if (method == null) {
            view.onStartTemporaryDetach();
            return;
        }
        try {
            method.invoke(view, new Object[0]);
        } catch (Exception e2) {
            Log.d(f1178a, "Error calling dispatchStartTemporaryDetach", e2);
        }
    }

    public static int x0(@androidx.annotation.h0 View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    @w0
    public static void x1(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            e1().g(view, charSequence);
            if (charSequence != null) {
                W.a(view);
            } else {
                W.d(view);
            }
        }
    }

    public static void x2(@androidx.annotation.h0 View view, View.DragShadowBuilder dragShadowBuilder) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    @w0
    static boolean y(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return r.a(view).b(view, keyEvent);
    }

    @Deprecated
    public static float y0(View view) {
        return view.getX();
    }

    @Deprecated
    public static void y1(View view, boolean z2) {
        view.setActivated(z2);
    }

    @w0
    static boolean z(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return r.a(view).f(keyEvent);
    }

    @Deprecated
    public static float z0(View view) {
        return view.getY();
    }

    @Deprecated
    public static void z1(View view, @androidx.annotation.r(from = 0.0d, to = 1.0d) float f2) {
        view.setAlpha(f2);
    }
}

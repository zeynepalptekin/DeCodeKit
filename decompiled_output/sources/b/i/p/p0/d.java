package b.i.p.p0;

import android.R;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.annotation.z;
import b.i.a;
import b.i.p.p0.g;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class d {
    public static final int A = 512;
    public static final int B = 1024;
    public static final int C = 2048;
    public static final int D = 4096;
    public static final int E = 8192;
    public static final int F = 16384;
    public static final int G = 32768;
    public static final int H = 65536;
    public static final int I = 131072;
    public static final int J = 262144;
    public static final int K = 524288;
    public static final int L = 1048576;
    public static final int M = 2097152;
    public static final String N = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
    public static final String O = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
    public static final String P = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
    public static final String Q = "ACTION_ARGUMENT_SELECTION_START_INT";
    public static final String R = "ACTION_ARGUMENT_SELECTION_END_INT";
    public static final String S = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
    public static final String T = "android.view.accessibility.action.ARGUMENT_ROW_INT";
    public static final String U = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
    public static final String V = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";
    public static final String W = "ACTION_ARGUMENT_MOVE_WINDOW_X";
    public static final String X = "ACTION_ARGUMENT_MOVE_WINDOW_Y";
    public static final int Y = 1;
    public static final int Z = 2;
    public static final int a0 = 1;
    public static final int b0 = 2;
    public static final int c0 = 4;
    private static final String d = "AccessibilityNodeInfo.roleDescription";
    public static final int d0 = 8;
    private static final String e = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";
    public static final int e0 = 16;
    private static final String f = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";
    private static int f0 = 0;
    private static final String g = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";
    private static final String h = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
    private static final String i = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";
    private static final String j = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";
    private static final String k = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";
    private static final String l = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";
    private static final String m = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY";
    private static final int n = 1;
    private static final int o = 2;
    private static final int p = 4;
    private static final int q = 8;
    public static final int r = 1;
    public static final int s = 2;
    public static final int t = 4;
    public static final int u = 8;
    public static final int v = 16;
    public static final int w = 32;
    public static final int x = 64;
    public static final int y = 128;
    public static final int z = 256;

    /* renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f1250a;

    /* renamed from: b, reason: collision with root package name */
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public int f1251b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f1252c = -1;

    public static class a {
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;

        @h0
        public static final a H;

        @h0
        public static final a I;

        @h0
        public static final a J;

        @h0
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        private static final String e = "A11yActionCompat";

        /* renamed from: a, reason: collision with root package name */
        final Object f1253a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1254b;

        /* renamed from: c, reason: collision with root package name */
        private final Class<? extends g.a> f1255c;

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        protected final g d;
        public static final a f = new a(1, null);
        public static final a g = new a(2, null);
        public static final a h = new a(4, null);
        public static final a i = new a(8, null);
        public static final a j = new a(16, null);
        public static final a k = new a(32, null);
        public static final a l = new a(64, null);
        public static final a m = new a(128, null);
        public static final a n = new a(256, (CharSequence) null, (Class<? extends g.a>) g.b.class);
        public static final a o = new a(512, (CharSequence) null, (Class<? extends g.a>) g.b.class);
        public static final a p = new a(1024, (CharSequence) null, (Class<? extends g.a>) g.c.class);
        public static final a q = new a(2048, (CharSequence) null, (Class<? extends g.a>) g.c.class);
        public static final a r = new a(4096, null);
        public static final a s = new a(8192, null);
        public static final a t = new a(16384, null);
        public static final a u = new a(32768, null);
        public static final a v = new a(65536, null);
        public static final a w = new a(131072, (CharSequence) null, (Class<? extends g.a>) g.C0074g.class);
        public static final a x = new a(262144, null);
        public static final a y = new a(524288, null);
        public static final a z = new a(1048576, null);
        public static final a A = new a(2097152, (CharSequence) null, (Class<? extends g.a>) g.h.class);

        static {
            B = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
            C = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, g.e.class);
            D = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
            E = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
            F = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
            G = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
            H = new a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            I = new a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            J = new a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            K = new a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            L = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
            M = new a(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, g.f.class);
            N = new a(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, g.d.class);
            O = new a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            P = new a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        }

        public a(int r7, CharSequence charSequence) {
            this(null, r7, charSequence, null, null);
        }

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public a(int r7, CharSequence charSequence, g gVar) {
            this(null, r7, charSequence, gVar, null);
        }

        private a(int r7, CharSequence charSequence, Class<? extends g.a> cls) {
            this(null, r7, charSequence, null, cls);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        a(Object obj, int r3, CharSequence charSequence, g gVar, Class<? extends g.a> cls) {
            this.f1254b = r3;
            this.d = gVar;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                obj = new AccessibilityNodeInfo.AccessibilityAction(r3, charSequence);
            }
            this.f1253a = obj;
            this.f1255c = cls;
        }

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public a a(CharSequence charSequence, g gVar) {
            return new a(null, this.f1254b, charSequence, gVar, this.f1255c);
        }

        public int b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f1253a).getId();
            }
            return 0;
        }

        public CharSequence c() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f1253a).getLabel();
            }
            return null;
        }

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public boolean d(View view, Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            g.a aVarNewInstance;
            if (this.d == null) {
                return false;
            }
            g.a aVar = null;
            Class<? extends g.a> cls = this.f1255c;
            if (cls != null) {
                try {
                    aVarNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    aVarNewInstance.a(bundle);
                    aVar = aVarNewInstance;
                } catch (Exception e3) {
                    e = e3;
                    aVar = aVarNewInstance;
                    Class<? extends g.a> cls2 = this.f1255c;
                    Log.e(e, "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                    return this.d.a(view, aVar);
                }
            }
            return this.d.a(view, aVar);
        }

        public boolean equals(@i0 Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.f1253a;
            Object obj3 = ((a) obj).f1253a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f1253a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    public static class b {

        /* renamed from: b, reason: collision with root package name */
        public static final int f1256b = 0;

        /* renamed from: c, reason: collision with root package name */
        public static final int f1257c = 1;
        public static final int d = 2;

        /* renamed from: a, reason: collision with root package name */
        final Object f1258a;

        b(Object obj) {
            this.f1258a = obj;
        }

        public static b e(int r2, int r3, boolean z) {
            return Build.VERSION.SDK_INT >= 19 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(r2, r3, z)) : new b(null);
        }

        public static b f(int r2, int r3, boolean z, int r5) {
            int r0 = Build.VERSION.SDK_INT;
            return r0 >= 21 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(r2, r3, z, r5)) : r0 >= 19 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(r2, r3, z)) : new b(null);
        }

        public int a() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionInfo) this.f1258a).getColumnCount();
            }
            return -1;
        }

        public int b() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionInfo) this.f1258a).getRowCount();
            }
            return -1;
        }

        public int c() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.CollectionInfo) this.f1258a).getSelectionMode();
            }
            return 0;
        }

        public boolean d() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionInfo) this.f1258a).isHierarchical();
            }
            return false;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final Object f1259a;

        c(Object obj) {
            this.f1259a = obj;
        }

        public static c g(int r2, int r3, int r4, int r5, boolean z) {
            return Build.VERSION.SDK_INT >= 19 ? new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(r2, r3, r4, r5, z)) : new c(null);
        }

        public static c h(int r2, int r3, int r4, int r5, boolean z, boolean z2) {
            int r0 = Build.VERSION.SDK_INT;
            return r0 >= 21 ? new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(r2, r3, r4, r5, z, z2)) : r0 >= 19 ? new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(r2, r3, r4, r5, z)) : new c(null);
        }

        public int a() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.f1259a).getColumnIndex();
            }
            return 0;
        }

        public int b() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.f1259a).getColumnSpan();
            }
            return 0;
        }

        public int c() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.f1259a).getRowIndex();
            }
            return 0;
        }

        public int d() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.f1259a).getRowSpan();
            }
            return 0;
        }

        @Deprecated
        public boolean e() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.f1259a).isHeading();
            }
            return false;
        }

        public boolean f() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.f1259a).isSelected();
            }
            return false;
        }
    }

    /* renamed from: b.i.p.p0.d$d, reason: collision with other inner class name */
    public static class C0073d {

        /* renamed from: b, reason: collision with root package name */
        public static final int f1260b = 0;

        /* renamed from: c, reason: collision with root package name */
        public static final int f1261c = 1;
        public static final int d = 2;

        /* renamed from: a, reason: collision with root package name */
        final Object f1262a;

        C0073d(Object obj) {
            this.f1262a = obj;
        }

        public static C0073d e(int r2, float f, float f2, float f3) {
            return Build.VERSION.SDK_INT >= 19 ? new C0073d(AccessibilityNodeInfo.RangeInfo.obtain(r2, f, f2, f3)) : new C0073d(null);
        }

        public float a() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.RangeInfo) this.f1262a).getCurrent();
            }
            return 0.0f;
        }

        public float b() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.RangeInfo) this.f1262a).getMax();
            }
            return 0.0f;
        }

        public float c() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.RangeInfo) this.f1262a).getMin();
            }
            return 0.0f;
        }

        public int d() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.RangeInfo) this.f1262a).getType();
            }
            return 0;
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        final AccessibilityNodeInfo.TouchDelegateInfo f1263a;

        e(@h0 AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo) {
            this.f1263a = touchDelegateInfo;
        }

        public e(@h0 Map<Region, View> map) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f1263a = new AccessibilityNodeInfo.TouchDelegateInfo(map);
            } else {
                this.f1263a = null;
            }
        }

        @i0
        public Region a(@z(from = FabTransformationScrimBehavior.j) int r3) {
            if (Build.VERSION.SDK_INT >= 29) {
                return this.f1263a.getRegionAt(r3);
            }
            return null;
        }

        @z(from = FabTransformationScrimBehavior.j)
        public int b() {
            if (Build.VERSION.SDK_INT >= 29) {
                return this.f1263a.getRegionCount();
            }
            return 0;
        }

        @i0
        public d c(@h0 Region region) {
            AccessibilityNodeInfo targetForRegion;
            if (Build.VERSION.SDK_INT < 29 || (targetForRegion = this.f1263a.getTargetForRegion(region)) == null) {
                return null;
            }
            return d.T1(targetForRegion);
        }
    }

    private d(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1250a = accessibilityNodeInfo;
    }

    @Deprecated
    public d(Object obj) {
        this.f1250a = (AccessibilityNodeInfo) obj;
    }

    public static d A0() {
        return T1(AccessibilityNodeInfo.obtain());
    }

    public static d B0(View view) {
        return T1(AccessibilityNodeInfo.obtain(view));
    }

    public static d C0(View view, int r3) {
        if (Build.VERSION.SDK_INT >= 16) {
            return U1(AccessibilityNodeInfo.obtain(view, r3));
        }
        return null;
    }

    public static d D0(d dVar) {
        return T1(AccessibilityNodeInfo.obtain(dVar.f1250a));
    }

    private SparseArray<WeakReference<ClickableSpan>> L(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayR = R(view);
        if (sparseArrayR != null) {
            return sparseArrayR;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(a.e.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    private void L0(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayR = R(view);
        if (sparseArrayR != null) {
            ArrayList arrayList = new ArrayList();
            for (int r2 = 0; r2 < sparseArrayR.size(); r2++) {
                if (sparseArrayR.valueAt(r2).get() == null) {
                    arrayList.add(Integer.valueOf(r2));
                }
            }
            for (int r1 = 0; r1 < arrayList.size(); r1++) {
                sparseArrayR.remove(((Integer) arrayList.get(r1)).intValue());
            }
        }
    }

    private void N0(int r6, boolean z2) {
        Bundle bundleC = C();
        if (bundleC != null) {
            int r3 = bundleC.getInt(h, 0) & (~r6);
            if (!z2) {
                r6 = 0;
            }
            bundleC.putInt(h, r6 | r3);
        }
    }

    private SparseArray<WeakReference<ClickableSpan>> R(View view) {
        return (SparseArray) view.getTag(a.e.tag_accessibility_clickable_spans);
    }

    public static d T1(@h0 AccessibilityNodeInfo accessibilityNodeInfo) {
        return new d(accessibilityNodeInfo);
    }

    static d U1(Object obj) {
        if (obj != null) {
            return new d(obj);
        }
        return null;
    }

    private boolean c0() {
        return !i(j).isEmpty();
    }

    private int d0(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int r0 = 0; r0 < sparseArray.size(); r0++) {
                if (clickableSpan.equals(sparseArray.valueAt(r0).get())) {
                    return sparseArray.keyAt(r0);
                }
            }
        }
        int r3 = f0;
        f0 = r3 + 1;
        return r3;
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int r5) {
        i(j).add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        i(k).add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        i(l).add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        i(i).add(Integer.valueOf(r5));
    }

    private void h() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1250a.getExtras().remove(j);
            this.f1250a.getExtras().remove(k);
            this.f1250a.getExtras().remove(l);
            this.f1250a.getExtras().remove(i);
        }
    }

    private List<Integer> i(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f1250a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f1250a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private static String o(int r1) {
        if (r1 == 1) {
            return "ACTION_FOCUS";
        }
        if (r1 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (r1) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (r1) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (r1) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    private boolean q(int r4) {
        Bundle bundleC = C();
        return bundleC != null && (bundleC.getInt(h, 0) & r4) == r4;
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static ClickableSpan[] w(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public int A() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f1250a.getDrawingOrder();
        }
        return 0;
    }

    public void A1(@i0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1250a.getExtras().putCharSequence(d, charSequence);
        }
    }

    public CharSequence B() {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f1250a.getError();
        }
        return null;
    }

    public void B1(boolean z2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1250a.setScreenReaderFocusable(z2);
        } else {
            N0(1, z2);
        }
    }

    public Bundle C() {
        return Build.VERSION.SDK_INT >= 19 ? this.f1250a.getExtras() : new Bundle();
    }

    public void C1(boolean z2) {
        this.f1250a.setScrollable(z2);
    }

    @i0
    public CharSequence D() {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 26) {
            return this.f1250a.getHintText();
        }
        if (r0 >= 19) {
            return this.f1250a.getExtras().getCharSequence(g);
        }
        return null;
    }

    public void D1(boolean z2) {
        this.f1250a.setSelected(z2);
    }

    @Deprecated
    public Object E() {
        return this.f1250a;
    }

    public boolean E0(int r2) {
        return this.f1250a.performAction(r2);
    }

    public void E1(boolean z2) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1250a.setShowingHintText(z2);
        } else {
            N0(4, z2);
        }
    }

    public int F() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f1250a.getInputType();
        }
        return 0;
    }

    public boolean F0(int r3, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f1250a.performAction(r3, bundle);
        }
        return false;
    }

    public void F1(View view) {
        this.f1252c = -1;
        this.f1250a.setSource(view);
    }

    public d G() {
        if (Build.VERSION.SDK_INT >= 17) {
            return U1(this.f1250a.getLabelFor());
        }
        return null;
    }

    public void G0() {
        this.f1250a.recycle();
    }

    public void G1(View view, int r4) {
        this.f1252c = r4;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f1250a.setSource(view, r4);
        }
    }

    public d H() {
        if (Build.VERSION.SDK_INT >= 17) {
            return U1(this.f1250a.getLabeledBy());
        }
        return null;
    }

    public boolean H0() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f1250a.refresh();
        }
        return false;
    }

    public void H1(CharSequence charSequence) {
        this.f1250a.setText(charSequence);
    }

    public int I() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f1250a.getLiveRegion();
        }
        return 0;
    }

    public boolean I0(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f1250a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f1253a);
        }
        return false;
    }

    public void I1(boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1250a.setTextEntryKey(z2);
        } else {
            N0(8, z2);
        }
    }

    public int J() {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f1250a.getMaxTextLength();
        }
        return -1;
    }

    public boolean J0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f1250a.removeChild(view);
        }
        return false;
    }

    public void J1(int r3, int r4) {
        if (Build.VERSION.SDK_INT >= 18) {
            this.f1250a.setTextSelection(r3, r4);
        }
    }

    public int K() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f1250a.getMovementGranularities();
        }
        return 0;
    }

    public boolean K0(View view, int r4) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f1250a.removeChild(view, r4);
        }
        return false;
    }

    public void K1(@i0 CharSequence charSequence) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 28) {
            this.f1250a.setTooltipText(charSequence);
        } else if (r0 >= 19) {
            this.f1250a.getExtras().putCharSequence(f, charSequence);
        }
    }

    public void L1(@h0 e eVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1250a.setTouchDelegateInfo(eVar.f1263a);
        }
    }

    public CharSequence M() {
        return this.f1250a.getPackageName();
    }

    public void M0(boolean z2) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f1250a.setAccessibilityFocused(z2);
        }
    }

    public void M1(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f1250a.setTraversalAfter(view);
        }
    }

    @i0
    public CharSequence N() {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 28) {
            return this.f1250a.getPaneTitle();
        }
        if (r0 >= 19) {
            return this.f1250a.getExtras().getCharSequence(e);
        }
        return null;
    }

    public void N1(View view, int r4) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f1250a.setTraversalAfter(view, r4);
        }
    }

    public d O() {
        return U1(this.f1250a.getParent());
    }

    @Deprecated
    public void O0(Rect rect) {
        this.f1250a.setBoundsInParent(rect);
    }

    public void O1(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f1250a.setTraversalBefore(view);
        }
    }

    public C0073d P() {
        AccessibilityNodeInfo.RangeInfo rangeInfo;
        if (Build.VERSION.SDK_INT < 19 || (rangeInfo = this.f1250a.getRangeInfo()) == null) {
            return null;
        }
        return new C0073d(rangeInfo);
    }

    public void P0(Rect rect) {
        this.f1250a.setBoundsInScreen(rect);
    }

    public void P1(View view, int r4) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f1250a.setTraversalBefore(view, r4);
        }
    }

    @i0
    public CharSequence Q() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f1250a.getExtras().getCharSequence(d);
        }
        return null;
    }

    public void Q0(boolean z2) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1250a.setCanOpenPopup(z2);
        }
    }

    public void Q1(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            this.f1250a.setViewIdResourceName(str);
        }
    }

    public void R0(boolean z2) {
        this.f1250a.setCheckable(z2);
    }

    public void R1(boolean z2) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f1250a.setVisibleToUser(z2);
        }
    }

    public CharSequence S() {
        if (!c0()) {
            return this.f1250a.getText();
        }
        List<Integer> listI = i(j);
        List<Integer> listI2 = i(k);
        List<Integer> listI3 = i(l);
        List<Integer> listI4 = i(i);
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f1250a.getText(), 0, this.f1250a.getText().length()));
        for (int r7 = 0; r7 < listI.size(); r7++) {
            spannableString.setSpan(new b.i.p.p0.a(listI4.get(r7).intValue(), this, C().getInt(m)), listI.get(r7).intValue(), listI2.get(r7).intValue(), listI3.get(r7).intValue());
        }
        return spannableString;
    }

    public void S0(boolean z2) {
        this.f1250a.setChecked(z2);
    }

    public AccessibilityNodeInfo S1() {
        return this.f1250a;
    }

    public int T() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f1250a.getTextSelectionEnd();
        }
        return -1;
    }

    public void T0(CharSequence charSequence) {
        this.f1250a.setClassName(charSequence);
    }

    public int U() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f1250a.getTextSelectionStart();
        }
        return -1;
    }

    public void U0(boolean z2) {
        this.f1250a.setClickable(z2);
    }

    @i0
    public CharSequence V() {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 28) {
            return this.f1250a.getTooltipText();
        }
        if (r0 >= 19) {
            return this.f1250a.getExtras().getCharSequence(f);
        }
        return null;
    }

    public void V0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1250a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f1258a);
        }
    }

    @i0
    public e W() {
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo;
        if (Build.VERSION.SDK_INT < 29 || (touchDelegateInfo = this.f1250a.getTouchDelegateInfo()) == null) {
            return null;
        }
        return new e(touchDelegateInfo);
    }

    public void W0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1250a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).f1259a);
        }
    }

    public d X() {
        if (Build.VERSION.SDK_INT >= 22) {
            return U1(this.f1250a.getTraversalAfter());
        }
        return null;
    }

    public void X0(CharSequence charSequence) {
        this.f1250a.setContentDescription(charSequence);
    }

    public d Y() {
        if (Build.VERSION.SDK_INT >= 22) {
            return U1(this.f1250a.getTraversalBefore());
        }
        return null;
    }

    public void Y0(boolean z2) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1250a.setContentInvalid(z2);
        }
    }

    public String Z() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f1250a.getViewIdResourceName();
        }
        return null;
    }

    public void Z0(boolean z2) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1250a.setContextClickable(z2);
        }
    }

    public void a(int r2) {
        this.f1250a.addAction(r2);
    }

    public h a0() {
        if (Build.VERSION.SDK_INT >= 21) {
            return h.r(this.f1250a.getWindow());
        }
        return null;
    }

    public void a1(boolean z2) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1250a.setDismissable(z2);
        }
    }

    public void b(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f1250a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f1253a);
        }
    }

    public int b0() {
        return this.f1250a.getWindowId();
    }

    public void b1(int r3) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f1250a.setDrawingOrder(r3);
        }
    }

    public void c(View view) {
        this.f1250a.addChild(view);
    }

    public void c1(boolean z2) {
        if (Build.VERSION.SDK_INT >= 18) {
            this.f1250a.setEditable(z2);
        }
    }

    public void d(View view, int r4) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f1250a.addChild(view, r4);
        }
    }

    public void d1(boolean z2) {
        this.f1250a.setEnabled(z2);
    }

    public boolean e0() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f1250a.isAccessibilityFocused();
        }
        return false;
    }

    public void e1(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f1250a.setError(charSequence);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1250a;
        if (accessibilityNodeInfo == null) {
            if (dVar.f1250a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(dVar.f1250a)) {
            return false;
        }
        return this.f1252c == dVar.f1252c && this.f1251b == dVar.f1251b;
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void f(CharSequence charSequence, View view) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 19 || r0 >= 26) {
            return;
        }
        h();
        L0(view);
        ClickableSpan[] clickableSpanArrW = w(charSequence);
        if (clickableSpanArrW == null || clickableSpanArrW.length <= 0) {
            return;
        }
        C().putInt(m, a.e.accessibility_action_clickable_span);
        SparseArray<WeakReference<ClickableSpan>> sparseArrayL = L(view);
        for (int r1 = 0; clickableSpanArrW != null && r1 < clickableSpanArrW.length; r1++) {
            int r2 = d0(clickableSpanArrW[r1], sparseArrayL);
            sparseArrayL.put(r2, new WeakReference<>(clickableSpanArrW[r1]));
            e(clickableSpanArrW[r1], (Spanned) charSequence, r2);
        }
    }

    public boolean f0() {
        return this.f1250a.isCheckable();
    }

    public void f1(boolean z2) {
        this.f1250a.setFocusable(z2);
    }

    public boolean g() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f1250a.canOpenPopup();
        }
        return false;
    }

    public boolean g0() {
        return this.f1250a.isChecked();
    }

    public void g1(boolean z2) {
        this.f1250a.setFocused(z2);
    }

    public boolean h0() {
        return this.f1250a.isClickable();
    }

    public void h1(boolean z2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1250a.setHeading(z2);
        } else {
            N0(2, z2);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1250a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean i0() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f1250a.isContentInvalid();
        }
        return false;
    }

    public void i1(@i0 CharSequence charSequence) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 26) {
            this.f1250a.setHintText(charSequence);
        } else if (r0 >= 19) {
            this.f1250a.getExtras().putCharSequence(g, charSequence);
        }
    }

    public List<d> j(String str) {
        ArrayList arrayList = new ArrayList();
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByText = this.f1250a.findAccessibilityNodeInfosByText(str);
        int size = listFindAccessibilityNodeInfosByText.size();
        for (int r2 = 0; r2 < size; r2++) {
            arrayList.add(T1(listFindAccessibilityNodeInfosByText.get(r2)));
        }
        return arrayList;
    }

    public boolean j0() {
        if (Build.VERSION.SDK_INT >= 23) {
            return this.f1250a.isContextClickable();
        }
        return false;
    }

    public void j1(boolean z2) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f1250a.setImportantForAccessibility(z2);
        }
    }

    public List<d> k(String str) {
        if (Build.VERSION.SDK_INT < 18) {
            return Collections.emptyList();
        }
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByViewId = this.f1250a.findAccessibilityNodeInfosByViewId(str);
        ArrayList arrayList = new ArrayList();
        Iterator<AccessibilityNodeInfo> it = listFindAccessibilityNodeInfosByViewId.iterator();
        while (it.hasNext()) {
            arrayList.add(T1(it.next()));
        }
        return arrayList;
    }

    public boolean k0() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f1250a.isDismissable();
        }
        return false;
    }

    public void k1(int r3) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1250a.setInputType(r3);
        }
    }

    public d l(int r3) {
        if (Build.VERSION.SDK_INT >= 16) {
            return U1(this.f1250a.findFocus(r3));
        }
        return null;
    }

    public boolean l0() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f1250a.isEditable();
        }
        return false;
    }

    public void l1(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f1250a.setLabelFor(view);
        }
    }

    public d m(int r3) {
        if (Build.VERSION.SDK_INT >= 16) {
            return U1(this.f1250a.focusSearch(r3));
        }
        return null;
    }

    public boolean m0() {
        return this.f1250a.isEnabled();
    }

    public void m1(View view, int r4) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f1250a.setLabelFor(view, r4);
        }
    }

    public List<a> n() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f1250a.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int r3 = 0; r3 < size; r3++) {
            arrayList.add(new a(actionList.get(r3)));
        }
        return arrayList;
    }

    public boolean n0() {
        return this.f1250a.isFocusable();
    }

    public void n1(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f1250a.setLabeledBy(view);
        }
    }

    public boolean o0() {
        return this.f1250a.isFocused();
    }

    public void o1(View view, int r4) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f1250a.setLabeledBy(view, r4);
        }
    }

    public int p() {
        return this.f1250a.getActions();
    }

    public boolean p0() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f1250a.isHeading();
        }
        if (q(2)) {
            return true;
        }
        c cVarY = y();
        return cVarY != null && cVarY.e();
    }

    public void p1(int r3) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1250a.setLiveRegion(r3);
        }
    }

    public boolean q0() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f1250a.isImportantForAccessibility();
        }
        return true;
    }

    public void q1(boolean z2) {
        this.f1250a.setLongClickable(z2);
    }

    @Deprecated
    public void r(Rect rect) {
        this.f1250a.getBoundsInParent(rect);
    }

    public boolean r0() {
        return this.f1250a.isLongClickable();
    }

    public void r1(int r3) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f1250a.setMaxTextLength(r3);
        }
    }

    public void s(Rect rect) {
        this.f1250a.getBoundsInScreen(rect);
    }

    public boolean s0() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f1250a.isMultiLine();
        }
        return false;
    }

    public void s1(int r3) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f1250a.setMovementGranularities(r3);
        }
    }

    public d t(int r2) {
        return U1(this.f1250a.getChild(r2));
    }

    public boolean t0() {
        return this.f1250a.isPassword();
    }

    public void t1(boolean z2) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1250a.setMultiLine(z2);
        }
    }

    @h0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        r(rect);
        sb.append("; boundsInParent: " + rect);
        s(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(M());
        sb.append("; className: ");
        sb.append(v());
        sb.append("; text: ");
        sb.append(S());
        sb.append("; contentDescription: ");
        sb.append(z());
        sb.append("; viewId: ");
        sb.append(Z());
        sb.append("; checkable: ");
        sb.append(f0());
        sb.append("; checked: ");
        sb.append(g0());
        sb.append("; focusable: ");
        sb.append(n0());
        sb.append("; focused: ");
        sb.append(o0());
        sb.append("; selected: ");
        sb.append(w0());
        sb.append("; clickable: ");
        sb.append(h0());
        sb.append("; longClickable: ");
        sb.append(r0());
        sb.append("; enabled: ");
        sb.append(m0());
        sb.append("; password: ");
        sb.append(t0());
        sb.append("; scrollable: " + v0());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<a> listN = n();
            for (int r4 = 0; r4 < listN.size(); r4++) {
                a aVar = listN.get(r4);
                String strO = o(aVar.b());
                if (strO.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                    strO = aVar.c().toString();
                }
                sb.append(strO);
                if (r4 != listN.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int r1 = p();
            while (r1 != 0) {
                int r42 = 1 << Integer.numberOfTrailingZeros(r1);
                r1 &= ~r42;
                sb.append(o(r42));
                if (r1 != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public int u() {
        return this.f1250a.getChildCount();
    }

    public boolean u0() {
        return Build.VERSION.SDK_INT >= 28 ? this.f1250a.isScreenReaderFocusable() : q(1);
    }

    public void u1(CharSequence charSequence) {
        this.f1250a.setPackageName(charSequence);
    }

    public CharSequence v() {
        return this.f1250a.getClassName();
    }

    public boolean v0() {
        return this.f1250a.isScrollable();
    }

    public void v1(@i0 CharSequence charSequence) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 28) {
            this.f1250a.setPaneTitle(charSequence);
        } else if (r0 >= 19) {
            this.f1250a.getExtras().putCharSequence(e, charSequence);
        }
    }

    public boolean w0() {
        return this.f1250a.isSelected();
    }

    public void w1(View view) {
        this.f1251b = -1;
        this.f1250a.setParent(view);
    }

    public b x() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        if (Build.VERSION.SDK_INT < 19 || (collectionInfo = this.f1250a.getCollectionInfo()) == null) {
            return null;
        }
        return new b(collectionInfo);
    }

    public boolean x0() {
        return Build.VERSION.SDK_INT >= 26 ? this.f1250a.isShowingHintText() : q(4);
    }

    public void x1(View view, int r4) {
        this.f1251b = r4;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f1250a.setParent(view, r4);
        }
    }

    public c y() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        if (Build.VERSION.SDK_INT < 19 || (collectionItemInfo = this.f1250a.getCollectionItemInfo()) == null) {
            return null;
        }
        return new c(collectionItemInfo);
    }

    public boolean y0() {
        return Build.VERSION.SDK_INT >= 29 ? this.f1250a.isTextEntryKey() : q(8);
    }

    public void y1(boolean z2) {
        this.f1250a.setPassword(z2);
    }

    public CharSequence z() {
        return this.f1250a.getContentDescription();
    }

    public boolean z0() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f1250a.isVisibleToUser();
        }
        return false;
    }

    public void z1(C0073d c0073d) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1250a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) c0073d.f1262a);
        }
    }
}

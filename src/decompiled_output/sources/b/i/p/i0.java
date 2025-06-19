package b.i.p;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1205a = "ViewParentCompat";

    /* renamed from: b, reason: collision with root package name */
    private static int[] f1206b;

    private i0() {
    }

    private static int[] a() {
        int[] r0 = f1206b;
        if (r0 == null) {
            f1206b = new int[2];
        } else {
            r0[0] = 0;
            r0[1] = 0;
        }
        return f1206b;
    }

    public static void b(ViewParent viewParent, View view, View view2, int r5) {
        if (Build.VERSION.SDK_INT >= 19) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, r5);
        }
    }

    public static boolean c(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (Build.VERSION.SDK_INT < 21) {
            if (viewParent instanceof w) {
                return ((w) viewParent).onNestedFling(view, f, f2, z);
            }
            return false;
        }
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e(f1205a, "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    public static boolean d(ViewParent viewParent, View view, float f, float f2) {
        if (Build.VERSION.SDK_INT < 21) {
            if (viewParent instanceof w) {
                return ((w) viewParent).onNestedPreFling(view, f, f2);
            }
            return false;
        }
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e(f1205a, "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    public static void e(ViewParent viewParent, View view, int r8, int r9, int[] r10) {
        f(viewParent, view, r8, r9, r10, 0);
    }

    public static void f(ViewParent viewParent, View view, int r9, int r10, int[] r11, int r12) {
        if (viewParent instanceof u) {
            ((u) viewParent).m(view, r9, r10, r11, r12);
            return;
        }
        if (r12 == 0) {
            if (Build.VERSION.SDK_INT < 21) {
                if (viewParent instanceof w) {
                    ((w) viewParent).onNestedPreScroll(view, r9, r10, r11);
                    return;
                }
                return;
            }
            try {
                viewParent.onNestedPreScroll(view, r9, r10, r11);
            } catch (AbstractMethodError e) {
                Log.e(f1205a, "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }
    }

    public static void g(ViewParent viewParent, View view, int r10, int r11, int r12, int r13) {
        i(viewParent, view, r10, r11, r12, r13, 0, a());
    }

    public static void h(ViewParent viewParent, View view, int r10, int r11, int r12, int r13, int r14) {
        i(viewParent, view, r10, r11, r12, r13, r14, a());
    }

    public static void i(ViewParent viewParent, View view, int r12, int r13, int r14, int r15, int r16, @androidx.annotation.h0 int[] r17) {
        if (viewParent instanceof v) {
            ((v) viewParent).r(view, r12, r13, r14, r15, r16, r17);
            return;
        }
        r17[0] = r17[0] + r14;
        r17[1] = r17[1] + r15;
        if (viewParent instanceof u) {
            ((u) viewParent).s(view, r12, r13, r14, r15, r16);
            return;
        }
        if (r16 == 0) {
            if (Build.VERSION.SDK_INT < 21) {
                if (viewParent instanceof w) {
                    ((w) viewParent).onNestedScroll(view, r12, r13, r14, r15);
                    return;
                }
                return;
            }
            try {
                viewParent.onNestedScroll(view, r12, r13, r14, r15);
            } catch (AbstractMethodError e) {
                Log.e(f1205a, "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
            }
        }
    }

    public static void j(ViewParent viewParent, View view, View view2, int r4) {
        k(viewParent, view, view2, r4, 0);
    }

    public static void k(ViewParent viewParent, View view, View view2, int r4, int r5) {
        if (viewParent instanceof u) {
            ((u) viewParent).k(view, view2, r4, r5);
            return;
        }
        if (r5 == 0) {
            if (Build.VERSION.SDK_INT < 21) {
                if (viewParent instanceof w) {
                    ((w) viewParent).onNestedScrollAccepted(view, view2, r4);
                    return;
                }
                return;
            }
            try {
                viewParent.onNestedScrollAccepted(view, view2, r4);
            } catch (AbstractMethodError e) {
                Log.e(f1205a, "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }
    }

    public static boolean l(ViewParent viewParent, View view, View view2, int r4) {
        return m(viewParent, view, view2, r4, 0);
    }

    public static boolean m(ViewParent viewParent, View view, View view2, int r4, int r5) {
        if (viewParent instanceof u) {
            return ((u) viewParent).t(view, view2, r4, r5);
        }
        if (r5 != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 21) {
            if (viewParent instanceof w) {
                return ((w) viewParent).onStartNestedScroll(view, view2, r4);
            }
            return false;
        }
        try {
            return viewParent.onStartNestedScroll(view, view2, r4);
        } catch (AbstractMethodError e) {
            Log.e(f1205a, "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
            return false;
        }
    }

    public static void n(ViewParent viewParent, View view) {
        o(viewParent, view, 0);
    }

    public static void o(ViewParent viewParent, View view, int r3) {
        if (viewParent instanceof u) {
            ((u) viewParent).l(view, r3);
            return;
        }
        if (r3 == 0) {
            if (Build.VERSION.SDK_INT < 21) {
                if (viewParent instanceof w) {
                    ((w) viewParent).onStopNestedScroll(view);
                    return;
                }
                return;
            }
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                Log.e(f1205a, "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }
    }

    @Deprecated
    public static boolean p(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}

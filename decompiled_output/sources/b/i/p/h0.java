package b.i.p;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import b.i.a;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f1200a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f1201b = 1;

    private h0() {
    }

    public static int a(@androidx.annotation.h0 ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 18) {
            return viewGroup.getLayoutMode();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(@androidx.annotation.h0 ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.getNestedScrollAxes();
        }
        if (viewGroup instanceof w) {
            return ((w) viewGroup).getNestedScrollAxes();
        }
        return 0;
    }

    public static boolean c(@androidx.annotation.h0 ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(a.e.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && f0.t0(viewGroup) == null) ? false : true;
    }

    @Deprecated
    public static boolean d(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static void e(@androidx.annotation.h0 ViewGroup viewGroup, int r3) {
        if (Build.VERSION.SDK_INT >= 18) {
            viewGroup.setLayoutMode(r3);
        }
    }

    @Deprecated
    public static void f(ViewGroup viewGroup, boolean z) {
        viewGroup.setMotionEventSplittingEnabled(z);
    }

    public static void g(@androidx.annotation.h0 ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            viewGroup.setTransitionGroup(z);
        } else {
            viewGroup.setTag(a.e.tag_transition_group, Boolean.valueOf(z));
        }
    }
}

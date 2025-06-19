package b.i.p.p0;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.h0;
import androidx.annotation.m0;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    @Deprecated
    public interface a {
        @Deprecated
        void onAccessibilityStateChanged(boolean z);
    }

    @Deprecated
    public static abstract class b implements a {
    }

    /* renamed from: b.i.p.p0.c$c, reason: collision with other inner class name */
    private static class AccessibilityManagerAccessibilityStateChangeListenerC0072c implements AccessibilityManager.AccessibilityStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        a f1248a;

        AccessibilityManagerAccessibilityStateChangeListenerC0072c(@h0 a aVar) {
            this.f1248a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AccessibilityManagerAccessibilityStateChangeListenerC0072c) {
                return this.f1248a.equals(((AccessibilityManagerAccessibilityStateChangeListenerC0072c) obj).f1248a);
            }
            return false;
        }

        public int hashCode() {
            return this.f1248a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z) {
            this.f1248a.onAccessibilityStateChanged(z);
        }
    }

    public interface d {
        void onTouchExplorationStateChanged(boolean z);
    }

    @m0(19)
    private static final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final d f1249a;

        e(@h0 d dVar) {
            this.f1249a = dVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                return this.f1249a.equals(((e) obj).f1249a);
            }
            return false;
        }

        public int hashCode() {
            return this.f1249a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            this.f1249a.onTouchExplorationStateChanged(z);
        }
    }

    private c() {
    }

    @Deprecated
    public static boolean a(AccessibilityManager accessibilityManager, a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.addAccessibilityStateChangeListener(new AccessibilityManagerAccessibilityStateChangeListenerC0072c(aVar));
    }

    public static boolean b(AccessibilityManager accessibilityManager, d dVar) {
        if (Build.VERSION.SDK_INT < 19 || dVar == null) {
            return false;
        }
        return accessibilityManager.addTouchExplorationStateChangeListener(new e(dVar));
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> c(AccessibilityManager accessibilityManager, int r1) {
        return accessibilityManager.getEnabledAccessibilityServiceList(r1);
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> d(AccessibilityManager accessibilityManager) {
        return accessibilityManager.getInstalledAccessibilityServiceList();
    }

    @Deprecated
    public static boolean e(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }

    @Deprecated
    public static boolean f(AccessibilityManager accessibilityManager, a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.removeAccessibilityStateChangeListener(new AccessibilityManagerAccessibilityStateChangeListenerC0072c(aVar));
    }

    public static boolean g(AccessibilityManager accessibilityManager, d dVar) {
        if (Build.VERSION.SDK_INT < 19 || dVar == null) {
            return false;
        }
        return accessibilityManager.removeTouchExplorationStateChangeListener(new e(dVar));
    }
}

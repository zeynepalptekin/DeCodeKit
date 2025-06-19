package b.i.p;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.p0;
import b.i.a;
import b.i.p.p0.d;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final View.AccessibilityDelegate f1158c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    private final View.AccessibilityDelegate f1159a;

    /* renamed from: b, reason: collision with root package name */
    private final View.AccessibilityDelegate f1160b;

    /* renamed from: b.i.p.a$a, reason: collision with other inner class name */
    static final class C0070a extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        final a f1161a;

        C0070a(a aVar) {
            this.f1161a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f1161a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        @androidx.annotation.m0(16)
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            b.i.p.p0.e eVarB = this.f1161a.b(view);
            if (eVarB != null) {
                return (AccessibilityNodeProvider) eVarB.d();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1161a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            b.i.p.p0.d dVarT1 = b.i.p.p0.d.T1(accessibilityNodeInfo);
            dVarT1.B1(f0.U0(view));
            dVarT1.h1(f0.I0(view));
            dVarT1.v1(f0.H(view));
            this.f1161a.g(view, dVarT1);
            dVarT1.f(accessibilityNodeInfo.getText(), view);
            List<d.a> listC = a.c(view);
            for (int r4 = 0; r4 < listC.size(); r4++) {
                dVarT1.b(listC.get(r4));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1161a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f1161a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int r3, Bundle bundle) {
            return this.f1161a.j(view, r3, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int r3) {
            this.f1161a.l(view, r3);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f1161a.m(view, accessibilityEvent);
        }
    }

    public a() {
        this(f1158c);
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f1159a = accessibilityDelegate;
        this.f1160b = new C0070a(this);
    }

    static List<d.a> c(View view) {
        List<d.a> list = (List) view.getTag(a.e.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrW = b.i.p.p0.d.w(view.createAccessibilityNodeInfo().getText());
            for (int r1 = 0; clickableSpanArrW != null && r1 < clickableSpanArrW.length; r1++) {
                if (clickableSpan.equals(clickableSpanArrW[r1])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean k(int r2, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(a.e.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(r2)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1159a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public b.i.p.p0.e b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f1159a.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new b.i.p.p0.e(accessibilityNodeProvider);
    }

    View.AccessibilityDelegate d() {
        return this.f1160b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f1159a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, b.i.p.p0.d dVar) {
        this.f1159a.onInitializeAccessibilityNodeInfo(view, dVar.S1());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f1159a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1159a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int r7, Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        List<d.a> listC = c(view);
        boolean zPerformAccessibilityAction = false;
        int r2 = 0;
        while (true) {
            if (r2 >= listC.size()) {
                break;
            }
            d.a aVar = listC.get(r2);
            if (aVar.b() == r7) {
                zPerformAccessibilityAction = aVar.d(view, bundle);
                break;
            }
            r2++;
        }
        if (!zPerformAccessibilityAction && Build.VERSION.SDK_INT >= 16) {
            zPerformAccessibilityAction = this.f1159a.performAccessibilityAction(view, r7, bundle);
        }
        return (zPerformAccessibilityAction || r7 != a.e.accessibility_action_clickable_span) ? zPerformAccessibilityAction : k(bundle.getInt(b.i.p.p0.a.g, -1), view);
    }

    public void l(View view, int r3) {
        this.f1159a.sendAccessibilityEvent(view, r3);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f1159a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}

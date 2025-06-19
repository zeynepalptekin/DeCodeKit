package b.i.p.p0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.i0;
import androidx.annotation.m0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    public static final int f1264b = -1;

    /* renamed from: a, reason: collision with root package name */
    private final Object f1265a;

    @m0(16)
    static class a extends AccessibilityNodeProvider {

        /* renamed from: a, reason: collision with root package name */
        final e f1266a;

        a(e eVar) {
            this.f1266a = eVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int r2) {
            d dVarA = this.f1266a.a(r2);
            if (dVarA == null) {
                return null;
            }
            return dVarA.S1();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int r5) {
            List<d> listB = this.f1266a.b(str, r5);
            if (listB == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listB.size();
            for (int r1 = 0; r1 < size; r1++) {
                arrayList.add(listB.get(r1).S1());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int r2, int r3, Bundle bundle) {
            return this.f1266a.e(r2, r3, bundle);
        }
    }

    @m0(19)
    static class b extends a {
        b(e eVar) {
            super(eVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int r2) {
            d dVarC = this.f1266a.c(r2);
            if (dVarC == null) {
                return null;
            }
            return dVarC.S1();
        }
    }

    public e() {
        int r0 = Build.VERSION.SDK_INT;
        this.f1265a = r0 >= 19 ? new b(this) : r0 >= 16 ? new a(this) : null;
    }

    public e(Object obj) {
        this.f1265a = obj;
    }

    @i0
    public d a(int r1) {
        return null;
    }

    @i0
    public List<d> b(String str, int r2) {
        return null;
    }

    @i0
    public d c(int r1) {
        return null;
    }

    public Object d() {
        return this.f1265a;
    }

    public boolean e(int r1, int r2, Bundle bundle) {
        return false;
    }
}

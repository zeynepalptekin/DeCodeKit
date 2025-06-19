package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.appcompat.app.j;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public class b extends j {
    private boolean B0;

    /* renamed from: com.google.android.material.bottomsheet.b$b, reason: collision with other inner class name */
    private class C0193b extends BottomSheetBehavior.f {
        private C0193b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void a(@h0 View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(@h0 View view, int r2) {
            if (r2 == 5) {
                b.this.F2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F2() {
        if (this.B0) {
            super.p2();
        } else {
            super.o2();
        }
    }

    private void G2(@h0 BottomSheetBehavior<?> bottomSheetBehavior, boolean z) {
        this.B0 = z;
        if (bottomSheetBehavior.f0() == 5) {
            F2();
            return;
        }
        if (r2() instanceof com.google.android.material.bottomsheet.a) {
            ((com.google.android.material.bottomsheet.a) r2()).l();
        }
        bottomSheetBehavior.O(new C0193b());
        bottomSheetBehavior.z0(5);
    }

    private boolean H2(boolean z) {
        Dialog dialogR2 = r2();
        if (!(dialogR2 instanceof com.google.android.material.bottomsheet.a)) {
            return false;
        }
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) dialogR2;
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorI = aVar.i();
        if (!bottomSheetBehaviorI.k0() || !aVar.j()) {
            return false;
        }
        G2(bottomSheetBehaviorI, z);
        return true;
    }

    @Override // androidx.fragment.app.c
    public void o2() {
        if (H2(false)) {
            return;
        }
        super.o2();
    }

    @Override // androidx.fragment.app.c
    public void p2() {
        if (H2(true)) {
            return;
        }
        super.p2();
    }

    @Override // androidx.appcompat.app.j, androidx.fragment.app.c
    @h0
    public Dialog v2(@i0 Bundle bundle) {
        return new com.google.android.material.bottomsheet.a(u(), t2());
    }
}

package androidx.fragment.app;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.annotation.t0;

/* loaded from: classes.dex */
public class c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String A0 = "android:backStackId";
    public static final int r0 = 0;
    public static final int s0 = 1;
    public static final int t0 = 2;
    public static final int u0 = 3;
    private static final String v0 = "android:savedDialogState";
    private static final String w0 = "android:style";
    private static final String x0 = "android:theme";
    private static final String y0 = "android:cancelable";
    private static final String z0 = "android:showsDialog";
    private Handler g0;
    private Runnable h0 = new a();
    int i0 = 0;
    int j0 = 0;
    boolean k0 = true;
    boolean l0 = true;
    int m0 = -1;

    @i0
    Dialog n0;
    boolean o0;
    boolean p0;
    boolean q0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar = c.this;
            Dialog dialog = cVar.n0;
            if (dialog != null) {
                cVar.onDismiss(dialog);
            }
        }
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void A2(@h0 Dialog dialog, int r4) {
        if (r4 != 1 && r4 != 2) {
            if (r4 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public int B2(@h0 r rVar, @i0 String str) {
        this.p0 = false;
        this.q0 = true;
        rVar.i(this, str);
        this.o0 = false;
        int r3 = rVar.n();
        this.m0 = r3;
        return r3;
    }

    public void C2(@h0 i iVar, @i0 String str) {
        this.p0 = false;
        this.q0 = true;
        r rVarB = iVar.b();
        rVarB.i(this, str);
        rVarB.n();
    }

    public void D2(@h0 i iVar, @i0 String str) {
        this.p0 = false;
        this.q0 = true;
        r rVarB = iVar.b();
        rVarB.i(this, str);
        rVarB.p();
    }

    @Override // androidx.fragment.app.Fragment
    public void F0() {
        super.F0();
        Dialog dialog = this.n0;
        if (dialog != null) {
            this.o0 = true;
            dialog.setOnDismissListener(null);
            this.n0.dismiss();
            if (!this.p0) {
                onDismiss(this.n0);
            }
            this.n0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void G0() {
        super.G0();
        if (this.q0 || this.p0) {
            return;
        }
        this.p0 = true;
    }

    @Override // androidx.fragment.app.Fragment
    @h0
    public LayoutInflater H0(@i0 Bundle bundle) {
        Context contextH;
        if (!this.l0) {
            return super.H0(bundle);
        }
        Dialog dialogV2 = v2(bundle);
        this.n0 = dialogV2;
        if (dialogV2 != null) {
            A2(dialogV2, this.i0);
            contextH = this.n0.getContext();
        } else {
            contextH = this.v.h();
        }
        return (LayoutInflater) contextH.getSystemService("layout_inflater");
    }

    @Override // androidx.fragment.app.Fragment
    public void U0(@h0 Bundle bundle) {
        Bundle bundleOnSaveInstanceState;
        super.U0(bundle);
        Dialog dialog = this.n0;
        if (dialog != null && (bundleOnSaveInstanceState = dialog.onSaveInstanceState()) != null) {
            bundle.putBundle(v0, bundleOnSaveInstanceState);
        }
        int r02 = this.i0;
        if (r02 != 0) {
            bundle.putInt(w0, r02);
        }
        int r03 = this.j0;
        if (r03 != 0) {
            bundle.putInt(x0, r03);
        }
        boolean z = this.k0;
        if (!z) {
            bundle.putBoolean(y0, z);
        }
        boolean z2 = this.l0;
        if (!z2) {
            bundle.putBoolean(z0, z2);
        }
        int r04 = this.m0;
        if (r04 != -1) {
            bundle.putInt(A0, r04);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void V0() {
        super.V0();
        Dialog dialog = this.n0;
        if (dialog != null) {
            this.o0 = false;
            dialog.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void W0() {
        super.W0();
        Dialog dialog = this.n0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void o2() {
        q2(false, false);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(@h0 DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(@h0 DialogInterface dialogInterface) {
        if (this.o0) {
            return;
        }
        q2(true, true);
    }

    public void p2() {
        q2(true, false);
    }

    void q2(boolean z, boolean z2) {
        if (this.p0) {
            return;
        }
        this.p0 = true;
        this.q0 = false;
        Dialog dialog = this.n0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.n0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.g0.getLooper()) {
                    onDismiss(this.n0);
                } else {
                    this.g0.post(this.h0);
                }
            }
        }
        this.o0 = true;
        if (this.m0 >= 0) {
            D1().r(this.m0, 1);
            this.m0 = -1;
            return;
        }
        r rVarB = D1().b();
        rVarB.x(this);
        if (z) {
            rVarB.o();
        } else {
            rVarB.n();
        }
    }

    @i0
    public Dialog r2() {
        return this.n0;
    }

    @Override // androidx.fragment.app.Fragment
    public void s0(@i0 Bundle bundle) {
        Bundle bundle2;
        super.s0(bundle);
        if (this.l0) {
            View viewX = X();
            if (viewX != null) {
                if (viewX.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.n0.setContentView(viewX);
            }
            d dVarN = n();
            if (dVarN != null) {
                this.n0.setOwnerActivity(dVarN);
            }
            this.n0.setCancelable(this.k0);
            this.n0.setOnCancelListener(this);
            this.n0.setOnDismissListener(this);
            if (bundle == null || (bundle2 = bundle.getBundle(v0)) == null) {
                return;
            }
            this.n0.onRestoreInstanceState(bundle2);
        }
    }

    public boolean s2() {
        return this.l0;
    }

    @t0
    public int t2() {
        return this.j0;
    }

    public boolean u2() {
        return this.k0;
    }

    @Override // androidx.fragment.app.Fragment
    public void v0(@h0 Context context) {
        super.v0(context);
        if (this.q0) {
            return;
        }
        this.p0 = false;
    }

    @h0
    public Dialog v2(@i0 Bundle bundle) {
        return new Dialog(C1(), t2());
    }

    @h0
    public final Dialog w2() {
        Dialog dialogR2 = r2();
        if (dialogR2 != null) {
            return dialogR2;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void x2(boolean z) {
        this.k0 = z;
        Dialog dialog = this.n0;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void y0(@i0 Bundle bundle) {
        super.y0(bundle);
        this.g0 = new Handler();
        this.l0 = this.z == 0;
        if (bundle != null) {
            this.i0 = bundle.getInt(w0, 0);
            this.j0 = bundle.getInt(x0, 0);
            this.k0 = bundle.getBoolean(y0, true);
            this.l0 = bundle.getBoolean(z0, this.l0);
            this.m0 = bundle.getInt(A0, -1);
        }
    }

    public void y2(boolean z) {
        this.l0 = z;
    }

    public void z2(int r2, @t0 int r3) {
        this.i0 = r2;
        if (r2 == 2 || r2 == 3) {
            this.j0 = R.style.Theme.Panel;
        }
        if (r3 != 0) {
            this.j0 = r3;
        }
    }
}

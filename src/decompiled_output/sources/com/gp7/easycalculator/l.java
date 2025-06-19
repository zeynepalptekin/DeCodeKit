package com.gp7.easycalculator;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.fragment.app.Fragment;
import java.text.DecimalFormat;

/* loaded from: classes.dex */
public class l extends Fragment {
    TextView g0;
    TextView h0;
    String i0;
    View j0;
    Context k0;
    SharedPreferences l0;
    String m0;
    Vibrator n0;
    String o0;
    String s0;
    Button t0;
    Button u0;
    ArrayAdapter<CharSequence> v0;
    u p0 = new u();
    w q0 = new w();
    b0 r0 = new b0();
    String[] w0 = {"kN", "N", "dyn", "kgf", "gf", "lbf", "pdl"};

    class a implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        /* renamed from: com.gp7.easycalculator.l$a$a, reason: collision with other inner class name */
        class DialogInterfaceOnClickListenerC0219a implements DialogInterface.OnClickListener {
            DialogInterfaceOnClickListenerC0219a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x00f7  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x015d  */
            /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onClick(android.content.DialogInterface r10, int r11) {
                /*
                    Method dump skipped, instructions count: 400
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.l.a.DialogInterfaceOnClickListenerC0219a.onClick(android.content.DialogInterface, int):void");
            }
        }

        a(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (l.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    l.this.n0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    l.this.n0.vibrate(20L);
                }
            }
            new d.a(l.this.u()).c(l.this.v0, new DialogInterfaceOnClickListenerC0219a()).a().show();
        }
    }

    class b implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x00f7  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x013c  */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onClick(android.content.DialogInterface r10, int r11) {
                /*
                    Method dump skipped, instructions count: 400
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.l.b.a.onClick(android.content.DialogInterface, int):void");
            }
        }

        b(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (l.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    l.this.n0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    l.this.n0.vibrate(20L);
                }
            }
            new d.a(l.this.u()).c(l.this.v0, new a()).a().show();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0136  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View C0(android.view.LayoutInflater r9, android.view.ViewGroup r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.l.C0(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public Button o2() {
        return this.t0;
    }

    public Button p2() {
        return this.u0;
    }

    public String q2() {
        return this.t0.getText().toString();
    }

    public String r2() {
        return this.u0.getText().toString();
    }

    public TextView s2() {
        return this.g0;
    }

    public TextView t2() {
        return this.h0;
    }

    @Override // androidx.fragment.app.Fragment
    public void v0(Context context) {
        this.k0 = context;
        super.v0(context);
    }
}

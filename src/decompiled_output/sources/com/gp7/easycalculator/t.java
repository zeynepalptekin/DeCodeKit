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
public class t extends Fragment {
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
    String[] w0 = {"km³", "hm³", "dam³", "m³", "dm³", "cm³", "mm³", "in³", "ft³", "yd³", "hl", "l", "dl", "ml", "gal (us)", "gal (uk)", "pt (us)", "pt (uk)", "qt (us)", "qt (uk)", "bbl", "fl.oz (us)", "fl.oz (uk)", "tblsp", "tsp", "cup (us)", "cup (uk)"};

    class a implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        /* renamed from: com.gp7.easycalculator.t$a$a, reason: collision with other inner class name */
        class DialogInterfaceOnClickListenerC0227a implements DialogInterface.OnClickListener {
            DialogInterfaceOnClickListenerC0227a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x0191  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x020c  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0272  */
            /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onClick(android.content.DialogInterface r11, int r12) {
                /*
                    Method dump skipped, instructions count: 716
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.t.a.DialogInterfaceOnClickListenerC0227a.onClick(android.content.DialogInterface, int):void");
            }
        }

        a(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (t.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    t.this.n0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    t.this.n0.vibrate(20L);
                }
            }
            new d.a(t.this.u()).c(t.this.v0, new DialogInterfaceOnClickListenerC0227a()).a().show();
        }
    }

    class b implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x0191  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x020c  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0251  */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onClick(android.content.DialogInterface r11, int r12) {
                /*
                    Method dump skipped, instructions count: 716
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.t.b.a.onClick(android.content.DialogInterface, int):void");
            }
        }

        b(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (t.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    t.this.n0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    t.this.n0.vibrate(20L);
                }
            }
            new d.a(t.this.u()).c(t.this.v0, new a()).a().show();
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
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.t.C0(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
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

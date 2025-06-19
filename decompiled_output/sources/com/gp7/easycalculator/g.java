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
public class g extends Fragment {
    Button g0;
    Button h0;
    String i0;
    View j0;
    String k0;
    Vibrator l0;
    String m0;
    Context n0;
    SharedPreferences o0;
    ArrayAdapter<CharSequence> s0;
    String t0;
    TextView v0;
    TextView w0;
    u p0 = new u();
    w q0 = new w();
    b0 r0 = new b0();
    String[] u0 = {"km²", "hm²", "dam²", "m²", "dm²", "cm²", "mm²", "in²", "ft²", "yd²", "mi²", "a", "ha", "ac"};

    class a implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        /* renamed from: com.gp7.easycalculator.g$a$a, reason: collision with other inner class name */
        class DialogInterfaceOnClickListenerC0214a implements DialogInterface.OnClickListener {
            DialogInterfaceOnClickListenerC0214a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x00de  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0159  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x01bf  */
            /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onClick(android.content.DialogInterface r10, int r11) {
                /*
                    Method dump skipped, instructions count: 512
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.g.a.DialogInterfaceOnClickListenerC0214a.onClick(android.content.DialogInterface, int):void");
            }
        }

        a(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (g.this.m0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    g.this.l0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    g.this.l0.vibrate(20L);
                }
            }
            new d.a(g.this.u()).c(g.this.s0, new DialogInterfaceOnClickListenerC0214a()).a().show();
        }
    }

    class b implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x00de  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0159  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x01bc  */
            /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onClick(android.content.DialogInterface r10, int r11) {
                /*
                    Method dump skipped, instructions count: 510
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.g.b.a.onClick(android.content.DialogInterface, int):void");
            }
        }

        b(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (g.this.m0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    g.this.l0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    g.this.l0.vibrate(20L);
                }
            }
            new d.a(g.this.u()).c(g.this.s0, new a()).a().show();
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
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.g.C0(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public Button o2() {
        return this.g0;
    }

    public Button p2() {
        return this.h0;
    }

    public String q2() {
        return this.g0.getText().toString();
    }

    public String r2() {
        return this.h0.getText().toString();
    }

    public TextView s2() {
        return this.v0;
    }

    public TextView t2() {
        return this.w0;
    }

    @Override // androidx.fragment.app.Fragment
    public void v0(Context context) {
        this.n0 = context;
        super.v0(context);
    }
}

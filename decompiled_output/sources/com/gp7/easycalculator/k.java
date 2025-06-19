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
public class k extends Fragment {
    TextView g0;
    TextView h0;
    String i0;
    View j0;
    Context k0;
    SharedPreferences l0;
    String p0;
    Vibrator q0;
    String r0;
    String s0;
    Button t0;
    Button u0;
    ArrayAdapter<CharSequence> v0;
    u m0 = new u();
    w n0 = new w();
    b0 o0 = new b0();
    String[] w0 = {"J", "kJ", "MJ", "GJ", "cal", "Kcal", "BTU", "Ws", "Wh", "kWh", "MWh", "GWh", "kgf⋅m", "lbf⋅ft"};

    class a implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        /* renamed from: com.gp7.easycalculator.k$a$a, reason: collision with other inner class name */
        class DialogInterfaceOnClickListenerC0218a implements DialogInterface.OnClickListener {
            DialogInterfaceOnClickListenerC0218a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x00db  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0156  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x01bc  */
            /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
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
                throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.k.a.DialogInterfaceOnClickListenerC0218a.onClick(android.content.DialogInterface, int):void");
            }
        }

        a(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (k.this.r0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    k.this.q0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    k.this.q0.vibrate(20L);
                }
            }
            new d.a(k.this.u()).c(k.this.v0, new DialogInterfaceOnClickListenerC0218a()).a().show();
        }
    }

    class b implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x00db  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0156  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x019b  */
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
                throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.k.b.a.onClick(android.content.DialogInterface, int):void");
            }
        }

        b(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (k.this.r0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    k.this.q0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    k.this.q0.vibrate(20L);
                }
            }
            new d.a(k.this.u()).c(k.this.v0, new a()).a().show();
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
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.k.C0(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
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

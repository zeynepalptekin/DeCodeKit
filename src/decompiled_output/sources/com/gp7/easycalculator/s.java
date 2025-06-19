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
public class s extends Fragment {
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
    String[] w0 = {"m/s", "m/min", "m/h", "km/s", "km/min", "km/h", "in/s", "in/min", "in/h", "ft/s", "ft/min", "ft/h", "mi/s", "mi/min", "mi/h", "Kn", "M"};

    class a implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        /* renamed from: com.gp7.easycalculator.s$a$a, reason: collision with other inner class name */
        class DialogInterfaceOnClickListenerC0226a implements DialogInterface.OnClickListener {
            DialogInterfaceOnClickListenerC0226a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0105  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0180  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x01e6  */
            /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onClick(android.content.DialogInterface r10, int r11) {
                /*
                    Method dump skipped, instructions count: 558
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.s.a.DialogInterfaceOnClickListenerC0226a.onClick(android.content.DialogInterface, int):void");
            }
        }

        a(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (s.this.r0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    s.this.q0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    s.this.q0.vibrate(20L);
                }
            }
            new d.a(s.this.u()).c(s.this.v0, new DialogInterfaceOnClickListenerC0226a()).a().show();
        }
    }

    class b implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0105  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0180  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x01c5  */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onClick(android.content.DialogInterface r10, int r11) {
                /*
                    Method dump skipped, instructions count: 558
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.s.b.a.onClick(android.content.DialogInterface, int):void");
            }
        }

        b(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (s.this.r0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    s.this.q0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    s.this.q0.vibrate(20L);
                }
            }
            new d.a(s.this.u()).c(s.this.v0, new a()).a().show();
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
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.s.C0(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
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

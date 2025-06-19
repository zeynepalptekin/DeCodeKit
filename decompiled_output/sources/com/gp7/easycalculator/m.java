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
public class m extends Fragment {
    String j0;
    Vibrator k0;
    String l0;
    Context m0;
    SharedPreferences n0;
    Button o0;
    Button p0;
    String q0;
    ArrayAdapter<CharSequence> r0;
    TextView t0;
    TextView u0;
    String v0;
    View w0;
    u g0 = new u();
    w h0 = new w();
    b0 i0 = new b0();
    String[] s0 = {"km", "hm", "dam", "m", "dm", "cm", "mm", "in", "ft", "yd", "mi", "NM"};

    class a implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        /* renamed from: com.gp7.easycalculator.m$a$a, reason: collision with other inner class name */
        class DialogInterfaceOnClickListenerC0220a implements DialogInterface.OnClickListener {
            DialogInterfaceOnClickListenerC0220a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x00bf  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x013a  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x01a0  */
            /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onClick(android.content.DialogInterface r10, int r11) {
                /*
                    Method dump skipped, instructions count: 478
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.m.a.DialogInterfaceOnClickListenerC0220a.onClick(android.content.DialogInterface, int):void");
            }
        }

        a(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (m.this.l0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    m.this.k0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    m.this.k0.vibrate(20L);
                }
            }
            new d.a(m.this.u()).c(m.this.r0, new DialogInterfaceOnClickListenerC0220a()).a().show();
        }
    }

    class b implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x00bf  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x013a  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x017f  */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onClick(android.content.DialogInterface r10, int r11) {
                /*
                    Method dump skipped, instructions count: 478
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.m.b.a.onClick(android.content.DialogInterface, int):void");
            }
        }

        b(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (m.this.l0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    m.this.k0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    m.this.k0.vibrate(20L);
                }
            }
            new d.a(m.this.u()).c(m.this.r0, new a()).a().show();
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
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.m.C0(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.Fragment
    public void D0() {
        super.D0();
    }

    @Override // androidx.fragment.app.Fragment
    public void F0() {
        super.F0();
    }

    @Override // androidx.fragment.app.Fragment
    public void O0() {
        super.O0();
    }

    @Override // androidx.fragment.app.Fragment
    public void T0() {
        super.T0();
    }

    public Button o2() {
        return this.o0;
    }

    public Button p2() {
        return this.p0;
    }

    public String q2() {
        return this.o0.getText().toString();
    }

    public String r2() {
        return this.p0.getText().toString();
    }

    public TextView s2() {
        return this.t0;
    }

    public TextView t2() {
        return this.u0;
    }

    @Override // androidx.fragment.app.Fragment
    public void v0(Context context) {
        this.m0 = context;
        super.v0(context);
    }
}

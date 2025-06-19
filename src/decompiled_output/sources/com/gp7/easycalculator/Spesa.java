package com.gp7.easycalculator;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.e;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public class Spesa extends androidx.appcompat.app.e {
    private static long p1;
    Button A0;
    Button B0;
    TextView C;
    Button C0;
    TextView D;
    Button D0;
    SQLiteDatabase E;
    Button E0;
    com.gp7.easycalculator.c F;
    ImageButton F0;
    Cursor G;
    TextView G0;
    LinearLayout H;
    CheckBox I;
    ImageButton J;
    int J0;
    private DrawerLayout K;
    int K0;
    AlertDialog.Builder L;
    int L0;
    AlertDialog M;
    String M0;
    View N;
    LinearLayout N0;
    DecimalFormat O;
    TextView O0;
    int P;
    TextView P0;
    float Q;
    TextView Q0;
    TextView R0;
    TextView S0;
    TextView T0;
    String U;
    TextView U0;
    int V;
    TextView V0;
    int W;
    TextView W0;
    int X;
    EditText X0;
    String Y;
    String Y0;
    String Z;
    String Z0;
    Vibrator a0;
    String a1;
    EditText b0;
    String b1;
    ImageButton c0;
    SharedPreferences.Editor c1;
    LinearLayout d0;
    float e0;
    EditText f0;
    TextView g0;
    TextView h0;
    AdView h1;
    RadioButton i0;
    private com.google.android.gms.ads.l i1;
    RadioButton j0;
    private com.google.android.gms.ads.k0.c j1;
    TextView k0;
    private FirebaseAnalytics k1;
    TextView l0;
    String l1;
    TextView m0;
    EditText n0;
    LinearLayout o0;
    Button p0;
    Button q0;
    Button r0;
    Button s0;
    Button t0;
    Button u0;
    Button v0;
    Button w0;
    Button x0;
    Button y0;
    Button z0;
    com.gp7.easycalculator.u R = new com.gp7.easycalculator.u();
    com.gp7.easycalculator.w S = new com.gp7.easycalculator.w();
    com.gp7.easycalculator.b0 T = new com.gp7.easycalculator.b0();
    int H0 = 0;
    int I0 = 1000;
    com.gp7.easycalculator.v d1 = new com.gp7.easycalculator.v();
    String e1 = "false";
    com.gp7.easycalculator.x f1 = new com.gp7.easycalculator.x();
    int g1 = 1;
    Context m1 = this;
    String n1 = "NO";
    String o1 = "si";

    class a extends c.a.e.b0.a<ArrayList<String>> {
        a() {
        }
    }

    class a0 implements View.OnClickListener {
        a0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (Spesa.this.Y0.equals("Francese")) {
                    Spesa.this.R.V(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "9", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                } else if (Spesa.this.Y0.equals("Italiana")) {
                    Spesa.this.R.W(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "9", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                } else {
                    Spesa.this.R.U(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "9", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                }
                Spesa.this.R.s0(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, Spesa.this);
            } catch (NumberFormatException unused) {
                Toast.makeText(Spesa.this, "error", 0).show();
            }
            if (Spesa.this.Y.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Spesa.this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Spesa.this.a0.vibrate(20L);
                }
            }
        }
    }

    class b extends c.a.e.b0.a<ArrayList<String>> {
        b() {
        }
    }

    class b0 implements View.OnClickListener {
        b0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (Spesa.this.Y0.equals("Francese")) {
                    Spesa.this.R.V(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, ".", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                } else if (Spesa.this.Y0.equals("Italiana")) {
                    Spesa.this.R.W(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, ".", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                } else {
                    Spesa.this.R.U(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, ".", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                }
                Spesa.this.R.s0(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, Spesa.this);
            } catch (NumberFormatException unused) {
                Toast.makeText(Spesa.this, "error", 0).show();
            }
            if (Spesa.this.Y.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Spesa.this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Spesa.this.a0.vibrate(20L);
                }
            }
        }
    }

    class c extends c.a.e.b0.a<ArrayList<String>> {
        c() {
        }
    }

    class c0 implements View.OnClickListener {
        c0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (Spesa.this.Y0.equals("Francese")) {
                    Spesa.this.R.V(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "canc", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                } else if (Spesa.this.Y0.equals("Italiana")) {
                    Spesa.this.R.W(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "canc", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                } else {
                    Spesa.this.R.U(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "canc", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                }
                Spesa.this.R.s0(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, Spesa.this);
            } catch (NumberFormatException unused) {
                Toast.makeText(Spesa.this, "error", 0).show();
            }
            if (Spesa.this.Y.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Spesa.this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Spesa.this.a0.vibrate(20L);
                }
            }
        }
    }

    class d extends c.a.e.b0.a<ArrayList<String>> {
        d() {
        }
    }

    class d0 implements View.OnLongClickListener {
        d0() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            Spesa spesa = Spesa.this;
            (spesa.L0 == 1 ? spesa.i0 : spesa.j0).setText("");
            Spesa.this.G0.setText("");
            if (Spesa.this.Y.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Spesa.this.a0.vibrate(VibrationEffect.createOneShot(40L, -1));
                } else {
                    Spesa.this.a0.vibrate(40L);
                }
            }
            return true;
        }
    }

    class e extends c.a.e.b0.a<ArrayList<String>> {
        e() {
        }
    }

    class e0 implements DialogInterface.OnClickListener {
        e0() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x010c  */
        @Override // android.content.DialogInterface.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onClick(android.content.DialogInterface r9, int r10) {
            /*
                Method dump skipped, instructions count: 336
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.Spesa.e0.onClick(android.content.DialogInterface, int):void");
        }
    }

    class f extends c.a.e.b0.a<ArrayList<String>> {
        f() {
        }
    }

    class f0 implements DialogInterface.OnClickListener {
        f0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r2) {
            dialogInterface.cancel();
        }
    }

    class g extends c.a.e.b0.a<ArrayList<String>> {
        g() {
        }
    }

    class g0 extends c.a.e.b0.a<ArrayList<String>> {
        g0() {
        }
    }

    class h extends c.a.e.b0.a<ArrayList<String>> {
        h() {
        }
    }

    class h0 implements DialogInterface.OnClickListener {
        final /* synthetic */ ViewGroup d;

        h0(ViewGroup viewGroup) {
            this.d = viewGroup;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r8) {
            if (Spesa.this.J.getVisibility() != 8) {
                Spesa.this.J.setVisibility(8);
                Spesa.this.n1 = "NO";
            }
            ArrayList arrayList = new ArrayList();
            int childCount = this.d.getChildCount();
            for (int r1 = 0; r1 < childCount; r1++) {
                long jLongValue = ((Long) this.d.getChildAt(r1).getTag()).longValue();
                if (!((CheckBox) ((LinearLayout) ((LinearLayout) this.d.getChildAt(r1)).getChildAt(0)).getChildAt(1)).isChecked()) {
                    arrayList.add(Long.valueOf(jLongValue));
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            for (int r0 = 0; r0 < arrayList.size(); r0++) {
                Spesa.this.F.f(((Long) arrayList.get(r0)).longValue(), Spesa.this.E);
                ViewGroup viewGroup = this.d;
                viewGroup.removeView(viewGroup.findViewWithTag(arrayList.get(r0)));
            }
        }
    }

    class i implements TextWatcher {
        i() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Spesa.this.e0 = r4.b0.getWidth();
            Spesa spesa = Spesa.this;
            spesa.R.r0(spesa.b0, spesa.e0, spesa);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int r2, int r3, int r4) {
        }
    }

    class i0 implements DialogInterface.OnClickListener {
        i0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r2) {
            dialogInterface.cancel();
        }
    }

    class j implements View.OnClickListener {
        j() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0118  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onClick(android.view.View r11) {
            /*
                Method dump skipped, instructions count: 348
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.Spesa.j.onClick(android.view.View):void");
        }
    }

    class j0 implements DialogInterface.OnClickListener {
        final /* synthetic */ View d;

        j0(View view) {
            this.d = view;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r3) throws Resources.NotFoundException {
            Spesa.this.savelist(this.d);
            Spesa.this.d0.removeAllViews();
            dialogInterface.cancel();
            Spesa.this.c0(this.d);
        }
    }

    class k implements DialogInterface.OnClickListener {
        k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r2) {
        }
    }

    class k0 implements DialogInterface.OnClickListener {
        final /* synthetic */ View d;

        k0(View view) {
            this.d = view;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r2) {
            dialogInterface.cancel();
            Spesa.this.d0.removeAllViews();
            Spesa.this.c0(this.d);
        }
    }

    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Spesa.this.M.dismiss();
            if (Spesa.this.Y.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Spesa.this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Spesa.this.a0.vibrate(20L);
                }
            }
        }
    }

    class l0 extends c.a.e.b0.a<ArrayList<String>> {
        l0() {
        }
    }

    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.w wVar;
            String strG0;
            String str;
            String str2;
            Spesa spesa;
            String strM;
            com.gp7.easycalculator.w wVar2;
            String strG02;
            String str3;
            String strM2;
            if (Spesa.this.Y.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Spesa.this.a0.vibrate(VibrationEffect.createOneShot(40L, -1));
                } else {
                    Spesa.this.a0.vibrate(40L);
                }
            }
            Spesa spesa2 = Spesa.this;
            spesa2.g0.setText(spesa2.i0.getText().toString());
            Spesa spesa3 = Spesa.this;
            spesa3.h0.setText(spesa3.j0.getText().toString());
            Spesa.this.M.dismiss();
            try {
                int r5 = 2;
                if (Spesa.this.Y0.equals("Francese")) {
                    str2 = "0";
                    for (int r2 = 0; r2 < Spesa.this.d0.getChildCount(); r2++) {
                        Spesa.this.N0 = (LinearLayout) Spesa.this.d0.getChildAt(r2);
                        Spesa.this.O0 = (TextView) Spesa.this.N0.getChildAt(1);
                        Spesa.this.P0 = (TextView) Spesa.this.N0.getChildAt(2);
                        if (Spesa.this.O0.getText().toString().isEmpty()) {
                            strM2 = Spesa.this.S.m(Spesa.this.R.g0(str2.replaceAll("\\s", "") + "+0", str2, Spesa.this.T, Spesa.this.S, Spesa.this.O, Spesa.this), Spesa.this.Y0);
                        } else {
                            if (!Spesa.this.P0.getText().toString().isEmpty() || Spesa.this.O0.getText().toString().isEmpty()) {
                                wVar2 = Spesa.this.S;
                                strG02 = Spesa.this.R.g0(str2.replaceAll("\\s", "") + "+" + Spesa.this.O0.getText().toString().replaceAll("\\s", "") + "×" + Spesa.this.P0.getText().toString().replaceAll("\\s", ""), str2, Spesa.this.T, Spesa.this.S, Spesa.this.O, Spesa.this);
                                str3 = Spesa.this.Y0;
                            } else {
                                wVar2 = Spesa.this.S;
                                strG02 = Spesa.this.R.g0(str2.replaceAll("\\s", "") + "+" + Spesa.this.O0.getText().toString().replaceAll("\\s", ""), str2, Spesa.this.T, Spesa.this.S, Spesa.this.O, Spesa.this);
                                str3 = Spesa.this.Y0;
                            }
                            strM2 = wVar2.m(strG02, str3);
                        }
                        str2 = strM2;
                    }
                    spesa = Spesa.this;
                } else {
                    if (!Spesa.this.Y0.equals("Italiana")) {
                        String strM3 = "0";
                        for (int r1 = 0; r1 < Spesa.this.d0.getChildCount(); r1++) {
                            Spesa.this.N0 = (LinearLayout) Spesa.this.d0.getChildAt(r1);
                            Spesa.this.O0 = (TextView) Spesa.this.N0.getChildAt(1);
                            Spesa.this.P0 = (TextView) Spesa.this.N0.getChildAt(2);
                            if (Spesa.this.O0.getText().toString().isEmpty()) {
                                wVar = Spesa.this.S;
                                strG0 = Spesa.this.R.g0(strM3.replaceAll(",", "") + "+0", strM3, Spesa.this.T, Spesa.this.S, Spesa.this.O, Spesa.this);
                                str = Spesa.this.Y0;
                            } else if (!Spesa.this.P0.getText().toString().isEmpty() || Spesa.this.O0.getText().toString().isEmpty()) {
                                wVar = Spesa.this.S;
                                strG0 = Spesa.this.R.g0(strM3.replaceAll(",", "") + "+" + Spesa.this.O0.getText().toString().replaceAll(",", "") + "×" + Spesa.this.P0.getText().toString().replaceAll(",", ""), strM3, Spesa.this.T, Spesa.this.S, Spesa.this.O, Spesa.this);
                                str = Spesa.this.Y0;
                            } else {
                                wVar = Spesa.this.S;
                                strG0 = Spesa.this.R.g0(strM3.replaceAll(",", "") + "+" + Spesa.this.O0.getText().toString().replaceAll(",", ""), strM3, Spesa.this.T, Spesa.this.S, Spesa.this.O, Spesa.this);
                                str = Spesa.this.Y0;
                            }
                            strM3 = wVar.m(strG0, str);
                        }
                        Spesa.this.m0.setText(strM3);
                        return;
                    }
                    str2 = "0";
                    int r12 = 0;
                    while (r12 < Spesa.this.d0.getChildCount()) {
                        Spesa.this.N0 = (LinearLayout) Spesa.this.d0.getChildAt(r12);
                        Spesa.this.O0 = (TextView) Spesa.this.N0.getChildAt(1);
                        Spesa.this.P0 = (TextView) Spesa.this.N0.getChildAt(r5);
                        if (Spesa.this.O0.getText().toString().isEmpty()) {
                            String strReplaceAll = str2.replaceAll("[.]", "v").replaceAll("[,]", ".").replaceAll("[v]", "");
                            strM = Spesa.this.S.m(Spesa.this.R.g0(strReplaceAll + "+0", str2, Spesa.this.T, Spesa.this.S, Spesa.this.O, Spesa.this), Spesa.this.Y0);
                        } else if (!Spesa.this.P0.getText().toString().isEmpty() || Spesa.this.O0.getText().toString().isEmpty()) {
                            String strReplaceAll2 = Spesa.this.O0.getText().toString().replaceAll("[.]", "v").replaceAll("[,]", ".").replaceAll("[v]", "");
                            String strReplaceAll3 = Spesa.this.P0.getText().toString().replaceAll("[.]", "v").replaceAll("[,]", ".").replaceAll("[v]", "");
                            String strReplaceAll4 = str2.replaceAll("[.]", "v").replaceAll("[,]", ".").replaceAll("[v]", "");
                            strM = Spesa.this.S.m(Spesa.this.R.g0(strReplaceAll4 + "+" + strReplaceAll3 + "×" + strReplaceAll2, str2, Spesa.this.T, Spesa.this.S, Spesa.this.O, Spesa.this), Spesa.this.Y0);
                        } else {
                            String strReplaceAll5 = Spesa.this.O0.getText().toString().replaceAll("[.]", "v").replaceAll("[,]", ".").replaceAll("[v]", "");
                            String strReplaceAll6 = str2.replaceAll("[.]", "v").replaceAll("[,]", ".").replaceAll("[v]", "");
                            strM = Spesa.this.S.m(Spesa.this.R.g0(strReplaceAll5 + "+" + strReplaceAll6, str2, Spesa.this.T, Spesa.this.S, Spesa.this.O, Spesa.this), Spesa.this.Y0);
                        }
                        str2 = strM;
                        r12++;
                        r5 = 2;
                    }
                    spesa = Spesa.this;
                }
                spesa.m0.setText(str2);
            } catch (NumberFormatException unused) {
                Toast.makeText(Spesa.this, "error", 0).show();
            }
        }
    }

    class m0 extends c.a.e.b0.a<ArrayList<String>> {
        m0() {
        }
    }

    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Spesa.this.i0.setText("");
            Spesa.this.j0.setText("");
            Spesa.this.G0.setText("");
            if (Spesa.this.Y.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Spesa.this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Spesa.this.a0.vibrate(20L);
                }
            }
        }
    }

    class n0 extends c.a.e.b0.a<ArrayList<String>> {
        n0() {
        }
    }

    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (Spesa.this.j0.isChecked()) {
                Spesa.this.j0.setChecked(false);
                Spesa.this.i0.setChecked(true);
                Spesa.this.L0 = 1;
            }
            if (Spesa.this.Y.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Spesa.this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Spesa.this.a0.vibrate(20L);
                }
            }
        }
    }

    class o0 extends c.a.e.b0.a<ArrayList<String>> {
        o0() {
        }
    }

    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (Spesa.this.i0.isChecked()) {
                Spesa.this.i0.setChecked(false);
                Spesa.this.j0.setChecked(true);
                Spesa.this.L0 = 2;
            }
            if (Spesa.this.Y.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Spesa.this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Spesa.this.a0.vibrate(20L);
                }
            }
        }
    }

    class p0 implements DialogInterface.OnClickListener {
        final /* synthetic */ String[] d;

        p0(String[] strArr) {
            this.d = strArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x02d5  */
        /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        @Override // android.content.DialogInterface.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onClick(android.content.DialogInterface r5, int r6) {
            /*
                Method dump skipped, instructions count: 782
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.Spesa.p0.onClick(android.content.DialogInterface, int):void");
        }
    }

    class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (Spesa.this.Y0.equals("Francese")) {
                    Spesa.this.R.V(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "0", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                } else if (Spesa.this.Y0.equals("Italiana")) {
                    Spesa.this.R.W(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "0", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                } else {
                    Spesa.this.R.U(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "0", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                }
                Spesa.this.R.s0(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, Spesa.this);
            } catch (NumberFormatException unused) {
                Toast.makeText(Spesa.this, "error", 0).show();
            }
            if (Spesa.this.Y.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Spesa.this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Spesa.this.a0.vibrate(20L);
                }
            }
        }
    }

    class q0 extends c.a.e.b0.a<ArrayList<String>> {
        q0() {
        }
    }

    class r implements View.OnClickListener {
        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (Spesa.this.Y0.equals("Francese")) {
                    Spesa.this.R.V(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "1", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                } else if (Spesa.this.Y0.equals("Italiana")) {
                    Spesa.this.R.W(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "1", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                } else {
                    Spesa.this.R.U(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "1", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                }
                Spesa.this.R.s0(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, Spesa.this);
            } catch (NumberFormatException unused) {
                Toast.makeText(Spesa.this, "error", 0).show();
            }
            if (Spesa.this.Y.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Spesa.this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Spesa.this.a0.vibrate(20L);
                }
            }
        }
    }

    class r0 extends c.a.e.b0.a<ArrayList<String>> {
        r0() {
        }
    }

    class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (Spesa.this.Y0.equals("Francese")) {
                    Spesa.this.R.V(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "2", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                } else if (Spesa.this.Y0.equals("Italiana")) {
                    Spesa.this.R.W(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "2", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                } else {
                    Spesa.this.R.U(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "2", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                }
                Spesa.this.R.s0(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, Spesa.this);
            } catch (NumberFormatException unused) {
                Toast.makeText(Spesa.this, "error", 0).show();
            }
            if (Spesa.this.Y.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Spesa.this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Spesa.this.a0.vibrate(20L);
                }
            }
        }
    }

    class s0 extends c.a.e.b0.a<ArrayList<String>> {
        s0() {
        }
    }

    class t implements View.OnClickListener {
        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (Spesa.this.Y0.equals("Francese")) {
                    Spesa.this.R.V(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "3", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                } else if (Spesa.this.Y0.equals("Italiana")) {
                    Spesa.this.R.W(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "3", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                } else {
                    Spesa.this.R.U(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "3", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                }
                Spesa.this.R.s0(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, Spesa.this);
            } catch (NumberFormatException unused) {
                Toast.makeText(Spesa.this, "error", 0).show();
            }
            if (Spesa.this.Y.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Spesa.this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Spesa.this.a0.vibrate(20L);
                }
            }
        }
    }

    class t0 extends c.a.e.b0.a<ArrayList<String>> {
        t0() {
        }
    }

    class u implements View.OnClickListener {
        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (Spesa.this.Y0.equals("Francese")) {
                    Spesa.this.R.V(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "4", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                } else if (Spesa.this.Y0.equals("Italiana")) {
                    Spesa.this.R.W(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "4", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                } else {
                    Spesa.this.R.U(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "4", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                }
                Spesa.this.R.s0(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, Spesa.this);
            } catch (NumberFormatException unused) {
                Toast.makeText(Spesa.this, "error", 0).show();
            }
            if (Spesa.this.Y.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Spesa.this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Spesa.this.a0.vibrate(20L);
                }
            }
        }
    }

    class u0 extends c.a.e.b0.a<ArrayList<String>> {
        u0() {
        }
    }

    class v implements com.google.android.gms.ads.k0.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f7033a;

        v(Bundle bundle) {
            this.f7033a = bundle;
        }

        @Override // com.google.android.gms.ads.k0.d
        public void a1(int r1) {
        }

        @Override // com.google.android.gms.ads.k0.d
        public void h1() {
            Spesa.this.j1.u1("ca-app-pub-8629550575650531/2127589917", new e.a().d(AdMobAdapter.class, this.f7033a).f());
            Spesa.this.c1.putLong("data_gift_rifiutato", System.currentTimeMillis());
            Spesa.this.c1.apply();
        }

        @Override // com.google.android.gms.ads.k0.d
        public void k0() {
        }

        @Override // com.google.android.gms.ads.k0.d
        public void k1() {
        }

        @Override // com.google.android.gms.ads.k0.d
        public void l0() {
        }

        @Override // com.google.android.gms.ads.k0.d
        public void l1() {
        }

        @Override // com.google.android.gms.ads.k0.d
        public void r1() {
        }

        @Override // com.google.android.gms.ads.k0.d
        public void s1(com.google.android.gms.ads.k0.b bVar) {
            Toast toastMakeText = Toast.makeText(Spesa.this.getBaseContext(), Spesa.this.getResources().getString(R.string.premioPRO), 1);
            toastMakeText.setGravity(48, 0, 0);
            toastMakeText.show();
            Spesa.this.c1.putLong("data_gift_vinto", System.currentTimeMillis());
            Spesa.this.c1.apply();
            Spesa.this.h1.setVisibility(8);
        }
    }

    class v0 extends c.a.e.b0.a<ArrayList<String>> {
        v0() {
        }
    }

    class w implements View.OnClickListener {
        w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (Spesa.this.Y0.equals("Francese")) {
                    Spesa.this.R.V(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "5", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                } else if (Spesa.this.Y0.equals("Italiana")) {
                    Spesa.this.R.W(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "5", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                } else {
                    Spesa.this.R.U(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "5", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                }
                Spesa.this.R.s0(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, Spesa.this);
            } catch (NumberFormatException unused) {
                Toast.makeText(Spesa.this, "error", 0).show();
            }
            if (Spesa.this.Y.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Spesa.this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Spesa.this.a0.vibrate(20L);
                }
            }
        }
    }

    class x implements View.OnClickListener {
        x() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (Spesa.this.Y0.equals("Francese")) {
                    Spesa.this.R.V(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "6", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                } else if (Spesa.this.Y0.equals("Italiana")) {
                    Spesa.this.R.W(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "6", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                } else {
                    Spesa.this.R.U(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "6", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                }
                Spesa.this.R.s0(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, Spesa.this);
            } catch (NumberFormatException unused) {
                Toast.makeText(Spesa.this, "error", 0).show();
            }
            if (Spesa.this.Y.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Spesa.this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Spesa.this.a0.vibrate(20L);
                }
            }
        }
    }

    class y implements View.OnClickListener {
        y() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (Spesa.this.Y0.equals("Francese")) {
                    Spesa.this.R.V(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "7", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                } else if (Spesa.this.Y0.equals("Italiana")) {
                    Spesa.this.R.W(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "7", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                } else {
                    Spesa.this.R.U(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "7", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                }
                Spesa.this.R.s0(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, Spesa.this);
            } catch (NumberFormatException unused) {
                Toast.makeText(Spesa.this, "error", 0).show();
            }
            if (Spesa.this.Y.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Spesa.this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Spesa.this.a0.vibrate(20L);
                }
            }
        }
    }

    class z implements View.OnClickListener {
        z() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (Spesa.this.Y0.equals("Francese")) {
                    Spesa.this.R.V(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "8", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                } else if (Spesa.this.Y0.equals("Italiana")) {
                    Spesa.this.R.W(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "8", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                } else {
                    Spesa.this.R.U(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, "8", Spesa.this.L0, Spesa.this.O, Spesa.this.S, Spesa.this.T, Spesa.this.Y0, Spesa.this);
                }
                Spesa.this.R.s0(Spesa.this.i0, Spesa.this.j0, Spesa.this.G0, Spesa.this);
            } catch (NumberFormatException unused) {
                Toast.makeText(Spesa.this, "error", 0).show();
            }
            if (Spesa.this.Y.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Spesa.this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Spesa.this.a0.vibrate(20L);
                }
            }
        }
    }

    private Bitmap d0(View view) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable background = view.getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void SpesaDialogMODE(android.view.View r4) {
        /*
            r3 = this;
            int r4 = r4.getId()
            switch(r4) {
                case 2131296857: goto La;
                case 2131296858: goto L8;
                default: goto L7;
            }
        L7:
            goto Ld
        L8:
            r4 = 1
            goto Lb
        La:
            r4 = 2
        Lb:
            r3.L0 = r4
        Ld:
            java.lang.String r4 = r3.Y
            java.lang.String r0 = "si"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L2f
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            r1 = 20
            if (r4 < r0) goto L2a
            android.os.Vibrator r4 = r3.a0
            r0 = -1
            android.os.VibrationEffect r0 = android.os.VibrationEffect.createOneShot(r1, r0)
            r4.vibrate(r0)
            goto L2f
        L2a:
            android.os.Vibrator r4 = r3.a0
            r4.vibrate(r1)
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.Spesa.SpesaDialogMODE(android.view.View):void");
    }

    public void additemsaved(View view) {
        if (this.Y.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.a0.vibrate(20L);
            }
        }
        if (this.d0.getChildCount() == 1 && this.b0.getText().toString().isEmpty()) {
            this.d0.removeAllViews();
            c0(view);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(getResources().getString(R.string.saveprecedenteListShopping));
        builder.setTitle(getResources().getString(R.string.AlertTitle));
        builder.setCancelable(false);
        builder.setPositiveButton(getResources().getString(R.string.AlertSI), new j0(view));
        builder.setNegativeButton(getResources().getString(R.string.AlertNO), new k0(view));
        builder.create().show();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0202 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void c0(android.view.View r17) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.Spesa.c0(android.view.View):void");
    }

    public void changeQT(View view) {
        String[] strArr = {"Qt.", "g", "kg", "oz", "lb", "l", "gal", "pt", "qt", "fl.oz", "Pkt", "Btl"};
        ArrayAdapter<CharSequence> arrayAdapterCreateFromResource = ArrayAdapter.createFromResource(this, R.array.tipoquantita, R.layout.spinner_layout);
        arrayAdapterCreateFromResource.setDropDownViewResource(android.R.layout.simple_spinner_item);
        if (this.Y.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.a0.vibrate(20L);
            }
        }
        new AlertDialog.Builder(this).setAdapter(arrayAdapterCreateFromResource, new p0(strArr)).create().show();
        if (this.Y.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.a0.vibrate(20L);
            }
        }
    }

    public void ckmemory(View view) {
        com.gp7.easycalculator.c cVar;
        Long lValueOf;
        SQLiteDatabase sQLiteDatabase;
        String str;
        if (this.Y.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.a0.vibrate(20L);
            }
        }
        CheckBox checkBox = (CheckBox) view;
        this.I = checkBox;
        long jLongValue = ((Long) ((View) checkBox.getParent().getParent()).getTag()).longValue();
        if (this.I.isChecked()) {
            this.I.setBackground(getDrawable(R.drawable.ic_pin_test_ck));
            cVar = this.F;
            lValueOf = Long.valueOf(jLongValue);
            sQLiteDatabase = this.E;
            str = "Y";
        } else {
            this.I.setBackground(getDrawable(R.drawable.ic_pin_test));
            cVar = this.F;
            lValueOf = Long.valueOf(jLongValue);
            sQLiteDatabase = this.E;
            str = "N";
        }
        cVar.k(lValueOf, str, sQLiteDatabase);
    }

    public void deleteRowlist(View view) {
        String strM;
        TextView textView;
        com.gp7.easycalculator.w wVar;
        String strG0;
        String str;
        com.gp7.easycalculator.w wVar2;
        String strG02;
        String str2;
        int r9;
        com.gp7.easycalculator.w wVar3;
        String strG03;
        String str3;
        if (this.Y.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.a0.vibrate(20L);
            }
        }
        this.d0.removeView((View) view.getParent());
        try {
            if (this.d0.getChildCount() == 0) {
                this.k0.setText(Long.toString(this.d0.getChildCount()));
                this.m0.setText("0");
            } else {
                int r12 = 2;
                if (this.Y0.equals("Francese")) {
                    strM = "0";
                    int r6 = 0;
                    while (r6 < this.d0.getChildCount()) {
                        LinearLayout linearLayout = (LinearLayout) this.d0.getChildAt(r6);
                        this.N0 = linearLayout;
                        this.O0 = (TextView) linearLayout.getChildAt(1);
                        this.P0 = (TextView) this.N0.getChildAt(r12);
                        if (this.O0.getText().toString().isEmpty()) {
                            com.gp7.easycalculator.w wVar4 = this.S;
                            wVar3 = wVar4;
                            r9 = r6;
                            strG03 = this.R.g0(strM.replaceAll("\\s", "") + "+0", strM, this.T, this.S, this.O, this);
                            str3 = this.Y0;
                        } else {
                            r9 = r6;
                            if (!this.P0.getText().toString().isEmpty() || this.O0.getText().toString().isEmpty()) {
                                wVar3 = this.S;
                                strG03 = this.R.g0(strM.replaceAll("\\s", "") + "+" + this.O0.getText().toString().replaceAll("\\s", "") + "×" + this.P0.getText().toString().replaceAll("\\s", ""), strM, this.T, this.S, this.O, this);
                                str3 = this.Y0;
                            } else {
                                wVar3 = this.S;
                                strG03 = this.R.g0(strM.replaceAll("\\s", "") + "+" + this.O0.getText().toString().replaceAll("\\s", ""), strM, this.T, this.S, this.O, this);
                                str3 = this.Y0;
                            }
                        }
                        strM = wVar3.m(strG03, str3);
                        r6 = r9 + 1;
                        r12 = 2;
                    }
                    textView = this.m0;
                } else {
                    strM = "0";
                    int r92 = 0;
                    if (this.Y0.equals("Italiana")) {
                        while (r92 < this.d0.getChildCount()) {
                            LinearLayout linearLayout2 = (LinearLayout) this.d0.getChildAt(r92);
                            this.N0 = linearLayout2;
                            this.O0 = (TextView) linearLayout2.getChildAt(1);
                            this.P0 = (TextView) this.N0.getChildAt(2);
                            if (this.O0.getText().toString().isEmpty()) {
                                String strReplaceAll = strM.replaceAll("[.]", "v").replaceAll("[,]", ".").replaceAll("[v]", "");
                                wVar2 = this.S;
                                strG02 = this.R.g0(strReplaceAll + "+0", strM, this.T, this.S, this.O, this);
                                str2 = this.Y0;
                            } else if (!this.P0.getText().toString().isEmpty() || this.O0.getText().toString().isEmpty()) {
                                String strReplaceAll2 = this.O0.getText().toString().replaceAll("[.]", "v").replaceAll("[,]", ".").replaceAll("[v]", "");
                                String strReplaceAll3 = this.P0.getText().toString().replaceAll("[.]", "v").replaceAll("[,]", ".").replaceAll("[v]", "");
                                String strReplaceAll4 = strM.replaceAll("[.]", "v").replaceAll("[,]", ".").replaceAll("[v]", "");
                                com.gp7.easycalculator.w wVar5 = this.S;
                                wVar2 = wVar5;
                                strG02 = this.R.g0(strReplaceAll4 + "+" + strReplaceAll3 + "×" + strReplaceAll2, strM, this.T, this.S, this.O, this);
                                str2 = this.Y0;
                            } else {
                                String strReplaceAll5 = this.O0.getText().toString().replaceAll("[.]", "v").replaceAll("[,]", ".").replaceAll("[v]", "");
                                String strReplaceAll6 = strM.replaceAll("[.]", "v").replaceAll("[,]", ".").replaceAll("[v]", "");
                                wVar2 = this.S;
                                strG02 = this.R.g0(strReplaceAll5 + "+" + strReplaceAll6, strM, this.T, this.S, this.O, this);
                                str2 = this.Y0;
                            }
                            strM = wVar2.m(strG02, str2);
                            r92++;
                        }
                        textView = this.m0;
                    } else {
                        while (r92 < this.d0.getChildCount()) {
                            LinearLayout linearLayout3 = (LinearLayout) this.d0.getChildAt(r92);
                            this.N0 = linearLayout3;
                            this.O0 = (TextView) linearLayout3.getChildAt(1);
                            this.P0 = (TextView) this.N0.getChildAt(2);
                            if (this.O0.getText().toString().isEmpty()) {
                                com.gp7.easycalculator.w wVar6 = this.S;
                                wVar = wVar6;
                                strG0 = this.R.g0(strM.replaceAll(",", "") + "+0", strM, this.T, this.S, this.O, this);
                                str = this.Y0;
                            } else if (!this.P0.getText().toString().isEmpty() || this.O0.getText().toString().isEmpty()) {
                                wVar = this.S;
                                strG0 = this.R.g0(strM.replaceAll(",", "") + "+" + this.O0.getText().toString().replaceAll(",", "") + "×" + this.P0.getText().toString().replaceAll(",", ""), strM, this.T, this.S, this.O, this);
                                str = this.Y0;
                            } else {
                                wVar = this.S;
                                strG0 = this.R.g0(strM.replaceAll(",", "") + "+" + this.O0.getText().toString().replaceAll(",", ""), strM, this.T, this.S, this.O, this);
                                str = this.Y0;
                            }
                            strM = wVar.m(strG0, str);
                            r92++;
                        }
                        textView = this.m0;
                    }
                }
                textView.setText(strM);
            }
        } catch (NullPointerException | NumberFormatException unused) {
            Toast.makeText(this, "error", 0).show();
        }
        this.k0.setText(Long.toString(this.d0.getChildCount()));
    }

    public void deleteallSpesa(View view) {
        if (this.Y.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.a0.vibrate(20L);
            }
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.memoriaSpesa);
        if (viewGroup.getChildCount() > 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage(getResources().getString(R.string.DeleteitememoryShopping));
            builder.setTitle(getResources().getString(R.string.AlertTitle));
            builder.setCancelable(false);
            builder.setPositiveButton(getResources().getString(R.string.AlertSI), new h0(viewGroup));
            builder.setNegativeButton(getResources().getString(R.string.AlertNO), new i0());
            builder.create().show();
        }
    }

    public void deleteitemsaved(View view) {
        long jLongValue = ((Long) ((View) view.getParent().getParent()).getTag()).longValue();
        CheckBox checkBox = (CheckBox) ((LinearLayout) ((LinearLayout) view.getParent().getParent()).getChildAt(0)).getChildAt(1);
        this.I = checkBox;
        if (checkBox.isChecked()) {
            Toast.makeText(this, getResources().getString(R.string.listaprotetta), 1).show();
        } else {
            ((ViewGroup) findViewById(R.id.memoriaSpesa)).removeView((View) view.getParent().getParent());
            SQLiteDatabase readableDatabase = this.F.getReadableDatabase();
            this.E = readableDatabase;
            this.F.f(jLongValue, readableDatabase);
        }
        if (this.Y.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.a0.vibrate(20L);
            }
        }
    }

    public void deletelist(View view) {
        if (this.Y.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.a0.vibrate(20L);
            }
        }
        if (this.d0.getChildCount() > 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage(getResources().getString(R.string.DeleteListShopping));
            builder.setTitle(getResources().getString(R.string.AlertTitle));
            builder.setCancelable(false);
            builder.setPositiveButton(getResources().getString(R.string.AlertSI), new e0());
            builder.setNegativeButton(getResources().getString(R.string.AlertNO), new f0());
            builder.create().show();
        }
    }

    public void filterMemorySpesa(View view) {
        for (int r02 = 0; r02 < this.H.getChildCount(); r02++) {
            LinearLayout linearLayout = (LinearLayout) this.H.getChildAt(r02);
            if (((CheckBox) ((LinearLayout) linearLayout.getChildAt(0)).getChildAt(1)).isChecked()) {
                this.o1 = "no";
            } else {
                linearLayout.setVisibility(8);
                this.n1 = "SI";
            }
        }
        if (this.n1.equals("SI")) {
            this.J.setVisibility(0);
        }
        if (this.o1.equals("si")) {
            Toast.makeText(this, getResources().getString(R.string.nolisteprotette), 1).show();
        }
        if (this.Y.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.a0.vibrate(20L);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (p1 + 2500 > System.currentTimeMillis()) {
            this.F.close();
            super.onBackPressed();
        } else {
            Toast.makeText(this, getResources().getString(R.string.doubleclick), 0).show();
            p1 = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:402:0x1a34  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x1a69  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x1a7f  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x1b28  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x1b32  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x1c09  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x1c36  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x1c7a  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x1c84  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x1c8e  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x1c98  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x1c9f  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x1ca9  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x1cac  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x1cc9  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x1e4c  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x1f21  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0418  */
    @Override // androidx.appcompat.app.e, androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.j, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onCreate(android.os.Bundle r32) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 8260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.Spesa.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ce  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onCreateOptionsMenu(android.view.Menu r17) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.Spesa.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    @Override // androidx.appcompat.app.e, androidx.fragment.app.d, android.app.Activity
    protected void onDestroy() {
        this.j1.y1(this);
        getWindow().setSoftInputMode(3);
        this.F.close();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        SharedPreferences.Editor editorEdit = getSharedPreferences(getString(R.string.pref_file), 0).edit();
        SharedPreferences.Editor editorEdit2 = getSharedPreferences("apprater", 0).edit();
        switch (menuItem.getItemId()) {
            case R.id.CLASSIC_spesa /* 2131296272 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "classic");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Classic", 0).show();
                finish();
                startActivity(new Intent(this, (Class<?>) Spesa.class));
                return true;
            case R.id.ELEGANT_spesa /* 2131296302 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "elegant");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Elegant", 0).show();
                finish();
                startActivity(new Intent(this, (Class<?>) Spesa.class));
                return true;
            case R.id.Exit_spesa /* 2131296309 */:
                this.F.close();
                finish();
                return true;
            case R.id.IVAfromspesa /* 2131296322 */:
                startActivity(new Intent(this, (Class<?>) CalcoloIVA.class));
                finish();
                try {
                    if (this.i1 != null && this.i1.f()) {
                        this.i1.o();
                    }
                } catch (NullPointerException e2) {
                    e2.printStackTrace();
                }
                return true;
            case R.id.LIGHT_spesa /* 2131296329 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "light");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Light", 0).show();
                finish();
                startActivity(new Intent(this, (Class<?>) Spesa.class));
                return true;
            case R.id.MINIMAL_spesa /* 2131296338 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "minimal");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Minimal", 0).show();
                finish();
                startActivity(new Intent(this, (Class<?>) Spesa.class));
                return true;
            case R.id.NEON_spesa /* 2131296344 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "neon");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Dark", 0).show();
                finish();
                startActivity(new Intent(this, (Class<?>) Spesa.class));
                return true;
            case R.id.STAR_spesa /* 2131296361 */:
                com.gp7.easycalculator.a.b(this, editorEdit2, menuItem, this.U);
                menuItem.setVisible(false);
                return true;
            case R.id.Scontofromspesa /* 2131296367 */:
                startActivity(new Intent(this, (Class<?>) Sconto.class));
                finish();
                try {
                    if (this.i1 != null && this.i1.f()) {
                        this.i1.o();
                    }
                } catch (NullPointerException e3) {
                    e3.printStackTrace();
                }
                return true;
            case R.id.Setting_spesa /* 2131296374 */:
                startActivity(new Intent(this, (Class<?>) Setting.class));
                return true;
            case R.id.Sharami_spesa /* 2131296380 */:
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", getResources().getString(R.string.downloadApp) + "https://play.google.com/store/apps/details?id=" + com.gp7.easycalculator.b.f7045b);
                intent.setType("text/plain");
                startActivity(intent);
                return true;
            case R.id.aiutomenu_spesa /* 2131296454 */:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.aiuto_spesa_menu, (ViewGroup) null);
                builder.setTitle(getResources().getString(R.string.FaqTitle));
                builder.setView(viewInflate);
                builder.setPositiveButton(getResources().getString(R.string.CloseFaq), new k());
                builder.create().show();
                return true;
            case R.id.gotoConvfromspesa /* 2131296609 */:
                startActivity(new Intent(this, (Class<?>) Convertitore.class));
                finish();
                try {
                    if (this.i1 != null && this.i1.f()) {
                        this.i1.o();
                    }
                } catch (NullPointerException e4) {
                    e4.printStackTrace();
                }
                return true;
            case R.id.gotoTipfromspesa /* 2131296620 */:
                startActivity(new Intent(this, (Class<?>) TipCalculator.class));
                finish();
                try {
                    if (this.i1 != null && this.i1.f()) {
                        this.i1.o();
                    }
                } catch (NullPointerException e5) {
                    e5.printStackTrace();
                }
                return true;
            case R.id.gotocalculatorfromspesa /* 2131296624 */:
                startActivity(new Intent(this, (Class<?>) MainActivity.class));
                finish();
                try {
                    if (this.i1 != null && this.i1.f()) {
                        this.i1.o();
                    }
                } catch (NullPointerException e6) {
                    e6.printStackTrace();
                }
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    protected void onPause() {
        this.j1.D1(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    public void onResume() {
        super.onResume();
        this.j1.w1(this);
        Locale.setDefault(Locale.US);
        SharedPreferences sharedPreferences = getSharedPreferences(getString(R.string.pref_file), 0);
        this.Y = sharedPreferences.getString(getString(R.string.vibrazione_memorizzata), "no");
        this.Z = sharedPreferences.getString(getString(R.string.ScreenONoption_memorizzata), "no");
        this.Y0 = sharedPreferences.getString(getString(R.string.notazione_scelta), "Default");
        this.Z0 = sharedPreferences.getString(getString(R.string.stile_option), "si");
        this.a1 = sharedPreferences.getString(getString(R.string.operator_color), "si");
        if (this.Z.equals("no")) {
            getWindow().clearFlags(128);
        }
        if (this.Z.equals("si")) {
            getWindow().addFlags(128);
        }
    }

    public void opendialogspesa(View view) throws Resources.NotFoundException {
        TextView textView;
        String string;
        TextView textView2;
        String string2;
        this.L0 = 1;
        this.j0.setChecked(false);
        this.i0.setChecked(true);
        int r02 = ((Integer) view.getTag()).intValue();
        this.K0 = r02;
        this.J0 = r02 + 1000;
        this.g0 = (TextView) this.d0.findViewWithTag(Integer.valueOf(r02));
        this.h0 = (TextView) this.d0.findViewWithTag(Integer.valueOf(this.J0));
        LinearLayout linearLayout = (LinearLayout) this.g0.getParent();
        this.o0 = linearLayout;
        EditText editText = (EditText) linearLayout.getChildAt(0);
        this.n0 = editText;
        if (editText.getText().toString().isEmpty()) {
            textView = this.l0;
            string = getResources().getString(R.string.itemlist);
        } else {
            textView = this.l0;
            string = this.n0.getText().toString();
        }
        textView.setText(string);
        if (this.g0.getText().toString().isEmpty()) {
            this.i0.setText("");
        } else {
            this.i0.setText(this.g0.getText().toString());
        }
        if (this.h0.getText().toString().isEmpty()) {
            this.j0.setText("");
        } else {
            this.j0.setText(this.h0.getText().toString());
        }
        if (this.g0.getHint().equals("Qt. 1")) {
            this.Q0.setText("Qt. =");
            textView2 = this.C;
            string2 = "Qt.";
        } else {
            this.Q0.setText(this.g0.getHint().toString() + " =");
            textView2 = this.C;
            string2 = this.g0.getHint().toString();
        }
        textView2.setText(string2);
        this.G0.setText("");
        try {
            if (this.Y0.equals("Francese")) {
                this.R.V(this.i0, this.j0, this.G0, "open", this.L0, this.O, this.S, this.T, this.Y0, this);
            } else if (this.Y0.equals("Italiana")) {
                this.R.W(this.i0, this.j0, this.G0, "open", this.L0, this.O, this.S, this.T, this.Y0, this);
            } else {
                this.R.U(this.i0, this.j0, this.G0, "open", this.L0, this.O, this.S, this.T, this.Y0, this);
            }
            this.R.s0(this.i0, this.j0, this.G0, this);
        } catch (NumberFormatException unused) {
            Toast.makeText(this, "error", 0).show();
        }
        if (this.Y.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.a0.vibrate(20L);
            }
        }
        try {
            this.M.show();
            this.M.getWindow().setLayout((int) (this.P * 0.9d), (int) this.Q);
            this.M.getWindow().setGravity(17);
        } catch (NullPointerException unused2) {
            this.M.show();
        }
    }

    public void opendialogspesa2(View view) throws Resources.NotFoundException {
        TextView textView;
        String string;
        TextView textView2;
        String string2;
        this.L0 = 2;
        this.i0.setChecked(false);
        this.j0.setChecked(true);
        int r02 = ((Integer) view.getTag()).intValue();
        this.J0 = r02;
        int r03 = r02 + androidx.core.app.u.q;
        this.K0 = r03;
        this.g0 = (TextView) this.d0.findViewWithTag(Integer.valueOf(r03));
        this.h0 = (TextView) this.d0.findViewWithTag(Integer.valueOf(this.J0));
        LinearLayout linearLayout = (LinearLayout) this.g0.getParent();
        this.o0 = linearLayout;
        EditText editText = (EditText) linearLayout.getChildAt(0);
        this.n0 = editText;
        if (editText.getText().toString().isEmpty()) {
            textView = this.l0;
            string = getResources().getString(R.string.itemlist);
        } else {
            textView = this.l0;
            string = this.n0.getText().toString();
        }
        textView.setText(string);
        if (this.g0.getText().toString().isEmpty()) {
            this.i0.setText("");
        } else {
            this.i0.setText(this.g0.getText().toString());
        }
        if (this.h0.getText().toString().isEmpty()) {
            this.j0.setText("");
        } else {
            this.j0.setText(this.h0.getText().toString());
        }
        if (this.g0.getHint().equals("Qt. 1")) {
            this.Q0.setText("Qt. =");
            textView2 = this.C;
            string2 = "Qt.";
        } else {
            this.Q0.setText(this.g0.getHint().toString() + " =");
            textView2 = this.C;
            string2 = this.g0.getHint().toString();
        }
        textView2.setText(string2);
        this.G0.setText("");
        try {
            if (this.Y0.equals("Francese")) {
                this.R.V(this.i0, this.j0, this.G0, "open", this.L0, this.O, this.S, this.T, this.Y0, this);
            } else if (this.Y0.equals("Italiana")) {
                this.R.W(this.i0, this.j0, this.G0, "open", this.L0, this.O, this.S, this.T, this.Y0, this);
            } else {
                this.R.U(this.i0, this.j0, this.G0, "open", this.L0, this.O, this.S, this.T, this.Y0, this);
            }
            this.R.s0(this.i0, this.j0, this.G0, this);
        } catch (NumberFormatException unused) {
            Toast.makeText(this, "error", 0).show();
        }
        if (this.Y.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.a0.vibrate(20L);
            }
        }
        try {
            this.M.show();
            this.M.getWindow().setLayout((int) (this.P * 0.9d), (int) this.Q);
            this.M.getWindow().setGravity(17);
        } catch (NullPointerException unused2) {
            this.M.show();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:112:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0aa1  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0c32  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0fa5  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x1137  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x1499  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x163b  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x19fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void savelist(android.view.View r45) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 6712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.Spesa.savelist(android.view.View):void");
    }

    public void shareitemsaved(View view) throws Resources.NotFoundException, IOException {
        if (this.Y.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.a0.vibrate(20L);
            }
        }
        LinearLayout linearLayout = (LinearLayout) view.getParent().getParent();
        View childAt = linearLayout.getChildAt(4);
        linearLayout.removeViewAt(4);
        CheckBox checkBox = (CheckBox) ((LinearLayout) linearLayout.getChildAt(0)).getChildAt(1);
        checkBox.setVisibility(4);
        Bitmap bitmapD0 = d0(linearLayout);
        checkBox.setVisibility(0);
        linearLayout.addView(childAt);
        try {
            File file = new File(getExternalCacheDir(), "logicchip.png");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmapD0.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            file.setReadable(true, true);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setFlags(268435456);
            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
            intent.setType("image/png");
            String string = getResources().getString(R.string.app_name);
            String string2 = getResources().getString(R.string.textShare);
            intent.putExtra("android.intent.extra.SUBJECT", string);
            intent.putExtra("android.intent.extra.TEXT", string2);
            startActivity(Intent.createChooser(intent, "Share image via"));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void startlisspesaactivity(View view) {
        if (this.Y.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.a0.vibrate(20L);
            }
        }
        this.c1.putLong(getString(R.string.rowdacaricare), ((Long) ((View) view.getParent().getParent()).getTag()).longValue());
        this.c1.apply();
        startActivity(new Intent(this, (Class<?>) SpesaLIST.class));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:112:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0ac8  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0c80  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0ff3  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x11ac  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x150e  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x16c8  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x1a88  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void startpresentlist(android.view.View r45) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 6880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.Spesa.startpresentlist(android.view.View):void");
    }

    public void undofilterMemorySpesa(View view) {
        if (this.J.getVisibility() != 8) {
            if (this.Y.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    this.a0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    this.a0.vibrate(20L);
                }
            }
            for (int r2 = 0; r2 < this.H.getChildCount(); r2++) {
                LinearLayout linearLayout = (LinearLayout) this.H.getChildAt(r2);
                if (!((CheckBox) ((LinearLayout) linearLayout.getChildAt(0)).getChildAt(1)).isChecked()) {
                    linearLayout.setVisibility(0);
                    this.n1 = "NO";
                    this.o1 = "si";
                    this.J.setVisibility(8);
                }
            }
        }
    }
}

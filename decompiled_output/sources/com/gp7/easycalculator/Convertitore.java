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
import android.nfc.Tag;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.e;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class Convertitore extends androidx.appcompat.app.e {
    private static long h1;
    Tag A0;
    Tag B0;
    CheckBox C;
    Tag C0;
    ImageButton D;
    Tag D0;
    Tag E0;
    Tag F0;
    Tag G0;
    Tag H0;
    private com.google.android.gms.ads.k0.c I;
    Tag I0;
    private FirebaseAnalytics J;
    Button J0;
    private com.google.android.gms.ads.l K;
    Button K0;
    String L;
    Button L0;
    Vibrator M;
    Button M0;
    String N;
    Button N0;
    String O;
    Button O0;
    String P;
    Button P0;
    String Q;
    Button Q0;
    LinearLayout R;
    Button R0;
    AdView S;
    Button S0;
    SQLiteDatabase T;
    Button T0;
    com.gp7.easycalculator.c U;
    ImageButton U0;
    Cursor V;
    Button V0;
    Button W0;
    private DrawerLayout X;
    Button X0;
    Bundle Y;
    Button Y0;
    String Z0;
    int a1;
    int b1;
    public TabLayout c0;
    int c1;
    public ViewPager d0;
    String d1;
    y e0;
    MenuItem e1;
    Tag u0;
    Tag v0;
    Tag w0;
    Tag x0;
    Tag y0;
    Tag z0;
    com.gp7.easycalculator.v E = new com.gp7.easycalculator.v();
    String F = "false";
    x G = new x();
    int H = 1;
    Context W = this;
    com.gp7.easycalculator.u Z = new com.gp7.easycalculator.u();
    com.gp7.easycalculator.w a0 = new com.gp7.easycalculator.w();
    b0 b0 = new b0();
    com.gp7.easycalculator.m f0 = new com.gp7.easycalculator.m();
    com.gp7.easycalculator.g g0 = new com.gp7.easycalculator.g();
    com.gp7.easycalculator.t h0 = new com.gp7.easycalculator.t();
    com.gp7.easycalculator.n i0 = new com.gp7.easycalculator.n();
    com.gp7.easycalculator.j j0 = new com.gp7.easycalculator.j();
    com.gp7.easycalculator.q k0 = new com.gp7.easycalculator.q();
    com.gp7.easycalculator.o l0 = new com.gp7.easycalculator.o();
    com.gp7.easycalculator.p m0 = new com.gp7.easycalculator.p();
    com.gp7.easycalculator.l n0 = new com.gp7.easycalculator.l();
    com.gp7.easycalculator.k o0 = new com.gp7.easycalculator.k();
    com.gp7.easycalculator.s p0 = new com.gp7.easycalculator.s();
    C0228r q0 = new C0228r();
    com.gp7.easycalculator.f r0 = new com.gp7.easycalculator.f();
    com.gp7.easycalculator.i s0 = new com.gp7.easycalculator.i();
    com.gp7.easycalculator.h t0 = new com.gp7.easycalculator.h();
    String f1 = "NO";
    String g1 = "si";

    class a implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        a(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.u uVar;
            TextView textViewS2;
            TextView textViewT2;
            Convertitore convertitore;
            if (Convertitore.this.P.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Convertitore.this.M.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Convertitore.this.M.vibrate(20L);
                }
            }
            try {
                switch (Convertitore.this.c0.getSelectedTabPosition()) {
                    case 0:
                        Convertitore.this.a0.i(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), "1", 0, Convertitore.this.f0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.f0.q2().equals(Convertitore.this.f0.r2())) {
                            Convertitore.this.Z.c0(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.f0.q2(), Convertitore.this.f0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.f0.q2().isEmpty() && !Convertitore.this.f0.r2().isEmpty()) {
                            Convertitore.this.f0.t2().setText(Convertitore.this.f0.s2().getText().toString());
                        }
                        Convertitore.this.f0.s2().setText(Convertitore.this.a0.m(Convertitore.this.f0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.f0.t2().setText(Convertitore.this.a0.m(Convertitore.this.f0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.f0.s2();
                        textViewT2 = Convertitore.this.f0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 1:
                        Convertitore.this.a0.i(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), "1", 1, Convertitore.this.g0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.g0.q2().equals(Convertitore.this.g0.r2())) {
                            Convertitore.this.Z.b(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.g0.q2(), Convertitore.this.g0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.g0.q2().isEmpty() && !Convertitore.this.g0.r2().isEmpty()) {
                            Convertitore.this.g0.t2().setText(Convertitore.this.g0.s2().getText().toString());
                        }
                        Convertitore.this.g0.s2().setText(Convertitore.this.a0.m(Convertitore.this.g0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.g0.t2().setText(Convertitore.this.a0.m(Convertitore.this.g0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.g0.s2();
                        textViewT2 = Convertitore.this.g0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 2:
                        Convertitore.this.a0.i(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), "1", 2, Convertitore.this.h0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.h0.q2().equals(Convertitore.this.h0.r2())) {
                            Convertitore.this.Z.l0(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.h0.q2(), Convertitore.this.h0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.h0.q2().isEmpty() && !Convertitore.this.h0.r2().isEmpty()) {
                            Convertitore.this.h0.t2().setText(Convertitore.this.h0.s2().getText().toString());
                        }
                        Convertitore.this.h0.s2().setText(Convertitore.this.a0.m(Convertitore.this.h0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.h0.t2().setText(Convertitore.this.a0.m(Convertitore.this.h0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.h0.s2();
                        textViewT2 = Convertitore.this.h0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 3:
                        Convertitore.this.a0.i(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), "1", 3, Convertitore.this.i0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.i0.q2().equals(Convertitore.this.i0.r2())) {
                            Convertitore.this.Z.d0(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.i0.q2(), Convertitore.this.i0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.i0.q2().isEmpty() && !Convertitore.this.i0.r2().isEmpty()) {
                            Convertitore.this.i0.t2().setText(Convertitore.this.i0.s2().getText().toString());
                        }
                        Convertitore.this.i0.s2().setText(Convertitore.this.a0.m(Convertitore.this.i0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.i0.t2().setText(Convertitore.this.a0.m(Convertitore.this.i0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.i0.s2();
                        textViewT2 = Convertitore.this.i0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 4:
                        Convertitore.this.a0.i(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), "1", 4, Convertitore.this.j0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.j0.q2().equals(Convertitore.this.j0.r2())) {
                            Convertitore.this.Z.f(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.j0.q2(), Convertitore.this.j0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.j0.q2().isEmpty() && !Convertitore.this.j0.r2().isEmpty()) {
                            Convertitore.this.j0.t2().setText(Convertitore.this.j0.s2().getText().toString());
                        }
                        Convertitore.this.j0.s2().setText(Convertitore.this.a0.m(Convertitore.this.j0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.j0.t2().setText(Convertitore.this.a0.m(Convertitore.this.j0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.j0.s2();
                        textViewT2 = Convertitore.this.j0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 5:
                        Convertitore.this.a0.i(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), "1", 5, Convertitore.this.k0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.k0.q2().equals(Convertitore.this.k0.r2())) {
                            Convertitore.this.Z.i0(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.k0.q2(), Convertitore.this.k0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.k0.q2().isEmpty() && !Convertitore.this.k0.r2().isEmpty()) {
                            Convertitore.this.k0.t2().setText(Convertitore.this.k0.s2().getText().toString());
                        }
                        Convertitore.this.k0.s2().setText(Convertitore.this.a0.m(Convertitore.this.k0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.k0.t2().setText(Convertitore.this.a0.m(Convertitore.this.k0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.k0.s2();
                        textViewT2 = Convertitore.this.k0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 6:
                        Convertitore.this.a0.i(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), "1", 6, Convertitore.this.l0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.l0.q2().equals(Convertitore.this.l0.r2())) {
                            Convertitore.this.Z.e0(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.l0.q2(), Convertitore.this.l0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.l0.q2().isEmpty() && !Convertitore.this.l0.r2().isEmpty()) {
                            Convertitore.this.l0.t2().setText(Convertitore.this.l0.s2().getText().toString());
                        }
                        Convertitore.this.l0.s2().setText(Convertitore.this.a0.m(Convertitore.this.l0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.l0.t2().setText(Convertitore.this.a0.m(Convertitore.this.l0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.l0.s2();
                        textViewT2 = Convertitore.this.l0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 7:
                        Convertitore.this.a0.i(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), "1", 7, Convertitore.this.m0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.m0.q2().equals(Convertitore.this.m0.r2())) {
                            Convertitore.this.Z.f0(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.m0.q2(), Convertitore.this.m0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.m0.q2().isEmpty() && !Convertitore.this.m0.r2().isEmpty()) {
                            Convertitore.this.m0.t2().setText(Convertitore.this.m0.s2().getText().toString());
                        }
                        Convertitore.this.m0.s2().setText(Convertitore.this.a0.m(Convertitore.this.m0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.m0.t2().setText(Convertitore.this.a0.m(Convertitore.this.m0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.m0.s2();
                        textViewT2 = Convertitore.this.m0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 8:
                        Convertitore.this.a0.i(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), "1", 8, Convertitore.this.n0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.n0.q2().equals(Convertitore.this.n0.r2())) {
                            Convertitore.this.Z.h(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.n0.q2(), Convertitore.this.n0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.n0.q2().isEmpty() && !Convertitore.this.n0.r2().isEmpty()) {
                            Convertitore.this.n0.t2().setText(Convertitore.this.n0.s2().getText().toString());
                        }
                        Convertitore.this.n0.s2().setText(Convertitore.this.a0.m(Convertitore.this.n0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.n0.t2().setText(Convertitore.this.a0.m(Convertitore.this.n0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.n0.s2();
                        textViewT2 = Convertitore.this.n0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 9:
                        Convertitore.this.a0.i(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), "1", 9, Convertitore.this.o0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.o0.q2().equals(Convertitore.this.o0.r2())) {
                            Convertitore.this.Z.g(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.o0.q2(), Convertitore.this.o0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.o0.q2().isEmpty() && !Convertitore.this.o0.r2().isEmpty()) {
                            Convertitore.this.o0.t2().setText(Convertitore.this.o0.s2().getText().toString());
                        }
                        Convertitore.this.o0.s2().setText(Convertitore.this.a0.m(Convertitore.this.o0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.o0.t2().setText(Convertitore.this.a0.m(Convertitore.this.o0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.o0.s2();
                        textViewT2 = Convertitore.this.o0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 10:
                        Convertitore.this.a0.i(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), "1", 10, Convertitore.this.p0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.p0.q2().equals(Convertitore.this.p0.r2())) {
                            Convertitore.this.Z.k0(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.p0.q2(), Convertitore.this.p0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.p0.q2().isEmpty() && !Convertitore.this.p0.r2().isEmpty()) {
                            Convertitore.this.p0.t2().setText(Convertitore.this.p0.s2().getText().toString());
                        }
                        Convertitore.this.p0.s2().setText(Convertitore.this.a0.m(Convertitore.this.p0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.p0.t2().setText(Convertitore.this.a0.m(Convertitore.this.p0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.p0.s2();
                        textViewT2 = Convertitore.this.p0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 11:
                        Convertitore.this.a0.i(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), "1", 11, Convertitore.this.q0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.q0.q2().equals(Convertitore.this.q0.r2())) {
                            Convertitore.this.Z.j0(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.q0.q2(), Convertitore.this.q0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.q0.q2().isEmpty() && !Convertitore.this.q0.r2().isEmpty()) {
                            Convertitore.this.q0.t2().setText(Convertitore.this.q0.s2().getText().toString());
                        }
                        Convertitore.this.q0.s2().setText(Convertitore.this.a0.m(Convertitore.this.q0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.q0.t2().setText(Convertitore.this.a0.m(Convertitore.this.q0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.q0.s2();
                        textViewT2 = Convertitore.this.q0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 12:
                        Convertitore.this.a0.i(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), "1", 12, Convertitore.this.r0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.r0.q2().equals(Convertitore.this.r0.r2())) {
                            Convertitore.this.Z.a(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.r0.q2(), Convertitore.this.r0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.r0.q2().isEmpty() && !Convertitore.this.r0.r2().isEmpty()) {
                            Convertitore.this.r0.t2().setText(Convertitore.this.r0.s2().getText().toString());
                        }
                        Convertitore.this.r0.s2().setText(Convertitore.this.a0.m(Convertitore.this.r0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.r0.t2().setText(Convertitore.this.a0.m(Convertitore.this.r0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.r0.s2();
                        textViewT2 = Convertitore.this.r0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 13:
                        Convertitore.this.a0.i(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), "1", 13, Convertitore.this.s0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.s0.q2().equals(Convertitore.this.s0.r2())) {
                            Convertitore.this.Z.e(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.s0.q2(), Convertitore.this.s0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.s0.q2().isEmpty() && !Convertitore.this.s0.r2().isEmpty()) {
                            Convertitore.this.s0.t2().setText(Convertitore.this.s0.s2().getText().toString());
                        }
                        Convertitore.this.s0.s2().setText(Convertitore.this.a0.m(Convertitore.this.s0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.s0.t2().setText(Convertitore.this.a0.m(Convertitore.this.s0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.s0.s2();
                        textViewT2 = Convertitore.this.s0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 14:
                        Convertitore.this.a0.i(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), "1", 14, Convertitore.this.t0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.t0.q2().equals(Convertitore.this.t0.r2())) {
                            Convertitore.this.Z.c(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.t0.q2(), Convertitore.this.t0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.t0.q2().isEmpty() && !Convertitore.this.t0.r2().isEmpty()) {
                            Convertitore.this.t0.t2().setText(Convertitore.this.t0.s2().getText().toString());
                        }
                        Convertitore.this.t0.s2().setText(Convertitore.this.a0.m(Convertitore.this.t0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.t0.t2().setText(Convertitore.this.a0.m(Convertitore.this.t0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.t0.s2();
                        textViewT2 = Convertitore.this.t0.t2();
                        convertitore = Convertitore.this;
                        break;
                    default:
                        return;
                }
                uVar.o0(textViewS2, textViewT2, convertitore.getBaseContext());
            } catch (NullPointerException | NumberFormatException unused) {
                Toast.makeText(Convertitore.this.W, "error", 0).show();
            }
        }
    }

    class b implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        b(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.u uVar;
            TextView textViewS2;
            TextView textViewT2;
            Convertitore convertitore;
            if (Convertitore.this.P.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Convertitore.this.M.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Convertitore.this.M.vibrate(20L);
                }
            }
            try {
                switch (Convertitore.this.c0.getSelectedTabPosition()) {
                    case 0:
                        Convertitore.this.a0.i(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), "2", 0, Convertitore.this.f0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.f0.q2().equals(Convertitore.this.f0.r2())) {
                            Convertitore.this.Z.c0(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.f0.q2(), Convertitore.this.f0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.f0.q2().isEmpty() && !Convertitore.this.f0.r2().isEmpty()) {
                            Convertitore.this.f0.t2().setText(Convertitore.this.f0.s2().getText().toString());
                        }
                        Convertitore.this.f0.s2().setText(Convertitore.this.a0.m(Convertitore.this.f0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.f0.t2().setText(Convertitore.this.a0.m(Convertitore.this.f0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.f0.s2();
                        textViewT2 = Convertitore.this.f0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 1:
                        Convertitore.this.a0.i(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), "2", 1, Convertitore.this.g0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.g0.q2().equals(Convertitore.this.g0.r2())) {
                            Convertitore.this.Z.b(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.g0.q2(), Convertitore.this.g0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.g0.q2().isEmpty() && !Convertitore.this.g0.r2().isEmpty()) {
                            Convertitore.this.g0.t2().setText(Convertitore.this.g0.s2().getText().toString());
                        }
                        Convertitore.this.g0.s2().setText(Convertitore.this.a0.m(Convertitore.this.g0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.g0.t2().setText(Convertitore.this.a0.m(Convertitore.this.g0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.g0.s2();
                        textViewT2 = Convertitore.this.g0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 2:
                        Convertitore.this.a0.i(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), "2", 2, Convertitore.this.h0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.h0.q2().equals(Convertitore.this.h0.r2())) {
                            Convertitore.this.Z.l0(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.h0.q2(), Convertitore.this.h0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.h0.q2().isEmpty() && !Convertitore.this.h0.r2().isEmpty()) {
                            Convertitore.this.h0.t2().setText(Convertitore.this.h0.s2().getText().toString());
                        }
                        Convertitore.this.h0.s2().setText(Convertitore.this.a0.m(Convertitore.this.h0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.h0.t2().setText(Convertitore.this.a0.m(Convertitore.this.h0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.h0.s2();
                        textViewT2 = Convertitore.this.h0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 3:
                        Convertitore.this.a0.i(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), "2", 3, Convertitore.this.i0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.i0.q2().equals(Convertitore.this.i0.r2())) {
                            Convertitore.this.Z.d0(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.i0.q2(), Convertitore.this.i0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.i0.q2().isEmpty() && !Convertitore.this.i0.r2().isEmpty()) {
                            Convertitore.this.i0.t2().setText(Convertitore.this.i0.s2().getText().toString());
                        }
                        Convertitore.this.i0.s2().setText(Convertitore.this.a0.m(Convertitore.this.i0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.i0.t2().setText(Convertitore.this.a0.m(Convertitore.this.i0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.i0.s2();
                        textViewT2 = Convertitore.this.i0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 4:
                        Convertitore.this.a0.i(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), "2", 4, Convertitore.this.j0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.j0.q2().equals(Convertitore.this.j0.r2())) {
                            Convertitore.this.Z.f(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.j0.q2(), Convertitore.this.j0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.j0.q2().isEmpty() && !Convertitore.this.j0.r2().isEmpty()) {
                            Convertitore.this.j0.t2().setText(Convertitore.this.j0.s2().getText().toString());
                        }
                        Convertitore.this.j0.s2().setText(Convertitore.this.a0.m(Convertitore.this.j0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.j0.t2().setText(Convertitore.this.a0.m(Convertitore.this.j0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.j0.s2();
                        textViewT2 = Convertitore.this.j0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 5:
                        Convertitore.this.a0.i(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), "2", 5, Convertitore.this.k0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.k0.q2().equals(Convertitore.this.k0.r2())) {
                            Convertitore.this.Z.i0(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.k0.q2(), Convertitore.this.k0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.k0.q2().isEmpty() && !Convertitore.this.k0.r2().isEmpty()) {
                            Convertitore.this.k0.t2().setText(Convertitore.this.k0.s2().getText().toString());
                        }
                        Convertitore.this.k0.s2().setText(Convertitore.this.a0.m(Convertitore.this.k0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.k0.t2().setText(Convertitore.this.a0.m(Convertitore.this.k0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.k0.s2();
                        textViewT2 = Convertitore.this.k0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 6:
                        Convertitore.this.a0.i(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), "2", 6, Convertitore.this.l0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.l0.q2().equals(Convertitore.this.l0.r2())) {
                            Convertitore.this.Z.e0(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.l0.q2(), Convertitore.this.l0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.l0.q2().isEmpty() && !Convertitore.this.l0.r2().isEmpty()) {
                            Convertitore.this.l0.t2().setText(Convertitore.this.l0.s2().getText().toString());
                        }
                        Convertitore.this.l0.s2().setText(Convertitore.this.a0.m(Convertitore.this.l0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.l0.t2().setText(Convertitore.this.a0.m(Convertitore.this.l0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.l0.s2();
                        textViewT2 = Convertitore.this.l0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 7:
                        Convertitore.this.a0.i(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), "2", 7, Convertitore.this.m0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.m0.q2().equals(Convertitore.this.m0.r2())) {
                            Convertitore.this.Z.f0(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.m0.q2(), Convertitore.this.m0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.m0.q2().isEmpty() && !Convertitore.this.m0.r2().isEmpty()) {
                            Convertitore.this.m0.t2().setText(Convertitore.this.m0.s2().getText().toString());
                        }
                        Convertitore.this.m0.s2().setText(Convertitore.this.a0.m(Convertitore.this.m0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.m0.t2().setText(Convertitore.this.a0.m(Convertitore.this.m0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.m0.s2();
                        textViewT2 = Convertitore.this.m0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 8:
                        Convertitore.this.a0.i(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), "2", 8, Convertitore.this.n0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.n0.q2().equals(Convertitore.this.n0.r2())) {
                            Convertitore.this.Z.h(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.n0.q2(), Convertitore.this.n0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.n0.q2().isEmpty() && !Convertitore.this.n0.r2().isEmpty()) {
                            Convertitore.this.n0.t2().setText(Convertitore.this.n0.s2().getText().toString());
                        }
                        Convertitore.this.n0.s2().setText(Convertitore.this.a0.m(Convertitore.this.n0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.n0.t2().setText(Convertitore.this.a0.m(Convertitore.this.n0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.n0.s2();
                        textViewT2 = Convertitore.this.n0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 9:
                        Convertitore.this.a0.i(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), "2", 9, Convertitore.this.o0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.o0.q2().equals(Convertitore.this.o0.r2())) {
                            Convertitore.this.Z.g(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.o0.q2(), Convertitore.this.o0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.o0.q2().isEmpty() && !Convertitore.this.o0.r2().isEmpty()) {
                            Convertitore.this.o0.t2().setText(Convertitore.this.o0.s2().getText().toString());
                        }
                        Convertitore.this.o0.s2().setText(Convertitore.this.a0.m(Convertitore.this.o0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.o0.t2().setText(Convertitore.this.a0.m(Convertitore.this.o0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.o0.s2();
                        textViewT2 = Convertitore.this.o0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 10:
                        Convertitore.this.a0.i(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), "2", 10, Convertitore.this.p0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.p0.q2().equals(Convertitore.this.p0.r2())) {
                            Convertitore.this.Z.k0(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.p0.q2(), Convertitore.this.p0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.p0.q2().isEmpty() && !Convertitore.this.p0.r2().isEmpty()) {
                            Convertitore.this.p0.t2().setText(Convertitore.this.p0.s2().getText().toString());
                        }
                        Convertitore.this.p0.s2().setText(Convertitore.this.a0.m(Convertitore.this.p0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.p0.t2().setText(Convertitore.this.a0.m(Convertitore.this.p0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.p0.s2();
                        textViewT2 = Convertitore.this.p0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 11:
                        Convertitore.this.a0.i(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), "2", 11, Convertitore.this.q0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.q0.q2().equals(Convertitore.this.q0.r2())) {
                            Convertitore.this.Z.j0(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.q0.q2(), Convertitore.this.q0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.q0.q2().isEmpty() && !Convertitore.this.q0.r2().isEmpty()) {
                            Convertitore.this.q0.t2().setText(Convertitore.this.q0.s2().getText().toString());
                        }
                        Convertitore.this.q0.s2().setText(Convertitore.this.a0.m(Convertitore.this.q0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.q0.t2().setText(Convertitore.this.a0.m(Convertitore.this.q0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.q0.s2();
                        textViewT2 = Convertitore.this.q0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 12:
                        Convertitore.this.a0.i(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), "2", 12, Convertitore.this.r0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.r0.q2().equals(Convertitore.this.r0.r2())) {
                            Convertitore.this.Z.a(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.r0.q2(), Convertitore.this.r0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.r0.q2().isEmpty() && !Convertitore.this.r0.r2().isEmpty()) {
                            Convertitore.this.r0.t2().setText(Convertitore.this.r0.s2().getText().toString());
                        }
                        Convertitore.this.r0.s2().setText(Convertitore.this.a0.m(Convertitore.this.r0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.r0.t2().setText(Convertitore.this.a0.m(Convertitore.this.r0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.r0.s2();
                        textViewT2 = Convertitore.this.r0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 13:
                        Convertitore.this.a0.i(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), "2", 13, Convertitore.this.s0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.s0.q2().equals(Convertitore.this.s0.r2())) {
                            Convertitore.this.Z.e(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.s0.q2(), Convertitore.this.s0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.s0.q2().isEmpty() && !Convertitore.this.s0.r2().isEmpty()) {
                            Convertitore.this.s0.t2().setText(Convertitore.this.s0.s2().getText().toString());
                        }
                        Convertitore.this.s0.s2().setText(Convertitore.this.a0.m(Convertitore.this.s0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.s0.t2().setText(Convertitore.this.a0.m(Convertitore.this.s0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.s0.s2();
                        textViewT2 = Convertitore.this.s0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 14:
                        Convertitore.this.a0.i(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), "2", 14, Convertitore.this.t0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.t0.q2().equals(Convertitore.this.t0.r2())) {
                            Convertitore.this.Z.c(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.t0.q2(), Convertitore.this.t0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.t0.q2().isEmpty() && !Convertitore.this.t0.r2().isEmpty()) {
                            Convertitore.this.t0.t2().setText(Convertitore.this.t0.s2().getText().toString());
                        }
                        Convertitore.this.t0.s2().setText(Convertitore.this.a0.m(Convertitore.this.t0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.t0.t2().setText(Convertitore.this.a0.m(Convertitore.this.t0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.t0.s2();
                        textViewT2 = Convertitore.this.t0.t2();
                        convertitore = Convertitore.this;
                        break;
                    default:
                        return;
                }
                uVar.o0(textViewS2, textViewT2, convertitore.getBaseContext());
            } catch (NullPointerException | NumberFormatException unused) {
                Toast.makeText(Convertitore.this.W, "error", 0).show();
            }
        }
    }

    class c implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        c(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.u uVar;
            TextView textViewS2;
            TextView textViewT2;
            Convertitore convertitore;
            if (Convertitore.this.P.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Convertitore.this.M.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Convertitore.this.M.vibrate(20L);
                }
            }
            try {
                switch (Convertitore.this.c0.getSelectedTabPosition()) {
                    case 0:
                        Convertitore.this.a0.i(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), "3", 0, Convertitore.this.f0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.f0.q2().equals(Convertitore.this.f0.r2())) {
                            Convertitore.this.Z.c0(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.f0.q2(), Convertitore.this.f0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.f0.q2().isEmpty() && !Convertitore.this.f0.r2().isEmpty()) {
                            Convertitore.this.f0.t2().setText(Convertitore.this.f0.s2().getText().toString());
                        }
                        Convertitore.this.f0.s2().setText(Convertitore.this.a0.m(Convertitore.this.f0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.f0.t2().setText(Convertitore.this.a0.m(Convertitore.this.f0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.f0.s2();
                        textViewT2 = Convertitore.this.f0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 1:
                        Convertitore.this.a0.i(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), "3", 1, Convertitore.this.g0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.g0.q2().equals(Convertitore.this.g0.r2())) {
                            Convertitore.this.Z.b(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.g0.q2(), Convertitore.this.g0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.g0.q2().isEmpty() && !Convertitore.this.g0.r2().isEmpty()) {
                            Convertitore.this.g0.t2().setText(Convertitore.this.g0.s2().getText().toString());
                        }
                        Convertitore.this.g0.s2().setText(Convertitore.this.a0.m(Convertitore.this.g0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.g0.t2().setText(Convertitore.this.a0.m(Convertitore.this.g0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.g0.s2();
                        textViewT2 = Convertitore.this.g0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 2:
                        Convertitore.this.a0.i(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), "3", 2, Convertitore.this.h0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.h0.q2().equals(Convertitore.this.h0.r2())) {
                            Convertitore.this.Z.l0(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.h0.q2(), Convertitore.this.h0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.h0.q2().isEmpty() && !Convertitore.this.h0.r2().isEmpty()) {
                            Convertitore.this.h0.t2().setText(Convertitore.this.h0.s2().getText().toString());
                        }
                        Convertitore.this.h0.s2().setText(Convertitore.this.a0.m(Convertitore.this.h0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.h0.t2().setText(Convertitore.this.a0.m(Convertitore.this.h0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.h0.s2();
                        textViewT2 = Convertitore.this.h0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 3:
                        Convertitore.this.a0.i(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), "3", 3, Convertitore.this.i0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.i0.q2().equals(Convertitore.this.i0.r2())) {
                            Convertitore.this.Z.d0(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.i0.q2(), Convertitore.this.i0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.i0.q2().isEmpty() && !Convertitore.this.i0.r2().isEmpty()) {
                            Convertitore.this.i0.t2().setText(Convertitore.this.i0.s2().getText().toString());
                        }
                        Convertitore.this.i0.s2().setText(Convertitore.this.a0.m(Convertitore.this.i0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.i0.t2().setText(Convertitore.this.a0.m(Convertitore.this.i0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.i0.s2();
                        textViewT2 = Convertitore.this.i0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 4:
                        Convertitore.this.a0.i(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), "3", 4, Convertitore.this.j0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.j0.q2().equals(Convertitore.this.j0.r2())) {
                            Convertitore.this.Z.f(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.j0.q2(), Convertitore.this.j0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.j0.q2().isEmpty() && !Convertitore.this.j0.r2().isEmpty()) {
                            Convertitore.this.j0.t2().setText(Convertitore.this.j0.s2().getText().toString());
                        }
                        Convertitore.this.j0.s2().setText(Convertitore.this.a0.m(Convertitore.this.j0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.j0.t2().setText(Convertitore.this.a0.m(Convertitore.this.j0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.j0.s2();
                        textViewT2 = Convertitore.this.j0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 5:
                        Convertitore.this.a0.i(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), "3", 5, Convertitore.this.k0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.k0.q2().equals(Convertitore.this.k0.r2())) {
                            Convertitore.this.Z.i0(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.k0.q2(), Convertitore.this.k0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.k0.q2().isEmpty() && !Convertitore.this.k0.r2().isEmpty()) {
                            Convertitore.this.k0.t2().setText(Convertitore.this.k0.s2().getText().toString());
                        }
                        Convertitore.this.k0.s2().setText(Convertitore.this.a0.m(Convertitore.this.k0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.k0.t2().setText(Convertitore.this.a0.m(Convertitore.this.k0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.k0.s2();
                        textViewT2 = Convertitore.this.k0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 6:
                        Convertitore.this.a0.i(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), "3", 6, Convertitore.this.l0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.l0.q2().equals(Convertitore.this.l0.r2())) {
                            Convertitore.this.Z.e0(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.l0.q2(), Convertitore.this.l0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.l0.q2().isEmpty() && !Convertitore.this.l0.r2().isEmpty()) {
                            Convertitore.this.l0.t2().setText(Convertitore.this.l0.s2().getText().toString());
                        }
                        Convertitore.this.l0.s2().setText(Convertitore.this.a0.m(Convertitore.this.l0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.l0.t2().setText(Convertitore.this.a0.m(Convertitore.this.l0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.l0.s2();
                        textViewT2 = Convertitore.this.l0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 7:
                        Convertitore.this.a0.i(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), "3", 7, Convertitore.this.m0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.m0.q2().equals(Convertitore.this.m0.r2())) {
                            Convertitore.this.Z.f0(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.m0.q2(), Convertitore.this.m0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.m0.q2().isEmpty() && !Convertitore.this.m0.r2().isEmpty()) {
                            Convertitore.this.m0.t2().setText(Convertitore.this.m0.s2().getText().toString());
                        }
                        Convertitore.this.m0.s2().setText(Convertitore.this.a0.m(Convertitore.this.m0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.m0.t2().setText(Convertitore.this.a0.m(Convertitore.this.m0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.m0.s2();
                        textViewT2 = Convertitore.this.m0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 8:
                        Convertitore.this.a0.i(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), "3", 8, Convertitore.this.n0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.n0.q2().equals(Convertitore.this.n0.r2())) {
                            Convertitore.this.Z.h(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.n0.q2(), Convertitore.this.n0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.n0.q2().isEmpty() && !Convertitore.this.n0.r2().isEmpty()) {
                            Convertitore.this.n0.t2().setText(Convertitore.this.n0.s2().getText().toString());
                        }
                        Convertitore.this.n0.s2().setText(Convertitore.this.a0.m(Convertitore.this.n0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.n0.t2().setText(Convertitore.this.a0.m(Convertitore.this.n0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.n0.s2();
                        textViewT2 = Convertitore.this.n0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 9:
                        Convertitore.this.a0.i(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), "3", 9, Convertitore.this.o0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.o0.q2().equals(Convertitore.this.o0.r2())) {
                            Convertitore.this.Z.g(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.o0.q2(), Convertitore.this.o0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.o0.q2().isEmpty() && !Convertitore.this.o0.r2().isEmpty()) {
                            Convertitore.this.o0.t2().setText(Convertitore.this.o0.s2().getText().toString());
                        }
                        Convertitore.this.o0.s2().setText(Convertitore.this.a0.m(Convertitore.this.o0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.o0.t2().setText(Convertitore.this.a0.m(Convertitore.this.o0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.o0.s2();
                        textViewT2 = Convertitore.this.o0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 10:
                        Convertitore.this.a0.i(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), "3", 10, Convertitore.this.p0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.p0.q2().equals(Convertitore.this.p0.r2())) {
                            Convertitore.this.Z.k0(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.p0.q2(), Convertitore.this.p0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.p0.q2().isEmpty() && !Convertitore.this.p0.r2().isEmpty()) {
                            Convertitore.this.p0.t2().setText(Convertitore.this.p0.s2().getText().toString());
                        }
                        Convertitore.this.p0.s2().setText(Convertitore.this.a0.m(Convertitore.this.p0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.p0.t2().setText(Convertitore.this.a0.m(Convertitore.this.p0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.p0.s2();
                        textViewT2 = Convertitore.this.p0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 11:
                        Convertitore.this.a0.i(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), "3", 11, Convertitore.this.q0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.q0.q2().equals(Convertitore.this.q0.r2())) {
                            Convertitore.this.Z.j0(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.q0.q2(), Convertitore.this.q0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.q0.q2().isEmpty() && !Convertitore.this.q0.r2().isEmpty()) {
                            Convertitore.this.q0.t2().setText(Convertitore.this.q0.s2().getText().toString());
                        }
                        Convertitore.this.q0.s2().setText(Convertitore.this.a0.m(Convertitore.this.q0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.q0.t2().setText(Convertitore.this.a0.m(Convertitore.this.q0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.q0.s2();
                        textViewT2 = Convertitore.this.q0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 12:
                        Convertitore.this.a0.i(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), "3", 12, Convertitore.this.r0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.r0.q2().equals(Convertitore.this.r0.r2())) {
                            Convertitore.this.Z.a(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.r0.q2(), Convertitore.this.r0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.r0.q2().isEmpty() && !Convertitore.this.r0.r2().isEmpty()) {
                            Convertitore.this.r0.t2().setText(Convertitore.this.r0.s2().getText().toString());
                        }
                        Convertitore.this.r0.s2().setText(Convertitore.this.a0.m(Convertitore.this.r0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.r0.t2().setText(Convertitore.this.a0.m(Convertitore.this.r0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.r0.s2();
                        textViewT2 = Convertitore.this.r0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 13:
                        Convertitore.this.a0.i(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), "3", 13, Convertitore.this.s0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.s0.q2().equals(Convertitore.this.s0.r2())) {
                            Convertitore.this.Z.e(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.s0.q2(), Convertitore.this.s0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.s0.q2().isEmpty() && !Convertitore.this.s0.r2().isEmpty()) {
                            Convertitore.this.s0.t2().setText(Convertitore.this.s0.s2().getText().toString());
                        }
                        Convertitore.this.s0.s2().setText(Convertitore.this.a0.m(Convertitore.this.s0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.s0.t2().setText(Convertitore.this.a0.m(Convertitore.this.s0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.s0.s2();
                        textViewT2 = Convertitore.this.s0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 14:
                        Convertitore.this.a0.i(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), "3", 14, Convertitore.this.t0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.t0.q2().equals(Convertitore.this.t0.r2())) {
                            Convertitore.this.Z.c(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.t0.q2(), Convertitore.this.t0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.t0.q2().isEmpty() && !Convertitore.this.t0.r2().isEmpty()) {
                            Convertitore.this.t0.t2().setText(Convertitore.this.t0.s2().getText().toString());
                        }
                        Convertitore.this.t0.s2().setText(Convertitore.this.a0.m(Convertitore.this.t0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.t0.t2().setText(Convertitore.this.a0.m(Convertitore.this.t0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.t0.s2();
                        textViewT2 = Convertitore.this.t0.t2();
                        convertitore = Convertitore.this;
                        break;
                    default:
                        return;
                }
                uVar.o0(textViewS2, textViewT2, convertitore.getBaseContext());
            } catch (NullPointerException | NumberFormatException unused) {
                Toast.makeText(Convertitore.this.W, "error", 0).show();
            }
        }
    }

    class d implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        d(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.u uVar;
            TextView textViewS2;
            TextView textViewT2;
            Convertitore convertitore;
            if (Convertitore.this.P.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Convertitore.this.M.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Convertitore.this.M.vibrate(20L);
                }
            }
            try {
                switch (Convertitore.this.c0.getSelectedTabPosition()) {
                    case 0:
                        Convertitore.this.a0.i(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), "4", 0, Convertitore.this.f0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.f0.q2().equals(Convertitore.this.f0.r2())) {
                            Convertitore.this.Z.c0(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.f0.q2(), Convertitore.this.f0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.f0.q2().isEmpty() && !Convertitore.this.f0.r2().isEmpty()) {
                            Convertitore.this.f0.t2().setText(Convertitore.this.f0.s2().getText().toString());
                        }
                        Convertitore.this.f0.s2().setText(Convertitore.this.a0.m(Convertitore.this.f0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.f0.t2().setText(Convertitore.this.a0.m(Convertitore.this.f0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.f0.s2();
                        textViewT2 = Convertitore.this.f0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 1:
                        Convertitore.this.a0.i(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), "4", 1, Convertitore.this.g0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.g0.q2().equals(Convertitore.this.g0.r2())) {
                            Convertitore.this.Z.b(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.g0.q2(), Convertitore.this.g0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.g0.q2().isEmpty() && !Convertitore.this.g0.r2().isEmpty()) {
                            Convertitore.this.g0.t2().setText(Convertitore.this.g0.s2().getText().toString());
                        }
                        Convertitore.this.g0.s2().setText(Convertitore.this.a0.m(Convertitore.this.g0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.g0.t2().setText(Convertitore.this.a0.m(Convertitore.this.g0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.g0.s2();
                        textViewT2 = Convertitore.this.g0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 2:
                        Convertitore.this.a0.i(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), "4", 2, Convertitore.this.h0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.h0.q2().equals(Convertitore.this.h0.r2())) {
                            Convertitore.this.Z.l0(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.h0.q2(), Convertitore.this.h0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.h0.q2().isEmpty() && !Convertitore.this.h0.r2().isEmpty()) {
                            Convertitore.this.h0.t2().setText(Convertitore.this.h0.s2().getText().toString());
                        }
                        Convertitore.this.h0.s2().setText(Convertitore.this.a0.m(Convertitore.this.h0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.h0.t2().setText(Convertitore.this.a0.m(Convertitore.this.h0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.h0.s2();
                        textViewT2 = Convertitore.this.h0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 3:
                        Convertitore.this.a0.i(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), "4", 3, Convertitore.this.i0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.i0.q2().equals(Convertitore.this.i0.r2())) {
                            Convertitore.this.Z.d0(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.i0.q2(), Convertitore.this.i0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.i0.q2().isEmpty() && !Convertitore.this.i0.r2().isEmpty()) {
                            Convertitore.this.i0.t2().setText(Convertitore.this.i0.s2().getText().toString());
                        }
                        Convertitore.this.i0.s2().setText(Convertitore.this.a0.m(Convertitore.this.i0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.i0.t2().setText(Convertitore.this.a0.m(Convertitore.this.i0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.i0.s2();
                        textViewT2 = Convertitore.this.i0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 4:
                        Convertitore.this.a0.i(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), "4", 4, Convertitore.this.j0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.j0.q2().equals(Convertitore.this.j0.r2())) {
                            Convertitore.this.Z.f(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.j0.q2(), Convertitore.this.j0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.j0.q2().isEmpty() && !Convertitore.this.j0.r2().isEmpty()) {
                            Convertitore.this.j0.t2().setText(Convertitore.this.j0.s2().getText().toString());
                        }
                        Convertitore.this.j0.s2().setText(Convertitore.this.a0.m(Convertitore.this.j0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.j0.t2().setText(Convertitore.this.a0.m(Convertitore.this.j0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.j0.s2();
                        textViewT2 = Convertitore.this.j0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 5:
                        Convertitore.this.a0.i(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), "4", 5, Convertitore.this.k0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.k0.q2().equals(Convertitore.this.k0.r2())) {
                            Convertitore.this.Z.i0(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.k0.q2(), Convertitore.this.k0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.k0.q2().isEmpty() && !Convertitore.this.k0.r2().isEmpty()) {
                            Convertitore.this.k0.t2().setText(Convertitore.this.k0.s2().getText().toString());
                        }
                        Convertitore.this.k0.s2().setText(Convertitore.this.a0.m(Convertitore.this.k0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.k0.t2().setText(Convertitore.this.a0.m(Convertitore.this.k0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.k0.s2();
                        textViewT2 = Convertitore.this.k0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 6:
                        Convertitore.this.a0.i(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), "4", 6, Convertitore.this.l0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.l0.q2().equals(Convertitore.this.l0.r2())) {
                            Convertitore.this.Z.e0(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.l0.q2(), Convertitore.this.l0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.l0.q2().isEmpty() && !Convertitore.this.l0.r2().isEmpty()) {
                            Convertitore.this.l0.t2().setText(Convertitore.this.l0.s2().getText().toString());
                        }
                        Convertitore.this.l0.s2().setText(Convertitore.this.a0.m(Convertitore.this.l0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.l0.t2().setText(Convertitore.this.a0.m(Convertitore.this.l0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.l0.s2();
                        textViewT2 = Convertitore.this.l0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 7:
                        Convertitore.this.a0.i(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), "4", 7, Convertitore.this.m0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.m0.q2().equals(Convertitore.this.m0.r2())) {
                            Convertitore.this.Z.f0(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.m0.q2(), Convertitore.this.m0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.m0.q2().isEmpty() && !Convertitore.this.m0.r2().isEmpty()) {
                            Convertitore.this.m0.t2().setText(Convertitore.this.m0.s2().getText().toString());
                        }
                        Convertitore.this.m0.s2().setText(Convertitore.this.a0.m(Convertitore.this.m0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.m0.t2().setText(Convertitore.this.a0.m(Convertitore.this.m0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.m0.s2();
                        textViewT2 = Convertitore.this.m0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 8:
                        Convertitore.this.a0.i(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), "4", 8, Convertitore.this.n0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.n0.q2().equals(Convertitore.this.n0.r2())) {
                            Convertitore.this.Z.h(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.n0.q2(), Convertitore.this.n0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.n0.q2().isEmpty() && !Convertitore.this.n0.r2().isEmpty()) {
                            Convertitore.this.n0.t2().setText(Convertitore.this.n0.s2().getText().toString());
                        }
                        Convertitore.this.n0.s2().setText(Convertitore.this.a0.m(Convertitore.this.n0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.n0.t2().setText(Convertitore.this.a0.m(Convertitore.this.n0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.n0.s2();
                        textViewT2 = Convertitore.this.n0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 9:
                        Convertitore.this.a0.i(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), "4", 9, Convertitore.this.o0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.o0.q2().equals(Convertitore.this.o0.r2())) {
                            Convertitore.this.Z.g(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.o0.q2(), Convertitore.this.o0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.o0.q2().isEmpty() && !Convertitore.this.o0.r2().isEmpty()) {
                            Convertitore.this.o0.t2().setText(Convertitore.this.o0.s2().getText().toString());
                        }
                        Convertitore.this.o0.s2().setText(Convertitore.this.a0.m(Convertitore.this.o0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.o0.t2().setText(Convertitore.this.a0.m(Convertitore.this.o0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.o0.s2();
                        textViewT2 = Convertitore.this.o0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 10:
                        Convertitore.this.a0.i(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), "4", 10, Convertitore.this.p0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.p0.q2().equals(Convertitore.this.p0.r2())) {
                            Convertitore.this.Z.k0(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.p0.q2(), Convertitore.this.p0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.p0.q2().isEmpty() && !Convertitore.this.p0.r2().isEmpty()) {
                            Convertitore.this.p0.t2().setText(Convertitore.this.p0.s2().getText().toString());
                        }
                        Convertitore.this.p0.s2().setText(Convertitore.this.a0.m(Convertitore.this.p0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.p0.t2().setText(Convertitore.this.a0.m(Convertitore.this.p0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.p0.s2();
                        textViewT2 = Convertitore.this.p0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 11:
                        Convertitore.this.a0.i(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), "4", 11, Convertitore.this.q0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.q0.q2().equals(Convertitore.this.q0.r2())) {
                            Convertitore.this.Z.j0(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.q0.q2(), Convertitore.this.q0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.q0.q2().isEmpty() && !Convertitore.this.q0.r2().isEmpty()) {
                            Convertitore.this.q0.t2().setText(Convertitore.this.q0.s2().getText().toString());
                        }
                        Convertitore.this.q0.s2().setText(Convertitore.this.a0.m(Convertitore.this.q0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.q0.t2().setText(Convertitore.this.a0.m(Convertitore.this.q0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.q0.s2();
                        textViewT2 = Convertitore.this.q0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 12:
                        Convertitore.this.a0.i(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), "4", 12, Convertitore.this.r0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.r0.q2().equals(Convertitore.this.r0.r2())) {
                            Convertitore.this.Z.a(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.r0.q2(), Convertitore.this.r0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.r0.q2().isEmpty() && !Convertitore.this.r0.r2().isEmpty()) {
                            Convertitore.this.r0.t2().setText(Convertitore.this.r0.s2().getText().toString());
                        }
                        Convertitore.this.r0.s2().setText(Convertitore.this.a0.m(Convertitore.this.r0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.r0.t2().setText(Convertitore.this.a0.m(Convertitore.this.r0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.r0.s2();
                        textViewT2 = Convertitore.this.r0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 13:
                        Convertitore.this.a0.i(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), "4", 13, Convertitore.this.s0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.s0.q2().equals(Convertitore.this.s0.r2())) {
                            Convertitore.this.Z.e(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.s0.q2(), Convertitore.this.s0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.s0.q2().isEmpty() && !Convertitore.this.s0.r2().isEmpty()) {
                            Convertitore.this.s0.t2().setText(Convertitore.this.s0.s2().getText().toString());
                        }
                        Convertitore.this.s0.s2().setText(Convertitore.this.a0.m(Convertitore.this.s0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.s0.t2().setText(Convertitore.this.a0.m(Convertitore.this.s0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.s0.s2();
                        textViewT2 = Convertitore.this.s0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 14:
                        Convertitore.this.a0.i(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), "4", 14, Convertitore.this.t0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.t0.q2().equals(Convertitore.this.t0.r2())) {
                            Convertitore.this.Z.c(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.t0.q2(), Convertitore.this.t0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.t0.q2().isEmpty() && !Convertitore.this.t0.r2().isEmpty()) {
                            Convertitore.this.t0.t2().setText(Convertitore.this.t0.s2().getText().toString());
                        }
                        Convertitore.this.t0.s2().setText(Convertitore.this.a0.m(Convertitore.this.t0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.t0.t2().setText(Convertitore.this.a0.m(Convertitore.this.t0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.t0.s2();
                        textViewT2 = Convertitore.this.t0.t2();
                        convertitore = Convertitore.this;
                        break;
                    default:
                        return;
                }
                uVar.o0(textViewS2, textViewT2, convertitore.getBaseContext());
            } catch (NullPointerException | NumberFormatException unused) {
                Toast.makeText(Convertitore.this.W, "error", 0).show();
            }
        }
    }

    class e implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        e(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.u uVar;
            TextView textViewS2;
            TextView textViewT2;
            Convertitore convertitore;
            if (Convertitore.this.P.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Convertitore.this.M.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Convertitore.this.M.vibrate(20L);
                }
            }
            try {
                switch (Convertitore.this.c0.getSelectedTabPosition()) {
                    case 0:
                        Convertitore.this.a0.i(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), "5", 0, Convertitore.this.f0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.f0.q2().equals(Convertitore.this.f0.r2())) {
                            Convertitore.this.Z.c0(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.f0.q2(), Convertitore.this.f0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.f0.q2().isEmpty() && !Convertitore.this.f0.r2().isEmpty()) {
                            Convertitore.this.f0.t2().setText(Convertitore.this.f0.s2().getText().toString());
                        }
                        Convertitore.this.f0.s2().setText(Convertitore.this.a0.m(Convertitore.this.f0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.f0.t2().setText(Convertitore.this.a0.m(Convertitore.this.f0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.f0.s2();
                        textViewT2 = Convertitore.this.f0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 1:
                        Convertitore.this.a0.i(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), "5", 1, Convertitore.this.g0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.g0.q2().equals(Convertitore.this.g0.r2())) {
                            Convertitore.this.Z.b(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.g0.q2(), Convertitore.this.g0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.g0.q2().isEmpty() && !Convertitore.this.g0.r2().isEmpty()) {
                            Convertitore.this.g0.t2().setText(Convertitore.this.g0.s2().getText().toString());
                        }
                        Convertitore.this.g0.s2().setText(Convertitore.this.a0.m(Convertitore.this.g0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.g0.t2().setText(Convertitore.this.a0.m(Convertitore.this.g0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.g0.s2();
                        textViewT2 = Convertitore.this.g0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 2:
                        Convertitore.this.a0.i(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), "5", 2, Convertitore.this.h0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.h0.q2().equals(Convertitore.this.h0.r2())) {
                            Convertitore.this.Z.l0(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.h0.q2(), Convertitore.this.h0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.h0.q2().isEmpty() && !Convertitore.this.h0.r2().isEmpty()) {
                            Convertitore.this.h0.t2().setText(Convertitore.this.h0.s2().getText().toString());
                        }
                        Convertitore.this.h0.s2().setText(Convertitore.this.a0.m(Convertitore.this.h0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.h0.t2().setText(Convertitore.this.a0.m(Convertitore.this.h0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.h0.s2();
                        textViewT2 = Convertitore.this.h0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 3:
                        Convertitore.this.a0.i(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), "5", 3, Convertitore.this.i0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.i0.q2().equals(Convertitore.this.i0.r2())) {
                            Convertitore.this.Z.d0(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.i0.q2(), Convertitore.this.i0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.i0.q2().isEmpty() && !Convertitore.this.i0.r2().isEmpty()) {
                            Convertitore.this.i0.t2().setText(Convertitore.this.i0.s2().getText().toString());
                        }
                        Convertitore.this.i0.s2().setText(Convertitore.this.a0.m(Convertitore.this.i0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.i0.t2().setText(Convertitore.this.a0.m(Convertitore.this.i0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.i0.s2();
                        textViewT2 = Convertitore.this.i0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 4:
                        Convertitore.this.a0.i(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), "5", 4, Convertitore.this.j0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.j0.q2().equals(Convertitore.this.j0.r2())) {
                            Convertitore.this.Z.f(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.j0.q2(), Convertitore.this.j0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.j0.q2().isEmpty() && !Convertitore.this.j0.r2().isEmpty()) {
                            Convertitore.this.j0.t2().setText(Convertitore.this.j0.s2().getText().toString());
                        }
                        Convertitore.this.j0.s2().setText(Convertitore.this.a0.m(Convertitore.this.j0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.j0.t2().setText(Convertitore.this.a0.m(Convertitore.this.j0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.j0.s2();
                        textViewT2 = Convertitore.this.j0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 5:
                        Convertitore.this.a0.i(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), "5", 5, Convertitore.this.k0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.k0.q2().equals(Convertitore.this.k0.r2())) {
                            Convertitore.this.Z.i0(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.k0.q2(), Convertitore.this.k0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.k0.q2().isEmpty() && !Convertitore.this.k0.r2().isEmpty()) {
                            Convertitore.this.k0.t2().setText(Convertitore.this.k0.s2().getText().toString());
                        }
                        Convertitore.this.k0.s2().setText(Convertitore.this.a0.m(Convertitore.this.k0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.k0.t2().setText(Convertitore.this.a0.m(Convertitore.this.k0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.k0.s2();
                        textViewT2 = Convertitore.this.k0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 6:
                        Convertitore.this.a0.i(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), "5", 6, Convertitore.this.l0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.l0.q2().equals(Convertitore.this.l0.r2())) {
                            Convertitore.this.Z.e0(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.l0.q2(), Convertitore.this.l0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.l0.q2().isEmpty() && !Convertitore.this.l0.r2().isEmpty()) {
                            Convertitore.this.l0.t2().setText(Convertitore.this.l0.s2().getText().toString());
                        }
                        Convertitore.this.l0.s2().setText(Convertitore.this.a0.m(Convertitore.this.l0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.l0.t2().setText(Convertitore.this.a0.m(Convertitore.this.l0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.l0.s2();
                        textViewT2 = Convertitore.this.l0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 7:
                        Convertitore.this.a0.i(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), "5", 7, Convertitore.this.m0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.m0.q2().equals(Convertitore.this.m0.r2())) {
                            Convertitore.this.Z.f0(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.m0.q2(), Convertitore.this.m0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.m0.q2().isEmpty() && !Convertitore.this.m0.r2().isEmpty()) {
                            Convertitore.this.m0.t2().setText(Convertitore.this.m0.s2().getText().toString());
                        }
                        Convertitore.this.m0.s2().setText(Convertitore.this.a0.m(Convertitore.this.m0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.m0.t2().setText(Convertitore.this.a0.m(Convertitore.this.m0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.m0.s2();
                        textViewT2 = Convertitore.this.m0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 8:
                        Convertitore.this.a0.i(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), "5", 8, Convertitore.this.n0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.n0.q2().equals(Convertitore.this.n0.r2())) {
                            Convertitore.this.Z.h(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.n0.q2(), Convertitore.this.n0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.n0.q2().isEmpty() && !Convertitore.this.n0.r2().isEmpty()) {
                            Convertitore.this.n0.t2().setText(Convertitore.this.n0.s2().getText().toString());
                        }
                        Convertitore.this.n0.s2().setText(Convertitore.this.a0.m(Convertitore.this.n0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.n0.t2().setText(Convertitore.this.a0.m(Convertitore.this.n0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.n0.s2();
                        textViewT2 = Convertitore.this.n0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 9:
                        Convertitore.this.a0.i(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), "5", 9, Convertitore.this.o0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.o0.q2().equals(Convertitore.this.o0.r2())) {
                            Convertitore.this.Z.g(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.o0.q2(), Convertitore.this.o0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.o0.q2().isEmpty() && !Convertitore.this.o0.r2().isEmpty()) {
                            Convertitore.this.o0.t2().setText(Convertitore.this.o0.s2().getText().toString());
                        }
                        Convertitore.this.o0.s2().setText(Convertitore.this.a0.m(Convertitore.this.o0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.o0.t2().setText(Convertitore.this.a0.m(Convertitore.this.o0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.o0.s2();
                        textViewT2 = Convertitore.this.o0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 10:
                        Convertitore.this.a0.i(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), "5", 10, Convertitore.this.p0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.p0.q2().equals(Convertitore.this.p0.r2())) {
                            Convertitore.this.Z.k0(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.p0.q2(), Convertitore.this.p0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.p0.q2().isEmpty() && !Convertitore.this.p0.r2().isEmpty()) {
                            Convertitore.this.p0.t2().setText(Convertitore.this.p0.s2().getText().toString());
                        }
                        Convertitore.this.p0.s2().setText(Convertitore.this.a0.m(Convertitore.this.p0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.p0.t2().setText(Convertitore.this.a0.m(Convertitore.this.p0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.p0.s2();
                        textViewT2 = Convertitore.this.p0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 11:
                        Convertitore.this.a0.i(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), "5", 11, Convertitore.this.q0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.q0.q2().equals(Convertitore.this.q0.r2())) {
                            Convertitore.this.Z.j0(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.q0.q2(), Convertitore.this.q0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.q0.q2().isEmpty() && !Convertitore.this.q0.r2().isEmpty()) {
                            Convertitore.this.q0.t2().setText(Convertitore.this.q0.s2().getText().toString());
                        }
                        Convertitore.this.q0.s2().setText(Convertitore.this.a0.m(Convertitore.this.q0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.q0.t2().setText(Convertitore.this.a0.m(Convertitore.this.q0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.q0.s2();
                        textViewT2 = Convertitore.this.q0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 12:
                        Convertitore.this.a0.i(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), "5", 12, Convertitore.this.r0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.r0.q2().equals(Convertitore.this.r0.r2())) {
                            Convertitore.this.Z.a(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.r0.q2(), Convertitore.this.r0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.r0.q2().isEmpty() && !Convertitore.this.r0.r2().isEmpty()) {
                            Convertitore.this.r0.t2().setText(Convertitore.this.r0.s2().getText().toString());
                        }
                        Convertitore.this.r0.s2().setText(Convertitore.this.a0.m(Convertitore.this.r0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.r0.t2().setText(Convertitore.this.a0.m(Convertitore.this.r0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.r0.s2();
                        textViewT2 = Convertitore.this.r0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 13:
                        Convertitore.this.a0.i(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), "5", 13, Convertitore.this.s0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.s0.q2().equals(Convertitore.this.s0.r2())) {
                            Convertitore.this.Z.e(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.s0.q2(), Convertitore.this.s0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.s0.q2().isEmpty() && !Convertitore.this.s0.r2().isEmpty()) {
                            Convertitore.this.s0.t2().setText(Convertitore.this.s0.s2().getText().toString());
                        }
                        Convertitore.this.s0.s2().setText(Convertitore.this.a0.m(Convertitore.this.s0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.s0.t2().setText(Convertitore.this.a0.m(Convertitore.this.s0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.s0.s2();
                        textViewT2 = Convertitore.this.s0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 14:
                        Convertitore.this.a0.i(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), "5", 14, Convertitore.this.t0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.t0.q2().equals(Convertitore.this.t0.r2())) {
                            Convertitore.this.Z.c(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.t0.q2(), Convertitore.this.t0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.t0.q2().isEmpty() && !Convertitore.this.t0.r2().isEmpty()) {
                            Convertitore.this.t0.t2().setText(Convertitore.this.t0.s2().getText().toString());
                        }
                        Convertitore.this.t0.s2().setText(Convertitore.this.a0.m(Convertitore.this.t0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.t0.t2().setText(Convertitore.this.a0.m(Convertitore.this.t0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.t0.s2();
                        textViewT2 = Convertitore.this.t0.t2();
                        convertitore = Convertitore.this;
                        break;
                    default:
                        return;
                }
                uVar.o0(textViewS2, textViewT2, convertitore.getBaseContext());
            } catch (NullPointerException | NumberFormatException unused) {
                Toast.makeText(Convertitore.this.W, "error", 0).show();
            }
        }
    }

    class f implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        f(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.u uVar;
            TextView textViewS2;
            TextView textViewT2;
            Convertitore convertitore;
            if (Convertitore.this.P.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Convertitore.this.M.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Convertitore.this.M.vibrate(20L);
                }
            }
            try {
                switch (Convertitore.this.c0.getSelectedTabPosition()) {
                    case 0:
                        Convertitore.this.a0.i(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), "6", 0, Convertitore.this.f0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.f0.q2().equals(Convertitore.this.f0.r2())) {
                            Convertitore.this.Z.c0(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.f0.q2(), Convertitore.this.f0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.f0.q2().isEmpty() && !Convertitore.this.f0.r2().isEmpty()) {
                            Convertitore.this.f0.t2().setText(Convertitore.this.f0.s2().getText().toString());
                        }
                        Convertitore.this.f0.s2().setText(Convertitore.this.a0.m(Convertitore.this.f0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.f0.t2().setText(Convertitore.this.a0.m(Convertitore.this.f0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.f0.s2();
                        textViewT2 = Convertitore.this.f0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 1:
                        Convertitore.this.a0.i(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), "6", 1, Convertitore.this.g0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.g0.q2().equals(Convertitore.this.g0.r2())) {
                            Convertitore.this.Z.b(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.g0.q2(), Convertitore.this.g0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.g0.q2().isEmpty() && !Convertitore.this.g0.r2().isEmpty()) {
                            Convertitore.this.g0.t2().setText(Convertitore.this.g0.s2().getText().toString());
                        }
                        Convertitore.this.g0.s2().setText(Convertitore.this.a0.m(Convertitore.this.g0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.g0.t2().setText(Convertitore.this.a0.m(Convertitore.this.g0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.g0.s2();
                        textViewT2 = Convertitore.this.g0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 2:
                        Convertitore.this.a0.i(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), "6", 2, Convertitore.this.h0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.h0.q2().equals(Convertitore.this.h0.r2())) {
                            Convertitore.this.Z.l0(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.h0.q2(), Convertitore.this.h0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.h0.q2().isEmpty() && !Convertitore.this.h0.r2().isEmpty()) {
                            Convertitore.this.h0.t2().setText(Convertitore.this.h0.s2().getText().toString());
                        }
                        Convertitore.this.h0.s2().setText(Convertitore.this.a0.m(Convertitore.this.h0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.h0.t2().setText(Convertitore.this.a0.m(Convertitore.this.h0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.h0.s2();
                        textViewT2 = Convertitore.this.h0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 3:
                        Convertitore.this.a0.i(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), "6", 3, Convertitore.this.i0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.i0.q2().equals(Convertitore.this.i0.r2())) {
                            Convertitore.this.Z.d0(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.i0.q2(), Convertitore.this.i0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.i0.q2().isEmpty() && !Convertitore.this.i0.r2().isEmpty()) {
                            Convertitore.this.i0.t2().setText(Convertitore.this.i0.s2().getText().toString());
                        }
                        Convertitore.this.i0.s2().setText(Convertitore.this.a0.m(Convertitore.this.i0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.i0.t2().setText(Convertitore.this.a0.m(Convertitore.this.i0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.i0.s2();
                        textViewT2 = Convertitore.this.i0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 4:
                        Convertitore.this.a0.i(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), "6", 4, Convertitore.this.j0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.j0.q2().equals(Convertitore.this.j0.r2())) {
                            Convertitore.this.Z.f(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.j0.q2(), Convertitore.this.j0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.j0.q2().isEmpty() && !Convertitore.this.j0.r2().isEmpty()) {
                            Convertitore.this.j0.t2().setText(Convertitore.this.j0.s2().getText().toString());
                        }
                        Convertitore.this.j0.s2().setText(Convertitore.this.a0.m(Convertitore.this.j0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.j0.t2().setText(Convertitore.this.a0.m(Convertitore.this.j0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.j0.s2();
                        textViewT2 = Convertitore.this.j0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 5:
                        Convertitore.this.a0.i(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), "6", 5, Convertitore.this.k0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.k0.q2().equals(Convertitore.this.k0.r2())) {
                            Convertitore.this.Z.i0(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.k0.q2(), Convertitore.this.k0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.k0.q2().isEmpty() && !Convertitore.this.k0.r2().isEmpty()) {
                            Convertitore.this.k0.t2().setText(Convertitore.this.k0.s2().getText().toString());
                        }
                        Convertitore.this.k0.s2().setText(Convertitore.this.a0.m(Convertitore.this.k0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.k0.t2().setText(Convertitore.this.a0.m(Convertitore.this.k0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.k0.s2();
                        textViewT2 = Convertitore.this.k0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 6:
                        Convertitore.this.a0.i(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), "6", 6, Convertitore.this.l0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.l0.q2().equals(Convertitore.this.l0.r2())) {
                            Convertitore.this.Z.e0(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.l0.q2(), Convertitore.this.l0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.l0.q2().isEmpty() && !Convertitore.this.l0.r2().isEmpty()) {
                            Convertitore.this.l0.t2().setText(Convertitore.this.l0.s2().getText().toString());
                        }
                        Convertitore.this.l0.s2().setText(Convertitore.this.a0.m(Convertitore.this.l0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.l0.t2().setText(Convertitore.this.a0.m(Convertitore.this.l0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.l0.s2();
                        textViewT2 = Convertitore.this.l0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 7:
                        Convertitore.this.a0.i(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), "6", 7, Convertitore.this.m0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.m0.q2().equals(Convertitore.this.m0.r2())) {
                            Convertitore.this.Z.f0(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.m0.q2(), Convertitore.this.m0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.m0.q2().isEmpty() && !Convertitore.this.m0.r2().isEmpty()) {
                            Convertitore.this.m0.t2().setText(Convertitore.this.m0.s2().getText().toString());
                        }
                        Convertitore.this.m0.s2().setText(Convertitore.this.a0.m(Convertitore.this.m0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.m0.t2().setText(Convertitore.this.a0.m(Convertitore.this.m0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.m0.s2();
                        textViewT2 = Convertitore.this.m0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 8:
                        Convertitore.this.a0.i(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), "6", 8, Convertitore.this.n0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.n0.q2().equals(Convertitore.this.n0.r2())) {
                            Convertitore.this.Z.h(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.n0.q2(), Convertitore.this.n0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.n0.q2().isEmpty() && !Convertitore.this.n0.r2().isEmpty()) {
                            Convertitore.this.n0.t2().setText(Convertitore.this.n0.s2().getText().toString());
                        }
                        Convertitore.this.n0.s2().setText(Convertitore.this.a0.m(Convertitore.this.n0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.n0.t2().setText(Convertitore.this.a0.m(Convertitore.this.n0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.n0.s2();
                        textViewT2 = Convertitore.this.n0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 9:
                        Convertitore.this.a0.i(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), "6", 9, Convertitore.this.o0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.o0.q2().equals(Convertitore.this.o0.r2())) {
                            Convertitore.this.Z.g(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.o0.q2(), Convertitore.this.o0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.o0.q2().isEmpty() && !Convertitore.this.o0.r2().isEmpty()) {
                            Convertitore.this.o0.t2().setText(Convertitore.this.o0.s2().getText().toString());
                        }
                        Convertitore.this.o0.s2().setText(Convertitore.this.a0.m(Convertitore.this.o0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.o0.t2().setText(Convertitore.this.a0.m(Convertitore.this.o0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.o0.s2();
                        textViewT2 = Convertitore.this.o0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 10:
                        Convertitore.this.a0.i(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), "6", 10, Convertitore.this.p0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.p0.q2().equals(Convertitore.this.p0.r2())) {
                            Convertitore.this.Z.k0(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.p0.q2(), Convertitore.this.p0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.p0.q2().isEmpty() && !Convertitore.this.p0.r2().isEmpty()) {
                            Convertitore.this.p0.t2().setText(Convertitore.this.p0.s2().getText().toString());
                        }
                        Convertitore.this.p0.s2().setText(Convertitore.this.a0.m(Convertitore.this.p0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.p0.t2().setText(Convertitore.this.a0.m(Convertitore.this.p0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.p0.s2();
                        textViewT2 = Convertitore.this.p0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 11:
                        Convertitore.this.a0.i(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), "6", 11, Convertitore.this.q0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.q0.q2().equals(Convertitore.this.q0.r2())) {
                            Convertitore.this.Z.j0(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.q0.q2(), Convertitore.this.q0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.q0.q2().isEmpty() && !Convertitore.this.q0.r2().isEmpty()) {
                            Convertitore.this.q0.t2().setText(Convertitore.this.q0.s2().getText().toString());
                        }
                        Convertitore.this.q0.s2().setText(Convertitore.this.a0.m(Convertitore.this.q0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.q0.t2().setText(Convertitore.this.a0.m(Convertitore.this.q0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.q0.s2();
                        textViewT2 = Convertitore.this.q0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 12:
                        Convertitore.this.a0.i(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), "6", 12, Convertitore.this.r0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.r0.q2().equals(Convertitore.this.r0.r2())) {
                            Convertitore.this.Z.a(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.r0.q2(), Convertitore.this.r0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.r0.q2().isEmpty() && !Convertitore.this.r0.r2().isEmpty()) {
                            Convertitore.this.r0.t2().setText(Convertitore.this.r0.s2().getText().toString());
                        }
                        Convertitore.this.r0.s2().setText(Convertitore.this.a0.m(Convertitore.this.r0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.r0.t2().setText(Convertitore.this.a0.m(Convertitore.this.r0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.r0.s2();
                        textViewT2 = Convertitore.this.r0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 13:
                        Convertitore.this.a0.i(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), "6", 13, Convertitore.this.s0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.s0.q2().equals(Convertitore.this.s0.r2())) {
                            Convertitore.this.Z.e(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.s0.q2(), Convertitore.this.s0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.s0.q2().isEmpty() && !Convertitore.this.s0.r2().isEmpty()) {
                            Convertitore.this.s0.t2().setText(Convertitore.this.s0.s2().getText().toString());
                        }
                        Convertitore.this.s0.s2().setText(Convertitore.this.a0.m(Convertitore.this.s0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.s0.t2().setText(Convertitore.this.a0.m(Convertitore.this.s0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.s0.s2();
                        textViewT2 = Convertitore.this.s0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 14:
                        Convertitore.this.a0.i(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), "6", 14, Convertitore.this.t0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.t0.q2().equals(Convertitore.this.t0.r2())) {
                            Convertitore.this.Z.c(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.t0.q2(), Convertitore.this.t0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.t0.q2().isEmpty() && !Convertitore.this.t0.r2().isEmpty()) {
                            Convertitore.this.t0.t2().setText(Convertitore.this.t0.s2().getText().toString());
                        }
                        Convertitore.this.t0.s2().setText(Convertitore.this.a0.m(Convertitore.this.t0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.t0.t2().setText(Convertitore.this.a0.m(Convertitore.this.t0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.t0.s2();
                        textViewT2 = Convertitore.this.t0.t2();
                        convertitore = Convertitore.this;
                        break;
                    default:
                        return;
                }
                uVar.o0(textViewS2, textViewT2, convertitore.getBaseContext());
            } catch (NullPointerException | NumberFormatException unused) {
                Toast.makeText(Convertitore.this.W, "error", 0).show();
            }
        }
    }

    class g implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        g(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.u uVar;
            TextView textViewS2;
            TextView textViewT2;
            Convertitore convertitore;
            if (Convertitore.this.P.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Convertitore.this.M.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Convertitore.this.M.vibrate(20L);
                }
            }
            try {
                switch (Convertitore.this.c0.getSelectedTabPosition()) {
                    case 0:
                        Convertitore.this.a0.i(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), "7", 0, Convertitore.this.f0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.f0.q2().equals(Convertitore.this.f0.r2())) {
                            Convertitore.this.Z.c0(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.f0.q2(), Convertitore.this.f0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.f0.q2().isEmpty() && !Convertitore.this.f0.r2().isEmpty()) {
                            Convertitore.this.f0.t2().setText(Convertitore.this.f0.s2().getText().toString());
                        }
                        Convertitore.this.f0.s2().setText(Convertitore.this.a0.m(Convertitore.this.f0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.f0.t2().setText(Convertitore.this.a0.m(Convertitore.this.f0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.f0.s2();
                        textViewT2 = Convertitore.this.f0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 1:
                        Convertitore.this.a0.i(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), "7", 1, Convertitore.this.g0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.g0.q2().equals(Convertitore.this.g0.r2())) {
                            Convertitore.this.Z.b(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.g0.q2(), Convertitore.this.g0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.g0.q2().isEmpty() && !Convertitore.this.g0.r2().isEmpty()) {
                            Convertitore.this.g0.t2().setText(Convertitore.this.g0.s2().getText().toString());
                        }
                        Convertitore.this.g0.s2().setText(Convertitore.this.a0.m(Convertitore.this.g0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.g0.t2().setText(Convertitore.this.a0.m(Convertitore.this.g0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.g0.s2();
                        textViewT2 = Convertitore.this.g0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 2:
                        Convertitore.this.a0.i(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), "7", 2, Convertitore.this.h0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.h0.q2().equals(Convertitore.this.h0.r2())) {
                            Convertitore.this.Z.l0(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.h0.q2(), Convertitore.this.h0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.h0.q2().isEmpty() && !Convertitore.this.h0.r2().isEmpty()) {
                            Convertitore.this.h0.t2().setText(Convertitore.this.h0.s2().getText().toString());
                        }
                        Convertitore.this.h0.s2().setText(Convertitore.this.a0.m(Convertitore.this.h0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.h0.t2().setText(Convertitore.this.a0.m(Convertitore.this.h0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.h0.s2();
                        textViewT2 = Convertitore.this.h0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 3:
                        Convertitore.this.a0.i(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), "7", 3, Convertitore.this.i0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.i0.q2().equals(Convertitore.this.i0.r2())) {
                            Convertitore.this.Z.d0(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.i0.q2(), Convertitore.this.i0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.i0.q2().isEmpty() && !Convertitore.this.i0.r2().isEmpty()) {
                            Convertitore.this.i0.t2().setText(Convertitore.this.i0.s2().getText().toString());
                        }
                        Convertitore.this.i0.s2().setText(Convertitore.this.a0.m(Convertitore.this.i0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.i0.t2().setText(Convertitore.this.a0.m(Convertitore.this.i0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.i0.s2();
                        textViewT2 = Convertitore.this.i0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 4:
                        Convertitore.this.a0.i(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), "7", 4, Convertitore.this.j0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.j0.q2().equals(Convertitore.this.j0.r2())) {
                            Convertitore.this.Z.f(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.j0.q2(), Convertitore.this.j0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.j0.q2().isEmpty() && !Convertitore.this.j0.r2().isEmpty()) {
                            Convertitore.this.j0.t2().setText(Convertitore.this.j0.s2().getText().toString());
                        }
                        Convertitore.this.j0.s2().setText(Convertitore.this.a0.m(Convertitore.this.j0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.j0.t2().setText(Convertitore.this.a0.m(Convertitore.this.j0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.j0.s2();
                        textViewT2 = Convertitore.this.j0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 5:
                        Convertitore.this.a0.i(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), "7", 5, Convertitore.this.k0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.k0.q2().equals(Convertitore.this.k0.r2())) {
                            Convertitore.this.Z.i0(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.k0.q2(), Convertitore.this.k0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.k0.q2().isEmpty() && !Convertitore.this.k0.r2().isEmpty()) {
                            Convertitore.this.k0.t2().setText(Convertitore.this.k0.s2().getText().toString());
                        }
                        Convertitore.this.k0.s2().setText(Convertitore.this.a0.m(Convertitore.this.k0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.k0.t2().setText(Convertitore.this.a0.m(Convertitore.this.k0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.k0.s2();
                        textViewT2 = Convertitore.this.k0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 6:
                        Convertitore.this.a0.i(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), "7", 6, Convertitore.this.l0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.l0.q2().equals(Convertitore.this.l0.r2())) {
                            Convertitore.this.Z.e0(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.l0.q2(), Convertitore.this.l0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.l0.q2().isEmpty() && !Convertitore.this.l0.r2().isEmpty()) {
                            Convertitore.this.l0.t2().setText(Convertitore.this.l0.s2().getText().toString());
                        }
                        Convertitore.this.l0.s2().setText(Convertitore.this.a0.m(Convertitore.this.l0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.l0.t2().setText(Convertitore.this.a0.m(Convertitore.this.l0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.l0.s2();
                        textViewT2 = Convertitore.this.l0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 7:
                        Convertitore.this.a0.i(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), "7", 7, Convertitore.this.m0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.m0.q2().equals(Convertitore.this.m0.r2())) {
                            Convertitore.this.Z.f0(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.m0.q2(), Convertitore.this.m0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.m0.q2().isEmpty() && !Convertitore.this.m0.r2().isEmpty()) {
                            Convertitore.this.m0.t2().setText(Convertitore.this.m0.s2().getText().toString());
                        }
                        Convertitore.this.m0.s2().setText(Convertitore.this.a0.m(Convertitore.this.m0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.m0.t2().setText(Convertitore.this.a0.m(Convertitore.this.m0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.m0.s2();
                        textViewT2 = Convertitore.this.m0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 8:
                        Convertitore.this.a0.i(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), "7", 8, Convertitore.this.n0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.n0.q2().equals(Convertitore.this.n0.r2())) {
                            Convertitore.this.Z.h(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.n0.q2(), Convertitore.this.n0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.n0.q2().isEmpty() && !Convertitore.this.n0.r2().isEmpty()) {
                            Convertitore.this.n0.t2().setText(Convertitore.this.n0.s2().getText().toString());
                        }
                        Convertitore.this.n0.s2().setText(Convertitore.this.a0.m(Convertitore.this.n0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.n0.t2().setText(Convertitore.this.a0.m(Convertitore.this.n0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.n0.s2();
                        textViewT2 = Convertitore.this.n0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 9:
                        Convertitore.this.a0.i(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), "7", 9, Convertitore.this.o0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.o0.q2().equals(Convertitore.this.o0.r2())) {
                            Convertitore.this.Z.g(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.o0.q2(), Convertitore.this.o0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.o0.q2().isEmpty() && !Convertitore.this.o0.r2().isEmpty()) {
                            Convertitore.this.o0.t2().setText(Convertitore.this.o0.s2().getText().toString());
                        }
                        Convertitore.this.o0.s2().setText(Convertitore.this.a0.m(Convertitore.this.o0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.o0.t2().setText(Convertitore.this.a0.m(Convertitore.this.o0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.o0.s2();
                        textViewT2 = Convertitore.this.o0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 10:
                        Convertitore.this.a0.i(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), "7", 10, Convertitore.this.p0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.p0.q2().equals(Convertitore.this.p0.r2())) {
                            Convertitore.this.Z.k0(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.p0.q2(), Convertitore.this.p0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.p0.q2().isEmpty() && !Convertitore.this.p0.r2().isEmpty()) {
                            Convertitore.this.p0.t2().setText(Convertitore.this.p0.s2().getText().toString());
                        }
                        Convertitore.this.p0.s2().setText(Convertitore.this.a0.m(Convertitore.this.p0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.p0.t2().setText(Convertitore.this.a0.m(Convertitore.this.p0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.p0.s2();
                        textViewT2 = Convertitore.this.p0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 11:
                        Convertitore.this.a0.i(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), "7", 11, Convertitore.this.q0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.q0.q2().equals(Convertitore.this.q0.r2())) {
                            Convertitore.this.Z.j0(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.q0.q2(), Convertitore.this.q0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.q0.q2().isEmpty() && !Convertitore.this.q0.r2().isEmpty()) {
                            Convertitore.this.q0.t2().setText(Convertitore.this.q0.s2().getText().toString());
                        }
                        Convertitore.this.q0.s2().setText(Convertitore.this.a0.m(Convertitore.this.q0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.q0.t2().setText(Convertitore.this.a0.m(Convertitore.this.q0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.q0.s2();
                        textViewT2 = Convertitore.this.q0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 12:
                        Convertitore.this.a0.i(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), "7", 12, Convertitore.this.r0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.r0.q2().equals(Convertitore.this.r0.r2())) {
                            Convertitore.this.Z.a(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.r0.q2(), Convertitore.this.r0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.r0.q2().isEmpty() && !Convertitore.this.r0.r2().isEmpty()) {
                            Convertitore.this.r0.t2().setText(Convertitore.this.r0.s2().getText().toString());
                        }
                        Convertitore.this.r0.s2().setText(Convertitore.this.a0.m(Convertitore.this.r0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.r0.t2().setText(Convertitore.this.a0.m(Convertitore.this.r0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.r0.s2();
                        textViewT2 = Convertitore.this.r0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 13:
                        Convertitore.this.a0.i(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), "7", 13, Convertitore.this.s0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.s0.q2().equals(Convertitore.this.s0.r2())) {
                            Convertitore.this.Z.e(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.s0.q2(), Convertitore.this.s0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.s0.q2().isEmpty() && !Convertitore.this.s0.r2().isEmpty()) {
                            Convertitore.this.s0.t2().setText(Convertitore.this.s0.s2().getText().toString());
                        }
                        Convertitore.this.s0.s2().setText(Convertitore.this.a0.m(Convertitore.this.s0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.s0.t2().setText(Convertitore.this.a0.m(Convertitore.this.s0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.s0.s2();
                        textViewT2 = Convertitore.this.s0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 14:
                        Convertitore.this.a0.i(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), "7", 14, Convertitore.this.t0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.t0.q2().equals(Convertitore.this.t0.r2())) {
                            Convertitore.this.Z.c(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.t0.q2(), Convertitore.this.t0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.t0.q2().isEmpty() && !Convertitore.this.t0.r2().isEmpty()) {
                            Convertitore.this.t0.t2().setText(Convertitore.this.t0.s2().getText().toString());
                        }
                        Convertitore.this.t0.s2().setText(Convertitore.this.a0.m(Convertitore.this.t0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.t0.t2().setText(Convertitore.this.a0.m(Convertitore.this.t0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.t0.s2();
                        textViewT2 = Convertitore.this.t0.t2();
                        convertitore = Convertitore.this;
                        break;
                    default:
                        return;
                }
                uVar.o0(textViewS2, textViewT2, convertitore.getBaseContext());
            } catch (NullPointerException | NumberFormatException unused) {
                Toast.makeText(Convertitore.this.W, "error", 0).show();
            }
        }
    }

    class h implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        h(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.u uVar;
            TextView textViewS2;
            TextView textViewT2;
            Convertitore convertitore;
            if (Convertitore.this.P.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Convertitore.this.M.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Convertitore.this.M.vibrate(20L);
                }
            }
            try {
                switch (Convertitore.this.c0.getSelectedTabPosition()) {
                    case 0:
                        Convertitore.this.a0.i(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), "8", 0, Convertitore.this.f0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.f0.q2().equals(Convertitore.this.f0.r2())) {
                            Convertitore.this.Z.c0(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.f0.q2(), Convertitore.this.f0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.f0.q2().isEmpty() && !Convertitore.this.f0.r2().isEmpty()) {
                            Convertitore.this.f0.t2().setText(Convertitore.this.f0.s2().getText().toString());
                        }
                        Convertitore.this.f0.s2().setText(Convertitore.this.a0.m(Convertitore.this.f0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.f0.t2().setText(Convertitore.this.a0.m(Convertitore.this.f0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.f0.s2();
                        textViewT2 = Convertitore.this.f0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 1:
                        Convertitore.this.a0.i(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), "8", 1, Convertitore.this.g0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.g0.q2().equals(Convertitore.this.g0.r2())) {
                            Convertitore.this.Z.b(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.g0.q2(), Convertitore.this.g0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.g0.q2().isEmpty() && !Convertitore.this.g0.r2().isEmpty()) {
                            Convertitore.this.g0.t2().setText(Convertitore.this.g0.s2().getText().toString());
                        }
                        Convertitore.this.g0.s2().setText(Convertitore.this.a0.m(Convertitore.this.g0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.g0.t2().setText(Convertitore.this.a0.m(Convertitore.this.g0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.g0.s2();
                        textViewT2 = Convertitore.this.g0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 2:
                        Convertitore.this.a0.i(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), "8", 2, Convertitore.this.h0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.h0.q2().equals(Convertitore.this.h0.r2())) {
                            Convertitore.this.Z.l0(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.h0.q2(), Convertitore.this.h0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.h0.q2().isEmpty() && !Convertitore.this.h0.r2().isEmpty()) {
                            Convertitore.this.h0.t2().setText(Convertitore.this.h0.s2().getText().toString());
                        }
                        Convertitore.this.h0.s2().setText(Convertitore.this.a0.m(Convertitore.this.h0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.h0.t2().setText(Convertitore.this.a0.m(Convertitore.this.h0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.h0.s2();
                        textViewT2 = Convertitore.this.h0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 3:
                        Convertitore.this.a0.i(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), "8", 3, Convertitore.this.i0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.i0.q2().equals(Convertitore.this.i0.r2())) {
                            Convertitore.this.Z.d0(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.i0.q2(), Convertitore.this.i0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.i0.q2().isEmpty() && !Convertitore.this.i0.r2().isEmpty()) {
                            Convertitore.this.i0.t2().setText(Convertitore.this.i0.s2().getText().toString());
                        }
                        Convertitore.this.i0.s2().setText(Convertitore.this.a0.m(Convertitore.this.i0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.i0.t2().setText(Convertitore.this.a0.m(Convertitore.this.i0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.i0.s2();
                        textViewT2 = Convertitore.this.i0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 4:
                        Convertitore.this.a0.i(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), "8", 4, Convertitore.this.j0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.j0.q2().equals(Convertitore.this.j0.r2())) {
                            Convertitore.this.Z.f(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.j0.q2(), Convertitore.this.j0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.j0.q2().isEmpty() && !Convertitore.this.j0.r2().isEmpty()) {
                            Convertitore.this.j0.t2().setText(Convertitore.this.j0.s2().getText().toString());
                        }
                        Convertitore.this.j0.s2().setText(Convertitore.this.a0.m(Convertitore.this.j0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.j0.t2().setText(Convertitore.this.a0.m(Convertitore.this.j0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.j0.s2();
                        textViewT2 = Convertitore.this.j0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 5:
                        Convertitore.this.a0.i(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), "8", 5, Convertitore.this.k0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.k0.q2().equals(Convertitore.this.k0.r2())) {
                            Convertitore.this.Z.i0(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.k0.q2(), Convertitore.this.k0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.k0.q2().isEmpty() && !Convertitore.this.k0.r2().isEmpty()) {
                            Convertitore.this.k0.t2().setText(Convertitore.this.k0.s2().getText().toString());
                        }
                        Convertitore.this.k0.s2().setText(Convertitore.this.a0.m(Convertitore.this.k0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.k0.t2().setText(Convertitore.this.a0.m(Convertitore.this.k0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.k0.s2();
                        textViewT2 = Convertitore.this.k0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 6:
                        Convertitore.this.a0.i(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), "8", 6, Convertitore.this.l0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.l0.q2().equals(Convertitore.this.l0.r2())) {
                            Convertitore.this.Z.e0(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.l0.q2(), Convertitore.this.l0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.l0.q2().isEmpty() && !Convertitore.this.l0.r2().isEmpty()) {
                            Convertitore.this.l0.t2().setText(Convertitore.this.l0.s2().getText().toString());
                        }
                        Convertitore.this.l0.s2().setText(Convertitore.this.a0.m(Convertitore.this.l0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.l0.t2().setText(Convertitore.this.a0.m(Convertitore.this.l0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.l0.s2();
                        textViewT2 = Convertitore.this.l0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 7:
                        Convertitore.this.a0.i(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), "8", 7, Convertitore.this.m0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.m0.q2().equals(Convertitore.this.m0.r2())) {
                            Convertitore.this.Z.f0(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.m0.q2(), Convertitore.this.m0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.m0.q2().isEmpty() && !Convertitore.this.m0.r2().isEmpty()) {
                            Convertitore.this.m0.t2().setText(Convertitore.this.m0.s2().getText().toString());
                        }
                        Convertitore.this.m0.s2().setText(Convertitore.this.a0.m(Convertitore.this.m0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.m0.t2().setText(Convertitore.this.a0.m(Convertitore.this.m0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.m0.s2();
                        textViewT2 = Convertitore.this.m0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 8:
                        Convertitore.this.a0.i(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), "8", 8, Convertitore.this.n0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.n0.q2().equals(Convertitore.this.n0.r2())) {
                            Convertitore.this.Z.h(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.n0.q2(), Convertitore.this.n0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.n0.q2().isEmpty() && !Convertitore.this.n0.r2().isEmpty()) {
                            Convertitore.this.n0.t2().setText(Convertitore.this.n0.s2().getText().toString());
                        }
                        Convertitore.this.n0.s2().setText(Convertitore.this.a0.m(Convertitore.this.n0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.n0.t2().setText(Convertitore.this.a0.m(Convertitore.this.n0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.n0.s2();
                        textViewT2 = Convertitore.this.n0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 9:
                        Convertitore.this.a0.i(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), "8", 9, Convertitore.this.o0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.o0.q2().equals(Convertitore.this.o0.r2())) {
                            Convertitore.this.Z.g(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.o0.q2(), Convertitore.this.o0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.o0.q2().isEmpty() && !Convertitore.this.o0.r2().isEmpty()) {
                            Convertitore.this.o0.t2().setText(Convertitore.this.o0.s2().getText().toString());
                        }
                        Convertitore.this.o0.s2().setText(Convertitore.this.a0.m(Convertitore.this.o0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.o0.t2().setText(Convertitore.this.a0.m(Convertitore.this.o0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.o0.s2();
                        textViewT2 = Convertitore.this.o0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 10:
                        Convertitore.this.a0.i(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), "8", 10, Convertitore.this.p0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.p0.q2().equals(Convertitore.this.p0.r2())) {
                            Convertitore.this.Z.k0(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.p0.q2(), Convertitore.this.p0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.p0.q2().isEmpty() && !Convertitore.this.p0.r2().isEmpty()) {
                            Convertitore.this.p0.t2().setText(Convertitore.this.p0.s2().getText().toString());
                        }
                        Convertitore.this.p0.s2().setText(Convertitore.this.a0.m(Convertitore.this.p0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.p0.t2().setText(Convertitore.this.a0.m(Convertitore.this.p0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.p0.s2();
                        textViewT2 = Convertitore.this.p0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 11:
                        Convertitore.this.a0.i(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), "8", 11, Convertitore.this.q0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.q0.q2().equals(Convertitore.this.q0.r2())) {
                            Convertitore.this.Z.j0(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.q0.q2(), Convertitore.this.q0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.q0.q2().isEmpty() && !Convertitore.this.q0.r2().isEmpty()) {
                            Convertitore.this.q0.t2().setText(Convertitore.this.q0.s2().getText().toString());
                        }
                        Convertitore.this.q0.s2().setText(Convertitore.this.a0.m(Convertitore.this.q0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.q0.t2().setText(Convertitore.this.a0.m(Convertitore.this.q0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.q0.s2();
                        textViewT2 = Convertitore.this.q0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 12:
                        Convertitore.this.a0.i(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), "8", 12, Convertitore.this.r0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.r0.q2().equals(Convertitore.this.r0.r2())) {
                            Convertitore.this.Z.a(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.r0.q2(), Convertitore.this.r0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.r0.q2().isEmpty() && !Convertitore.this.r0.r2().isEmpty()) {
                            Convertitore.this.r0.t2().setText(Convertitore.this.r0.s2().getText().toString());
                        }
                        Convertitore.this.r0.s2().setText(Convertitore.this.a0.m(Convertitore.this.r0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.r0.t2().setText(Convertitore.this.a0.m(Convertitore.this.r0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.r0.s2();
                        textViewT2 = Convertitore.this.r0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 13:
                        Convertitore.this.a0.i(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), "8", 13, Convertitore.this.s0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.s0.q2().equals(Convertitore.this.s0.r2())) {
                            Convertitore.this.Z.e(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.s0.q2(), Convertitore.this.s0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.s0.q2().isEmpty() && !Convertitore.this.s0.r2().isEmpty()) {
                            Convertitore.this.s0.t2().setText(Convertitore.this.s0.s2().getText().toString());
                        }
                        Convertitore.this.s0.s2().setText(Convertitore.this.a0.m(Convertitore.this.s0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.s0.t2().setText(Convertitore.this.a0.m(Convertitore.this.s0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.s0.s2();
                        textViewT2 = Convertitore.this.s0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 14:
                        Convertitore.this.a0.i(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), "8", 14, Convertitore.this.t0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.t0.q2().equals(Convertitore.this.t0.r2())) {
                            Convertitore.this.Z.c(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.t0.q2(), Convertitore.this.t0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.t0.q2().isEmpty() && !Convertitore.this.t0.r2().isEmpty()) {
                            Convertitore.this.t0.t2().setText(Convertitore.this.t0.s2().getText().toString());
                        }
                        Convertitore.this.t0.s2().setText(Convertitore.this.a0.m(Convertitore.this.t0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.t0.t2().setText(Convertitore.this.a0.m(Convertitore.this.t0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.t0.s2();
                        textViewT2 = Convertitore.this.t0.t2();
                        convertitore = Convertitore.this;
                        break;
                    default:
                        return;
                }
                uVar.o0(textViewS2, textViewT2, convertitore.getBaseContext());
            } catch (NullPointerException | NumberFormatException unused) {
                Toast.makeText(Convertitore.this.W, "error", 0).show();
            }
        }
    }

    class i implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        i(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.u uVar;
            TextView textViewS2;
            TextView textViewT2;
            Convertitore convertitore;
            if (Convertitore.this.P.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Convertitore.this.M.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Convertitore.this.M.vibrate(20L);
                }
            }
            try {
                switch (Convertitore.this.c0.getSelectedTabPosition()) {
                    case 0:
                        Convertitore.this.a0.i(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), "9", 0, Convertitore.this.f0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.f0.q2().equals(Convertitore.this.f0.r2())) {
                            Convertitore.this.Z.c0(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.f0.q2(), Convertitore.this.f0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.f0.q2().isEmpty() && !Convertitore.this.f0.r2().isEmpty()) {
                            Convertitore.this.f0.t2().setText(Convertitore.this.f0.s2().getText().toString());
                        }
                        Convertitore.this.f0.s2().setText(Convertitore.this.a0.m(Convertitore.this.f0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.f0.t2().setText(Convertitore.this.a0.m(Convertitore.this.f0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.f0.s2();
                        textViewT2 = Convertitore.this.f0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 1:
                        Convertitore.this.a0.i(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), "9", 1, Convertitore.this.g0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.g0.q2().equals(Convertitore.this.g0.r2())) {
                            Convertitore.this.Z.b(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.g0.q2(), Convertitore.this.g0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.g0.q2().isEmpty() && !Convertitore.this.g0.r2().isEmpty()) {
                            Convertitore.this.g0.t2().setText(Convertitore.this.g0.s2().getText().toString());
                        }
                        Convertitore.this.g0.s2().setText(Convertitore.this.a0.m(Convertitore.this.g0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.g0.t2().setText(Convertitore.this.a0.m(Convertitore.this.g0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.g0.s2();
                        textViewT2 = Convertitore.this.g0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 2:
                        Convertitore.this.a0.i(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), "9", 2, Convertitore.this.h0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.h0.q2().equals(Convertitore.this.h0.r2())) {
                            Convertitore.this.Z.l0(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.h0.q2(), Convertitore.this.h0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.h0.q2().isEmpty() && !Convertitore.this.h0.r2().isEmpty()) {
                            Convertitore.this.h0.t2().setText(Convertitore.this.h0.s2().getText().toString());
                        }
                        Convertitore.this.h0.s2().setText(Convertitore.this.a0.m(Convertitore.this.h0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.h0.t2().setText(Convertitore.this.a0.m(Convertitore.this.h0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.h0.s2();
                        textViewT2 = Convertitore.this.h0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 3:
                        Convertitore.this.a0.i(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), "9", 3, Convertitore.this.i0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.i0.q2().equals(Convertitore.this.i0.r2())) {
                            Convertitore.this.Z.d0(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.i0.q2(), Convertitore.this.i0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.i0.q2().isEmpty() && !Convertitore.this.i0.r2().isEmpty()) {
                            Convertitore.this.i0.t2().setText(Convertitore.this.i0.s2().getText().toString());
                        }
                        Convertitore.this.i0.s2().setText(Convertitore.this.a0.m(Convertitore.this.i0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.i0.t2().setText(Convertitore.this.a0.m(Convertitore.this.i0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.i0.s2();
                        textViewT2 = Convertitore.this.i0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 4:
                        Convertitore.this.a0.i(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), "9", 4, Convertitore.this.j0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.j0.q2().equals(Convertitore.this.j0.r2())) {
                            Convertitore.this.Z.f(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.j0.q2(), Convertitore.this.j0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.j0.q2().isEmpty() && !Convertitore.this.j0.r2().isEmpty()) {
                            Convertitore.this.j0.t2().setText(Convertitore.this.j0.s2().getText().toString());
                        }
                        Convertitore.this.j0.s2().setText(Convertitore.this.a0.m(Convertitore.this.j0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.j0.t2().setText(Convertitore.this.a0.m(Convertitore.this.j0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.j0.s2();
                        textViewT2 = Convertitore.this.j0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 5:
                        Convertitore.this.a0.i(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), "9", 5, Convertitore.this.k0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.k0.q2().equals(Convertitore.this.k0.r2())) {
                            Convertitore.this.Z.i0(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.k0.q2(), Convertitore.this.k0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.k0.q2().isEmpty() && !Convertitore.this.k0.r2().isEmpty()) {
                            Convertitore.this.k0.t2().setText(Convertitore.this.k0.s2().getText().toString());
                        }
                        Convertitore.this.k0.s2().setText(Convertitore.this.a0.m(Convertitore.this.k0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.k0.t2().setText(Convertitore.this.a0.m(Convertitore.this.k0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.k0.s2();
                        textViewT2 = Convertitore.this.k0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 6:
                        Convertitore.this.a0.i(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), "9", 6, Convertitore.this.l0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.l0.q2().equals(Convertitore.this.l0.r2())) {
                            Convertitore.this.Z.e0(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.l0.q2(), Convertitore.this.l0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.l0.q2().isEmpty() && !Convertitore.this.l0.r2().isEmpty()) {
                            Convertitore.this.l0.t2().setText(Convertitore.this.l0.s2().getText().toString());
                        }
                        Convertitore.this.l0.s2().setText(Convertitore.this.a0.m(Convertitore.this.l0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.l0.t2().setText(Convertitore.this.a0.m(Convertitore.this.l0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.l0.s2();
                        textViewT2 = Convertitore.this.l0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 7:
                        Convertitore.this.a0.i(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), "9", 7, Convertitore.this.m0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.m0.q2().equals(Convertitore.this.m0.r2())) {
                            Convertitore.this.Z.f0(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.m0.q2(), Convertitore.this.m0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.m0.q2().isEmpty() && !Convertitore.this.m0.r2().isEmpty()) {
                            Convertitore.this.m0.t2().setText(Convertitore.this.m0.s2().getText().toString());
                        }
                        Convertitore.this.m0.s2().setText(Convertitore.this.a0.m(Convertitore.this.m0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.m0.t2().setText(Convertitore.this.a0.m(Convertitore.this.m0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.m0.s2();
                        textViewT2 = Convertitore.this.m0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 8:
                        Convertitore.this.a0.i(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), "9", 8, Convertitore.this.n0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.n0.q2().equals(Convertitore.this.n0.r2())) {
                            Convertitore.this.Z.h(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.n0.q2(), Convertitore.this.n0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.n0.q2().isEmpty() && !Convertitore.this.n0.r2().isEmpty()) {
                            Convertitore.this.n0.t2().setText(Convertitore.this.n0.s2().getText().toString());
                        }
                        Convertitore.this.n0.s2().setText(Convertitore.this.a0.m(Convertitore.this.n0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.n0.t2().setText(Convertitore.this.a0.m(Convertitore.this.n0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.n0.s2();
                        textViewT2 = Convertitore.this.n0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 9:
                        Convertitore.this.a0.i(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), "9", 9, Convertitore.this.o0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.o0.q2().equals(Convertitore.this.o0.r2())) {
                            Convertitore.this.Z.g(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.o0.q2(), Convertitore.this.o0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.o0.q2().isEmpty() && !Convertitore.this.o0.r2().isEmpty()) {
                            Convertitore.this.o0.t2().setText(Convertitore.this.o0.s2().getText().toString());
                        }
                        Convertitore.this.o0.s2().setText(Convertitore.this.a0.m(Convertitore.this.o0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.o0.t2().setText(Convertitore.this.a0.m(Convertitore.this.o0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.o0.s2();
                        textViewT2 = Convertitore.this.o0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 10:
                        Convertitore.this.a0.i(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), "9", 10, Convertitore.this.p0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.p0.q2().equals(Convertitore.this.p0.r2())) {
                            Convertitore.this.Z.k0(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.p0.q2(), Convertitore.this.p0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.p0.q2().isEmpty() && !Convertitore.this.p0.r2().isEmpty()) {
                            Convertitore.this.p0.t2().setText(Convertitore.this.p0.s2().getText().toString());
                        }
                        Convertitore.this.p0.s2().setText(Convertitore.this.a0.m(Convertitore.this.p0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.p0.t2().setText(Convertitore.this.a0.m(Convertitore.this.p0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.p0.s2();
                        textViewT2 = Convertitore.this.p0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 11:
                        Convertitore.this.a0.i(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), "9", 11, Convertitore.this.q0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.q0.q2().equals(Convertitore.this.q0.r2())) {
                            Convertitore.this.Z.j0(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.q0.q2(), Convertitore.this.q0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.q0.q2().isEmpty() && !Convertitore.this.q0.r2().isEmpty()) {
                            Convertitore.this.q0.t2().setText(Convertitore.this.q0.s2().getText().toString());
                        }
                        Convertitore.this.q0.s2().setText(Convertitore.this.a0.m(Convertitore.this.q0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.q0.t2().setText(Convertitore.this.a0.m(Convertitore.this.q0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.q0.s2();
                        textViewT2 = Convertitore.this.q0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 12:
                        Convertitore.this.a0.i(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), "9", 12, Convertitore.this.r0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.r0.q2().equals(Convertitore.this.r0.r2())) {
                            Convertitore.this.Z.a(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.r0.q2(), Convertitore.this.r0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.r0.q2().isEmpty() && !Convertitore.this.r0.r2().isEmpty()) {
                            Convertitore.this.r0.t2().setText(Convertitore.this.r0.s2().getText().toString());
                        }
                        Convertitore.this.r0.s2().setText(Convertitore.this.a0.m(Convertitore.this.r0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.r0.t2().setText(Convertitore.this.a0.m(Convertitore.this.r0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.r0.s2();
                        textViewT2 = Convertitore.this.r0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 13:
                        Convertitore.this.a0.i(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), "9", 13, Convertitore.this.s0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.s0.q2().equals(Convertitore.this.s0.r2())) {
                            Convertitore.this.Z.e(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.s0.q2(), Convertitore.this.s0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.s0.q2().isEmpty() && !Convertitore.this.s0.r2().isEmpty()) {
                            Convertitore.this.s0.t2().setText(Convertitore.this.s0.s2().getText().toString());
                        }
                        Convertitore.this.s0.s2().setText(Convertitore.this.a0.m(Convertitore.this.s0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.s0.t2().setText(Convertitore.this.a0.m(Convertitore.this.s0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.s0.s2();
                        textViewT2 = Convertitore.this.s0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 14:
                        Convertitore.this.a0.i(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), "9", 14, Convertitore.this.t0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.t0.q2().equals(Convertitore.this.t0.r2())) {
                            Convertitore.this.Z.c(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.t0.q2(), Convertitore.this.t0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.t0.q2().isEmpty() && !Convertitore.this.t0.r2().isEmpty()) {
                            Convertitore.this.t0.t2().setText(Convertitore.this.t0.s2().getText().toString());
                        }
                        Convertitore.this.t0.s2().setText(Convertitore.this.a0.m(Convertitore.this.t0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.t0.t2().setText(Convertitore.this.a0.m(Convertitore.this.t0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.t0.s2();
                        textViewT2 = Convertitore.this.t0.t2();
                        convertitore = Convertitore.this;
                        break;
                    default:
                        return;
                }
                uVar.o0(textViewS2, textViewT2, convertitore.getBaseContext());
            } catch (NullPointerException | NumberFormatException unused) {
                Toast.makeText(Convertitore.this.W, "error", 0).show();
            }
        }
    }

    class j implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        j(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.u uVar;
            TextView textViewS2;
            TextView textViewT2;
            Convertitore convertitore;
            if (Convertitore.this.P.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Convertitore.this.M.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Convertitore.this.M.vibrate(20L);
                }
            }
            try {
                switch (Convertitore.this.c0.getSelectedTabPosition()) {
                    case 0:
                        Convertitore.this.a0.i(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), "0", 0, Convertitore.this.f0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.f0.q2().equals(Convertitore.this.f0.r2())) {
                            Convertitore.this.Z.c0(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.f0.q2(), Convertitore.this.f0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.f0.q2().isEmpty() && !Convertitore.this.f0.r2().isEmpty()) {
                            Convertitore.this.f0.t2().setText(Convertitore.this.f0.s2().getText().toString());
                        }
                        Convertitore.this.f0.s2().setText(Convertitore.this.a0.m(Convertitore.this.f0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.f0.t2().setText(Convertitore.this.a0.m(Convertitore.this.f0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.f0.s2();
                        textViewT2 = Convertitore.this.f0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 1:
                        Convertitore.this.a0.i(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), "0", 1, Convertitore.this.g0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.g0.q2().equals(Convertitore.this.g0.r2())) {
                            Convertitore.this.Z.b(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.g0.q2(), Convertitore.this.g0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.g0.q2().isEmpty() && !Convertitore.this.g0.r2().isEmpty()) {
                            Convertitore.this.g0.t2().setText(Convertitore.this.g0.s2().getText().toString());
                        }
                        Convertitore.this.g0.s2().setText(Convertitore.this.a0.m(Convertitore.this.g0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.g0.t2().setText(Convertitore.this.a0.m(Convertitore.this.g0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.g0.s2();
                        textViewT2 = Convertitore.this.g0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 2:
                        Convertitore.this.a0.i(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), "0", 2, Convertitore.this.h0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.h0.q2().equals(Convertitore.this.h0.r2())) {
                            Convertitore.this.Z.l0(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.h0.q2(), Convertitore.this.h0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.h0.q2().isEmpty() && !Convertitore.this.h0.r2().isEmpty()) {
                            Convertitore.this.h0.t2().setText(Convertitore.this.h0.s2().getText().toString());
                        }
                        Convertitore.this.h0.s2().setText(Convertitore.this.a0.m(Convertitore.this.h0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.h0.t2().setText(Convertitore.this.a0.m(Convertitore.this.h0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.h0.s2();
                        textViewT2 = Convertitore.this.h0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 3:
                        Convertitore.this.a0.i(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), "0", 3, Convertitore.this.i0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.i0.q2().equals(Convertitore.this.i0.r2())) {
                            Convertitore.this.Z.d0(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.i0.q2(), Convertitore.this.i0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.i0.q2().isEmpty() && !Convertitore.this.i0.r2().isEmpty()) {
                            Convertitore.this.i0.t2().setText(Convertitore.this.i0.s2().getText().toString());
                        }
                        Convertitore.this.i0.s2().setText(Convertitore.this.a0.m(Convertitore.this.i0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.i0.t2().setText(Convertitore.this.a0.m(Convertitore.this.i0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.i0.s2();
                        textViewT2 = Convertitore.this.i0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 4:
                        Convertitore.this.a0.i(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), "0", 4, Convertitore.this.j0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.j0.q2().equals(Convertitore.this.j0.r2())) {
                            Convertitore.this.Z.f(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.j0.q2(), Convertitore.this.j0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.j0.q2().isEmpty() && !Convertitore.this.j0.r2().isEmpty()) {
                            Convertitore.this.j0.t2().setText(Convertitore.this.j0.s2().getText().toString());
                        }
                        Convertitore.this.j0.s2().setText(Convertitore.this.a0.m(Convertitore.this.j0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.j0.t2().setText(Convertitore.this.a0.m(Convertitore.this.j0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.j0.s2();
                        textViewT2 = Convertitore.this.j0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 5:
                        Convertitore.this.a0.i(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), "0", 5, Convertitore.this.k0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.k0.q2().equals(Convertitore.this.k0.r2())) {
                            Convertitore.this.Z.i0(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.k0.q2(), Convertitore.this.k0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.k0.q2().isEmpty() && !Convertitore.this.k0.r2().isEmpty()) {
                            Convertitore.this.k0.t2().setText(Convertitore.this.k0.s2().getText().toString());
                        }
                        Convertitore.this.k0.s2().setText(Convertitore.this.a0.m(Convertitore.this.k0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.k0.t2().setText(Convertitore.this.a0.m(Convertitore.this.k0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.k0.s2();
                        textViewT2 = Convertitore.this.k0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 6:
                        Convertitore.this.a0.i(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), "0", 6, Convertitore.this.l0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.l0.q2().equals(Convertitore.this.l0.r2())) {
                            Convertitore.this.Z.e0(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.l0.q2(), Convertitore.this.l0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.l0.q2().isEmpty() && !Convertitore.this.l0.r2().isEmpty()) {
                            Convertitore.this.l0.t2().setText(Convertitore.this.l0.s2().getText().toString());
                        }
                        Convertitore.this.l0.s2().setText(Convertitore.this.a0.m(Convertitore.this.l0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.l0.t2().setText(Convertitore.this.a0.m(Convertitore.this.l0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.l0.s2();
                        textViewT2 = Convertitore.this.l0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 7:
                        Convertitore.this.a0.i(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), "0", 7, Convertitore.this.m0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.m0.q2().equals(Convertitore.this.m0.r2())) {
                            Convertitore.this.Z.f0(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.m0.q2(), Convertitore.this.m0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.m0.q2().isEmpty() && !Convertitore.this.m0.r2().isEmpty()) {
                            Convertitore.this.m0.t2().setText(Convertitore.this.m0.s2().getText().toString());
                        }
                        Convertitore.this.m0.s2().setText(Convertitore.this.a0.m(Convertitore.this.m0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.m0.t2().setText(Convertitore.this.a0.m(Convertitore.this.m0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.m0.s2();
                        textViewT2 = Convertitore.this.m0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 8:
                        Convertitore.this.a0.i(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), "0", 8, Convertitore.this.n0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.n0.q2().equals(Convertitore.this.n0.r2())) {
                            Convertitore.this.Z.h(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.n0.q2(), Convertitore.this.n0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.n0.q2().isEmpty() && !Convertitore.this.n0.r2().isEmpty()) {
                            Convertitore.this.n0.t2().setText(Convertitore.this.n0.s2().getText().toString());
                        }
                        Convertitore.this.n0.s2().setText(Convertitore.this.a0.m(Convertitore.this.n0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.n0.t2().setText(Convertitore.this.a0.m(Convertitore.this.n0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.n0.s2();
                        textViewT2 = Convertitore.this.n0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 9:
                        Convertitore.this.a0.i(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), "0", 9, Convertitore.this.o0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.o0.q2().equals(Convertitore.this.o0.r2())) {
                            Convertitore.this.Z.g(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.o0.q2(), Convertitore.this.o0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.o0.q2().isEmpty() && !Convertitore.this.o0.r2().isEmpty()) {
                            Convertitore.this.o0.t2().setText(Convertitore.this.o0.s2().getText().toString());
                        }
                        Convertitore.this.o0.s2().setText(Convertitore.this.a0.m(Convertitore.this.o0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.o0.t2().setText(Convertitore.this.a0.m(Convertitore.this.o0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.o0.s2();
                        textViewT2 = Convertitore.this.o0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 10:
                        Convertitore.this.a0.i(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), "0", 10, Convertitore.this.p0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.p0.q2().equals(Convertitore.this.p0.r2())) {
                            Convertitore.this.Z.k0(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.p0.q2(), Convertitore.this.p0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.p0.q2().isEmpty() && !Convertitore.this.p0.r2().isEmpty()) {
                            Convertitore.this.p0.t2().setText(Convertitore.this.p0.s2().getText().toString());
                        }
                        Convertitore.this.p0.s2().setText(Convertitore.this.a0.m(Convertitore.this.p0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.p0.t2().setText(Convertitore.this.a0.m(Convertitore.this.p0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.p0.s2();
                        textViewT2 = Convertitore.this.p0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 11:
                        Convertitore.this.a0.i(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), "0", 11, Convertitore.this.q0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.q0.q2().equals(Convertitore.this.q0.r2())) {
                            Convertitore.this.Z.j0(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.q0.q2(), Convertitore.this.q0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.q0.q2().isEmpty() && !Convertitore.this.q0.r2().isEmpty()) {
                            Convertitore.this.q0.t2().setText(Convertitore.this.q0.s2().getText().toString());
                        }
                        Convertitore.this.q0.s2().setText(Convertitore.this.a0.m(Convertitore.this.q0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.q0.t2().setText(Convertitore.this.a0.m(Convertitore.this.q0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.q0.s2();
                        textViewT2 = Convertitore.this.q0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 12:
                        Convertitore.this.a0.i(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), "0", 12, Convertitore.this.r0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.r0.q2().equals(Convertitore.this.r0.r2())) {
                            Convertitore.this.Z.a(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.r0.q2(), Convertitore.this.r0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.r0.q2().isEmpty() && !Convertitore.this.r0.r2().isEmpty()) {
                            Convertitore.this.r0.t2().setText(Convertitore.this.r0.s2().getText().toString());
                        }
                        Convertitore.this.r0.s2().setText(Convertitore.this.a0.m(Convertitore.this.r0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.r0.t2().setText(Convertitore.this.a0.m(Convertitore.this.r0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.r0.s2();
                        textViewT2 = Convertitore.this.r0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 13:
                        Convertitore.this.a0.i(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), "0", 13, Convertitore.this.s0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.s0.q2().equals(Convertitore.this.s0.r2())) {
                            Convertitore.this.Z.e(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.s0.q2(), Convertitore.this.s0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.s0.q2().isEmpty() && !Convertitore.this.s0.r2().isEmpty()) {
                            Convertitore.this.s0.t2().setText(Convertitore.this.s0.s2().getText().toString());
                        }
                        Convertitore.this.s0.s2().setText(Convertitore.this.a0.m(Convertitore.this.s0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.s0.t2().setText(Convertitore.this.a0.m(Convertitore.this.s0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.s0.s2();
                        textViewT2 = Convertitore.this.s0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 14:
                        Convertitore.this.a0.i(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), "0", 14, Convertitore.this.t0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.t0.q2().equals(Convertitore.this.t0.r2())) {
                            Convertitore.this.Z.c(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.t0.q2(), Convertitore.this.t0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.t0.q2().isEmpty() && !Convertitore.this.t0.r2().isEmpty()) {
                            Convertitore.this.t0.t2().setText(Convertitore.this.t0.s2().getText().toString());
                        }
                        Convertitore.this.t0.s2().setText(Convertitore.this.a0.m(Convertitore.this.t0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.t0.t2().setText(Convertitore.this.a0.m(Convertitore.this.t0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.t0.s2();
                        textViewT2 = Convertitore.this.t0.t2();
                        convertitore = Convertitore.this;
                        break;
                    default:
                        return;
                }
                uVar.o0(textViewS2, textViewT2, convertitore.getBaseContext());
            } catch (NullPointerException | NumberFormatException unused) {
                Toast.makeText(Convertitore.this.W, "error", 0).show();
            }
        }
    }

    class k implements DialogInterface.OnClickListener {
        k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r2) {
            Convertitore.this.e1.setVisible(false);
        }
    }

    class l implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        l(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.u uVar;
            TextView textViewS2;
            TextView textViewT2;
            Convertitore convertitore;
            if (Convertitore.this.P.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Convertitore.this.M.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Convertitore.this.M.vibrate(20L);
                }
            }
            try {
                switch (Convertitore.this.c0.getSelectedTabPosition()) {
                    case 0:
                        Convertitore.this.a0.i(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), "canc", 0, Convertitore.this.f0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.f0.q2().equals(Convertitore.this.f0.r2())) {
                            Convertitore.this.Z.c0(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.f0.q2(), Convertitore.this.f0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.f0.q2().isEmpty() && !Convertitore.this.f0.r2().isEmpty()) {
                            Convertitore.this.f0.t2().setText(Convertitore.this.f0.s2().getText().toString());
                        }
                        Convertitore.this.f0.s2().setText(Convertitore.this.a0.m(Convertitore.this.f0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.f0.t2().setText(Convertitore.this.a0.m(Convertitore.this.f0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.f0.s2();
                        textViewT2 = Convertitore.this.f0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 1:
                        Convertitore.this.a0.i(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), "canc", 1, Convertitore.this.g0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.g0.q2().equals(Convertitore.this.g0.r2())) {
                            Convertitore.this.Z.b(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.g0.q2(), Convertitore.this.g0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.g0.q2().isEmpty() && !Convertitore.this.g0.r2().isEmpty()) {
                            Convertitore.this.g0.t2().setText(Convertitore.this.g0.s2().getText().toString());
                        }
                        Convertitore.this.g0.s2().setText(Convertitore.this.a0.m(Convertitore.this.g0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.g0.t2().setText(Convertitore.this.a0.m(Convertitore.this.g0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.g0.s2();
                        textViewT2 = Convertitore.this.g0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 2:
                        Convertitore.this.a0.i(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), "canc", 2, Convertitore.this.h0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.h0.q2().equals(Convertitore.this.h0.r2())) {
                            Convertitore.this.Z.l0(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.h0.q2(), Convertitore.this.h0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.h0.q2().isEmpty() && !Convertitore.this.h0.r2().isEmpty()) {
                            Convertitore.this.h0.t2().setText(Convertitore.this.h0.s2().getText().toString());
                        }
                        Convertitore.this.h0.s2().setText(Convertitore.this.a0.m(Convertitore.this.h0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.h0.t2().setText(Convertitore.this.a0.m(Convertitore.this.h0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.h0.s2();
                        textViewT2 = Convertitore.this.h0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 3:
                        Convertitore.this.a0.i(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), "canc", 3, Convertitore.this.i0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.i0.q2().equals(Convertitore.this.i0.r2())) {
                            Convertitore.this.Z.d0(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.i0.q2(), Convertitore.this.i0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.i0.q2().isEmpty() && !Convertitore.this.i0.r2().isEmpty()) {
                            Convertitore.this.i0.t2().setText(Convertitore.this.i0.s2().getText().toString());
                        }
                        Convertitore.this.i0.s2().setText(Convertitore.this.a0.m(Convertitore.this.i0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.i0.t2().setText(Convertitore.this.a0.m(Convertitore.this.i0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.i0.s2();
                        textViewT2 = Convertitore.this.i0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 4:
                        Convertitore.this.a0.i(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), "canc", 4, Convertitore.this.j0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.j0.q2().equals(Convertitore.this.j0.r2())) {
                            Convertitore.this.Z.f(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.j0.q2(), Convertitore.this.j0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.j0.q2().isEmpty() && !Convertitore.this.j0.r2().isEmpty()) {
                            Convertitore.this.j0.t2().setText(Convertitore.this.j0.s2().getText().toString());
                        }
                        Convertitore.this.j0.s2().setText(Convertitore.this.a0.m(Convertitore.this.j0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.j0.t2().setText(Convertitore.this.a0.m(Convertitore.this.j0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.j0.s2();
                        textViewT2 = Convertitore.this.j0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 5:
                        Convertitore.this.a0.i(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), "canc", 5, Convertitore.this.k0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.k0.q2().equals(Convertitore.this.k0.r2())) {
                            Convertitore.this.Z.i0(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.k0.q2(), Convertitore.this.k0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.k0.q2().isEmpty() && !Convertitore.this.k0.r2().isEmpty()) {
                            Convertitore.this.k0.t2().setText(Convertitore.this.k0.s2().getText().toString());
                        }
                        Convertitore.this.k0.s2().setText(Convertitore.this.a0.m(Convertitore.this.k0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.k0.t2().setText(Convertitore.this.a0.m(Convertitore.this.k0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.k0.s2();
                        textViewT2 = Convertitore.this.k0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 6:
                        Convertitore.this.a0.i(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), "canc", 6, Convertitore.this.l0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.l0.q2().equals(Convertitore.this.l0.r2())) {
                            Convertitore.this.Z.e0(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.l0.q2(), Convertitore.this.l0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.l0.q2().isEmpty() && !Convertitore.this.l0.r2().isEmpty()) {
                            Convertitore.this.l0.t2().setText(Convertitore.this.l0.s2().getText().toString());
                        }
                        Convertitore.this.l0.s2().setText(Convertitore.this.a0.m(Convertitore.this.l0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.l0.t2().setText(Convertitore.this.a0.m(Convertitore.this.l0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.l0.s2();
                        textViewT2 = Convertitore.this.l0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 7:
                        Convertitore.this.a0.i(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), "canc", 7, Convertitore.this.m0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.m0.q2().equals(Convertitore.this.m0.r2())) {
                            Convertitore.this.Z.f0(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.m0.q2(), Convertitore.this.m0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.m0.q2().isEmpty() && !Convertitore.this.m0.r2().isEmpty()) {
                            Convertitore.this.m0.t2().setText(Convertitore.this.m0.s2().getText().toString());
                        }
                        Convertitore.this.m0.s2().setText(Convertitore.this.a0.m(Convertitore.this.m0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.m0.t2().setText(Convertitore.this.a0.m(Convertitore.this.m0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.m0.s2();
                        textViewT2 = Convertitore.this.m0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 8:
                        Convertitore.this.a0.i(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), "canc", 8, Convertitore.this.n0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.n0.q2().equals(Convertitore.this.n0.r2())) {
                            Convertitore.this.Z.h(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.n0.q2(), Convertitore.this.n0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.n0.q2().isEmpty() && !Convertitore.this.n0.r2().isEmpty()) {
                            Convertitore.this.n0.t2().setText(Convertitore.this.n0.s2().getText().toString());
                        }
                        Convertitore.this.n0.s2().setText(Convertitore.this.a0.m(Convertitore.this.n0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.n0.t2().setText(Convertitore.this.a0.m(Convertitore.this.n0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.n0.s2();
                        textViewT2 = Convertitore.this.n0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 9:
                        Convertitore.this.a0.i(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), "canc", 9, Convertitore.this.o0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.o0.q2().equals(Convertitore.this.o0.r2())) {
                            Convertitore.this.Z.g(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.o0.q2(), Convertitore.this.o0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.o0.q2().isEmpty() && !Convertitore.this.o0.r2().isEmpty()) {
                            Convertitore.this.o0.t2().setText(Convertitore.this.o0.s2().getText().toString());
                        }
                        Convertitore.this.o0.s2().setText(Convertitore.this.a0.m(Convertitore.this.o0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.o0.t2().setText(Convertitore.this.a0.m(Convertitore.this.o0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.o0.s2();
                        textViewT2 = Convertitore.this.o0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 10:
                        Convertitore.this.a0.i(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), "canc", 10, Convertitore.this.p0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.p0.q2().equals(Convertitore.this.p0.r2())) {
                            Convertitore.this.Z.k0(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.p0.q2(), Convertitore.this.p0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.p0.q2().isEmpty() && !Convertitore.this.p0.r2().isEmpty()) {
                            Convertitore.this.p0.t2().setText(Convertitore.this.p0.s2().getText().toString());
                        }
                        Convertitore.this.p0.s2().setText(Convertitore.this.a0.m(Convertitore.this.p0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.p0.t2().setText(Convertitore.this.a0.m(Convertitore.this.p0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.p0.s2();
                        textViewT2 = Convertitore.this.p0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 11:
                        Convertitore.this.a0.i(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), "canc", 11, Convertitore.this.q0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.q0.q2().equals(Convertitore.this.q0.r2())) {
                            Convertitore.this.Z.j0(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.q0.q2(), Convertitore.this.q0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.q0.q2().isEmpty() && !Convertitore.this.q0.r2().isEmpty()) {
                            Convertitore.this.q0.t2().setText(Convertitore.this.q0.s2().getText().toString());
                        }
                        Convertitore.this.q0.s2().setText(Convertitore.this.a0.m(Convertitore.this.q0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.q0.t2().setText(Convertitore.this.a0.m(Convertitore.this.q0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.q0.s2();
                        textViewT2 = Convertitore.this.q0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 12:
                        Convertitore.this.a0.i(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), "canc", 12, Convertitore.this.r0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.r0.q2().equals(Convertitore.this.r0.r2())) {
                            Convertitore.this.Z.a(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.r0.q2(), Convertitore.this.r0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.r0.q2().isEmpty() && !Convertitore.this.r0.r2().isEmpty()) {
                            Convertitore.this.r0.t2().setText(Convertitore.this.r0.s2().getText().toString());
                        }
                        Convertitore.this.r0.s2().setText(Convertitore.this.a0.m(Convertitore.this.r0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.r0.t2().setText(Convertitore.this.a0.m(Convertitore.this.r0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.r0.s2();
                        textViewT2 = Convertitore.this.r0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 13:
                        Convertitore.this.a0.i(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), "canc", 13, Convertitore.this.s0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.s0.q2().equals(Convertitore.this.s0.r2())) {
                            Convertitore.this.Z.e(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.s0.q2(), Convertitore.this.s0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.s0.q2().isEmpty() && !Convertitore.this.s0.r2().isEmpty()) {
                            Convertitore.this.s0.t2().setText(Convertitore.this.s0.s2().getText().toString());
                        }
                        Convertitore.this.s0.s2().setText(Convertitore.this.a0.m(Convertitore.this.s0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.s0.t2().setText(Convertitore.this.a0.m(Convertitore.this.s0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.s0.s2();
                        textViewT2 = Convertitore.this.s0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 14:
                        Convertitore.this.a0.i(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), "canc", 14, Convertitore.this.t0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.t0.q2().equals(Convertitore.this.t0.r2())) {
                            Convertitore.this.Z.c(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.t0.q2(), Convertitore.this.t0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.t0.q2().isEmpty() && !Convertitore.this.t0.r2().isEmpty()) {
                            Convertitore.this.t0.t2().setText(Convertitore.this.t0.s2().getText().toString());
                        }
                        Convertitore.this.t0.s2().setText(Convertitore.this.a0.m(Convertitore.this.t0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.t0.t2().setText(Convertitore.this.a0.m(Convertitore.this.t0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.t0.s2();
                        textViewT2 = Convertitore.this.t0.t2();
                        convertitore = Convertitore.this;
                        break;
                    default:
                        return;
                }
                uVar.o0(textViewS2, textViewT2, convertitore.getBaseContext());
            } catch (NullPointerException | NumberFormatException unused) {
                Toast.makeText(Convertitore.this.W, "error", 0).show();
            }
        }
    }

    class m implements View.OnLongClickListener {
        m() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            TextView textViewT2;
            if (Convertitore.this.P.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Convertitore.this.M.vibrate(VibrationEffect.createOneShot(40L, -1));
                } else {
                    Convertitore.this.M.vibrate(40L);
                }
            }
            try {
                switch (Convertitore.this.c0.getSelectedTabPosition()) {
                    case 0:
                        Convertitore.this.f0.s2().setText("");
                        textViewT2 = Convertitore.this.f0.t2();
                        break;
                    case 1:
                        Convertitore.this.g0.s2().setText("");
                        textViewT2 = Convertitore.this.g0.t2();
                        break;
                    case 2:
                        Convertitore.this.h0.s2().setText("");
                        textViewT2 = Convertitore.this.h0.t2();
                        break;
                    case 3:
                        Convertitore.this.i0.s2().setText("");
                        textViewT2 = Convertitore.this.i0.t2();
                        break;
                    case 4:
                        Convertitore.this.j0.s2().setText("");
                        textViewT2 = Convertitore.this.j0.t2();
                        break;
                    case 5:
                        Convertitore.this.k0.s2().setText("");
                        textViewT2 = Convertitore.this.k0.t2();
                        break;
                    case 6:
                        Convertitore.this.l0.s2().setText("");
                        textViewT2 = Convertitore.this.l0.t2();
                        break;
                    case 7:
                        Convertitore.this.m0.s2().setText("");
                        textViewT2 = Convertitore.this.m0.t2();
                        break;
                    case 8:
                        Convertitore.this.n0.s2().setText("");
                        textViewT2 = Convertitore.this.n0.t2();
                        break;
                    case 9:
                        Convertitore.this.o0.s2().setText("");
                        textViewT2 = Convertitore.this.o0.t2();
                        break;
                    case 10:
                        Convertitore.this.p0.s2().setText("");
                        textViewT2 = Convertitore.this.p0.t2();
                        break;
                    case 11:
                        Convertitore.this.q0.s2().setText("");
                        textViewT2 = Convertitore.this.q0.t2();
                        break;
                    case 12:
                        Convertitore.this.r0.s2().setText("");
                        textViewT2 = Convertitore.this.r0.t2();
                        break;
                    case 13:
                        Convertitore.this.s0.s2().setText("");
                        textViewT2 = Convertitore.this.s0.t2();
                        break;
                    case 14:
                        Convertitore.this.t0.s2().setText("");
                        textViewT2 = Convertitore.this.t0.t2();
                        break;
                    default:
                        return true;
                }
                textViewT2.setText("");
                return true;
            } catch (NullPointerException | NumberFormatException unused) {
                Toast.makeText(Convertitore.this.W, "error", 0).show();
                return true;
            }
        }
    }

    class n implements DialogInterface.OnClickListener {
        final /* synthetic */ ViewGroup d;

        n(ViewGroup viewGroup) {
            this.d = viewGroup;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r8) {
            if (Convertitore.this.D.getVisibility() != 8) {
                Convertitore.this.D.setVisibility(8);
                Convertitore.this.f1 = "NO";
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
                Convertitore.this.U.e(((Long) arrayList.get(r0)).longValue(), Convertitore.this.T);
                ViewGroup viewGroup = this.d;
                viewGroup.removeView(viewGroup.findViewWithTag(arrayList.get(r0)));
            }
        }
    }

    class o implements DialogInterface.OnClickListener {
        o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r2) {
            dialogInterface.cancel();
        }
    }

    class p implements DialogInterface.OnClickListener {
        p() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r4) {
            if (!Convertitore.this.I.W()) {
                Toast.makeText(Convertitore.this.getBaseContext(), Convertitore.this.getResources().getString(R.string.video_non_disponibile), 0).show();
            } else {
                Convertitore.this.I.y();
                Convertitore.this.e1.setVisible(false);
            }
        }
    }

    class q implements com.google.android.gms.ads.k0.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SharedPreferences.Editor f7012a;

        q(SharedPreferences.Editor editor) {
            this.f7012a = editor;
        }

        @Override // com.google.android.gms.ads.k0.d
        public void a1(int r1) {
        }

        @Override // com.google.android.gms.ads.k0.d
        public void h1() {
            Convertitore.this.I.u1("ca-app-pub-8629550575650531/8524153209", new e.a().d(AdMobAdapter.class, Convertitore.this.Y).f());
            this.f7012a.putLong("data_gift_rifiutato", System.currentTimeMillis());
            this.f7012a.apply();
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
            Toast toastMakeText = Toast.makeText(Convertitore.this.getBaseContext(), Convertitore.this.getResources().getString(R.string.premioPRO), 1);
            toastMakeText.setGravity(48, 0, 0);
            toastMakeText.show();
            this.f7012a.putLong("data_gift_vinto", System.currentTimeMillis());
            this.f7012a.apply();
            Convertitore.this.S.setVisibility(8);
        }
    }

    class r implements TabLayout.f {
        r() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.i iVar) {
            if (Convertitore.this.P.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Convertitore.this.M.vibrate(VibrationEffect.createOneShot(30L, -1));
                } else {
                    Convertitore.this.M.vibrate(30L);
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.i iVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.i iVar) {
            if (Convertitore.this.P.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Convertitore.this.M.vibrate(VibrationEffect.createOneShot(30L, -1));
                } else {
                    Convertitore.this.M.vibrate(30L);
                }
            }
        }
    }

    class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (Convertitore.this.P.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Convertitore.this.M.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Convertitore.this.M.vibrate(20L);
                }
            }
            Convertitore.this.startActivity(new Intent(Convertitore.this, (Class<?>) CalcolatriceVolante.class));
        }
    }

    class t implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        t(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.u uVar;
            Button buttonO2;
            Button buttonP2;
            Convertitore convertitore;
            TextView textViewT2;
            com.gp7.easycalculator.w wVar;
            String string;
            String str;
            TextView textViewT22;
            com.gp7.easycalculator.w wVar2;
            String string2;
            String str2;
            TextView textViewT23;
            com.gp7.easycalculator.w wVar3;
            String string3;
            String str3;
            TextView textViewT24;
            com.gp7.easycalculator.w wVar4;
            String string4;
            String str4;
            TextView textViewT25;
            com.gp7.easycalculator.w wVar5;
            String string5;
            String str5;
            TextView textViewT26;
            com.gp7.easycalculator.w wVar6;
            String string6;
            String str6;
            TextView textViewT27;
            com.gp7.easycalculator.w wVar7;
            String string7;
            String str7;
            TextView textViewT28;
            com.gp7.easycalculator.w wVar8;
            String string8;
            String str8;
            TextView textViewT29;
            com.gp7.easycalculator.w wVar9;
            String string9;
            String str9;
            TextView textViewT210;
            com.gp7.easycalculator.w wVar10;
            String string10;
            String str10;
            TextView textViewT211;
            com.gp7.easycalculator.w wVar11;
            String string11;
            String str11;
            TextView textViewT212;
            com.gp7.easycalculator.w wVar12;
            String string12;
            String str12;
            TextView textViewT213;
            com.gp7.easycalculator.w wVar13;
            String string13;
            String str13;
            TextView textViewT214;
            com.gp7.easycalculator.w wVar14;
            String string14;
            String str14;
            TextView textViewT215;
            com.gp7.easycalculator.w wVar15;
            String string15;
            String str15;
            if (Convertitore.this.P.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Convertitore.this.M.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Convertitore.this.M.vibrate(20L);
                }
            }
            try {
                switch (Convertitore.this.c0.getSelectedTabPosition()) {
                    case 0:
                        if (!Convertitore.this.f0.o2().getText().toString().isEmpty() && !Convertitore.this.f0.p2().getText().toString().isEmpty()) {
                            String strQ2 = Convertitore.this.f0.q2();
                            Convertitore.this.f0.o2().setText(Convertitore.this.f0.r2());
                            Convertitore.this.f0.p2().setText(strQ2);
                            if (!Convertitore.this.f0.q2().equals(Convertitore.this.f0.r2())) {
                                Convertitore.this.a0.i(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.Q);
                                Convertitore.this.Z.c0(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.f0.q2(), Convertitore.this.f0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                                Convertitore.this.f0.s2().setText(Convertitore.this.a0.m(Convertitore.this.f0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT2 = Convertitore.this.f0.t2();
                                wVar = Convertitore.this.a0;
                                string = Convertitore.this.f0.t2().getText().toString();
                                str = Convertitore.this.Q;
                            } else if (!Convertitore.this.f0.q2().isEmpty() && !Convertitore.this.f0.r2().isEmpty()) {
                                Convertitore.this.a0.i(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.Q);
                                Convertitore.this.f0.t2().setText(Convertitore.this.f0.s2().getText().toString());
                                Convertitore.this.f0.s2().setText(Convertitore.this.a0.m(Convertitore.this.f0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT2 = Convertitore.this.f0.t2();
                                wVar = Convertitore.this.a0;
                                string = Convertitore.this.f0.t2().getText().toString();
                                str = Convertitore.this.Q;
                            }
                            textViewT2.setText(wVar.m(string, str));
                        }
                        Convertitore.this.Z.o0(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.getBaseContext());
                        uVar = Convertitore.this.Z;
                        buttonO2 = Convertitore.this.f0.o2();
                        buttonP2 = Convertitore.this.f0.p2();
                        convertitore = Convertitore.this;
                        break;
                    case 1:
                        if (!Convertitore.this.g0.o2().getText().toString().isEmpty() && !Convertitore.this.g0.p2().getText().toString().isEmpty()) {
                            String strQ22 = Convertitore.this.g0.q2();
                            Convertitore.this.g0.o2().setText(Convertitore.this.g0.r2());
                            Convertitore.this.g0.p2().setText(strQ22);
                            if (!Convertitore.this.g0.q2().equals(Convertitore.this.g0.r2())) {
                                Convertitore.this.a0.i(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.Q);
                                Convertitore.this.Z.b(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.g0.q2(), Convertitore.this.g0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                                Convertitore.this.g0.s2().setText(Convertitore.this.a0.m(Convertitore.this.g0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT22 = Convertitore.this.g0.t2();
                                wVar2 = Convertitore.this.a0;
                                string2 = Convertitore.this.g0.t2().getText().toString();
                                str2 = Convertitore.this.Q;
                            } else if (!Convertitore.this.g0.q2().isEmpty() && !Convertitore.this.g0.r2().isEmpty()) {
                                Convertitore.this.a0.i(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.Q);
                                Convertitore.this.g0.t2().setText(Convertitore.this.g0.s2().getText().toString());
                                Convertitore.this.g0.s2().setText(Convertitore.this.a0.m(Convertitore.this.g0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT22 = Convertitore.this.g0.t2();
                                wVar2 = Convertitore.this.a0;
                                string2 = Convertitore.this.g0.t2().getText().toString();
                                str2 = Convertitore.this.Q;
                            }
                            textViewT22.setText(wVar2.m(string2, str2));
                        }
                        Convertitore.this.Z.o0(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.getBaseContext());
                        uVar = Convertitore.this.Z;
                        buttonO2 = Convertitore.this.g0.o2();
                        buttonP2 = Convertitore.this.g0.p2();
                        convertitore = Convertitore.this;
                        break;
                    case 2:
                        if (!Convertitore.this.h0.o2().getText().toString().isEmpty() && !Convertitore.this.h0.p2().getText().toString().isEmpty()) {
                            String strQ23 = Convertitore.this.h0.q2();
                            Convertitore.this.h0.o2().setText(Convertitore.this.h0.r2());
                            Convertitore.this.h0.p2().setText(strQ23);
                            if (!Convertitore.this.h0.q2().equals(Convertitore.this.h0.r2())) {
                                Convertitore.this.a0.i(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.Q);
                                Convertitore.this.Z.l0(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.h0.q2(), Convertitore.this.h0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                                Convertitore.this.h0.s2().setText(Convertitore.this.a0.m(Convertitore.this.h0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT23 = Convertitore.this.h0.t2();
                                wVar3 = Convertitore.this.a0;
                                string3 = Convertitore.this.h0.t2().getText().toString();
                                str3 = Convertitore.this.Q;
                            } else if (!Convertitore.this.h0.q2().isEmpty() && !Convertitore.this.h0.r2().isEmpty()) {
                                Convertitore.this.a0.i(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.Q);
                                Convertitore.this.h0.t2().setText(Convertitore.this.h0.s2().getText().toString());
                                Convertitore.this.h0.s2().setText(Convertitore.this.a0.m(Convertitore.this.h0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT23 = Convertitore.this.h0.t2();
                                wVar3 = Convertitore.this.a0;
                                string3 = Convertitore.this.h0.t2().getText().toString();
                                str3 = Convertitore.this.Q;
                            }
                            textViewT23.setText(wVar3.m(string3, str3));
                        }
                        Convertitore.this.Z.o0(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.getBaseContext());
                        uVar = Convertitore.this.Z;
                        buttonO2 = Convertitore.this.h0.o2();
                        buttonP2 = Convertitore.this.h0.p2();
                        convertitore = Convertitore.this;
                        break;
                    case 3:
                        if (!Convertitore.this.i0.o2().getText().toString().isEmpty() && !Convertitore.this.i0.p2().getText().toString().isEmpty()) {
                            String strQ24 = Convertitore.this.i0.q2();
                            Convertitore.this.i0.o2().setText(Convertitore.this.i0.r2());
                            Convertitore.this.i0.p2().setText(strQ24);
                            if (!Convertitore.this.i0.q2().equals(Convertitore.this.i0.r2())) {
                                Convertitore.this.a0.i(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.Q);
                                Convertitore.this.Z.d0(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.i0.q2(), Convertitore.this.i0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                                Convertitore.this.i0.s2().setText(Convertitore.this.a0.m(Convertitore.this.i0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT24 = Convertitore.this.i0.t2();
                                wVar4 = Convertitore.this.a0;
                                string4 = Convertitore.this.i0.t2().getText().toString();
                                str4 = Convertitore.this.Q;
                            } else if (!Convertitore.this.i0.q2().isEmpty() && !Convertitore.this.i0.r2().isEmpty()) {
                                Convertitore.this.a0.i(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.Q);
                                Convertitore.this.i0.t2().setText(Convertitore.this.i0.s2().getText().toString());
                                Convertitore.this.i0.s2().setText(Convertitore.this.a0.m(Convertitore.this.i0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT24 = Convertitore.this.i0.t2();
                                wVar4 = Convertitore.this.a0;
                                string4 = Convertitore.this.i0.t2().getText().toString();
                                str4 = Convertitore.this.Q;
                            }
                            textViewT24.setText(wVar4.m(string4, str4));
                        }
                        Convertitore.this.Z.o0(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.getBaseContext());
                        uVar = Convertitore.this.Z;
                        buttonO2 = Convertitore.this.i0.o2();
                        buttonP2 = Convertitore.this.i0.p2();
                        convertitore = Convertitore.this;
                        break;
                    case 4:
                        if (!Convertitore.this.j0.o2().getText().toString().isEmpty() && !Convertitore.this.j0.p2().getText().toString().isEmpty()) {
                            String strQ25 = Convertitore.this.j0.q2();
                            Convertitore.this.j0.o2().setText(Convertitore.this.j0.r2());
                            Convertitore.this.j0.p2().setText(strQ25);
                            if (!Convertitore.this.j0.q2().equals(Convertitore.this.j0.r2())) {
                                Convertitore.this.a0.i(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.Q);
                                Convertitore.this.Z.f(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.j0.q2(), Convertitore.this.j0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                                Convertitore.this.j0.s2().setText(Convertitore.this.a0.m(Convertitore.this.j0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT25 = Convertitore.this.j0.t2();
                                wVar5 = Convertitore.this.a0;
                                string5 = Convertitore.this.j0.t2().getText().toString();
                                str5 = Convertitore.this.Q;
                            } else if (!Convertitore.this.j0.q2().isEmpty() && !Convertitore.this.j0.r2().isEmpty()) {
                                Convertitore.this.a0.i(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.Q);
                                Convertitore.this.j0.t2().setText(Convertitore.this.j0.s2().getText().toString());
                                Convertitore.this.j0.s2().setText(Convertitore.this.a0.m(Convertitore.this.j0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT25 = Convertitore.this.j0.t2();
                                wVar5 = Convertitore.this.a0;
                                string5 = Convertitore.this.j0.t2().getText().toString();
                                str5 = Convertitore.this.Q;
                            }
                            textViewT25.setText(wVar5.m(string5, str5));
                        }
                        Convertitore.this.Z.o0(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.getBaseContext());
                        uVar = Convertitore.this.Z;
                        buttonO2 = Convertitore.this.j0.o2();
                        buttonP2 = Convertitore.this.j0.p2();
                        convertitore = Convertitore.this;
                        break;
                    case 5:
                        if (!Convertitore.this.k0.o2().getText().toString().isEmpty() && !Convertitore.this.k0.p2().getText().toString().isEmpty()) {
                            String strQ26 = Convertitore.this.k0.q2();
                            Convertitore.this.k0.o2().setText(Convertitore.this.k0.r2());
                            Convertitore.this.k0.p2().setText(strQ26);
                            if (!Convertitore.this.k0.q2().equals(Convertitore.this.k0.r2())) {
                                Convertitore.this.a0.i(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.Q);
                                Convertitore.this.Z.i0(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.k0.q2(), Convertitore.this.k0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                                Convertitore.this.k0.s2().setText(Convertitore.this.a0.m(Convertitore.this.k0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT26 = Convertitore.this.k0.t2();
                                wVar6 = Convertitore.this.a0;
                                string6 = Convertitore.this.k0.t2().getText().toString();
                                str6 = Convertitore.this.Q;
                            } else if (!Convertitore.this.k0.q2().isEmpty() && !Convertitore.this.k0.r2().isEmpty()) {
                                Convertitore.this.a0.i(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.Q);
                                Convertitore.this.k0.t2().setText(Convertitore.this.k0.s2().getText().toString());
                                Convertitore.this.k0.s2().setText(Convertitore.this.a0.m(Convertitore.this.k0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT26 = Convertitore.this.k0.t2();
                                wVar6 = Convertitore.this.a0;
                                string6 = Convertitore.this.k0.t2().getText().toString();
                                str6 = Convertitore.this.Q;
                            }
                            textViewT26.setText(wVar6.m(string6, str6));
                        }
                        Convertitore.this.Z.o0(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.getBaseContext());
                        uVar = Convertitore.this.Z;
                        buttonO2 = Convertitore.this.k0.o2();
                        buttonP2 = Convertitore.this.k0.p2();
                        convertitore = Convertitore.this;
                        break;
                    case 6:
                        if (!Convertitore.this.l0.o2().getText().toString().isEmpty() && !Convertitore.this.l0.p2().getText().toString().isEmpty()) {
                            String strQ27 = Convertitore.this.l0.q2();
                            Convertitore.this.l0.o2().setText(Convertitore.this.l0.r2());
                            Convertitore.this.l0.p2().setText(strQ27);
                            if (!Convertitore.this.l0.q2().equals(Convertitore.this.l0.r2())) {
                                Convertitore.this.a0.i(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.Q);
                                Convertitore.this.Z.e0(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.l0.q2(), Convertitore.this.l0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                                Convertitore.this.l0.s2().setText(Convertitore.this.a0.m(Convertitore.this.l0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT27 = Convertitore.this.l0.t2();
                                wVar7 = Convertitore.this.a0;
                                string7 = Convertitore.this.l0.t2().getText().toString();
                                str7 = Convertitore.this.Q;
                            } else if (!Convertitore.this.l0.q2().isEmpty() && !Convertitore.this.l0.r2().isEmpty()) {
                                Convertitore.this.a0.i(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.Q);
                                Convertitore.this.l0.t2().setText(Convertitore.this.l0.s2().getText().toString());
                                Convertitore.this.l0.s2().setText(Convertitore.this.a0.m(Convertitore.this.l0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT27 = Convertitore.this.l0.t2();
                                wVar7 = Convertitore.this.a0;
                                string7 = Convertitore.this.l0.t2().getText().toString();
                                str7 = Convertitore.this.Q;
                            }
                            textViewT27.setText(wVar7.m(string7, str7));
                        }
                        Convertitore.this.Z.o0(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.getBaseContext());
                        uVar = Convertitore.this.Z;
                        buttonO2 = Convertitore.this.l0.o2();
                        buttonP2 = Convertitore.this.l0.p2();
                        convertitore = Convertitore.this;
                        break;
                    case 7:
                        if (!Convertitore.this.m0.o2().getText().toString().isEmpty() && !Convertitore.this.m0.p2().getText().toString().isEmpty()) {
                            String strQ28 = Convertitore.this.m0.q2();
                            Convertitore.this.m0.o2().setText(Convertitore.this.m0.r2());
                            Convertitore.this.m0.p2().setText(strQ28);
                            if (!Convertitore.this.m0.q2().equals(Convertitore.this.m0.r2())) {
                                Convertitore.this.a0.i(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.Q);
                                Convertitore.this.Z.f0(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.m0.q2(), Convertitore.this.m0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                                Convertitore.this.m0.s2().setText(Convertitore.this.a0.m(Convertitore.this.m0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT28 = Convertitore.this.m0.t2();
                                wVar8 = Convertitore.this.a0;
                                string8 = Convertitore.this.m0.t2().getText().toString();
                                str8 = Convertitore.this.Q;
                            } else if (!Convertitore.this.m0.q2().isEmpty() && !Convertitore.this.m0.r2().isEmpty()) {
                                Convertitore.this.a0.i(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.Q);
                                Convertitore.this.m0.t2().setText(Convertitore.this.m0.s2().getText().toString());
                                Convertitore.this.m0.s2().setText(Convertitore.this.a0.m(Convertitore.this.m0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT28 = Convertitore.this.m0.t2();
                                wVar8 = Convertitore.this.a0;
                                string8 = Convertitore.this.m0.t2().getText().toString();
                                str8 = Convertitore.this.Q;
                            }
                            textViewT28.setText(wVar8.m(string8, str8));
                        }
                        Convertitore.this.Z.o0(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.getBaseContext());
                        uVar = Convertitore.this.Z;
                        buttonO2 = Convertitore.this.m0.o2();
                        buttonP2 = Convertitore.this.m0.p2();
                        convertitore = Convertitore.this;
                        break;
                    case 8:
                        if (!Convertitore.this.n0.o2().getText().toString().isEmpty() && !Convertitore.this.n0.p2().getText().toString().isEmpty()) {
                            String strQ29 = Convertitore.this.n0.q2();
                            Convertitore.this.n0.o2().setText(Convertitore.this.n0.r2());
                            Convertitore.this.n0.p2().setText(strQ29);
                            if (!Convertitore.this.n0.q2().equals(Convertitore.this.n0.r2())) {
                                Convertitore.this.a0.i(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.Q);
                                Convertitore.this.Z.h(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.n0.q2(), Convertitore.this.n0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                                Convertitore.this.n0.s2().setText(Convertitore.this.a0.m(Convertitore.this.n0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT29 = Convertitore.this.n0.t2();
                                wVar9 = Convertitore.this.a0;
                                string9 = Convertitore.this.n0.t2().getText().toString();
                                str9 = Convertitore.this.Q;
                            } else if (!Convertitore.this.n0.q2().isEmpty() && !Convertitore.this.n0.r2().isEmpty()) {
                                Convertitore.this.a0.i(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.Q);
                                Convertitore.this.n0.t2().setText(Convertitore.this.n0.s2().getText().toString());
                                Convertitore.this.n0.s2().setText(Convertitore.this.a0.m(Convertitore.this.n0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT29 = Convertitore.this.n0.t2();
                                wVar9 = Convertitore.this.a0;
                                string9 = Convertitore.this.n0.t2().getText().toString();
                                str9 = Convertitore.this.Q;
                            }
                            textViewT29.setText(wVar9.m(string9, str9));
                        }
                        Convertitore.this.Z.o0(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.getBaseContext());
                        uVar = Convertitore.this.Z;
                        buttonO2 = Convertitore.this.n0.o2();
                        buttonP2 = Convertitore.this.n0.p2();
                        convertitore = Convertitore.this;
                        break;
                    case 9:
                        if (!Convertitore.this.o0.o2().getText().toString().isEmpty() && !Convertitore.this.o0.p2().getText().toString().isEmpty()) {
                            String strQ210 = Convertitore.this.o0.q2();
                            Convertitore.this.o0.o2().setText(Convertitore.this.o0.r2());
                            Convertitore.this.o0.p2().setText(strQ210);
                            if (!Convertitore.this.o0.q2().equals(Convertitore.this.o0.r2())) {
                                Convertitore.this.a0.i(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.Q);
                                Convertitore.this.Z.g(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.o0.q2(), Convertitore.this.o0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                                Convertitore.this.o0.s2().setText(Convertitore.this.a0.m(Convertitore.this.o0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT210 = Convertitore.this.o0.t2();
                                wVar10 = Convertitore.this.a0;
                                string10 = Convertitore.this.o0.t2().getText().toString();
                                str10 = Convertitore.this.Q;
                            } else if (!Convertitore.this.o0.q2().isEmpty() && !Convertitore.this.o0.r2().isEmpty()) {
                                Convertitore.this.a0.i(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.Q);
                                Convertitore.this.o0.t2().setText(Convertitore.this.o0.s2().getText().toString());
                                Convertitore.this.o0.s2().setText(Convertitore.this.a0.m(Convertitore.this.o0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT210 = Convertitore.this.o0.t2();
                                wVar10 = Convertitore.this.a0;
                                string10 = Convertitore.this.o0.t2().getText().toString();
                                str10 = Convertitore.this.Q;
                            }
                            textViewT210.setText(wVar10.m(string10, str10));
                        }
                        Convertitore.this.Z.o0(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.getBaseContext());
                        uVar = Convertitore.this.Z;
                        buttonO2 = Convertitore.this.o0.o2();
                        buttonP2 = Convertitore.this.o0.p2();
                        convertitore = Convertitore.this;
                        break;
                    case 10:
                        if (!Convertitore.this.p0.o2().getText().toString().isEmpty() && !Convertitore.this.p0.p2().getText().toString().isEmpty()) {
                            String strQ211 = Convertitore.this.p0.q2();
                            Convertitore.this.p0.o2().setText(Convertitore.this.p0.r2());
                            Convertitore.this.p0.p2().setText(strQ211);
                            if (!Convertitore.this.p0.q2().equals(Convertitore.this.p0.r2())) {
                                Convertitore.this.a0.i(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.Q);
                                Convertitore.this.Z.k0(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.p0.q2(), Convertitore.this.p0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                                Convertitore.this.p0.s2().setText(Convertitore.this.a0.m(Convertitore.this.p0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT211 = Convertitore.this.p0.t2();
                                wVar11 = Convertitore.this.a0;
                                string11 = Convertitore.this.p0.t2().getText().toString();
                                str11 = Convertitore.this.Q;
                            } else if (!Convertitore.this.p0.q2().isEmpty() && !Convertitore.this.p0.r2().isEmpty()) {
                                Convertitore.this.a0.i(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.Q);
                                Convertitore.this.p0.t2().setText(Convertitore.this.p0.s2().getText().toString());
                                Convertitore.this.p0.s2().setText(Convertitore.this.a0.m(Convertitore.this.p0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT211 = Convertitore.this.p0.t2();
                                wVar11 = Convertitore.this.a0;
                                string11 = Convertitore.this.p0.t2().getText().toString();
                                str11 = Convertitore.this.Q;
                            }
                            textViewT211.setText(wVar11.m(string11, str11));
                        }
                        Convertitore.this.Z.o0(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.getBaseContext());
                        uVar = Convertitore.this.Z;
                        buttonO2 = Convertitore.this.p0.o2();
                        buttonP2 = Convertitore.this.p0.p2();
                        convertitore = Convertitore.this;
                        break;
                    case 11:
                        if (!Convertitore.this.q0.o2().getText().toString().isEmpty() && !Convertitore.this.q0.p2().getText().toString().isEmpty()) {
                            String strQ212 = Convertitore.this.q0.q2();
                            Convertitore.this.q0.o2().setText(Convertitore.this.q0.r2());
                            Convertitore.this.q0.p2().setText(strQ212);
                            if (!Convertitore.this.q0.q2().equals(Convertitore.this.q0.r2())) {
                                Convertitore.this.a0.i(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.Q);
                                Convertitore.this.Z.j0(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.q0.q2(), Convertitore.this.q0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                                Convertitore.this.q0.s2().setText(Convertitore.this.a0.m(Convertitore.this.q0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT212 = Convertitore.this.q0.t2();
                                wVar12 = Convertitore.this.a0;
                                string12 = Convertitore.this.q0.t2().getText().toString();
                                str12 = Convertitore.this.Q;
                            } else if (!Convertitore.this.q0.q2().isEmpty() && !Convertitore.this.q0.r2().isEmpty()) {
                                Convertitore.this.a0.i(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.Q);
                                Convertitore.this.q0.t2().setText(Convertitore.this.q0.s2().getText().toString());
                                Convertitore.this.q0.s2().setText(Convertitore.this.a0.m(Convertitore.this.q0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT212 = Convertitore.this.q0.t2();
                                wVar12 = Convertitore.this.a0;
                                string12 = Convertitore.this.q0.t2().getText().toString();
                                str12 = Convertitore.this.Q;
                            }
                            textViewT212.setText(wVar12.m(string12, str12));
                        }
                        Convertitore.this.Z.o0(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.getBaseContext());
                        uVar = Convertitore.this.Z;
                        buttonO2 = Convertitore.this.q0.o2();
                        buttonP2 = Convertitore.this.q0.p2();
                        convertitore = Convertitore.this;
                        break;
                    case 12:
                        if (!Convertitore.this.r0.o2().getText().toString().isEmpty() && !Convertitore.this.r0.p2().getText().toString().isEmpty()) {
                            String strQ213 = Convertitore.this.r0.q2();
                            Convertitore.this.r0.o2().setText(Convertitore.this.r0.r2());
                            Convertitore.this.r0.p2().setText(strQ213);
                            if (!Convertitore.this.r0.q2().equals(Convertitore.this.r0.r2())) {
                                Convertitore.this.a0.i(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.Q);
                                Convertitore.this.Z.a(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.r0.q2(), Convertitore.this.r0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                                Convertitore.this.r0.s2().setText(Convertitore.this.a0.m(Convertitore.this.r0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT213 = Convertitore.this.r0.t2();
                                wVar13 = Convertitore.this.a0;
                                string13 = Convertitore.this.r0.t2().getText().toString();
                                str13 = Convertitore.this.Q;
                            } else if (!Convertitore.this.r0.q2().isEmpty() && !Convertitore.this.r0.r2().isEmpty()) {
                                Convertitore.this.a0.i(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.Q);
                                Convertitore.this.r0.t2().setText(Convertitore.this.r0.s2().getText().toString());
                                Convertitore.this.r0.s2().setText(Convertitore.this.a0.m(Convertitore.this.r0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT213 = Convertitore.this.r0.t2();
                                wVar13 = Convertitore.this.a0;
                                string13 = Convertitore.this.r0.t2().getText().toString();
                                str13 = Convertitore.this.Q;
                            }
                            textViewT213.setText(wVar13.m(string13, str13));
                        }
                        Convertitore.this.Z.o0(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.getBaseContext());
                        uVar = Convertitore.this.Z;
                        buttonO2 = Convertitore.this.r0.o2();
                        buttonP2 = Convertitore.this.r0.p2();
                        convertitore = Convertitore.this;
                        break;
                    case 13:
                        if (!Convertitore.this.s0.o2().getText().toString().isEmpty() && !Convertitore.this.s0.p2().getText().toString().isEmpty()) {
                            String strQ214 = Convertitore.this.s0.q2();
                            Convertitore.this.s0.o2().setText(Convertitore.this.s0.r2());
                            Convertitore.this.s0.p2().setText(strQ214);
                            if (!Convertitore.this.s0.q2().equals(Convertitore.this.s0.r2())) {
                                Convertitore.this.a0.i(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.Q);
                                Convertitore.this.Z.e(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.s0.q2(), Convertitore.this.s0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                                Convertitore.this.s0.s2().setText(Convertitore.this.a0.m(Convertitore.this.s0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT214 = Convertitore.this.s0.t2();
                                wVar14 = Convertitore.this.a0;
                                string14 = Convertitore.this.s0.t2().getText().toString();
                                str14 = Convertitore.this.Q;
                            } else if (!Convertitore.this.s0.q2().isEmpty() && !Convertitore.this.s0.r2().isEmpty()) {
                                Convertitore.this.a0.i(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.Q);
                                Convertitore.this.s0.t2().setText(Convertitore.this.s0.s2().getText().toString());
                                Convertitore.this.s0.s2().setText(Convertitore.this.a0.m(Convertitore.this.s0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT214 = Convertitore.this.s0.t2();
                                wVar14 = Convertitore.this.a0;
                                string14 = Convertitore.this.s0.t2().getText().toString();
                                str14 = Convertitore.this.Q;
                            }
                            textViewT214.setText(wVar14.m(string14, str14));
                        }
                        Convertitore.this.Z.o0(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.getBaseContext());
                        uVar = Convertitore.this.Z;
                        buttonO2 = Convertitore.this.s0.o2();
                        buttonP2 = Convertitore.this.s0.p2();
                        convertitore = Convertitore.this;
                        break;
                    case 14:
                        if (!Convertitore.this.t0.o2().getText().toString().isEmpty() && !Convertitore.this.t0.p2().getText().toString().isEmpty()) {
                            String strQ215 = Convertitore.this.t0.q2();
                            Convertitore.this.t0.o2().setText(Convertitore.this.t0.r2());
                            Convertitore.this.t0.p2().setText(strQ215);
                            if (!Convertitore.this.t0.q2().equals(Convertitore.this.t0.r2())) {
                                Convertitore.this.a0.i(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.Q);
                                Convertitore.this.Z.c(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.t0.q2(), Convertitore.this.t0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                                Convertitore.this.t0.s2().setText(Convertitore.this.a0.m(Convertitore.this.t0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT215 = Convertitore.this.t0.t2();
                                wVar15 = Convertitore.this.a0;
                                string15 = Convertitore.this.t0.t2().getText().toString();
                                str15 = Convertitore.this.Q;
                            } else if (!Convertitore.this.t0.q2().isEmpty() && !Convertitore.this.t0.r2().isEmpty()) {
                                Convertitore.this.a0.i(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.Q);
                                Convertitore.this.t0.t2().setText(Convertitore.this.t0.s2().getText().toString());
                                Convertitore.this.t0.s2().setText(Convertitore.this.a0.m(Convertitore.this.t0.s2().getText().toString(), Convertitore.this.Q));
                                textViewT215 = Convertitore.this.t0.t2();
                                wVar15 = Convertitore.this.a0;
                                string15 = Convertitore.this.t0.t2().getText().toString();
                                str15 = Convertitore.this.Q;
                            }
                            textViewT215.setText(wVar15.m(string15, str15));
                        }
                        Convertitore.this.Z.o0(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.getBaseContext());
                        uVar = Convertitore.this.Z;
                        buttonO2 = Convertitore.this.t0.o2();
                        buttonP2 = Convertitore.this.t0.p2();
                        convertitore = Convertitore.this;
                        break;
                    default:
                        return;
                }
                uVar.p0(buttonO2, buttonP2, convertitore.getBaseContext());
            } catch (NullPointerException | NumberFormatException unused) {
                Toast.makeText(Convertitore.this.W, "error", 0).show();
            }
        }
    }

    class u implements View.OnClickListener {
        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TextView textViewT2;
            if (Convertitore.this.P.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Convertitore.this.M.vibrate(VibrationEffect.createOneShot(40L, -1));
                } else {
                    Convertitore.this.M.vibrate(40L);
                }
            }
            try {
                switch (Convertitore.this.c0.getSelectedTabPosition()) {
                    case 0:
                        Convertitore.this.f0.s2().setText("");
                        textViewT2 = Convertitore.this.f0.t2();
                        break;
                    case 1:
                        Convertitore.this.g0.s2().setText("");
                        textViewT2 = Convertitore.this.g0.t2();
                        break;
                    case 2:
                        Convertitore.this.h0.s2().setText("");
                        textViewT2 = Convertitore.this.h0.t2();
                        break;
                    case 3:
                        Convertitore.this.i0.s2().setText("");
                        textViewT2 = Convertitore.this.i0.t2();
                        break;
                    case 4:
                        Convertitore.this.j0.s2().setText("");
                        textViewT2 = Convertitore.this.j0.t2();
                        break;
                    case 5:
                        Convertitore.this.k0.s2().setText("");
                        textViewT2 = Convertitore.this.k0.t2();
                        break;
                    case 6:
                        Convertitore.this.l0.s2().setText("");
                        textViewT2 = Convertitore.this.l0.t2();
                        break;
                    case 7:
                        Convertitore.this.m0.s2().setText("");
                        textViewT2 = Convertitore.this.m0.t2();
                        break;
                    case 8:
                        Convertitore.this.n0.s2().setText("");
                        textViewT2 = Convertitore.this.n0.t2();
                        break;
                    case 9:
                        Convertitore.this.o0.s2().setText("");
                        textViewT2 = Convertitore.this.o0.t2();
                        break;
                    case 10:
                        Convertitore.this.p0.s2().setText("");
                        textViewT2 = Convertitore.this.p0.t2();
                        break;
                    case 11:
                        Convertitore.this.q0.s2().setText("");
                        textViewT2 = Convertitore.this.q0.t2();
                        break;
                    case 12:
                        Convertitore.this.r0.s2().setText("");
                        textViewT2 = Convertitore.this.r0.t2();
                        break;
                    case 13:
                        Convertitore.this.s0.s2().setText("");
                        textViewT2 = Convertitore.this.s0.t2();
                        break;
                    case 14:
                        Convertitore.this.t0.s2().setText("");
                        textViewT2 = Convertitore.this.t0.t2();
                        break;
                    default:
                        return;
                }
                textViewT2.setText("");
            } catch (NullPointerException | NumberFormatException unused) {
                Toast.makeText(Convertitore.this.W, "error", 0).show();
            }
        }
    }

    class v implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        v(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.u uVar;
            TextView textViewS2;
            TextView textViewT2;
            Convertitore convertitore;
            if (Convertitore.this.P.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Convertitore.this.M.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Convertitore.this.M.vibrate(20L);
                }
            }
            try {
                switch (Convertitore.this.c0.getSelectedTabPosition()) {
                    case 0:
                        Matcher matcher = Pattern.compile("^[-]").matcher(Convertitore.this.f0.s2().getText().toString());
                        Convertitore.this.a0.i(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.Q);
                        if (matcher.find()) {
                            Convertitore.this.f0.s2().setText(Convertitore.this.f0.s2().getText().toString().substring(1));
                        } else {
                            Convertitore.this.f0.s2().setText("-" + Convertitore.this.f0.s2().getText().toString());
                        }
                        if (!Convertitore.this.f0.q2().equals(Convertitore.this.f0.r2())) {
                            Convertitore.this.Z.c0(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.f0.q2(), Convertitore.this.f0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.f0.q2().isEmpty() && !Convertitore.this.f0.r2().isEmpty()) {
                            Convertitore.this.f0.t2().setText(Convertitore.this.f0.s2().getText().toString());
                        }
                        Convertitore.this.f0.s2().setText(Convertitore.this.a0.m(Convertitore.this.f0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.f0.t2().setText(Convertitore.this.a0.m(Convertitore.this.f0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.f0.s2();
                        textViewT2 = Convertitore.this.f0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 1:
                        Matcher matcher2 = Pattern.compile("^[-]").matcher(Convertitore.this.g0.s2().getText().toString());
                        Convertitore.this.a0.i(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.Q);
                        if (matcher2.find()) {
                            Convertitore.this.g0.s2().setText(Convertitore.this.g0.s2().getText().toString().substring(1));
                        } else {
                            Convertitore.this.g0.s2().setText("-" + Convertitore.this.g0.s2().getText().toString());
                        }
                        if (!Convertitore.this.g0.q2().equals(Convertitore.this.g0.r2())) {
                            Convertitore.this.Z.b(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.g0.q2(), Convertitore.this.g0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.g0.q2().isEmpty() && !Convertitore.this.g0.r2().isEmpty()) {
                            Convertitore.this.g0.t2().setText(Convertitore.this.g0.s2().getText().toString());
                        }
                        Convertitore.this.g0.s2().setText(Convertitore.this.a0.m(Convertitore.this.g0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.g0.t2().setText(Convertitore.this.a0.m(Convertitore.this.g0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.g0.s2();
                        textViewT2 = Convertitore.this.g0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 2:
                        Matcher matcher3 = Pattern.compile("^[-]").matcher(Convertitore.this.h0.s2().getText().toString());
                        Convertitore.this.a0.i(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.Q);
                        if (matcher3.find()) {
                            Convertitore.this.h0.s2().setText(Convertitore.this.h0.s2().getText().toString().substring(1));
                        } else {
                            Convertitore.this.h0.s2().setText("-" + Convertitore.this.h0.s2().getText().toString());
                        }
                        if (!Convertitore.this.h0.q2().equals(Convertitore.this.h0.r2())) {
                            Convertitore.this.Z.l0(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.h0.q2(), Convertitore.this.h0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.h0.q2().isEmpty() && !Convertitore.this.h0.r2().isEmpty()) {
                            Convertitore.this.h0.t2().setText(Convertitore.this.h0.s2().getText().toString());
                        }
                        Convertitore.this.h0.s2().setText(Convertitore.this.a0.m(Convertitore.this.h0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.h0.t2().setText(Convertitore.this.a0.m(Convertitore.this.h0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.h0.s2();
                        textViewT2 = Convertitore.this.h0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 3:
                        Matcher matcher4 = Pattern.compile("^[-]").matcher(Convertitore.this.i0.s2().getText().toString());
                        Convertitore.this.a0.i(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.Q);
                        if (matcher4.find()) {
                            Convertitore.this.i0.s2().setText(Convertitore.this.i0.s2().getText().toString().substring(1));
                        } else {
                            Convertitore.this.i0.s2().setText("-" + Convertitore.this.i0.s2().getText().toString());
                        }
                        if (!Convertitore.this.i0.q2().equals(Convertitore.this.i0.r2())) {
                            Convertitore.this.Z.d0(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.i0.q2(), Convertitore.this.i0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.i0.q2().isEmpty() && !Convertitore.this.i0.r2().isEmpty()) {
                            Convertitore.this.i0.t2().setText(Convertitore.this.i0.s2().getText().toString());
                        }
                        Convertitore.this.i0.s2().setText(Convertitore.this.a0.m(Convertitore.this.i0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.i0.t2().setText(Convertitore.this.a0.m(Convertitore.this.i0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.i0.s2();
                        textViewT2 = Convertitore.this.i0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 4:
                        Matcher matcher5 = Pattern.compile("^[-]").matcher(Convertitore.this.j0.s2().getText().toString());
                        Convertitore.this.a0.i(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.Q);
                        if (matcher5.find()) {
                            Convertitore.this.j0.s2().setText(Convertitore.this.j0.s2().getText().toString().substring(1));
                        } else {
                            Convertitore.this.j0.s2().setText("-" + Convertitore.this.j0.s2().getText().toString());
                        }
                        if (!Convertitore.this.j0.q2().equals(Convertitore.this.j0.r2())) {
                            Convertitore.this.Z.f(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.j0.q2(), Convertitore.this.j0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.j0.q2().isEmpty() && !Convertitore.this.j0.r2().isEmpty()) {
                            Convertitore.this.j0.t2().setText(Convertitore.this.j0.s2().getText().toString());
                        }
                        Convertitore.this.j0.s2().setText(Convertitore.this.a0.m(Convertitore.this.j0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.j0.t2().setText(Convertitore.this.a0.m(Convertitore.this.j0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.j0.s2();
                        textViewT2 = Convertitore.this.j0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 5:
                        Matcher matcher6 = Pattern.compile("^[-]").matcher(Convertitore.this.k0.s2().getText().toString());
                        Convertitore.this.a0.i(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.Q);
                        if (matcher6.find()) {
                            Convertitore.this.k0.s2().setText(Convertitore.this.k0.s2().getText().toString().substring(1));
                        } else {
                            Convertitore.this.k0.s2().setText("-" + Convertitore.this.k0.s2().getText().toString());
                        }
                        if (!Convertitore.this.k0.q2().equals(Convertitore.this.k0.r2())) {
                            Convertitore.this.Z.i0(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.k0.q2(), Convertitore.this.k0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.k0.q2().isEmpty() && !Convertitore.this.k0.r2().isEmpty()) {
                            Convertitore.this.k0.t2().setText(Convertitore.this.k0.s2().getText().toString());
                        }
                        Convertitore.this.k0.s2().setText(Convertitore.this.a0.m(Convertitore.this.k0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.k0.t2().setText(Convertitore.this.a0.m(Convertitore.this.k0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.k0.s2();
                        textViewT2 = Convertitore.this.k0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 6:
                        Matcher matcher7 = Pattern.compile("^[-]").matcher(Convertitore.this.l0.s2().getText().toString());
                        Convertitore.this.a0.i(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.Q);
                        if (matcher7.find()) {
                            Convertitore.this.l0.s2().setText(Convertitore.this.l0.s2().getText().toString().substring(1));
                        } else {
                            Convertitore.this.l0.s2().setText("-" + Convertitore.this.l0.s2().getText().toString());
                        }
                        if (!Convertitore.this.l0.q2().equals(Convertitore.this.l0.r2())) {
                            Convertitore.this.Z.e0(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.l0.q2(), Convertitore.this.l0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.l0.q2().isEmpty() && !Convertitore.this.l0.r2().isEmpty()) {
                            Convertitore.this.l0.t2().setText(Convertitore.this.l0.s2().getText().toString());
                        }
                        Convertitore.this.l0.s2().setText(Convertitore.this.a0.m(Convertitore.this.l0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.l0.t2().setText(Convertitore.this.a0.m(Convertitore.this.l0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.l0.s2();
                        textViewT2 = Convertitore.this.l0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 7:
                        Matcher matcher8 = Pattern.compile("^[-]").matcher(Convertitore.this.m0.s2().getText().toString());
                        Convertitore.this.a0.i(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.Q);
                        if (matcher8.find()) {
                            Convertitore.this.m0.s2().setText(Convertitore.this.m0.s2().getText().toString().substring(1));
                        } else {
                            Convertitore.this.m0.s2().setText("-" + Convertitore.this.m0.s2().getText().toString());
                        }
                        if (!Convertitore.this.m0.q2().equals(Convertitore.this.m0.r2())) {
                            Convertitore.this.Z.f0(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.m0.q2(), Convertitore.this.m0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.m0.q2().isEmpty() && !Convertitore.this.m0.r2().isEmpty()) {
                            Convertitore.this.m0.t2().setText(Convertitore.this.m0.s2().getText().toString());
                        }
                        Convertitore.this.m0.s2().setText(Convertitore.this.a0.m(Convertitore.this.m0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.m0.t2().setText(Convertitore.this.a0.m(Convertitore.this.m0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.m0.s2();
                        textViewT2 = Convertitore.this.m0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 8:
                        Matcher matcher9 = Pattern.compile("^[-]").matcher(Convertitore.this.n0.s2().getText().toString());
                        Convertitore.this.a0.i(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.Q);
                        if (matcher9.find()) {
                            Convertitore.this.n0.s2().setText(Convertitore.this.n0.s2().getText().toString().substring(1));
                        } else {
                            Convertitore.this.n0.s2().setText("-" + Convertitore.this.n0.s2().getText().toString());
                        }
                        if (!Convertitore.this.n0.q2().equals(Convertitore.this.n0.r2())) {
                            Convertitore.this.Z.h(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.n0.q2(), Convertitore.this.n0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.n0.q2().isEmpty() && !Convertitore.this.n0.r2().isEmpty()) {
                            Convertitore.this.n0.t2().setText(Convertitore.this.n0.s2().getText().toString());
                        }
                        Convertitore.this.n0.s2().setText(Convertitore.this.a0.m(Convertitore.this.n0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.n0.t2().setText(Convertitore.this.a0.m(Convertitore.this.n0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.n0.s2();
                        textViewT2 = Convertitore.this.n0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 9:
                        Matcher matcher10 = Pattern.compile("^[-]").matcher(Convertitore.this.o0.s2().getText().toString());
                        Convertitore.this.a0.i(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.Q);
                        if (matcher10.find()) {
                            Convertitore.this.o0.s2().setText(Convertitore.this.o0.s2().getText().toString().substring(1));
                        } else {
                            Convertitore.this.o0.s2().setText("-" + Convertitore.this.o0.s2().getText().toString());
                        }
                        if (!Convertitore.this.o0.q2().equals(Convertitore.this.o0.r2())) {
                            Convertitore.this.Z.g(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.o0.q2(), Convertitore.this.o0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.o0.q2().isEmpty() && !Convertitore.this.o0.r2().isEmpty()) {
                            Convertitore.this.o0.t2().setText(Convertitore.this.o0.s2().getText().toString());
                        }
                        Convertitore.this.o0.s2().setText(Convertitore.this.a0.m(Convertitore.this.o0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.o0.t2().setText(Convertitore.this.a0.m(Convertitore.this.o0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.o0.s2();
                        textViewT2 = Convertitore.this.o0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 10:
                        Matcher matcher11 = Pattern.compile("^[-]").matcher(Convertitore.this.p0.s2().getText().toString());
                        Convertitore.this.a0.i(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.Q);
                        if (matcher11.find()) {
                            Convertitore.this.p0.s2().setText(Convertitore.this.p0.s2().getText().toString().substring(1));
                        } else {
                            Convertitore.this.p0.s2().setText("-" + Convertitore.this.p0.s2().getText().toString());
                        }
                        if (!Convertitore.this.p0.q2().equals(Convertitore.this.p0.r2())) {
                            Convertitore.this.Z.k0(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.p0.q2(), Convertitore.this.p0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.p0.q2().isEmpty() && !Convertitore.this.p0.r2().isEmpty()) {
                            Convertitore.this.p0.t2().setText(Convertitore.this.p0.s2().getText().toString());
                        }
                        Convertitore.this.p0.s2().setText(Convertitore.this.a0.m(Convertitore.this.p0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.p0.t2().setText(Convertitore.this.a0.m(Convertitore.this.p0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.p0.s2();
                        textViewT2 = Convertitore.this.p0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 11:
                        Matcher matcher12 = Pattern.compile("^[-]").matcher(Convertitore.this.q0.s2().getText().toString());
                        Convertitore.this.a0.i(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.Q);
                        if (matcher12.find()) {
                            Convertitore.this.q0.s2().setText(Convertitore.this.q0.s2().getText().toString().substring(1));
                        } else {
                            Convertitore.this.q0.s2().setText("-" + Convertitore.this.q0.s2().getText().toString());
                        }
                        if (!Convertitore.this.q0.q2().equals(Convertitore.this.q0.r2())) {
                            Convertitore.this.Z.j0(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.q0.q2(), Convertitore.this.q0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.q0.q2().isEmpty() && !Convertitore.this.q0.r2().isEmpty()) {
                            Convertitore.this.q0.t2().setText(Convertitore.this.q0.s2().getText().toString());
                        }
                        Convertitore.this.q0.s2().setText(Convertitore.this.a0.m(Convertitore.this.q0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.q0.t2().setText(Convertitore.this.a0.m(Convertitore.this.q0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.q0.s2();
                        textViewT2 = Convertitore.this.q0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 12:
                        Matcher matcher13 = Pattern.compile("^[-]").matcher(Convertitore.this.r0.s2().getText().toString());
                        Convertitore.this.a0.i(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.Q);
                        if (matcher13.find()) {
                            Convertitore.this.r0.s2().setText(Convertitore.this.r0.s2().getText().toString().substring(1));
                        } else {
                            Convertitore.this.r0.s2().setText("-" + Convertitore.this.r0.s2().getText().toString());
                        }
                        if (!Convertitore.this.r0.q2().equals(Convertitore.this.r0.r2())) {
                            Convertitore.this.Z.a(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.r0.q2(), Convertitore.this.r0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.r0.q2().isEmpty() && !Convertitore.this.r0.r2().isEmpty()) {
                            Convertitore.this.r0.t2().setText(Convertitore.this.r0.s2().getText().toString());
                        }
                        Convertitore.this.r0.s2().setText(Convertitore.this.a0.m(Convertitore.this.r0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.r0.t2().setText(Convertitore.this.a0.m(Convertitore.this.r0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.r0.s2();
                        textViewT2 = Convertitore.this.r0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 13:
                        Matcher matcher14 = Pattern.compile("^[-]").matcher(Convertitore.this.s0.s2().getText().toString());
                        Convertitore.this.a0.i(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.Q);
                        if (matcher14.find()) {
                            Convertitore.this.s0.s2().setText(Convertitore.this.s0.s2().getText().toString().substring(1));
                        } else {
                            Convertitore.this.s0.s2().setText("-" + Convertitore.this.s0.s2().getText().toString());
                        }
                        if (!Convertitore.this.s0.q2().equals(Convertitore.this.s0.r2())) {
                            Convertitore.this.Z.e(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.s0.q2(), Convertitore.this.s0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.q0.q2().isEmpty() && !Convertitore.this.s0.r2().isEmpty()) {
                            Convertitore.this.s0.t2().setText(Convertitore.this.s0.s2().getText().toString());
                        }
                        Convertitore.this.s0.s2().setText(Convertitore.this.a0.m(Convertitore.this.s0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.s0.t2().setText(Convertitore.this.a0.m(Convertitore.this.s0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.s0.s2();
                        textViewT2 = Convertitore.this.s0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 14:
                        Matcher matcher15 = Pattern.compile("^[-]").matcher(Convertitore.this.t0.s2().getText().toString());
                        Convertitore.this.a0.i(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.Q);
                        if (matcher15.find()) {
                            Convertitore.this.t0.s2().setText(Convertitore.this.t0.s2().getText().toString().substring(1));
                        } else {
                            Convertitore.this.t0.s2().setText("-" + Convertitore.this.t0.s2().getText().toString());
                        }
                        if (!Convertitore.this.t0.q2().equals(Convertitore.this.t0.r2())) {
                            Convertitore.this.Z.c(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.t0.q2(), Convertitore.this.t0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.t0.q2().isEmpty() && !Convertitore.this.t0.r2().isEmpty()) {
                            Convertitore.this.t0.t2().setText(Convertitore.this.t0.s2().getText().toString());
                        }
                        Convertitore.this.t0.s2().setText(Convertitore.this.a0.m(Convertitore.this.t0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.t0.t2().setText(Convertitore.this.a0.m(Convertitore.this.t0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.t0.s2();
                        textViewT2 = Convertitore.this.t0.t2();
                        convertitore = Convertitore.this;
                        break;
                    default:
                        return;
                }
                uVar.o0(textViewS2, textViewT2, convertitore.getBaseContext());
            } catch (NullPointerException | NumberFormatException unused) {
                Toast.makeText(Convertitore.this.W, "error", 0).show();
            }
        }
    }

    class w implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        w(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.u uVar;
            TextView textViewS2;
            TextView textViewT2;
            Convertitore convertitore;
            if (Convertitore.this.P.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Convertitore.this.M.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Convertitore.this.M.vibrate(20L);
                }
            }
            try {
                switch (Convertitore.this.c0.getSelectedTabPosition()) {
                    case 0:
                        Convertitore.this.a0.i(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), ".", 0, Convertitore.this.f0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.f0.q2().equals(Convertitore.this.f0.r2())) {
                            Convertitore.this.Z.c0(Convertitore.this.f0.s2(), Convertitore.this.f0.t2(), Convertitore.this.f0.q2(), Convertitore.this.f0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.f0.q2().isEmpty() && !Convertitore.this.f0.r2().isEmpty()) {
                            Convertitore.this.f0.t2().setText(Convertitore.this.f0.s2().getText().toString());
                        }
                        Convertitore.this.f0.s2().setText(Convertitore.this.a0.m(Convertitore.this.f0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.f0.t2().setText(Convertitore.this.a0.m(Convertitore.this.f0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.f0.s2();
                        textViewT2 = Convertitore.this.f0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 1:
                        Convertitore.this.a0.i(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), ".", 1, Convertitore.this.g0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.g0.q2().equals(Convertitore.this.g0.r2())) {
                            Convertitore.this.Z.b(Convertitore.this.g0.s2(), Convertitore.this.g0.t2(), Convertitore.this.g0.q2(), Convertitore.this.g0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.g0.q2().isEmpty() && !Convertitore.this.g0.r2().isEmpty()) {
                            Convertitore.this.g0.t2().setText(Convertitore.this.g0.s2().getText().toString());
                        }
                        Convertitore.this.g0.s2().setText(Convertitore.this.a0.m(Convertitore.this.g0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.g0.t2().setText(Convertitore.this.a0.m(Convertitore.this.g0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.g0.s2();
                        textViewT2 = Convertitore.this.g0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 2:
                        Convertitore.this.a0.i(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), ".", 2, Convertitore.this.h0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.h0.q2().equals(Convertitore.this.h0.r2())) {
                            Convertitore.this.Z.l0(Convertitore.this.h0.s2(), Convertitore.this.h0.t2(), Convertitore.this.h0.q2(), Convertitore.this.h0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.h0.q2().isEmpty() && !Convertitore.this.h0.r2().isEmpty()) {
                            Convertitore.this.h0.t2().setText(Convertitore.this.h0.s2().getText().toString());
                        }
                        Convertitore.this.h0.s2().setText(Convertitore.this.a0.m(Convertitore.this.h0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.h0.t2().setText(Convertitore.this.a0.m(Convertitore.this.h0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.h0.s2();
                        textViewT2 = Convertitore.this.h0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 3:
                        Convertitore.this.a0.i(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), ".", 3, Convertitore.this.i0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.i0.q2().equals(Convertitore.this.i0.r2())) {
                            Convertitore.this.Z.d0(Convertitore.this.i0.s2(), Convertitore.this.i0.t2(), Convertitore.this.i0.q2(), Convertitore.this.i0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.i0.q2().isEmpty() && !Convertitore.this.i0.r2().isEmpty()) {
                            Convertitore.this.i0.t2().setText(Convertitore.this.i0.s2().getText().toString());
                        }
                        Convertitore.this.i0.s2().setText(Convertitore.this.a0.m(Convertitore.this.i0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.i0.t2().setText(Convertitore.this.a0.m(Convertitore.this.i0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.i0.s2();
                        textViewT2 = Convertitore.this.i0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 4:
                        Convertitore.this.a0.i(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), ".", 4, Convertitore.this.j0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.j0.q2().equals(Convertitore.this.j0.r2())) {
                            Convertitore.this.Z.f(Convertitore.this.j0.s2(), Convertitore.this.j0.t2(), Convertitore.this.j0.q2(), Convertitore.this.j0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.j0.q2().isEmpty() && !Convertitore.this.j0.r2().isEmpty()) {
                            Convertitore.this.j0.t2().setText(Convertitore.this.j0.s2().getText().toString());
                        }
                        Convertitore.this.j0.s2().setText(Convertitore.this.a0.m(Convertitore.this.j0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.j0.t2().setText(Convertitore.this.a0.m(Convertitore.this.j0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.j0.s2();
                        textViewT2 = Convertitore.this.j0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 5:
                        Convertitore.this.a0.i(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), ".", 5, Convertitore.this.k0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.k0.q2().equals(Convertitore.this.k0.r2())) {
                            Convertitore.this.Z.i0(Convertitore.this.k0.s2(), Convertitore.this.k0.t2(), Convertitore.this.k0.q2(), Convertitore.this.k0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.k0.q2().isEmpty() && !Convertitore.this.k0.r2().isEmpty()) {
                            Convertitore.this.k0.t2().setText(Convertitore.this.k0.s2().getText().toString());
                        }
                        Convertitore.this.k0.s2().setText(Convertitore.this.a0.m(Convertitore.this.k0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.k0.t2().setText(Convertitore.this.a0.m(Convertitore.this.k0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.k0.s2();
                        textViewT2 = Convertitore.this.k0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 6:
                        Convertitore.this.a0.i(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), ".", 6, Convertitore.this.l0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.l0.q2().equals(Convertitore.this.l0.r2())) {
                            Convertitore.this.Z.e0(Convertitore.this.l0.s2(), Convertitore.this.l0.t2(), Convertitore.this.l0.q2(), Convertitore.this.l0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.l0.q2().isEmpty() && !Convertitore.this.l0.r2().isEmpty()) {
                            Convertitore.this.l0.t2().setText(Convertitore.this.l0.s2().getText().toString());
                        }
                        Convertitore.this.l0.s2().setText(Convertitore.this.a0.m(Convertitore.this.l0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.l0.t2().setText(Convertitore.this.a0.m(Convertitore.this.l0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.l0.s2();
                        textViewT2 = Convertitore.this.l0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 7:
                        Convertitore.this.a0.i(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), ".", 7, Convertitore.this.m0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.m0.q2().equals(Convertitore.this.m0.r2())) {
                            Convertitore.this.Z.f0(Convertitore.this.m0.s2(), Convertitore.this.m0.t2(), Convertitore.this.m0.q2(), Convertitore.this.m0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.m0.q2().isEmpty() && !Convertitore.this.m0.r2().isEmpty()) {
                            Convertitore.this.m0.t2().setText(Convertitore.this.m0.s2().getText().toString());
                        }
                        Convertitore.this.m0.s2().setText(Convertitore.this.a0.m(Convertitore.this.m0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.m0.t2().setText(Convertitore.this.a0.m(Convertitore.this.m0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.m0.s2();
                        textViewT2 = Convertitore.this.m0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 8:
                        Convertitore.this.a0.i(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), ".", 8, Convertitore.this.n0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.n0.q2().equals(Convertitore.this.n0.r2())) {
                            Convertitore.this.Z.h(Convertitore.this.n0.s2(), Convertitore.this.n0.t2(), Convertitore.this.n0.q2(), Convertitore.this.n0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.n0.q2().isEmpty() && !Convertitore.this.n0.r2().isEmpty()) {
                            Convertitore.this.n0.t2().setText(Convertitore.this.n0.s2().getText().toString());
                        }
                        Convertitore.this.n0.s2().setText(Convertitore.this.a0.m(Convertitore.this.n0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.n0.t2().setText(Convertitore.this.a0.m(Convertitore.this.n0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.n0.s2();
                        textViewT2 = Convertitore.this.n0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 9:
                        Convertitore.this.a0.i(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), ".", 9, Convertitore.this.o0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.o0.q2().equals(Convertitore.this.o0.r2())) {
                            Convertitore.this.Z.g(Convertitore.this.o0.s2(), Convertitore.this.o0.t2(), Convertitore.this.o0.q2(), Convertitore.this.o0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.o0.q2().isEmpty() && !Convertitore.this.o0.r2().isEmpty()) {
                            Convertitore.this.o0.t2().setText(Convertitore.this.o0.s2().getText().toString());
                        }
                        Convertitore.this.o0.s2().setText(Convertitore.this.a0.m(Convertitore.this.o0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.o0.t2().setText(Convertitore.this.a0.m(Convertitore.this.o0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.o0.s2();
                        textViewT2 = Convertitore.this.o0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 10:
                        Convertitore.this.a0.i(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), ".", 10, Convertitore.this.p0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.p0.q2().equals(Convertitore.this.p0.r2())) {
                            Convertitore.this.Z.k0(Convertitore.this.p0.s2(), Convertitore.this.p0.t2(), Convertitore.this.p0.q2(), Convertitore.this.p0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.p0.q2().isEmpty() && !Convertitore.this.p0.r2().isEmpty()) {
                            Convertitore.this.p0.t2().setText(Convertitore.this.p0.s2().getText().toString());
                        }
                        Convertitore.this.p0.s2().setText(Convertitore.this.a0.m(Convertitore.this.p0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.p0.t2().setText(Convertitore.this.a0.m(Convertitore.this.p0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.p0.s2();
                        textViewT2 = Convertitore.this.p0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 11:
                        Convertitore.this.a0.i(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), ".", 11, Convertitore.this.q0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.q0.q2().equals(Convertitore.this.q0.r2())) {
                            Convertitore.this.Z.j0(Convertitore.this.q0.s2(), Convertitore.this.q0.t2(), Convertitore.this.q0.q2(), Convertitore.this.q0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.q0.q2().isEmpty() && !Convertitore.this.q0.r2().isEmpty()) {
                            Convertitore.this.q0.t2().setText(Convertitore.this.q0.s2().getText().toString());
                        }
                        Convertitore.this.q0.s2().setText(Convertitore.this.a0.m(Convertitore.this.q0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.q0.t2().setText(Convertitore.this.a0.m(Convertitore.this.q0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.q0.s2();
                        textViewT2 = Convertitore.this.q0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 12:
                        Convertitore.this.a0.i(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), ".", 12, Convertitore.this.r0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.r0.q2().equals(Convertitore.this.r0.r2())) {
                            Convertitore.this.Z.a(Convertitore.this.r0.s2(), Convertitore.this.r0.t2(), Convertitore.this.r0.q2(), Convertitore.this.r0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.r0.q2().isEmpty() && !Convertitore.this.r0.r2().isEmpty()) {
                            Convertitore.this.r0.t2().setText(Convertitore.this.r0.s2().getText().toString());
                        }
                        Convertitore.this.r0.s2().setText(Convertitore.this.a0.m(Convertitore.this.r0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.r0.t2().setText(Convertitore.this.a0.m(Convertitore.this.r0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.r0.s2();
                        textViewT2 = Convertitore.this.r0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 13:
                        Convertitore.this.a0.i(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), ".", 13, Convertitore.this.s0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.s0.q2().equals(Convertitore.this.s0.r2())) {
                            Convertitore.this.Z.e(Convertitore.this.s0.s2(), Convertitore.this.s0.t2(), Convertitore.this.s0.q2(), Convertitore.this.s0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.s0.q2().isEmpty() && !Convertitore.this.s0.r2().isEmpty()) {
                            Convertitore.this.s0.t2().setText(Convertitore.this.s0.s2().getText().toString());
                        }
                        Convertitore.this.s0.s2().setText(Convertitore.this.a0.m(Convertitore.this.s0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.s0.t2().setText(Convertitore.this.a0.m(Convertitore.this.s0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.s0.s2();
                        textViewT2 = Convertitore.this.s0.t2();
                        convertitore = Convertitore.this;
                        break;
                    case 14:
                        Convertitore.this.a0.i(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.Q);
                        Convertitore.this.Z.a0(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), ".", 14, Convertitore.this.t0, this.d, Convertitore.this.a0, Convertitore.this.getBaseContext());
                        if (!Convertitore.this.t0.q2().equals(Convertitore.this.t0.r2())) {
                            Convertitore.this.Z.c(Convertitore.this.t0.s2(), Convertitore.this.t0.t2(), Convertitore.this.t0.q2(), Convertitore.this.t0.r2(), this.d, Convertitore.this.a0, Convertitore.this.b0, Convertitore.this.getBaseContext());
                        } else if (!Convertitore.this.t0.q2().isEmpty() && !Convertitore.this.t0.r2().isEmpty()) {
                            Convertitore.this.t0.t2().setText(Convertitore.this.t0.s2().getText().toString());
                        }
                        Convertitore.this.t0.s2().setText(Convertitore.this.a0.m(Convertitore.this.t0.s2().getText().toString(), Convertitore.this.Q));
                        Convertitore.this.t0.t2().setText(Convertitore.this.a0.m(Convertitore.this.t0.t2().getText().toString(), Convertitore.this.Q));
                        uVar = Convertitore.this.Z;
                        textViewS2 = Convertitore.this.t0.s2();
                        textViewT2 = Convertitore.this.t0.t2();
                        convertitore = Convertitore.this;
                        break;
                    default:
                        return;
                }
                uVar.o0(textViewS2, textViewT2, convertitore.getBaseContext());
            } catch (NullPointerException | NumberFormatException unused) {
                Toast.makeText(Convertitore.this.W, "error", 0).show();
            }
        }
    }

    private void c0(TextView textView) {
        String string = textView.getText().toString();
        SpannableString spannableString = new SpannableString(string);
        Matcher matcher = Pattern.compile("[\\\\^]|[×]|[%]|[+]|[-]|[÷]|[√]").matcher(string);
        while (matcher.find()) {
            int r2 = matcher.start();
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(this.a1));
            if (r2 < 0) {
                break;
            } else {
                spannableString.setSpan(foregroundColorSpan, r2, (matcher.end() + r2) - matcher.start(), 33);
            }
        }
        textView.setText(spannableString);
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

    public void additemsaved(View view) {
        com.gp7.easycalculator.u uVar;
        TextView textViewS2;
        TextView textViewT2;
        if (this.P.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.M.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.M.vibrate(20L);
            }
        }
        Locale.setDefault(Locale.US);
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormatSymbols.setGroupingSeparator(',');
        DecimalFormat decimalFormat = new DecimalFormat("#,###.########", decimalFormatSymbols);
        long jLongValue = ((Long) ((View) view.getParent().getParent()).getTag()).longValue();
        SQLiteDatabase readableDatabase = this.U.getReadableDatabase();
        this.T = readableDatabase;
        Cursor cursorI = this.U.i(jLongValue, readableDatabase);
        while (cursorI.moveToNext()) {
            try {
                String strG = this.a0.g(cursorI.getString(0), "Default");
                switch (this.c0.getSelectedTabPosition()) {
                    case 0:
                        this.f0.s2().setText(strG);
                        if (!this.f0.q2().equals(this.f0.r2())) {
                            this.Z.c0(this.f0.s2(), this.f0.t2(), this.f0.q2(), this.f0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.f0.q2().isEmpty() && !this.f0.r2().isEmpty()) {
                            this.f0.t2().setText(this.f0.s2().getText().toString());
                        }
                        this.f0.s2().setText(this.a0.m(this.f0.s2().getText().toString(), this.Q));
                        this.f0.t2().setText(this.a0.m(this.f0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.f0.s2();
                        textViewT2 = this.f0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                    case 1:
                        this.g0.s2().setText(strG);
                        if (!this.g0.q2().equals(this.g0.r2())) {
                            this.Z.b(this.g0.s2(), this.g0.t2(), this.g0.q2(), this.g0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.g0.q2().isEmpty() && !this.g0.r2().isEmpty()) {
                            this.g0.t2().setText(this.g0.s2().getText().toString());
                        }
                        this.g0.s2().setText(this.a0.m(this.g0.s2().getText().toString(), this.Q));
                        this.g0.t2().setText(this.a0.m(this.g0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.g0.s2();
                        textViewT2 = this.g0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                    case 2:
                        this.h0.s2().setText(strG);
                        if (!this.h0.q2().equals(this.h0.r2())) {
                            this.Z.l0(this.h0.s2(), this.h0.t2(), this.h0.q2(), this.h0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.h0.q2().isEmpty() && !this.h0.r2().isEmpty()) {
                            this.h0.t2().setText(this.h0.s2().getText().toString());
                        }
                        this.h0.s2().setText(this.a0.m(this.h0.s2().getText().toString(), this.Q));
                        this.h0.t2().setText(this.a0.m(this.h0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.h0.s2();
                        textViewT2 = this.h0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                    case 3:
                        this.i0.s2().setText(strG);
                        if (!this.i0.q2().equals(this.i0.r2())) {
                            this.Z.d0(this.i0.s2(), this.i0.t2(), this.i0.q2(), this.i0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.i0.q2().isEmpty() && !this.i0.r2().isEmpty()) {
                            this.i0.t2().setText(this.i0.s2().getText().toString());
                        }
                        this.i0.s2().setText(this.a0.m(this.i0.s2().getText().toString(), this.Q));
                        this.i0.t2().setText(this.a0.m(this.i0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.i0.s2();
                        textViewT2 = this.i0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                    case 4:
                        this.j0.s2().setText(strG);
                        if (!this.j0.q2().equals(this.j0.r2())) {
                            this.Z.f(this.j0.s2(), this.j0.t2(), this.j0.q2(), this.j0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.j0.q2().isEmpty() && !this.j0.r2().isEmpty()) {
                            this.j0.t2().setText(this.j0.s2().getText().toString());
                        }
                        this.j0.s2().setText(this.a0.m(this.j0.s2().getText().toString(), this.Q));
                        this.j0.t2().setText(this.a0.m(this.j0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.j0.s2();
                        textViewT2 = this.j0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                    case 5:
                        this.k0.s2().setText(strG);
                        if (!this.k0.q2().equals(this.k0.r2())) {
                            this.Z.i0(this.k0.s2(), this.k0.t2(), this.k0.q2(), this.k0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.k0.q2().isEmpty() && !this.k0.r2().isEmpty()) {
                            this.k0.t2().setText(this.k0.s2().getText().toString());
                        }
                        this.k0.s2().setText(this.a0.m(this.k0.s2().getText().toString(), this.Q));
                        this.k0.t2().setText(this.a0.m(this.k0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.k0.s2();
                        textViewT2 = this.k0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                    case 6:
                        this.l0.s2().setText(strG);
                        if (!this.l0.q2().equals(this.l0.r2())) {
                            this.Z.e0(this.l0.s2(), this.l0.t2(), this.l0.q2(), this.l0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.l0.q2().isEmpty() && !this.l0.r2().isEmpty()) {
                            this.l0.t2().setText(this.l0.s2().getText().toString());
                        }
                        this.l0.s2().setText(this.a0.m(this.l0.s2().getText().toString(), this.Q));
                        this.l0.t2().setText(this.a0.m(this.l0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.l0.s2();
                        textViewT2 = this.l0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                    case 7:
                        this.m0.s2().setText(strG);
                        if (!this.m0.q2().equals(this.m0.r2())) {
                            this.Z.f0(this.m0.s2(), this.m0.t2(), this.m0.q2(), this.m0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.m0.q2().isEmpty() && !this.m0.r2().isEmpty()) {
                            this.m0.t2().setText(this.m0.s2().getText().toString());
                        }
                        this.m0.s2().setText(this.a0.m(this.m0.s2().getText().toString(), this.Q));
                        this.m0.t2().setText(this.a0.m(this.m0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.m0.s2();
                        textViewT2 = this.m0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                    case 8:
                        this.n0.s2().setText(strG);
                        if (!this.n0.q2().equals(this.n0.r2())) {
                            this.Z.h(this.n0.s2(), this.n0.t2(), this.n0.q2(), this.n0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.n0.q2().isEmpty() && !this.n0.r2().isEmpty()) {
                            this.n0.t2().setText(this.n0.s2().getText().toString());
                        }
                        this.n0.s2().setText(this.a0.m(this.n0.s2().getText().toString(), this.Q));
                        this.n0.t2().setText(this.a0.m(this.n0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.n0.s2();
                        textViewT2 = this.n0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                    case 9:
                        this.o0.s2().setText(strG);
                        if (!this.o0.q2().equals(this.o0.r2())) {
                            this.Z.g(this.o0.s2(), this.o0.t2(), this.o0.q2(), this.o0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.o0.q2().isEmpty() && !this.o0.r2().isEmpty()) {
                            this.o0.t2().setText(this.o0.s2().getText().toString());
                        }
                        this.o0.s2().setText(this.a0.m(this.o0.s2().getText().toString(), this.Q));
                        this.o0.t2().setText(this.a0.m(this.o0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.o0.s2();
                        textViewT2 = this.o0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                    case 10:
                        this.p0.s2().setText(strG);
                        if (!this.p0.q2().equals(this.p0.r2())) {
                            this.Z.k0(this.p0.s2(), this.p0.t2(), this.p0.q2(), this.p0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.p0.q2().isEmpty() && !this.p0.r2().isEmpty()) {
                            this.p0.t2().setText(this.p0.s2().getText().toString());
                        }
                        this.p0.s2().setText(this.a0.m(this.p0.s2().getText().toString(), this.Q));
                        this.p0.t2().setText(this.a0.m(this.p0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.p0.s2();
                        textViewT2 = this.p0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                    case 11:
                        this.q0.s2().setText(strG);
                        if (!this.q0.q2().equals(this.q0.r2())) {
                            this.Z.j0(this.q0.s2(), this.q0.t2(), this.q0.q2(), this.q0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.q0.q2().isEmpty() && !this.q0.r2().isEmpty()) {
                            this.q0.t2().setText(this.q0.s2().getText().toString());
                        }
                        this.q0.s2().setText(this.a0.m(this.q0.s2().getText().toString(), this.Q));
                        this.q0.t2().setText(this.a0.m(this.q0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.q0.s2();
                        textViewT2 = this.q0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                    case 12:
                        this.r0.s2().setText(strG);
                        if (!this.r0.q2().equals(this.r0.r2())) {
                            this.Z.a(this.r0.s2(), this.r0.t2(), this.r0.q2(), this.r0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.r0.q2().isEmpty() && !this.r0.r2().isEmpty()) {
                            this.r0.t2().setText(this.r0.s2().getText().toString());
                        }
                        this.r0.s2().setText(this.a0.m(this.r0.s2().getText().toString(), this.Q));
                        this.r0.t2().setText(this.a0.m(this.r0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.r0.s2();
                        textViewT2 = this.r0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                    case 13:
                        this.s0.s2().setText(strG);
                        if (!this.s0.q2().equals(this.s0.r2())) {
                            this.Z.e(this.s0.s2(), this.s0.t2(), this.s0.q2(), this.s0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.s0.q2().isEmpty() && !this.s0.r2().isEmpty()) {
                            this.s0.t2().setText(this.s0.s2().getText().toString());
                        }
                        this.s0.s2().setText(this.a0.m(this.s0.s2().getText().toString(), this.Q));
                        this.s0.t2().setText(this.a0.m(this.s0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.s0.s2();
                        textViewT2 = this.s0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                    case 14:
                        this.t0.s2().setText(strG);
                        if (!this.t0.q2().equals(this.t0.r2())) {
                            this.Z.c(this.t0.s2(), this.t0.t2(), this.t0.q2(), this.t0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.t0.q2().isEmpty() && !this.t0.r2().isEmpty()) {
                            this.t0.t2().setText(this.t0.s2().getText().toString());
                        }
                        this.t0.s2().setText(this.a0.m(this.t0.s2().getText().toString(), this.Q));
                        this.t0.t2().setText(this.a0.m(this.t0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.t0.s2();
                        textViewT2 = this.t0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                }
            } catch (NumberFormatException | EmptyStackException unused) {
                Toast.makeText(this.W, "error", 0).show();
            }
        }
        this.X.h();
    }

    public void ckmemory(View view) {
        com.gp7.easycalculator.c cVar;
        Long lValueOf;
        SQLiteDatabase sQLiteDatabase;
        String str;
        if (this.P.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.M.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.M.vibrate(20L);
            }
        }
        CheckBox checkBox = (CheckBox) view;
        this.C = checkBox;
        long jLongValue = ((Long) ((View) checkBox.getParent().getParent()).getTag()).longValue();
        if (this.C.isChecked()) {
            this.C.setBackground(getDrawable(R.drawable.ic_pin_test_ck));
            cVar = this.U;
            lValueOf = Long.valueOf(jLongValue);
            sQLiteDatabase = this.T;
            str = "Y";
        } else {
            this.C.setBackground(getDrawable(R.drawable.ic_pin_test));
            cVar = this.U;
            lValueOf = Long.valueOf(jLongValue);
            sQLiteDatabase = this.T;
            str = "N";
        }
        cVar.l(lValueOf, str, sQLiteDatabase);
    }

    public void deleteallCONV(View view) {
        if (this.P.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.M.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.M.vibrate(20L);
            }
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.memoriaCONV);
        if (viewGroup.getChildCount() > 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage(getResources().getString(R.string.DeleteAllMemory));
            builder.setTitle(getResources().getString(R.string.AlertTitle));
            builder.setCancelable(false);
            builder.setPositiveButton(getResources().getString(R.string.AlertSI), new n(viewGroup));
            builder.setNegativeButton(getResources().getString(R.string.AlertNO), new o());
            builder.create().show();
        }
    }

    public void deleteitemsaved(View view) {
        long jLongValue = ((Long) ((View) view.getParent().getParent()).getTag()).longValue();
        CheckBox checkBox = (CheckBox) ((LinearLayout) ((LinearLayout) view.getParent().getParent()).getChildAt(0)).getChildAt(1);
        this.C = checkBox;
        if (checkBox.isChecked()) {
            Toast.makeText(this, getResources().getString(R.string.calcoloprotetto), 1).show();
        } else {
            ((ViewGroup) findViewById(R.id.memoriaCONV)).removeView((View) view.getParent().getParent());
            SQLiteDatabase readableDatabase = this.U.getReadableDatabase();
            this.T = readableDatabase;
            this.U.f(jLongValue, readableDatabase);
        }
        if (this.P.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.M.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.M.vibrate(20L);
            }
        }
    }

    public void e0(ViewPager viewPager) throws Resources.NotFoundException {
        this.e0.y(this.f0, getResources().getString(R.string.Tab1), this.u0);
        this.e0.y(this.g0, getResources().getString(R.string.Tab2), this.v0);
        this.e0.y(this.h0, getResources().getString(R.string.Tab3), this.w0);
        this.e0.y(this.i0, getResources().getString(R.string.Tab4), this.x0);
        this.e0.y(this.j0, getResources().getString(R.string.Tab5), this.y0);
        this.e0.y(this.k0, getResources().getString(R.string.Tab6), this.z0);
        this.e0.y(this.l0, getResources().getString(R.string.Tab7), this.A0);
        this.e0.y(this.m0, getResources().getString(R.string.Tab8), this.B0);
        this.e0.y(this.n0, getResources().getString(R.string.Tab9), this.C0);
        this.e0.y(this.o0, getResources().getString(R.string.Tab10), this.D0);
        this.e0.y(this.p0, getResources().getString(R.string.Tab11), this.E0);
        this.e0.y(this.q0, getResources().getString(R.string.Tab12), this.F0);
        this.e0.y(this.r0, getResources().getString(R.string.Tab13), this.G0);
        this.e0.y(this.s0, getResources().getString(R.string.Tab14), this.H0);
        this.e0.y(this.t0, getResources().getString(R.string.Tab15), this.I0);
        viewPager.setAdapter(this.e0);
    }

    public void filterMemoryCONV(View view) {
        for (int r0 = 0; r0 < this.R.getChildCount(); r0++) {
            LinearLayout linearLayout = (LinearLayout) this.R.getChildAt(r0);
            if (((CheckBox) ((LinearLayout) linearLayout.getChildAt(0)).getChildAt(1)).isChecked()) {
                this.g1 = "no";
            } else {
                linearLayout.setVisibility(8);
                this.f1 = "SI";
            }
        }
        if (this.f1.equals("SI")) {
            this.D.setVisibility(0);
        }
        if (this.g1.equals("si")) {
            Toast.makeText(this, getResources().getString(R.string.nocalcoliprotetti), 1).show();
        }
        if (this.P.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.M.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.M.vibrate(20L);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (h1 + 2500 > System.currentTimeMillis()) {
            this.U.close();
            super.onBackPressed();
        } else {
            Toast.makeText(this, getResources().getString(R.string.doubleclick), 0).show();
            h1 = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:176:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0960  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03fa  */
    @Override // androidx.appcompat.app.e, androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.j, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onCreate(android.os.Bundle r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 2622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.Convertitore.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dc  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onCreateOptionsMenu(android.view.Menu r17) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.Convertitore.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    @Override // androidx.appcompat.app.e, androidx.fragment.app.d, android.app.Activity
    protected void onDestroy() {
        SharedPreferences.Editor editorEdit = getSharedPreferences(getString(R.string.pref_file), 0).edit();
        editorEdit.putInt(getString(R.string.TabPosition), this.c0.getSelectedTabPosition());
        editorEdit.apply();
        this.I.y1(this);
        this.U.close();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        SharedPreferences.Editor editorEdit = getSharedPreferences(getString(R.string.pref_file), 0).edit();
        SharedPreferences.Editor editorEdit2 = getSharedPreferences("apprater", 0).edit();
        switch (menuItem.getItemId()) {
            case R.id.CLASSIC_conv /* 2131296269 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "classic");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Classic", 0).show();
                finish();
                startActivity(new Intent(this, (Class<?>) Convertitore.class));
                return true;
            case R.id.ELEGANT_conv /* 2131296299 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "elegant");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Elegant", 0).show();
                finish();
                startActivity(new Intent(this, (Class<?>) Convertitore.class));
                return true;
            case R.id.Exit_conv /* 2131296306 */:
                this.U.close();
                finish();
                return true;
            case R.id.IVAfromConverter /* 2131296320 */:
                startActivity(new Intent(this, (Class<?>) CalcoloIVA.class));
                finish();
                try {
                    if (this.K != null && this.K.f()) {
                        this.K.o();
                    }
                } catch (NullPointerException e2) {
                    e2.printStackTrace();
                }
                return true;
            case R.id.LIGHT_conv /* 2131296326 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "light");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Light", 0).show();
                finish();
                startActivity(new Intent(this, (Class<?>) Convertitore.class));
                return true;
            case R.id.MINIMAL_conv /* 2131296335 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "minimal");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Minimal", 0).show();
                finish();
                startActivity(new Intent(this, (Class<?>) Convertitore.class));
                return true;
            case R.id.NEON_conv /* 2131296341 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "neon");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Dark", 0).show();
                finish();
                startActivity(new Intent(this, (Class<?>) Convertitore.class));
                return true;
            case R.id.STAR_conv /* 2131296358 */:
                com.gp7.easycalculator.a.b(this, editorEdit2, menuItem, this.N);
                menuItem.setVisible(false);
                return true;
            case R.id.ScontofromConverter /* 2131296365 */:
                startActivity(new Intent(this, (Class<?>) Sconto.class));
                finish();
                try {
                    if (this.K != null && this.K.f()) {
                        this.K.o();
                    }
                } catch (NullPointerException e3) {
                    e3.printStackTrace();
                }
                return true;
            case R.id.Setting_conv /* 2131296371 */:
                startActivity(new Intent(this, (Class<?>) Setting.class));
                return true;
            case R.id.Sharami_conv /* 2131296377 */:
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", getResources().getString(R.string.downloadApp) + "https://play.google.com/store/apps/details?id=" + com.gp7.easycalculator.b.f7045b);
                intent.setType("text/plain");
                startActivity(intent);
                return true;
            case R.id.gift_conv /* 2131296605 */:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                if (this.G.b(this.W).equals("si")) {
                    if (!this.O.equals("UNKNOWN")) {
                        this.I.u1("ca-app-pub-8629550575650531/8524153209", new e.a().d(AdMobAdapter.class, this.Y).f());
                    }
                    builder.setTitle(getResources().getString(R.string.title_activity_settings));
                    builder.setMessage(getResources().getString(R.string.message_video_premio));
                    builder.setNegativeButton(getResources().getString(R.string.no_grazie), new k());
                    builder.setPositiveButton(getResources().getString(R.string.testo_bottone_tutorial), new p());
                    builder.create().show();
                }
                return true;
            case R.id.gotoSpesafromconv /* 2131296612 */:
                startActivity(new Intent(this, (Class<?>) Spesa.class));
                finish();
                try {
                    if (this.K != null && this.K.f()) {
                        this.K.o();
                    }
                } catch (NullPointerException e4) {
                    e4.printStackTrace();
                }
                return true;
            case R.id.gotoTipfromcconv /* 2131296617 */:
                startActivity(new Intent(this, (Class<?>) TipCalculator.class));
                finish();
                try {
                    if (this.K != null && this.K.f()) {
                        this.K.o();
                    }
                } catch (NullPointerException e5) {
                    e5.printStackTrace();
                }
                return true;
            case R.id.gotocalculatorfromConv /* 2131296622 */:
                startActivity(new Intent(this, (Class<?>) MainActivity.class));
                finish();
                try {
                    if (this.K != null && this.K.f()) {
                        this.K.o();
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
        this.I.D1(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    protected void onResume() {
        com.gp7.easycalculator.u uVar;
        TextView textViewS2;
        TextView textViewT2;
        this.I.w1(this);
        Locale.setDefault(Locale.US);
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormatSymbols.setGroupingSeparator(',');
        DecimalFormat decimalFormat = new DecimalFormat("#,###.########", decimalFormatSymbols);
        SharedPreferences sharedPreferences = getSharedPreferences(getString(R.string.pref_file), 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        this.Q = sharedPreferences.getString(getString(R.string.notazione_scelta), "Default");
        this.d1 = sharedPreferences.getString(getString(R.string.operator_color), "si");
        this.P = sharedPreferences.getString(getString(R.string.vibrazione_memorizzata), "no");
        this.L = sharedPreferences.getString(getString(R.string.ScreenONoption_memorizzata), "no");
        this.Z0 = sharedPreferences.getString(getString(R.string.stile_option), "si");
        if (this.L.equals("no")) {
            getWindow().clearFlags(128);
        }
        if (this.L.equals("si")) {
            getWindow().addFlags(128);
        }
        ((Button) findViewById(R.id.puntoCONV)).setText(this.Q.equals("Italiana") ? "," : ".");
        if (sharedPreferences.getString(getString(R.string.calcolovolanteEseguito), "no").equals("si")) {
            String strU0 = this.Z.u0(sharedPreferences.getString(getString(R.string.calcolovolante), ""), decimalFormat);
            try {
                switch (this.c0.getSelectedTabPosition()) {
                    case 0:
                        this.f0.s2().setText(strU0);
                        if (!this.f0.q2().equals(this.f0.r2())) {
                            this.Z.c0(this.f0.s2(), this.f0.t2(), this.f0.q2(), this.f0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.f0.q2().isEmpty() && !this.f0.r2().isEmpty()) {
                            this.f0.t2().setText(this.f0.s2().getText().toString());
                        }
                        this.f0.s2().setText(this.a0.m(this.f0.s2().getText().toString(), this.Q));
                        this.f0.t2().setText(this.a0.m(this.f0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.f0.s2();
                        textViewT2 = this.f0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                    case 1:
                        this.g0.s2().setText(strU0);
                        if (!this.g0.q2().equals(this.g0.r2())) {
                            this.Z.b(this.g0.s2(), this.g0.t2(), this.g0.q2(), this.g0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.g0.q2().isEmpty() && !this.g0.r2().isEmpty()) {
                            this.g0.t2().setText(this.g0.s2().getText().toString());
                        }
                        this.g0.s2().setText(this.a0.m(this.g0.s2().getText().toString(), this.Q));
                        this.g0.t2().setText(this.a0.m(this.g0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.g0.s2();
                        textViewT2 = this.g0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                    case 2:
                        this.h0.s2().setText(strU0);
                        if (!this.h0.q2().equals(this.h0.r2())) {
                            this.Z.l0(this.h0.s2(), this.h0.t2(), this.h0.q2(), this.h0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.h0.q2().isEmpty() && !this.h0.r2().isEmpty()) {
                            this.h0.t2().setText(this.h0.s2().getText().toString());
                        }
                        this.h0.s2().setText(this.a0.m(this.h0.s2().getText().toString(), this.Q));
                        this.h0.t2().setText(this.a0.m(this.h0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.h0.s2();
                        textViewT2 = this.h0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                    case 3:
                        this.i0.s2().setText(strU0);
                        if (!this.i0.q2().equals(this.i0.r2())) {
                            this.Z.d0(this.i0.s2(), this.i0.t2(), this.i0.q2(), this.i0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.i0.q2().isEmpty() && !this.i0.r2().isEmpty()) {
                            this.i0.t2().setText(this.i0.s2().getText().toString());
                        }
                        this.i0.s2().setText(this.a0.m(this.i0.s2().getText().toString(), this.Q));
                        this.i0.t2().setText(this.a0.m(this.i0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.i0.s2();
                        textViewT2 = this.i0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                    case 4:
                        this.j0.s2().setText(strU0);
                        if (!this.j0.q2().equals(this.j0.r2())) {
                            this.Z.f(this.j0.s2(), this.j0.t2(), this.j0.q2(), this.j0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.j0.q2().isEmpty() && !this.j0.r2().isEmpty()) {
                            this.j0.t2().setText(this.j0.s2().getText().toString());
                        }
                        this.j0.s2().setText(this.a0.m(this.j0.s2().getText().toString(), this.Q));
                        this.j0.t2().setText(this.a0.m(this.j0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.j0.s2();
                        textViewT2 = this.j0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                    case 5:
                        this.k0.s2().setText(strU0);
                        if (!this.k0.q2().equals(this.k0.r2())) {
                            this.Z.i0(this.k0.s2(), this.k0.t2(), this.k0.q2(), this.k0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.k0.q2().isEmpty() && !this.k0.r2().isEmpty()) {
                            this.k0.t2().setText(this.k0.s2().getText().toString());
                        }
                        this.k0.s2().setText(this.a0.m(this.k0.s2().getText().toString(), this.Q));
                        this.k0.t2().setText(this.a0.m(this.k0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.k0.s2();
                        textViewT2 = this.k0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                    case 6:
                        this.l0.s2().setText(strU0);
                        if (!this.l0.q2().equals(this.l0.r2())) {
                            this.Z.e0(this.l0.s2(), this.l0.t2(), this.l0.q2(), this.l0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.l0.q2().isEmpty() && !this.l0.r2().isEmpty()) {
                            this.l0.t2().setText(this.l0.s2().getText().toString());
                        }
                        this.l0.s2().setText(this.a0.m(this.l0.s2().getText().toString(), this.Q));
                        this.l0.t2().setText(this.a0.m(this.l0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.l0.s2();
                        textViewT2 = this.l0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                    case 7:
                        this.m0.s2().setText(strU0);
                        if (!this.m0.q2().equals(this.m0.r2())) {
                            this.Z.f0(this.m0.s2(), this.m0.t2(), this.m0.q2(), this.m0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.m0.q2().isEmpty() && !this.m0.r2().isEmpty()) {
                            this.m0.t2().setText(this.m0.s2().getText().toString());
                        }
                        this.m0.s2().setText(this.a0.m(this.m0.s2().getText().toString(), this.Q));
                        this.m0.t2().setText(this.a0.m(this.m0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.m0.s2();
                        textViewT2 = this.m0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                    case 8:
                        this.n0.s2().setText(strU0);
                        if (!this.n0.q2().equals(this.n0.r2())) {
                            this.Z.h(this.n0.s2(), this.n0.t2(), this.n0.q2(), this.n0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.n0.q2().isEmpty() && !this.n0.r2().isEmpty()) {
                            this.n0.t2().setText(this.n0.s2().getText().toString());
                        }
                        this.n0.s2().setText(this.a0.m(this.n0.s2().getText().toString(), this.Q));
                        this.n0.t2().setText(this.a0.m(this.n0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.n0.s2();
                        textViewT2 = this.n0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                    case 9:
                        this.o0.s2().setText(strU0);
                        if (!this.o0.q2().equals(this.o0.r2())) {
                            this.Z.g(this.o0.s2(), this.o0.t2(), this.o0.q2(), this.o0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.o0.q2().isEmpty() && !this.o0.r2().isEmpty()) {
                            this.o0.t2().setText(this.o0.s2().getText().toString());
                        }
                        this.o0.s2().setText(this.a0.m(this.o0.s2().getText().toString(), this.Q));
                        this.o0.t2().setText(this.a0.m(this.o0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.o0.s2();
                        textViewT2 = this.o0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                    case 10:
                        this.p0.s2().setText(strU0);
                        if (!this.p0.q2().equals(this.p0.r2())) {
                            this.Z.k0(this.p0.s2(), this.p0.t2(), this.p0.q2(), this.p0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.p0.q2().isEmpty() && !this.p0.r2().isEmpty()) {
                            this.p0.t2().setText(this.p0.s2().getText().toString());
                        }
                        this.p0.s2().setText(this.a0.m(this.p0.s2().getText().toString(), this.Q));
                        this.p0.t2().setText(this.a0.m(this.p0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.p0.s2();
                        textViewT2 = this.p0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                    case 11:
                        this.q0.s2().setText(strU0);
                        if (!this.q0.q2().equals(this.q0.r2())) {
                            this.Z.j0(this.q0.s2(), this.q0.t2(), this.q0.q2(), this.q0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.q0.q2().isEmpty() && !this.q0.r2().isEmpty()) {
                            this.q0.t2().setText(this.q0.s2().getText().toString());
                        }
                        this.q0.s2().setText(this.a0.m(this.q0.s2().getText().toString(), this.Q));
                        this.q0.t2().setText(this.a0.m(this.q0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.q0.s2();
                        textViewT2 = this.q0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                    case 12:
                        this.r0.s2().setText(strU0);
                        if (!this.r0.q2().equals(this.r0.r2())) {
                            this.Z.a(this.r0.s2(), this.r0.t2(), this.r0.q2(), this.r0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.r0.q2().isEmpty() && !this.r0.r2().isEmpty()) {
                            this.r0.t2().setText(this.r0.s2().getText().toString());
                        }
                        this.r0.s2().setText(this.a0.m(this.r0.s2().getText().toString(), this.Q));
                        this.r0.t2().setText(this.a0.m(this.r0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.r0.s2();
                        textViewT2 = this.r0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                    case 13:
                        this.s0.s2().setText(strU0);
                        if (!this.s0.q2().equals(this.s0.r2())) {
                            this.Z.e(this.s0.s2(), this.s0.t2(), this.s0.q2(), this.s0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.s0.q2().isEmpty() && !this.s0.r2().isEmpty()) {
                            this.s0.t2().setText(this.s0.s2().getText().toString());
                        }
                        this.s0.s2().setText(this.a0.m(this.s0.s2().getText().toString(), this.Q));
                        this.s0.t2().setText(this.a0.m(this.s0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.s0.s2();
                        textViewT2 = this.s0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                    case 14:
                        this.t0.s2().setText(strU0);
                        if (!this.t0.q2().equals(this.t0.r2())) {
                            this.Z.c(this.t0.s2(), this.t0.t2(), this.t0.q2(), this.t0.r2(), decimalFormat, this.a0, this.b0, getBaseContext());
                        } else if (!this.t0.q2().isEmpty() && !this.t0.r2().isEmpty()) {
                            this.t0.t2().setText(this.t0.s2().getText().toString());
                        }
                        this.t0.s2().setText(this.a0.m(this.t0.s2().getText().toString(), this.Q));
                        this.t0.t2().setText(this.a0.m(this.t0.t2().getText().toString(), this.Q));
                        uVar = this.Z;
                        textViewS2 = this.t0.s2();
                        textViewT2 = this.t0.t2();
                        uVar.o0(textViewS2, textViewT2, getBaseContext());
                        break;
                }
            } catch (NumberFormatException | EmptyStackException unused) {
                Toast.makeText(this.W, "error", 0).show();
            }
            editorEdit.putString(getString(R.string.calcolovolanteEseguito), "no");
            editorEdit.apply();
        }
        super.onResume();
    }

    public void shareitemsaved(View view) throws Resources.NotFoundException, IOException {
        if (this.P.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.M.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.M.vibrate(20L);
            }
        }
        LinearLayout linearLayout = (LinearLayout) view.getParent().getParent();
        View childAt = linearLayout.getChildAt(3);
        linearLayout.removeViewAt(3);
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

    public void undofilterMemoryCONV(View view) {
        if (this.D.getVisibility() != 8) {
            if (this.P.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    this.M.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    this.M.vibrate(20L);
                }
            }
            for (int r2 = 0; r2 < this.R.getChildCount(); r2++) {
                LinearLayout linearLayout = (LinearLayout) this.R.getChildAt(r2);
                if (!((CheckBox) ((LinearLayout) linearLayout.getChildAt(0)).getChildAt(1)).isChecked()) {
                    linearLayout.setVisibility(0);
                    this.f1 = "NO";
                    this.g1 = "si";
                    this.D.setVisibility(8);
                }
            }
        }
    }
}

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
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
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
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class Sconto extends androidx.appcompat.app.e {
    private static long D0;
    String A0;
    CheckBox C;
    ImageButton D;
    AdView J;
    private com.google.android.gms.ads.l K;
    float M;
    String N;
    private DrawerLayout O;
    String P;
    String Q;
    String R;
    String S;
    LinearLayout T;
    SQLiteDatabase V;
    com.gp7.easycalculator.c W;
    Cursor X;
    RadioButton Z;
    RadioButton a0;
    RadioButton b0;
    RadioButton c0;
    TextView d0;
    TextView e0;
    TextView f0;
    TextView g0;
    com.gp7.easycalculator.w h0;
    String i0;
    String j0;
    String k0;
    private com.google.android.gms.ads.k0.c l0;
    Vibrator m0;
    private FirebaseAnalytics n0;
    String o0;
    String p0;
    LinearLayout q0;
    ScrollView r0;
    String s0;
    RelativeLayout t0;
    CheckBox u0;
    CheckBox v0;
    String w0;
    int x0;
    int y0;
    int z0;
    b0 E = new b0();
    com.gp7.easycalculator.v F = new com.gp7.easycalculator.v();
    String G = "false";
    com.gp7.easycalculator.x H = new com.gp7.easycalculator.x();
    int I = 1;
    com.gp7.easycalculator.u L = new com.gp7.easycalculator.u();
    Context U = this;
    int Y = 1;
    String B0 = "NO";
    String C0 = "si";

    class a implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        a(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Sconto.this.h0.j(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, Sconto.this.o0);
                Sconto.this.L.N(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, "5", Sconto.this.Y, this.d, Sconto.this.h0, Sconto.this.getBaseContext());
                Sconto.this.Z.setText(Sconto.this.h0.m(Sconto.this.Z.getText().toString(), Sconto.this.o0));
                Sconto.this.a0.setText(Sconto.this.h0.m(Sconto.this.a0.getText().toString(), Sconto.this.o0));
                Sconto.this.e0.setText(Sconto.this.h0.m(Sconto.this.e0.getText().toString(), Sconto.this.o0));
                Sconto.this.d0.setText(Sconto.this.h0.m(Sconto.this.d0.getText().toString(), Sconto.this.o0));
                if (Sconto.this.b0.getVisibility() == 0) {
                    Sconto.this.b0.setText(Sconto.this.h0.m(Sconto.this.b0.getText().toString(), Sconto.this.o0));
                }
                if (Sconto.this.c0.getVisibility() == 0) {
                    Sconto.this.c0.setText(Sconto.this.h0.m(Sconto.this.c0.getText().toString(), Sconto.this.o0));
                }
                Sconto.this.L.q0(Sconto.this.Z, Sconto.this.a0, Sconto.this.e0, Sconto.this.d0, Sconto.this.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(Sconto.this.U, "error", 0).show();
            }
            if (Sconto.this.j0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Sconto.this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Sconto.this.m0.vibrate(20L);
                }
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
            try {
                Sconto.this.h0.j(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, Sconto.this.o0);
                Sconto.this.L.N(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, "6", Sconto.this.Y, this.d, Sconto.this.h0, Sconto.this.getBaseContext());
                Sconto.this.Z.setText(Sconto.this.h0.m(Sconto.this.Z.getText().toString(), Sconto.this.o0));
                Sconto.this.a0.setText(Sconto.this.h0.m(Sconto.this.a0.getText().toString(), Sconto.this.o0));
                Sconto.this.e0.setText(Sconto.this.h0.m(Sconto.this.e0.getText().toString(), Sconto.this.o0));
                Sconto.this.d0.setText(Sconto.this.h0.m(Sconto.this.d0.getText().toString(), Sconto.this.o0));
                if (Sconto.this.b0.getVisibility() == 0) {
                    Sconto.this.b0.setText(Sconto.this.h0.m(Sconto.this.b0.getText().toString(), Sconto.this.o0));
                }
                if (Sconto.this.c0.getVisibility() == 0) {
                    Sconto.this.c0.setText(Sconto.this.h0.m(Sconto.this.c0.getText().toString(), Sconto.this.o0));
                }
                Sconto.this.L.q0(Sconto.this.Z, Sconto.this.a0, Sconto.this.e0, Sconto.this.d0, Sconto.this.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(Sconto.this.U, "error", 0).show();
            }
            if (Sconto.this.j0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Sconto.this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Sconto.this.m0.vibrate(20L);
                }
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
            try {
                Sconto.this.h0.j(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, Sconto.this.o0);
                Sconto.this.L.N(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, "7", Sconto.this.Y, this.d, Sconto.this.h0, Sconto.this.getBaseContext());
                Sconto.this.Z.setText(Sconto.this.h0.m(Sconto.this.Z.getText().toString(), Sconto.this.o0));
                Sconto.this.a0.setText(Sconto.this.h0.m(Sconto.this.a0.getText().toString(), Sconto.this.o0));
                Sconto.this.e0.setText(Sconto.this.h0.m(Sconto.this.e0.getText().toString(), Sconto.this.o0));
                Sconto.this.d0.setText(Sconto.this.h0.m(Sconto.this.d0.getText().toString(), Sconto.this.o0));
                if (Sconto.this.b0.getVisibility() == 0) {
                    Sconto.this.b0.setText(Sconto.this.h0.m(Sconto.this.b0.getText().toString(), Sconto.this.o0));
                }
                if (Sconto.this.c0.getVisibility() == 0) {
                    Sconto.this.c0.setText(Sconto.this.h0.m(Sconto.this.c0.getText().toString(), Sconto.this.o0));
                }
                Sconto.this.L.q0(Sconto.this.Z, Sconto.this.a0, Sconto.this.e0, Sconto.this.d0, Sconto.this.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(Sconto.this.U, "error", 0).show();
            }
            if (Sconto.this.j0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Sconto.this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Sconto.this.m0.vibrate(20L);
                }
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
            try {
                Sconto.this.h0.j(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, Sconto.this.o0);
                Sconto.this.L.N(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, "8", Sconto.this.Y, this.d, Sconto.this.h0, Sconto.this.getBaseContext());
                Sconto.this.Z.setText(Sconto.this.h0.m(Sconto.this.Z.getText().toString(), Sconto.this.o0));
                Sconto.this.a0.setText(Sconto.this.h0.m(Sconto.this.a0.getText().toString(), Sconto.this.o0));
                Sconto.this.e0.setText(Sconto.this.h0.m(Sconto.this.e0.getText().toString(), Sconto.this.o0));
                Sconto.this.d0.setText(Sconto.this.h0.m(Sconto.this.d0.getText().toString(), Sconto.this.o0));
                if (Sconto.this.b0.getVisibility() == 0) {
                    Sconto.this.b0.setText(Sconto.this.h0.m(Sconto.this.b0.getText().toString(), Sconto.this.o0));
                }
                if (Sconto.this.c0.getVisibility() == 0) {
                    Sconto.this.c0.setText(Sconto.this.h0.m(Sconto.this.c0.getText().toString(), Sconto.this.o0));
                }
                Sconto.this.L.q0(Sconto.this.Z, Sconto.this.a0, Sconto.this.e0, Sconto.this.d0, Sconto.this.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(Sconto.this.U, "error", 0).show();
            }
            if (Sconto.this.j0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Sconto.this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Sconto.this.m0.vibrate(20L);
                }
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
            try {
                Sconto.this.h0.j(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, Sconto.this.o0);
                Sconto.this.L.N(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, "9", Sconto.this.Y, this.d, Sconto.this.h0, Sconto.this.getBaseContext());
                Sconto.this.Z.setText(Sconto.this.h0.m(Sconto.this.Z.getText().toString(), Sconto.this.o0));
                Sconto.this.a0.setText(Sconto.this.h0.m(Sconto.this.a0.getText().toString(), Sconto.this.o0));
                Sconto.this.e0.setText(Sconto.this.h0.m(Sconto.this.e0.getText().toString(), Sconto.this.o0));
                Sconto.this.d0.setText(Sconto.this.h0.m(Sconto.this.d0.getText().toString(), Sconto.this.o0));
                if (Sconto.this.b0.getVisibility() == 0) {
                    Sconto.this.b0.setText(Sconto.this.h0.m(Sconto.this.b0.getText().toString(), Sconto.this.o0));
                }
                if (Sconto.this.c0.getVisibility() == 0) {
                    Sconto.this.c0.setText(Sconto.this.h0.m(Sconto.this.c0.getText().toString(), Sconto.this.o0));
                }
                Sconto.this.L.q0(Sconto.this.Z, Sconto.this.a0, Sconto.this.e0, Sconto.this.d0, Sconto.this.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(Sconto.this.U, "error", 0).show();
            }
            if (Sconto.this.j0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Sconto.this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Sconto.this.m0.vibrate(20L);
                }
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
            try {
                Sconto.this.h0.j(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, Sconto.this.o0);
                Sconto.this.L.N(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, ".", Sconto.this.Y, this.d, Sconto.this.h0, Sconto.this.getBaseContext());
                Sconto.this.Z.setText(Sconto.this.h0.m(Sconto.this.Z.getText().toString(), Sconto.this.o0));
                Sconto.this.a0.setText(Sconto.this.h0.m(Sconto.this.a0.getText().toString(), Sconto.this.o0));
                Sconto.this.e0.setText(Sconto.this.h0.m(Sconto.this.e0.getText().toString(), Sconto.this.o0));
                Sconto.this.d0.setText(Sconto.this.h0.m(Sconto.this.d0.getText().toString(), Sconto.this.o0));
                if (Sconto.this.b0.getVisibility() == 0) {
                    Sconto.this.b0.setText(Sconto.this.h0.m(Sconto.this.b0.getText().toString(), Sconto.this.o0));
                }
                if (Sconto.this.c0.getVisibility() == 0) {
                    Sconto.this.c0.setText(Sconto.this.h0.m(Sconto.this.c0.getText().toString(), Sconto.this.o0));
                }
                Sconto.this.L.q0(Sconto.this.Z, Sconto.this.a0, Sconto.this.e0, Sconto.this.d0, Sconto.this.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(Sconto.this.U, "error", 0).show();
            }
            if (Sconto.this.j0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Sconto.this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Sconto.this.m0.vibrate(20L);
                }
            }
        }
    }

    class g implements View.OnClickListener {
        final /* synthetic */ SharedPreferences d;
        final /* synthetic */ Button e;
        final /* synthetic */ SharedPreferences.Editor f;
        final /* synthetic */ DecimalFormat g;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int r4) {
                g gVar = g.this;
                gVar.f.putString(Sconto.this.getResources().getString(R.string.Tutorial_sconto_percetuale), "no");
                g.this.f.apply();
                dialogInterface.cancel();
            }
        }

        g(SharedPreferences sharedPreferences, Button button, SharedPreferences.Editor editor, DecimalFormat decimalFormat) {
            this.d = sharedPreferences;
            this.e = button;
            this.f = editor;
            this.g = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (Sconto.this.j0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Sconto.this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Sconto.this.m0.vibrate(20L);
                }
            }
            Sconto sconto = Sconto.this;
            sconto.N = this.d.getString(sconto.getString(R.string.Tutorial_sconto_percetuale), "si");
            if (this.e.getText().toString().equals("...%") && Sconto.this.N.equals("si")) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Sconto.this);
                builder.setMessage(Sconto.this.getResources().getString(R.string.Suggerimento_calcolo_sconto_messaggio));
                builder.setTitle(Sconto.this.getResources().getString(R.string.Suggerimento_calcolo_iva));
                builder.setCancelable(false);
                builder.setPositiveButton(Sconto.this.getResources().getString(R.string.testo_bottone_tutorial), new a());
                builder.create().show();
                return;
            }
            try {
                if (this.e.getText().toString().equals("...%")) {
                    return;
                }
                Sconto.this.h0.j(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, Sconto.this.o0);
                Sconto.this.L.P(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, this.e.getText().toString().substring(0, this.e.getText().toString().length() - 2), Sconto.this.Y, this.g, Sconto.this.h0, Sconto.this.getBaseContext());
                Sconto.this.Z.setText(Sconto.this.h0.m(Sconto.this.Z.getText().toString(), Sconto.this.o0));
                Sconto.this.a0.setText(Sconto.this.h0.m(Sconto.this.a0.getText().toString(), Sconto.this.o0));
                Sconto.this.e0.setText(Sconto.this.h0.m(Sconto.this.e0.getText().toString(), Sconto.this.o0));
                Sconto.this.d0.setText(Sconto.this.h0.m(Sconto.this.d0.getText().toString(), Sconto.this.o0));
                if (Sconto.this.b0.getVisibility() == 0) {
                    Sconto.this.b0.setText(Sconto.this.h0.m(Sconto.this.b0.getText().toString(), Sconto.this.o0));
                }
                if (Sconto.this.c0.getVisibility() == 0) {
                    Sconto.this.c0.setText(Sconto.this.h0.m(Sconto.this.c0.getText().toString(), Sconto.this.o0));
                }
                Sconto.this.L.q0(Sconto.this.Z, Sconto.this.a0, Sconto.this.e0, Sconto.this.d0, Sconto.this.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(Sconto.this.U, "error", 0).show();
            }
        }
    }

    class h implements View.OnClickListener {
        final /* synthetic */ SharedPreferences d;
        final /* synthetic */ Button e;
        final /* synthetic */ SharedPreferences.Editor f;
        final /* synthetic */ DecimalFormat g;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int r4) {
                h hVar = h.this;
                hVar.f.putString(Sconto.this.getResources().getString(R.string.Tutorial_sconto_percetuale), "no");
                h.this.f.apply();
                dialogInterface.cancel();
            }
        }

        h(SharedPreferences sharedPreferences, Button button, SharedPreferences.Editor editor, DecimalFormat decimalFormat) {
            this.d = sharedPreferences;
            this.e = button;
            this.f = editor;
            this.g = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (Sconto.this.j0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Sconto.this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Sconto.this.m0.vibrate(20L);
                }
            }
            Sconto sconto = Sconto.this;
            sconto.N = this.d.getString(sconto.getString(R.string.Tutorial_sconto_percetuale), "si");
            if (this.e.getText().toString().equals("...%") && Sconto.this.N.equals("si")) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Sconto.this);
                builder.setMessage(Sconto.this.getResources().getString(R.string.Suggerimento_calcolo_sconto_messaggio));
                builder.setTitle(Sconto.this.getResources().getString(R.string.Suggerimento_calcolo_iva));
                builder.setCancelable(false);
                builder.setPositiveButton(Sconto.this.getResources().getString(R.string.testo_bottone_tutorial), new a());
                builder.create().show();
                return;
            }
            try {
                if (this.e.getText().toString().equals("...%")) {
                    return;
                }
                Sconto.this.h0.j(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, Sconto.this.o0);
                Sconto.this.L.P(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, this.e.getText().toString().substring(0, this.e.getText().toString().length() - 2), Sconto.this.Y, this.g, Sconto.this.h0, Sconto.this.getBaseContext());
                Sconto.this.Z.setText(Sconto.this.h0.m(Sconto.this.Z.getText().toString(), Sconto.this.o0));
                Sconto.this.a0.setText(Sconto.this.h0.m(Sconto.this.a0.getText().toString(), Sconto.this.o0));
                Sconto.this.e0.setText(Sconto.this.h0.m(Sconto.this.e0.getText().toString(), Sconto.this.o0));
                Sconto.this.d0.setText(Sconto.this.h0.m(Sconto.this.d0.getText().toString(), Sconto.this.o0));
                if (Sconto.this.b0.getVisibility() == 0) {
                    Sconto.this.b0.setText(Sconto.this.h0.m(Sconto.this.b0.getText().toString(), Sconto.this.o0));
                }
                if (Sconto.this.c0.getVisibility() == 0) {
                    Sconto.this.c0.setText(Sconto.this.h0.m(Sconto.this.c0.getText().toString(), Sconto.this.o0));
                }
                Sconto.this.L.q0(Sconto.this.Z, Sconto.this.a0, Sconto.this.e0, Sconto.this.d0, Sconto.this.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(Sconto.this.U, "error", 0).show();
            }
        }
    }

    class i implements View.OnLongClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ SharedPreferences.Editor e;

        class a implements SeekBar.OnSeekBarChangeListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TextView f7026a;

            a(TextView textView) {
                this.f7026a = textView;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int r2, boolean z) {
                this.f7026a.setText(String.valueOf(r2) + " %");
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        }

        class b implements DialogInterface.OnClickListener {
            final /* synthetic */ TextView d;

            b(TextView textView) {
                this.d = textView;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int r5) {
                if (Sconto.this.j0.equals("si")) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        Sconto.this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                    } else {
                        Sconto.this.m0.vibrate(20L);
                    }
                }
                i iVar = i.this;
                iVar.e.putString(Sconto.this.getResources().getString(R.string.sconto_percetualeUNO), this.d.getText().toString());
                i.this.e.commit();
                i.this.d.setText(this.d.getText().toString());
                dialogInterface.cancel();
            }
        }

        class c implements DialogInterface.OnClickListener {
            c() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int r5) {
                if (Sconto.this.j0.equals("si")) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        Sconto.this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                    } else {
                        Sconto.this.m0.vibrate(20L);
                    }
                }
                dialogInterface.cancel();
                dialogInterface.dismiss();
            }
        }

        i(Button button, SharedPreferences.Editor editor) {
            this.d = button;
            this.e = editor;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (Sconto.this.j0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Sconto.this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Sconto.this.m0.vibrate(20L);
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(Sconto.this);
            builder.setMessage(Sconto.this.getResources().getString(R.string.calcolo_sconto_messaggio));
            View viewInflate = ((LayoutInflater) Sconto.this.getSystemService("layout_inflater")).inflate(R.layout.seekbar, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(R.id.textSeekBar);
            textView.setText(this.d.getText().toString());
            SeekBar seekBar = (SeekBar) viewInflate.findViewById(R.id.ivaSeekBar);
            if (!this.d.getText().toString().equals("...%")) {
                seekBar.setProgress(Integer.parseInt(this.d.getText().toString().substring(0, this.d.getText().toString().length() - 2)));
            }
            seekBar.setOnSeekBarChangeListener(new a(textView));
            builder.setView(viewInflate);
            builder.setCancelable(false);
            builder.setPositiveButton(Sconto.this.getResources().getString(R.string.calcolo_iva_messaggio_fatto), new b(textView));
            builder.setNegativeButton(Sconto.this.getResources().getString(R.string.calcolo_iva_messaggio_indietro), new c());
            builder.create().show();
            return true;
        }
    }

    class j implements View.OnLongClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ SharedPreferences.Editor e;

        class a implements SeekBar.OnSeekBarChangeListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TextView f7028a;

            a(TextView textView) {
                this.f7028a = textView;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int r2, boolean z) {
                this.f7028a.setText(String.valueOf(r2) + " %");
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        }

        class b implements DialogInterface.OnClickListener {
            final /* synthetic */ TextView d;

            b(TextView textView) {
                this.d = textView;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int r5) {
                if (Sconto.this.j0.equals("si")) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        Sconto.this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                    } else {
                        Sconto.this.m0.vibrate(20L);
                    }
                }
                j jVar = j.this;
                jVar.e.putString(Sconto.this.getResources().getString(R.string.sconto_percetualeDUE), this.d.getText().toString());
                j.this.e.commit();
                j.this.d.setText(this.d.getText().toString());
                dialogInterface.cancel();
            }
        }

        class c implements DialogInterface.OnClickListener {
            c() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int r5) {
                if (Sconto.this.j0.equals("si")) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        Sconto.this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                    } else {
                        Sconto.this.m0.vibrate(20L);
                    }
                }
                dialogInterface.cancel();
                dialogInterface.dismiss();
            }
        }

        j(Button button, SharedPreferences.Editor editor) {
            this.d = button;
            this.e = editor;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (Sconto.this.j0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Sconto.this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Sconto.this.m0.vibrate(20L);
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(Sconto.this);
            builder.setMessage(Sconto.this.getResources().getString(R.string.calcolo_sconto_messaggio));
            View viewInflate = ((LayoutInflater) Sconto.this.getSystemService("layout_inflater")).inflate(R.layout.seekbar, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(R.id.textSeekBar);
            textView.setText(this.d.getText().toString());
            SeekBar seekBar = (SeekBar) viewInflate.findViewById(R.id.ivaSeekBar);
            if (!this.d.getText().toString().equals("...%")) {
                seekBar.setProgress(Integer.parseInt(this.d.getText().toString().substring(0, this.d.getText().toString().length() - 2)));
            }
            seekBar.setOnSeekBarChangeListener(new a(textView));
            builder.setView(viewInflate);
            builder.setCancelable(false);
            builder.setPositiveButton(Sconto.this.getResources().getString(R.string.calcolo_iva_messaggio_fatto), new b(textView));
            builder.setNegativeButton(Sconto.this.getResources().getString(R.string.calcolo_iva_messaggio_indietro), new c());
            builder.create().show();
            return true;
        }
    }

    class k implements com.google.android.gms.ads.k0.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f7030a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SharedPreferences.Editor f7031b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LinearLayout.LayoutParams f7032c;
        final /* synthetic */ LinearLayout.LayoutParams d;
        final /* synthetic */ LinearLayout.LayoutParams e;

        k(Bundle bundle, SharedPreferences.Editor editor, LinearLayout.LayoutParams layoutParams, LinearLayout.LayoutParams layoutParams2, LinearLayout.LayoutParams layoutParams3) {
            this.f7030a = bundle;
            this.f7031b = editor;
            this.f7032c = layoutParams;
            this.d = layoutParams2;
            this.e = layoutParams3;
        }

        @Override // com.google.android.gms.ads.k0.d
        public void a1(int r1) {
        }

        @Override // com.google.android.gms.ads.k0.d
        public void h1() {
            Sconto.this.l0.u1("ca-app-pub-8629550575650531/8013241025", new e.a().d(AdMobAdapter.class, this.f7030a).f());
            this.f7031b.putLong("data_gift_rifiutato", System.currentTimeMillis());
            this.f7031b.apply();
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
            ScrollView scrollView;
            LinearLayout.LayoutParams layoutParams;
            Toast toastMakeText = Toast.makeText(Sconto.this.getBaseContext(), Sconto.this.getResources().getString(R.string.premioPRO), 1);
            toastMakeText.setGravity(48, 0, 0);
            toastMakeText.show();
            this.f7031b.putLong("data_gift_vinto", System.currentTimeMillis());
            this.f7031b.apply();
            Sconto.this.J.setVisibility(8);
            if (Sconto.this.R.equals("si")) {
                Sconto.this.c0.setVisibility(0);
                Sconto.this.g0.setVisibility(0);
            }
            if (Sconto.this.S.equals("si")) {
                Sconto.this.b0.setVisibility(0);
                Sconto.this.f0.setVisibility(0);
            }
            if (Sconto.this.S.equals("si") && Sconto.this.R.equals("si")) {
                scrollView = Sconto.this.r0;
                layoutParams = this.f7032c;
            } else if ((Sconto.this.S.equals("si") && !Sconto.this.R.equals("si")) || (!Sconto.this.S.equals("si") && Sconto.this.R.equals("si"))) {
                scrollView = Sconto.this.r0;
                layoutParams = this.d;
            } else {
                if (Sconto.this.S.equals("si") || Sconto.this.R.equals("si")) {
                    return;
                }
                scrollView = Sconto.this.r0;
                layoutParams = this.e;
            }
            scrollView.setLayoutParams(layoutParams);
        }
    }

    class l implements View.OnClickListener {
        final /* synthetic */ SharedPreferences.Editor d;
        final /* synthetic */ DecimalFormat e;
        final /* synthetic */ LinearLayout.LayoutParams f;
        final /* synthetic */ LinearLayout.LayoutParams g;
        final /* synthetic */ LinearLayout.LayoutParams h;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int r4) {
                if (Sconto.this.j0.equals("si")) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        Sconto.this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                    } else {
                        Sconto.this.m0.vibrate(20L);
                    }
                }
            }
        }

        class b implements DialogInterface.OnClickListener {
            b() {
            }

            /* JADX WARN: Removed duplicated region for block: B:39:0x043a  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0615  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0829  */
            /* JADX WARN: Removed duplicated region for block: B:80:0x086f  */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onClick(android.content.DialogInterface r23, int r24) {
                /*
                    Method dump skipped, instructions count: 2188
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.Sconto.l.b.onClick(android.content.DialogInterface, int):void");
            }
        }

        l(SharedPreferences.Editor editor, DecimalFormat decimalFormat, LinearLayout.LayoutParams layoutParams, LinearLayout.LayoutParams layoutParams2, LinearLayout.LayoutParams layoutParams3) {
            this.d = editor;
            this.e = decimalFormat;
            this.f = layoutParams;
            this.g = layoutParams2;
            this.h = layoutParams3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (Sconto.this.j0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Sconto.this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Sconto.this.m0.vibrate(20L);
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(Sconto.this);
            View viewInflate = ((LayoutInflater) Sconto.this.getSystemService("layout_inflater")).inflate(R.layout.more_sconto, (ViewGroup) null);
            Sconto.this.u0 = (CheckBox) viewInflate.findViewById(R.id.CheckBoxAddIva);
            Sconto.this.v0 = (CheckBox) viewInflate.findViewById(R.id.CheckBoxAddSconto2);
            if (Sconto.this.c0.getVisibility() == 0) {
                Sconto.this.v0.setChecked(true);
            }
            if (Sconto.this.b0.getVisibility() == 0) {
                Sconto.this.u0.setChecked(true);
            }
            builder.setView(viewInflate);
            builder.setTitle(Sconto.this.getResources().getString(R.string.titoloAGGIUNIG));
            builder.setCancelable(false);
            builder.setNegativeButton(Sconto.this.getResources().getString(R.string.calcolo_iva_messaggio_indietro), new a());
            builder.setPositiveButton(Sconto.this.getResources().getString(R.string.salvasceltalaunchercalculator), new b());
            builder.create().show();
        }
    }

    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (Sconto.this.j0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Sconto.this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Sconto.this.m0.vibrate(20L);
                }
            }
            Sconto.this.startActivity(new Intent(Sconto.this, (Class<?>) CalcolatriceVolante.class));
        }
    }

    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Sconto.this.a0.setText("");
            Sconto.this.Z.setText("");
            Sconto.this.d0.setText("");
            Sconto.this.e0.setText("");
            if (Sconto.this.b0.getVisibility() == 0) {
                Sconto.this.b0.setText("");
            }
            if (Sconto.this.c0.getVisibility() == 0) {
                Sconto.this.c0.setText("");
            }
            if (Sconto.this.j0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Sconto.this.m0.vibrate(VibrationEffect.createOneShot(40L, -1));
                } else {
                    Sconto.this.m0.vibrate(40L);
                }
            }
        }
    }

    class o implements View.OnLongClickListener {
        final /* synthetic */ DecimalFormat d;

        o(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x0305  */
        /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
        @Override // android.view.View.OnLongClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onLongClick(android.view.View r18) {
            /*
                Method dump skipped, instructions count: 803
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.Sconto.o.onLongClick(android.view.View):boolean");
        }
    }

    class p implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        p(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Sconto.this.h0.j(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, Sconto.this.o0);
                Sconto.this.L.N(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, "canc", Sconto.this.Y, this.d, Sconto.this.h0, Sconto.this.getBaseContext());
                Sconto.this.Z.setText(Sconto.this.h0.m(Sconto.this.Z.getText().toString(), Sconto.this.o0));
                Sconto.this.a0.setText(Sconto.this.h0.m(Sconto.this.a0.getText().toString(), Sconto.this.o0));
                Sconto.this.e0.setText(Sconto.this.h0.m(Sconto.this.e0.getText().toString(), Sconto.this.o0));
                Sconto.this.d0.setText(Sconto.this.h0.m(Sconto.this.d0.getText().toString(), Sconto.this.o0));
                if (Sconto.this.b0.getVisibility() == 0) {
                    Sconto.this.b0.setText(Sconto.this.h0.m(Sconto.this.b0.getText().toString(), Sconto.this.o0));
                }
                if (Sconto.this.c0.getVisibility() == 0) {
                    Sconto.this.c0.setText(Sconto.this.h0.m(Sconto.this.c0.getText().toString(), Sconto.this.o0));
                }
                Sconto.this.L.q0(Sconto.this.Z, Sconto.this.a0, Sconto.this.e0, Sconto.this.d0, Sconto.this.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(Sconto.this.U, "error", 0).show();
            }
            if (Sconto.this.j0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Sconto.this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Sconto.this.m0.vibrate(20L);
                }
            }
        }
    }

    class q implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        class a implements View.OnClickListener {
            final /* synthetic */ LinearLayout d;

            a(LinearLayout linearLayout) {
                this.d = linearLayout;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws Resources.NotFoundException, IOException {
                if (Sconto.this.j0.equals("si")) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        Sconto.this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                    } else {
                        Sconto.this.m0.vibrate(20L);
                    }
                }
                Bitmap bitmapE0 = Sconto.this.e0(this.d);
                try {
                    File file = new File(Sconto.this.getExternalCacheDir(), "logicchip.png");
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    bitmapE0.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    file.setReadable(true, true);
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setFlags(268435456);
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                    intent.setType("image/png");
                    String string = Sconto.this.getResources().getString(R.string.app_name);
                    String string2 = Sconto.this.getResources().getString(R.string.textShare);
                    intent.putExtra("android.intent.extra.SUBJECT", string);
                    intent.putExtra("android.intent.extra.TEXT", string2);
                    Sconto.this.startActivity(Intent.createChooser(intent, "Share image via"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        class b implements View.OnClickListener {
            final /* synthetic */ AlertDialog d;

            b(AlertDialog alertDialog) {
                this.d = alertDialog;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Sconto.this.j0.equals("si")) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        Sconto.this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                    } else {
                        Sconto.this.m0.vibrate(20L);
                    }
                }
                this.d.dismiss();
            }
        }

        q(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Object obj;
            TextView textView;
            AlertDialog.Builder builder;
            TextView textView2;
            TextView textView3;
            View view2;
            TextView textView4;
            char c2 = 65535;
            if (Sconto.this.j0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Sconto.this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Sconto.this.m0.vibrate(20L);
                }
            }
            try {
                if (Sconto.this.Z.getText().toString().isEmpty() || Sconto.this.a0.getText().toString().isEmpty()) {
                    Toast.makeText(Sconto.this.U, Sconto.this.getResources().getString(R.string.errorSEZIONEsconto), 0).show();
                    return;
                }
                AlertDialog.Builder builder2 = new AlertDialog.Builder(Sconto.this);
                LayoutInflater layoutInflater = (LayoutInflater) Sconto.this.getSystemService("layout_inflater");
                View viewInflate = layoutInflater.inflate(R.layout.list_sconto_dark, (ViewGroup) null);
                String str = Sconto.this.i0;
                switch (str.hashCode()) {
                    case -1663019586:
                        if (str.equals("elegant")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 3377622:
                        if (str.equals("neon")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 102970646:
                        if (str.equals("light")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 853620882:
                        if (str.equals("classic")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 1064537505:
                        if (str.equals("minimal")) {
                            c2 = 2;
                            break;
                        }
                        break;
                }
                if (c2 == 0) {
                    viewInflate = layoutInflater.inflate(R.layout.list_sconto_classic, (ViewGroup) null);
                } else if (c2 == 1) {
                    viewInflate = layoutInflater.inflate(R.layout.list_sconto_dark, (ViewGroup) null);
                } else if (c2 == 2) {
                    viewInflate = layoutInflater.inflate(R.layout.list_sconto_minimal, (ViewGroup) null);
                } else if (c2 == 3) {
                    viewInflate = layoutInflater.inflate(R.layout.list_sconto_elegant, (ViewGroup) null);
                } else if (c2 == 4) {
                    viewInflate = layoutInflater.inflate(R.layout.list_sconto_light, (ViewGroup) null);
                }
                TextView textView5 = (TextView) viewInflate.findViewById(R.id.titlelistSconto);
                LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.linearListSconto);
                Button button = (Button) viewInflate.findViewById(R.id.shareScontoListButton);
                Button button2 = (Button) viewInflate.findViewById(R.id.backScontoListButton);
                TextView textView6 = (TextView) viewInflate.findViewById(R.id.textListPREZZOINIZIALE);
                TextView textView7 = (TextView) viewInflate.findViewById(R.id.textListtotalesconto);
                textView6.setText(Sconto.this.getResources().getString(R.string.PrezzoOriginaleSconto) + Sconto.this.Z.getText().toString());
                textView7.setText(Sconto.this.getResources().getString(R.string.RisparmiatoSconto) + Sconto.this.e0.getText().toString());
                TextView textView8 = (TextView) viewInflate.findViewById(R.id.textListPREZZofinaledopoprimosconto);
                TextView textView9 = (TextView) viewInflate.findViewById(R.id.textListPRIMOSCONTO);
                TextView textView10 = (TextView) viewInflate.findViewById(R.id.textListPREZZOpiuIVA);
                TextView textView11 = (TextView) viewInflate.findViewById(R.id.textListIVA);
                TextView textView12 = (TextView) viewInflate.findViewById(R.id.seperatoreivasconto);
                if (Sconto.this.b0.getVisibility() == 8 || Sconto.this.b0.getText().toString().isEmpty()) {
                    obj = "si";
                    textView = textView5;
                    builder = builder2;
                    textView2 = textView6;
                    textView3 = textView7;
                    textView10.setVisibility(8);
                    textView11.setVisibility(8);
                    textView12.setVisibility(8);
                } else {
                    builder = builder2;
                    textView = textView5;
                    textView3 = textView7;
                    textView2 = textView6;
                    obj = "si";
                    Sconto.this.h0.j(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, Sconto.this.o0);
                    Sconto.this.L.o(Sconto.this.Z, Sconto.this.b0, textView10, textView11, Sconto.this.b0.getText().toString(), Sconto.this.Y, this.d, Sconto.this.h0, Sconto.this.getBaseContext());
                    Sconto.this.Z.setText(Sconto.this.h0.m(Sconto.this.Z.getText().toString(), Sconto.this.o0));
                    Sconto.this.a0.setText(Sconto.this.h0.m(Sconto.this.a0.getText().toString(), Sconto.this.o0));
                    Sconto.this.e0.setText(Sconto.this.h0.m(Sconto.this.e0.getText().toString(), Sconto.this.o0));
                    Sconto.this.d0.setText(Sconto.this.h0.m(Sconto.this.d0.getText().toString(), Sconto.this.o0));
                    Sconto.this.b0.setText(Sconto.this.h0.m(Sconto.this.b0.getText().toString(), Sconto.this.o0));
                    Sconto.this.c0.setText(Sconto.this.h0.m(Sconto.this.c0.getText().toString(), Sconto.this.o0));
                    String str2 = Sconto.this.getResources().getString(R.string.PrezzoOriginaleScontoPiuiva) + Sconto.this.h0.m(textView10.getText().toString(), Sconto.this.o0);
                    String str3 = Sconto.this.getResources().getString(R.string.ScontoVAT) + " " + Sconto.this.b0.getText().toString() + "% → " + Sconto.this.h0.m(textView11.getText().toString(), Sconto.this.o0);
                    textView10.setText(str2);
                    textView11.setText(str3);
                }
                TextView textView13 = (TextView) viewInflate.findViewById(R.id.textListPREZZofinaledoposecondosconto);
                TextView textView14 = (TextView) viewInflate.findViewById(R.id.textListSecondoSCONTO);
                TextView textView15 = (TextView) viewInflate.findViewById(R.id.seperatore2sconto);
                if (Sconto.this.c0.getVisibility() == 8 || Sconto.this.c0.getText().toString().isEmpty()) {
                    view2 = viewInflate;
                    textView4 = textView11;
                    textView13.setVisibility(8);
                    textView14.setVisibility(8);
                    textView15.setVisibility(8);
                    textView8.setText(Sconto.this.getResources().getString(R.string.PrezzoFinaleSconto) + Sconto.this.d0.getText().toString());
                    textView9.setText(Sconto.this.getResources().getString(R.string.Sconto) + " " + Sconto.this.a0.getText().toString() + "% → " + Sconto.this.e0.getText().toString());
                } else {
                    view2 = viewInflate;
                    textView4 = textView11;
                    Sconto.this.h0.j(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, Sconto.this.o0);
                    String[] strArrQ = Sconto.this.L.Q(Sconto.this.Z.getText().toString(), Sconto.this.a0.getText().toString(), Sconto.this.b0.getText().toString(), Sconto.this.c0.getText().toString(), this.d, Sconto.this.h0, Sconto.this.getBaseContext());
                    String str4 = Sconto.this.getResources().getString(R.string.Prezzointermedio) + Sconto.this.h0.m(strArrQ[2], Sconto.this.o0);
                    String str5 = "1° " + Sconto.this.getResources().getString(R.string.Sconto) + " " + Sconto.this.a0.getText().toString() + "% → " + Sconto.this.h0.m(strArrQ[3], Sconto.this.o0);
                    String str6 = "2° " + Sconto.this.getResources().getString(R.string.Sconto) + " " + Sconto.this.c0.getText().toString() + "% → " + Sconto.this.h0.m(strArrQ[4], Sconto.this.o0);
                    Sconto.this.Z.setText(Sconto.this.h0.m(Sconto.this.Z.getText().toString(), Sconto.this.o0));
                    Sconto.this.a0.setText(Sconto.this.h0.m(Sconto.this.a0.getText().toString(), Sconto.this.o0));
                    Sconto.this.e0.setText(Sconto.this.h0.m(Sconto.this.e0.getText().toString(), Sconto.this.o0));
                    Sconto.this.d0.setText(Sconto.this.h0.m(Sconto.this.d0.getText().toString(), Sconto.this.o0));
                    Sconto.this.b0.setText(Sconto.this.h0.m(Sconto.this.b0.getText().toString(), Sconto.this.o0));
                    Sconto.this.c0.setText(Sconto.this.h0.m(Sconto.this.c0.getText().toString(), Sconto.this.o0));
                    textView8.setText(str4);
                    textView9.setText(str5);
                    textView13.setText(Sconto.this.getResources().getString(R.string.PrezzoFinaleSconto) + Sconto.this.d0.getText().toString());
                    textView14.setText(str6);
                }
                if (Sconto.this.w0.equals(obj)) {
                    TextView textView16 = textView2;
                    textView16.setTypeface(Typeface.SANS_SERIF);
                    textView16.setLetterSpacing(0.0f);
                    TextView textView17 = textView3;
                    textView17.setTypeface(Typeface.SANS_SERIF);
                    textView17.setLetterSpacing(0.0f);
                    textView8.setTypeface(Typeface.SANS_SERIF);
                    textView8.setLetterSpacing(0.0f);
                    textView9.setTypeface(Typeface.SANS_SERIF);
                    textView9.setLetterSpacing(0.0f);
                    textView10.setTypeface(Typeface.SANS_SERIF);
                    textView10.setLetterSpacing(0.0f);
                    TextView textView18 = textView4;
                    textView18.setTypeface(Typeface.SANS_SERIF);
                    textView18.setLetterSpacing(0.0f);
                    textView13.setTypeface(Typeface.SANS_SERIF);
                    textView13.setLetterSpacing(0.0f);
                    textView14.setTypeface(Typeface.SANS_SERIF);
                    textView14.setLetterSpacing(0.0f);
                    TextView textView19 = textView;
                    textView19.setTypeface(Typeface.SANS_SERIF);
                    textView19.setLetterSpacing(0.0f);
                }
                AlertDialog.Builder builder3 = builder;
                builder3.setView(view2);
                button.setOnClickListener(new a(linearLayout));
                AlertDialog alertDialogCreate = builder3.create();
                alertDialogCreate.show();
                button2.setOnClickListener(new b(alertDialogCreate));
            } catch (NumberFormatException unused) {
                Toast.makeText(Sconto.this.U, "error", 0).show();
            }
        }
    }

    class r implements DialogInterface.OnClickListener {
        final /* synthetic */ ViewGroup d;

        r(ViewGroup viewGroup) {
            this.d = viewGroup;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r8) {
            if (Sconto.this.D.getVisibility() != 8) {
                Sconto.this.D.setVisibility(8);
                Sconto.this.B0 = "NO";
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
                Sconto.this.W.e(((Long) arrayList.get(r0)).longValue(), Sconto.this.V);
                ViewGroup viewGroup = this.d;
                viewGroup.removeView(viewGroup.findViewWithTag(arrayList.get(r0)));
            }
        }
    }

    class s implements DialogInterface.OnClickListener {
        s() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r2) {
            dialogInterface.cancel();
        }
    }

    class t implements View.OnClickListener {
        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Sconto sconto;
            int r0;
            if (Sconto.this.j0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Sconto.this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Sconto.this.m0.vibrate(20L);
                }
            }
            if (Sconto.this.a0.isChecked()) {
                Sconto.this.a0.setChecked(false);
                Sconto.this.Z.setChecked(true);
                Sconto.this.Y = 1;
                return;
            }
            if (Sconto.this.Z.isChecked() && Sconto.this.b0.getVisibility() == 0) {
                Sconto.this.Z.setChecked(false);
                Sconto.this.b0.setChecked(true);
                sconto = Sconto.this;
                r0 = 3;
            } else {
                if (!Sconto.this.c0.isChecked() || Sconto.this.c0.getVisibility() != 0) {
                    return;
                }
                Sconto.this.c0.setChecked(false);
                Sconto.this.a0.setChecked(true);
                sconto = Sconto.this;
                r0 = 2;
            }
            sconto.Y = r0;
        }
    }

    class u implements View.OnClickListener {
        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Sconto sconto;
            int r0;
            if (Sconto.this.j0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Sconto.this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Sconto.this.m0.vibrate(20L);
                }
            }
            if (Sconto.this.Z.isChecked()) {
                Sconto.this.Z.setChecked(false);
                Sconto.this.a0.setChecked(true);
                sconto = Sconto.this;
                r0 = 2;
            } else if (Sconto.this.b0.isChecked() && Sconto.this.b0.getVisibility() == 0) {
                Sconto.this.b0.setChecked(false);
                Sconto.this.Z.setChecked(true);
                Sconto.this.Y = 1;
                return;
            } else {
                if (!Sconto.this.a0.isChecked() || Sconto.this.c0.getVisibility() != 0) {
                    return;
                }
                Sconto.this.a0.setChecked(false);
                Sconto.this.c0.setChecked(true);
                sconto = Sconto.this;
                r0 = 4;
            }
            sconto.Y = r0;
        }
    }

    class v implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        v(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Sconto.this.h0.j(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, Sconto.this.o0);
                Sconto.this.L.N(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, "0", Sconto.this.Y, this.d, Sconto.this.h0, Sconto.this.getBaseContext());
                Sconto.this.Z.setText(Sconto.this.h0.m(Sconto.this.Z.getText().toString(), Sconto.this.o0));
                Sconto.this.a0.setText(Sconto.this.h0.m(Sconto.this.a0.getText().toString(), Sconto.this.o0));
                Sconto.this.e0.setText(Sconto.this.h0.m(Sconto.this.e0.getText().toString(), Sconto.this.o0));
                Sconto.this.d0.setText(Sconto.this.h0.m(Sconto.this.d0.getText().toString(), Sconto.this.o0));
                if (Sconto.this.b0.getVisibility() == 0) {
                    Sconto.this.b0.setText(Sconto.this.h0.m(Sconto.this.b0.getText().toString(), Sconto.this.o0));
                }
                if (Sconto.this.c0.getVisibility() == 0) {
                    Sconto.this.c0.setText(Sconto.this.h0.m(Sconto.this.c0.getText().toString(), Sconto.this.o0));
                }
                Sconto.this.L.q0(Sconto.this.Z, Sconto.this.a0, Sconto.this.e0, Sconto.this.d0, Sconto.this.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(Sconto.this.U, "error", 0).show();
            }
            if (Sconto.this.j0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Sconto.this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Sconto.this.m0.vibrate(20L);
                }
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
            try {
                Sconto.this.h0.j(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, Sconto.this.o0);
                Sconto.this.L.N(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, "1", Sconto.this.Y, this.d, Sconto.this.h0, Sconto.this.getBaseContext());
                Sconto.this.Z.setText(Sconto.this.h0.m(Sconto.this.Z.getText().toString(), Sconto.this.o0));
                Sconto.this.a0.setText(Sconto.this.h0.m(Sconto.this.a0.getText().toString(), Sconto.this.o0));
                Sconto.this.e0.setText(Sconto.this.h0.m(Sconto.this.e0.getText().toString(), Sconto.this.o0));
                Sconto.this.d0.setText(Sconto.this.h0.m(Sconto.this.d0.getText().toString(), Sconto.this.o0));
                if (Sconto.this.b0.getVisibility() == 0) {
                    Sconto.this.b0.setText(Sconto.this.h0.m(Sconto.this.b0.getText().toString(), Sconto.this.o0));
                }
                if (Sconto.this.c0.getVisibility() == 0) {
                    Sconto.this.c0.setText(Sconto.this.h0.m(Sconto.this.c0.getText().toString(), Sconto.this.o0));
                }
                Sconto.this.L.q0(Sconto.this.Z, Sconto.this.a0, Sconto.this.e0, Sconto.this.d0, Sconto.this.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(Sconto.this.U, "error", 0).show();
            }
            if (Sconto.this.j0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Sconto.this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Sconto.this.m0.vibrate(20L);
                }
            }
        }
    }

    class x implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        x(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Sconto.this.h0.j(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, Sconto.this.o0);
                Sconto.this.L.N(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, "2", Sconto.this.Y, this.d, Sconto.this.h0, Sconto.this.getBaseContext());
                Sconto.this.Z.setText(Sconto.this.h0.m(Sconto.this.Z.getText().toString(), Sconto.this.o0));
                Sconto.this.a0.setText(Sconto.this.h0.m(Sconto.this.a0.getText().toString(), Sconto.this.o0));
                Sconto.this.e0.setText(Sconto.this.h0.m(Sconto.this.e0.getText().toString(), Sconto.this.o0));
                Sconto.this.d0.setText(Sconto.this.h0.m(Sconto.this.d0.getText().toString(), Sconto.this.o0));
                if (Sconto.this.b0.getVisibility() == 0) {
                    Sconto.this.b0.setText(Sconto.this.h0.m(Sconto.this.b0.getText().toString(), Sconto.this.o0));
                }
                if (Sconto.this.c0.getVisibility() == 0) {
                    Sconto.this.c0.setText(Sconto.this.h0.m(Sconto.this.c0.getText().toString(), Sconto.this.o0));
                }
                Sconto.this.L.q0(Sconto.this.Z, Sconto.this.a0, Sconto.this.e0, Sconto.this.d0, Sconto.this.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(Sconto.this.U, "error", 0).show();
            }
            if (Sconto.this.j0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Sconto.this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Sconto.this.m0.vibrate(20L);
                }
            }
        }
    }

    class y implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        y(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Sconto.this.h0.j(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, Sconto.this.o0);
                Sconto.this.L.N(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, "3", Sconto.this.Y, this.d, Sconto.this.h0, Sconto.this.getBaseContext());
                Sconto.this.Z.setText(Sconto.this.h0.m(Sconto.this.Z.getText().toString(), Sconto.this.o0));
                Sconto.this.a0.setText(Sconto.this.h0.m(Sconto.this.a0.getText().toString(), Sconto.this.o0));
                Sconto.this.e0.setText(Sconto.this.h0.m(Sconto.this.e0.getText().toString(), Sconto.this.o0));
                Sconto.this.d0.setText(Sconto.this.h0.m(Sconto.this.d0.getText().toString(), Sconto.this.o0));
                if (Sconto.this.b0.getVisibility() == 0) {
                    Sconto.this.b0.setText(Sconto.this.h0.m(Sconto.this.b0.getText().toString(), Sconto.this.o0));
                }
                if (Sconto.this.c0.getVisibility() == 0) {
                    Sconto.this.c0.setText(Sconto.this.h0.m(Sconto.this.c0.getText().toString(), Sconto.this.o0));
                }
                Sconto.this.L.q0(Sconto.this.Z, Sconto.this.a0, Sconto.this.e0, Sconto.this.d0, Sconto.this.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(Sconto.this.U, "error", 0).show();
            }
            if (Sconto.this.j0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Sconto.this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Sconto.this.m0.vibrate(20L);
                }
            }
        }
    }

    class z implements View.OnClickListener {
        final /* synthetic */ DecimalFormat d;

        z(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Sconto.this.h0.j(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, Sconto.this.o0);
                Sconto.this.L.N(Sconto.this.Z, Sconto.this.a0, Sconto.this.b0, Sconto.this.c0, Sconto.this.e0, Sconto.this.d0, "4", Sconto.this.Y, this.d, Sconto.this.h0, Sconto.this.getBaseContext());
                Sconto.this.Z.setText(Sconto.this.h0.m(Sconto.this.Z.getText().toString(), Sconto.this.o0));
                Sconto.this.a0.setText(Sconto.this.h0.m(Sconto.this.a0.getText().toString(), Sconto.this.o0));
                Sconto.this.e0.setText(Sconto.this.h0.m(Sconto.this.e0.getText().toString(), Sconto.this.o0));
                Sconto.this.d0.setText(Sconto.this.h0.m(Sconto.this.d0.getText().toString(), Sconto.this.o0));
                if (Sconto.this.b0.getVisibility() == 0) {
                    Sconto.this.b0.setText(Sconto.this.h0.m(Sconto.this.b0.getText().toString(), Sconto.this.o0));
                }
                if (Sconto.this.c0.getVisibility() == 0) {
                    Sconto.this.c0.setText(Sconto.this.h0.m(Sconto.this.c0.getText().toString(), Sconto.this.o0));
                }
                Sconto.this.L.q0(Sconto.this.Z, Sconto.this.a0, Sconto.this.e0, Sconto.this.d0, Sconto.this.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(Sconto.this.U, "error", 0).show();
            }
            if (Sconto.this.j0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Sconto.this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Sconto.this.m0.vibrate(20L);
                }
            }
        }
    }

    private void d0(TextView textView) {
        String string = textView.getText().toString();
        SpannableString spannableString = new SpannableString(string);
        Matcher matcher = Pattern.compile("[\\\\^]|[×]|[%]|[+]|[-]|[÷]|[√]").matcher(string);
        while (matcher.find()) {
            int r2 = matcher.start();
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(this.x0));
            if (r2 < 0) {
                break;
            } else {
                spannableString.setSpan(foregroundColorSpan, r2, (matcher.end() + r2) - matcher.start(), 33);
            }
        }
        textView.setText(spannableString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap e0(View view) {
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
        String str;
        String str2;
        Cursor cursor;
        BigDecimal bigDecimal;
        int r4;
        String str3 = "";
        String str4 = ",";
        if (this.j0.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.m0.vibrate(20L);
            }
        }
        Locale.setDefault(Locale.US);
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormatSymbols.setGroupingSeparator(',');
        DecimalFormat decimalFormat = new DecimalFormat("#,###.########", decimalFormatSymbols);
        DecimalFormat decimalFormat2 = new DecimalFormat("#,###.###", decimalFormatSymbols);
        long jLongValue = ((Long) ((View) view.getParent().getParent()).getTag()).longValue();
        SQLiteDatabase readableDatabase = this.W.getReadableDatabase();
        this.V = readableDatabase;
        Cursor cursorI = this.W.i(jLongValue, readableDatabase);
        BigDecimal bigDecimal2 = new BigDecimal("9999999999");
        while (cursorI.moveToNext()) {
            try {
                String strG = this.h0.g(cursorI.getString(0), "Default");
                if (Pattern.compile("^[-]").matcher(strG).find()) {
                    strG = strG.substring(1);
                }
                String strL = this.h0.l(this.E.a(strG), decimalFormat, Locale.US);
                if (new BigDecimal(strL.replaceAll(str4, str3)).compareTo(bigDecimal2) < 0) {
                    this.s0 = decimalFormat2.format(new BigDecimal(strL.replaceAll(str4, str3)));
                } else {
                    this.s0 = "9,999,999,999";
                    Toast.makeText(this, getResources().getString(R.string.overflow_result), 1).show();
                }
                this.h0.j(this.Z, this.a0, this.b0, this.c0, this.e0, this.d0, this.o0);
                str = str3;
            } catch (NumberFormatException unused) {
                str = str3;
            } catch (EmptyStackException unused2) {
                str = str3;
            }
            try {
                str2 = str4;
                try {
                    cursor = cursorI;
                    r4 = 0;
                    bigDecimal = bigDecimal2;
                    try {
                        this.L.O(this.Z, this.a0, this.b0, this.c0, this.e0, this.d0, this.s0, this.Y, decimalFormat2, this.h0, getBaseContext());
                        this.Z.setText(this.h0.m(this.s0, this.o0));
                        this.a0.setText(this.h0.m(this.a0.getText().toString(), this.o0));
                        this.e0.setText(this.h0.m(this.e0.getText().toString(), this.o0));
                        this.d0.setText(this.h0.m(this.d0.getText().toString(), this.o0));
                        if (this.b0.getVisibility() == 0) {
                            this.b0.setText(this.h0.m(this.b0.getText().toString(), this.o0));
                        }
                        if (this.c0.getVisibility() == 0) {
                            this.c0.setText(this.h0.m(this.c0.getText().toString(), this.o0));
                        }
                        this.L.q0(this.Z, this.a0, this.e0, this.d0, getBaseContext());
                    } catch (NumberFormatException | EmptyStackException unused3) {
                        Toast.makeText(this.U, "error", r4).show();
                        str3 = str;
                        str4 = str2;
                        cursorI = cursor;
                        bigDecimal2 = bigDecimal;
                    }
                } catch (NumberFormatException | EmptyStackException unused4) {
                    cursor = cursorI;
                    bigDecimal = bigDecimal2;
                    r4 = 0;
                    Toast.makeText(this.U, "error", r4).show();
                    str3 = str;
                    str4 = str2;
                    cursorI = cursor;
                    bigDecimal2 = bigDecimal;
                }
            } catch (NumberFormatException unused5) {
                str2 = str4;
                cursor = cursorI;
                bigDecimal = bigDecimal2;
                r4 = 0;
                Toast.makeText(this.U, "error", r4).show();
                str3 = str;
                str4 = str2;
                cursorI = cursor;
                bigDecimal2 = bigDecimal;
            } catch (EmptyStackException unused6) {
                str2 = str4;
                cursor = cursorI;
                bigDecimal = bigDecimal2;
                r4 = 0;
                Toast.makeText(this.U, "error", r4).show();
                str3 = str;
                str4 = str2;
                cursorI = cursor;
                bigDecimal2 = bigDecimal;
            }
            str3 = str;
            str4 = str2;
            cursorI = cursor;
            bigDecimal2 = bigDecimal;
        }
        this.O.h();
    }

    public void ckmemory(View view) {
        com.gp7.easycalculator.c cVar;
        Long lValueOf;
        SQLiteDatabase sQLiteDatabase;
        String str;
        if (this.j0.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.m0.vibrate(20L);
            }
        }
        CheckBox checkBox = (CheckBox) view;
        this.C = checkBox;
        long jLongValue = ((Long) ((View) checkBox.getParent().getParent()).getTag()).longValue();
        if (this.C.isChecked()) {
            this.C.setBackground(getDrawable(R.drawable.ic_pin_test_ck));
            cVar = this.W;
            lValueOf = Long.valueOf(jLongValue);
            sQLiteDatabase = this.V;
            str = "Y";
        } else {
            this.C.setBackground(getDrawable(R.drawable.ic_pin_test));
            cVar = this.W;
            lValueOf = Long.valueOf(jLongValue);
            sQLiteDatabase = this.V;
            str = "N";
        }
        cVar.l(lValueOf, str, sQLiteDatabase);
    }

    public void deleteallSconto(View view) {
        if (this.j0.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.m0.vibrate(20L);
            }
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.memoriaSconto);
        if (viewGroup.getChildCount() > 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage(getResources().getString(R.string.DeleteAllMemory));
            builder.setTitle(getResources().getString(R.string.AlertTitle));
            builder.setCancelable(false);
            builder.setPositiveButton(getResources().getString(R.string.AlertSI), new r(viewGroup));
            builder.setNegativeButton(getResources().getString(R.string.AlertNO), new s());
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
            ((ViewGroup) findViewById(R.id.memoriaSconto)).removeView((View) view.getParent().getParent());
            SQLiteDatabase readableDatabase = this.W.getReadableDatabase();
            this.V = readableDatabase;
            this.W.f(jLongValue, readableDatabase);
        }
        if (this.j0.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.m0.vibrate(20L);
            }
        }
    }

    public void filterMemorySconto(View view) {
        for (int r0 = 0; r0 < this.T.getChildCount(); r0++) {
            LinearLayout linearLayout = (LinearLayout) this.T.getChildAt(r0);
            if (((CheckBox) ((LinearLayout) linearLayout.getChildAt(0)).getChildAt(1)).isChecked()) {
                this.C0 = "no";
            } else {
                linearLayout.setVisibility(8);
                this.B0 = "SI";
            }
        }
        if (this.B0.equals("SI")) {
            this.D.setVisibility(0);
        }
        if (this.C0.equals("si")) {
            Toast.makeText(this, getResources().getString(R.string.nocalcoliprotetti), 1).show();
        }
        if (this.j0.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.m0.vibrate(20L);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (D0 + 2500 > System.currentTimeMillis()) {
            this.W.close();
            super.onBackPressed();
        } else {
            Toast.makeText(this, getResources().getString(R.string.doubleclick), 0).show();
            D0 = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x09c1  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x09eb  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0b35  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0b42  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0c04  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0450  */
    @Override // androidx.appcompat.app.e, androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.j, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onCreate(android.os.Bundle r36) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 3404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.Sconto.onCreate(android.os.Bundle):void");
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
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.Sconto.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    @Override // androidx.appcompat.app.e, androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        this.l0.y1(this);
        this.W.close();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        SharedPreferences.Editor editorEdit = getSharedPreferences(getString(R.string.pref_file), 0).edit();
        SharedPreferences.Editor editorEdit2 = getSharedPreferences("apprater", 0).edit();
        switch (menuItem.getItemId()) {
            case R.id.CLASSIC_sconto /* 2131296271 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "classic");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Classic", 0).show();
                finish();
                startActivity(new Intent(this, (Class<?>) Sconto.class));
                return true;
            case R.id.Convertersconto /* 2131296288 */:
                startActivity(new Intent(this, (Class<?>) Convertitore.class));
                finish();
                try {
                    if (this.K != null && this.K.f()) {
                        this.K.o();
                    }
                } catch (NullPointerException e2) {
                    e2.printStackTrace();
                }
                return true;
            case R.id.ELEGANT_sconto /* 2131296301 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "elegant");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Elegant", 0).show();
                finish();
                startActivity(new Intent(this, (Class<?>) Sconto.class));
                return true;
            case R.id.Exit_sconto /* 2131296308 */:
                this.W.close();
                finish();
                return true;
            case R.id.IVAfromsconto /* 2131296321 */:
                startActivity(new Intent(this, (Class<?>) CalcoloIVA.class));
                finish();
                try {
                    if (this.K != null && this.K.f()) {
                        this.K.o();
                    }
                } catch (NullPointerException e3) {
                    e3.printStackTrace();
                }
                return true;
            case R.id.LIGHT_sconto /* 2131296328 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "light");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Light", 0).show();
                finish();
                startActivity(new Intent(this, (Class<?>) Sconto.class));
                return true;
            case R.id.MINIMAL_sconto /* 2131296337 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "minimal");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Minimal", 0).show();
                finish();
                startActivity(new Intent(this, (Class<?>) Sconto.class));
                return true;
            case R.id.NEON_sconto /* 2131296343 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "neon");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Dark", 0).show();
                finish();
                startActivity(new Intent(this, (Class<?>) Sconto.class));
                return true;
            case R.id.STAR_sconto /* 2131296360 */:
                com.gp7.easycalculator.a.b(this, editorEdit2, menuItem, this.i0);
                menuItem.setVisible(false);
                return true;
            case R.id.Setting_sconto /* 2131296373 */:
                startActivity(new Intent(this, (Class<?>) Setting.class));
                return true;
            case R.id.Sharami_sconto /* 2131296379 */:
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", getResources().getString(R.string.downloadApp) + "https://play.google.com/store/apps/details?id=" + com.gp7.easycalculator.b.f7045b);
                intent.setType("text/plain");
                startActivity(intent);
                return true;
            case R.id.gotoSpesafromsconto /* 2131296614 */:
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
            case R.id.gotoTipfromsconto /* 2131296619 */:
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
            case R.id.gotocalculatorfromsconto /* 2131296623 */:
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
        this.l0.D1(this);
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    public void onResume() {
        super.onResume();
        this.l0.w1(this);
        Locale.setDefault(Locale.US);
        SharedPreferences sharedPreferences = getSharedPreferences(getString(R.string.pref_file), 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        this.j0 = sharedPreferences.getString(getString(R.string.vibrazione_memorizzata), "no");
        this.k0 = sharedPreferences.getString(getString(R.string.ScreenONoption_memorizzata), "no");
        this.p0 = sharedPreferences.getString(getString(R.string.operator_color), "si");
        this.w0 = sharedPreferences.getString(getString(R.string.stile_option), "si");
        if (this.k0.equals("no")) {
            getWindow().clearFlags(128);
        }
        if (this.k0.equals("si")) {
            getWindow().addFlags(128);
        }
        this.o0 = sharedPreferences.getString(getString(R.string.notazione_scelta), "Default");
        Button button = (Button) findViewById(R.id.puntoSconto);
        if (this.o0.equals("Italiana")) {
            button.setText(",");
        } else {
            button.setText(".");
        }
        sharedPreferences.getString(getString(R.string.calcolovolante), "");
        if (sharedPreferences.getString(getString(R.string.calcolovolanteEseguito), "no").equals("si")) {
            try {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
                decimalFormatSymbols.setDecimalSeparator('.');
                decimalFormatSymbols.setGroupingSeparator(',');
                DecimalFormat decimalFormat = new DecimalFormat("#,###.###", decimalFormatSymbols);
                String string = sharedPreferences.getString(getString(R.string.calcolovolante), "");
                if (Pattern.compile("^[-]").matcher(string).find()) {
                    string = string.substring(1);
                }
                if (new BigDecimal(string.replaceAll(",", "")).compareTo(new BigDecimal("9999999999")) < 0) {
                    this.s0 = decimalFormat.format(new BigDecimal(string.replaceAll(",", "")));
                } else {
                    this.s0 = "9,999,999,999";
                    Toast.makeText(this, getResources().getString(R.string.overflow_result), 1).show();
                }
                this.h0.j(this.Z, this.a0, this.b0, this.c0, this.e0, this.d0, this.o0);
                this.L.O(this.Z, this.a0, this.b0, this.c0, this.e0, this.d0, this.s0, this.Y, decimalFormat, this.h0, getBaseContext());
                this.Z.setText(this.h0.m(this.s0, this.o0));
                this.a0.setText(this.h0.m(this.a0.getText().toString(), this.o0));
                this.e0.setText(this.h0.m(this.e0.getText().toString(), this.o0));
                this.d0.setText(this.h0.m(this.d0.getText().toString(), this.o0));
                if (this.b0.getVisibility() == 0) {
                    this.b0.setText(this.h0.m(this.b0.getText().toString(), this.o0));
                }
                if (this.c0.getVisibility() == 0) {
                    this.c0.setText(this.h0.m(this.c0.getText().toString(), this.o0));
                }
                this.L.q0(this.Z, this.a0, this.e0, this.d0, getBaseContext());
            } catch (NumberFormatException | EmptyStackException unused) {
                Toast.makeText(this.U, "error", 0).show();
            }
            editorEdit.putString(getString(R.string.calcolovolanteEseguito), "no");
            editorEdit.apply();
        }
    }

    @Override // androidx.appcompat.app.e, androidx.fragment.app.d, android.app.Activity
    protected void onStop() {
        super.onStop();
    }

    public void percentoMODESconto(View view) {
        int r5;
        if (this.j0.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.m0.vibrate(20L);
            }
        }
        switch (view.getId()) {
            case R.id.addIVAScontoradio /* 2131296449 */:
                r5 = 3;
                break;
            case R.id.discountSconto /* 2131296545 */:
                r5 = 2;
                break;
            case R.id.discountSconto2 /* 2131296546 */:
                r5 = 4;
                break;
            case R.id.orpriceSconto /* 2131296809 */:
                r5 = 1;
                break;
            default:
                return;
        }
        this.Y = r5;
    }

    public void shareitemsaved(View view) throws Resources.NotFoundException, IOException {
        if (this.j0.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.m0.vibrate(20L);
            }
        }
        LinearLayout linearLayout = (LinearLayout) view.getParent().getParent();
        View childAt = linearLayout.getChildAt(3);
        linearLayout.removeViewAt(3);
        CheckBox checkBox = (CheckBox) ((LinearLayout) linearLayout.getChildAt(0)).getChildAt(1);
        checkBox.setVisibility(4);
        Bitmap bitmapE0 = e0(linearLayout);
        checkBox.setVisibility(0);
        linearLayout.addView(childAt);
        try {
            File file = new File(getExternalCacheDir(), "logicchip.png");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmapE0.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
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

    public void undofilterMemorySconto(View view) {
        if (this.D.getVisibility() != 8) {
            if (this.j0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    this.m0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    this.m0.vibrate(20L);
                }
            }
            for (int r2 = 0; r2 < this.T.getChildCount(); r2++) {
                LinearLayout linearLayout = (LinearLayout) this.T.getChildAt(r2);
                if (!((CheckBox) ((LinearLayout) linearLayout.getChildAt(0)).getChildAt(1)).isChecked()) {
                    linearLayout.setVisibility(0);
                    this.B0 = "NO";
                    this.C0 = "si";
                    this.D.setVisibility(8);
                }
            }
        }
    }
}

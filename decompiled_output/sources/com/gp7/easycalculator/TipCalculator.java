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
public class TipCalculator extends androidx.appcompat.app.e {
    private static long D0;
    private com.google.android.gms.ads.l A0;
    CheckBox E;
    ImageButton F;
    float G;
    String H;
    private DrawerLayout I;
    String J;
    String K;
    String L;
    String M;
    LinearLayout N;
    SQLiteDatabase P;
    com.gp7.easycalculator.c Q;
    Cursor R;
    RadioButton T;
    RadioButton U;
    RadioButton V;
    RadioButton W;
    TextView X;
    TextView Y;
    TextView Z;
    TextView a0;
    com.gp7.easycalculator.w b0;
    String c0;
    String d0;
    String e0;
    Vibrator f0;
    String g0;
    String h0;
    LinearLayout i0;
    ScrollView j0;
    String k0;
    RelativeLayout l0;
    CheckBox m0;
    CheckBox n0;
    String o0;
    int p0;
    int q0;
    int r0;
    private com.google.android.gms.ads.k0.c s0;
    private FirebaseAnalytics t0;
    String u0;
    AdView z0;
    b0 C = new b0();
    com.gp7.easycalculator.u D = new com.gp7.easycalculator.u();
    Context O = this;
    int S = 1;
    com.gp7.easycalculator.v v0 = new com.gp7.easycalculator.v();
    String w0 = "false";
    com.gp7.easycalculator.x x0 = new com.gp7.easycalculator.x();
    int y0 = 1;
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
                TipCalculator.this.b0.k(TipCalculator.this.T, TipCalculator.this.W, TipCalculator.this.V, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.g0);
                TipCalculator.this.D.R(TipCalculator.this.T, TipCalculator.this.U, TipCalculator.this.V, TipCalculator.this.W, TipCalculator.this.Y, TipCalculator.this.X, "5", TipCalculator.this.S, this.d, TipCalculator.this.b0, TipCalculator.this.getBaseContext());
                TipCalculator.this.T.setText(TipCalculator.this.b0.m(TipCalculator.this.T.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.U.setText(TipCalculator.this.b0.m(TipCalculator.this.U.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.Y.setText(TipCalculator.this.b0.m(TipCalculator.this.Y.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.W.setText(TipCalculator.this.b0.m(TipCalculator.this.W.getText().toString(), TipCalculator.this.g0));
                if (TipCalculator.this.V.getVisibility() == 0) {
                    TipCalculator.this.V.setText(TipCalculator.this.b0.m(TipCalculator.this.V.getText().toString(), TipCalculator.this.g0));
                }
                if (TipCalculator.this.X.getVisibility() == 0) {
                    TipCalculator.this.X.setText(TipCalculator.this.b0.m(TipCalculator.this.X.getText().toString(), TipCalculator.this.g0));
                }
                TipCalculator.this.D.t0(TipCalculator.this.T, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(TipCalculator.this.O, "error", 0).show();
            }
            if (TipCalculator.this.d0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    TipCalculator.this.f0.vibrate(20L);
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
                TipCalculator.this.b0.k(TipCalculator.this.T, TipCalculator.this.W, TipCalculator.this.V, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.g0);
                TipCalculator.this.D.R(TipCalculator.this.T, TipCalculator.this.U, TipCalculator.this.V, TipCalculator.this.W, TipCalculator.this.Y, TipCalculator.this.X, "6", TipCalculator.this.S, this.d, TipCalculator.this.b0, TipCalculator.this.getBaseContext());
                TipCalculator.this.T.setText(TipCalculator.this.b0.m(TipCalculator.this.T.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.U.setText(TipCalculator.this.b0.m(TipCalculator.this.U.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.Y.setText(TipCalculator.this.b0.m(TipCalculator.this.Y.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.W.setText(TipCalculator.this.b0.m(TipCalculator.this.W.getText().toString(), TipCalculator.this.g0));
                if (TipCalculator.this.V.getVisibility() == 0) {
                    TipCalculator.this.V.setText(TipCalculator.this.b0.m(TipCalculator.this.V.getText().toString(), TipCalculator.this.g0));
                }
                if (TipCalculator.this.X.getVisibility() == 0) {
                    TipCalculator.this.X.setText(TipCalculator.this.b0.m(TipCalculator.this.X.getText().toString(), TipCalculator.this.g0));
                }
                TipCalculator.this.D.t0(TipCalculator.this.T, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(TipCalculator.this.O, "error", 0).show();
            }
            if (TipCalculator.this.d0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    TipCalculator.this.f0.vibrate(20L);
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
                TipCalculator.this.b0.k(TipCalculator.this.T, TipCalculator.this.W, TipCalculator.this.V, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.g0);
                TipCalculator.this.D.R(TipCalculator.this.T, TipCalculator.this.U, TipCalculator.this.V, TipCalculator.this.W, TipCalculator.this.Y, TipCalculator.this.X, "7", TipCalculator.this.S, this.d, TipCalculator.this.b0, TipCalculator.this.getBaseContext());
                TipCalculator.this.T.setText(TipCalculator.this.b0.m(TipCalculator.this.T.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.U.setText(TipCalculator.this.b0.m(TipCalculator.this.U.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.Y.setText(TipCalculator.this.b0.m(TipCalculator.this.Y.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.W.setText(TipCalculator.this.b0.m(TipCalculator.this.W.getText().toString(), TipCalculator.this.g0));
                if (TipCalculator.this.V.getVisibility() == 0) {
                    TipCalculator.this.V.setText(TipCalculator.this.b0.m(TipCalculator.this.V.getText().toString(), TipCalculator.this.g0));
                }
                if (TipCalculator.this.X.getVisibility() == 0) {
                    TipCalculator.this.X.setText(TipCalculator.this.b0.m(TipCalculator.this.X.getText().toString(), TipCalculator.this.g0));
                }
                TipCalculator.this.D.t0(TipCalculator.this.T, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(TipCalculator.this.O, "error", 0).show();
            }
            if (TipCalculator.this.d0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    TipCalculator.this.f0.vibrate(20L);
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
                TipCalculator.this.b0.k(TipCalculator.this.T, TipCalculator.this.W, TipCalculator.this.V, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.g0);
                TipCalculator.this.D.R(TipCalculator.this.T, TipCalculator.this.U, TipCalculator.this.V, TipCalculator.this.W, TipCalculator.this.Y, TipCalculator.this.X, "8", TipCalculator.this.S, this.d, TipCalculator.this.b0, TipCalculator.this.getBaseContext());
                TipCalculator.this.T.setText(TipCalculator.this.b0.m(TipCalculator.this.T.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.U.setText(TipCalculator.this.b0.m(TipCalculator.this.U.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.Y.setText(TipCalculator.this.b0.m(TipCalculator.this.Y.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.W.setText(TipCalculator.this.b0.m(TipCalculator.this.W.getText().toString(), TipCalculator.this.g0));
                if (TipCalculator.this.V.getVisibility() == 0) {
                    TipCalculator.this.V.setText(TipCalculator.this.b0.m(TipCalculator.this.V.getText().toString(), TipCalculator.this.g0));
                }
                if (TipCalculator.this.X.getVisibility() == 0) {
                    TipCalculator.this.X.setText(TipCalculator.this.b0.m(TipCalculator.this.X.getText().toString(), TipCalculator.this.g0));
                }
                TipCalculator.this.D.t0(TipCalculator.this.T, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(TipCalculator.this.O, "error", 0).show();
            }
            if (TipCalculator.this.d0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    TipCalculator.this.f0.vibrate(20L);
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
                TipCalculator.this.b0.k(TipCalculator.this.T, TipCalculator.this.W, TipCalculator.this.V, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.g0);
                TipCalculator.this.D.R(TipCalculator.this.T, TipCalculator.this.U, TipCalculator.this.V, TipCalculator.this.W, TipCalculator.this.Y, TipCalculator.this.X, "9", TipCalculator.this.S, this.d, TipCalculator.this.b0, TipCalculator.this.getBaseContext());
                TipCalculator.this.T.setText(TipCalculator.this.b0.m(TipCalculator.this.T.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.U.setText(TipCalculator.this.b0.m(TipCalculator.this.U.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.Y.setText(TipCalculator.this.b0.m(TipCalculator.this.Y.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.W.setText(TipCalculator.this.b0.m(TipCalculator.this.W.getText().toString(), TipCalculator.this.g0));
                if (TipCalculator.this.V.getVisibility() == 0) {
                    TipCalculator.this.V.setText(TipCalculator.this.b0.m(TipCalculator.this.V.getText().toString(), TipCalculator.this.g0));
                }
                if (TipCalculator.this.X.getVisibility() == 0) {
                    TipCalculator.this.X.setText(TipCalculator.this.b0.m(TipCalculator.this.X.getText().toString(), TipCalculator.this.g0));
                }
                TipCalculator.this.D.t0(TipCalculator.this.T, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(TipCalculator.this.O, "error", 0).show();
            }
            if (TipCalculator.this.d0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    TipCalculator.this.f0.vibrate(20L);
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
                TipCalculator.this.b0.k(TipCalculator.this.T, TipCalculator.this.W, TipCalculator.this.V, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.g0);
                TipCalculator.this.D.R(TipCalculator.this.T, TipCalculator.this.U, TipCalculator.this.V, TipCalculator.this.W, TipCalculator.this.Y, TipCalculator.this.X, ".", TipCalculator.this.S, this.d, TipCalculator.this.b0, TipCalculator.this.getBaseContext());
                TipCalculator.this.T.setText(TipCalculator.this.b0.m(TipCalculator.this.T.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.U.setText(TipCalculator.this.b0.m(TipCalculator.this.U.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.Y.setText(TipCalculator.this.b0.m(TipCalculator.this.Y.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.W.setText(TipCalculator.this.b0.m(TipCalculator.this.W.getText().toString(), TipCalculator.this.g0));
                if (TipCalculator.this.V.getVisibility() == 0) {
                    TipCalculator.this.V.setText(TipCalculator.this.b0.m(TipCalculator.this.V.getText().toString(), TipCalculator.this.g0));
                }
                if (TipCalculator.this.X.getVisibility() == 0) {
                    TipCalculator.this.X.setText(TipCalculator.this.b0.m(TipCalculator.this.X.getText().toString(), TipCalculator.this.g0));
                }
                TipCalculator.this.D.t0(TipCalculator.this.T, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(TipCalculator.this.O, "error", 0).show();
            }
            if (TipCalculator.this.d0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    TipCalculator.this.f0.vibrate(20L);
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
                gVar.f.putString(TipCalculator.this.getResources().getString(R.string.Tutorial_sconto_percetuale), "no");
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
            if (TipCalculator.this.d0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    TipCalculator.this.f0.vibrate(20L);
                }
            }
            TipCalculator tipCalculator = TipCalculator.this;
            tipCalculator.H = this.d.getString(tipCalculator.getString(R.string.Tutorial_sconto_percetuale), "si");
            if (this.e.getText().toString().equals("...%") && TipCalculator.this.H.equals("si")) {
                AlertDialog.Builder builder = new AlertDialog.Builder(TipCalculator.this);
                builder.setMessage(TipCalculator.this.getResources().getString(R.string.Suggerimento_calcolo_tip_messaggio));
                builder.setTitle(TipCalculator.this.getResources().getString(R.string.Suggerimento_calcolo_iva));
                builder.setCancelable(false);
                builder.setPositiveButton(TipCalculator.this.getResources().getString(R.string.testo_bottone_tutorial), new a());
                builder.create().show();
                return;
            }
            try {
                if (this.e.getText().toString().equals("...%")) {
                    return;
                }
                TipCalculator.this.b0.k(TipCalculator.this.T, TipCalculator.this.W, TipCalculator.this.V, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.g0);
                TipCalculator.this.D.T(TipCalculator.this.T, TipCalculator.this.U, TipCalculator.this.V, TipCalculator.this.W, TipCalculator.this.Y, TipCalculator.this.X, this.e.getText().toString().substring(0, this.e.getText().toString().length() - 2), TipCalculator.this.S, this.g, TipCalculator.this.b0, TipCalculator.this.getBaseContext());
                TipCalculator.this.T.setText(TipCalculator.this.b0.m(TipCalculator.this.T.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.U.setText(TipCalculator.this.b0.m(TipCalculator.this.U.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.Y.setText(TipCalculator.this.b0.m(TipCalculator.this.Y.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.W.setText(TipCalculator.this.b0.m(TipCalculator.this.W.getText().toString(), TipCalculator.this.g0));
                if (TipCalculator.this.V.getVisibility() == 0) {
                    TipCalculator.this.V.setText(TipCalculator.this.b0.m(TipCalculator.this.V.getText().toString(), TipCalculator.this.g0));
                }
                if (TipCalculator.this.X.getVisibility() == 0) {
                    TipCalculator.this.X.setText(TipCalculator.this.b0.m(TipCalculator.this.X.getText().toString(), TipCalculator.this.g0));
                }
                TipCalculator.this.D.t0(TipCalculator.this.T, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(TipCalculator.this.O, "error", 0).show();
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
                hVar.f.putString(TipCalculator.this.getResources().getString(R.string.Tutorial_sconto_percetuale), "no");
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
            if (TipCalculator.this.d0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    TipCalculator.this.f0.vibrate(20L);
                }
            }
            TipCalculator tipCalculator = TipCalculator.this;
            tipCalculator.H = this.d.getString(tipCalculator.getString(R.string.Tutorial_sconto_percetuale), "si");
            if (this.e.getText().toString().equals("...%") && TipCalculator.this.H.equals("si")) {
                AlertDialog.Builder builder = new AlertDialog.Builder(TipCalculator.this);
                builder.setMessage(TipCalculator.this.getResources().getString(R.string.Suggerimento_calcolo_tip_messaggio));
                builder.setTitle(TipCalculator.this.getResources().getString(R.string.Suggerimento_calcolo_iva));
                builder.setCancelable(false);
                builder.setPositiveButton(TipCalculator.this.getResources().getString(R.string.testo_bottone_tutorial), new a());
                builder.create().show();
                return;
            }
            try {
                if (this.e.getText().toString().equals("...%")) {
                    return;
                }
                TipCalculator.this.b0.k(TipCalculator.this.T, TipCalculator.this.W, TipCalculator.this.V, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.g0);
                TipCalculator.this.D.T(TipCalculator.this.T, TipCalculator.this.U, TipCalculator.this.V, TipCalculator.this.W, TipCalculator.this.Y, TipCalculator.this.X, this.e.getText().toString().substring(0, this.e.getText().toString().length() - 2), TipCalculator.this.S, this.g, TipCalculator.this.b0, TipCalculator.this.getBaseContext());
                TipCalculator.this.T.setText(TipCalculator.this.b0.m(TipCalculator.this.T.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.U.setText(TipCalculator.this.b0.m(TipCalculator.this.U.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.Y.setText(TipCalculator.this.b0.m(TipCalculator.this.Y.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.W.setText(TipCalculator.this.b0.m(TipCalculator.this.W.getText().toString(), TipCalculator.this.g0));
                if (TipCalculator.this.V.getVisibility() == 0) {
                    TipCalculator.this.V.setText(TipCalculator.this.b0.m(TipCalculator.this.V.getText().toString(), TipCalculator.this.g0));
                }
                if (TipCalculator.this.X.getVisibility() == 0) {
                    TipCalculator.this.X.setText(TipCalculator.this.b0.m(TipCalculator.this.X.getText().toString(), TipCalculator.this.g0));
                }
                TipCalculator.this.D.t0(TipCalculator.this.T, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(TipCalculator.this.O, "error", 0).show();
            }
        }
    }

    class i implements View.OnLongClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ SharedPreferences.Editor e;

        class a implements SeekBar.OnSeekBarChangeListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TextView f7035a;

            a(TextView textView) {
                this.f7035a = textView;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int r2, boolean z) {
                this.f7035a.setText(String.valueOf(r2) + " %");
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
                if (TipCalculator.this.d0.equals("si")) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                    } else {
                        TipCalculator.this.f0.vibrate(20L);
                    }
                }
                i iVar = i.this;
                iVar.e.putString(TipCalculator.this.getResources().getString(R.string.tip_percetualeUNO), this.d.getText().toString());
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
                if (TipCalculator.this.d0.equals("si")) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                    } else {
                        TipCalculator.this.f0.vibrate(20L);
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
            if (TipCalculator.this.d0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    TipCalculator.this.f0.vibrate(20L);
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(TipCalculator.this);
            builder.setMessage(TipCalculator.this.getResources().getString(R.string.calcolo_tip_messaggio));
            View viewInflate = ((LayoutInflater) TipCalculator.this.getSystemService("layout_inflater")).inflate(R.layout.seekbar, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(R.id.textSeekBar);
            textView.setText(this.d.getText().toString());
            SeekBar seekBar = (SeekBar) viewInflate.findViewById(R.id.ivaSeekBar);
            if (!this.d.getText().toString().equals("...%")) {
                seekBar.setProgress(Integer.parseInt(this.d.getText().toString().substring(0, this.d.getText().toString().length() - 2)));
            }
            seekBar.setOnSeekBarChangeListener(new a(textView));
            builder.setView(viewInflate);
            builder.setCancelable(false);
            builder.setPositiveButton(TipCalculator.this.getResources().getString(R.string.calcolo_iva_messaggio_fatto), new b(textView));
            builder.setNegativeButton(TipCalculator.this.getResources().getString(R.string.calcolo_iva_messaggio_indietro), new c());
            builder.create().show();
            return true;
        }
    }

    class j implements View.OnLongClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ SharedPreferences.Editor e;

        class a implements SeekBar.OnSeekBarChangeListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TextView f7037a;

            a(TextView textView) {
                this.f7037a = textView;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int r2, boolean z) {
                this.f7037a.setText(String.valueOf(r2) + " %");
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
                if (TipCalculator.this.d0.equals("si")) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                    } else {
                        TipCalculator.this.f0.vibrate(20L);
                    }
                }
                j jVar = j.this;
                jVar.e.putString(TipCalculator.this.getResources().getString(R.string.tip_percetualeDUE), this.d.getText().toString());
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
                if (TipCalculator.this.d0.equals("si")) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                    } else {
                        TipCalculator.this.f0.vibrate(20L);
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
            if (TipCalculator.this.d0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    TipCalculator.this.f0.vibrate(20L);
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(TipCalculator.this);
            builder.setMessage(TipCalculator.this.getResources().getString(R.string.calcolo_tip_messaggio));
            View viewInflate = ((LayoutInflater) TipCalculator.this.getSystemService("layout_inflater")).inflate(R.layout.seekbar, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(R.id.textSeekBar);
            textView.setText(this.d.getText().toString());
            SeekBar seekBar = (SeekBar) viewInflate.findViewById(R.id.ivaSeekBar);
            if (!this.d.getText().toString().equals("...%")) {
                seekBar.setProgress(Integer.parseInt(this.d.getText().toString().substring(0, this.d.getText().toString().length() - 2)));
            }
            seekBar.setOnSeekBarChangeListener(new a(textView));
            builder.setView(viewInflate);
            builder.setCancelable(false);
            builder.setPositiveButton(TipCalculator.this.getResources().getString(R.string.calcolo_iva_messaggio_fatto), new b(textView));
            builder.setNegativeButton(TipCalculator.this.getResources().getString(R.string.calcolo_iva_messaggio_indietro), new c());
            builder.create().show();
            return true;
        }
    }

    class k implements com.google.android.gms.ads.k0.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f7039a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SharedPreferences.Editor f7040b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LinearLayout.LayoutParams f7041c;
        final /* synthetic */ LinearLayout.LayoutParams d;
        final /* synthetic */ LinearLayout.LayoutParams e;

        k(Bundle bundle, SharedPreferences.Editor editor, LinearLayout.LayoutParams layoutParams, LinearLayout.LayoutParams layoutParams2, LinearLayout.LayoutParams layoutParams3) {
            this.f7039a = bundle;
            this.f7040b = editor;
            this.f7041c = layoutParams;
            this.d = layoutParams2;
            this.e = layoutParams3;
        }

        @Override // com.google.android.gms.ads.k0.d
        public void a1(int r1) {
        }

        @Override // com.google.android.gms.ads.k0.d
        public void h1() {
            TipCalculator.this.s0.u1("ca-app-pub-8629550575650531/6929873653", new e.a().d(AdMobAdapter.class, this.f7039a).f());
            this.f7040b.putLong("data_gift_rifiutato", System.currentTimeMillis());
            this.f7040b.apply();
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
            Toast toastMakeText = Toast.makeText(TipCalculator.this.getBaseContext(), TipCalculator.this.getResources().getString(R.string.premioPRO), 1);
            toastMakeText.setGravity(48, 0, 0);
            toastMakeText.show();
            this.f7040b.putLong("data_gift_vinto", System.currentTimeMillis());
            this.f7040b.apply();
            TipCalculator.this.z0.setVisibility(8);
            if (TipCalculator.this.L.equals("si")) {
                TipCalculator.this.X.setVisibility(0);
                TipCalculator.this.a0.setVisibility(0);
            }
            if (TipCalculator.this.M.equals("si")) {
                TipCalculator.this.V.setVisibility(0);
                TipCalculator.this.Z.setVisibility(0);
            }
            if (TipCalculator.this.M.equals("si") && TipCalculator.this.L.equals("si")) {
                scrollView = TipCalculator.this.j0;
                layoutParams = this.f7041c;
            } else if ((TipCalculator.this.M.equals("si") && !TipCalculator.this.L.equals("si")) || (!TipCalculator.this.M.equals("si") && TipCalculator.this.L.equals("si"))) {
                scrollView = TipCalculator.this.j0;
                layoutParams = this.d;
            } else {
                if (TipCalculator.this.M.equals("si") || TipCalculator.this.L.equals("si")) {
                    return;
                }
                scrollView = TipCalculator.this.j0;
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
                if (TipCalculator.this.d0.equals("si")) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                    } else {
                        TipCalculator.this.f0.vibrate(20L);
                    }
                }
            }
        }

        class b implements DialogInterface.OnClickListener {
            b() {
            }

            /* JADX WARN: Removed duplicated region for block: B:36:0x041a  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x05f5  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x0809  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x084f  */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onClick(android.content.DialogInterface r22, int r23) {
                /*
                    Method dump skipped, instructions count: 2156
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.TipCalculator.l.b.onClick(android.content.DialogInterface, int):void");
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
            if (TipCalculator.this.d0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    TipCalculator.this.f0.vibrate(20L);
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(TipCalculator.this);
            View viewInflate = ((LayoutInflater) TipCalculator.this.getSystemService("layout_inflater")).inflate(R.layout.more_tip, (ViewGroup) null);
            TipCalculator.this.m0 = (CheckBox) viewInflate.findViewById(R.id.CheckBoxAddIvaTip);
            TipCalculator.this.n0 = (CheckBox) viewInflate.findViewById(R.id.CheckBoxAddpricefinal);
            if (TipCalculator.this.X.getVisibility() == 0) {
                TipCalculator.this.n0.setChecked(true);
            }
            if (TipCalculator.this.V.getVisibility() == 0) {
                TipCalculator.this.m0.setChecked(true);
            }
            builder.setView(viewInflate);
            builder.setTitle(TipCalculator.this.getResources().getString(R.string.titoloAGGIUNIG));
            builder.setCancelable(false);
            builder.setNegativeButton(TipCalculator.this.getResources().getString(R.string.calcolo_iva_messaggio_indietro), new a());
            builder.setPositiveButton(TipCalculator.this.getResources().getString(R.string.salvasceltalaunchercalculator), new b());
            builder.create().show();
        }
    }

    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TipCalculator.this.d0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    TipCalculator.this.f0.vibrate(20L);
                }
            }
            TipCalculator.this.startActivity(new Intent(TipCalculator.this, (Class<?>) CalcolatriceVolante.class));
        }
    }

    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TipCalculator.this.U.setText("");
            TipCalculator.this.T.setText("");
            TipCalculator.this.W.setText("");
            TipCalculator.this.Y.setText("");
            if (TipCalculator.this.V.getVisibility() == 0) {
                TipCalculator.this.V.setText("");
            }
            if (TipCalculator.this.X.getVisibility() == 0) {
                TipCalculator.this.X.setText("");
            }
            if (TipCalculator.this.d0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(40L, -1));
                } else {
                    TipCalculator.this.f0.vibrate(40L);
                }
            }
        }
    }

    class o implements View.OnLongClickListener {
        final /* synthetic */ DecimalFormat d;

        o(DecimalFormat decimalFormat) {
            this.d = decimalFormat;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x02f8  */
        /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
        @Override // android.view.View.OnLongClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onLongClick(android.view.View r18) {
            /*
                Method dump skipped, instructions count: 790
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.TipCalculator.o.onLongClick(android.view.View):boolean");
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
                TipCalculator.this.b0.k(TipCalculator.this.T, TipCalculator.this.W, TipCalculator.this.V, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.g0);
                TipCalculator.this.D.R(TipCalculator.this.T, TipCalculator.this.U, TipCalculator.this.V, TipCalculator.this.W, TipCalculator.this.Y, TipCalculator.this.X, "canc", TipCalculator.this.S, this.d, TipCalculator.this.b0, TipCalculator.this.getBaseContext());
                TipCalculator.this.T.setText(TipCalculator.this.b0.m(TipCalculator.this.T.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.U.setText(TipCalculator.this.b0.m(TipCalculator.this.U.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.Y.setText(TipCalculator.this.b0.m(TipCalculator.this.Y.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.W.setText(TipCalculator.this.b0.m(TipCalculator.this.W.getText().toString(), TipCalculator.this.g0));
                if (TipCalculator.this.V.getVisibility() == 0) {
                    TipCalculator.this.V.setText(TipCalculator.this.b0.m(TipCalculator.this.V.getText().toString(), TipCalculator.this.g0));
                }
                if (TipCalculator.this.X.getVisibility() == 0) {
                    TipCalculator.this.X.setText(TipCalculator.this.b0.m(TipCalculator.this.X.getText().toString(), TipCalculator.this.g0));
                }
                TipCalculator.this.D.t0(TipCalculator.this.T, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(TipCalculator.this.O, "error", 0).show();
            }
            if (TipCalculator.this.d0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    TipCalculator.this.f0.vibrate(20L);
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
                if (TipCalculator.this.d0.equals("si")) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                    } else {
                        TipCalculator.this.f0.vibrate(20L);
                    }
                }
                Bitmap bitmapE0 = TipCalculator.this.e0(this.d);
                try {
                    File file = new File(TipCalculator.this.getExternalCacheDir(), "logicchip.png");
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    bitmapE0.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    file.setReadable(true, true);
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setFlags(268435456);
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                    intent.setType("image/png");
                    String string = TipCalculator.this.getResources().getString(R.string.app_name);
                    String string2 = TipCalculator.this.getResources().getString(R.string.textShare);
                    intent.putExtra("android.intent.extra.SUBJECT", string);
                    intent.putExtra("android.intent.extra.TEXT", string2);
                    TipCalculator.this.startActivity(Intent.createChooser(intent, "Share image via"));
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
                this.d.dismiss();
                if (TipCalculator.this.d0.equals("si")) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                    } else {
                        TipCalculator.this.f0.vibrate(20L);
                    }
                }
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
            TextView textView2;
            TextView textView3;
            TextView textView4;
            char c2 = 65535;
            if (TipCalculator.this.d0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    TipCalculator.this.f0.vibrate(20L);
                }
            }
            try {
                if (TipCalculator.this.T.getText().toString().isEmpty() || TipCalculator.this.U.getText().toString().isEmpty()) {
                    Toast.makeText(TipCalculator.this.O, TipCalculator.this.getResources().getString(R.string.errorSEZIONEtip), 0).show();
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(TipCalculator.this);
                LayoutInflater layoutInflater = (LayoutInflater) TipCalculator.this.getSystemService("layout_inflater");
                View viewInflate = layoutInflater.inflate(R.layout.list_tip_dark, (ViewGroup) null);
                String str = TipCalculator.this.c0;
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
                    viewInflate = layoutInflater.inflate(R.layout.list_tip_classic, (ViewGroup) null);
                } else if (c2 == 1) {
                    viewInflate = layoutInflater.inflate(R.layout.list_tip_dark, (ViewGroup) null);
                } else if (c2 == 2) {
                    viewInflate = layoutInflater.inflate(R.layout.list_tip_minimal, (ViewGroup) null);
                } else if (c2 == 3) {
                    viewInflate = layoutInflater.inflate(R.layout.list_tip_elegant, (ViewGroup) null);
                } else if (c2 == 4) {
                    viewInflate = layoutInflater.inflate(R.layout.list_tip_light, (ViewGroup) null);
                }
                TextView textView5 = (TextView) viewInflate.findViewById(R.id.titlelistTip);
                LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.linearListTip);
                Button button = (Button) viewInflate.findViewById(R.id.shareTipListButton);
                Button button2 = (Button) viewInflate.findViewById(R.id.backTipListButton);
                TextView textView6 = (TextView) viewInflate.findViewById(R.id.textListPREZZOINIZIALEt);
                TextView textView7 = (TextView) viewInflate.findViewById(R.id.textListtotalescontot);
                textView6.setText(TipCalculator.this.getResources().getString(R.string.PrezzoOriginaleTip) + TipCalculator.this.T.getText().toString());
                textView7.setText(TipCalculator.this.getResources().getString(R.string.Costoperpax_list_tip) + TipCalculator.this.Y.getText().toString());
                TextView textView8 = (TextView) viewInflate.findViewById(R.id.textListPREZZofinaledopoprimoscontot);
                TextView textView9 = (TextView) viewInflate.findViewById(R.id.textListPRIMOSCONTOt);
                TextView textView10 = (TextView) viewInflate.findViewById(R.id.textListIVAt);
                TextView textView11 = (TextView) viewInflate.findViewById(R.id.seperatore1scontot);
                TextView textView12 = (TextView) viewInflate.findViewById(R.id.textListPREZZofinaledoposecondoscontot);
                TextView textView13 = (TextView) viewInflate.findViewById(R.id.textListSecondoSCONTOt);
                TextView textView14 = (TextView) viewInflate.findViewById(R.id.seperatore2scontot);
                StringBuilder sb = new StringBuilder();
                View view2 = viewInflate;
                sb.append(TipCalculator.this.getResources().getString(R.string.tip_npersons_list));
                sb.append(" → ");
                sb.append(TipCalculator.this.U.getText().toString());
                textView13.setText(sb.toString());
                if (TipCalculator.this.V.getVisibility() == 8 || TipCalculator.this.V.getText().toString().isEmpty()) {
                    obj = "si";
                    textView = textView5;
                    textView2 = textView13;
                    textView3 = textView6;
                    textView4 = textView7;
                    textView10.setVisibility(8);
                } else {
                    textView2 = textView13;
                    textView = textView5;
                    textView4 = textView7;
                    textView3 = textView6;
                    obj = "si";
                    TipCalculator.this.b0.k(TipCalculator.this.T, TipCalculator.this.W, TipCalculator.this.V, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.g0);
                    TipCalculator.this.D.z(TipCalculator.this.T, TipCalculator.this.V, textView10, TipCalculator.this.V.getText().toString(), TipCalculator.this.S, this.d, TipCalculator.this.b0, TipCalculator.this.getBaseContext());
                    TipCalculator.this.T.setText(TipCalculator.this.b0.m(TipCalculator.this.T.getText().toString(), TipCalculator.this.g0));
                    TipCalculator.this.U.setText(TipCalculator.this.b0.m(TipCalculator.this.U.getText().toString(), TipCalculator.this.g0));
                    TipCalculator.this.Y.setText(TipCalculator.this.b0.m(TipCalculator.this.Y.getText().toString(), TipCalculator.this.g0));
                    TipCalculator.this.X.setText(TipCalculator.this.b0.m(TipCalculator.this.X.getText().toString(), TipCalculator.this.g0));
                    TipCalculator.this.V.setText(TipCalculator.this.b0.m(TipCalculator.this.V.getText().toString(), TipCalculator.this.g0));
                    TipCalculator.this.W.setText(TipCalculator.this.b0.m(TipCalculator.this.W.getText().toString(), TipCalculator.this.g0));
                    textView10.setText(TipCalculator.this.getResources().getString(R.string.taxtip_list) + " " + TipCalculator.this.V.getText().toString() + "% → " + TipCalculator.this.b0.m(textView10.getText().toString(), TipCalculator.this.g0));
                }
                if (TipCalculator.this.W.getText().toString().isEmpty()) {
                    textView12.setVisibility(8);
                    textView14.setVisibility(8);
                    textView8.setVisibility(8);
                    textView9.setVisibility(8);
                    textView11.setVisibility(8);
                } else {
                    TipCalculator.this.b0.k(TipCalculator.this.T, TipCalculator.this.W, TipCalculator.this.V, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.g0);
                    String[] strArrV0 = TipCalculator.this.D.v0(TipCalculator.this.T, TipCalculator.this.V, TipCalculator.this.W, this.d, TipCalculator.this.b0, TipCalculator.this.getBaseContext());
                    TipCalculator.this.T.setText(TipCalculator.this.b0.m(TipCalculator.this.T.getText().toString(), TipCalculator.this.g0));
                    TipCalculator.this.W.setText(TipCalculator.this.b0.m(TipCalculator.this.W.getText().toString(), TipCalculator.this.g0));
                    TipCalculator.this.Y.setText(TipCalculator.this.b0.m(TipCalculator.this.Y.getText().toString(), TipCalculator.this.g0));
                    TipCalculator.this.X.setText(TipCalculator.this.b0.m(TipCalculator.this.X.getText().toString(), TipCalculator.this.g0));
                    TipCalculator.this.V.setText(TipCalculator.this.b0.m(TipCalculator.this.V.getText().toString(), TipCalculator.this.g0));
                    textView8.setText(TipCalculator.this.getResources().getString(R.string.tip_mancia_list) + TipCalculator.this.b0.m(strArrV0[0], TipCalculator.this.g0));
                    textView9.setText(TipCalculator.this.getResources().getString(R.string.tip_mancia_list2) + " → " + TipCalculator.this.W.getText().toString() + "%");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(TipCalculator.this.getResources().getString(R.string.tip_importo_tot_list));
                    sb2.append(TipCalculator.this.b0.m(strArrV0[1], TipCalculator.this.g0));
                    textView12.setText(sb2.toString());
                }
                if (TipCalculator.this.o0.equals(obj)) {
                    TextView textView15 = textView3;
                    textView15.setTypeface(Typeface.SANS_SERIF);
                    textView15.setLetterSpacing(0.0f);
                    TextView textView16 = textView4;
                    textView16.setTypeface(Typeface.SANS_SERIF);
                    textView16.setLetterSpacing(0.0f);
                    textView8.setTypeface(Typeface.SANS_SERIF);
                    textView8.setLetterSpacing(0.0f);
                    textView9.setTypeface(Typeface.SANS_SERIF);
                    textView9.setLetterSpacing(0.0f);
                    TextView textView17 = textView;
                    textView17.setTypeface(Typeface.SANS_SERIF);
                    textView17.setLetterSpacing(0.0f);
                    textView10.setTypeface(Typeface.SANS_SERIF);
                    textView10.setLetterSpacing(0.0f);
                    textView12.setTypeface(Typeface.SANS_SERIF);
                    textView12.setLetterSpacing(0.0f);
                    TextView textView18 = textView2;
                    textView18.setTypeface(Typeface.SANS_SERIF);
                    textView18.setLetterSpacing(0.0f);
                }
                builder.setView(view2);
                button.setOnClickListener(new a(linearLayout));
                AlertDialog alertDialogCreate = builder.create();
                alertDialogCreate.show();
                button2.setOnClickListener(new b(alertDialogCreate));
            } catch (NumberFormatException unused) {
                Toast.makeText(TipCalculator.this.O, "error", 0).show();
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
            if (TipCalculator.this.F.getVisibility() != 8) {
                TipCalculator.this.F.setVisibility(8);
                TipCalculator.this.B0 = "NO";
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
                TipCalculator.this.Q.e(((Long) arrayList.get(r0)).longValue(), TipCalculator.this.P);
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
            TipCalculator tipCalculator;
            int r0;
            if (TipCalculator.this.d0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    TipCalculator.this.f0.vibrate(20L);
                }
            }
            if (TipCalculator.this.U.isChecked()) {
                TipCalculator.this.U.setChecked(false);
                TipCalculator.this.T.setChecked(true);
                TipCalculator.this.S = 1;
                return;
            }
            if (TipCalculator.this.T.isChecked() && TipCalculator.this.V.getVisibility() == 0) {
                TipCalculator.this.T.setChecked(false);
                TipCalculator.this.V.setChecked(true);
                tipCalculator = TipCalculator.this;
                r0 = 3;
            } else {
                if (!TipCalculator.this.W.isChecked()) {
                    return;
                }
                TipCalculator.this.W.setChecked(false);
                TipCalculator.this.U.setChecked(true);
                tipCalculator = TipCalculator.this;
                r0 = 2;
            }
            tipCalculator.S = r0;
        }
    }

    class u implements View.OnClickListener {
        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TipCalculator tipCalculator;
            int r0;
            if (TipCalculator.this.d0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    TipCalculator.this.f0.vibrate(20L);
                }
            }
            if (TipCalculator.this.T.isChecked()) {
                TipCalculator.this.T.setChecked(false);
                TipCalculator.this.U.setChecked(true);
                tipCalculator = TipCalculator.this;
                r0 = 2;
            } else if (TipCalculator.this.V.isChecked() && TipCalculator.this.V.getVisibility() == 0) {
                TipCalculator.this.V.setChecked(false);
                TipCalculator.this.T.setChecked(true);
                TipCalculator.this.S = 1;
                return;
            } else {
                if (!TipCalculator.this.U.isChecked()) {
                    return;
                }
                TipCalculator.this.U.setChecked(false);
                TipCalculator.this.W.setChecked(true);
                tipCalculator = TipCalculator.this;
                r0 = 4;
            }
            tipCalculator.S = r0;
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
                TipCalculator.this.b0.k(TipCalculator.this.T, TipCalculator.this.W, TipCalculator.this.V, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.g0);
                TipCalculator.this.D.R(TipCalculator.this.T, TipCalculator.this.U, TipCalculator.this.V, TipCalculator.this.W, TipCalculator.this.Y, TipCalculator.this.X, "0", TipCalculator.this.S, this.d, TipCalculator.this.b0, TipCalculator.this.getBaseContext());
                TipCalculator.this.T.setText(TipCalculator.this.b0.m(TipCalculator.this.T.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.U.setText(TipCalculator.this.b0.m(TipCalculator.this.U.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.Y.setText(TipCalculator.this.b0.m(TipCalculator.this.Y.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.W.setText(TipCalculator.this.b0.m(TipCalculator.this.W.getText().toString(), TipCalculator.this.g0));
                if (TipCalculator.this.V.getVisibility() == 0) {
                    TipCalculator.this.V.setText(TipCalculator.this.b0.m(TipCalculator.this.V.getText().toString(), TipCalculator.this.g0));
                }
                if (TipCalculator.this.X.getVisibility() == 0) {
                    TipCalculator.this.X.setText(TipCalculator.this.b0.m(TipCalculator.this.X.getText().toString(), TipCalculator.this.g0));
                }
                TipCalculator.this.D.t0(TipCalculator.this.T, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(TipCalculator.this.O, "error", 0).show();
            }
            if (TipCalculator.this.d0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    TipCalculator.this.f0.vibrate(20L);
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
                TipCalculator.this.b0.k(TipCalculator.this.T, TipCalculator.this.W, TipCalculator.this.V, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.g0);
                TipCalculator.this.D.R(TipCalculator.this.T, TipCalculator.this.U, TipCalculator.this.V, TipCalculator.this.W, TipCalculator.this.Y, TipCalculator.this.X, "1", TipCalculator.this.S, this.d, TipCalculator.this.b0, TipCalculator.this.getBaseContext());
                TipCalculator.this.T.setText(TipCalculator.this.b0.m(TipCalculator.this.T.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.U.setText(TipCalculator.this.b0.m(TipCalculator.this.U.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.Y.setText(TipCalculator.this.b0.m(TipCalculator.this.Y.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.W.setText(TipCalculator.this.b0.m(TipCalculator.this.W.getText().toString(), TipCalculator.this.g0));
                if (TipCalculator.this.V.getVisibility() == 0) {
                    TipCalculator.this.V.setText(TipCalculator.this.b0.m(TipCalculator.this.V.getText().toString(), TipCalculator.this.g0));
                }
                if (TipCalculator.this.X.getVisibility() == 0) {
                    TipCalculator.this.X.setText(TipCalculator.this.b0.m(TipCalculator.this.X.getText().toString(), TipCalculator.this.g0));
                }
                TipCalculator.this.D.t0(TipCalculator.this.T, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(TipCalculator.this.O, "error", 0).show();
            }
            if (TipCalculator.this.d0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    TipCalculator.this.f0.vibrate(20L);
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
                TipCalculator.this.b0.k(TipCalculator.this.T, TipCalculator.this.W, TipCalculator.this.V, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.g0);
                TipCalculator.this.D.R(TipCalculator.this.T, TipCalculator.this.U, TipCalculator.this.V, TipCalculator.this.W, TipCalculator.this.Y, TipCalculator.this.X, "2", TipCalculator.this.S, this.d, TipCalculator.this.b0, TipCalculator.this.getBaseContext());
                TipCalculator.this.T.setText(TipCalculator.this.b0.m(TipCalculator.this.T.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.U.setText(TipCalculator.this.b0.m(TipCalculator.this.U.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.Y.setText(TipCalculator.this.b0.m(TipCalculator.this.Y.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.W.setText(TipCalculator.this.b0.m(TipCalculator.this.W.getText().toString(), TipCalculator.this.g0));
                if (TipCalculator.this.V.getVisibility() == 0) {
                    TipCalculator.this.V.setText(TipCalculator.this.b0.m(TipCalculator.this.V.getText().toString(), TipCalculator.this.g0));
                }
                if (TipCalculator.this.X.getVisibility() == 0) {
                    TipCalculator.this.X.setText(TipCalculator.this.b0.m(TipCalculator.this.X.getText().toString(), TipCalculator.this.g0));
                }
                TipCalculator.this.D.t0(TipCalculator.this.T, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(TipCalculator.this.O, "error", 0).show();
            }
            if (TipCalculator.this.d0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    TipCalculator.this.f0.vibrate(20L);
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
                TipCalculator.this.b0.k(TipCalculator.this.T, TipCalculator.this.W, TipCalculator.this.V, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.g0);
                TipCalculator.this.D.R(TipCalculator.this.T, TipCalculator.this.U, TipCalculator.this.V, TipCalculator.this.W, TipCalculator.this.Y, TipCalculator.this.X, "3", TipCalculator.this.S, this.d, TipCalculator.this.b0, TipCalculator.this.getBaseContext());
                TipCalculator.this.T.setText(TipCalculator.this.b0.m(TipCalculator.this.T.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.U.setText(TipCalculator.this.b0.m(TipCalculator.this.U.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.Y.setText(TipCalculator.this.b0.m(TipCalculator.this.Y.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.W.setText(TipCalculator.this.b0.m(TipCalculator.this.W.getText().toString(), TipCalculator.this.g0));
                if (TipCalculator.this.V.getVisibility() == 0) {
                    TipCalculator.this.V.setText(TipCalculator.this.b0.m(TipCalculator.this.V.getText().toString(), TipCalculator.this.g0));
                }
                if (TipCalculator.this.X.getVisibility() == 0) {
                    TipCalculator.this.X.setText(TipCalculator.this.b0.m(TipCalculator.this.X.getText().toString(), TipCalculator.this.g0));
                }
                TipCalculator.this.D.t0(TipCalculator.this.T, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(TipCalculator.this.O, "error", 0).show();
            }
            if (TipCalculator.this.d0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    TipCalculator.this.f0.vibrate(20L);
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
                TipCalculator.this.b0.k(TipCalculator.this.T, TipCalculator.this.W, TipCalculator.this.V, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.g0);
                TipCalculator.this.D.R(TipCalculator.this.T, TipCalculator.this.U, TipCalculator.this.V, TipCalculator.this.W, TipCalculator.this.Y, TipCalculator.this.X, "4", TipCalculator.this.S, this.d, TipCalculator.this.b0, TipCalculator.this.getBaseContext());
                TipCalculator.this.T.setText(TipCalculator.this.b0.m(TipCalculator.this.T.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.U.setText(TipCalculator.this.b0.m(TipCalculator.this.U.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.Y.setText(TipCalculator.this.b0.m(TipCalculator.this.Y.getText().toString(), TipCalculator.this.g0));
                TipCalculator.this.W.setText(TipCalculator.this.b0.m(TipCalculator.this.W.getText().toString(), TipCalculator.this.g0));
                if (TipCalculator.this.V.getVisibility() == 0) {
                    TipCalculator.this.V.setText(TipCalculator.this.b0.m(TipCalculator.this.V.getText().toString(), TipCalculator.this.g0));
                }
                if (TipCalculator.this.X.getVisibility() == 0) {
                    TipCalculator.this.X.setText(TipCalculator.this.b0.m(TipCalculator.this.X.getText().toString(), TipCalculator.this.g0));
                }
                TipCalculator.this.D.t0(TipCalculator.this.T, TipCalculator.this.U, TipCalculator.this.Y, TipCalculator.this.X, TipCalculator.this.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(TipCalculator.this.O, "error", 0).show();
            }
            if (TipCalculator.this.d0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    TipCalculator.this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    TipCalculator.this.f0.vibrate(20L);
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
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(this.p0));
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
        if (this.d0.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.f0.vibrate(20L);
            }
        }
        Locale.setDefault(Locale.US);
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormatSymbols.setGroupingSeparator(',');
        DecimalFormat decimalFormat = new DecimalFormat("#,###.########", decimalFormatSymbols);
        DecimalFormat decimalFormat2 = new DecimalFormat("#,###.###", decimalFormatSymbols);
        long jLongValue = ((Long) ((View) view.getParent().getParent()).getTag()).longValue();
        SQLiteDatabase readableDatabase = this.Q.getReadableDatabase();
        this.P = readableDatabase;
        Cursor cursorI = this.Q.i(jLongValue, readableDatabase);
        BigDecimal bigDecimal2 = new BigDecimal("9999999999");
        while (cursorI.moveToNext()) {
            try {
                String strG = this.b0.g(cursorI.getString(0), "Default");
                if (Pattern.compile("^[-]").matcher(strG).find()) {
                    strG = strG.substring(1);
                }
                String strL = this.b0.l(this.C.a(strG), decimalFormat, Locale.US);
                if (new BigDecimal(strL.replaceAll(str4, str3)).compareTo(bigDecimal2) < 0) {
                    this.k0 = decimalFormat2.format(new BigDecimal(strL.replaceAll(str4, str3)));
                } else {
                    this.k0 = "9,999,999,999";
                    Toast.makeText(this, getResources().getString(R.string.overflow_result), 1).show();
                }
                this.b0.k(this.T, this.W, this.V, this.U, this.Y, this.X, this.g0);
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
                        this.D.S(this.T, this.U, this.V, this.W, this.Y, this.X, this.k0, this.S, decimalFormat2, this.b0, getBaseContext());
                        this.T.setText(this.b0.m(this.k0, this.g0));
                        this.U.setText(this.b0.m(this.U.getText().toString(), this.g0));
                        this.Y.setText(this.b0.m(this.Y.getText().toString(), this.g0));
                        this.W.setText(this.b0.m(this.W.getText().toString(), this.g0));
                        if (this.V.getVisibility() == 0) {
                            this.V.setText(this.b0.m(this.V.getText().toString(), this.g0));
                        }
                        if (this.X.getVisibility() == 0) {
                            this.X.setText(this.b0.m(this.X.getText().toString(), this.g0));
                        }
                        this.D.t0(this.T, this.U, this.Y, this.X, getBaseContext());
                    } catch (NumberFormatException | EmptyStackException unused3) {
                        Toast.makeText(this.O, "error", r4).show();
                        str3 = str;
                        str4 = str2;
                        cursorI = cursor;
                        bigDecimal2 = bigDecimal;
                    }
                } catch (NumberFormatException | EmptyStackException unused4) {
                    cursor = cursorI;
                    bigDecimal = bigDecimal2;
                    r4 = 0;
                    Toast.makeText(this.O, "error", r4).show();
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
                Toast.makeText(this.O, "error", r4).show();
                str3 = str;
                str4 = str2;
                cursorI = cursor;
                bigDecimal2 = bigDecimal;
            } catch (EmptyStackException unused6) {
                str2 = str4;
                cursor = cursorI;
                bigDecimal = bigDecimal2;
                r4 = 0;
                Toast.makeText(this.O, "error", r4).show();
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
        this.I.h();
    }

    public void ckmemory(View view) {
        com.gp7.easycalculator.c cVar;
        Long lValueOf;
        SQLiteDatabase sQLiteDatabase;
        String str;
        if (this.d0.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.f0.vibrate(20L);
            }
        }
        CheckBox checkBox = (CheckBox) view;
        this.E = checkBox;
        long jLongValue = ((Long) ((View) checkBox.getParent().getParent()).getTag()).longValue();
        if (this.E.isChecked()) {
            this.E.setBackground(getDrawable(R.drawable.ic_pin_test_ck));
            cVar = this.Q;
            lValueOf = Long.valueOf(jLongValue);
            sQLiteDatabase = this.P;
            str = "Y";
        } else {
            this.E.setBackground(getDrawable(R.drawable.ic_pin_test));
            cVar = this.Q;
            lValueOf = Long.valueOf(jLongValue);
            sQLiteDatabase = this.P;
            str = "N";
        }
        cVar.l(lValueOf, str, sQLiteDatabase);
    }

    public void deleteallTip(View view) {
        if (this.d0.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.f0.vibrate(20L);
            }
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.memoriaTip);
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
        this.E = checkBox;
        if (checkBox.isChecked()) {
            Toast.makeText(this, getResources().getString(R.string.calcoloprotetto), 1).show();
        } else {
            ((ViewGroup) findViewById(R.id.memoriaTip)).removeView((View) view.getParent().getParent());
            SQLiteDatabase readableDatabase = this.Q.getReadableDatabase();
            this.P = readableDatabase;
            this.Q.f(jLongValue, readableDatabase);
        }
        if (this.d0.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.f0.vibrate(20L);
            }
        }
    }

    public void filterMemoryTip(View view) {
        if (this.d0.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.f0.vibrate(20L);
            }
        }
        for (int r5 = 0; r5 < this.N.getChildCount(); r5++) {
            LinearLayout linearLayout = (LinearLayout) this.N.getChildAt(r5);
            if (((CheckBox) ((LinearLayout) linearLayout.getChildAt(0)).getChildAt(1)).isChecked()) {
                this.C0 = "no";
            } else {
                linearLayout.setVisibility(8);
                this.B0 = "SI";
            }
        }
        if (this.B0.equals("SI")) {
            this.F.setVisibility(0);
        }
        if (this.C0.equals("si")) {
            Toast.makeText(this, getResources().getString(R.string.nocalcoliprotetti), 1).show();
        }
        if (this.d0.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.f0.vibrate(20L);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (D0 + 2500 > System.currentTimeMillis()) {
            this.Q.close();
            super.onBackPressed();
        } else {
            Toast.makeText(this, getResources().getString(R.string.doubleclick), 0).show();
            D0 = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x09bf  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x09e9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0b32  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0b3f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0c05  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0463  */
    @Override // androidx.appcompat.app.e, androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.j, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onCreate(android.os.Bundle r42) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 3412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.TipCalculator.onCreate(android.os.Bundle):void");
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
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.TipCalculator.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    @Override // androidx.appcompat.app.e, androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        this.s0.y1(this);
        this.Q.close();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        SharedPreferences.Editor editorEdit = getSharedPreferences(getString(R.string.pref_file), 0).edit();
        SharedPreferences.Editor editorEdit2 = getSharedPreferences("apprater", 0).edit();
        switch (menuItem.getItemId()) {
            case R.id.CLASSIC_tip /* 2131296273 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "classic");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Classic", 0).show();
                finish();
                startActivity(new Intent(this, (Class<?>) TipCalculator.class));
                return true;
            case R.id.Converterfromtip /* 2131296287 */:
                startActivity(new Intent(this, (Class<?>) Convertitore.class));
                finish();
                try {
                    if (this.A0 != null && this.A0.f()) {
                        this.A0.o();
                    }
                } catch (NullPointerException e2) {
                    e2.printStackTrace();
                }
                return true;
            case R.id.ELEGANT_tip /* 2131296303 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "elegant");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Elegant", 0).show();
                finish();
                startActivity(new Intent(this, (Class<?>) TipCalculator.class));
                return true;
            case R.id.Exit_tip /* 2131296310 */:
                this.Q.close();
                finish();
                return true;
            case R.id.IVAfromtip /* 2131296323 */:
                startActivity(new Intent(this, (Class<?>) CalcoloIVA.class));
                finish();
                try {
                    if (this.A0 != null && this.A0.f()) {
                        this.A0.o();
                    }
                } catch (NullPointerException e3) {
                    e3.printStackTrace();
                }
                return true;
            case R.id.LIGHT_tip /* 2131296330 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "light");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Light", 0).show();
                finish();
                startActivity(new Intent(this, (Class<?>) TipCalculator.class));
                return true;
            case R.id.MINIMAL_tip /* 2131296339 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "minimal");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Minimal", 0).show();
                finish();
                startActivity(new Intent(this, (Class<?>) TipCalculator.class));
                return true;
            case R.id.NEON_tip /* 2131296345 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "neon");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Dark", 0).show();
                finish();
                startActivity(new Intent(this, (Class<?>) TipCalculator.class));
                return true;
            case R.id.STAR_tip /* 2131296362 */:
                com.gp7.easycalculator.a.b(this, editorEdit2, menuItem, this.c0);
                menuItem.setVisible(false);
                return true;
            case R.id.Scontofromtip /* 2131296368 */:
                startActivity(new Intent(this, (Class<?>) Sconto.class));
                finish();
                try {
                    if (this.A0 != null && this.A0.f()) {
                        this.A0.o();
                    }
                } catch (NullPointerException e4) {
                    e4.printStackTrace();
                }
                return true;
            case R.id.Setting_tip /* 2131296375 */:
                startActivity(new Intent(this, (Class<?>) Setting.class));
                return true;
            case R.id.Sharami_tip /* 2131296381 */:
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", getResources().getString(R.string.downloadApp) + "https://play.google.com/store/apps/details?id=" + com.gp7.easycalculator.b.f7045b);
                intent.setType("text/plain");
                startActivity(intent);
                return true;
            case R.id.gotoSpesafromtip /* 2131296615 */:
                startActivity(new Intent(this, (Class<?>) Spesa.class));
                finish();
                try {
                    if (this.A0 != null && this.A0.f()) {
                        this.A0.o();
                    }
                } catch (NullPointerException e5) {
                    e5.printStackTrace();
                }
                return true;
            case R.id.gotocalculatorfromtip /* 2131296625 */:
                startActivity(new Intent(this, (Class<?>) MainActivity.class));
                finish();
                try {
                    if (this.A0 != null && this.A0.f()) {
                        this.A0.o();
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
        this.s0.D1(this);
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    public void onResume() {
        super.onResume();
        this.s0.w1(this);
        Locale.setDefault(Locale.US);
        SharedPreferences sharedPreferences = getSharedPreferences(getString(R.string.pref_file), 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(getString(R.string.IsappinForeground), "si");
        editorEdit.apply();
        this.d0 = sharedPreferences.getString(getString(R.string.vibrazione_memorizzata), "no");
        this.e0 = sharedPreferences.getString(getString(R.string.ScreenONoption_memorizzata), "no");
        this.h0 = sharedPreferences.getString(getString(R.string.operator_color), "si");
        this.o0 = sharedPreferences.getString(getString(R.string.stile_option), "si");
        if (this.e0.equals("no")) {
            getWindow().clearFlags(128);
        }
        if (this.e0.equals("si")) {
            getWindow().addFlags(128);
        }
        this.g0 = sharedPreferences.getString(getString(R.string.notazione_scelta), "Default");
        Button button = (Button) findViewById(R.id.puntoTip);
        if (this.g0.equals("Italiana")) {
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
                    this.k0 = decimalFormat.format(new BigDecimal(string.replaceAll(",", "")));
                } else {
                    this.k0 = "9,999,999,999";
                    Toast.makeText(this, getResources().getString(R.string.overflow_result), 1).show();
                }
                this.b0.k(this.T, this.W, this.V, this.U, this.Y, this.X, this.g0);
                this.D.S(this.T, this.U, this.V, this.W, this.Y, this.X, this.k0, this.S, decimalFormat, this.b0, getBaseContext());
                this.T.setText(this.b0.m(this.k0, this.g0));
                this.U.setText(this.b0.m(this.U.getText().toString(), this.g0));
                this.Y.setText(this.b0.m(this.Y.getText().toString(), this.g0));
                this.W.setText(this.b0.m(this.W.getText().toString(), this.g0));
                if (this.V.getVisibility() == 0) {
                    this.V.setText(this.b0.m(this.V.getText().toString(), this.g0));
                }
                if (this.X.getVisibility() == 0) {
                    this.X.setText(this.b0.m(this.X.getText().toString(), this.g0));
                }
                this.D.t0(this.T, this.U, this.Y, this.X, getBaseContext());
            } catch (NumberFormatException | EmptyStackException unused) {
                Toast.makeText(this.O, "error", 0).show();
            }
            editorEdit.putString(getString(R.string.calcolovolanteEseguito), "no");
            editorEdit.apply();
        }
    }

    @Override // androidx.appcompat.app.e, androidx.fragment.app.d, android.app.Activity
    protected void onStop() {
        super.onStop();
    }

    public void percentoMODETip(View view) {
        int r5;
        if (this.d0.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.f0.vibrate(20L);
            }
        }
        switch (view.getId()) {
            case R.id.addIVATipradio /* 2131296450 */:
                r5 = 3;
                break;
            case R.id.manciaTip /* 2131296672 */:
                r5 = 4;
                break;
            case R.id.numTip /* 2131296731 */:
                r5 = 2;
                break;
            case R.id.orpriceTip /* 2131296810 */:
                r5 = 1;
                break;
            default:
                return;
        }
        this.S = r5;
    }

    public void shareitemsaved(View view) throws Resources.NotFoundException, IOException {
        if (this.d0.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.f0.vibrate(20L);
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

    public void undofilterMemoryTip(View view) {
        if (this.F.getVisibility() != 8) {
            if (this.d0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    this.f0.vibrate(20L);
                }
            }
            for (int r2 = 0; r2 < this.N.getChildCount(); r2++) {
                LinearLayout linearLayout = (LinearLayout) this.N.getChildAt(r2);
                if (!((CheckBox) ((LinearLayout) linearLayout.getChildAt(0)).getChildAt(1)).isChecked()) {
                    linearLayout.setVisibility(0);
                    this.B0 = "NO";
                    this.C0 = "si";
                    this.F.setVisibility(8);
                }
            }
        }
    }
}

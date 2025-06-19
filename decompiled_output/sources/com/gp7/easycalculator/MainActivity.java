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
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;
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
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class MainActivity extends androidx.appcompat.app.e {
    private static long P0;
    Button A0;
    TextView B0;
    TextView C0;
    TextView D0;
    String E;
    TextView E0;
    CheckBox F;
    String F0;
    ImageButton G;
    int G0;
    private FirebaseAnalytics H;
    int H0;
    int I0;
    String J0;
    ExpandableListView K0;
    private com.google.android.gms.ads.k0.c L;
    MenuItem L0;
    private com.google.android.gms.ads.l M;
    RelativeLayout M0;
    float N;
    String O;
    private DrawerLayout P;
    String Q;
    String R;
    String S;
    String T;
    String U;
    Bundle V;
    EditText W;
    TextView X;
    String Y;
    String Z;
    LinearLayout b0;
    SQLiteDatabase d0;
    com.gp7.easycalculator.c e0;
    Cursor f0;
    ViewFlipper g0;
    RadioButton i0;
    RadioButton j0;
    TextView k0;
    TextView l0;
    com.gp7.easycalculator.w m0;
    String n0;
    String o0;
    String p0;
    AdView q0;
    Vibrator r0;
    String s0;
    String t0;
    String u0;
    String v0;
    String w0;
    String x0;
    String y0;
    String z0;
    com.gp7.easycalculator.v C = new com.gp7.easycalculator.v();
    com.gp7.easycalculator.x D = new com.gp7.easycalculator.x();
    com.gp7.easycalculator.b0 I = new com.gp7.easycalculator.b0();
    com.gp7.easycalculator.u J = new com.gp7.easycalculator.u();
    int K = 1;
    boolean a0 = false;
    Context c0 = this;
    int h0 = 1;
    String N0 = "NO";
    String O0 = "si";

    class a implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;

        a(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                    this.d.setText("=");
                }
                int selectionEnd = this.e.getSelectionEnd();
                String string = this.e.getText().toString();
                if (MainActivity.this.t0.equals("Francese")) {
                    MainActivity mainActivity2 = MainActivity.this;
                    String[] strArrC = mainActivity2.J.C(this.e, this.f, "cos⁻¹(", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText = this.e;
                    MainActivity mainActivity3 = MainActivity.this;
                    editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrC[0];
                    str = strArrC[1];
                } else if (MainActivity.this.t0.equals("Italiana")) {
                    MainActivity mainActivity4 = MainActivity.this;
                    String[] strArrD = mainActivity4.J.D(this.e, this.f, "cos⁻¹(", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText2 = this.e;
                    MainActivity mainActivity5 = MainActivity.this;
                    editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrD[0];
                    str = strArrD[1];
                } else {
                    MainActivity mainActivity6 = MainActivity.this;
                    String[] strArrB = mainActivity6.J.B(this.e, this.f, "cos⁻¹(", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    this.e.setText(strArrB[0]);
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrB[0];
                    str = strArrB[1];
                }
                mainActivity.v0 = str;
                MainActivity mainActivity7 = MainActivity.this;
                String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
                TextView textView = this.f;
                MainActivity mainActivity8 = MainActivity.this;
                textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
                if (MainActivity.this.y0.equals("si")) {
                    MainActivity.this.d0(this.e);
                }
                MainActivity.this.J.d(this.e, string, selectionEnd);
                MainActivity mainActivity9 = MainActivity.this;
                mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
            }
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
        }
    }

    class a0 implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;

        a0(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
            if (MainActivity.this.g0.getDisplayedChild() != 0) {
                if (MainActivity.this.i0.isChecked()) {
                    MainActivity.this.i0.setChecked(false);
                    MainActivity.this.j0.setChecked(true);
                    MainActivity.this.h0 = 2;
                    return;
                }
                return;
            }
            if (this.d.getText().toString().equals("↶")) {
                this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                this.d.setText("=");
            }
            int selectionEnd = this.e.getSelectionEnd();
            String string = this.e.getText().toString();
            if (MainActivity.this.t0.equals("Francese")) {
                MainActivity mainActivity2 = MainActivity.this;
                String[] strArrC = mainActivity2.J.C(this.e, this.f, "div", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                EditText editText = this.e;
                MainActivity mainActivity3 = MainActivity.this;
                editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                mainActivity = MainActivity.this;
                mainActivity.u0 = strArrC[0];
                str = strArrC[1];
            } else if (MainActivity.this.t0.equals("Italiana")) {
                MainActivity mainActivity4 = MainActivity.this;
                String[] strArrD = mainActivity4.J.D(this.e, this.f, "div", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                EditText editText2 = this.e;
                MainActivity mainActivity5 = MainActivity.this;
                editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                mainActivity = MainActivity.this;
                mainActivity.u0 = strArrD[0];
                str = strArrD[1];
            } else {
                MainActivity mainActivity6 = MainActivity.this;
                String[] strArrB = mainActivity6.J.B(this.e, this.f, "div", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                this.e.setText(strArrB[0]);
                mainActivity = MainActivity.this;
                mainActivity.u0 = strArrB[0];
                str = strArrB[1];
            }
            mainActivity.v0 = str;
            MainActivity mainActivity7 = MainActivity.this;
            String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
            TextView textView = this.f;
            MainActivity mainActivity8 = MainActivity.this;
            textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
            if (MainActivity.this.y0.equals("si")) {
                MainActivity.this.d0(this.e);
            }
            MainActivity.this.J.d(this.e, string, selectionEnd);
            MainActivity mainActivity9 = MainActivity.this;
            mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
        }
    }

    class b implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;

        b(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                    this.d.setText("=");
                }
                int selectionEnd = this.e.getSelectionEnd();
                String string = this.e.getText().toString();
                if (MainActivity.this.t0.equals("Francese")) {
                    MainActivity mainActivity2 = MainActivity.this;
                    String[] strArrC = mainActivity2.J.C(this.e, this.f, "sin⁻¹(", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText = this.e;
                    MainActivity mainActivity3 = MainActivity.this;
                    editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrC[0];
                    str = strArrC[1];
                } else if (MainActivity.this.t0.equals("Italiana")) {
                    MainActivity mainActivity4 = MainActivity.this;
                    String[] strArrD = mainActivity4.J.D(this.e, this.f, "sin⁻¹(", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText2 = this.e;
                    MainActivity mainActivity5 = MainActivity.this;
                    editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrD[0];
                    str = strArrD[1];
                } else {
                    MainActivity mainActivity6 = MainActivity.this;
                    String[] strArrB = mainActivity6.J.B(this.e, this.f, "sin⁻¹(", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    this.e.setText(strArrB[0]);
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrB[0];
                    str = strArrB[1];
                }
                mainActivity.v0 = str;
                MainActivity mainActivity7 = MainActivity.this;
                String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
                TextView textView = this.f;
                MainActivity mainActivity8 = MainActivity.this;
                textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
                if (MainActivity.this.y0.equals("si")) {
                    MainActivity.this.d0(this.e);
                }
                MainActivity.this.J.d(this.e, string, selectionEnd);
                MainActivity mainActivity9 = MainActivity.this;
                mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
            }
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
        }
    }

    class b0 implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;
        final /* synthetic */ SharedPreferences i;
        final /* synthetic */ Button j;
        final /* synthetic */ SharedPreferences.Editor k;
        final /* synthetic */ DecimalFormat l;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int r4) {
                b0 b0Var = b0.this;
                b0Var.k.putString(MainActivity.this.getResources().getString(R.string.Tutorial_sconto_percetuale), "no");
                b0.this.k.apply();
                dialogInterface.cancel();
            }
        }

        b0(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2, SharedPreferences sharedPreferences, Button button2, SharedPreferences.Editor editor, DecimalFormat decimalFormat3) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
            this.i = sharedPreferences;
            this.j = button2;
            this.k = editor;
            this.l = decimalFormat3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
            if (MainActivity.this.g0.getDisplayedChild() != 0) {
                MainActivity mainActivity2 = MainActivity.this;
                mainActivity2.O = this.i.getString(mainActivity2.getString(R.string.Tutorial_sconto_percetuale), "si");
                if (this.j.getText().toString().equals("...%") && MainActivity.this.O.equals("si")) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage(MainActivity.this.getResources().getString(R.string.Suggerimento_calcolo_sconto_messaggio));
                    builder.setTitle(MainActivity.this.getResources().getString(R.string.Suggerimento_calcolo_iva));
                    builder.setCancelable(false);
                    builder.setPositiveButton(MainActivity.this.getResources().getString(R.string.testo_bottone_tutorial), new a());
                    builder.create().show();
                    return;
                }
                try {
                    if (this.j.getText().toString().equals("...%")) {
                        return;
                    }
                    if (MainActivity.this.t0.equals("Francese")) {
                        MainActivity.this.J.L(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, this.j.getText().toString().substring(0, this.j.getText().toString().length() - 2), MainActivity.this.h0, this.l, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else if (MainActivity.this.t0.equals("Italiana")) {
                        MainActivity.this.J.M(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, this.j.getText().toString().substring(0, this.j.getText().toString().length() - 2), MainActivity.this.h0, this.l, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else {
                        MainActivity.this.J.K(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, this.j.getText().toString().substring(0, this.j.getText().toString().length() - 2), MainActivity.this.h0, this.l, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    }
                    MainActivity.this.J.q0(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, MainActivity.this.getBaseContext());
                    return;
                } catch (NumberFormatException unused) {
                    Toast.makeText(MainActivity.this.c0, "error", 0).show();
                    return;
                }
            }
            if (this.d.getText().toString().equals("↶")) {
                this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                this.d.setText("=");
            }
            int selectionEnd = this.e.getSelectionEnd();
            String string = this.e.getText().toString();
            if (MainActivity.this.t0.equals("Francese")) {
                MainActivity mainActivity3 = MainActivity.this;
                String[] strArrC = mainActivity3.J.C(this.e, this.f, "per", Boolean.valueOf(mainActivity3.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                EditText editText = this.e;
                MainActivity mainActivity4 = MainActivity.this;
                editText.setText(mainActivity4.m0.m(strArrC[0], mainActivity4.t0));
                mainActivity = MainActivity.this;
                mainActivity.u0 = strArrC[0];
                str = strArrC[1];
            } else if (MainActivity.this.t0.equals("Italiana")) {
                MainActivity mainActivity5 = MainActivity.this;
                String[] strArrD = mainActivity5.J.D(this.e, this.f, "per", Boolean.valueOf(mainActivity5.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                EditText editText2 = this.e;
                MainActivity mainActivity6 = MainActivity.this;
                editText2.setText(mainActivity6.m0.m(strArrD[0], mainActivity6.t0));
                mainActivity = MainActivity.this;
                mainActivity.u0 = strArrD[0];
                str = strArrD[1];
            } else {
                MainActivity mainActivity7 = MainActivity.this;
                String[] strArrB = mainActivity7.J.B(this.e, this.f, "per", Boolean.valueOf(mainActivity7.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                this.e.setText(strArrB[0]);
                mainActivity = MainActivity.this;
                mainActivity.u0 = strArrB[0];
                str = strArrB[1];
            }
            mainActivity.v0 = str;
            MainActivity mainActivity8 = MainActivity.this;
            String strH0 = mainActivity8.J.h0(mainActivity8.u0, mainActivity8.x0, mainActivity8.I, mainActivity8.m0, this.h, mainActivity8.getBaseContext());
            TextView textView = this.f;
            MainActivity mainActivity9 = MainActivity.this;
            textView.setText(mainActivity9.m0.m(strH0, mainActivity9.t0));
            if (MainActivity.this.y0.equals("si")) {
                MainActivity.this.d0(this.e);
            }
            MainActivity.this.J.d(this.e, string, selectionEnd);
            MainActivity mainActivity10 = MainActivity.this;
            mainActivity10.J.m0(this.e, mainActivity10.N, mainActivity10.getBaseContext());
        }
    }

    class c implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;

        c(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                    this.d.setText("=");
                }
                int selectionEnd = this.e.getSelectionEnd();
                String string = this.e.getText().toString();
                if (MainActivity.this.t0.equals("Francese")) {
                    MainActivity mainActivity2 = MainActivity.this;
                    String[] strArrC = mainActivity2.J.C(this.e, this.f, "tan(", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText = this.e;
                    MainActivity mainActivity3 = MainActivity.this;
                    editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrC[0];
                    str = strArrC[1];
                } else if (MainActivity.this.t0.equals("Italiana")) {
                    MainActivity mainActivity4 = MainActivity.this;
                    String[] strArrD = mainActivity4.J.D(this.e, this.f, "tan(", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText2 = this.e;
                    MainActivity mainActivity5 = MainActivity.this;
                    editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrD[0];
                    str = strArrD[1];
                } else {
                    MainActivity mainActivity6 = MainActivity.this;
                    String[] strArrB = mainActivity6.J.B(this.e, this.f, "tan(", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    this.e.setText(strArrB[0]);
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrB[0];
                    str = strArrB[1];
                }
                mainActivity.v0 = str;
                MainActivity mainActivity7 = MainActivity.this;
                String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
                TextView textView = this.f;
                MainActivity mainActivity8 = MainActivity.this;
                textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
                if (MainActivity.this.y0.equals("si")) {
                    MainActivity.this.d0(this.e);
                }
                MainActivity.this.J.d(this.e, string, selectionEnd);
                MainActivity mainActivity9 = MainActivity.this;
                mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
            }
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
        }
    }

    class c0 implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;

        c0(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                    this.d.setText("=");
                }
                int selectionEnd = this.e.getSelectionEnd();
                String string = this.e.getText().toString();
                if (MainActivity.this.t0.equals("Francese")) {
                    MainActivity mainActivity2 = MainActivity.this;
                    String[] strArrC = mainActivity2.J.C(this.e, this.f, "^", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText = this.e;
                    MainActivity mainActivity3 = MainActivity.this;
                    editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrC[0];
                    str = strArrC[1];
                } else if (MainActivity.this.t0.equals("Italiana")) {
                    MainActivity mainActivity4 = MainActivity.this;
                    String[] strArrD = mainActivity4.J.D(this.e, this.f, "^", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText2 = this.e;
                    MainActivity mainActivity5 = MainActivity.this;
                    editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrD[0];
                    str = strArrD[1];
                } else {
                    MainActivity mainActivity6 = MainActivity.this;
                    String[] strArrB = mainActivity6.J.B(this.e, this.f, "^", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    this.e.setText(strArrB[0]);
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrB[0];
                    str = strArrB[1];
                }
                mainActivity.v0 = str;
                MainActivity mainActivity7 = MainActivity.this;
                String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
                TextView textView = this.f;
                MainActivity mainActivity8 = MainActivity.this;
                textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
                if (MainActivity.this.y0.equals("si")) {
                    MainActivity.this.d0(this.e);
                }
                MainActivity.this.J.d(this.e, string, selectionEnd);
                MainActivity mainActivity9 = MainActivity.this;
                mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
            }
        }
    }

    class d implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;

        d(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                    this.d.setText("=");
                }
                int selectionEnd = this.e.getSelectionEnd();
                String string = this.e.getText().toString();
                if (MainActivity.this.t0.equals("Francese")) {
                    MainActivity mainActivity2 = MainActivity.this;
                    String[] strArrC = mainActivity2.J.C(this.e, this.f, "cos(", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText = this.e;
                    MainActivity mainActivity3 = MainActivity.this;
                    editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrC[0];
                    str = strArrC[1];
                } else if (MainActivity.this.t0.equals("Italiana")) {
                    MainActivity mainActivity4 = MainActivity.this;
                    String[] strArrD = mainActivity4.J.D(this.e, this.f, "cos(", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText2 = this.e;
                    MainActivity mainActivity5 = MainActivity.this;
                    editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrD[0];
                    str = strArrD[1];
                } else {
                    MainActivity mainActivity6 = MainActivity.this;
                    String[] strArrB = mainActivity6.J.B(this.e, this.f, "cos(", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    this.e.setText(strArrB[0]);
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrB[0];
                    str = strArrB[1];
                }
                mainActivity.v0 = str;
                MainActivity mainActivity7 = MainActivity.this;
                String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
                TextView textView = this.f;
                MainActivity mainActivity8 = MainActivity.this;
                textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
                if (MainActivity.this.y0.equals("si")) {
                    MainActivity.this.d0(this.e);
                }
                MainActivity.this.J.d(this.e, string, selectionEnd);
                MainActivity mainActivity9 = MainActivity.this;
                mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
            }
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
        }
    }

    class d0 implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;

        d0(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
            if (MainActivity.this.g0.getDisplayedChild() != 0) {
                if (MainActivity.this.j0.isChecked()) {
                    MainActivity.this.j0.setChecked(false);
                    MainActivity.this.i0.setChecked(true);
                    MainActivity.this.h0 = 1;
                    return;
                }
                return;
            }
            if (this.d.getText().toString().equals("↶")) {
                this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                this.d.setText("=");
            }
            int selectionEnd = this.e.getSelectionEnd();
            String string = this.e.getText().toString();
            if (MainActivity.this.t0.equals("Francese")) {
                MainActivity mainActivity2 = MainActivity.this;
                String[] strArrC = mainActivity2.J.C(this.e, this.f, "(", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                EditText editText = this.e;
                MainActivity mainActivity3 = MainActivity.this;
                editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                mainActivity = MainActivity.this;
                mainActivity.u0 = strArrC[0];
                str = strArrC[1];
            } else if (MainActivity.this.t0.equals("Italiana")) {
                MainActivity mainActivity4 = MainActivity.this;
                String[] strArrD = mainActivity4.J.D(this.e, this.f, "(", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                EditText editText2 = this.e;
                MainActivity mainActivity5 = MainActivity.this;
                editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                mainActivity = MainActivity.this;
                mainActivity.u0 = strArrD[0];
                str = strArrD[1];
            } else {
                MainActivity mainActivity6 = MainActivity.this;
                String[] strArrB = mainActivity6.J.B(this.e, this.f, "(", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                this.e.setText(strArrB[0]);
                mainActivity = MainActivity.this;
                mainActivity.u0 = strArrB[0];
                str = strArrB[1];
            }
            mainActivity.v0 = str;
            MainActivity mainActivity7 = MainActivity.this;
            String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
            TextView textView = this.f;
            MainActivity mainActivity8 = MainActivity.this;
            textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
            if (MainActivity.this.y0.equals("si")) {
                MainActivity.this.d0(this.e);
            }
            MainActivity.this.J.d(this.e, string, selectionEnd);
            MainActivity mainActivity9 = MainActivity.this;
            mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
        }
    }

    class e implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;

        e(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                    this.d.setText("=");
                }
                int selectionEnd = this.e.getSelectionEnd();
                String string = this.e.getText().toString();
                if (MainActivity.this.t0.equals("Francese")) {
                    MainActivity mainActivity2 = MainActivity.this;
                    String[] strArrC = mainActivity2.J.C(this.e, this.f, "sin(", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText = this.e;
                    MainActivity mainActivity3 = MainActivity.this;
                    editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrC[0];
                    str = strArrC[1];
                } else if (MainActivity.this.t0.equals("Italiana")) {
                    MainActivity mainActivity4 = MainActivity.this;
                    String[] strArrD = mainActivity4.J.D(this.e, this.f, "sin(", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText2 = this.e;
                    MainActivity mainActivity5 = MainActivity.this;
                    editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrD[0];
                    str = strArrD[1];
                } else {
                    MainActivity mainActivity6 = MainActivity.this;
                    String[] strArrB = mainActivity6.J.B(this.e, this.f, "sin(", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    this.e.setText(strArrB[0]);
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrB[0];
                    str = strArrB[1];
                }
                mainActivity.v0 = str;
                MainActivity mainActivity7 = MainActivity.this;
                String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
                TextView textView = this.f;
                MainActivity mainActivity8 = MainActivity.this;
                textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
                if (MainActivity.this.y0.equals("si")) {
                    MainActivity.this.d0(this.e);
                }
                MainActivity.this.J.d(this.e, string, selectionEnd);
                MainActivity mainActivity9 = MainActivity.this;
                mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
            }
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
        }
    }

    class e0 implements View.OnLongClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;

        e0(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                    this.d.setText("=");
                }
                int selectionEnd = this.e.getSelectionEnd();
                String string = this.e.getText().toString();
                if (MainActivity.this.t0.equals("Francese")) {
                    MainActivity mainActivity2 = MainActivity.this;
                    String[] strArrC = mainActivity2.J.C(this.e, this.f, ")", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText = this.e;
                    MainActivity mainActivity3 = MainActivity.this;
                    editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrC[0];
                    str = strArrC[1];
                } else if (MainActivity.this.t0.equals("Italiana")) {
                    MainActivity mainActivity4 = MainActivity.this;
                    String[] strArrD = mainActivity4.J.D(this.e, this.f, ")", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText2 = this.e;
                    MainActivity mainActivity5 = MainActivity.this;
                    editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrD[0];
                    str = strArrD[1];
                } else {
                    MainActivity mainActivity6 = MainActivity.this;
                    String[] strArrB = mainActivity6.J.B(this.e, this.f, ")", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    this.e.setText(strArrB[0]);
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrB[0];
                    str = strArrB[1];
                }
                mainActivity.v0 = str;
                MainActivity mainActivity7 = MainActivity.this;
                String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
                TextView textView = this.f;
                MainActivity mainActivity8 = MainActivity.this;
                textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
                if (MainActivity.this.y0.equals("si")) {
                    MainActivity.this.d0(this.e);
                }
                MainActivity.this.J.d(this.e, string, selectionEnd);
                MainActivity mainActivity9 = MainActivity.this;
                mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
            }
            return true;
        }
    }

    class f implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;

        f(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                    this.d.setText("=");
                }
                int selectionEnd = this.e.getSelectionEnd();
                String string = this.e.getText().toString();
                if (MainActivity.this.t0.equals("Francese")) {
                    MainActivity mainActivity2 = MainActivity.this;
                    String[] strArrC = mainActivity2.J.C(this.e, this.f, "ln(", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText = this.e;
                    MainActivity mainActivity3 = MainActivity.this;
                    editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrC[0];
                    str = strArrC[1];
                } else if (MainActivity.this.t0.equals("Italiana")) {
                    MainActivity mainActivity4 = MainActivity.this;
                    String[] strArrD = mainActivity4.J.D(this.e, this.f, "ln(", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText2 = this.e;
                    MainActivity mainActivity5 = MainActivity.this;
                    editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrD[0];
                    str = strArrD[1];
                } else {
                    MainActivity mainActivity6 = MainActivity.this;
                    String[] strArrB = mainActivity6.J.B(this.e, this.f, "ln(", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    this.e.setText(strArrB[0]);
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrB[0];
                    str = strArrB[1];
                }
                mainActivity.v0 = str;
                MainActivity mainActivity7 = MainActivity.this;
                String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
                TextView textView = this.f;
                MainActivity mainActivity8 = MainActivity.this;
                textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
                if (MainActivity.this.y0.equals("si")) {
                    MainActivity.this.d0(this.e);
                }
                MainActivity.this.J.d(this.e, string, selectionEnd);
                MainActivity mainActivity9 = MainActivity.this;
                mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
            }
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
        }
    }

    class f0 implements View.OnLongClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ SharedPreferences.Editor e;

        class a implements SeekBar.OnSeekBarChangeListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TextView f7015a;

            a(TextView textView) {
                this.f7015a = textView;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int r2, boolean z) {
                this.f7015a.setText(String.valueOf(r2) + " %");
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
                if (MainActivity.this.o0.equals("si")) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                    } else {
                        MainActivity.this.r0.vibrate(20L);
                    }
                }
                f0 f0Var = f0.this;
                f0Var.e.putString(MainActivity.this.getResources().getString(R.string.sconto_percetualeUNO), this.d.getText().toString());
                f0.this.e.commit();
                f0.this.d.setText(this.d.getText().toString());
                dialogInterface.cancel();
            }
        }

        class c implements DialogInterface.OnClickListener {
            c() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int r5) {
                if (MainActivity.this.o0.equals("si")) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                    } else {
                        MainActivity.this.r0.vibrate(20L);
                    }
                }
                dialogInterface.cancel();
                dialogInterface.dismiss();
            }
        }

        f0(Button button, SharedPreferences.Editor editor) {
            this.d = button;
            this.e = editor;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
            if (MainActivity.this.g0.getDisplayedChild() == 1) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage(MainActivity.this.getResources().getString(R.string.calcolo_sconto_messaggio));
                View viewInflate = ((LayoutInflater) MainActivity.this.getSystemService("layout_inflater")).inflate(R.layout.seekbar, (ViewGroup) null);
                TextView textView = (TextView) viewInflate.findViewById(R.id.textSeekBar);
                textView.setText(this.d.getText().toString());
                SeekBar seekBar = (SeekBar) viewInflate.findViewById(R.id.ivaSeekBar);
                if (!this.d.getText().toString().equals("...%")) {
                    seekBar.setProgress(Integer.parseInt(this.d.getText().toString().substring(0, this.d.getText().toString().length() - 2)));
                }
                seekBar.setOnSeekBarChangeListener(new a(textView));
                builder.setView(viewInflate);
                builder.setCancelable(false);
                builder.setPositiveButton(MainActivity.this.getResources().getString(R.string.calcolo_iva_messaggio_fatto), new b(textView));
                builder.setNegativeButton(MainActivity.this.getResources().getString(R.string.calcolo_iva_messaggio_indietro), new c());
                builder.create().show();
            }
            return true;
        }
    }

    class g implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;

        g(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                    this.d.setText("=");
                }
                int selectionEnd = this.e.getSelectionEnd();
                String string = this.e.getText().toString();
                if (MainActivity.this.t0.equals("Francese")) {
                    MainActivity mainActivity2 = MainActivity.this;
                    String[] strArrC = mainActivity2.J.C(this.e, this.f, "log(", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText = this.e;
                    MainActivity mainActivity3 = MainActivity.this;
                    editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrC[0];
                    str = strArrC[1];
                } else if (MainActivity.this.t0.equals("Italiana")) {
                    MainActivity mainActivity4 = MainActivity.this;
                    String[] strArrD = mainActivity4.J.D(this.e, this.f, "log(", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText2 = this.e;
                    MainActivity mainActivity5 = MainActivity.this;
                    editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrD[0];
                    str = strArrD[1];
                } else {
                    MainActivity mainActivity6 = MainActivity.this;
                    String[] strArrB = mainActivity6.J.B(this.e, this.f, "log(", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    this.e.setText(strArrB[0]);
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrB[0];
                    str = strArrB[1];
                }
                mainActivity.v0 = str;
                MainActivity mainActivity7 = MainActivity.this;
                String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
                TextView textView = this.f;
                MainActivity mainActivity8 = MainActivity.this;
                textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
                if (MainActivity.this.y0.equals("si")) {
                    MainActivity.this.d0(this.e);
                }
                MainActivity.this.J.d(this.e, string, selectionEnd);
                MainActivity mainActivity9 = MainActivity.this;
                mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
            }
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
        }
    }

    class g0 implements DialogInterface.OnClickListener {
        g0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r4) {
            if (!MainActivity.this.L.W()) {
                Toast.makeText(MainActivity.this.getBaseContext(), MainActivity.this.getResources().getString(R.string.video_non_disponibile), 0).show();
            } else {
                MainActivity.this.L.y();
                MainActivity.this.L0.setVisible(false);
            }
        }
    }

    class h implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;

        h(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                    this.d.setText("=");
                }
                int selectionEnd = this.e.getSelectionEnd();
                String string = this.e.getText().toString();
                if (MainActivity.this.t0.equals("Francese")) {
                    MainActivity mainActivity2 = MainActivity.this;
                    String[] strArrC = mainActivity2.J.C(this.e, this.f, "√(", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText = this.e;
                    MainActivity mainActivity3 = MainActivity.this;
                    editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrC[0];
                    str = strArrC[1];
                } else if (MainActivity.this.t0.equals("Italiana")) {
                    MainActivity mainActivity4 = MainActivity.this;
                    String[] strArrD = mainActivity4.J.D(this.e, this.f, "√(", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText2 = this.e;
                    MainActivity mainActivity5 = MainActivity.this;
                    editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrD[0];
                    str = strArrD[1];
                } else {
                    MainActivity mainActivity6 = MainActivity.this;
                    String[] strArrB = mainActivity6.J.B(this.e, this.f, "√(", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    this.e.setText(strArrB[0]);
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrB[0];
                    str = strArrB[1];
                }
                mainActivity.v0 = str;
                MainActivity mainActivity7 = MainActivity.this;
                String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
                TextView textView = this.f;
                MainActivity mainActivity8 = MainActivity.this;
                textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
                if (MainActivity.this.y0.equals("si")) {
                    MainActivity.this.d0(this.e);
                }
                MainActivity.this.J.d(this.e, string, selectionEnd);
                MainActivity mainActivity9 = MainActivity.this;
                mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
            }
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
        }
    }

    class h0 implements View.OnLongClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ SharedPreferences.Editor e;

        class a implements SeekBar.OnSeekBarChangeListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TextView f7017a;

            a(TextView textView) {
                this.f7017a = textView;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int r2, boolean z) {
                this.f7017a.setText(String.valueOf(r2) + " %");
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
                if (MainActivity.this.o0.equals("si")) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                    } else {
                        MainActivity.this.r0.vibrate(20L);
                    }
                }
                h0 h0Var = h0.this;
                h0Var.e.putString(MainActivity.this.getResources().getString(R.string.sconto_percetualeTRE), this.d.getText().toString());
                h0.this.e.commit();
                h0.this.d.setText(this.d.getText().toString());
                dialogInterface.cancel();
            }
        }

        class c implements DialogInterface.OnClickListener {
            c() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int r5) {
                if (MainActivity.this.o0.equals("si")) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                    } else {
                        MainActivity.this.r0.vibrate(20L);
                    }
                }
                dialogInterface.cancel();
                dialogInterface.dismiss();
            }
        }

        h0(Button button, SharedPreferences.Editor editor) {
            this.d = button;
            this.e = editor;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
            if (MainActivity.this.g0.getDisplayedChild() == 1) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage(MainActivity.this.getResources().getString(R.string.calcolo_sconto_messaggio));
                View viewInflate = ((LayoutInflater) MainActivity.this.getSystemService("layout_inflater")).inflate(R.layout.seekbar, (ViewGroup) null);
                TextView textView = (TextView) viewInflate.findViewById(R.id.textSeekBar);
                textView.setText(this.d.getText().toString());
                SeekBar seekBar = (SeekBar) viewInflate.findViewById(R.id.ivaSeekBar);
                if (!this.d.getText().toString().equals("...%")) {
                    seekBar.setProgress(Integer.parseInt(this.d.getText().toString().substring(0, this.d.getText().toString().length() - 2)));
                }
                seekBar.setOnSeekBarChangeListener(new a(textView));
                builder.setView(viewInflate);
                builder.setCancelable(false);
                builder.setPositiveButton(MainActivity.this.getResources().getString(R.string.calcolo_iva_messaggio_fatto), new b(textView));
                builder.setNegativeButton(MainActivity.this.getResources().getString(R.string.calcolo_iva_messaggio_indietro), new c());
                builder.create().show();
            }
            return true;
        }
    }

    class i implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;

        i(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                    this.d.setText("=");
                }
                int selectionEnd = this.e.getSelectionEnd();
                String string = this.e.getText().toString();
                if (MainActivity.this.t0.equals("Francese")) {
                    MainActivity mainActivity2 = MainActivity.this;
                    String[] strArrC = mainActivity2.J.C(this.e, this.f, "φ", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText = this.e;
                    MainActivity mainActivity3 = MainActivity.this;
                    editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrC[0];
                    str = strArrC[1];
                } else if (MainActivity.this.t0.equals("Italiana")) {
                    MainActivity mainActivity4 = MainActivity.this;
                    String[] strArrD = mainActivity4.J.D(this.e, this.f, "φ", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText2 = this.e;
                    MainActivity mainActivity5 = MainActivity.this;
                    editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrD[0];
                    str = strArrD[1];
                } else {
                    MainActivity mainActivity6 = MainActivity.this;
                    String[] strArrB = mainActivity6.J.B(this.e, this.f, "φ", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    this.e.setText(strArrB[0]);
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrB[0];
                    str = strArrB[1];
                }
                mainActivity.v0 = str;
                MainActivity mainActivity7 = MainActivity.this;
                String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
                TextView textView = this.f;
                MainActivity mainActivity8 = MainActivity.this;
                textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
                if (MainActivity.this.y0.equals("si")) {
                    MainActivity.this.d0(this.e);
                }
                MainActivity.this.J.d(this.e, string, selectionEnd);
                MainActivity mainActivity9 = MainActivity.this;
                mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
            }
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
        }
    }

    class i0 implements View.OnLongClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ SharedPreferences.Editor e;

        class a implements SeekBar.OnSeekBarChangeListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TextView f7019a;

            a(TextView textView) {
                this.f7019a = textView;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int r2, boolean z) {
                this.f7019a.setText(String.valueOf(r2) + " %");
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
                if (MainActivity.this.o0.equals("si")) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                    } else {
                        MainActivity.this.r0.vibrate(20L);
                    }
                }
                i0 i0Var = i0.this;
                i0Var.e.putString(MainActivity.this.getResources().getString(R.string.sconto_percetualeDUE), this.d.getText().toString());
                i0.this.e.commit();
                i0.this.d.setText(this.d.getText().toString());
                dialogInterface.cancel();
            }
        }

        class c implements DialogInterface.OnClickListener {
            c() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int r5) {
                if (MainActivity.this.o0.equals("si")) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                    } else {
                        MainActivity.this.r0.vibrate(20L);
                    }
                }
                dialogInterface.cancel();
                dialogInterface.dismiss();
            }
        }

        i0(Button button, SharedPreferences.Editor editor) {
            this.d = button;
            this.e = editor;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
            if (MainActivity.this.g0.getDisplayedChild() == 1) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage(MainActivity.this.getResources().getString(R.string.calcolo_sconto_messaggio));
                View viewInflate = ((LayoutInflater) MainActivity.this.getSystemService("layout_inflater")).inflate(R.layout.seekbar, (ViewGroup) null);
                TextView textView = (TextView) viewInflate.findViewById(R.id.textSeekBar);
                textView.setText(this.d.getText().toString());
                SeekBar seekBar = (SeekBar) viewInflate.findViewById(R.id.ivaSeekBar);
                if (!this.d.getText().toString().equals("...%")) {
                    seekBar.setProgress(Integer.parseInt(this.d.getText().toString().substring(0, this.d.getText().toString().length() - 2)));
                }
                seekBar.setOnSeekBarChangeListener(new a(textView));
                builder.setView(viewInflate);
                builder.setCancelable(false);
                builder.setPositiveButton(MainActivity.this.getResources().getString(R.string.calcolo_iva_messaggio_fatto), new b(textView));
                builder.setNegativeButton(MainActivity.this.getResources().getString(R.string.calcolo_iva_messaggio_indietro), new c());
                builder.create().show();
            }
            return true;
        }
    }

    class j implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;

        j(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                    this.d.setText("=");
                }
                int selectionEnd = this.e.getSelectionEnd();
                String string = this.e.getText().toString();
                if (MainActivity.this.t0.equals("Francese")) {
                    MainActivity mainActivity2 = MainActivity.this;
                    String[] strArrC = mainActivity2.J.C(this.e, this.f, "π", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText = this.e;
                    MainActivity mainActivity3 = MainActivity.this;
                    editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrC[0];
                    str = strArrC[1];
                } else if (MainActivity.this.t0.equals("Italiana")) {
                    MainActivity mainActivity4 = MainActivity.this;
                    String[] strArrD = mainActivity4.J.D(this.e, this.f, "π", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText2 = this.e;
                    MainActivity mainActivity5 = MainActivity.this;
                    editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrD[0];
                    str = strArrD[1];
                } else {
                    MainActivity mainActivity6 = MainActivity.this;
                    String[] strArrB = mainActivity6.J.B(this.e, this.f, "π", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    this.e.setText(strArrB[0]);
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrB[0];
                    str = strArrB[1];
                }
                mainActivity.v0 = str;
                MainActivity mainActivity7 = MainActivity.this;
                String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
                TextView textView = this.f;
                MainActivity mainActivity8 = MainActivity.this;
                textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
                if (MainActivity.this.y0.equals("si")) {
                    MainActivity.this.d0(this.e);
                }
                MainActivity.this.J.d(this.e, string, selectionEnd);
                MainActivity mainActivity9 = MainActivity.this;
                mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
            }
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
        }
    }

    class j0 implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;

        j0(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(R.color.neon_blu));
                    this.d.setText("=");
                }
                int selectionEnd = this.e.getSelectionEnd();
                String string = this.e.getText().toString();
                if (MainActivity.this.t0.equals("Francese")) {
                    MainActivity mainActivity2 = MainActivity.this;
                    String[] strArrC = mainActivity2.J.C(this.e, this.f, "%", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText = this.e;
                    MainActivity mainActivity3 = MainActivity.this;
                    editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrC[0];
                    str = strArrC[1];
                } else if (MainActivity.this.t0.equals("Italiana")) {
                    MainActivity mainActivity4 = MainActivity.this;
                    String[] strArrD = mainActivity4.J.D(this.e, this.f, "%", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText2 = this.e;
                    MainActivity mainActivity5 = MainActivity.this;
                    editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrD[0];
                    str = strArrD[1];
                } else {
                    MainActivity mainActivity6 = MainActivity.this;
                    String[] strArrB = mainActivity6.J.B(this.e, this.f, "%", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    this.e.setText(strArrB[0]);
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrB[0];
                    str = strArrB[1];
                }
                mainActivity.v0 = str;
                MainActivity mainActivity7 = MainActivity.this;
                String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
                TextView textView = this.f;
                MainActivity mainActivity8 = MainActivity.this;
                textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
                if (MainActivity.this.y0.equals("si")) {
                    MainActivity.this.d0(this.e);
                }
                MainActivity.this.J.d(this.e, string, selectionEnd);
                MainActivity mainActivity9 = MainActivity.this;
                mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
                if (MainActivity.this.o0.equals("si")) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                    } else {
                        MainActivity.this.r0.vibrate(20L);
                    }
                }
            }
        }
    }

    class k implements DialogInterface.OnClickListener {
        k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r2) {
        }
    }

    class k0 implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ Button e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;

        k0(EditText editText, Button button, TextView textView, DecimalFormat decimalFormat) {
            this.d = editText;
            this.e = button;
            this.f = textView;
            this.g = decimalFormat;
        }

        /* JADX WARN: Removed duplicated region for block: B:114:0x0482  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x05ad A[Catch: EmptyStackException -> 0x0ae0, NumberFormatException -> 0x0af1, TryCatch #2 {NumberFormatException -> 0x0af1, EmptyStackException -> 0x0ae0, blocks: (B:47:0x017e, B:50:0x018c, B:51:0x01a4, B:56:0x01f3, B:58:0x01fd, B:60:0x020f, B:62:0x0221, B:64:0x0233, B:65:0x024d, B:66:0x0252, B:68:0x025c, B:69:0x0277, B:71:0x0281, B:72:0x029b, B:73:0x02a0, B:75:0x02c2, B:77:0x02e8, B:78:0x02f7, B:79:0x02fc, B:80:0x0311, B:82:0x0317, B:84:0x033d, B:85:0x0351, B:86:0x0356, B:87:0x0370, B:89:0x0384, B:91:0x03ad, B:92:0x03b4, B:93:0x03e3, B:95:0x040c, B:96:0x0413, B:97:0x044c, B:124:0x049a, B:126:0x053f, B:132:0x0581, B:134:0x05ad, B:135:0x05b2, B:137:0x05bc, B:138:0x05cb, B:139:0x05d7, B:128:0x055b, B:130:0x0565, B:140:0x05dc, B:142:0x0683, B:148:0x06c5, B:150:0x06f1, B:151:0x06f6, B:153:0x0700, B:154:0x070f, B:144:0x069f, B:146:0x06a9, B:155:0x071d, B:157:0x07c4, B:163:0x0806, B:165:0x0832, B:166:0x0837, B:168:0x0841, B:169:0x0850, B:159:0x07e0, B:161:0x07ea, B:170:0x085e, B:172:0x0905, B:178:0x0947, B:180:0x0973, B:181:0x0978, B:183:0x0982, B:184:0x0991, B:174:0x0921, B:176:0x092b, B:185:0x099f, B:187:0x0a46, B:193:0x0a88, B:195:0x0ab4, B:196:0x0ab9, B:198:0x0ac3, B:199:0x0ad2, B:189:0x0a62, B:191:0x0a6c, B:99:0x0450, B:102:0x045a, B:105:0x0464, B:108:0x046e, B:111:0x0478, B:52:0x01a9, B:54:0x01b3, B:55:0x01e0), top: B:207:0x017e }] */
        /* JADX WARN: Removed duplicated region for block: B:137:0x05bc A[Catch: EmptyStackException -> 0x0ae0, NumberFormatException -> 0x0af1, TryCatch #2 {NumberFormatException -> 0x0af1, EmptyStackException -> 0x0ae0, blocks: (B:47:0x017e, B:50:0x018c, B:51:0x01a4, B:56:0x01f3, B:58:0x01fd, B:60:0x020f, B:62:0x0221, B:64:0x0233, B:65:0x024d, B:66:0x0252, B:68:0x025c, B:69:0x0277, B:71:0x0281, B:72:0x029b, B:73:0x02a0, B:75:0x02c2, B:77:0x02e8, B:78:0x02f7, B:79:0x02fc, B:80:0x0311, B:82:0x0317, B:84:0x033d, B:85:0x0351, B:86:0x0356, B:87:0x0370, B:89:0x0384, B:91:0x03ad, B:92:0x03b4, B:93:0x03e3, B:95:0x040c, B:96:0x0413, B:97:0x044c, B:124:0x049a, B:126:0x053f, B:132:0x0581, B:134:0x05ad, B:135:0x05b2, B:137:0x05bc, B:138:0x05cb, B:139:0x05d7, B:128:0x055b, B:130:0x0565, B:140:0x05dc, B:142:0x0683, B:148:0x06c5, B:150:0x06f1, B:151:0x06f6, B:153:0x0700, B:154:0x070f, B:144:0x069f, B:146:0x06a9, B:155:0x071d, B:157:0x07c4, B:163:0x0806, B:165:0x0832, B:166:0x0837, B:168:0x0841, B:169:0x0850, B:159:0x07e0, B:161:0x07ea, B:170:0x085e, B:172:0x0905, B:178:0x0947, B:180:0x0973, B:181:0x0978, B:183:0x0982, B:184:0x0991, B:174:0x0921, B:176:0x092b, B:185:0x099f, B:187:0x0a46, B:193:0x0a88, B:195:0x0ab4, B:196:0x0ab9, B:198:0x0ac3, B:199:0x0ad2, B:189:0x0a62, B:191:0x0a6c, B:99:0x0450, B:102:0x045a, B:105:0x0464, B:108:0x046e, B:111:0x0478, B:52:0x01a9, B:54:0x01b3, B:55:0x01e0), top: B:207:0x017e }] */
        /* JADX WARN: Removed duplicated region for block: B:150:0x06f1 A[Catch: EmptyStackException -> 0x0ae0, NumberFormatException -> 0x0af1, TryCatch #2 {NumberFormatException -> 0x0af1, EmptyStackException -> 0x0ae0, blocks: (B:47:0x017e, B:50:0x018c, B:51:0x01a4, B:56:0x01f3, B:58:0x01fd, B:60:0x020f, B:62:0x0221, B:64:0x0233, B:65:0x024d, B:66:0x0252, B:68:0x025c, B:69:0x0277, B:71:0x0281, B:72:0x029b, B:73:0x02a0, B:75:0x02c2, B:77:0x02e8, B:78:0x02f7, B:79:0x02fc, B:80:0x0311, B:82:0x0317, B:84:0x033d, B:85:0x0351, B:86:0x0356, B:87:0x0370, B:89:0x0384, B:91:0x03ad, B:92:0x03b4, B:93:0x03e3, B:95:0x040c, B:96:0x0413, B:97:0x044c, B:124:0x049a, B:126:0x053f, B:132:0x0581, B:134:0x05ad, B:135:0x05b2, B:137:0x05bc, B:138:0x05cb, B:139:0x05d7, B:128:0x055b, B:130:0x0565, B:140:0x05dc, B:142:0x0683, B:148:0x06c5, B:150:0x06f1, B:151:0x06f6, B:153:0x0700, B:154:0x070f, B:144:0x069f, B:146:0x06a9, B:155:0x071d, B:157:0x07c4, B:163:0x0806, B:165:0x0832, B:166:0x0837, B:168:0x0841, B:169:0x0850, B:159:0x07e0, B:161:0x07ea, B:170:0x085e, B:172:0x0905, B:178:0x0947, B:180:0x0973, B:181:0x0978, B:183:0x0982, B:184:0x0991, B:174:0x0921, B:176:0x092b, B:185:0x099f, B:187:0x0a46, B:193:0x0a88, B:195:0x0ab4, B:196:0x0ab9, B:198:0x0ac3, B:199:0x0ad2, B:189:0x0a62, B:191:0x0a6c, B:99:0x0450, B:102:0x045a, B:105:0x0464, B:108:0x046e, B:111:0x0478, B:52:0x01a9, B:54:0x01b3, B:55:0x01e0), top: B:207:0x017e }] */
        /* JADX WARN: Removed duplicated region for block: B:153:0x0700 A[Catch: EmptyStackException -> 0x0ae0, NumberFormatException -> 0x0af1, TryCatch #2 {NumberFormatException -> 0x0af1, EmptyStackException -> 0x0ae0, blocks: (B:47:0x017e, B:50:0x018c, B:51:0x01a4, B:56:0x01f3, B:58:0x01fd, B:60:0x020f, B:62:0x0221, B:64:0x0233, B:65:0x024d, B:66:0x0252, B:68:0x025c, B:69:0x0277, B:71:0x0281, B:72:0x029b, B:73:0x02a0, B:75:0x02c2, B:77:0x02e8, B:78:0x02f7, B:79:0x02fc, B:80:0x0311, B:82:0x0317, B:84:0x033d, B:85:0x0351, B:86:0x0356, B:87:0x0370, B:89:0x0384, B:91:0x03ad, B:92:0x03b4, B:93:0x03e3, B:95:0x040c, B:96:0x0413, B:97:0x044c, B:124:0x049a, B:126:0x053f, B:132:0x0581, B:134:0x05ad, B:135:0x05b2, B:137:0x05bc, B:138:0x05cb, B:139:0x05d7, B:128:0x055b, B:130:0x0565, B:140:0x05dc, B:142:0x0683, B:148:0x06c5, B:150:0x06f1, B:151:0x06f6, B:153:0x0700, B:154:0x070f, B:144:0x069f, B:146:0x06a9, B:155:0x071d, B:157:0x07c4, B:163:0x0806, B:165:0x0832, B:166:0x0837, B:168:0x0841, B:169:0x0850, B:159:0x07e0, B:161:0x07ea, B:170:0x085e, B:172:0x0905, B:178:0x0947, B:180:0x0973, B:181:0x0978, B:183:0x0982, B:184:0x0991, B:174:0x0921, B:176:0x092b, B:185:0x099f, B:187:0x0a46, B:193:0x0a88, B:195:0x0ab4, B:196:0x0ab9, B:198:0x0ac3, B:199:0x0ad2, B:189:0x0a62, B:191:0x0a6c, B:99:0x0450, B:102:0x045a, B:105:0x0464, B:108:0x046e, B:111:0x0478, B:52:0x01a9, B:54:0x01b3, B:55:0x01e0), top: B:207:0x017e }] */
        /* JADX WARN: Removed duplicated region for block: B:165:0x0832 A[Catch: EmptyStackException -> 0x0ae0, NumberFormatException -> 0x0af1, TryCatch #2 {NumberFormatException -> 0x0af1, EmptyStackException -> 0x0ae0, blocks: (B:47:0x017e, B:50:0x018c, B:51:0x01a4, B:56:0x01f3, B:58:0x01fd, B:60:0x020f, B:62:0x0221, B:64:0x0233, B:65:0x024d, B:66:0x0252, B:68:0x025c, B:69:0x0277, B:71:0x0281, B:72:0x029b, B:73:0x02a0, B:75:0x02c2, B:77:0x02e8, B:78:0x02f7, B:79:0x02fc, B:80:0x0311, B:82:0x0317, B:84:0x033d, B:85:0x0351, B:86:0x0356, B:87:0x0370, B:89:0x0384, B:91:0x03ad, B:92:0x03b4, B:93:0x03e3, B:95:0x040c, B:96:0x0413, B:97:0x044c, B:124:0x049a, B:126:0x053f, B:132:0x0581, B:134:0x05ad, B:135:0x05b2, B:137:0x05bc, B:138:0x05cb, B:139:0x05d7, B:128:0x055b, B:130:0x0565, B:140:0x05dc, B:142:0x0683, B:148:0x06c5, B:150:0x06f1, B:151:0x06f6, B:153:0x0700, B:154:0x070f, B:144:0x069f, B:146:0x06a9, B:155:0x071d, B:157:0x07c4, B:163:0x0806, B:165:0x0832, B:166:0x0837, B:168:0x0841, B:169:0x0850, B:159:0x07e0, B:161:0x07ea, B:170:0x085e, B:172:0x0905, B:178:0x0947, B:180:0x0973, B:181:0x0978, B:183:0x0982, B:184:0x0991, B:174:0x0921, B:176:0x092b, B:185:0x099f, B:187:0x0a46, B:193:0x0a88, B:195:0x0ab4, B:196:0x0ab9, B:198:0x0ac3, B:199:0x0ad2, B:189:0x0a62, B:191:0x0a6c, B:99:0x0450, B:102:0x045a, B:105:0x0464, B:108:0x046e, B:111:0x0478, B:52:0x01a9, B:54:0x01b3, B:55:0x01e0), top: B:207:0x017e }] */
        /* JADX WARN: Removed duplicated region for block: B:168:0x0841 A[Catch: EmptyStackException -> 0x0ae0, NumberFormatException -> 0x0af1, TryCatch #2 {NumberFormatException -> 0x0af1, EmptyStackException -> 0x0ae0, blocks: (B:47:0x017e, B:50:0x018c, B:51:0x01a4, B:56:0x01f3, B:58:0x01fd, B:60:0x020f, B:62:0x0221, B:64:0x0233, B:65:0x024d, B:66:0x0252, B:68:0x025c, B:69:0x0277, B:71:0x0281, B:72:0x029b, B:73:0x02a0, B:75:0x02c2, B:77:0x02e8, B:78:0x02f7, B:79:0x02fc, B:80:0x0311, B:82:0x0317, B:84:0x033d, B:85:0x0351, B:86:0x0356, B:87:0x0370, B:89:0x0384, B:91:0x03ad, B:92:0x03b4, B:93:0x03e3, B:95:0x040c, B:96:0x0413, B:97:0x044c, B:124:0x049a, B:126:0x053f, B:132:0x0581, B:134:0x05ad, B:135:0x05b2, B:137:0x05bc, B:138:0x05cb, B:139:0x05d7, B:128:0x055b, B:130:0x0565, B:140:0x05dc, B:142:0x0683, B:148:0x06c5, B:150:0x06f1, B:151:0x06f6, B:153:0x0700, B:154:0x070f, B:144:0x069f, B:146:0x06a9, B:155:0x071d, B:157:0x07c4, B:163:0x0806, B:165:0x0832, B:166:0x0837, B:168:0x0841, B:169:0x0850, B:159:0x07e0, B:161:0x07ea, B:170:0x085e, B:172:0x0905, B:178:0x0947, B:180:0x0973, B:181:0x0978, B:183:0x0982, B:184:0x0991, B:174:0x0921, B:176:0x092b, B:185:0x099f, B:187:0x0a46, B:193:0x0a88, B:195:0x0ab4, B:196:0x0ab9, B:198:0x0ac3, B:199:0x0ad2, B:189:0x0a62, B:191:0x0a6c, B:99:0x0450, B:102:0x045a, B:105:0x0464, B:108:0x046e, B:111:0x0478, B:52:0x01a9, B:54:0x01b3, B:55:0x01e0), top: B:207:0x017e }] */
        /* JADX WARN: Removed duplicated region for block: B:180:0x0973 A[Catch: EmptyStackException -> 0x0ae0, NumberFormatException -> 0x0af1, TryCatch #2 {NumberFormatException -> 0x0af1, EmptyStackException -> 0x0ae0, blocks: (B:47:0x017e, B:50:0x018c, B:51:0x01a4, B:56:0x01f3, B:58:0x01fd, B:60:0x020f, B:62:0x0221, B:64:0x0233, B:65:0x024d, B:66:0x0252, B:68:0x025c, B:69:0x0277, B:71:0x0281, B:72:0x029b, B:73:0x02a0, B:75:0x02c2, B:77:0x02e8, B:78:0x02f7, B:79:0x02fc, B:80:0x0311, B:82:0x0317, B:84:0x033d, B:85:0x0351, B:86:0x0356, B:87:0x0370, B:89:0x0384, B:91:0x03ad, B:92:0x03b4, B:93:0x03e3, B:95:0x040c, B:96:0x0413, B:97:0x044c, B:124:0x049a, B:126:0x053f, B:132:0x0581, B:134:0x05ad, B:135:0x05b2, B:137:0x05bc, B:138:0x05cb, B:139:0x05d7, B:128:0x055b, B:130:0x0565, B:140:0x05dc, B:142:0x0683, B:148:0x06c5, B:150:0x06f1, B:151:0x06f6, B:153:0x0700, B:154:0x070f, B:144:0x069f, B:146:0x06a9, B:155:0x071d, B:157:0x07c4, B:163:0x0806, B:165:0x0832, B:166:0x0837, B:168:0x0841, B:169:0x0850, B:159:0x07e0, B:161:0x07ea, B:170:0x085e, B:172:0x0905, B:178:0x0947, B:180:0x0973, B:181:0x0978, B:183:0x0982, B:184:0x0991, B:174:0x0921, B:176:0x092b, B:185:0x099f, B:187:0x0a46, B:193:0x0a88, B:195:0x0ab4, B:196:0x0ab9, B:198:0x0ac3, B:199:0x0ad2, B:189:0x0a62, B:191:0x0a6c, B:99:0x0450, B:102:0x045a, B:105:0x0464, B:108:0x046e, B:111:0x0478, B:52:0x01a9, B:54:0x01b3, B:55:0x01e0), top: B:207:0x017e }] */
        /* JADX WARN: Removed duplicated region for block: B:183:0x0982 A[Catch: EmptyStackException -> 0x0ae0, NumberFormatException -> 0x0af1, TryCatch #2 {NumberFormatException -> 0x0af1, EmptyStackException -> 0x0ae0, blocks: (B:47:0x017e, B:50:0x018c, B:51:0x01a4, B:56:0x01f3, B:58:0x01fd, B:60:0x020f, B:62:0x0221, B:64:0x0233, B:65:0x024d, B:66:0x0252, B:68:0x025c, B:69:0x0277, B:71:0x0281, B:72:0x029b, B:73:0x02a0, B:75:0x02c2, B:77:0x02e8, B:78:0x02f7, B:79:0x02fc, B:80:0x0311, B:82:0x0317, B:84:0x033d, B:85:0x0351, B:86:0x0356, B:87:0x0370, B:89:0x0384, B:91:0x03ad, B:92:0x03b4, B:93:0x03e3, B:95:0x040c, B:96:0x0413, B:97:0x044c, B:124:0x049a, B:126:0x053f, B:132:0x0581, B:134:0x05ad, B:135:0x05b2, B:137:0x05bc, B:138:0x05cb, B:139:0x05d7, B:128:0x055b, B:130:0x0565, B:140:0x05dc, B:142:0x0683, B:148:0x06c5, B:150:0x06f1, B:151:0x06f6, B:153:0x0700, B:154:0x070f, B:144:0x069f, B:146:0x06a9, B:155:0x071d, B:157:0x07c4, B:163:0x0806, B:165:0x0832, B:166:0x0837, B:168:0x0841, B:169:0x0850, B:159:0x07e0, B:161:0x07ea, B:170:0x085e, B:172:0x0905, B:178:0x0947, B:180:0x0973, B:181:0x0978, B:183:0x0982, B:184:0x0991, B:174:0x0921, B:176:0x092b, B:185:0x099f, B:187:0x0a46, B:193:0x0a88, B:195:0x0ab4, B:196:0x0ab9, B:198:0x0ac3, B:199:0x0ad2, B:189:0x0a62, B:191:0x0a6c, B:99:0x0450, B:102:0x045a, B:105:0x0464, B:108:0x046e, B:111:0x0478, B:52:0x01a9, B:54:0x01b3, B:55:0x01e0), top: B:207:0x017e }] */
        /* JADX WARN: Removed duplicated region for block: B:195:0x0ab4 A[Catch: EmptyStackException -> 0x0ae0, NumberFormatException -> 0x0af1, TryCatch #2 {NumberFormatException -> 0x0af1, EmptyStackException -> 0x0ae0, blocks: (B:47:0x017e, B:50:0x018c, B:51:0x01a4, B:56:0x01f3, B:58:0x01fd, B:60:0x020f, B:62:0x0221, B:64:0x0233, B:65:0x024d, B:66:0x0252, B:68:0x025c, B:69:0x0277, B:71:0x0281, B:72:0x029b, B:73:0x02a0, B:75:0x02c2, B:77:0x02e8, B:78:0x02f7, B:79:0x02fc, B:80:0x0311, B:82:0x0317, B:84:0x033d, B:85:0x0351, B:86:0x0356, B:87:0x0370, B:89:0x0384, B:91:0x03ad, B:92:0x03b4, B:93:0x03e3, B:95:0x040c, B:96:0x0413, B:97:0x044c, B:124:0x049a, B:126:0x053f, B:132:0x0581, B:134:0x05ad, B:135:0x05b2, B:137:0x05bc, B:138:0x05cb, B:139:0x05d7, B:128:0x055b, B:130:0x0565, B:140:0x05dc, B:142:0x0683, B:148:0x06c5, B:150:0x06f1, B:151:0x06f6, B:153:0x0700, B:154:0x070f, B:144:0x069f, B:146:0x06a9, B:155:0x071d, B:157:0x07c4, B:163:0x0806, B:165:0x0832, B:166:0x0837, B:168:0x0841, B:169:0x0850, B:159:0x07e0, B:161:0x07ea, B:170:0x085e, B:172:0x0905, B:178:0x0947, B:180:0x0973, B:181:0x0978, B:183:0x0982, B:184:0x0991, B:174:0x0921, B:176:0x092b, B:185:0x099f, B:187:0x0a46, B:193:0x0a88, B:195:0x0ab4, B:196:0x0ab9, B:198:0x0ac3, B:199:0x0ad2, B:189:0x0a62, B:191:0x0a6c, B:99:0x0450, B:102:0x045a, B:105:0x0464, B:108:0x046e, B:111:0x0478, B:52:0x01a9, B:54:0x01b3, B:55:0x01e0), top: B:207:0x017e }] */
        /* JADX WARN: Removed duplicated region for block: B:198:0x0ac3 A[Catch: EmptyStackException -> 0x0ae0, NumberFormatException -> 0x0af1, TryCatch #2 {NumberFormatException -> 0x0af1, EmptyStackException -> 0x0ae0, blocks: (B:47:0x017e, B:50:0x018c, B:51:0x01a4, B:56:0x01f3, B:58:0x01fd, B:60:0x020f, B:62:0x0221, B:64:0x0233, B:65:0x024d, B:66:0x0252, B:68:0x025c, B:69:0x0277, B:71:0x0281, B:72:0x029b, B:73:0x02a0, B:75:0x02c2, B:77:0x02e8, B:78:0x02f7, B:79:0x02fc, B:80:0x0311, B:82:0x0317, B:84:0x033d, B:85:0x0351, B:86:0x0356, B:87:0x0370, B:89:0x0384, B:91:0x03ad, B:92:0x03b4, B:93:0x03e3, B:95:0x040c, B:96:0x0413, B:97:0x044c, B:124:0x049a, B:126:0x053f, B:132:0x0581, B:134:0x05ad, B:135:0x05b2, B:137:0x05bc, B:138:0x05cb, B:139:0x05d7, B:128:0x055b, B:130:0x0565, B:140:0x05dc, B:142:0x0683, B:148:0x06c5, B:150:0x06f1, B:151:0x06f6, B:153:0x0700, B:154:0x070f, B:144:0x069f, B:146:0x06a9, B:155:0x071d, B:157:0x07c4, B:163:0x0806, B:165:0x0832, B:166:0x0837, B:168:0x0841, B:169:0x0850, B:159:0x07e0, B:161:0x07ea, B:170:0x085e, B:172:0x0905, B:178:0x0947, B:180:0x0973, B:181:0x0978, B:183:0x0982, B:184:0x0991, B:174:0x0921, B:176:0x092b, B:185:0x099f, B:187:0x0a46, B:193:0x0a88, B:195:0x0ab4, B:196:0x0ab9, B:198:0x0ac3, B:199:0x0ad2, B:189:0x0a62, B:191:0x0a6c, B:99:0x0450, B:102:0x045a, B:105:0x0464, B:108:0x046e, B:111:0x0478, B:52:0x01a9, B:54:0x01b3, B:55:0x01e0), top: B:207:0x017e }] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0252 A[Catch: EmptyStackException -> 0x0ae0, NumberFormatException -> 0x0af1, TryCatch #2 {NumberFormatException -> 0x0af1, EmptyStackException -> 0x0ae0, blocks: (B:47:0x017e, B:50:0x018c, B:51:0x01a4, B:56:0x01f3, B:58:0x01fd, B:60:0x020f, B:62:0x0221, B:64:0x0233, B:65:0x024d, B:66:0x0252, B:68:0x025c, B:69:0x0277, B:71:0x0281, B:72:0x029b, B:73:0x02a0, B:75:0x02c2, B:77:0x02e8, B:78:0x02f7, B:79:0x02fc, B:80:0x0311, B:82:0x0317, B:84:0x033d, B:85:0x0351, B:86:0x0356, B:87:0x0370, B:89:0x0384, B:91:0x03ad, B:92:0x03b4, B:93:0x03e3, B:95:0x040c, B:96:0x0413, B:97:0x044c, B:124:0x049a, B:126:0x053f, B:132:0x0581, B:134:0x05ad, B:135:0x05b2, B:137:0x05bc, B:138:0x05cb, B:139:0x05d7, B:128:0x055b, B:130:0x0565, B:140:0x05dc, B:142:0x0683, B:148:0x06c5, B:150:0x06f1, B:151:0x06f6, B:153:0x0700, B:154:0x070f, B:144:0x069f, B:146:0x06a9, B:155:0x071d, B:157:0x07c4, B:163:0x0806, B:165:0x0832, B:166:0x0837, B:168:0x0841, B:169:0x0850, B:159:0x07e0, B:161:0x07ea, B:170:0x085e, B:172:0x0905, B:178:0x0947, B:180:0x0973, B:181:0x0978, B:183:0x0982, B:184:0x0991, B:174:0x0921, B:176:0x092b, B:185:0x099f, B:187:0x0a46, B:193:0x0a88, B:195:0x0ab4, B:196:0x0ab9, B:198:0x0ac3, B:199:0x0ad2, B:189:0x0a62, B:191:0x0a6c, B:99:0x0450, B:102:0x045a, B:105:0x0464, B:108:0x046e, B:111:0x0478, B:52:0x01a9, B:54:0x01b3, B:55:0x01e0), top: B:207:0x017e }] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x025c A[Catch: EmptyStackException -> 0x0ae0, NumberFormatException -> 0x0af1, TryCatch #2 {NumberFormatException -> 0x0af1, EmptyStackException -> 0x0ae0, blocks: (B:47:0x017e, B:50:0x018c, B:51:0x01a4, B:56:0x01f3, B:58:0x01fd, B:60:0x020f, B:62:0x0221, B:64:0x0233, B:65:0x024d, B:66:0x0252, B:68:0x025c, B:69:0x0277, B:71:0x0281, B:72:0x029b, B:73:0x02a0, B:75:0x02c2, B:77:0x02e8, B:78:0x02f7, B:79:0x02fc, B:80:0x0311, B:82:0x0317, B:84:0x033d, B:85:0x0351, B:86:0x0356, B:87:0x0370, B:89:0x0384, B:91:0x03ad, B:92:0x03b4, B:93:0x03e3, B:95:0x040c, B:96:0x0413, B:97:0x044c, B:124:0x049a, B:126:0x053f, B:132:0x0581, B:134:0x05ad, B:135:0x05b2, B:137:0x05bc, B:138:0x05cb, B:139:0x05d7, B:128:0x055b, B:130:0x0565, B:140:0x05dc, B:142:0x0683, B:148:0x06c5, B:150:0x06f1, B:151:0x06f6, B:153:0x0700, B:154:0x070f, B:144:0x069f, B:146:0x06a9, B:155:0x071d, B:157:0x07c4, B:163:0x0806, B:165:0x0832, B:166:0x0837, B:168:0x0841, B:169:0x0850, B:159:0x07e0, B:161:0x07ea, B:170:0x085e, B:172:0x0905, B:178:0x0947, B:180:0x0973, B:181:0x0978, B:183:0x0982, B:184:0x0991, B:174:0x0921, B:176:0x092b, B:185:0x099f, B:187:0x0a46, B:193:0x0a88, B:195:0x0ab4, B:196:0x0ab9, B:198:0x0ac3, B:199:0x0ad2, B:189:0x0a62, B:191:0x0a6c, B:99:0x0450, B:102:0x045a, B:105:0x0464, B:108:0x046e, B:111:0x0478, B:52:0x01a9, B:54:0x01b3, B:55:0x01e0), top: B:207:0x017e }] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0277 A[Catch: EmptyStackException -> 0x0ae0, NumberFormatException -> 0x0af1, TryCatch #2 {NumberFormatException -> 0x0af1, EmptyStackException -> 0x0ae0, blocks: (B:47:0x017e, B:50:0x018c, B:51:0x01a4, B:56:0x01f3, B:58:0x01fd, B:60:0x020f, B:62:0x0221, B:64:0x0233, B:65:0x024d, B:66:0x0252, B:68:0x025c, B:69:0x0277, B:71:0x0281, B:72:0x029b, B:73:0x02a0, B:75:0x02c2, B:77:0x02e8, B:78:0x02f7, B:79:0x02fc, B:80:0x0311, B:82:0x0317, B:84:0x033d, B:85:0x0351, B:86:0x0356, B:87:0x0370, B:89:0x0384, B:91:0x03ad, B:92:0x03b4, B:93:0x03e3, B:95:0x040c, B:96:0x0413, B:97:0x044c, B:124:0x049a, B:126:0x053f, B:132:0x0581, B:134:0x05ad, B:135:0x05b2, B:137:0x05bc, B:138:0x05cb, B:139:0x05d7, B:128:0x055b, B:130:0x0565, B:140:0x05dc, B:142:0x0683, B:148:0x06c5, B:150:0x06f1, B:151:0x06f6, B:153:0x0700, B:154:0x070f, B:144:0x069f, B:146:0x06a9, B:155:0x071d, B:157:0x07c4, B:163:0x0806, B:165:0x0832, B:166:0x0837, B:168:0x0841, B:169:0x0850, B:159:0x07e0, B:161:0x07ea, B:170:0x085e, B:172:0x0905, B:178:0x0947, B:180:0x0973, B:181:0x0978, B:183:0x0982, B:184:0x0991, B:174:0x0921, B:176:0x092b, B:185:0x099f, B:187:0x0a46, B:193:0x0a88, B:195:0x0ab4, B:196:0x0ab9, B:198:0x0ac3, B:199:0x0ad2, B:189:0x0a62, B:191:0x0a6c, B:99:0x0450, B:102:0x045a, B:105:0x0464, B:108:0x046e, B:111:0x0478, B:52:0x01a9, B:54:0x01b3, B:55:0x01e0), top: B:207:0x017e }] */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onClick(android.view.View r23) throws android.content.res.Resources.NotFoundException {
            /*
                Method dump skipped, instructions count: 2866
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.MainActivity.k0.onClick(android.view.View):void");
        }
    }

    class l implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;

        l(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                    this.d.setText("=");
                }
                int selectionEnd = this.e.getSelectionEnd();
                String string = this.e.getText().toString();
                if (MainActivity.this.t0.equals("Francese")) {
                    MainActivity mainActivity2 = MainActivity.this;
                    String[] strArrC = mainActivity2.J.C(this.e, this.f, "e", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText = this.e;
                    MainActivity mainActivity3 = MainActivity.this;
                    editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrC[0];
                    str = strArrC[1];
                } else if (MainActivity.this.t0.equals("Italiana")) {
                    MainActivity mainActivity4 = MainActivity.this;
                    String[] strArrD = mainActivity4.J.D(this.e, this.f, "e", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText2 = this.e;
                    MainActivity mainActivity5 = MainActivity.this;
                    editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrD[0];
                    str = strArrD[1];
                } else {
                    MainActivity mainActivity6 = MainActivity.this;
                    String[] strArrB = mainActivity6.J.B(this.e, this.f, "e", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    this.e.setText(strArrB[0]);
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrB[0];
                    str = strArrB[1];
                }
                mainActivity.v0 = str;
                MainActivity mainActivity7 = MainActivity.this;
                String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
                TextView textView = this.f;
                MainActivity mainActivity8 = MainActivity.this;
                textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
                if (MainActivity.this.y0.equals("si")) {
                    MainActivity.this.d0(this.e);
                }
                MainActivity.this.J.d(this.e, string, selectionEnd);
                MainActivity mainActivity9 = MainActivity.this;
                mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
            }
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
        }
    }

    class l0 implements View.OnLongClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;

        l0(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                    this.d.setText("=");
                }
                try {
                    if (MainActivity.this.t0.equals("Francese")) {
                        String[] strArrC = MainActivity.this.J.C(this.e, this.f, "halfcanc", Boolean.valueOf(MainActivity.this.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                        this.e.setText(MainActivity.this.m0.m(strArrC[0], MainActivity.this.t0));
                        MainActivity.this.u0 = strArrC[0];
                        mainActivity = MainActivity.this;
                        str = strArrC[1];
                    } else if (MainActivity.this.t0.equals("Italiana")) {
                        String[] strArrD = MainActivity.this.J.D(this.e, this.f, "halfcanc", Boolean.valueOf(MainActivity.this.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                        this.e.setText(MainActivity.this.m0.m(strArrD[0], MainActivity.this.t0));
                        MainActivity.this.u0 = strArrD[0];
                        mainActivity = MainActivity.this;
                        str = strArrD[1];
                    } else {
                        String[] strArrB = MainActivity.this.J.B(this.e, this.f, "halfcanc", Boolean.valueOf(MainActivity.this.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                        this.e.setText(strArrB[0]);
                        MainActivity.this.u0 = strArrB[0];
                        mainActivity = MainActivity.this;
                        str = strArrB[1];
                    }
                    mainActivity.v0 = str;
                    this.f.setText(MainActivity.this.m0.m(MainActivity.this.J.h0(MainActivity.this.u0, MainActivity.this.x0, MainActivity.this.I, MainActivity.this.m0, this.h, MainActivity.this.getBaseContext()), MainActivity.this.t0));
                    if (MainActivity.this.y0.equals("si")) {
                        MainActivity.this.d0(this.e);
                    }
                    MainActivity.this.J.m0(this.e, MainActivity.this.N, MainActivity.this.getBaseContext());
                } catch (NullPointerException unused) {
                }
            } else {
                MainActivity mainActivity2 = MainActivity.this;
                (mainActivity2.h0 == 1 ? mainActivity2.i0 : mainActivity2.j0).setText("");
                MainActivity.this.k0.setText("");
                MainActivity.this.l0.setText("");
            }
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(40L, -1));
                } else {
                    MainActivity.this.r0.vibrate(40L);
                }
            }
            return true;
        }
    }

    class m implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;
        final /* synthetic */ DecimalFormat i;

        m(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2, DecimalFormat decimalFormat3) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
            this.i = decimalFormat3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                    this.d.setText("=");
                }
                int selectionEnd = this.e.getSelectionEnd();
                String string = this.e.getText().toString();
                if (MainActivity.this.t0.equals("Francese")) {
                    MainActivity mainActivity2 = MainActivity.this;
                    String[] strArrC = mainActivity2.J.C(this.e, this.f, "0", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText = this.e;
                    MainActivity mainActivity3 = MainActivity.this;
                    editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrC[0];
                    str = strArrC[1];
                } else if (MainActivity.this.t0.equals("Italiana")) {
                    MainActivity mainActivity4 = MainActivity.this;
                    String[] strArrD = mainActivity4.J.D(this.e, this.f, "0", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText2 = this.e;
                    MainActivity mainActivity5 = MainActivity.this;
                    editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrD[0];
                    str = strArrD[1];
                } else {
                    MainActivity mainActivity6 = MainActivity.this;
                    String[] strArrB = mainActivity6.J.B(this.e, this.f, "0", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    this.e.setText(strArrB[0]);
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrB[0];
                    str = strArrB[1];
                }
                mainActivity.v0 = str;
                MainActivity mainActivity7 = MainActivity.this;
                String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
                TextView textView = this.f;
                MainActivity mainActivity8 = MainActivity.this;
                textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
                if (MainActivity.this.y0.equals("si")) {
                    MainActivity.this.d0(this.e);
                }
                MainActivity.this.J.d(this.e, string, selectionEnd);
                MainActivity mainActivity9 = MainActivity.this;
                mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
            } else {
                try {
                    if (MainActivity.this.t0.equals("Francese")) {
                        MainActivity.this.J.F(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "0", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else if (MainActivity.this.t0.equals("Italiana")) {
                        MainActivity.this.J.J(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "0", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else {
                        MainActivity.this.J.E(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "0", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    }
                    MainActivity.this.J.q0(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, MainActivity.this.getBaseContext());
                } catch (NumberFormatException unused) {
                    Toast.makeText(MainActivity.this.c0, "error", 0).show();
                }
            }
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
        }
    }

    class m0 implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;

        m0(Button button, EditText editText, TextView textView) {
            this.d = button;
            this.e = editText;
            this.f = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TextView textView;
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                    this.d.setText("=");
                }
                this.e.setText("");
                textView = this.f;
            } else {
                MainActivity.this.j0.setText("");
                MainActivity.this.i0.setText("");
                MainActivity.this.k0.setText("");
                textView = MainActivity.this.l0;
            }
            textView.setText("");
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(40L, -1));
                } else {
                    MainActivity.this.r0.vibrate(40L);
                }
            }
        }
    }

    class n implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;
        final /* synthetic */ DecimalFormat i;

        n(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2, DecimalFormat decimalFormat3) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
            this.i = decimalFormat3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                    this.d.setText("=");
                }
                int selectionEnd = this.e.getSelectionEnd();
                String string = this.e.getText().toString();
                if (MainActivity.this.t0.equals("Francese")) {
                    MainActivity mainActivity2 = MainActivity.this;
                    String[] strArrC = mainActivity2.J.C(this.e, this.f, "1", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText = this.e;
                    MainActivity mainActivity3 = MainActivity.this;
                    editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrC[0];
                    str = strArrC[1];
                } else if (MainActivity.this.t0.equals("Italiana")) {
                    MainActivity mainActivity4 = MainActivity.this;
                    String[] strArrD = mainActivity4.J.D(this.e, this.f, "1", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText2 = this.e;
                    MainActivity mainActivity5 = MainActivity.this;
                    editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrD[0];
                    str = strArrD[1];
                } else {
                    MainActivity mainActivity6 = MainActivity.this;
                    String[] strArrB = mainActivity6.J.B(this.e, this.f, "1", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    this.e.setText(strArrB[0]);
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrB[0];
                    str = strArrB[1];
                }
                mainActivity.v0 = str;
                MainActivity mainActivity7 = MainActivity.this;
                String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
                TextView textView = this.f;
                MainActivity mainActivity8 = MainActivity.this;
                textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
                if (MainActivity.this.y0.equals("si")) {
                    MainActivity.this.d0(this.e);
                }
                MainActivity.this.J.d(this.e, string, selectionEnd);
                MainActivity mainActivity9 = MainActivity.this;
                mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
            } else {
                try {
                    if (MainActivity.this.t0.equals("Francese")) {
                        MainActivity.this.J.F(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "1", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else if (MainActivity.this.t0.equals("Italiana")) {
                        MainActivity.this.J.J(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "1", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else {
                        MainActivity.this.J.E(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "1", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    }
                    MainActivity.this.J.q0(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, MainActivity.this.getBaseContext());
                } catch (NumberFormatException unused) {
                    Toast.makeText(MainActivity.this.c0, "error", 0).show();
                }
            }
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
        }
    }

    class n0 implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;
        final /* synthetic */ DecimalFormat i;

        n0(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2, DecimalFormat decimalFormat3) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
            this.i = decimalFormat3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                    this.d.setText("=");
                }
                int selectionEnd = this.e.getSelectionEnd();
                String string = this.e.getText().toString();
                if (MainActivity.this.t0.equals("Francese")) {
                    MainActivity mainActivity2 = MainActivity.this;
                    String[] strArrC = mainActivity2.J.C(this.e, this.f, "canc", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText = this.e;
                    MainActivity mainActivity3 = MainActivity.this;
                    editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrC[0];
                    str = strArrC[1];
                } else if (MainActivity.this.t0.equals("Italiana")) {
                    MainActivity mainActivity4 = MainActivity.this;
                    String[] strArrD = mainActivity4.J.D(this.e, this.f, "canc", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText2 = this.e;
                    MainActivity mainActivity5 = MainActivity.this;
                    editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrD[0];
                    str = strArrD[1];
                } else {
                    MainActivity mainActivity6 = MainActivity.this;
                    String[] strArrB = mainActivity6.J.B(this.e, this.f, "canc", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    this.e.setText(strArrB[0]);
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrB[0];
                    str = strArrB[1];
                }
                mainActivity.v0 = str;
                MainActivity mainActivity7 = MainActivity.this;
                String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
                TextView textView = this.f;
                MainActivity mainActivity8 = MainActivity.this;
                textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
                if (MainActivity.this.y0.equals("si")) {
                    MainActivity.this.d0(this.e);
                }
                MainActivity.this.J.d(this.e, string, selectionEnd);
                MainActivity mainActivity9 = MainActivity.this;
                mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
            } else {
                try {
                    if (MainActivity.this.t0.equals("Francese")) {
                        MainActivity.this.J.F(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "canc", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else if (MainActivity.this.t0.equals("Italiana")) {
                        MainActivity.this.J.J(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "canc", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else {
                        MainActivity.this.J.E(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "canc", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    }
                    MainActivity.this.J.q0(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, MainActivity.this.getBaseContext());
                } catch (NumberFormatException unused) {
                    Toast.makeText(MainActivity.this.c0, "error", 0).show();
                }
            }
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
        }
    }

    class o implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;
        final /* synthetic */ DecimalFormat i;

        o(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2, DecimalFormat decimalFormat3) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
            this.i = decimalFormat3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                    this.d.setText("=");
                }
                int selectionEnd = this.e.getSelectionEnd();
                String string = this.e.getText().toString();
                if (MainActivity.this.t0.equals("Francese")) {
                    MainActivity mainActivity2 = MainActivity.this;
                    String[] strArrC = mainActivity2.J.C(this.e, this.f, "2", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText = this.e;
                    MainActivity mainActivity3 = MainActivity.this;
                    editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrC[0];
                    str = strArrC[1];
                } else if (MainActivity.this.t0.equals("Italiana")) {
                    MainActivity mainActivity4 = MainActivity.this;
                    String[] strArrD = mainActivity4.J.D(this.e, this.f, "2", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText2 = this.e;
                    MainActivity mainActivity5 = MainActivity.this;
                    editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrD[0];
                    str = strArrD[1];
                } else {
                    MainActivity mainActivity6 = MainActivity.this;
                    String[] strArrB = mainActivity6.J.B(this.e, this.f, "2", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    this.e.setText(strArrB[0]);
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrB[0];
                    str = strArrB[1];
                }
                mainActivity.v0 = str;
                MainActivity mainActivity7 = MainActivity.this;
                String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
                TextView textView = this.f;
                MainActivity mainActivity8 = MainActivity.this;
                textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
                if (MainActivity.this.y0.equals("si")) {
                    MainActivity.this.d0(this.e);
                }
                MainActivity.this.J.d(this.e, string, selectionEnd);
                MainActivity mainActivity9 = MainActivity.this;
                mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
            } else {
                try {
                    if (MainActivity.this.t0.equals("Francese")) {
                        MainActivity.this.J.F(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "2", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else if (MainActivity.this.t0.equals("Italiana")) {
                        MainActivity.this.J.J(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "2", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else {
                        MainActivity.this.J.E(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "2", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    }
                    MainActivity.this.J.q0(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, MainActivity.this.getBaseContext());
                } catch (NumberFormatException unused) {
                    Toast.makeText(MainActivity.this.c0, "error", 0).show();
                }
            }
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
        }
    }

    class o0 implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;

        o0(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(R.color.neon_blu));
                    this.d.setText("=");
                }
                int selectionEnd = this.e.getSelectionEnd();
                String string = this.e.getText().toString();
                if (MainActivity.this.t0.equals("Francese")) {
                    MainActivity mainActivity2 = MainActivity.this;
                    String[] strArrC = mainActivity2.J.C(this.e, this.f, "abs(", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText = this.e;
                    MainActivity mainActivity3 = MainActivity.this;
                    editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrC[0];
                    str = strArrC[1];
                } else if (MainActivity.this.t0.equals("Italiana")) {
                    MainActivity mainActivity4 = MainActivity.this;
                    String[] strArrD = mainActivity4.J.D(this.e, this.f, "abs(", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText2 = this.e;
                    MainActivity mainActivity5 = MainActivity.this;
                    editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrD[0];
                    str = strArrD[1];
                } else {
                    MainActivity mainActivity6 = MainActivity.this;
                    String[] strArrB = mainActivity6.J.B(this.e, this.f, "abs(", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    this.e.setText(strArrB[0]);
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrB[0];
                    str = strArrB[1];
                }
                mainActivity.v0 = str;
                MainActivity mainActivity7 = MainActivity.this;
                String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
                TextView textView = this.f;
                MainActivity mainActivity8 = MainActivity.this;
                textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
                if (MainActivity.this.y0.equals("si")) {
                    MainActivity.this.d0(this.e);
                }
                MainActivity.this.J.d(this.e, string, selectionEnd);
                MainActivity mainActivity9 = MainActivity.this;
                mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
            }
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
        }
    }

    class p implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;
        final /* synthetic */ DecimalFormat i;

        p(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2, DecimalFormat decimalFormat3) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
            this.i = decimalFormat3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                    this.d.setText("=");
                }
                int selectionEnd = this.e.getSelectionEnd();
                String string = this.e.getText().toString();
                if (MainActivity.this.t0.equals("Francese")) {
                    MainActivity mainActivity2 = MainActivity.this;
                    String[] strArrC = mainActivity2.J.C(this.e, this.f, "3", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText = this.e;
                    MainActivity mainActivity3 = MainActivity.this;
                    editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrC[0];
                    str = strArrC[1];
                } else if (MainActivity.this.t0.equals("Italiana")) {
                    MainActivity mainActivity4 = MainActivity.this;
                    String[] strArrD = mainActivity4.J.D(this.e, this.f, "3", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText2 = this.e;
                    MainActivity mainActivity5 = MainActivity.this;
                    editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrD[0];
                    str = strArrD[1];
                } else {
                    MainActivity mainActivity6 = MainActivity.this;
                    String[] strArrB = mainActivity6.J.B(this.e, this.f, "3", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    this.e.setText(strArrB[0]);
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrB[0];
                    str = strArrB[1];
                }
                mainActivity.v0 = str;
                MainActivity mainActivity7 = MainActivity.this;
                String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
                TextView textView = this.f;
                MainActivity mainActivity8 = MainActivity.this;
                textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
                if (MainActivity.this.y0.equals("si")) {
                    MainActivity.this.d0(this.e);
                }
                MainActivity.this.J.d(this.e, string, selectionEnd);
                MainActivity mainActivity9 = MainActivity.this;
                mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
            } else {
                try {
                    if (MainActivity.this.t0.equals("Francese")) {
                        MainActivity.this.J.F(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "3", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else if (MainActivity.this.t0.equals("Italiana")) {
                        MainActivity.this.J.J(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "3", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else {
                        MainActivity.this.J.E(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "3", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    }
                    MainActivity.this.J.q0(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, MainActivity.this.getBaseContext());
                } catch (NumberFormatException unused) {
                    Toast.makeText(MainActivity.this.c0, "error", 0).show();
                }
            }
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
        }
    }

    class p0 implements View.OnLongClickListener {
        final /* synthetic */ SharedPreferences d;
        final /* synthetic */ Button e;
        final /* synthetic */ Button f;
        final /* synthetic */ Button g;
        final /* synthetic */ Button h;
        final /* synthetic */ Button i;
        final /* synthetic */ Button j;
        final /* synthetic */ EditText k;

        p0(SharedPreferences sharedPreferences, Button button, Button button2, Button button3, Button button4, Button button5, Button button6, EditText editText) {
            this.d = sharedPreferences;
            this.e = button;
            this.f = button2;
            this.g = button3;
            this.h = button4;
            this.i = button5;
            this.j = button6;
            this.k = editText;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            Button button;
            float f;
            Button button2;
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(40L, -1));
                } else {
                    MainActivity.this.r0.vibrate(40L);
                }
            }
            MainActivity mainActivity = MainActivity.this;
            mainActivity.g0.setInAnimation(mainActivity.c0, R.anim.slide_in_from_right);
            MainActivity mainActivity2 = MainActivity.this;
            mainActivity2.g0.setOutAnimation(mainActivity2.c0, R.anim.slide_out_to_left);
            MainActivity.this.g0.showNext();
            if (MainActivity.this.g0.getDisplayedChild() == 1) {
                MainActivity mainActivity3 = MainActivity.this;
                mainActivity3.Q = this.d.getString(mainActivity3.getResources().getString(R.string.sconto_percetualeUNO), "...%");
                MainActivity mainActivity4 = MainActivity.this;
                mainActivity4.R = this.d.getString(mainActivity4.getResources().getString(R.string.sconto_percetualeDUE), "...%");
                MainActivity mainActivity5 = MainActivity.this;
                mainActivity5.S = this.d.getString(mainActivity5.getResources().getString(R.string.sconto_percetualeTRE), "...%");
                if (MainActivity.this.getResources().getBoolean(R.bool.Is600sw_dp)) {
                    if (MainActivity.this.F0.equals("si")) {
                        this.e.setText("↓");
                        this.e.setTypeface(Typeface.MONOSPACE, 1);
                        this.e.setTextSize(2, 40.0f);
                        this.f.setText("↑");
                        this.f.setTypeface(Typeface.MONOSPACE, 1);
                        this.f.setTextSize(2, 40.0f);
                        this.g.setText(MainActivity.this.Q);
                        this.g.setTypeface(Typeface.SANS_SERIF);
                        this.g.setTextSize(2, 35.0f);
                        this.h.setText(MainActivity.this.R);
                        this.h.setTypeface(Typeface.SANS_SERIF);
                        this.h.setTextSize(2, 35.0f);
                        this.i.setText(MainActivity.this.S);
                        this.i.setTypeface(Typeface.SANS_SERIF);
                        this.i.setTextSize(2, 35.0f);
                        this.j.setText(MainActivity.this.getResources().getString(R.string.CALC));
                        this.j.setTypeface(Typeface.SANS_SERIF);
                    } else {
                        this.e.setText("↓");
                        this.e.setTextSize(2, 40.0f);
                        this.f.setText("↑");
                        this.f.setTextSize(2, 40.0f);
                        this.g.setText(MainActivity.this.Q);
                        this.g.setTextSize(2, 35.0f);
                        this.h.setText(MainActivity.this.R);
                        this.h.setTextSize(2, 35.0f);
                        this.i.setText(MainActivity.this.S);
                        this.i.setTextSize(2, 35.0f);
                        this.j.setText(MainActivity.this.getResources().getString(R.string.CALC));
                    }
                    button = this.j;
                    button.setTextSize(2, 35.0f);
                } else {
                    f = 25.0f;
                    if (MainActivity.this.F0.equals("si")) {
                        this.e.setText("↓");
                        this.e.setTypeface(Typeface.MONOSPACE, 1);
                        this.e.setTextSize(2, 30.0f);
                        this.f.setText("↑");
                        this.f.setTypeface(Typeface.MONOSPACE, 1);
                        this.f.setTextSize(2, 30.0f);
                        this.g.setText(MainActivity.this.Q);
                        this.g.setTypeface(Typeface.SANS_SERIF);
                        this.g.setTextSize(2, 25.0f);
                        this.h.setText(MainActivity.this.R);
                        this.h.setTypeface(Typeface.SANS_SERIF);
                        this.h.setTextSize(2, 25.0f);
                        this.i.setText(MainActivity.this.S);
                        this.i.setTypeface(Typeface.SANS_SERIF);
                        this.i.setTextSize(2, 25.0f);
                        this.j.setText(MainActivity.this.getResources().getString(R.string.CALC));
                        this.j.setTypeface(Typeface.SANS_SERIF);
                    } else {
                        this.e.setText("↓");
                        this.e.setTextSize(2, 30.0f);
                        this.f.setText("↑");
                        this.f.setTextSize(2, 30.0f);
                        this.g.setText(MainActivity.this.Q);
                        this.g.setTextSize(2, 25.0f);
                        this.h.setText(MainActivity.this.R);
                        this.h.setTextSize(2, 25.0f);
                        this.i.setText(MainActivity.this.S);
                        this.i.setTextSize(2, 25.0f);
                        this.j.setText(MainActivity.this.getResources().getString(R.string.CALC));
                    }
                    button2 = this.j;
                    button2.setTextSize(2, f);
                }
            } else if (MainActivity.this.getResources().getBoolean(R.bool.Is600sw_dp)) {
                this.k.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                f = 45.0f;
                if (MainActivity.this.F0.equals("si")) {
                    this.f.setText("()");
                    this.f.setTypeface(Typeface.MONOSPACE);
                    this.f.setTextSize(2, 40.0f);
                    this.e.setText(MainActivity.this.getResources().getString(R.string.divisione));
                    this.e.setTypeface(Typeface.MONOSPACE);
                    this.e.setTextSize(2, 45.0f);
                    this.h.setText(MainActivity.this.getResources().getString(R.string.differenza));
                    this.h.setTypeface(Typeface.MONOSPACE);
                    this.h.setTextSize(2, 45.0f);
                    this.g.setText(MainActivity.this.getResources().getString(R.string.moltiplicazione));
                    this.g.setTypeface(Typeface.MONOSPACE);
                    this.g.setTextSize(2, 45.0f);
                    this.j.setText(MainActivity.this.getResources().getString(R.string.uguale));
                    this.j.setTypeface(Typeface.MONOSPACE);
                    this.j.setTextSize(2, 45.0f);
                    this.i.setText(MainActivity.this.getResources().getString(R.string.addizione));
                    this.i.setTypeface(Typeface.MONOSPACE);
                } else {
                    this.f.setText(MainActivity.this.getResources().getString(R.string.parentesi));
                    this.f.setTextSize(2, 40.0f);
                    this.e.setText(MainActivity.this.getResources().getString(R.string.divisione));
                    this.e.setTextSize(2, 45.0f);
                    this.h.setText(MainActivity.this.getResources().getString(R.string.differenza));
                    this.h.setTextSize(2, 45.0f);
                    this.g.setText(MainActivity.this.getResources().getString(R.string.moltiplicazione));
                    this.g.setTextSize(2, 45.0f);
                    this.j.setText(MainActivity.this.getResources().getString(R.string.uguale));
                    this.j.setTextSize(2, 45.0f);
                    this.i.setText(MainActivity.this.getResources().getString(R.string.addizione));
                }
                button2 = this.i;
                button2.setTextSize(2, f);
            } else {
                this.k.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                if (MainActivity.this.F0.equals("si")) {
                    this.f.setText("()");
                    this.f.setTypeface(Typeface.MONOSPACE);
                    this.f.setTextSize(2, 30.0f);
                    this.e.setText(MainActivity.this.getResources().getString(R.string.divisione));
                    this.e.setTypeface(Typeface.MONOSPACE);
                    this.e.setTextSize(2, 35.0f);
                    this.h.setText(MainActivity.this.getResources().getString(R.string.differenza));
                    this.h.setTypeface(Typeface.MONOSPACE);
                    this.h.setTextSize(2, 35.0f);
                    this.g.setText(MainActivity.this.getResources().getString(R.string.moltiplicazione));
                    this.g.setTypeface(Typeface.MONOSPACE);
                    this.g.setTextSize(2, 35.0f);
                    this.j.setText(MainActivity.this.getResources().getString(R.string.uguale));
                    this.j.setTypeface(Typeface.MONOSPACE);
                    this.j.setTextSize(2, 35.0f);
                    this.i.setText(MainActivity.this.getResources().getString(R.string.addizione));
                    this.i.setTypeface(Typeface.MONOSPACE);
                } else {
                    this.f.setText(MainActivity.this.getResources().getString(R.string.parentesi));
                    this.f.setTextSize(2, 30.0f);
                    this.e.setText(MainActivity.this.getResources().getString(R.string.divisione));
                    this.e.setTextSize(2, 35.0f);
                    this.h.setText(MainActivity.this.getResources().getString(R.string.differenza));
                    this.h.setTextSize(2, 35.0f);
                    this.g.setText(MainActivity.this.getResources().getString(R.string.moltiplicazione));
                    this.g.setTextSize(2, 35.0f);
                    this.j.setText(MainActivity.this.getResources().getString(R.string.uguale));
                    this.j.setTextSize(2, 35.0f);
                    this.i.setText(MainActivity.this.getResources().getString(R.string.addizione));
                }
                button = this.i;
                button.setTextSize(2, 35.0f);
            }
            return true;
        }
    }

    class q implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;
        final /* synthetic */ DecimalFormat i;

        q(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2, DecimalFormat decimalFormat3) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
            this.i = decimalFormat3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                    this.d.setText("=");
                }
                int selectionEnd = this.e.getSelectionEnd();
                String string = this.e.getText().toString();
                if (MainActivity.this.t0.equals("Francese")) {
                    MainActivity mainActivity2 = MainActivity.this;
                    String[] strArrC = mainActivity2.J.C(this.e, this.f, "4", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText = this.e;
                    MainActivity mainActivity3 = MainActivity.this;
                    editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrC[0];
                    str = strArrC[1];
                } else if (MainActivity.this.t0.equals("Italiana")) {
                    MainActivity mainActivity4 = MainActivity.this;
                    String[] strArrD = mainActivity4.J.D(this.e, this.f, "4", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText2 = this.e;
                    MainActivity mainActivity5 = MainActivity.this;
                    editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrD[0];
                    str = strArrD[1];
                } else {
                    MainActivity mainActivity6 = MainActivity.this;
                    String[] strArrB = mainActivity6.J.B(this.e, this.f, "4", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    this.e.setText(strArrB[0]);
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrB[0];
                    str = strArrB[1];
                }
                mainActivity.v0 = str;
                MainActivity mainActivity7 = MainActivity.this;
                String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
                TextView textView = this.f;
                MainActivity mainActivity8 = MainActivity.this;
                textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
                if (MainActivity.this.y0.equals("si")) {
                    MainActivity.this.d0(this.e);
                }
                MainActivity.this.J.d(this.e, string, selectionEnd);
                MainActivity mainActivity9 = MainActivity.this;
                mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
            } else {
                try {
                    if (MainActivity.this.t0.equals("Francese")) {
                        MainActivity.this.J.F(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "4", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else if (MainActivity.this.t0.equals("Italiana")) {
                        MainActivity.this.J.J(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "4", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else {
                        MainActivity.this.J.E(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "4", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    }
                    MainActivity.this.J.q0(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, MainActivity.this.getBaseContext());
                } catch (NumberFormatException unused) {
                    Toast.makeText(MainActivity.this.c0, "error", 0).show();
                }
            }
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
        }
    }

    class q0 implements DialogInterface.OnClickListener {
        final /* synthetic */ ViewGroup d;

        q0(ViewGroup viewGroup) {
            this.d = viewGroup;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r8) {
            if (MainActivity.this.G.getVisibility() != 8) {
                MainActivity.this.G.setVisibility(8);
                MainActivity.this.N0 = "NO";
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
                MainActivity.this.e0.e(((Long) arrayList.get(r0)).longValue(), MainActivity.this.d0);
                ViewGroup viewGroup = this.d;
                viewGroup.removeView(viewGroup.findViewWithTag(arrayList.get(r0)));
            }
        }
    }

    class r implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;
        final /* synthetic */ DecimalFormat i;

        r(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2, DecimalFormat decimalFormat3) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
            this.i = decimalFormat3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                    this.d.setText("=");
                }
                int selectionEnd = this.e.getSelectionEnd();
                String string = this.e.getText().toString();
                if (MainActivity.this.t0.equals("Francese")) {
                    MainActivity mainActivity2 = MainActivity.this;
                    String[] strArrC = mainActivity2.J.C(this.e, this.f, "5", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText = this.e;
                    MainActivity mainActivity3 = MainActivity.this;
                    editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrC[0];
                    str = strArrC[1];
                } else if (MainActivity.this.t0.equals("Italiana")) {
                    MainActivity mainActivity4 = MainActivity.this;
                    String[] strArrD = mainActivity4.J.D(this.e, this.f, "5", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText2 = this.e;
                    MainActivity mainActivity5 = MainActivity.this;
                    editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrD[0];
                    str = strArrD[1];
                } else {
                    MainActivity mainActivity6 = MainActivity.this;
                    String[] strArrB = mainActivity6.J.B(this.e, this.f, "5", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    this.e.setText(strArrB[0]);
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrB[0];
                    str = strArrB[1];
                }
                mainActivity.v0 = str;
                MainActivity mainActivity7 = MainActivity.this;
                String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
                TextView textView = this.f;
                MainActivity mainActivity8 = MainActivity.this;
                textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
                if (MainActivity.this.y0.equals("si")) {
                    MainActivity.this.d0(this.e);
                }
                MainActivity.this.J.d(this.e, string, selectionEnd);
                MainActivity mainActivity9 = MainActivity.this;
                mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
            } else {
                try {
                    if (MainActivity.this.t0.equals("Francese")) {
                        MainActivity.this.J.F(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "5", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else if (MainActivity.this.t0.equals("Italiana")) {
                        MainActivity.this.J.J(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "5", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else {
                        MainActivity.this.J.E(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "5", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    }
                    MainActivity.this.J.q0(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, MainActivity.this.getBaseContext());
                } catch (NumberFormatException unused) {
                    Toast.makeText(MainActivity.this.c0, "error", 0).show();
                }
            }
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
        }
    }

    class r0 implements com.google.android.gms.ads.k0.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SharedPreferences.Editor f7021a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinearLayout.LayoutParams f7022b;

        r0(SharedPreferences.Editor editor, LinearLayout.LayoutParams layoutParams) {
            this.f7021a = editor;
            this.f7022b = layoutParams;
        }

        @Override // com.google.android.gms.ads.k0.d
        public void a1(int r1) {
        }

        @Override // com.google.android.gms.ads.k0.d
        public void h1() {
            MainActivity.this.L.u1("ca-app-pub-8629550575650531/5370466120", new e.a().d(AdMobAdapter.class, MainActivity.this.V).f());
            this.f7021a.putLong("data_gift_rifiutato", System.currentTimeMillis());
            this.f7021a.apply();
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
            Toast toastMakeText = Toast.makeText(MainActivity.this.getBaseContext(), MainActivity.this.getResources().getString(R.string.premioPRO), 1);
            toastMakeText.setGravity(48, 0, 0);
            toastMakeText.show();
            this.f7021a.putLong("data_gift_vinto", System.currentTimeMillis());
            this.f7021a.apply();
            MainActivity.this.q0.setVisibility(8);
            MainActivity.this.g0.setLayoutParams(this.f7022b);
        }
    }

    class s implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;
        final /* synthetic */ DecimalFormat i;

        s(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2, DecimalFormat decimalFormat3) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
            this.i = decimalFormat3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                    this.d.setText("=");
                }
                int selectionEnd = this.e.getSelectionEnd();
                String string = this.e.getText().toString();
                if (MainActivity.this.t0.equals("Francese")) {
                    MainActivity mainActivity2 = MainActivity.this;
                    String[] strArrC = mainActivity2.J.C(this.e, this.f, "6", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText = this.e;
                    MainActivity mainActivity3 = MainActivity.this;
                    editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrC[0];
                    str = strArrC[1];
                } else if (MainActivity.this.t0.equals("Italiana")) {
                    MainActivity mainActivity4 = MainActivity.this;
                    String[] strArrD = mainActivity4.J.D(this.e, this.f, "6", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText2 = this.e;
                    MainActivity mainActivity5 = MainActivity.this;
                    editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrD[0];
                    str = strArrD[1];
                } else {
                    MainActivity mainActivity6 = MainActivity.this;
                    String[] strArrB = mainActivity6.J.B(this.e, this.f, "6", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    this.e.setText(strArrB[0]);
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrB[0];
                    str = strArrB[1];
                }
                mainActivity.v0 = str;
                MainActivity mainActivity7 = MainActivity.this;
                String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
                TextView textView = this.f;
                MainActivity mainActivity8 = MainActivity.this;
                textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
                if (MainActivity.this.y0.equals("si")) {
                    MainActivity.this.d0(this.e);
                }
                MainActivity.this.J.d(this.e, string, selectionEnd);
                MainActivity mainActivity9 = MainActivity.this;
                mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
            } else {
                try {
                    if (MainActivity.this.t0.equals("Francese")) {
                        MainActivity.this.J.F(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "6", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else if (MainActivity.this.t0.equals("Italiana")) {
                        MainActivity.this.J.J(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "6", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else {
                        MainActivity.this.J.E(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "6", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    }
                    MainActivity.this.J.q0(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, MainActivity.this.getBaseContext());
                } catch (NumberFormatException unused) {
                    Toast.makeText(MainActivity.this.c0, "error", 0).show();
                }
            }
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
        }
    }

    class s0 implements DialogInterface.OnClickListener {
        s0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r2) {
            dialogInterface.cancel();
        }
    }

    class t implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;
        final /* synthetic */ DecimalFormat i;

        t(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2, DecimalFormat decimalFormat3) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
            this.i = decimalFormat3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                    this.d.setText("=");
                }
                int selectionEnd = this.e.getSelectionEnd();
                String string = this.e.getText().toString();
                if (MainActivity.this.t0.equals("Francese")) {
                    MainActivity mainActivity2 = MainActivity.this;
                    String[] strArrC = mainActivity2.J.C(this.e, this.f, "7", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText = this.e;
                    MainActivity mainActivity3 = MainActivity.this;
                    editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrC[0];
                    str = strArrC[1];
                } else if (MainActivity.this.t0.equals("Italiana")) {
                    MainActivity mainActivity4 = MainActivity.this;
                    String[] strArrD = mainActivity4.J.D(this.e, this.f, "7", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText2 = this.e;
                    MainActivity mainActivity5 = MainActivity.this;
                    editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrD[0];
                    str = strArrD[1];
                } else {
                    MainActivity mainActivity6 = MainActivity.this;
                    String[] strArrB = mainActivity6.J.B(this.e, this.f, "7", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    this.e.setText(strArrB[0]);
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrB[0];
                    str = strArrB[1];
                }
                mainActivity.v0 = str;
                MainActivity mainActivity7 = MainActivity.this;
                String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
                TextView textView = this.f;
                MainActivity mainActivity8 = MainActivity.this;
                textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
                if (MainActivity.this.y0.equals("si")) {
                    MainActivity.this.d0(this.e);
                }
                MainActivity.this.J.d(this.e, string, selectionEnd);
                MainActivity mainActivity9 = MainActivity.this;
                mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
            } else {
                try {
                    if (MainActivity.this.t0.equals("Francese")) {
                        MainActivity.this.J.F(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "7", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else if (MainActivity.this.t0.equals("Italiana")) {
                        MainActivity.this.J.J(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "7", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else {
                        MainActivity.this.J.E(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "7", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    }
                    MainActivity.this.J.q0(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, MainActivity.this.getBaseContext());
                } catch (NumberFormatException unused) {
                    Toast.makeText(MainActivity.this.c0, "error", 0).show();
                }
            }
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
        }
    }

    class t0 implements DialogInterface.OnClickListener {
        t0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r4) {
            MainActivity mainActivity = MainActivity.this;
            SharedPreferences.Editor editorEdit = mainActivity.getSharedPreferences(mainActivity.getString(R.string.pref_file), 0).edit();
            editorEdit.putString(MainActivity.this.getString(R.string.Tutorial), "SI");
            editorEdit.apply();
            dialogInterface.cancel();
        }
    }

    class u implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;
        final /* synthetic */ DecimalFormat i;

        u(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2, DecimalFormat decimalFormat3) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
            this.i = decimalFormat3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                    this.d.setText("=");
                }
                int selectionEnd = this.e.getSelectionEnd();
                String string = this.e.getText().toString();
                if (MainActivity.this.t0.equals("Francese")) {
                    MainActivity mainActivity2 = MainActivity.this;
                    String[] strArrC = mainActivity2.J.C(this.e, this.f, "8", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText = this.e;
                    MainActivity mainActivity3 = MainActivity.this;
                    editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrC[0];
                    str = strArrC[1];
                } else if (MainActivity.this.t0.equals("Italiana")) {
                    MainActivity mainActivity4 = MainActivity.this;
                    String[] strArrD = mainActivity4.J.D(this.e, this.f, "8", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText2 = this.e;
                    MainActivity mainActivity5 = MainActivity.this;
                    editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrD[0];
                    str = strArrD[1];
                } else {
                    MainActivity mainActivity6 = MainActivity.this;
                    String[] strArrB = mainActivity6.J.B(this.e, this.f, "8", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    this.e.setText(strArrB[0]);
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrB[0];
                    str = strArrB[1];
                }
                mainActivity.v0 = str;
                MainActivity mainActivity7 = MainActivity.this;
                String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
                TextView textView = this.f;
                MainActivity mainActivity8 = MainActivity.this;
                textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
                if (MainActivity.this.y0.equals("si")) {
                    MainActivity.this.d0(this.e);
                }
                MainActivity.this.J.d(this.e, string, selectionEnd);
                MainActivity mainActivity9 = MainActivity.this;
                mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
            } else {
                try {
                    if (MainActivity.this.t0.equals("Francese")) {
                        MainActivity.this.J.F(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "8", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else if (MainActivity.this.t0.equals("Italiana")) {
                        MainActivity.this.J.J(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "8", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else {
                        MainActivity.this.J.E(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "8", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    }
                    MainActivity.this.J.q0(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, MainActivity.this.getBaseContext());
                } catch (NumberFormatException unused) {
                    Toast.makeText(MainActivity.this.c0, "error", 0).show();
                }
            }
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
        }
    }

    class u0 implements View.OnClickListener {
        final /* synthetic */ EditText d;

        u0(EditText editText) {
            this.d = editText;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainActivity mainActivity;
            boolean z;
            if (this.d.getSelectionEnd() < 0 || this.d.getSelectionEnd() >= this.d.getText().toString().length()) {
                mainActivity = MainActivity.this;
                z = false;
            } else {
                this.d.setRawInputType(3);
                mainActivity = MainActivity.this;
                z = true;
            }
            mainActivity.a0 = z;
        }
    }

    class v implements DialogInterface.OnClickListener {
        v() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r2) {
            MainActivity.this.L0.setVisible(false);
        }
    }

    class v0 implements View.OnLongClickListener {
        final /* synthetic */ EditText d;

        v0(EditText editText) {
            this.d = editText;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (this.d.getSelectionEnd() < 0 || this.d.getSelectionEnd() >= this.d.getText().toString().length()) {
                MainActivity.this.a0 = false;
            } else {
                int r4 = Build.VERSION.SDK_INT;
                this.d.setRawInputType(3);
                MainActivity.this.a0 = true;
            }
            return true;
        }
    }

    class w implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;
        final /* synthetic */ DecimalFormat i;

        w(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2, DecimalFormat decimalFormat3) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
            this.i = decimalFormat3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                    this.d.setText("=");
                }
                int selectionEnd = this.e.getSelectionEnd();
                String string = this.e.getText().toString();
                if (MainActivity.this.t0.equals("Francese")) {
                    MainActivity mainActivity2 = MainActivity.this;
                    String[] strArrC = mainActivity2.J.C(this.e, this.f, "9", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText = this.e;
                    MainActivity mainActivity3 = MainActivity.this;
                    editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrC[0];
                    str = strArrC[1];
                } else if (MainActivity.this.t0.equals("Italiana")) {
                    MainActivity mainActivity4 = MainActivity.this;
                    String[] strArrD = mainActivity4.J.D(this.e, this.f, "9", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText2 = this.e;
                    MainActivity mainActivity5 = MainActivity.this;
                    editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrD[0];
                    str = strArrD[1];
                } else {
                    MainActivity mainActivity6 = MainActivity.this;
                    String[] strArrB = mainActivity6.J.B(this.e, this.f, "9", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    this.e.setText(strArrB[0]);
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrB[0];
                    str = strArrB[1];
                }
                mainActivity.v0 = str;
                MainActivity mainActivity7 = MainActivity.this;
                String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
                TextView textView = this.f;
                MainActivity mainActivity8 = MainActivity.this;
                textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
                if (MainActivity.this.y0.equals("si")) {
                    MainActivity.this.d0(this.e);
                }
                MainActivity.this.J.d(this.e, string, selectionEnd);
                MainActivity mainActivity9 = MainActivity.this;
                mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
            } else {
                try {
                    if (MainActivity.this.t0.equals("Francese")) {
                        MainActivity.this.J.F(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "9", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else if (MainActivity.this.t0.equals("Italiana")) {
                        MainActivity.this.J.J(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "9", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else {
                        MainActivity.this.J.E(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, "9", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    }
                    MainActivity.this.J.q0(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, MainActivity.this.getBaseContext());
                } catch (NumberFormatException unused) {
                    Toast.makeText(MainActivity.this.c0, "error", 0).show();
                }
            }
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
        }
    }

    class w0 implements TextWatcher {
        final /* synthetic */ EditText d;

        w0(EditText editText) {
            this.d = editText;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (this.d.getText().toString().isEmpty()) {
                MainActivity.this.a0 = false;
                this.d.setRawInputType(0);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int r2, int r3, int r4) {
            if (MainActivity.this.a0) {
                return;
            }
            EditText editText = this.d;
            editText.setSelection(editText.getText().toString().length(), this.d.getText().toString().length());
            this.d.setRawInputType(3);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int r2, int r3, int r4) {
            if (MainActivity.this.a0) {
                return;
            }
            EditText editText = this.d;
            editText.setSelection(editText.getText().toString().length(), this.d.getText().toString().length());
            this.d.setRawInputType(3);
        }
    }

    class x implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;
        final /* synthetic */ DecimalFormat i;

        x(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2, DecimalFormat decimalFormat3) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
            this.i = decimalFormat3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                    this.d.setText("=");
                }
                int selectionEnd = this.e.getSelectionEnd();
                String string = this.e.getText().toString();
                if (MainActivity.this.t0.equals("Francese")) {
                    MainActivity mainActivity2 = MainActivity.this;
                    String[] strArrC = mainActivity2.J.C(this.e, this.f, ".", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText = this.e;
                    MainActivity mainActivity3 = MainActivity.this;
                    editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrC[0];
                    str = strArrC[1];
                } else if (MainActivity.this.t0.equals("Italiana")) {
                    MainActivity mainActivity4 = MainActivity.this;
                    String[] strArrD = mainActivity4.J.D(this.e, this.f, ".", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText2 = this.e;
                    MainActivity mainActivity5 = MainActivity.this;
                    editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrD[0];
                    str = strArrD[1];
                } else {
                    MainActivity mainActivity6 = MainActivity.this;
                    String[] strArrB = mainActivity6.J.B(this.e, this.f, ".", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    this.e.setText(strArrB[0]);
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrB[0];
                    str = strArrB[1];
                }
                mainActivity.v0 = str;
                MainActivity mainActivity7 = MainActivity.this;
                String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
                TextView textView = this.f;
                MainActivity mainActivity8 = MainActivity.this;
                textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
                if (MainActivity.this.y0.equals("si")) {
                    MainActivity.this.d0(this.e);
                }
                MainActivity.this.J.d(this.e, string, selectionEnd);
                MainActivity mainActivity9 = MainActivity.this;
                mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
            } else {
                try {
                    if (MainActivity.this.t0.equals("Francese")) {
                        MainActivity.this.J.F(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, ".", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else if (MainActivity.this.t0.equals("Italiana")) {
                        MainActivity.this.J.J(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, ".", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else {
                        MainActivity.this.J.E(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, ".", MainActivity.this.h0, this.i, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    }
                    MainActivity.this.J.q0(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, MainActivity.this.getBaseContext());
                } catch (NumberFormatException unused) {
                    Toast.makeText(MainActivity.this.c0, "error", 0).show();
                }
            }
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
        }
    }

    class x0 implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;

        x0(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.g0.getDisplayedChild() == 0) {
                if (this.d.getText().toString().equals("↶")) {
                    this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                    this.d.setText("=");
                }
                int selectionEnd = this.e.getSelectionEnd();
                String string = this.e.getText().toString();
                if (MainActivity.this.t0.equals("Francese")) {
                    MainActivity mainActivity2 = MainActivity.this;
                    String[] strArrC = mainActivity2.J.C(this.e, this.f, "tan⁻¹(", Boolean.valueOf(mainActivity2.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText = this.e;
                    MainActivity mainActivity3 = MainActivity.this;
                    editText.setText(mainActivity3.m0.m(strArrC[0], mainActivity3.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrC[0];
                    str = strArrC[1];
                } else if (MainActivity.this.t0.equals("Italiana")) {
                    MainActivity mainActivity4 = MainActivity.this;
                    String[] strArrD = mainActivity4.J.D(this.e, this.f, "tan⁻¹(", Boolean.valueOf(mainActivity4.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    EditText editText2 = this.e;
                    MainActivity mainActivity5 = MainActivity.this;
                    editText2.setText(mainActivity5.m0.m(strArrD[0], mainActivity5.t0));
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrD[0];
                    str = strArrD[1];
                } else {
                    MainActivity mainActivity6 = MainActivity.this;
                    String[] strArrB = mainActivity6.J.B(this.e, this.f, "tan⁻¹(", Boolean.valueOf(mainActivity6.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                    this.e.setText(strArrB[0]);
                    mainActivity = MainActivity.this;
                    mainActivity.u0 = strArrB[0];
                    str = strArrB[1];
                }
                mainActivity.v0 = str;
                MainActivity mainActivity7 = MainActivity.this;
                String strH0 = mainActivity7.J.h0(mainActivity7.u0, mainActivity7.x0, mainActivity7.I, mainActivity7.m0, this.h, mainActivity7.getBaseContext());
                TextView textView = this.f;
                MainActivity mainActivity8 = MainActivity.this;
                textView.setText(mainActivity8.m0.m(strH0, mainActivity8.t0));
                if (MainActivity.this.y0.equals("si")) {
                    MainActivity.this.d0(this.e);
                }
                MainActivity.this.J.d(this.e, string, selectionEnd);
                MainActivity mainActivity9 = MainActivity.this;
                mainActivity9.J.m0(this.e, mainActivity9.N, mainActivity9.getBaseContext());
            }
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
        }
    }

    class y implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;
        final /* synthetic */ SharedPreferences i;
        final /* synthetic */ Button j;
        final /* synthetic */ SharedPreferences.Editor k;
        final /* synthetic */ DecimalFormat l;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int r4) {
                y yVar = y.this;
                yVar.k.putString(MainActivity.this.getResources().getString(R.string.Tutorial_sconto_percetuale), "no");
                y.this.k.apply();
                dialogInterface.cancel();
            }
        }

        y(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2, SharedPreferences sharedPreferences, Button button2, SharedPreferences.Editor editor, DecimalFormat decimalFormat3) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
            this.i = sharedPreferences;
            this.j = button2;
            this.k = editor;
            this.l = decimalFormat3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
            if (MainActivity.this.g0.getDisplayedChild() != 0) {
                MainActivity mainActivity2 = MainActivity.this;
                mainActivity2.O = this.i.getString(mainActivity2.getString(R.string.Tutorial_sconto_percetuale), "si");
                if (this.j.getText().toString().equals("...%") && MainActivity.this.O.equals("si")) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage(MainActivity.this.getResources().getString(R.string.Suggerimento_calcolo_sconto_messaggio));
                    builder.setTitle(MainActivity.this.getResources().getString(R.string.Suggerimento_calcolo_iva));
                    builder.setCancelable(false);
                    builder.setPositiveButton(MainActivity.this.getResources().getString(R.string.testo_bottone_tutorial), new a());
                    builder.create().show();
                    return;
                }
                try {
                    if (this.j.getText().toString().equals("...%")) {
                        return;
                    }
                    if (MainActivity.this.t0.equals("Francese")) {
                        MainActivity.this.J.L(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, this.j.getText().toString().substring(0, this.j.getText().toString().length() - 2), MainActivity.this.h0, this.l, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else if (MainActivity.this.t0.equals("Italiana")) {
                        MainActivity.this.J.M(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, this.j.getText().toString().substring(0, this.j.getText().toString().length() - 2), MainActivity.this.h0, this.l, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else {
                        MainActivity.this.J.K(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, this.j.getText().toString().substring(0, this.j.getText().toString().length() - 2), MainActivity.this.h0, this.l, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    }
                    MainActivity.this.J.q0(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, MainActivity.this.getBaseContext());
                    return;
                } catch (NumberFormatException unused) {
                    Toast.makeText(MainActivity.this.c0, "error", 0).show();
                    return;
                }
            }
            if (this.d.getText().toString().equals("↶")) {
                this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                this.d.setText("=");
            }
            int selectionEnd = this.e.getSelectionEnd();
            String string = this.e.getText().toString();
            if (MainActivity.this.t0.equals("Francese")) {
                MainActivity mainActivity3 = MainActivity.this;
                String[] strArrC = mainActivity3.J.C(this.e, this.f, "somma", Boolean.valueOf(mainActivity3.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                EditText editText = this.e;
                MainActivity mainActivity4 = MainActivity.this;
                editText.setText(mainActivity4.m0.m(strArrC[0], mainActivity4.t0));
                mainActivity = MainActivity.this;
                mainActivity.u0 = strArrC[0];
                str = strArrC[1];
            } else if (MainActivity.this.t0.equals("Italiana")) {
                MainActivity mainActivity5 = MainActivity.this;
                String[] strArrD = mainActivity5.J.D(this.e, this.f, "somma", Boolean.valueOf(mainActivity5.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                EditText editText2 = this.e;
                MainActivity mainActivity6 = MainActivity.this;
                editText2.setText(mainActivity6.m0.m(strArrD[0], mainActivity6.t0));
                mainActivity = MainActivity.this;
                mainActivity.u0 = strArrD[0];
                str = strArrD[1];
            } else {
                MainActivity mainActivity7 = MainActivity.this;
                String[] strArrB = mainActivity7.J.B(this.e, this.f, "somma", Boolean.valueOf(mainActivity7.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                this.e.setText(strArrB[0]);
                mainActivity = MainActivity.this;
                mainActivity.u0 = strArrB[0];
                str = strArrB[1];
            }
            mainActivity.v0 = str;
            MainActivity mainActivity8 = MainActivity.this;
            String strH0 = mainActivity8.J.h0(mainActivity8.u0, mainActivity8.x0, mainActivity8.I, mainActivity8.m0, this.h, mainActivity8.getBaseContext());
            TextView textView = this.f;
            MainActivity mainActivity9 = MainActivity.this;
            textView.setText(mainActivity9.m0.m(strH0, mainActivity9.t0));
            if (MainActivity.this.y0.equals("si")) {
                MainActivity.this.d0(this.e);
            }
            MainActivity.this.J.d(this.e, string, selectionEnd);
            MainActivity mainActivity10 = MainActivity.this;
            mainActivity10.J.m0(this.e, mainActivity10.N, mainActivity10.getBaseContext());
        }
    }

    class z implements View.OnClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ EditText e;
        final /* synthetic */ TextView f;
        final /* synthetic */ DecimalFormat g;
        final /* synthetic */ DecimalFormat h;
        final /* synthetic */ SharedPreferences i;
        final /* synthetic */ Button j;
        final /* synthetic */ SharedPreferences.Editor k;
        final /* synthetic */ DecimalFormat l;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int r4) {
                z zVar = z.this;
                zVar.k.putString(MainActivity.this.getResources().getString(R.string.Tutorial_sconto_percetuale), "no");
                z.this.k.apply();
                dialogInterface.cancel();
            }
        }

        z(Button button, EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2, SharedPreferences sharedPreferences, Button button2, SharedPreferences.Editor editor, DecimalFormat decimalFormat3) {
            this.d = button;
            this.e = editText;
            this.f = textView;
            this.g = decimalFormat;
            this.h = decimalFormat2;
            this.i = sharedPreferences;
            this.j = button2;
            this.k = editor;
            this.l = decimalFormat3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            MainActivity mainActivity;
            String str;
            if (MainActivity.this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MainActivity.this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    MainActivity.this.r0.vibrate(20L);
                }
            }
            if (MainActivity.this.g0.getDisplayedChild() != 0) {
                MainActivity mainActivity2 = MainActivity.this;
                mainActivity2.O = this.i.getString(mainActivity2.getString(R.string.Tutorial_sconto_percetuale), "si");
                if (this.j.getText().toString().equals("...%") && MainActivity.this.O.equals("si")) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage(MainActivity.this.getResources().getString(R.string.Suggerimento_calcolo_sconto_messaggio));
                    builder.setTitle(MainActivity.this.getResources().getString(R.string.Suggerimento_calcolo_iva));
                    builder.setCancelable(false);
                    builder.setPositiveButton(MainActivity.this.getResources().getString(R.string.testo_bottone_tutorial), new a());
                    builder.create().show();
                    return;
                }
                try {
                    if (this.j.getText().toString().equals("...%")) {
                        return;
                    }
                    if (MainActivity.this.t0.equals("Francese")) {
                        MainActivity.this.J.L(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, this.j.getText().toString().substring(0, this.j.getText().toString().length() - 2), MainActivity.this.h0, this.l, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else if (MainActivity.this.t0.equals("Italiana")) {
                        MainActivity.this.J.M(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, this.j.getText().toString().substring(0, this.j.getText().toString().length() - 2), MainActivity.this.h0, this.l, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    } else {
                        MainActivity.this.J.K(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, this.j.getText().toString().substring(0, this.j.getText().toString().length() - 2), MainActivity.this.h0, this.l, MainActivity.this.m0, MainActivity.this.getBaseContext());
                    }
                    MainActivity.this.J.q0(MainActivity.this.i0, MainActivity.this.j0, MainActivity.this.l0, MainActivity.this.k0, MainActivity.this.getBaseContext());
                    return;
                } catch (NumberFormatException unused) {
                    Toast.makeText(MainActivity.this.c0, "error", 0).show();
                    return;
                }
            }
            if (this.d.getText().toString().equals("↶")) {
                this.e.setTextColor(MainActivity.this.getResources().getColor(MainActivity.this.H0));
                this.d.setText("=");
            }
            int selectionEnd = this.e.getSelectionEnd();
            String string = this.e.getText().toString();
            if (MainActivity.this.t0.equals("Francese")) {
                MainActivity mainActivity3 = MainActivity.this;
                String[] strArrC = mainActivity3.J.C(this.e, this.f, "dif", Boolean.valueOf(mainActivity3.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                EditText editText = this.e;
                MainActivity mainActivity4 = MainActivity.this;
                editText.setText(mainActivity4.m0.m(strArrC[0], mainActivity4.t0));
                mainActivity = MainActivity.this;
                mainActivity.u0 = strArrC[0];
                str = strArrC[1];
            } else if (MainActivity.this.t0.equals("Italiana")) {
                MainActivity mainActivity5 = MainActivity.this;
                String[] strArrD = mainActivity5.J.D(this.e, this.f, "dif", Boolean.valueOf(mainActivity5.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                EditText editText2 = this.e;
                MainActivity mainActivity6 = MainActivity.this;
                editText2.setText(mainActivity6.m0.m(strArrD[0], mainActivity6.t0));
                mainActivity = MainActivity.this;
                mainActivity.u0 = strArrD[0];
                str = strArrD[1];
            } else {
                MainActivity mainActivity7 = MainActivity.this;
                String[] strArrB = mainActivity7.J.B(this.e, this.f, "dif", Boolean.valueOf(mainActivity7.a0), MainActivity.this.getBaseContext(), this.g, Locale.US);
                this.e.setText(strArrB[0]);
                mainActivity = MainActivity.this;
                mainActivity.u0 = strArrB[0];
                str = strArrB[1];
            }
            mainActivity.v0 = str;
            MainActivity mainActivity8 = MainActivity.this;
            String strH0 = mainActivity8.J.h0(mainActivity8.u0, mainActivity8.x0, mainActivity8.I, mainActivity8.m0, this.h, mainActivity8.getBaseContext());
            TextView textView = this.f;
            MainActivity mainActivity9 = MainActivity.this;
            textView.setText(mainActivity9.m0.m(strH0, mainActivity9.t0));
            if (MainActivity.this.y0.equals("si")) {
                MainActivity.this.d0(this.e);
            }
            MainActivity.this.J.d(this.e, string, selectionEnd);
            MainActivity mainActivity10 = MainActivity.this;
            mainActivity10.J.m0(this.e, mainActivity10.N, mainActivity10.getBaseContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(TextView textView) {
        String string = textView.getText().toString();
        SpannableString spannableString = new SpannableString(string);
        Matcher matcher = Pattern.compile("[\\\\^]|[×]|[%]|[+]|[-]|[÷]|[√]").matcher(string);
        while (matcher.find()) {
            int r2 = matcher.start();
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(this.G0));
            if (r2 < 0) {
                break;
            } else {
                spannableString.setSpan(foregroundColorSpan, r2, (matcher.end() + r2) - matcher.start(), 33);
            }
        }
        textView.setText(spannableString);
    }

    private Bitmap e0(View view) {
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
        DecimalFormat decimalFormat;
        BigDecimal bigDecimal;
        Object obj;
        String str2;
        Context context;
        int r11;
        Button button;
        Cursor cursor;
        String str3;
        String str4;
        String str5;
        String str6 = "";
        if (this.o0.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.r0.vibrate(20L);
            }
        }
        Locale.setDefault(Locale.US);
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormatSymbols.setGroupingSeparator(',');
        DecimalFormat decimalFormat2 = new DecimalFormat("#,###.########", decimalFormatSymbols);
        DecimalFormat decimalFormat3 = new DecimalFormat(this.U, decimalFormatSymbols);
        DecimalFormat decimalFormat4 = new DecimalFormat("#,###.###", decimalFormatSymbols);
        long jLongValue = ((Long) ((View) view.getParent().getParent()).getTag()).longValue();
        this.W = (EditText) findViewById(R.id.displayup);
        this.X = (TextView) findViewById(R.id.displayresult);
        Button button2 = (Button) findViewById(R.id.uguale);
        SQLiteDatabase readableDatabase = this.e0.getReadableDatabase();
        this.d0 = readableDatabase;
        Cursor cursorI = this.e0.i(jLongValue, readableDatabase);
        String str7 = "Italiana";
        String str8 = "Francese";
        String str9 = "Default";
        int r9 = 0;
        if (this.g0.getDisplayedChild() == 0) {
            while (cursorI.moveToNext()) {
                String string = cursorI.getString(r9);
                int selectionEnd = this.W.getSelectionEnd();
                String string2 = this.W.getText().toString();
                if (this.t0.equals(str8)) {
                    button = button2;
                    cursor = cursorI;
                    String[] strArrY = this.J.Y(this.W, this.X, this.m0.g(string, str9), Boolean.valueOf(this.a0), getBaseContext(), decimalFormat2, Locale.US);
                    this.W.setText(this.m0.m(strArrY[0], this.t0));
                    this.u0 = strArrY[0];
                    this.v0 = strArrY[1];
                    str3 = str8;
                    str4 = str9;
                    str5 = str7;
                } else {
                    button = button2;
                    String str10 = str9;
                    String str11 = str7;
                    cursor = cursorI;
                    String str12 = str8;
                    if (this.t0.equals(str11)) {
                        str5 = str11;
                        str3 = str12;
                        String[] strArrZ = this.J.Z(this.W, this.X, this.m0.g(string, str10), Boolean.valueOf(this.a0), getBaseContext(), decimalFormat2, Locale.US);
                        this.W.setText(this.m0.m(strArrZ[0], this.t0));
                        this.u0 = strArrZ[0];
                        this.v0 = strArrZ[1];
                        str4 = str10;
                    } else {
                        str3 = str12;
                        str4 = str10;
                        str5 = str11;
                        String[] strArrX = this.J.X(this.W, this.X, this.m0.g(string, str10), Boolean.valueOf(this.a0), getBaseContext(), decimalFormat2, Locale.US);
                        this.W.setText(strArrX[0]);
                        this.u0 = strArrX[0];
                        this.v0 = strArrX[1];
                    }
                }
                this.X.setText(this.m0.m(this.J.h0(this.u0, this.x0, this.I, this.m0, decimalFormat3, getBaseContext()), this.t0));
                if (this.y0.equals("si")) {
                    d0(this.W);
                }
                this.J.d(this.W, string2, selectionEnd);
                this.J.m0(this.W, this.N, getBaseContext());
                cursorI = cursor;
                str7 = str5;
                button2 = button;
                str8 = str3;
                str9 = str4;
                r9 = 0;
            }
            Button button3 = button2;
            if (button3.getText().toString().equals("↶")) {
                this.W.setTextColor(getResources().getColor(this.H0));
                button3.setText("=");
            }
        } else {
            String str13 = "Default";
            Object obj2 = "Francese";
            Cursor cursor2 = cursorI;
            int r4 = 0;
            BigDecimal bigDecimal2 = new BigDecimal("9999999999");
            while (cursor2.moveToNext()) {
                Cursor cursor3 = cursor2;
                try {
                    str2 = str13;
                    try {
                        String strG = this.m0.g(cursor3.getString(r4), str2);
                        if (Pattern.compile("^[-]").matcher(strG).find()) {
                            r11 = 1;
                            strG = strG.substring(1);
                        } else {
                            r11 = 1;
                        }
                        String strL = this.m0.l(this.I.a(strG), decimalFormat2, Locale.US);
                        if (new BigDecimal(strL.replaceAll(",", str6)).compareTo(bigDecimal2) < 0) {
                            this.w0 = decimalFormat4.format(new BigDecimal(strL.replaceAll(",", str6)));
                        } else {
                            this.w0 = "9,999,999,999";
                            Toast.makeText(this, getResources().getString(R.string.overflow_result), r11).show();
                        }
                        obj = obj2;
                        try {
                            try {
                                if (this.t0.equals(obj)) {
                                    this.i0.setText(this.w0.replaceAll("[,]", " "));
                                    try {
                                        str = str6;
                                    } catch (NumberFormatException unused) {
                                        str = str6;
                                    }
                                    try {
                                        decimalFormat = decimalFormat2;
                                    } catch (NumberFormatException unused2) {
                                        decimalFormat = decimalFormat2;
                                        bigDecimal = bigDecimal2;
                                        r4 = 0;
                                        context = this.c0;
                                        Toast.makeText(context, "error", r4).show();
                                        cursor2 = cursor3;
                                        str13 = str2;
                                        obj2 = obj;
                                        str6 = str;
                                        decimalFormat2 = decimalFormat;
                                        bigDecimal2 = bigDecimal;
                                    } catch (EmptyStackException unused3) {
                                        decimalFormat = decimalFormat2;
                                        bigDecimal = bigDecimal2;
                                        context = this.c0;
                                        r4 = 0;
                                        Toast.makeText(context, "error", r4).show();
                                        cursor2 = cursor3;
                                        str13 = str2;
                                        obj2 = obj;
                                        str6 = str;
                                        decimalFormat2 = decimalFormat;
                                        bigDecimal2 = bigDecimal;
                                    }
                                    try {
                                        bigDecimal = bigDecimal2;
                                    } catch (NumberFormatException unused4) {
                                        bigDecimal = bigDecimal2;
                                        r4 = 0;
                                        context = this.c0;
                                        Toast.makeText(context, "error", r4).show();
                                        cursor2 = cursor3;
                                        str13 = str2;
                                        obj2 = obj;
                                        str6 = str;
                                        decimalFormat2 = decimalFormat;
                                        bigDecimal2 = bigDecimal;
                                    } catch (EmptyStackException unused5) {
                                        bigDecimal = bigDecimal2;
                                        context = this.c0;
                                        r4 = 0;
                                        Toast.makeText(context, "error", r4).show();
                                        cursor2 = cursor3;
                                        str13 = str2;
                                        obj2 = obj;
                                        str6 = str;
                                        decimalFormat2 = decimalFormat;
                                        bigDecimal2 = bigDecimal;
                                    }
                                    try {
                                        this.J.H(this.i0, this.j0, this.l0, this.k0, this.w0, this.h0, decimalFormat4, this.m0, getBaseContext());
                                    } catch (NumberFormatException unused6) {
                                        r4 = 0;
                                        context = this.c0;
                                        Toast.makeText(context, "error", r4).show();
                                        cursor2 = cursor3;
                                        str13 = str2;
                                        obj2 = obj;
                                        str6 = str;
                                        decimalFormat2 = decimalFormat;
                                        bigDecimal2 = bigDecimal;
                                    } catch (EmptyStackException unused7) {
                                        context = this.c0;
                                        r4 = 0;
                                        Toast.makeText(context, "error", r4).show();
                                        cursor2 = cursor3;
                                        str13 = str2;
                                        obj2 = obj;
                                        str6 = str;
                                        decimalFormat2 = decimalFormat;
                                        bigDecimal2 = bigDecimal;
                                    }
                                } else {
                                    str = str6;
                                    decimalFormat = decimalFormat2;
                                    bigDecimal = bigDecimal2;
                                    if (this.t0.equals("Italiana")) {
                                        this.i0.setText(this.w0.replaceAll("[.]", "v").replaceAll("[,]", ".").replaceAll("[v]", ","));
                                        this.J.I(this.i0, this.j0, this.l0, this.k0, this.w0, this.h0, decimalFormat4, this.m0, getBaseContext());
                                    } else {
                                        this.i0.setText(this.w0);
                                        this.J.G(this.i0, this.j0, this.l0, this.k0, this.w0, this.h0, decimalFormat4, this.m0, getBaseContext());
                                    }
                                }
                                this.J.q0(this.i0, this.j0, this.l0, this.k0, getBaseContext());
                                cursor2 = cursor3;
                                str13 = str2;
                                obj2 = obj;
                                str6 = str;
                                decimalFormat2 = decimalFormat;
                                bigDecimal2 = bigDecimal;
                                r4 = 0;
                            } catch (NumberFormatException unused8) {
                                str = str6;
                                decimalFormat = decimalFormat2;
                                bigDecimal = bigDecimal2;
                            }
                        } catch (EmptyStackException unused9) {
                            str = str6;
                        }
                    } catch (NumberFormatException unused10) {
                        str = str6;
                        decimalFormat = decimalFormat2;
                        bigDecimal = bigDecimal2;
                        obj = obj2;
                    } catch (EmptyStackException unused11) {
                        str = str6;
                        decimalFormat = decimalFormat2;
                        bigDecimal = bigDecimal2;
                        obj = obj2;
                    }
                } catch (NumberFormatException unused12) {
                    str = str6;
                    decimalFormat = decimalFormat2;
                    bigDecimal = bigDecimal2;
                    obj = obj2;
                    str2 = str13;
                } catch (EmptyStackException unused13) {
                    str = str6;
                    decimalFormat = decimalFormat2;
                    bigDecimal = bigDecimal2;
                    obj = obj2;
                    str2 = str13;
                }
            }
        }
        this.P.h();
    }

    public void ckmemory(View view) {
        com.gp7.easycalculator.c cVar;
        Long lValueOf;
        SQLiteDatabase sQLiteDatabase;
        String str;
        if (this.o0.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.r0.vibrate(20L);
            }
        }
        CheckBox checkBox = (CheckBox) view;
        this.F = checkBox;
        long jLongValue = ((Long) ((View) checkBox.getParent().getParent()).getTag()).longValue();
        if (this.F.isChecked()) {
            this.F.setBackground(getDrawable(R.drawable.ic_pin_test_ck));
            cVar = this.e0;
            lValueOf = Long.valueOf(jLongValue);
            sQLiteDatabase = this.d0;
            str = "Y";
        } else {
            this.F.setBackground(getDrawable(R.drawable.ic_pin_test));
            cVar = this.e0;
            lValueOf = Long.valueOf(jLongValue);
            sQLiteDatabase = this.d0;
            str = "N";
        }
        cVar.l(lValueOf, str, sQLiteDatabase);
    }

    public void deleteall(View view) {
        if (this.o0.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.r0.vibrate(20L);
            }
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.memoria);
        if (viewGroup.getChildCount() > 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage(getResources().getString(R.string.DeleteAllMemory));
            builder.setTitle(getResources().getString(R.string.AlertTitle));
            builder.setCancelable(false);
            builder.setPositiveButton(getResources().getString(R.string.AlertSI), new q0(viewGroup));
            builder.setNegativeButton(getResources().getString(R.string.AlertNO), new s0());
            builder.create().show();
        }
    }

    public void deleteitemsaved(View view) {
        long jLongValue = ((Long) ((View) view.getParent().getParent()).getTag()).longValue();
        CheckBox checkBox = (CheckBox) ((LinearLayout) ((LinearLayout) view.getParent().getParent()).getChildAt(0)).getChildAt(1);
        this.F = checkBox;
        if (checkBox.isChecked()) {
            Toast.makeText(this, getResources().getString(R.string.calcoloprotetto), 1).show();
        } else {
            ((ViewGroup) findViewById(R.id.memoria)).removeView((View) view.getParent().getParent());
            SQLiteDatabase readableDatabase = this.e0.getReadableDatabase();
            this.d0 = readableDatabase;
            this.e0.f(jLongValue, readableDatabase);
        }
        if (this.o0.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.r0.vibrate(20L);
            }
        }
    }

    public void filterMemory(View view) {
        for (int r02 = 0; r02 < this.b0.getChildCount(); r02++) {
            LinearLayout linearLayout = (LinearLayout) this.b0.getChildAt(r02);
            if (((CheckBox) ((LinearLayout) linearLayout.getChildAt(0)).getChildAt(1)).isChecked()) {
                this.O0 = "no";
            } else {
                linearLayout.setVisibility(8);
                this.N0 = "SI";
            }
        }
        if (this.N0.equals("SI")) {
            this.G.setVisibility(0);
        }
        if (this.O0.equals("si")) {
            Toast.makeText(this, getResources().getString(R.string.nocalcoliprotetti), 1).show();
        }
        if (this.o0.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.r0.vibrate(20L);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (P0 + 2500 > System.currentTimeMillis()) {
            this.e0.close();
            super.onBackPressed();
        } else {
            Toast.makeText(this, getResources().getString(R.string.doubleclick), 0).show();
            P0 = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x09ad  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x09c1  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x09d5  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x09de  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x09e8  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x09f2  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x09fc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0a00  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0a03  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0a06  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0a09  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0a0c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0a0f  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0a12  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0a15  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0a3b  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0c07  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0c11  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0c3e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0d91  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0db1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04d6  */
    @Override // androidx.appcompat.app.e, androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.j, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onCreate(android.os.Bundle r59) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 4208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.MainActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dc  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onCreateOptionsMenu(android.view.Menu r15) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.MainActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    @Override // androidx.appcompat.app.e, androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.L.y1(this);
        this.W = (EditText) findViewById(R.id.displayup);
        this.X = (TextView) findViewById(R.id.displayresult);
        SharedPreferences.Editor editorEdit = getSharedPreferences(getString(R.string.pref_file), 0).edit();
        editorEdit.putString(getString(R.string.text_memorizzato_up), this.W.getText().toString());
        editorEdit.putString(getString(R.string.text_memorizzato_down), this.X.getText().toString());
        editorEdit.putString(getString(R.string.IsappinForeground), "no");
        editorEdit.apply();
        this.e0.close();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) throws Resources.NotFoundException {
        SharedPreferences.Editor editorEdit = getSharedPreferences(getString(R.string.pref_file), 0).edit();
        SharedPreferences.Editor editorEdit2 = getSharedPreferences("apprater", 0).edit();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        String string = getResources().getString(R.string.risp1);
        String string2 = getResources().getString(R.string.risp2);
        String string3 = getResources().getString(R.string.risp3);
        String string4 = getResources().getString(R.string.risp4);
        String string5 = getResources().getString(R.string.risp5);
        String string6 = getResources().getString(R.string.risp7);
        arrayList2.add(string);
        arrayList3.add(string2);
        arrayList4.add(string3);
        arrayList5.add(string4);
        arrayList6.add(string5);
        arrayList7.add(string6);
        for (String str : getResources().getStringArray(R.array.domandeMain)) {
            arrayList.add(str);
        }
        HashMap map = new HashMap();
        map.put(arrayList.get(0), arrayList2);
        map.put(arrayList.get(1), arrayList3);
        map.put(arrayList.get(2), arrayList4);
        map.put(arrayList.get(3), arrayList5);
        map.put(arrayList.get(4), arrayList6);
        map.put(arrayList.get(5), arrayList7);
        com.gp7.easycalculator.z zVar = new com.gp7.easycalculator.z(this, arrayList, map);
        switch (menuItem.getItemId()) {
            case R.id.CLASSIC /* 2131296268 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "classic");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Classic", 0).show();
                finish();
                startActivity(new Intent(this, (Class<?>) MainActivity.class));
                return true;
            case R.id.ELEGANT /* 2131296298 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "elegant");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Elegant", 0).show();
                finish();
                startActivity(new Intent(this, (Class<?>) MainActivity.class));
                return true;
            case R.id.Exit /* 2131296305 */:
                this.e0.close();
                finish();
                return true;
            case R.id.IVA /* 2131296319 */:
                this.W = (EditText) findViewById(R.id.displayup);
                this.X = (TextView) findViewById(R.id.displayresult);
                editorEdit.putString(getString(R.string.text_memorizzato_up), this.W.getText().toString());
                editorEdit.putString(getString(R.string.text_memorizzato_down), this.X.getText().toString());
                editorEdit.apply();
                startActivity(new Intent(this, (Class<?>) CalcoloIVA.class));
                finish();
                try {
                    if (this.M != null && this.M.f()) {
                        this.M.o();
                    }
                } catch (NullPointerException e2) {
                    e2.printStackTrace();
                }
                return true;
            case R.id.LIGHT /* 2131296325 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "light");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Light", 0).show();
                finish();
                startActivity(new Intent(this, (Class<?>) MainActivity.class));
                return true;
            case R.id.MINIMAL /* 2131296334 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "minimal");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Minimal", 0).show();
                finish();
                startActivity(new Intent(this, (Class<?>) MainActivity.class));
                return true;
            case R.id.NEON /* 2131296340 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "neon");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Dark", 0).show();
                finish();
                startActivity(new Intent(this, (Class<?>) MainActivity.class));
                return true;
            case R.id.STAR /* 2131296357 */:
                com.gp7.easycalculator.a.b(this, editorEdit2, menuItem, this.n0);
                menuItem.setVisible(false);
                return true;
            case R.id.Setting /* 2131296370 */:
                this.W = (EditText) findViewById(R.id.displayup);
                this.X = (TextView) findViewById(R.id.displayresult);
                editorEdit.putString(getString(R.string.text_memorizzato_up), this.W.getText().toString());
                editorEdit.putString(getString(R.string.text_memorizzato_down), this.X.getText().toString());
                editorEdit.apply();
                startActivity(new Intent(this, (Class<?>) Setting.class));
                return true;
            case R.id.Sharami /* 2131296376 */:
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", getResources().getString(R.string.downloadApp) + "https://play.google.com/store/apps/details?id=" + com.gp7.easycalculator.b.f7045b);
                intent.setType("text/plain");
                startActivity(intent);
                return true;
            case R.id.aiutomenu /* 2131296452 */:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.exp_faq, (ViewGroup) null);
                ExpandableListView expandableListView = (ExpandableListView) viewInflate.findViewById(R.id.listFAQ);
                this.K0 = expandableListView;
                expandableListView.setAdapter(zVar);
                builder.setTitle(getResources().getString(R.string.FaqTitle));
                builder.setView(viewInflate);
                builder.setCancelable(false);
                builder.setPositiveButton(getResources().getString(R.string.CloseFaq), new k());
                builder.create().show();
                return true;
            case R.id.gift /* 2131296604 */:
                AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
                if (this.D.b(this.c0).equals("si")) {
                    if (!this.E.equals("UNKNOWN")) {
                        this.L.u1("ca-app-pub-8629550575650531/5370466120", new e.a().d(AdMobAdapter.class, this.V).f());
                    }
                    builder2.setTitle(getResources().getString(R.string.title_activity_settings));
                    builder2.setMessage(getResources().getString(R.string.message_video_premio));
                    builder2.setNegativeButton(getResources().getString(R.string.no_grazie), new v());
                    builder2.setPositiveButton(getResources().getString(R.string.testo_bottone_tutorial), new g0());
                    builder2.create().show();
                }
                return true;
            case R.id.gotoConverterfromcalc /* 2131296608 */:
                this.W = (EditText) findViewById(R.id.displayup);
                this.X = (TextView) findViewById(R.id.displayresult);
                editorEdit.putString(getString(R.string.text_memorizzato_up), this.W.getText().toString());
                editorEdit.putString(getString(R.string.text_memorizzato_down), this.X.getText().toString());
                editorEdit.apply();
                startActivity(new Intent(this, (Class<?>) Convertitore.class));
                finish();
                try {
                    if (this.M != null && this.M.f()) {
                        this.M.o();
                    }
                } catch (NullPointerException e3) {
                    e3.printStackTrace();
                }
                return true;
            case R.id.gotoScontofromcalc /* 2131296610 */:
                this.W = (EditText) findViewById(R.id.displayup);
                this.X = (TextView) findViewById(R.id.displayresult);
                editorEdit.putString(getString(R.string.text_memorizzato_up), this.W.getText().toString());
                editorEdit.putString(getString(R.string.text_memorizzato_down), this.X.getText().toString());
                editorEdit.apply();
                startActivity(new Intent(this, (Class<?>) Sconto.class));
                finish();
                try {
                    if (this.M != null && this.M.f()) {
                        this.M.o();
                    }
                } catch (NullPointerException e4) {
                    e4.printStackTrace();
                }
                return true;
            case R.id.gotoSpesafromcalc /* 2131296611 */:
                this.W = (EditText) findViewById(R.id.displayup);
                this.X = (TextView) findViewById(R.id.displayresult);
                editorEdit.putString(getString(R.string.text_memorizzato_up), this.W.getText().toString());
                editorEdit.putString(getString(R.string.text_memorizzato_down), this.X.getText().toString());
                editorEdit.apply();
                startActivity(new Intent(this, (Class<?>) Spesa.class));
                finish();
                try {
                    if (this.M != null && this.M.f()) {
                        this.M.o();
                    }
                } catch (NullPointerException e5) {
                    e5.printStackTrace();
                }
                return true;
            case R.id.gotoTipfromcalc /* 2131296616 */:
                this.W = (EditText) findViewById(R.id.displayup);
                this.X = (TextView) findViewById(R.id.displayresult);
                editorEdit.putString(getString(R.string.text_memorizzato_up), this.W.getText().toString());
                editorEdit.putString(getString(R.string.text_memorizzato_down), this.X.getText().toString());
                editorEdit.apply();
                startActivity(new Intent(this, (Class<?>) TipCalculator.class));
                finish();
                try {
                    if (this.M != null && this.M.f()) {
                        this.M.o();
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
        super.onPause();
        this.L.D1(this);
        SharedPreferences.Editor editorEdit = getSharedPreferences(getString(R.string.pref_file), 0).edit();
        editorEdit.putString(getString(R.string.IsappinForeground), "no");
        editorEdit.apply();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        SharedPreferences.Editor editorEdit = getSharedPreferences(getString(R.string.pref_file), 0).edit();
        editorEdit.putString(getString(R.string.IsappinForeground), "si");
        editorEdit.apply();
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    public void onResume() {
        super.onResume();
        this.L.w1(this);
        Locale.setDefault(Locale.US);
        SharedPreferences sharedPreferences = getSharedPreferences(getString(R.string.pref_file), 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(getString(R.string.IsappinForeground), "si");
        editorEdit.apply();
        this.o0 = sharedPreferences.getString(getString(R.string.vibrazione_memorizzata), "no");
        this.p0 = sharedPreferences.getString(getString(R.string.ScreenONoption_memorizzata), "no");
        this.z0 = sharedPreferences.getString(getString(R.string.rember_option), "no");
        this.y0 = sharedPreferences.getString(getString(R.string.operator_color), "si");
        this.t0 = sharedPreferences.getString(getString(R.string.notazione_scelta), "Default");
        this.F0 = sharedPreferences.getString(getString(R.string.stile_option), "si");
        try {
            if (sharedPreferences.getString(getString(R.string.rad_grad), "deg").equals("rad")) {
                this.A0.setText("Rad");
                this.x0 = "rad";
            } else {
                this.A0.setText("Deg");
                this.x0 = "deg";
            }
        } catch (NullPointerException unused) {
        }
        if (this.p0.equals("no")) {
            getWindow().clearFlags(128);
        }
        if (this.p0.equals("si")) {
            getWindow().addFlags(128);
        }
        try {
            this.W = (EditText) findViewById(R.id.displayup);
            if (this.y0.equals("si")) {
                d0(this.W);
            }
        } catch (NullPointerException unused2) {
        }
        Button button = (Button) findViewById(R.id.punto);
        if (this.t0.equals("Italiana")) {
            button.setText(",");
        } else {
            button.setText(".");
        }
        if (this.g0.getDisplayedChild() == 1 && sharedPreferences.getString(getString(R.string.calcolovolanteEseguito), "no").equals("si")) {
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
                    this.w0 = decimalFormat.format(new BigDecimal(string.replaceAll(",", "")));
                } else {
                    this.w0 = "9,999,999,999";
                    Toast.makeText(this, getResources().getString(R.string.overflow_result), 1).show();
                }
                if (this.t0.equals("Francese")) {
                    this.i0.setText(this.w0.replaceAll("[,]", " "));
                    this.J.H(this.i0, this.j0, this.l0, this.k0, this.w0, this.h0, decimalFormat, this.m0, getBaseContext());
                } else if (this.t0.equals("Italiana")) {
                    this.i0.setText(this.w0.replaceAll("[.]", "v").replaceAll("[,]", ".").replaceAll("[v]", ","));
                    this.J.I(this.i0, this.j0, this.l0, this.k0, this.w0, this.h0, decimalFormat, this.m0, getBaseContext());
                } else {
                    this.i0.setText(this.w0);
                    this.J.G(this.i0, this.j0, this.l0, this.k0, this.w0, this.h0, decimalFormat, this.m0, getBaseContext());
                }
                this.J.q0(this.i0, this.j0, this.l0, this.k0, getBaseContext());
            } catch (NumberFormatException | EmptyStackException unused3) {
                Toast.makeText(this.c0, "error", 0).show();
            }
            editorEdit.putString(getString(R.string.calcolovolanteEseguito), "no");
            editorEdit.apply();
        }
    }

    @Override // androidx.appcompat.app.e, androidx.fragment.app.d, android.app.Activity
    protected void onStop() {
        super.onStop();
        SharedPreferences.Editor editorEdit = getSharedPreferences(getString(R.string.pref_file), 0).edit();
        editorEdit.putString(getString(R.string.IsappinForeground), "no");
        editorEdit.apply();
    }

    public void percentoMODE(View view) {
        if (this.g0.getDisplayedChild() == 1) {
            if (this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    this.r0.vibrate(20L);
                }
            }
            int id = view.getId();
            if (id == R.id.discount) {
                this.h0 = 2;
            } else {
                if (id != R.id.orprice) {
                    return;
                }
                this.h0 = 1;
            }
        }
    }

    public void shareitemsaved(View view) throws Resources.NotFoundException, IOException {
        if (this.o0.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.r0.vibrate(20L);
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019a A[Catch: EmptyStackException -> 0x02a2, NumberFormatException -> 0x02ac, TRY_ENTER, TryCatch #2 {NumberFormatException -> 0x02ac, EmptyStackException -> 0x02a2, blocks: (B:39:0x0129, B:42:0x0135, B:43:0x0147, B:48:0x018e, B:51:0x019a, B:52:0x01b5, B:54:0x01bf, B:55:0x01da, B:58:0x01fa, B:60:0x021a, B:61:0x0226, B:62:0x022e, B:63:0x0240, B:65:0x0246, B:68:0x0268, B:69:0x0277, B:70:0x027f, B:71:0x0294, B:44:0x014e, B:46:0x0158, B:47:0x0181), top: B:77:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b5 A[Catch: EmptyStackException -> 0x02a2, NumberFormatException -> 0x02ac, TryCatch #2 {NumberFormatException -> 0x02ac, EmptyStackException -> 0x02a2, blocks: (B:39:0x0129, B:42:0x0135, B:43:0x0147, B:48:0x018e, B:51:0x019a, B:52:0x01b5, B:54:0x01bf, B:55:0x01da, B:58:0x01fa, B:60:0x021a, B:61:0x0226, B:62:0x022e, B:63:0x0240, B:65:0x0246, B:68:0x0268, B:69:0x0277, B:70:0x027f, B:71:0x0294, B:44:0x014e, B:46:0x0158, B:47:0x0181), top: B:77:0x0129 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void switchradgrad(android.view.View r11) {
        /*
            Method dump skipped, instructions count: 705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.MainActivity.switchradgrad(android.view.View):void");
    }

    public void undofilterMemory(View view) {
        if (this.G.getVisibility() != 8) {
            if (this.o0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    this.r0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    this.r0.vibrate(20L);
                }
            }
            for (int r2 = 0; r2 < this.b0.getChildCount(); r2++) {
                LinearLayout linearLayout = (LinearLayout) this.b0.getChildAt(r2);
                if (!((CheckBox) ((LinearLayout) linearLayout.getChildAt(0)).getChildAt(1)).isChecked()) {
                    linearLayout.setVisibility(0);
                    this.N0 = "NO";
                    this.O0 = "si";
                    this.G.setVisibility(8);
                }
            }
        }
    }
}

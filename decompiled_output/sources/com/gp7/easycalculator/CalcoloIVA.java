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
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
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
public class CalcoloIVA extends androidx.appcompat.app.e {
    private static long x0;
    CheckBox C;
    ImageButton D;
    private com.google.android.gms.ads.k0.c I;
    private FirebaseAnalytics J;
    private com.google.android.gms.ads.l K;
    String L;
    AdView M;
    String N;
    String O;
    Vibrator P;
    String Q;
    String R;
    String S;
    ViewFlipper T;
    String U;
    String V;
    String Y;
    String Z;
    ExpandableListView a0;
    String b0;
    int c0;
    int d0;
    int e0;
    String f0;
    String g0;
    LinearLayout h0;
    SQLiteDatabase i0;
    com.gp7.easycalculator.c j0;
    Cursor k0;
    private DrawerLayout m0;
    String n0;
    MenuItem o0;
    RadioButton p0;
    RadioButton q0;
    com.gp7.easycalculator.w s0;
    Bundle u0;
    com.gp7.easycalculator.v E = new com.gp7.easycalculator.v();
    String F = "false";
    com.gp7.easycalculator.x G = new com.gp7.easycalculator.x();
    int H = 1;
    int W = 1;
    int X = 1;
    Context l0 = this;
    com.gp7.easycalculator.u r0 = new com.gp7.easycalculator.u();
    b0 t0 = new b0();
    String v0 = "NO";
    String w0 = "si";

    class a implements View.OnClickListener {
        final /* synthetic */ RadioButton d;
        final /* synthetic */ RadioButton e;
        final /* synthetic */ TextView f;
        final /* synthetic */ TextView g;
        final /* synthetic */ DecimalFormat h;
        final /* synthetic */ RadioButton i;
        final /* synthetic */ RadioButton j;
        final /* synthetic */ TextView k;
        final /* synthetic */ TextView l;

        a(RadioButton radioButton, RadioButton radioButton2, TextView textView, TextView textView2, DecimalFormat decimalFormat, RadioButton radioButton3, RadioButton radioButton4, TextView textView3, TextView textView4) {
            this.d = radioButton;
            this.e = radioButton2;
            this.f = textView;
            this.g = textView2;
            this.h = decimalFormat;
            this.i = radioButton3;
            this.j = radioButton4;
            this.k = textView3;
            this.l = textView4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.u uVar;
            RadioButton radioButton;
            RadioButton radioButton2;
            TextView textView;
            TextView textView2;
            CalcoloIVA calcoloIVA;
            try {
                if (CalcoloIVA.this.T.getDisplayedChild() == 0) {
                    if (CalcoloIVA.this.n0.equals("Francese")) {
                        CalcoloIVA.this.r0.j(this.d, this.e, this.f, this.g, "0", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else if (CalcoloIVA.this.n0.equals("Italiana")) {
                        CalcoloIVA.this.r0.n(this.d, this.e, this.f, this.g, "0", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else {
                        CalcoloIVA.this.r0.i(this.d, this.e, this.f, this.g, "0", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    }
                    uVar = CalcoloIVA.this.r0;
                    radioButton = this.d;
                    radioButton2 = this.e;
                    textView = this.f;
                    textView2 = this.g;
                    calcoloIVA = CalcoloIVA.this;
                } else {
                    if (CalcoloIVA.this.n0.equals("Francese")) {
                        CalcoloIVA.this.r0.s(this.i, this.j, this.k, this.l, "0", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else if (CalcoloIVA.this.n0.equals("Italiana")) {
                        CalcoloIVA.this.r0.w(this.i, this.j, this.k, this.l, "0", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else {
                        CalcoloIVA.this.r0.r(this.i, this.j, this.k, this.l, "0", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    }
                    uVar = CalcoloIVA.this.r0;
                    radioButton = this.i;
                    radioButton2 = this.j;
                    textView = this.k;
                    textView2 = this.l;
                    calcoloIVA = CalcoloIVA.this;
                }
                uVar.q0(radioButton, radioButton2, textView, textView2, calcoloIVA.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(CalcoloIVA.this.l0, "error", 0).show();
            }
            if (CalcoloIVA.this.N.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcoloIVA.this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcoloIVA.this.P.vibrate(20L);
                }
            }
        }
    }

    class b implements View.OnClickListener {
        final /* synthetic */ RadioButton d;
        final /* synthetic */ RadioButton e;
        final /* synthetic */ TextView f;
        final /* synthetic */ TextView g;
        final /* synthetic */ DecimalFormat h;
        final /* synthetic */ RadioButton i;
        final /* synthetic */ RadioButton j;
        final /* synthetic */ TextView k;
        final /* synthetic */ TextView l;

        b(RadioButton radioButton, RadioButton radioButton2, TextView textView, TextView textView2, DecimalFormat decimalFormat, RadioButton radioButton3, RadioButton radioButton4, TextView textView3, TextView textView4) {
            this.d = radioButton;
            this.e = radioButton2;
            this.f = textView;
            this.g = textView2;
            this.h = decimalFormat;
            this.i = radioButton3;
            this.j = radioButton4;
            this.k = textView3;
            this.l = textView4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.u uVar;
            RadioButton radioButton;
            RadioButton radioButton2;
            TextView textView;
            TextView textView2;
            CalcoloIVA calcoloIVA;
            try {
                if (CalcoloIVA.this.T.getDisplayedChild() == 0) {
                    if (CalcoloIVA.this.n0.equals("Francese")) {
                        CalcoloIVA.this.r0.j(this.d, this.e, this.f, this.g, "1", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else if (CalcoloIVA.this.n0.equals("Italiana")) {
                        CalcoloIVA.this.r0.n(this.d, this.e, this.f, this.g, "1", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else {
                        CalcoloIVA.this.r0.i(this.d, this.e, this.f, this.g, "1", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    }
                    uVar = CalcoloIVA.this.r0;
                    radioButton = this.d;
                    radioButton2 = this.e;
                    textView = this.f;
                    textView2 = this.g;
                    calcoloIVA = CalcoloIVA.this;
                } else {
                    if (CalcoloIVA.this.n0.equals("Francese")) {
                        CalcoloIVA.this.r0.s(this.i, this.j, this.k, this.l, "1", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else if (CalcoloIVA.this.n0.equals("Italiana")) {
                        CalcoloIVA.this.r0.w(this.i, this.j, this.k, this.l, "1", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else {
                        CalcoloIVA.this.r0.r(this.i, this.j, this.k, this.l, "1", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    }
                    uVar = CalcoloIVA.this.r0;
                    radioButton = this.i;
                    radioButton2 = this.j;
                    textView = this.k;
                    textView2 = this.l;
                    calcoloIVA = CalcoloIVA.this;
                }
                uVar.q0(radioButton, radioButton2, textView, textView2, calcoloIVA.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(CalcoloIVA.this.l0, "error", 0).show();
            }
            if (CalcoloIVA.this.N.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcoloIVA.this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcoloIVA.this.P.vibrate(20L);
                }
            }
        }
    }

    class c implements View.OnClickListener {
        final /* synthetic */ RadioButton d;
        final /* synthetic */ RadioButton e;
        final /* synthetic */ TextView f;
        final /* synthetic */ TextView g;
        final /* synthetic */ DecimalFormat h;
        final /* synthetic */ RadioButton i;
        final /* synthetic */ RadioButton j;
        final /* synthetic */ TextView k;
        final /* synthetic */ TextView l;

        c(RadioButton radioButton, RadioButton radioButton2, TextView textView, TextView textView2, DecimalFormat decimalFormat, RadioButton radioButton3, RadioButton radioButton4, TextView textView3, TextView textView4) {
            this.d = radioButton;
            this.e = radioButton2;
            this.f = textView;
            this.g = textView2;
            this.h = decimalFormat;
            this.i = radioButton3;
            this.j = radioButton4;
            this.k = textView3;
            this.l = textView4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.u uVar;
            RadioButton radioButton;
            RadioButton radioButton2;
            TextView textView;
            TextView textView2;
            CalcoloIVA calcoloIVA;
            try {
                if (CalcoloIVA.this.T.getDisplayedChild() == 0) {
                    if (CalcoloIVA.this.n0.equals("Francese")) {
                        CalcoloIVA.this.r0.j(this.d, this.e, this.f, this.g, "2", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else if (CalcoloIVA.this.n0.equals("Italiana")) {
                        CalcoloIVA.this.r0.n(this.d, this.e, this.f, this.g, "2", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else {
                        CalcoloIVA.this.r0.i(this.d, this.e, this.f, this.g, "2", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    }
                    uVar = CalcoloIVA.this.r0;
                    radioButton = this.d;
                    radioButton2 = this.e;
                    textView = this.f;
                    textView2 = this.g;
                    calcoloIVA = CalcoloIVA.this;
                } else {
                    if (CalcoloIVA.this.n0.equals("Francese")) {
                        CalcoloIVA.this.r0.s(this.i, this.j, this.k, this.l, "2", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else if (CalcoloIVA.this.n0.equals("Italiana")) {
                        CalcoloIVA.this.r0.w(this.i, this.j, this.k, this.l, "2", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else {
                        CalcoloIVA.this.r0.r(this.i, this.j, this.k, this.l, "2", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    }
                    uVar = CalcoloIVA.this.r0;
                    radioButton = this.i;
                    radioButton2 = this.j;
                    textView = this.k;
                    textView2 = this.l;
                    calcoloIVA = CalcoloIVA.this;
                }
                uVar.q0(radioButton, radioButton2, textView, textView2, calcoloIVA.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(CalcoloIVA.this.l0, "error", 0).show();
            }
            if (CalcoloIVA.this.N.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcoloIVA.this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcoloIVA.this.P.vibrate(20L);
                }
            }
        }
    }

    class d implements View.OnClickListener {
        final /* synthetic */ RadioButton d;
        final /* synthetic */ RadioButton e;
        final /* synthetic */ TextView f;
        final /* synthetic */ TextView g;
        final /* synthetic */ DecimalFormat h;
        final /* synthetic */ RadioButton i;
        final /* synthetic */ RadioButton j;
        final /* synthetic */ TextView k;
        final /* synthetic */ TextView l;

        d(RadioButton radioButton, RadioButton radioButton2, TextView textView, TextView textView2, DecimalFormat decimalFormat, RadioButton radioButton3, RadioButton radioButton4, TextView textView3, TextView textView4) {
            this.d = radioButton;
            this.e = radioButton2;
            this.f = textView;
            this.g = textView2;
            this.h = decimalFormat;
            this.i = radioButton3;
            this.j = radioButton4;
            this.k = textView3;
            this.l = textView4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.u uVar;
            RadioButton radioButton;
            RadioButton radioButton2;
            TextView textView;
            TextView textView2;
            CalcoloIVA calcoloIVA;
            try {
                if (CalcoloIVA.this.T.getDisplayedChild() == 0) {
                    if (CalcoloIVA.this.n0.equals("Francese")) {
                        CalcoloIVA.this.r0.j(this.d, this.e, this.f, this.g, "3", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else if (CalcoloIVA.this.n0.equals("Italiana")) {
                        CalcoloIVA.this.r0.n(this.d, this.e, this.f, this.g, "3", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else {
                        CalcoloIVA.this.r0.i(this.d, this.e, this.f, this.g, "3", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    }
                    uVar = CalcoloIVA.this.r0;
                    radioButton = this.d;
                    radioButton2 = this.e;
                    textView = this.f;
                    textView2 = this.g;
                    calcoloIVA = CalcoloIVA.this;
                } else {
                    if (CalcoloIVA.this.n0.equals("Francese")) {
                        CalcoloIVA.this.r0.s(this.i, this.j, this.k, this.l, "3", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else if (CalcoloIVA.this.n0.equals("Italiana")) {
                        CalcoloIVA.this.r0.w(this.i, this.j, this.k, this.l, "3", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else {
                        CalcoloIVA.this.r0.r(this.i, this.j, this.k, this.l, "3", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    }
                    uVar = CalcoloIVA.this.r0;
                    radioButton = this.i;
                    radioButton2 = this.j;
                    textView = this.k;
                    textView2 = this.l;
                    calcoloIVA = CalcoloIVA.this;
                }
                uVar.q0(radioButton, radioButton2, textView, textView2, calcoloIVA.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(CalcoloIVA.this.l0, "error", 0).show();
            }
            if (CalcoloIVA.this.N.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcoloIVA.this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcoloIVA.this.P.vibrate(20L);
                }
            }
        }
    }

    class e implements View.OnClickListener {
        final /* synthetic */ RadioButton d;
        final /* synthetic */ RadioButton e;
        final /* synthetic */ TextView f;
        final /* synthetic */ TextView g;
        final /* synthetic */ DecimalFormat h;
        final /* synthetic */ RadioButton i;
        final /* synthetic */ RadioButton j;
        final /* synthetic */ TextView k;
        final /* synthetic */ TextView l;

        e(RadioButton radioButton, RadioButton radioButton2, TextView textView, TextView textView2, DecimalFormat decimalFormat, RadioButton radioButton3, RadioButton radioButton4, TextView textView3, TextView textView4) {
            this.d = radioButton;
            this.e = radioButton2;
            this.f = textView;
            this.g = textView2;
            this.h = decimalFormat;
            this.i = radioButton3;
            this.j = radioButton4;
            this.k = textView3;
            this.l = textView4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.u uVar;
            RadioButton radioButton;
            RadioButton radioButton2;
            TextView textView;
            TextView textView2;
            CalcoloIVA calcoloIVA;
            try {
                if (CalcoloIVA.this.T.getDisplayedChild() == 0) {
                    if (CalcoloIVA.this.n0.equals("Francese")) {
                        CalcoloIVA.this.r0.j(this.d, this.e, this.f, this.g, "4", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else if (CalcoloIVA.this.n0.equals("Italiana")) {
                        CalcoloIVA.this.r0.n(this.d, this.e, this.f, this.g, "4", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else {
                        CalcoloIVA.this.r0.i(this.d, this.e, this.f, this.g, "4", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    }
                    uVar = CalcoloIVA.this.r0;
                    radioButton = this.d;
                    radioButton2 = this.e;
                    textView = this.f;
                    textView2 = this.g;
                    calcoloIVA = CalcoloIVA.this;
                } else {
                    if (CalcoloIVA.this.n0.equals("Francese")) {
                        CalcoloIVA.this.r0.s(this.i, this.j, this.k, this.l, "4", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else if (CalcoloIVA.this.n0.equals("Italiana")) {
                        CalcoloIVA.this.r0.w(this.i, this.j, this.k, this.l, "4", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else {
                        CalcoloIVA.this.r0.r(this.i, this.j, this.k, this.l, "4", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    }
                    uVar = CalcoloIVA.this.r0;
                    radioButton = this.i;
                    radioButton2 = this.j;
                    textView = this.k;
                    textView2 = this.l;
                    calcoloIVA = CalcoloIVA.this;
                }
                uVar.q0(radioButton, radioButton2, textView, textView2, calcoloIVA.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(CalcoloIVA.this.l0, "error", 0).show();
            }
            if (CalcoloIVA.this.N.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcoloIVA.this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcoloIVA.this.P.vibrate(20L);
                }
            }
        }
    }

    class f implements View.OnClickListener {
        final /* synthetic */ RadioButton d;
        final /* synthetic */ RadioButton e;
        final /* synthetic */ TextView f;
        final /* synthetic */ TextView g;
        final /* synthetic */ DecimalFormat h;
        final /* synthetic */ RadioButton i;
        final /* synthetic */ RadioButton j;
        final /* synthetic */ TextView k;
        final /* synthetic */ TextView l;

        f(RadioButton radioButton, RadioButton radioButton2, TextView textView, TextView textView2, DecimalFormat decimalFormat, RadioButton radioButton3, RadioButton radioButton4, TextView textView3, TextView textView4) {
            this.d = radioButton;
            this.e = radioButton2;
            this.f = textView;
            this.g = textView2;
            this.h = decimalFormat;
            this.i = radioButton3;
            this.j = radioButton4;
            this.k = textView3;
            this.l = textView4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.u uVar;
            RadioButton radioButton;
            RadioButton radioButton2;
            TextView textView;
            TextView textView2;
            CalcoloIVA calcoloIVA;
            try {
                if (CalcoloIVA.this.T.getDisplayedChild() == 0) {
                    if (CalcoloIVA.this.n0.equals("Francese")) {
                        CalcoloIVA.this.r0.j(this.d, this.e, this.f, this.g, "5", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else if (CalcoloIVA.this.n0.equals("Italiana")) {
                        CalcoloIVA.this.r0.n(this.d, this.e, this.f, this.g, "5", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else {
                        CalcoloIVA.this.r0.i(this.d, this.e, this.f, this.g, "5", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    }
                    uVar = CalcoloIVA.this.r0;
                    radioButton = this.d;
                    radioButton2 = this.e;
                    textView = this.f;
                    textView2 = this.g;
                    calcoloIVA = CalcoloIVA.this;
                } else {
                    if (CalcoloIVA.this.n0.equals("Francese")) {
                        CalcoloIVA.this.r0.s(this.i, this.j, this.k, this.l, "5", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else if (CalcoloIVA.this.n0.equals("Italiana")) {
                        CalcoloIVA.this.r0.w(this.i, this.j, this.k, this.l, "5", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else {
                        CalcoloIVA.this.r0.r(this.i, this.j, this.k, this.l, "5", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    }
                    uVar = CalcoloIVA.this.r0;
                    radioButton = this.i;
                    radioButton2 = this.j;
                    textView = this.k;
                    textView2 = this.l;
                    calcoloIVA = CalcoloIVA.this;
                }
                uVar.q0(radioButton, radioButton2, textView, textView2, calcoloIVA.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(CalcoloIVA.this.l0, "error", 0).show();
            }
            if (CalcoloIVA.this.N.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcoloIVA.this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcoloIVA.this.P.vibrate(20L);
                }
            }
        }
    }

    class g implements View.OnClickListener {
        final /* synthetic */ RadioButton d;
        final /* synthetic */ RadioButton e;
        final /* synthetic */ TextView f;
        final /* synthetic */ TextView g;
        final /* synthetic */ DecimalFormat h;
        final /* synthetic */ RadioButton i;
        final /* synthetic */ RadioButton j;
        final /* synthetic */ TextView k;
        final /* synthetic */ TextView l;

        g(RadioButton radioButton, RadioButton radioButton2, TextView textView, TextView textView2, DecimalFormat decimalFormat, RadioButton radioButton3, RadioButton radioButton4, TextView textView3, TextView textView4) {
            this.d = radioButton;
            this.e = radioButton2;
            this.f = textView;
            this.g = textView2;
            this.h = decimalFormat;
            this.i = radioButton3;
            this.j = radioButton4;
            this.k = textView3;
            this.l = textView4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.u uVar;
            RadioButton radioButton;
            RadioButton radioButton2;
            TextView textView;
            TextView textView2;
            CalcoloIVA calcoloIVA;
            try {
                if (CalcoloIVA.this.T.getDisplayedChild() == 0) {
                    if (CalcoloIVA.this.n0.equals("Francese")) {
                        CalcoloIVA.this.r0.j(this.d, this.e, this.f, this.g, "6", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else if (CalcoloIVA.this.n0.equals("Italiana")) {
                        CalcoloIVA.this.r0.n(this.d, this.e, this.f, this.g, "6", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else {
                        CalcoloIVA.this.r0.i(this.d, this.e, this.f, this.g, "6", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    }
                    uVar = CalcoloIVA.this.r0;
                    radioButton = this.d;
                    radioButton2 = this.e;
                    textView = this.f;
                    textView2 = this.g;
                    calcoloIVA = CalcoloIVA.this;
                } else {
                    if (CalcoloIVA.this.n0.equals("Francese")) {
                        CalcoloIVA.this.r0.s(this.i, this.j, this.k, this.l, "6", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else if (CalcoloIVA.this.n0.equals("Italiana")) {
                        CalcoloIVA.this.r0.w(this.i, this.j, this.k, this.l, "6", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else {
                        CalcoloIVA.this.r0.r(this.i, this.j, this.k, this.l, "6", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    }
                    uVar = CalcoloIVA.this.r0;
                    radioButton = this.i;
                    radioButton2 = this.j;
                    textView = this.k;
                    textView2 = this.l;
                    calcoloIVA = CalcoloIVA.this;
                }
                uVar.q0(radioButton, radioButton2, textView, textView2, calcoloIVA.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(CalcoloIVA.this.l0, "error", 0).show();
            }
            if (CalcoloIVA.this.N.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcoloIVA.this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcoloIVA.this.P.vibrate(20L);
                }
            }
        }
    }

    class h implements View.OnClickListener {
        final /* synthetic */ RadioButton d;
        final /* synthetic */ RadioButton e;
        final /* synthetic */ TextView f;
        final /* synthetic */ TextView g;
        final /* synthetic */ DecimalFormat h;
        final /* synthetic */ RadioButton i;
        final /* synthetic */ RadioButton j;
        final /* synthetic */ TextView k;
        final /* synthetic */ TextView l;

        h(RadioButton radioButton, RadioButton radioButton2, TextView textView, TextView textView2, DecimalFormat decimalFormat, RadioButton radioButton3, RadioButton radioButton4, TextView textView3, TextView textView4) {
            this.d = radioButton;
            this.e = radioButton2;
            this.f = textView;
            this.g = textView2;
            this.h = decimalFormat;
            this.i = radioButton3;
            this.j = radioButton4;
            this.k = textView3;
            this.l = textView4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.u uVar;
            RadioButton radioButton;
            RadioButton radioButton2;
            TextView textView;
            TextView textView2;
            CalcoloIVA calcoloIVA;
            try {
                if (CalcoloIVA.this.T.getDisplayedChild() == 0) {
                    if (CalcoloIVA.this.n0.equals("Francese")) {
                        CalcoloIVA.this.r0.j(this.d, this.e, this.f, this.g, "7", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else if (CalcoloIVA.this.n0.equals("Italiana")) {
                        CalcoloIVA.this.r0.n(this.d, this.e, this.f, this.g, "7", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else {
                        CalcoloIVA.this.r0.i(this.d, this.e, this.f, this.g, "7", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    }
                    uVar = CalcoloIVA.this.r0;
                    radioButton = this.d;
                    radioButton2 = this.e;
                    textView = this.f;
                    textView2 = this.g;
                    calcoloIVA = CalcoloIVA.this;
                } else {
                    if (CalcoloIVA.this.n0.equals("Francese")) {
                        CalcoloIVA.this.r0.s(this.i, this.j, this.k, this.l, "7", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else if (CalcoloIVA.this.n0.equals("Italiana")) {
                        CalcoloIVA.this.r0.w(this.i, this.j, this.k, this.l, "7", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else {
                        CalcoloIVA.this.r0.r(this.i, this.j, this.k, this.l, "7", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    }
                    uVar = CalcoloIVA.this.r0;
                    radioButton = this.i;
                    radioButton2 = this.j;
                    textView = this.k;
                    textView2 = this.l;
                    calcoloIVA = CalcoloIVA.this;
                }
                uVar.q0(radioButton, radioButton2, textView, textView2, calcoloIVA.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(CalcoloIVA.this.l0, "error", 0).show();
            }
            if (CalcoloIVA.this.N.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcoloIVA.this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcoloIVA.this.P.vibrate(20L);
                }
            }
        }
    }

    class i implements View.OnClickListener {
        final /* synthetic */ RadioButton d;
        final /* synthetic */ RadioButton e;
        final /* synthetic */ TextView f;
        final /* synthetic */ TextView g;
        final /* synthetic */ DecimalFormat h;
        final /* synthetic */ RadioButton i;
        final /* synthetic */ RadioButton j;
        final /* synthetic */ TextView k;
        final /* synthetic */ TextView l;

        i(RadioButton radioButton, RadioButton radioButton2, TextView textView, TextView textView2, DecimalFormat decimalFormat, RadioButton radioButton3, RadioButton radioButton4, TextView textView3, TextView textView4) {
            this.d = radioButton;
            this.e = radioButton2;
            this.f = textView;
            this.g = textView2;
            this.h = decimalFormat;
            this.i = radioButton3;
            this.j = radioButton4;
            this.k = textView3;
            this.l = textView4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.u uVar;
            RadioButton radioButton;
            RadioButton radioButton2;
            TextView textView;
            TextView textView2;
            CalcoloIVA calcoloIVA;
            try {
                if (CalcoloIVA.this.T.getDisplayedChild() == 0) {
                    if (CalcoloIVA.this.n0.equals("Francese")) {
                        CalcoloIVA.this.r0.j(this.d, this.e, this.f, this.g, "8", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else if (CalcoloIVA.this.n0.equals("Italiana")) {
                        CalcoloIVA.this.r0.n(this.d, this.e, this.f, this.g, "8", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else {
                        CalcoloIVA.this.r0.i(this.d, this.e, this.f, this.g, "8", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    }
                    uVar = CalcoloIVA.this.r0;
                    radioButton = this.d;
                    radioButton2 = this.e;
                    textView = this.f;
                    textView2 = this.g;
                    calcoloIVA = CalcoloIVA.this;
                } else {
                    if (CalcoloIVA.this.n0.equals("Francese")) {
                        CalcoloIVA.this.r0.s(this.i, this.j, this.k, this.l, "8", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else if (CalcoloIVA.this.n0.equals("Italiana")) {
                        CalcoloIVA.this.r0.w(this.i, this.j, this.k, this.l, "8", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else {
                        CalcoloIVA.this.r0.r(this.i, this.j, this.k, this.l, "8", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    }
                    uVar = CalcoloIVA.this.r0;
                    radioButton = this.i;
                    radioButton2 = this.j;
                    textView = this.k;
                    textView2 = this.l;
                    calcoloIVA = CalcoloIVA.this;
                }
                uVar.q0(radioButton, radioButton2, textView, textView2, calcoloIVA.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(CalcoloIVA.this.l0, "error", 0).show();
            }
            if (CalcoloIVA.this.N.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcoloIVA.this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcoloIVA.this.P.vibrate(20L);
                }
            }
        }
    }

    class j implements View.OnClickListener {
        final /* synthetic */ RadioButton d;
        final /* synthetic */ RadioButton e;
        final /* synthetic */ TextView f;
        final /* synthetic */ TextView g;
        final /* synthetic */ DecimalFormat h;
        final /* synthetic */ RadioButton i;
        final /* synthetic */ RadioButton j;
        final /* synthetic */ TextView k;
        final /* synthetic */ TextView l;

        j(RadioButton radioButton, RadioButton radioButton2, TextView textView, TextView textView2, DecimalFormat decimalFormat, RadioButton radioButton3, RadioButton radioButton4, TextView textView3, TextView textView4) {
            this.d = radioButton;
            this.e = radioButton2;
            this.f = textView;
            this.g = textView2;
            this.h = decimalFormat;
            this.i = radioButton3;
            this.j = radioButton4;
            this.k = textView3;
            this.l = textView4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.u uVar;
            RadioButton radioButton;
            RadioButton radioButton2;
            TextView textView;
            TextView textView2;
            CalcoloIVA calcoloIVA;
            try {
                if (CalcoloIVA.this.T.getDisplayedChild() == 0) {
                    if (CalcoloIVA.this.n0.equals("Francese")) {
                        CalcoloIVA.this.r0.j(this.d, this.e, this.f, this.g, "9", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else if (CalcoloIVA.this.n0.equals("Italiana")) {
                        CalcoloIVA.this.r0.n(this.d, this.e, this.f, this.g, "9", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else {
                        CalcoloIVA.this.r0.i(this.d, this.e, this.f, this.g, "9", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    }
                    uVar = CalcoloIVA.this.r0;
                    radioButton = this.d;
                    radioButton2 = this.e;
                    textView = this.f;
                    textView2 = this.g;
                    calcoloIVA = CalcoloIVA.this;
                } else {
                    if (CalcoloIVA.this.n0.equals("Francese")) {
                        CalcoloIVA.this.r0.s(this.i, this.j, this.k, this.l, "9", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else if (CalcoloIVA.this.n0.equals("Italiana")) {
                        CalcoloIVA.this.r0.w(this.i, this.j, this.k, this.l, "9", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else {
                        CalcoloIVA.this.r0.r(this.i, this.j, this.k, this.l, "9", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    }
                    uVar = CalcoloIVA.this.r0;
                    radioButton = this.i;
                    radioButton2 = this.j;
                    textView = this.k;
                    textView2 = this.l;
                    calcoloIVA = CalcoloIVA.this;
                }
                uVar.q0(radioButton, radioButton2, textView, textView2, calcoloIVA.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(CalcoloIVA.this.l0, "error", 0).show();
            }
            if (CalcoloIVA.this.N.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcoloIVA.this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcoloIVA.this.P.vibrate(20L);
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

    class l implements View.OnClickListener {
        final /* synthetic */ RadioButton d;
        final /* synthetic */ RadioButton e;
        final /* synthetic */ TextView f;
        final /* synthetic */ TextView g;
        final /* synthetic */ DecimalFormat h;
        final /* synthetic */ RadioButton i;
        final /* synthetic */ RadioButton j;
        final /* synthetic */ TextView k;
        final /* synthetic */ TextView l;

        l(RadioButton radioButton, RadioButton radioButton2, TextView textView, TextView textView2, DecimalFormat decimalFormat, RadioButton radioButton3, RadioButton radioButton4, TextView textView3, TextView textView4) {
            this.d = radioButton;
            this.e = radioButton2;
            this.f = textView;
            this.g = textView2;
            this.h = decimalFormat;
            this.i = radioButton3;
            this.j = radioButton4;
            this.k = textView3;
            this.l = textView4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.u uVar;
            RadioButton radioButton;
            RadioButton radioButton2;
            TextView textView;
            TextView textView2;
            CalcoloIVA calcoloIVA;
            try {
                if (CalcoloIVA.this.T.getDisplayedChild() == 0) {
                    if (CalcoloIVA.this.n0.equals("Francese")) {
                        CalcoloIVA.this.r0.j(this.d, this.e, this.f, this.g, ".", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else if (CalcoloIVA.this.n0.equals("Italiana")) {
                        CalcoloIVA.this.r0.n(this.d, this.e, this.f, this.g, ".", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else {
                        CalcoloIVA.this.r0.i(this.d, this.e, this.f, this.g, ".", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    }
                    uVar = CalcoloIVA.this.r0;
                    radioButton = this.d;
                    radioButton2 = this.e;
                    textView = this.f;
                    textView2 = this.g;
                    calcoloIVA = CalcoloIVA.this;
                } else {
                    if (CalcoloIVA.this.n0.equals("Francese")) {
                        CalcoloIVA.this.r0.s(this.i, this.j, this.k, this.l, ".", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else if (CalcoloIVA.this.n0.equals("Italiana")) {
                        CalcoloIVA.this.r0.w(this.i, this.j, this.k, this.l, ".", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else {
                        CalcoloIVA.this.r0.r(this.i, this.j, this.k, this.l, ".", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    }
                    uVar = CalcoloIVA.this.r0;
                    radioButton = this.i;
                    radioButton2 = this.j;
                    textView = this.k;
                    textView2 = this.l;
                    calcoloIVA = CalcoloIVA.this;
                }
                uVar.q0(radioButton, radioButton2, textView, textView2, calcoloIVA.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(CalcoloIVA.this.l0, "error", 0).show();
            }
            if (CalcoloIVA.this.N.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcoloIVA.this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcoloIVA.this.P.vibrate(20L);
                }
            }
        }
    }

    class m implements View.OnLongClickListener {
        final /* synthetic */ RadioButton d;
        final /* synthetic */ RadioButton e;
        final /* synthetic */ TextView f;
        final /* synthetic */ TextView g;
        final /* synthetic */ RadioButton h;
        final /* synthetic */ RadioButton i;
        final /* synthetic */ TextView j;
        final /* synthetic */ TextView k;

        m(RadioButton radioButton, RadioButton radioButton2, TextView textView, TextView textView2, RadioButton radioButton3, RadioButton radioButton4, TextView textView3, TextView textView4) {
            this.d = radioButton;
            this.e = radioButton2;
            this.f = textView;
            this.g = textView2;
            this.h = radioButton3;
            this.i = radioButton4;
            this.j = textView3;
            this.k = textView4;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            TextView textView;
            if (CalcoloIVA.this.T.getDisplayedChild() == 0) {
                (CalcoloIVA.this.W == 1 ? this.d : this.e).setText("");
                this.f.setText("");
                textView = this.g;
            } else {
                (CalcoloIVA.this.X == 1 ? this.h : this.i).setText("");
                this.j.setText("");
                textView = this.k;
            }
            textView.setText("");
            if (CalcoloIVA.this.N.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcoloIVA.this.P.vibrate(VibrationEffect.createOneShot(40L, -1));
                } else {
                    CalcoloIVA.this.P.vibrate(40L);
                }
            }
            return true;
        }
    }

    class n implements View.OnClickListener {
        final /* synthetic */ RadioButton d;
        final /* synthetic */ RadioButton e;
        final /* synthetic */ TextView f;
        final /* synthetic */ TextView g;
        final /* synthetic */ RadioButton h;
        final /* synthetic */ RadioButton i;
        final /* synthetic */ TextView j;
        final /* synthetic */ TextView k;

        n(RadioButton radioButton, RadioButton radioButton2, TextView textView, TextView textView2, RadioButton radioButton3, RadioButton radioButton4, TextView textView3, TextView textView4) {
            this.d = radioButton;
            this.e = radioButton2;
            this.f = textView;
            this.g = textView2;
            this.h = radioButton3;
            this.i = radioButton4;
            this.j = textView3;
            this.k = textView4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TextView textView;
            if (CalcoloIVA.this.T.getDisplayedChild() == 0) {
                this.d.setText("");
                this.e.setText("");
                this.f.setText("");
                textView = this.g;
            } else {
                this.h.setText("");
                this.i.setText("");
                this.j.setText("");
                textView = this.k;
            }
            textView.setText("");
            if (CalcoloIVA.this.N.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcoloIVA.this.P.vibrate(VibrationEffect.createOneShot(40L, -1));
                } else {
                    CalcoloIVA.this.P.vibrate(40L);
                }
            }
        }
    }

    class o implements View.OnClickListener {
        final /* synthetic */ RadioButton d;
        final /* synthetic */ RadioButton e;
        final /* synthetic */ TextView f;
        final /* synthetic */ TextView g;
        final /* synthetic */ DecimalFormat h;
        final /* synthetic */ RadioButton i;
        final /* synthetic */ RadioButton j;
        final /* synthetic */ TextView k;
        final /* synthetic */ TextView l;

        o(RadioButton radioButton, RadioButton radioButton2, TextView textView, TextView textView2, DecimalFormat decimalFormat, RadioButton radioButton3, RadioButton radioButton4, TextView textView3, TextView textView4) {
            this.d = radioButton;
            this.e = radioButton2;
            this.f = textView;
            this.g = textView2;
            this.h = decimalFormat;
            this.i = radioButton3;
            this.j = radioButton4;
            this.k = textView3;
            this.l = textView4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.u uVar;
            RadioButton radioButton;
            RadioButton radioButton2;
            TextView textView;
            TextView textView2;
            CalcoloIVA calcoloIVA;
            try {
                if (CalcoloIVA.this.T.getDisplayedChild() == 0) {
                    if (CalcoloIVA.this.n0.equals("Francese")) {
                        CalcoloIVA.this.r0.j(this.d, this.e, this.f, this.g, "canc", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else if (CalcoloIVA.this.n0.equals("Italiana")) {
                        CalcoloIVA.this.r0.n(this.d, this.e, this.f, this.g, "canc", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else {
                        CalcoloIVA.this.r0.i(this.d, this.e, this.f, this.g, "canc", CalcoloIVA.this.W, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    }
                    uVar = CalcoloIVA.this.r0;
                    radioButton = this.d;
                    radioButton2 = this.e;
                    textView = this.f;
                    textView2 = this.g;
                    calcoloIVA = CalcoloIVA.this;
                } else {
                    if (CalcoloIVA.this.n0.equals("Francese")) {
                        CalcoloIVA.this.r0.s(this.i, this.j, this.k, this.l, "canc", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else if (CalcoloIVA.this.n0.equals("Italiana")) {
                        CalcoloIVA.this.r0.w(this.i, this.j, this.k, this.l, "canc", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else {
                        CalcoloIVA.this.r0.r(this.i, this.j, this.k, this.l, "canc", CalcoloIVA.this.X, this.h, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    }
                    uVar = CalcoloIVA.this.r0;
                    radioButton = this.i;
                    radioButton2 = this.j;
                    textView = this.k;
                    textView2 = this.l;
                    calcoloIVA = CalcoloIVA.this;
                }
                uVar.q0(radioButton, radioButton2, textView, textView2, calcoloIVA.getBaseContext());
            } catch (NumberFormatException unused) {
                Toast.makeText(CalcoloIVA.this.l0, "error", 0).show();
            }
            if (CalcoloIVA.this.N.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcoloIVA.this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcoloIVA.this.P.vibrate(20L);
                }
            }
        }
    }

    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CalcoloIVA.this.startActivity(CalcoloIVA.this.T.getDisplayedChild() == 0 ? new Intent(CalcoloIVA.this, (Class<?>) CalcolatriceVolante.class) : new Intent(CalcoloIVA.this, (Class<?>) CalcolatriceVolante.class));
            if (CalcoloIVA.this.N.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcoloIVA.this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcoloIVA.this.P.vibrate(20L);
                }
            }
        }
    }

    class q implements DialogInterface.OnClickListener {
        final /* synthetic */ ViewGroup d;

        q(ViewGroup viewGroup) {
            this.d = viewGroup;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r8) {
            if (CalcoloIVA.this.D.getVisibility() != 8) {
                CalcoloIVA.this.D.setVisibility(8);
                CalcoloIVA.this.v0 = "NO";
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
                CalcoloIVA.this.j0.e(((Long) arrayList.get(r0)).longValue(), CalcoloIVA.this.i0);
                ViewGroup viewGroup = this.d;
                viewGroup.removeView(viewGroup.findViewWithTag(arrayList.get(r0)));
            }
        }
    }

    class r implements DialogInterface.OnClickListener {
        r() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r2) {
            dialogInterface.cancel();
        }
    }

    class s implements DialogInterface.OnClickListener {
        s() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r2) {
            CalcoloIVA.this.o0.setVisible(false);
        }
    }

    class t implements DialogInterface.OnClickListener {
        t() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r4) {
            if (!CalcoloIVA.this.I.W()) {
                Toast.makeText(CalcoloIVA.this.getBaseContext(), CalcoloIVA.this.getResources().getString(R.string.video_non_disponibile), 0).show();
            } else {
                CalcoloIVA.this.I.y();
                CalcoloIVA.this.o0.setVisible(false);
            }
        }
    }

    class u implements com.google.android.gms.ads.k0.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SharedPreferences.Editor f7005a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinearLayout.LayoutParams f7006b;

        u(SharedPreferences.Editor editor, LinearLayout.LayoutParams layoutParams) {
            this.f7005a = editor;
            this.f7006b = layoutParams;
        }

        @Override // com.google.android.gms.ads.k0.d
        public void a1(int r1) {
        }

        @Override // com.google.android.gms.ads.k0.d
        public void h1() {
            CalcoloIVA.this.I.u1("ca-app-pub-8629550575650531/4934517701", new e.a().d(AdMobAdapter.class, CalcoloIVA.this.u0).f());
            this.f7005a.putLong("data_gift_rifiutato", System.currentTimeMillis());
            this.f7005a.apply();
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
            Toast toastMakeText = Toast.makeText(CalcoloIVA.this.getBaseContext(), CalcoloIVA.this.getResources().getString(R.string.premioPRO), 1);
            toastMakeText.setGravity(48, 0, 0);
            toastMakeText.show();
            this.f7005a.putLong("data_gift_vinto", System.currentTimeMillis());
            this.f7005a.apply();
            CalcoloIVA.this.M.setVisibility(8);
            CalcoloIVA.this.T.setLayoutParams(this.f7006b);
        }
    }

    class v implements View.OnClickListener {
        final /* synthetic */ SharedPreferences d;
        final /* synthetic */ Button e;
        final /* synthetic */ SharedPreferences.Editor f;
        final /* synthetic */ RadioButton g;
        final /* synthetic */ RadioButton h;
        final /* synthetic */ TextView i;
        final /* synthetic */ TextView j;
        final /* synthetic */ DecimalFormat k;
        final /* synthetic */ RadioButton l;
        final /* synthetic */ RadioButton m;
        final /* synthetic */ TextView n;
        final /* synthetic */ TextView o;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int r4) {
                v vVar = v.this;
                vVar.f.putString(CalcoloIVA.this.getResources().getString(R.string.Tutorial_iva_percetuale), "no");
                v.this.f.apply();
                dialogInterface.cancel();
            }
        }

        v(SharedPreferences sharedPreferences, Button button, SharedPreferences.Editor editor, RadioButton radioButton, RadioButton radioButton2, TextView textView, TextView textView2, DecimalFormat decimalFormat, RadioButton radioButton3, RadioButton radioButton4, TextView textView3, TextView textView4) {
            this.d = sharedPreferences;
            this.e = button;
            this.f = editor;
            this.g = radioButton;
            this.h = radioButton2;
            this.i = textView;
            this.j = textView2;
            this.k = decimalFormat;
            this.l = radioButton3;
            this.m = radioButton4;
            this.n = textView3;
            this.o = textView4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.u uVar;
            RadioButton radioButton;
            RadioButton radioButton2;
            TextView textView;
            TextView textView2;
            CalcoloIVA calcoloIVA;
            if (CalcoloIVA.this.N.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcoloIVA.this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcoloIVA.this.P.vibrate(20L);
                }
            }
            CalcoloIVA calcoloIVA2 = CalcoloIVA.this;
            calcoloIVA2.L = this.d.getString(calcoloIVA2.getString(R.string.Tutorial_iva_percetuale), "si");
            if (this.e.getText().toString().equals("...%") && CalcoloIVA.this.L.equals("si")) {
                AlertDialog.Builder builder = new AlertDialog.Builder(CalcoloIVA.this);
                builder.setMessage(CalcoloIVA.this.getResources().getString(R.string.Suggerimento_calcolo_iva_messaggio));
                builder.setTitle(CalcoloIVA.this.getResources().getString(R.string.Suggerimento_calcolo_iva));
                builder.setCancelable(false);
                builder.setPositiveButton(CalcoloIVA.this.getResources().getString(R.string.testo_bottone_tutorial), new a());
                builder.create().show();
                return;
            }
            try {
                if (this.e.getText().toString().equals("...%")) {
                    return;
                }
                if (CalcoloIVA.this.T.getDisplayedChild() == 0) {
                    if (CalcoloIVA.this.n0.equals("Francese")) {
                        CalcoloIVA.this.r0.p(this.g, this.h, this.i, this.j, this.e.getText().toString().substring(0, this.e.getText().toString().length() - 2), CalcoloIVA.this.W, this.k, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else if (CalcoloIVA.this.n0.equals("Italiana")) {
                        CalcoloIVA.this.r0.q(this.g, this.h, this.i, this.j, this.e.getText().toString().substring(0, this.e.getText().toString().length() - 2), CalcoloIVA.this.W, this.k, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else {
                        CalcoloIVA.this.r0.o(this.g, this.h, this.i, this.j, this.e.getText().toString().substring(0, this.e.getText().toString().length() - 2), CalcoloIVA.this.W, this.k, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    }
                    uVar = CalcoloIVA.this.r0;
                    radioButton = this.g;
                    radioButton2 = this.h;
                    textView = this.i;
                    textView2 = this.j;
                    calcoloIVA = CalcoloIVA.this;
                } else {
                    if (CalcoloIVA.this.n0.equals("Francese")) {
                        CalcoloIVA.this.r0.y(this.l, this.m, this.n, this.o, this.e.getText().toString().substring(0, this.e.getText().toString().length() - 2), CalcoloIVA.this.X, this.k, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else if (CalcoloIVA.this.n0.equals("Italiana")) {
                        CalcoloIVA.this.r0.A(this.l, this.m, this.n, this.o, this.e.getText().toString().substring(0, this.e.getText().toString().length() - 2), CalcoloIVA.this.X, this.k, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else {
                        CalcoloIVA.this.r0.x(this.l, this.m, this.n, this.o, this.e.getText().toString().substring(0, this.e.getText().toString().length() - 2), CalcoloIVA.this.X, this.k, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    }
                    uVar = CalcoloIVA.this.r0;
                    radioButton = this.l;
                    radioButton2 = this.m;
                    textView = this.n;
                    textView2 = this.o;
                    calcoloIVA = CalcoloIVA.this;
                }
                uVar.q0(radioButton, radioButton2, textView, textView2, calcoloIVA.getBaseContext());
            } catch (NumberFormatException | EmptyStackException unused) {
                Toast.makeText(CalcoloIVA.this.l0, "error", 0).show();
            }
        }
    }

    class w implements View.OnLongClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ SharedPreferences.Editor e;

        class a implements SeekBar.OnSeekBarChangeListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TextView f7008a;

            a(TextView textView) {
                this.f7008a = textView;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int r2, boolean z) {
                this.f7008a.setText(String.valueOf(r2) + " %");
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
                if (CalcoloIVA.this.N.equals("si")) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        CalcoloIVA.this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
                    } else {
                        CalcoloIVA.this.P.vibrate(20L);
                    }
                }
                w wVar = w.this;
                wVar.e.putString(CalcoloIVA.this.getResources().getString(R.string.iva_percetualeUNO), this.d.getText().toString());
                w.this.e.commit();
                w.this.d.setText(this.d.getText().toString());
                dialogInterface.cancel();
            }
        }

        class c implements DialogInterface.OnClickListener {
            c() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int r5) {
                if (CalcoloIVA.this.N.equals("si")) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        CalcoloIVA.this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
                    } else {
                        CalcoloIVA.this.P.vibrate(20L);
                    }
                }
                dialogInterface.cancel();
                dialogInterface.dismiss();
            }
        }

        w(Button button, SharedPreferences.Editor editor) {
            this.d = button;
            this.e = editor;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (CalcoloIVA.this.N.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcoloIVA.this.P.vibrate(VibrationEffect.createOneShot(40L, -1));
                } else {
                    CalcoloIVA.this.P.vibrate(40L);
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(CalcoloIVA.this);
            builder.setMessage(CalcoloIVA.this.getResources().getString(R.string.calcolo_iva_messaggio));
            View viewInflate = ((LayoutInflater) CalcoloIVA.this.getSystemService("layout_inflater")).inflate(R.layout.seekbar, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(R.id.textSeekBar);
            textView.setText(this.d.getText().toString());
            SeekBar seekBar = (SeekBar) viewInflate.findViewById(R.id.ivaSeekBar);
            if (!this.d.getText().toString().equals("...%")) {
                seekBar.setProgress(Integer.parseInt(this.d.getText().toString().substring(0, this.d.getText().toString().length() - 2)));
            }
            seekBar.setOnSeekBarChangeListener(new a(textView));
            builder.setView(viewInflate);
            builder.setCancelable(false);
            builder.setPositiveButton(CalcoloIVA.this.getResources().getString(R.string.calcolo_iva_messaggio_fatto), new b(textView));
            builder.setNegativeButton(CalcoloIVA.this.getResources().getString(R.string.calcolo_iva_messaggio_indietro), new c());
            builder.create().show();
            return true;
        }
    }

    class x implements View.OnClickListener {
        final /* synthetic */ SharedPreferences d;
        final /* synthetic */ Button e;
        final /* synthetic */ SharedPreferences.Editor f;
        final /* synthetic */ RadioButton g;
        final /* synthetic */ RadioButton h;
        final /* synthetic */ TextView i;
        final /* synthetic */ TextView j;
        final /* synthetic */ DecimalFormat k;
        final /* synthetic */ RadioButton l;
        final /* synthetic */ RadioButton m;
        final /* synthetic */ TextView n;
        final /* synthetic */ TextView o;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int r4) {
                x xVar = x.this;
                xVar.f.putString(CalcoloIVA.this.getResources().getString(R.string.Tutorial_iva_percetuale), "no");
                x.this.f.commit();
                dialogInterface.cancel();
            }
        }

        x(SharedPreferences sharedPreferences, Button button, SharedPreferences.Editor editor, RadioButton radioButton, RadioButton radioButton2, TextView textView, TextView textView2, DecimalFormat decimalFormat, RadioButton radioButton3, RadioButton radioButton4, TextView textView3, TextView textView4) {
            this.d = sharedPreferences;
            this.e = button;
            this.f = editor;
            this.g = radioButton;
            this.h = radioButton2;
            this.i = textView;
            this.j = textView2;
            this.k = decimalFormat;
            this.l = radioButton3;
            this.m = radioButton4;
            this.n = textView3;
            this.o = textView4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.gp7.easycalculator.u uVar;
            RadioButton radioButton;
            RadioButton radioButton2;
            TextView textView;
            TextView textView2;
            CalcoloIVA calcoloIVA;
            if (CalcoloIVA.this.N.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcoloIVA.this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcoloIVA.this.P.vibrate(20L);
                }
            }
            CalcoloIVA calcoloIVA2 = CalcoloIVA.this;
            calcoloIVA2.L = this.d.getString(calcoloIVA2.getString(R.string.Tutorial_iva_percetuale), "si");
            if (this.e.getText().toString().equals("...%") && CalcoloIVA.this.L.equals("si")) {
                AlertDialog.Builder builder = new AlertDialog.Builder(CalcoloIVA.this);
                builder.setMessage(CalcoloIVA.this.getResources().getString(R.string.Suggerimento_calcolo_iva_messaggio));
                builder.setTitle(CalcoloIVA.this.getResources().getString(R.string.Suggerimento_calcolo_iva));
                builder.setCancelable(false);
                builder.setPositiveButton(CalcoloIVA.this.getResources().getString(R.string.testo_bottone_tutorial), new a());
                builder.create().show();
                return;
            }
            try {
                if (this.e.getText().toString().equals("...%")) {
                    return;
                }
                if (CalcoloIVA.this.T.getDisplayedChild() == 0) {
                    if (CalcoloIVA.this.n0.equals("Francese")) {
                        CalcoloIVA.this.r0.p(this.g, this.h, this.i, this.j, this.e.getText().toString().substring(0, this.e.getText().toString().length() - 2), CalcoloIVA.this.W, this.k, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else if (CalcoloIVA.this.n0.equals("Italiana")) {
                        CalcoloIVA.this.r0.q(this.g, this.h, this.i, this.j, this.e.getText().toString().substring(0, this.e.getText().toString().length() - 2), CalcoloIVA.this.W, this.k, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else {
                        CalcoloIVA.this.r0.o(this.g, this.h, this.i, this.j, this.e.getText().toString().substring(0, this.e.getText().toString().length() - 2), CalcoloIVA.this.W, this.k, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    }
                    uVar = CalcoloIVA.this.r0;
                    radioButton = this.g;
                    radioButton2 = this.h;
                    textView = this.i;
                    textView2 = this.j;
                    calcoloIVA = CalcoloIVA.this;
                } else {
                    if (CalcoloIVA.this.n0.equals("Francese")) {
                        CalcoloIVA.this.r0.y(this.l, this.m, this.n, this.o, this.e.getText().toString().substring(0, this.e.getText().toString().length() - 2), CalcoloIVA.this.X, this.k, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else if (CalcoloIVA.this.n0.equals("Italiana")) {
                        CalcoloIVA.this.r0.A(this.l, this.m, this.n, this.o, this.e.getText().toString().substring(0, this.e.getText().toString().length() - 2), CalcoloIVA.this.X, this.k, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    } else {
                        CalcoloIVA.this.r0.x(this.l, this.m, this.n, this.o, this.e.getText().toString().substring(0, this.e.getText().toString().length() - 2), CalcoloIVA.this.X, this.k, CalcoloIVA.this.s0, CalcoloIVA.this.getBaseContext());
                    }
                    uVar = CalcoloIVA.this.r0;
                    radioButton = this.l;
                    radioButton2 = this.m;
                    textView = this.n;
                    textView2 = this.o;
                    calcoloIVA = CalcoloIVA.this;
                }
                uVar.q0(radioButton, radioButton2, textView, textView2, calcoloIVA.getBaseContext());
            } catch (NumberFormatException | EmptyStackException unused) {
                Toast.makeText(CalcoloIVA.this.l0, "error", 0).show();
            }
        }
    }

    class y implements View.OnLongClickListener {
        final /* synthetic */ Button d;
        final /* synthetic */ SharedPreferences.Editor e;

        class a implements SeekBar.OnSeekBarChangeListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TextView f7010a;

            a(TextView textView) {
                this.f7010a = textView;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int r2, boolean z) {
                this.f7010a.setText(String.valueOf(r2) + " %");
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
                if (CalcoloIVA.this.N.equals("si")) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        CalcoloIVA.this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
                    } else {
                        CalcoloIVA.this.P.vibrate(20L);
                    }
                }
                y yVar = y.this;
                yVar.e.putString(CalcoloIVA.this.getResources().getString(R.string.iva_percetualeDUE), this.d.getText().toString());
                y.this.e.commit();
                y.this.d.setText(this.d.getText().toString());
                dialogInterface.cancel();
            }
        }

        class c implements DialogInterface.OnClickListener {
            c() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int r5) {
                if (CalcoloIVA.this.N.equals("si")) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        CalcoloIVA.this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
                    } else {
                        CalcoloIVA.this.P.vibrate(20L);
                    }
                }
                dialogInterface.cancel();
            }
        }

        y(Button button, SharedPreferences.Editor editor) {
            this.d = button;
            this.e = editor;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (CalcoloIVA.this.N.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcoloIVA.this.P.vibrate(VibrationEffect.createOneShot(40L, -1));
                } else {
                    CalcoloIVA.this.P.vibrate(40L);
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(CalcoloIVA.this);
            builder.setMessage(CalcoloIVA.this.getResources().getString(R.string.calcolo_iva_messaggio));
            View viewInflate = ((LayoutInflater) CalcoloIVA.this.getSystemService("layout_inflater")).inflate(R.layout.seekbar, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(R.id.textSeekBar);
            textView.setText(this.d.getText().toString());
            SeekBar seekBar = (SeekBar) viewInflate.findViewById(R.id.ivaSeekBar);
            if (!this.d.getText().toString().equals("...%")) {
                seekBar.setProgress(Integer.parseInt(this.d.getText().toString().substring(0, this.d.getText().toString().length() - 2)));
            }
            seekBar.setOnSeekBarChangeListener(new a(textView));
            builder.setView(viewInflate);
            builder.setCancelable(false);
            builder.setPositiveButton(CalcoloIVA.this.getResources().getString(R.string.calcolo_iva_messaggio_fatto), new b(textView));
            builder.setNegativeButton(CalcoloIVA.this.getResources().getString(R.string.calcolo_iva_messaggio_indietro), new c());
            builder.create().show();
            return true;
        }
    }

    class z implements View.OnClickListener {
        final /* synthetic */ RadioButton d;
        final /* synthetic */ RadioButton e;
        final /* synthetic */ RadioButton f;
        final /* synthetic */ RadioButton g;

        z(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4) {
            this.d = radioButton;
            this.e = radioButton2;
            this.f = radioButton3;
            this.g = radioButton4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CalcoloIVA.this.N.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcoloIVA.this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcoloIVA.this.P.vibrate(20L);
                }
            }
            if (CalcoloIVA.this.T.getDisplayedChild() == 0) {
                if (this.d.isChecked()) {
                    this.d.setChecked(false);
                    this.e.setChecked(true);
                    CalcoloIVA.this.W = 2;
                    return;
                } else {
                    this.e.setChecked(false);
                    this.d.setChecked(true);
                    CalcoloIVA.this.W = 1;
                    return;
                }
            }
            if (this.f.isChecked()) {
                this.f.setChecked(false);
                this.g.setChecked(true);
                CalcoloIVA.this.X = 2;
            } else {
                this.g.setChecked(false);
                this.f.setChecked(true);
                CalcoloIVA.this.X = 1;
            }
        }
    }

    private void c0(TextView textView) {
        String string = textView.getText().toString();
        SpannableString spannableString = new SpannableString(string);
        Matcher matcher = Pattern.compile("[\\\\^]|[×]|[%]|[+]|[-]|[÷]|[√]").matcher(string);
        while (matcher.find()) {
            int r2 = matcher.start();
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(this.c0));
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
        String str;
        String str2;
        Cursor cursor;
        BigDecimal bigDecimal;
        DecimalFormat decimalFormat;
        DecimalFormat decimalFormat2;
        RadioButton radioButton;
        int r2;
        String str3;
        Context context;
        RadioButton radioButton2;
        String strReplaceAll;
        String str4 = "";
        String str5 = "error";
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.Inponibile);
        RadioButton radioButton4 = (RadioButton) findViewById(R.id.ivapercentuale);
        TextView textView = (TextView) findViewById(R.id.totaleiva);
        TextView textView2 = (TextView) findViewById(R.id.soloIva);
        RadioButton radioButton5 = (RadioButton) findViewById(R.id.ivapercentuale2);
        TextView textView3 = (TextView) findViewById(R.id.inponibile2);
        TextView textView4 = (TextView) findViewById(R.id.soloIva2);
        RadioButton radioButton6 = (RadioButton) findViewById(R.id.totale2);
        if (this.N.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.P.vibrate(20L);
            }
        }
        Locale.setDefault(Locale.US);
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormatSymbols.setGroupingSeparator(',');
        DecimalFormat decimalFormat3 = new DecimalFormat("#,###.###", decimalFormatSymbols);
        DecimalFormat decimalFormat4 = new DecimalFormat("#,###.########", decimalFormatSymbols);
        BigDecimal bigDecimal2 = new BigDecimal("9999999999");
        long jLongValue = ((Long) ((View) view.getParent().getParent()).getTag()).longValue();
        SQLiteDatabase readableDatabase = this.j0.getReadableDatabase();
        this.i0 = readableDatabase;
        Cursor cursorI = this.j0.i(jLongValue, readableDatabase);
        while (cursorI.moveToNext()) {
            try {
                try {
                    try {
                        String strG = this.s0.g(cursorI.getString(0), "Default");
                        if (Pattern.compile("^[-]").matcher(strG).find()) {
                            strG = strG.substring(1);
                        }
                        String strL = this.s0.l(this.t0.a(strG), decimalFormat4, Locale.US);
                        if (new BigDecimal(strL.replaceAll(",", str4)).compareTo(bigDecimal2) < 0) {
                            this.V = decimalFormat3.format(new BigDecimal(strL.replaceAll(",", str4)));
                        } else {
                            this.V = "9,999,999,999";
                            Toast.makeText(this, getResources().getString(R.string.overflow_result), 1).show();
                        }
                        str = str4;
                        Cursor cursor2 = cursorI;
                        BigDecimal bigDecimal3 = bigDecimal2;
                        DecimalFormat decimalFormat5 = decimalFormat4;
                        if (this.T.getDisplayedChild() == 0) {
                            try {
                                if (this.n0.equals("Francese")) {
                                    radioButton3.setText(this.V.replaceAll("[,]", " "));
                                    cursor = cursor2;
                                    bigDecimal = bigDecimal3;
                                    str3 = str5;
                                    decimalFormat = decimalFormat5;
                                    r2 = 0;
                                    decimalFormat2 = decimalFormat3;
                                    radioButton2 = radioButton6;
                                    try {
                                        this.r0.l(radioButton3, radioButton4, textView, textView2, this.V, this.W, decimalFormat3, this.s0, getBaseContext());
                                    } catch (NumberFormatException unused) {
                                        radioButton = radioButton2;
                                        str2 = str3;
                                        context = this.l0;
                                        Toast.makeText(context, str2, r2).show();
                                        radioButton6 = radioButton;
                                        str5 = str2;
                                        str4 = str;
                                        cursorI = cursor;
                                        bigDecimal2 = bigDecimal;
                                        decimalFormat4 = decimalFormat;
                                        decimalFormat3 = decimalFormat2;
                                    } catch (EmptyStackException unused2) {
                                        radioButton = radioButton2;
                                        context = this.l0;
                                        str2 = str3;
                                        Toast.makeText(context, str2, r2).show();
                                        radioButton6 = radioButton;
                                        str5 = str2;
                                        str4 = str;
                                        cursorI = cursor;
                                        bigDecimal2 = bigDecimal;
                                        decimalFormat4 = decimalFormat;
                                        decimalFormat3 = decimalFormat2;
                                    }
                                } else {
                                    str3 = str5;
                                    decimalFormat2 = decimalFormat3;
                                    radioButton2 = radioButton6;
                                    cursor = cursor2;
                                    bigDecimal = bigDecimal3;
                                    decimalFormat = decimalFormat5;
                                    r2 = 0;
                                    if (this.n0.equals("Italiana")) {
                                        radioButton3.setText(this.V.replaceAll("[.]", "v").replaceAll("[,]", ".").replaceAll("[v]", ","));
                                        this.r0.m(radioButton3, radioButton4, textView, textView2, this.V, this.W, decimalFormat2, this.s0, getBaseContext());
                                    } else {
                                        radioButton3.setText(this.V);
                                        this.r0.k(radioButton3, radioButton4, textView, textView2, this.V, this.W, decimalFormat2, this.s0, getBaseContext());
                                    }
                                }
                                this.r0.q0(radioButton3, radioButton4, textView, textView2, getBaseContext());
                                radioButton = radioButton2;
                                radioButton6 = radioButton;
                                str4 = str;
                                cursorI = cursor;
                                bigDecimal2 = bigDecimal;
                                decimalFormat4 = decimalFormat;
                                str5 = str3;
                            } catch (NumberFormatException unused3) {
                                str3 = str5;
                                decimalFormat2 = decimalFormat3;
                                cursor = cursor2;
                                bigDecimal = bigDecimal3;
                                decimalFormat = decimalFormat5;
                                r2 = 0;
                                radioButton = radioButton6;
                            } catch (EmptyStackException unused4) {
                                str3 = str5;
                                decimalFormat2 = decimalFormat3;
                                cursor = cursor2;
                                bigDecimal = bigDecimal3;
                                decimalFormat = decimalFormat5;
                                r2 = 0;
                                radioButton = radioButton6;
                            }
                        } else {
                            str3 = str5;
                            decimalFormat2 = decimalFormat3;
                            radioButton = radioButton6;
                            cursor = cursor2;
                            bigDecimal = bigDecimal3;
                            decimalFormat = decimalFormat5;
                            r2 = 0;
                            try {
                                if (this.n0.equals("Francese")) {
                                    this.r0.u(radioButton, radioButton5, textView3, textView4, this.V, this.X, decimalFormat2, this.s0, getBaseContext());
                                    strReplaceAll = this.V.replaceAll("[,]", " ");
                                } else if (this.n0.equals("Italiana")) {
                                    strReplaceAll = this.V.replaceAll("[.]", "v").replaceAll("[,]", ".").replaceAll("[v]", ",");
                                    this.r0.v(radioButton, radioButton5, textView3, textView4, this.V, this.X, decimalFormat2, this.s0, getBaseContext());
                                } else {
                                    this.r0.t(radioButton, radioButton5, textView3, textView4, this.V, this.X, decimalFormat2, this.s0, getBaseContext());
                                    strReplaceAll = this.V;
                                }
                                radioButton.setText(strReplaceAll);
                                this.r0.q0(radioButton, radioButton5, textView3, textView4, getBaseContext());
                                radioButton6 = radioButton;
                                str4 = str;
                                cursorI = cursor;
                                bigDecimal2 = bigDecimal;
                                decimalFormat4 = decimalFormat;
                                str5 = str3;
                            } catch (NumberFormatException unused5) {
                                str2 = str3;
                                context = this.l0;
                                Toast.makeText(context, str2, r2).show();
                                radioButton6 = radioButton;
                                str5 = str2;
                                str4 = str;
                                cursorI = cursor;
                                bigDecimal2 = bigDecimal;
                                decimalFormat4 = decimalFormat;
                                decimalFormat3 = decimalFormat2;
                            } catch (EmptyStackException unused6) {
                                context = this.l0;
                                str2 = str3;
                                Toast.makeText(context, str2, r2).show();
                                radioButton6 = radioButton;
                                str5 = str2;
                                str4 = str;
                                cursorI = cursor;
                                bigDecimal2 = bigDecimal;
                                decimalFormat4 = decimalFormat;
                                decimalFormat3 = decimalFormat2;
                            }
                        }
                    } catch (NumberFormatException unused7) {
                        str = str4;
                        str3 = str5;
                        cursor = cursorI;
                        bigDecimal = bigDecimal2;
                        decimalFormat = decimalFormat4;
                        decimalFormat2 = decimalFormat3;
                        radioButton = radioButton6;
                        r2 = 0;
                    }
                } catch (EmptyStackException unused8) {
                    str = str4;
                    str3 = str5;
                    cursor = cursorI;
                    bigDecimal = bigDecimal2;
                    decimalFormat = decimalFormat4;
                    decimalFormat2 = decimalFormat3;
                    radioButton = radioButton6;
                    r2 = 0;
                }
            } catch (NumberFormatException unused9) {
                str = str4;
                str2 = str5;
                cursor = cursorI;
                bigDecimal = bigDecimal2;
                decimalFormat = decimalFormat4;
                decimalFormat2 = decimalFormat3;
                radioButton = radioButton6;
                r2 = 0;
            }
            decimalFormat3 = decimalFormat2;
        }
        this.m0.h();
    }

    public void ckmemory(View view) {
        com.gp7.easycalculator.c cVar;
        Long lValueOf;
        SQLiteDatabase sQLiteDatabase;
        String str;
        if (this.N.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.P.vibrate(20L);
            }
        }
        CheckBox checkBox = (CheckBox) view;
        this.C = checkBox;
        long jLongValue = ((Long) ((View) checkBox.getParent().getParent()).getTag()).longValue();
        if (this.C.isChecked()) {
            this.C.setBackground(getDrawable(R.drawable.ic_pin_test_ck));
            cVar = this.j0;
            lValueOf = Long.valueOf(jLongValue);
            sQLiteDatabase = this.i0;
            str = "Y";
        } else {
            this.C.setBackground(getDrawable(R.drawable.ic_pin_test));
            cVar = this.j0;
            lValueOf = Long.valueOf(jLongValue);
            sQLiteDatabase = this.i0;
            str = "N";
        }
        cVar.l(lValueOf, str, sQLiteDatabase);
    }

    public void deleteallIVA(View view) {
        if (this.N.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.P.vibrate(20L);
            }
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.memoriaIVA);
        if (viewGroup.getChildCount() > 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage(getResources().getString(R.string.DeleteAllMemory));
            builder.setTitle(getResources().getString(R.string.AlertTitle));
            builder.setCancelable(false);
            builder.setPositiveButton(getResources().getString(R.string.AlertSI), new q(viewGroup));
            builder.setNegativeButton(getResources().getString(R.string.AlertNO), new r());
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
            ((ViewGroup) findViewById(R.id.memoriaIVA)).removeView((View) view.getParent().getParent());
            SQLiteDatabase readableDatabase = this.j0.getReadableDatabase();
            this.i0 = readableDatabase;
            this.j0.f(jLongValue, readableDatabase);
        }
        if (this.N.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.P.vibrate(20L);
            }
        }
    }

    public void filterMemoryIVA(View view) {
        for (int r0 = 0; r0 < this.h0.getChildCount(); r0++) {
            LinearLayout linearLayout = (LinearLayout) this.h0.getChildAt(r0);
            if (((CheckBox) ((LinearLayout) linearLayout.getChildAt(0)).getChildAt(1)).isChecked()) {
                this.w0 = "no";
            } else {
                linearLayout.setVisibility(8);
                this.v0 = "SI";
            }
        }
        if (this.v0.equals("SI")) {
            this.D.setVisibility(0);
        }
        if (this.w0.equals("si")) {
            Toast.makeText(this, getResources().getString(R.string.nocalcoliprotetti), 1).show();
        }
        if (this.N.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.P.vibrate(20L);
            }
        }
    }

    public void flippering(View view) throws Resources.NotFoundException {
        Resources resources;
        int r0;
        RadioButton radioButton;
        int color;
        if (this.N.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.P.vibrate(VibrationEffect.createOneShot(40L, -1));
            } else {
                this.P.vibrate(40L);
            }
        }
        int id = view.getId();
        if (id == R.id.incorporaIVA) {
            if (this.T.getDisplayedChild() == 0) {
                resources = getResources();
                r0 = R.string.display_incorporo_selezionato;
                Toast.makeText(this, resources.getString(r0), 1).show();
                return;
            }
            this.T.setInAnimation(this, R.anim.slide_in_from_right);
            this.T.setOutAnimation(this, R.anim.slide_out_to_left);
            this.T.showNext();
            if (this.Y.equals("elegant")) {
                this.p0.setTextColor(getResources().getColor(R.color.BIANCO));
                radioButton = this.q0;
                color = getResources().getColor(R.color.colorPrimarybase);
                radioButton.setTextColor(color);
            }
            return;
        }
        if (id != R.id.scorporoIVA) {
            return;
        }
        if (this.T.getDisplayedChild() == 1) {
            resources = getResources();
            r0 = R.string.display_scorporo_selezionato;
            Toast.makeText(this, resources.getString(r0), 1).show();
            return;
        }
        this.T.setInAnimation(this, R.anim.slide_in_from_right);
        this.T.setOutAnimation(this, R.anim.slide_out_to_left);
        this.T.showNext();
        if (this.Y.equals("elegant")) {
            this.p0.setTextColor(getResources().getColor(R.color.colorPrimarybase));
            radioButton = this.q0;
            color = getResources().getColor(R.color.BIANCO);
            radioButton.setTextColor(color);
        }
    }

    public void ivaMODE(View view) {
        int r5;
        if (this.N.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.P.vibrate(20L);
            }
        }
        int id = view.getId();
        if (id == R.id.Inponibile) {
            r5 = 1;
        } else if (id != R.id.ivapercentuale) {
            return;
        } else {
            r5 = 2;
        }
        this.W = r5;
    }

    public void ivaMODE2(View view) {
        int r5;
        if (this.N.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.P.vibrate(20L);
            }
        }
        int id = view.getId();
        if (id == R.id.ivapercentuale2) {
            r5 = 2;
        } else if (id != R.id.totale2) {
            return;
        } else {
            r5 = 1;
        }
        this.X = r5;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (x0 + 2500 > System.currentTimeMillis()) {
            this.j0.close();
            super.onBackPressed();
        } else {
            Toast.makeText(this, getResources().getString(R.string.doubleclick), 0).show();
            x0 = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:174:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x09e1  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0ae9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03da  */
    @Override // androidx.appcompat.app.e, androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.j, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onCreate(android.os.Bundle r56) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 3230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.CalcoloIVA.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dd  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onCreateOptionsMenu(android.view.Menu r15) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.CalcoloIVA.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    @Override // androidx.appcompat.app.e, androidx.fragment.app.d, android.app.Activity
    protected void onDestroy() {
        this.j0.close();
        this.I.y1(this);
        super.onDestroy();
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
        String string = getResources().getString(R.string.risp12);
        String string2 = getResources().getString(R.string.risp13);
        String string3 = getResources().getString(R.string.risp14);
        String string4 = getResources().getString(R.string.risp15);
        arrayList2.add(string);
        arrayList3.add(string2);
        arrayList4.add(string3);
        arrayList5.add(string4);
        for (String str : getResources().getStringArray(R.array.domandeiva)) {
            arrayList.add(str);
        }
        HashMap map = new HashMap();
        map.put(arrayList.get(0), arrayList2);
        map.put(arrayList.get(1), arrayList3);
        map.put(arrayList.get(2), arrayList4);
        map.put(arrayList.get(3), arrayList5);
        com.gp7.easycalculator.z zVar = new com.gp7.easycalculator.z(this, arrayList, map);
        switch (menuItem.getItemId()) {
            case R.id.CLASSIC_iva /* 2131296270 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "classic");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Classic", 0).show();
                if (!this.p0.isChecked()) {
                    this.p0.setChecked(true);
                }
                finish();
                startActivity(new Intent(this, (Class<?>) CalcoloIVA.class));
                return true;
            case R.id.ConverterfromIVA /* 2131296286 */:
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
            case R.id.ELEGANT_iva /* 2131296300 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "elegant");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Elegant", 0).show();
                if (!this.p0.isChecked()) {
                    this.p0.setChecked(true);
                }
                finish();
                startActivity(new Intent(this, (Class<?>) CalcoloIVA.class));
                return true;
            case R.id.Exit_iva /* 2131296307 */:
                this.j0.close();
                finish();
                return true;
            case R.id.LIGHT_iva /* 2131296327 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "light");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Light", 0).show();
                if (!this.p0.isChecked()) {
                    this.p0.setChecked(true);
                }
                finish();
                startActivity(new Intent(this, (Class<?>) CalcoloIVA.class));
                return true;
            case R.id.MINIMAL_iva /* 2131296336 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "minimal");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Minimal", 0).show();
                if (!this.p0.isChecked()) {
                    this.p0.setChecked(true);
                }
                finish();
                startActivity(new Intent(this, (Class<?>) CalcoloIVA.class));
                return true;
            case R.id.NEON_iva /* 2131296342 */:
                menuItem.setChecked(true);
                editorEdit.putString(getString(R.string.thema_memorizzato), "neon");
                editorEdit.commit();
                Toast.makeText(getBaseContext(), "Dark", 0).show();
                if (!this.p0.isChecked()) {
                    this.p0.setChecked(true);
                }
                finish();
                startActivity(new Intent(this, (Class<?>) CalcoloIVA.class));
                return true;
            case R.id.STAR_iva /* 2131296359 */:
                com.gp7.easycalculator.a.b(this, editorEdit2, menuItem, this.Y);
                menuItem.setVisible(false);
                return true;
            case R.id.ScontofromIVA /* 2131296366 */:
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
            case R.id.Setting_iva /* 2131296372 */:
                startActivity(new Intent(this, (Class<?>) Setting.class));
                return true;
            case R.id.Sharami_iva /* 2131296378 */:
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", getResources().getString(R.string.downloadApp) + "https://play.google.com/store/apps/details?id=" + com.gp7.easycalculator.b.f7045b);
                intent.setType("text/plain");
                startActivity(intent);
                return true;
            case R.id.aiutomenu_iva /* 2131296453 */:
                try {
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.exp_faq, (ViewGroup) null);
                    ExpandableListView expandableListView = (ExpandableListView) viewInflate.findViewById(R.id.listFAQ);
                    this.a0 = expandableListView;
                    expandableListView.setAdapter(zVar);
                    builder.setTitle(getResources().getString(R.string.FaqTitle));
                    builder.setView(viewInflate);
                    builder.setCancelable(false);
                    builder.setPositiveButton(getResources().getString(R.string.CloseFaq), new k());
                    builder.create().show();
                } catch (NullPointerException unused) {
                    Toast.makeText(this.l0, "error", 0).show();
                }
                return true;
            case R.id.gift_iva /* 2131296606 */:
                AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
                if (this.G.b(this.l0).equals("si")) {
                    if (!this.S.equals("UNKNOWN")) {
                        this.I.u1("ca-app-pub-8629550575650531/4934517701", new e.a().d(AdMobAdapter.class, this.u0).f());
                    }
                    builder2.setTitle(getResources().getString(R.string.title_activity_settings));
                    builder2.setMessage(getResources().getString(R.string.message_video_premio));
                    builder2.setNegativeButton(getResources().getString(R.string.no_grazie), new s());
                    builder2.setPositiveButton(getResources().getString(R.string.testo_bottone_tutorial), new t());
                    builder2.create().show();
                }
                return true;
            case R.id.gotoSpesafromiva /* 2131296613 */:
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
            case R.id.gotoTipfromiva /* 2131296618 */:
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
            case R.id.gotocalculator /* 2131296621 */:
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // androidx.fragment.app.d, android.app.Activity
    protected void onResume() {
        String str;
        SharedPreferences.Editor editor;
        Context context;
        CharSequence charSequence;
        int r4;
        String strReplaceAll;
        RadioButton radioButton = (RadioButton) findViewById(R.id.Inponibile);
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.ivapercentuale);
        TextView textView = (TextView) findViewById(R.id.totaleiva);
        TextView textView2 = (TextView) findViewById(R.id.soloIva);
        this.I.w1(this);
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.ivapercentuale2);
        TextView textView3 = (TextView) findViewById(R.id.inponibile2);
        TextView textView4 = (TextView) findViewById(R.id.soloIva2);
        RadioButton radioButton4 = (RadioButton) findViewById(R.id.totale2);
        SharedPreferences sharedPreferences = getSharedPreferences(getString(R.string.pref_file), 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        this.N = sharedPreferences.getString(getString(R.string.vibrazione_memorizzata), "no");
        this.O = sharedPreferences.getString(getString(R.string.ScreenONoption_memorizzata), "no");
        this.f0 = sharedPreferences.getString(getString(R.string.operator_color), "si");
        this.b0 = sharedPreferences.getString(getString(R.string.stile_option), "si");
        if (this.O.equals("no")) {
            getWindow().clearFlags(128);
        }
        if (this.O.equals("si")) {
            getWindow().addFlags(128);
        }
        this.n0 = sharedPreferences.getString(getString(R.string.notazione_scelta), "Default");
        Button button = (Button) findViewById(R.id.puntoIVA);
        ?? r1 = ".";
        if (this.n0.equals("Italiana")) {
            button.setText(",");
        } else {
            button.setText(".");
        }
        if (sharedPreferences.getString(getString(R.string.calcolovolanteEseguito), "no").equals("si")) {
            try {
                Locale.setDefault(Locale.US);
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
                decimalFormatSymbols.setDecimalSeparator('.');
                decimalFormatSymbols.setGroupingSeparator(',');
                DecimalFormat decimalFormat = new DecimalFormat("#,###.###", decimalFormatSymbols);
                this.U = sharedPreferences.getString(getString(R.string.calcolovolante), "");
                if (Pattern.compile("^[-]").matcher(this.U).find()) {
                    this.U = this.U.substring(1);
                }
                if (new BigDecimal(this.U.replaceAll(",", "")).compareTo(new BigDecimal("9999999999")) < 0) {
                    this.V = decimalFormat.format(new BigDecimal(this.U.replaceAll(",", "")));
                } else {
                    this.V = "9,999,999,999";
                    Toast.makeText(this, getResources().getString(R.string.overflow_result), 1).show();
                }
                if (this.T.getDisplayedChild() == 0) {
                    try {
                        try {
                            if (this.n0.equals("Francese")) {
                                try {
                                    radioButton.setText(this.V.replaceAll("[,]", " "));
                                } catch (NumberFormatException unused) {
                                    editor = editorEdit;
                                    str = "no";
                                } catch (EmptyStackException unused2) {
                                    editor = editorEdit;
                                    str = "no";
                                }
                                try {
                                    this.r0.l(radioButton, radioButton2, textView, textView2, this.V, this.W, decimalFormat, this.s0, getBaseContext());
                                    str = "no";
                                    r1 = editorEdit;
                                    this.r0.q0(radioButton, radioButton2, textView, textView2, getBaseContext());
                                    editor = r1;
                                } catch (NumberFormatException unused3) {
                                    str = "no";
                                    editor = editorEdit;
                                    charSequence = "error";
                                    r4 = 0;
                                    context = this.l0;
                                    Toast.makeText(context, charSequence, r4).show();
                                    editor.putString(getString(R.string.calcolovolanteEseguito), str);
                                    editor.apply();
                                    super.onResume();
                                } catch (EmptyStackException unused4) {
                                    str = "no";
                                    editor = editorEdit;
                                    context = this.l0;
                                    charSequence = "error";
                                    r4 = 0;
                                    Toast.makeText(context, charSequence, r4).show();
                                    editor.putString(getString(R.string.calcolovolanteEseguito), str);
                                    editor.apply();
                                    super.onResume();
                                }
                            } else {
                                try {
                                    if (this.n0.equals("Italiana")) {
                                        radioButton.setText(this.V.replaceAll("[.]", "v").replaceAll("[,]", ".").replaceAll("[v]", ","));
                                        str = "no";
                                        r1 = editorEdit;
                                        this.r0.m(radioButton, radioButton2, textView, textView2, this.V, this.W, decimalFormat, this.s0, getBaseContext());
                                    } else {
                                        str = "no";
                                        r1 = editorEdit;
                                        radioButton.setText(this.V);
                                        this.r0.k(radioButton, radioButton2, textView, textView2, this.V, this.W, decimalFormat, this.s0, getBaseContext());
                                    }
                                    this.r0.q0(radioButton, radioButton2, textView, textView2, getBaseContext());
                                    editor = r1;
                                } catch (NumberFormatException unused5) {
                                    str = "no";
                                    editor = editorEdit;
                                    charSequence = "error";
                                    r4 = 0;
                                    context = this.l0;
                                    Toast.makeText(context, charSequence, r4).show();
                                    editor.putString(getString(R.string.calcolovolanteEseguito), str);
                                    editor.apply();
                                    super.onResume();
                                } catch (EmptyStackException unused6) {
                                    str = "no";
                                    editor = editorEdit;
                                    context = this.l0;
                                    charSequence = "error";
                                    r4 = 0;
                                    Toast.makeText(context, charSequence, r4).show();
                                    editor.putString(getString(R.string.calcolovolanteEseguito), str);
                                    editor.apply();
                                    super.onResume();
                                }
                            }
                        } catch (NumberFormatException unused7) {
                            editor = r1;
                        } catch (EmptyStackException unused8) {
                            editor = r1;
                        }
                    } catch (NumberFormatException unused9) {
                        str = "no";
                        editor = editorEdit;
                        charSequence = "error";
                        r4 = 0;
                        context = this.l0;
                        Toast.makeText(context, charSequence, r4).show();
                        editor.putString(getString(R.string.calcolovolanteEseguito), str);
                        editor.apply();
                        super.onResume();
                    } catch (EmptyStackException unused10) {
                        str = "no";
                        editor = editorEdit;
                        context = this.l0;
                        charSequence = "error";
                        r4 = 0;
                        Toast.makeText(context, charSequence, r4).show();
                        editor.putString(getString(R.string.calcolovolanteEseguito), str);
                        editor.apply();
                        super.onResume();
                    }
                } else {
                    editor = editorEdit;
                    str = "no";
                    try {
                        if (this.n0.equals("Francese")) {
                            this.r0.u(radioButton4, radioButton3, textView3, textView4, this.V, this.X, decimalFormat, this.s0, getBaseContext());
                            strReplaceAll = this.V.replaceAll("[,]", " ");
                        } else if (this.n0.equals("Italiana")) {
                            strReplaceAll = this.V.replaceAll("[.]", "v").replaceAll("[,]", ".").replaceAll("[v]", ",");
                            this.r0.v(radioButton4, radioButton3, textView3, textView4, this.V, this.X, decimalFormat, this.s0, getBaseContext());
                        } else {
                            this.r0.t(radioButton4, radioButton3, textView3, textView4, this.V, this.X, decimalFormat, this.s0, getBaseContext());
                            strReplaceAll = this.V;
                        }
                        radioButton4.setText(strReplaceAll);
                        this.r0.q0(radioButton4, radioButton3, textView3, textView4, getBaseContext());
                    } catch (NumberFormatException unused11) {
                        charSequence = "error";
                        r4 = 0;
                        context = this.l0;
                        Toast.makeText(context, charSequence, r4).show();
                        editor.putString(getString(R.string.calcolovolanteEseguito), str);
                        editor.apply();
                        super.onResume();
                    } catch (EmptyStackException unused12) {
                        context = this.l0;
                        charSequence = "error";
                        r4 = 0;
                        Toast.makeText(context, charSequence, r4).show();
                        editor.putString(getString(R.string.calcolovolanteEseguito), str);
                        editor.apply();
                        super.onResume();
                    }
                }
            } catch (NumberFormatException unused13) {
                str = "no";
            } catch (EmptyStackException unused14) {
                str = "no";
            }
            editor.putString(getString(R.string.calcolovolanteEseguito), str);
            editor.apply();
        }
        super.onResume();
    }

    public void shareitemsaved(View view) throws Resources.NotFoundException, IOException {
        if (this.N.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.P.vibrate(20L);
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

    public void undofilterMemoryIVA(View view) {
        if (this.D.getVisibility() != 8) {
            if (this.N.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    this.P.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    this.P.vibrate(20L);
                }
            }
            for (int r2 = 0; r2 < this.h0.getChildCount(); r2++) {
                LinearLayout linearLayout = (LinearLayout) this.h0.getChildAt(r2);
                if (!((CheckBox) ((LinearLayout) linearLayout.getChildAt(0)).getChildAt(1)).isChecked()) {
                    linearLayout.setVisibility(0);
                    this.v0 = "NO";
                    this.w0 = "si";
                    this.D.setVisibility(8);
                }
            }
        }
    }
}

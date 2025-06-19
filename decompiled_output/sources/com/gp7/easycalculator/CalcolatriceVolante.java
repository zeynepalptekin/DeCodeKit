package com.gp7.easycalculator;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class CalcolatriceVolante extends androidx.appcompat.app.e {
    private FirebaseAnalytics D;
    String E;
    float G;
    com.gp7.easycalculator.w J;
    String K;
    String L;
    String M;
    String N;
    String O;
    String P;
    String Q;
    String R;
    Vibrator S;
    int T;
    int U;
    int V;
    Button W;
    String X;
    String Y;
    RelativeLayout Z;
    String a0;
    String b0;
    EditText c0;
    TextView d0;
    com.gp7.easycalculator.b0 C = new com.gp7.easycalculator.b0();
    com.gp7.easycalculator.u F = new com.gp7.easycalculator.u();
    boolean H = false;
    Context I = this;

    class a implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        a(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "3", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "3", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "3", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class a0 implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        a0(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "ln(", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "ln(", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "ln(", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class b implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        b(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "4", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "4", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "4", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class b0 implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        b0(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "log(", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "log(", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "log(", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class c implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        c(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "5", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "5", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "5", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class c0 implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        c0(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "√(", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "√(", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "√(", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class d implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        d(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "6", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "6", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "6", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class d0 implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        d0(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "φ", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "φ", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "φ", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class e implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        e(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "7", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "7", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "7", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class e0 implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        e0(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "π", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "π", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "π", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class f implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        f(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "8", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "8", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "8", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class f0 implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        f0(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "e", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "e", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "e", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class g implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        g(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "9", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "9", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "9", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class g0 implements TextWatcher {
        final /* synthetic */ EditText d;

        g0(EditText editText) {
            this.d = editText;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (this.d.getText().toString().isEmpty()) {
                CalcolatriceVolante.this.H = false;
                this.d.setRawInputType(0);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int r2, int r3, int r4) {
            if (CalcolatriceVolante.this.H) {
                return;
            }
            EditText editText = this.d;
            editText.setSelection(editText.getText().toString().length(), this.d.getText().toString().length());
            this.d.setRawInputType(3);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int r2, int r3, int r4) {
            if (CalcolatriceVolante.this.H) {
                return;
            }
            EditText editText = this.d;
            editText.setSelection(editText.getText().toString().length(), this.d.getText().toString().length());
            this.d.setRawInputType(3);
        }
    }

    class h implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        h(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, ".", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, ".", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, ".", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class h0 implements View.OnClickListener {
        h0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CalcolatriceVolante.this.finish();
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class i implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        i(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "somma", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "somma", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "somma", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class i0 implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;

        i0(EditText editText, TextView textView) {
            this.d = editText;
            this.e = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.d.setText("");
            this.e.setText("");
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(40L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(40L);
                }
            }
        }
    }

    class j implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        j(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "dif", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "dif", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "dif", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class j0 implements View.OnLongClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        j0(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            try {
                if (CalcolatriceVolante.this.O.equals("Francese")) {
                    String[] strArrC = CalcolatriceVolante.this.F.C(this.d, this.e, "halfcanc", Boolean.valueOf(CalcolatriceVolante.this.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                    this.d.setText(CalcolatriceVolante.this.J.m(strArrC[0], CalcolatriceVolante.this.O));
                    CalcolatriceVolante.this.P = strArrC[0];
                    calcolatriceVolante = CalcolatriceVolante.this;
                    str = strArrC[1];
                } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                    String[] strArrD = CalcolatriceVolante.this.F.D(this.d, this.e, "halfcanc", Boolean.valueOf(CalcolatriceVolante.this.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                    this.d.setText(CalcolatriceVolante.this.J.m(strArrD[0], CalcolatriceVolante.this.O));
                    CalcolatriceVolante.this.P = strArrD[0];
                    calcolatriceVolante = CalcolatriceVolante.this;
                    str = strArrD[1];
                } else {
                    String[] strArrB = CalcolatriceVolante.this.F.B(this.d, this.e, "halfcanc", Boolean.valueOf(CalcolatriceVolante.this.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                    this.d.setText(strArrB[0]);
                    CalcolatriceVolante.this.P = strArrB[0];
                    calcolatriceVolante = CalcolatriceVolante.this;
                    str = strArrB[1];
                }
                calcolatriceVolante.Q = str;
                this.e.setText(CalcolatriceVolante.this.J.m(CalcolatriceVolante.this.F.h0(CalcolatriceVolante.this.P, CalcolatriceVolante.this.Y, CalcolatriceVolante.this.C, CalcolatriceVolante.this.J, this.g, CalcolatriceVolante.this.getBaseContext()), CalcolatriceVolante.this.O));
                if (CalcolatriceVolante.this.X.equals("si")) {
                    CalcolatriceVolante.this.c0(this.d);
                }
                CalcolatriceVolante.this.F.n0(this.d, CalcolatriceVolante.this.G, CalcolatriceVolante.this.getBaseContext());
            } catch (NullPointerException unused) {
            }
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(40L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(40L);
                }
            }
            return true;
        }
    }

    class k implements View.OnClickListener {
        final /* synthetic */ EditText d;

        k(EditText editText) {
            this.d = editText;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CalcolatriceVolante calcolatriceVolante;
            boolean z;
            if (this.d.getSelectionEnd() < 0 || this.d.getSelectionEnd() >= this.d.getText().toString().length()) {
                calcolatriceVolante = CalcolatriceVolante.this;
                z = false;
            } else {
                this.d.setRawInputType(3);
                calcolatriceVolante = CalcolatriceVolante.this;
                z = true;
            }
            calcolatriceVolante.H = z;
        }
    }

    class k0 implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        k0(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "canc", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "canc", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "canc", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class l implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        l(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "div", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "div", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "div", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class l0 implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        l0(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "0", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "0", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "0", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class m implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        m(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "per", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "per", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "per", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class m0 implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        m0(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "1", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "1", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "1", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class n implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        n(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "^", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "^", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "^", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class n0 implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        n0(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "2", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "2", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "2", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class o implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        o(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "(", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "(", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "(", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class p implements View.OnLongClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        p(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, ")", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, ")", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, ")", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
            return true;
        }
    }

    class q implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        q(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "%", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "%", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "%", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class r implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ SharedPreferences.Editor g;
        final /* synthetic */ DecimalFormat h;

        r(EditText editText, TextView textView, DecimalFormat decimalFormat, SharedPreferences.Editor editor, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = editor;
            this.h = decimalFormat2;
        }

        /* JADX WARN: Removed duplicated region for block: B:57:0x01e3 A[Catch: EmptyStackException -> 0x0336, NumberFormatException -> 0x0343, TryCatch #2 {NumberFormatException -> 0x0343, EmptyStackException -> 0x0336, blocks: (B:38:0x010f, B:41:0x011d, B:42:0x0133, B:47:0x0184, B:49:0x018e, B:51:0x01a0, B:53:0x01b2, B:55:0x01c4, B:56:0x01da, B:57:0x01e3, B:59:0x01ed, B:60:0x0204, B:62:0x020e, B:63:0x022d, B:66:0x0251, B:68:0x0275, B:69:0x0281, B:70:0x0289, B:71:0x029b, B:73:0x02a1, B:76:0x02c7, B:77:0x02d6, B:78:0x02dd, B:79:0x02f2, B:81:0x02fc, B:82:0x0303, B:43:0x013a, B:45:0x0146, B:46:0x0173), top: B:88:0x010f }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01ed A[Catch: EmptyStackException -> 0x0336, NumberFormatException -> 0x0343, TryCatch #2 {NumberFormatException -> 0x0343, EmptyStackException -> 0x0336, blocks: (B:38:0x010f, B:41:0x011d, B:42:0x0133, B:47:0x0184, B:49:0x018e, B:51:0x01a0, B:53:0x01b2, B:55:0x01c4, B:56:0x01da, B:57:0x01e3, B:59:0x01ed, B:60:0x0204, B:62:0x020e, B:63:0x022d, B:66:0x0251, B:68:0x0275, B:69:0x0281, B:70:0x0289, B:71:0x029b, B:73:0x02a1, B:76:0x02c7, B:77:0x02d6, B:78:0x02dd, B:79:0x02f2, B:81:0x02fc, B:82:0x0303, B:43:0x013a, B:45:0x0146, B:46:0x0173), top: B:88:0x010f }] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0204 A[Catch: EmptyStackException -> 0x0336, NumberFormatException -> 0x0343, TryCatch #2 {NumberFormatException -> 0x0343, EmptyStackException -> 0x0336, blocks: (B:38:0x010f, B:41:0x011d, B:42:0x0133, B:47:0x0184, B:49:0x018e, B:51:0x01a0, B:53:0x01b2, B:55:0x01c4, B:56:0x01da, B:57:0x01e3, B:59:0x01ed, B:60:0x0204, B:62:0x020e, B:63:0x022d, B:66:0x0251, B:68:0x0275, B:69:0x0281, B:70:0x0289, B:71:0x029b, B:73:0x02a1, B:76:0x02c7, B:77:0x02d6, B:78:0x02dd, B:79:0x02f2, B:81:0x02fc, B:82:0x0303, B:43:0x013a, B:45:0x0146, B:46:0x0173), top: B:88:0x010f }] */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onClick(android.view.View r12) throws android.content.res.Resources.NotFoundException {
            /*
                Method dump skipped, instructions count: 854
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.CalcolatriceVolante.r.onClick(android.view.View):void");
        }
    }

    class s implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        s(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "abs(", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "abs(", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "abs(", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class t implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        t(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "tan⁻¹(", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "tan⁻¹(", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "tan⁻¹(", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class u implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        u(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "cos⁻¹(", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "cos⁻¹(", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "cos⁻¹(", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class v implements View.OnLongClickListener {
        final /* synthetic */ EditText d;

        v(EditText editText) {
            this.d = editText;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (this.d.getSelectionEnd() < 0 || this.d.getSelectionEnd() >= this.d.getText().toString().length()) {
                CalcolatriceVolante.this.H = false;
            } else {
                int r4 = Build.VERSION.SDK_INT;
                this.d.setRawInputType(3);
                CalcolatriceVolante.this.H = true;
            }
            return true;
        }
    }

    class w implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        w(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "sin⁻¹(", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "sin⁻¹(", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "sin⁻¹(", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class x implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        x(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "tan(", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "tan(", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "tan(", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class y implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        y(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "cos(", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "cos(", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "cos(", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    class z implements View.OnClickListener {
        final /* synthetic */ EditText d;
        final /* synthetic */ TextView e;
        final /* synthetic */ DecimalFormat f;
        final /* synthetic */ DecimalFormat g;

        z(EditText editText, TextView textView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2) {
            this.d = editText;
            this.e = textView;
            this.f = decimalFormat;
            this.g = decimalFormat2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            CalcolatriceVolante calcolatriceVolante;
            String str;
            int selectionEnd = this.d.getSelectionEnd();
            String string = this.d.getText().toString();
            if (CalcolatriceVolante.this.O.equals("Francese")) {
                CalcolatriceVolante calcolatriceVolante2 = CalcolatriceVolante.this;
                String[] strArrC = calcolatriceVolante2.F.C(this.d, this.e, "sin(", Boolean.valueOf(calcolatriceVolante2.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText = this.d;
                CalcolatriceVolante calcolatriceVolante3 = CalcolatriceVolante.this;
                editText.setText(calcolatriceVolante3.J.m(strArrC[0], calcolatriceVolante3.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrC[0];
                str = strArrC[1];
            } else if (CalcolatriceVolante.this.O.equals("Italiana")) {
                CalcolatriceVolante calcolatriceVolante4 = CalcolatriceVolante.this;
                String[] strArrD = calcolatriceVolante4.F.D(this.d, this.e, "sin(", Boolean.valueOf(calcolatriceVolante4.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                EditText editText2 = this.d;
                CalcolatriceVolante calcolatriceVolante5 = CalcolatriceVolante.this;
                editText2.setText(calcolatriceVolante5.J.m(strArrD[0], calcolatriceVolante5.O));
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrD[0];
                str = strArrD[1];
            } else {
                CalcolatriceVolante calcolatriceVolante6 = CalcolatriceVolante.this;
                String[] strArrB = calcolatriceVolante6.F.B(this.d, this.e, "sin(", Boolean.valueOf(calcolatriceVolante6.H), CalcolatriceVolante.this.getBaseContext(), this.f, Locale.US);
                this.d.setText(strArrB[0]);
                calcolatriceVolante = CalcolatriceVolante.this;
                calcolatriceVolante.P = strArrB[0];
                str = strArrB[1];
            }
            calcolatriceVolante.Q = str;
            CalcolatriceVolante calcolatriceVolante7 = CalcolatriceVolante.this;
            String strH0 = calcolatriceVolante7.F.h0(calcolatriceVolante7.P, calcolatriceVolante7.Y, calcolatriceVolante7.C, calcolatriceVolante7.J, this.g, calcolatriceVolante7.getBaseContext());
            TextView textView = this.e;
            CalcolatriceVolante calcolatriceVolante8 = CalcolatriceVolante.this;
            textView.setText(calcolatriceVolante8.J.m(strH0, calcolatriceVolante8.O));
            if (CalcolatriceVolante.this.X.equals("si")) {
                CalcolatriceVolante.this.c0(this.d);
            }
            CalcolatriceVolante.this.F.d(this.d, string, selectionEnd);
            CalcolatriceVolante calcolatriceVolante9 = CalcolatriceVolante.this;
            calcolatriceVolante9.F.n0(this.d, calcolatriceVolante9.G, calcolatriceVolante9.getBaseContext());
            if (CalcolatriceVolante.this.L.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    CalcolatriceVolante.this.S.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    CalcolatriceVolante.this.S.vibrate(20L);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(TextView textView) {
        String string = textView.getText().toString();
        SpannableString spannableString = new SpannableString(string);
        Matcher matcher = Pattern.compile("[\\\\^]|[×]|[%]|[+]|[-]|[÷]|[√]").matcher(string);
        while (matcher.find()) {
            int r2 = matcher.start();
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(this.T));
            if (r2 < 0) {
                break;
            } else {
                spannableString.setSpan(foregroundColorSpan, r2, (matcher.end() + r2) - matcher.start(), 33);
            }
        }
        textView.setText(spannableString);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024b  */
    @Override // androidx.appcompat.app.e, androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.j, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onCreate(android.os.Bundle r56) {
        /*
            Method dump skipped, instructions count: 1976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.CalcolatriceVolante.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0165 A[Catch: EmptyStackException -> 0x026d, NumberFormatException -> 0x0277, TRY_ENTER, TryCatch #2 {NumberFormatException -> 0x0277, EmptyStackException -> 0x026d, blocks: (B:34:0x00f4, B:37:0x0100, B:38:0x0112, B:43:0x0159, B:46:0x0165, B:47:0x0180, B:49:0x018a, B:50:0x01a5, B:53:0x01c5, B:55:0x01e5, B:56:0x01f1, B:57:0x01f9, B:58:0x020b, B:60:0x0211, B:63:0x0233, B:64:0x0242, B:65:0x024a, B:66:0x025f, B:39:0x0119, B:41:0x0123, B:42:0x014c), top: B:72:0x00f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0180 A[Catch: EmptyStackException -> 0x026d, NumberFormatException -> 0x0277, TryCatch #2 {NumberFormatException -> 0x0277, EmptyStackException -> 0x026d, blocks: (B:34:0x00f4, B:37:0x0100, B:38:0x0112, B:43:0x0159, B:46:0x0165, B:47:0x0180, B:49:0x018a, B:50:0x01a5, B:53:0x01c5, B:55:0x01e5, B:56:0x01f1, B:57:0x01f9, B:58:0x020b, B:60:0x0211, B:63:0x0233, B:64:0x0242, B:65:0x024a, B:66:0x025f, B:39:0x0119, B:41:0x0123, B:42:0x014c), top: B:72:0x00f4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void switchradgradV(android.view.View r11) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.CalcolatriceVolante.switchradgradV(android.view.View):void");
    }
}

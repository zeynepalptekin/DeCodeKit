package com.gp7.easycalculator;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class Setting extends androidx.appcompat.app.e {
    v C = new v();
    String D = "false";
    Intent E;
    String F;
    ExpandableListView G;
    private FirebaseAnalytics H;
    RadioButton I;
    RadioButton J;
    RadioButton K;
    RadioButton L;
    RadioButton M;
    RadioButton N;
    RadioButton O;
    RadioButton P;
    Button Q;
    Button R;
    Button S;
    Button T;
    Button U;
    Button V;
    Button W;
    Button X;
    CheckBox Y;
    CheckBox Z;
    CheckBox a0;
    CheckBox b0;
    CheckBox c0;
    String d0;
    String e0;
    String f0;
    Button g0;
    Button h0;
    RadioButton i0;
    RadioButton j0;
    RadioButton k0;
    RadioButton l0;
    RadioButton m0;
    RadioButton n0;
    RadioButton o0;
    RadioButton p0;
    RadioButton q0;
    RadioButton r0;
    String s0;
    String t0;
    String u0;
    String v0;
    Vibrator w0;
    String x0;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (Setting.this.u0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Setting.this.w0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Setting.this.w0.vibrate(20L);
                }
            }
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", Setting.this.getResources().getString(R.string.downloadApp) + "https://play.google.com/store/apps/details?id=" + com.gp7.easycalculator.b.f7045b);
            intent.setType("text/plain");
            Setting.this.startActivity(intent);
        }
    }

    class b implements View.OnClickListener {
        final /* synthetic */ SharedPreferences d;

        b(SharedPreferences sharedPreferences) {
            this.d = sharedPreferences;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Setting setting;
            Intent intent;
            if (Setting.this.u0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Setting.this.w0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Setting.this.w0.vibrate(20L);
                }
            }
            Setting setting2 = Setting.this;
            setting2.C.h(setting2, this.d);
            Setting setting3 = Setting.this;
            if (setting3.E == null) {
                if (this.d.getString(setting3.getString(R.string.Ultima_calcolatrice_scelta_si_tipo), "1").equals("1")) {
                    setting = Setting.this;
                    intent = new Intent(Setting.this, (Class<?>) MainActivity.class);
                } else if (this.d.getString(Setting.this.getString(R.string.Ultima_calcolatrice_scelta_si_tipo), "1").equals("2")) {
                    setting = Setting.this;
                    intent = new Intent(Setting.this, (Class<?>) CalcoloIVA.class);
                } else if (this.d.getString(Setting.this.getString(R.string.Ultima_calcolatrice_scelta_si_tipo), "1").equals("3")) {
                    setting = Setting.this;
                    intent = new Intent(Setting.this, (Class<?>) Convertitore.class);
                } else if (this.d.getString(Setting.this.getString(R.string.Ultima_calcolatrice_scelta_si_tipo), "1").equals("4")) {
                    setting = Setting.this;
                    intent = new Intent(Setting.this, (Class<?>) Sconto.class);
                } else if (this.d.getString(Setting.this.getString(R.string.Ultima_calcolatrice_scelta_si_tipo), "1").equals("5")) {
                    setting = Setting.this;
                    intent = new Intent(Setting.this, (Class<?>) Spesa.class);
                } else {
                    if (!this.d.getString(Setting.this.getString(R.string.Ultima_calcolatrice_scelta_si_tipo), "1").equals("6")) {
                        return;
                    }
                    setting = Setting.this;
                    intent = new Intent(Setting.this, (Class<?>) TipCalculator.class);
                }
                setting.E = intent;
                Setting.this.E.setFlags(67108864);
            }
        }
    }

    class c implements View.OnClickListener {

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int r2) {
            }
        }

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws IOException {
            String str;
            if (Setting.this.u0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Setting.this.w0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Setting.this.w0.vibrate(20L);
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(Setting.this);
            try {
                InputStream inputStreamOpen = Setting.this.getAssets().open("AL.txt");
                byte[] bArr = new byte[inputStreamOpen.available()];
                inputStreamOpen.read(bArr);
                inputStreamOpen.close();
                str = new String(bArr);
            } catch (IOException unused) {
                str = "Error, try again";
            }
            ScrollView scrollView = new ScrollView(Setting.this);
            LinearLayout linearLayout = new LinearLayout(Setting.this);
            linearLayout.setOrientation(1);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(40, 20, 40, 20);
            TextView textView = new TextView(Setting.this);
            textView.setText(str);
            TextView textView2 = new TextView(Setting.this);
            textView2.setText("Apache License\nVersion 2.0, January 2004");
            linearLayout.addView(textView2, layoutParams);
            TextView textView3 = new TextView(Setting.this);
            textView3.setText(Html.fromHtml("<a href=http://www.apache.org/licenses/>http://www.apache.org/licenses/</a>"));
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
            linearLayout.addView(textView3, layoutParams);
            linearLayout.addView(textView, layoutParams);
            scrollView.addView(linearLayout);
            builder.setTitle("Open source licenses");
            builder.setView(scrollView);
            builder.setNegativeButton(Setting.this.getResources().getString(R.string.calcolo_iva_messaggio_indietro), new a());
            builder.create().show();
        }
    }

    class d implements DialogInterface.OnClickListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r2) {
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Setting.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://docs.google.com/document/d/e/2PACX-1vTrON8VMNbc6wFxoczLJHJH68mmyD9GYix0x8ZvOWx0Y9TNpSE57FZx7L5R0TCwEuiRJ-rtimgEC_qf/pub")));
            } catch (Exception unused) {
                Toast.makeText(Setting.this, "error", 0).show();
            }
        }
    }

    class f implements View.OnClickListener {
        final /* synthetic */ z d;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int r2) {
            }
        }

        f(z zVar) {
            this.d = zVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (Setting.this.u0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Setting.this.w0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Setting.this.w0.vibrate(20L);
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(Setting.this);
            View viewInflate = ((LayoutInflater) Setting.this.getSystemService("layout_inflater")).inflate(R.layout.exp_faq, (ViewGroup) null);
            Setting.this.G = (ExpandableListView) viewInflate.findViewById(R.id.listFAQ);
            Setting.this.G.setAdapter(this.d);
            builder.setTitle(Setting.this.getResources().getString(R.string.FaqTitle));
            builder.setView(viewInflate);
            builder.setCancelable(false);
            builder.setPositiveButton(Setting.this.getResources().getString(R.string.CloseFaq), new a());
            builder.create().show();
        }
    }

    class g implements View.OnClickListener {
        final /* synthetic */ TextView d;
        final /* synthetic */ SharedPreferences.Editor e;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int r2) {
            }
        }

        class b implements DialogInterface.OnClickListener {
            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int r4) {
                SharedPreferences.Editor editor;
                String string;
                String str;
                if (Setting.this.i0.isChecked()) {
                    g gVar = g.this;
                    gVar.d.setText(Setting.this.getResources().getString(R.string.opencalculatorscelta));
                    g gVar2 = g.this;
                    editor = gVar2.e;
                    string = Setting.this.getString(R.string.Ultima_calcolatrice_scelta);
                    str = "si";
                } else if (Setting.this.j0.isChecked()) {
                    g gVar3 = g.this;
                    gVar3.d.setText(Setting.this.getResources().getString(R.string.opencalculatorscelta3));
                    g gVar4 = g.this;
                    editor = gVar4.e;
                    string = Setting.this.getString(R.string.Ultima_calcolatrice_scelta);
                    str = "vat";
                } else if (Setting.this.k0.isChecked()) {
                    g gVar5 = g.this;
                    gVar5.d.setText(Setting.this.getResources().getString(R.string.opencalculatorscelta2));
                    g gVar6 = g.this;
                    editor = gVar6.e;
                    string = Setting.this.getString(R.string.Ultima_calcolatrice_scelta);
                    str = "easy";
                } else if (Setting.this.l0.isChecked()) {
                    g gVar7 = g.this;
                    gVar7.d.setText(Setting.this.getResources().getString(R.string.TITLEconverter));
                    g gVar8 = g.this;
                    editor = gVar8.e;
                    string = Setting.this.getString(R.string.Ultima_calcolatrice_scelta);
                    str = "converter";
                } else if (Setting.this.m0.isChecked()) {
                    g gVar9 = g.this;
                    gVar9.d.setText(Setting.this.getResources().getString(R.string.gotoSconto));
                    g gVar10 = g.this;
                    editor = gVar10.e;
                    string = Setting.this.getString(R.string.Ultima_calcolatrice_scelta);
                    str = "sconto";
                } else if (Setting.this.n0.isChecked()) {
                    g gVar11 = g.this;
                    gVar11.d.setText(Setting.this.getResources().getString(R.string.menuTospesa));
                    g gVar12 = g.this;
                    editor = gVar12.e;
                    string = Setting.this.getString(R.string.Ultima_calcolatrice_scelta);
                    str = "spesa";
                } else {
                    if (!Setting.this.o0.isChecked()) {
                        return;
                    }
                    g gVar13 = g.this;
                    gVar13.d.setText(Setting.this.getResources().getString(R.string.menutip));
                    g gVar14 = g.this;
                    editor = gVar14.e;
                    string = Setting.this.getString(R.string.Ultima_calcolatrice_scelta);
                    str = "tip";
                }
                editor.putString(string, str);
                g.this.e.apply();
            }
        }

        g(TextView textView, SharedPreferences.Editor editor) {
            this.d = textView;
            this.e = editor;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RadioButton radioButton;
            if (Setting.this.u0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Setting.this.w0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Setting.this.w0.vibrate(20L);
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(Setting.this);
            View viewInflate = ((LayoutInflater) Setting.this.getSystemService("layout_inflater")).inflate(R.layout.order_calculator, (ViewGroup) null);
            Setting.this.i0 = (RadioButton) viewInflate.findViewById(R.id.lastCalcolatorRadioButton);
            Setting.this.j0 = (RadioButton) viewInflate.findViewById(R.id.VatCalcolatorRadioButton);
            Setting.this.k0 = (RadioButton) viewInflate.findViewById(R.id.EasyCalcolatorRadioButton);
            Setting.this.l0 = (RadioButton) viewInflate.findViewById(R.id.ConverterCalcolatorRadioButton);
            Setting.this.m0 = (RadioButton) viewInflate.findViewById(R.id.ScontoCalcolatorRadioButton);
            Setting.this.n0 = (RadioButton) viewInflate.findViewById(R.id.SpesaCalcolatorRadioButton);
            Setting.this.o0 = (RadioButton) viewInflate.findViewById(R.id.TipCalcolatorRadioButton);
            switch (Setting.this.t0) {
                case "si":
                    radioButton = Setting.this.i0;
                    break;
                case "vat":
                    radioButton = Setting.this.j0;
                    break;
                case "easy":
                    radioButton = Setting.this.k0;
                    break;
                case "converter":
                    radioButton = Setting.this.l0;
                    break;
                case "sconto":
                    radioButton = Setting.this.m0;
                    break;
                case "spesa":
                    radioButton = Setting.this.n0;
                    break;
                case "tip":
                    radioButton = Setting.this.o0;
                    break;
                default:
                    builder.setTitle(Setting.this.getResources().getString(R.string.titoloalertdialogSceltaCalcolatrice));
                    builder.setView(viewInflate);
                    builder.setCancelable(false);
                    builder.setNegativeButton(Setting.this.getResources().getString(R.string.calcolo_iva_messaggio_indietro), new a());
                    builder.setPositiveButton(Setting.this.getResources().getString(R.string.salvasceltalaunchercalculator), new b());
                    builder.create().show();
            }
            radioButton.setChecked(true);
            builder.setTitle(Setting.this.getResources().getString(R.string.titoloalertdialogSceltaCalcolatrice));
            builder.setView(viewInflate);
            builder.setCancelable(false);
            builder.setNegativeButton(Setting.this.getResources().getString(R.string.calcolo_iva_messaggio_indietro), new a());
            builder.setPositiveButton(Setting.this.getResources().getString(R.string.salvasceltalaunchercalculator), new b());
            builder.create().show();
        }
    }

    class h implements View.OnClickListener {
        final /* synthetic */ TextView d;
        final /* synthetic */ SharedPreferences.Editor e;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int r2) {
            }
        }

        class b implements DialogInterface.OnClickListener {
            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int r4) {
                SharedPreferences.Editor editor;
                String string;
                String str;
                if (Setting.this.i0.isChecked()) {
                    h hVar = h.this;
                    hVar.d.setText(Setting.this.getResources().getString(R.string.opencalculatorscelta));
                    h hVar2 = h.this;
                    editor = hVar2.e;
                    string = Setting.this.getString(R.string.Ultima_calcolatrice_scelta);
                    str = "si";
                } else if (Setting.this.j0.isChecked()) {
                    h hVar3 = h.this;
                    hVar3.d.setText(Setting.this.getResources().getString(R.string.opencalculatorscelta3));
                    h hVar4 = h.this;
                    editor = hVar4.e;
                    string = Setting.this.getString(R.string.Ultima_calcolatrice_scelta);
                    str = "vat";
                } else if (Setting.this.k0.isChecked()) {
                    h hVar5 = h.this;
                    hVar5.d.setText(Setting.this.getResources().getString(R.string.opencalculatorscelta2));
                    h hVar6 = h.this;
                    editor = hVar6.e;
                    string = Setting.this.getString(R.string.Ultima_calcolatrice_scelta);
                    str = "easy";
                } else if (Setting.this.l0.isChecked()) {
                    h hVar7 = h.this;
                    hVar7.d.setText(Setting.this.getResources().getString(R.string.TITLEconverter));
                    h hVar8 = h.this;
                    editor = hVar8.e;
                    string = Setting.this.getString(R.string.Ultima_calcolatrice_scelta);
                    str = "converter";
                } else if (Setting.this.m0.isChecked()) {
                    h hVar9 = h.this;
                    hVar9.d.setText(Setting.this.getResources().getString(R.string.gotoSconto));
                    h hVar10 = h.this;
                    editor = hVar10.e;
                    string = Setting.this.getString(R.string.Ultima_calcolatrice_scelta);
                    str = "sconto";
                } else if (Setting.this.n0.isChecked()) {
                    h hVar11 = h.this;
                    hVar11.d.setText(Setting.this.getResources().getString(R.string.menuTospesa));
                    h hVar12 = h.this;
                    editor = hVar12.e;
                    string = Setting.this.getString(R.string.Ultima_calcolatrice_scelta);
                    str = "spesa";
                } else {
                    if (!Setting.this.o0.isChecked()) {
                        return;
                    }
                    h hVar13 = h.this;
                    hVar13.d.setText(Setting.this.getResources().getString(R.string.menutip));
                    h hVar14 = h.this;
                    editor = hVar14.e;
                    string = Setting.this.getString(R.string.Ultima_calcolatrice_scelta);
                    str = "tip";
                }
                editor.putString(string, str);
                h.this.e.apply();
            }
        }

        h(TextView textView, SharedPreferences.Editor editor) {
            this.d = textView;
            this.e = editor;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RadioButton radioButton;
            if (Setting.this.u0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Setting.this.w0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Setting.this.w0.vibrate(20L);
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(Setting.this);
            View viewInflate = ((LayoutInflater) Setting.this.getSystemService("layout_inflater")).inflate(R.layout.order_calculator, (ViewGroup) null);
            Setting.this.i0 = (RadioButton) viewInflate.findViewById(R.id.lastCalcolatorRadioButton);
            Setting.this.j0 = (RadioButton) viewInflate.findViewById(R.id.VatCalcolatorRadioButton);
            Setting.this.k0 = (RadioButton) viewInflate.findViewById(R.id.EasyCalcolatorRadioButton);
            Setting.this.l0 = (RadioButton) viewInflate.findViewById(R.id.ConverterCalcolatorRadioButton);
            Setting.this.m0 = (RadioButton) viewInflate.findViewById(R.id.ScontoCalcolatorRadioButton);
            Setting.this.n0 = (RadioButton) viewInflate.findViewById(R.id.SpesaCalcolatorRadioButton);
            Setting.this.o0 = (RadioButton) viewInflate.findViewById(R.id.TipCalcolatorRadioButton);
            switch (Setting.this.t0) {
                case "si":
                    radioButton = Setting.this.i0;
                    break;
                case "vat":
                    radioButton = Setting.this.j0;
                    break;
                case "easy":
                    radioButton = Setting.this.k0;
                    break;
                case "converter":
                    radioButton = Setting.this.l0;
                    break;
                case "sconto":
                    radioButton = Setting.this.m0;
                    break;
                case "spesa":
                    radioButton = Setting.this.n0;
                    break;
                case "tip":
                    radioButton = Setting.this.o0;
                    break;
                default:
                    builder.setTitle(Setting.this.getResources().getString(R.string.titoloalertdialogSceltaCalcolatrice));
                    builder.setView(viewInflate);
                    builder.setCancelable(false);
                    builder.setNegativeButton(Setting.this.getResources().getString(R.string.calcolo_iva_messaggio_indietro), new a());
                    builder.setPositiveButton(Setting.this.getResources().getString(R.string.salvasceltalaunchercalculator), new b());
                    builder.create().show();
            }
            radioButton.setChecked(true);
            builder.setTitle(Setting.this.getResources().getString(R.string.titoloalertdialogSceltaCalcolatrice));
            builder.setView(viewInflate);
            builder.setCancelable(false);
            builder.setNegativeButton(Setting.this.getResources().getString(R.string.calcolo_iva_messaggio_indietro), new a());
            builder.setPositiveButton(Setting.this.getResources().getString(R.string.salvasceltalaunchercalculator), new b());
            builder.create().show();
        }
    }

    class i implements View.OnClickListener {
        final /* synthetic */ SharedPreferences.Editor d;
        final /* synthetic */ TextView e;
        final /* synthetic */ SharedPreferences f;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int r2) {
            }
        }

        class b implements DialogInterface.OnClickListener {
            b() {
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0089  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0195 A[ORIG_RETURN, RETURN] */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onClick(android.content.DialogInterface r4, int r5) {
                /*
                    Method dump skipped, instructions count: 406
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.Setting.i.b.onClick(android.content.DialogInterface, int):void");
            }
        }

        i(SharedPreferences.Editor editor, TextView textView, SharedPreferences sharedPreferences) {
            this.d = editor;
            this.e = textView;
            this.f = sharedPreferences;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RadioButton radioButton;
            char c2 = 65535;
            if (Setting.this.u0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Setting.this.w0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Setting.this.w0.vibrate(20L);
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(Setting.this);
            View viewInflate = ((LayoutInflater) Setting.this.getSystemService("layout_inflater")).inflate(R.layout.notazione_calculator, (ViewGroup) null);
            Setting.this.p0 = (RadioButton) viewInflate.findViewById(R.id.predefinita);
            Setting.this.q0 = (RadioButton) viewInflate.findViewById(R.id.italia);
            Setting.this.r0 = (RadioButton) viewInflate.findViewById(R.id.francia);
            String str = Setting.this.s0;
            int r3 = str.hashCode();
            if (r3 != -1579458611) {
                if (r3 != -1085510111) {
                    if (r3 == 1127340161 && str.equals("Italiana")) {
                        c2 = 1;
                    }
                } else if (str.equals("Default")) {
                    c2 = 0;
                }
            } else if (str.equals("Francese")) {
                c2 = 2;
            }
            if (c2 == 0) {
                radioButton = Setting.this.p0;
            } else {
                if (c2 != 1) {
                    if (c2 == 2) {
                        radioButton = Setting.this.r0;
                    }
                    builder.setTitle(Setting.this.getResources().getString(R.string.titoloalertdialogSceltaNotazione));
                    builder.setView(viewInflate);
                    builder.setCancelable(false);
                    builder.setNegativeButton(Setting.this.getResources().getString(R.string.calcolo_iva_messaggio_indietro), new a());
                    builder.setPositiveButton(Setting.this.getResources().getString(R.string.salvasceltalaunchercalculator), new b());
                    builder.create().show();
                }
                radioButton = Setting.this.q0;
            }
            radioButton.setChecked(true);
            builder.setTitle(Setting.this.getResources().getString(R.string.titoloalertdialogSceltaNotazione));
            builder.setView(viewInflate);
            builder.setCancelable(false);
            builder.setNegativeButton(Setting.this.getResources().getString(R.string.calcolo_iva_messaggio_indietro), new a());
            builder.setPositiveButton(Setting.this.getResources().getString(R.string.salvasceltalaunchercalculator), new b());
            builder.create().show();
        }
    }

    class j implements View.OnClickListener {
        final /* synthetic */ SharedPreferences.Editor d;
        final /* synthetic */ TextView e;
        final /* synthetic */ SharedPreferences f;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int r2) {
            }
        }

        class b implements DialogInterface.OnClickListener {
            b() {
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0089  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0195 A[ORIG_RETURN, RETURN] */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onClick(android.content.DialogInterface r4, int r5) {
                /*
                    Method dump skipped, instructions count: 406
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.Setting.j.b.onClick(android.content.DialogInterface, int):void");
            }
        }

        j(SharedPreferences.Editor editor, TextView textView, SharedPreferences sharedPreferences) {
            this.d = editor;
            this.e = textView;
            this.f = sharedPreferences;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RadioButton radioButton;
            char c2 = 65535;
            if (Setting.this.u0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Setting.this.w0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Setting.this.w0.vibrate(20L);
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(Setting.this);
            View viewInflate = ((LayoutInflater) Setting.this.getSystemService("layout_inflater")).inflate(R.layout.notazione_calculator, (ViewGroup) null);
            Setting.this.p0 = (RadioButton) viewInflate.findViewById(R.id.predefinita);
            Setting.this.q0 = (RadioButton) viewInflate.findViewById(R.id.italia);
            Setting.this.r0 = (RadioButton) viewInflate.findViewById(R.id.francia);
            String str = Setting.this.s0;
            int r3 = str.hashCode();
            if (r3 != -1579458611) {
                if (r3 != -1085510111) {
                    if (r3 == 1127340161 && str.equals("Italiana")) {
                        c2 = 1;
                    }
                } else if (str.equals("Default")) {
                    c2 = 0;
                }
            } else if (str.equals("Francese")) {
                c2 = 2;
            }
            if (c2 == 0) {
                radioButton = Setting.this.p0;
            } else {
                if (c2 != 1) {
                    if (c2 == 2) {
                        radioButton = Setting.this.r0;
                    }
                    builder.setTitle(Setting.this.getResources().getString(R.string.titoloalertdialogSceltaNotazione));
                    builder.setView(viewInflate);
                    builder.setCancelable(false);
                    builder.setNegativeButton(Setting.this.getResources().getString(R.string.calcolo_iva_messaggio_indietro), new a());
                    builder.setPositiveButton(Setting.this.getResources().getString(R.string.salvasceltalaunchercalculator), new b());
                    builder.create().show();
                }
                radioButton = Setting.this.q0;
            }
            radioButton.setChecked(true);
            builder.setTitle(Setting.this.getResources().getString(R.string.titoloalertdialogSceltaNotazione));
            builder.setView(viewInflate);
            builder.setCancelable(false);
            builder.setNegativeButton(Setting.this.getResources().getString(R.string.calcolo_iva_messaggio_indietro), new a());
            builder.setPositiveButton(Setting.this.getResources().getString(R.string.salvasceltalaunchercalculator), new b());
            builder.create().show();
        }
    }

    class k implements View.OnClickListener {
        final /* synthetic */ TextView d;
        final /* synthetic */ SharedPreferences.Editor e;
        final /* synthetic */ SharedPreferences f;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int r2) {
            }
        }

        class b implements DialogInterface.OnClickListener {
            b() {
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x011e  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x0205 A[ORIG_RETURN, RETURN] */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onClick(android.content.DialogInterface r9, int r10) {
                /*
                    Method dump skipped, instructions count: 518
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.Setting.k.b.onClick(android.content.DialogInterface, int):void");
            }
        }

        k(TextView textView, SharedPreferences.Editor editor, SharedPreferences sharedPreferences) {
            this.d = textView;
            this.e = editor;
            this.f = sharedPreferences;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RadioButton radioButton;
            if (Setting.this.u0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Setting.this.w0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Setting.this.w0.vibrate(20L);
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(Setting.this);
            View viewInflate = ((LayoutInflater) Setting.this.getSystemService("layout_inflater")).inflate(R.layout.number_decimasli, (ViewGroup) null);
            Setting.this.I = (RadioButton) viewInflate.findViewById(R.id.unoD);
            Setting.this.J = (RadioButton) viewInflate.findViewById(R.id.dueD);
            Setting.this.K = (RadioButton) viewInflate.findViewById(R.id.treD);
            Setting.this.L = (RadioButton) viewInflate.findViewById(R.id.quattroD);
            Setting.this.M = (RadioButton) viewInflate.findViewById(R.id.cinqueD);
            Setting.this.N = (RadioButton) viewInflate.findViewById(R.id.seiD);
            Setting.this.O = (RadioButton) viewInflate.findViewById(R.id.setteD);
            Setting.this.P = (RadioButton) viewInflate.findViewById(R.id.ottoD);
            switch (Setting.this.d0) {
                case "1":
                    radioButton = Setting.this.I;
                    break;
                case "2":
                    radioButton = Setting.this.J;
                    break;
                case "3":
                    radioButton = Setting.this.K;
                    break;
                case "4":
                    radioButton = Setting.this.L;
                    break;
                case "5":
                    radioButton = Setting.this.M;
                    break;
                case "6":
                    radioButton = Setting.this.N;
                    break;
                case "7":
                    radioButton = Setting.this.O;
                    break;
                case "8":
                    radioButton = Setting.this.P;
                    break;
                default:
                    builder.setTitle(Setting.this.getResources().getString(R.string.Num_decbottone));
                    builder.setView(viewInflate);
                    builder.setCancelable(false);
                    builder.setNegativeButton(Setting.this.getResources().getString(R.string.calcolo_iva_messaggio_indietro), new a());
                    builder.setPositiveButton(Setting.this.getResources().getString(R.string.salvasceltalaunchercalculator), new b());
                    builder.create().show();
            }
            radioButton.setChecked(true);
            builder.setTitle(Setting.this.getResources().getString(R.string.Num_decbottone));
            builder.setView(viewInflate);
            builder.setCancelable(false);
            builder.setNegativeButton(Setting.this.getResources().getString(R.string.calcolo_iva_messaggio_indietro), new a());
            builder.setPositiveButton(Setting.this.getResources().getString(R.string.salvasceltalaunchercalculator), new b());
            builder.create().show();
        }
    }

    class l implements View.OnClickListener {
        final /* synthetic */ TextView d;
        final /* synthetic */ SharedPreferences.Editor e;
        final /* synthetic */ SharedPreferences f;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int r2) {
            }
        }

        class b implements DialogInterface.OnClickListener {
            b() {
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x011e  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x0205 A[ORIG_RETURN, RETURN] */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onClick(android.content.DialogInterface r9, int r10) {
                /*
                    Method dump skipped, instructions count: 518
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.Setting.l.b.onClick(android.content.DialogInterface, int):void");
            }
        }

        l(TextView textView, SharedPreferences.Editor editor, SharedPreferences sharedPreferences) {
            this.d = textView;
            this.e = editor;
            this.f = sharedPreferences;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RadioButton radioButton;
            if (Setting.this.u0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Setting.this.w0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Setting.this.w0.vibrate(20L);
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(Setting.this);
            View viewInflate = ((LayoutInflater) Setting.this.getSystemService("layout_inflater")).inflate(R.layout.number_decimasli, (ViewGroup) null);
            Setting.this.I = (RadioButton) viewInflate.findViewById(R.id.unoD);
            Setting.this.J = (RadioButton) viewInflate.findViewById(R.id.dueD);
            Setting.this.K = (RadioButton) viewInflate.findViewById(R.id.treD);
            Setting.this.L = (RadioButton) viewInflate.findViewById(R.id.quattroD);
            Setting.this.M = (RadioButton) viewInflate.findViewById(R.id.cinqueD);
            Setting.this.N = (RadioButton) viewInflate.findViewById(R.id.seiD);
            Setting.this.O = (RadioButton) viewInflate.findViewById(R.id.setteD);
            Setting.this.P = (RadioButton) viewInflate.findViewById(R.id.ottoD);
            switch (Setting.this.d0) {
                case "1":
                    radioButton = Setting.this.I;
                    break;
                case "2":
                    radioButton = Setting.this.J;
                    break;
                case "3":
                    radioButton = Setting.this.K;
                    break;
                case "4":
                    radioButton = Setting.this.L;
                    break;
                case "5":
                    radioButton = Setting.this.M;
                    break;
                case "6":
                    radioButton = Setting.this.N;
                    break;
                case "7":
                    radioButton = Setting.this.O;
                    break;
                case "8":
                    radioButton = Setting.this.P;
                    break;
                default:
                    builder.setTitle(Setting.this.getResources().getString(R.string.Num_decbottone));
                    builder.setView(viewInflate);
                    builder.setCancelable(false);
                    builder.setNegativeButton(Setting.this.getResources().getString(R.string.calcolo_iva_messaggio_indietro), new a());
                    builder.setPositiveButton(Setting.this.getResources().getString(R.string.salvasceltalaunchercalculator), new b());
                    builder.create().show();
            }
            radioButton.setChecked(true);
            builder.setTitle(Setting.this.getResources().getString(R.string.Num_decbottone));
            builder.setView(viewInflate);
            builder.setCancelable(false);
            builder.setNegativeButton(Setting.this.getResources().getString(R.string.calcolo_iva_messaggio_indietro), new a());
            builder.setPositiveButton(Setting.this.getResources().getString(R.string.salvasceltalaunchercalculator), new b());
            builder.create().show();
        }
    }

    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (Setting.this.u0.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Setting.this.w0.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    Setting.this.w0.vibrate(20L);
                }
            }
            Setting.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + com.gp7.easycalculator.b.f7045b)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0236 A[PHI: r0
  0x0236: PHI (r0v12 int) = (r0v4 int), (r0v14 int) binds: [B:43:0x0234, B:13:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x023e A[PHI: r0
  0x023e: PHI (r0v13 int) = (r0v4 int), (r0v14 int) binds: [B:43:0x0234, B:13:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void SettingCB(android.view.View r6) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.Setting.SettingCB(android.view.View):void");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Intent intent = this.E;
        if (intent != null) {
            startActivity(intent);
        }
        finish();
        super.onBackPressed();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x06df A[LOOP:0: B:185:0x06dd->B:186:0x06df, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03b0  */
    @Override // androidx.appcompat.app.e, androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.j, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onCreate(android.os.Bundle r38) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 2182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.Setting.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            Intent intent = this.E;
            if (intent != null) {
                startActivity(intent);
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void resp(View view) {
        if (this.u0.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.w0.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.w0.vibrate(20L);
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(getResources().getString(R.string.ResponsabilityMessage));
        builder.setTitle(getResources().getString(R.string.InformationResponsability));
        builder.setCancelable(false);
        builder.setPositiveButton("Ok", new d());
        builder.create().show();
    }
}

package com.gp7.easycalculator;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import com.google.ads.consent.AdProvider;
import com.google.ads.consent.ConsentInfoUpdateListener;
import com.google.ads.consent.ConsentInformation;
import com.google.ads.consent.ConsentStatus;

/* loaded from: classes.dex */
public class MyLauncherActivity extends androidx.appcompat.app.e {
    Context C = this;
    String D;
    String E;
    String F;
    String G;
    SharedPreferences H;
    SharedPreferences.Editor I;
    private androidx.appcompat.app.d J;
    private androidx.appcompat.app.d K;
    private androidx.appcompat.app.d L;
    private androidx.appcompat.app.d M;
    private androidx.appcompat.app.d N;

    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r4) {
            MyLauncherActivity myLauncherActivity = MyLauncherActivity.this;
            myLauncherActivity.b0(myLauncherActivity.D, myLauncherActivity.E);
            MyLauncherActivity myLauncherActivity2 = MyLauncherActivity.this;
            myLauncherActivity2.I.putString(myLauncherActivity2.getString(R.string.privacynoteuro), "SI");
            MyLauncherActivity myLauncherActivity3 = MyLauncherActivity.this;
            myLauncherActivity3.I.putString(myLauncherActivity3.getString(R.string.gdprPreferences), "PERSONALIZED");
            MyLauncherActivity.this.I.apply();
            dialogInterface.cancel();
        }
    }

    class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r2) {
            MyLauncherActivity.this.finish();
            dialogInterface.cancel();
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7024a;

        static {
            int[] r0 = new int[ConsentStatus.values().length];
            f7024a = r0;
            try {
                r0[ConsentStatus.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7024a[ConsentStatus.NON_PERSONALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7024a[ConsentStatus.PERSONALIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    class d implements ConsentInfoUpdateListener {
        d() {
        }

        @Override // com.google.ads.consent.ConsentInfoUpdateListener
        public void a(String str) {
            Log.e("GDPR(infoStatus)", "status failed to update: " + str);
            MyLauncherActivity myLauncherActivity = MyLauncherActivity.this;
            myLauncherActivity.b0(myLauncherActivity.D, myLauncherActivity.E);
        }

        @Override // com.google.ads.consent.ConsentInfoUpdateListener
        public void b(ConsentStatus consentStatus) {
            Log.e("GDPR(infoStatus)", "User's consent status successfully updated: " + consentStatus.toString());
            if (ConsentInformation.g(MyLauncherActivity.this.C).j()) {
                Log.e("GDPR(infoStatus)", "User is from EU");
                int r6 = c.f7024a[consentStatus.ordinal()];
                if (r6 == 1) {
                    Log.e("GDPR(infoStatus)", "UNKNOWN");
                    if (MyLauncherActivity.this.F.equals("UNKNOWN")) {
                        Log.e("GDPR(infoStatus)", "raccolta della scelta via consent dialog");
                        MyLauncherActivity myLauncherActivity = MyLauncherActivity.this;
                        myLauncherActivity.l0(myLauncherActivity.C);
                        return;
                    } else if (MyLauncherActivity.this.F.equals("NON_PERSONALIZED")) {
                        Log.e("GDPR(infoStatus)", "status raccolto precedentemente ,scelta : NOT PERSONALIZED");
                        ConsentInformation.g(MyLauncherActivity.this.C).s(ConsentStatus.NON_PERSONALIZED);
                        MyLauncherActivity myLauncherActivity2 = MyLauncherActivity.this;
                        myLauncherActivity2.I.putString(myLauncherActivity2.getString(R.string.gdprPreferences), "NON_PERSONALIZED");
                    } else if (MyLauncherActivity.this.F.equals("PERSONALIZED")) {
                        Log.e("GDPR(infoStatus)", "status raccolto precedentemente ,scelta : PERSONALIZED");
                        ConsentInformation.g(MyLauncherActivity.this.C).s(ConsentStatus.PERSONALIZED);
                        MyLauncherActivity myLauncherActivity3 = MyLauncherActivity.this;
                        myLauncherActivity3.I.putString(myLauncherActivity3.getString(R.string.gdprPreferences), "PERSONALIZED");
                    }
                } else if (r6 == 2) {
                    Log.e("GDPR(infoStatus)", "NOT PERSONALIZED");
                    MyLauncherActivity myLauncherActivity22 = MyLauncherActivity.this;
                    myLauncherActivity22.I.putString(myLauncherActivity22.getString(R.string.gdprPreferences), "NON_PERSONALIZED");
                } else {
                    if (r6 != 3) {
                        return;
                    }
                    Log.e("GDPR(infoStatus)", "PERSONALIZED");
                    MyLauncherActivity myLauncherActivity32 = MyLauncherActivity.this;
                    myLauncherActivity32.I.putString(myLauncherActivity32.getString(R.string.gdprPreferences), "PERSONALIZED");
                }
                MyLauncherActivity.this.I.apply();
            } else {
                Log.e("GDPR(infoStatus)", "User is NOT from EU");
                if (MyLauncherActivity.this.G.equals("NO")) {
                    MyLauncherActivity myLauncherActivity4 = MyLauncherActivity.this;
                    myLauncherActivity4.e0(myLauncherActivity4.C);
                    return;
                }
            }
            MyLauncherActivity myLauncherActivity5 = MyLauncherActivity.this;
            myLauncherActivity5.b0(myLauncherActivity5.D, myLauncherActivity5.E);
        }
    }

    class e implements DialogInterface.OnClickListener {
        e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r2) {
            MyLauncherActivity.this.finish();
        }
    }

    class f implements View.OnClickListener {
        final /* synthetic */ Context d;

        f(Context context) {
            this.d = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyLauncherActivity.this.k0(this.d);
        }
    }

    class g implements View.OnClickListener {
        final /* synthetic */ Context d;

        g(Context context) {
            this.d = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyLauncherActivity.this.c0(this.d);
        }
    }

    class h implements View.OnClickListener {
        final /* synthetic */ Context d;

        h(Context context) {
            this.d = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyLauncherActivity.this.d0(this.d);
        }
    }

    class i implements DialogInterface.OnClickListener {
        final /* synthetic */ Context d;

        i(Context context) {
            this.d = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r4) {
            ConsentInformation.g(this.d).s(ConsentStatus.PERSONALIZED);
            MyLauncherActivity myLauncherActivity = MyLauncherActivity.this;
            myLauncherActivity.I.putString(myLauncherActivity.getString(R.string.gdprPreferences), "PERSONALIZED");
            MyLauncherActivity.this.I.apply();
            dialogInterface.cancel();
            MyLauncherActivity myLauncherActivity2 = MyLauncherActivity.this;
            myLauncherActivity2.b0(myLauncherActivity2.D, myLauncherActivity2.E);
        }
    }

    class j implements DialogInterface.OnClickListener {
        j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r2) {
            dialogInterface.cancel();
        }
    }

    class k implements DialogInterface.OnClickListener {
        final /* synthetic */ Context d;

        k(Context context) {
            this.d = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r4) {
            ConsentInformation.g(this.d).s(ConsentStatus.NON_PERSONALIZED);
            MyLauncherActivity myLauncherActivity = MyLauncherActivity.this;
            myLauncherActivity.I.putString(myLauncherActivity.getString(R.string.gdprPreferences), "NON_PERSONALIZED");
            MyLauncherActivity.this.I.apply();
            dialogInterface.cancel();
            MyLauncherActivity myLauncherActivity2 = MyLauncherActivity.this;
            myLauncherActivity2.b0(myLauncherActivity2.D, myLauncherActivity2.E);
        }
    }

    class l implements DialogInterface.OnClickListener {
        l() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r2) {
            dialogInterface.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b0(java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.MyLauncherActivity.b0(java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(Context context) {
        try {
            this.I = this.H.edit();
            d.a aVar = new d.a(context);
            ScrollView scrollView = new ScrollView(context);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(40, 20, 40, 20);
            TextView textView = new TextView(context);
            textView.setText(R.string.privacyYES);
            linearLayout.addView(textView, layoutParams);
            TextView textView2 = new TextView(context);
            textView2.setText(Html.fromHtml("<a href=https://docs.google.com/document/d/e/2PACX-1vTrON8VMNbc6wFxoczLJHJH68mmyD9GYix0x8ZvOWx0Y9TNpSE57FZx7L5R0TCwEuiRJ-rtimgEC_qf/pub>Privacy Policy</a>"));
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            linearLayout.addView(textView2, layoutParams);
            scrollView.addView(linearLayout);
            aVar.K(getResources().getString(R.string.app_name) + " (" + getResources().getString(R.string.titoloalertprivacy) + ")");
            aVar.M(scrollView).C(getResources().getString(R.string.tasto_accetto_privacy), new i(context));
            aVar.s(getResources().getString(R.string.CloseFaq), new j());
            androidx.appcompat.app.d dVarA = aVar.a();
            this.K = dVarA;
            dVarA.show();
        } catch (WindowManager.BadTokenException unused) {
            b0(this.D, this.E);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(Context context) {
        try {
            this.I = this.H.edit();
            d.a aVar = new d.a(context);
            ScrollView scrollView = new ScrollView(context);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(40, 20, 40, 20);
            TextView textView = new TextView(context);
            textView.setText(R.string.privacyNO);
            linearLayout.addView(textView, layoutParams);
            TextView textView2 = new TextView(context);
            textView2.setText(Html.fromHtml("<a href=https://docs.google.com/document/d/e/2PACX-1vTrON8VMNbc6wFxoczLJHJH68mmyD9GYix0x8ZvOWx0Y9TNpSE57FZx7L5R0TCwEuiRJ-rtimgEC_qf/pub>Privacy Policy</a>"));
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            linearLayout.addView(textView2, layoutParams);
            scrollView.addView(linearLayout);
            aVar.K(getResources().getString(R.string.app_name) + " (" + getResources().getString(R.string.titoloalertprivacy) + ")");
            aVar.M(scrollView).C(getResources().getString(R.string.tasto_accetto_privacy), new k(context));
            aVar.s(getResources().getString(R.string.CloseFaq), new l());
            androidx.appcompat.app.d dVarA = aVar.a();
            this.L = dVarA;
            dVarA.show();
        } catch (WindowManager.BadTokenException unused) {
            b0(this.D, this.E);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(Context context) {
        try {
            this.I = this.H.edit();
            d.a aVar = new d.a(context);
            ScrollView scrollView = new ScrollView(context);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(40, 20, 40, 20);
            TextView textView = new TextView(context);
            textView.setText(R.string.privacynoteurope);
            linearLayout.addView(textView, layoutParams);
            TextView textView2 = new TextView(context);
            textView2.setText(Html.fromHtml("<a href=https://docs.google.com/document/d/e/2PACX-1vTrON8VMNbc6wFxoczLJHJH68mmyD9GYix0x8ZvOWx0Y9TNpSE57FZx7L5R0TCwEuiRJ-rtimgEC_qf/pub>Privacy Policy</a>"));
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            linearLayout.addView(textView2, layoutParams);
            scrollView.addView(linearLayout);
            aVar.M(scrollView);
            aVar.K(getResources().getString(R.string.app_name) + " (" + getResources().getString(R.string.titoloalertprivacy) + ")");
            aVar.C(getResources().getString(R.string.tasto_accetto_privacy), new a());
            aVar.s(getResources().getString(R.string.CloseFaq), new b());
            aVar.d(false);
            androidx.appcompat.app.d dVarA = aVar.a();
            this.M = dVarA;
            dVarA.show();
        } catch (WindowManager.BadTokenException unused) {
            b0(this.D, this.E);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(Context context) {
        try {
            d.a aVar = new d.a(context);
            ScrollView scrollView = new ScrollView(context);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(40, 20, 40, 20);
            TextView textView = new TextView(context);
            textView.setText(R.string.eu_info);
            String str = "<a href=https://docs.google.com/document/d/e/2PACX-1vTrON8VMNbc6wFxoczLJHJH68mmyD9GYix0x8ZvOWx0Y9TNpSE57FZx7L5R0TCwEuiRJ-rtimgEC_qf/pub>" + getResources().getString(R.string.app_name) + " ( Privacy Policy )</a>";
            TextView textView2 = new TextView(context);
            textView2.setText(Html.fromHtml(str));
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            TextView textView3 = new TextView(context);
            textView3.setText("Info Privacy:");
            linearLayout.addView(textView3, layoutParams);
            linearLayout.addView(textView2, layoutParams);
            linearLayout.addView(textView, layoutParams);
            for (AdProvider adProvider : ConsentInformation.g(context).c()) {
                String str2 = "<a href=" + adProvider.c() + ">" + adProvider.b() + "</a>";
                TextView textView4 = new TextView(context);
                textView4.setText(Html.fromHtml(str2));
                textView4.setMovementMethod(LinkMovementMethod.getInstance());
                linearLayout.addView(textView4, layoutParams);
            }
            scrollView.addView(linearLayout);
            aVar.M(scrollView).B(R.string.CloseFaq, null);
            androidx.appcompat.app.d dVarA = aVar.a();
            this.N = dVarA;
            dVarA.show();
        } catch (WindowManager.BadTokenException unused) {
            Toast.makeText(this, "Error, try again", 1).show();
        }
    }

    void l0(Context context) {
        try {
            d.a aVar = new d.a(context);
            View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.ue_consent, (ViewGroup) null);
            aVar.M(viewInflate);
            aVar.d(false);
            aVar.C(getResources().getString(R.string.CloseFaq), new e());
            Button button = (Button) viewInflate.findViewById(R.id.btn_eu_consent_yes);
            Button button2 = (Button) viewInflate.findViewById(R.id.btn_eu_consent_no);
            Button button3 = (Button) viewInflate.findViewById(R.id.tv_eu_learn_more);
            androidx.appcompat.app.d dVarA = aVar.a();
            this.J = dVarA;
            dVarA.show();
            button3.setOnClickListener(new f(context));
            button.setOnClickListener(new g(context));
            button2.setOnClickListener(new h(context));
        } catch (WindowManager.BadTokenException unused) {
            b0(this.D, this.E);
        }
    }

    @Override // androidx.appcompat.app.e, androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.j, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_launcher);
        if (getResources().getBoolean(R.bool.portrait_only) && Build.VERSION.SDK_INT < 26) {
            setRequestedOrientation(1);
        }
        SharedPreferences sharedPreferences = getSharedPreferences(getString(R.string.pref_file), 0);
        this.H = sharedPreferences;
        this.G = sharedPreferences.getString(getString(R.string.privacynoteuro), "NO");
        this.F = this.H.getString(getString(R.string.gdprPreferences), "UNKNOWN");
        this.I = this.H.edit();
        this.D = this.H.getString(getString(R.string.Ultima_calcolatrice_scelta), "si");
        this.E = this.H.getString(getString(R.string.Ultima_calcolatrice_scelta_si_tipo), "1");
        ConsentInformation.g(this.C).o(new String[]{"pub-8629550575650531"}, new d());
    }

    @Override // androidx.appcompat.app.e, androidx.fragment.app.d, android.app.Activity
    protected void onDestroy() {
        androidx.appcompat.app.d dVar = this.J;
        if (dVar != null) {
            dVar.dismiss();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    protected void onPause() {
        androidx.appcompat.app.d dVar = this.J;
        if (dVar != null) {
            dVar.dismiss();
        }
        super.onPause();
    }
}

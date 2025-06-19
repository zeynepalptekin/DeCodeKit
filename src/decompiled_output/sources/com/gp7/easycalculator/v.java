package com.gp7.easycalculator;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.text.Html;
import android.text.method.LinkMovementMethod;
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
import com.google.ads.consent.ConsentInformation;
import com.google.ads.consent.ConsentStatus;

/* loaded from: classes.dex */
class v {

    /* renamed from: a, reason: collision with root package name */
    private androidx.appcompat.app.d f7057a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.appcompat.app.d f7058b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.appcompat.app.d f7059c;
    private androidx.appcompat.app.d d;

    class a implements View.OnClickListener {
        final /* synthetic */ Context d;

        a(Context context) {
            this.d = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            v.this.g(this.d);
        }
    }

    class b implements View.OnClickListener {
        final /* synthetic */ SharedPreferences.Editor d;
        final /* synthetic */ Context e;

        b(SharedPreferences.Editor editor, Context context) {
            this.d = editor;
            this.e = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.d.putString(this.e.getString(R.string.gdprPreferences), "PERSONALIZED");
            this.d.apply();
            ConsentInformation.g(this.e).s(ConsentStatus.PERSONALIZED);
            v.this.f7057a.cancel();
            v.this.a(this.e);
        }
    }

    class c implements View.OnClickListener {
        final /* synthetic */ SharedPreferences.Editor d;
        final /* synthetic */ Context e;

        c(SharedPreferences.Editor editor, Context context) {
            this.d = editor;
            this.e = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.d.putString(this.e.getString(R.string.gdprPreferences), "NON_PERSONALIZED");
            this.d.apply();
            ConsentInformation.g(this.e).s(ConsentStatus.NON_PERSONALIZED);
            v.this.f7057a.cancel();
            v.this.b(this.e);
        }
    }

    class d implements DialogInterface.OnClickListener {
        final /* synthetic */ Context d;

        d(Context context) {
            this.d = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r4) {
            Toast.makeText(this.d, "Personalized ads will be shown", 1).show();
            dialogInterface.cancel();
        }
    }

    class e implements DialogInterface.OnClickListener {
        final /* synthetic */ Context d;

        e(Context context) {
            this.d = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int r4) {
            Toast.makeText(this.d, "Non-Personalized ads will be shown", 1).show();
            dialogInterface.cancel();
        }
    }

    v() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        try {
            d.a aVar = new d.a(context);
            ScrollView scrollView = new ScrollView(context);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(40, 20, 40, 20);
            TextView textView = new TextView(context);
            textView.setText(R.string.privacyYESsetting);
            linearLayout.addView(textView, layoutParams);
            TextView textView2 = new TextView(context);
            textView2.setText(Html.fromHtml("<a href=https://docs.google.com/document/d/e/2PACX-1vTrON8VMNbc6wFxoczLJHJH68mmyD9GYix0x8ZvOWx0Y9TNpSE57FZx7L5R0TCwEuiRJ-rtimgEC_qf/pub>Privacy Policy</a>"));
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            linearLayout.addView(textView2, layoutParams);
            scrollView.addView(linearLayout);
            aVar.K(context.getString(R.string.app_name));
            aVar.M(scrollView).C(context.getString(R.string.CloseFaq), new d(context));
            androidx.appcompat.app.d dVarA = aVar.a();
            this.f7059c = dVarA;
            dVarA.show();
        } catch (WindowManager.BadTokenException unused) {
            Toast.makeText(context, "Error, try again", 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        try {
            d.a aVar = new d.a(context);
            ScrollView scrollView = new ScrollView(context);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(40, 20, 40, 20);
            TextView textView = new TextView(context);
            textView.setText(R.string.privacyNOsetting);
            linearLayout.addView(textView, layoutParams);
            TextView textView2 = new TextView(context);
            textView2.setText(Html.fromHtml("<a href=https://docs.google.com/document/d/e/2PACX-1vTrON8VMNbc6wFxoczLJHJH68mmyD9GYix0x8ZvOWx0Y9TNpSE57FZx7L5R0TCwEuiRJ-rtimgEC_qf/pub>Privacy Policy</a>"));
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            linearLayout.addView(textView2, layoutParams);
            scrollView.addView(linearLayout);
            aVar.K(context.getString(R.string.app_name));
            aVar.M(scrollView).C(context.getString(R.string.CloseFaq), new e(context));
            androidx.appcompat.app.d dVarA = aVar.a();
            this.d = dVarA;
            dVarA.show();
        } catch (WindowManager.BadTokenException unused) {
            Toast.makeText(context, "Error, try again", 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Context context) {
        d.a aVar = new d.a(context);
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(40, 20, 40, 20);
        TextView textView = new TextView(context);
        textView.setText(R.string.eu_info);
        String str = "<a href=https://docs.google.com/document/d/e/2PACX-1vTrON8VMNbc6wFxoczLJHJH68mmyD9GYix0x8ZvOWx0Y9TNpSE57FZx7L5R0TCwEuiRJ-rtimgEC_qf/pub>" + context.getString(R.string.app_name) + " ( Privacy Policy )</a>";
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
        this.f7058b = dVarA;
        dVarA.show();
    }

    void h(Context context, SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        d.a aVar = new d.a(context);
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.ue_consent, (ViewGroup) null);
        aVar.M(viewInflate);
        aVar.d(false);
        aVar.B(R.string.CloseFaq, null);
        Button button = (Button) viewInflate.findViewById(R.id.btn_eu_consent_yes);
        Button button2 = (Button) viewInflate.findViewById(R.id.btn_eu_consent_no);
        Button button3 = (Button) viewInflate.findViewById(R.id.tv_eu_learn_more);
        androidx.appcompat.app.d dVarA = aVar.a();
        this.f7057a = dVarA;
        dVarA.show();
        button3.setOnClickListener(new a(context));
        button.setOnClickListener(new b(editorEdit, context));
        button2.setOnClickListener(new c(editorEdit, context));
    }
}

package com.gp7.easycalculator;

import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class SpesaLIST extends androidx.appcompat.app.e {
    SQLiteDatabase C;
    com.gp7.easycalculator.c D;
    LinearLayout F;
    TextView G;
    TextView H;
    TextView I;
    long J;
    LinearLayout K;
    String L;
    TextView M;
    TextView N;
    String O;
    String P;
    String Q;
    Vibrator R;
    String S;
    MenuItem T;
    MenuItem U;
    LinearLayout V;
    CheckBox W;
    CheckBox X;
    TextView Y;
    TextView Z;
    w E = new w();
    String a0 = "NO";

    class a extends c.a.e.b0.a<ArrayList<String>> {
        a() {
        }
    }

    class b extends c.a.e.b0.a<ArrayList<String>> {
        b() {
        }
    }

    class c extends c.a.e.b0.a<ArrayList<String>> {
        c() {
        }
    }

    class d extends c.a.e.b0.a<ArrayList<String>> {
        d() {
        }
    }

    public void ListSigned(View view) {
        long j;
        LinearLayout linearLayout = (LinearLayout) view.getParent();
        this.K = linearLayout;
        CheckBox checkBox = (CheckBox) linearLayout.getChildAt(0);
        this.X = checkBox;
        if (checkBox.isChecked()) {
            this.Y = (TextView) this.K.getChildAt(1);
            this.Z = (TextView) this.K.getChildAt(2);
            TextView textView = this.Y;
            textView.setPaintFlags(textView.getPaintFlags() | 16);
            TextView textView2 = this.Z;
            textView2.setPaintFlags(textView2.getPaintFlags() | 16);
            j = this.J - 1;
        } else {
            this.Y = (TextView) this.K.getChildAt(1);
            this.Z = (TextView) this.K.getChildAt(2);
            TextView textView3 = this.Y;
            textView3.setPaintFlags(textView3.getPaintFlags() & (-17));
            TextView textView4 = this.Z;
            textView4.setPaintFlags(textView4.getPaintFlags() & (-17));
            j = this.J + 1;
        }
        this.J = j;
        this.I.setText(Long.toString(j));
        if (this.P.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.R.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.R.vibrate(20L);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03b0  */
    @Override // androidx.appcompat.app.e, androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.j, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onCreate(android.os.Bundle r19) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 2576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.SpesaLIST.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onCreateOptionsMenu(android.view.Menu r5) {
        /*
            r4 = this;
            android.view.MenuInflater r0 = r4.getMenuInflater()
            r1 = 2131558403(0x7f0d0003, float:1.874212E38)
            r0.inflate(r1, r5)
            r0 = 2131297132(0x7f09036c, float:1.82122E38)
            android.view.MenuItem r0 = r5.findItem(r0)
            r4.T = r0
            r0 = 2131296991(0x7f0902df, float:1.8211914E38)
            android.view.MenuItem r5 = r5.findItem(r0)
            r4.U = r5
            java.lang.String r5 = r4.S
            int r0 = r5.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -1663019586: goto L47;
                case 102970646: goto L3d;
                case 853620882: goto L33;
                case 1064537505: goto L29;
                default: goto L28;
            }
        L28:
            goto L51
        L29:
            java.lang.String r0 = "minimal"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L51
            r5 = 1
            goto L52
        L33:
            java.lang.String r0 = "classic"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L51
            r5 = 0
            goto L52
        L3d:
            java.lang.String r0 = "light"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L51
            r5 = 3
            goto L52
        L47:
            java.lang.String r0 = "elegant"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L51
            r5 = 2
            goto L52
        L51:
            r5 = -1
        L52:
            if (r5 == 0) goto L85
            if (r5 == r3) goto L77
            if (r5 == r2) goto L69
            if (r5 == r1) goto L5b
            goto L95
        L5b:
            android.view.MenuItem r5 = r4.T
            r0 = 2131230955(0x7f0800eb, float:1.8077977E38)
            r5.setIcon(r0)
            android.view.MenuItem r5 = r4.U
            r0 = 2131230948(0x7f0800e4, float:1.8077963E38)
            goto L92
        L69:
            android.view.MenuItem r5 = r4.T
            r0 = 2131230954(0x7f0800ea, float:1.8077975E38)
            r5.setIcon(r0)
            android.view.MenuItem r5 = r4.U
            r0 = 2131230947(0x7f0800e3, float:1.8077961E38)
            goto L92
        L77:
            android.view.MenuItem r5 = r4.T
            r0 = 2131230956(0x7f0800ec, float:1.807798E38)
            r5.setIcon(r0)
            android.view.MenuItem r5 = r4.U
            r0 = 2131230949(0x7f0800e5, float:1.8077965E38)
            goto L92
        L85:
            android.view.MenuItem r5 = r4.T
            r0 = 2131230953(0x7f0800e9, float:1.8077973E38)
            r5.setIcon(r0)
            android.view.MenuItem r5 = r4.U
            r0 = 2131230946(0x7f0800e2, float:1.807796E38)
        L92:
            r5.setIcon(r0)
        L95:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.SpesaLIST.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
            if (this.P.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    this.R.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    this.R.vibrate(20L);
                }
            }
            return true;
        }
        if (itemId != R.id.sortList) {
            if (itemId != R.id.undoList) {
                return super.onOptionsItemSelected(menuItem);
            }
            for (int r11 = 0; r11 < this.F.getChildCount(); r11++) {
                LinearLayout linearLayout = (LinearLayout) this.F.getChildAt(r11);
                this.V = linearLayout;
                if (linearLayout.getVisibility() == 8) {
                    this.V.setVisibility(0);
                    this.a0 = "NO";
                    this.T.setVisible(false);
                }
            }
            if (this.P.equals("si")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    this.R.vibrate(VibrationEffect.createOneShot(20L, -1));
                } else {
                    this.R.vibrate(20L);
                }
            }
            return true;
        }
        for (int r112 = 0; r112 < this.F.getChildCount(); r112++) {
            LinearLayout linearLayout2 = (LinearLayout) this.F.getChildAt(r112);
            this.V = linearLayout2;
            CheckBox checkBox = (CheckBox) linearLayout2.getChildAt(0);
            this.W = checkBox;
            if (checkBox.isChecked()) {
                this.V.setVisibility(8);
                this.a0 = "SI";
            }
        }
        if (this.a0.equals("SI")) {
            this.T.setVisible(true);
        }
        if (this.P.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.R.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.R.vibrate(20L);
            }
        }
        return true;
    }

    public void tagliaitem(View view) {
        long j;
        LinearLayout linearLayout = (LinearLayout) view.getParent();
        this.K = linearLayout;
        CheckBox checkBox = (CheckBox) linearLayout.getChildAt(0);
        this.X = checkBox;
        if (checkBox.isChecked()) {
            this.X.setChecked(false);
            this.Y = (TextView) this.K.getChildAt(1);
            this.Z = (TextView) this.K.getChildAt(2);
            TextView textView = this.Y;
            textView.setPaintFlags(textView.getPaintFlags() & (-17));
            TextView textView2 = this.Z;
            textView2.setPaintFlags(textView2.getPaintFlags() & (-17));
            j = this.J + 1;
        } else {
            this.X.setChecked(true);
            this.Y = (TextView) this.K.getChildAt(1);
            this.Z = (TextView) this.K.getChildAt(2);
            TextView textView3 = this.Y;
            textView3.setPaintFlags(textView3.getPaintFlags() | 16);
            TextView textView4 = this.Z;
            textView4.setPaintFlags(textView4.getPaintFlags() | 16);
            j = this.J - 1;
        }
        this.J = j;
        this.I.setText(Long.toString(j));
        if (this.P.equals("si")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.R.vibrate(VibrationEffect.createOneShot(20L, -1));
            } else {
                this.R.vibrate(20L);
            }
        }
    }
}

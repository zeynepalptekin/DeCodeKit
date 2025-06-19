package com.gp7.easycalculator;

import android.content.Context;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private w f7053a = new w();

    e() {
    }

    String a(String str, String str2, Context context, DecimalFormat decimalFormat) {
        w wVar;
        StringBuilder sb;
        String string;
        StringBuilder sb2;
        Matcher matcher = Pattern.compile("^[%]|^[.]").matcher(str2);
        Matcher matcher2 = Pattern.compile("^[a]|^[s]|^[c]|^[t]|^[l]|^[√]|^[(]|^[\\d,]|^[e]|^[φ]|^[π]").matcher(str2);
        Matcher matcher3 = Pattern.compile("^[÷]|^[×]|^[+]|^[-]|^[\\\\^]").matcher(str2);
        if (matcher.find()) {
            wVar = this.f7053a;
            sb2 = new StringBuilder();
        } else {
            if (!matcher2.find()) {
                if (matcher3.find()) {
                    wVar = this.f7053a;
                    sb = new StringBuilder();
                } else {
                    wVar = this.f7053a;
                    sb = new StringBuilder();
                }
                sb.append(str);
                sb.append("%");
                sb.append(str2);
                string = sb.toString();
                return wVar.a(string, decimalFormat, context);
            }
            wVar = this.f7053a;
            sb2 = new StringBuilder();
            sb2.append(str);
            str = "%×";
        }
        sb2.append(str);
        sb2.append(str2);
        string = sb2.toString();
        return wVar.a(string, decimalFormat, context);
    }

    String b(String str, String str2, Context context, DecimalFormat decimalFormat) {
        w wVar;
        StringBuilder sb;
        Matcher matcher = Pattern.compile("^[.]").matcher(str2);
        Matcher matcher2 = Pattern.compile("[.]$").matcher(str);
        Matcher matcher3 = Pattern.compile("^[÷]|^[×]|^[+]|^[-]|^[\\\\^]|^[%]|^[)]|^[(]|^[a]|^[s]|^[c]|^[t]|^[l]|^[√]|^[e]|^[φ]|^[π]").matcher(str2);
        if (matcher.find()) {
            wVar = this.f7053a;
            sb = new StringBuilder();
            sb.append(str);
            sb.append(str2.substring(1));
        } else {
            if (matcher3.find() && matcher2.find()) {
                return str + str2;
            }
            wVar = this.f7053a;
            sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
        }
        return wVar.a(sb.toString(), decimalFormat, context);
    }
}

package com.gp7.easycalculator;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Toast;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
class w {

    /* renamed from: a, reason: collision with root package name */
    private String[] f7060a = new String[2];

    /* renamed from: b, reason: collision with root package name */
    private String f7061b;

    /* renamed from: c, reason: collision with root package name */
    private String f7062c;
    private String d;
    String e;
    String f;

    w() {
    }

    String a(String str, DecimalFormat decimalFormat, Context context) throws Resources.NotFoundException {
        String string;
        BigDecimal bigDecimal;
        StringBuilder sb;
        String strSubstring;
        String strConcat = "";
        String strReplaceAll = str.replaceAll("[,]", "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, "-");
        arrayList.add(1, "+");
        arrayList.add(2, "×");
        arrayList.add(3, "÷");
        arrayList.add(4, "^");
        Matcher matcher = Pattern.compile("[a][b][s][(]|[t][a][n][\\u207B][\\u00B9][(]|[c][o][s][\\u207B][\\u00B9][(]|[s][i][n][\\u207B][\\u00B9][(]|[t][a][n][(]|[c][o][s][(]|[s][i][n][(]|[√][(]|[l][n][(]|[l][o][g][(]|[π]|[φ]|[e]|[E]|[(]|[)]|[+]|[-]|[÷]|[×]|[%]|[\\\\^]|\\d+[.]\\d+|\\d+").matcher(strReplaceAll);
        while (matcher.find()) {
            String strGroup = matcher.group();
            if (arrayList.indexOf(strGroup) == -1 && !strGroup.equals("(") && !strGroup.equals(")") && !strGroup.equals("%") && !strGroup.equals("E") && !strGroup.equals("e") && !strGroup.equals("φ") && !strGroup.equals("π") && !strGroup.equals("√(") && !strGroup.equals("log(") && !strGroup.equals("ln(") && !strGroup.equals("sin⁻¹(") && !strGroup.equals("cos⁻¹(") && !strGroup.equals("tan⁻¹(") && !strGroup.equals("sin(") && !strGroup.equals("cos(") && !strGroup.equals("tan(") && !strGroup.equals("abs(")) {
                if (strGroup.matches("\\d+[.]\\d+")) {
                    String[] strArrSplit = strGroup.split("[.]");
                    Matcher matcher2 = Pattern.compile("[0]$").matcher(strGroup);
                    if (strArrSplit[1].length() <= 8 && matcher2.find()) {
                        String strConcat2 = strConcat.concat(decimalFormat.format(new BigDecimal(strArrSplit[0])));
                        sb = new StringBuilder();
                        sb.append(strConcat2);
                        sb.append(".");
                        strSubstring = strArrSplit[1];
                    } else if (strArrSplit[1].length() <= 8 && !matcher2.find()) {
                        bigDecimal = new BigDecimal(strGroup);
                        strGroup = decimalFormat.format(bigDecimal);
                    } else if (matcher2.find()) {
                        Toast.makeText(context, context.getResources().getString(R.string.max_number_decimal), 1).show();
                        String strConcat3 = strConcat.concat(decimalFormat.format(new BigDecimal(strArrSplit[0])));
                        sb = new StringBuilder();
                        sb.append(strConcat3);
                        sb.append(".");
                        strSubstring = strArrSplit[1].substring(0, 8);
                    } else {
                        strConcat = strConcat.concat(decimalFormat.format(new BigDecimal(strArrSplit[0] + "." + strArrSplit[1].substring(0, 8))));
                        string = context.getResources().getString(R.string.max_number_decimal);
                        Toast.makeText(context, string, 1).show();
                    }
                    sb.append(strSubstring);
                    strConcat = sb.toString();
                } else if (strGroup.length() <= 15) {
                    bigDecimal = new BigDecimal(strGroup);
                    strGroup = decimalFormat.format(bigDecimal);
                } else {
                    strConcat = strConcat.concat(decimalFormat.format(new BigDecimal(strGroup.substring(0, 15))));
                    string = context.getResources().getString(R.string.max_number);
                    Toast.makeText(context, string, 1).show();
                }
            }
            strConcat = strConcat.concat(strGroup);
        }
        return strConcat;
    }

    String b(String str, DecimalFormat decimalFormat, Context context) throws Resources.NotFoundException {
        String string;
        String strReplaceAll = str.replaceAll("[,]", "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, "-");
        arrayList.add(1, "+");
        arrayList.add(2, "×");
        arrayList.add(3, "÷");
        arrayList.add(4, "^");
        Matcher matcher = Pattern.compile("[a][b][s][(]|[t][a][n][\\u207B][\\u00B9][(]|[c][o][s][\\u207B][\\u00B9][(]|[s][i][n][\\u207B][\\u00B9][(]|[t][a][n][(]|[c][o][s][(]|[s][i][n][(]|[√][(]|[l][n][(]|[l][o][g][(]|[π]|[φ]|[e]|[E]|[(]|[)]|[+]|[-]|[÷]|[×]|[%]|[\\\\^]|\\d+[.]\\d+|\\b\\d+\\b").matcher(strReplaceAll);
        String str2 = "si";
        while (matcher.find()) {
            String strGroup = matcher.group();
            if (arrayList.indexOf(strGroup) == -1 && !strGroup.equals("(") && !strGroup.equals(")") && !strGroup.equals("%") && !strGroup.equals("E") && !strGroup.equals("e") && !strGroup.equals("φ") && !strGroup.equals("π") && !strGroup.equals("√(") && !strGroup.equals("log(") && !strGroup.equals("ln(") && !strGroup.equals("sin⁻¹(") && !strGroup.equals("cos⁻¹(") && !strGroup.equals("tan⁻¹(") && !strGroup.equals("sin(") && !strGroup.equals("cos(") && !strGroup.equals("tan(") && !strGroup.equals("abs(")) {
                if (strGroup.matches("\\d+[.]\\d+")) {
                    String[] strArrSplit = strGroup.split("[.]");
                    if (strArrSplit[0].length() > 15 && strArrSplit[1].length() <= 8) {
                        string = context.getResources().getString(R.string.max_number);
                    } else if (strArrSplit[0].length() <= 15 && strArrSplit[1].length() > 8) {
                        string = context.getResources().getString(R.string.max_number_decimal);
                    }
                } else if (strGroup.length() > 15) {
                    string = context.getResources().getString(R.string.max_number);
                }
                Toast.makeText(context, string, 1).show();
                str2 = "no";
            }
        }
        return str2;
    }

    String c(String str, DecimalFormat decimalFormat, Context context) {
        StringBuilder sb;
        String strSubstring;
        BigDecimal bigDecimal;
        String strReplaceAll = str.replaceAll(",", "");
        if (strReplaceAll.matches("\\d+[.]\\d+")) {
            String[] strArrSplit = strReplaceAll.split("[.]");
            Matcher matcher = Pattern.compile("[0]$").matcher(strReplaceAll);
            if (strArrSplit[1].length() <= 8 && matcher.find()) {
                String str2 = decimalFormat.format(new BigDecimal(strArrSplit[0]));
                sb = new StringBuilder();
                sb.append(str2);
                sb.append(".");
                strSubstring = strArrSplit[1];
            } else if (strArrSplit[1].length() <= 8 && !matcher.find()) {
                bigDecimal = new BigDecimal(strReplaceAll);
            } else {
                if (!matcher.find()) {
                    return decimalFormat.format(new BigDecimal(strArrSplit[0] + "." + strArrSplit[1].substring(0, 8)));
                }
                String str3 = decimalFormat.format(new BigDecimal(strArrSplit[0]));
                sb = new StringBuilder();
                sb.append(str3);
                sb.append(".");
                strSubstring = strArrSplit[1].substring(0, 8);
            }
            sb.append(strSubstring);
            return sb.toString();
        }
        bigDecimal = strReplaceAll.length() <= 15 ? new BigDecimal(strReplaceAll) : new BigDecimal(strReplaceAll.substring(0, 15));
        return decimalFormat.format(bigDecimal);
    }

    String d(String str, DecimalFormat decimalFormat, Context context) {
        StringBuilder sb;
        String strSubstring;
        BigDecimal bigDecimal;
        String strReplaceAll = str.replaceAll(",", "");
        if (strReplaceAll.matches("\\d+[.]\\d+")) {
            String[] strArrSplit = strReplaceAll.split("[.]");
            Matcher matcher = Pattern.compile("[0]$").matcher(strReplaceAll);
            if (strArrSplit[1].length() <= 3 && matcher.find()) {
                String str2 = decimalFormat.format(new BigDecimal(strArrSplit[0]));
                sb = new StringBuilder();
                sb.append(str2);
                sb.append(".");
                strSubstring = strArrSplit[1];
            } else if (strArrSplit[1].length() <= 3 && !matcher.find()) {
                bigDecimal = new BigDecimal(strReplaceAll);
            } else {
                if (!matcher.find()) {
                    return decimalFormat.format(new BigDecimal(strArrSplit[0] + "." + strArrSplit[1].substring(0, 3)));
                }
                String str3 = decimalFormat.format(new BigDecimal(strArrSplit[0]));
                sb = new StringBuilder();
                sb.append(str3);
                sb.append(".");
                strSubstring = strArrSplit[1].substring(0, 3);
            }
            sb.append(strSubstring);
            return sb.toString();
        }
        bigDecimal = strReplaceAll.length() <= 10 ? new BigDecimal(strReplaceAll) : new BigDecimal(strReplaceAll.substring(0, 10));
        return decimalFormat.format(bigDecimal);
    }

    String e(String str, DecimalFormat decimalFormat, Context context) {
        StringBuilder sb;
        String strSubstring;
        BigDecimal bigDecimal;
        String strReplaceAll = str.replaceAll(",", "");
        if (strReplaceAll.matches("\\d+[.]\\d+")) {
            String[] strArrSplit = strReplaceAll.split("[.]");
            Matcher matcher = Pattern.compile("[0]$").matcher(strReplaceAll);
            if (strArrSplit[1].length() <= 3 && matcher.find()) {
                String str2 = decimalFormat.format(new BigDecimal(strArrSplit[0]));
                sb = new StringBuilder();
                sb.append(str2);
                sb.append(".");
                strSubstring = strArrSplit[1];
            } else if (strArrSplit[1].length() <= 3 && !matcher.find()) {
                bigDecimal = new BigDecimal(strReplaceAll);
            } else {
                if (!matcher.find()) {
                    return decimalFormat.format(new BigDecimal(strArrSplit[0] + "." + strArrSplit[1].substring(0, 3)));
                }
                String str3 = decimalFormat.format(new BigDecimal(strArrSplit[0]));
                sb = new StringBuilder();
                sb.append(str3);
                sb.append(".");
                strSubstring = strArrSplit[1].substring(0, 3);
            }
            sb.append(strSubstring);
            return sb.toString();
        }
        bigDecimal = new BigDecimal(strReplaceAll);
        return decimalFormat.format(bigDecimal);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String[] f(java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.w.f(java.lang.String, java.lang.String, java.lang.String):java.lang.String[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r2 != 2) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0127 A[PHI: r1
  0x0127: PHI (r1v11 java.lang.String) = 
  (r1v0 java.lang.String)
  (r1v1 java.lang.String)
  (r1v4 java.lang.String)
  (r1v7 java.lang.String)
  (r1v16 java.lang.String)
 binds: [B:77:0x010d, B:84:0x0123, B:83:0x0116, B:59:0x00db, B:30:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String g(java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.w.g(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0118 A[PHI: r1
  0x0118: PHI (r1v9 java.lang.String) = 
  (r1v0 java.lang.String)
  (r1v1 java.lang.String)
  (r1v4 java.lang.String)
  (r1v5 java.lang.String)
  (r1v0 java.lang.String)
  (r1v7 java.lang.String)
  (r1v12 java.lang.String)
  (r1v14 java.lang.String)
  (r1v0 java.lang.String)
 binds: [B:72:0x00ff, B:78:0x0114, B:77:0x0107, B:54:0x00cd, B:49:0x00be, B:53:0x00c4, B:27:0x0079, B:26:0x006f, B:24:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String h(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.w.h(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void i(android.widget.TextView r7, android.widget.TextView r8, java.lang.String r9) {
        /*
            r6 = this;
            int r0 = r9.hashCode()
            r1 = -1579458611(0xffffffffa1db5fcd, float:-1.4865375E-18)
            r2 = 1
            if (r0 == r1) goto L29
            r1 = -1085510111(0xffffffffbf4c6e21, float:-0.79855543)
            if (r0 == r1) goto L1f
            r1 = 1127340161(0x4331d881, float:177.84572)
            if (r0 == r1) goto L15
            goto L33
        L15:
            java.lang.String r0 = "Italiana"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L33
            r9 = 1
            goto L34
        L1f:
            java.lang.String r0 = "Default"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L33
            r9 = 2
            goto L34
        L29:
            java.lang.String r0 = "Francese"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L33
            r9 = 0
            goto L34
        L33:
            r9 = -1
        L34:
            java.lang.String r0 = ","
            if (r9 == 0) goto L75
            if (r9 == r2) goto L3b
            goto L95
        L3b:
            java.lang.CharSequence r9 = r7.getText()
            java.lang.String r9 = r9.toString()
            java.lang.String r1 = "[,]"
            java.lang.String r2 = "v"
            java.lang.String r9 = r9.replaceAll(r1, r2)
            java.lang.String r3 = "[.]"
            java.lang.String r9 = r9.replaceAll(r3, r0)
            java.lang.String r4 = "[v]"
            java.lang.String r5 = "."
            java.lang.String r9 = r9.replaceAll(r4, r5)
            r6.e = r9
            r7.setText(r9)
            java.lang.CharSequence r7 = r8.getText()
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = r7.replaceAll(r1, r2)
            java.lang.String r7 = r7.replaceAll(r3, r0)
            java.lang.String r7 = r7.replaceAll(r4, r5)
            r6.f = r7
            goto L92
        L75:
            java.lang.CharSequence r9 = r7.getText()
            java.lang.String r9 = r9.toString()
            java.lang.String r1 = "\\s"
            java.lang.String r9 = r9.replaceAll(r1, r0)
            r7.setText(r9)
            java.lang.CharSequence r7 = r8.getText()
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = r7.replaceAll(r1, r0)
        L92:
            r8.setText(r7)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.w.i(android.widget.TextView, android.widget.TextView, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void j(android.widget.RadioButton r7, android.widget.RadioButton r8, android.widget.RadioButton r9, android.widget.RadioButton r10, android.widget.TextView r11, android.widget.TextView r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.w.j(android.widget.RadioButton, android.widget.RadioButton, android.widget.RadioButton, android.widget.RadioButton, android.widget.TextView, android.widget.TextView, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void k(android.widget.RadioButton r7, android.widget.RadioButton r8, android.widget.RadioButton r9, android.widget.RadioButton r10, android.widget.TextView r11, android.widget.TextView r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.w.k(android.widget.RadioButton, android.widget.RadioButton, android.widget.RadioButton, android.widget.RadioButton, android.widget.TextView, android.widget.TextView, java.lang.String):void");
    }

    String l(Double d, DecimalFormat decimalFormat, Locale locale) {
        double dAbs = Math.abs(d.doubleValue());
        return ((dAbs > 1.0E9d || dAbs < 1.0E-8d) && dAbs != 0.0d) ? String.format(locale, "%.8E", d) : decimalFormat.format(d);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String m(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            int r0 = r6.hashCode()
            r1 = -1579458611(0xffffffffa1db5fcd, float:-1.4865375E-18)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = -1085510111(0xffffffffbf4c6e21, float:-0.79855543)
            if (r0 == r1) goto L20
            r1 = 1127340161(0x4331d881, float:177.84572)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "Italiana"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L34
            r6 = 2
            goto L35
        L20:
            java.lang.String r0 = "Default"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L34
            r6 = 0
            goto L35
        L2a:
            java.lang.String r0 = "Francese"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L34
            r6 = 1
            goto L35
        L34:
            r6 = -1
        L35:
            java.lang.String r0 = "[,]"
            if (r6 == r3) goto L53
            if (r6 == r2) goto L3c
            goto L59
        L3c:
            java.lang.String r6 = "v"
            java.lang.String r5 = r5.replaceAll(r0, r6)
            java.lang.String r6 = "[.]"
            java.lang.String r0 = ","
            java.lang.String r5 = r5.replaceAll(r6, r0)
            java.lang.String r6 = "[v]"
            java.lang.String r0 = "."
            java.lang.String r5 = r5.replaceAll(r6, r0)
            goto L59
        L53:
            java.lang.String r6 = " "
            java.lang.String r5 = r5.replaceAll(r0, r6)
        L59:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.w.m(java.lang.String, java.lang.String):java.lang.String");
    }
}

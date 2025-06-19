package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import java.util.Set;

/* loaded from: classes.dex */
public final class uf extends eg {
    private static final Set<String> u = com.google.android.gms.common.util.h.j("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");

    /* renamed from: c, reason: collision with root package name */
    private String f5509c;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private final Object k;
    private final rw l;
    private final Activity m;
    private hy n;
    private ImageView o;
    private LinearLayout p;
    private hg q;
    private PopupWindow r;
    private RelativeLayout s;
    private ViewGroup t;

    public uf(rw rwVar, hg hgVar) {
        super(rwVar, "resize");
        this.f5509c = "top-right";
        this.d = true;
        this.e = 0;
        this.f = 0;
        this.g = -1;
        this.h = 0;
        this.i = 0;
        this.j = -1;
        this.k = new Object();
        this.l = rwVar;
        this.m = rwVar.a();
        this.q = hgVar;
    }

    public final void h(int r1, int r2, boolean z) {
        synchronized (this.k) {
            this.e = r1;
            this.f = r2;
            PopupWindow popupWindow = this.r;
        }
    }

    public final void i(boolean z) {
        synchronized (this.k) {
            if (this.r != null) {
                this.r.dismiss();
                this.s.removeView(this.l.getView());
                if (this.t != null) {
                    this.t.removeView(this.o);
                    this.t.addView(this.l.getView());
                    this.l.p0(this.n);
                }
                if (z) {
                    g("default");
                    if (this.q != null) {
                        this.q.c();
                    }
                }
                this.r = null;
                this.s = null;
                this.t = null;
                this.p = null;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:127:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x022f A[Catch: all -> 0x04a2, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:22:0x0041, B:24:0x0043, B:26:0x0051, B:27:0x0062, B:29:0x0070, B:30:0x0081, B:32:0x008f, B:33:0x00a0, B:35:0x00ae, B:36:0x00bf, B:38:0x00cd, B:39:0x00db, B:41:0x00e9, B:42:0x00eb, B:44:0x00f1, B:49:0x00fa, B:50:0x00ff, B:52:0x0101, B:54:0x0109, B:57:0x0111, B:59:0x0134, B:62:0x013a, B:64:0x013e, B:67:0x0144, B:69:0x0148, B:124:0x0227, B:145:0x028d, B:146:0x0292, B:148:0x0294, B:150:0x02b6, B:152:0x02ba, B:154:0x02ca, B:156:0x02fc, B:160:0x032e, B:161:0x0362, B:191:0x03b8, B:192:0x03bb, B:200:0x03dc, B:201:0x03f4, B:202:0x0413, B:204:0x041b, B:205:0x0424, B:206:0x044a, B:209:0x044d, B:211:0x045d, B:213:0x0467, B:215:0x0479, B:216:0x0492, B:212:0x0462, B:193:0x03bf, B:194:0x03c3, B:195:0x03c6, B:196:0x03ca, B:197:0x03ce, B:198:0x03d4, B:199:0x03d8, B:163:0x0366, B:166:0x0370, B:169:0x037a, B:172:0x0384, B:175:0x038e, B:178:0x0398, B:155:0x02f7, B:218:0x0494, B:219:0x0499, B:128:0x022f, B:130:0x0233, B:131:0x0244, B:137:0x0271, B:139:0x0275, B:143:0x0285, B:140:0x0278, B:142:0x027f, B:134:0x0268, B:136:0x026d, B:72:0x0150, B:74:0x0154, B:75:0x015a, B:102:0x01a7, B:110:0x0205, B:112:0x0210, B:114:0x0213, B:116:0x0216, B:118:0x021a, B:103:0x01b3, B:105:0x01d0, B:107:0x01de, B:104:0x01c1, B:106:0x01d4, B:108:0x01e1, B:109:0x01f8, B:111:0x0208, B:77:0x015e, B:80:0x0168, B:83:0x0172, B:86:0x017c, B:89:0x0186, B:92:0x0190, B:221:0x049b, B:222:0x04a0), top: B:227:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x028d A[Catch: all -> 0x04a2, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:22:0x0041, B:24:0x0043, B:26:0x0051, B:27:0x0062, B:29:0x0070, B:30:0x0081, B:32:0x008f, B:33:0x00a0, B:35:0x00ae, B:36:0x00bf, B:38:0x00cd, B:39:0x00db, B:41:0x00e9, B:42:0x00eb, B:44:0x00f1, B:49:0x00fa, B:50:0x00ff, B:52:0x0101, B:54:0x0109, B:57:0x0111, B:59:0x0134, B:62:0x013a, B:64:0x013e, B:67:0x0144, B:69:0x0148, B:124:0x0227, B:145:0x028d, B:146:0x0292, B:148:0x0294, B:150:0x02b6, B:152:0x02ba, B:154:0x02ca, B:156:0x02fc, B:160:0x032e, B:161:0x0362, B:191:0x03b8, B:192:0x03bb, B:200:0x03dc, B:201:0x03f4, B:202:0x0413, B:204:0x041b, B:205:0x0424, B:206:0x044a, B:209:0x044d, B:211:0x045d, B:213:0x0467, B:215:0x0479, B:216:0x0492, B:212:0x0462, B:193:0x03bf, B:194:0x03c3, B:195:0x03c6, B:196:0x03ca, B:197:0x03ce, B:198:0x03d4, B:199:0x03d8, B:163:0x0366, B:166:0x0370, B:169:0x037a, B:172:0x0384, B:175:0x038e, B:178:0x0398, B:155:0x02f7, B:218:0x0494, B:219:0x0499, B:128:0x022f, B:130:0x0233, B:131:0x0244, B:137:0x0271, B:139:0x0275, B:143:0x0285, B:140:0x0278, B:142:0x027f, B:134:0x0268, B:136:0x026d, B:72:0x0150, B:74:0x0154, B:75:0x015a, B:102:0x01a7, B:110:0x0205, B:112:0x0210, B:114:0x0213, B:116:0x0216, B:118:0x021a, B:103:0x01b3, B:105:0x01d0, B:107:0x01de, B:104:0x01c1, B:106:0x01d4, B:108:0x01e1, B:109:0x01f8, B:111:0x0208, B:77:0x015e, B:80:0x0168, B:83:0x0172, B:86:0x017c, B:89:0x0186, B:92:0x0190, B:221:0x049b, B:222:0x04a0), top: B:227:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0294 A[Catch: all -> 0x04a2, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:22:0x0041, B:24:0x0043, B:26:0x0051, B:27:0x0062, B:29:0x0070, B:30:0x0081, B:32:0x008f, B:33:0x00a0, B:35:0x00ae, B:36:0x00bf, B:38:0x00cd, B:39:0x00db, B:41:0x00e9, B:42:0x00eb, B:44:0x00f1, B:49:0x00fa, B:50:0x00ff, B:52:0x0101, B:54:0x0109, B:57:0x0111, B:59:0x0134, B:62:0x013a, B:64:0x013e, B:67:0x0144, B:69:0x0148, B:124:0x0227, B:145:0x028d, B:146:0x0292, B:148:0x0294, B:150:0x02b6, B:152:0x02ba, B:154:0x02ca, B:156:0x02fc, B:160:0x032e, B:161:0x0362, B:191:0x03b8, B:192:0x03bb, B:200:0x03dc, B:201:0x03f4, B:202:0x0413, B:204:0x041b, B:205:0x0424, B:206:0x044a, B:209:0x044d, B:211:0x045d, B:213:0x0467, B:215:0x0479, B:216:0x0492, B:212:0x0462, B:193:0x03bf, B:194:0x03c3, B:195:0x03c6, B:196:0x03ca, B:197:0x03ce, B:198:0x03d4, B:199:0x03d8, B:163:0x0366, B:166:0x0370, B:169:0x037a, B:172:0x0384, B:175:0x038e, B:178:0x0398, B:155:0x02f7, B:218:0x0494, B:219:0x0499, B:128:0x022f, B:130:0x0233, B:131:0x0244, B:137:0x0271, B:139:0x0275, B:143:0x0285, B:140:0x0278, B:142:0x027f, B:134:0x0268, B:136:0x026d, B:72:0x0150, B:74:0x0154, B:75:0x015a, B:102:0x01a7, B:110:0x0205, B:112:0x0210, B:114:0x0213, B:116:0x0216, B:118:0x021a, B:103:0x01b3, B:105:0x01d0, B:107:0x01de, B:104:0x01c1, B:106:0x01d4, B:108:0x01e1, B:109:0x01f8, B:111:0x0208, B:77:0x015e, B:80:0x0168, B:83:0x0172, B:86:0x017c, B:89:0x0186, B:92:0x0190, B:221:0x049b, B:222:0x04a0), top: B:227:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x041b A[Catch: all -> 0x04a2, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:22:0x0041, B:24:0x0043, B:26:0x0051, B:27:0x0062, B:29:0x0070, B:30:0x0081, B:32:0x008f, B:33:0x00a0, B:35:0x00ae, B:36:0x00bf, B:38:0x00cd, B:39:0x00db, B:41:0x00e9, B:42:0x00eb, B:44:0x00f1, B:49:0x00fa, B:50:0x00ff, B:52:0x0101, B:54:0x0109, B:57:0x0111, B:59:0x0134, B:62:0x013a, B:64:0x013e, B:67:0x0144, B:69:0x0148, B:124:0x0227, B:145:0x028d, B:146:0x0292, B:148:0x0294, B:150:0x02b6, B:152:0x02ba, B:154:0x02ca, B:156:0x02fc, B:160:0x032e, B:161:0x0362, B:191:0x03b8, B:192:0x03bb, B:200:0x03dc, B:201:0x03f4, B:202:0x0413, B:204:0x041b, B:205:0x0424, B:206:0x044a, B:209:0x044d, B:211:0x045d, B:213:0x0467, B:215:0x0479, B:216:0x0492, B:212:0x0462, B:193:0x03bf, B:194:0x03c3, B:195:0x03c6, B:196:0x03ca, B:197:0x03ce, B:198:0x03d4, B:199:0x03d8, B:163:0x0366, B:166:0x0370, B:169:0x037a, B:172:0x0384, B:175:0x038e, B:178:0x0398, B:155:0x02f7, B:218:0x0494, B:219:0x0499, B:128:0x022f, B:130:0x0233, B:131:0x0244, B:137:0x0271, B:139:0x0275, B:143:0x0285, B:140:0x0278, B:142:0x027f, B:134:0x0268, B:136:0x026d, B:72:0x0150, B:74:0x0154, B:75:0x015a, B:102:0x01a7, B:110:0x0205, B:112:0x0210, B:114:0x0213, B:116:0x0216, B:118:0x021a, B:103:0x01b3, B:105:0x01d0, B:107:0x01de, B:104:0x01c1, B:106:0x01d4, B:108:0x01e1, B:109:0x01f8, B:111:0x0208, B:77:0x015e, B:80:0x0168, B:83:0x0172, B:86:0x017c, B:89:0x0186, B:92:0x0190, B:221:0x049b, B:222:0x04a0), top: B:227:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(java.util.Map<java.lang.String, java.lang.String> r17) {
        /*
            Method dump skipped, instructions count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uf.j(java.util.Map):void");
    }

    public final void k(int r1, int r2) {
        this.e = r1;
        this.f = r2;
    }

    public final boolean l() {
        boolean z;
        synchronized (this.k) {
            z = this.r != null;
        }
        return z;
    }
}

package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.internal.ads.cv2;
import com.google.android.gms.internal.ads.vu2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class tu2 {

    /* renamed from: a, reason: collision with root package name */
    private final yu2 f5453a;

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    private final cv2.n.a f5454b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5455c;

    private tu2() {
        this.f5454b = cv2.n.c0();
        this.f5455c = false;
        this.f5453a = new yu2();
    }

    public tu2(yu2 yu2Var) {
        this.f5454b = cv2.n.c0();
        this.f5453a = yu2Var;
        this.f5455c = ((Boolean) qx2.e().c(e0.e3)).booleanValue();
    }

    private final synchronized void c(vu2.a.b bVar) {
        this.f5454b.G().C(g());
        this.f5453a.a(((cv2.n) ((l92) this.f5454b.P())).f()).b(bVar.h()).c();
        String strValueOf = String.valueOf(Integer.toString(bVar.h(), 10));
        oo.m(strValueOf.length() != 0 ? "Logging Event with event code : ".concat(strValueOf) : new String("Logging Event with event code : "));
    }

    private final synchronized void d(vu2.a.b bVar) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(e(bVar).getBytes());
                } catch (IOException unused) {
                    oo.m("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        oo.m("Could not close Clearcut output stream.");
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    oo.m("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            oo.m("Could not find file for Clearcut");
        }
    }

    private final synchronized String e(vu2.a.b bVar) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.f5454b.F(), Long.valueOf(com.google.android.gms.ads.internal.p.j().c()), Integer.valueOf(bVar.h()), Base64.encodeToString(((cv2.n) ((l92) this.f5454b.P())).f(), 3));
    }

    public static tu2 f() {
        return new tu2();
    }

    private static List<Long> g() {
        List<String> listE = e0.e();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listE.iterator();
        while (it.hasNext()) {
            for (String str : it.next().split(",")) {
                try {
                    arrayList.add(Long.valueOf(str));
                } catch (NumberFormatException unused) {
                    oo.m("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    public final synchronized void a(su2 su2Var) {
        if (this.f5455c) {
            try {
                su2Var.a(this.f5454b);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.p.g().e(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void b(vu2.a.b bVar) {
        if (this.f5455c) {
            if (((Boolean) qx2.e().c(e0.f3)).booleanValue()) {
                d(bVar);
            } else {
                c(bVar);
            }
        }
    }
}

package c.a.b.b.g.c;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class g2 {
    private static h2 a(File file) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                HashMap map = new HashMap();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        String strValueOf = String.valueOf(file);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 7);
                        sb.append("Parsed ");
                        sb.append(strValueOf);
                        Log.i("HermeticFileOverrides", sb.toString());
                        h2 h2Var = new h2(map);
                        bufferedReader.close();
                        return h2Var;
                    }
                    String[] strArrSplit = line.split(" ", 3);
                    if (strArrSplit.length != 3) {
                        String strValueOf2 = String.valueOf(line);
                        Log.e("HermeticFileOverrides", strValueOf2.length() != 0 ? "Invalid: ".concat(strValueOf2) : new String("Invalid: "));
                    } else {
                        String str = strArrSplit[0];
                        String strDecode = Uri.decode(strArrSplit[1]);
                        String strDecode2 = Uri.decode(strArrSplit[2]);
                        if (!map.containsKey(str)) {
                            map.put(str, new HashMap());
                        }
                        ((Map) map.get(str)).put(strDecode, strDecode2);
                    }
                }
            } finally {
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static c3<h2> b(Context context) {
        String str = Build.TYPE;
        String str2 = Build.TAGS;
        boolean z = false;
        if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
            z = true;
        }
        if (!z) {
            return c3.d();
        }
        if (u1.a() && !context.isDeviceProtectedStorage()) {
            context = context.createDeviceProtectedStorageContext();
        }
        c3<File> c3VarC = c(context);
        return c3VarC.b() ? c3.a(a(c3VarC.c())) : c3.d();
    }

    private static c3<File> c(Context context) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? c3.a(file) : c3.d();
        } catch (RuntimeException e) {
            Log.e("HermeticFileOverrides", "no data dir", e);
            return c3.d();
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }
}

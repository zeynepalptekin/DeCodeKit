package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class mm1 {

    /* renamed from: a, reason: collision with root package name */
    private int f4427a;

    /* renamed from: b, reason: collision with root package name */
    private String f4428b;

    mm1(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        jsonReader.beginObject();
        int r0 = 3;
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            char c2 = 65535;
            int r4 = strNextName.hashCode();
            if (r4 != -1724546052) {
                if (r4 == 3059181 && strNextName.equals("code")) {
                    c2 = 0;
                }
            } else if (strNextName.equals("description")) {
                c2 = 1;
            }
            if (c2 == 0) {
                r0 = jsonReader.nextInt();
            } else if (c2 != 1) {
                jsonReader.skipValue();
            } else {
                strNextString = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
        this.f4427a = r0;
        this.f4428b = strNextString;
    }

    public final String a() {
        return this.f4428b;
    }
}

package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class jm1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3997a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3998b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3999c;

    public jm1(int r1, int r2, boolean z) {
        this.f3997a = r1;
        this.f3998b = r2;
        this.f3999c = z;
    }

    static List<jm1> a(JsonReader jsonReader) throws IllegalStateException, IOException, NumberFormatException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int r1 = 0;
            int r2 = 0;
            boolean zNextBoolean = false;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if ("width".equals(strNextName)) {
                    r1 = jsonReader.nextInt();
                } else if ("height".equals(strNextName)) {
                    r2 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(strNextName)) {
                    zNextBoolean = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new jm1(r1, r2, zNextBoolean));
        }
        jsonReader.endArray();
        return arrayList;
    }
}

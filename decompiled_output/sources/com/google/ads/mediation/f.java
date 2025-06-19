package com.google.ads.mediation;

import com.google.android.gms.internal.ads.tr;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public class f {

    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
        String name();

        boolean required() default true;
    }

    public void a(Map<String, String> map) throws IllegalAccessException, SecurityException, IllegalArgumentException, a {
        StringBuilder sb;
        String str;
        HashMap map2 = new HashMap();
        for (Field field : getClass().getFields()) {
            b bVar = (b) field.getAnnotation(b.class);
            if (bVar != null) {
                map2.put(bVar.name(), field);
            }
        }
        if (map2.isEmpty()) {
            tr.i("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Field field2 = (Field) map2.remove(entry.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, entry.getValue());
                } catch (IllegalAccessException unused) {
                    String key = entry.getKey();
                    sb = new StringBuilder(String.valueOf(key).length() + 49);
                    sb.append("Server option \"");
                    sb.append(key);
                    str = "\" could not be set: Illegal Access";
                    sb.append(str);
                    tr.i(sb.toString());
                } catch (IllegalArgumentException unused2) {
                    String key2 = entry.getKey();
                    sb = new StringBuilder(String.valueOf(key2).length() + 43);
                    sb.append("Server option \"");
                    sb.append(key2);
                    str = "\" could not be set: Bad Type";
                    sb.append(str);
                    tr.i(sb.toString());
                }
            } else {
                String key3 = entry.getKey();
                String value = entry.getValue();
                StringBuilder sb2 = new StringBuilder(String.valueOf(key3).length() + 31 + String.valueOf(value).length());
                sb2.append("Unexpected server option: ");
                sb2.append(key3);
                sb2.append(" = \"");
                sb2.append(value);
                sb2.append("\"");
                tr.f(sb2.toString());
            }
        }
        StringBuilder sb3 = new StringBuilder();
        for (Field field3 : map2.values()) {
            if (((b) field3.getAnnotation(b.class)).required()) {
                String strValueOf = String.valueOf(((b) field3.getAnnotation(b.class)).name());
                tr.i(strValueOf.length() != 0 ? "Required server option missing: ".concat(strValueOf) : new String("Required server option missing: "));
                if (sb3.length() > 0) {
                    sb3.append(", ");
                }
                sb3.append(((b) field3.getAnnotation(b.class)).name());
            }
        }
        if (sb3.length() > 0) {
            String strValueOf2 = String.valueOf(sb3.toString());
            throw new a(strValueOf2.length() != 0 ? "Required server option(s) missing: ".concat(strValueOf2) : new String("Required server option(s) missing: "));
        }
    }
}

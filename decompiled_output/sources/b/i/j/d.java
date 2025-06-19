package b.i.j;

import android.net.Uri;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public final class d {
    private d() {
    }

    @h0
    public static String a(@h0 Uri uri) {
        String scheme = uri.getScheme();
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        if (scheme != null) {
            if (scheme.equalsIgnoreCase("tel") || scheme.equalsIgnoreCase("sip") || scheme.equalsIgnoreCase("sms") || scheme.equalsIgnoreCase("smsto") || scheme.equalsIgnoreCase("mailto") || scheme.equalsIgnoreCase("nfc")) {
                StringBuilder sb = new StringBuilder(64);
                sb.append(scheme);
                sb.append(':');
                if (schemeSpecificPart != null) {
                    for (int r0 = 0; r0 < schemeSpecificPart.length(); r0++) {
                        char cCharAt = schemeSpecificPart.charAt(r0);
                        if (cCharAt != '-' && cCharAt != '@' && cCharAt != '.') {
                            cCharAt = 'x';
                        }
                        sb.append(cCharAt);
                    }
                }
                return sb.toString();
            }
            if (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https") || scheme.equalsIgnoreCase("ftp") || scheme.equalsIgnoreCase("rtsp")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("//");
                sb2.append(uri.getHost() != null ? uri.getHost() : "");
                sb2.append(uri.getPort() != -1 ? ":" + uri.getPort() : "");
                sb2.append("/...");
                schemeSpecificPart = sb2.toString();
            }
        }
        StringBuilder sb3 = new StringBuilder(64);
        if (scheme != null) {
            sb3.append(scheme);
            sb3.append(':');
        }
        if (schemeSpecificPart != null) {
            sb3.append(schemeSpecificPart);
        }
        return sb3.toString();
    }
}

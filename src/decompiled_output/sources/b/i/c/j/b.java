package b.i.c.j;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import androidx.annotation.m;
import androidx.annotation.p0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class b {
    private static final String d = "ComplexColorCompat";

    /* renamed from: a, reason: collision with root package name */
    private final Shader f986a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f987b;

    /* renamed from: c, reason: collision with root package name */
    private int f988c;

    private b(Shader shader, ColorStateList colorStateList, @k int r3) {
        this.f986a = shader;
        this.f987b = colorStateList;
        this.f988c = r3;
    }

    @h0
    private static b a(@h0 Resources resources, @m int r7, @i0 Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(r7);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        char c2 = 65535;
        int r4 = name.hashCode();
        if (r4 != 89650992) {
            if (r4 == 1191572447 && name.equals("selector")) {
                c2 = 0;
            }
        } else if (name.equals("gradient")) {
            c2 = 1;
        }
        if (c2 == 0) {
            return c(a.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (c2 == 1) {
            return d(e.c(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    static b b(@k int r2) {
        return new b(null, null, r2);
    }

    static b c(@h0 ColorStateList colorStateList) {
        return new b(null, colorStateList, colorStateList.getDefaultColor());
    }

    static b d(@h0 Shader shader) {
        return new b(shader, null, 0);
    }

    @i0
    public static b g(@h0 Resources resources, @m int r1, @i0 Resources.Theme theme) {
        try {
            return a(resources, r1, theme);
        } catch (Exception e) {
            Log.e(d, "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    @k
    public int e() {
        return this.f988c;
    }

    @i0
    public Shader f() {
        return this.f986a;
    }

    public boolean h() {
        return this.f986a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f986a == null && (colorStateList = this.f987b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] r3) {
        if (i()) {
            ColorStateList colorStateList = this.f987b;
            int colorForState = colorStateList.getColorForState(r3, colorStateList.getDefaultColor());
            if (colorForState != this.f988c) {
                this.f988c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(@k int r1) {
        this.f988c = r1;
    }

    public boolean l() {
        return h() || this.f988c != 0;
    }
}

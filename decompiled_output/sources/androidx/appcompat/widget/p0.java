package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
class p0 extends Resources {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f181a;

    public p0(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f181a = resources;
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int r2) throws Resources.NotFoundException {
        return this.f181a.getAnimation(r2);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int r2) throws Resources.NotFoundException {
        return this.f181a.getBoolean(r2);
    }

    @Override // android.content.res.Resources
    public int getColor(int r2) throws Resources.NotFoundException {
        return this.f181a.getColor(r2);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int r2) throws Resources.NotFoundException {
        return this.f181a.getColorStateList(r2);
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.f181a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int r2) throws Resources.NotFoundException {
        return this.f181a.getDimension(r2);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int r2) throws Resources.NotFoundException {
        return this.f181a.getDimensionPixelOffset(r2);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int r2) throws Resources.NotFoundException {
        return this.f181a.getDimensionPixelSize(r2);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.f181a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int r2) throws Resources.NotFoundException {
        return this.f181a.getDrawable(r2);
    }

    @Override // android.content.res.Resources
    @androidx.annotation.m0(21)
    public Drawable getDrawable(int r2, Resources.Theme theme) throws Resources.NotFoundException {
        return this.f181a.getDrawable(r2, theme);
    }

    @Override // android.content.res.Resources
    @androidx.annotation.m0(15)
    public Drawable getDrawableForDensity(int r2, int r3) throws Resources.NotFoundException {
        return this.f181a.getDrawableForDensity(r2, r3);
    }

    @Override // android.content.res.Resources
    @androidx.annotation.m0(21)
    public Drawable getDrawableForDensity(int r2, int r3, Resources.Theme theme) {
        return this.f181a.getDrawableForDensity(r2, r3, theme);
    }

    @Override // android.content.res.Resources
    public float getFraction(int r2, int r3, int r4) {
        return this.f181a.getFraction(r2, r3, r4);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.f181a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int r2) throws Resources.NotFoundException {
        return this.f181a.getIntArray(r2);
    }

    @Override // android.content.res.Resources
    public int getInteger(int r2) throws Resources.NotFoundException {
        return this.f181a.getInteger(r2);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int r2) throws Resources.NotFoundException {
        return this.f181a.getLayout(r2);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int r2) throws Resources.NotFoundException {
        return this.f181a.getMovie(r2);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int r2, int r3) throws Resources.NotFoundException {
        return this.f181a.getQuantityString(r2, r3);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int r2, int r3, Object... objArr) throws Resources.NotFoundException {
        return this.f181a.getQuantityString(r2, r3, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int r2, int r3) throws Resources.NotFoundException {
        return this.f181a.getQuantityText(r2, r3);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int r2) throws Resources.NotFoundException {
        return this.f181a.getResourceEntryName(r2);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int r2) throws Resources.NotFoundException {
        return this.f181a.getResourceName(r2);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int r2) throws Resources.NotFoundException {
        return this.f181a.getResourcePackageName(r2);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int r2) throws Resources.NotFoundException {
        return this.f181a.getResourceTypeName(r2);
    }

    @Override // android.content.res.Resources
    public String getString(int r2) throws Resources.NotFoundException {
        return this.f181a.getString(r2);
    }

    @Override // android.content.res.Resources
    public String getString(int r2, Object... objArr) throws Resources.NotFoundException {
        return this.f181a.getString(r2, objArr);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int r2) throws Resources.NotFoundException {
        return this.f181a.getStringArray(r2);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int r2) throws Resources.NotFoundException {
        return this.f181a.getText(r2);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int r2, CharSequence charSequence) {
        return this.f181a.getText(r2, charSequence);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int r2) throws Resources.NotFoundException {
        return this.f181a.getTextArray(r2);
    }

    @Override // android.content.res.Resources
    public void getValue(int r2, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.f181a.getValue(r2, typedValue, z);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.f181a.getValue(str, typedValue, z);
    }

    @Override // android.content.res.Resources
    @androidx.annotation.m0(15)
    public void getValueForDensity(int r2, int r3, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.f181a.getValueForDensity(r2, r3, typedValue, z);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int r2) throws Resources.NotFoundException {
        return this.f181a.getXml(r2);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] r3) {
        return this.f181a.obtainAttributes(attributeSet, r3);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int r2) throws Resources.NotFoundException {
        return this.f181a.obtainTypedArray(r2);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int r2) throws Resources.NotFoundException {
        return this.f181a.openRawResource(r2);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int r2, TypedValue typedValue) throws Resources.NotFoundException {
        return this.f181a.openRawResource(r2, typedValue);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int r2) throws Resources.NotFoundException {
        return this.f181a.openRawResourceFd(r2);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.f181a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.f181a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f181a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }
}

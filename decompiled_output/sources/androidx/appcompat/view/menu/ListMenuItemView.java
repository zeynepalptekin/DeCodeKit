package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.p0;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.a1;
import b.a.a;
import b.i.p.f0;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements o.a, AbsListView.SelectionBoundsAdjuster {
    private static final String u = "ListMenuItemView";
    private j d;
    private ImageView e;
    private RadioButton f;
    private TextView g;
    private CheckBox h;
    private TextView i;
    private ImageView j;
    private ImageView k;
    private LinearLayout l;
    private Drawable m;
    private int n;
    private Context o;
    private boolean p;
    private Drawable q;
    private boolean r;
    private LayoutInflater s;
    private boolean t;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.b.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int r6) {
        super(context, attributeSet);
        a1 a1VarG = a1.G(getContext(), attributeSet, a.m.MenuView, r6, 0);
        this.m = a1VarG.h(a.m.MenuView_android_itemBackground);
        this.n = a1VarG.u(a.m.MenuView_android_itemTextAppearance, -1);
        this.p = a1VarG.a(a.m.MenuView_preserveIconSpacing, false);
        this.o = context;
        this.q = a1VarG.h(a.m.MenuView_subMenuArrow);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, a.b.dropDownListViewStyle, 0);
        this.r = typedArrayObtainStyledAttributes.hasValue(0);
        a1VarG.I();
        typedArrayObtainStyledAttributes.recycle();
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int r3) {
        LinearLayout linearLayout = this.l;
        if (linearLayout != null) {
            linearLayout.addView(view, r3);
        } else {
            addView(view, r3);
        }
    }

    private void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(a.j.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.h = checkBox;
        a(checkBox);
    }

    private LayoutInflater getInflater() {
        if (this.s == null) {
            this.s = LayoutInflater.from(getContext());
        }
        return this.s;
    }

    private void h() {
        ImageView imageView = (ImageView) getInflater().inflate(a.j.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.e = imageView;
        b(imageView, 0);
    }

    private void i() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(a.j.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f = radioButton;
        a(radioButton);
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.j;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.k;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.k.getLayoutParams();
        rect.top += this.k.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean e() {
        return this.t;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void f(boolean z, char c2) {
        int r2 = (z && this.d.D()) ? 0 : 8;
        if (r2 == 0) {
            this.i.setText(this.d.k());
        }
        if (this.i.getVisibility() != r2) {
            this.i.setVisibility(r2);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void g(j jVar, int r3) {
        this.d = jVar;
        setVisibility(jVar.isVisible() ? 0 : 8);
        setTitle(jVar.l(this));
        setCheckable(jVar.isCheckable());
        f(jVar.D(), jVar.j());
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        setSubMenuArrowVisible(jVar.hasSubMenu());
        setContentDescription(jVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.o.a
    public j getItemData() {
        return this.d;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        f0.B1(this, this.m);
        TextView textView = (TextView) findViewById(a.g.title);
        this.g = textView;
        int r1 = this.n;
        if (r1 != -1) {
            textView.setTextAppearance(this.o, r1);
        }
        this.i = (TextView) findViewById(a.g.shortcut);
        ImageView imageView = (ImageView) findViewById(a.g.submenuarrow);
        this.j = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.q);
        }
        this.k = (ImageView) findViewById(a.g.group_divider);
        this.l = (LinearLayout) findViewById(a.g.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int r4, int r5) {
        if (this.e != null && this.p) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.e.getLayoutParams();
            int r0 = layoutParams.height;
            if (r0 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = r0;
            }
        }
        super.onMeasure(r4, r5);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f == null && this.h == null) {
            return;
        }
        if (this.d.p()) {
            if (this.f == null) {
                i();
            }
            compoundButton = this.f;
            compoundButton2 = this.h;
        } else {
            if (this.h == null) {
                c();
            }
            compoundButton = this.h;
            compoundButton2 = this.f;
        }
        if (z) {
            compoundButton.setChecked(this.d.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.h;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.d.p()) {
            if (this.f == null) {
                i();
            }
            compoundButton = this.f;
        } else {
            if (this.h == null) {
                c();
            }
            compoundButton = this.h;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.t = z;
        this.p = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.k;
        if (imageView != null) {
            imageView.setVisibility((this.r || !z) ? 8 : 0);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setIcon(Drawable drawable) {
        boolean z = this.d.C() || this.t;
        if (z || this.p) {
            if (this.e == null && drawable == null && !this.p) {
                return;
            }
            if (this.e == null) {
                h();
            }
            if (drawable == null && !this.p) {
                this.e.setVisibility(8);
                return;
            }
            ImageView imageView = this.e;
            if (!z) {
                drawable = null;
            }
            imageView.setImageDrawable(drawable);
            if (this.e.getVisibility() != 0) {
                this.e.setVisibility(0);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setTitle(CharSequence charSequence) {
        int r0;
        TextView textView;
        if (charSequence != null) {
            this.g.setText(charSequence);
            if (this.g.getVisibility() == 0) {
                return;
            }
            textView = this.g;
            r0 = 0;
        } else {
            r0 = 8;
            if (this.g.getVisibility() == 8) {
                return;
            } else {
                textView = this.g;
            }
        }
        textView.setVisibility(r0);
    }
}

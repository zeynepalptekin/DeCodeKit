package androidx.core.widget;

import android.os.Build;
import android.view.View;
import android.widget.ListView;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public final class i {
    private i() {
    }

    public static boolean a(@h0 ListView listView, int r5) {
        if (Build.VERSION.SDK_INT >= 19) {
            return listView.canScrollList(r5);
        }
        int childCount = listView.getChildCount();
        if (childCount == 0) {
            return false;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (r5 > 0) {
            return firstVisiblePosition + childCount < listView.getCount() || listView.getChildAt(childCount + (-1)).getBottom() > listView.getHeight() - listView.getListPaddingBottom();
        }
        return firstVisiblePosition > 0 || listView.getChildAt(0).getTop() < listView.getListPaddingTop();
    }

    public static void b(@h0 ListView listView, int r3) {
        View childAt;
        if (Build.VERSION.SDK_INT >= 19) {
            listView.scrollListBy(r3);
            return;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (firstVisiblePosition == -1 || (childAt = listView.getChildAt(0)) == null) {
            return;
        }
        listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - r3);
    }
}

package submoduling.test.common.shared;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Tony on 8/5/2015.
 */
public class foo {

    public static void showMessage(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}

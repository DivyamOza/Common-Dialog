import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDialogFragment;

/**
 * Common Dialog used for all kinds of Alert Dialog
 * Created By: Divyam Oza
 */
public class CommonDialog extends AppCompatDialogFragment {
    private final String title;
    private final String msg;
    private final int icon;
    private CommonDialogListener listener;

    /**
     * Below Constructor used to set Title and Msg to Common-dialog
     *
     * @param title
     * @param msg
     */
    public CommonDialog(String title, String msg, int icon) {
        this.title = title;
        this.msg = msg;
        this.icon = icon;
    }

    /**
     * Here Actual dialog will be created
     *
     * @param savedInstanceState
     * @return
     */
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setIcon(icon)
                .setTitle(title)
                .setMessage(msg)
                .setNegativeButton("No", (dialogInterface, i) -> listener.onNoClicked())
                .setPositiveButton("Yes", (dialogInterface, i) -> listener.onYesClicked());
        return builder.create();
    }

    /**
     * Here Dialog will Attach with using Context
     *
     * @param context
     */
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        try {
            listener = (CommonDialogListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + "must implement ExampleDialogListener");
        }
    }

    /**
     * "Yes" and "No" Button Re-Usability handled by below Interface
     */
    public interface CommonDialogListener {
        void onYesClicked();

        void onNoClicked();
    }
}

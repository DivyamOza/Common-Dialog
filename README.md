# Common-Dialog

Common Dialog used to any activity directly with Reusability.

## Installation Process

Please understand the below Classes.


```bash
• CommonDialog.java 
-> This is the main Common Class for this functionality.
-> Create a new java file named "CommonDialog.java " in any package or "Utils/Common" package.
```

## Usage

```bash
In Any class, 
You want to use this Common Dialog then follow the below steps:
1) In Any Class implements CommonDialog.CommonDialogListener
like: "public class LoginActivity extends AppCompatActivity implements CommonDialog.CommonDialogListener"

2) You already got 2 Overridden methods after successfully implemented
@Override
    public void onYesClicked() {
      // Write down Your Logics for Yes Button Clicked
    }

    @Override
    public void onNoClicked() {
      // Write down Your Logics for No Button Clicked
    }

3) Whenever you have to show dialog then use below sample code:
 final CommonDialog dialog =
                new CommonDialog("Close App",
                        getString("Are you Sure You want to close app?",
                        android.R.drawable.ic_dialog_alert);
        dialog.show(getSupportFragmentManager(), "example dialog");
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)

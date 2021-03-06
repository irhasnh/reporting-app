package studio.tay.reporting.helper;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefManager {

    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private Context _context;

    private static final int PRIVATE_MODE = 0;

    private static final String PREF_NAME = "reporting4vm";

    private static final String IS_LOGGED     = "isLogged";
    private static final String USER_ID       = "userId";
    private static final String USER_NAME     = "userName";
    private static final String USER_EMAIL    = "userEmail";
    private static final String USER_IMAGE    = "userImage";
    private static final String USER_ADDRESS  = "userName";
    private static final String USER_PHONE    = "userEmail";
    private static final String USER_WEB      = "userEmail";

    public PrefManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void setIsLogged(boolean isLogged) {
        editor.putBoolean(IS_LOGGED, isLogged);
        editor.commit();
    }

    public boolean getIsLogged() {
        return pref.getBoolean(IS_LOGGED, false);
    }

    public void setUserId(int userId) {
        editor.putInt(USER_ID, userId);
        editor.commit();
    }

    public int getUserId() {
        return pref.getInt(USER_ID, 0);
    }

    public void setUserName(String userName) {
        editor.putString(USER_NAME, userName);
        editor.commit();
    }

    public String getUserName() {
        return pref.getString(USER_NAME, "");
    }


    public void setUserEmail(String userEmail) {
        editor.putString(USER_EMAIL, userEmail);
        editor.commit();
    }

    public String getUserAddress() {
        return pref.getString(USER_ADDRESS, "");
    }

    public void setUserAddress(String userAddress) {
        editor.putString(USER_ADDRESS, userAddress);
        editor.commit();
    }

    public String getUserPhone() {
        return pref.getString(USER_PHONE, "");
    }

    public void setUserPhone(String userPhone) {
        editor.putString(USER_PHONE, userPhone);
        editor.commit();
    }

    public String getUserWeb() {
        return pref.getString(USER_WEB, "");
    }

    public void setUserWeb(String userWeb) {
        editor.putString(USER_WEB, userWeb);
        editor.commit();
    }

    public String getUserEmail() {
        return pref.getString(USER_EMAIL, "");
    }

    public void resetCurrentUser()
    {
        editor.putString(USER_ID,"");
        editor.putString(USER_NAME,"");
        editor.putString(USER_EMAIL,"");
        editor.putString(USER_IMAGE,"");
        editor.putBoolean(IS_LOGGED,false);
        editor.commit();
    }
}

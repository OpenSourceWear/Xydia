/*
 * Author:GrieferPig
 * Last Modify: 10/19/2020
 * Version: 0.6.1
 *
 * A Logging tool that shorten the process of using android logging tool.
 *
 * Constructor:
 *      Log l = new Log(int logLevel);
 *          The logLevel is used as a filter organize levels of output.
 *
 * Constants:
 *      logLevel
 *          This constant works as a filter. If one output's priority is below than this level,
 *          then it would not be appeared in Logcat
 *
 * Methods:
 *      i(String text);
 *          Write Info logs to Logcat.
 *
 *      a(String text);
 *          Write Alarm logs to Logcat.
 *
 *      e(String text);
 *          Write Error logs to Logcat.
 *
 *      setLogLevel(int logLevel);
 *          Change the Log Level.
 *
 *
 * Usage Examples:
 *      Log l = new Log(Log.NONE);
 *      l.i("555");
 *      l.a("666");
 *      l.e("777");
 *      l.setLogLevel(Log.ALERT);
 *
 *
 */

public class Log {

    public static int NONE = 0;
    public static int INFO = 1;
    public static int ALERT = 2;
    public static int ERROR = 3;

    private String INFO_TAG = "Info:";
    private String ALERT_TAG = "Alert:";
    private String ERROR_TAG = "Error:";

    private int LOG_LEVEL;

    public Log(int logLevel){
        this.LOG_LEVEL = logLevel;
    }

    public void i(String text){
        if(this.LOG_LEVEL <= 1) {
            android.util.Log.d(INFO_TAG, text);
        }
    }

    public void a(String text){
        if(this.LOG_LEVEL <= 2) {
            android.util.Log.w(ALERT_TAG, text);
        }
    }

    public void e(String text){
        if(this.LOG_LEVEL <= 3) {
            android.util.Log.e(ERROR_TAG, text);
        }
    }

    public void setLogLevel(int logLevel){
        this.LOG_LEVEL = logLevel;
    }
}
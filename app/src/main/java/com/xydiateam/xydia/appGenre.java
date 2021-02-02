package com.xydiateam.xydia;

/**
 * Author:GrieferPig
 * Last Modify: 10/19/2020
 * Version: 0.6.1
 *
 * Genre for apps.
 *
 * Constants:
 *      NONE: This app has none/unknown genre.
 *      UTILITIES: This app is a kind of utility app.
 *      ENTERTAINMENT: This app is a kind of entertainment app.
 *      MULTIMEDIA: This app is a kind of multimedia app.
 *      SYSTEM_MODIFIER: This app is a kind of system modifier.
 *      GAME: This app is a kind of game.
 *      ICON_PACK: This is not a app: It changes the system icon
 *          files to modify the default app icon pack
 *
 * Methods:
 *
 *      getAppGenreByInt(int genre)
 *          This method detects the genre that App object returned and
 *              return a hardcoded text genre.
 *
 *      Usage Examples:
 *      There is no need to use these since App Class had already processed
 *          the output of genre.
 *
 */

public class appGenre {
    public static int NONE = 0;
    public static int UTILITIES = 1;
    public static int ENTERTAINMENT = 2;
    public static int MULTIMEDIA = 3;
    public static int SYSTEM_MODIFIER = 4;
    public static int GAME = 5;
    public static int ICON_PACK = 6;

    public static String getAppGenreByInt(int genre){
        switch(genre){
            case 0:
                return "None";
            case 1:
                return "Utilities";
            case 2:
                return "Entertainment";
            case 3:
                return "Multimedia";
            case 4:
                return "System Modifier";
            case 5:
                return "Game";
            case 6:
                return "Icon Pack";
            default:
                return "None";
        }
    }
}

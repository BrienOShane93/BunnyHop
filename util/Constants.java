/**
 * @file        Constants.java
 * @author      Abhiroop Tandon (20061667)
 * @assignment  Bunny Hop game
 * @brief       deals with all the constants in the game
 */

package wit.cgd.bunnyhop.util;

public class Constants {

    public static final float VIEWPORT_WIDTH = 5.0f;        // Visible game world is 5 meters wide
    public static final float VIEWPORT_HEIGHT = 5.0f;       // Visible game world is 5 meters tall

    public static final float   VIEWPORT_GUI_WIDTH      = 800.0f;       // GUI Width
    public static final float   VIEWPORT_GUI_HEIGHT     = 480.0f;       // GUI Height

    // Location of description file for texture atlas
    public static final String  TEXTURE_ATLAS_OBJECTS   = "images/bunnyhop.atlas";

    // Location of image file for level 01
    public static final String  LEVEL_01                = "levels/level-01.png"; 
    
    public static final String LEVEL_02					= "levels/level-02.png";

    public static final int     LIVES_START             = 3;    // Amount of extra lives at level start
    
    // Duration of feather power-up in seconds
    public static final float ITEM_FEATHER_POWERUP_DURATION = 9;
    
 // Delay after game over
    public static final float TIME_DELAY_GAME_OVER = 3;
    
    // Game play time
    public static final float TIME_GAMEPLAY = 90;
    
    public static final String PREFERENCES = "bunnyhop.prefs";
}
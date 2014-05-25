package com.fs3d.gametemplate.gametemplate;

/**
 * Created by FS3DPete on 24/05/2014.
 * This Class file will contain all of the methods I intend to implement for the project.
 * This is to save replicating code for common functions and to ensure readability of project
 * code in AIDE when I transfer the project there for testing.
 *
 * This class file has no private methods. It is intended to be completely open to all other
 * classes within any project it is included in.
 *
 * Any functions that work in Android Studio but not in AIDE will be shelved and re-written until
 * AIDE includes support for them, or if I decide to complete the project here instead.
 */

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;

/**
 * Import statements will be determined as the project scope increases.
 */
public class GameTools {
    // PSEUDOCODE FOR THIS CLASS WILL BE WRITTEN FOLLOWING SINGLE-LINE COMMENT TAGS.
    /* COMMENTS WILL BE IN ENCLOSED COMMENT TAGS. */
    /* Declare class-wide variables */
    // booleans, ints, Strings, doubles, floats, StringBuilders
    // Handlers, Threads, Runnables, etc
    /* Constructors for the GameTools class TBD */

    /* Public methods accessible from other classes */

    public static void Delay(int millis){
        try{
            Thread.sleep(millis);
        } catch(InterruptedException e) {
            e.printStackTrace();
            Log.e("GameTools.Delay", "Exception was caught for specified delay.");
        }
    }

    public void updateUI(View v, Handler inHndl, Message inMsg, Bundle inBndl){
        // Automates handling of Handler retrieval and message passing.
    }
}
